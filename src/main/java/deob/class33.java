package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("aa")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("aa.e")
    public static class33 field228 = new class33();

    @ObfuscatedName("aa.r")
    public static volatile int field222 = 0;

    @ObfuscatedName("aa.o")
    public static volatile int field234 = 0;

    @ObfuscatedName("aa.i")
    public static volatile int field224 = -1;

    @ObfuscatedName("aa.w")
    public static volatile int field240 = -1;

    @ObfuscatedName("aa.v")
    public static volatile long field220 = -1L;

    @ObfuscatedName("aa.a")
    public static int field227 = 0;

    @ObfuscatedName("aa.y")
    public static long field231 = 0L;

    @ObfuscatedName("aa.u")
    public static int field223 = 0;

    @ObfuscatedName("aa.h")
    public static int field229 = 0;

    @ObfuscatedName("aa.q")
    public static volatile int field221 = 0;

    @ObfuscatedName("aa.x")
    public static volatile int field232 = 0;

    @ObfuscatedName("aa.p")
    public static volatile int field233 = 0;

    @ObfuscatedName("aa.n")
    public static volatile long field226 = 0L;

    @ObfuscatedName("aa.m")
    public static int field235 = 0;

    @ObfuscatedName("aa.d")
    public static int field236 = 0;

    @ObfuscatedName("aa.j")
    public static int field237 = 0;

    @ObfuscatedName("aa.f")
    public static long field238 = 0L;

    @ObfuscatedName("en.c(Ljava/awt/Component;B)V")
    public static void method2702(Component arg0) {
        arg0.addMouseListener(field228);
        arg0.addMouseMotionListener(field228);
        arg0.addFocusListener(field228);
    }

    @ObfuscatedName("bx.l(I)V")
    public static void method1003() {
        class33 var0 = field228;
        synchronized (field228) {
            field227 = field234;
            field223 = field224;
            field229 = field240;
            field231 = field220;
            field235 = field221;
            field236 = field232;
            field237 = field233;
            field238 = field226;
            field221 = 0;
        }
    }

    @ObfuscatedName("hk.s(B)I")
    public static int method4293() {
        return ++field222 - 1;
    }

    @ObfuscatedName("bl.e(II)V")
    public static void method1896(int arg0) {
        field222 = arg0;
    }

    @ObfuscatedName("aa.r(Ljava/awt/event/MouseEvent;I)I")
    public final int method598(MouseEvent arg0) {
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
        if (field228 != null) {
            field222 = 0;
            field232 = arg0.getX();
            field233 = arg0.getY();
            field226 = class262.method4787();
            field221 = this.method598(arg0);
            if (field221 != 0) {
                field234 = field221;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field228 != null) {
            field222 = 0;
            field234 = 0;
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
        if (field228 != null) {
            field222 = 0;
            field224 = -1;
            field240 = -1;
            field220 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field228 != null) {
            field222 = 0;
            field224 = arg0.getX();
            field240 = arg0.getY();
            field220 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field228 != null) {
            field234 = 0;
        }
    }
}
