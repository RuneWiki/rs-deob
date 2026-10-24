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

	@ObfuscatedName("rb.c")
	public int[] field656;

	@ObfuscatedName("rb.d")
	public int field657;

	@ObfuscatedName("rb.e")
	public int field658;

	@ObfuscatedName("rb.f")
	public ColorModel field659;

	@ObfuscatedName("rb.g")
	public ImageConsumer field660;

	@ObfuscatedName("rb.h")
	public Image field661;

	public class44(Component arg0, int arg1, int arg2) {
		field657 = arg1;
		field658 = arg2;
		field656 = new int[arg1 * arg2];
		field659 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field661 = arg0.createImage(this);
		method270();
		arg0.prepareImage(field661, this);
		method270();
		arg0.prepareImage(field661, this);
		method270();
		arg0.prepareImage(field661, this);
		method268();
	}

	@ObfuscatedName("rb.a(I)V")
	public void method268() {
		class34.method165(field656, field657, field658);
	}

	@ObfuscatedName("rb.a(ILjava/awt/Graphics;II)V")
	public void method269(int arg0, Graphics arg1, int arg2) {
		method270();
		arg1.drawImage(field661, arg0, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field660 = arg0;
		arg0.setDimensions(field657, field658);
		arg0.setProperties(null);
		arg0.setColorModel(field659);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field660 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field660 == arg0) {
			field660 = null;
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
		if (field660 != null) {
			field660.setPixels(0, 0, field657, field658, field659, field656, 0, field657);
			field660.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
