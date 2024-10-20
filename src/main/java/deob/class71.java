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

@ObfuscatedName("bi")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bi.e")
    public ColorModel field1252;

    @ObfuscatedName("bi.a")
    public ImageConsumer field1253;

    @ObfuscatedName("bi.e(IILjava/awt/Component;I)V")
    public final void method1398(int arg0, int arg1, Component arg2) {
        this.field1264 = arg0;
        this.field1263 = arg1;
        this.field1267 = new int[arg0 * arg1 + 1];
        this.field1252 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1266 = arg2.createImage(this);
        this.method1397();
        arg2.prepareImage(this.field1266, this);
        this.method1397();
        arg2.prepareImage(this.field1266, this);
        this.method1397();
        arg2.prepareImage(this.field1266, this);
        this.method1465();
    }

    @ObfuscatedName("bi.a(Ljava/awt/Graphics;IIB)V")
    public final void method1395(Graphics arg0, int arg1, int arg2) {
        this.method1397();
        arg0.drawImage(this.field1266, arg1, arg2, this);
    }

    @ObfuscatedName("bi.l(Ljava/awt/Graphics;IIIII)V")
    public final void method1396(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1399(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1266, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1253 = arg0;
        arg0.setDimensions(this.field1264, this.field1263);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1252);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1253 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1253 == arg0) {
            this.field1253 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bi.c(B)V")
    public synchronized void method1397() {
        if (this.field1253 != null) {
            this.field1253.setPixels(0, 0, this.field1264, this.field1263, this.field1252, this.field1267, 0, this.field1264);
            this.field1253.imageComplete(2);
        }
    }

    @ObfuscatedName("bi.u(IIIII)V")
    public synchronized void method1399(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1253 != null) {
            this.field1253.setPixels(arg0, arg1, arg2, arg3, this.field1252, this.field1267, this.field1264 * arg1 + arg0, this.field1264);
            this.field1253.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
