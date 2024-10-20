package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bw")
public class class78 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bw.i")
    public static class78 field1409 = new class78();

    @ObfuscatedName("bw.b")
    public static volatile int field1413 = 0;

    @ObfuscatedName("bw.r")
    public static volatile int field1423 = 0;

    @ObfuscatedName("bw.l")
    public static volatile int field1407 = -1;

    @ObfuscatedName("bw.s")
    public static volatile int field1408 = -1;

    @ObfuscatedName("bw.d")
    public static int field1419 = 0;

    @ObfuscatedName("bw.e")
    public static int field1410 = 0;

    @ObfuscatedName("bw.u")
    public static int field1411 = 0;

    @ObfuscatedName("bw.q")
    public static volatile int field1412 = 0;

    @ObfuscatedName("bw.o")
    public static volatile int field1405 = 0;

    @ObfuscatedName("bw.v")
    public static volatile int field1414 = 0;

    @ObfuscatedName("bw.m")
    public static volatile long field1415 = 0L;

    @ObfuscatedName("bw.x")
    public static int field1416 = 0;

    @ObfuscatedName("bw.w")
    public static int field1417 = 0;

    @ObfuscatedName("bw.p")
    public static int field1418 = 0;

    @ObfuscatedName("bw.z")
    public static long field1420 = 0L;

    @ObfuscatedName("ch.i(Ljava/awt/Component;I)V")
    public static void method1605(Component arg0) {
        arg0.addMouseListener(field1409);
        arg0.addMouseMotionListener(field1409);
        arg0.addFocusListener(field1409);
    }

    @ObfuscatedName("w.b(Ljava/awt/Component;B)V")
    public static void method151(Component arg0) {
        arg0.removeMouseListener(field1409);
        arg0.removeMouseMotionListener(field1409);
        arg0.removeFocusListener(field1409);
        field1423 = 0;
    }

    @ObfuscatedName("l.r(I)V")
    public static void method28() {
        class78 var0 = field1409;
        synchronized (field1409) {
            field1419 = field1423;
            field1410 = field1407;
            field1411 = field1408;
            field1416 = field1412;
            field1417 = field1405;
            field1418 = field1414;
            field1420 = field1415;
            field1412 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1409 != null) {
            field1413 = 0;
            field1405 = arg0.getX();
            field1414 = arg0.getY();
            field1415 = class122.method195();
            if (arg0.isAltDown()) {
                field1412 = 4;
                field1423 = 4;
            } else if (arg0.isMetaDown()) {
                field1412 = 2;
                field1423 = 2;
            } else {
                field1412 = 1;
                field1423 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1409 != null) {
            field1413 = 0;
            field1423 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (field1409 != null) {
            field1413 = 0;
            field1407 = arg0.getX();
            field1408 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1409 != null) {
            field1413 = 0;
            field1407 = -1;
            field1408 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1409 != null) {
            field1413 = 0;
            field1407 = arg0.getX();
            field1408 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1409 != null) {
            field1413 = 0;
            field1407 = arg0.getX();
            field1408 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1409 != null) {
            field1423 = 0;
        }
    }
}
