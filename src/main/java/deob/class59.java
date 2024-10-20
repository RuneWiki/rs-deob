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
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

@ObfuscatedName("be")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("be.e")
    public static class59 field632 = null;

    @ObfuscatedName("be.k")
    public static int field633 = 0;

    @ObfuscatedName("be.u")
    public static long field655 = 0L;

    @ObfuscatedName("be.z")
    public static boolean field650 = false;

    @ObfuscatedName("be.t")
    public boolean field636 = false;

    @ObfuscatedName("be.g")
    public static int field641 = 20;

    @ObfuscatedName("be.j")
    public static int field637 = 1;

    @ObfuscatedName("be.c")
    public static int field639 = 0;

    @ObfuscatedName("be.o")
    public static long[] field634 = new long[32];

    @ObfuscatedName("be.i")
    public static long[] field663 = new long[32];

    @ObfuscatedName("be.m")
    public int field649;

    @ObfuscatedName("be.q")
    public int field643;

    @ObfuscatedName("be.b")
    public int field644 = 0;

    @ObfuscatedName("be.h")
    public int field647 = 0;

    @ObfuscatedName("be.p")
    public int field646;

    @ObfuscatedName("be.ab")
    public int field635;

    @ObfuscatedName("be.ad")
    public int field648;

    @ObfuscatedName("be.ag")
    public int field645;

    @ObfuscatedName("be.aq")
    public Frame field642;

    @ObfuscatedName("be.ax")
    public Canvas field651;

    @ObfuscatedName("be.at")
    public volatile boolean field652 = true;

    @ObfuscatedName("be.an")
    public static int field653 = 500;

    @ObfuscatedName("be.ac")
    public boolean field654 = false;

    @ObfuscatedName("be.aw")
    public volatile boolean field664 = false;

    @ObfuscatedName("be.al")
    public volatile long field656 = 0L;

    @ObfuscatedName("be.af")
    public class50 field658;

    @ObfuscatedName("be.ah")
    public Clipboard field659;

    @ObfuscatedName("be.az")
    public final EventQueue field660;

    @ObfuscatedName("be.av")
    public static volatile boolean field661 = true;

    @ObfuscatedName("be.aa")
    public static long field662 = -1L;

    @ObfuscatedName("be.aj")
    public static long field640 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field660 = var1;
        class109.method1702(new class52());
    }

    @ObfuscatedName("be.u(III)V")
    public final void method710(int arg0, int arg1) {
        if (this.field648 != arg0 || this.field645 != arg1) {
            this.method726();
        }
        this.field648 = arg0;
        this.field645 = arg1;
    }

    @ObfuscatedName("be.z(Ljava/lang/Object;B)V")
    public final void method709(Object arg0) {
        if (this.field660 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field660.peekEvent() != null; var2++) {
            class193.method1373(1L);
        }
        if (arg0 != null) {
            this.field660.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("be.t(B)Lfe;")
    public class159 method838() {
        if (this.field658 == null) {
            this.field658 = new class50();
            this.field658.method622(this.field651);
        }
        return this.field658;
    }

    @ObfuscatedName("be.f(B)V")
    public void method773() {
        this.field659 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("be.g(Ljava/lang/String;I)V")
    public void method785(String arg0) {
        this.field659.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("be.x(I)V")
    public final void method794() {
        if (Statics.field2130.toLowerCase().indexOf("microsoft") == -1) {
            class51.field607[44] = 71;
            class51.field607[45] = 26;
            class51.field607[46] = 72;
            class51.field607[47] = 73;
            class51.field607[59] = 57;
            class51.field607[61] = 27;
            class51.field607[91] = 42;
            class51.field607[92] = 74;
            class51.field607[93] = 43;
            class51.field607[192] = 28;
            class51.field607[222] = 58;
            class51.field607[520] = 59;
        } else {
            class51.field607[186] = 57;
            class51.field607[187] = 27;
            class51.field607[188] = 71;
            class51.field607[189] = 26;
            class51.field607[190] = 72;
            class51.field607[191] = 73;
            class51.field607[192] = 58;
            class51.field607[219] = 42;
            class51.field607[220] = 74;
            class51.field607[221] = 43;
            class51.field607[222] = 59;
            class51.field607[223] = 28;
        }
        Canvas var1 = this.field651;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class51.field604);
        var1.addFocusListener(class51.field604);
    }

    @ObfuscatedName("be.c(B)V")
    public final void method802() {
        class60.method200(this.field651);
    }

    @ObfuscatedName("be.n(I)V")
    public final void method715() {
        Container var1 = this.method786();
        if (var1 == null) {
            return;
        }
        class292 var2 = this.method740();
        this.field649 = Math.max(var2.field3814, this.field646);
        this.field643 = Math.max(var2.field3813, this.field635);
        if (this.field649 <= 0) {
            this.field649 = 1;
        }
        if (this.field643 <= 0) {
            this.field643 = 1;
        }
        Statics.field2446 = Math.min(this.field649, this.field648);
        Statics.field1897 = Math.min(this.field643, this.field645);
        this.field644 = (this.field649 - Statics.field2446) / 2;
        this.field647 = 0;
        this.field651.setSize(Statics.field2446, Statics.field1897);
        Statics.field720 = new class58(Statics.field2446, Statics.field1897, this.field651);
        if (this.field642 == var1) {
            Insets var3 = this.field642.getInsets();
            this.field651.setLocation(this.field644 + var3.left, this.field647 + var3.top);
        } else {
            this.field651.setLocation(this.field644, this.field647);
        }
        this.field652 = true;
        this.method716();
    }

    @ObfuscatedName("be.o(I)V")
    public void method752() {
        int var1 = this.field644;
        int var2 = this.field647;
        int var3 = this.field649 - Statics.field2446 - var1;
        int var4 = this.field643 - Statics.field1897 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method786();
            int var6 = 0;
            int var7 = 0;
            if (this.field642 == var5) {
                Insets var8 = this.field642.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field643);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field649, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field649 + var6 - var3, var7, var3, this.field643);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field643 + var7 - var4, this.field649, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("be.r(B)V")
    public final void method707() {
        Canvas var1 = this.field651;
        var1.removeKeyListener(class51.field604);
        var1.removeFocusListener(class51.field604);
        class51.field598 = -1;
        class60.method228(this.field651);
        if (this.field658 != null) {
            this.field658.method630(this.field651);
        }
        this.method720();
        Canvas var2 = this.field651;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class51.field604);
        var2.addFocusListener(class51.field604);
        class60.method200(this.field651);
        if (this.field658 != null) {
            this.field658.method622(this.field651);
        }
        this.method726();
    }

    @ObfuscatedName("be.i(IIIB)V")
    public final void method719(int arg0, int arg1, int arg2) {
        try {
            if (field632 != null) {
                field633++;
                if (field633 >= 3) {
                    this.method738("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field632 = this;
            Statics.field2446 = arg0;
            Statics.field1897 = arg1;
            Statics.field482 = arg2;
            Statics.field2115 = this;
            if (Statics.field638 == null) {
                Statics.field638 = new class157();
            }
            Statics.field638.method2733(this, 1);
        } catch (Exception var5) {
            class155.method1339((String) null, var5);
            this.method738("crash");
        }
    }

    @ObfuscatedName("be.d(I)V")
    public final synchronized void method720() {
        Container var1 = this.method786();
        if (this.field651 != null) {
            this.field651.removeFocusListener(this);
            var1.remove(this.field651);
        }
        Statics.field2446 = Math.max(var1.getWidth(), this.field646);
        Statics.field1897 = Math.max(var1.getHeight(), this.field635);
        if (this.field642 != null) {
            Insets var2 = this.field642.getInsets();
            Statics.field2446 -= var2.right + var2.left;
            Statics.field1897 -= var2.top + var2.bottom;
        }
        this.field651 = new class54(this);
        var1.add(this.field651);
        this.field651.setSize(Statics.field2446, Statics.field1897);
        this.field651.setVisible(true);
        this.field651.setBackground(Color.BLACK);
        if (this.field642 == var1) {
            Insets var3 = this.field642.getInsets();
            this.field651.setLocation(this.field644 + var3.left, this.field647 + var3.top);
        } else {
            this.field651.setLocation(this.field644, this.field647);
        }
        this.field651.addFocusListener(this);
        this.field651.requestFocus();
        this.field652 = true;
        if (Statics.field720 != null && Statics.field2446 == Statics.field720.field3834 && Statics.field1897 == Statics.field720.field3836) {
            ((class58) Statics.field720).method694(this.field651);
            Statics.field720.method693(0, 0);
        } else {
            Statics.field720 = new class58(Statics.field2446, Statics.field1897, this.field651);
        }
        this.field664 = false;
        this.field656 = class187.method1411();
    }

    @ObfuscatedName("be.v(I)Z")
    public final boolean method721() {
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
                this.method738("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2130 != null) {
                String var1 = Statics.field2130.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2129;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method738("wrongjava");
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
                            label184: {
                                char var12 = var6.charAt(var11);
                                if (var11 == 0) {
                                    if (var12 == '-') {
                                        var7 = true;
                                        break label184;
                                    }
                                    if (var12 == '+') {
                                        break label184;
                                    }
                                }
                                int var22;
                                if (var12 >= '0' && var12 <= '9') {
                                    var22 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var22 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var22 = var12 - 'W';
                                }
                                if (var22 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var22 = -var22;
                                }
                                int var14 = var9 * 10 + var22;
                                if (var14 / 10 != var9) {
                                    var13 = false;
                                    break;
                                }
                                var9 = var14;
                                var8 = true;
                            }
                            var11++;
                        }
                        if (var13 && class282.method3856(var6) < 10) {
                            this.method738("wrongjava");
                            return;
                        }
                    }
                    field637 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method720();
            this.method819();
            class163 var16;
            try {
                var16 = new class152();
            } catch (Throwable var20) {
                var16 = new class153();
            }
            Statics.field2411 = var16;
            while (field655 == 0L || class187.method1411() < field655) {
                Statics.field2740 = Statics.field2411.method2699(field641, field637);
                for (int var18 = 0; var18 < Statics.field2740; var18++) {
                    this.method723();
                }
                this.method724();
                this.method709(this.field651);
            }
        } catch (Exception var21) {
            class155.method1339((String) null, var21);
            this.method738("crash");
        }
        this.method727();
    }

    @ObfuscatedName("be.p(I)V")
    public void method723() {
        long var1 = class187.method1411();
        long var3 = field663[Statics.field439];
        field663[Statics.field439] = var1;
        Statics.field439 = Statics.field439 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3252 = field661;
        }
        this.method733();
    }

    @ObfuscatedName("be.ab(I)V")
    public void method724() {
        Container var1 = this.method786();
        long var2 = class187.method1411();
        long var4 = field634[Statics.field2541];
        field634[Statics.field2541] = var2;
        Statics.field2541 = Statics.field2541 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field639 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field653 - 1 > 50) {
            field653 -= 50;
            this.field652 = true;
            this.field651.setSize(Statics.field2446, Statics.field1897);
            this.field651.setVisible(true);
            if (this.field642 == var1) {
                Insets var7 = this.field642.getInsets();
                this.field651.setLocation(this.field644 + var7.left, this.field647 + var7.top);
            } else {
                this.field651.setLocation(this.field644, this.field647);
            }
        }
        if (this.field664) {
            this.method707();
        }
        this.method798();
        this.method734(this.field652);
        if (this.field652) {
            this.method752();
        }
        this.field652 = false;
    }

    @ObfuscatedName("be.ad(I)V")
    public final void method798() {
        class292 var1 = this.method740();
        if (this.field649 != var1.field3814 || this.field643 != var1.field3813 || this.field654) {
            this.method715();
            this.field654 = false;
        }
    }

    @ObfuscatedName("be.ag(I)V")
    public final void method726() {
        this.field654 = true;
    }

    @ObfuscatedName("be.ak(I)V")
    public final synchronized void method727() {
        if (field650) {
            return;
        }
        field650 = true;
        try {
            this.field651.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method735();
        } catch (Exception var7) {
        }
        if (this.field642 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field638 != null) {
            try {
                Statics.field638.method2730();
            } catch (Exception var5) {
            }
        }
        this.method713();
    }

    public final void start() {
        if (field632 == this && !field650) {
            field655 = 0L;
        }
    }

    public final void stop() {
        if (field632 == this && !field650) {
            field655 = class187.method1411() + 4000L;
        }
    }

    public final void destroy() {
        if (field632 == this && !field650) {
            field655 = class187.method1411();
            class193.method1373(5000L);
            this.method727();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field632 != this || field650) {
            return;
        }
        this.field652 = true;
        if (class187.method1411() - this.field656 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2446 && var2.height >= Statics.field1897) {
                this.field664 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field661 = true;
        this.field652 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field661 = false;
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

    @ObfuscatedName("be.ap(ILjava/lang/String;ZB)V")
    public final void method736(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field651.getGraphics();
            if (Statics.field3738 == null) {
                Statics.field3738 = new Font("Helvetica", 1, 13);
                Statics.field516 = this.field651.getFontMetrics(Statics.field3738);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2446, Statics.field1897);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field462 == null) {
                    Statics.field462 = this.field651.createImage(304, 34);
                }
                Graphics var6 = Statics.field462.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3738);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field516.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field462, Statics.field2446 / 2 - 152, Statics.field1897 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2446 / 2 - 152;
                int var9 = Statics.field1897 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3738);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field516.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field651.repaint();
        }
    }

    @ObfuscatedName("be.an(I)V")
    public final void method737() {
        Statics.field462 = null;
        Statics.field3738 = null;
        Statics.field516 = null;
    }

    @ObfuscatedName("be.ac(Ljava/lang/String;B)V")
    public void method738(String arg0) {
        if (this.field636) {
            return;
        }
        this.field636 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("be.aw(B)Ljava/awt/Container;")
    public Container method786() {
        return this.field642 == null ? this : this.field642;
    }

    @ObfuscatedName("be.al(B)Lkr;")
    public class292 method740() {
        Container var1 = this.method786();
        int var2 = Math.max(var1.getWidth(), this.field646);
        int var3 = Math.max(var1.getHeight(), this.field635);
        if (this.field642 != null) {
            Insets var4 = this.field642.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class292(var2, var3);
    }

    @ObfuscatedName("be.ay(I)Z")
    public final boolean method741() {
        return this.field642 != null;
    }

    @ObfuscatedName("hw.ai(I)I")
    public static int method3860() {
        int var0 = 0;
        if (Statics.field2739 == null || !Statics.field2739.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2739 = var2;
                        field640 = -1L;
                        field662 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2739 != null) {
            long var4 = class187.method1411();
            long var6 = Statics.field2739.getCollectionTime();
            if (field662 != -1L) {
                long var8 = var6 - field662;
                long var10 = var4 - field640;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field662 = var6;
            field640 = var4;
        }
        return var0;
    }

    @ObfuscatedName("be.af(I)V")
    public abstract void method713();

    @ObfuscatedName("be.y(I)V")
    public abstract void method716();

    @ObfuscatedName("be.aq(I)V")
    public abstract void method733();

    @ObfuscatedName("be.ax(ZI)V")
    public abstract void method734(boolean arg0);

    @ObfuscatedName("be.at(B)V")
    public abstract void method735();

    public abstract void init();

    @ObfuscatedName("be.as(I)V")
    public abstract void method819();
}
