package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("br")
public class class60 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("br.i")
    public static class60 field754 = new class60();

    @ObfuscatedName("br.w")
    public static volatile int field744 = 0;

    @ObfuscatedName("br.a")
    public static volatile int field745 = 0;

    @ObfuscatedName("br.t")
    public static volatile int field746 = -1;

    @ObfuscatedName("br.s")
    public static volatile int field747 = -1;

    @ObfuscatedName("br.r")
    public static int field755 = 0;

    @ObfuscatedName("br.v")
    public static int field749 = 0;

    @ObfuscatedName("br.y")
    public static volatile int field763 = 0;

    @ObfuscatedName("br.j")
    public static int field750 = 0;

    @ObfuscatedName("br.k")
    public static volatile int field752 = 0;

    @ObfuscatedName("br.e")
    public static volatile int field753 = 0;

    @ObfuscatedName("br.o")
    public static volatile long field761 = 0L;

    @ObfuscatedName("br.z")
    public static int field743 = 0;

    @ObfuscatedName("br.l")
    public static int field748 = 0;

    @ObfuscatedName("br.c")
    public static int field757 = 0;

    @ObfuscatedName("br.m")
    public static long field758 = 0L;

    @ObfuscatedName("ed.i(I)I")
    public static int method2438() {
        return ++field744 - 1;
    }

    @ObfuscatedName("ck.w(II)V")
    public static void method1541(int arg0) {
        field744 = arg0;
    }

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field754 != null) {
            field744 = 0;
            field752 = arg0.getX();
            field753 = arg0.getY();
            field761 = class176.method2862();
            if (arg0.isAltDown()) {
                field763 = 4;
                field745 = 4;
            } else if (arg0.isMetaDown()) {
                field763 = 2;
                field745 = 2;
            } else {
                field763 = 1;
                field745 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field754 != null) {
            field744 = 0;
            field745 = 0;
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
        if (field754 != null) {
            field744 = 0;
            field746 = arg0.getX();
            field747 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field754 != null) {
            field744 = 0;
            field746 = -1;
            field747 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field754 != null) {
            field744 = 0;
            field746 = arg0.getX();
            field747 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field754 != null) {
            field744 = 0;
            field746 = arg0.getX();
            field747 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field754 != null) {
            field745 = 0;
        }
    }
}
