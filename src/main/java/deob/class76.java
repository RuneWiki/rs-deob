package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ba")
public class class76 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ba.v")
    public static class76 field1379 = new class76();

    @ObfuscatedName("ba.f")
    public static volatile int field1377 = 0;

    @ObfuscatedName("ba.n")
    public static volatile int field1365 = 0;

    @ObfuscatedName("ba.c")
    public static volatile int field1366 = -1;

    @ObfuscatedName("ba.r")
    public static volatile int field1367 = -1;

    @ObfuscatedName("ba.k")
    public static int field1376 = 0;

    @ObfuscatedName("ba.e")
    public static int field1369 = 0;

    @ObfuscatedName("ba.q")
    public static int field1370 = 0;

    @ObfuscatedName("ba.u")
    public static volatile int field1371 = 0;

    @ObfuscatedName("ba.s")
    public static volatile int field1372 = 0;

    @ObfuscatedName("ba.l")
    public static volatile int field1373 = 0;

    @ObfuscatedName("ba.o")
    public static volatile long field1363 = 0L;

    @ObfuscatedName("ba.h")
    public static int field1375 = 0;

    @ObfuscatedName("ba.p")
    public static int field1382 = 0;

    @ObfuscatedName("ba.d")
    public static int field1380 = 0;

    @ObfuscatedName("ba.m")
    public static long field1378 = 0L;

    @ObfuscatedName("client.v(Ljava/awt/Component;B)V")
    public static void method344(Component arg0) {
        arg0.addMouseListener(field1379);
        arg0.addMouseMotionListener(field1379);
        arg0.addFocusListener(field1379);
    }

    @ObfuscatedName("ds.f(Ljava/awt/Component;I)V")
    public static void method2232(Component arg0) {
        arg0.removeMouseListener(field1379);
        arg0.removeMouseMotionListener(field1379);
        arg0.removeFocusListener(field1379);
        field1365 = 0;
    }

    @ObfuscatedName("bm.n(I)I")
    public static int method1444() {
        return ++field1377 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1379 != null) {
            field1377 = 0;
            field1372 = arg0.getX();
            field1373 = arg0.getY();
            field1363 = class120.method1383();
            if (arg0.isMetaDown()) {
                field1371 = 2;
                field1365 = 2;
            } else {
                field1371 = 1;
                field1365 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1379 != null) {
            field1377 = 0;
            field1365 = 0;
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
        if (field1379 != null) {
            field1377 = 0;
            field1366 = arg0.getX();
            field1367 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1379 != null) {
            field1377 = 0;
            field1366 = -1;
            field1367 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1379 != null) {
            field1377 = 0;
            field1366 = arg0.getX();
            field1367 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1379 != null) {
            field1377 = 0;
            field1366 = arg0.getX();
            field1367 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1379 != null) {
            field1365 = 0;
        }
    }
}
