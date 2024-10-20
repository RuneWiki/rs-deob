package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bw")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bw.l")
    public static class77 field1382 = new class77();

    @ObfuscatedName("bw.b")
    public static volatile int field1373 = 0;

    @ObfuscatedName("bw.o")
    public static volatile int field1374 = 0;

    @ObfuscatedName("bw.w")
    public static volatile int field1381 = -1;

    @ObfuscatedName("bw.r")
    public static volatile int field1386 = -1;

    @ObfuscatedName("bw.k")
    public static int field1378 = 0;

    @ObfuscatedName("bw.z")
    public static int field1377 = 0;

    @ObfuscatedName("bw.g")
    public static int field1379 = 0;

    @ObfuscatedName("bw.n")
    public static volatile int field1380 = 0;

    @ObfuscatedName("bw.j")
    public static volatile int field1389 = 0;

    @ObfuscatedName("bw.c")
    public static volatile int field1385 = 0;

    @ObfuscatedName("bw.m")
    public static volatile long field1383 = 0L;

    @ObfuscatedName("bw.a")
    public static int field1384 = 0;

    @ObfuscatedName("bw.e")
    public static int field1372 = 0;

    @ObfuscatedName("bw.q")
    public static int field1376 = 0;

    @ObfuscatedName("bw.y")
    public static long field1387 = 0L;

    @ObfuscatedName("dv.b(I)V")
    public static void method2369() {
        if (field1382 != null) {
            class77 var0 = field1382;
            synchronized (field1382) {
                field1382 = null;
            }
        }
    }

    @ObfuscatedName("dp.o(S)I")
    public static int method2201() {
        return ++field1373 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1382 != null) {
            field1373 = 0;
            field1389 = arg0.getX();
            field1385 = arg0.getY();
            field1383 = class121.method1435();
            if (arg0.isAltDown()) {
                field1380 = 4;
                field1374 = 4;
            } else if (arg0.isMetaDown()) {
                field1380 = 2;
                field1374 = 2;
            } else {
                field1380 = 1;
                field1374 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1382 != null) {
            field1373 = 0;
            field1374 = 0;
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
        if (field1382 != null) {
            field1373 = 0;
            field1381 = arg0.getX();
            field1386 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1382 != null) {
            field1373 = 0;
            field1381 = -1;
            field1386 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1382 != null) {
            field1373 = 0;
            field1381 = arg0.getX();
            field1386 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1382 != null) {
            field1373 = 0;
            field1381 = arg0.getX();
            field1386 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1382 != null) {
            field1374 = 0;
        }
    }
}
