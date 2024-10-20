package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bl")
public class class61 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bl.z")
    public static class61 field704 = new class61();

    @ObfuscatedName("bl.n")
    public static volatile int field700 = 0;

    @ObfuscatedName("bl.l")
    public static volatile int field706 = 0;

    @ObfuscatedName("bl.s")
    public static volatile int field705 = -1;

    @ObfuscatedName("bl.y")
    public static volatile int field710 = 0;

    @ObfuscatedName("bl.c")
    public static volatile int field701 = -1;

    @ObfuscatedName("bl.h")
    public static int field718 = 0;

    @ObfuscatedName("bl.i")
    public static int field708 = 0;

    @ObfuscatedName("bl.o")
    public static int field709 = 0;

    @ObfuscatedName("bl.d")
    public static volatile int field707 = 0;

    @ObfuscatedName("bl.r")
    public static volatile int field712 = 0;

    @ObfuscatedName("bl.p")
    public static volatile long field713 = 0L;

    @ObfuscatedName("bl.q")
    public static int field711 = 0;

    @ObfuscatedName("bl.f")
    public static int field715 = 0;

    @ObfuscatedName("bl.j")
    public static int field716 = 0;

    @ObfuscatedName("bl.v")
    public static long field717 = 0L;

    @ObfuscatedName("x.g(Ljava/awt/Component;I)V")
    public static void method177(Component arg0) {
        arg0.addMouseListener(field704);
        arg0.addMouseMotionListener(field704);
        arg0.addFocusListener(field704);
    }

    @ObfuscatedName("ah.e(Ljava/awt/Component;I)V")
    public static void method553(Component arg0) {
        arg0.removeMouseListener(field704);
        arg0.removeMouseMotionListener(field704);
        arg0.removeFocusListener(field704);
        field706 = 0;
    }

    @ObfuscatedName("r.b(I)V")
    public static void method73() {
        if (field704 != null) {
            class61 var0 = field704;
            synchronized (field704) {
                field704 = null;
            }
        }
    }

    @ObfuscatedName("bt.z(I)V")
    public static void method1056() {
        class61 var0 = field704;
        synchronized (field704) {
            field718 = field706;
            field708 = field705;
            field709 = field701;
            field711 = field710;
            field715 = field707;
            field716 = field712;
            field717 = field713;
            field710 = 0;
        }
    }

    @ObfuscatedName("w.n(I)I")
    public static int method157() {
        return ++field700 - 1;
    }

    @ObfuscatedName("y.l(II)V")
    public static void method26(int arg0) {
        field700 = arg0;
    }

    @ObfuscatedName("bl.s(Ljava/awt/event/MouseEvent;I)I")
    public final int method962(MouseEvent arg0) {
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
        if (field704 != null) {
            field700 = 0;
            field707 = arg0.getX();
            field712 = arg0.getY();
            field713 = class197.method4873();
            field710 = this.method962(arg0);
            if (field710 != 0) {
                field706 = field710;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field704 != null) {
            field700 = 0;
            field706 = 0;
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
        if (field704 != null) {
            field700 = 0;
            field705 = arg0.getX();
            field701 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field704 != null) {
            field700 = 0;
            field705 = -1;
            field701 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field704 != null) {
            field700 = 0;
            field705 = arg0.getX();
            field701 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field704 != null) {
            field700 = 0;
            field705 = arg0.getX();
            field701 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field704 != null) {
            field706 = 0;
        }
    }
}
