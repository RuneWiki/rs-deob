package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bo")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bo.p")
    public static class77 field1390 = new class77();

    @ObfuscatedName("bo.e")
    public static volatile int field1391 = 0;

    @ObfuscatedName("bo.a")
    public static volatile int field1406 = 0;

    @ObfuscatedName("bo.h")
    public static volatile int field1402 = -1;

    @ObfuscatedName("bo.y")
    public static volatile int field1398 = 0;

    @ObfuscatedName("bo.j")
    public static volatile int field1403 = -1;

    @ObfuscatedName("bo.l")
    public static int field1395 = 0;

    @ObfuscatedName("bo.f")
    public static int field1396 = 0;

    @ObfuscatedName("bo.n")
    public static int field1397 = 0;

    @ObfuscatedName("bo.k")
    public static volatile int field1399 = 0;

    @ObfuscatedName("bo.q")
    public static volatile int field1407 = 0;

    @ObfuscatedName("bo.w")
    public static volatile long field1401 = 0L;

    @ObfuscatedName("bo.v")
    public static int field1394 = 0;

    @ObfuscatedName("bo.z")
    public static int field1400 = 0;

    @ObfuscatedName("bo.m")
    public static int field1404 = 0;

    @ObfuscatedName("bo.r")
    public static long field1405 = 0L;

    @ObfuscatedName("ah.p(Ljava/awt/Component;I)V")
    public static void method819(Component arg0) {
        arg0.addMouseListener(field1390);
        arg0.addMouseMotionListener(field1390);
        arg0.addFocusListener(field1390);
    }

    @ObfuscatedName("bj.e(Ljava/awt/Component;B)V")
    public static void method1341(Component arg0) {
        arg0.removeMouseListener(field1390);
        arg0.removeMouseMotionListener(field1390);
        arg0.removeFocusListener(field1390);
        field1406 = 0;
    }

    @ObfuscatedName("ay.a(I)V")
    public static void method899() {
        class77 var0 = field1390;
        synchronized (field1390) {
            field1395 = field1406;
            field1396 = field1402;
            field1397 = field1403;
            field1394 = field1398;
            field1400 = field1399;
            field1404 = field1407;
            field1405 = field1401;
            field1398 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1390 != null) {
            field1391 = 0;
            field1399 = arg0.getX();
            field1407 = arg0.getY();
            field1401 = class121.method2();
            if (arg0.isAltDown()) {
                field1398 = 4;
                field1406 = 4;
            } else if (arg0.isMetaDown()) {
                field1398 = 2;
                field1406 = 2;
            } else {
                field1398 = 1;
                field1406 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1390 != null) {
            field1391 = 0;
            field1406 = 0;
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
        if (field1390 != null) {
            field1391 = 0;
            field1402 = arg0.getX();
            field1403 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1390 != null) {
            field1391 = 0;
            field1402 = -1;
            field1403 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1390 != null) {
            field1391 = 0;
            field1402 = arg0.getX();
            field1403 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1390 != null) {
            field1391 = 0;
            field1402 = arg0.getX();
            field1403 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1390 != null) {
            field1406 = 0;
        }
    }
}
