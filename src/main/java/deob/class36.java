package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bo")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bo.am")
    public static class36 field236 = new class36();

    @ObfuscatedName("bo.as")
    public static volatile int field243 = 0;

    @ObfuscatedName("bo.aj")
    public static volatile int field240 = 0;

    @ObfuscatedName("bo.ag")
    public static volatile int field256 = -1;

    @ObfuscatedName("bo.az")
    public static volatile int field242 = -1;

    @ObfuscatedName("bo.av")
    public static volatile long field238 = -1L;

    @ObfuscatedName("bo.ap")
    public static int field244 = 0;

    @ObfuscatedName("bo.aq")
    public static int field245 = 0;

    @ObfuscatedName("bo.at")
    public static int field246 = 0;

    @ObfuscatedName("bo.ah")
    public static long field247 = 0L;

    @ObfuscatedName("bo.ax")
    public static volatile int field248 = 0;

    @ObfuscatedName("bo.aa")
    public static volatile int field249 = 0;

    @ObfuscatedName("bo.au")
    public static volatile int field250 = 0;

    @ObfuscatedName("bo.ae")
    public static volatile long field237 = 0L;

    @ObfuscatedName("bo.ab")
    public static int field252 = 0;

    @ObfuscatedName("bo.ad")
    public static int field253 = 0;

    @ObfuscatedName("bo.ao")
    public static int field254 = 0;

    @ObfuscatedName("bo.ac")
    public static long field255 = 0L;

    @ObfuscatedName("no.aw(Ljava/awt/Component;B)V")
    public static void method6022(Component arg0) {
        arg0.addMouseListener(field236);
        arg0.addMouseMotionListener(field236);
        arg0.addFocusListener(field236);
    }

    @ObfuscatedName("co.ay(II)V")
    public static void method1174(int arg0) {
        field243 = arg0;
    }

    @ObfuscatedName("bo.ar(Ljava/awt/event/MouseEvent;B)I")
    public final int method635(MouseEvent arg0) {
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
        if (field236 != null) {
            field243 = 0;
            field249 = arg0.getX();
            field250 = arg0.getY();
            field237 = class303.method2705();
            field248 = this.method635(arg0);
            if (field248 != 0) {
                field240 = field248;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field236 != null) {
            field243 = 0;
            field240 = 0;
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
        if (field236 != null) {
            field243 = 0;
            field256 = -1;
            field242 = -1;
            field238 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field236 != null) {
            field243 = 0;
            field256 = arg0.getX();
            field242 = arg0.getY();
            field238 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field236 != null) {
            field240 = 0;
        }
    }
}
