package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bv")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bv.a")
    public static class77 field1369 = new class77();

    @ObfuscatedName("bv.r")
    public static volatile int field1360 = 0;

    @ObfuscatedName("bv.u")
    public static volatile int field1361 = 0;

    @ObfuscatedName("bv.t")
    public static volatile int field1371 = -1;

    @ObfuscatedName("bv.k")
    public static int field1365 = 0;

    @ObfuscatedName("bv.x")
    public static int field1366 = 0;

    @ObfuscatedName("bv.v")
    public static volatile int field1367 = -1;

    @ObfuscatedName("bv.g")
    public static int field1364 = 0;

    @ObfuscatedName("bv.n")
    public static volatile int field1359 = 0;

    @ObfuscatedName("bv.q")
    public static volatile int field1363 = 0;

    @ObfuscatedName("bv.i")
    public static volatile int field1362 = 0;

    @ObfuscatedName("bv.p")
    public static volatile long field1370 = 0L;

    @ObfuscatedName("bv.e")
    public static int field1368 = 0;

    @ObfuscatedName("bv.o")
    public static int field1372 = 0;

    @ObfuscatedName("bv.j")
    public static int field1373 = 0;

    @ObfuscatedName("bv.s")
    public static long field1374 = 0L;

    @ObfuscatedName("cz.a(I)V")
    public static void method1793() {
        if (field1369 != null) {
            class77 var0 = field1369;
            synchronized (field1369) {
                field1369 = null;
            }
        }
    }

    @ObfuscatedName("o.r(I)I")
    public static int method113() {
        return ++field1360 - 1;
    }

    @ObfuscatedName("bo.u(IB)V")
    public static void method1169(int arg0) {
        field1360 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1369 != null) {
            field1360 = 0;
            field1363 = arg0.getX();
            field1362 = arg0.getY();
            field1370 = class121.method1471();
            if (arg0.isMetaDown()) {
                field1359 = 2;
                field1361 = 2;
            } else {
                field1359 = 1;
                field1361 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1369 != null) {
            field1360 = 0;
            field1361 = 0;
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
        if (field1369 != null) {
            field1360 = 0;
            field1371 = arg0.getX();
            field1367 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1369 != null) {
            field1360 = 0;
            field1371 = -1;
            field1367 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1369 != null) {
            field1360 = 0;
            field1371 = arg0.getX();
            field1367 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1369 != null) {
            field1360 = 0;
            field1371 = arg0.getX();
            field1367 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1369 != null) {
            field1361 = 0;
        }
    }
}
