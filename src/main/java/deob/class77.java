package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bv")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bv.g")
    public static class77 field1380 = new class77();

    @ObfuscatedName("bv.h")
    public static volatile int field1379 = 0;

    @ObfuscatedName("bv.s")
    public static volatile int field1368 = 0;

    @ObfuscatedName("bv.o")
    public static volatile int field1376 = -1;

    @ObfuscatedName("bv.p")
    public static volatile int field1372 = -1;

    @ObfuscatedName("bv.x")
    public static int field1375 = 0;

    @ObfuscatedName("bv.k")
    public static int field1374 = 0;

    @ObfuscatedName("bv.r")
    public static int field1373 = 0;

    @ObfuscatedName("bv.z")
    public static volatile int field1377 = 0;

    @ObfuscatedName("bv.n")
    public static volatile int field1370 = 0;

    @ObfuscatedName("bv.j")
    public static volatile int field1378 = 0;

    @ObfuscatedName("bv.b")
    public static volatile long field1371 = 0L;

    @ObfuscatedName("bv.t")
    public static int field1369 = 0;

    @ObfuscatedName("bv.q")
    public static int field1381 = 0;

    @ObfuscatedName("bv.e")
    public static int field1382 = 0;

    @ObfuscatedName("bv.l")
    public static long field1383 = 0L;

    @ObfuscatedName("bi.g(Ljava/awt/Component;I)V")
    public static void method1488(Component arg0) {
        arg0.addMouseListener(field1380);
        arg0.addMouseMotionListener(field1380);
        arg0.addFocusListener(field1380);
    }

    @ObfuscatedName("h.h(I)V")
    public static void method12() {
        class77 var0 = field1380;
        synchronized (field1380) {
            field1373 = field1368;
            field1374 = field1376;
            field1375 = field1372;
            field1369 = field1377;
            field1381 = field1370;
            field1382 = field1378;
            field1383 = field1371;
            field1377 = 0;
        }
    }

    @ObfuscatedName("k.s(I)I")
    public static int method60() {
        return ++field1379 - 1;
    }

    @ObfuscatedName("dl.o(II)V")
    public static void method2250(int arg0) {
        field1379 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1380 != null) {
            field1379 = 0;
            field1370 = arg0.getX();
            field1378 = arg0.getY();
            field1371 = class121.method226();
            if (arg0.isAltDown()) {
                field1377 = 4;
                field1368 = 4;
            } else if (arg0.isMetaDown()) {
                field1377 = 2;
                field1368 = 2;
            } else {
                field1377 = 1;
                field1368 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1380 != null) {
            field1379 = 0;
            field1368 = 0;
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
        if (field1380 != null) {
            field1379 = 0;
            field1376 = arg0.getX();
            field1372 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1380 != null) {
            field1379 = 0;
            field1376 = -1;
            field1372 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1380 != null) {
            field1379 = 0;
            field1376 = arg0.getX();
            field1372 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1380 != null) {
            field1379 = 0;
            field1376 = arg0.getX();
            field1372 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1380 != null) {
            field1368 = 0;
        }
    }
}
