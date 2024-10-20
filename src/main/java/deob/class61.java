package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bs")
public class class61 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bs.a")
    public static class61 field680 = new class61();

    @ObfuscatedName("bs.l")
    public static volatile int field696 = 0;

    @ObfuscatedName("bs.b")
    public static volatile int field691 = 0;

    @ObfuscatedName("bs.e")
    public static volatile int field682 = -1;

    @ObfuscatedName("bs.x")
    public static int field686 = 0;

    @ObfuscatedName("bs.p")
    public static volatile int field683 = -1;

    @ObfuscatedName("bs.g")
    public static int field684 = 0;

    @ObfuscatedName("bs.n")
    public static int field685 = 0;

    @ObfuscatedName("bs.o")
    public static volatile int field687 = 0;

    @ObfuscatedName("bs.c")
    public static volatile int field681 = 0;

    @ObfuscatedName("bs.v")
    public static volatile int field689 = 0;

    @ObfuscatedName("bs.u")
    public static volatile long field690 = 0L;

    @ObfuscatedName("bs.j")
    public static int field679 = 0;

    @ObfuscatedName("bs.k")
    public static int field692 = 0;

    @ObfuscatedName("bs.z")
    public static int field693 = 0;

    @ObfuscatedName("bs.w")
    public static long field694 = 0L;

    @ObfuscatedName("ad.t(Ljava/awt/Component;I)V")
    public static void method717(Component arg0) {
        arg0.addMouseListener(field680);
        arg0.addMouseMotionListener(field680);
        arg0.addFocusListener(field680);
    }

    @ObfuscatedName("d.q(B)V")
    public static void method152() {
        class61 var0 = field680;
        synchronized (field680) {
            field684 = field691;
            field685 = field682;
            field686 = field683;
            field679 = field687;
            field692 = field681;
            field693 = field689;
            field694 = field690;
            field687 = 0;
        }
    }

    @ObfuscatedName("ap.i(II)V")
    public static void method339(int arg0) {
        field696 = arg0;
    }

    @ObfuscatedName("bs.a(Ljava/awt/event/MouseEvent;I)I")
    public final int method944(MouseEvent arg0) {
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
        if (field680 != null) {
            field696 = 0;
            field681 = arg0.getX();
            field689 = arg0.getY();
            field690 = Statics.method426();
            field687 = this.method944(arg0);
            if (field687 != 0) {
                field691 = field687;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field680 != null) {
            field696 = 0;
            field691 = 0;
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
        if (field680 != null) {
            field696 = 0;
            field682 = arg0.getX();
            field683 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field680 != null) {
            field696 = 0;
            field682 = -1;
            field683 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field680 != null) {
            field696 = 0;
            field682 = arg0.getX();
            field683 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field680 != null) {
            field696 = 0;
            field682 = arg0.getX();
            field683 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field680 != null) {
            field691 = 0;
        }
    }
}
