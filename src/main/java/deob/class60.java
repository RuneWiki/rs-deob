package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bx")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bx.k")
    public static int field680 = 0;

    @ObfuscatedName("bx.u")
    public static class60 field667 = new class60();

    @ObfuscatedName("bx.z")
    public static volatile int field685 = 0;

    @ObfuscatedName("bx.t")
    public static volatile int field669 = 0;

    @ObfuscatedName("bx.f")
    public static volatile int field670 = -1;

    @ObfuscatedName("bx.g")
    public static volatile int field671 = -1;

    @ObfuscatedName("bx.j")
    public static int field672 = 0;

    @ObfuscatedName("bx.x")
    public static int field683 = 0;

    @ObfuscatedName("bx.c")
    public static volatile int field675 = 0;

    @ObfuscatedName("bx.s")
    public static volatile int field676 = 0;

    @ObfuscatedName("bx.n")
    public static volatile int field673 = 0;

    @ObfuscatedName("bx.y")
    public static volatile long field678 = 0L;

    @ObfuscatedName("bx.o")
    public static int field679 = 0;

    @ObfuscatedName("bx.r")
    public static int field665 = 0;

    @ObfuscatedName("bx.i")
    public static int field681 = 0;

    @ObfuscatedName("bx.l")
    public static long field682 = 0L;

    @ObfuscatedName("ad.a(Ljava/awt/Component;B)V")
    public static void method200(Component arg0) {
        arg0.addMouseListener(field667);
        arg0.addMouseMotionListener(field667);
        arg0.addFocusListener(field667);
    }

    @ObfuscatedName("as.w(Ljava/awt/Component;I)V")
    public static void method228(Component arg0) {
        arg0.removeMouseListener(field667);
        arg0.removeMouseMotionListener(field667);
        arg0.removeFocusListener(field667);
        field669 = 0;
    }

    @ObfuscatedName("fi.e(B)V")
    public static void method2803() {
        class60 var0 = field667;
        synchronized (field667) {
            field672 = field669;
            field680 = field670;
            field683 = field671 * -1460687225;
            field679 = field675;
            field665 = field676;
            field681 = field673;
            field682 = field678;
            field675 = 0;
        }
    }

    @ObfuscatedName("q.k(I)I")
    public static int method136() {
        return ++field685 - 1;
    }

    @ObfuscatedName("bx.u(Ljava/awt/event/MouseEvent;I)I")
    public final int method862(MouseEvent arg0) {
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
        if (field667 != null) {
            field685 = 0;
            field676 = arg0.getX();
            field673 = arg0.getY();
            field678 = class187.method1411();
            field675 = this.method862(arg0);
            if (field675 != 0) {
                field669 = field675;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field667 != null) {
            field685 = 0;
            field669 = 0;
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
        if (field667 != null) {
            field685 = 0;
            field670 = arg0.getX();
            field671 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field667 != null) {
            field685 = 0;
            field670 = -1;
            field671 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field667 != null) {
            field685 = 0;
            field670 = arg0.getX();
            field671 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field667 != null) {
            field685 = 0;
            field670 = arg0.getX();
            field671 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field667 != null) {
            field669 = 0;
        }
    }
}
