package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bm")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bm.j")
    public static class77 field1368 = new class77();

    @ObfuscatedName("bm.r")
    public static volatile int field1380 = 0;

    @ObfuscatedName("bm.v")
    public static volatile int field1370 = 0;

    @ObfuscatedName("bm.p")
    public static volatile int field1371 = -1;

    @ObfuscatedName("bm.e")
    public static volatile int field1372 = -1;

    @ObfuscatedName("bm.d")
    public static int field1369 = 0;

    @ObfuscatedName("bm.y")
    public static volatile int field1376 = 0;

    @ObfuscatedName("bm.x")
    public static int field1375 = 0;

    @ObfuscatedName("bm.t")
    public static int field1382 = 0;

    @ObfuscatedName("bm.i")
    public static volatile int field1377 = 0;

    @ObfuscatedName("bm.z")
    public static volatile int field1378 = 0;

    @ObfuscatedName("bm.o")
    public static volatile long field1379 = 0L;

    @ObfuscatedName("bm.u")
    public static int field1374 = 0;

    @ObfuscatedName("bm.f")
    public static int field1381 = 0;

    @ObfuscatedName("bm.k")
    public static int field1373 = 0;

    @ObfuscatedName("bm.q")
    public static long field1383 = 0L;

    @ObfuscatedName("bw.j(Ljava/awt/Component;I)V")
    public static void method1491(Component arg0) {
        arg0.addMouseListener(field1368);
        arg0.addMouseMotionListener(field1368);
        arg0.addFocusListener(field1368);
    }

    @ObfuscatedName("bs.r(B)V")
    public static void method1371() {
        class77 var0 = field1368;
        synchronized (field1368) {
            field1369 = field1370;
            field1382 = field1371;
            field1375 = field1372;
            field1374 = field1376;
            field1381 = field1377;
            field1373 = field1378;
            field1383 = field1379;
            field1376 = 0;
        }
    }

    @ObfuscatedName("bs.v(I)I")
    public static int method1370() {
        return ++field1380 - 1;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1368 != null) {
            field1380 = 0;
            field1377 = arg0.getX();
            field1378 = arg0.getY();
            field1379 = Statics.method2045();
            if (arg0.isMetaDown()) {
                field1376 = 2;
                field1370 = 2;
            } else {
                field1376 = 1;
                field1370 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1368 != null) {
            field1380 = 0;
            field1370 = 0;
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
        if (field1368 != null) {
            field1380 = 0;
            field1371 = arg0.getX();
            field1372 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1368 != null) {
            field1380 = 0;
            field1371 = -1;
            field1372 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1368 != null) {
            field1380 = 0;
            field1371 = arg0.getX();
            field1372 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1368 != null) {
            field1380 = 0;
            field1371 = arg0.getX();
            field1372 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1368 != null) {
            field1370 = 0;
        }
    }
}
