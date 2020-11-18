package cl.eme.listexample;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class DessertFitAdapter extends RecyclerView.Adapter<DessertFitAdapter.DessertViewHolder> {

    private LayoutInflater layoutInflater;
    private List<DessertFit> dessertFitList;
    private Context mContext;
    private OnItemClickListener listener;

    public DessertFitAdapter(Context pContext, List<DessertFit> pDessertFitList, OnItemClickListener pListener) {
        mContext = pContext;
        dessertFitList = pDessertFitList;
        listener = pListener;
        layoutInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public DessertViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_list_viewholder, parent, false);
        return new DessertViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DessertViewHolder holder, int position) {
        DessertFit dessertFit = dessertFitList.get(position);
        holder.setTvName(dessertFit.getNombre());
    }

    @Override
    public int getItemCount() {
        return dessertFitList.size();
    }

    public void update(List<DessertFit> dessertFitList) {
        this.dessertFitList = dessertFitList;
        notifyDataSetChanged();
    }

    /**
     * Inner class (clase anidada)
     */
    public class DessertViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tvName;

        private static final String TAG = "DessertViewHolder";

        public DessertViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_dessert_name);
            tvName.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }

        public void setTvName(String name) {
            this.tvName.setText(name);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Log.d(TAG, "onClick en el item de la posicion " + position);
            DessertFit dessertFit = dessertFitList.get(position);
            Log.d(TAG, "onClick: " + dessertFit.getNombre());
            listener.onClick(dessertFit);
        }
    }

    public interface OnItemClickListener {
        void onClick( DessertFit idDessert);
    }
}
