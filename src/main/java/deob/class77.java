package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bn")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bn.d")
    public static class77 field1406 = new class77();

    @ObfuscatedName("bn.g")
    public static volatile int field1403 = 0;

    @ObfuscatedName("bn.a")
    public static volatile int field1389 = 0;

    @ObfuscatedName("bn.t")
    public static volatile int field1390 = -1;

    @ObfuscatedName("bn.f")
    public static volatile int field1387 = -1;

    @ObfuscatedName("bn.c")
    public static int field1392 = 0;

    @ObfuscatedName("bn.p")
    public static int field1405 = 0;

    @ObfuscatedName("bn.s")
    public static int field1394 = 0;

    @ObfuscatedName("bn.k")
    public static volatile int field1395 = 0;

    @ObfuscatedName("bn.m")
    public static volatile int field1396 = 0;

    @ObfuscatedName("bn.y")
    public static volatile int field1397 = 0;

    @ObfuscatedName("bn.b")
    public static volatile long field1398 = 0L;

    @ObfuscatedName("bn.l")
    public static int field1399 = 0;

    @ObfuscatedName("bn.x")
    public static int field1400 = 0;

    @ObfuscatedName("bn.z")
    public static int field1393 = 0;

    @ObfuscatedName("bn.r")
    public static long field1402 = 0L;

    @ObfuscatedName("o.d(Ljava/awt/Component;B)V")
    public static void method218(Component arg0) {
        arg0.removeMouseListener(field1406);
        arg0.removeMouseMotionListener(field1406);
        arg0.removeFocusListener(field1406);
        field1389 = 0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1406 != null) {
            field1403 = 0;
            field1396 = arg0.getX();
            field1397 = arg0.getY();
            field1398 = class121.method1250();
            if (arg0.isMetaDown()) {
                field1395 = 2;
                field1389 = 2;
            } else {
                field1395 = 1;
                field1389 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1406 != null) {
            field1403 = 0;
            field1389 = 0;
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
        if (field1406 != null) {
            field1403 = 0;
            field1390 = arg0.getX();
            field1387 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1406 != null) {
            field1403 = 0;
            field1390 = -1;
            field1387 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1406 != null) {
            field1403 = 0;
            field1390 = arg0.getX();
            field1387 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1406 != null) {
            field1403 = 0;
            field1390 = arg0.getX();
            field1387 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1406 != null) {
            field1389 = 0;
        }
    }
}
