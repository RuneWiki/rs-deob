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

@ObfuscatedName("cy")
public final class class82 extends class84 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cy.c")
    public ColorModel field1408;

    @ObfuscatedName("cy.j")
    public ImageConsumer field1404;

    @ObfuscatedName("cy.c(IILjava/awt/Component;S)V")
    public final void method1534(int arg0, int arg1, Component arg2) {
        this.field1428 = arg0;
        this.field1427 = arg1;
        this.field1433 = new int[arg0 * arg1 + 1];
        this.field1408 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1430 = arg2.createImage(this);
        this.method1549();
        arg2.prepareImage(this.field1430, this);
        this.method1549();
        arg2.prepareImage(this.field1430, this);
        this.method1549();
        arg2.prepareImage(this.field1430, this);
        this.method1591();
    }

    @ObfuscatedName("cy.j(Ljava/awt/Graphics;IIB)V")
    public final void method1551(Graphics arg0, int arg1, int arg2) {
        this.method1549();
        arg0.drawImage(this.field1430, arg1, arg2, this);
    }

    @ObfuscatedName("cy.f(Ljava/awt/Graphics;IIIIB)V")
    public final void method1525(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1528(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1430, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1404 = arg0;
        arg0.setDimensions(this.field1428, this.field1427);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1408);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1404 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1404 == arg0) {
            this.field1404 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cy.y(I)V")
    public synchronized void method1549() {
        if (this.field1404 != null) {
            this.field1404.setPixels(0, 0, this.field1428, this.field1427, this.field1408, this.field1433, 0, this.field1428);
            this.field1404.imageComplete(2);
        }
    }

    @ObfuscatedName("cy.x(IIIII)V")
    public synchronized void method1528(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1404 != null) {
            this.field1404.setPixels(arg0, arg1, arg2, arg3, this.field1408, this.field1433, this.field1428 * arg1 + arg0, this.field1428);
            this.field1404.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
