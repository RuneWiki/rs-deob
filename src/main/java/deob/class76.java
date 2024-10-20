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

@ObfuscatedName("bp")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bp.j")
    public ColorModel field1380;

    @ObfuscatedName("bp.l")
    public ImageConsumer field1385;

    @ObfuscatedName("bp.j(IILjava/awt/Component;B)V")
    public final void method1507(int arg0, int arg1, Component arg2) {
        this.field1401 = arg0;
        this.field1402 = arg1;
        this.field1403 = new int[arg0 * arg1 + 1];
        this.field1380 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1400 = arg2.createImage(this);
        this.method1525();
        arg2.prepareImage(this.field1400, this);
        this.method1525();
        arg2.prepareImage(this.field1400, this);
        this.method1525();
        arg2.prepareImage(this.field1400, this);
        this.method1565();
    }

    @ObfuscatedName("bp.l(Ljava/awt/Graphics;III)V")
    public final void method1518(Graphics arg0, int arg1, int arg2) {
        this.method1525();
        arg0.drawImage(this.field1400, arg1, arg2, this);
    }

    @ObfuscatedName("bp.a(Ljava/awt/Graphics;IIIII)V")
    public final void method1508(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1511(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1400, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1385 = arg0;
        arg0.setDimensions(this.field1401, this.field1402);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1380);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1385 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1385 == arg0) {
            this.field1385 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bp.i(I)V")
    public synchronized void method1525() {
        if (this.field1385 != null) {
            this.field1385.setPixels(0, 0, this.field1401, this.field1402, this.field1380, this.field1403, 0, this.field1401);
            this.field1385.imageComplete(2);
        }
    }

    @ObfuscatedName("bp.f(IIIIB)V")
    public synchronized void method1511(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1385 != null) {
            this.field1385.setPixels(arg0, arg1, arg2, arg3, this.field1380, this.field1403, this.field1401 * arg1 + arg0, this.field1401);
            this.field1385.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
