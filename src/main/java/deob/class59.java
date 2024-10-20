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

    @ObfuscatedName("bv.k")
    public static class59 field741 = null;

    @ObfuscatedName("bv.f")
    public static int field720 = 0;

    @ObfuscatedName("bv.i")
    public static long field712 = 0L;

    @ObfuscatedName("bv.j")
    public static boolean field714 = false;

    @ObfuscatedName("bv.m")
    public boolean field719 = false;

    @ObfuscatedName("bv.r")
    public static int field710 = 20;

    @ObfuscatedName("bv.v")
    public static int field717 = 1;

    @ObfuscatedName("bv.h")
    public static int field718 = 0;

    @ObfuscatedName("bv.q")
    public static long[] field734 = new long[32];

    @ObfuscatedName("bv.c")
    public static long[] field721 = new long[32];

    @ObfuscatedName("bv.z")
    public int field722;

    @ObfuscatedName("bv.e")
    public int field735;

    @ObfuscatedName("bv.g")
    public int field724 = 0;

    @ObfuscatedName("bv.d")
    public int field725 = 0;

    @ObfuscatedName("bv.s")
    public int field727;

    @ObfuscatedName("bv.ap")
    public int field728;

    @ObfuscatedName("bv.ac")
    public int field729;

    @ObfuscatedName("bv.af")
    public int field711;

    @ObfuscatedName("bv.ar")
    public Frame field716;

    @ObfuscatedName("bv.aq")
    public Canvas field730;

    @ObfuscatedName("bv.ag")
    public volatile boolean field733 = true;

    @ObfuscatedName("bv.ae")
    public static int field743 = 500;

    @ObfuscatedName("bv.am")
    public boolean field731 = false;

    @ObfuscatedName("bv.az")
    public volatile boolean field736 = false;

    @ObfuscatedName("bv.ay")
    public volatile long field737 = 0L;

    @ObfuscatedName("bv.at")
    public class50 field738;

    @ObfuscatedName("bv.aj")
    public Clipboard field739;

    @ObfuscatedName("bv.ax")
    public final EventQueue field740;

    @ObfuscatedName("bv.an")
    public static volatile boolean field713 = true;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field740 = var1;
        class52 var3 = new class52();
        Statics.field2599 = var3;
    }

    @ObfuscatedName("bv.i(III)V")
    public final void method829(int arg0, int arg1) {
        if (this.field729 != arg0 || this.field711 != arg1) {
            this.method743();
        }
        this.field729 = arg0;
        this.field711 = arg1;
    }

    @ObfuscatedName("bv.j(Ljava/lang/Object;I)V")
    public final void method864(Object arg0) {
        if (this.field740 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field740.peekEvent() != null; var2++) {
            class185.method7(1L);
        }
        if (arg0 != null) {
            this.field740.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bv.m(I)Lfg;")
    public class158 method728() {
        if (this.field738 == null) {
            this.field738 = new class50();
            this.field738.method632(this.field730);
        }
        return this.field738;
    }

    @ObfuscatedName("bv.u(B)V")
    public void method800() {
        this.field739 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bv.h(Ljava/lang/String;B)V")
    public void method749(String arg0) {
        this.field739.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bv.a(I)V")
    public final void method815() {
        class51.method1445();
        class51.method481(this.field730);
    }

    @ObfuscatedName("bv.p(S)V")
    public final void method788() {
        class60.method1564(this.field730);
    }

    @ObfuscatedName("bv.q(I)V")
    public final void method732() {
        Container var1 = this.method784();
        if (var1 == null) {
            return;
        }
        class282 var2 = this.method739();
        this.field722 = Math.max(var2.field3748, this.field727);
        this.field735 = Math.max(var2.field3747, this.field728);
        if (this.field722 <= 0) {
            this.field722 = 1;
        }
        if (this.field735 <= 0) {
            this.field735 = 1;
        }
        Statics.field2287 = Math.min(this.field722, this.field729);
        Statics.field726 = Math.min(this.field735, this.field711);
        this.field724 = (this.field722 - Statics.field2287) / 2;
        this.field725 = 0;
        this.field730.setSize(Statics.field2287, Statics.field726);
        Statics.field3327 = new class58(Statics.field2287, Statics.field726, this.field730);
        if (this.field716 == var1) {
            Insets var3 = this.field716.getInsets();
            this.field730.setLocation(this.field724 + var3.left, this.field725 + var3.top);
        } else {
            this.field730.setLocation(this.field724, this.field725);
        }
        this.field733 = true;
        this.method751();
    }

    @ObfuscatedName("bv.c(I)V")
    public void method734() {
        int var1 = this.field724;
        int var2 = this.field725;
        int var3 = this.field722 - Statics.field2287 - var1;
        int var4 = this.field735 - Statics.field726 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method784();
            int var6 = 0;
            int var7 = 0;
            if (this.field716 == var5) {
                Insets var8 = this.field716.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field735);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field722, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field722 + var6 - var3, var7, var3, this.field735);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field735 + var7 - var4, this.field722, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bv.n(S)V")
    public final void method735() {
        class51.method3380(this.field730);
        class60.method1669(this.field730);
        if (this.field738 != null) {
            this.field738.method629(this.field730);
        }
        this.method737();
        class51.method481(this.field730);
        class60.method1564(this.field730);
        if (this.field738 != null) {
            this.field738.method632(this.field730);
        }
        this.method743();
    }

    @ObfuscatedName("bv.z(IIII)V")
    public final void method850(int arg0, int arg1, int arg2) {
        try {
            if (field741 != null) {
                field720++;
                if (field720 >= 3) {
                    this.method857("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field741 = this;
            Statics.field2287 = arg0;
            Statics.field726 = arg1;
            Statics.field2234 = arg2;
            Statics.field2233 = this;
            if (Statics.field723 == null) {
                Statics.field723 = new class156();
            }
            Statics.field723.method2670(this, 1);
        } catch (Exception var5) {
            class154.method2730((String) null, var5);
            this.method857("crash");
        }
    }

    @ObfuscatedName("bv.e(I)V")
    public final synchronized void method737() {
        Container var1 = this.method784();
        if (this.field730 != null) {
            this.field730.removeFocusListener(this);
            var1.remove(this.field730);
        }
        Statics.field2287 = Math.max(var1.getWidth(), this.field727);
        Statics.field726 = Math.max(var1.getHeight(), this.field728);
        if (this.field716 != null) {
            Insets var2 = this.field716.getInsets();
            Statics.field2287 -= var2.right + var2.left;
            Statics.field726 -= var2.top + var2.bottom;
        }
        this.field730 = new class54(this);
        var1.add(this.field730);
        this.field730.setSize(Statics.field2287, Statics.field726);
        this.field730.setVisible(true);
        this.field730.setBackground(Color.BLACK);
        if (this.field716 == var1) {
            Insets var3 = this.field716.getInsets();
            this.field730.setLocation(this.field724 + var3.left, this.field725 + var3.top);
        } else {
            this.field730.setLocation(this.field724, this.field725);
        }
        this.field730.addFocusListener(this);
        this.field730.requestFocus();
        this.field733 = true;
        if (Statics.field3327 != null && Statics.field2287 == Statics.field3327.field3767 && Statics.field726 == Statics.field3327.field3768) {
            ((class58) Statics.field3327).method707(this.field730);
            Statics.field3327.method720(0, 0);
        } else {
            Statics.field3327 = new class58(Statics.field2287, Statics.field726, this.field730);
        }
        this.field736 = false;
        this.field737 = class179.method1665();
    }

    @ObfuscatedName("bv.t(I)Z")
    public final boolean method852() {
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
                this.method857("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2248 != null) {
                String var1 = Statics.field2248.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2247;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method857("wrongjava");
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
                        if (class274.method3141(var6) && class274.method246(var6) < 10) {
                            this.method857("wrongjava");
                            return;
                        }
                    }
                    field717 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method737();
            this.method770();
            class162 var7;
            try {
                var7 = new class151();
            } catch (Throwable var11) {
                var7 = new class152();
            }
            Statics.field278 = var7;
            while (field712 == 0L || class179.method1665() < field712) {
                Statics.field545 = Statics.field278.method2631(field710, field717);
                for (int var9 = 0; var9 < Statics.field545; var9++) {
                    this.method740();
                }
                this.method741();
                this.method864(this.field730);
            }
        } catch (Exception var12) {
            class154.method2730((String) null, var12);
            this.method857("crash");
        }
        this.method744();
    }

    @ObfuscatedName("bv.b(I)V")
    public void method740() {
        long var1 = class179.method1665();
        long var3 = field721[Statics.field2794];
        field721[Statics.field2794] = var1;
        Statics.field2794 = Statics.field2794 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field448 = field713;
        }
        this.method847();
    }

    @ObfuscatedName("bv.af(I)V")
    public void method741() {
        Container var1 = this.method784();
        long var2 = class179.method1665();
        long var4 = field734[Statics.field383];
        field734[Statics.field383] = var2;
        Statics.field383 = Statics.field383 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field718 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field743 - 1 > 50) {
            field743 -= 50;
            this.field733 = true;
            this.field730.setSize(Statics.field2287, Statics.field726);
            this.field730.setVisible(true);
            if (this.field716 == var1) {
                Insets var7 = this.field716.getInsets();
                this.field730.setLocation(this.field724 + var7.left, this.field725 + var7.top);
            } else {
                this.field730.setLocation(this.field724, this.field725);
            }
        }
        if (this.field736) {
            this.method735();
        }
        this.method742();
        this.method753(this.field733);
        if (this.field733) {
            this.method734();
        }
        this.field733 = false;
    }

    @ObfuscatedName("bv.ai(I)V")
    public final void method742() {
        class282 var1 = this.method739();
        if (this.field722 != var1.field3748 || this.field735 != var1.field3747 || this.field731) {
            this.method732();
            this.field731 = false;
        }
    }

    @ObfuscatedName("bv.ad(I)V")
    public final void method743() {
        this.field731 = true;
    }

    @ObfuscatedName("bv.ar(I)V")
    public final synchronized void method744() {
        if (field714) {
            return;
        }
        field714 = true;
        try {
            this.field730.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method754();
        } catch (Exception var7) {
        }
        if (this.field716 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field723 != null) {
            try {
                Statics.field723.method2680();
            } catch (Exception var5) {
            }
        }
        this.method761();
    }

    @ObfuscatedName("i.aq(I)V")
    public static final void method17() {
        Statics.field278.method2629();
        for (int var0 = 0; var0 < 32; var0++) {
            field734[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field721[var1] = 0L;
        }
        Statics.field545 = 0;
    }

    public final void start() {
        if (field741 == this && !field714) {
            field712 = 0L;
        }
    }

    public final void stop() {
        if (field741 == this && !field714) {
            field712 = class179.method1665() + 4000L;
        }
    }

    public final void destroy() {
        if (field741 == this && !field714) {
            field712 = class179.method1665();
            class185.method7(5000L);
            this.method744();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field741 != this || field714) {
            return;
        }
        this.field733 = true;
        if (class179.method1665() - this.field737 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2287 && var2.height >= Statics.field726) {
                this.field736 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field713 = true;
        this.field733 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field713 = false;
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

    @ObfuscatedName("bv.az(ILjava/lang/String;ZI)V")
    public final void method759(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field730.getGraphics();
            if (Statics.field333 == null) {
                Statics.field333 = new Font("Helvetica", 1, 13);
                Statics.field2519 = this.field730.getFontMetrics(Statics.field333);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2287, Statics.field726);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field587 == null) {
                    Statics.field587 = this.field730.createImage(304, 34);
                }
                Graphics var6 = Statics.field587.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field333);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2519.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field587, Statics.field2287 / 2 - 152, Statics.field726 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2287 / 2 - 152;
                int var9 = Statics.field726 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field333);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2519.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field730.repaint();
        }
    }

    @ObfuscatedName("bv.ay(B)V")
    public final void method747() {
        Statics.field587 = null;
        Statics.field333 = null;
        Statics.field2519 = null;
    }

    @ObfuscatedName("bv.as(Ljava/lang/String;I)V")
    public void method857(String arg0) {
        if (this.field719) {
            return;
        }
        this.field719 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bv.aw(B)Ljava/awt/Container;")
    public Container method784() {
        return this.field716 == null ? this : this.field716;
    }

    @ObfuscatedName("bv.at(B)Ljb;")
    public class282 method739() {
        Container var1 = this.method784();
        int var2 = Math.max(var1.getWidth(), this.field727);
        int var3 = Math.max(var1.getHeight(), this.field728);
        if (this.field716 != null) {
            Insets var4 = this.field716.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class282(var2, var3);
    }

    @ObfuscatedName("bv.aj(I)Z")
    public final boolean method760() {
        return this.field716 != null;
    }

    public abstract void init();

    @ObfuscatedName("bv.l(I)V")
    public abstract void method751();

    @ObfuscatedName("bv.ae(ZI)V")
    public abstract void method753(boolean arg0);

    @ObfuscatedName("bv.am(I)V")
    public abstract void method754();

    @ObfuscatedName("bv.ax(S)V")
    public abstract void method761();

    @ObfuscatedName("bv.ag(I)V")
    public abstract void method770();

    @ObfuscatedName("bv.ak(B)V")
    public abstract void method847();
}
