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

@ObfuscatedName("bh")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bh.h")
    public static class59 field694 = null;

    @ObfuscatedName("bh.u")
    public static int field712 = 0;

    @ObfuscatedName("bh.q")
    public static long field685 = 0L;

    @ObfuscatedName("bh.g")
    public static boolean field713 = false;

    @ObfuscatedName("bh.v")
    public boolean field710 = false;

    @ObfuscatedName("bh.p")
    public static int field688 = 20;

    @ObfuscatedName("bh.l")
    public static int field689 = 1;

    @ObfuscatedName("bh.a")
    public static int field686 = 0;

    @ObfuscatedName("bh.b")
    public static long[] field691 = new long[32];

    @ObfuscatedName("bh.j")
    public static long[] field692 = new long[32];

    @ObfuscatedName("bh.d")
    public int field693;

    @ObfuscatedName("bh.e")
    public int field687;

    @ObfuscatedName("bh.s")
    public int field690 = 0;

    @ObfuscatedName("bh.n")
    public int field696 = 0;

    @ObfuscatedName("bh.z")
    public int field702;

    @ObfuscatedName("bh.ay")
    public int field698;

    @ObfuscatedName("bh.ah")
    public int field684;

    @ObfuscatedName("bh.az")
    public int field700;

    @ObfuscatedName("bh.af")
    public Frame field701;

    @ObfuscatedName("bh.aj")
    public Canvas field709;

    @ObfuscatedName("bh.ax")
    public volatile boolean field695 = true;

    @ObfuscatedName("bh.av")
    public static int field704 = 500;

    @ObfuscatedName("bh.ae")
    public boolean field705 = false;

    @ObfuscatedName("bh.ar")
    public volatile boolean field706 = false;

    @ObfuscatedName("bh.ag")
    public volatile long field707 = 0L;

    @ObfuscatedName("bh.ao")
    public class50 field708;

    @ObfuscatedName("bh.am")
    public Clipboard field699;

    @ObfuscatedName("bh.ap")
    public final EventQueue field697;

    @ObfuscatedName("bh.as")
    public static volatile boolean field711 = true;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field697 = var1;
        class110.method4(new class52());
    }

    @ObfuscatedName("bh.v(III)V")
    public final void method750(int arg0, int arg1) {
        if (this.field684 != arg0 || this.field700 != arg1) {
            this.method807();
        }
        this.field684 = arg0;
        this.field700 = arg1;
    }

    @ObfuscatedName("bh.t(Ljava/lang/Object;I)V")
    public final void method771(Object arg0) {
        if (this.field697 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field697.peekEvent() != null; var2++) {
            class182.method138(1L);
        }
        if (arg0 != null) {
            this.field697.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bh.p(I)Lfb;")
    public class157 method752() {
        if (this.field708 == null) {
            this.field708 = new class50();
            this.field708.method650(this.field709);
        }
        return this.field708;
    }

    @ObfuscatedName("bh.l(B)V")
    public void method779() {
        this.field699 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bh.a(Ljava/lang/String;I)V")
    public void method753(String arg0) {
        this.field699.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bh.k(I)V")
    public final void method763() {
        if (Statics.field2216.toLowerCase().indexOf("microsoft") == -1) {
            class51.field638[44] = 71;
            class51.field638[45] = 26;
            class51.field638[46] = 72;
            class51.field638[47] = 73;
            class51.field638[59] = 57;
            class51.field638[61] = 27;
            class51.field638[91] = 42;
            class51.field638[92] = 74;
            class51.field638[93] = 43;
            class51.field638[192] = 28;
            class51.field638[222] = 58;
            class51.field638[520] = 59;
        } else {
            class51.field638[186] = 57;
            class51.field638[187] = 27;
            class51.field638[188] = 71;
            class51.field638[189] = 26;
            class51.field638[190] = 72;
            class51.field638[191] = 73;
            class51.field638[192] = 58;
            class51.field638[219] = 42;
            class51.field638[220] = 74;
            class51.field638[221] = 43;
            class51.field638[222] = 59;
            class51.field638[223] = 28;
        }
        Canvas var1 = this.field709;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field634);
        var1.addFocusListener(class51.field634);
    }

    @ObfuscatedName("bh.b(I)V")
    public final void method755() {
        class60.method3722(this.field709);
    }

    @ObfuscatedName("bh.w(I)V")
    public final void method808() {
        Container var1 = this.method780();
        if (var1 == null) {
            return;
        }
        class279 var2 = this.method800();
        this.field693 = Math.max(var2.field3736, this.field702);
        this.field687 = Math.max(var2.field3735, this.field698);
        if (this.field693 <= 0) {
            this.field693 = 1;
        }
        if (this.field687 <= 0) {
            this.field687 = 1;
        }
        Statics.field3627 = Math.min(this.field693, this.field684);
        Statics.field321 = Math.min(this.field687, this.field700);
        this.field690 = (this.field693 - Statics.field3627) / 2;
        this.field696 = 0;
        this.field709.setSize(Statics.field3627, Statics.field321);
        Statics.field542 = new class58(Statics.field3627, Statics.field321, this.field709);
        if (this.field701 == var1) {
            Insets var3 = this.field701.getInsets();
            this.field709.setLocation(this.field690 + var3.left, this.field696 + var3.top);
        } else {
            this.field709.setLocation(this.field690, this.field696);
        }
        this.field695 = true;
        this.method757();
    }

    @ObfuscatedName("bh.c(B)V")
    public void method758() {
        int var1 = this.field690;
        int var2 = this.field696;
        int var3 = this.field693 - Statics.field3627 - var1;
        int var4 = this.field687 - Statics.field321 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method780();
            int var6 = 0;
            int var7 = 0;
            if (this.field701 == var5) {
                Insets var8 = this.field701.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field687);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field693, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field693 + var6 - var3, var7, var3, this.field687);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field687 + var7 - var4, this.field693, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bh.z(I)V")
    public final void method866() {
        Canvas var1 = this.field709;
        var1.removeKeyListener(class51.field634);
        var1.removeFocusListener(class51.field634);
        class51.field629 = -1;
        class60.method1601(this.field709);
        if (this.field708 != null) {
            this.field708.method651(this.field709);
        }
        this.method761();
        Canvas var2 = this.field709;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field634);
        var2.addFocusListener(class51.field634);
        class60.method3722(this.field709);
        if (this.field708 != null) {
            this.field708.method650(this.field709);
        }
        this.method807();
    }

    @ObfuscatedName("bh.ay(IIII)V")
    public final void method760(int arg0, int arg1, int arg2) {
        try {
            if (field694 != null) {
                field712++;
                if (field712 >= 3) {
                    this.method882("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field694 = this;
            Statics.field3627 = arg0;
            Statics.field321 = arg1;
            Statics.field2196 = arg2;
            Statics.field2202 = this;
            if (Statics.field683 == null) {
                Statics.field683 = new class155();
            }
            Statics.field683.method2715(this, 1);
        } catch (Exception var5) {
            class153.method3831((String) null, var5);
            this.method882("crash");
        }
    }

    @ObfuscatedName("bh.ah(I)V")
    public final synchronized void method761() {
        Container var1 = this.method780();
        if (this.field709 != null) {
            this.field709.removeFocusListener(this);
            var1.remove(this.field709);
        }
        Statics.field3627 = Math.max(var1.getWidth(), this.field702);
        Statics.field321 = Math.max(var1.getHeight(), this.field698);
        if (this.field701 != null) {
            Insets var2 = this.field701.getInsets();
            Statics.field3627 -= var2.right + var2.left;
            Statics.field321 -= var2.top + var2.bottom;
        }
        this.field709 = new class54(this);
        var1.add(this.field709);
        this.field709.setSize(Statics.field3627, Statics.field321);
        this.field709.setVisible(true);
        this.field709.setBackground(Color.BLACK);
        if (this.field701 == var1) {
            Insets var3 = this.field701.getInsets();
            this.field709.setLocation(this.field690 + var3.left, this.field696 + var3.top);
        } else {
            this.field709.setLocation(this.field690, this.field696);
        }
        this.field709.addFocusListener(this);
        this.field709.requestFocus();
        this.field695 = true;
        if (Statics.field542 != null && Statics.field3627 == Statics.field542.field3754 && Statics.field321 == Statics.field542.field3756) {
            ((class58) Statics.field542).method736(this.field709);
            Statics.field542.method738(0, 0);
        } else {
            Statics.field542 = new class58(Statics.field3627, Statics.field321, this.field709);
        }
        this.field706 = false;
        this.field707 = class176.method3821();
    }

    @ObfuscatedName("bh.az(I)Z")
    public final boolean method762() {
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
                this.method882("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2216 != null) {
                String var1 = Statics.field2216.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2214;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method882("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class271.method3832(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class271.method4565(var4) && class271.method1007(var4) < 10) {
                            this.method882("wrongjava");
                            return;
                        }
                    }
                    field689 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method761();
            this.method789();
            class159 var5;
            try {
                var5 = new class151();
            } catch (Throwable var9) {
                var5 = new class152();
            }
            Statics.field3198 = var5;
            while (field685 == 0L || class176.method3821() < field685) {
                Statics.field787 = Statics.field3198.method2700(field688, field689);
                for (int var7 = 0; var7 < Statics.field787; var7++) {
                    this.method764();
                }
                this.method765();
                this.method771(this.field709);
            }
        } catch (Exception var10) {
            class153.method3831((String) null, var10);
            this.method882("crash");
        }
        this.method756();
    }

    @ObfuscatedName("bh.ac(I)V")
    public void method764() {
        long var1 = class176.method3821();
        long var3 = field692[Statics.field1386];
        field692[Statics.field1386] = var1;
        Statics.field1386 = Statics.field1386 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2795 = field711;
        }
        this.method803();
    }

    @ObfuscatedName("bh.aq(S)V")
    public void method765() {
        Container var1 = this.method780();
        long var2 = class176.method3821();
        long var4 = field691[Statics.field3179];
        field691[Statics.field3179] = var2;
        Statics.field3179 = Statics.field3179 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field686 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field704 - 1 > 50) {
            field704 -= 50;
            this.field695 = true;
            this.field709.setSize(Statics.field3627, Statics.field321);
            this.field709.setVisible(true);
            if (this.field701 == var1) {
                Insets var7 = this.field701.getInsets();
                this.field709.setLocation(this.field690 + var7.left, this.field696 + var7.top);
            } else {
                this.field709.setLocation(this.field690, this.field696);
            }
        }
        if (this.field706) {
            this.method866();
        }
        this.method766();
        this.method767(this.field695);
        if (this.field695) {
            this.method758();
        }
        this.field695 = false;
    }

    @ObfuscatedName("bh.af(I)V")
    public final void method766() {
        class279 var1 = this.method800();
        if (this.field693 != var1.field3736 || this.field687 != var1.field3735 || this.field705) {
            this.method808();
            this.field705 = false;
        }
    }

    @ObfuscatedName("bh.aj(I)V")
    public final void method807() {
        this.field705 = true;
    }

    @ObfuscatedName("bh.ax(B)V")
    public final synchronized void method756() {
        if (field713) {
            return;
        }
        field713 = true;
        try {
            this.field709.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method776();
        } catch (Exception var7) {
        }
        if (this.field701 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field683 != null) {
            try {
                Statics.field683.method2736();
            } catch (Exception var5) {
            }
        }
        this.method854();
    }

    public final void start() {
        if (field694 == this && !field713) {
            field685 = 0L;
        }
    }

    public final void stop() {
        if (field694 == this && !field713) {
            field685 = class176.method3821() + 4000L;
        }
    }

    public final void destroy() {
        if (field694 == this && !field713) {
            field685 = class176.method3821();
            class182.method138(5000L);
            this.method756();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field694 != this || field713) {
            return;
        }
        this.field695 = true;
        if (class176.method3821() - this.field707 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3627 && var2.height >= Statics.field321) {
                this.field706 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field711 = true;
        this.field695 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field711 = false;
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

    @ObfuscatedName("bh.ag(ILjava/lang/String;ZB)V")
    public final void method751(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field709.getGraphics();
            if (Statics.field1553 == null) {
                Statics.field1553 = new Font("Helvetica", 1, 13);
                Statics.field851 = this.field709.getFontMetrics(Statics.field1553);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3627, Statics.field321);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field540 == null) {
                    Statics.field540 = this.field709.createImage(304, 34);
                }
                Graphics var6 = Statics.field540.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1553);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field851.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field540, Statics.field3627 / 2 - 152, Statics.field321 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3627 / 2 - 152;
                int var9 = Statics.field321 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1553);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field851.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field709.repaint();
        }
    }

    @ObfuscatedName("bh.at(B)V")
    public final void method778() {
        Statics.field540 = null;
        Statics.field1553 = null;
        Statics.field851 = null;
    }

    @ObfuscatedName("bh.ai(Ljava/lang/String;I)V")
    public void method882(String arg0) {
        if (this.field710) {
            return;
        }
        this.field710 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bh.ao(I)Ljava/awt/Container;")
    public Container method780() {
        return this.field701 == null ? this : this.field701;
    }

    @ObfuscatedName("bh.am(I)Ljv;")
    public class279 method800() {
        Container var1 = this.method780();
        int var2 = Math.max(var1.getWidth(), this.field702);
        int var3 = Math.max(var1.getHeight(), this.field698);
        if (this.field701 != null) {
            Insets var4 = this.field701.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class279(var2, var3);
    }

    @ObfuscatedName("bh.ap(I)Z")
    public final boolean method782() {
        return this.field701 != null;
    }

    @ObfuscatedName("bh.f(B)V")
    public abstract void method757();

    @ObfuscatedName("bh.ae(ZI)V")
    public abstract void method767(boolean arg0);

    public abstract void init();

    @ObfuscatedName("bh.ar(I)V")
    public abstract void method776();

    @ObfuscatedName("bh.ad(I)V")
    public abstract void method789();

    @ObfuscatedName("bh.av(I)V")
    public abstract void method803();

    @ObfuscatedName("bh.as(B)V")
    public abstract void method854();
}
