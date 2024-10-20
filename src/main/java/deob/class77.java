package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bs")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bs.b")
    public static class77 field1418 = new class77();

    @ObfuscatedName("bs.c")
    public static volatile int field1417 = 0;

    @ObfuscatedName("bs.j")
    public static volatile int field1412 = 0;

    @ObfuscatedName("bs.i")
    public static volatile int field1407 = -1;

    @ObfuscatedName("bs.k")
    public static int field1410 = 0;

    @ObfuscatedName("bs.q")
    public static volatile int field1408 = -1;

    @ObfuscatedName("bs.t")
    public static int field1404 = 0;

    @ObfuscatedName("bs.v")
    public static int field1411 = 0;

    @ObfuscatedName("bs.y")
    public static volatile int field1406 = 0;

    @ObfuscatedName("bs.w")
    public static volatile int field1413 = 0;

    @ObfuscatedName("bs.g")
    public static volatile int field1414 = 0;

    @ObfuscatedName("bs.s")
    public static volatile long field1415 = 0L;

    @ObfuscatedName("bs.n")
    public static int field1425 = 0;

    @ObfuscatedName("bs.x")
    public static int field1421 = 0;

    @ObfuscatedName("bs.o")
    public static int field1416 = 0;

    @ObfuscatedName("bs.l")
    public static long field1419 = 0L;

    @ObfuscatedName("bt.b(B)V")
    public static void method1415() {
        if (field1418 != null) {
            class77 var0 = field1418;
            synchronized (field1418) {
                field1418 = null;
            }
        }
    }

    @ObfuscatedName("ac.c(B)I")
    public static int method691() {
        return ++field1417 - 1;
    }

    @ObfuscatedName("bv.j(II)V")
    public static void method1382(int arg0) {
        field1417 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1418 != null) {
            field1417 = 0;
            field1413 = arg0.getX();
            field1414 = arg0.getY();
            field1415 = class121.method2318();
            if (arg0.isAltDown()) {
                field1406 = 4;
                field1412 = 4;
            } else if (arg0.isMetaDown()) {
                field1406 = 2;
                field1412 = 2;
            } else {
                field1406 = 1;
                field1412 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1418 != null) {
            field1417 = 0;
            field1412 = 0;
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
        if (field1418 != null) {
            field1417 = 0;
            field1407 = arg0.getX();
            field1408 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1418 != null) {
            field1417 = 0;
            field1407 = -1;
            field1408 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1418 != null) {
            field1417 = 0;
            field1407 = arg0.getX();
            field1408 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1418 != null) {
            field1417 = 0;
            field1407 = arg0.getX();
            field1408 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1418 != null) {
            field1412 = 0;
        }
    }
}
