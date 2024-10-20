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

@ObfuscatedName("bx")
public final class class70 extends class72 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bx.p")
    public ColorModel field1273;

    @ObfuscatedName("bx.y")
    public ImageConsumer field1274;

    @ObfuscatedName("bx.p(IILjava/awt/Component;I)V")
    public final void method1399(int arg0, int arg1, Component arg2) {
        this.field1290 = arg0;
        this.field1291 = arg1;
        this.field1289 = new int[arg0 * arg1 + 1];
        this.field1273 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1292 = arg2.createImage(this);
        this.method1387();
        arg2.prepareImage(this.field1292, this);
        this.method1387();
        arg2.prepareImage(this.field1292, this);
        this.method1387();
        arg2.prepareImage(this.field1292, this);
        this.method1447();
    }

    @ObfuscatedName("bx.y(Ljava/awt/Graphics;III)V")
    public final void method1384(Graphics arg0, int arg1, int arg2) {
        this.method1387();
        arg0.drawImage(this.field1292, arg1, arg2, this);
    }

    @ObfuscatedName("bx.d(Ljava/awt/Graphics;IIIIS)V")
    public final void method1401(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1388(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1292, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1274 = arg0;
        arg0.setDimensions(this.field1290, this.field1291);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1273);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1274 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1274 == arg0) {
            this.field1274 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bx.c(I)V")
    public synchronized void method1387() {
        if (this.field1274 != null) {
            this.field1274.setPixels(0, 0, this.field1290, this.field1291, this.field1273, this.field1289, 0, this.field1290);
            this.field1274.imageComplete(2);
        }
    }

    @ObfuscatedName("bx.r(IIIII)V")
    public synchronized void method1388(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1274 != null) {
            this.field1274.setPixels(arg0, arg1, arg2, arg3, this.field1273, this.field1289, this.field1290 * arg1 + arg0, this.field1290);
            this.field1274.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
