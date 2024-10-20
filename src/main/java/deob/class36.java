package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bl")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bl.at")
    public static class36 field207 = new class36();

    @ObfuscatedName("bl.an")
    public static volatile int field211 = 0;

    @ObfuscatedName("bl.ao")
    public static volatile int field215 = 0;

    @ObfuscatedName("bl.ab")
    public static volatile int field213 = -1;

    @ObfuscatedName("bl.aw")
    public static volatile int field214 = -1;

    @ObfuscatedName("bl.ad")
    public static volatile long field216 = -1L;

    @ObfuscatedName("bl.al")
    public static int field210 = 0;

    @ObfuscatedName("bl.as")
    public static int field217 = 0;

    @ObfuscatedName("bl.ag")
    public static int field218 = 0;

    @ObfuscatedName("bl.ai")
    public static long field219 = 0L;

    @ObfuscatedName("bl.ax")
    public static volatile int field220 = 0;

    @ObfuscatedName("bl.ar")
    public static volatile int field221 = 0;

    @ObfuscatedName("bl.aj")
    public static volatile int field222 = 0;

    @ObfuscatedName("bl.au")
    public static volatile long field223 = 0L;

    @ObfuscatedName("bl.ay")
    public static int field224 = 0;

    @ObfuscatedName("bl.ap")
    public static int field212 = 0;

    @ObfuscatedName("bl.av")
    public static int field228 = 0;

    @ObfuscatedName("bl.aa")
    public static long field227 = 0L;

    @ObfuscatedName("en.az(Ljava/awt/Component;B)V")
    public static void method2573(Component arg0) {
        arg0.addMouseListener(field207);
        arg0.addMouseMotionListener(field207);
        arg0.addFocusListener(field207);
    }

    @ObfuscatedName("hv.ah(Ljava/awt/Component;I)V")
    public static void method3370(Component arg0) {
        arg0.removeMouseListener(field207);
        arg0.removeMouseMotionListener(field207);
        arg0.removeFocusListener(field207);
        field215 = 0;
    }

    @ObfuscatedName("jc.af(I)V")
    public static void method4114() {
        if (field207 != null) {
            class36 var0 = field207;
            synchronized (field207) {
                field207 = null;
            }
        }
    }

    @ObfuscatedName("ud.at(I)I")
    public static int method8318() {
        return ++field211 - 1;
    }

    @ObfuscatedName("es.an(II)V")
    public static void method2727(int arg0) {
        field211 = arg0;
    }

    @ObfuscatedName("bl.ao(Ljava/awt/event/MouseEvent;B)I")
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
        if (field207 != null) {
            field211 = 0;
            field221 = arg0.getX();
            field222 = arg0.getY();
            field223 = class318.method3596();
            field220 = this.method649(arg0);
            if (field220 != 0) {
                field215 = field220;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field207 != null) {
            field211 = 0;
            field215 = 0;
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
        if (field207 != null) {
            field211 = 0;
            field213 = -1;
            field214 = -1;
            field216 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field207 != null) {
            field211 = 0;
            field213 = arg0.getX();
            field214 = arg0.getY();
            field216 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field207 != null) {
            field215 = 0;
        }
    }
}
