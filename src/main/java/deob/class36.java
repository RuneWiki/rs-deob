package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("ba")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("ba.ab")
    public static class36 field234 = new class36();

    @ObfuscatedName("ba.an")
    public static volatile int field222 = 0;

    @ObfuscatedName("ba.ao")
    public static volatile int field220 = 0;

    @ObfuscatedName("ba.av")
    public static volatile int field224 = -1;

    @ObfuscatedName("ba.aq")
    public static volatile int field225 = -1;

    @ObfuscatedName("ba.ap")
    public static volatile long field226 = -1L;

    @ObfuscatedName("ba.ar")
    public static int field229 = 0;

    @ObfuscatedName("ba.ak")
    public static int field228 = 0;

    @ObfuscatedName("ba.ax")
    public static int field227 = 0;

    @ObfuscatedName("ba.as")
    public static long field230 = 0L;

    @ObfuscatedName("ba.ay")
    public static volatile int field231 = 0;

    @ObfuscatedName("ba.am")
    public static volatile int field232 = 0;

    @ObfuscatedName("ba.az")
    public static volatile int field233 = 0;

    @ObfuscatedName("ba.ae")
    public static volatile long field238 = 0L;

    @ObfuscatedName("ba.au")
    public static int field235 = 0;

    @ObfuscatedName("ba.ag")
    public static int field236 = 0;

    @ObfuscatedName("ba.at")
    public static int field237 = 0;

    @ObfuscatedName("ba.af")
    public static long field219 = 0L;

    @ObfuscatedName("ie.aj(Ljava/awt/Component;I)V")
    public static void method4193(Component arg0) {
        arg0.addMouseListener(field234);
        arg0.addMouseMotionListener(field234);
        arg0.addFocusListener(field234);
    }

    @ObfuscatedName("hb.al(Ljava/awt/Component;B)V")
    public static void method3231(Component arg0) {
        arg0.removeMouseListener(field234);
        arg0.removeMouseMotionListener(field234);
        arg0.removeFocusListener(field234);
        field220 = 0;
    }

    @ObfuscatedName("nm.ac(S)I")
    public static int method6075() {
        return ++field222 - 1;
    }

    @ObfuscatedName("ba.ab(Ljava/awt/event/MouseEvent;I)I")
    public final int method621(MouseEvent arg0) {
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
        if (field234 != null) {
            field222 = 0;
            field232 = arg0.getX();
            field233 = arg0.getY();
            field238 = class290.method4466();
            field231 = this.method621(arg0);
            if (field231 != 0) {
                field220 = field231;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field234 != null) {
            field222 = 0;
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
        if (field234 != null) {
            field222 = 0;
            field224 = -1;
            field225 = -1;
            field226 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field234 != null) {
            field222 = 0;
            field224 = arg0.getX();
            field225 = arg0.getY();
            field226 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field234 != null) {
            field220 = 0;
        }
    }
}
