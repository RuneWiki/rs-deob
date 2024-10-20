package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bv")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bv.au")
    public static class36 field197 = new class36();

    @ObfuscatedName("bv.ax")
    public static volatile int field200 = 0;

    @ObfuscatedName("bv.ao")
    public static volatile int field207 = 0;

    @ObfuscatedName("bv.am")
    public static volatile int field199 = -1;

    @ObfuscatedName("bv.ac")
    public static volatile int field201 = -1;

    @ObfuscatedName("bv.ae")
    public static volatile long field202 = -1L;

    @ObfuscatedName("bv.ad")
    public static int field203 = 0;

    @ObfuscatedName("bv.aq")
    public static int field204 = 0;

    @ObfuscatedName("bv.al")
    public static int field205 = 0;

    @ObfuscatedName("bv.aj")
    public static long field206 = 0L;

    @ObfuscatedName("bv.as")
    public static volatile int field212 = 0;

    @ObfuscatedName("bv.aw")
    public static volatile int field198 = 0;

    @ObfuscatedName("bv.af")
    public static volatile int field209 = 0;

    @ObfuscatedName("bv.aa")
    public static volatile long field210 = 0L;

    @ObfuscatedName("bv.ah")
    public static int field211 = 0;

    @ObfuscatedName("bv.ag")
    public static int field216 = 0;

    @ObfuscatedName("bv.av")
    public static int field213 = 0;

    @ObfuscatedName("bv.ar")
    public static long field214 = 0L;

    @ObfuscatedName("av.ab(Ljava/awt/Component;I)V")
    public static void method264(Component arg0) {
        arg0.removeMouseListener(field197);
        arg0.removeMouseMotionListener(field197);
        arg0.removeFocusListener(field197);
        field207 = 0;
    }

    @ObfuscatedName("mg.ay(I)V")
    public static void method5600() {
        if (field197 != null) {
            class36 var0 = field197;
            synchronized (field197) {
                field197 = null;
            }
        }
    }

    @ObfuscatedName("ee.an(I)V")
    public static void method2888() {
        class36 var0 = field197;
        synchronized (field197) {
            field203 = field207;
            field204 = field199;
            field205 = field201;
            field206 = field202;
            field211 = field212;
            field216 = field198;
            field213 = field209;
            field214 = field210;
            field212 = 0;
        }
    }

    @ObfuscatedName("kz.au(II)V")
    public static void method5353(int arg0) {
        field200 = arg0;
    }

    @ObfuscatedName("bv.ax(Ljava/awt/event/MouseEvent;I)I")
    public final int method651(MouseEvent arg0) {
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
        if (field197 != null) {
            field200 = 0;
            field198 = arg0.getX();
            field209 = arg0.getY();
            field210 = class329.method5009();
            field212 = this.method651(arg0);
            if (field212 != 0) {
                field207 = field212;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field197 != null) {
            field200 = 0;
            field207 = 0;
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
        if (field197 != null) {
            field200 = 0;
            field199 = -1;
            field201 = -1;
            field202 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field197 != null) {
            field200 = 0;
            field199 = arg0.getX();
            field201 = arg0.getY();
            field202 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field197 != null) {
            field207 = 0;
        }
    }
}
