package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bz")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bz.p")
    public static class77 field1383 = new class77();

    @ObfuscatedName("bz.l")
    public static volatile int field1379 = 0;

    @ObfuscatedName("bz.d")
    public static volatile int field1380 = 0;

    @ObfuscatedName("bz.x")
    public static int field1381 = 0;

    @ObfuscatedName("bz.o")
    public static volatile int field1388 = -1;

    @ObfuscatedName("bz.a")
    public static volatile int field1378 = -1;

    @ObfuscatedName("bz.w")
    public static int field1376 = 0;

    @ObfuscatedName("bz.i")
    public static int field1377 = 0;

    @ObfuscatedName("bz.y")
    public static volatile int field1382 = 0;

    @ObfuscatedName("bz.m")
    public static volatile int field1375 = 0;

    @ObfuscatedName("bz.u")
    public static volatile int field1384 = 0;

    @ObfuscatedName("bz.s")
    public static volatile long field1374 = 0L;

    @ObfuscatedName("bz.e")
    public static int field1386 = 0;

    @ObfuscatedName("bz.r")
    public static int field1387 = 0;

    @ObfuscatedName("bz.n")
    public static int field1385 = 0;

    @ObfuscatedName("bz.g")
    public static long field1389 = 0L;

    @ObfuscatedName("cj.p(Ljava/awt/Component;I)V")
    public static void method1655(Component arg0) {
        arg0.addMouseListener(field1383);
        arg0.addMouseMotionListener(field1383);
        arg0.addFocusListener(field1383);
    }

    @ObfuscatedName("bs.l(IB)V")
    public static void method1599(int arg0) {
        field1379 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1383 != null) {
            field1379 = 0;
            field1375 = arg0.getX();
            field1384 = arg0.getY();
            field1374 = class121.method548();
            if (arg0.isAltDown()) {
                field1382 = 4;
                field1380 = 4;
            } else if (arg0.isMetaDown()) {
                field1382 = 2;
                field1380 = 2;
            } else {
                field1382 = 1;
                field1380 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1383 != null) {
            field1379 = 0;
            field1380 = 0;
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
        if (field1383 != null) {
            field1379 = 0;
            field1388 = arg0.getX();
            field1378 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1383 != null) {
            field1379 = 0;
            field1388 = -1;
            field1378 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1383 != null) {
            field1379 = 0;
            field1388 = arg0.getX();
            field1378 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1383 != null) {
            field1379 = 0;
            field1388 = arg0.getX();
            field1378 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1383 != null) {
            field1380 = 0;
        }
    }
}
