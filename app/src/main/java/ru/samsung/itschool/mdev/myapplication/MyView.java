package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint pen = new Paint();
        pen.setColor(Color.RED);
        //pen.setColor(Color.parseColor("#ffcc00"));
        //pen.setColor(Color.rgb(250,140,120));
        // CMYK - для печати
        pen.setAntiAlias(true); // сглаживание
        pen.setStrokeWidth(10);  // толщина
        pen.setStyle(Paint.Style.FILL); // заливка
        canvas.drawColor(Color.YELLOW); // фон
        canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,200,pen);

        // invalidate() - так делать не надо!
        


    }
}
