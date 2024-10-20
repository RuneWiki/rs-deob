package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ax")
public class class49 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ax.l")
    public static class49 field430 = new class49();

    @ObfuscatedName("ax.u")
    public static volatile int field418 = 0;

    @ObfuscatedName("ax.q")
    public static volatile int field425 = 0;

    @ObfuscatedName("ax.k")
    public static int field426 = 0;

    @ObfuscatedName("ax.i")
    public static volatile int field423 = -1;

    @ObfuscatedName("ax.x")
    public static int field427 = 0;

    @ObfuscatedName("ax.e")
    public static volatile int field424 = -1;

    @ObfuscatedName("ax.p")
    public static int field420 = 0;

    @ObfuscatedName("ax.b")
    public static volatile int field422 = 0;

    @ObfuscatedName("ax.n")
    public static volatile int field421 = 0;

    @ObfuscatedName("ax.f")
    public static volatile int field435 = 0;

    @ObfuscatedName("ax.g")
    public static volatile long field431 = 0L;

    @ObfuscatedName("ax.m")
    public static int field432 = 0;

    @ObfuscatedName("ax.r")
    public static int field433 = 0;

    @ObfuscatedName("ax.t")
    public static int field429 = 0;

    @ObfuscatedName("ax.o")
    public static long field434 = 0L;

    @ObfuscatedName("ge.z(S)V")
    public static void method3490() {
        if (field430 != null) {
            class49 var0 = field430;
            synchronized (field430) {
                field430 = null;
            }
        }
    }

    @ObfuscatedName("ap.w(I)I")
    public static int method578() {
        return ++field418 - 1;
    }

    @ObfuscatedName("cb.s(II)V")
    public static void method1737(int arg0) {
        field418 = arg0;
    }

    @ObfuscatedName("ax.l(Ljava/awt/event/MouseEvent;I)I")
    public final int method837(MouseEvent arg0) {
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
        if (field430 != null) {
            field418 = 0;
            field421 = arg0.getX();
            field435 = arg0.getY();
            field431 = class185.method3250();
            field422 = this.method837(arg0);
            if (field422 != 0) {
                field425 = field422;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field430 != null) {
            field418 = 0;
            field425 = 0;
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
        if (field430 != null) {
            field418 = 0;
            field423 = arg0.getX();
            field424 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field430 != null) {
            field418 = 0;
            field423 = -1;
            field424 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field430 != null) {
            field418 = 0;
            field423 = arg0.getX();
            field424 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field430 != null) {
            field418 = 0;
            field423 = arg0.getX();
            field424 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field430 != null) {
            field425 = 0;
        }
    }
}
