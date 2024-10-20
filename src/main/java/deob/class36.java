package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ax")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ax.s")
    public static class36 field244 = new class36();

    @ObfuscatedName("ax.z")
    public static volatile int field245 = 0;

    @ObfuscatedName("ax.j")
    public static volatile int field246 = 0;

    @ObfuscatedName("ax.i")
    public static volatile int field241 = -1;

    @ObfuscatedName("ax.n")
    public static volatile int field248 = -1;

    @ObfuscatedName("ax.l")
    public static volatile long field256 = -1L;

    @ObfuscatedName("ax.k")
    public static int field251 = 0;

    @ObfuscatedName("ax.c")
    public static int field250 = 0;

    @ObfuscatedName("ax.r")
    public static int field252 = 0;

    @ObfuscatedName("ax.b")
    public static long field253 = 0L;

    @ObfuscatedName("ax.m")
    public static volatile int field254 = 0;

    @ObfuscatedName("ax.t")
    public static volatile int field255 = 0;

    @ObfuscatedName("ax.h")
    public static volatile int field264 = 0;

    @ObfuscatedName("ax.p")
    public static volatile long field257 = 0L;

    @ObfuscatedName("ax.o")
    public static int field262 = 0;

    @ObfuscatedName("ax.u")
    public static int field259 = 0;

    @ObfuscatedName("ax.x")
    public static int field260 = 0;

    @ObfuscatedName("ax.a")
    public static long field261 = 0L;

    @ObfuscatedName("gj.f(Ljava/awt/Component;B)V")
    public static void method3418(Component arg0) {
        arg0.removeMouseListener(field244);
        arg0.removeMouseMotionListener(field244);
        arg0.removeFocusListener(field244);
        field246 = 0;
    }

    @ObfuscatedName("k.w(B)V")
    public static void method86() {
        class36 var0 = field244;
        synchronized (field244) {
            field250 = field246;
            field251 = field241;
            field252 = field248;
            field253 = field256;
            field262 = field254;
            field259 = field255;
            field260 = field264;
            field261 = field257;
            field254 = 0;
        }
    }

    @ObfuscatedName("ei.v(B)I")
    public static int method2973() {
        return ++field245 - 1;
    }

    @ObfuscatedName("ax.s(Ljava/awt/event/MouseEvent;I)I")
    public final int method640(MouseEvent arg0) {
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
        if (field244 != null) {
            field245 = 0;
            field255 = arg0.getX();
            field264 = arg0.getY();
            field257 = class287.method3099();
            field254 = this.method640(arg0);
            if (field254 != 0) {
                field246 = field254;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field244 != null) {
            field245 = 0;
            field246 = 0;
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
        if (field244 != null) {
            field245 = 0;
            field241 = -1;
            field248 = -1;
            field256 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field244 != null) {
            field245 = 0;
            field241 = arg0.getX();
            field248 = arg0.getY();
            field256 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field244 != null) {
            field246 = 0;
        }
    }
}
