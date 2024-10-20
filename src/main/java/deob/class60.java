package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("be")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("be.g")
    public static class60 field676 = new class60();

    @ObfuscatedName("be.x")
    public static int field677 = 0;

    @ObfuscatedName("be.f")
    public static volatile int field679 = 0;

    @ObfuscatedName("be.u")
    public static volatile int field678 = 0;

    @ObfuscatedName("be.t")
    public static volatile int field683 = -1;

    @ObfuscatedName("be.k")
    public static int field682 = 0;

    @ObfuscatedName("be.n")
    public static volatile int field681 = -1;

    @ObfuscatedName("be.d")
    public static int field690 = 0;

    @ObfuscatedName("be.o")
    public static volatile int field684 = 0;

    @ObfuscatedName("be.a")
    public static volatile int field685 = 0;

    @ObfuscatedName("be.q")
    public static volatile int field692 = 0;

    @ObfuscatedName("be.j")
    public static volatile long field687 = 0L;

    @ObfuscatedName("be.m")
    public static int field688 = 0;

    @ObfuscatedName("be.h")
    public static int field675 = 0;

    @ObfuscatedName("be.c")
    public static int field689 = 0;

    @ObfuscatedName("be.y")
    public static long field691 = 0L;

    @ObfuscatedName("bm.b(Ljava/awt/Component;B)V")
    public static void method967(Component arg0) {
        arg0.addMouseListener(field676);
        arg0.addMouseMotionListener(field676);
        arg0.addFocusListener(field676);
    }

    @ObfuscatedName("be.s(Ljava/awt/event/MouseEvent;I)I")
    public final int method855(MouseEvent arg0) {
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
        if (field676 != null) {
            field679 = 0;
            field685 = arg0.getX();
            field692 = arg0.getY();
            field687 = class183.method1711();
            field684 = this.method855(arg0);
            if (field684 != 0) {
                field678 = field684;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field676 != null) {
            field679 = 0;
            field678 = 0;
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
        if (field676 != null) {
            field679 = 0;
            field683 = arg0.getX();
            field681 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field676 != null) {
            field679 = 0;
            field683 = -1;
            field681 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field676 != null) {
            field679 = 0;
            field683 = arg0.getX();
            field681 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field676 != null) {
            field679 = 0;
            field683 = arg0.getX();
            field681 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field676 != null) {
            field678 = 0;
        }
    }
}
