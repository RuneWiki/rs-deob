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
	public int[] field580;

	@ObfuscatedName("qb.c")
	public int field581;

	@ObfuscatedName("qb.d")
	public int field582;

	@ObfuscatedName("qb.e")
	public ColorModel field583;

	@ObfuscatedName("qb.f")
	public ImageConsumer field584;

	@ObfuscatedName("qb.g")
	public Image field585;

	public class43(int arg0, int arg1, Component arg2) {
		field581 = arg0;
		field582 = arg1;
		field580 = new int[arg0 * arg1];
		field583 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field585 = arg2.createImage(this);
		method237();
		arg2.prepareImage(field585, this);
		method237();
		arg2.prepareImage(field585, this);
		method237();
		arg2.prepareImage(field585, this);
		method235();
	}

	@ObfuscatedName("qb.a(I)V")
	public void method235() {
		class32.method145(field582, field580, field581);
	}

	@ObfuscatedName("qb.a(IILjava/awt/Graphics;B)V")
	public void method236(int arg0, int arg1, Graphics arg2) {
		method237();
		arg2.drawImage(field585, arg0, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field584 = arg0;
		arg0.setDimensions(field581, field582);
		arg0.setProperties(null);
		arg0.setColorModel(field583);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field584 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field584 == arg0) {
			field584 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("qb.a()V")
	public synchronized void method237() {
		if (field584 != null) {
			field584.setPixels(0, 0, field581, field582, field583, field580, 0, field581);
			field584.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
