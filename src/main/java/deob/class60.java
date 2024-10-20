package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bi")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bi.h")
    public static class60 field685 = new class60();

    @ObfuscatedName("bi.i")
    public static volatile int field684 = 0;

    @ObfuscatedName("bi.w")
    public static volatile int field687 = 0;

    @ObfuscatedName("bi.t")
    public static volatile int field683 = -1;

    @ObfuscatedName("bi.d")
    public static volatile int field689 = -1;

    @ObfuscatedName("bi.z")
    public static int field690 = 0;

    @ObfuscatedName("bi.k")
    public static int field691 = 0;

    @ObfuscatedName("bi.c")
    public static int field692 = 0;

    @ObfuscatedName("bi.o")
    public static volatile int field693 = 0;

    @ObfuscatedName("bi.l")
    public static volatile int field702 = 0;

    @ObfuscatedName("bi.f")
    public static volatile int field695 = 0;

    @ObfuscatedName("bi.q")
    public static volatile long field696 = 0L;

    @ObfuscatedName("bi.r")
    public static int field697 = 0;

    @ObfuscatedName("bi.x")
    public static int field698 = 0;

    @ObfuscatedName("bi.u")
    public static int field701 = 0;

    @ObfuscatedName("bi.b")
    public static long field700 = 0L;

    @ObfuscatedName("c.s(Ljava/awt/Component;I)V")
    public static void method49(Component arg0) {
        arg0.addMouseListener(field685);
        arg0.addMouseMotionListener(field685);
        arg0.addFocusListener(field685);
    }

    @ObfuscatedName("au.g(S)V")
    public static void method608() {
        if (field685 != null) {
            class60 var0 = field685;
            synchronized (field685) {
                field685 = null;
            }
        }
    }

    @ObfuscatedName("fu.m(I)I")
    public static int method3067() {
        return ++field684 - 1;
    }

    @ObfuscatedName("dh.h(II)V")
    public static void method2190(int arg0) {
        field684 = arg0;
    }

    @ObfuscatedName("bi.i(Ljava/awt/event/MouseEvent;S)I")
    public final int method860(MouseEvent arg0) {
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
        if (field685 != null) {
            field684 = 0;
            field702 = arg0.getX();
            field695 = arg0.getY();
            field696 = class187.method2705();
            field693 = this.method860(arg0);
            if (field693 != 0) {
                field687 = field693;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field685 != null) {
            field684 = 0;
            field687 = 0;
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
        if (field685 != null) {
            field684 = 0;
            field683 = arg0.getX();
            field689 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field685 != null) {
            field684 = 0;
            field683 = -1;
            field689 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field685 != null) {
            field684 = 0;
            field683 = arg0.getX();
            field689 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field685 != null) {
            field684 = 0;
            field683 = arg0.getX();
            field689 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field685 != null) {
            field687 = 0;
        }
    }
}
