package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bq")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bq.w")
    public static class60 field757 = new class60();

    @ObfuscatedName("bq.o")
    public static volatile int field752 = 0;

    @ObfuscatedName("bq.x")
    public static int field758 = 0;

    @ObfuscatedName("bq.k")
    public static int field750 = 0;

    @ObfuscatedName("bq.f")
    public static volatile int field746 = 0;

    @ObfuscatedName("bq.i")
    public static volatile int field747 = -1;

    @ObfuscatedName("bq.j")
    public static volatile int field748 = -1;

    @ObfuscatedName("bq.m")
    public static int field749 = 0;

    @ObfuscatedName("bq.u")
    public static volatile int field745 = 0;

    @ObfuscatedName("bq.r")
    public static volatile int field753 = 0;

    @ObfuscatedName("bq.v")
    public static volatile int field754 = 0;

    @ObfuscatedName("bq.h")
    public static volatile long field751 = 0L;

    @ObfuscatedName("bq.a")
    public static int field744 = 0;

    @ObfuscatedName("bq.p")
    public static int field756 = 0;

    @ObfuscatedName("bq.q")
    public static int field755 = 0;

    @ObfuscatedName("bq.l")
    public static long field759 = 0L;

    @ObfuscatedName("ct.w(Ljava/awt/Component;B)V")
    public static void method1564(Component arg0) {
        arg0.addMouseListener(field757);
        arg0.addMouseMotionListener(field757);
        arg0.addFocusListener(field757);
    }

    @ObfuscatedName("cj.o(Ljava/awt/Component;S)V")
    public static void method1669(Component arg0) {
        arg0.removeMouseListener(field757);
        arg0.removeMouseMotionListener(field757);
        arg0.removeFocusListener(field757);
        field746 = 0;
    }

    @ObfuscatedName("at.x(B)V")
    public static void method534() {
        if (field757 != null) {
            class60 var0 = field757;
            synchronized (field757) {
                field757 = null;
            }
        }
    }

    @ObfuscatedName("bh.k(I)V")
    public static void method1380() {
        class60 var0 = field757;
        synchronized (field757) {
            field749 = field746;
            field750 = field747;
            field758 = field748 * 1988482945;
            field744 = field745;
            field756 = field753;
            field755 = field754;
            field759 = field751;
            field745 = 0;
        }
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field757 != null) {
            field752 = 0;
            field753 = arg0.getX();
            field754 = arg0.getY();
            field751 = class179.method1665();
            if (arg0.isAltDown()) {
                field745 = 4;
                field746 = 4;
            } else if (arg0.isMetaDown()) {
                field745 = 2;
                field746 = 2;
            } else {
                field745 = 1;
                field746 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field757 != null) {
            field752 = 0;
            field746 = 0;
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
        if (field757 != null) {
            field752 = 0;
            field747 = arg0.getX();
            field748 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field757 != null) {
            field752 = 0;
            field747 = -1;
            field748 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field757 != null) {
            field752 = 0;
            field747 = arg0.getX();
            field748 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field757 != null) {
            field752 = 0;
            field747 = arg0.getX();
            field748 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field757 != null) {
            field746 = 0;
        }
    }
}
