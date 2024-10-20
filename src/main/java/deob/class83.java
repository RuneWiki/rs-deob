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
public final class class83 extends class85 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cy.b")
    public ColorModel field1463;

    @ObfuscatedName("cy.c")
    public ImageConsumer field1462;

    @ObfuscatedName("cy.b(IILjava/awt/Component;B)V")
    public final void method1581(int arg0, int arg1, Component arg2) {
        this.field1483 = arg0;
        this.field1482 = arg1;
        this.field1486 = new int[arg0 * arg1 + 1];
        this.field1463 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1485 = arg2.createImage(this);
        this.method1585();
        arg2.prepareImage(this.field1485, this);
        this.method1585();
        arg2.prepareImage(this.field1485, this);
        this.method1585();
        arg2.prepareImage(this.field1485, this);
        this.method1641();
    }

    @ObfuscatedName("cy.c(Ljava/awt/Graphics;IIB)V")
    public final void method1582(Graphics arg0, int arg1, int arg2) {
        this.method1585();
        arg0.drawImage(this.field1485, arg1, arg2, this);
    }

    @ObfuscatedName("cy.j(Ljava/awt/Graphics;IIIII)V")
    public final void method1583(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1592(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1485, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1462 = arg0;
        arg0.setDimensions(this.field1483, this.field1482);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1463);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1462 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1462 == arg0) {
            this.field1462 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cy.i(B)V")
    public synchronized void method1585() {
        if (this.field1462 != null) {
            this.field1462.setPixels(0, 0, this.field1483, this.field1482, this.field1463, this.field1486, 0, this.field1483);
            this.field1462.imageComplete(2);
        }
    }

    @ObfuscatedName("cy.k(IIIIB)V")
    public synchronized void method1592(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1462 != null) {
            this.field1462.setPixels(arg0, arg1, arg2, arg3, this.field1463, this.field1486, this.field1483 * arg1 + arg0, this.field1483);
            this.field1462.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
