package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bn")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bn.as")
    public static class36 field218 = new class36();

    @ObfuscatedName("bn.ax")
    public static volatile int field219 = 0;

    @ObfuscatedName("bn.ap")
    public static volatile int field220 = 0;

    @ObfuscatedName("bn.ab")
    public static volatile int field235 = -1;

    @ObfuscatedName("bn.ak")
    public static volatile int field222 = -1;

    @ObfuscatedName("bn.ae")
    public static volatile long field223 = -1L;

    @ObfuscatedName("bn.af")
    public static int field224 = 0;

    @ObfuscatedName("bn.ao")
    public static int field221 = 0;

    @ObfuscatedName("bn.aa")
    public static int field229 = 0;

    @ObfuscatedName("bn.aj")
    public static long field225 = 0L;

    @ObfuscatedName("bn.ad")
    public static volatile int field228 = 0;

    @ObfuscatedName("bn.ac")
    public static volatile int field217 = 0;

    @ObfuscatedName("bn.ag")
    public static volatile int field230 = 0;

    @ObfuscatedName("bn.ar")
    public static volatile long field231 = 0L;

    @ObfuscatedName("bn.ah")
    public static int field232 = 0;

    @ObfuscatedName("bn.az")
    public static int field233 = 0;

    @ObfuscatedName("bn.au")
    public static int field234 = 0;

    @ObfuscatedName("bn.ai")
    public static long field216 = 0L;

    @ObfuscatedName("jh.at(Ljava/awt/Component;B)V")
    public static void method4405(Component arg0) {
        arg0.addMouseListener(field218);
        arg0.addMouseMotionListener(field218);
        arg0.addFocusListener(field218);
    }

    @ObfuscatedName("dv.an(Ljava/awt/Component;I)V")
    public static void method2242(Component arg0) {
        arg0.removeMouseListener(field218);
        arg0.removeMouseMotionListener(field218);
        arg0.removeFocusListener(field218);
        field220 = 0;
    }

    @ObfuscatedName("fk.av(I)V")
    public static void method3044() {
        if (field218 != null) {
            class36 var0 = field218;
            synchronized (field218) {
                field218 = null;
            }
        }
    }

    @ObfuscatedName("cn.as(I)I")
    public static int method1966() {
        return ++field219 - 1;
    }

    @ObfuscatedName("bn.ax(Ljava/awt/event/MouseEvent;I)I")
    public final int method612(MouseEvent arg0) {
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
        if (field218 != null) {
            field219 = 0;
            field217 = arg0.getX();
            field230 = arg0.getY();
            field231 = class301.method4630();
            field228 = this.method612(arg0);
            if (field228 != 0) {
                field220 = field228;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field218 != null) {
            field219 = 0;
            field220 = 0;
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
        if (field218 != null) {
            field219 = 0;
            field235 = -1;
            field222 = -1;
            field223 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field218 != null) {
            field219 = 0;
            field235 = arg0.getX();
            field222 = arg0.getY();
            field223 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field218 != null) {
            field220 = 0;
        }
    }
}
