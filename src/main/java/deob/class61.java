package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bk")
public class class61 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bk.k")
    public static int field717 = 0;

    @ObfuscatedName("bk.h")
    public static class61 field718 = new class61();

    @ObfuscatedName("bk.m")
    public static volatile int field719 = 0;

    @ObfuscatedName("bk.z")
    public static volatile int field720 = 0;

    @ObfuscatedName("bk.i")
    public static volatile int field725 = -1;

    @ObfuscatedName("bk.u")
    public static volatile int field724 = -1;

    @ObfuscatedName("bk.x")
    public static int field715 = 0;

    @ObfuscatedName("bk.y")
    public static volatile int field726 = 0;

    @ObfuscatedName("bk.a")
    public static int field729 = 0;

    @ObfuscatedName("bk.w")
    public static volatile int field727 = 0;

    @ObfuscatedName("bk.n")
    public static volatile int field721 = 0;

    @ObfuscatedName("bk.l")
    public static volatile long field722 = 0L;

    @ObfuscatedName("bk.s")
    public static int field730 = 0;

    @ObfuscatedName("bk.v")
    public static int field731 = 0;

    @ObfuscatedName("bk.q")
    public static int field732 = 0;

    @ObfuscatedName("bk.r")
    public static long field733 = 0L;

    @ObfuscatedName("ef.o(I)I")
    public static int method2830() {
        return ++field719 - 1;
    }

    @ObfuscatedName("c.k(II)V")
    public static void method189(int arg0) {
        field719 = arg0;
    }

    @ObfuscatedName("bk.t(Ljava/awt/event/MouseEvent;B)I")
    public final int method923(MouseEvent arg0) {
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
        if (field718 != null) {
            field719 = 0;
            field727 = arg0.getX();
            field721 = arg0.getY();
            field722 = class197.method1005();
            field726 = this.method923(arg0);
            if (field726 != 0) {
                field720 = field726;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field718 != null) {
            field719 = 0;
            field720 = 0;
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
        if (field718 != null) {
            field719 = 0;
            field725 = arg0.getX();
            field724 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field718 != null) {
            field719 = 0;
            field725 = -1;
            field724 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field718 != null) {
            field719 = 0;
            field725 = arg0.getX();
            field724 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field718 != null) {
            field719 = 0;
            field725 = arg0.getX();
            field724 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field718 != null) {
            field720 = 0;
        }
    }
}
