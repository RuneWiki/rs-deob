package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bi")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bi.o")
    public static class60 field752 = new class60();

    @ObfuscatedName("bi.g")
    public static volatile int field746 = 0;

    @ObfuscatedName("bi.v")
    public static volatile int field761 = 0;

    @ObfuscatedName("bi.p")
    public static volatile int field748 = -1;

    @ObfuscatedName("bi.e")
    public static volatile int field747 = -1;

    @ObfuscatedName("bi.d")
    public static int field751 = 0;

    @ObfuscatedName("bi.x")
    public static int field742 = 0;

    @ObfuscatedName("bi.z")
    public static int field757 = 0;

    @ObfuscatedName("bi.n")
    public static volatile int field753 = 0;

    @ObfuscatedName("bi.u")
    public static volatile int field754 = 0;

    @ObfuscatedName("bi.t")
    public static volatile int field745 = 0;

    @ObfuscatedName("bi.a")
    public static volatile long field756 = 0L;

    @ObfuscatedName("bi.i")
    public static int field744 = 0;

    @ObfuscatedName("bi.h")
    public static int field758 = 0;

    @ObfuscatedName("bi.b")
    public static int field759 = 0;

    @ObfuscatedName("bi.j")
    public static long field760 = 0L;

    @ObfuscatedName("fq.w(Ljava/awt/Component;I)V")
    public static void method2876(Component arg0) {
        arg0.addMouseListener(field752);
        arg0.addMouseMotionListener(field752);
        arg0.addFocusListener(field752);
    }

    @ObfuscatedName("h.s(Ljava/awt/Component;I)V")
    public static void method101(Component arg0) {
        arg0.removeMouseListener(field752);
        arg0.removeMouseMotionListener(field752);
        arg0.removeFocusListener(field752);
        field761 = 0;
    }

    @ObfuscatedName("fd.q(II)V")
    public static void method3206(int arg0) {
        field746 = arg0;
    }

    @ObfuscatedName("bi.o(Ljava/awt/event/MouseEvent;I)I")
    public final int method929(MouseEvent arg0) {
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
        if (field752 != null) {
            field746 = 0;
            field754 = arg0.getX();
            field745 = arg0.getY();
            field756 = class176.method3200();
            field753 = this.method929(arg0);
            if (field753 != 0) {
                field761 = field753;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field752 != null) {
            field746 = 0;
            field761 = 0;
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
        if (field752 != null) {
            field746 = 0;
            field748 = arg0.getX();
            field747 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field752 != null) {
            field746 = 0;
            field748 = -1;
            field747 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field752 != null) {
            field746 = 0;
            field748 = arg0.getX();
            field747 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field752 != null) {
            field746 = 0;
            field748 = arg0.getX();
            field747 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field752 != null) {
            field761 = 0;
        }
    }
}
