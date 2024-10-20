package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bq")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bq.c")
    public static class77 field1398 = new class77();

    @ObfuscatedName("bq.q")
    public static volatile int field1402 = 0;

    @ObfuscatedName("bq.y")
    public static volatile int field1405 = 0;

    @ObfuscatedName("bq.v")
    public static volatile int field1416 = 0;

    @ObfuscatedName("bq.g")
    public static volatile int field1407 = -1;

    @ObfuscatedName("bq.x")
    public static int field1404 = 0;

    @ObfuscatedName("bq.u")
    public static volatile int field1401 = -1;

    @ObfuscatedName("bq.l")
    public static int field1409 = 0;

    @ObfuscatedName("bq.a")
    public static int field1397 = 0;

    @ObfuscatedName("bq.h")
    public static volatile int field1406 = 0;

    @ObfuscatedName("bq.t")
    public static volatile int field1411 = 0;

    @ObfuscatedName("bq.m")
    public static volatile long field1408 = 0L;

    @ObfuscatedName("bq.s")
    public static int field1403 = 0;

    @ObfuscatedName("bq.j")
    public static int field1410 = 0;

    @ObfuscatedName("bq.b")
    public static int field1413 = 0;

    @ObfuscatedName("bq.n")
    public static long field1412 = 0L;

    @ObfuscatedName("eu.c(Ljava/awt/Component;I)V")
    public static void method2597(Component arg0) {
        arg0.addMouseListener(field1398);
        arg0.addMouseMotionListener(field1398);
        arg0.addFocusListener(field1398);
    }

    @ObfuscatedName("w.y(II)V")
    public static void method202(int arg0) {
        field1402 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1398 != null) {
            field1402 = 0;
            field1406 = arg0.getX();
            field1411 = arg0.getY();
            field1408 = class121.method2119();
            if (arg0.isAltDown()) {
                field1405 = 4;
                field1416 = 4;
            } else if (arg0.isMetaDown()) {
                field1405 = 2;
                field1416 = 2;
            } else {
                field1405 = 1;
                field1416 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1398 != null) {
            field1402 = 0;
            field1416 = 0;
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
        if (field1398 != null) {
            field1402 = 0;
            field1407 = arg0.getX();
            field1401 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1398 != null) {
            field1402 = 0;
            field1407 = -1;
            field1401 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1398 != null) {
            field1402 = 0;
            field1407 = arg0.getX();
            field1401 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1398 != null) {
            field1402 = 0;
            field1407 = arg0.getX();
            field1401 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1398 != null) {
            field1416 = 0;
        }
    }
}
