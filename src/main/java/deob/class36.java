package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bp")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bp.ao")
    public static class36 field225 = new class36();

    @ObfuscatedName("bp.ab")
    public static volatile int field209 = 0;

    @ObfuscatedName("bp.au")
    public static volatile int field212 = 0;

    @ObfuscatedName("bp.aa")
    public static volatile int field216 = -1;

    @ObfuscatedName("bp.ac")
    public static volatile int field213 = -1;

    @ObfuscatedName("bp.al")
    public static volatile long field215 = -1L;

    @ObfuscatedName("bp.az")
    public static int field208 = 0;

    @ObfuscatedName("bp.ap")
    public static int field217 = 0;

    @ObfuscatedName("bp.av")
    public static int field218 = 0;

    @ObfuscatedName("bp.ax")
    public static long field219 = 0L;

    @ObfuscatedName("bp.as")
    public static volatile int field220 = 0;

    @ObfuscatedName("bp.ay")
    public static volatile int field221 = 0;

    @ObfuscatedName("bp.ak")
    public static volatile int field222 = 0;

    @ObfuscatedName("bp.aj")
    public static volatile long field223 = 0L;

    @ObfuscatedName("bp.am")
    public static int field229 = 0;

    @ObfuscatedName("bp.aq")
    public static int field214 = 0;

    @ObfuscatedName("bp.ai")
    public static int field210 = 0;

    @ObfuscatedName("bp.aw")
    public static long field211 = 0L;

    @ObfuscatedName("nq.at(Ljava/awt/Component;I)V")
    public static void method5660(Component arg0) {
        arg0.removeMouseListener(field225);
        arg0.removeMouseMotionListener(field225);
        arg0.removeFocusListener(field225);
        field212 = 0;
    }

    @ObfuscatedName("dc.ah(I)I")
    public static int method2235() {
        return ++field209 - 1;
    }

    @ObfuscatedName("jt.ar(II)V")
    public static void method4568(int arg0) {
        field209 = arg0;
    }

    @ObfuscatedName("bp.ao(Ljava/awt/event/MouseEvent;B)I")
    public final int method661(MouseEvent arg0) {
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
        if (field225 != null) {
            field209 = 0;
            field221 = arg0.getX();
            field222 = arg0.getY();
            field223 = class313.method3460();
            field220 = this.method661(arg0);
            if (field220 != 0) {
                field212 = field220;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field225 != null) {
            field209 = 0;
            field212 = 0;
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
        if (field225 != null) {
            field209 = 0;
            field216 = -1;
            field213 = -1;
            field215 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field225 != null) {
            field209 = 0;
            field216 = arg0.getX();
            field213 = arg0.getY();
            field215 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field225 != null) {
            field212 = 0;
        }
    }
}
