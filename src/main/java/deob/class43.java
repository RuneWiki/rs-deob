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
	public int[] field577;

	@ObfuscatedName("qb.d")
	public int field578;

	@ObfuscatedName("qb.e")
	public int field579;

	@ObfuscatedName("qb.f")
	public ColorModel field580;

	@ObfuscatedName("qb.g")
	public ImageConsumer field581;

	@ObfuscatedName("qb.h")
	public Image field582;

	public class43(int arg0, Component arg1, int arg2) {
		field578 = arg2;
		field579 = arg0;
		field577 = new int[arg0 * arg2];
		field580 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field582 = arg1.createImage(this);
		method229();
		arg1.prepareImage(field582, this);
		method229();
		arg1.prepareImage(field582, this);
		method229();
		arg1.prepareImage(field582, this);
		method227();
	}

	@ObfuscatedName("qb.a(I)V")
	public void method227() {
		class32.method141(field578, field577, field579);
	}

	@ObfuscatedName("qb.a(ILjava/awt/Graphics;IB)V")
	public void method228(int arg0, Graphics arg1, int arg2) {
		method229();
		arg1.drawImage(field582, arg0, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field581 = arg0;
		arg0.setDimensions(field578, field579);
		arg0.setProperties(null);
		arg0.setColorModel(field580);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field581 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field581 == arg0) {
			field581 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("qb.a()V")
	public synchronized void method229() {
		if (field581 != null) {
			field581.setPixels(0, 0, field578, field579, field580, field577, 0, field578);
			field581.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
