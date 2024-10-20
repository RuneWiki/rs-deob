package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ah")
public class class33 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ah.a")
    public static class33 field205 = new class33();

    @ObfuscatedName("ah.o")
    public static volatile int field206 = 0;

    @ObfuscatedName("ah.g")
    public static volatile int field213 = 0;

    @ObfuscatedName("ah.e")
    public static volatile int field208 = -1;

    @ObfuscatedName("ah.p")
    public static volatile int field216 = -1;

    @ObfuscatedName("ah.j")
    public static volatile long field222 = -1L;

    @ObfuscatedName("ah.b")
    public static int field211 = 0;

    @ObfuscatedName("ah.x")
    public static int field221 = 0;

    @ObfuscatedName("ah.y")
    public static long field214 = 0L;

    @ObfuscatedName("ah.k")
    public static int field212 = 0;

    @ObfuscatedName("ah.t")
    public static volatile int field215 = 0;

    @ObfuscatedName("ah.l")
    public static volatile int field204 = 0;

    @ObfuscatedName("ah.u")
    public static volatile int field217 = 0;

    @ObfuscatedName("ah.n")
    public static volatile long field218 = 0L;

    @ObfuscatedName("ah.z")
    public static int field219 = 0;

    @ObfuscatedName("ah.q")
    public static int field220 = 0;

    @ObfuscatedName("ah.d")
    public static int field224 = 0;

    @ObfuscatedName("ah.r")
    public static long field203 = 0L;

    @ObfuscatedName("cp.w(I)V")
    public static void method2131() {
        if (field205 != null) {
            class33 var0 = field205;
            synchronized (field205) {
                field205 = null;
            }
        }
    }

    @ObfuscatedName("ks.s(B)V")
    public static void method4961() {
        class33 var0 = field205;
        synchronized (field205) {
            field211 = field213;
            field212 = field208;
            field221 = field216;
            field214 = field222;
            field219 = field215;
            field220 = field204;
            field224 = field217;
            field203 = field218;
            field215 = 0;
        }
    }

    @ObfuscatedName("dm.a(IB)V")
    public static void method2485(int arg0) {
        field206 = arg0;
    }

    @ObfuscatedName("ah.o(Ljava/awt/event/MouseEvent;B)I")
    public final int method607(MouseEvent arg0) {
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
        if (field205 != null) {
            field206 = 0;
            field204 = arg0.getX();
            field217 = arg0.getY();
            field218 = class398.method2381();
            field215 = this.method607(arg0);
            if (field215 != 0) {
                field213 = field215;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field205 != null) {
            field206 = 0;
            field213 = 0;
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
        if (field205 != null) {
            field206 = 0;
            field208 = -1;
            field216 = -1;
            field222 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field205 != null) {
            field206 = 0;
            field208 = arg0.getX();
            field216 = arg0.getY();
            field222 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field205 != null) {
            field213 = 0;
        }
    }
}
