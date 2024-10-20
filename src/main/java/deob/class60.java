package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("br")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("br.r")
    public static class60 field744 = new class60();

    @ObfuscatedName("br.o")
    public static volatile int field742 = 0;

    @ObfuscatedName("br.n")
    public static volatile int field745 = 0;

    @ObfuscatedName("br.q")
    public static volatile int field741 = -1;

    @ObfuscatedName("br.b")
    public static volatile int field758 = -1;

    @ObfuscatedName("br.k")
    public static int field753 = 0;

    @ObfuscatedName("br.s")
    public static int field746 = 0;

    @ObfuscatedName("br.d")
    public static int field748 = 0;

    @ObfuscatedName("br.l")
    public static volatile int field749 = 0;

    @ObfuscatedName("br.t")
    public static volatile int field750 = 0;

    @ObfuscatedName("br.y")
    public static volatile int field751 = 0;

    @ObfuscatedName("br.v")
    public static volatile long field752 = 0L;

    @ObfuscatedName("br.c")
    public static int field755 = 0;

    @ObfuscatedName("br.z")
    public static int field754 = 0;

    @ObfuscatedName("br.u")
    public static int field740 = 0;

    @ObfuscatedName("br.e")
    public static long field756 = 0L;

    @ObfuscatedName("io.i(Ljava/awt/Component;I)V")
    public static void method3951(Component arg0) {
        arg0.addMouseListener(field744);
        arg0.addMouseMotionListener(field744);
        arg0.addFocusListener(field744);
    }

    @ObfuscatedName("hh.j(Ljava/awt/Component;I)V")
    public static void method3654(Component arg0) {
        arg0.removeMouseListener(field744);
        arg0.removeMouseMotionListener(field744);
        arg0.removeFocusListener(field744);
        field745 = 0;
    }

    @ObfuscatedName("as.a(I)V")
    public static void method650() {
        class60 var0 = field744;
        synchronized (field744) {
            field746 = field745;
            field753 = field741;
            field748 = field758;
            field755 = field749;
            field754 = field750;
            field740 = field751;
            field756 = field752;
            field749 = 0;
        }
    }

    @ObfuscatedName("cb.r(II)V")
    public static void method1613(int arg0) {
        field742 = arg0;
    }

    @ObfuscatedName("br.o(Ljava/awt/event/MouseEvent;I)I")
    public final int method918(MouseEvent arg0) {
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
        if (field744 != null) {
            field742 = 0;
            field750 = arg0.getX();
            field751 = arg0.getY();
            field752 = class177.method608();
            field749 = this.method918(arg0);
            if (field749 != 0) {
                field745 = field749;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field744 != null) {
            field742 = 0;
            field745 = 0;
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
        if (field744 != null) {
            field742 = 0;
            field741 = arg0.getX();
            field758 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field744 != null) {
            field742 = 0;
            field741 = -1;
            field758 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field744 != null) {
            field742 = 0;
            field741 = arg0.getX();
            field758 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field744 != null) {
            field742 = 0;
            field741 = arg0.getX();
            field758 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field744 != null) {
            field745 = 0;
        }
    }
}
