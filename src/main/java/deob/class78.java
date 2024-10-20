package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bo")
public class class78 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bo.e")
    public static class78 field1403 = new class78();

    @ObfuscatedName("bo.i")
    public static volatile int field1392 = 0;

    @ObfuscatedName("bo.k")
    public static int field1397 = 0;

    @ObfuscatedName("bo.q")
    public static volatile int field1391 = 0;

    @ObfuscatedName("bo.j")
    public static volatile int field1394 = -1;

    @ObfuscatedName("bo.z")
    public static volatile int field1407 = -1;

    @ObfuscatedName("bo.m")
    public static int field1396 = 0;

    @ObfuscatedName("bo.w")
    public static int field1398 = 0;

    @ObfuscatedName("bo.a")
    public static volatile int field1399 = 0;

    @ObfuscatedName("bo.d")
    public static volatile int field1400 = 0;

    @ObfuscatedName("bo.u")
    public static volatile int field1401 = 0;

    @ObfuscatedName("bo.p")
    public static volatile long field1402 = 0L;

    @ObfuscatedName("bo.t")
    public static int field1393 = 0;

    @ObfuscatedName("bo.g")
    public static int field1404 = 0;

    @ObfuscatedName("bo.o")
    public static int field1405 = 0;

    @ObfuscatedName("bo.x")
    public static long field1406 = 0L;

    @ObfuscatedName("ah.e(II)V")
    public static void method733(int arg0) {
        field1392 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1403 != null) {
            field1392 = 0;
            field1400 = arg0.getX();
            field1401 = arg0.getY();
            field1402 = class122.method37();
            if (arg0.isAltDown()) {
                field1399 = 4;
                field1391 = 4;
            } else if (arg0.isMetaDown()) {
                field1399 = 2;
                field1391 = 2;
            } else {
                field1399 = 1;
                field1391 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1403 != null) {
            field1392 = 0;
            field1391 = 0;
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
        if (field1403 != null) {
            field1392 = 0;
            field1394 = arg0.getX();
            field1407 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1403 != null) {
            field1392 = 0;
            field1394 = -1;
            field1407 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1403 != null) {
            field1392 = 0;
            field1394 = arg0.getX();
            field1407 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1403 != null) {
            field1392 = 0;
            field1394 = arg0.getX();
            field1407 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1403 != null) {
            field1391 = 0;
        }
    }
}
