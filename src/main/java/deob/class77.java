package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bj")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bj.i")
    public static class77 field1414 = new class77();

    @ObfuscatedName("bj.p")
    public static volatile int field1403 = 0;

    @ObfuscatedName("bj.a")
    public static volatile int field1404 = 0;

    @ObfuscatedName("bj.l")
    public static volatile int field1405 = -1;

    @ObfuscatedName("bj.q")
    public static volatile int field1406 = -1;

    @ObfuscatedName("bj.b")
    public static int field1407 = 0;

    @ObfuscatedName("bj.u")
    public static int field1408 = 0;

    @ObfuscatedName("bj.d")
    public static int field1409 = 0;

    @ObfuscatedName("bj.m")
    public static volatile int field1410 = 0;

    @ObfuscatedName("bj.v")
    public static volatile int field1422 = 0;

    @ObfuscatedName("bj.j")
    public static volatile int field1420 = 0;

    @ObfuscatedName("bj.f")
    public static volatile long field1413 = 0L;

    @ObfuscatedName("bj.h")
    public static int field1412 = 0;

    @ObfuscatedName("bj.o")
    public static int field1415 = 0;

    @ObfuscatedName("bj.z")
    public static int field1416 = 0;

    @ObfuscatedName("bj.k")
    public static long field1402 = 0L;

    @ObfuscatedName("cx.i(Ljava/awt/Component;I)V")
    public static void method1977(Component arg0) {
        arg0.addMouseListener(field1414);
        arg0.addMouseMotionListener(field1414);
        arg0.addFocusListener(field1414);
    }

    @ObfuscatedName("am.p(Ljava/awt/Component;I)V")
    public static void method801(Component arg0) {
        arg0.removeMouseListener(field1414);
        arg0.removeMouseMotionListener(field1414);
        arg0.removeFocusListener(field1414);
        field1404 = 0;
    }

    @ObfuscatedName("s.a(II)V")
    public static void method180(int arg0) {
        field1403 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1414 != null) {
            field1403 = 0;
            field1422 = arg0.getX();
            field1420 = arg0.getY();
            field1413 = class121.method2124();
            if (arg0.isMetaDown()) {
                field1410 = 2;
                field1404 = 2;
            } else {
                field1410 = 1;
                field1404 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1414 != null) {
            field1403 = 0;
            field1404 = 0;
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
        if (field1414 != null) {
            field1403 = 0;
            field1405 = arg0.getX();
            field1406 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1414 != null) {
            field1403 = 0;
            field1405 = -1;
            field1406 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1414 != null) {
            field1403 = 0;
            field1405 = arg0.getX();
            field1406 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1414 != null) {
            field1403 = 0;
            field1405 = arg0.getX();
            field1406 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1414 != null) {
            field1404 = 0;
        }
    }
}
