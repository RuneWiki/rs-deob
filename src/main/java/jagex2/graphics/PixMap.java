package jagex2.graphics;

import deob.ObfuscatedName;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("IVIFZQBK")
public final class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("IVIFZQBK.d")
	public int width;

	@ObfuscatedName("IVIFZQBK.e")
	public int height;

	@ObfuscatedName("IVIFZQBK.c")
	public int[] data;

	@ObfuscatedName("IVIFZQBK.f")
	public ColorModel colorModel;

	@ObfuscatedName("IVIFZQBK.h")
	public Image image;

	@ObfuscatedName("IVIFZQBK.g")
	public ImageConsumer consumer;

	public PixMap(int arg0, int arg1, Component arg2) {
		width = arg0;
		height = arg1;
		data = new int[arg0 * arg1];
		colorModel = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		image = arg2.createImage(this);
		setPixels();
		arg2.prepareImage(image, this);
		setPixels();
		arg2.prepareImage(image, this);
		setPixels();
		arg2.prepareImage(image, this);
		bind();
	}

	@ObfuscatedName("IVIFZQBK.a(I)V")
	public void bind() {
		Pix2D.bind(height, width, data);
	}

	@ObfuscatedName("IVIFZQBK.a(IILjava/awt/Graphics;I)V")
	public void draw(int arg0, Graphics arg1, int arg2) {
		setPixels();
		arg1.drawImage(image, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		consumer = arg0;
		arg0.setDimensions(width, height);
		arg0.setProperties(null);
		arg0.setColorModel(colorModel);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (consumer == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (consumer == arg0) {
			consumer = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("IVIFZQBK.a()V")
	public synchronized void setPixels() {
		if (consumer != null) {
			consumer.setPixels(0, 0, width, height, colorModel, data, 0, width);
			consumer.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
