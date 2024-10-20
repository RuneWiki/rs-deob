package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("bg")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("bg.i")
    public static class60 field740 = new class60();

    @ObfuscatedName("bg.c")
    public static volatile int field732 = 0;

    @ObfuscatedName("bg.e")
    public static volatile int field734 = 0;

    @ObfuscatedName("bg.v")
    public static volatile int field735 = -1;

    @ObfuscatedName("bg.b")
    public static volatile int field745 = -1;

    @ObfuscatedName("bg.y")
    public static volatile int field736 = 0;

    @ObfuscatedName("bg.h")
    public static int field737 = 0;

    @ObfuscatedName("bg.x")
    public static int field739 = 0;

    @ObfuscatedName("bg.f")
    public static int field738 = 0;

    @ObfuscatedName("bg.n")
    public static volatile int field741 = 0;

    @ObfuscatedName("bg.a")
    public static volatile int field742 = 0;

    @ObfuscatedName("bg.o")
    public static volatile long field743 = 0L;

    @ObfuscatedName("bg.z")
    public static int field733 = 0;

    @ObfuscatedName("bg.q")
    public static int field746 = 0;

    @ObfuscatedName("bg.j")
    public static int field751 = 0;

    @ObfuscatedName("bg.k")
    public static long field747 = 0L;

    @ObfuscatedName("iq.i(Ljava/awt/Component;I)V")
    public static void method3968(Component arg0) {
        arg0.addMouseListener(field740);
        arg0.addMouseMotionListener(field740);
        arg0.addFocusListener(field740);
    }

    @ObfuscatedName("cg.c(B)V")
    public static void method1569() {
        if (field740 != null) {
            class60 var0 = field740;
            synchronized (field740) {
                field740 = null;
            }
        }
    }

    @ObfuscatedName("ay.e(IB)V")
    public static void method613(int arg0) {
        field732 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field740 != null) {
            field732 = 0;
            field741 = arg0.getX();
            field742 = arg0.getY();
            field743 = class176.method89();
            if (arg0.isAltDown()) {
                field736 = 4;
                field734 = 4;
            } else if (arg0.isMetaDown()) {
                field736 = 2;
                field734 = 2;
            } else {
                field736 = 1;
                field734 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field740 != null) {
            field732 = 0;
            field734 = 0;
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
        if (field740 != null) {
            field732 = 0;
            field735 = arg0.getX();
            field745 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field740 != null) {
            field732 = 0;
            field735 = -1;
            field745 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field740 != null) {
            field732 = 0;
            field735 = arg0.getX();
            field745 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field740 != null) {
            field732 = 0;
            field735 = arg0.getX();
            field745 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field740 != null) {
            field734 = 0;
        }
    }
}
