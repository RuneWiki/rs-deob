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
	public int[] field643;

	@ObfuscatedName("rb.d")
	public int field644;

	@ObfuscatedName("rb.e")
	public int field645;

	@ObfuscatedName("rb.f")
	public ColorModel field646;

	@ObfuscatedName("rb.g")
	public ImageConsumer field647;

	@ObfuscatedName("rb.h")
	public Image field648;

	public class44(Component arg0, int arg1, int arg2) {
		field644 = arg1;
		field645 = arg2;
		field643 = new int[arg1 * arg2];
		field646 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field648 = arg0.createImage(this);
		method262();
		arg0.prepareImage(field648, this);
		method262();
		arg0.prepareImage(field648, this);
		method262();
		arg0.prepareImage(field648, this);
		method260();
	}

	@ObfuscatedName("rb.a(B)V")
	public void method260() {
		class34.method161(field645, field644, field643);
	}

	@ObfuscatedName("rb.a(IILjava/awt/Graphics;I)V")
	public void method261(int arg0, Graphics arg1, int arg2) {
		method262();
		arg1.drawImage(field648, arg0, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field647 = arg0;
		arg0.setDimensions(field644, field645);
		arg0.setProperties(null);
		arg0.setColorModel(field646);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field647 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field647 == arg0) {
			field647 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("rb.a()V")
	public synchronized void method262() {
		if (field647 != null) {
			field647.setPixels(0, 0, field644, field645, field646, field643, 0, field644);
			field647.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
