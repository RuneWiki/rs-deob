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

@ObfuscatedName("bf")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bf.c")
    public static class59 field700 = null;

    @ObfuscatedName("bf.e")
    public static int field701 = 0;

    @ObfuscatedName("bf.v")
    public static long field702 = 0L;

    @ObfuscatedName("bf.b")
    public static boolean field703 = false;

    @ObfuscatedName("bf.h")
    public boolean field712 = false;

    @ObfuscatedName("bf.n")
    public static int field706 = 20;

    @ObfuscatedName("bf.a")
    public static int field725 = 1;

    @ObfuscatedName("bf.o")
    public static int field708 = 0;

    @ObfuscatedName("bf.j")
    public static long[] field720 = new long[32];

    @ObfuscatedName("bf.r")
    public static long[] field715 = new long[32];

    @ObfuscatedName("bf.d")
    public int field707;

    @ObfuscatedName("bf.s")
    public int field713;

    @ObfuscatedName("bf.g")
    public int field714 = 0;

    @ObfuscatedName("bf.p")
    public int field699 = 0;

    @ObfuscatedName("bf.t")
    public int field727;

    @ObfuscatedName("bf.ad")
    public int field717;

    @ObfuscatedName("bf.ar")
    public int field718;

    @ObfuscatedName("bf.an")
    public int field719;

    @ObfuscatedName("bf.ah")
    public Frame field721;

    @ObfuscatedName("bf.ai")
    public Canvas field711;

    @ObfuscatedName("bf.aw")
    public volatile boolean field731 = true;

    @ObfuscatedName("bf.ab")
    public static int field723 = 500;

    @ObfuscatedName("bf.aa")
    public boolean field724 = false;

    @ObfuscatedName("bf.ap")
    public volatile boolean field704 = false;

    @ObfuscatedName("bf.ae")
    public volatile long field726 = 0L;

    @ObfuscatedName("bf.ag")
    public class50 field710;

    @ObfuscatedName("bf.az")
    public Clipboard field728;

    @ObfuscatedName("bf.ac")
    public final EventQueue field729;

    @ObfuscatedName("bf.ax")
    public static volatile boolean field730 = true;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field729 = var1;
        class52 var3 = new class52();
        Statics.field3288 = var3;
    }

    @ObfuscatedName("bf.h(III)V")
    public final void method854(int arg0, int arg1) {
        if (this.field718 != arg0 || this.field719 != arg1) {
            this.method736();
        }
        this.field718 = arg0;
        this.field719 = arg1;
    }

    @ObfuscatedName("bf.x(Ljava/lang/Object;I)V")
    public final void method720(Object arg0) {
        if (this.field729 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field729.peekEvent() != null; var2++) {
            class182.method10(1L);
        }
        if (arg0 != null) {
            this.field729.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bf.f(I)Lfn;")
    public class157 method835() {
        if (this.field710 == null) {
            this.field710 = new class50();
            this.field710.method615(this.field711);
        }
        return this.field710;
    }

    @ObfuscatedName("bf.n(B)V")
    public void method722() {
        this.field728 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bf.a(Ljava/lang/String;I)V")
    public void method723(String arg0) {
        this.field728.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bf.o(I)V")
    public final void method724() {
        if (Statics.field2255.toLowerCase().indexOf("microsoft") == -1) {
            class51.field659[44] = 71;
            class51.field659[45] = 26;
            class51.field659[46] = 72;
            class51.field659[47] = 73;
            class51.field659[59] = 57;
            class51.field659[61] = 27;
            class51.field659[91] = 42;
            class51.field659[92] = 74;
            class51.field659[93] = 43;
            class51.field659[192] = 28;
            class51.field659[222] = 58;
            class51.field659[520] = 59;
        } else {
            class51.field659[186] = 57;
            class51.field659[187] = 27;
            class51.field659[188] = 71;
            class51.field659[189] = 26;
            class51.field659[190] = 72;
            class51.field659[191] = 73;
            class51.field659[192] = 58;
            class51.field659[219] = 42;
            class51.field659[220] = 74;
            class51.field659[221] = 43;
            class51.field659[222] = 59;
            class51.field659[223] = 28;
        }
        Canvas var1 = this.field711;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field647);
        var1.addFocusListener(class51.field647);
    }

    @ObfuscatedName("bf.z(I)V")
    public final void method742() {
        class60.method3968(this.field711);
    }

    @ObfuscatedName("bf.q(I)V")
    public final void method726() {
        Container var1 = this.method750();
        if (var1 == null) {
            return;
        }
        class279 var2 = this.method751();
        this.field707 = Math.max(var2.field3740, this.field727);
        this.field713 = Math.max(var2.field3741, this.field717);
        if (this.field707 <= 0) {
            this.field707 = 1;
        }
        if (this.field713 <= 0) {
            this.field713 = 1;
        }
        Statics.field2021 = Math.min(this.field707, this.field718);
        Statics.field312 = Math.min(this.field713, this.field719);
        this.field714 = (this.field707 - Statics.field2021) / 2;
        this.field699 = 0;
        this.field711.setSize(Statics.field2021, Statics.field312);
        Statics.field2344 = new class58(Statics.field2021, Statics.field312, this.field711);
        if (this.field721 == var1) {
            Insets var3 = this.field721.getInsets();
            this.field711.setLocation(this.field714 + var3.left, this.field699 + var3.top);
        } else {
            this.field711.setLocation(this.field714, this.field699);
        }
        this.field731 = true;
        this.method853();
    }

    @ObfuscatedName("bf.l(I)V")
    public void method738() {
        int var1 = this.field714;
        int var2 = this.field699;
        int var3 = this.field707 - Statics.field2021 - var1;
        int var4 = this.field713 - Statics.field312 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method750();
            int var6 = 0;
            int var7 = 0;
            if (this.field721 == var5) {
                Insets var8 = this.field721.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field713);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field707, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field707 + var6 - var3, var7, var3, this.field713);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field713 + var7 - var4, this.field707, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bf.af(I)V")
    public final void method729() {
        Canvas var1 = this.field711;
        var1.removeKeyListener(class51.field647);
        var1.removeFocusListener(class51.field647);
        class51.field651 = -1;
        Canvas var2 = this.field711;
        var2.removeMouseListener(class60.field740);
        var2.removeMouseMotionListener(class60.field740);
        var2.removeFocusListener(class60.field740);
        class60.field734 = 0;
        if (this.field710 != null) {
            this.field710.method616(this.field711);
        }
        this.method731();
        Canvas var3 = this.field711;
        var3.setFocusTraversalKeysEnabled(false);
        var3.addKeyListener(class51.field647);
        var3.addFocusListener(class51.field647);
        class60.method3968(this.field711);
        if (this.field710 != null) {
            this.field710.method615(this.field711);
        }
        this.method736();
    }

    @ObfuscatedName("bf.at(IIII)V")
    public final void method763(int arg0, int arg1, int arg2) {
        try {
            if (field700 != null) {
                field701++;
                if (field701 >= 3) {
                    this.method749("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field700 = this;
            Statics.field2021 = arg0;
            Statics.field312 = arg1;
            Statics.field2637 = arg2;
            Statics.field2237 = this;
            if (Statics.field722 == null) {
                Statics.field722 = new class155();
            }
            Statics.field722.method2683(this, 1);
        } catch (Exception var5) {
            class153.method131((String) null, var5);
            this.method749("crash");
        }
    }

    @ObfuscatedName("bf.ah(I)V")
    public final synchronized void method731() {
        Container var1 = this.method750();
        if (this.field711 != null) {
            this.field711.removeFocusListener(this);
            var1.remove(this.field711);
        }
        Statics.field2021 = Math.max(var1.getWidth(), this.field727);
        Statics.field312 = Math.max(var1.getHeight(), this.field717);
        if (this.field721 != null) {
            Insets var2 = this.field721.getInsets();
            Statics.field2021 -= var2.right + var2.left;
            Statics.field312 -= var2.top + var2.bottom;
        }
        this.field711 = new class54(this);
        var1.add(this.field711);
        this.field711.setSize(Statics.field2021, Statics.field312);
        this.field711.setVisible(true);
        this.field711.setBackground(Color.BLACK);
        if (this.field721 == var1) {
            Insets var3 = this.field721.getInsets();
            this.field711.setLocation(this.field714 + var3.left, this.field699 + var3.top);
        } else {
            this.field711.setLocation(this.field714, this.field699);
        }
        this.field711.addFocusListener(this);
        this.field711.requestFocus();
        this.field731 = true;
        if (Statics.field2344 != null && Statics.field2021 == Statics.field2344.field3760 && Statics.field312 == Statics.field2344.field3762) {
            ((class58) Statics.field2344).method698(this.field711);
            Statics.field2344.method703(0, 0);
        } else {
            Statics.field2344 = new class58(Statics.field2021, Statics.field312, this.field711);
        }
        this.field704 = false;
        this.field726 = class176.method89();
    }

    @ObfuscatedName("bf.ai(B)Z")
    public final boolean method732() {
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
                this.method749("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2255 != null) {
                String var1 = Statics.field2255.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2251;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method749("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class271.method3549(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class271.method4139(var4) && class271.method3551(var4) < 10) {
                            this.method749("wrongjava");
                            return;
                        }
                    }
                    field725 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method731();
            this.method743();
            class159 var5;
            try {
                var5 = new class151();
            } catch (Throwable var9) {
                var5 = new class152();
            }
            Statics.field709 = var5;
            while (field702 == 0L || class176.method89() < field702) {
                Statics.field705 = Statics.field709.method2660(field706, field725);
                for (int var7 = 0; var7 < Statics.field705; var7++) {
                    this.method733();
                }
                this.method734();
                this.method720(this.field711);
            }
        } catch (Exception var10) {
            class153.method131((String) null, var10);
            this.method749("crash");
        }
        this.method737();
    }

    @ObfuscatedName("bf.aw(I)V")
    public void method733() {
        long var1 = class176.method89();
        long var3 = field715[Statics.field465];
        field715[Statics.field465] = var1;
        Statics.field465 = Statics.field465 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field583 = field730;
        }
        this.method772();
    }

    @ObfuscatedName("bf.al(I)V")
    public void method734() {
        Container var1 = this.method750();
        long var2 = class176.method89();
        long var4 = field720[Statics.field612];
        field720[Statics.field612] = var2;
        Statics.field612 = Statics.field612 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field708 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field723 - 1 > 50) {
            field723 -= 50;
            this.field731 = true;
            this.field711.setSize(Statics.field2021, Statics.field312);
            this.field711.setVisible(true);
            if (this.field721 == var1) {
                Insets var7 = this.field721.getInsets();
                this.field711.setLocation(this.field714 + var7.left, this.field699 + var7.top);
            } else {
                this.field711.setLocation(this.field714, this.field699);
            }
        }
        if (this.field704) {
            this.method729();
        }
        this.method735();
        this.method837(this.field731);
        if (this.field731) {
            this.method738();
        }
        this.field731 = false;
    }

    @ObfuscatedName("bf.ab(I)V")
    public final void method735() {
        class279 var1 = this.method751();
        if (this.field707 != var1.field3740 || this.field713 != var1.field3741 || this.field724) {
            this.method726();
            this.field724 = false;
        }
    }

    @ObfuscatedName("bf.aa(B)V")
    public final void method736() {
        this.field724 = true;
    }

    @ObfuscatedName("bf.ap(B)V")
    public final synchronized void method737() {
        if (field703) {
            return;
        }
        field703 = true;
        try {
            this.field711.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method851();
        } catch (Exception var7) {
        }
        if (this.field721 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field722 != null) {
            try {
                Statics.field722.method2680();
            } catch (Exception var5) {
            }
        }
        this.method753();
    }

    @ObfuscatedName("bi.ae(I)V")
    public static final void method962() {
        Statics.field709.method2659();
        for (int var0 = 0; var0 < 32; var0++) {
            field720[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field715[var1] = 0L;
        }
        Statics.field705 = 0;
    }

    public final void start() {
        if (field700 == this && !field703) {
            field702 = 0L;
        }
    }

    public final void stop() {
        if (field700 == this && !field703) {
            field702 = class176.method89() + 4000L;
        }
    }

    public final void destroy() {
        if (field700 == this && !field703) {
            field702 = class176.method89();
            class182.method10(5000L);
            this.method737();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field700 != this || field703) {
            return;
        }
        this.field731 = true;
        if (class176.method89() - this.field726 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2021 && var2.height >= Statics.field312) {
                this.field704 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field730 = true;
        this.field731 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field730 = false;
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

    @ObfuscatedName("bf.ac(ILjava/lang/String;ZI)V")
    public final void method747(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field711.getGraphics();
            if (Statics.field3432 == null) {
                Statics.field3432 = new Font("Helvetica", 1, 13);
                Statics.field301 = this.field711.getFontMetrics(Statics.field3432);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2021, Statics.field312);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field559 == null) {
                    Statics.field559 = this.field711.createImage(304, 34);
                }
                Graphics var6 = Statics.field559.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3432);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field301.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field559, Statics.field2021 / 2 - 152, Statics.field312 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2021 / 2 - 152;
                int var9 = Statics.field312 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3432);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field301.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field711.repaint();
        }
    }

    @ObfuscatedName("bf.ax(I)V")
    public final void method725() {
        Statics.field559 = null;
        Statics.field3432 = null;
        Statics.field301 = null;
    }

    @ObfuscatedName("bf.au(Ljava/lang/String;I)V")
    public void method749(String arg0) {
        if (this.field712) {
            return;
        }
        this.field712 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bf.aj(I)Ljava/awt/Container;")
    public Container method750() {
        return this.field721 == null ? this : this.field721;
    }

    @ObfuscatedName("bf.aq(I)Ljt;")
    public class279 method751() {
        Container var1 = this.method750();
        int var2 = Math.max(var1.getWidth(), this.field727);
        int var3 = Math.max(var1.getHeight(), this.field717);
        if (this.field721 != null) {
            Insets var4 = this.field721.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class279(var2, var3);
    }

    @ObfuscatedName("bf.ay(B)Z")
    public final boolean method781() {
        return this.field721 != null;
    }

    public abstract void init();

    @ObfuscatedName("bf.as(I)V")
    public abstract void method743();

    @ObfuscatedName("bf.ak(B)V")
    public abstract void method753();

    @ObfuscatedName("bf.av(B)V")
    public abstract void method772();

    @ObfuscatedName("bf.ag(ZI)V")
    public abstract void method837(boolean arg0);

    @ObfuscatedName("bf.az(I)V")
    public abstract void method851();

    @ObfuscatedName("bf.j(B)V")
    public abstract void method853();
}
