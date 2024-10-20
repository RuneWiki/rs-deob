package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bh")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bh.i")
    public static class77 field1386 = new class77();

    @ObfuscatedName("bh.v")
    public static volatile int field1391 = 0;

    @ObfuscatedName("bh.m")
    public static volatile int field1401 = 0;

    @ObfuscatedName("bh.j")
    public static volatile int field1389 = -1;

    @ObfuscatedName("bh.o")
    public static volatile int field1390 = -1;

    @ObfuscatedName("bh.l")
    public static int field1397 = 0;

    @ObfuscatedName("bh.g")
    public static int field1392 = 0;

    @ObfuscatedName("bh.w")
    public static int field1393 = 0;

    @ObfuscatedName("bh.c")
    public static volatile int field1394 = 0;

    @ObfuscatedName("bh.z")
    public static volatile int field1395 = 0;

    @ObfuscatedName("bh.f")
    public static volatile int field1396 = 0;

    @ObfuscatedName("bh.a")
    public static volatile long field1388 = 0L;

    @ObfuscatedName("bh.d")
    public static int field1398 = 0;

    @ObfuscatedName("bh.e")
    public static int field1399 = 0;

    @ObfuscatedName("bh.y")
    public static int field1387 = 0;

    @ObfuscatedName("bh.k")
    public static long field1400 = 0L;

    @ObfuscatedName("bg.i(Ljava/awt/Component;I)V")
    public static void method1400(Component arg0) {
        arg0.removeMouseListener(field1386);
        arg0.removeMouseMotionListener(field1386);
        arg0.removeFocusListener(field1386);
        field1401 = 0;
    }

    @ObfuscatedName("u.v(I)I")
    public static int method226() {
        return ++field1391 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1386 != null) {
            field1391 = 0;
            field1395 = arg0.getX();
            field1396 = arg0.getY();
            field1388 = class121.method142();
            if (arg0.isMetaDown()) {
                field1394 = 2;
                field1401 = 2;
            } else {
                field1394 = 1;
                field1401 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1386 != null) {
            field1391 = 0;
            field1401 = 0;
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
        if (field1386 != null) {
            field1391 = 0;
            field1389 = arg0.getX();
            field1390 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1386 != null) {
            field1391 = 0;
            field1389 = -1;
            field1390 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1386 != null) {
            field1391 = 0;
            field1389 = arg0.getX();
            field1390 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1386 != null) {
            field1391 = 0;
            field1389 = arg0.getX();
            field1390 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1386 != null) {
            field1401 = 0;
        }
    }
}
