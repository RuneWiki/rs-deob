package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bj")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bj.am")
    public static class36 field202 = new class36();

    @ObfuscatedName("bj.ax")
    public static volatile int field203 = 0;

    @ObfuscatedName("bj.aq")
    public static volatile int field204 = 0;

    @ObfuscatedName("bj.af")
    public static volatile int field205 = -1;

    @ObfuscatedName("bj.at")
    public static volatile int field206 = -1;

    @ObfuscatedName("bj.au")
    public static volatile long field213 = -1L;

    @ObfuscatedName("bj.ar")
    public static int field219 = 0;

    @ObfuscatedName("bj.al")
    public static int field217 = 0;

    @ObfuscatedName("bj.ad")
    public static int field210 = 0;

    @ObfuscatedName("bj.ah")
    public static long field211 = 0L;

    @ObfuscatedName("bj.ap")
    public static volatile int field212 = 0;

    @ObfuscatedName("bj.ab")
    public static volatile int field218 = 0;

    @ObfuscatedName("bj.az")
    public static volatile int field214 = 0;

    @ObfuscatedName("bj.aa")
    public static volatile long field215 = 0L;

    @ObfuscatedName("bj.ai")
    public static int field216 = 0;

    @ObfuscatedName("bj.ao")
    public static int field209 = 0;

    @ObfuscatedName("bj.as")
    public static int field207 = 0;

    @ObfuscatedName("bj.ay")
    public static long field200 = 0L;

    @ObfuscatedName("eu.ac(I)V")
    public static void method2873() {
        class36 var0 = field202;
        synchronized (field202) {
            field219 = field204;
            field217 = field205;
            field210 = field206;
            field211 = field213;
            field216 = field212;
            field209 = field218;
            field207 = field214;
            field200 = field215;
            field212 = 0;
        }
    }

    @ObfuscatedName("fn.ae(I)I")
    public static int method3208() {
        return ++field203 - 1;
    }

    @ObfuscatedName("ux.ag(IB)V")
    public static void method8829(int arg0) {
        field203 = arg0;
    }

    @ObfuscatedName("bj.am(Ljava/awt/event/MouseEvent;I)I")
    public final int method675(MouseEvent arg0) {
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
        if (field202 != null) {
            field203 = 0;
            field218 = arg0.getX();
            field214 = arg0.getY();
            field215 = class331.method3482();
            field212 = this.method675(arg0);
            if (field212 != 0) {
                field204 = field212;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field202 != null) {
            field203 = 0;
            field204 = 0;
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
        if (field202 != null) {
            field203 = 0;
            field205 = -1;
            field206 = -1;
            field213 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field202 != null) {
            field203 = 0;
            field205 = arg0.getX();
            field206 = arg0.getY();
            field213 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field202 != null) {
            field204 = 0;
        }
    }
}
