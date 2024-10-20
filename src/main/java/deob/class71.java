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

@ObfuscatedName("bf")
public final class class71 extends class73 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bf.n")
    public ColorModel field1314;

    @ObfuscatedName("bf.d")
    public ImageConsumer field1309;

    @ObfuscatedName("bf.n(IILjava/awt/Component;I)V")
    public final void method1418(int arg0, int arg1, Component arg2) {
        this.field1332 = arg0;
        this.field1325 = arg1;
        this.field1333 = new int[arg0 * arg1 + 1];
        this.field1314 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1328 = arg2.createImage(this);
        this.method1423();
        arg2.prepareImage(this.field1328, this);
        this.method1423();
        arg2.prepareImage(this.field1328, this);
        this.method1423();
        arg2.prepareImage(this.field1328, this);
        this.method1493();
    }

    @ObfuscatedName("bf.d(Ljava/awt/Graphics;IIB)V")
    public final void method1419(Graphics arg0, int arg1, int arg2) {
        this.method1423();
        arg0.drawImage(this.field1328, arg1, arg2, this);
    }

    @ObfuscatedName("bf.z(Ljava/awt/Graphics;IIIII)V")
    public final void method1422(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1445(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1328, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1309 = arg0;
        arg0.setDimensions(this.field1332, this.field1325);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1314);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1309 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1309 == arg0) {
            this.field1309 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bf.y(I)V")
    public synchronized void method1423() {
        if (this.field1309 != null) {
            this.field1309.setPixels(0, 0, this.field1332, this.field1325, this.field1314, this.field1333, 0, this.field1332);
            this.field1309.imageComplete(2);
        }
    }

    @ObfuscatedName("bf.e(IIIII)V")
    public synchronized void method1445(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1309 != null) {
            this.field1309.setPixels(arg0, arg1, arg2, arg3, this.field1314, this.field1333, this.field1332 * arg1 + arg0, this.field1332);
            this.field1309.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
