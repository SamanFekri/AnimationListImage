package com.example.animationlist;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AnimationListImage extends ImageView {
	
	private AnimationDrawable animationDrawable;

	public AnimationListImage(Context context) {
		this(context,null);
		// TODO Auto-generated constructor stub
	}
	
	public AnimationListImage(Context context, AttributeSet attrs) {
		this(context, attrs,0);
		// TODO Auto-generated constructor stub
	}
	
	public AnimationListImage(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	public void showAnimationListInBackground(int resource) {
		this.setBackgroundResource(resource);
		animationDrawable = (AnimationDrawable) this.getBackground();
		new Handler().post(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				animationDrawable.start();
			}
		});
	}
	
	public void showAnimationListAsImage(int resource) {
		this.setImageResource(resource);
	}
}
