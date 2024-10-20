package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bt")
public class class64 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bt.m")
    public static class64 field527 = new class64();

    @ObfuscatedName("bt.z")
    public static volatile int field507 = 0;

    @ObfuscatedName("bt.q")
    public static volatile int field508 = 0;

    @ObfuscatedName("bt.k")
    public static int field510 = 0;

    @ObfuscatedName("bt.c")
    public static volatile int field519 = -1;

    @ObfuscatedName("bt.u")
    public static volatile int field503 = -1;

    @ObfuscatedName("bt.t")
    public static volatile long field511 = -1L;

    @ObfuscatedName("bt.e")
    public static int field512 = 0;

    @ObfuscatedName("bt.o")
    public static int field514 = 0;

    @ObfuscatedName("bt.n")
    public static long field515 = 0L;

    @ObfuscatedName("bt.x")
    public static volatile int field516 = 0;

    @ObfuscatedName("bt.p")
    public static volatile int field517 = 0;

    @ObfuscatedName("bt.r")
    public static volatile int field518 = 0;

    @ObfuscatedName("bt.y")
    public static volatile long field506 = 0L;

    @ObfuscatedName("bt.s")
    public static int field520 = 0;

    @ObfuscatedName("bt.j")
    public static int field525 = 0;

    @ObfuscatedName("bt.w")
    public static int field522 = 0;

    @ObfuscatedName("bt.v")
    public static long field523 = 0L;

    @ObfuscatedName("du.f(Ljava/awt/Component;I)V")
    public static void method2634(Component arg0) {
        arg0.addMouseListener(field527);
        arg0.addMouseMotionListener(field527);
        arg0.addFocusListener(field527);
    }

    @ObfuscatedName("ca.b(I)V")
    public static void method1958() {
        if (field527 != null) {
            class64 var0 = field527;
            synchronized (field527) {
                field527 = null;
            }
        }
    }

    @ObfuscatedName("hc.l(II)V")
    public static void method3868(int arg0) {
        field507 = arg0;
    }

    @ObfuscatedName("bt.m(Ljava/awt/event/MouseEvent;I)I")
    public final int method982(MouseEvent arg0) {
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
        if (field527 != null) {
            field507 = 0;
            field517 = arg0.getX();
            field518 = arg0.getY();
            field506 = class308.method4786();
            field516 = this.method982(arg0);
            if (field516 != 0) {
                field508 = field516;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field527 != null) {
            field507 = 0;
            field508 = 0;
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
        if (field527 != null) {
            field507 = 0;
            field519 = -1;
            field503 = -1;
            field511 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field527 != null) {
            field507 = 0;
            field519 = arg0.getX();
            field503 = arg0.getY();
            field511 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field527 != null) {
            field508 = 0;
        }
    }
}
