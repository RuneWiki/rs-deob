package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bu")
public class class61 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bu.j")
    public static class61 field697 = new class61();

    @ObfuscatedName("bu.k")
    public static int field701 = 0;

    @ObfuscatedName("bu.x")
    public static int field694 = 0;

    @ObfuscatedName("bu.z")
    public static volatile int field698 = 0;

    @ObfuscatedName("bu.p")
    public static volatile int field703 = 0;

    @ObfuscatedName("bu.w")
    public static volatile int field700 = -1;

    @ObfuscatedName("bu.r")
    public static volatile int field696 = -1;

    @ObfuscatedName("bu.d")
    public static int field702 = 0;

    @ObfuscatedName("bu.a")
    public static volatile int field699 = 0;

    @ObfuscatedName("bu.e")
    public static volatile int field706 = 0;

    @ObfuscatedName("bu.f")
    public static volatile int field707 = 0;

    @ObfuscatedName("bu.l")
    public static volatile long field708 = 0L;

    @ObfuscatedName("bu.m")
    public static int field709 = 0;

    @ObfuscatedName("bu.b")
    public static int field712 = 0;

    @ObfuscatedName("bu.h")
    public static int field711 = 0;

    @ObfuscatedName("bu.t")
    public static long field705 = 0L;

    @ObfuscatedName("jg.c(Ljava/awt/Component;B)V")
    public static void method4426(Component arg0) {
        arg0.addMouseListener(field697);
        arg0.addMouseMotionListener(field697);
        arg0.addFocusListener(field697);
    }

    @ObfuscatedName("be.i(Ljava/awt/Component;B)V")
    public static void method991(Component arg0) {
        arg0.removeMouseListener(field697);
        arg0.removeMouseMotionListener(field697);
        arg0.removeFocusListener(field697);
        field703 = 0;
    }

    @ObfuscatedName("bu.o(Ljava/awt/event/MouseEvent;I)I")
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
        if (field697 != null) {
            field698 = 0;
            field706 = arg0.getX();
            field707 = arg0.getY();
            field708 = class197.method26();
            field699 = this.method924(arg0);
            if (field699 != 0) {
                field703 = field699;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field697 != null) {
            field698 = 0;
            field703 = 0;
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
        if (field697 != null) {
            field698 = 0;
            field700 = arg0.getX();
            field696 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field697 != null) {
            field698 = 0;
            field700 = -1;
            field696 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field697 != null) {
            field698 = 0;
            field700 = arg0.getX();
            field696 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field697 != null) {
            field698 = 0;
            field700 = arg0.getX();
            field696 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field697 != null) {
            field703 = 0;
        }
    }
}
