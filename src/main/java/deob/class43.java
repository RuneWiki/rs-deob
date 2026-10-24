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

	@ObfuscatedName("qb.b")
	public int[] field650;

	@ObfuscatedName("qb.c")
	public int field651;

	@ObfuscatedName("qb.d")
	public int field652;

	@ObfuscatedName("qb.e")
	public ColorModel field653;

	@ObfuscatedName("qb.f")
	public ImageConsumer field654;

	@ObfuscatedName("qb.g")
	public Image field655;

	public class43(int arg0, int arg1, Component arg2) {
		field651 = arg1;
		field652 = arg0;
		field650 = new int[arg0 * arg1];
		field653 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field655 = arg2.createImage(this);
		method256();
		arg2.prepareImage(field655, this);
		method256();
		arg2.prepareImage(field655, this);
		method256();
		arg2.prepareImage(field655, this);
		method254();
	}

	@ObfuscatedName("qb.a(I)V")
	public void method254() {
		class33.method151(field651, field652, field650);
	}

	@ObfuscatedName("qb.a(Ljava/awt/Graphics;III)V")
	public void method255(Graphics arg0, int arg1, int arg2) {
		method256();
		arg0.drawImage(field655, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field654 = arg0;
		arg0.setDimensions(field651, field652);
		arg0.setProperties(null);
		arg0.setColorModel(field653);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field654 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field654 == arg0) {
			field654 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("qb.a()V")
	public synchronized void method256() {
		if (field654 != null) {
			field654.setPixels(0, 0, field651, field652, field653, field650, 0, field651);
			field654.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
