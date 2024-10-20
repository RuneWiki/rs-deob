package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bp")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bp.a")
    public static class77 field1405 = new class77();

    @ObfuscatedName("bp.x")
    public static int field1395 = 0;

    @ObfuscatedName("bp.e")
    public static volatile int field1393 = 0;

    @ObfuscatedName("bp.r")
    public static volatile int field1394 = 0;

    @ObfuscatedName("bp.p")
    public static volatile int field1392 = -1;

    @ObfuscatedName("bp.n")
    public static volatile int field1396 = -1;

    @ObfuscatedName("bp.o")
    public static int field1397 = 0;

    @ObfuscatedName("bp.l")
    public static int field1398 = 0;

    @ObfuscatedName("bp.t")
    public static volatile int field1404 = 0;

    @ObfuscatedName("bp.q")
    public static volatile int field1401 = 0;

    @ObfuscatedName("bp.c")
    public static volatile int field1402 = 0;

    @ObfuscatedName("bp.z")
    public static volatile long field1403 = 0L;

    @ObfuscatedName("bp.s")
    public static int field1410 = 0;

    @ObfuscatedName("bp.h")
    public static int field1399 = 0;

    @ObfuscatedName("bp.f")
    public static int field1400 = 0;

    @ObfuscatedName("bp.w")
    public static long field1407 = 0L;

    @ObfuscatedName("ay.a(S)V")
    public static void method571() {
        if (field1405 != null) {
            class77 var0 = field1405;
            synchronized (field1405) {
                field1405 = null;
            }
        }
    }

    @ObfuscatedName("bb.x(IB)V")
    public static void method1350(int arg0) {
        field1393 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1405 != null) {
            field1393 = 0;
            field1401 = arg0.getX();
            field1402 = arg0.getY();
            field1403 = class121.method245();
            if (arg0.isMetaDown()) {
                field1404 = 2;
                field1394 = 2;
            } else {
                field1404 = 1;
                field1394 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1405 != null) {
            field1393 = 0;
            field1394 = 0;
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
        if (field1405 != null) {
            field1393 = 0;
            field1392 = arg0.getX();
            field1396 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1405 != null) {
            field1393 = 0;
            field1392 = -1;
            field1396 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1405 != null) {
            field1393 = 0;
            field1392 = arg0.getX();
            field1396 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1405 != null) {
            field1393 = 0;
            field1392 = arg0.getX();
            field1396 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1405 != null) {
            field1394 = 0;
        }
    }
}
