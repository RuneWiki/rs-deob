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

@ObfuscatedName("ca")
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("ca.j")
    public ColorModel field1423;

    @ObfuscatedName("ca.r")
    public ImageConsumer field1421;

    @ObfuscatedName("ca.j(IILjava/awt/Component;I)V")
    public final void method1610(int arg0, int arg1, Component arg2) {
        this.field1438 = arg0;
        this.field1444 = arg1;
        this.field1443 = new int[arg0 * arg1 + 1];
        this.field1423 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1440 = arg2.createImage(this);
        this.method1598();
        arg2.prepareImage(this.field1440, this);
        this.method1598();
        arg2.prepareImage(this.field1440, this);
        this.method1598();
        arg2.prepareImage(this.field1440, this);
        this.method1662();
    }

    @ObfuscatedName("ca.r(Ljava/awt/Graphics;III)V")
    public final void method1594(Graphics arg0, int arg1, int arg2) {
        this.method1598();
        arg0.drawImage(this.field1440, arg1, arg2, this);
    }

    @ObfuscatedName("ca.v(Ljava/awt/Graphics;IIIIS)V")
    public final void method1614(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1599(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1440, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1421 = arg0;
        arg0.setDimensions(this.field1438, this.field1444);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1423);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1421 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1421 == arg0) {
            this.field1421 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("ca.p(I)V")
    public synchronized void method1598() {
        if (this.field1421 != null) {
            this.field1421.setPixels(0, 0, this.field1438, this.field1444, this.field1423, this.field1443, 0, this.field1438);
            this.field1421.imageComplete(2);
        }
    }

    @ObfuscatedName("ca.e(IIIIB)V")
    public synchronized void method1599(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1421 != null) {
            this.field1421.setPixels(arg0, arg1, arg2, arg3, this.field1423, this.field1443, this.field1438 * arg1 + arg0, this.field1438);
            this.field1421.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
