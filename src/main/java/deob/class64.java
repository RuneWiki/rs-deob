package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bc")
public class class64 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bc.j")
    public static class64 field501 = new class64();

    @ObfuscatedName("bc.p")
    public static volatile int field502 = 0;

    @ObfuscatedName("bc.g")
    public static volatile int field519 = 0;

    @ObfuscatedName("bc.n")
    public static volatile int field516 = -1;

    @ObfuscatedName("bc.u")
    public static volatile int field512 = -1;

    @ObfuscatedName("bc.a")
    public static volatile long field506 = -1L;

    @ObfuscatedName("bc.z")
    public static int field507 = 0;

    @ObfuscatedName("bc.w")
    public static int field508 = 0;

    @ObfuscatedName("bc.y")
    public static long field510 = 0L;

    @ObfuscatedName("bc.c")
    public static int field498 = 0;

    @ObfuscatedName("bc.h")
    public static volatile int field511 = 0;

    @ObfuscatedName("bc.k")
    public static volatile int field503 = 0;

    @ObfuscatedName("bc.r")
    public static volatile int field520 = 0;

    @ObfuscatedName("bc.s")
    public static volatile long field514 = 0L;

    @ObfuscatedName("bc.v")
    public static int field515 = 0;

    @ObfuscatedName("bc.d")
    public static int field505 = 0;

    @ObfuscatedName("bc.e")
    public static int field504 = 0;

    @ObfuscatedName("bc.l")
    public static long field518 = 0L;

    @ObfuscatedName("ax.m(Ljava/awt/Component;I)V")
    public static void method305(Component arg0) {
        arg0.addMouseListener(field501);
        arg0.addMouseMotionListener(field501);
        arg0.addFocusListener(field501);
    }

    @ObfuscatedName("ft.o(I)V")
    public static void method3188() {
        if (field501 != null) {
            class64 var0 = field501;
            synchronized (field501) {
                field501 = null;
            }
        }
    }

    @ObfuscatedName("bc.j(Ljava/awt/event/MouseEvent;I)I")
    public final int method959(MouseEvent arg0) {
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
        if (field501 != null) {
            field502 = 0;
            field503 = arg0.getX();
            field520 = arg0.getY();
            field514 = class307.method3253();
            field511 = this.method959(arg0);
            if (field511 != 0) {
                field519 = field511;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field501 != null) {
            field502 = 0;
            field519 = 0;
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
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field501 != null) {
            field502 = 0;
            field516 = -1;
            field512 = -1;
            field506 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field501 != null) {
            field502 = 0;
            field516 = arg0.getX();
            field512 = arg0.getY();
            field506 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field501 != null) {
            field519 = 0;
        }
    }
}
