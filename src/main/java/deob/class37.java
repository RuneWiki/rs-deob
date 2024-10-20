package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ab")
public class class37 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ab.x")
    public static int field249 = 0;

    @ObfuscatedName("ab.m")
    public static class37 field248 = new class37();

    @ObfuscatedName("ab.q")
    public static volatile int field264 = 0;

    @ObfuscatedName("ab.f")
    public static volatile int field247 = 0;

    @ObfuscatedName("ab.r")
    public static volatile int field250 = -1;

    @ObfuscatedName("ab.u")
    public static volatile int field251 = -1;

    @ObfuscatedName("ab.b")
    public static volatile long field252 = -1L;

    @ObfuscatedName("ab.j")
    public static int field253 = 0;

    @ObfuscatedName("ab.g")
    public static int field254 = 0;

    @ObfuscatedName("ab.i")
    public static long field256 = 0L;

    @ObfuscatedName("ab.o")
    public static volatile int field257 = 0;

    @ObfuscatedName("ab.n")
    public static volatile int field255 = 0;

    @ObfuscatedName("ab.k")
    public static volatile int field266 = 0;

    @ObfuscatedName("ab.a")
    public static volatile long field260 = 0L;

    @ObfuscatedName("ab.s")
    public static int field261 = 0;

    @ObfuscatedName("ab.l")
    public static int field262 = 0;

    @ObfuscatedName("ab.t")
    public static int field258 = 0;

    @ObfuscatedName("ab.c")
    public static long field244 = 0L;

    @ObfuscatedName("cz.h(Ljava/awt/Component;B)V")
    public static void method2471(Component arg0) {
        arg0.removeMouseListener(field248);
        arg0.removeMouseMotionListener(field248);
        arg0.removeFocusListener(field248);
        field247 = 0;
    }

    @ObfuscatedName("cj.e(II)V")
    public static void method2208(int arg0) {
        field264 = arg0;
    }

    @ObfuscatedName("ab.v(Ljava/awt/event/MouseEvent;B)I")
    public final int method683(MouseEvent arg0) {
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
        if (field248 != null) {
            field264 = 0;
            field255 = arg0.getX();
            field266 = arg0.getY();
            field260 = Statics.method1118();
            field257 = this.method683(arg0);
            if (field257 != 0) {
                field247 = field257;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field248 != null) {
            field264 = 0;
            field247 = 0;
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
        if (field248 != null) {
            field264 = 0;
            field250 = -1;
            field251 = -1;
            field252 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field248 != null) {
            field264 = 0;
            field250 = arg0.getX();
            field251 = arg0.getY();
            field252 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field248 != null) {
            field247 = 0;
        }
    }
}
