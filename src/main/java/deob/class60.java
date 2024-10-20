package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bx")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bx.x")
    public static int field706 = 0;

    @ObfuscatedName("bx.y")
    public static volatile int field708 = 0;

    @ObfuscatedName("bx.f")
    public static class60 field700 = new class60();

    @ObfuscatedName("bx.v")
    public static volatile int field701 = 0;

    @ObfuscatedName("bx.t")
    public static volatile int field702 = 0;

    @ObfuscatedName("bx.i")
    public static volatile int field713 = -1;

    @ObfuscatedName("bx.r")
    public static volatile int field707 = -1;

    @ObfuscatedName("bx.g")
    public static int field705 = 0;

    @ObfuscatedName("bx.s")
    public static int field697 = 0;

    @ObfuscatedName("bx.o")
    public static volatile int field709 = 0;

    @ObfuscatedName("bx.p")
    public static volatile int field712 = 0;

    @ObfuscatedName("bx.u")
    public static volatile long field703 = 0L;

    @ObfuscatedName("bx.b")
    public static int field698 = 0;

    @ObfuscatedName("bx.w")
    public static int field710 = 0;

    @ObfuscatedName("bx.k")
    public static int field714 = 0;

    @ObfuscatedName("bx.n")
    public static long field715 = 0L;

    @ObfuscatedName("ab.d(Ljava/awt/Component;I)V")
    public static void method671(Component arg0) {
        arg0.removeMouseListener(field700);
        arg0.removeMouseMotionListener(field700);
        arg0.removeFocusListener(field700);
        field702 = 0;
    }

    @ObfuscatedName("in.q(I)V")
    public static void method4278() {
        class60 var0 = field700;
        synchronized (field700) {
            field705 = field702;
            field697 = field713;
            field706 = field707 * 358201513;
            field698 = field708;
            field710 = field709;
            field714 = field712;
            field715 = field703;
            field708 = 0;
        }
    }

    @ObfuscatedName("g.x(B)I")
    public static int method47() {
        return ++field701 - 1;
    }

    @ObfuscatedName("v.y(II)V")
    public static void method17(int arg0) {
        field701 = arg0;
    }

    @ObfuscatedName("bx.e(Ljava/awt/event/MouseEvent;B)I")
    public final int method894(MouseEvent arg0) {
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
        if (field700 != null) {
            field701 = 0;
            field709 = arg0.getX();
            field712 = arg0.getY();
            field703 = class176.method3746();
            field708 = this.method894(arg0);
            if (field708 != 0) {
                field702 = field708;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field700 != null) {
            field701 = 0;
            field702 = 0;
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
        if (field700 != null) {
            field701 = 0;
            field713 = arg0.getX();
            field707 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field700 != null) {
            field701 = 0;
            field713 = -1;
            field707 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field700 != null) {
            field701 = 0;
            field713 = arg0.getX();
            field707 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field700 != null) {
            field701 = 0;
            field713 = arg0.getX();
            field707 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field700 != null) {
            field702 = 0;
        }
    }
}
