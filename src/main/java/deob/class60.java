package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bn")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bn.r")
    public static class60 field717 = new class60();

    @ObfuscatedName("bn.v")
    public static volatile int field718 = 0;

    @ObfuscatedName("bn.e")
    public static volatile int field719 = 0;

    @ObfuscatedName("bn.l")
    public static volatile int field720 = -1;

    @ObfuscatedName("bn.s")
    public static volatile int field721 = -1;

    @ObfuscatedName("bn.w")
    public static int field722 = 0;

    @ObfuscatedName("bn.p")
    public static int field723 = 0;

    @ObfuscatedName("bn.m")
    public static int field724 = 0;

    @ObfuscatedName("bn.u")
    public static volatile int field716 = 0;

    @ObfuscatedName("bn.g")
    public static volatile int field726 = 0;

    @ObfuscatedName("bn.k")
    public static volatile int field727 = 0;

    @ObfuscatedName("bn.t")
    public static volatile long field715 = 0L;

    @ObfuscatedName("bn.c")
    public static int field729 = 0;

    @ObfuscatedName("bn.o")
    public static int field736 = 0;

    @ObfuscatedName("bn.x")
    public static int field731 = 0;

    @ObfuscatedName("bn.f")
    public static long field730 = 0L;

    @ObfuscatedName("ei.a(Ljava/awt/Component;I)V")
    public static void method2268(Component arg0) {
        arg0.removeMouseListener(field717);
        arg0.removeMouseMotionListener(field717);
        arg0.removeFocusListener(field717);
        field719 = 0;
    }

    @ObfuscatedName("bt.j(B)V")
    public static void method969() {
        if (field717 != null) {
            class60 var0 = field717;
            synchronized (field717) {
                field717 = null;
            }
        }
    }

    @ObfuscatedName("w.n(I)I")
    public static int method42() {
        return ++field718 - 1;
    }

    @ObfuscatedName("bn.r(Ljava/awt/event/MouseEvent;B)I")
    public final int method911(MouseEvent arg0) {
        int var2 = arg0.getButton();
        if (var2 == 1) {
            if (arg0.isMetaDown()) {
                return 2;
            } else if (arg0.isAltDown()) {
                return 4;
            } else {
                return 1;
            }
        } else if (var2 == 2) {
            return 4;
        } else if (var2 == 3) {
            return 2;
        } else {
            return 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field717 != null) {
            field718 = 0;
            field726 = arg0.getX();
            field727 = arg0.getY();
            field715 = class176.method584();
            field716 = this.method911(arg0);
            if (field716 != 0) {
                field719 = field716;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field717 != null) {
            field718 = 0;
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
            field718 = 0;
            field720 = arg0.getX();
            field721 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field717 != null) {
            field718 = 0;
            field720 = -1;
            field721 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field717 != null) {
            field718 = 0;
            field720 = arg0.getX();
            field721 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field717 != null) {
            field718 = 0;
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
