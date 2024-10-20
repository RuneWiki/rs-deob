package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("br")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("br.p")
    public static class60 field661 = new class60();

    @ObfuscatedName("br.a")
    public static volatile int field662 = 0;

    @ObfuscatedName("br.h")
    public static volatile int field663 = 0;

    @ObfuscatedName("br.l")
    public static volatile int field659 = -1;

    @ObfuscatedName("br.y")
    public static volatile int field669 = 0;

    @ObfuscatedName("br.g")
    public static volatile int field665 = -1;

    @ObfuscatedName("br.c")
    public static int field664 = 0;

    @ObfuscatedName("br.u")
    public static int field670 = 0;

    @ObfuscatedName("br.r")
    public static int field668 = 0;

    @ObfuscatedName("br.d")
    public static volatile int field666 = 0;

    @ObfuscatedName("br.v")
    public static volatile int field676 = 0;

    @ObfuscatedName("br.s")
    public static volatile long field677 = 0L;

    @ObfuscatedName("br.t")
    public static int field673 = 0;

    @ObfuscatedName("br.f")
    public static int field672 = 0;

    @ObfuscatedName("br.m")
    public static int field675 = 0;

    @ObfuscatedName("br.x")
    public static long field667 = 0L;

    @ObfuscatedName("an.b(Ljava/awt/Component;I)V")
    public static void method703(Component arg0) {
        arg0.addMouseListener(field661);
        arg0.addMouseMotionListener(field661);
        arg0.addFocusListener(field661);
    }

    @ObfuscatedName("cx.q(I)I")
    public static int method1722() {
        return ++field662 - 1;
    }

    @ObfuscatedName("hr.o(II)V")
    public static void method3820(int arg0) {
        field662 = arg0;
    }

    @ObfuscatedName("br.p(Ljava/awt/event/MouseEvent;B)I")
    public final int method912(MouseEvent arg0) {
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
        if (field661 != null) {
            field662 = 0;
            field666 = arg0.getX();
            field676 = arg0.getY();
            field677 = class196.method3211();
            field669 = this.method912(arg0);
            if (field669 != 0) {
                field663 = field669;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field661 != null) {
            field662 = 0;
            field663 = 0;
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
        if (field661 != null) {
            field662 = 0;
            field659 = arg0.getX();
            field665 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field661 != null) {
            field662 = 0;
            field659 = -1;
            field665 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field661 != null) {
            field662 = 0;
            field659 = arg0.getX();
            field665 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field661 != null) {
            field662 = 0;
            field659 = arg0.getX();
            field665 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field661 != null) {
            field663 = 0;
        }
    }
}
