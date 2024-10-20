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

@ObfuscatedName("ck")
public final class class82 extends class84 implements ImageProducer, ImageObserver {

    @ObfuscatedName("ck.g")
    public ColorModel field1432;

    @ObfuscatedName("ck.e")
    public ImageConsumer field1431;

    @ObfuscatedName("ck.g(IILjava/awt/Component;I)V")
    public final void method1612(int arg0, int arg1, Component arg2) {
        this.field1449 = arg0;
        this.field1446 = arg1;
        this.field1450 = new int[arg0 * arg1 + 1];
        this.field1432 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1447 = arg2.createImage(this);
        this.method1617();
        arg2.prepareImage(this.field1447, this);
        this.method1617();
        arg2.prepareImage(this.field1447, this);
        this.method1617();
        arg2.prepareImage(this.field1447, this);
        this.method1683();
    }

    @ObfuscatedName("ck.e(Ljava/awt/Graphics;III)V")
    public final void method1622(Graphics arg0, int arg1, int arg2) {
        this.method1617();
        arg0.drawImage(this.field1447, arg1, arg2, this);
    }

    @ObfuscatedName("ck.n(Ljava/awt/Graphics;IIIII)V")
    public final void method1633(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1618(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1447, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1431 = arg0;
        arg0.setDimensions(this.field1449, this.field1446);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1432);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1431 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1431 == arg0) {
            this.field1431 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ck.j(I)V")
    public synchronized void method1617() {
        if (this.field1431 != null) {
            this.field1431.setPixels(0, 0, this.field1449, this.field1446, this.field1432, this.field1450, 0, this.field1449);
            this.field1431.imageComplete(2);
        }
    }

    @ObfuscatedName("ck.i(IIIII)V")
    public synchronized void method1618(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1431 != null) {
            this.field1431.setPixels(arg0, arg1, arg2, arg3, this.field1432, this.field1450, this.field1449 * arg1 + arg0, this.field1449);
            this.field1431.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
