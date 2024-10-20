package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("be")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("be.f")
    public static class77 field1386 = new class77();

    @ObfuscatedName("be.t")
    public static volatile int field1372 = 0;

    @ObfuscatedName("be.n")
    public static volatile int field1373 = 0;

    @ObfuscatedName("be.e")
    public static volatile int field1374 = -1;

    @ObfuscatedName("be.l")
    public static volatile int field1371 = -1;

    @ObfuscatedName("be.d")
    public static int field1387 = 0;

    @ObfuscatedName("be.r")
    public static int field1376 = 0;

    @ObfuscatedName("be.k")
    public static int field1375 = 0;

    @ObfuscatedName("be.u")
    public static volatile int field1379 = 0;

    @ObfuscatedName("be.o")
    public static volatile int field1380 = 0;

    @ObfuscatedName("be.g")
    public static volatile int field1381 = 0;

    @ObfuscatedName("be.s")
    public static volatile long field1382 = 0L;

    @ObfuscatedName("be.b")
    public static int field1383 = 0;

    @ObfuscatedName("be.v")
    public static int field1384 = 0;

    @ObfuscatedName("be.j")
    public static int field1385 = 0;

    @ObfuscatedName("be.q")
    public static long field1377 = 0L;

    @ObfuscatedName("co.f(Ljava/awt/Component;I)V")
    public static void method1870(Component arg0) {
        arg0.removeMouseListener(field1386);
        arg0.removeMouseMotionListener(field1386);
        arg0.removeFocusListener(field1386);
        field1373 = 0;
    }

    @ObfuscatedName("bq.t(B)V")
    public static void method1566() {
        if (field1386 != null) {
            class77 var0 = field1386;
            synchronized (field1386) {
                field1386 = null;
            }
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1386 != null) {
            field1372 = 0;
            field1380 = arg0.getX();
            field1381 = arg0.getY();
            field1382 = class121.method133();
            if (arg0.isAltDown()) {
                field1379 = 4;
                field1373 = 4;
            } else if (arg0.isMetaDown()) {
                field1379 = 2;
                field1373 = 2;
            } else {
                field1379 = 1;
                field1373 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1386 != null) {
            field1372 = 0;
            field1373 = 0;
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
            field1372 = 0;
            field1374 = arg0.getX();
            field1371 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1386 != null) {
            field1372 = 0;
            field1374 = -1;
            field1371 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1386 != null) {
            field1372 = 0;
            field1374 = arg0.getX();
            field1371 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1386 != null) {
            field1372 = 0;
            field1374 = arg0.getX();
            field1371 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1386 != null) {
            field1373 = 0;
        }
    }
}
