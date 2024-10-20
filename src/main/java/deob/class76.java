package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bd")
public class class76 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bd.u")
    public static class76 field1368 = new class76();

    @ObfuscatedName("bd.k")
    public static int field1367 = 0;

    @ObfuscatedName("bd.x")
    public static int field1378 = 0;

    @ObfuscatedName("bd.m")
    public static volatile int field1362 = 0;

    @ObfuscatedName("bd.n")
    public static volatile int field1361 = 0;

    @ObfuscatedName("bd.q")
    public static volatile int field1369 = -1;

    @ObfuscatedName("bd.a")
    public static volatile int field1365 = -1;

    @ObfuscatedName("bd.g")
    public static int field1366 = 0;

    @ObfuscatedName("bd.j")
    public static volatile int field1375 = 0;

    @ObfuscatedName("bd.l")
    public static volatile int field1370 = 0;

    @ObfuscatedName("bd.w")
    public static volatile int field1371 = 0;

    @ObfuscatedName("bd.z")
    public static volatile long field1372 = 0L;

    @ObfuscatedName("bd.e")
    public static int field1373 = 0;

    @ObfuscatedName("bd.b")
    public static int field1374 = 0;

    @ObfuscatedName("bd.c")
    public static int field1377 = 0;

    @ObfuscatedName("bd.d")
    public static long field1376 = 0L;

    @ObfuscatedName("h.u(Ljava/awt/Component;I)V")
    public static void method151(Component arg0) {
        arg0.addMouseListener(field1368);
        arg0.addMouseMotionListener(field1368);
        arg0.addFocusListener(field1368);
    }

    @ObfuscatedName("ag.k(Ljava/awt/Component;I)V")
    public static void method841(Component arg0) {
        arg0.removeMouseListener(field1368);
        arg0.removeMouseMotionListener(field1368);
        arg0.removeFocusListener(field1368);
        field1361 = 0;
    }

    @ObfuscatedName("aa.x(I)V")
    public static void method547() {
        if (field1368 != null) {
            class76 var0 = field1368;
            synchronized (field1368) {
                field1368 = null;
            }
        }
    }

    @ObfuscatedName("p.m(I)V")
    public static void method214() {
        class76 var0 = field1368;
        synchronized (field1368) {
            field1366 = field1361;
            field1367 = field1369;
            field1378 = field1365;
            field1373 = field1375;
            field1374 = field1370;
            field1377 = field1371;
            field1376 = field1372;
            field1375 = 0;
        }
    }

    @ObfuscatedName("ce.n(II)V")
    public static void method2034(int arg0) {
        field1362 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1368 != null) {
            field1362 = 0;
            field1370 = arg0.getX();
            field1371 = arg0.getY();
            field1372 = class120.method2609();
            if (arg0.isMetaDown()) {
                field1375 = 2;
                field1361 = 2;
            } else {
                field1375 = 1;
                field1361 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1368 != null) {
            field1362 = 0;
            field1361 = 0;
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
            field1362 = 0;
            field1369 = arg0.getX();
            field1365 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1368 != null) {
            field1362 = 0;
            field1369 = -1;
            field1365 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1368 != null) {
            field1362 = 0;
            field1369 = arg0.getX();
            field1365 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1368 != null) {
            field1362 = 0;
            field1369 = arg0.getX();
            field1365 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1368 != null) {
            field1361 = 0;
        }
    }
}
