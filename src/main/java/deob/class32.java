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

@ObfuscatedName("at")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("at.c")
    public static class32 field185 = null;

    @ObfuscatedName("at.m")
    public static int field203 = 0;

    @ObfuscatedName("at.k")
    public static long field187 = 0L;

    @ObfuscatedName("at.o")
    public static boolean field188 = false;

    @ObfuscatedName("at.g")
    public boolean field189 = false;

    @ObfuscatedName("at.a")
    public static int field191 = 20;

    @ObfuscatedName("at.u")
    public static int field192 = 1;

    @ObfuscatedName("at.e")
    public static int field193 = 0;

    @ObfuscatedName("at.f")
    public static long[] field194 = new long[32];

    @ObfuscatedName("at.h")
    public static long[] field195 = new long[32];

    @ObfuscatedName("at.q")
    public int field219;

    @ObfuscatedName("at.j")
    public int field197;

    @ObfuscatedName("at.b")
    public int field198 = 0;

    @ObfuscatedName("at.t")
    public int field196 = 0;

    @ObfuscatedName("at.i")
    public int field218;

    @ObfuscatedName("at.aq")
    public int field215;

    @ObfuscatedName("at.ad")
    public int field208;

    @ObfuscatedName("at.al")
    public int field204;

    @ObfuscatedName("at.at")
    public Frame field184;

    @ObfuscatedName("at.as")
    public Canvas field209;

    @ObfuscatedName("at.ae")
    public volatile boolean field207 = true;

    @ObfuscatedName("at.ak")
    public static int field202 = 500;

    @ObfuscatedName("at.an")
    public boolean field199 = false;

    @ObfuscatedName("at.ab")
    public volatile boolean field210 = false;

    @ObfuscatedName("at.au")
    public volatile long field211 = 0L;

    @ObfuscatedName("at.ay")
    public class23 field212;

    @ObfuscatedName("at.aj")
    public Clipboard field213;

    @ObfuscatedName("at.ap")
    public final EventQueue field214;

    @ObfuscatedName("at.ai")
    public static volatile boolean field206 = true;

    @ObfuscatedName("at.ar")
    public static long field216 = -1L;

    @ObfuscatedName("at.az")
    public static long field217 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field214 = var1;
        class38.method2243(new class25());
    }

    @ObfuscatedName("at.g(IIS)V")
    public final void method566(int arg0, int arg1) {
        if (this.field208 != arg0 || this.field204 != arg1) {
            this.method451();
        }
        this.field208 = arg0;
        this.field204 = arg1;
    }

    @ObfuscatedName("at.z(Ljava/lang/Object;I)V")
    public final void method435(Object arg0) {
        if (this.field214 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field214.peekEvent() != null; var2++) {
            class398.method4655(1L);
        }
        if (arg0 != null) {
            this.field214.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("at.a(I)Lew;")
    public class145 method547() {
        if (this.field212 == null) {
            this.field212 = new class23();
            this.field212.method323(this.field209);
        }
        return this.field212;
    }

    @ObfuscatedName("at.u(I)V")
    public void method489() {
        this.field213 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("at.e(Ljava/lang/String;S)V")
    public void method438(String arg0) {
        this.field213.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("at.l(I)V")
    public final void method439() {
        if (Statics.field1546.toLowerCase().indexOf("microsoft") == -1) {
            class24.field135[44] = 71;
            class24.field135[45] = 26;
            class24.field135[46] = 72;
            class24.field135[47] = 73;
            class24.field135[59] = 57;
            class24.field135[61] = 27;
            class24.field135[91] = 42;
            class24.field135[92] = 74;
            class24.field135[93] = 43;
            class24.field135[192] = 28;
            class24.field135[222] = 58;
            class24.field135[520] = 59;
        } else {
            class24.field135[186] = 57;
            class24.field135[187] = 27;
            class24.field135[188] = 71;
            class24.field135[189] = 26;
            class24.field135[190] = 72;
            class24.field135[191] = 73;
            class24.field135[192] = 58;
            class24.field135[219] = 42;
            class24.field135[220] = 74;
            class24.field135[221] = 43;
            class24.field135[222] = 59;
            class24.field135[223] = 28;
        }
        Canvas var1 = this.field209;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class24.field120);
        var1.addFocusListener(class24.field120);
    }

    @ObfuscatedName("at.y(I)V")
    public final void method509() {
        class33.method2357(this.field209);
    }

    @ObfuscatedName("at.v(I)V")
    public final void method560() {
        Container var1 = this.method546();
        if (var1 == null) {
            return;
        }
        class350 var2 = this.method463();
        this.field219 = Math.max(var2.field4015, this.field218);
        this.field197 = Math.max(var2.field4012, this.field215);
        if (this.field219 <= 0) {
            this.field219 = 1;
        }
        if (this.field197 <= 0) {
            this.field197 = 1;
        }
        Statics.field1611 = Math.min(this.field219, this.field208);
        Statics.field200 = Math.min(this.field197, this.field204);
        this.field198 = (this.field219 - Statics.field1611) / 2;
        this.field196 = 0;
        this.field209.setSize(Statics.field1611, Statics.field200);
        Statics.field58 = new class31(Statics.field1611, Statics.field200, this.field209);
        if (this.field184 == var1) {
            Insets var3 = this.field184.getInsets();
            this.field209.setLocation(this.field198 + var3.left, this.field196 + var3.top);
        } else {
            this.field209.setLocation(this.field198, this.field196);
        }
        this.field207 = true;
        this.method530();
    }

    @ObfuscatedName("at.s(I)V")
    public void method443() {
        int var1 = this.field198;
        int var2 = this.field196;
        int var3 = this.field219 - Statics.field1611 - var1;
        int var4 = this.field197 - Statics.field200 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method546();
            int var6 = 0;
            int var7 = 0;
            if (this.field184 == var5) {
                Insets var8 = this.field184.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field197);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field219, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field219 + var6 - var3, var7, var3, this.field197);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field197 + var7 - var4, this.field219, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("at.h(I)V")
    public final void method558() {
        Canvas var1 = this.field209;
        var1.removeKeyListener(class24.field120);
        var1.removeFocusListener(class24.field120);
        class24.field129 = -1;
        Canvas var2 = this.field209;
        var2.removeMouseListener(class33.field222);
        var2.removeMouseMotionListener(class33.field222);
        var2.removeFocusListener(class33.field222);
        class33.field226 = 0;
        if (this.field212 != null) {
            this.field212.method321(this.field209);
        }
        this.method537();
        Canvas var3 = this.field209;
        var3.setFocusTraversalKeysEnabled(false);
        var3.addKeyListener(class24.field120);
        var3.addFocusListener(class24.field120);
        class33.method2357(this.field209);
        if (this.field212 != null) {
            this.field212.method323(this.field209);
        }
        this.method451();
    }

    @ObfuscatedName("at.d(IIIB)V")
    public final void method470(int arg0, int arg1, int arg2) {
        try {
            if (field185 != null) {
                field203++;
                if (field203 >= 3) {
                    this.method461("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field185 = this;
            Statics.field1611 = arg0;
            Statics.field200 = arg1;
            Statics.field4413 = arg2;
            Statics.field4414 = this;
            if (Statics.field190 == null) {
                Statics.field190 = new class143();
            }
            Statics.field190.method2514(this, 1);
        } catch (Exception var5) {
            class424.method21((String) null, var5);
            this.method461("crash");
        }
    }

    @ObfuscatedName("at.q(I)V")
    public final synchronized void method537() {
        Container var1 = this.method546();
        if (this.field209 != null) {
            this.field209.removeFocusListener(this);
            var1.remove(this.field209);
        }
        Statics.field1611 = Math.max(var1.getWidth(), this.field218);
        Statics.field200 = Math.max(var1.getHeight(), this.field215);
        if (this.field184 != null) {
            Insets var2 = this.field184.getInsets();
            Statics.field1611 -= var2.right + var2.left;
            Statics.field200 -= var2.top + var2.bottom;
        }
        this.field209 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field209);
        this.field209.setSize(Statics.field1611, Statics.field200);
        this.field209.setVisible(true);
        this.field209.setBackground(Color.BLACK);
        if (this.field184 == var1) {
            Insets var3 = this.field184.getInsets();
            this.field209.setLocation(this.field198 + var3.left, this.field196 + var3.top);
        } else {
            this.field209.setLocation(this.field198, this.field196);
        }
        this.field209.addFocusListener(this);
        this.field209.requestFocus();
        this.field207 = true;
        if (Statics.field58 != null && Statics.field1611 == Statics.field58.field4350 && Statics.field200 == Statics.field58.field4352) {
            ((class31) Statics.field58).method420(this.field209);
            Statics.field58.method421(0, 0);
        } else {
            Statics.field58 = new class31(Statics.field1611, Statics.field200, this.field209);
        }
        this.field210 = false;
        this.field211 = class397.method3986();
    }

    @ObfuscatedName("at.j(B)Z")
    public final boolean method446() {
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
                this.method461("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1546 != null) {
                String var1 = Statics.field1546.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1542;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method461("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class319.method3978(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class319.method5370(var4) && class319.method4849(var4) < 10) {
                            this.method461("wrongjava");
                            return;
                        }
                    }
                    field192 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method537();
            this.method551();
            class150 var5;
            try {
                var5 = new class142();
            } catch (Throwable var9) {
                var5 = new class148();
            }
            Statics.field1419 = var5;
            while (field187 == 0L || class397.method3986() < field187) {
                Statics.field186 = Statics.field1419.method2503(field191, field192);
                for (int var7 = 0; var7 < Statics.field186; var7++) {
                    this.method447();
                }
                this.method534();
                this.method435(this.field209);
            }
        } catch (Exception var10) {
            class424.method21((String) null, var10);
            this.method461("crash");
        }
        this.method518();
    }

    @ObfuscatedName("at.x(B)V")
    public void method447() {
        long var1 = class397.method3986();
        long var3 = field195[Statics.field1020];
        field195[Statics.field1020] = var1;
        Statics.field1020 = Statics.field1020 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3695 = field206;
        }
        this.method456();
    }

    @ObfuscatedName("at.b(S)V")
    public void method534() {
        Container var1 = this.method546();
        long var2 = class397.method3986();
        long var4 = field194[Statics.field1267];
        field194[Statics.field1267] = var2;
        Statics.field1267 = Statics.field1267 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field193 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field202 - 1 > 50) {
            field202 -= 50;
            this.field207 = true;
            this.field209.setSize(Statics.field1611, Statics.field200);
            this.field209.setVisible(true);
            if (this.field184 == var1) {
                Insets var7 = this.field184.getInsets();
                this.field209.setLocation(this.field198 + var7.left, this.field196 + var7.top);
            } else {
                this.field209.setLocation(this.field198, this.field196);
            }
        }
        if (this.field210) {
            this.method558();
        }
        this.method448();
        this.method457(this.field207);
        if (this.field207) {
            this.method443();
        }
        this.field207 = false;
    }

    @ObfuscatedName("at.t(B)V")
    public final void method448() {
        class350 var1 = this.method463();
        if (this.field219 != var1.field4015 || this.field197 != var1.field4012 || this.field199) {
            this.method560();
            this.field199 = false;
        }
    }

    @ObfuscatedName("at.r(I)V")
    public final void method451() {
        this.field199 = true;
    }

    @ObfuscatedName("at.p(B)V")
    public final synchronized void method518() {
        if (field188) {
            return;
        }
        field188 = true;
        try {
            this.field209.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method434();
        } catch (Exception var7) {
        }
        if (this.field184 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field190 != null) {
            try {
                Statics.field190.method2515();
            } catch (Exception var5) {
            }
        }
        this.method465();
    }

    public final void start() {
        if (field185 == this && !field188) {
            field187 = 0L;
        }
    }

    public final void stop() {
        if (field185 == this && !field188) {
            field187 = class397.method3986() + 4000L;
        }
    }

    public final void destroy() {
        if (field185 == this && !field188) {
            field187 = class397.method3986();
            class398.method4655(5000L);
            this.method518();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field185 != this || field188) {
            return;
        }
        this.field207 = true;
        if (class397.method3986() - this.field211 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1611 && var2.height >= Statics.field200) {
                this.field210 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field206 = true;
        this.field207 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field206 = false;
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

    @ObfuscatedName("at.at(ILjava/lang/String;ZB)V")
    public final void method459(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field209.getGraphics();
            if (Statics.field389 == null) {
                Statics.field389 = new Font("Helvetica", 1, 13);
                Statics.field2458 = this.field209.getFontMetrics(Statics.field389);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1611, Statics.field200);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1490 == null) {
                    Statics.field1490 = this.field209.createImage(304, 34);
                }
                Graphics var6 = Statics.field1490.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field389);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2458.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1490, Statics.field1611 / 2 - 152, Statics.field200 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1611 / 2 - 152;
                int var9 = Statics.field200 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field389);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2458.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field209.repaint();
        }
    }

    @ObfuscatedName("at.as(I)V")
    public final void method460() {
        Statics.field1490 = null;
        Statics.field389 = null;
        Statics.field2458 = null;
    }

    @ObfuscatedName("at.ae(Ljava/lang/String;B)V")
    public void method461(String arg0) {
        if (this.field189) {
            return;
        }
        this.field189 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("at.av(I)Ljava/awt/Container;")
    public Container method546() {
        return this.field184 == null ? this : this.field184;
    }

    @ObfuscatedName("at.ak(I)Lmt;")
    public class350 method463() {
        Container var1 = this.method546();
        int var2 = Math.max(var1.getWidth(), this.field218);
        int var3 = Math.max(var1.getHeight(), this.field215);
        if (this.field184 != null) {
            Insets var4 = this.field184.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class350(var2, var3);
    }

    @ObfuscatedName("at.an(I)Z")
    public final boolean method464() {
        return this.field184 != null;
    }

    @ObfuscatedName("js.ab(I)I")
    public static int method4517() {
        int var0 = 0;
        if (Statics.field7 == null || !Statics.field7.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field7 = var2;
                        field217 = -1L;
                        field216 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field7 != null) {
            long var4 = class397.method3986();
            long var6 = Statics.field7.getCollectionTime();
            if (field216 != -1L) {
                long var8 = var6 - field216;
                long var10 = var4 - field217;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field216 = var6;
            field217 = var4;
        }
        return var0;
    }

    @ObfuscatedName("at.ad(B)V")
    public abstract void method434();

    public abstract void init();

    @ObfuscatedName("at.i(I)V")
    public abstract void method456();

    @ObfuscatedName("at.aq(ZI)V")
    public abstract void method457(boolean arg0);

    @ObfuscatedName("at.au(I)V")
    public abstract void method465();

    @ObfuscatedName("at.f(I)V")
    public abstract void method530();

    @ObfuscatedName("at.w(B)V")
    public abstract void method551();
}
