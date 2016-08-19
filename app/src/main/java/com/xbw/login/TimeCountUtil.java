package com.xbw.login;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;

public class TimeCountUtil extends CountDownTimer {
	 private Activity mActivity;
	 private Button btn;//��ť

	// ��������췽������Ҫ��������������һ����Activity��һ�����ܵ�ʱ��millisInFuture��һ����countDownInterval��Ȼ����������ĸ���ť��������ǣ��Ͱ������ť�������Ϳ�����
	 public TimeCountUtil( Activity mActivity,long millisInFuture, long countDownInterval,Button btn) {
	 super(millisInFuture, countDownInterval);
	 this.mActivity = mActivity;
	 this.btn =btn;
	 }


	 @SuppressLint("NewApi")
	 @Override
	 public void onTick(long millisUntilFinished) {
	 btn.setClickable(false);//���ò��ܵ��
	 btn.setText(millisUntilFinished / 1000 + "�������·���");//���õ���ʱʱ��

	//���ð�ťΪ��ɫ����ʱ�ǲ��ܵ����
	 btn.setBackground(mActivity.getResources().getDrawable(R.drawable.btn_long_white));
	 Spannable span = new SpannableString(btn.getText().toString());//��ȡ��ť������
	 span.setSpan(new ForegroundColorSpan(Color.RED), 0, 2, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);//������ʱʱ����ʾΪ��ɫ
	 btn.setText(span);

	 }
	 @SuppressLint("NewApi")
	 @Override
	 public void onFinish() {
	 btn.setText("���»�ȡ��֤��");
	 btn.setClickable(true);//���»�õ��
	 btn.setBackground(mActivity.getResources().getDrawable(R.drawable.btn_long_red));//��ԭ����ɫ

	 }


	 }
