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
	public int[] field583;

	@ObfuscatedName("qb.c")
	public int field584;

	@ObfuscatedName("qb.d")
	public int field585;

	@ObfuscatedName("qb.e")
	public ColorModel field586;

	@ObfuscatedName("qb.f")
	public ImageConsumer field587;

	@ObfuscatedName("qb.g")
	public Image field588;

	public class43(int arg0, int arg1, Component arg2) {
		field584 = arg1;
		field585 = arg0;
		field583 = new int[arg0 * arg1];
		field586 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field588 = arg2.createImage(this);
		method244();
		arg2.prepareImage(field588, this);
		method244();
		arg2.prepareImage(field588, this);
		method244();
		arg2.prepareImage(field588, this);
		method242();
	}

	@ObfuscatedName("qb.a(I)V")
	public void method242() {
		class32.method146(field584, field585, field583);
	}

	@ObfuscatedName("qb.a(ILjava/awt/Graphics;BI)V")
	public void method243(int arg0, Graphics arg1, int arg2) {
		method244();
		arg1.drawImage(field588, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field587 = arg0;
		arg0.setDimensions(field584, field585);
		arg0.setProperties(null);
		arg0.setColorModel(field586);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field587 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field587 == arg0) {
			field587 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("qb.a()V")
	public synchronized void method244() {
		if (field587 != null) {
			field587.setPixels(0, 0, field584, field585, field586, field583, 0, field584);
			field587.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
