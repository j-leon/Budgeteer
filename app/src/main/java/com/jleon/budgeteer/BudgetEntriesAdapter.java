package com.jleon.budgeteer;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Javier on 06/06/2016.
 */
public class BudgetEntriesAdapter extends RecyclerView.Adapter<BudgetEntriesAdapter.ViewHolder> {
    private List<BudgetEntry> mEntries = new ArrayList<>();

    public BudgetEntriesAdapter(List<BudgetEntry> entries) {
        mEntries = entries;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mConcept;
        public TextView mAmount;

        public ViewHolder(View itemView) {
            super(itemView);
            mConcept = ((TextView) itemView.findViewById(R.id.entryConcept));
            mAmount = ((TextView) itemView.findViewById(R.id.entryAmount));
        }

        public void bind(BudgetEntry entry){
            mConcept.setText(entry.getConcept());
            mAmount.setText(entry.getAmountString());
        }
    }

    @Override
    public BudgetEntriesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.budgent_entry,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(mEntries.get(position));
    }

    @Override
    public int getItemCount() {
        return mEntries.size();
    }
}
