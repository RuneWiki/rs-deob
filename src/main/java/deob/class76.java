package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("be")
public class class76 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("be.j")
    public static class76 field1387 = new class76();

    @ObfuscatedName("be.y")
    public static volatile int field1380 = 0;

    @ObfuscatedName("be.x")
    public static int field1379 = 0;

    @ObfuscatedName("be.z")
    public static volatile int field1373 = 0;

    @ObfuscatedName("be.c")
    public static volatile int field1381 = 0;

    @ObfuscatedName("be.e")
    public static volatile int field1372 = -1;

    @ObfuscatedName("be.s")
    public static volatile int field1375 = -1;

    @ObfuscatedName("be.i")
    public static int field1377 = 0;

    @ObfuscatedName("be.g")
    public static int field1378 = 0;

    @ObfuscatedName("be.q")
    public static volatile int field1374 = 0;

    @ObfuscatedName("be.w")
    public static volatile int field1376 = 0;

    @ObfuscatedName("be.k")
    public static volatile long field1385 = 0L;

    @ObfuscatedName("be.v")
    public static int field1384 = 0;

    @ObfuscatedName("be.o")
    public static int field1386 = 0;

    @ObfuscatedName("be.m")
    public static int field1383 = 0;

    @ObfuscatedName("be.u")
    public static long field1389 = 0L;

    @ObfuscatedName("bd.j(Ljava/awt/Component;I)V")
    public static void method1379(Component arg0) {
        arg0.removeMouseListener(field1387);
        arg0.removeMouseMotionListener(field1387);
        arg0.removeFocusListener(field1387);
        field1381 = 0;
    }

    @ObfuscatedName("y.y(S)V")
    public static void method9() {
        if (field1387 != null) {
            class76 var0 = field1387;
            synchronized (field1387) {
                field1387 = null;
            }
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1387 != null) {
            field1373 = 0;
            field1374 = arg0.getX();
            field1376 = arg0.getY();
            field1385 = class120.method2616();
            if (arg0.isMetaDown()) {
                field1380 = 2;
                field1381 = 2;
            } else {
                field1380 = 1;
                field1381 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1387 != null) {
            field1373 = 0;
            field1381 = 0;
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
        if (field1387 != null) {
            field1373 = 0;
            field1372 = arg0.getX();
            field1375 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1387 != null) {
            field1373 = 0;
            field1372 = -1;
            field1375 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1387 != null) {
            field1373 = 0;
            field1372 = arg0.getX();
            field1375 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1387 != null) {
            field1373 = 0;
            field1372 = arg0.getX();
            field1375 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1387 != null) {
            field1381 = 0;
        }
    }
}
