package dileep.android.bounce;

import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BouncingballsActivity extends Activity implements View.OnClickListener {
    /** Called when the activity is first created. */
	Button btn1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirstPage();
      
    }
    
    public void FirstPage(){
    	setContentView(R.layout.main);
    	btn1=(Button)findViewById(R.id.btn1);
    	btn1.setOnClickListener(this);
    	    }

	public void onClick(View v) {
		if(v==btn1)
			setContentView(new myView(this));
		
	}
	public class myView extends View
	{
		int w=480,h=780;
		int x=240,y=400;
		int x2=20,y2=40;
		int x3=220,y3=555;
		int dirx=1,diry=1;
		int b;
		Paint myp = new Paint();

		
		public myView(Context con){
			super(con);
		}
		@Override
		public void onDraw(Canvas canvas){
			Random randomGenerator = new Random();
              b= randomGenerator.nextInt(80);
              
			canvas.drawCircle(x, y, b-10, myp);
			//canvas.drawColor(Color.DKGRAY);
			myp.setColor(Color.MAGENTA);
			if(x<w&&dirx==1)
				x=x+5;
			if(x==w)
				dirx=0;
			if(x>0&&dirx==0)
				x=x-5;
			  if(x==0)
				dirx=1;
						
			if(y<h&&diry==1)
				y=y+5;
			if(y==h)
				diry=0;
			if(y>0&&diry==0)
				y=y-5;
			if(y==0)
				diry=1;
			canvas.drawCircle(x2, y2, b, myp);
			myp.setColor(Color.RED);
			if(x2<w&&dirx==0)
				x2=x2+5;
			if(x2==w)
				dirx=1;
			if(x2>0&&dirx==1)
				x2=x2-5;
			  if(x2==0)
				dirx=0;
						
			if(y2<h&&diry==1)
				y2=y2+5;
			if(y2==h)
				diry=0;
			if(y2>0&&diry==0)
				y2=y2-5;
			if(y2==0)
				diry=1;
			canvas.drawCircle(x3, y3, b+20, myp);
			myp.setColor(Color.CYAN);
			if(x3<w&&dirx==1)
				x3=x3+10;
			if(x3==w)
				dirx=0;
			if(x3>0&&dirx==0)
				x3=x3-10;
			  if(x3==0)
				dirx=1;
						
			if(y3<h&&diry==0)
				y3=y3+10;
			if(y3==h)
				diry=1;
			if(y3>0&&diry==1)
				y3=y3-10;
			if(y3==0)
				diry=0;
			
			delay (1000); 
			invalidate();
		
		}
		public void delay (int howLong) // delay function  to waste time
		{
		for (int i = 1 ; i <= howLong ; i++)
		{
			for (int j = 1 ; j <= 100 ; j++)
			{
			double dgarbage = Math.PI * Math.PI;
		}
		double garbage = Math.PI * Math.PI;
	}
}
	}
}