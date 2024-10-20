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

@ObfuscatedName("bc")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bc.c")
    public static class59 field689 = null;

    @ObfuscatedName("bc.f")
    public static int field690 = 0;

    @ObfuscatedName("bc.m")
    public static long field691 = 0L;

    @ObfuscatedName("bc.h")
    public static boolean field692 = false;

    @ObfuscatedName("bc.t")
    public boolean field714 = false;

    @ObfuscatedName("bc.d")
    public static int field694 = 20;

    @ObfuscatedName("bc.n")
    public static int field709 = 1;

    @ObfuscatedName("bc.z")
    public static int field716 = 0;

    @ObfuscatedName("bc.u")
    public static long[] field698 = new long[32];

    @ObfuscatedName("bc.e")
    public static long[] field699 = new long[32];

    @ObfuscatedName("bc.l")
    public int field700;

    @ObfuscatedName("bc.i")
    public int field701;

    @ObfuscatedName("bc.g")
    public int field702 = 0;

    @ObfuscatedName("bc.a")
    public int field703 = 0;

    @ObfuscatedName("bc.v")
    public int field704;

    @ObfuscatedName("bc.ap")
    public int field708;

    @ObfuscatedName("bc.ar")
    public int field706;

    @ObfuscatedName("bc.am")
    public int field688;

    @ObfuscatedName("bc.aa")
    public Frame field697;

    @ObfuscatedName("bc.aq")
    public Canvas field705;

    @ObfuscatedName("bc.aj")
    public volatile boolean field695 = true;

    @ObfuscatedName("bc.av")
    public static int field711 = 500;

    @ObfuscatedName("bc.ao")
    public boolean field712 = false;

    @ObfuscatedName("bc.ag")
    public volatile boolean field713 = false;

    @ObfuscatedName("bc.ay")
    public volatile long field717 = 0L;

    @ObfuscatedName("bc.ae")
    public class50 field696;

    @ObfuscatedName("bc.ac")
    public Clipboard field693;

    @ObfuscatedName("bc.az")
    public final EventQueue field718;

    @ObfuscatedName("bc.ah")
    public static volatile boolean field707 = true;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field718 = var1;
        class110.method322(new class52());
    }

    @ObfuscatedName("bc.t(III)V")
    public final void method839(int arg0, int arg1) {
        if (this.field706 != arg0 || this.field688 != arg1) {
            this.method772();
        }
        this.field706 = arg0;
        this.field688 = arg1;
    }

    @ObfuscatedName("bc.p(Ljava/lang/Object;I)V")
    public final void method737(Object arg0) {
        if (this.field718 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field718.peekEvent() != null; var2++) {
            class185.method631(1L);
        }
        if (arg0 != null) {
            this.field718.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bc.d(I)Lft;")
    public class158 method738() {
        if (this.field696 == null) {
            this.field696 = new class50();
            this.field696.method632(this.field705);
        }
        return this.field696;
    }

    @ObfuscatedName("bc.n(I)V")
    public void method739() {
        this.field693 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bc.z(Ljava/lang/String;I)V")
    public void method740(String arg0) {
        this.field693.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bc.o(I)V")
    public final void method754() {
        if (Statics.field2246.toLowerCase().indexOf("microsoft") == -1) {
            class51.field620[44] = 71;
            class51.field620[45] = 26;
            class51.field620[46] = 72;
            class51.field620[47] = 73;
            class51.field620[59] = 57;
            class51.field620[61] = 27;
            class51.field620[91] = 42;
            class51.field620[92] = 74;
            class51.field620[93] = 43;
            class51.field620[192] = 28;
            class51.field620[222] = 58;
            class51.field620[520] = 59;
        } else {
            class51.field620[186] = 57;
            class51.field620[187] = 27;
            class51.field620[188] = 71;
            class51.field620[189] = 26;
            class51.field620[190] = 72;
            class51.field620[191] = 73;
            class51.field620[192] = 58;
            class51.field620[219] = 42;
            class51.field620[220] = 74;
            class51.field620[221] = 43;
            class51.field620[222] = 59;
            class51.field620[223] = 28;
        }
        Canvas var1 = this.field705;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field637);
        var1.addFocusListener(class51.field637);
    }

    @ObfuscatedName("bc.u(I)V")
    public final void method741() {
        class60.method5(this.field705);
    }

    @ObfuscatedName("bc.r(I)V")
    public final void method742() {
        Container var1 = this.method769();
        if (var1 == null) {
            return;
        }
        class282 var2 = this.method770();
        this.field700 = Math.max(var2.field3752, this.field704);
        this.field701 = Math.max(var2.field3753, this.field708);
        if (this.field700 <= 0) {
            this.field700 = 1;
        }
        if (this.field701 <= 0) {
            this.field701 = 1;
        }
        Statics.field35 = Math.min(this.field700, this.field706);
        Statics.field806 = Math.min(this.field701, this.field688);
        this.field702 = (this.field700 - Statics.field35) / 2;
        this.field703 = 0;
        this.field705.setSize(Statics.field35, Statics.field806);
        Statics.field715 = new class58(Statics.field35, Statics.field806, this.field705);
        if (this.field697 == var1) {
            Insets var3 = this.field697.getInsets();
            this.field705.setLocation(this.field702 + var3.left, this.field703 + var3.top);
        } else {
            this.field705.setLocation(this.field702, this.field703);
        }
        this.field695 = true;
        this.method870();
    }

    @ObfuscatedName("bc.y(B)V")
    public void method814() {
        int var1 = this.field702;
        int var2 = this.field703;
        int var3 = this.field700 - Statics.field35 - var1;
        int var4 = this.field701 - Statics.field806 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method769();
            int var6 = 0;
            int var7 = 0;
            if (this.field697 == var5) {
                Insets var8 = this.field697.getInsets();
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

    @ObfuscatedName("bc.w(B)V")
    public final void method745() {
        class51.method153(this.field705);
        class60.method15(this.field705);
        if (this.field696 != null) {
            this.field696.method633(this.field705);
        }
        this.method747();
        Canvas var1 = this.field705;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field637);
        var1.addFocusListener(class51.field637);
        class60.method5(this.field705);
        if (this.field696 != null) {
            this.field696.method632(this.field705);
        }
        this.method772();
    }

    @ObfuscatedName("bc.i(IIIB)V")
    public final void method818(int arg0, int arg1, int arg2) {
        try {
            if (field689 != null) {
                field690++;
                if (field690 >= 3) {
                    this.method788("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field689 = this;
            Statics.field35 = arg0;
            Statics.field806 = arg1;
            Statics.field2231 = arg2;
            Statics.field2227 = this;
            if (Statics.field719 == null) {
                Statics.field719 = new class156();
            }
            Statics.field719.method2756(this, 1);
        } catch (Exception var5) {
            class154.method1971((String) null, var5);
            this.method788("crash");
        }
    }

    @ObfuscatedName("bc.g(I)V")
    public final synchronized void method747() {
        Container var1 = this.method769();
        if (this.field705 != null) {
            this.field705.removeFocusListener(this);
            var1.remove(this.field705);
        }
        Statics.field35 = Math.max(var1.getWidth(), this.field704);
        Statics.field806 = Math.max(var1.getHeight(), this.field708);
        if (this.field697 != null) {
            Insets var2 = this.field697.getInsets();
            Statics.field35 -= var2.right + var2.left;
            Statics.field806 -= var2.top + var2.bottom;
        }
        this.field705 = new class54(this);
        var1.add(this.field705);
        this.field705.setSize(Statics.field35, Statics.field806);
        this.field705.setVisible(true);
        this.field705.setBackground(Color.BLACK);
        if (this.field697 == var1) {
            Insets var3 = this.field697.getInsets();
            this.field705.setLocation(this.field702 + var3.left, this.field703 + var3.top);
        } else {
            this.field705.setLocation(this.field702, this.field703);
        }
        this.field705.addFocusListener(this);
        this.field705.requestFocus();
        this.field695 = true;
        if (Statics.field715 != null && Statics.field35 == Statics.field715.field3772 && Statics.field806 == Statics.field715.field3774) {
            ((class58) Statics.field715).method718(this.field705);
            Statics.field715.method731(0, 0);
        } else {
            Statics.field715 = new class58(Statics.field35, Statics.field806, this.field705);
        }
        this.field713 = false;
        this.field717 = class179.method3585();
    }

    @ObfuscatedName("bc.ap(I)Z")
    public final boolean method748() {
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
                this.method788("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2246 != null) {
                String var1 = Statics.field2246.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field3747;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method788("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class274.method875(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class274.method2906(var4)) {
                            int var5 = class274.method3810(var4, 10, true);
                            if (var5 < 10) {
                                this.method788("wrongjava");
                                return;
                            }
                        }
                    }
                    field709 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method747();
            this.method797();
            class162 var6;
            try {
                var6 = new class151();
            } catch (Throwable var10) {
                var6 = new class152();
            }
            Statics.field710 = var6;
            while (field691 == 0L || class179.method3585() < field691) {
                Statics.field2629 = Statics.field710.method2712(field694, field709);
                for (int var8 = 0; var8 < Statics.field2629; var8++) {
                    this.method758();
                }
                this.method751();
                this.method737(this.field705);
            }
        } catch (Exception var11) {
            class154.method1971((String) null, var11);
            this.method788("crash");
        }
        this.method831();
    }

    @ObfuscatedName("bc.ar(I)V")
    public void method758() {
        long var1 = class179.method3585();
        long var3 = field699[Statics.field428];
        field699[Statics.field428] = var1;
        Statics.field428 = Statics.field428 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2280 = field707;
        }
        this.method763();
    }

    @ObfuscatedName("bc.am(I)V")
    public void method751() {
        Container var1 = this.method769();
        long var2 = class179.method3585();
        long var4 = field698[Statics.field3689];
        field698[Statics.field3689] = var2;
        Statics.field3689 = Statics.field3689 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field716 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field711 - 1 > 50) {
            field711 -= 50;
            this.field695 = true;
            this.field705.setSize(Statics.field35, Statics.field806);
            this.field705.setVisible(true);
            if (this.field697 == var1) {
                Insets var7 = this.field697.getInsets();
                this.field705.setLocation(this.field702 + var7.left, this.field703 + var7.top);
            } else {
                this.field705.setLocation(this.field702, this.field703);
            }
        }
        if (this.field713) {
            this.method745();
        }
        this.method752();
        this.method854(this.field695);
        if (this.field695) {
            this.method814();
        }
        this.field695 = false;
    }

    @ObfuscatedName("bc.ab(I)V")
    public final void method752() {
        class282 var1 = this.method770();
        if (this.field700 != var1.field3752 || this.field701 != var1.field3753 || this.field712) {
            this.method742();
            this.field712 = false;
        }
    }

    @ObfuscatedName("bc.af(I)V")
    public final void method772() {
        this.field712 = true;
    }

    @ObfuscatedName("bc.aa(S)V")
    public final synchronized void method831() {
        if (field692) {
            return;
        }
        field692 = true;
        try {
            this.field705.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method765();
        } catch (Exception var7) {
        }
        if (this.field697 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field719 != null) {
            try {
                Statics.field719.method2753();
            } catch (Exception var5) {
            }
        }
        this.method844();
    }

    public final void start() {
        if (field689 == this && !field692) {
            field691 = 0L;
        }
    }

    public final void stop() {
        if (field689 == this && !field692) {
            field691 = class179.method3585() + 4000L;
        }
    }

    public final void destroy() {
        if (field689 == this && !field692) {
            field691 = class179.method3585();
            class185.method631(5000L);
            this.method831();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field689 != this || field692) {
            return;
        }
        this.field695 = true;
        if (class179.method3585() - this.field717 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field35 && var2.height >= Statics.field806) {
                this.field713 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field707 = true;
        this.field695 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field707 = false;
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

    @ObfuscatedName("bc.ao(ILjava/lang/String;ZI)V")
    public final void method766(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field705.getGraphics();
            if (Statics.field1514 == null) {
                Statics.field1514 = new Font("Helvetica", 1, 13);
                Statics.field3602 = this.field705.getFontMetrics(Statics.field1514);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field35, Statics.field806);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field2630 == null) {
                    Statics.field2630 = this.field705.createImage(304, 34);
                }
                Graphics var6 = Statics.field2630.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1514);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3602.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2630, Statics.field35 / 2 - 152, Statics.field806 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field35 / 2 - 152;
                int var9 = Statics.field806 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1514);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3602.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field705.repaint();
        }
    }

    @ObfuscatedName("bc.ag(I)V")
    public final void method767() {
        Statics.field2630 = null;
        Statics.field1514 = null;
        Statics.field3602 = null;
    }

    @ObfuscatedName("bc.ay(Ljava/lang/String;I)V")
    public void method788(String arg0) {
        if (this.field714) {
            return;
        }
        this.field714 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bc.ax(I)Ljava/awt/Container;")
    public Container method769() {
        return this.field697 == null ? this : this.field697;
    }

    @ObfuscatedName("bc.ad(B)Ljl;")
    public class282 method770() {
        Container var1 = this.method769();
        int var2 = Math.max(var1.getWidth(), this.field704);
        int var3 = Math.max(var1.getHeight(), this.field708);
        if (this.field697 != null) {
            Insets var4 = this.field697.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class282(var2, var3);
    }

    @ObfuscatedName("bc.ae(I)Z")
    public final boolean method823() {
        return this.field697 != null;
    }

    @ObfuscatedName("bc.aj(S)V")
    public abstract void method763();

    @ObfuscatedName("bc.av(I)V")
    public abstract void method765();

    public abstract void init();

    @ObfuscatedName("bc.aq(I)V")
    public abstract void method797();

    @ObfuscatedName("bc.ac(B)V")
    public abstract void method844();

    @ObfuscatedName("bc.as(ZI)V")
    public abstract void method854(boolean arg0);

    @ObfuscatedName("bc.l(B)V")
    public abstract void method870();
}
