package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bi")
public class class76 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bi.p")
    public static class76 field1396 = new class76();

    @ObfuscatedName("bi.j")
    public static volatile int field1389 = 0;

    @ObfuscatedName("bi.w")
    public static volatile int field1390 = 0;

    @ObfuscatedName("bi.h")
    public static volatile int field1391 = -1;

    @ObfuscatedName("bi.v")
    public static volatile int field1392 = -1;

    @ObfuscatedName("bi.k")
    public static int field1399 = 0;

    @ObfuscatedName("bi.g")
    public static int field1393 = 0;

    @ObfuscatedName("bi.n")
    public static int field1388 = 0;

    @ObfuscatedName("bi.c")
    public static volatile int field1401 = 0;

    @ObfuscatedName("bi.o")
    public static volatile int field1403 = 0;

    @ObfuscatedName("bi.u")
    public static volatile int field1398 = 0;

    @ObfuscatedName("bi.z")
    public static volatile long field1397 = 0L;

    @ObfuscatedName("bi.e")
    public static int field1400 = 0;

    @ObfuscatedName("bi.l")
    public static int field1395 = 0;

    @ObfuscatedName("bi.m")
    public static int field1394 = 0;

    @ObfuscatedName("bi.s")
    public static long field1402 = 0L;

    @ObfuscatedName("n.p(B)V")
    public static void method70() {
        if (field1396 != null) {
            class76 var0 = field1396;
            synchronized (field1396) {
                field1396 = null;
            }
        }
    }

    @ObfuscatedName("bf.j(I)V")
    public static void method1201() {
        class76 var0 = field1396;
        synchronized (field1396) {
            field1393 = field1390;
            field1399 = field1391;
            field1388 = field1392;
            field1400 = field1401;
            field1395 = field1403;
            field1394 = field1398;
            field1402 = field1397;
            field1401 = 0;
        }
    }

    @ObfuscatedName("bf.w(I)I")
    public static int method1194() {
        return ++field1389 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1396 != null) {
            field1389 = 0;
            field1403 = arg0.getX();
            field1398 = arg0.getY();
            field1397 = class120.method1322();
            if (arg0.isMetaDown()) {
                field1401 = 2;
                field1390 = 2;
            } else {
                field1401 = 1;
                field1390 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1396 != null) {
            field1389 = 0;
            field1390 = 0;
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
        if (field1396 != null) {
            field1389 = 0;
            field1391 = arg0.getX();
            field1392 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1396 != null) {
            field1389 = 0;
            field1391 = -1;
            field1392 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1396 != null) {
            field1389 = 0;
            field1391 = arg0.getX();
            field1392 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1396 != null) {
            field1389 = 0;
            field1391 = arg0.getX();
            field1392 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1396 != null) {
            field1390 = 0;
        }
    }
}
