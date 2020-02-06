package com.tutorials180.listwithcustomlayout.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tutorials180.listwithcustomlayout.ModelClasses.MyDataModel;
import com.tutorials180.listwithcustomlayout.R;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<MyDataModel> {


    private ArrayList<MyDataModel> objectMyDataModelArrayList;
    private Context context;

    public MyArrayAdapter(@NonNull Context context,
                          ArrayList<MyDataModel> objectMyDataModelArrayList ) {
        super(context, R.layout.single_row,objectMyDataModelArrayList);

        this.context=context;
        this.objectMyDataModelArrayList=objectMyDataModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View singleRow=convertView;
        MyArrayViewHolder objectMyArrayViewHolder=null;
        if(singleRow==null) {
            singleRow = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.single_row, parent, false);
            objectMyArrayViewHolder=new MyArrayViewHolder(singleRow);

            singleRow.setTag(objectMyArrayViewHolder);
        }
        else
        {
            objectMyArrayViewHolder= (MyArrayViewHolder) singleRow.getTag();


            objectMyArrayViewHolder.nameTV.setText(objectMyDataModelArrayList.get(position).getUserName());
            objectMyArrayViewHolder.phoneTV.setText(objectMyDataModelArrayList.get(position).getUserPhoneNumber());

            objectMyArrayViewHolder.avatarIV.setImageResource(objectMyDataModelArrayList.get(position).getImageResourceValue());
        }

        return singleRow;
    }

    //Creating View Holder Class to optimize by 170 Percent
    public class MyArrayViewHolder
    {
        TextView nameTV,phoneTV;
        ImageView avatarIV;

        public MyArrayViewHolder(View singleRow)
        {
            nameTV=singleRow.findViewById(R.id.singleRow_TV);
            phoneTV=singleRow.findViewById(R.id.singleRow_phoneTV);

            avatarIV=singleRow.findViewById(R.id.singleRow_IV);
        }
    }
}
