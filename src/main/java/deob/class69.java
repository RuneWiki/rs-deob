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

@ObfuscatedName("bd")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bd.z")
    public ColorModel field1243;

    @ObfuscatedName("bd.j")
    public ImageConsumer field1244;

    @ObfuscatedName("bd.z(IILjava/awt/Component;I)V")
    public final void method1328(int arg0, int arg1, Component arg2) {
        this.field1267 = arg0;
        this.field1266 = arg1;
        this.field1271 = new int[arg0 * arg1 + 1];
        this.field1243 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1269 = arg2.createImage(this);
        this.method1330();
        arg2.prepareImage(this.field1269, this);
        this.method1330();
        arg2.prepareImage(this.field1269, this);
        this.method1330();
        arg2.prepareImage(this.field1269, this);
        this.method1403();
    }

    @ObfuscatedName("bd.j(Ljava/awt/Graphics;III)V")
    public final void method1325(Graphics arg0, int arg1, int arg2) {
        this.method1330();
        arg0.drawImage(this.field1269, arg1, arg2, this);
    }

    @ObfuscatedName("bd.a(Ljava/awt/Graphics;IIIII)V")
    public final void method1326(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1331(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1269, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1244 = arg0;
        arg0.setDimensions(this.field1267, this.field1266);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1243);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1244 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1244 == arg0) {
            this.field1244 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bd.y(S)V")
    public synchronized void method1330() {
        if (this.field1244 != null) {
            this.field1244.setPixels(0, 0, this.field1267, this.field1266, this.field1243, this.field1271, 0, this.field1267);
            this.field1244.imageComplete(2);
        }
    }

    @ObfuscatedName("bd.i(IIIII)V")
    public synchronized void method1331(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1244 != null) {
            this.field1244.setPixels(arg0, arg1, arg2, arg3, this.field1243, this.field1271, this.field1267 * arg1 + arg0, this.field1267);
            this.field1244.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
