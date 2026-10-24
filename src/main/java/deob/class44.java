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

@ObfuscatedName("rb")
public final class class44 implements ImageProducer, ImageObserver {

	@ObfuscatedName("rb.d")
	public int[] field655;

	@ObfuscatedName("rb.e")
	public int field656;

	@ObfuscatedName("rb.f")
	public int field657;

	@ObfuscatedName("rb.g")
	public ColorModel field658;

	@ObfuscatedName("rb.h")
	public ImageConsumer field659;

	@ObfuscatedName("rb.i")
	public Image field660;

	public class44(int arg0, Component arg1, int arg2) {
		field656 = arg2;
		field657 = arg0;
		field655 = new int[arg0 * arg2];
		field658 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field660 = arg1.createImage(this);
		method269();
		arg1.prepareImage(field660, this);
		method269();
		arg1.prepareImage(field660, this);
		method269();
		arg1.prepareImage(field660, this);
		method267();
	}

	@ObfuscatedName("rb.a(B)V")
	public void method267() {
		class34.method164(field655, field656, field657);
	}

	@ObfuscatedName("rb.a(IBLjava/awt/Graphics;I)V")
	public void method268(int arg0, Graphics arg1, int arg2) {
		method269();
		arg1.drawImage(field660, arg0, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field659 = arg0;
		arg0.setDimensions(field656, field657);
		arg0.setProperties(null);
		arg0.setColorModel(field658);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field659 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field659 == arg0) {
			field659 = null;
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
		if (field659 != null) {
			field659.setPixels(0, 0, field656, field657, field658, field655, 0, field656);
			field659.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
