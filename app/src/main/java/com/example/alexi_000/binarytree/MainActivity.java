package com.example.alexi_000.binarytree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText input;
    private BinaryTree base;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.input = (EditText)this.findViewById(R.id.inputET);
        this.display = (TextView)this.findViewById(R.id.displayTV);
        this.base = new BinaryTree(3000);
    }

    public void addButton(View v)
    {
        int output = base.addBinaryTree((Integer.parseInt(input.getText().toString())));
        this.display.setText(output + "");
    }
}
