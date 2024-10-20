package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("br")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("br.s")
    public static class60 field729 = new class60();

    @ObfuscatedName("br.c")
    public static volatile int field730 = 0;

    @ObfuscatedName("br.f")
    public static volatile int field725 = 0;

    @ObfuscatedName("br.m")
    public static volatile int field726 = -1;

    @ObfuscatedName("br.h")
    public static volatile int field727 = -1;

    @ObfuscatedName("br.t")
    public static int field728 = 0;

    @ObfuscatedName("br.p")
    public static int field742 = 0;

    @ObfuscatedName("br.d")
    public static int field738 = 0;

    @ObfuscatedName("br.n")
    public static volatile int field731 = 0;

    @ObfuscatedName("br.z")
    public static volatile int field732 = 0;

    @ObfuscatedName("br.o")
    public static volatile int field733 = 0;

    @ObfuscatedName("br.q")
    public static volatile long field734 = 0L;

    @ObfuscatedName("br.u")
    public static int field735 = 0;

    @ObfuscatedName("br.k")
    public static int field736 = 0;

    @ObfuscatedName("br.e")
    public static int field724 = 0;

    @ObfuscatedName("br.r")
    public static long field737 = 0L;

    @ObfuscatedName("m.s(Ljava/awt/Component;B)V")
    public static void method5(Component arg0) {
        arg0.addMouseListener(field729);
        arg0.addMouseMotionListener(field729);
        arg0.addFocusListener(field729);
    }

    @ObfuscatedName("h.c(Ljava/awt/Component;B)V")
    public static void method15(Component arg0) {
        arg0.removeMouseListener(field729);
        arg0.removeMouseMotionListener(field729);
        arg0.removeFocusListener(field729);
        field725 = 0;
    }

    @ObfuscatedName("n.m(IB)V")
    public static void method38(int arg0) {
        field730 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field729 != null) {
            field730 = 0;
            field732 = arg0.getX();
            field733 = arg0.getY();
            field734 = class179.method3585();
            if (arg0.isAltDown()) {
                field731 = 4;
                field725 = 4;
            } else if (arg0.isMetaDown()) {
                field731 = 2;
                field725 = 2;
            } else {
                field731 = 1;
                field725 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field729 != null) {
            field730 = 0;
            field725 = 0;
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
        if (field729 != null) {
            field730 = 0;
            field726 = arg0.getX();
            field727 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field729 != null) {
            field730 = 0;
            field726 = -1;
            field727 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field729 != null) {
            field730 = 0;
            field726 = arg0.getX();
            field727 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field729 != null) {
            field730 = 0;
            field726 = arg0.getX();
            field727 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field729 != null) {
            field725 = 0;
        }
    }
}
