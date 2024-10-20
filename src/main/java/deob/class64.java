package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bq")
public class class64 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bq.x")
    public static int field519 = 0;

    @ObfuscatedName("bq.k")
    public static int field518 = 0;

    @ObfuscatedName("bq.v")
    public static class64 field511 = new class64();

    @ObfuscatedName("bq.q")
    public static volatile int field512 = 0;

    @ObfuscatedName("bq.z")
    public static volatile int field513 = 0;

    @ObfuscatedName("bq.t")
    public static volatile int field514 = -1;

    @ObfuscatedName("bq.e")
    public static volatile int field529 = -1;

    @ObfuscatedName("bq.s")
    public static volatile long field524 = -1L;

    @ObfuscatedName("bq.p")
    public static int field522 = 0;

    @ObfuscatedName("bq.n")
    public static long field516 = 0L;

    @ObfuscatedName("bq.u")
    public static volatile int field527 = 0;

    @ObfuscatedName("bq.h")
    public static volatile int field508 = 0;

    @ObfuscatedName("bq.g")
    public static volatile int field523 = 0;

    @ObfuscatedName("bq.i")
    public static volatile long field520 = 0L;

    @ObfuscatedName("bq.a")
    public static int field525 = 0;

    @ObfuscatedName("bq.b")
    public static int field526 = 0;

    @ObfuscatedName("bq.l")
    public static int field521 = 0;

    @ObfuscatedName("bq.r")
    public static long field528 = 0L;

    @ObfuscatedName("a.x(Ljava/awt/Component;I)V")
    public static void method149(Component arg0) {
        arg0.addMouseListener(field511);
        arg0.addMouseMotionListener(field511);
        arg0.addFocusListener(field511);
    }

    @ObfuscatedName("lz.m(Ljava/awt/Component;B)V")
    public static void method5595(Component arg0) {
        arg0.removeMouseListener(field511);
        arg0.removeMouseMotionListener(field511);
        arg0.removeFocusListener(field511);
        field513 = 0;
    }

    @ObfuscatedName("cs.k(B)V")
    public static void method1936() {
        if (field511 != null) {
            class64 var0 = field511;
            synchronized (field511) {
                field511 = null;
            }
        }
    }

    @ObfuscatedName("bf.d(I)V")
    public static void method744() {
        class64 var0 = field511;
        synchronized (field511) {
            field522 = field513;
            field518 = field514;
            field519 = field529;
            field516 = field524;
            field525 = field527;
            field526 = field508;
            field521 = field523;
            field528 = field520;
            field527 = 0;
        }
    }

    @ObfuscatedName("gv.w(II)V")
    public static void method3364(int arg0) {
        field512 = arg0;
    }

    @ObfuscatedName("bq.v(Ljava/awt/event/MouseEvent;I)I")
    public final int method1006(MouseEvent arg0) {
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
        if (field511 != null) {
            field512 = 0;
            field508 = arg0.getX();
            field523 = arg0.getY();
            field520 = Statics.method3668();
            field527 = this.method1006(arg0);
            if (field527 != 0) {
                field513 = field527;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field511 != null) {
            field512 = 0;
            field513 = 0;
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
        if (field511 != null) {
            field512 = 0;
            field514 = -1;
            field529 = -1;
            field524 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field511 != null) {
            field512 = 0;
            field514 = arg0.getX();
            field529 = arg0.getY();
            field524 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field511 != null) {
            field513 = 0;
        }
    }
}
