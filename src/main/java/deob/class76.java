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

@ObfuscatedName("bv")
public final class class76 extends class78 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bv.z")
    public ColorModel field1369;

    @ObfuscatedName("bv.q")
    public ImageConsumer field1370;

    @ObfuscatedName("bv.z(IILjava/awt/Component;B)V")
    public final void method1471(int arg0, int arg1, Component arg2) {
        this.field1397 = arg0;
        this.field1390 = arg1;
        this.field1391 = new int[arg0 * arg1 + 1];
        this.field1369 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1396 = arg2.createImage(this);
        this.method1475();
        arg2.prepareImage(this.field1396, this);
        this.method1475();
        arg2.prepareImage(this.field1396, this);
        this.method1475();
        arg2.prepareImage(this.field1396, this);
        this.method1534();
    }

    @ObfuscatedName("bv.q(Ljava/awt/Graphics;IIB)V")
    public final void method1490(Graphics arg0, int arg1, int arg2) {
        this.method1475();
        arg0.drawImage(this.field1396, arg1, arg2, this);
    }

    @ObfuscatedName("bv.k(Ljava/awt/Graphics;IIIII)V")
    public final void method1473(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1476(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1396, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1370 = arg0;
        arg0.setDimensions(this.field1397, this.field1390);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1369);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1370 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1370 == arg0) {
            this.field1370 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bv.f(B)V")
    public synchronized void method1475() {
        if (this.field1370 != null) {
            this.field1370.setPixels(0, 0, this.field1397, this.field1390, this.field1369, this.field1391, 0, this.field1397);
            this.field1370.imageComplete(2);
        }
    }

    @ObfuscatedName("bv.d(IIIIB)V")
    public synchronized void method1476(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1370 != null) {
            this.field1370.setPixels(arg0, arg1, arg2, arg3, this.field1369, this.field1391, this.field1397 * arg1 + arg0, this.field1397);
            this.field1370.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
