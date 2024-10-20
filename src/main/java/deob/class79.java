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

@ObfuscatedName("cm")
public final class class79 extends class81 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cm.x")
    public ColorModel field1417;

    @ObfuscatedName("cm.r")
    public ImageConsumer field1416;

    @ObfuscatedName("cm.x(IILjava/awt/Component;I)V")
    public final void method1549(int arg0, int arg1, Component arg2) {
        this.field1429 = arg0;
        this.field1431 = arg1;
        this.field1430 = new int[arg0 * arg1 + 1];
        this.field1417 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1432 = arg2.createImage(this);
        this.method1574();
        arg2.prepareImage(this.field1432, this);
        this.method1574();
        arg2.prepareImage(this.field1432, this);
        this.method1574();
        arg2.prepareImage(this.field1432, this);
        this.method1618();
    }

    @ObfuscatedName("cm.r(Ljava/awt/Graphics;III)V")
    public final void method1550(Graphics arg0, int arg1, int arg2) {
        this.method1574();
        arg0.drawImage(this.field1432, arg1, arg2, this);
    }

    @ObfuscatedName("cm.j(Ljava/awt/Graphics;IIIII)V")
    public final void method1551(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1554(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1432, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1416 = arg0;
        arg0.setDimensions(this.field1429, this.field1431);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1417);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1416 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1416 == arg0) {
            this.field1416 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cm.z(B)V")
    public synchronized void method1574() {
        if (this.field1416 != null) {
            this.field1416.setPixels(0, 0, this.field1429, this.field1431, this.field1417, this.field1430, 0, this.field1429);
            this.field1416.imageComplete(2);
        }
    }

    @ObfuscatedName("cm.i(IIIII)V")
    public synchronized void method1554(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1416 != null) {
            this.field1416.setPixels(arg0, arg1, arg2, arg3, this.field1417, this.field1430, this.field1429 * arg1 + arg0, this.field1429);
            this.field1416.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
