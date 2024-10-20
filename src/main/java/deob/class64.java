package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("be")
public class class64 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("be.k")
    public static int field504 = 0;

    @ObfuscatedName("be.i")
    public static class64 field507 = new class64();

    @ObfuscatedName("be.o")
    public static volatile int field498 = 0;

    @ObfuscatedName("be.x")
    public static int field505 = 0;

    @ObfuscatedName("be.w")
    public static volatile int field499 = 0;

    @ObfuscatedName("be.g")
    public static volatile int field500 = -1;

    @ObfuscatedName("be.m")
    public static volatile int field501 = -1;

    @ObfuscatedName("be.n")
    public static volatile long field514 = -1L;

    @ObfuscatedName("be.d")
    public static int field503 = 0;

    @ObfuscatedName("be.h")
    public static long field506 = 0L;

    @ObfuscatedName("be.a")
    public static volatile int field511 = 0;

    @ObfuscatedName("be.q")
    public static volatile int field508 = 0;

    @ObfuscatedName("be.c")
    public static volatile int field502 = 0;

    @ObfuscatedName("be.f")
    public static volatile long field510 = 0L;

    @ObfuscatedName("be.y")
    public static int field496 = 0;

    @ObfuscatedName("be.v")
    public static int field512 = 0;

    @ObfuscatedName("be.j")
    public static int field513 = 0;

    @ObfuscatedName("be.r")
    public static long field495 = 0L;

    @ObfuscatedName("u.z(Ljava/awt/Component;I)V")
    public static void method208(Component arg0) {
        arg0.addMouseListener(field507);
        arg0.addMouseMotionListener(field507);
        arg0.addFocusListener(field507);
    }

    @ObfuscatedName("dx.s(I)V")
    public static void method2169() {
        if (field507 != null) {
            class64 var0 = field507;
            synchronized (field507) {
                field507 = null;
            }
        }
    }

    @ObfuscatedName("ex.t(I)V")
    public static void method3150() {
        class64 var0 = field507;
        synchronized (field507) {
            field503 = field499;
            field504 = field500;
            field505 = field501;
            field506 = field514;
            field496 = field511;
            field512 = field508;
            field513 = field502;
            field495 = field510;
            field511 = 0;
        }
    }

    @ObfuscatedName("be.i(Ljava/awt/event/MouseEvent;B)I")
    public final int method967(MouseEvent arg0) {
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
        if (field507 != null) {
            field498 = 0;
            field508 = arg0.getX();
            field502 = arg0.getY();
            field510 = class307.method2184();
            field511 = this.method967(arg0);
            if (field511 != 0) {
                field499 = field511;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field507 != null) {
            field498 = 0;
            field499 = 0;
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
        if (field507 != null) {
            field498 = 0;
            field500 = -1;
            field501 = -1;
            field514 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field507 != null) {
            field498 = 0;
            field500 = arg0.getX();
            field501 = arg0.getY();
            field514 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field507 != null) {
            field499 = 0;
        }
    }
}
