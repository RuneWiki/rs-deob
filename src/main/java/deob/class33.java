package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ak")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ak.v")
    public static class33 field221 = new class33();

    @ObfuscatedName("ak.c")
    public static volatile int field214 = 0;

    @ObfuscatedName("ak.q")
    public static volatile int field215 = 0;

    @ObfuscatedName("ak.i")
    public static volatile int field213 = -1;

    @ObfuscatedName("ak.k")
    public static int field220 = 0;

    @ObfuscatedName("ak.o")
    public static volatile int field216 = -1;

    @ObfuscatedName("ak.n")
    public static volatile long field218 = -1L;

    @ObfuscatedName("ak.d")
    public static int field212 = 0;

    @ObfuscatedName("ak.a")
    public static int field228 = 0;

    @ObfuscatedName("ak.m")
    public static long field222 = 0L;

    @ObfuscatedName("ak.u")
    public static volatile int field223 = 0;

    @ObfuscatedName("ak.l")
    public static volatile int field226 = 0;

    @ObfuscatedName("ak.z")
    public static volatile int field225 = 0;

    @ObfuscatedName("ak.r")
    public static volatile long field229 = 0L;

    @ObfuscatedName("ak.y")
    public static int field227 = 0;

    @ObfuscatedName("ak.p")
    public static int field219 = 0;

    @ObfuscatedName("ak.e")
    public static int field230 = 0;

    @ObfuscatedName("ak.b")
    public static long field217 = 0L;

    @ObfuscatedName("gc.s(Ljava/awt/Component;B)V")
    public static void method3241(Component arg0) {
        arg0.addMouseListener(field221);
        arg0.addMouseMotionListener(field221);
        arg0.addFocusListener(field221);
    }

    @ObfuscatedName("gs.h(I)V")
    public static void method3478() {
        if (field221 != null) {
            class33 var0 = field221;
            synchronized (field221) {
                field221 = null;
            }
        }
    }

    @ObfuscatedName("jv.w(I)I")
    public static int method4674() {
        return ++field214 - 1;
    }

    @ObfuscatedName("ak.v(Ljava/awt/event/MouseEvent;S)I")
    public final int method528(MouseEvent arg0) {
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
        if (field221 != null) {
            field214 = 0;
            field226 = arg0.getX();
            field225 = arg0.getY();
            field229 = class270.method3146();
            field223 = this.method528(arg0);
            if (field223 != 0) {
                field215 = field223;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field221 != null) {
            field214 = 0;
            field215 = 0;
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
        if (field221 != null) {
            field214 = 0;
            field213 = -1;
            field216 = -1;
            field218 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field221 != null) {
            field214 = 0;
            field213 = arg0.getX();
            field216 = arg0.getY();
            field218 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field221 != null) {
            field215 = 0;
        }
    }
}
