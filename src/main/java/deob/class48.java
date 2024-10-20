package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ai")
public class class48 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ai.y")
    public static long field363 = 0L;

    @ObfuscatedName("ai.j")
    public static class48 field354 = new class48();

    @ObfuscatedName("ai.o")
    public static volatile int field355 = 0;

    @ObfuscatedName("ai.m")
    public static volatile int field369 = 0;

    @ObfuscatedName("ai.r")
    public static volatile int field357 = -1;

    @ObfuscatedName("ai.h")
    public static volatile int field358 = -1;

    @ObfuscatedName("ai.d")
    public static volatile long field367 = -1L;

    @ObfuscatedName("ai.z")
    public static int field360 = 0;

    @ObfuscatedName("ai.b")
    public static int field368 = 0;

    @ObfuscatedName("ai.i")
    public static int field362 = 0;

    @ObfuscatedName("ai.k")
    public static volatile int field364 = 0;

    @ObfuscatedName("ai.g")
    public static volatile int field365 = 0;

    @ObfuscatedName("ai.t")
    public static volatile int field366 = 0;

    @ObfuscatedName("ai.x")
    public static volatile long field370 = 0L;

    @ObfuscatedName("ai.u")
    public static int field356 = 0;

    @ObfuscatedName("ai.q")
    public static int field361 = 0;

    @ObfuscatedName("ai.s")
    public static int field352 = 0;

    @ObfuscatedName("ai.p")
    public static long field371 = 0L;

    @ObfuscatedName("hg.f(Ljava/awt/Component;I)V")
    public static void method4006(Component arg0) {
        arg0.addMouseListener(field354);
        arg0.addMouseMotionListener(field354);
        arg0.addFocusListener(field354);
    }

    @ObfuscatedName("ab.e(B)V")
    public static void method243() {
        class48 var0 = field354;
        synchronized (field354) {
            field360 = field369;
            field368 = field357;
            field362 = field358;
            field363 = field367;
            field356 = field364;
            field361 = field365;
            field352 = field366;
            field371 = field370;
            field364 = 0;
        }
    }

    @ObfuscatedName("b.v(I)I")
    public static int method151() {
        return ++field355 - 1;
    }

    @ObfuscatedName("ai.y(Ljava/awt/event/MouseEvent;I)I")
    public final int method556(MouseEvent arg0) {
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
        if (field354 != null) {
            field355 = 0;
            field365 = arg0.getX();
            field366 = arg0.getY();
            field370 = class381.method4000();
            field364 = this.method556(arg0);
            if (field364 != 0) {
                field369 = field364;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field354 != null) {
            field355 = 0;
            field369 = 0;
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
        if (field354 != null) {
            field355 = 0;
            field357 = -1;
            field358 = -1;
            field367 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field354 != null) {
            field355 = 0;
            field357 = arg0.getX();
            field358 = arg0.getY();
            field367 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field354 != null) {
            field369 = 0;
        }
    }
}
