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

@ObfuscatedName("cj")
public final class class84 extends class86 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cj.i")
    public ColorModel field1461;

    @ObfuscatedName("cj.b")
    public ImageConsumer field1460;

    @ObfuscatedName("cj.i(IILjava/awt/Component;B)V")
    public final void method1617(int arg0, int arg1, Component arg2) {
        this.field1477 = arg0;
        this.field1476 = arg1;
        this.field1479 = new int[arg0 * arg1 + 1];
        this.field1461 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1478 = arg2.createImage(this);
        this.method1613();
        arg2.prepareImage(this.field1478, this);
        this.method1613();
        arg2.prepareImage(this.field1478, this);
        this.method1613();
        arg2.prepareImage(this.field1478, this);
        this.method1679();
    }

    @ObfuscatedName("cj.b(Ljava/awt/Graphics;IIB)V")
    public final void method1632(Graphics arg0, int arg1, int arg2) {
        this.method1613();
        arg0.drawImage(this.field1478, arg1, arg2, this);
    }

    @ObfuscatedName("cj.r(Ljava/awt/Graphics;IIIII)V")
    public final void method1610(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1612(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1478, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1460 = arg0;
        arg0.setDimensions(this.field1477, this.field1476);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1461);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1460 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1460 == arg0) {
            this.field1460 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cj.l(I)V")
    public synchronized void method1613() {
        if (this.field1460 != null) {
            this.field1460.setPixels(0, 0, this.field1477, this.field1476, this.field1461, this.field1479, 0, this.field1477);
            this.field1460.imageComplete(2);
        }
    }

    @ObfuscatedName("cj.s(IIIII)V")
    public synchronized void method1612(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1460 != null) {
            this.field1460.setPixels(arg0, arg1, arg2, arg3, this.field1461, this.field1479, this.field1477 * arg1 + arg0, this.field1477);
            this.field1460.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
