package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("i")
public class class20 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("i.j")
    public static class20 field135 = new class20();

    @ObfuscatedName("i.l")
    public static volatile int field146 = 0;

    @ObfuscatedName("i.n")
    public static volatile int field143 = 0;

    @ObfuscatedName("i.w")
    public static volatile int field138 = -1;

    @ObfuscatedName("i.f")
    public static volatile int field139 = -1;

    @ObfuscatedName("i.o")
    public static volatile long field133 = -1L;

    @ObfuscatedName("i.x")
    public static int field145 = 0;

    @ObfuscatedName("i.r")
    public static int field141 = 0;

    @ObfuscatedName("i.p")
    public static int field142 = 0;

    @ObfuscatedName("i.h")
    public static long field144 = 0L;

    @ObfuscatedName("i.k")
    public static volatile int field154 = 0;

    @ObfuscatedName("i.a")
    public static volatile int field136 = 0;

    @ObfuscatedName("i.q")
    public static volatile int field147 = 0;

    @ObfuscatedName("i.u")
    public static volatile long field148 = 0L;

    @ObfuscatedName("i.e")
    public static int field149 = 0;

    @ObfuscatedName("i.c")
    public static int field150 = 0;

    @ObfuscatedName("i.i")
    public static int field151 = 0;

    @ObfuscatedName("i.m")
    public static long field152 = 0L;

    @ObfuscatedName("ff.s(Ljava/awt/Component;I)V")
    public static void method3265(Component arg0) {
        arg0.addMouseListener(field135);
        arg0.addMouseMotionListener(field135);
        arg0.addFocusListener(field135);
    }

    @ObfuscatedName("fs.t(Ljava/awt/Component;I)V")
    public static void method3226(Component arg0) {
        arg0.removeMouseListener(field135);
        arg0.removeMouseMotionListener(field135);
        arg0.removeFocusListener(field135);
        field143 = 0;
    }

    @ObfuscatedName("i.v(Ljava/awt/event/MouseEvent;I)I")
    public final int method347(MouseEvent arg0) {
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
        if (field135 != null) {
            field146 = 0;
            field136 = arg0.getX();
            field147 = arg0.getY();
            field148 = class382.method2013();
            field154 = this.method347(arg0);
            if (field154 != 0) {
                field143 = field154;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field135 != null) {
            field146 = 0;
            field143 = 0;
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
        if (field135 != null) {
            field146 = 0;
            field138 = -1;
            field139 = -1;
            field133 = arg0.getWhen();
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.mouseMoved(arg0);
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field135 != null) {
            field146 = 0;
            field138 = arg0.getX();
            field139 = arg0.getY();
            field133 = arg0.getWhen();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field135 != null) {
            field143 = 0;
        }
    }
}
