package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ai")
public class class49 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ai.s")
    public static class49 field454 = new class49();

    @ObfuscatedName("ai.e")
    public static volatile int field455 = 0;

    @ObfuscatedName("ai.a")
    public static volatile int field456 = 0;

    @ObfuscatedName("ai.c")
    public static volatile int field457 = -1;

    @ObfuscatedName("ai.p")
    public static volatile int field458 = -1;

    @ObfuscatedName("ai.r")
    public static volatile long field459 = -1L;

    @ObfuscatedName("ai.m")
    public static int field469 = 0;

    @ObfuscatedName("ai.d")
    public static int field461 = 0;

    @ObfuscatedName("ai.z")
    public static int field462 = 0;

    @ObfuscatedName("ai.x")
    public static long field460 = 0L;

    @ObfuscatedName("ai.v")
    public static volatile int field453 = 0;

    @ObfuscatedName("ai.g")
    public static volatile int field465 = 0;

    @ObfuscatedName("ai.j")
    public static volatile int field452 = 0;

    @ObfuscatedName("ai.b")
    public static volatile long field467 = 0L;

    @ObfuscatedName("ai.u")
    public static int field468 = 0;

    @ObfuscatedName("ai.t")
    public static int field466 = 0;

    @ObfuscatedName("ai.n")
    public static int field470 = 0;

    @ObfuscatedName("ai.h")
    public static long field471 = 0L;

    @ObfuscatedName("di.f(Ljava/awt/Component;I)V")
    public static void method2637(Component arg0) {
        arg0.addMouseListener(field454);
        arg0.addMouseMotionListener(field454);
        arg0.addFocusListener(field454);
    }

    @ObfuscatedName("fy.l(Ljava/awt/Component;I)V")
    public static void method3156(Component arg0) {
        arg0.removeMouseListener(field454);
        arg0.removeMouseMotionListener(field454);
        arg0.removeFocusListener(field454);
        field456 = 0;
    }

    @ObfuscatedName("ea.w(IB)V")
    public static void method2945(int arg0) {
        field455 = arg0;
    }

    @ObfuscatedName("ai.s(Ljava/awt/event/MouseEvent;I)I")
    public final int method863(MouseEvent arg0) {
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
        if (field454 != null) {
            field455 = 0;
            field465 = arg0.getX();
            field452 = arg0.getY();
            field467 = Statics.method1926();
            field453 = this.method863(arg0);
            if (field453 != 0) {
                field456 = field453;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field454 != null) {
            field455 = 0;
            field456 = 0;
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
        if (field454 != null) {
            field455 = 0;
            field457 = -1;
            field458 = -1;
            field459 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field454 != null) {
            field455 = 0;
            field457 = arg0.getX();
            field458 = arg0.getY();
            field459 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field454 != null) {
            field456 = 0;
        }
    }
}
