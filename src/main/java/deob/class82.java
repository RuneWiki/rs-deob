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

@ObfuscatedName("cx")
public final class class82 extends class84 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cx.p")
    public ColorModel field1447;

    @ObfuscatedName("cx.j")
    public ImageConsumer field1446;

    @ObfuscatedName("cx.p(IILjava/awt/Component;B)V")
    public final void method1602(int arg0, int arg1, Component arg2) {
        this.field1462 = arg0;
        this.field1464 = arg1;
        this.field1466 = new int[arg0 * arg1 + 1];
        this.field1447 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1465 = arg2.createImage(this);
        this.method1576();
        arg2.prepareImage(this.field1465, this);
        this.method1576();
        arg2.prepareImage(this.field1465, this);
        this.method1576();
        arg2.prepareImage(this.field1465, this);
        this.method1640();
    }

    @ObfuscatedName("cx.j(Ljava/awt/Graphics;III)V")
    public final void method1570(Graphics arg0, int arg1, int arg2) {
        this.method1576();
        arg0.drawImage(this.field1465, arg1, arg2, this);
    }

    @ObfuscatedName("cx.w(Ljava/awt/Graphics;IIIII)V")
    public final void method1571(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1575(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1465, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1446 = arg0;
        arg0.setDimensions(this.field1462, this.field1464);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1447);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1446 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1446 == arg0) {
            this.field1446 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cx.h(B)V")
    public synchronized void method1576() {
        if (this.field1446 != null) {
            this.field1446.setPixels(0, 0, this.field1462, this.field1464, this.field1447, this.field1466, 0, this.field1462);
            this.field1446.imageComplete(2);
        }
    }

    @ObfuscatedName("cx.v(IIIII)V")
    public synchronized void method1575(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1446 != null) {
            this.field1446.setPixels(arg0, arg1, arg2, arg3, this.field1447, this.field1466, this.field1462 * arg1 + arg0, this.field1462);
            this.field1446.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
