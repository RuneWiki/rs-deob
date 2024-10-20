package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bf")
public class class76 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bf.z")
    public static class76 field1396 = new class76();

    @ObfuscatedName("bf.h")
    public static volatile int field1395 = 0;

    @ObfuscatedName("bf.c")
    public static volatile int field1392 = 0;

    @ObfuscatedName("bf.p")
    public static volatile int field1386 = -1;

    @ObfuscatedName("bf.i")
    public static volatile int field1387 = -1;

    @ObfuscatedName("bf.v")
    public static int field1383 = 0;

    @ObfuscatedName("bf.l")
    public static int field1389 = 0;

    @ObfuscatedName("bf.m")
    public static int field1390 = 0;

    @ObfuscatedName("bf.g")
    public static volatile int field1391 = 0;

    @ObfuscatedName("bf.t")
    public static volatile int field1384 = 0;

    @ObfuscatedName("bf.o")
    public static volatile int field1388 = 0;

    @ObfuscatedName("bf.b")
    public static volatile long field1394 = 0L;

    @ObfuscatedName("bf.d")
    public static int field1385 = 0;

    @ObfuscatedName("bf.k")
    public static int field1393 = 0;

    @ObfuscatedName("bf.f")
    public static int field1397 = 0;

    @ObfuscatedName("bf.e")
    public static long field1398 = 0L;

    @ObfuscatedName("bg.z(S)V")
    public static void method1380() {
        class76 var0 = field1396;
        synchronized (field1396) {
            field1383 = field1392;
            field1389 = field1386;
            field1390 = field1387;
            field1385 = field1391;
            field1393 = field1384;
            field1397 = field1388;
            field1398 = field1394 * -6017793748482482201L;
            field1391 = 0;
        }
    }

    @ObfuscatedName("d.h(I)I")
    public static int method129() {
        return ++field1395 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1396 != null) {
            field1395 = 0;
            field1384 = arg0.getX();
            field1388 = arg0.getY();
            field1394 = class120.method228();
            if (arg0.isMetaDown()) {
                field1391 = 2;
                field1392 = 2;
            } else {
                field1391 = 1;
                field1392 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1396 != null) {
            field1395 = 0;
            field1392 = 0;
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
            field1395 = 0;
            field1386 = arg0.getX();
            field1387 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1396 != null) {
            field1395 = 0;
            field1386 = -1;
            field1387 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1396 != null) {
            field1395 = 0;
            field1386 = arg0.getX();
            field1387 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1396 != null) {
            field1395 = 0;
            field1386 = arg0.getX();
            field1387 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1396 != null) {
            field1392 = 0;
        }
    }
}
