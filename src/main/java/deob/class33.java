package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("al")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("al.j")
    public static class33 field219 = new class33();

    @ObfuscatedName("al.m")
    public static volatile int field218 = 0;

    @ObfuscatedName("al.k")
    public static int field224 = 0;

    @ObfuscatedName("al.t")
    public static volatile int field233 = 0;

    @ObfuscatedName("al.a")
    public static volatile int field220 = -1;

    @ObfuscatedName("al.e")
    public static volatile int field221 = -1;

    @ObfuscatedName("al.i")
    public static volatile long field222 = -1L;

    @ObfuscatedName("al.y")
    public static long field226 = 0L;

    @ObfuscatedName("al.w")
    public static int field229 = 0;

    @ObfuscatedName("al.g")
    public static int field225 = 0;

    @ObfuscatedName("al.v")
    public static volatile int field227 = 0;

    @ObfuscatedName("al.s")
    public static volatile int field228 = 0;

    @ObfuscatedName("al.c")
    public static volatile int field217 = 0;

    @ObfuscatedName("al.b")
    public static volatile long field230 = 0L;

    @ObfuscatedName("al.x")
    public static int field231 = 0;

    @ObfuscatedName("al.p")
    public static int field232 = 0;

    @ObfuscatedName("al.z")
    public static int field214 = 0;

    @ObfuscatedName("al.h")
    public static long field234 = 0L;

    @ObfuscatedName("ev.l(Ljava/awt/Component;I)V")
    public static void method2495(Component arg0) {
        arg0.addMouseListener(field219);
        arg0.addMouseMotionListener(field219);
        arg0.addFocusListener(field219);
    }

    @ObfuscatedName("kn.q(I)V")
    public static void method4989() {
        if (field219 != null) {
            class33 var0 = field219;
            synchronized (field219) {
                field219 = null;
            }
        }
    }

    @ObfuscatedName("n.f(I)V")
    public static void method357() {
        class33 var0 = field219;
        synchronized (field219) {
            field229 = field233;
            field224 = field220;
            field225 = field221;
            field226 = field222;
            field231 = field227;
            field232 = field228;
            field214 = field217;
            field234 = field230;
            field227 = 0;
        }
    }

    @ObfuscatedName("et.j(IB)V")
    public static void method2491(int arg0) {
        field218 = arg0;
    }

    @ObfuscatedName("al.m(Ljava/awt/event/MouseEvent;S)I")
    public final int method573(MouseEvent arg0) {
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
        if (field219 != null) {
            field218 = 0;
            field228 = arg0.getX();
            field217 = arg0.getY();
            field230 = class398.method2299();
            field227 = this.method573(arg0);
            if (field227 != 0) {
                field233 = field227;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field219 != null) {
            field218 = 0;
            field233 = 0;
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
        if (field219 != null) {
            field218 = 0;
            field220 = -1;
            field221 = -1;
            field222 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field219 != null) {
            field218 = 0;
            field220 = arg0.getX();
            field221 = arg0.getY();
            field222 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field219 != null) {
            field233 = 0;
        }
    }
}
