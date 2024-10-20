package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bg")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bg.az")
    public static class36 field224 = new class36();

    @ObfuscatedName("bg.af")
    public static volatile int field242 = 0;

    @ObfuscatedName("bg.aa")
    public static volatile int field226 = 0;

    @ObfuscatedName("bg.at")
    public static volatile int field227 = -1;

    @ObfuscatedName("bg.ab")
    public static volatile int field234 = -1;

    @ObfuscatedName("bg.ac")
    public static volatile long field229 = -1L;

    @ObfuscatedName("bg.ao")
    public static int field228 = 0;

    @ObfuscatedName("bg.ah")
    public static int field230 = 0;

    @ObfuscatedName("bg.av")
    public static int field221 = 0;

    @ObfuscatedName("bg.aq")
    public static long field233 = 0L;

    @ObfuscatedName("bg.ap")
    public static volatile int field225 = 0;

    @ObfuscatedName("bg.ae")
    public static volatile int field245 = 0;

    @ObfuscatedName("bg.ax")
    public static volatile int field235 = 0;

    @ObfuscatedName("bg.ay")
    public static volatile long field237 = 0L;

    @ObfuscatedName("bg.au")
    public static int field238 = 0;

    @ObfuscatedName("bg.as")
    public static int field239 = 0;

    @ObfuscatedName("bg.aw")
    public static int field240 = 0;

    @ObfuscatedName("bg.ad")
    public static long field241 = 0L;

    @ObfuscatedName("jp.ak(Ljava/awt/Component;I)V")
    public static void method4156(Component arg0) {
        arg0.removeMouseListener(field224);
        arg0.removeMouseMotionListener(field224);
        arg0.removeFocusListener(field224);
        field226 = 0;
    }

    @ObfuscatedName("ck.al(I)V")
    public static void method1020() {
        if (field224 != null) {
            class36 var0 = field224;
            synchronized (field224) {
                field224 = null;
            }
        }
    }

    @ObfuscatedName("pi.aj(B)V")
    public static void method7003() {
        class36 var0 = field224;
        synchronized (field224) {
            field228 = field226;
            field230 = field227;
            field221 = field234;
            field233 = field229;
            field238 = field225;
            field239 = field245;
            field240 = field235;
            field241 = field237;
            field225 = 0;
        }
    }

    @ObfuscatedName("ka.az(I)I")
    public static int method5031() {
        return ++field242 - 1;
    }

    @ObfuscatedName("bg.af(Ljava/awt/event/MouseEvent;I)I")
    public final int method649(MouseEvent arg0) {
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
        if (field224 != null) {
            field242 = 0;
            field245 = arg0.getX();
            field235 = arg0.getY();
            field237 = class326.method2895();
            field225 = this.method649(arg0);
            if (field225 != 0) {
                field226 = field225;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field224 != null) {
            field242 = 0;
            field226 = 0;
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
        if (field224 != null) {
            field242 = 0;
            field227 = -1;
            field234 = -1;
            field229 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field224 != null) {
            field242 = 0;
            field227 = arg0.getX();
            field234 = arg0.getY();
            field229 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field224 != null) {
            field226 = 0;
        }
    }
}
