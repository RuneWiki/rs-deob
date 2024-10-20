package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ar")
public class class48 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ar.p")
    public static class48 field341 = new class48();

    @ObfuscatedName("ar.b")
    public static volatile int field349 = 0;

    @ObfuscatedName("ar.e")
    public static volatile int field346 = 0;

    @ObfuscatedName("ar.k")
    public static int field342 = 0;

    @ObfuscatedName("ar.g")
    public static volatile int field344 = -1;

    @ObfuscatedName("ar.h")
    public static volatile int field345 = -1;

    @ObfuscatedName("ar.n")
    public static volatile long field354 = -1L;

    @ObfuscatedName("ar.l")
    public static int field347 = 0;

    @ObfuscatedName("ar.m")
    public static int field357 = 0;

    @ObfuscatedName("ar.d")
    public static long field350 = 0L;

    @ObfuscatedName("ar.c")
    public static volatile int field351 = 0;

    @ObfuscatedName("ar.j")
    public static volatile int field352 = 0;

    @ObfuscatedName("ar.r")
    public static volatile int field353 = 0;

    @ObfuscatedName("ar.q")
    public static volatile long field339 = 0L;

    @ObfuscatedName("ar.t")
    public static int field355 = 0;

    @ObfuscatedName("ar.v")
    public static int field343 = 0;

    @ObfuscatedName("ar.x")
    public static int field348 = 0;

    @ObfuscatedName("ar.z")
    public static long field358 = 0L;

    @ObfuscatedName("dz.f(Ljava/awt/Component;I)V")
    public static void method2133(Component arg0) {
        arg0.addMouseListener(field341);
        arg0.addMouseMotionListener(field341);
        arg0.addFocusListener(field341);
    }

    @ObfuscatedName("ey.o(Ljava/awt/Component;I)V")
    public static void method2363(Component arg0) {
        arg0.removeMouseListener(field341);
        arg0.removeMouseMotionListener(field341);
        arg0.removeFocusListener(field341);
        field346 = 0;
    }

    @ObfuscatedName("eh.u(B)V")
    public static void method2355() {
        if (field341 != null) {
            class48 var0 = field341;
            synchronized (field341) {
                field341 = null;
            }
        }
    }

    @ObfuscatedName("it.p(B)V")
    public static void method3873() {
        class48 var0 = field341;
        synchronized (field341) {
            field347 = field346;
            field342 = field344;
            field357 = field345;
            field350 = field354;
            field355 = field351;
            field343 = field352;
            field348 = field353;
            field358 = field339;
            field351 = 0;
        }
    }

    @ObfuscatedName("cy.b(I)I")
    public static int method1842() {
        return ++field349 - 1;
    }

    @ObfuscatedName("ar.e(Ljava/awt/event/MouseEvent;I)I")
    public final int method508(MouseEvent arg0) {
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
        if (field341 != null) {
            field349 = 0;
            field352 = arg0.getX();
            field353 = arg0.getY();
            field339 = class379.method1540();
            field351 = this.method508(arg0);
            if (field351 != 0) {
                field346 = field351;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field341 != null) {
            field349 = 0;
            field346 = 0;
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
        if (field341 != null) {
            field349 = 0;
            field344 = -1;
            field345 = -1;
            field354 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field341 != null) {
            field349 = 0;
            field344 = arg0.getX();
            field345 = arg0.getY();
            field354 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field341 != null) {
            field346 = 0;
        }
    }
}
