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
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bx.t")
    public ColorModel field1275;

    @ObfuscatedName("bx.o")
    public ImageConsumer field1274;

    @ObfuscatedName("bx.t(IILjava/awt/Component;B)V")
    public final void method1359(int arg0, int arg1, Component arg2) {
        this.field1296 = arg0;
        this.field1288 = arg1;
        this.field1292 = new int[arg0 * arg1 + 1];
        this.field1275 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1289 = arg2.createImage(this);
        this.method1336();
        arg2.prepareImage(this.field1289, this);
        this.method1336();
        arg2.prepareImage(this.field1289, this);
        this.method1336();
        arg2.prepareImage(this.field1289, this);
        this.method1400();
    }

    @ObfuscatedName("bx.o(Ljava/awt/Graphics;IIB)V")
    public final void method1363(Graphics arg0, int arg1, int arg2) {
        this.method1336();
        arg0.drawImage(this.field1289, arg1, arg2, this);
    }

    @ObfuscatedName("bx.i(Ljava/awt/Graphics;IIIII)V")
    public final void method1349(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1337(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1289, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1274 = arg0;
        arg0.setDimensions(this.field1296, this.field1288);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1275);
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

    @ObfuscatedName("bx.p(B)V")
    public synchronized void method1336() {
        if (this.field1274 != null) {
            this.field1274.setPixels(0, 0, this.field1296, this.field1288, this.field1275, this.field1292, 0, this.field1296);
            this.field1274.imageComplete(2);
        }
    }

    @ObfuscatedName("bx.c(IIIIS)V")
    public synchronized void method1337(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1274 != null) {
            this.field1274.setPixels(arg0, arg1, arg2, arg3, this.field1275, this.field1292, this.field1296 * arg1 + arg0, this.field1296);
            this.field1274.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
