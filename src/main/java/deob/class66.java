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
public final class class66 extends class68 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bz.z")
    public ColorModel field1244;

    @ObfuscatedName("bz.n")
    public ImageConsumer field1245;

    @ObfuscatedName("bz.z(IILjava/awt/Component;B)V")
    public final void method1346(int arg0, int arg1, Component arg2) {
        this.field1260 = arg0;
        this.field1259 = arg1;
        this.field1262 = new int[arg0 * arg1 + 1];
        this.field1244 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1261 = arg2.createImage(this);
        this.method1351();
        arg2.prepareImage(this.field1261, this);
        this.method1351();
        arg2.prepareImage(this.field1261, this);
        this.method1351();
        arg2.prepareImage(this.field1261, this);
        this.method1417();
    }

    @ObfuscatedName("bz.n(Ljava/awt/Graphics;IIS)V")
    public final void method1347(Graphics arg0, int arg1, int arg2) {
        this.method1351();
        arg0.drawImage(this.field1261, arg1, arg2, this);
    }

    @ObfuscatedName("bz.u(Ljava/awt/Graphics;IIIII)V")
    public final void method1349(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1352(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1261, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1245 = arg0;
        arg0.setDimensions(this.field1260, this.field1259);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1244);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1245 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1245 == arg0) {
            this.field1245 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bz.t(B)V")
    public synchronized void method1351() {
        if (this.field1245 != null) {
            this.field1245.setPixels(0, 0, this.field1260, this.field1259, this.field1244, this.field1262, 0, this.field1260);
            this.field1245.imageComplete(2);
        }
    }

    @ObfuscatedName("bz.e(IIIII)V")
    public synchronized void method1352(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1245 != null) {
            this.field1245.setPixels(arg0, arg1, arg2, arg3, this.field1244, this.field1262, this.field1260 * arg1 + arg0, this.field1260);
            this.field1245.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
