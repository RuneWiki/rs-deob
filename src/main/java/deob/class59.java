package deob;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

@ObfuscatedName("bd")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bd.o")
    public static class59 field689 = null;

    @ObfuscatedName("bd.m")
    public static int field690 = 0;

    @ObfuscatedName("bd.g")
    public static long field688 = 0L;

    @ObfuscatedName("bd.d")
    public static boolean field692 = false;

    @ObfuscatedName("bd.b")
    public boolean field693 = false;

    @ObfuscatedName("bd.f")
    public static int field717 = 20;

    @ObfuscatedName("bd.j")
    public static int field696 = 1;

    @ObfuscatedName("bd.q")
    public static int field697 = 0;

    @ObfuscatedName("bd.s")
    public static long[] field698 = new long[32];

    @ObfuscatedName("bd.c")
    public static long[] field699 = new long[32];

    @ObfuscatedName("bd.u")
    public int field700;

    @ObfuscatedName("bd.z")
    public int field701;

    @ObfuscatedName("bd.p")
    public int field702 = 0;

    @ObfuscatedName("bd.l")
    public int field703 = 0;

    @ObfuscatedName("bd.a")
    public int field706;

    @ObfuscatedName("bd.ad")
    public int field714;

    @ObfuscatedName("bd.ay")
    public int field713;

    @ObfuscatedName("bd.am")
    public int field707;

    @ObfuscatedName("bd.ar")
    public Frame field709;

    @ObfuscatedName("bd.ai")
    public Canvas field710;

    @ObfuscatedName("bd.ap")
    public volatile boolean field711 = true;

    @ObfuscatedName("bd.aw")
    public static int field691 = 500;

    @ObfuscatedName("bd.ak")
    public boolean field695 = false;

    @ObfuscatedName("bd.ax")
    public volatile boolean field705 = false;

    @ObfuscatedName("bd.at")
    public volatile long field715 = 0L;

    @ObfuscatedName("bd.ab")
    public class50 field716;

    @ObfuscatedName("bd.as")
    public Clipboard field694;

    @ObfuscatedName("bd.av")
    public final EventQueue field718;

    @ObfuscatedName("bd.ac")
    public static volatile boolean field704 = true;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field718 = var1;
        class110.method628(new class52());
    }

    @ObfuscatedName("bd.b(III)V")
    public final void method819(int arg0, int arg1) {
        if (this.field713 != arg0 || this.field707 != arg1) {
            this.method748();
        }
        this.field713 = arg0;
        this.field707 = arg1;
    }

    @ObfuscatedName("bd.k(Ljava/lang/Object;I)V")
    public final void method775(Object arg0) {
        if (this.field718 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field718.peekEvent() != null; var2++) {
            class182.method1535(1L);
        }
        if (arg0 != null) {
            this.field718.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bd.q(I)Lft;")
    public class157 method741() {
        if (this.field716 == null) {
            this.field716 = new class50();
            this.field716.method641(this.field710);
        }
        return this.field716;
    }

    @ObfuscatedName("bd.h(B)V")
    public void method755() {
        this.field694 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bd.i(Ljava/lang/String;B)V")
    public void method743(String arg0) {
        this.field694.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bd.s(I)V")
    public final void method744() {
        class51.method130();
        Canvas var1 = this.field710;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field653);
        var1.addFocusListener(class51.field653);
    }

    @ObfuscatedName("bd.n(B)V")
    public final void method745() {
        class60.method3585(this.field710);
    }

    @ObfuscatedName("bd.c(I)V")
    public final void method883() {
        Container var1 = this.method771();
        if (var1 == null) {
            return;
        }
        class279 var2 = this.method828();
        this.field700 = Math.max(var2.field3732, this.field706);
        this.field701 = Math.max(var2.field3733, this.field714);
        if (this.field700 <= 0) {
            this.field700 = 1;
        }
        if (this.field701 <= 0) {
            this.field701 = 1;
        }
        Statics.field413 = Math.min(this.field700, this.field713);
        Statics.field1916 = Math.min(this.field701, this.field707);
        this.field702 = (this.field700 - Statics.field413) / 2;
        this.field703 = 0;
        this.field710.setSize(Statics.field413, Statics.field1916);
        Statics.field844 = new class58(Statics.field413, Statics.field1916, this.field710);
        if (this.field709 == var1) {
            Insets var3 = this.field709.getInsets();
            this.field710.setLocation(this.field702 + var3.left, this.field703 + var3.top);
        } else {
            this.field710.setLocation(this.field702, this.field703);
        }
        this.field711 = true;
        this.method746();
    }

    @ObfuscatedName("bd.u(I)V")
    public void method747() {
        int var1 = this.field702;
        int var2 = this.field703;
        int var3 = this.field700 - Statics.field413 - var1;
        int var4 = this.field701 - Statics.field1916 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method771();
            int var6 = 0;
            int var7 = 0;
            if (this.field709 == var5) {
                Insets var8 = this.field709.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field701);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field700, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field700 + var6 - var3, var7, var3, this.field701);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field701 + var7 - var4, this.field700, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bd.w(I)V")
    public final void method758() {
        class51.method977(this.field710);
        class60.method18(this.field710);
        if (this.field716 != null) {
            this.field716.method635(this.field710);
        }
        this.method750();
        Canvas var1 = this.field710;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field653);
        var1.addFocusListener(class51.field653);
        class60.method3585(this.field710);
        if (this.field716 != null) {
            this.field716.method641(this.field710);
        }
        this.method748();
    }

    @ObfuscatedName("bd.p(IIII)V")
    public final void method749(int arg0, int arg1, int arg2) {
        try {
            if (field689 != null) {
                field690++;
                if (field690 >= 3) {
                    this.method770("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field689 = this;
            Statics.field413 = arg0;
            Statics.field1916 = arg1;
            Statics.field2203 = arg2;
            Statics.field2209 = this;
            if (Statics.field712 == null) {
                Statics.field712 = new class155();
            }
            Statics.field712.method2682(this, 1);
        } catch (Exception var5) {
            class153.method464((String) null, var5);
            this.method770("crash");
        }
    }

    @ObfuscatedName("bd.l(S)V")
    public final synchronized void method750() {
        Container var1 = this.method771();
        if (this.field710 != null) {
            this.field710.removeFocusListener(this);
            var1.remove(this.field710);
        }
        Statics.field413 = Math.max(var1.getWidth(), this.field706);
        Statics.field1916 = Math.max(var1.getHeight(), this.field714);
        if (this.field709 != null) {
            Insets var2 = this.field709.getInsets();
            Statics.field413 -= var2.right + var2.left;
            Statics.field1916 -= var2.top + var2.bottom;
        }
        this.field710 = new class54(this);
        var1.add(this.field710);
        this.field710.setSize(Statics.field413, Statics.field1916);
        this.field710.setVisible(true);
        this.field710.setBackground(Color.BLACK);
        if (this.field709 == var1) {
            Insets var3 = this.field709.getInsets();
            this.field710.setLocation(this.field702 + var3.left, this.field703 + var3.top);
        } else {
            this.field710.setLocation(this.field702, this.field703);
        }
        this.field710.addFocusListener(this);
        this.field710.requestFocus();
        this.field711 = true;
        if (Statics.field844 != null && Statics.field413 == Statics.field844.field3756 && Statics.field1916 == Statics.field844.field3755) {
            ((class58) Statics.field844).method722(this.field710);
            Statics.field844.method718(0, 0);
        } else {
            Statics.field844 = new class58(Statics.field413, Statics.field1916, this.field710);
        }
        this.field705 = false;
        this.field715 = class176.method218();
    }

    @ObfuscatedName("bd.x(B)Z")
    public final boolean method751() {
        String var1 = this.getDocumentBase().getHost().toLowerCase();
        if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
            return true;
        } else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
            return true;
        } else if (var1.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var1.length() > 0 && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
                var1 = var1.substring(0, var1.length() - 1);
            }
            if (var1.endsWith("192.168.1.")) {
                return true;
            } else {
                this.method770("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2222 != null) {
                String var1 = Statics.field2222.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2220;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method770("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class271.method594(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class271.method62(var4) && class271.method311(var4) < 10) {
                            this.method770("wrongjava");
                            return;
                        }
                    }
                    field696 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method750();
            this.method764();
            class159 var5;
            try {
                var5 = new class151();
            } catch (Throwable var9) {
                var5 = new class152();
            }
            Statics.field3665 = var5;
            while (field688 == 0L || class176.method218() < field688) {
                Statics.field719 = Statics.field3665.method2673(field717, field696);
                for (int var7 = 0; var7 < Statics.field719; var7++) {
                    this.method759();
                }
                this.method753();
                this.method775(this.field710);
            }
        } catch (Exception var10) {
            class153.method464((String) null, var10);
            this.method770("crash");
        }
        this.method756();
    }

    @ObfuscatedName("bd.r(I)V")
    public void method759() {
        long var1 = class176.method218();
        long var3 = field699[Statics.field2194];
        field699[Statics.field2194] = var1;
        Statics.field2194 = Statics.field2194 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2387 = field704;
        }
        this.method765();
    }

    @ObfuscatedName("bd.t(I)V")
    public void method753() {
        Container var1 = this.method771();
        long var2 = class176.method218();
        long var4 = field698[Statics.field1203];
        field698[Statics.field1203] = var2;
        Statics.field1203 = Statics.field1203 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field697 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field691 - 1 > 50) {
            field691 -= 50;
            this.field711 = true;
            this.field710.setSize(Statics.field413, Statics.field1916);
            this.field710.setVisible(true);
            if (this.field709 == var1) {
                Insets var7 = this.field709.getInsets();
                this.field710.setLocation(this.field702 + var7.left, this.field703 + var7.top);
            } else {
                this.field710.setLocation(this.field702, this.field703);
            }
        }
        if (this.field705) {
            this.method758();
        }
        this.method754();
        this.method833(this.field711);
        if (this.field711) {
            this.method747();
        }
        this.field711 = false;
    }

    @ObfuscatedName("bd.a(I)V")
    public final void method754() {
        class279 var1 = this.method828();
        if (this.field700 != var1.field3732 || this.field701 != var1.field3733 || this.field695) {
            this.method883();
            this.field695 = false;
        }
    }

    @ObfuscatedName("bd.ai(I)V")
    public final void method748() {
        this.field695 = true;
    }

    @ObfuscatedName("bd.ap(I)V")
    public final synchronized void method756() {
        if (field692) {
            return;
        }
        field692 = true;
        try {
            this.field710.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method780();
        } catch (Exception var7) {
        }
        if (this.field709 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field712 != null) {
            try {
                Statics.field712.method2701();
            } catch (Exception var5) {
            }
        }
        this.method774();
    }

    @ObfuscatedName("ci.al(I)V")
    public static final void method1536() {
        Statics.field3665.method2669();
        for (int var0 = 0; var0 < 32; var0++) {
            field698[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field699[var1] = 0L;
        }
        Statics.field719 = 0;
    }

    public final void start() {
        if (field689 == this && !field692) {
            field688 = 0L;
        }
    }

    public final void stop() {
        if (field689 == this && !field692) {
            field688 = class176.method218() + 4000L;
        }
    }

    public final void destroy() {
        if (field689 == this && !field692) {
            field688 = class176.method218();
            class182.method1535(5000L);
            this.method756();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field689 != this || field692) {
            return;
        }
        this.field711 = true;
        if (class176.method218() - this.field715 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field413 && var2.height >= Statics.field1916) {
                this.field705 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field704 = true;
        this.field711 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field704 = false;
    }

    public final void windowActivated(WindowEvent arg0) {
    }

    public final void windowClosed(WindowEvent arg0) {
    }

    public final void windowClosing(WindowEvent arg0) {
        this.destroy();
    }

    public final void windowDeactivated(WindowEvent arg0) {
    }

    public final void windowDeiconified(WindowEvent arg0) {
    }

    public final void windowIconified(WindowEvent arg0) {
    }

    public final void windowOpened(WindowEvent arg0) {
    }

    @ObfuscatedName("bd.ao(ILjava/lang/String;ZB)V")
    public final void method835(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field710.getGraphics();
            if (Statics.field1227 == null) {
                Statics.field1227 = new Font("Helvetica", 1, 13);
                Statics.field708 = this.field710.getFontMetrics(Statics.field1227);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field413, Statics.field1916);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field425 == null) {
                    Statics.field425 = this.field710.createImage(304, 34);
                }
                Graphics var6 = Statics.field425.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1227);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field708.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field425, Statics.field413 / 2 - 152, Statics.field1916 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field413 / 2 - 152;
                int var9 = Statics.field1916 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1227);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field708.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field710.repaint();
        }
    }

    @ObfuscatedName("bd.aq(S)V")
    public final void method769() {
        Statics.field425 = null;
        Statics.field1227 = null;
        Statics.field708 = null;
    }

    @ObfuscatedName("bd.ab(Ljava/lang/String;I)V")
    public void method770(String arg0) {
        if (this.field693) {
            return;
        }
        this.field693 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bd.as(I)Ljava/awt/Container;")
    public Container method771() {
        return this.field709 == null ? this : this.field709;
    }

    @ObfuscatedName("bd.av(B)Ljm;")
    public class279 method828() {
        Container var1 = this.method771();
        int var2 = Math.max(var1.getWidth(), this.field706);
        int var3 = Math.max(var1.getHeight(), this.field714);
        if (this.field709 != null) {
            Insets var4 = this.field709.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class279(var2, var3);
    }

    @ObfuscatedName("bd.ac(B)Z")
    public final boolean method869() {
        return this.field709 != null;
    }

    @ObfuscatedName("bd.v(B)V")
    public abstract void method746();

    public abstract void init();

    @ObfuscatedName("bd.aw(I)V")
    public abstract void method764();

    @ObfuscatedName("bd.ak(B)V")
    public abstract void method765();

    @ObfuscatedName("bd.ag(I)V")
    public abstract void method774();

    @ObfuscatedName("bd.at(I)V")
    public abstract void method780();

    @ObfuscatedName("bd.ax(ZI)V")
    public abstract void method833(boolean arg0);
}
