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

@ObfuscatedName("qb")
public final class class43 implements ImageProducer, ImageObserver {

	@ObfuscatedName("qb.d")
	public int[] field649;

	@ObfuscatedName("qb.e")
	public int field650;

	@ObfuscatedName("qb.f")
	public int field651;

	@ObfuscatedName("qb.g")
	public ColorModel field652;

	@ObfuscatedName("qb.h")
	public ImageConsumer field653;

	@ObfuscatedName("qb.i")
	public Image field654;

	public class43(int arg0, Component arg1, int arg2) {
		field650 = arg0;
		field651 = arg2;
		field649 = new int[arg0 * arg2];
		field652 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field654 = arg1.createImage(this);
		method255();
		arg1.prepareImage(field654, this);
		method255();
		arg1.prepareImage(field654, this);
		method255();
		arg1.prepareImage(field654, this);
		method253();
	}

	@ObfuscatedName("qb.a(I)V")
	public void method253() {
		class33.method151(field649, field651, field650);
	}

	@ObfuscatedName("qb.a(IILjava/awt/Graphics;I)V")
	public void method254(int arg0, int arg1, Graphics arg2) {
		method255();
		arg2.drawImage(field654, arg0, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field653 = arg0;
		arg0.setDimensions(field650, field651);
		arg0.setProperties(null);
		arg0.setColorModel(field652);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field653 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field653 == arg0) {
			field653 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("qb.a()V")
	public synchronized void method255() {
		if (field653 != null) {
			field653.setPixels(0, 0, field650, field651, field652, field649, 0, field650);
			field653.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
