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

@ObfuscatedName("br")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("br.k")
    public ColorModel field1271;

    @ObfuscatedName("br.r")
    public ImageConsumer field1272;

    @ObfuscatedName("br.k(IILjava/awt/Component;I)V")
    public final void method1389(int arg0, int arg1, Component arg2) {
        this.field1295 = arg0;
        this.field1289 = arg1;
        this.field1292 = new int[arg0 * arg1 + 1];
        this.field1271 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1291 = arg2.createImage(this);
        this.method1369();
        arg2.prepareImage(this.field1291, this);
        this.method1369();
        arg2.prepareImage(this.field1291, this);
        this.method1369();
        arg2.prepareImage(this.field1291, this);
        this.method1428();
    }

    @ObfuscatedName("br.r(Ljava/awt/Graphics;III)V")
    public final void method1365(Graphics arg0, int arg1, int arg2) {
        this.method1369();
        arg0.drawImage(this.field1291, arg1, arg2, this);
    }

    @ObfuscatedName("br.y(Ljava/awt/Graphics;IIIIB)V")
    public final void method1366(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1370(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1291, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1272 = arg0;
        arg0.setDimensions(this.field1295, this.field1289);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1271);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1272 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1272 == arg0) {
            this.field1272 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("br.w(I)V")
    public synchronized void method1369() {
        if (this.field1272 != null) {
            this.field1272.setPixels(0, 0, this.field1295, this.field1289, this.field1271, this.field1292, 0, this.field1295);
            this.field1272.imageComplete(2);
        }
    }

    @ObfuscatedName("br.m(IIIII)V")
    public synchronized void method1370(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1272 != null) {
            this.field1272.setPixels(arg0, arg1, arg2, arg3, this.field1271, this.field1292, this.field1295 * arg1 + arg0, this.field1295);
            this.field1272.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
