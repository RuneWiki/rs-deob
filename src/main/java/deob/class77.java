package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bz")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bz.b")
    public static class77 field1373 = new class77();

    @ObfuscatedName("bz.e")
    public static volatile int field1374 = 0;

    @ObfuscatedName("bz.g")
    public static volatile int field1375 = 0;

    @ObfuscatedName("bz.o")
    public static volatile int field1387 = -1;

    @ObfuscatedName("bz.a")
    public static volatile int field1376 = -1;

    @ObfuscatedName("bz.h")
    public static int field1378 = 0;

    @ObfuscatedName("bz.j")
    public static int field1379 = 0;

    @ObfuscatedName("bz.f")
    public static int field1380 = 0;

    @ObfuscatedName("bz.q")
    public static volatile int field1377 = 0;

    @ObfuscatedName("bz.l")
    public static volatile int field1382 = 0;

    @ObfuscatedName("bz.d")
    public static volatile int field1383 = 0;

    @ObfuscatedName("bz.z")
    public static volatile long field1390 = 0L;

    @ObfuscatedName("bz.n")
    public static int field1385 = 0;

    @ObfuscatedName("bz.t")
    public static int field1386 = 0;

    @ObfuscatedName("bz.w")
    public static int field1381 = 0;

    @ObfuscatedName("bz.r")
    public static long field1388 = 0L;

    @ObfuscatedName("u.b(Ljava/awt/Component;I)V")
    public static void method233(Component arg0) {
        arg0.removeMouseListener(field1373);
        arg0.removeMouseMotionListener(field1373);
        arg0.removeFocusListener(field1373);
        field1375 = 0;
    }

    @ObfuscatedName("di.e(II)V")
    public static void method2199(int arg0) {
        field1374 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1373 != null) {
            field1374 = 0;
            field1382 = arg0.getX();
            field1383 = arg0.getY();
            field1390 = class121.method2221();
            if (arg0.isAltDown()) {
                field1377 = 4;
                field1375 = 4;
            } else if (arg0.isMetaDown()) {
                field1377 = 2;
                field1375 = 2;
            } else {
                field1377 = 1;
                field1375 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1373 != null) {
            field1374 = 0;
            field1375 = 0;
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
        if (field1373 != null) {
            field1374 = 0;
            field1387 = arg0.getX();
            field1376 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1373 != null) {
            field1374 = 0;
            field1387 = -1;
            field1376 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1373 != null) {
            field1374 = 0;
            field1387 = arg0.getX();
            field1376 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1373 != null) {
            field1374 = 0;
            field1387 = arg0.getX();
            field1376 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1373 != null) {
            field1375 = 0;
        }
    }
}
