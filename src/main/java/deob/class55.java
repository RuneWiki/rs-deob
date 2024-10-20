package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bc")
public class class55 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bc.e")
    public static class55 field502 = new class55();

    @ObfuscatedName("bc.i")
    public static volatile int field483 = 0;

    @ObfuscatedName("bc.g")
    public static volatile int field479 = 0;

    @ObfuscatedName("bc.d")
    public static volatile int field485 = -1;

    @ObfuscatedName("bc.l")
    public static volatile int field486 = -1;

    @ObfuscatedName("bc.j")
    public static volatile long field487 = -1L;

    @ObfuscatedName("bc.m")
    public static int field490 = 0;

    @ObfuscatedName("bc.p")
    public static int field494 = 0;

    @ObfuscatedName("bc.h")
    public static int field492 = 0;

    @ObfuscatedName("bc.v")
    public static long field491 = 0L;

    @ObfuscatedName("bc.n")
    public static volatile int field482 = 0;

    @ObfuscatedName("bc.x")
    public static volatile int field493 = 0;

    @ObfuscatedName("bc.w")
    public static volatile int field488 = 0;

    @ObfuscatedName("bc.k")
    public static volatile long field495 = 0L;

    @ObfuscatedName("bc.q")
    public static int field496 = 0;

    @ObfuscatedName("bc.z")
    public static int field497 = 0;

    @ObfuscatedName("bc.y")
    public static int field489 = 0;

    @ObfuscatedName("bc.f")
    public static long field499 = 0L;

    @ObfuscatedName("fx.c(Ljava/awt/Component;I)V")
    public static void method3206(Component arg0) {
        arg0.addMouseListener(field502);
        arg0.addMouseMotionListener(field502);
        arg0.addFocusListener(field502);
    }

    @ObfuscatedName("ew.t(I)V")
    public static void method3177() {
        class55 var0 = field502;
        synchronized (field502) {
            field490 = field479;
            field494 = field485;
            field492 = field486;
            field491 = field487;
            field496 = field482;
            field497 = field493;
            field489 = field488;
            field499 = field495;
            field482 = 0;
        }
    }

    @ObfuscatedName("hf.o(I)I")
    public static int method3662() {
        return ++field483 - 1;
    }

    @ObfuscatedName("bc.e(Ljava/awt/event/MouseEvent;B)I")
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
        if (field502 != null) {
            field483 = 0;
            field493 = arg0.getX();
            field488 = arg0.getY();
            field495 = Statics.method184();
            field482 = this.method925(arg0);
            if (field482 != 0) {
                field479 = field482;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field502 != null) {
            field483 = 0;
            field479 = 0;
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
        if (field502 != null) {
            field483 = 0;
            field485 = -1;
            field486 = -1;
            field487 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field502 != null) {
            field483 = 0;
            field485 = arg0.getX();
            field486 = arg0.getY();
            field487 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field502 != null) {
            field479 = 0;
        }
    }
}
