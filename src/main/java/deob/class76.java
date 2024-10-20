package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("bl")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bl.v")
    public ColorModel field1378;

    @ObfuscatedName("bl.f")
    public ImageConsumer field1377;

    @ObfuscatedName("bl.v(IILjava/awt/Component;B)V")
    public final void method1508(int arg0, int arg1, Component arg2) {
        this.field1388 = arg0;
        this.field1391 = arg1;
        this.field1392 = new int[arg0 * arg1 + 1];
        this.field1378 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1390 = arg2.createImage(this);
        this.method1523();
        arg2.prepareImage(this.field1390, this);
        this.method1523();
        arg2.prepareImage(this.field1390, this);
        this.method1523();
        arg2.prepareImage(this.field1390, this);
        this.method1598();
    }

    @ObfuscatedName("bl.f(Ljava/awt/Graphics;III)V")
    public final void method1509(Graphics arg0, int arg1, int arg2) {
        this.method1523();
        arg0.drawImage(this.field1390, arg1, arg2, this);
    }

    @ObfuscatedName("bl.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1510(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1538(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1390, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1377 = arg0;
        arg0.setDimensions(this.field1388, this.field1391);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1378);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1377 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1377 == arg0) {
            this.field1377 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bl.d(I)V")
    public synchronized void method1523() {
        if (this.field1377 != null) {
            this.field1377.setPixels(0, 0, this.field1388, this.field1391, this.field1378, this.field1392, 0, this.field1388);
            this.field1377.imageComplete(2);
        }
    }

    @ObfuscatedName("bl.o(IIIIB)V")
    public synchronized void method1538(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1377 != null) {
            this.field1377.setPixels(arg0, arg1, arg2, arg3, this.field1378, this.field1392, this.field1388 * arg1 + arg0, this.field1388);
            this.field1377.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
