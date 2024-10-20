package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bx")
public class class55 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bx.g")
    public static class55 field475 = new class55();

    @ObfuscatedName("bx.z")
    public static volatile int field476 = 0;

    @ObfuscatedName("bx.p")
    public static volatile int field477 = 0;

    @ObfuscatedName("bx.h")
    public static volatile int field478 = -1;

    @ObfuscatedName("bx.y")
    public static long field480 = 0L;

    @ObfuscatedName("bx.w")
    public static volatile int field479 = -1;

    @ObfuscatedName("bx.i")
    public static volatile long field488 = -1L;

    @ObfuscatedName("bx.k")
    public static int field473 = 0;

    @ObfuscatedName("bx.x")
    public static int field483 = 0;

    @ObfuscatedName("bx.o")
    public static int field489 = 0;

    @ObfuscatedName("bx.e")
    public static volatile int field485 = 0;

    @ObfuscatedName("bx.n")
    public static volatile int field486 = 0;

    @ObfuscatedName("bx.r")
    public static volatile int field487 = 0;

    @ObfuscatedName("bx.c")
    public static volatile long field472 = 0L;

    @ObfuscatedName("bx.a")
    public static int field482 = 0;

    @ObfuscatedName("bx.d")
    public static int field490 = 0;

    @ObfuscatedName("bx.s")
    public static int field491 = 0;

    @ObfuscatedName("bx.t")
    public static long field492 = 0L;

    @ObfuscatedName("ia.u(Ljava/awt/Component;B)V")
    public static void method4079(Component arg0) {
        arg0.addMouseListener(field475);
        arg0.addMouseMotionListener(field475);
        arg0.addFocusListener(field475);
    }

    @ObfuscatedName("hn.f(B)V")
    public static void method3664() {
        if (field475 != null) {
            class55 var0 = field475;
            synchronized (field475) {
                field475 = null;
            }
        }
    }

    @ObfuscatedName("z.b(II)V")
    public static void method43(int arg0) {
        field476 = arg0;
    }

    @ObfuscatedName("bx.g(Ljava/awt/event/MouseEvent;I)I")
    public final int method925(MouseEvent arg0) {
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
        if (field475 != null) {
            field476 = 0;
            field486 = arg0.getX();
            field487 = arg0.getY();
            field472 = class297.method3217();
            field485 = this.method925(arg0);
            if (field485 != 0) {
                field477 = field485;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field475 != null) {
            field476 = 0;
            field477 = 0;
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
        if (field475 != null) {
            field476 = 0;
            field478 = -1;
            field479 = -1;
            field488 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field475 != null) {
            field476 = 0;
            field478 = arg0.getX();
            field479 = arg0.getY();
            field488 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field475 != null) {
            field477 = 0;
        }
    }
}
