package jagex2.graphics;

import deob.ObfuscatedName;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("ISZGOOMR")
public final class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("ISZGOOMR.c")
	public int field771;

	@ObfuscatedName("ISZGOOMR.d")
	public int field772;

	@ObfuscatedName("ISZGOOMR.b")
	public int[] field770;

	@ObfuscatedName("ISZGOOMR.e")
	public ColorModel field773;

	@ObfuscatedName("ISZGOOMR.g")
	public Image field775;

	@ObfuscatedName("ISZGOOMR.f")
	public ImageConsumer field774;

	public PixMap(int arg0, Component arg1, int arg2) {
		field771 = arg2;
		field772 = arg0;
		field770 = new int[arg0 * arg2];
		field773 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field775 = arg1.createImage(this);
		method242();
		arg1.prepareImage(field775, this);
		method242();
		arg1.prepareImage(field775, this);
		method242();
		arg1.prepareImage(field775, this);
		method240();
	}

	@ObfuscatedName("ISZGOOMR.a(Z)V")
	public void method240() {
		Pix2D.method332(field771, field772, field770);
	}

	@ObfuscatedName("ISZGOOMR.a(IILjava/awt/Graphics;Z)V")
	public void method241(int arg0, int arg1, Graphics arg2) {
		method242();
		arg2.drawImage(field775, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field774 = arg0;
		arg0.setDimensions(field771, field772);
		arg0.setProperties(null);
		arg0.setColorModel(field773);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field774 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field774 == arg0) {
			field774 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("ISZGOOMR.a()V")
	public synchronized void method242() {
		if (field774 != null) {
			field774.setPixels(0, 0, field771, field772, field773, field770, 0, field771);
			field774.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
