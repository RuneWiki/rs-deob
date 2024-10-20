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

@ObfuscatedName("bk")
public final class class74 extends class76 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bk.j")
    public ColorModel field1343;

    @ObfuscatedName("bk.y")
    public ImageConsumer field1342;

    @ObfuscatedName("bk.j(IILjava/awt/Component;I)V")
    public final void method1551(int arg0, int arg1, Component arg2) {
        this.field1358 = arg0;
        this.field1361 = arg1;
        this.field1368 = new int[arg0 * arg1 + 1];
        this.field1343 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1360 = arg2.createImage(this);
        this.method1556();
        arg2.prepareImage(this.field1360, this);
        this.method1556();
        arg2.prepareImage(this.field1360, this);
        this.method1556();
        arg2.prepareImage(this.field1360, this);
        this.method1621();
    }

    @ObfuscatedName("bk.y(Ljava/awt/Graphics;IIB)V")
    public final void method1552(Graphics arg0, int arg1, int arg2) {
        this.method1556();
        arg0.drawImage(this.field1360, arg1, arg2, this);
    }

    @ObfuscatedName("bk.z(Ljava/awt/Graphics;IIIII)V")
    public final void method1553(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1557(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1360, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1342 = arg0;
        arg0.setDimensions(this.field1358, this.field1361);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1343);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1342 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1342 == arg0) {
            this.field1342 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bk.l(B)V")
    public synchronized void method1556() {
        if (this.field1342 != null) {
            this.field1342.setPixels(0, 0, this.field1358, this.field1361, this.field1343, this.field1368, 0, this.field1358);
            this.field1342.imageComplete(2);
        }
    }

    @ObfuscatedName("bk.w(IIIIB)V")
    public synchronized void method1557(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1342 != null) {
            this.field1342.setPixels(arg0, arg1, arg2, arg3, this.field1343, this.field1368, this.field1358 * arg1 + arg0, this.field1358);
            this.field1342.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
