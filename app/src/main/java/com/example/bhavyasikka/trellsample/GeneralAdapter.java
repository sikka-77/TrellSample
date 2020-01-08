package com.example.bhavyasikka.trellsample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.List;

import static com.example.bhavyasikka.trellsample.GeneralAdapter.GeneralHolder;

public class GeneralAdapter extends RecyclerView.Adapter<GeneralHolder> {

    private Context mContext;
    private List<General> mData;

    public GeneralAdapter(Context mContext, List<General> mData)
    {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public void onBindViewHolder(GeneralHolder holder, int position) {

        ViewGroup.LayoutParams params= holder.mview.getLayoutParams();

        if(position%2!=0)
        {
            params.height=300;
        }
        else
        {
            params.height=600;
        }

        holder.mview.setLayoutParams(params);
        holder.mthumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.textView.setText(mData.get(position).getText());
    }

    @Override
    public GeneralHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view ;//=parent ;
//        LinearLayout.LayoutParams lp=
//                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 500);
//        view.setLayoutParams(lp);

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.display_xml, parent, false);
        return new GeneralHolder(view);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }



    public static class GeneralHolder extends RecyclerView.ViewHolder {
        ImageView mthumbnail;
        TextView textView;
        public View mview;

        public GeneralHolder(View itemView) {
            super(itemView);
            mview=itemView;
            mthumbnail = (ImageView) itemView.findViewById(R.id.img1);
            textView = (TextView) itemView.findViewById(R.id.sample_text);
        }

    }
}
