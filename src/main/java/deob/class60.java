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

@ObfuscatedName("bt")
public abstract class class60 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bt.z")
    public static class60 field691 = null;

    @ObfuscatedName("bt.n")
    public static int field711 = 0;

    @ObfuscatedName("bt.r")
    public static long field706 = 0L;

    @ObfuscatedName("bt.e")
    public static boolean field681 = false;

    @ObfuscatedName("bt.k")
    public boolean field682 = false;

    @ObfuscatedName("bt.p")
    public static int field684 = 20;

    @ObfuscatedName("bt.m")
    public static int field685 = 1;

    @ObfuscatedName("bt.h")
    public static int field686 = 0;

    @ObfuscatedName("bt.u")
    public static long[] field688 = new long[32];

    @ObfuscatedName("bt.v")
    public static long[] field713 = new long[32];

    @ObfuscatedName("bt.b")
    public int field679;

    @ObfuscatedName("bt.c")
    public int field692;

    @ObfuscatedName("bt.j")
    public int field683 = 0;

    @ObfuscatedName("bt.l")
    public int field694 = 0;

    @ObfuscatedName("bt.a")
    public int field696;

    @ObfuscatedName("bt.ak")
    public int field677;

    @ObfuscatedName("bt.ap")
    public int field697;

    @ObfuscatedName("bt.ac")
    public int field699;

    @ObfuscatedName("bt.au")
    public Frame field680;

    @ObfuscatedName("bt.al")
    public Canvas field702;

    @ObfuscatedName("bt.af")
    public volatile boolean field703 = true;

    @ObfuscatedName("bt.az")
    public static int field678 = 500;

    @ObfuscatedName("bt.aq")
    public boolean field701 = false;

    @ObfuscatedName("bt.ae")
    public volatile boolean field690 = false;

    @ObfuscatedName("bt.ad")
    public volatile long field707 = 0L;

    @ObfuscatedName("bt.at")
    public class51 field708;

    @ObfuscatedName("bt.ag")
    public Clipboard field709;

    @ObfuscatedName("bt.an")
    public final EventQueue field710;

    @ObfuscatedName("bt.ax")
    public static volatile boolean field700 = true;

    @ObfuscatedName("bt.am")
    public static long field712 = -1L;

    @ObfuscatedName("bt.ay")
    public static long field705 = -1L;

    public class60() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field710 = var1;
        class53 var3 = new class53();
        Statics.field1566 = var3;
    }

    @ObfuscatedName("bt.k(III)V")
    public final void method788(int arg0, int arg1) {
        if (this.field697 != arg0 || this.field699 != arg1) {
            this.method766();
        }
        this.field697 = arg0;
        this.field699 = arg1;
    }

    @ObfuscatedName("bt.s(Ljava/lang/Object;I)V")
    public final void method748(Object arg0) {
        if (this.field710 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field710.peekEvent() != null; var2++) {
            class204.method3573(1L);
        }
        if (arg0 != null) {
            this.field710.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bt.x(I)Lft;")
    public class169 method751() {
        if (this.field708 == null) {
            this.field708 = new class51();
            this.field708.method639(this.field702);
        }
        return this.field708;
    }

    @ObfuscatedName("bt.h(I)V")
    public void method757() {
        this.field709 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bt.t(Ljava/lang/String;I)V")
    public void method753(String arg0) {
        this.field709.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bt.i(I)V")
    public final void method754() {
        if (Statics.field2189.toLowerCase().indexOf("microsoft") == -1) {
            class52.field645[44] = 71;
            class52.field645[45] = 26;
            class52.field645[46] = 72;
            class52.field645[47] = 73;
            class52.field645[59] = 57;
            class52.field645[61] = 27;
            class52.field645[91] = 42;
            class52.field645[92] = 74;
            class52.field645[93] = 43;
            class52.field645[192] = 28;
            class52.field645[222] = 58;
            class52.field645[520] = 59;
        } else {
            class52.field645[186] = 57;
            class52.field645[187] = 27;
            class52.field645[188] = 71;
            class52.field645[189] = 26;
            class52.field645[190] = 72;
            class52.field645[191] = 73;
            class52.field645[192] = 58;
            class52.field645[219] = 42;
            class52.field645[220] = 74;
            class52.field645[221] = 43;
            class52.field645[222] = 59;
            class52.field645[223] = 28;
        }
        Canvas var1 = this.field702;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class52.field634);
        var1.addFocusListener(class52.field634);
    }

    @ObfuscatedName("bt.u(I)V")
    public final void method869() {
        class61.method2894(this.field702);
    }

    @ObfuscatedName("bt.q(B)V")
    public final void method756() {
        Container var1 = this.method782();
        if (var1 == null) {
            return;
        }
        class324 var2 = this.method783();
        this.field679 = Math.max(var2.field3938, this.field696);
        this.field692 = Math.max(var2.field3937, this.field677);
        if (this.field679 <= 0) {
            this.field679 = 1;
        }
        if (this.field692 <= 0) {
            this.field692 = 1;
        }
        Statics.field695 = Math.min(this.field679, this.field697);
        Statics.field2582 = Math.min(this.field692, this.field699);
        this.field683 = (this.field679 - Statics.field695) / 2;
        this.field694 = 0;
        this.field702.setSize(Statics.field695, Statics.field2582);
        Statics.field340 = new class59(Statics.field695, Statics.field2582, this.field702);
        if (this.field680 == var1) {
            Insets var3 = this.field680.getInsets();
            this.field702.setLocation(this.field683 + var3.left, this.field694 + var3.top);
        } else {
            this.field702.setLocation(this.field683, this.field694);
        }
        this.field703 = true;
        this.method799();
    }

    @ObfuscatedName("bt.f(I)V")
    public void method758() {
        int var1 = this.field683;
        int var2 = this.field694;
        int var3 = this.field679 - Statics.field695 - var1;
        int var4 = this.field692 - Statics.field2582 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method782();
            int var6 = 0;
            int var7 = 0;
            if (this.field680 == var5) {
                Insets var8 = this.field680.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field692);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field679, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field679 + var6 - var3, var7, var3, this.field692);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field692 + var7 - var4, this.field679, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bt.b(I)V")
    public final void method759() {
        class52.method879(this.field702);
        class61.method139(this.field702);
        if (this.field708 != null) {
            this.field708.method640(this.field702);
        }
        this.method761();
        Canvas var1 = this.field702;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class52.field634);
        var1.addFocusListener(class52.field634);
        class61.method2894(this.field702);
        if (this.field708 != null) {
            this.field708.method639(this.field702);
        }
        this.method766();
    }

    @ObfuscatedName("bt.c(IIIB)V")
    public final void method760(int arg0, int arg1, int arg2) {
        try {
            if (field691 != null) {
                field711++;
                if (field711 >= 3) {
                    this.method781("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field691 = this;
            Statics.field695 = arg0;
            Statics.field2582 = arg1;
            Statics.field2171 = arg2;
            Statics.field2605 = this;
            if (Statics.field698 == null) {
                Statics.field698 = new class167();
            }
            Statics.field698.method3022(this, 1);
        } catch (Exception var5) {
            class165.method2426((String) null, var5);
            this.method781("crash");
        }
    }

    @ObfuscatedName("bt.w(I)V")
    public final synchronized void method761() {
        Container var1 = this.method782();
        if (this.field702 != null) {
            this.field702.removeFocusListener(this);
            var1.remove(this.field702);
        }
        Statics.field695 = Math.max(var1.getWidth(), this.field696);
        Statics.field2582 = Math.max(var1.getHeight(), this.field677);
        if (this.field680 != null) {
            Insets var2 = this.field680.getInsets();
            Statics.field695 -= var2.right + var2.left;
            Statics.field2582 -= var2.top + var2.bottom;
        }
        this.field702 = new class55(this);
        var1.add(this.field702);
        this.field702.setSize(Statics.field695, Statics.field2582);
        this.field702.setVisible(true);
        this.field702.setBackground(Color.BLACK);
        if (this.field680 == var1) {
            Insets var3 = this.field680.getInsets();
            this.field702.setLocation(this.field683 + var3.left, this.field694 + var3.top);
        } else {
            this.field702.setLocation(this.field683, this.field694);
        }
        this.field702.addFocusListener(this);
        this.field702.requestFocus();
        this.field703 = true;
        if (Statics.field340 != null && Statics.field695 == Statics.field340.field3961 && Statics.field2582 == Statics.field340.field3959) {
            ((class59) Statics.field340).method732(this.field702);
            Statics.field340.method733(0, 0);
        } else {
            Statics.field340 = new class59(Statics.field695, Statics.field2582, this.field702);
        }
        this.field690 = false;
        this.field707 = class197.method1501();
    }

    @ObfuscatedName("bt.o(S)Z")
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
                this.method781("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2189 != null) {
                String var1 = Statics.field2189.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2184;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method781("wrongjava");
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
                                int var23;
                                if (var12 >= '0' && var12 <= '9') {
                                    var23 = var12 - '0';
                                } else if (var12 >= 'A' && var12 <= 'Z') {
                                    var23 = var12 - '7';
                                } else {
                                    if (var12 < 'a' || var12 > 'z') {
                                        var13 = false;
                                        break;
                                    }
                                    var23 = var12 - 'W';
                                }
                                if (var23 >= 10) {
                                    var13 = false;
                                    break;
                                }
                                if (var7) {
                                    var23 = -var23;
                                }
                                int var14 = var9 * 10 + var23;
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
                            int var16 = class319.method2610(var6, 10, true);
                            if (var16 < 10) {
                                this.method781("wrongjava");
                                return;
                            }
                        }
                    }
                    field685 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method761();
            this.method775();
            class173 var17;
            try {
                var17 = new class162();
            } catch (Throwable var21) {
                var17 = new class163();
            }
            Statics.field3912 = var17;
            while (field706 == 0L || class197.method1501() < field706) {
                Statics.field704 = Statics.field3912.method2991(field684, field685);
                for (int var19 = 0; var19 < Statics.field704; var19++) {
                    this.method844();
                }
                this.method770();
                this.method748(this.field702);
            }
        } catch (Exception var22) {
            class165.method2426((String) null, var22);
            this.method781("crash");
        }
        this.method767();
    }

    @ObfuscatedName("bt.ac(B)V")
    public void method844() {
        long var1 = class197.method1501();
        long var3 = field713[Statics.field1300];
        field713[Statics.field1300] = var1;
        Statics.field1300 = Statics.field1300 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3806 = field700;
        }
        this.method865();
    }

    @ObfuscatedName("bt.aw(I)V")
    public void method770() {
        Container var1 = this.method782();
        long var2 = class197.method1501();
        long var4 = field688[Statics.field689];
        field688[Statics.field689] = var2;
        Statics.field689 = Statics.field689 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field686 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field678 - 1 > 50) {
            field678 -= 50;
            this.field703 = true;
            this.field702.setSize(Statics.field695, Statics.field2582);
            this.field702.setVisible(true);
            if (this.field680 == var1) {
                Insets var7 = this.field680.getInsets();
                this.field702.setLocation(this.field683 + var7.left, this.field694 + var7.top);
            } else {
                this.field702.setLocation(this.field683, this.field694);
            }
        }
        if (this.field690) {
            this.method759();
        }
        this.method765();
        this.method777(this.field703);
        if (this.field703) {
            this.method758();
        }
        this.field703 = false;
    }

    @ObfuscatedName("bt.as(B)V")
    public final void method765() {
        class324 var1 = this.method783();
        if (this.field679 != var1.field3938 || this.field692 != var1.field3937 || this.field701) {
            this.method756();
            this.field701 = false;
        }
    }

    @ObfuscatedName("bt.au(I)V")
    public final void method766() {
        this.field701 = true;
    }

    @ObfuscatedName("bt.al(I)V")
    public final synchronized void method767() {
        if (field681) {
            return;
        }
        field681 = true;
        try {
            this.field702.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method860();
        } catch (Exception var7) {
        }
        if (this.field680 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field698 != null) {
            try {
                Statics.field698.method3019();
            } catch (Exception var5) {
            }
        }
        this.method769();
    }

    @ObfuscatedName("be.af(B)V")
    public static final void method962() {
        Statics.field3912.method2990();
        for (int var0 = 0; var0 < 32; var0++) {
            field688[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field713[var1] = 0L;
        }
        Statics.field704 = 0;
    }

    public final void start() {
        if (field691 == this && !field681) {
            field706 = 0L;
        }
    }

    public final void stop() {
        if (field691 == this && !field681) {
            field706 = class197.method1501() + 4000L;
        }
    }

    public final void destroy() {
        if (field691 == this && !field681) {
            field706 = class197.method1501();
            class204.method3573(5000L);
            this.method767();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field691 != this || field681) {
            return;
        }
        this.field703 = true;
        if (class197.method1501() - this.field707 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field695 && var2.height >= Statics.field2582) {
                this.field690 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field700 = true;
        this.field703 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field700 = false;
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

    @ObfuscatedName("bt.ad(ILjava/lang/String;ZB)V")
    public final void method779(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field702.getGraphics();
            if (Statics.field693 == null) {
                Statics.field693 = new Font("Helvetica", 1, 13);
                Statics.field232 = this.field702.getFontMetrics(Statics.field693);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field695, Statics.field2582);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1324 == null) {
                    Statics.field1324 = this.field702.createImage(304, 34);
                }
                Graphics var6 = Statics.field1324.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field693);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field232.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1324, Statics.field695 / 2 - 152, Statics.field2582 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field695 / 2 - 152;
                int var9 = Statics.field2582 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field693);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field232.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field702.repaint();
        }
    }

    @ObfuscatedName("bt.ar(B)V")
    public final void method780() {
        Statics.field1324 = null;
        Statics.field693 = null;
        Statics.field232 = null;
    }

    @ObfuscatedName("bt.ao(Ljava/lang/String;I)V")
    public void method781(String arg0) {
        if (this.field682) {
            return;
        }
        this.field682 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bt.at(I)Ljava/awt/Container;")
    public Container method782() {
        return this.field680 == null ? this : this.field680;
    }

    @ObfuscatedName("bt.ag(I)Llj;")
    public class324 method783() {
        Container var1 = this.method782();
        int var2 = Math.max(var1.getWidth(), this.field696);
        int var3 = Math.max(var1.getHeight(), this.field677);
        if (this.field680 != null) {
            Insets var4 = this.field680.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class324(var2, var3);
    }

    @ObfuscatedName("bt.an(B)Z")
    public final boolean method805() {
        return this.field680 != null;
    }

    @ObfuscatedName("bt.ax(B)V")
    public abstract void method769();

    public abstract void init();

    @ObfuscatedName("bt.ai(B)V")
    public abstract void method775();

    @ObfuscatedName("bt.aq(ZI)V")
    public abstract void method777(boolean arg0);

    @ObfuscatedName("bt.v(I)V")
    public abstract void method799();

    @ObfuscatedName("bt.ae(S)V")
    public abstract void method860();

    @ObfuscatedName("bt.az(I)V")
    public abstract void method865();
}
