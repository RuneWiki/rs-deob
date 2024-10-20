package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bb")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bb.s")
    public static class60 field670 = new class60();

    @ObfuscatedName("bb.j")
    public static volatile int field665 = 0;

    @ObfuscatedName("bb.a")
    public static volatile int field666 = 0;

    @ObfuscatedName("bb.t")
    public static volatile int field668 = -1;

    @ObfuscatedName("bb.r")
    public static volatile int field669 = -1;

    @ObfuscatedName("bb.m")
    public static int field667 = 0;

    @ObfuscatedName("bb.h")
    public static int field662 = 0;

    @ObfuscatedName("bb.o")
    public static int field672 = 0;

    @ObfuscatedName("bb.x")
    public static volatile int field679 = 0;

    @ObfuscatedName("bb.q")
    public static volatile int field674 = 0;

    @ObfuscatedName("bb.v")
    public static volatile int field675 = 0;

    @ObfuscatedName("bb.n")
    public static volatile long field676 = 0L;

    @ObfuscatedName("bb.y")
    public static int field677 = 0;

    @ObfuscatedName("bb.d")
    public static int field678 = 0;

    @ObfuscatedName("bb.l")
    public static int field671 = 0;

    @ObfuscatedName("bb.f")
    public static long field673 = 0L;

    @ObfuscatedName("x.p(Ljava/awt/Component;I)V")
    public static void method63(Component arg0) {
        arg0.addMouseListener(field670);
        arg0.addMouseMotionListener(field670);
        arg0.addFocusListener(field670);
    }

    @ObfuscatedName("dg.i(Ljava/awt/Component;I)V")
    public static void method2366(Component arg0) {
        arg0.removeMouseListener(field670);
        arg0.removeMouseMotionListener(field670);
        arg0.removeFocusListener(field670);
        field666 = 0;
    }

    @ObfuscatedName("ac.w(II)V")
    public static void method582(int arg0) {
        field665 = arg0;
    }

    @ObfuscatedName("bb.s(Ljava/awt/event/MouseEvent;I)I")
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
        if (field670 != null) {
            field665 = 0;
            field674 = arg0.getX();
            field675 = arg0.getY();
            field676 = class187.method35();
            field679 = this.method893(arg0);
            if (field679 != 0) {
                field666 = field679;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field670 != null) {
            field665 = 0;
            field666 = 0;
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
        if (field670 != null) {
            field665 = 0;
            field668 = arg0.getX();
            field669 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field670 != null) {
            field665 = 0;
            field668 = -1;
            field669 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field670 != null) {
            field665 = 0;
            field668 = arg0.getX();
            field669 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field670 != null) {
            field665 = 0;
            field668 = arg0.getX();
            field669 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field670 != null) {
            field666 = 0;
        }
    }
}
