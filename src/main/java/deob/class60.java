package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bl")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bl.i")
    public static class60 field719 = new class60();

    @ObfuscatedName("bl.h")
    public static volatile int field717 = 0;

    @ObfuscatedName("bl.u")
    public static volatile int field721 = 0;

    @ObfuscatedName("bl.q")
    public static volatile int field735 = -1;

    @ObfuscatedName("bl.g")
    public static volatile int field731 = -1;

    @ObfuscatedName("bl.v")
    public static int field733 = 0;

    @ObfuscatedName("bl.t")
    public static int field722 = 0;

    @ObfuscatedName("bl.p")
    public static int field723 = 0;

    @ObfuscatedName("bl.l")
    public static volatile int field724 = 0;

    @ObfuscatedName("bl.a")
    public static volatile int field725 = 0;

    @ObfuscatedName("bl.k")
    public static volatile int field726 = 0;

    @ObfuscatedName("bl.r")
    public static volatile long field727 = 0L;

    @ObfuscatedName("bl.b")
    public static int field728 = 0;

    @ObfuscatedName("bl.x")
    public static int field718 = 0;

    @ObfuscatedName("bl.o")
    public static int field730 = 0;

    @ObfuscatedName("bl.j")
    public static long field716 = 0L;

    @ObfuscatedName("hw.i(Ljava/awt/Component;I)V")
    public static void method3722(Component arg0) {
        arg0.addMouseListener(field719);
        arg0.addMouseMotionListener(field719);
        arg0.addFocusListener(field719);
    }

    @ObfuscatedName("ck.h(Ljava/awt/Component;I)V")
    public static void method1601(Component arg0) {
        arg0.removeMouseListener(field719);
        arg0.removeMouseMotionListener(field719);
        arg0.removeFocusListener(field719);
        field721 = 0;
    }

    @ObfuscatedName("fm.u(B)V")
    public static void method2863() {
        if (field719 != null) {
            class60 var0 = field719;
            synchronized (field719) {
                field719 = null;
            }
        }
    }

    @ObfuscatedName("ao.q(I)V")
    public static void method553() {
        class60 var0 = field719;
        synchronized (field719) {
            field733 = field721;
            field722 = field735;
            field723 = field731 * 150870707;
            field728 = field724;
            field718 = field725;
            field730 = field726;
            field716 = field727;
            field724 = 0;
        }
    }

    @ObfuscatedName("k.g(I)I")
    public static int method38() {
        return ++field717 - 1;
    }

    @ObfuscatedName("jy.v(II)V")
    public static void method4429(int arg0) {
        field717 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field719 != null) {
            field717 = 0;
            field725 = arg0.getX();
            field726 = arg0.getY();
            field727 = class176.method3821();
            if (arg0.isAltDown()) {
                field724 = 4;
                field721 = 4;
            } else if (arg0.isMetaDown()) {
                field724 = 2;
                field721 = 2;
            } else {
                field724 = 1;
                field721 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field719 != null) {
            field717 = 0;
            field721 = 0;
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
        if (field719 != null) {
            field717 = 0;
            field735 = arg0.getX();
            field731 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field719 != null) {
            field717 = 0;
            field735 = -1;
            field731 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field719 != null) {
            field717 = 0;
            field735 = arg0.getX();
            field731 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field719 != null) {
            field717 = 0;
            field735 = arg0.getX();
            field731 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field719 != null) {
            field721 = 0;
        }
    }
}
