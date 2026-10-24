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
	public int[] field658;

	@ObfuscatedName("rb.c")
	public int field659;

	@ObfuscatedName("rb.d")
	public int field660;

	@ObfuscatedName("rb.e")
	public ColorModel field661;

	@ObfuscatedName("rb.f")
	public ImageConsumer field662;

	@ObfuscatedName("rb.g")
	public Image field663;

	public class44(int arg0, int arg1, Component arg2) {
		field659 = arg0;
		field660 = arg1;
		field658 = new int[arg0 * arg1];
		field661 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field663 = arg2.createImage(this);
		method259();
		arg2.prepareImage(field663, this);
		method259();
		arg2.prepareImage(field663, this);
		method259();
		arg2.prepareImage(field663, this);
		method257();
	}

	@ObfuscatedName("rb.a(I)V")
	public void method257() {
		class33.method151(field658, field659, field660);
	}

	@ObfuscatedName("rb.a(IILjava/awt/Graphics;I)V")
	public void method258(int arg0, Graphics arg1, int arg2) {
		method259();
		arg1.drawImage(field663, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field662 = arg0;
		arg0.setDimensions(field659, field660);
		arg0.setProperties(null);
		arg0.setColorModel(field661);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field662 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field662 == arg0) {
			field662 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("rb.a()V")
	public synchronized void method259() {
		if (field662 != null) {
			field662.setPixels(0, 0, field659, field660, field661, field658, 0, field659);
			field662.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
