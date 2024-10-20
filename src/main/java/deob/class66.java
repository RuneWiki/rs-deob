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

@ObfuscatedName("bj")
public final class class66 extends class68 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bj.m")
    public ColorModel field1241;

    @ObfuscatedName("bj.k")
    public ImageConsumer field1244;

    @ObfuscatedName("bj.m(IILjava/awt/Component;I)V")
    public final void method1329(int arg0, int arg1, Component arg2) {
        this.field1261 = arg0;
        this.field1259 = arg1;
        this.field1258 = new int[arg0 * arg1 + 1];
        this.field1241 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1260 = arg2.createImage(this);
        this.method1343();
        arg2.prepareImage(this.field1260, this);
        this.method1343();
        arg2.prepareImage(this.field1260, this);
        this.method1343();
        arg2.prepareImage(this.field1260, this);
        this.method1391();
    }

    @ObfuscatedName("bj.k(Ljava/awt/Graphics;III)V")
    public final void method1325(Graphics arg0, int arg1, int arg2) {
        this.method1343();
        arg0.drawImage(this.field1260, arg1, arg2, this);
    }

    @ObfuscatedName("bj.y(Ljava/awt/Graphics;IIIIB)V")
    public final void method1337(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1328(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1260, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1244 = arg0;
        arg0.setDimensions(this.field1261, this.field1259);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1241);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1244 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1244 == arg0) {
            this.field1244 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bj.g(I)V")
    public synchronized void method1343() {
        if (this.field1244 != null) {
            this.field1244.setPixels(0, 0, this.field1261, this.field1259, this.field1241, this.field1258, 0, this.field1261);
            this.field1244.imageComplete(2);
        }
    }

    @ObfuscatedName("bj.r(IIIIB)V")
    public synchronized void method1328(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1244 != null) {
            this.field1244.setPixels(arg0, arg1, arg2, arg3, this.field1241, this.field1258, this.field1261 * arg1 + arg0, this.field1261);
            this.field1244.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
