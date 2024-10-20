package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bi")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bi.u")
    public static class60 field725 = new class60();

    @ObfuscatedName("bi.g")
    public static volatile int field726 = 0;

    @ObfuscatedName("bi.m")
    public static volatile int field727 = 0;

    @ObfuscatedName("bi.s")
    public static volatile int field728 = -1;

    @ObfuscatedName("bi.x")
    public static int field732 = 0;

    @ObfuscatedName("bi.p")
    public static volatile int field729 = -1;

    @ObfuscatedName("bi.k")
    public static int field731 = 0;

    @ObfuscatedName("bi.r")
    public static int field734 = 0;

    @ObfuscatedName("bi.w")
    public static volatile int field733 = 0;

    @ObfuscatedName("bi.v")
    public static volatile int field740 = 0;

    @ObfuscatedName("bi.h")
    public static volatile int field735 = 0;

    @ObfuscatedName("bi.t")
    public static volatile long field736 = 0L;

    @ObfuscatedName("bi.a")
    public static int field730 = 0;

    @ObfuscatedName("bi.e")
    public static int field738 = 0;

    @ObfuscatedName("bi.y")
    public static int field724 = 0;

    @ObfuscatedName("bi.l")
    public static long field723 = 0L;

    @ObfuscatedName("fn.c(Ljava/awt/Component;B)V")
    public static void method2821(Component arg0) {
        arg0.removeMouseListener(field725);
        arg0.removeMouseMotionListener(field725);
        arg0.removeFocusListener(field725);
        field727 = 0;
    }

    @ObfuscatedName("cy.o(II)V")
    public static void method1447(int arg0) {
        field726 = arg0;
    }

    @ObfuscatedName("bi.i(Ljava/awt/event/MouseEvent;I)I")
    public final int method846(MouseEvent arg0) {
        int var2 = arg0.getButton();
        if (arg0.isAltDown() || var2 == 2) {
            return 4;
        } else if (arg0.isMetaDown() || var2 == 3) {
            return 2;
        } else {
            return 1;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field725 != null) {
            field726 = 0;
            field740 = arg0.getX();
            field735 = arg0.getY();
            field736 = class176.method2679();
            field733 = this.method846(arg0);
            if (field733 != 0) {
                field727 = field733;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field725 != null) {
            field726 = 0;
            field727 = 0;
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
        if (field725 != null) {
            field726 = 0;
            field728 = arg0.getX();
            field729 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field725 != null) {
            field726 = 0;
            field728 = -1;
            field729 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field725 != null) {
            field726 = 0;
            field728 = arg0.getX();
            field729 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field725 != null) {
            field726 = 0;
            field728 = arg0.getX();
            field729 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field725 != null) {
            field727 = 0;
        }
    }
}
