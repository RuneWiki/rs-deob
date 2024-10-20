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
    public static volatile int field721 = 0;

    @ObfuscatedName("bi.w")
    public static class60 field713 = new class60();

    @ObfuscatedName("bi.k")
    public static int field719 = 0;

    @ObfuscatedName("bi.v")
    public static volatile int field711 = 0;

    @ObfuscatedName("bi.z")
    public static volatile int field730 = 0;

    @ObfuscatedName("bi.r")
    public static volatile int field716 = -1;

    @ObfuscatedName("bi.u")
    public static volatile int field717 = -1;

    @ObfuscatedName("bi.d")
    public static int field712 = 0;

    @ObfuscatedName("bi.o")
    public static int field720 = 0;

    @ObfuscatedName("bi.l")
    public static volatile int field722 = 0;

    @ObfuscatedName("bi.h")
    public static volatile int field723 = 0;

    @ObfuscatedName("bi.s")
    public static volatile long field724 = 0L;

    @ObfuscatedName("bi.c")
    public static int field735 = 0;

    @ObfuscatedName("bi.m")
    public static int field726 = 0;

    @ObfuscatedName("bi.a")
    public static int field727 = 0;

    @ObfuscatedName("bi.t")
    public static long field728 = 0L;

    @ObfuscatedName("em.e(Ljava/awt/Component;B)V")
    public static void method2707(Component arg0) {
        arg0.addMouseListener(field713);
        arg0.addMouseMotionListener(field713);
        arg0.addFocusListener(field713);
    }

    @ObfuscatedName("ik.n(Ljava/awt/Component;I)V")
    public static void method3908(Component arg0) {
        arg0.removeMouseListener(field713);
        arg0.removeMouseMotionListener(field713);
        arg0.removeFocusListener(field713);
        field730 = 0;
    }

    @ObfuscatedName("hz.g(I)I")
    public static int method3714() {
        return ++field711 - 1;
    }

    @ObfuscatedName("bi.y(Ljava/awt/event/MouseEvent;B)I")
    public final int method893(MouseEvent arg0) {
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
        if (field713 != null) {
            field711 = 0;
            field722 = arg0.getX();
            field723 = arg0.getY();
            field724 = class177.method2903();
            field721 = this.method893(arg0);
            if (field721 != 0) {
                field730 = field721;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field713 != null) {
            field711 = 0;
            field730 = 0;
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
        if (field713 != null) {
            field711 = 0;
            field716 = arg0.getX();
            field717 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field713 != null) {
            field711 = 0;
            field716 = -1;
            field717 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field713 != null) {
            field711 = 0;
            field716 = arg0.getX();
            field717 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field713 != null) {
            field711 = 0;
            field716 = arg0.getX();
            field717 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field713 != null) {
            field730 = 0;
        }
    }
}
