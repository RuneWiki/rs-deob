package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bf")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bf.j")
    public static class77 field1410 = new class77();

    @ObfuscatedName("bf.f")
    public static volatile int field1397 = 0;

    @ObfuscatedName("bf.o")
    public static volatile int field1398 = 0;

    @ObfuscatedName("bf.h")
    public static volatile int field1399 = -1;

    @ObfuscatedName("bf.u")
    public static volatile int field1403 = -1;

    @ObfuscatedName("bf.a")
    public static int field1401 = 0;

    @ObfuscatedName("bf.q")
    public static int field1402 = 0;

    @ObfuscatedName("bf.t")
    public static int field1406 = 0;

    @ObfuscatedName("bf.n")
    public static volatile int field1396 = 0;

    @ObfuscatedName("bf.i")
    public static volatile int field1405 = 0;

    @ObfuscatedName("bf.c")
    public static volatile int field1404 = 0;

    @ObfuscatedName("bf.b")
    public static volatile long field1407 = 0L;

    @ObfuscatedName("bf.m")
    public static int field1412 = 0;

    @ObfuscatedName("bf.g")
    public static int field1409 = 0;

    @ObfuscatedName("bf.x")
    public static int field1408 = 0;

    @ObfuscatedName("bf.r")
    public static long field1411 = 0L;

    @ObfuscatedName("ei.j(II)V")
    public static void method2727(int arg0) {
        field1397 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1410 != null) {
            field1397 = 0;
            field1405 = arg0.getX();
            field1404 = arg0.getY();
            field1407 = class121.method2140();
            if (arg0.isAltDown()) {
                field1396 = 4;
                field1398 = 4;
            } else if (arg0.isMetaDown()) {
                field1396 = 2;
                field1398 = 2;
            } else {
                field1396 = 1;
                field1398 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1410 != null) {
            field1397 = 0;
            field1398 = 0;
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
        if (field1410 != null) {
            field1397 = 0;
            field1399 = arg0.getX();
            field1403 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1410 != null) {
            field1397 = 0;
            field1399 = -1;
            field1403 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1410 != null) {
            field1397 = 0;
            field1399 = arg0.getX();
            field1403 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1410 != null) {
            field1397 = 0;
            field1399 = arg0.getX();
            field1403 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1410 != null) {
            field1398 = 0;
        }
    }
}
