package com.annguyen.android.eatsmart.dietdetails.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.annguyen.android.eatsmart.R;
import com.annguyen.android.eatsmart.entities.Diet;
import com.annguyen.android.eatsmart.entities.Recipe;
import com.annguyen.android.eatsmart.libs.base.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import at.grabner.circleprogress.CircleProgressView;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by annguyen on 29/07/2017.
 */

public class DietRecipeListAdapter extends RecyclerView.Adapter<DietRecipeListAdapter.DietViewHolder> {

    private List<Recipe> recipeList;
    private ImageLoader imageLoader;
    private Context context;
    private Diet curDiet;

    public DietRecipeListAdapter(ImageLoader imageLoader, Diet curDiet, List<Recipe> recipeList) {
        this.recipeList = new ArrayList<>();
        this.imageLoader = imageLoader;
        this.curDiet = curDiet;
        this.recipeList.addAll(recipeList);
    }

    public void onDietChanged(Diet newDiet) {
        curDiet = newDiet;
        notifyDataSetChanged();
    }

//    public void modifyRecipe(Recipe newRecipe) {
//        for (int i = 0; i < recipeList.size(); ++i) {
//            if (recipeList.get(i).equals(newRecipe)) {
//                recipeList.set(i, newRecipe);
//                notifyItemChanged(i);
//                break;
//            }
//        }
//    }

    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
        notifyItemInserted(recipeList.size() - 1);
    }

    public void removeRecipe(int position) {
        recipeList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public DietViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (null == context)
            context = parent.getContext();

        View recipeItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recipe_thumbnail, parent, false);
        return new DietViewHolder(recipeItem);
    }

    @Override
    public void onBindViewHolder(DietViewHolder holder, int position) {
        Recipe curRecipe = recipeList.get(position);

        imageLoader.load(holder.recipeImg, curRecipe.getImage());
        holder.recipeTitle.setText(curRecipe.getTitle());
        holder.readyTime.setText(String.format(context.getString(R.string.ready_time),
                curRecipe.getReadyInMinutes()));
        holder.serve.setText(String.format(context.getString(R.string.serving),
                curRecipe.getServings()));

        //init circles
        checkCircle(holder.calCircle, curDiet.getMaxCalories(), curRecipe.getCalories());
        checkCircle(holder.fatCircle, curDiet.getMaxFat(), curRecipe.getFatValue());
        checkCircle(holder.carbsCircle, curDiet.getMaxCarbs(), curRecipe.getCarbsValue());
        checkCircle(holder.proCircle, curDiet.getMaxProtein(), curRecipe.getProteinValue());
    }

    @Override
    public int getItemCount() {
        return recipeList.size();
    }

    class DietViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.recipe_thumb_title)
        TextView recipeTitle;
        @BindView(R.id.recipe_thumb_img)
        ImageView recipeImg;
        @BindView(R.id.recipe_thumb_ready)
        TextView readyTime;
        @BindView(R.id.recipe_thumb_serving)
        TextView serve;
        @BindView(R.id.calorie_circle_small)
        CircleProgressView calCircle;
        @BindView(R.id.fat_circle_small)
        CircleProgressView fatCircle;
        @BindView(R.id.carbs_circle_small)
        CircleProgressView carbsCircle;
        @BindView(R.id.protein_circle_small)
        CircleProgressView proCircle;

        public DietViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private void checkCircle(CircleProgressView cpv, int max, int current) {
        if (0 != max) {
            cpv.setMaxValue(max);

            if (current < max)
                setCircleOk(cpv);
            else
                setCircleAbove(cpv);
            cpv.setValue(current);
        }
        else
            setCircleNah(cpv);
    }

    private void setCircleBelow(CircleProgressView cpv) {
        cpv.setBarColor(ContextCompat.getColor(context, R.color.circle_bar_below));
        cpv.setRimColor(ContextCompat.getColor(context, R.color.circle_rim_below));
    }

    private void setCircleOk(CircleProgressView cpv) {
        cpv.setBarColor(ContextCompat.getColor(context, R.color.circle_bar_ok));
        cpv.setRimColor(ContextCompat.getColor(context, R.color.circle_rim_ok));
    }

    private void setCircleAbove(CircleProgressView cpv) {
        cpv.setBarColor(ContextCompat.getColor(context, R.color.circle_bar_above));
        cpv.setRimColor(ContextCompat.getColor(context, R.color.circle_rim_above));
    }

    private void setCircleNah(CircleProgressView cpv) {
        cpv.setBarColor(ContextCompat.getColor(context, R.color.circle_nah));
        cpv.setRimColor(ContextCompat.getColor(context, R.color.circle_nah));
    }
}
