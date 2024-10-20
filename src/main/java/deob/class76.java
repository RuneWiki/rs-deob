package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bn")
public class class76 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bn.g")
    public static class76 field1388 = new class76();

    @ObfuscatedName("bn.e")
    public static volatile int field1375 = 0;

    @ObfuscatedName("bn.n")
    public static volatile int field1376 = 0;

    @ObfuscatedName("bn.j")
    public static volatile int field1386 = -1;

    @ObfuscatedName("bn.i")
    public static volatile int field1374 = -1;

    @ObfuscatedName("bn.o")
    public static int field1379 = 0;

    @ObfuscatedName("bn.l")
    public static int field1380 = 0;

    @ObfuscatedName("bn.p")
    public static int field1384 = 0;

    @ObfuscatedName("bn.t")
    public static volatile int field1382 = 0;

    @ObfuscatedName("bn.w")
    public static volatile int field1383 = 0;

    @ObfuscatedName("bn.r")
    public static volatile int field1377 = 0;

    @ObfuscatedName("bn.a")
    public static volatile long field1385 = 0L;

    @ObfuscatedName("bn.q")
    public static int field1387 = 0;

    @ObfuscatedName("bn.z")
    public static int field1378 = 0;

    @ObfuscatedName("bn.d")
    public static int field1381 = 0;

    @ObfuscatedName("bn.x")
    public static long field1389 = 0L;

    @ObfuscatedName("bb.g(Ljava/awt/Component;B)V")
    public static void method1269(Component arg0) {
        arg0.addMouseListener(field1388);
        arg0.addMouseMotionListener(field1388);
        arg0.addFocusListener(field1388);
    }

    @ObfuscatedName("ad.e(Ljava/awt/Component;I)V")
    public static void method604(Component arg0) {
        arg0.removeMouseListener(field1388);
        arg0.removeMouseMotionListener(field1388);
        arg0.removeFocusListener(field1388);
        field1376 = 0;
    }

    @ObfuscatedName("f.n(B)V")
    public static void method201() {
        if (field1388 != null) {
            class76 var0 = field1388;
            synchronized (field1388) {
                field1388 = null;
            }
        }
    }

    @ObfuscatedName("f.j(S)V")
    public static void method203() {
        class76 var0 = field1388;
        synchronized (field1388) {
            field1379 = field1376;
            field1380 = field1386;
            field1384 = field1374;
            field1387 = field1382;
            field1378 = field1383;
            field1381 = field1377;
            field1389 = field1385;
            field1382 = 0;
        }
    }

    @ObfuscatedName("y.i(I)I")
    public static int method161() {
        return ++field1375 - 1;
    }

    @ObfuscatedName("co.o(IB)V")
    public static void method1871(int arg0) {
        field1375 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1388 != null) {
            field1375 = 0;
            field1383 = arg0.getX();
            field1377 = arg0.getY();
            field1385 = class120.method8();
            if (arg0.isMetaDown()) {
                field1382 = 2;
                field1376 = 2;
            } else {
                field1382 = 1;
                field1376 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1388 != null) {
            field1375 = 0;
            field1376 = 0;
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
        if (field1388 != null) {
            field1375 = 0;
            field1386 = arg0.getX();
            field1374 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1388 != null) {
            field1375 = 0;
            field1386 = -1;
            field1374 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1388 != null) {
            field1375 = 0;
            field1386 = arg0.getX();
            field1374 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1388 != null) {
            field1375 = 0;
            field1386 = arg0.getX();
            field1374 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1388 != null) {
            field1376 = 0;
        }
    }
}
