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

@ObfuscatedName("an")
public abstract class class36 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("an.e")
    public static class36 field212 = null;

    @ObfuscatedName("an.v")
    public static int field211 = 0;

    @ObfuscatedName("an.m")
    public static long field221 = 0L;

    @ObfuscatedName("an.q")
    public static boolean field213 = false;

    @ObfuscatedName("an.f")
    public boolean field240 = false;

    @ObfuscatedName("an.u")
    public static int field215 = 20;

    @ObfuscatedName("an.b")
    public static int field216 = 1;

    @ObfuscatedName("an.j")
    public static int field217 = 0;

    @ObfuscatedName("an.o")
    public static long[] field225 = new long[32];

    @ObfuscatedName("an.k")
    public static long[] field223 = new long[32];

    @ObfuscatedName("an.s")
    public int field220;

    @ObfuscatedName("an.l")
    public int field219;

    @ObfuscatedName("an.t")
    public int field222 = 0;

    @ObfuscatedName("an.c")
    public int field243 = 0;

    @ObfuscatedName("an.z")
    public int field224;

    @ObfuscatedName("an.as")
    public int field210;

    @ObfuscatedName("an.ad")
    public int field226;

    @ObfuscatedName("an.ao")
    public int field227;

    @ObfuscatedName("an.au")
    public Frame field228;

    @ObfuscatedName("an.ar")
    public Canvas field236;

    @ObfuscatedName("an.at")
    public volatile boolean field230 = true;

    @ObfuscatedName("an.an")
    public static int field231 = 500;

    @ObfuscatedName("an.ab")
    public boolean field232 = false;

    @ObfuscatedName("an.al")
    public volatile boolean field233 = false;

    @ObfuscatedName("an.ag")
    public volatile long field234 = 0L;

    @ObfuscatedName("an.af")
    public class23 field235;

    @ObfuscatedName("an.ai")
    public Clipboard field218;

    @ObfuscatedName("an.ax")
    public final EventQueue field237;

    @ObfuscatedName("an.ah")
    public static volatile boolean field238 = true;

    @ObfuscatedName("an.aj")
    public static class27 field229 = new class27();

    @ObfuscatedName("an.ap")
    public static long field239 = -1L;

    @ObfuscatedName("an.aa")
    public static long field241 = -1L;

    public class36() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field237 = var1;
        class24 var3 = new class24();
        Statics.field117 = var3;
    }

    @ObfuscatedName("an.x(III)V")
    public final void method484(int arg0, int arg1) {
        if (this.field226 != arg0 || this.field227 != arg1) {
            this.method505();
        }
        this.field226 = arg0;
        this.field227 = arg1;
    }

    @ObfuscatedName("an.m(Ljava/lang/Object;I)V")
    public final void method485(Object arg0) {
        if (this.field237 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field237.peekEvent() != null; var2++) {
            class284.method148(1L);
        }
        if (arg0 != null) {
            this.field237.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("an.q(I)Lff;")
    public class167 method486() {
        if (this.field235 == null) {
            this.field235 = new class23();
            this.field235.method297(this.field236);
        }
        return this.field235;
    }

    @ObfuscatedName("an.f(B)V")
    public void method487() {
        this.field218 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("an.r(Ljava/lang/String;S)V")
    public void method488(String arg0) {
        this.field218.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("an.u(B)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method489() {
        return this.field218;
    }

    @ObfuscatedName("an.b(I)V")
    public final void method490() {
        if (Statics.field1848.toLowerCase().indexOf("microsoft") == -1) {
            class30.field176[44] = 71;
            class30.field176[45] = 26;
            class30.field176[46] = 72;
            class30.field176[47] = 73;
            class30.field176[59] = 57;
            class30.field176[61] = 27;
            class30.field176[91] = 42;
            class30.field176[92] = 74;
            class30.field176[93] = 43;
            class30.field176[192] = 28;
            class30.field176[222] = 58;
            class30.field176[520] = 59;
        } else {
            class30.field176[186] = 57;
            class30.field176[187] = 27;
            class30.field176[188] = 71;
            class30.field176[189] = 26;
            class30.field176[190] = 72;
            class30.field176[191] = 73;
            class30.field176[192] = 58;
            class30.field176[219] = 42;
            class30.field176[220] = 74;
            class30.field176[221] = 43;
            class30.field176[222] = 59;
            class30.field176[223] = 28;
        }
        field229.method346(this.field236);
    }

    @ObfuscatedName("fs.j(S)I")
    public static final int method3166() {
        return field229.method345();
    }

    @ObfuscatedName("an.g(I)V")
    public final void method491() {
        field229.method352();
    }

    @ObfuscatedName("an.i(Lav;IB)V")
    public void method492(class31 arg0, int arg1) {
        field229.method344(arg0, arg1);
    }

    @ObfuscatedName("an.o(I)V")
    public final void method530() {
        Canvas var1 = this.field236;
        var1.addMouseListener(class37.field248);
        var1.addMouseMotionListener(class37.field248);
        var1.addFocusListener(class37.field248);
    }

    @ObfuscatedName("an.n(I)V")
    public final void method596() {
        Container var1 = this.method608();
        if (var1 == null) {
            return;
        }
        class407 var2 = this.method639();
        this.field220 = Math.max(var2.field4597, this.field224);
        this.field219 = Math.max(var2.field4594, this.field210);
        if (this.field220 <= 0) {
            this.field220 = 1;
        }
        if (this.field219 <= 0) {
            this.field219 = 1;
        }
        Statics.field2331 = Math.min(this.field220, this.field226);
        Statics.field4300 = Math.min(this.field219, this.field227);
        this.field222 = (this.field220 - Statics.field2331) / 2;
        this.field243 = 0;
        this.field236.setSize(Statics.field2331, Statics.field4300);
        Statics.field2354 = new class34(Statics.field2331, Statics.field4300, this.field236);
        if (this.field228 == var1) {
            Insets var3 = this.field228.getInsets();
            this.field236.setLocation(this.field222 + var3.left, this.field243 + var3.top);
        } else {
            this.field236.setLocation(this.field222, this.field243);
        }
        this.field230 = true;
        this.method580();
    }

    @ObfuscatedName("an.a(I)V")
    public void method496() {
        int var1 = this.field222;
        int var2 = this.field243;
        int var3 = this.field220 - Statics.field2331 - var1;
        int var4 = this.field219 - Statics.field4300 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method608();
            int var6 = 0;
            int var7 = 0;
            if (this.field228 == var5) {
                Insets var8 = this.field228.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field219);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field220, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field220 + var6 - var3, var7, var3, this.field219);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field219 + var7 - var4, this.field220, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("an.s(I)V")
    public final void method497() {
        field229.method343(this.field236);
        class37.method2471(this.field236);
        if (this.field235 != null) {
            this.field235.method301(this.field236);
        }
        this.method499();
        field229.method346(this.field236);
        Canvas var1 = this.field236;
        var1.addMouseListener(class37.field248);
        var1.addMouseMotionListener(class37.field248);
        var1.addFocusListener(class37.field248);
        if (this.field235 != null) {
            this.field235.method297(this.field236);
        }
        this.method505();
    }

    @ObfuscatedName("an.l(IIIIB)V")
    public final void method498(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field212 != null) {
                field211++;
                if (field211 >= 3) {
                    this.method659("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field212 = this;
            Statics.field2331 = arg0;
            Statics.field4300 = arg1;
            Statics.field5067 = arg2;
            Statics.field5066 = arg3;
            Statics.field4660 = this;
            if (Statics.field2911 == null) {
                Statics.field2911 = new class165();
            }
            Statics.field2911.method3120(this, 1);
        } catch (Exception var6) {
            class493.method2879((String) null, var6);
            this.method659("crash");
        }
    }

    @ObfuscatedName("an.as(B)V")
    public final synchronized void method499() {
        Container var1 = this.method608();
        if (this.field236 != null) {
            this.field236.removeFocusListener(this);
            var1.remove(this.field236);
        }
        Statics.field2331 = Math.max(var1.getWidth(), this.field224);
        Statics.field4300 = Math.max(var1.getHeight(), this.field210);
        if (this.field228 != null) {
            Insets var2 = this.field228.getInsets();
            Statics.field2331 -= var2.right + var2.left;
            Statics.field4300 -= var2.top + var2.bottom;
        }
        this.field236 = new class25(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field236);
        this.field236.setSize(Statics.field2331, Statics.field4300);
        this.field236.setVisible(true);
        this.field236.setBackground(Color.BLACK);
        if (this.field228 == var1) {
            Insets var3 = this.field228.getInsets();
            this.field236.setLocation(this.field222 + var3.left, this.field243 + var3.top);
        } else {
            this.field236.setLocation(this.field222, this.field243);
        }
        this.field236.addFocusListener(this);
        this.field236.requestFocus();
        this.field230 = true;
        if (Statics.field2354 != null && Statics.field2331 == Statics.field2354.field4992 && Statics.field4300 == Statics.field2354.field4993) {
            ((class34) Statics.field2354).method462(this.field236);
            Statics.field2354.method463(0, 0);
        } else {
            Statics.field2354 = new class34(Statics.field2331, Statics.field4300, this.field236);
        }
        this.field233 = false;
        this.field234 = Statics.method1118();
    }

    @ObfuscatedName("an.ad(B)Z")
    public final boolean method500() {
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
                this.method659("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1848 != null) {
                String var1 = Statics.field1848.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1845;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method659("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class361.method4452(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class361.method6052(var4) && class361.method7156(var4) < 10) {
                            this.method659("wrongjava");
                            return;
                        }
                    }
                    field216 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method499();
            this.method595();
            class175 var5;
            try {
                var5 = new class162();
            } catch (Throwable var9) {
                var5 = new class172();
            }
            Statics.field1456 = var5;
            while (field221 == 0L || Statics.method1118() < field221) {
                Statics.field1900 = Statics.field1456.method3044(field215, field216);
                for (int var7 = 0; var7 < Statics.field1900; var7++) {
                    this.method625();
                }
                this.method503();
                this.method485(this.field236);
            }
        } catch (Exception var10) {
            class493.method2879((String) null, var10);
            this.method659("crash");
        }
        this.method506();
    }

    @ObfuscatedName("an.ao(B)V")
    public void method625() {
        long var1 = Statics.method1118();
        long var3 = field223[Statics.field3];
        field223[Statics.field3] = var1;
        Statics.field3 = Statics.field3 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field4911 = field238;
        }
        this.method515();
    }

    @ObfuscatedName("an.am(I)V")
    public void method503() {
        Container var1 = this.method608();
        long var2 = Statics.method1118();
        long var4 = field225[Statics.field4994];
        field225[Statics.field4994] = var2;
        Statics.field4994 = Statics.field4994 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field217 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field231 - 1 > 50) {
            field231 -= 50;
            this.field230 = true;
            this.field236.setSize(Statics.field2331, Statics.field4300);
            this.field236.setVisible(true);
            if (this.field228 == var1) {
                Insets var7 = this.field228.getInsets();
                this.field236.setLocation(this.field222 + var7.left, this.field243 + var7.top);
            } else {
                this.field236.setLocation(this.field222, this.field243);
            }
        }
        if (this.field233) {
            this.method497();
        }
        this.method504();
        this.method516(this.field230);
        if (this.field230) {
            this.method496();
        }
        this.field230 = false;
    }

    @ObfuscatedName("an.av(I)V")
    public final void method504() {
        class407 var1 = this.method639();
        if (this.field220 != var1.field4597 || this.field219 != var1.field4594 || this.field232) {
            this.method596();
            this.field232 = false;
        }
    }

    @ObfuscatedName("an.au(S)V")
    public final void method505() {
        this.field232 = true;
    }

    @ObfuscatedName("an.ar(I)V")
    public final synchronized void method506() {
        if (field213) {
            return;
        }
        field213 = true;
        try {
            this.field236.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method627();
        } catch (Exception var7) {
        }
        if (this.field228 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field2911 != null) {
            try {
                Statics.field2911.method3116();
            } catch (Exception var5) {
            }
        }
        this.method522();
    }

    @ObfuscatedName("am.at(I)V")
    public static final void method421() {
        Statics.field1456.method3043();
        for (int var0 = 0; var0 < 32; var0++) {
            field225[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field223[var1] = 0L;
        }
        Statics.field1900 = 0;
    }

    public final void start() {
        if (field212 == this && !field213) {
            field221 = 0L;
        }
    }

    public final void stop() {
        if (field212 == this && !field213) {
            field221 = Statics.method1118() + 4000L;
        }
    }

    public final void destroy() {
        if (field212 == this && !field213) {
            field221 = Statics.method1118();
            class284.method148(5000L);
            this.method506();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field212 != this || field213) {
            return;
        }
        this.field230 = true;
        if (Statics.method1118() - this.field234 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field2331 && var2.height >= Statics.field4300) {
                this.field233 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field238 = true;
        this.field230 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field238 = false;
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

    @ObfuscatedName("an.ag(ILjava/lang/String;ZI)V")
    public final void method517(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field236.getGraphics();
            if (Statics.field116 == null) {
                Statics.field116 = new Font("Helvetica", 1, 13);
                Statics.field1420 = this.field236.getFontMetrics(Statics.field116);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field2331, Statics.field4300);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field893 == null) {
                    Statics.field893 = this.field236.createImage(304, 34);
                }
                Graphics var6 = Statics.field893.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field116);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1420.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field893, Statics.field2331 / 2 - 152, Statics.field4300 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field2331 / 2 - 152;
                int var9 = Statics.field4300 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field116);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1420.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field236.repaint();
        }
    }

    @ObfuscatedName("an.az(I)V")
    public final void method518() {
        Statics.field893 = null;
        Statics.field116 = null;
        Statics.field1420 = null;
    }

    @ObfuscatedName("an.ak(Ljava/lang/String;I)V")
    public void method659(String arg0) {
        if (this.field240) {
            return;
        }
        this.field240 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("an.af(I)Ljava/awt/Container;")
    public Container method608() {
        return this.field228 == null ? this : this.field228;
    }

    @ObfuscatedName("an.ai(I)Lok;")
    public class407 method639() {
        Container var1 = this.method608();
        int var2 = Math.max(var1.getWidth(), this.field224);
        int var3 = Math.max(var1.getHeight(), this.field210);
        if (this.field228 != null) {
            Insets var4 = this.field228.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class407(var2, var3);
    }

    @ObfuscatedName("an.ax(I)Z")
    public final boolean method521() {
        return this.field228 != null;
    }

    @ObfuscatedName("jn.ah(I)I")
    public static int method4940() {
        int var0 = 0;
        if (Statics.field982 == null || !Statics.field982.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field982 = var2;
                        field241 = -1L;
                        field239 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field982 != null) {
            long var4 = Statics.method1118();
            long var6 = Statics.field982.getCollectionTime();
            if (field239 != -1L) {
                long var8 = var6 - field239;
                long var10 = var4 - field241;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field239 = var6;
            field241 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("an.an(B)V")
    public abstract void method515();

    @ObfuscatedName("an.ab(ZI)V")
    public abstract void method516(boolean arg0);

    @ObfuscatedName("an.aw(I)V")
    public abstract void method522();

    @ObfuscatedName("an.k(B)V")
    public abstract void method580();

    @ObfuscatedName("an.ay(B)V")
    public abstract void method595();

    @ObfuscatedName("an.al(I)V")
    public abstract void method627();
}
