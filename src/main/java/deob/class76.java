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

@ObfuscatedName("bv")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bv.g")
    public ColorModel field1371;

    @ObfuscatedName("bv.b")
    public ImageConsumer field1368;

    @ObfuscatedName("bv.g(IILjava/awt/Component;B)V")
    public final void method1541(int arg0, int arg1, Component arg2) {
        this.field1388 = arg0;
        this.field1394 = arg1;
        this.field1396 = new int[arg0 * arg1 + 1];
        this.field1371 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1390 = arg2.createImage(this);
        this.method1546();
        arg2.prepareImage(this.field1390, this);
        this.method1546();
        arg2.prepareImage(this.field1390, this);
        this.method1546();
        arg2.prepareImage(this.field1390, this);
        this.method1608();
    }

    @ObfuscatedName("bv.b(Ljava/awt/Graphics;III)V")
    public final void method1542(Graphics arg0, int arg1, int arg2) {
        this.method1546();
        arg0.drawImage(this.field1390, arg1, arg2, this);
    }

    @ObfuscatedName("bv.w(Ljava/awt/Graphics;IIIII)V")
    public final void method1568(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1547(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1390, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1368 = arg0;
        arg0.setDimensions(this.field1388, this.field1394);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1371);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1368 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1368 == arg0) {
            this.field1368 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bv.d(S)V")
    public synchronized void method1546() {
        if (this.field1368 != null) {
            this.field1368.setPixels(0, 0, this.field1388, this.field1394, this.field1371, this.field1396, 0, this.field1388);
            this.field1368.imageComplete(2);
        }
    }

    @ObfuscatedName("bv.z(IIIII)V")
    public synchronized void method1547(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1368 != null) {
            this.field1368.setPixels(arg0, arg1, arg2, arg3, this.field1371, this.field1396, this.field1388 * arg1 + arg0, this.field1388);
            this.field1368.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
