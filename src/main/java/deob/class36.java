package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bc")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bc.aj")
    public static class36 field212 = new class36();

    @ObfuscatedName("bc.ai")
    public static volatile int field199 = 0;

    @ObfuscatedName("bc.ay")
    public static volatile int field200 = 0;

    @ObfuscatedName("bc.as")
    public static volatile int field201 = -1;

    @ObfuscatedName("bc.ae")
    public static volatile int field208 = -1;

    @ObfuscatedName("bc.am")
    public static volatile long field209 = -1L;

    @ObfuscatedName("bc.at")
    public static int field204 = 0;

    @ObfuscatedName("bc.au")
    public static int field195 = 0;

    @ObfuscatedName("bc.an")
    public static int field198 = 0;

    @ObfuscatedName("bc.ao")
    public static long field202 = 0L;

    @ObfuscatedName("bc.af")
    public static volatile int field203 = 0;

    @ObfuscatedName("bc.ar")
    public static volatile int field216 = 0;

    @ObfuscatedName("bc.ab")
    public static volatile int field210 = 0;

    @ObfuscatedName("bc.az")
    public static volatile long field211 = 0L;

    @ObfuscatedName("bc.ag")
    public static int field197 = 0;

    @ObfuscatedName("bc.ad")
    public static int field213 = 0;

    @ObfuscatedName("bc.ac")
    public static int field214 = 0;

    @ObfuscatedName("bc.av")
    public static long field215 = 0L;

    @ObfuscatedName("nz.ap(Ljava/awt/Component;B)V")
    public static void method6688(Component arg0) {
        arg0.removeMouseListener(field212);
        arg0.removeMouseMotionListener(field212);
        arg0.removeFocusListener(field212);
        field200 = 0;
    }

    @ObfuscatedName("mj.aw(I)V")
    public static void method5955() {
        if (field212 != null) {
            class36 var0 = field212;
            synchronized (field212) {
                field212 = null;
            }
        }
    }

    @ObfuscatedName("eh.ak(B)V")
    public static void method2907() {
        class36 var0 = field212;
        synchronized (field212) {
            field204 = field200;
            field195 = field201;
            field198 = field208;
            field202 = field209;
            field197 = field203;
            field213 = field216;
            field214 = field210;
            field215 = field211;
            field203 = 0;
        }
    }

    @ObfuscatedName("bc.aj(Ljava/awt/event/MouseEvent;I)I")
    public final int method642(MouseEvent arg0) {
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
        if (field212 != null) {
            field199 = 0;
            field216 = arg0.getX();
            field210 = arg0.getY();
            field211 = class330.method2257();
            field203 = this.method642(arg0);
            if (field203 != 0) {
                field200 = field203;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field212 != null) {
            field199 = 0;
            field200 = 0;
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
        if (field212 != null) {
            field199 = 0;
            field201 = -1;
            field208 = -1;
            field209 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field212 != null) {
            field199 = 0;
            field201 = arg0.getX();
            field208 = arg0.getY();
            field209 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field212 != null) {
            field200 = 0;
        }
    }
}
