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

	@ObfuscatedName("qb.e")
	public int[] field581;

	@ObfuscatedName("qb.f")
	public int field582;

	@ObfuscatedName("qb.g")
	public int field583;

	@ObfuscatedName("qb.h")
	public ColorModel field584;

	@ObfuscatedName("qb.i")
	public ImageConsumer field585;

	@ObfuscatedName("qb.j")
	public Image field586;

	public class43(int arg0, Component arg1, int arg2) {
		field582 = arg2;
		field583 = arg0;
		field581 = new int[arg0 * arg2];
		field584 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field586 = arg1.createImage(this);
		method237();
		arg1.prepareImage(field586, this);
		method237();
		arg1.prepareImage(field586, this);
		method237();
		arg1.prepareImage(field586, this);
		method235();
	}

	@ObfuscatedName("qb.a(I)V")
	public void method235() {
		class32.method145(field582, field581, field583);
	}

	@ObfuscatedName("qb.a(ZILjava/awt/Graphics;I)V")
	public void method236(int arg0, Graphics arg1, int arg2) {
		method237();
		arg1.drawImage(field586, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field585 = arg0;
		arg0.setDimensions(field582, field583);
		arg0.setProperties(null);
		arg0.setColorModel(field584);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field585 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field585 == arg0) {
			field585 = null;
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
		if (field585 != null) {
			field585.setPixels(0, 0, field582, field583, field584, field581, 0, field582);
			field585.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
