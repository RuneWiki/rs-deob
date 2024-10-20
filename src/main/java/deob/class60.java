package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bw")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bw.p")
    public static class60 field744 = new class60();

    @ObfuscatedName("bw.x")
    public static int field736 = 0;

    @ObfuscatedName("bw.g")
    public static volatile int field730 = 0;

    @ObfuscatedName("bw.c")
    public static volatile int field732 = 0;

    @ObfuscatedName("bw.l")
    public static volatile int field752 = -1;

    @ObfuscatedName("bw.w")
    public static volatile int field733 = -1;

    @ObfuscatedName("bw.b")
    public static int field734 = 0;

    @ObfuscatedName("bw.o")
    public static int field735 = 0;

    @ObfuscatedName("bw.m")
    public static volatile int field727 = 0;

    @ObfuscatedName("bw.i")
    public static volatile int field738 = 0;

    @ObfuscatedName("bw.s")
    public static volatile int field739 = 0;

    @ObfuscatedName("bw.r")
    public static volatile long field740 = 0L;

    @ObfuscatedName("bw.e")
    public static int field741 = 0;

    @ObfuscatedName("bw.a")
    public static int field742 = 0;

    @ObfuscatedName("bw.v")
    public static int field743 = 0;

    @ObfuscatedName("bw.t")
    public static long field737 = 0L;

    @ObfuscatedName("bw.j(Ljava/awt/Component;I)V")
    public static void method954(Component arg0) {
        arg0.removeMouseListener(field744);
        arg0.removeMouseMotionListener(field744);
        arg0.removeFocusListener(field744);
        field732 = 0;
    }

    @ObfuscatedName("bi.h(B)V")
    public static void method718() {
        if (field744 != null) {
            class60 var0 = field744;
            synchronized (field744) {
                field744 = null;
            }
        }
    }

    @ObfuscatedName("t.f(I)V")
    public static void method132() {
        class60 var0 = field744;
        synchronized (field744) {
            field734 = field732;
            field735 = field752;
            field736 = field733 * 619026891;
            field741 = field727;
            field742 = field738;
            field743 = field739;
            field737 = field740;
            field727 = 0;
        }
    }

    @ObfuscatedName("bw.x(Ljava/awt/event/MouseEvent;I)I")
    public final int method920(MouseEvent arg0) {
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
        if (field744 != null) {
            field730 = 0;
            field738 = arg0.getX();
            field739 = arg0.getY();
            field740 = class177.method1067();
            field727 = this.method920(arg0);
            if (field727 != 0) {
                field732 = field727;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field744 != null) {
            field730 = 0;
            field732 = 0;
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
        if (field744 != null) {
            field730 = 0;
            field752 = arg0.getX();
            field733 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field744 != null) {
            field730 = 0;
            field752 = -1;
            field733 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field744 != null) {
            field730 = 0;
            field752 = arg0.getX();
            field733 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field744 != null) {
            field730 = 0;
            field752 = arg0.getX();
            field733 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field744 != null) {
            field732 = 0;
        }
    }
}
