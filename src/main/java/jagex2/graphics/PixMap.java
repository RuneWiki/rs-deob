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

public class PixMap implements ImageProducer, ImageObserver {

	@ObfuscatedName("IVIFZQBK.b")
	public boolean _flowObfuscator2 = true;

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

	@ObfuscatedName("IVIFZQBK.a")
	public int _flowObfuscator1;

	@ObfuscatedName("IVIFZQBK.g")
	public ImageConsumer consumer;

	public PixMap(int arg0, int arg1, Component arg2, int arg3) {
		this.width = arg0;
		this.height = arg1;
		this.data = new int[arg0 * arg1];
		this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		this.image = arg2.createImage(this);
		this.setPixels();
		arg2.prepareImage(this.image, this);
		if (arg3 != 0) {
			this._flowObfuscator2 = !this._flowObfuscator2;
		}
		this.setPixels();
		arg2.prepareImage(this.image, this);
		this.setPixels();
		arg2.prepareImage(this.image, this);
		this.bind(0);
	}

	@ObfuscatedName("IVIFZQBK.a(I)V")
	public void bind(int arg0) {
		Pix2D.bind(this.height, this.width, -293, this.data);
		if (arg0 != 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
	}

	@ObfuscatedName("IVIFZQBK.a(IILjava/awt/Graphics;I)V")
	public void draw(int arg0, int arg1, Graphics arg2, int arg3) {
		this.setPixels();
		if (arg1 != 23680) {
			this._flowObfuscator1 = -169;
		}
		arg2.drawImage(this.image, arg3, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		this.consumer = arg0;
		arg0.setDimensions(this.width, this.height);
		arg0.setProperties(null);
		arg0.setColorModel(this.colorModel);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		return this.consumer == arg0;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (this.consumer == arg0) {
			this.consumer = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		this.addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("IVIFZQBK.a()V")
	public synchronized void setPixels() {
		if (this.consumer != null) {
			this.consumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.data, 0, this.width);
			this.consumer.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
