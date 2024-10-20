package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("be")
public class class77 implements MouseListener, MouseMotionListener, FocusListener {

    @ObfuscatedName("be.q")
    public static class77 field1392 = new class77();

    @ObfuscatedName("be.c")
    public static volatile int field1391 = 0;

    @ObfuscatedName("be.p")
    public static volatile int field1404 = 0;

    @ObfuscatedName("be.z")
    public static volatile int field1390 = -1;

    @ObfuscatedName("be.m")
    public static volatile int field1394 = -1;

    @ObfuscatedName("be.k")
    public static int field1396 = 0;

    @ObfuscatedName("be.v")
    public static int field1393 = 0;

    @ObfuscatedName("be.y")
    public static volatile int field1401 = 0;

    @ObfuscatedName("be.d")
    public static int field1397 = 0;

    @ObfuscatedName("be.l")
    public static volatile int field1399 = 0;

    @ObfuscatedName("be.h")
    public static volatile int field1395 = 0;

    @ObfuscatedName("be.b")
    public static volatile long field1398 = 0L;

    @ObfuscatedName("be.r")
    public static int field1402 = 0;

    @ObfuscatedName("be.t")
    public static int field1403 = 0;

    @ObfuscatedName("be.u")
    public static int field1407 = 0;

    @ObfuscatedName("be.g")
    public static long field1405 = 0L;

    public final synchronized void mousePressed(MouseEvent arg0) {
        if (field1392 != null) {
            field1391 = 0;
            field1399 = arg0.getX();
            field1395 = arg0.getY();
            field1398 = class121.method533();
            if (arg0.isAltDown()) {
                field1401 = 4;
                field1404 = 4;
            } else if (arg0.isMetaDown()) {
                field1401 = 2;
                field1404 = 2;
            } else {
                field1401 = 1;
                field1404 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (field1392 != null) {
            field1391 = 0;
            field1404 = 0;
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
        if (field1392 != null) {
            field1391 = 0;
            field1390 = arg0.getX();
            field1394 = arg0.getY();
        }
    }

    public final synchronized void mouseExited(MouseEvent arg0) {
        if (field1392 != null) {
            field1391 = 0;
            field1390 = -1;
            field1394 = -1;
        }
    }

    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (field1392 != null) {
            field1391 = 0;
            field1390 = arg0.getX();
            field1394 = arg0.getY();
        }
    }

    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (field1392 != null) {
            field1391 = 0;
            field1390 = arg0.getX();
            field1394 = arg0.getY();
        }
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1392 != null) {
            field1404 = 0;
        }
    }
}
