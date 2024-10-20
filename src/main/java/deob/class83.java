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

    @ObfuscatedName("cy.a")
    public ColorModel field1419;

    @ObfuscatedName("cy.r")
    public ImageConsumer field1414;

    @ObfuscatedName("cy.a(IILjava/awt/Component;I)V")
    public final void method1542(int arg0, int arg1, Component arg2) {
        this.field1435 = arg0;
        this.field1439 = arg1;
        this.field1438 = new int[arg0 * arg1 + 1];
        this.field1419 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1437 = arg2.createImage(this);
        this.method1546();
        arg2.prepareImage(this.field1437, this);
        this.method1546();
        arg2.prepareImage(this.field1437, this);
        this.method1546();
        arg2.prepareImage(this.field1437, this);
        this.method1616();
    }

    @ObfuscatedName("cy.r(Ljava/awt/Graphics;IIB)V")
    public final void method1543(Graphics arg0, int arg1, int arg2) {
        this.method1546();
        arg0.drawImage(this.field1437, arg1, arg2, this);
    }

    @ObfuscatedName("cy.u(Ljava/awt/Graphics;IIIII)V")
    public final void method1550(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1547(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field1437, 0, 0, this);
        arg0.setClip(var6);
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1414 = arg0;
        arg0.setDimensions(this.field1435, this.field1439);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1419);
        arg0.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1414 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1414 == arg0) {
            this.field1414 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cy.t(B)V")
    public synchronized void method1546() {
        if (this.field1414 != null) {
            this.field1414.setPixels(0, 0, this.field1435, this.field1439, this.field1419, this.field1438, 0, this.field1435);
            this.field1414.imageComplete(2);
        }
    }

    @ObfuscatedName("cy.k(IIIII)V")
    public synchronized void method1547(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1414 != null) {
            this.field1414.setPixels(arg0, arg1, arg2, arg3, this.field1419, this.field1438, this.field1435 * arg1 + arg0, this.field1435);
            this.field1414.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
