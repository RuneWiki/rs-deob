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

@ObfuscatedName("cf")
public final class class157 extends class137 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cf.j")
    public ColorModel field2353;

    @ObfuscatedName("cf.p")
    public ImageConsumer field2354;

    @ObfuscatedName("cf.j(IILjava/awt/Component;S)V")
    public final void method2281(int arg0, int arg1, Component arg2) {
        this.field2024 = arg0;
        this.field2027 = arg1;
        this.field2025 = new int[arg0 * arg1 + 1];
        this.field2353 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2026 = arg2.createImage(this);
        this.method2866();
        arg2.prepareImage(this.field2026, this);
        this.method2866();
        arg2.prepareImage(this.field2026, this);
        this.method2866();
        arg2.prepareImage(this.field2026, this);
        this.method2282();
    }

    @ObfuscatedName("cf.p(Ljava/awt/Graphics;III)V")
    public final void method2293(Graphics arg0, int arg1, int arg2) {
        this.method2866();
        arg0.drawImage(this.field2026, arg1, arg2, this);
    }

    @ObfuscatedName("cf.o(Ljava/awt/Graphics;IIIIB)V")
    public final void method2284(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2867(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field2026, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field2354 = arg0;
        arg0.setDimensions(this.field2024, this.field2027);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2353);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field2354 == arg0;
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cf.t(I)V")
    public synchronized void method2866() {
        if (this.field2354 != null) {
            this.field2354.setPixels(0, 0, this.field2024, this.field2027, this.field2353, this.field2025, 0, this.field2024);
            this.field2354.imageComplete(2);
        }
    }

    @ObfuscatedName("cf.h(IIIIS)V")
    public synchronized void method2867(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2354 != null) {
            this.field2354.setPixels(arg0, arg1, arg2, arg3, this.field2353, this.field2025, this.field2024 * arg1 + arg0, this.field2024);
            this.field2354.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2354 == arg0) {
            this.field2354 = null;
        }
    }
}
