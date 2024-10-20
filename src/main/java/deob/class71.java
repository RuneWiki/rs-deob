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

@ObfuscatedName("bz")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bz.b")
    public ColorModel field1311;

    @ObfuscatedName("bz.e")
    public ImageConsumer field1308;

    @ObfuscatedName("bz.b(IILjava/awt/Component;I)V")
    public final void method1355(int arg0, int arg1, Component arg2) {
        this.field1324 = arg0;
        this.field1326 = arg1;
        this.field1327 = new int[arg0 * arg1 + 1];
        this.field1311 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1330 = arg2.createImage(this);
        this.method1342();
        arg2.prepareImage(this.field1330, this);
        this.method1342();
        arg2.prepareImage(this.field1330, this);
        this.method1342();
        arg2.prepareImage(this.field1330, this);
        this.method1394();
    }

    @ObfuscatedName("bz.e(Ljava/awt/Graphics;III)V")
    public final void method1346(Graphics arg0, int arg1, int arg2) {
        this.method1342();
        arg0.drawImage(this.field1330, arg1, arg2, this);
    }

    @ObfuscatedName("bz.a(Ljava/awt/Graphics;IIIII)V")
    public final void method1341(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1343(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1330, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1308 = arg0;
        arg0.setDimensions(this.field1324, this.field1326);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1311);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1308 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1308 == arg0) {
            this.field1308 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bz.k(I)V")
    public synchronized void method1342() {
        if (this.field1308 != null) {
            this.field1308.setPixels(0, 0, this.field1324, this.field1326, this.field1311, this.field1327, 0, this.field1324);
            this.field1308.imageComplete(2);
        }
    }

    @ObfuscatedName("bz.p(IIIIB)V")
    public synchronized void method1343(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1308 != null) {
            this.field1308.setPixels(arg0, arg1, arg2, arg3, this.field1311, this.field1327, this.field1324 * arg1 + arg0, this.field1324);
            this.field1308.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
