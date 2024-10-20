package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bd")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bd.k")
    public static int field746 = 0;

    @ObfuscatedName("bd.q")
    public static class60 field740 = new class60();

    @ObfuscatedName("bd.s")
    public static volatile int field758 = 0;

    @ObfuscatedName("bd.r")
    public static volatile int field741 = 0;

    @ObfuscatedName("bd.g")
    public static volatile int field743 = -1;

    @ObfuscatedName("bd.v")
    public static volatile int field744 = -1;

    @ObfuscatedName("bd.t")
    public static int field739 = 0;

    @ObfuscatedName("bd.y")
    public static volatile int field750 = 0;

    @ObfuscatedName("bd.o")
    public static int field747 = 0;

    @ObfuscatedName("bd.i")
    public static volatile int field749 = 0;

    @ObfuscatedName("bd.u")
    public static volatile int field738 = 0;

    @ObfuscatedName("bd.b")
    public static volatile long field751 = 0L;

    @ObfuscatedName("bd.f")
    public static int field742 = 0;

    @ObfuscatedName("bd.j")
    public static int field753 = 0;

    @ObfuscatedName("bd.x")
    public static int field754 = 0;

    @ObfuscatedName("bd.c")
    public static long field755 = 0L;

    @ObfuscatedName("aw.d(Ljava/awt/Component;I)V")
    public static void method574(Component arg0) {
        arg0.addMouseListener(field740);
        arg0.addMouseMotionListener(field740);
        arg0.addFocusListener(field740);
    }

    @ObfuscatedName("ai.k(I)V")
    public static void method197() {
        if (field740 != null) {
            class60 var0 = field740;
            synchronized (field740) {
                field740 = null;
            }
        }
    }

    @ObfuscatedName("n.e(I)I")
    public static int method161() {
        return ++field758 - 1;
    }

    @ObfuscatedName("cj.p(II)V")
    public static void method1740(int arg0) {
        field758 = arg0;
    }

    @ObfuscatedName("bd.q(Ljava/awt/event/MouseEvent;I)I")
    public final int method942(MouseEvent arg0) {
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
        if (field740 != null) {
            field758 = 0;
            field749 = arg0.getX();
            field738 = arg0.getY();
            field751 = class176.method2725();
            field750 = this.method942(arg0);
            if (field750 != 0) {
                field741 = field750;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field740 != null) {
            field758 = 0;
            field741 = 0;
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
        if (field740 != null) {
            field758 = 0;
            field743 = arg0.getX();
            field744 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field740 != null) {
            field758 = 0;
            field743 = -1;
            field744 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field740 != null) {
            field758 = 0;
            field743 = arg0.getX();
            field744 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field740 != null) {
            field758 = 0;
            field743 = arg0.getX();
            field744 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field740 != null) {
            field741 = 0;
        }
    }
}
