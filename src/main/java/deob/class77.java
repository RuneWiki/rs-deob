package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bi")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bi.i")
    public static class77 field1401 = new class77();

    @ObfuscatedName("bi.w")
    public static volatile int field1386 = 0;

    @ObfuscatedName("bi.f")
    public static volatile int field1387 = 0;

    @ObfuscatedName("bi.e")
    public static volatile int field1388 = -1;

    @ObfuscatedName("bi.t")
    public static volatile int field1397 = -1;

    @ObfuscatedName("bi.d")
    public static int field1389 = 0;

    @ObfuscatedName("bi.p")
    public static int field1391 = 0;

    @ObfuscatedName("bi.k")
    public static int field1396 = 0;

    @ObfuscatedName("bi.r")
    public static volatile int field1399 = 0;

    @ObfuscatedName("bi.l")
    public static volatile int field1394 = 0;

    @ObfuscatedName("bi.a")
    public static volatile int field1395 = 0;

    @ObfuscatedName("bi.z")
    public static volatile long field1392 = 0L;

    @ObfuscatedName("bi.s")
    public static int field1390 = 0;

    @ObfuscatedName("bi.m")
    public static int field1398 = 0;

    @ObfuscatedName("bi.u")
    public static int field1385 = 0;

    @ObfuscatedName("bi.g")
    public static long field1400 = 0L;

    @ObfuscatedName("cq.w(Ljava/awt/Component;I)V")
    public static void method1578(Component arg0) {
        arg0.removeMouseListener(field1401);
        arg0.removeMouseMotionListener(field1401);
        arg0.removeFocusListener(field1401);
        field1387 = 0;
    }

    @ObfuscatedName("i.f(I)V")
    public static void method3() {
        if (field1401 != null) {
            class77 var0 = field1401;
            synchronized (field1401) {
                field1401 = null;
            }
        }
    }

    @ObfuscatedName("e.e(I)I")
    public static int method29() {
        return ++field1386 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1401 != null) {
            field1386 = 0;
            field1394 = arg0.getX();
            field1395 = arg0.getY();
            field1392 = class121.method145();
            if (arg0.isMetaDown()) {
                field1399 = 2;
                field1387 = 2;
            } else {
                field1399 = 1;
                field1387 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1401 != null) {
            field1386 = 0;
            field1387 = 0;
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
        if (field1401 != null) {
            field1386 = 0;
            field1388 = arg0.getX();
            field1397 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1401 != null) {
            field1386 = 0;
            field1388 = -1;
            field1397 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1401 != null) {
            field1386 = 0;
            field1388 = arg0.getX();
            field1397 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1401 != null) {
            field1386 = 0;
            field1388 = arg0.getX();
            field1397 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1401 != null) {
            field1387 = 0;
        }
    }
}
