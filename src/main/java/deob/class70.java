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

@ObfuscatedName("bn")
public final class class70 extends class72 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bn.g")
    public ColorModel field1279;

    @ObfuscatedName("bn.j")
    public ImageConsumer field1281;

    @ObfuscatedName("bn.g(IILjava/awt/Component;B)V")
    public final void method1293(int arg0, int arg1, Component arg2) {
        this.field1295 = arg0;
        this.field1297 = arg1;
        this.field1300 = new int[arg0 * arg1 + 1];
        this.field1279 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1298 = arg2.createImage(this);
        this.method1297();
        arg2.prepareImage(this.field1298, this);
        this.method1297();
        arg2.prepareImage(this.field1298, this);
        this.method1297();
        arg2.prepareImage(this.field1298, this);
        this.method1353();
    }

    @ObfuscatedName("bn.j(Ljava/awt/Graphics;IIB)V")
    public final void method1300(Graphics arg0, int arg1, int arg2) {
        this.method1297();
        arg0.drawImage(this.field1298, arg1, arg2, this);
    }

    @ObfuscatedName("bn.z(Ljava/awt/Graphics;IIIII)V")
    public final void method1295(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1318(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1298, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1281 = arg0;
        arg0.setDimensions(this.field1295, this.field1297);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1279);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1281 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1281 == arg0) {
            this.field1281 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bn.b(I)V")
    public synchronized void method1297() {
        if (this.field1281 != null) {
            this.field1281.setPixels(0, 0, this.field1295, this.field1297, this.field1279, this.field1300, 0, this.field1295);
            this.field1281.imageComplete(2);
        }
    }

    @ObfuscatedName("bn.k(IIIII)V")
    public synchronized void method1318(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1281 != null) {
            this.field1281.setPixels(arg0, arg1, arg2, arg3, this.field1279, this.field1300, this.field1295 * arg1 + arg0, this.field1295);
            this.field1281.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
