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

	@ObfuscatedName("rb.b")
	public int[] field657;

	@ObfuscatedName("rb.c")
	public int field658;

	@ObfuscatedName("rb.d")
	public int field659;

	@ObfuscatedName("rb.e")
	public ColorModel field660;

	@ObfuscatedName("rb.f")
	public ImageConsumer field661;

	@ObfuscatedName("rb.g")
	public Image field662;

	public class44(int arg0, Component arg1, int arg2) {
		field658 = arg2;
		field659 = arg0;
		field657 = new int[arg0 * arg2];
		field660 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field662 = arg1.createImage(this);
		method270();
		arg1.prepareImage(field662, this);
		method270();
		arg1.prepareImage(field662, this);
		method270();
		arg1.prepareImage(field662, this);
		method268();
	}

	@ObfuscatedName("rb.a(I)V")
	public void method268() {
		class34.method165(field657, field658, field659);
	}

	@ObfuscatedName("rb.a(BILjava/awt/Graphics;I)V")
	public void method269(int arg0, Graphics arg1, int arg2) {
		method270();
		arg1.drawImage(field662, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field661 = arg0;
		arg0.setDimensions(field658, field659);
		arg0.setProperties(null);
		arg0.setColorModel(field660);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field661 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field661 == arg0) {
			field661 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("rb.a()V")
	public synchronized void method270() {
		if (field661 != null) {
			field661.setPixels(0, 0, field658, field659, field660, field657, 0, field658);
			field661.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
