package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ac")
public class class37 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ac.q")
    public static class37 field494 = new class37();

    @ObfuscatedName("ac.l")
    public static volatile int field493 = 0;

    @ObfuscatedName("ac.a")
    public static volatile int field498 = 0;

    @ObfuscatedName("ac.o")
    public static volatile int field495 = -1;

    @ObfuscatedName("ac.c")
    public static volatile int field496 = -1;

    @ObfuscatedName("ac.h")
    public static int field497 = 0;

    @ObfuscatedName("ac.r")
    public static int field492 = 0;

    @ObfuscatedName("ac.d")
    public static int field499 = 0;

    @ObfuscatedName("ac.k")
    public static volatile int field502 = 0;

    @ObfuscatedName("ac.u")
    public static volatile int field500 = 0;

    @ObfuscatedName("ac.v")
    public static volatile int field501 = 0;

    @ObfuscatedName("ac.f")
    public static volatile long field503 = 0L;

    @ObfuscatedName("ac.s")
    public static int field504 = 0;

    @ObfuscatedName("ac.j")
    public static int field505 = 0;

    @ObfuscatedName("ac.e")
    public static int field506 = 0;

    @ObfuscatedName("ac.t")
    public static long field507 = 0L;

    @ObfuscatedName("ar.q(Ljava/awt/Component;I)V")
    public static void method396(Component arg0) {
        arg0.addMouseListener(field494);
        arg0.addMouseMotionListener(field494);
        arg0.addFocusListener(field494);
    }

    @ObfuscatedName("k.l(I)V")
    public static void method85() {
        class37 var0 = field494;
        synchronized (field494) {
            field497 = field498;
            field492 = field495;
            field499 = field496;
            field504 = field502;
            field505 = field500;
            field506 = field501;
            field507 = field503;
            field502 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field494 != null) {
            field493 = 0;
            field500 = arg0.getX();
            field501 = arg0.getY();
            field503 = class64.method535();
            if (arg0.isMetaDown()) {
                field502 = 2;
                field498 = 2;
            } else {
                field502 = 1;
                field498 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field494 != null) {
            field493 = 0;
            field498 = 0;
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
        if (field494 != null) {
            field493 = 0;
            field495 = arg0.getX();
            field496 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field494 != null) {
            field493 = 0;
            field495 = -1;
            field496 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field494 != null) {
            field493 = 0;
            field495 = arg0.getX();
            field496 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field494 != null) {
            field493 = 0;
            field495 = arg0.getX();
            field496 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field494 != null) {
            field498 = 0;
        }
    }
}
