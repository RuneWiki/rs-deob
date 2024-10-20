package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ba")
public class class76 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ba.c")
    public static class76 field1375 = new class76();

    @ObfuscatedName("ba.j")
    public static volatile int field1360 = 0;

    @ObfuscatedName("ba.f")
    public static volatile int field1361 = 0;

    @ObfuscatedName("ba.y")
    public static volatile int field1367 = 0;

    @ObfuscatedName("ba.x")
    public static int field1369 = 0;

    @ObfuscatedName("ba.e")
    public static volatile int field1371 = -1;

    @ObfuscatedName("ba.m")
    public static volatile int field1363 = -1;

    @ObfuscatedName("ba.s")
    public static int field1364 = 0;

    @ObfuscatedName("ba.p")
    public static int field1365 = 0;

    @ObfuscatedName("ba.w")
    public static volatile int field1368 = 0;

    @ObfuscatedName("ba.r")
    public static volatile int field1359 = 0;

    @ObfuscatedName("ba.n")
    public static volatile long field1370 = 0L;

    @ObfuscatedName("ba.b")
    public static int field1374 = 0;

    @ObfuscatedName("ba.z")
    public static int field1372 = 0;

    @ObfuscatedName("ba.h")
    public static int field1373 = 0;

    @ObfuscatedName("ba.q")
    public static long field1362 = 0L;

    @ObfuscatedName("ec.c(Ljava/awt/Component;I)V")
    public static void method2812(Component arg0) {
        arg0.addMouseListener(field1375);
        arg0.addMouseMotionListener(field1375);
        arg0.addFocusListener(field1375);
    }

    @ObfuscatedName("c.j(I)V")
    public static void method2() {
        class76 var0 = field1375;
        synchronized (field1375) {
            field1364 = field1361;
            field1365 = field1371;
            field1369 = field1363;
            field1374 = field1367;
            field1372 = field1368;
            field1373 = field1359;
            field1362 = field1370;
            field1367 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1375 != null) {
            field1360 = 0;
            field1368 = arg0.getX();
            field1359 = arg0.getY();
            field1370 = class120.method774();
            if (arg0.isMetaDown()) {
                field1367 = 2;
                field1361 = 2;
            } else {
                field1367 = 1;
                field1361 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1375 != null) {
            field1360 = 0;
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
        if (field1375 != null) {
            field1360 = 0;
            field1371 = arg0.getX();
            field1363 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1375 != null) {
            field1360 = 0;
            field1371 = -1;
            field1363 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1375 != null) {
            field1360 = 0;
            field1371 = arg0.getX();
            field1363 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1375 != null) {
            field1360 = 0;
            field1371 = arg0.getX();
            field1363 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1375 != null) {
            field1361 = 0;
        }
    }
}
