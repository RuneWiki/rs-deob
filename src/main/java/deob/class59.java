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

@ObfuscatedName("bv")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bv.q")
    public static class59 field705 = null;

    @ObfuscatedName("bv.o")
    public static int field707 = 0;

    @ObfuscatedName("bv.g")
    public static long field708 = 0L;

    @ObfuscatedName("bv.v")
    public static boolean field709 = false;

    @ObfuscatedName("bv.p")
    public boolean field727 = false;

    @ObfuscatedName("bv.d")
    public static int field721 = 20;

    @ObfuscatedName("bv.z")
    public static int field713 = 1;

    @ObfuscatedName("bv.n")
    public static int field731 = 0;

    @ObfuscatedName("bv.a")
    public static long[] field715 = new long[32];

    @ObfuscatedName("bv.h")
    public static long[] field717 = new long[32];

    @ObfuscatedName("bv.j")
    public int field718;

    @ObfuscatedName("bv.k")
    public int field719;

    @ObfuscatedName("bv.c")
    public int field720 = 0;

    @ObfuscatedName("bv.r")
    public int field724 = 0;

    @ObfuscatedName("bv.f")
    public int field716;

    @ObfuscatedName("bv.ap")
    public int field723;

    @ObfuscatedName("bv.af")
    public int field725;

    @ObfuscatedName("bv.aa")
    public int field726;

    @ObfuscatedName("bv.az")
    public Frame field714;

    @ObfuscatedName("bv.at")
    public Canvas field741;

    @ObfuscatedName("bv.ao")
    public volatile boolean field729 = true;

    @ObfuscatedName("bv.ax")
    public static int field728 = 500;

    @ObfuscatedName("bv.av")
    public boolean field735 = false;

    @ObfuscatedName("bv.al")
    public volatile boolean field732 = false;

    @ObfuscatedName("bv.ae")
    public volatile long field733 = 0L;

    @ObfuscatedName("bv.ac")
    public class50 field730;

    @ObfuscatedName("bv.ad")
    public Clipboard field736;

    @ObfuscatedName("bv.am")
    public final EventQueue field737;

    @ObfuscatedName("bv.ah")
    public static volatile boolean field706 = true;

    @ObfuscatedName("bv.ag")
    public static long field710 = -1L;

    @ObfuscatedName("bv.ai")
    public static long field740 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field737 = var1;
        class108.method1759(new class52());
    }

    @ObfuscatedName("bv.p(IIB)V")
    public final void method750(int arg0, int arg1) {
        if (this.field725 != arg0 || this.field726 != arg1) {
            this.method768();
        }
        this.field725 = arg0;
        this.field726 = arg1;
    }

    @ObfuscatedName("bv.e(Ljava/lang/Object;I)V")
    public final void method751(Object arg0) {
        if (this.field737 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field737.peekEvent() != null; var2++) {
            class182.method1687(1L);
        }
        if (arg0 != null) {
            this.field737.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bv.d(I)Lfh;")
    public class157 method752() {
        if (this.field730 == null) {
            this.field730 = new class50();
            this.field730.method636(this.field741);
        }
        return this.field730;
    }

    @ObfuscatedName("bv.x(B)V")
    public void method753() {
        this.field736 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bv.u(Ljava/lang/String;B)V")
    public void method823(String arg0) {
        this.field736.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bv.i(I)V")
    public final void method755() {
        class51.method157();
        class51.method1488(this.field741);
    }

    @ObfuscatedName("bv.h(I)V")
    public final void method760() {
        class60.method2876(this.field741);
    }

    @ObfuscatedName("bv.b(I)V")
    public final void method757() {
        Container var1 = this.method896();
        if (var1 == null) {
            return;
        }
        class280 var2 = this.method770();
        this.field718 = Math.max(var2.field3757, this.field716);
        this.field719 = Math.max(var2.field3755, this.field723);
        if (this.field718 <= 0) {
            this.field718 = 1;
        }
        if (this.field719 <= 0) {
            this.field719 = 1;
        }
        Statics.field2255 = Math.min(this.field718, this.field725);
        Statics.field722 = Math.min(this.field719, this.field726);
        this.field720 = (this.field718 - Statics.field2255) / 2;
        this.field724 = 0;
        this.field741.setSize(Statics.field2255, Statics.field722);
        Statics.field734 = new class58(Statics.field2255, Statics.field722, this.field741);
        if (this.field714 == var1) {
            Insets var3 = this.field714.getInsets();
            this.field741.setLocation(this.field720 + var3.left, this.field724 + var3.top);
        } else {
            this.field741.setLocation(this.field720, this.field724);
        }
        this.field729 = true;
        this.method758();
    }

    @ObfuscatedName("bv.y(I)V")
    public void method759() {
        int var1 = this.field720;
        int var2 = this.field724;
        int var3 = this.field718 - Statics.field2255 - var1;
        int var4 = this.field719 - Statics.field722 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method896();
            int var6 = 0;
            int var7 = 0;
            if (this.field714 == var5) {
                Insets var8 = this.field714.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field719);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field718, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field718 + var6 - var3, var7, var3, this.field719);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field719 + var7 - var4, this.field718, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bv.c(I)V")
    public final void method807() {
        Canvas var1 = this.field741;
        var1.removeKeyListener(class51.field671);
        var1.removeFocusListener(class51.field671);
        class51.field663 = -1;
        class60.method101(this.field741);
        if (this.field730 != null) {
            this.field730.method637(this.field741);
        }
        this.method762();
        Canvas var2 = this.field741;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field671);
        var2.addFocusListener(class51.field671);
        class60.method2876(this.field741);
        if (this.field730 != null) {
            this.field730.method636(this.field741);
        }
        this.method768();
    }

    @ObfuscatedName("bv.r(IIIB)V")
    public final void method775(int arg0, int arg1, int arg2) {
        try {
            if (field705 != null) {
                field707++;
                if (field707 >= 3) {
                    this.method754("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field705 = this;
            Statics.field2255 = arg0;
            Statics.field722 = arg1;
            Statics.field1650 = arg2;
            Statics.field2214 = this;
            if (Statics.field739 == null) {
                Statics.field739 = new class155();
            }
            Statics.field739.method2746(this, 1);
        } catch (Exception var5) {
            class153.method611((String) null, var5);
            this.method754("crash");
        }
    }

    @ObfuscatedName("bv.m(B)V")
    public final synchronized void method762() {
        Container var1 = this.method896();
        if (this.field741 != null) {
            this.field741.removeFocusListener(this);
            var1.remove(this.field741);
        }
        Statics.field2255 = Math.max(var1.getWidth(), this.field716);
        Statics.field722 = Math.max(var1.getHeight(), this.field723);
        if (this.field714 != null) {
            Insets var2 = this.field714.getInsets();
            Statics.field2255 -= var2.right + var2.left;
            Statics.field722 -= var2.top + var2.bottom;
        }
        this.field741 = new class54(this);
        var1.add(this.field741);
        this.field741.setSize(Statics.field2255, Statics.field722);
        this.field741.setVisible(true);
        this.field741.setBackground(Color.BLACK);
        if (this.field714 == var1) {
            Insets var3 = this.field714.getInsets();
            this.field741.setLocation(this.field720 + var3.left, this.field724 + var3.top);
        } else {
            this.field741.setLocation(this.field720, this.field724);
        }
        this.field741.addFocusListener(this);
        this.field741.requestFocus();
        this.field729 = true;
        if (Statics.field734 != null && Statics.field2255 == Statics.field734.field3776 && Statics.field722 == Statics.field734.field3777) {
            ((class58) Statics.field734).method732(this.field741);
            Statics.field734.method738(0, 0);
        } else {
            Statics.field734 = new class58(Statics.field2255, Statics.field722, this.field741);
        }
        this.field732 = false;
        this.field733 = class176.method3200();
    }

    @ObfuscatedName("bv.l(I)Z")
    public final boolean method763() {
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
                this.method754("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2229 != null) {
                String var1 = Statics.field2229.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field328;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method754("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length(); var3++) {
                            char var4 = var2.charAt(var3);
                            boolean var5 = var4 >= '0' && var4 <= '9';
                            if (!var5) {
                                break;
                            }
                        }
                        String var6 = var2.substring(6, var3);
                        boolean var7 = false;
                        boolean var8 = false;
                        int var9 = 0;
                        int var10 = var6.length();
                        int var11 = 0;
                        boolean var13;
                        while (true) {
                            if (var11 >= var10) {
                                var13 = var8;
                                break;
                            }
                            label177: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label177;
                                    }
                                    if (var12 == '+') {
                                        break label177;
                                    }
                                }
                                int var20;
                                if (var12 >= '0' && var12 <= '9') {
                                    var20 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var20 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var20 = var12 - 'W';
                                }
                                if (var20 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var20 = -var20;
                                }
                                int var14 = var9 * 10 + var20;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13) {
                            int var16 = class271.method2729(var6, 10, true);
                            if (var16 < 10) {
                                this.method754("wrongjava");
                                return;
                            }
                        }
                    }
                    field713 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method762();
            this.method772();
            Statics.field1543 = class159.method1003();
            while (field708 == 0L || class176.method3200() < field708) {
                Statics.field711 = Statics.field1543.method2723(field721, field713);
                for (int var17 = 0; var17 < Statics.field711; var17++) {
                    this.method821();
                }
                this.method766();
                this.method751(this.field741);
            }
        } catch (Exception var19) {
            class153.method611((String) null, var19);
            this.method754("crash");
        }
        this.method769();
    }

    @ObfuscatedName("bv.f(B)V")
    public void method821() {
        long var1 = class176.method3200();
        long var3 = field717[Statics.field349];
        field717[Statics.field349] = var1;
        Statics.field349 = Statics.field349 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2268 = field706;
        }
        this.method773();
    }

    @ObfuscatedName("bv.ap(I)V")
    public void method766() {
        Container var1 = this.method896();
        long var2 = class176.method3200();
        long var4 = field715[Statics.field712];
        field715[Statics.field712] = var2;
        Statics.field712 = Statics.field712 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field731 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field728 - 1 > 50) {
            field728 -= 50;
            this.field729 = true;
            this.field741.setSize(Statics.field2255, Statics.field722);
            this.field741.setVisible(true);
            if (this.field714 == var1) {
                Insets var7 = this.field714.getInsets();
                this.field741.setLocation(this.field720 + var7.left, this.field724 + var7.top);
            } else {
                this.field741.setLocation(this.field720, this.field724);
            }
        }
        if (this.field732) {
            this.method807();
        }
        this.method854();
        this.method774(this.field729);
        if (this.field729) {
            this.method759();
        }
        this.field729 = false;
    }

    @ObfuscatedName("bv.af(B)V")
    public final void method854() {
        class280 var1 = this.method770();
        if (this.field718 != var1.field3757 || this.field719 != var1.field3755 || this.field735) {
            this.method757();
            this.field735 = false;
        }
    }

    @ObfuscatedName("bv.aq(I)V")
    public final void method768() {
        this.field735 = true;
    }

    @ObfuscatedName("bv.ax(I)V")
    public final synchronized void method769() {
        if (field709) {
            return;
        }
        field709 = true;
        try {
            this.field741.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method789();
        } catch (Exception var7) {
        }
        if (this.field714 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field739 != null) {
            try {
                Statics.field739.method2742();
            } catch (Exception var5) {
            }
        }
        this.method782();
    }

    @ObfuscatedName("dk.av(I)V")
    public static final void method1953() {
        Statics.field1543.method2722();
        for (int var0 = 0; var0 < 32; var0++) {
            field715[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field717[var1] = 0L;
        }
        Statics.field711 = 0;
    }

    public final void start() {
        if (field705 == this && !field709) {
            field708 = 0L;
        }
    }

    public final void stop() {
        if (field705 == this && !field709) {
            field708 = class176.method3200() + 4000L;
        }
    }

    public final void destroy() {
        if (field705 == this && !field709) {
            field708 = class176.method3200();
            class182.method1687(5000L);
            this.method769();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field705 != this || field709) {
            return;
        }
        this.field729 = true;
        if (class176.method3200() - this.field733 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2255 && var2.height >= Statics.field722) {
                this.field732 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field706 = true;
        this.field729 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field706 = false;
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

    @ObfuscatedName("bv.ac(ILjava/lang/String;ZI)V")
    public final void method776(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field741.getGraphics();
            if (Statics.field3632 == null) {
                Statics.field3632 = new Font("Helvetica", 1, 13);
                Statics.field571 = this.field741.getFontMetrics(Statics.field3632);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2255, Statics.field722);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field2604 == null) {
                    Statics.field2604 = this.field741.createImage(304, 34);
                }
                Graphics var6 = Statics.field2604.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3632);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field571.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2604, Statics.field2255 / 2 - 152, Statics.field722 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2255 / 2 - 152;
                int var9 = Statics.field722 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3632);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field571.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field741.repaint();
        }
    }

    @ObfuscatedName("bv.ad(B)V")
    public final void method791() {
        Statics.field2604 = null;
        Statics.field3632 = null;
        Statics.field571 = null;
    }

    @ObfuscatedName("bv.am(Ljava/lang/String;S)V")
    public void method754(String arg0) {
        if (this.field727) {
            return;
        }
        this.field727 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bv.ah(B)Ljava/awt/Container;")
    public Container method896() {
        return this.field714 == null ? this : this.field714;
    }

    @ObfuscatedName("bv.ak(B)Ljx;")
    public class280 method770() {
        Container var1 = this.method896();
        int var2 = Math.max(var1.getWidth(), this.field716);
        int var3 = Math.max(var1.getHeight(), this.field723);
        if (this.field714 != null) {
            Insets var4 = this.field714.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class280(var2, var3);
    }

    @ObfuscatedName("bv.ar(S)Z")
    public final boolean method840() {
        return this.field714 != null;
    }

    @ObfuscatedName("bv.j(B)V")
    public abstract void method758();

    public abstract void init();

    @ObfuscatedName("bv.al(I)V")
    public abstract void method772();

    @ObfuscatedName("bv.ae(I)V")
    public abstract void method773();

    @ObfuscatedName("bv.ab(ZS)V")
    public abstract void method774(boolean arg0);

    @ObfuscatedName("bv.ag(I)V")
    public abstract void method782();

    @ObfuscatedName("bv.aj(I)V")
    public abstract void method789();
}
