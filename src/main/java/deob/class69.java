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

@ObfuscatedName("bf")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bf.g")
    public ColorModel field1268;

    @ObfuscatedName("bf.v")
    public ImageConsumer field1269;

    @ObfuscatedName("bf.g(IILjava/awt/Component;I)V")
    public final void method1385(int arg0, int arg1, Component arg2) {
        this.field1294 = arg0;
        this.field1288 = arg1;
        this.field1287 = new int[arg0 * arg1 + 1];
        this.field1268 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1289 = arg2.createImage(this);
        this.method1369();
        arg2.prepareImage(this.field1289, this);
        this.method1369();
        arg2.prepareImage(this.field1289, this);
        this.method1369();
        arg2.prepareImage(this.field1289, this);
        this.method1432();
    }

    @ObfuscatedName("bf.v(Ljava/awt/Graphics;III)V")
    public final void method1360(Graphics arg0, int arg1, int arg2) {
        this.method1369();
        arg0.drawImage(this.field1289, arg1, arg2, this);
    }

    @ObfuscatedName("bf.z(Ljava/awt/Graphics;IIIII)V")
    public final void method1361(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1365(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1289, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1269 = arg0;
        arg0.setDimensions(this.field1294, this.field1288);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1268);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1269 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1269 == arg0) {
            this.field1269 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bf.h(I)V")
    public synchronized void method1369() {
        if (this.field1269 != null) {
            this.field1269.setPixels(0, 0, this.field1294, this.field1288, this.field1268, this.field1287, 0, this.field1294);
            this.field1269.imageComplete(2);
        }
    }

    @ObfuscatedName("bf.k(IIIIS)V")
    public synchronized void method1365(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1269 != null) {
            this.field1269.setPixels(arg0, arg1, arg2, arg3, this.field1268, this.field1287, this.field1294 * arg1 + arg0, this.field1294);
            this.field1269.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
