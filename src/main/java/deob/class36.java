package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bd")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bd.ac")
    public static class36 field235 = new class36();

    @ObfuscatedName("bd.au")
    public static volatile int field239 = 0;

    @ObfuscatedName("bd.ab")
    public static volatile int field237 = 0;

    @ObfuscatedName("bd.aq")
    public static volatile int field238 = -1;

    @ObfuscatedName("bd.al")
    public static volatile int field245 = -1;

    @ObfuscatedName("bd.at")
    public static volatile long field241 = -1L;

    @ObfuscatedName("bd.aa")
    public static int field232 = 0;

    @ObfuscatedName("bd.ay")
    public static int field242 = 0;

    @ObfuscatedName("bd.ao")
    public static int field243 = 0;

    @ObfuscatedName("bd.ax")
    public static long field246 = 0L;

    @ObfuscatedName("bd.ai")
    public static volatile int field244 = 0;

    @ObfuscatedName("bd.ag")
    public static volatile int field236 = 0;

    @ObfuscatedName("bd.ah")
    public static volatile int field247 = 0;

    @ObfuscatedName("bd.av")
    public static volatile long field248 = 0L;

    @ObfuscatedName("bd.ar")
    public static int field252 = 0;

    @ObfuscatedName("bd.am")
    public static int field250 = 0;

    @ObfuscatedName("bd.as")
    public static int field251 = 0;

    @ObfuscatedName("bd.aj")
    public static long field249 = 0L;

    @ObfuscatedName("pc.af(Ljava/awt/Component;I)V")
    public static void method7022(Component arg0) {
        arg0.addMouseListener(field235);
        arg0.addMouseMotionListener(field235);
        arg0.addFocusListener(field235);
    }

    @ObfuscatedName("cx.an(S)V")
    public static void method1929() {
        if (field235 != null) {
            class36 var0 = field235;
            synchronized (field235) {
                field235 = null;
            }
        }
    }

    @ObfuscatedName("cj.aw(I)I")
    public static int method2027() {
        return ++field239 - 1;
    }

    @ObfuscatedName("bd.ac(Ljava/awt/event/MouseEvent;B)I")
    public final int method679(MouseEvent arg0) {
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
        if (field235 != null) {
            field239 = 0;
            field236 = arg0.getX();
            field247 = arg0.getY();
            field248 = class294.method2504();
            field244 = this.method679(arg0);
            if (field244 != 0) {
                field237 = field244;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field235 != null) {
            field239 = 0;
            field237 = 0;
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
        if (field235 != null) {
            field239 = 0;
            field238 = -1;
            field245 = -1;
            field241 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field235 != null) {
            field239 = 0;
            field238 = arg0.getX();
            field245 = arg0.getY();
            field241 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field235 != null) {
            field237 = 0;
        }
    }
}
