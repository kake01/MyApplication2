package com.example.kakeru.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View
{
    private Paint paint;
    private Path path;

    //コンストラクタ(初期設定)
    public MyView(Context con)
    {
        super(con);
        paint = new Paint();
        path = new Path();
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
        canvas.drawRect(400,800,600,1000,paint);
        //線
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(10);
        canvas.drawLine(0,0, canvas.getWidth(), canvas.getHeight(),paint);
        canvas.drawLine(0, canvas.getHeight(), canvas.getWidth(),0,paint);
        //三角形(パス)
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(500,500);
        path.lineTo(700,900);
        path.lineTo(400,800);
        path.lineTo(500,500);
        canvas.drawPath(path,paint);

        path.reset();

        path.moveTo(0,0);
        //これいいのか?
        path.lineTo(0,canvas.getHeight());
        path.lineTo(canvas.getWidth()/2,canvas.getHeight()/2);
        path.lineTo(0,0);
        canvas.drawPath(path,paint);
    }
}
