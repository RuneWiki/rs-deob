package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bb")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bb.g")
    public static class77 field1395 = new class77();

    @ObfuscatedName("bb.m")
    public static volatile int field1396 = 0;

    @ObfuscatedName("bb.v")
    public static volatile int field1380 = 0;

    @ObfuscatedName("bb.r")
    public static volatile int field1381 = -1;

    @ObfuscatedName("bb.n")
    public static volatile int field1382 = -1;

    @ObfuscatedName("bb.i")
    public static int field1392 = 0;

    @ObfuscatedName("bb.s")
    public static int field1384 = 0;

    @ObfuscatedName("bb.w")
    public static int field1385 = 0;

    @ObfuscatedName("bb.d")
    public static volatile int field1378 = 0;

    @ObfuscatedName("bb.t")
    public static volatile int field1383 = 0;

    @ObfuscatedName("bb.f")
    public static volatile int field1386 = 0;

    @ObfuscatedName("bb.b")
    public static volatile long field1389 = 0L;

    @ObfuscatedName("bb.z")
    public static int field1390 = 0;

    @ObfuscatedName("bb.l")
    public static int field1391 = 0;

    @ObfuscatedName("bb.e")
    public static int field1398 = 0;

    @ObfuscatedName("bb.p")
    public static long field1393 = 0L;

    @ObfuscatedName("p.g(I)V")
    public static void method130() {
        if (field1395 != null) {
            class77 var0 = field1395;
            synchronized (field1395) {
                field1395 = null;
            }
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1395 != null) {
            field1396 = 0;
            field1383 = arg0.getX();
            field1386 = arg0.getY();
            field1389 = class121.method131();
            if (arg0.isMetaDown()) {
                field1378 = 2;
                field1380 = 2;
            } else {
                field1378 = 1;
                field1380 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1395 != null) {
            field1396 = 0;
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
        if (field1395 != null) {
            field1396 = 0;
            field1381 = arg0.getX();
            field1382 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1395 != null) {
            field1396 = 0;
            field1381 = -1;
            field1382 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1395 != null) {
            field1396 = 0;
            field1381 = arg0.getX();
            field1382 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1395 != null) {
            field1396 = 0;
            field1381 = arg0.getX();
            field1382 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1395 != null) {
            field1380 = 0;
        }
    }
}
