package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bg")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bg.x")
    public static int field716 = 0;

    @ObfuscatedName("bg.k")
    public static int field704 = 0;

    @ObfuscatedName("bg.m")
    public static class60 field697 = new class60();

    @ObfuscatedName("bg.b")
    public static volatile int field703 = 0;

    @ObfuscatedName("bg.t")
    public static volatile int field705 = 0;

    @ObfuscatedName("bg.p")
    public static volatile int field700 = -1;

    @ObfuscatedName("bg.r")
    public static volatile int field701 = -1;

    @ObfuscatedName("bg.l")
    public static int field706 = 0;

    @ObfuscatedName("bg.u")
    public static volatile int field714 = 0;

    @ObfuscatedName("bg.n")
    public static volatile int field695 = 0;

    @ObfuscatedName("bg.c")
    public static volatile int field707 = 0;

    @ObfuscatedName("bg.y")
    public static volatile long field708 = 0L;

    @ObfuscatedName("bg.j")
    public static int field709 = 0;

    @ObfuscatedName("bg.f")
    public static int field710 = 0;

    @ObfuscatedName("bg.s")
    public static int field711 = 0;

    @ObfuscatedName("bg.e")
    public static long field698 = 0L;

    @ObfuscatedName("p.d(Ljava/awt/Component;I)V")
    public static void method38(Component arg0) {
        arg0.removeMouseListener(field697);
        arg0.removeMouseMotionListener(field697);
        arg0.removeFocusListener(field697);
        field705 = 0;
    }

    @ObfuscatedName("iv.x(I)V")
    public static void method4066() {
        class60 var0 = field697;
        synchronized (field697) {
            field706 = field705;
            field704 = field700;
            field716 = field701 * -2054651093;
            field709 = field714;
            field710 = field695;
            field711 = field707;
            field698 = field708;
            field714 = 0;
        }
    }

    @ObfuscatedName("ip.k(I)I")
    public static int method4096() {
        return ++field703 - 1;
    }

    @ObfuscatedName("au.z(II)V")
    public static void method239(int arg0) {
        field703 = arg0;
    }

    @ObfuscatedName("bg.v(Ljava/awt/event/MouseEvent;B)I")
    public final int method915(MouseEvent arg0) {
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
            field703 = 0;
            field695 = arg0.getX();
            field707 = arg0.getY();
            field708 = class183.method2932();
            field714 = this.method915(arg0);
            if (field714 != 0) {
                field705 = field714;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field697 != null) {
            field703 = 0;
            field705 = 0;
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
            field703 = 0;
            field700 = arg0.getX();
            field701 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field697 != null) {
            field703 = 0;
            field700 = -1;
            field701 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field697 != null) {
            field703 = 0;
            field700 = arg0.getX();
            field701 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field697 != null) {
            field703 = 0;
            field700 = arg0.getX();
            field701 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field697 != null) {
            field705 = 0;
        }
    }
}
