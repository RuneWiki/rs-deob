package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bd")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bd.t")
    public static class77 field1416 = new class77();

    @ObfuscatedName("bd.l")
    public static volatile int field1437 = 0;

    @ObfuscatedName("bd.c")
    public static volatile int field1417 = 0;

    @ObfuscatedName("bd.d")
    public static volatile int field1418 = -1;

    @ObfuscatedName("bd.b")
    public static volatile int field1415 = -1;

    @ObfuscatedName("bd.i")
    public static int field1420 = 0;

    @ObfuscatedName("bd.p")
    public static int field1419 = 0;

    @ObfuscatedName("bd.y")
    public static volatile int field1423 = 0;

    @ObfuscatedName("bd.u")
    public static int field1422 = 0;

    @ObfuscatedName("bd.z")
    public static volatile int field1424 = 0;

    @ObfuscatedName("bd.j")
    public static volatile int field1434 = 0;

    @ObfuscatedName("bd.h")
    public static volatile long field1426 = 0L;

    @ObfuscatedName("bd.x")
    public static int field1439 = 0;

    @ObfuscatedName("bd.q")
    public static int field1428 = 0;

    @ObfuscatedName("bd.w")
    public static int field1429 = 0;

    @ObfuscatedName("bd.k")
    public static long field1430 = 0L;

    @ObfuscatedName("m.t(Ljava/awt/Component;I)V")
    public static void method226(Component arg0) {
        arg0.addMouseListener(field1416);
        arg0.addMouseMotionListener(field1416);
        arg0.addFocusListener(field1416);
    }

    @ObfuscatedName("m.l(I)V")
    public static void method229() {
        if (field1416 != null) {
            class77 var0 = field1416;
            synchronized (field1416) {
                field1416 = null;
            }
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1416 != null) {
            field1437 = 0;
            field1424 = arg0.getX();
            field1434 = arg0.getY();
            field1426 = class121.method2693();
            if (arg0.isMetaDown()) {
                field1423 = 2;
                field1417 = 2;
            } else {
                field1423 = 1;
                field1417 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1416 != null) {
            field1437 = 0;
            field1417 = 0;
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
        if (field1416 != null) {
            field1437 = 0;
            field1418 = arg0.getX();
            field1415 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1416 != null) {
            field1437 = 0;
            field1418 = -1;
            field1415 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1416 != null) {
            field1437 = 0;
            field1418 = arg0.getX();
            field1415 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1416 != null) {
            field1437 = 0;
            field1418 = arg0.getX();
            field1415 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1416 != null) {
            field1417 = 0;
        }
    }
}
