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

@ObfuscatedName("ba")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("ba.n")
    public ColorModel field1270;

    @ObfuscatedName("ba.x")
    public ImageConsumer field1268;

    @ObfuscatedName("ba.n(IILjava/awt/Component;I)V")
    public final void method1375(int arg0, int arg1, Component arg2) {
        this.field1280 = arg0;
        this.field1281 = arg1;
        this.field1283 = new int[arg0 * arg1 + 1];
        this.field1270 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1285 = arg2.createImage(this);
        this.method1351();
        arg2.prepareImage(this.field1285, this);
        this.method1351();
        arg2.prepareImage(this.field1285, this);
        this.method1351();
        arg2.prepareImage(this.field1285, this);
        this.method1424();
    }

    @ObfuscatedName("ba.x(Ljava/awt/Graphics;IIS)V")
    public final void method1348(Graphics arg0, int arg1, int arg2) {
        this.method1351();
        arg0.drawImage(this.field1285, arg1, arg2, this);
    }

    @ObfuscatedName("ba.k(Ljava/awt/Graphics;IIIIB)V")
    public final void method1349(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1352(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1285, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1268 = arg0;
        arg0.setDimensions(this.field1280, this.field1281);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1270);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1268 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1268 == arg0) {
            this.field1268 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ba.i(I)V")
    public synchronized void method1351() {
        if (this.field1268 != null) {
            this.field1268.setPixels(0, 0, this.field1280, this.field1281, this.field1270, this.field1283, 0, this.field1280);
            this.field1268.imageComplete(2);
        }
    }

    @ObfuscatedName("ba.d(IIIII)V")
    public synchronized void method1352(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1268 != null) {
            this.field1268.setPixels(arg0, arg1, arg2, arg3, this.field1270, this.field1283, this.field1280 * arg1 + arg0, this.field1280);
            this.field1268.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
