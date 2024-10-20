package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ac")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ac.f")
    public static class33 field217 = new class33();

    @ObfuscatedName("ac.j")
    public static volatile int field224 = 0;

    @ObfuscatedName("ac.e")
    public static volatile int field219 = 0;

    @ObfuscatedName("ac.g")
    public static volatile int field236 = -1;

    @ObfuscatedName("ac.w")
    public static volatile int field221 = -1;

    @ObfuscatedName("ac.y")
    public static long field215 = 0L;

    @ObfuscatedName("ac.i")
    public static volatile long field222 = -1L;

    @ObfuscatedName("ac.s")
    public static int field234 = 0;

    @ObfuscatedName("ac.t")
    public static int field223 = 0;

    @ObfuscatedName("ac.z")
    public static int field225 = 0;

    @ObfuscatedName("ac.r")
    public static volatile int field227 = 0;

    @ObfuscatedName("ac.u")
    public static volatile int field228 = 0;

    @ObfuscatedName("ac.k")
    public static volatile int field220 = 0;

    @ObfuscatedName("ac.h")
    public static volatile long field230 = 0L;

    @ObfuscatedName("ac.x")
    public static int field231 = 0;

    @ObfuscatedName("ac.l")
    public static int field232 = 0;

    @ObfuscatedName("ac.a")
    public static int field233 = 0;

    @ObfuscatedName("ac.p")
    public static long field229 = 0L;

    @ObfuscatedName("co.c(B)V")
    public static void method2254() {
        if (field217 != null) {
            class33 var0 = field217;
            synchronized (field217) {
                field217 = null;
            }
        }
    }

    @ObfuscatedName("lp.v(II)V")
    public static void method5496(int arg0) {
        field224 = arg0;
    }

    @ObfuscatedName("ac.q(Ljava/awt/event/MouseEvent;I)I")
    public final int method522(MouseEvent arg0) {
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
        if (field217 != null) {
            field224 = 0;
            field228 = arg0.getX();
            field220 = arg0.getY();
            field230 = class269.method2567();
            field227 = this.method522(arg0);
            if (field227 != 0) {
                field219 = field227;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field217 != null) {
            field224 = 0;
            field219 = 0;
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
        if (field217 != null) {
            field224 = 0;
            field236 = -1;
            field221 = -1;
            field222 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field217 != null) {
            field224 = 0;
            field236 = arg0.getX();
            field221 = arg0.getY();
            field222 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field217 != null) {
            field219 = 0;
        }
    }
}
