package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bt")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bt.j")
    public static class60 field708 = new class60();

    @ObfuscatedName("bt.v")
    public static volatile int field703 = 0;

    @ObfuscatedName("bt.x")
    public static int field709 = 0;

    @ObfuscatedName("bt.e")
    public static volatile int field718 = 0;

    @ObfuscatedName("bt.l")
    public static volatile int field704 = -1;

    @ObfuscatedName("bt.b")
    public static volatile int field706 = -1;

    @ObfuscatedName("bt.n")
    public static int field707 = 0;

    @ObfuscatedName("bt.c")
    public static int field705 = 0;

    @ObfuscatedName("bt.a")
    public static volatile int field710 = 0;

    @ObfuscatedName("bt.y")
    public static volatile int field711 = 0;

    @ObfuscatedName("bt.w")
    public static volatile int field712 = 0;

    @ObfuscatedName("bt.k")
    public static volatile long field713 = 0L;

    @ObfuscatedName("bt.t")
    public static int field714 = 0;

    @ObfuscatedName("bt.h")
    public static int field715 = 0;

    @ObfuscatedName("bt.u")
    public static int field716 = 0;

    @ObfuscatedName("bt.r")
    public static long field702 = 0L;

    @ObfuscatedName("ag.m(Ljava/awt/Component;B)V")
    public static void method266(Component arg0) {
        arg0.addMouseListener(field708);
        arg0.addMouseMotionListener(field708);
        arg0.addFocusListener(field708);
    }

    @ObfuscatedName("bo.p(Ljava/awt/Component;B)V")
    public static void method739(Component arg0) {
        arg0.removeMouseListener(field708);
        arg0.removeMouseMotionListener(field708);
        arg0.removeFocusListener(field708);
        field718 = 0;
    }

    @ObfuscatedName("bt.i(Ljava/awt/event/MouseEvent;B)I")
    public final int method935(MouseEvent arg0) {
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
        if (field708 != null) {
            field703 = 0;
            field711 = arg0.getX();
            field712 = arg0.getY();
            field713 = class183.method4541();
            field710 = this.method935(arg0);
            if (field710 != 0) {
                field718 = field710;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field708 != null) {
            field703 = 0;
            field718 = 0;
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
        if (field708 != null) {
            field703 = 0;
            field704 = arg0.getX();
            field706 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field708 != null) {
            field703 = 0;
            field704 = -1;
            field706 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field708 != null) {
            field703 = 0;
            field704 = arg0.getX();
            field706 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field708 != null) {
            field703 = 0;
            field704 = arg0.getX();
            field706 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field708 != null) {
            field718 = 0;
        }
    }
}
