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

@ObfuscatedName("bg")
public final class class69 extends class71 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bg.t")
    public ColorModel field1262;

    @ObfuscatedName("bg.s")
    public ImageConsumer field1264;

    @ObfuscatedName("bg.t(IILjava/awt/Component;B)V")
    public final void method1352(int arg0, int arg1, Component arg2) {
        this.field1286 = arg0;
        this.field1282 = arg1;
        this.field1281 = new int[arg0 * arg1 + 1];
        this.field1262 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1280 = arg2.createImage(this);
        this.method1328();
        arg2.prepareImage(this.field1280, this);
        this.method1328();
        arg2.prepareImage(this.field1280, this);
        this.method1328();
        arg2.prepareImage(this.field1280, this);
        this.method1391();
    }

    @ObfuscatedName("bg.s(Ljava/awt/Graphics;IIB)V")
    public final void method1330(Graphics arg0, int arg1, int arg2) {
        this.method1328();
        arg0.drawImage(this.field1280, arg1, arg2, this);
    }

    @ObfuscatedName("bg.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method1345(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1340(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1280, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1264 = arg0;
        arg0.setDimensions(this.field1286, this.field1282);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1262);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1264 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1264 == arg0) {
            this.field1264 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bg.e(B)V")
    public synchronized void method1328() {
        if (this.field1264 != null) {
            this.field1264.setPixels(0, 0, this.field1286, this.field1282, this.field1262, this.field1281, 0, this.field1286);
            this.field1264.imageComplete(2);
        }
    }

    @ObfuscatedName("bg.d(IIIII)V")
    public synchronized void method1340(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1264 != null) {
            this.field1264.setPixels(arg0, arg1, arg2, arg3, this.field1262, this.field1281, this.field1286 * arg1 + arg0, this.field1286);
            this.field1264.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
