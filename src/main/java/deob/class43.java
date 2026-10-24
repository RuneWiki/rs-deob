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

	@ObfuscatedName("qb.c")
	public int[] field654;

	@ObfuscatedName("qb.d")
	public int field655;

	@ObfuscatedName("qb.e")
	public int field656;

	@ObfuscatedName("qb.f")
	public ColorModel field657;

	@ObfuscatedName("qb.g")
	public ImageConsumer field658;

	@ObfuscatedName("qb.h")
	public Image field659;

	public class43(Component arg0, int arg1, int arg2) {
		field655 = arg2;
		field656 = arg1;
		field654 = new int[arg1 * arg2];
		field657 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field659 = arg0.createImage(this);
		method260();
		arg0.prepareImage(field659, this);
		method260();
		arg0.prepareImage(field659, this);
		method260();
		arg0.prepareImage(field659, this);
		method258();
	}

	@ObfuscatedName("qb.a(I)V")
	public void method258() {
		class33.method152(field655, field656, field654);
	}

	@ObfuscatedName("qb.a(ILjava/awt/Graphics;II)V")
	public void method259(int arg0, Graphics arg1, int arg2) {
		method260();
		arg1.drawImage(field659, arg0, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field658 = arg0;
		arg0.setDimensions(field655, field656);
		arg0.setProperties(null);
		arg0.setColorModel(field657);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field658 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field658 == arg0) {
			field658 = null;
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
		if (field658 != null) {
			field658.setPixels(0, 0, field655, field656, field657, field654, 0, field655);
			field658.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
