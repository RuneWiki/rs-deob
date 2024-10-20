package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bp")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bp.ak")
    public static class36 field206 = new class36();

    @ObfuscatedName("bp.ap")
    public static volatile int field207 = 0;

    @ObfuscatedName("bp.an")
    public static volatile int field221 = 0;

    @ObfuscatedName("bp.aj")
    public static volatile int field209 = -1;

    @ObfuscatedName("bp.av")
    public static volatile int field222 = -1;

    @ObfuscatedName("bp.ab")
    public static volatile long field211 = -1L;

    @ObfuscatedName("bp.ai")
    public static int field212 = 0;

    @ObfuscatedName("bp.ae")
    public static int field224 = 0;

    @ObfuscatedName("bp.au")
    public static int field214 = 0;

    @ObfuscatedName("bp.ah")
    public static long field204 = 0L;

    @ObfuscatedName("bp.az")
    public static volatile int field216 = 0;

    @ObfuscatedName("bp.ax")
    public static volatile int field217 = 0;

    @ObfuscatedName("bp.ac")
    public static volatile int field218 = 0;

    @ObfuscatedName("bp.al")
    public static volatile long field219 = 0L;

    @ObfuscatedName("bp.ay")
    public static int field220 = 0;

    @ObfuscatedName("bp.ao")
    public static int field223 = 0;

    @ObfuscatedName("bp.aa")
    public static int field215 = 0;

    @ObfuscatedName("bp.as")
    public static long field210 = 0L;

    @ObfuscatedName("qq.aq(Ljava/awt/Component;I)V")
    public static void method7254(Component arg0) {
        arg0.addMouseListener(field206);
        arg0.addMouseMotionListener(field206);
        arg0.addFocusListener(field206);
    }

    @ObfuscatedName("bd.ad(Ljava/awt/Component;B)V")
    public static void method869(Component arg0) {
        arg0.removeMouseListener(field206);
        arg0.removeMouseMotionListener(field206);
        arg0.removeFocusListener(field206);
        field221 = 0;
    }

    @ObfuscatedName("fy.ag(I)V")
    public static void method3100() {
        if (field206 != null) {
            class36 var0 = field206;
            synchronized (field206) {
                field206 = null;
            }
        }
    }

    @ObfuscatedName("fa.ak(B)V")
    public static void method3089() {
        class36 var0 = field206;
        synchronized (field206) {
            field212 = field221;
            field224 = field209;
            field214 = field222;
            field204 = field211;
            field220 = field216;
            field223 = field217;
            field215 = field218;
            field210 = field219;
            field216 = 0;
        }
    }

    @ObfuscatedName("ao.ap(S)I")
    public static int method268() {
        return ++field207 - 1;
    }

    @ObfuscatedName("bp.an(Ljava/awt/event/MouseEvent;B)I")
    public final int method673(MouseEvent arg0) {
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
        if (field206 != null) {
            field207 = 0;
            field217 = arg0.getX();
            field218 = arg0.getY();
            field219 = class327.method4500();
            field216 = this.method673(arg0);
            if (field216 != 0) {
                field221 = field216;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field206 != null) {
            field207 = 0;
            field221 = 0;
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
        if (field206 != null) {
            field207 = 0;
            field209 = -1;
            field222 = -1;
            field211 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field206 != null) {
            field207 = 0;
            field209 = arg0.getX();
            field222 = arg0.getY();
            field211 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field206 != null) {
            field221 = 0;
        }
    }
}
