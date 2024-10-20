package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bo")
public class class55 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bo.k")
    public static int field464 = 0;

    @ObfuscatedName("bo.u")
    public static class55 field453 = new class55();

    @ObfuscatedName("bo.n")
    public static volatile int field454 = 0;

    @ObfuscatedName("bo.t")
    public static volatile int field466 = 0;

    @ObfuscatedName("bo.q")
    public static volatile int field456 = -1;

    @ObfuscatedName("bo.x")
    public static int field461 = 0;

    @ObfuscatedName("bo.d")
    public static volatile int field457 = -1;

    @ObfuscatedName("bo.f")
    public static volatile long field458 = -1L;

    @ObfuscatedName("bo.c")
    public static int field459 = 0;

    @ObfuscatedName("bo.r")
    public static long field463 = 0L;

    @ObfuscatedName("bo.y")
    public static volatile int field467 = 0;

    @ObfuscatedName("bo.p")
    public static volatile int field450 = 0;

    @ObfuscatedName("bo.b")
    public static volatile int field465 = 0;

    @ObfuscatedName("bo.g")
    public static volatile long field460 = 0L;

    @ObfuscatedName("bo.e")
    public static int field462 = 0;

    @ObfuscatedName("bo.z")
    public static int field468 = 0;

    @ObfuscatedName("bo.a")
    public static int field469 = 0;

    @ObfuscatedName("bo.w")
    public static long field470 = 0L;

    @ObfuscatedName("cm.s(Ljava/awt/Component;B)V")
    public static void method1936(Component arg0) {
        arg0.addMouseListener(field453);
        arg0.addMouseMotionListener(field453);
        arg0.addFocusListener(field453);
    }

    @ObfuscatedName("gc.j(Ljava/awt/Component;S)V")
    public static void method3380(Component arg0) {
        arg0.removeMouseListener(field453);
        arg0.removeMouseMotionListener(field453);
        arg0.removeFocusListener(field453);
        field466 = 0;
    }

    @ObfuscatedName("gm.i(I)V")
    public static void method3372() {
        class55 var0 = field453;
        synchronized (field453) {
            field459 = field466;
            field464 = field456;
            field461 = field457;
            field463 = field458;
            field462 = field467;
            field468 = field450;
            field469 = field465;
            field470 = field460;
            field467 = 0;
        }
    }

    @ObfuscatedName("bo.u(Ljava/awt/event/MouseEvent;S)I")
    public final int method885(MouseEvent arg0) {
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
        if (field453 != null) {
            field454 = 0;
            field450 = arg0.getX();
            field465 = arg0.getY();
            field460 = class297.method4369();
            field467 = this.method885(arg0);
            if (field467 != 0) {
                field466 = field467;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field453 != null) {
            field454 = 0;
            field466 = 0;
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
        if (field453 != null) {
            field454 = 0;
            field456 = -1;
            field457 = -1;
            field458 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field453 != null) {
            field454 = 0;
            field456 = arg0.getX();
            field457 = arg0.getY();
            field458 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field453 != null) {
            field466 = 0;
        }
    }
}
