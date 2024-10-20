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

@ObfuscatedName("bp")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bp.a")
    public static class59 field711 = null;

    @ObfuscatedName("bp.t")
    public static int field712 = 0;

    @ObfuscatedName("bp.s")
    public static long field713 = 0L;

    @ObfuscatedName("bp.r")
    public static boolean field740 = false;

    @ObfuscatedName("bp.v")
    public boolean field741 = false;

    @ObfuscatedName("bp.k")
    public static int field716 = 20;

    @ObfuscatedName("bp.e")
    public static int field717 = 1;

    @ObfuscatedName("bp.o")
    public static int field718 = 0;

    @ObfuscatedName("bp.c")
    public static long[] field719 = new long[32];

    @ObfuscatedName("bp.b")
    public static long[] field720 = new long[32];

    @ObfuscatedName("bp.n")
    public int field729;

    @ObfuscatedName("bp.u")
    public int field727;

    @ObfuscatedName("bp.p")
    public int field723 = 0;

    @ObfuscatedName("bp.q")
    public int field724 = 0;

    @ObfuscatedName("bp.g")
    public int field728;

    @ObfuscatedName("bp.ah")
    public int field726;

    @ObfuscatedName("bp.ab")
    public int field714;

    @ObfuscatedName("bp.aw")
    public int field725;

    @ObfuscatedName("bp.au")
    public Frame field735;

    @ObfuscatedName("bp.ar")
    public Canvas field730;

    @ObfuscatedName("bp.ay")
    public volatile boolean field731 = true;

    @ObfuscatedName("bp.as")
    public static int field732 = 500;

    @ObfuscatedName("bp.ak")
    public boolean field733 = false;

    @ObfuscatedName("bp.aq")
    public volatile boolean field734 = false;

    @ObfuscatedName("bp.ax")
    public volatile long field710 = 0L;

    @ObfuscatedName("bp.av")
    public class50 field737;

    @ObfuscatedName("bp.aa")
    public Clipboard field738;

    @ObfuscatedName("bp.am")
    public final EventQueue field739;

    @ObfuscatedName("bp.az")
    public static volatile boolean field722 = true;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field739 = var1;
        class52 var3 = new class52();
        Statics.field1661 = var3;
    }

    @ObfuscatedName("bp.j(III)V")
    public final void method760(int arg0, int arg1) {
        if (this.field714 != arg0 || this.field725 != arg1) {
            this.method777();
        }
        this.field714 = arg0;
        this.field725 = arg1;
    }

    @ObfuscatedName("bp.k(Ljava/lang/Object;B)V")
    public final void method761(Object arg0) {
        if (this.field739 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field739.peekEvent() != null; var2++) {
            class182.method1004(1L);
        }
        if (arg0 != null) {
            this.field739.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bp.e(B)Lff;")
    public class157 method804() {
        if (this.field737 == null) {
            this.field737 = new class50();
            this.field737.method648(this.field730);
        }
        return this.field737;
    }

    @ObfuscatedName("bp.o(I)V")
    public void method800() {
        this.field738 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bp.z(Ljava/lang/String;B)V")
    public void method863(String arg0) {
        this.field738.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bp.l(I)V")
    public final void method810() {
        if (Statics.field2254.toLowerCase().indexOf("microsoft") == -1) {
            class51.field677[44] = 71;
            class51.field677[45] = 26;
            class51.field677[46] = 72;
            class51.field677[47] = 73;
            class51.field677[59] = 57;
            class51.field677[61] = 27;
            class51.field677[91] = 42;
            class51.field677[92] = 74;
            class51.field677[93] = 43;
            class51.field677[192] = 28;
            class51.field677[222] = 58;
            class51.field677[520] = 59;
        } else {
            class51.field677[186] = 57;
            class51.field677[187] = 27;
            class51.field677[188] = 71;
            class51.field677[189] = 26;
            class51.field677[190] = 72;
            class51.field677[191] = 73;
            class51.field677[192] = 58;
            class51.field677[219] = 42;
            class51.field677[220] = 74;
            class51.field677[221] = 43;
            class51.field677[222] = 59;
            class51.field677[223] = 28;
        }
        Canvas var1 = this.field730;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field657);
        var1.addFocusListener(class51.field657);
    }

    @ObfuscatedName("bp.c(B)V")
    public final void method766() {
        Canvas var1 = this.field730;
        var1.addMouseListener(class60.field754);
        var1.addMouseMotionListener(class60.field754);
        var1.addFocusListener(class60.field754);
    }

    @ObfuscatedName("bp.b(I)V")
    public final void method767() {
        Container var1 = this.method791();
        if (var1 == null) {
            return;
        }
        class279 var2 = this.method792();
        this.field729 = Math.max(var2.field3747, this.field728);
        this.field727 = Math.max(var2.field3745, this.field726);
        if (this.field729 <= 0) {
            this.field729 = 1;
        }
        if (this.field727 <= 0) {
            this.field727 = 1;
        }
        Statics.field618 = Math.min(this.field729, this.field714);
        Statics.field2309 = Math.min(this.field727, this.field725);
        this.field723 = (this.field729 - Statics.field618) / 2;
        this.field724 = 0;
        this.field730.setSize(Statics.field618, Statics.field2309);
        Statics.field603 = new class58(Statics.field618, Statics.field2309, this.field730);
        if (this.field735 == var1) {
            Insets var3 = this.field735.getInsets();
            this.field730.setLocation(this.field723 + var3.left, this.field724 + var3.top);
        } else {
            this.field730.setLocation(this.field723, this.field724);
        }
        this.field731 = true;
        this.method768();
    }

    @ObfuscatedName("bp.n(I)V")
    public void method769() {
        int var1 = this.field723;
        int var2 = this.field724;
        int var3 = this.field729 - Statics.field618 - var1;
        int var4 = this.field727 - Statics.field2309 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method791();
            int var6 = 0;
            int var7 = 0;
            if (this.field735 == var5) {
                Insets var8 = this.field735.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field727);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field729, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field729 + var6 - var3, var7, var3, this.field727);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field727 + var7 - var4, this.field729, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bp.u(B)V")
    public final void method841() {
        Canvas var1 = this.field730;
        var1.removeKeyListener(class51.field657);
        var1.removeFocusListener(class51.field657);
        class51.field668 = -1;
        Canvas var2 = this.field730;
        var2.removeMouseListener(class60.field754);
        var2.removeMouseMotionListener(class60.field754);
        var2.removeFocusListener(class60.field754);
        class60.field745 = 0;
        if (this.field737 != null) {
            this.field737.method649(this.field730);
        }
        this.method772();
        Canvas var3 = this.field730;
        var3.setFocusTraversalKeysEnabled(false);
        var3.addKeyListener(class51.field657);
        var3.addFocusListener(class51.field657);
        Canvas var4 = this.field730;
        var4.addMouseListener(class60.field754);
        var4.addMouseMotionListener(class60.field754);
        var4.addFocusListener(class60.field754);
        if (this.field737 != null) {
            this.field737.method648(this.field730);
        }
        this.method777();
    }

    @ObfuscatedName("bp.p(IIII)V")
    public final void method786(int arg0, int arg1, int arg2) {
        try {
            if (field711 != null) {
                field712++;
                if (field712 >= 3) {
                    this.method824("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field711 = this;
            Statics.field618 = arg0;
            Statics.field2309 = arg1;
            Statics.field2233 = arg2;
            Statics.field2239 = this;
            if (Statics.field721 == null) {
                Statics.field721 = new class155();
            }
            Statics.field721.method2673(this, 1);
        } catch (Exception var5) {
            class153.method2658((String) null, var5);
            this.method824("crash");
        }
    }

    @ObfuscatedName("bp.x(B)V")
    public final synchronized void method772() {
        Container var1 = this.method791();
        if (this.field730 != null) {
            this.field730.removeFocusListener(this);
            var1.remove(this.field730);
        }
        Statics.field618 = Math.max(var1.getWidth(), this.field728);
        Statics.field2309 = Math.max(var1.getHeight(), this.field726);
        if (this.field735 != null) {
            Insets var2 = this.field735.getInsets();
            Statics.field618 -= var2.right + var2.left;
            Statics.field2309 -= var2.top + var2.bottom;
        }
        this.field730 = new class54(this);
        var1.add(this.field730);
        this.field730.setSize(Statics.field618, Statics.field2309);
        this.field730.setVisible(true);
        this.field730.setBackground(Color.BLACK);
        if (this.field735 == var1) {
            Insets var3 = this.field735.getInsets();
            this.field730.setLocation(this.field723 + var3.left, this.field724 + var3.top);
        } else {
            this.field730.setLocation(this.field723, this.field724);
        }
        this.field730.addFocusListener(this);
        this.field730.requestFocus();
        this.field731 = true;
        if (Statics.field603 != null && Statics.field618 == Statics.field603.field3765 && Statics.field2309 == Statics.field603.field3766) {
            ((class58) Statics.field603).method743(this.field730);
            Statics.field603.method744(0, 0);
        } else {
            Statics.field603 = new class58(Statics.field618, Statics.field2309, this.field730);
        }
        this.field734 = false;
        this.field710 = class176.method2862();
    }

    @ObfuscatedName("bp.ai(I)Z")
    public final boolean method773() {
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
                this.method824("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2254 != null) {
                String var1 = Statics.field2254.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2249;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method824("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class271.method151(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        boolean var5 = class271.method686(var4, 10, true);
                        if (var5 && class271.method994(var4) < 10) {
                            this.method824("wrongjava");
                            return;
                        }
                    }
                    field717 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method772();
            this.method785();
            class159 var6;
            try {
                var6 = new class151();
            } catch (Throwable var10) {
                var6 = new class152();
            }
            Statics.field626 = var6;
            while (field713 == 0L || class176.method2862() < field713) {
                Statics.field597 = Statics.field626.method2653(field716, field717);
                for (int var8 = 0; var8 < Statics.field597; var8++) {
                    this.method831();
                }
                this.method775();
                this.method761(this.field730);
            }
        } catch (Exception var11) {
            class153.method2658((String) null, var11);
            this.method824("crash");
        }
        this.method778();
    }

    @ObfuscatedName("bp.an(I)V")
    public void method831() {
        long var1 = class176.method2862();
        long var3 = field720[Statics.field295];
        field720[Statics.field295] = var1;
        Statics.field295 = Statics.field295 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field343 = field722;
        }
        this.method816();
    }

    @ObfuscatedName("bp.au(B)V")
    public void method775() {
        Container var1 = this.method791();
        long var2 = class176.method2862();
        long var4 = field719[Statics.field339];
        field719[Statics.field339] = var2;
        Statics.field339 = Statics.field339 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field718 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field732 - 1 > 50) {
            field732 -= 50;
            this.field731 = true;
            this.field730.setSize(Statics.field618, Statics.field2309);
            this.field730.setVisible(true);
            if (this.field735 == var1) {
                Insets var7 = this.field735.getInsets();
                this.field730.setLocation(this.field723 + var7.left, this.field724 + var7.top);
            } else {
                this.field730.setLocation(this.field723, this.field724);
            }
        }
        if (this.field734) {
            this.method841();
        }
        this.method776();
        this.method787(this.field731);
        if (this.field731) {
            this.method769();
        }
        this.field731 = false;
    }

    @ObfuscatedName("bp.ar(B)V")
    public final void method776() {
        class279 var1 = this.method792();
        if (this.field729 != var1.field3747 || this.field727 != var1.field3745 || this.field733) {
            this.method767();
            this.field733 = false;
        }
    }

    @ObfuscatedName("bp.ay(I)V")
    public final void method777() {
        this.field733 = true;
    }

    @ObfuscatedName("bp.ao(B)V")
    public final synchronized void method778() {
        if (field740) {
            return;
        }
        field740 = true;
        try {
            this.field730.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method788();
        } catch (Exception var7) {
        }
        if (this.field735 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field721 != null) {
            try {
                Statics.field721.method2669();
            } catch (Exception var5) {
            }
        }
        this.method794();
    }

    @ObfuscatedName("ci.as(B)V")
    public static final void method1628() {
        Statics.field626.method2652();
        for (int var0 = 0; var0 < 32; var0++) {
            field719[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field720[var1] = 0L;
        }
        Statics.field597 = 0;
    }

    public final void start() {
        if (field711 == this && !field740) {
            field713 = 0L;
        }
    }

    public final void stop() {
        if (field711 == this && !field740) {
            field713 = class176.method2862() + 4000L;
        }
    }

    public final void destroy() {
        if (field711 == this && !field740) {
            field713 = class176.method2862();
            class182.method1004(5000L);
            this.method778();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field711 != this || field740) {
            return;
        }
        this.field731 = true;
        if (class176.method2862() - this.field710 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field618 && var2.height >= Statics.field2309) {
                this.field734 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field722 = true;
        this.field731 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field722 = false;
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

    @ObfuscatedName("bp.at(ILjava/lang/String;ZI)V")
    public final void method844(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field730.getGraphics();
            if (Statics.field1508 == null) {
                Statics.field1508 = new Font("Helvetica", 1, 13);
                Statics.field2643 = this.field730.getFontMetrics(Statics.field1508);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field618, Statics.field2309);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1449 == null) {
                    Statics.field1449 = this.field730.createImage(304, 34);
                }
                Graphics var6 = Statics.field1449.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1508);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2643.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1449, Statics.field618 / 2 - 152, Statics.field2309 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field618 / 2 - 152;
                int var9 = Statics.field2309 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1508);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2643.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field730.repaint();
        }
    }

    @ObfuscatedName("bp.av(I)V")
    public final void method771() {
        Statics.field1449 = null;
        Statics.field1508 = null;
        Statics.field2643 = null;
    }

    @ObfuscatedName("bp.aa(Ljava/lang/String;I)V")
    public void method824(String arg0) {
        if (this.field741) {
            return;
        }
        this.field741 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bp.am(I)Ljava/awt/Container;")
    public Container method791() {
        return this.field735 == null ? this : this.field735;
    }

    @ObfuscatedName("bp.az(B)Ljt;")
    public class279 method792() {
        Container var1 = this.method791();
        int var2 = Math.max(var1.getWidth(), this.field728);
        int var3 = Math.max(var1.getHeight(), this.field726);
        if (this.field735 != null) {
            Insets var4 = this.field735.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class279(var2, var3);
    }

    @ObfuscatedName("bp.al(I)Z")
    public final boolean method858() {
        return this.field735 != null;
    }

    @ObfuscatedName("bp.f(I)V")
    public abstract void method768();

    @ObfuscatedName("bp.ak(I)V")
    public abstract void method785();

    @ObfuscatedName("bp.ax(ZB)V")
    public abstract void method787(boolean arg0);

    @ObfuscatedName("bp.ac(I)V")
    public abstract void method788();

    public abstract void init();

    @ObfuscatedName("bp.ad(I)V")
    public abstract void method794();

    @ObfuscatedName("bp.aq(I)V")
    public abstract void method816();
}
