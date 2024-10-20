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

@ObfuscatedName("bu")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bu.b")
    public ColorModel field1273;

    @ObfuscatedName("bu.u")
    public ImageConsumer field1270;

    @ObfuscatedName("bu.b(IILjava/awt/Component;S)V")
    public final void method1342(int arg0, int arg1, Component arg2) {
        this.field1288 = arg0;
        this.field1286 = arg1;
        this.field1291 = new int[arg0 * arg1 + 1];
        this.field1273 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1287 = arg2.createImage(this);
        this.method1358();
        arg2.prepareImage(this.field1287, this);
        this.method1358();
        arg2.prepareImage(this.field1287, this);
        this.method1358();
        arg2.prepareImage(this.field1287, this);
        this.method1420();
    }

    @ObfuscatedName("bu.u(Ljava/awt/Graphics;III)V")
    public final void method1346(Graphics arg0, int arg1, int arg2) {
        this.method1358();
        arg0.drawImage(this.field1287, arg1, arg2, this);
    }

    @ObfuscatedName("bu.x(Ljava/awt/Graphics;IIIII)V")
    public final void method1344(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1347(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1287, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1270 = arg0;
        arg0.setDimensions(this.field1288, this.field1286);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1273);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1270 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1270 == arg0) {
            this.field1270 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bu.j(I)V")
    public synchronized void method1358() {
        if (this.field1270 != null) {
            this.field1270.setPixels(0, 0, this.field1288, this.field1286, this.field1273, this.field1291, 0, this.field1288);
            this.field1270.imageComplete(2);
        }
    }

    @ObfuscatedName("bu.o(IIIIB)V")
    public synchronized void method1347(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1270 != null) {
            this.field1270.setPixels(arg0, arg1, arg2, arg3, this.field1273, this.field1291, this.field1288 * arg1 + arg0, this.field1288);
            this.field1270.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
