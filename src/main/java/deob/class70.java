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

@ObfuscatedName("bt")
public final class class70 extends class72 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bt.c")
    public ColorModel field1270;

    @ObfuscatedName("bt.j")
    public ImageConsumer field1271;

    @ObfuscatedName("bt.c(IILjava/awt/Component;B)V")
    public final void method1345(int arg0, int arg1, Component arg2) {
        this.field1292 = arg0;
        this.field1289 = arg1;
        this.field1288 = new int[arg0 * arg1 + 1];
        this.field1270 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1290 = arg2.createImage(this);
        this.method1350();
        arg2.prepareImage(this.field1290, this);
        this.method1350();
        arg2.prepareImage(this.field1290, this);
        this.method1350();
        arg2.prepareImage(this.field1290, this);
        this.method1417();
    }

    @ObfuscatedName("bt.j(Ljava/awt/Graphics;III)V")
    public final void method1367(Graphics arg0, int arg1, int arg2) {
        this.method1350();
        arg0.drawImage(this.field1290, arg1, arg2, this);
    }

    @ObfuscatedName("bt.y(Ljava/awt/Graphics;IIIIB)V")
    public final void method1346(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1351(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1290, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1271 = arg0;
        arg0.setDimensions(this.field1292, this.field1289);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1270);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1271 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1271 == arg0) {
            this.field1271 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bt.r(I)V")
    public synchronized void method1350() {
        if (this.field1271 != null) {
            this.field1271.setPixels(0, 0, this.field1292, this.field1289, this.field1270, this.field1288, 0, this.field1292);
            this.field1271.imageComplete(2);
        }
    }

    @ObfuscatedName("bt.f(IIIIB)V")
    public synchronized void method1351(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1271 != null) {
            this.field1271.setPixels(arg0, arg1, arg2, arg3, this.field1270, this.field1288, this.field1292 * arg1 + arg0, this.field1292);
            this.field1271.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
