package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bm")
public class class61 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bm.r")
    public static class61 field717 = new class61();

    @ObfuscatedName("bm.e")
    public static volatile int field714 = 0;

    @ObfuscatedName("bm.y")
    public static volatile int field730 = 0;

    @ObfuscatedName("bm.k")
    public static int field723 = 0;

    @ObfuscatedName("bm.s")
    public static volatile int field719 = 0;

    @ObfuscatedName("bm.p")
    public static volatile int field720 = -1;

    @ObfuscatedName("bm.x")
    public static int field715 = 0;

    @ObfuscatedName("bm.m")
    public static volatile int field721 = -1;

    @ObfuscatedName("bm.h")
    public static int field718 = 0;

    @ObfuscatedName("bm.t")
    public static volatile int field726 = 0;

    @ObfuscatedName("bm.i")
    public static volatile int field727 = 0;

    @ObfuscatedName("bm.u")
    public static volatile long field725 = 0L;

    @ObfuscatedName("bm.q")
    public static int field729 = 0;

    @ObfuscatedName("bm.v")
    public static int field722 = 0;

    @ObfuscatedName("bm.f")
    public static int field728 = 0;

    @ObfuscatedName("bm.b")
    public static long field732 = 0L;

    @ObfuscatedName("ey.d(Ljava/awt/Component;I)V")
    public static void method2894(Component arg0) {
        arg0.addMouseListener(field717);
        arg0.addMouseMotionListener(field717);
        arg0.addFocusListener(field717);
    }

    @ObfuscatedName("c.z(Ljava/awt/Component;I)V")
    public static void method139(Component arg0) {
        arg0.removeMouseListener(field717);
        arg0.removeMouseMotionListener(field717);
        arg0.removeFocusListener(field717);
        field719 = 0;
    }

    @ObfuscatedName("jg.n(I)I")
    public static int method4854() {
        return ++field714 - 1;
    }

    @ObfuscatedName("bt.r(II)V")
    public static void method880(int arg0) {
        field714 = arg0;
    }

    @ObfuscatedName("bm.e(Ljava/awt/event/MouseEvent;I)I")
    public final int method883(MouseEvent arg0) {
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
        if (field717 != null) {
            field714 = 0;
            field726 = arg0.getX();
            field727 = arg0.getY();
            field725 = class197.method1501();
            field730 = this.method883(arg0);
            if (field730 != 0) {
                field719 = field730;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field717 != null) {
            field714 = 0;
            field719 = 0;
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
        if (field717 != null) {
            field714 = 0;
            field720 = arg0.getX();
            field721 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field717 != null) {
            field714 = 0;
            field720 = -1;
            field721 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field717 != null) {
            field714 = 0;
            field720 = arg0.getX();
            field721 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field717 != null) {
            field714 = 0;
            field720 = arg0.getX();
            field721 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field717 != null) {
            field719 = 0;
        }
    }
}
