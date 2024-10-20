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

@ObfuscatedName("bs")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bs.o")
    public ColorModel field1371;

    @ObfuscatedName("bs.e")
    public ImageConsumer field1369;

    @ObfuscatedName("bs.o(IILjava/awt/Component;B)V")
    public final void method1500(int arg0, int arg1, Component arg2) {
        this.field1384 = arg0;
        this.field1386 = arg1;
        this.field1385 = new int[arg0 * arg1 + 1];
        this.field1371 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1388 = arg2.createImage(this);
        this.method1481();
        arg2.prepareImage(this.field1388, this);
        this.method1481();
        arg2.prepareImage(this.field1388, this);
        this.method1481();
        arg2.prepareImage(this.field1388, this);
        this.method1545();
    }

    @ObfuscatedName("bs.e(Ljava/awt/Graphics;III)V")
    public final void method1479(Graphics arg0, int arg1, int arg2) {
        this.method1481();
        arg0.drawImage(this.field1388, arg1, arg2, this);
    }

    @ObfuscatedName("bs.u(Ljava/awt/Graphics;IIIII)V")
    public final void method1498(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1486(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1388, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1369 = arg0;
        arg0.setDimensions(this.field1384, this.field1386);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1371);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1369 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1369 == arg0) {
            this.field1369 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bs.b(I)V")
    public synchronized void method1481() {
        if (this.field1369 != null) {
            this.field1369.setPixels(0, 0, this.field1384, this.field1386, this.field1371, this.field1385, 0, this.field1384);
            this.field1369.imageComplete(2);
        }
    }

    @ObfuscatedName("bs.p(IIIII)V")
    public synchronized void method1486(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1369 != null) {
            this.field1369.setPixels(arg0, arg1, arg2, arg3, this.field1371, this.field1385, this.field1384 * arg1 + arg0, this.field1384);
            this.field1369.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
