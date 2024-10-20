package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bz")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bz.p")
    public static class77 field1401 = new class77();

    @ObfuscatedName("bz.i")
    public static volatile int field1403 = 0;

    @ObfuscatedName("bz.o")
    public static volatile int field1392 = 0;

    @ObfuscatedName("bz.n")
    public static volatile int field1393 = -1;

    @ObfuscatedName("bz.l")
    public static volatile int field1394 = -1;

    @ObfuscatedName("bz.v")
    public static int field1390 = 0;

    @ObfuscatedName("bz.g")
    public static int field1397 = 0;

    @ObfuscatedName("bz.x")
    public static int field1391 = 0;

    @ObfuscatedName("bz.c")
    public static volatile int field1398 = 0;

    @ObfuscatedName("bz.f")
    public static volatile int field1399 = 0;

    @ObfuscatedName("bz.r")
    public static volatile int field1400 = 0;

    @ObfuscatedName("bz.d")
    public static volatile long field1406 = 0L;

    @ObfuscatedName("bz.a")
    public static int field1402 = 0;

    @ObfuscatedName("bz.q")
    public static int field1395 = 0;

    @ObfuscatedName("bz.u")
    public static int field1404 = 0;

    @ObfuscatedName("bz.w")
    public static long field1396 = 0L;

    @ObfuscatedName("dr.p(I)V")
    public static void method2226() {
        if (field1401 != null) {
            class77 var0 = field1401;
            synchronized (field1401) {
                field1401 = null;
            }
        }
    }

    @ObfuscatedName("f.i(I)I")
    public static int method120() {
        return ++field1403 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1401 != null) {
            field1403 = 0;
            field1399 = arg0.getX();
            field1400 = arg0.getY();
            field1406 = class121.method711();
            if (arg0.isMetaDown()) {
                field1398 = 2;
                field1392 = 2;
            } else {
                field1398 = 1;
                field1392 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1401 != null) {
            field1403 = 0;
            field1392 = 0;
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
            field1403 = 0;
            field1393 = arg0.getX();
            field1394 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1401 != null) {
            field1403 = 0;
            field1393 = -1;
            field1394 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1401 != null) {
            field1403 = 0;
            field1393 = arg0.getX();
            field1394 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1401 != null) {
            field1403 = 0;
            field1393 = arg0.getX();
            field1394 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1401 != null) {
            field1392 = 0;
        }
    }
}
