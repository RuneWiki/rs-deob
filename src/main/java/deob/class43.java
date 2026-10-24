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

	@ObfuscatedName("qb.a")
	public int[] field655;

	@ObfuscatedName("qb.b")
	public int field656;

	@ObfuscatedName("qb.c")
	public int field657;

	@ObfuscatedName("qb.d")
	public ColorModel field658;

	@ObfuscatedName("qb.e")
	public ImageConsumer field659;

	@ObfuscatedName("qb.f")
	public Image field660;

	public class43(int arg0, Component arg1, int arg2) {
		field656 = arg0;
		field657 = arg2;
		field655 = new int[arg0 * arg2];
		field658 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field660 = arg1.createImage(this);
		method260();
		arg1.prepareImage(field660, this);
		method260();
		arg1.prepareImage(field660, this);
		method260();
		arg1.prepareImage(field660, this);
		method258();
	}

	@ObfuscatedName("qb.a(I)V")
	public void method258() {
		class33.method152(field656, field655, field657);
	}

	@ObfuscatedName("qb.a(IILjava/awt/Graphics;I)V")
	public void method259(int arg0, int arg1, Graphics arg2) {
		method260();
		arg2.drawImage(field660, arg0, arg1, this);
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

	@ObfuscatedName("qb.a()V")
	public synchronized void method260() {
		if (field659 != null) {
			field659.setPixels(0, 0, field656, field657, field658, field655, 0, field656);
			field659.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
