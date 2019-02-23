package com.example.kakeru.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View
{
    private Paint paint;

    //コンストラクタ(初期設定)
    public MyView(Context con)
    {
        super(con);
        paint = new Paint();
    }

    //描画の処理
    @Override
    protected void onDraw(Canvas canvas)
    {
        canvas.drawColor(Color.BLUE);

        //円
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(300,500,50, paint);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(300,600,50, paint);

        //四角
        paint.setColor(Color.argb(255,2,1,2));
        canvas.drawRect(300,800,600,1000,paint);

    }
}
