package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bf")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bf.x")
    public static int field1366 = 0;

    @ObfuscatedName("bf.p")
    public static class77 field1361 = new class77();

    @ObfuscatedName("bf.k")
    public static int field1373 = 0;

    @ObfuscatedName("bf.a")
    public static volatile int field1360 = 0;

    @ObfuscatedName("bf.q")
    public static volatile int field1364 = 0;

    @ObfuscatedName("bf.j")
    public static volatile int field1359 = -1;

    @ObfuscatedName("bf.v")
    public static volatile int field1363 = -1;

    @ObfuscatedName("bf.w")
    public static int field1377 = 0;

    @ObfuscatedName("bf.l")
    public static volatile int field1367 = 0;

    @ObfuscatedName("bf.s")
    public static volatile int field1368 = 0;

    @ObfuscatedName("bf.n")
    public static volatile int field1365 = 0;

    @ObfuscatedName("bf.c")
    public static volatile long field1362 = 0L;

    @ObfuscatedName("bf.h")
    public static int field1370 = 0;

    @ObfuscatedName("bf.u")
    public static int field1372 = 0;

    @ObfuscatedName("bf.y")
    public static int field1369 = 0;

    @ObfuscatedName("bf.b")
    public static long field1374 = 0L;

    @ObfuscatedName("j.x(Ljava/awt/Component;B)V")
    public static void method35(Component arg0) {
        arg0.addMouseListener(field1361);
        arg0.addMouseMotionListener(field1361);
        arg0.addFocusListener(field1361);
    }

    @ObfuscatedName("f.p(B)V")
    public static void method203() {
        if (field1361 != null) {
            class77 var0 = field1361;
            synchronized (field1361) {
                field1361 = null;
            }
        }
    }

    @ObfuscatedName("z.k(I)V")
    public static void method222() {
        class77 var0 = field1361;
        synchronized (field1361) {
            field1377 = field1364;
            field1373 = field1359;
            field1366 = field1363;
            field1370 = field1367;
            field1372 = field1368;
            field1369 = field1365;
            field1374 = field1362;
            field1367 = 0;
        }
    }

    @ObfuscatedName("x.a(II)V")
    public static void method1(int arg0) {
        field1360 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1361 != null) {
            field1360 = 0;
            field1368 = arg0.getX();
            field1365 = arg0.getY();
            field1362 = class121.method2636();
            if (arg0.isMetaDown()) {
                field1367 = 2;
                field1364 = 2;
            } else {
                field1367 = 1;
                field1364 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1361 != null) {
            field1360 = 0;
            field1364 = 0;
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
        if (field1361 != null) {
            field1360 = 0;
            field1359 = arg0.getX();
            field1363 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1361 != null) {
            field1360 = 0;
            field1359 = -1;
            field1363 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1361 != null) {
            field1360 = 0;
            field1359 = arg0.getX();
            field1363 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1361 != null) {
            field1360 = 0;
            field1359 = arg0.getX();
            field1363 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1361 != null) {
            field1364 = 0;
        }
    }
}
