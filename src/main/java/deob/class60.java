package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bi")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bi.y")
    public static volatile int field707 = 0;

    @ObfuscatedName("bi.h")
    public static class60 field699 = new class60();

    @ObfuscatedName("bi.d")
    public static volatile int field700 = 0;

    @ObfuscatedName("bi.s")
    public static volatile int field701 = 0;

    @ObfuscatedName("bi.b")
    public static volatile int field696 = -1;

    @ObfuscatedName("bi.e")
    public static volatile int field703 = -1;

    @ObfuscatedName("bi.f")
    public static int field704 = 0;

    @ObfuscatedName("bi.z")
    public static int field705 = 0;

    @ObfuscatedName("bi.u")
    public static int field706 = 0;

    @ObfuscatedName("bi.p")
    public static volatile int field708 = 0;

    @ObfuscatedName("bi.w")
    public static volatile int field709 = 0;

    @ObfuscatedName("bi.t")
    public static volatile long field716 = 0L;

    @ObfuscatedName("bi.o")
    public static int field711 = 0;

    @ObfuscatedName("bi.a")
    public static int field710 = 0;

    @ObfuscatedName("bi.i")
    public static int field714 = 0;

    @ObfuscatedName("bi.m")
    public static long field717 = 0L;

    @ObfuscatedName("aq.n(Ljava/awt/Component;I)V")
    public static void method550(Component arg0) {
        arg0.removeMouseListener(field699);
        arg0.removeMouseMotionListener(field699);
        arg0.removeFocusListener(field699);
        field701 = 0;
    }

    @ObfuscatedName("k.v(B)V")
    public static void method167() {
        class60 var0 = field699;
        synchronized (field699) {
            field704 = field701;
            field705 = field696;
            field706 = field703;
            field711 = field707;
            field710 = field708;
            field714 = field709;
            field717 = field716;
            field707 = 0;
        }
    }

    @ObfuscatedName("bx.y(B)I")
    public static int method972() {
        return ++field700 - 1;
    }

    @ObfuscatedName("it.r(IB)V")
    public static void method3912(int arg0) {
        field700 = arg0;
    }

    @ObfuscatedName("bi.h(Ljava/awt/event/MouseEvent;I)I")
    public final int method924(MouseEvent arg0) {
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
        if (field699 != null) {
            field700 = 0;
            field708 = arg0.getX();
            field709 = arg0.getY();
            field716 = class187.method938();
            field707 = this.method924(arg0);
            if (field707 != 0) {
                field701 = field707;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field699 != null) {
            field700 = 0;
            field701 = 0;
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
        if (field699 != null) {
            field700 = 0;
            field696 = arg0.getX();
            field703 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field699 != null) {
            field700 = 0;
            field696 = -1;
            field703 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field699 != null) {
            field700 = 0;
            field696 = arg0.getX();
            field703 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field699 != null) {
            field700 = 0;
            field696 = arg0.getX();
            field703 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field699 != null) {
            field701 = 0;
        }
    }
}
