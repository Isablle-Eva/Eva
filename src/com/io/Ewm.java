package com.io;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;

public class Ewm {

	public static void main(String[] args) throws Exception {
		Qrcode ewm=new Qrcode();
		ewm.setQrcodeVersion(7);
		int width=139;
		int height=139;
		BufferedImage hctx=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//创建画笔
		Graphics2D ewhb=hctx.createGraphics();
		//设置背景
		ewhb.setBackground(Color.white);
		//设置画笔是黑色的
		ewhb.setColor(Color.BLACK);
		ewhb.clearRect(0,0, width, height);
		//要输出的字符
		String zf="http://www.baidu.com";
		byte[] zjsz=zf.getBytes();
		boolean[][] ewsz=ewm.calQrcode(zjsz);
		for(int i=0;i<ewsz.length;i++) {
			for(int j=0;j<ewsz.length;j++) {
				if(ewsz[j][i]) {
					ewhb.fillRect(j*3+2,i*3+2,3,3);
				}
			} 
		}
		//成像
		ewhb.dispose();
		hctx.flush();
		
		ImageIO.write(hctx,"jpg",new File("ewm.jpg"));
		//释放资源
	}

}
