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

    @ObfuscatedName("bd.g")
    public ColorModel field1277;

    @ObfuscatedName("bd.s")
    public ImageConsumer field1274;

    @ObfuscatedName("bd.g(IILjava/awt/Component;I)V")
    public final void method1317(int arg0, int arg1, Component arg2) {
        this.field1292 = arg0;
        this.field1293 = arg1;
        this.field1299 = new int[arg0 * arg1 + 1];
        this.field1277 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1294 = arg2.createImage(this);
        this.method1320();
        arg2.prepareImage(this.field1294, this);
        this.method1320();
        arg2.prepareImage(this.field1294, this);
        this.method1320();
        arg2.prepareImage(this.field1294, this);
        this.method1379();
    }

    @ObfuscatedName("bd.s(Ljava/awt/Graphics;III)V")
    public final void method1318(Graphics arg0, int arg1, int arg2) {
        this.method1320();
        arg0.drawImage(this.field1294, arg1, arg2, this);
    }

    @ObfuscatedName("bd.v(Ljava/awt/Graphics;IIIII)V")
    public final void method1322(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1346(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1294, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1274 = arg0;
        arg0.setDimensions(this.field1292, this.field1293);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1277);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1274 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1274 == arg0) {
            this.field1274 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bd.o(B)V")
    public synchronized void method1320() {
        if (this.field1274 != null) {
            this.field1274.setPixels(0, 0, this.field1292, this.field1293, this.field1277, this.field1299, 0, this.field1292);
            this.field1274.imageComplete(2);
        }
    }

    @ObfuscatedName("bd.k(IIIIB)V")
    public synchronized void method1346(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1274 != null) {
            this.field1274.setPixels(arg0, arg1, arg2, arg3, this.field1277, this.field1299, this.field1292 * arg1 + arg0, this.field1292);
            this.field1274.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
