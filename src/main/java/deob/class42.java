package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("pb")
public final class class42 implements ImageProducer, ImageObserver {

	@ObfuscatedName("pb.c")
	public int[] field565;

	@ObfuscatedName("pb.d")
	public int field566;

	@ObfuscatedName("pb.e")
	public int field567;

	@ObfuscatedName("pb.f")
	public ColorModel field568;

	@ObfuscatedName("pb.g")
	public ImageConsumer field569;

	@ObfuscatedName("pb.h")
	public Image field570;

	public class42(int arg0, int arg1, Component arg2) {
		field566 = arg1;
		field567 = arg0;
		field565 = new int[arg0 * arg1];
		field568 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field570 = arg2.createImage(this);
		method212();
		arg2.prepareImage(field570, this);
		method212();
		arg2.prepareImage(field570, this);
		method212();
		arg2.prepareImage(field570, this);
		method210();
	}

	@ObfuscatedName("pb.a(I)V")
	public void method210() {
		class31.method127(field566, field565, field567);
	}

	@ObfuscatedName("pb.a(Ljava/awt/Graphics;II)V")
	public void method211(Graphics arg0, int arg1, int arg2) {
		method212();
		arg0.drawImage(field570, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field569 = arg0;
		arg0.setDimensions(field566, field567);
		arg0.setProperties(null);
		arg0.setColorModel(field568);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field569 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field569 == arg0) {
			field569 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("pb.a()V")
	public synchronized void method212() {
		if (field569 != null) {
			field569.setPixels(0, 0, field566, field567, field568, field565, 0, field566);
			field569.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
