package com.tutorials180.listwithcustomlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.tutorials180.listwithcustomlayout.Adapters.MyArrayAdapter;
import com.tutorials180.listwithcustomlayout.ModelClasses.MyDataModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView objectListView;
    private String [] namesArray={"Ali","Majid","Hamza","Saad","Sultan Ahmed"
    ,"Zaheer","Nova","Billa","Kala","Cheeta"};

    private ArrayAdapter<String> objectStringArrayAdapter;
    private ArrayList<MyDataModel> objectArrayList;

    private MyArrayAdapter objectMyArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeObjects();
    }

    private void attachListViewWithArrayAdapter()
    {
        try
        {

        }
        catch (Exception e)
        {
            Toast.makeText(this, "attachListViewWithArrayAdapter:"
                    +e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void initializeObjects()
    {
        try
        {
            objectListView=findViewById(R.id.LV);
            //attachDataToAdapter();

            objectArrayList=new ArrayList<>();
            addMyDataModelObjects();

            objectMyArrayAdapter=new MyArrayAdapter(this,
                    objectArrayList);

            objectListView.setAdapter(objectMyArrayAdapter);
        }
        catch (Exception ex)
        {
            Toast.makeText(this, "initializeObjects:"
                    +ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void attachDataToAdapter()
    {
        try
        {
            objectStringArrayAdapter=new ArrayAdapter<>(
                    this,
                    R.layout.single_row
                    ,R.id.singleRow_TV
                    ,namesArray
            );

            objectListView.setAdapter(objectStringArrayAdapter);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "attachDataToAdapter:"
                    +e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private void addMyDataModelObjects()
    {
        try
        {
            for(int count=0;count<50;count++) {
                  objectArrayList.add(
                        new MyDataModel("Name:"+count,
                                "030303030:"+count
                                , R.drawable.ic_flag)
                );
            }
        }
        catch (Throwable t)
        {
            Toast.makeText(this, "addMyDataModelObjects:"
                    +t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
