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

@ObfuscatedName("cj")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cj.l")
    public ColorModel field1432;

    @ObfuscatedName("cj.b")
    public ImageConsumer field1431;

    @ObfuscatedName("cj.l(IILjava/awt/Component;B)V")
    public final void method1625(int arg0, int arg1, Component arg2) {
        this.field1450 = arg0;
        this.field1452 = arg1;
        this.field1455 = new int[arg0 * arg1 + 1];
        this.field1432 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1453 = arg2.createImage(this);
        this.method1609();
        arg2.prepareImage(this.field1453, this);
        this.method1609();
        arg2.prepareImage(this.field1453, this);
        this.method1609();
        arg2.prepareImage(this.field1453, this);
        this.method1671();
    }

    @ObfuscatedName("cj.b(Ljava/awt/Graphics;IIB)V")
    public final void method1605(Graphics arg0, int arg1, int arg2) {
        this.method1609();
        arg0.drawImage(this.field1453, arg1, arg2, this);
    }

    @ObfuscatedName("cj.o(Ljava/awt/Graphics;IIIIB)V")
    public final void method1624(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1610(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1453, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1431 = arg0;
        arg0.setDimensions(this.field1450, this.field1452);
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

    @ObfuscatedName("cj.w(B)V")
    public synchronized void method1609() {
        if (this.field1431 != null) {
            this.field1431.setPixels(0, 0, this.field1450, this.field1452, this.field1432, this.field1455, 0, this.field1450);
            this.field1431.imageComplete(2);
        }
    }

    @ObfuscatedName("cj.r(IIIII)V")
    public synchronized void method1610(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1431 != null) {
            this.field1431.setPixels(arg0, arg1, arg2, arg3, this.field1432, this.field1455, this.field1450 * arg1 + arg0, this.field1450);
            this.field1431.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
