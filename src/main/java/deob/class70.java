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
public final class class70 extends class72 implements ImageProducer, ImageObserver {

    @ObfuscatedName("bd.f")
    public ColorModel field1289;

    @ObfuscatedName("bd.k")
    public ImageConsumer field1291;

    @ObfuscatedName("bd.f(IILjava/awt/Component;I)V")
    public final void method1390(int arg0, int arg1, Component arg2) {
        this.field1305 = arg0;
        this.field1306 = arg1;
        this.field1307 = new int[arg0 * arg1 + 1];
        this.field1289 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1308 = arg2.createImage(this);
        this.method1391();
        arg2.prepareImage(this.field1308, this);
        this.method1391();
        arg2.prepareImage(this.field1308, this);
        this.method1391();
        arg2.prepareImage(this.field1308, this);
        this.method1454();
    }

    @ObfuscatedName("bd.k(Ljava/awt/Graphics;IIB)V")
    public final void method1404(Graphics arg0, int arg1, int arg2) {
        this.method1391();
        arg0.drawImage(this.field1308, arg1, arg2, this);
    }

    @ObfuscatedName("bd.y(Ljava/awt/Graphics;IIIII)V")
    public final void method1399(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1409(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1308, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1291 = arg0;
        arg0.setDimensions(this.field1305, this.field1306);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1289);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1291 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1291 == arg0) {
            this.field1291 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("bd.e(B)V")
    public synchronized void method1391() {
        if (this.field1291 != null) {
            this.field1291.setPixels(0, 0, this.field1305, this.field1306, this.field1289, this.field1307, 0, this.field1305);
            this.field1291.imageComplete(2);
        }
    }

    @ObfuscatedName("bd.r(IIIII)V")
    public synchronized void method1409(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1291 != null) {
            this.field1291.setPixels(arg0, arg1, arg2, arg3, this.field1289, this.field1307, this.field1305 * arg1 + arg0, this.field1305);
            this.field1291.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
