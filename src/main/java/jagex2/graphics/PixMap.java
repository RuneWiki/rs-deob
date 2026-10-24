package jagex2.graphics;

import deob.ObfuscatedName;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("rb")
public final class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("rb.c")
	public int[] field653;

	@ObfuscatedName("rb.d")
	public int field654;

	@ObfuscatedName("rb.e")
	public int field655;

	@ObfuscatedName("rb.f")
	public ColorModel field656;

	@ObfuscatedName("rb.g")
	public ImageConsumer field657;

	@ObfuscatedName("rb.h")
	public Image field658;

	public PixMap(java.awt.Component arg0, int arg1, int arg2) {
		field654 = arg2;
		field655 = arg1;
		field653 = new int[arg1 * arg2];
		field656 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field658 = arg0.createImage(this);
		method269();
		arg0.prepareImage(field658, this);
		method269();
		arg0.prepareImage(field658, this);
		method269();
		arg0.prepareImage(field658, this);
		method267();
	}

	@ObfuscatedName("rb.a(I)V")
	public void method267() {
		Pix2D.method164(field654, field653, field655);
	}

	@ObfuscatedName("rb.a(Ljava/awt/Graphics;IBI)V")
	public void method268(Graphics arg0, int arg1, int arg2) {
		method269();
		arg0.drawImage(field658, arg2, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field657 = arg0;
		arg0.setDimensions(field654, field655);
		arg0.setProperties(null);
		arg0.setColorModel(field656);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field657 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field657 == arg0) {
			field657 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("rb.a()V")
	public synchronized void method269() {
		if (field657 != null) {
			field657.setPixels(0, 0, field654, field655, field656, field653, 0, field654);
			field657.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
