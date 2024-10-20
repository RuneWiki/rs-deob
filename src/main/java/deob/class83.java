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

@ObfuscatedName("cw")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cw.p")
    public ColorModel field1451;

    @ObfuscatedName("cw.i")
    public ImageConsumer field1450;

    @ObfuscatedName("cw.p(IILjava/awt/Component;B)V")
    public final void method1641(int arg0, int arg1, Component arg2) {
        this.field1465 = arg0;
        this.field1461 = arg1;
        this.field1463 = new int[arg0 * arg1 + 1];
        this.field1451 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1462 = arg2.createImage(this);
        this.method1644();
        arg2.prepareImage(this.field1462, this);
        this.method1644();
        arg2.prepareImage(this.field1462, this);
        this.method1644();
        arg2.prepareImage(this.field1462, this);
        this.method1717();
    }

    @ObfuscatedName("cw.i(Ljava/awt/Graphics;IIB)V")
    public final void method1661(Graphics arg0, int arg1, int arg2) {
        this.method1644();
        arg0.drawImage(this.field1462, arg1, arg2, this);
    }

    @ObfuscatedName("cw.o(Ljava/awt/Graphics;IIIII)V")
    public final void method1643(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1645(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1462, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1450 = arg0;
        arg0.setDimensions(this.field1465, this.field1461);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1451);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1450 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1450 == arg0) {
            this.field1450 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cw.n(I)V")
    public synchronized void method1644() {
        if (this.field1450 != null) {
            this.field1450.setPixels(0, 0, this.field1465, this.field1461, this.field1451, this.field1463, 0, this.field1465);
            this.field1450.imageComplete(2);
        }
    }

    @ObfuscatedName("cw.l(IIIIB)V")
    public synchronized void method1645(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1450 != null) {
            this.field1450.setPixels(arg0, arg1, arg2, arg3, this.field1451, this.field1463, this.field1465 * arg1 + arg0, this.field1465);
            this.field1450.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
