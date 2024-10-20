package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bu")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bu.y")
    public static volatile int field1394 = 0;

    @ObfuscatedName("bu.m")
    public static class77 field1392 = new class77();

    @ObfuscatedName("bu.d")
    public static volatile int field1387 = 0;

    @ObfuscatedName("bu.k")
    public static int field1401 = 0;

    @ObfuscatedName("bu.n")
    public static volatile int field1388 = 0;

    @ObfuscatedName("bu.s")
    public static volatile int field1397 = -1;

    @ObfuscatedName("bu.x")
    public static int field1393 = 0;

    @ObfuscatedName("bu.b")
    public static volatile int field1390 = -1;

    @ObfuscatedName("bu.j")
    public static int field1391 = 0;

    @ObfuscatedName("bu.p")
    public static volatile int field1395 = 0;

    @ObfuscatedName("bu.l")
    public static volatile int field1396 = 0;

    @ObfuscatedName("bu.i")
    public static volatile long field1403 = 0L;

    @ObfuscatedName("bu.r")
    public static int field1402 = 0;

    @ObfuscatedName("bu.o")
    public static int field1399 = 0;

    @ObfuscatedName("bu.c")
    public static int field1400 = 0;

    @ObfuscatedName("bu.f")
    public static long field1386 = 0L;

    @ObfuscatedName("ca.y(Ljava/awt/Component;I)V")
    public static void method1680(Component arg0) {
        arg0.addMouseListener(field1392);
        arg0.addMouseMotionListener(field1392);
        arg0.addFocusListener(field1392);
    }

    @ObfuscatedName("ab.m(I)V")
    public static void method826() {
        if (field1392 != null) {
            class77 var0 = field1392;
            synchronized (field1392) {
                field1392 = null;
            }
        }
    }

    @ObfuscatedName("cf.d(I)I")
    public static int method2055() {
        return ++field1387 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1392 != null) {
            field1387 = 0;
            field1395 = arg0.getX();
            field1396 = arg0.getY();
            field1403 = class121.method1389();
            if (arg0.isMetaDown()) {
                field1394 = 2;
                field1388 = 2;
            } else {
                field1394 = 1;
                field1388 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1392 != null) {
            field1387 = 0;
            field1388 = 0;
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
        if (field1392 != null) {
            field1387 = 0;
            field1397 = arg0.getX();
            field1390 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1392 != null) {
            field1387 = 0;
            field1397 = -1;
            field1390 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1392 != null) {
            field1387 = 0;
            field1397 = arg0.getX();
            field1390 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1392 != null) {
            field1387 = 0;
            field1397 = arg0.getX();
            field1390 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1392 != null) {
            field1388 = 0;
        }
    }
}
