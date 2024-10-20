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
import java.awt.LayoutManager;
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

@ObfuscatedName("ay")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ay.q")
    public static class32 field196 = null;

    @ObfuscatedName("ay.f")
    public static int field178 = 0;

    @ObfuscatedName("ay.j")
    public static long field179 = 0L;

    @ObfuscatedName("ay.m")
    public static boolean field203 = false;

    @ObfuscatedName("ay.k")
    public boolean field181 = false;

    @ObfuscatedName("ay.a")
    public static int field176 = 20;

    @ObfuscatedName("ay.e")
    public static int field184 = 1;

    @ObfuscatedName("ay.i")
    public static int field185 = 0;

    @ObfuscatedName("ay.s")
    public static long[] field210 = new long[32];

    @ObfuscatedName("ay.b")
    public static long[] field193 = new long[32];

    @ObfuscatedName("ay.z")
    public int field189;

    @ObfuscatedName("ay.h")
    public int field191;

    @ObfuscatedName("ay.o")
    public int field187 = 0;

    @ObfuscatedName("ay.r")
    public int field188 = 0;

    @ObfuscatedName("ay.d")
    public int field180;

    @ObfuscatedName("ay.ab")
    public int field194;

    @ObfuscatedName("ay.ad")
    public int field195;

    @ObfuscatedName("ay.as")
    public int field206;

    @ObfuscatedName("ay.ay")
    public Frame field177;

    @ObfuscatedName("ay.al")
    public Canvas field199;

    @ObfuscatedName("ay.ao")
    public volatile boolean field200 = true;

    @ObfuscatedName("ay.aa")
    public static int field201 = 500;

    @ObfuscatedName("ay.ag")
    public boolean field202 = false;

    @ObfuscatedName("ay.aq")
    public volatile boolean field198 = false;

    @ObfuscatedName("ay.ar")
    public volatile long field204 = 0L;

    @ObfuscatedName("ay.ax")
    public class23 field205;

    @ObfuscatedName("ay.an")
    public Clipboard field209;

    @ObfuscatedName("ay.av")
    public final EventQueue field207;

    @ObfuscatedName("ay.ap")
    public static volatile boolean field208 = true;

    @ObfuscatedName("ay.aw")
    public static long field186 = -1L;

    @ObfuscatedName("ay.az")
    public static long field192 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field207 = var1;
        class25 var3 = new class25();
        Statics.field848 = var3;
    }

    @ObfuscatedName("ay.k(IIB)V")
    public final void method439(int arg0, int arg1) {
        if (this.field195 != arg0 || this.field206 != arg1) {
            this.method455();
        }
        this.field195 = arg0;
        this.field206 = arg1;
    }

    @ObfuscatedName("ay.t(Ljava/lang/Object;I)V")
    public final void method440(Object arg0) {
        if (this.field207 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field207.peekEvent() != null; var2++) {
            class399.method2395(1L);
        }
        if (arg0 != null) {
            this.field207.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ay.a(I)Lec;")
    public class145 method441() {
        if (this.field205 == null) {
            this.field205 = new class23();
            this.field205.method318(this.field199);
        }
        return this.field205;
    }

    @ObfuscatedName("ay.e(I)V")
    public void method497() {
        this.field209 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ay.i(Ljava/lang/String;B)V")
    public void method443(String arg0) {
        this.field209.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ay.y(I)V")
    public final void method444() {
        if (Statics.field1555.toLowerCase().indexOf("microsoft") == -1) {
            class24.field144[44] = 71;
            class24.field144[45] = 26;
            class24.field144[46] = 72;
            class24.field144[47] = 73;
            class24.field144[59] = 57;
            class24.field144[61] = 27;
            class24.field144[91] = 42;
            class24.field144[92] = 74;
            class24.field144[93] = 43;
            class24.field144[192] = 28;
            class24.field144[222] = 58;
            class24.field144[520] = 59;
        } else {
            class24.field144[186] = 57;
            class24.field144[187] = 27;
            class24.field144[188] = 71;
            class24.field144[189] = 26;
            class24.field144[190] = 72;
            class24.field144[191] = 73;
            class24.field144[192] = 58;
            class24.field144[219] = 42;
            class24.field144[220] = 74;
            class24.field144[221] = 43;
            class24.field144[222] = 59;
            class24.field144[223] = 28;
        }
        class24.method150(this.field199);
    }

    @ObfuscatedName("ay.w(I)V")
    public final void method445() {
        class33.method2495(this.field199);
    }

    @ObfuscatedName("ay.g(I)V")
    public final void method541() {
        Container var1 = this.method521();
        if (var1 == null) {
            return;
        }
        class351 var2 = this.method470();
        this.field189 = Math.max(var2.field4030, this.field180);
        this.field191 = Math.max(var2.field4029, this.field194);
        if (this.field189 <= 0) {
            this.field189 = 1;
        }
        if (this.field191 <= 0) {
            this.field191 = 1;
        }
        Statics.field3203 = Math.min(this.field189, this.field195);
        Statics.field1050 = Math.min(this.field191, this.field206);
        this.field187 = (this.field189 - Statics.field3203) / 2;
        this.field188 = 0;
        this.field199.setSize(Statics.field3203, Statics.field1050);
        Statics.field2895 = new class31(Statics.field3203, Statics.field1050, this.field199);
        if (this.field177 == var1) {
            Insets var3 = this.field177.getInsets();
            this.field199.setLocation(this.field187 + var3.left, this.field188 + var3.top);
        } else {
            this.field199.setLocation(this.field187, this.field188);
        }
        this.field200 = true;
        this.method534();
    }

    @ObfuscatedName("ay.s(I)V")
    public void method448() {
        int var1 = this.field187;
        int var2 = this.field188;
        int var3 = this.field189 - Statics.field3203 - var1;
        int var4 = this.field191 - Statics.field1050 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method521();
            int var6 = 0;
            int var7 = 0;
            if (this.field177 == var5) {
                Insets var8 = this.field177.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field191);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field189, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field189 + var6 - var3, var7, var3, this.field191);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field191 + var7 - var4, this.field189, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ay.c(B)V")
    public final void method550() {
        Canvas var1 = this.field199;
        var1.removeKeyListener(class24.field132);
        var1.removeFocusListener(class24.field132);
        class24.field124 = -1;
        Canvas var2 = this.field199;
        var2.removeMouseListener(class33.field219);
        var2.removeMouseMotionListener(class33.field219);
        var2.removeFocusListener(class33.field219);
        class33.field233 = 0;
        if (this.field205 != null) {
            this.field205.method323(this.field199);
        }
        this.method450();
        class24.method150(this.field199);
        class33.method2495(this.field199);
        if (this.field205 != null) {
            this.field205.method318(this.field199);
        }
        this.method455();
    }

    @ObfuscatedName("ay.b(IIII)V")
    public final void method449(int arg0, int arg1, int arg2) {
        try {
            if (field196 != null) {
                field178++;
                if (field178 >= 3) {
                    this.method561("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field196 = this;
            Statics.field3203 = arg0;
            Statics.field1050 = arg1;
            Statics.field4433 = arg2;
            Statics.field4434 = this;
            if (Statics.field183 == null) {
                Statics.field183 = new class143();
            }
            Statics.field183.method2553(this, 1);
        } catch (Exception var5) {
            class425.method5430((String) null, var5);
            this.method561("crash");
        }
    }

    @ObfuscatedName("ay.x(I)V")
    public final synchronized void method450() {
        Container var1 = this.method521();
        if (this.field199 != null) {
            this.field199.removeFocusListener(this);
            var1.remove(this.field199);
        }
        Statics.field3203 = Math.max(var1.getWidth(), this.field180);
        Statics.field1050 = Math.max(var1.getHeight(), this.field194);
        if (this.field177 != null) {
            Insets var2 = this.field177.getInsets();
            Statics.field3203 -= var2.right + var2.left;
            Statics.field1050 -= var2.top + var2.bottom;
        }
        this.field199 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field199);
        this.field199.setSize(Statics.field3203, Statics.field1050);
        this.field199.setVisible(true);
        this.field199.setBackground(Color.BLACK);
        if (this.field177 == var1) {
            Insets var3 = this.field177.getInsets();
            this.field199.setLocation(this.field187 + var3.left, this.field188 + var3.top);
        } else {
            this.field199.setLocation(this.field187, this.field188);
        }
        this.field199.addFocusListener(this);
        this.field199.requestFocus();
        this.field200 = true;
        if (Statics.field2895 != null && Statics.field3203 == Statics.field2895.field4364 && Statics.field1050 == Statics.field2895.field4365) {
            ((class31) Statics.field2895).method425(this.field199);
            Statics.field2895.method424(0, 0);
        } else {
            Statics.field2895 = new class31(Statics.field3203, Statics.field1050, this.field199);
        }
        this.field198 = false;
        this.field204 = class398.method2299();
    }

    @ObfuscatedName("ay.p(I)Z")
    public final boolean method519() {
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
                this.method561("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1555 != null) {
                String var1 = Statics.field1555.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1547;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method561("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class319.method1797(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class319.method6082(var4) && class319.method4679(var4) < 10) {
                            this.method561("wrongjava");
                            return;
                        }
                    }
                    field184 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method450();
            this.method525();
            Statics.field2893 = class150.method3590();
            while (field179 == 0L || class398.method2299() < field179) {
                Statics.field182 = Statics.field2893.method2543(field176, field184);
                for (int var5 = 0; var5 < Statics.field182; var5++) {
                    this.method499();
                }
                this.method453();
                this.method440(this.field199);
            }
        } catch (Exception var7) {
            class425.method5430((String) null, var7);
            this.method561("crash");
        }
        this.method553();
    }

    @ObfuscatedName("ay.z(B)V")
    public void method499() {
        long var1 = class398.method2299();
        long var3 = field193[Statics.field1538];
        field193[Statics.field1538] = var1;
        Statics.field1538 = Statics.field1538 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1670 = field208;
        }
        this.method530();
    }

    @ObfuscatedName("ay.h(I)V")
    public void method453() {
        Container var1 = this.method521();
        long var2 = class398.method2299();
        long var4 = field210[Statics.field190];
        field210[Statics.field190] = var2;
        Statics.field190 = Statics.field190 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field185 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field201 - 1 > 50) {
            field201 -= 50;
            this.field200 = true;
            this.field199.setSize(Statics.field3203, Statics.field1050);
            this.field199.setVisible(true);
            if (this.field177 == var1) {
                Insets var7 = this.field177.getInsets();
                this.field199.setLocation(this.field187 + var7.left, this.field188 + var7.top);
            } else {
                this.field199.setLocation(this.field187, this.field188);
            }
        }
        if (this.field198) {
            this.method550();
        }
        this.method454();
        this.method529(this.field200);
        if (this.field200) {
            this.method448();
        }
        this.field200 = false;
    }

    @ObfuscatedName("ay.o(I)V")
    public final void method454() {
        class351 var1 = this.method470();
        if (this.field189 != var1.field4030 || this.field191 != var1.field4029 || this.field202) {
            this.method541();
            this.field202 = false;
        }
    }

    @ObfuscatedName("ay.r(B)V")
    public final void method455() {
        this.field202 = true;
    }

    @ObfuscatedName("ay.n(I)V")
    public final synchronized void method553() {
        if (field203) {
            return;
        }
        field203 = true;
        try {
            this.field199.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method528();
        } catch (Exception var7) {
        }
        if (this.field177 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field183 != null) {
            try {
                Statics.field183.method2550();
            } catch (Exception var5) {
            }
        }
        this.method472();
    }

    @ObfuscatedName("bm.u(I)V")
    public static final void method1632() {
        Statics.field2893.method2542();
        for (int var0 = 0; var0 < 32; var0++) {
            field210[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field193[var1] = 0L;
        }
        Statics.field182 = 0;
    }

    public final void start() {
        if (field196 == this && !field203) {
            field179 = 0L;
        }
    }

    public final void stop() {
        if (field196 == this && !field203) {
            field179 = class398.method2299() + 4000L;
        }
    }

    public final void destroy() {
        if (field196 == this && !field203) {
            field179 = class398.method2299();
            class399.method2395(5000L);
            this.method553();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field196 != this || field203) {
            return;
        }
        this.field200 = true;
        if (class398.method2299() - this.field204 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3203 && var2.height >= Statics.field1050) {
                this.field198 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field208 = true;
        this.field200 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field208 = false;
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

    @ObfuscatedName("ay.ak(ILjava/lang/String;ZI)V")
    public final void method457(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field199.getGraphics();
            if (Statics.field2105 == null) {
                Statics.field2105 = new Font("Helvetica", 1, 13);
                Statics.field197 = this.field199.getFontMetrics(Statics.field2105);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3203, Statics.field1050);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field4 == null) {
                    Statics.field4 = this.field199.createImage(304, 34);
                }
                Graphics var6 = Statics.field4.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2105);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field197.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field4, Statics.field3203 / 2 - 152, Statics.field1050 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3203 / 2 - 152;
                int var9 = Statics.field1050 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2105);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field197.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field199.repaint();
        }
    }

    @ObfuscatedName("ay.ah(I)V")
    public final void method467() {
        Statics.field4 = null;
        Statics.field2105 = null;
        Statics.field197 = null;
    }

    @ObfuscatedName("ay.ay(Ljava/lang/String;I)V")
    public void method561(String arg0) {
        if (this.field181) {
            return;
        }
        this.field181 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ay.al(I)Ljava/awt/Container;")
    public Container method521() {
        return this.field177 == null ? this : this.field177;
    }

    @ObfuscatedName("ay.ao(I)Lme;")
    public class351 method470() {
        Container var1 = this.method521();
        int var2 = Math.max(var1.getWidth(), this.field180);
        int var3 = Math.max(var1.getHeight(), this.field194);
        if (this.field177 != null) {
            Insets var4 = this.field177.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class351(var2, var3);
    }

    @ObfuscatedName("ay.au(I)Z")
    public final boolean method471() {
        return this.field177 != null;
    }

    @ObfuscatedName("ht.aa(I)I")
    public static int method4023() {
        int var0 = 0;
        if (Statics.field4239 == null || !Statics.field4239.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field4239 = var2;
                        field192 = -1L;
                        field186 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field4239 != null) {
            long var4 = class398.method2299();
            long var6 = Statics.field4239.getCollectionTime();
            if (field186 != -1L) {
                long var8 = var6 - field186;
                long var10 = var4 - field192;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field186 = var6;
            field192 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ay.ag(I)V")
    public abstract void method472();

    @ObfuscatedName("ay.d(I)V")
    public abstract void method525();

    @ObfuscatedName("ay.as(B)V")
    public abstract void method528();

    @ObfuscatedName("ay.ad(ZI)V")
    public abstract void method529(boolean arg0);

    @ObfuscatedName("ay.ab(I)V")
    public abstract void method530();

    @ObfuscatedName("ay.v(I)V")
    public abstract void method534();

    public abstract void init();
}
