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

@ObfuscatedName("ab")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ab.h")
    public static class32 field209 = null;

    @ObfuscatedName("ab.v")
    public static int field180 = 0;

    @ObfuscatedName("ab.c")
    public static long field181 = 0L;

    @ObfuscatedName("ab.q")
    public static boolean field182 = false;

    @ObfuscatedName("ab.i")
    public boolean field183 = false;

    @ObfuscatedName("ab.o")
    public static int field185 = 20;

    @ObfuscatedName("ab.n")
    public static int field210 = 1;

    @ObfuscatedName("ab.d")
    public static int field207 = 0;

    @ObfuscatedName("ab.u")
    public static long[] field189 = new long[32];

    @ObfuscatedName("ab.z")
    public static long[] field193 = new long[32];

    @ObfuscatedName("ab.p")
    public int field206;

    @ObfuscatedName("ab.e")
    public int field192;

    @ObfuscatedName("ab.b")
    public int field191 = 0;

    @ObfuscatedName("ab.f")
    public int field194 = 0;

    @ObfuscatedName("ab.g")
    public int field195;

    @ObfuscatedName("ab.ar")
    public int field196;

    @ObfuscatedName("ab.aq")
    public int field197;

    @ObfuscatedName("ab.av")
    public int field198;

    @ObfuscatedName("ab.ab")
    public Frame field199;

    @ObfuscatedName("ab.ak")
    public Canvas field200;

    @ObfuscatedName("ab.au")
    public volatile boolean field201 = true;

    @ObfuscatedName("ab.as")
    public static int field202 = 500;

    @ObfuscatedName("ab.ay")
    public boolean field190 = false;

    @ObfuscatedName("ab.ag")
    public volatile boolean field204 = false;

    @ObfuscatedName("ab.ad")
    public volatile long field205 = 0L;

    @ObfuscatedName("ab.ai")
    public class23 field179;

    @ObfuscatedName("ab.ap")
    public Clipboard field178;

    @ObfuscatedName("ab.az")
    public final EventQueue field208;

    @ObfuscatedName("ab.an")
    public static volatile boolean field203 = true;

    @ObfuscatedName("ab.am")
    public static long field187 = -1L;

    @ObfuscatedName("ab.ao")
    public static long field211 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field208 = var1;
        class40.method5608(new class25());
    }

    @ObfuscatedName("ab.c(III)V")
    public final void method408(int arg0, int arg1) {
        if (this.field197 != arg0 || this.field198 != arg1) {
            this.method513();
        }
        this.field197 = arg0;
        this.field198 = arg1;
    }

    @ObfuscatedName("ab.q(Ljava/lang/Object;I)V")
    public final void method439(Object arg0) {
        if (this.field208 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field208.peekEvent() != null; var2++) {
            class271.method2748(1L);
        }
        if (arg0 != null) {
            this.field208.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ab.i(B)Lfd;")
    public class159 method407() {
        if (this.field179 == null) {
            this.field179 = new class23();
            this.field179.method293(this.field200);
        }
        return this.field179;
    }

    @ObfuscatedName("ab.k(B)V")
    public void method434() {
        this.field178 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ab.o(Ljava/lang/String;I)V")
    public void method412(String arg0) {
        this.field178.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ab.n(I)V")
    public final void method413() {
        if (Statics.field1717.toLowerCase().indexOf("microsoft") == -1) {
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
        class24.method1761(this.field200);
    }

    @ObfuscatedName("ab.d(I)V")
    public final void method518() {
        class33.method3241(this.field200);
    }

    @ObfuscatedName("ab.a(I)V")
    public final void method499() {
        Container var1 = this.method519();
        if (var1 == null) {
            return;
        }
        class385 var2 = this.method437();
        this.field206 = Math.max(var2.field4382, this.field195);
        this.field192 = Math.max(var2.field4381, this.field196);
        if (this.field206 <= 0) {
            this.field206 = 1;
        }
        if (this.field192 <= 0) {
            this.field192 = 1;
        }
        Statics.field32 = Math.min(this.field206, this.field197);
        Statics.field2650 = Math.min(this.field192, this.field198);
        this.field191 = (this.field206 - Statics.field32) / 2;
        this.field194 = 0;
        this.field200.setSize(Statics.field32, Statics.field2650);
        Statics.field1490 = new class31(Statics.field32, Statics.field2650, this.field200);
        if (this.field199 == var1) {
            Insets var3 = this.field199.getInsets();
            this.field200.setLocation(this.field191 + var3.left, this.field194 + var3.top);
        } else {
            this.field200.setLocation(this.field191, this.field194);
        }
        this.field201 = true;
        this.method416();
    }

    @ObfuscatedName("ab.u(S)V")
    public void method417() {
        int var1 = this.field191;
        int var2 = this.field194;
        int var3 = this.field206 - Statics.field32 - var1;
        int var4 = this.field192 - Statics.field2650 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method519();
            int var6 = 0;
            int var7 = 0;
            if (this.field199 == var5) {
                Insets var8 = this.field199.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field192);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field206, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field206 + var6 - var3, var7, var3, this.field192);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field192 + var7 - var4, this.field206, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ab.l(B)V")
    public final void method418() {
        Canvas var1 = this.field200;
        var1.removeKeyListener(class24.field141);
        var1.removeFocusListener(class24.field141);
        class24.field133 = -1;
        Canvas var2 = this.field200;
        var2.removeMouseListener(class33.field221);
        var2.removeMouseMotionListener(class33.field221);
        var2.removeFocusListener(class33.field221);
        class33.field215 = 0;
        if (this.field179 != null) {
            this.field179.method294(this.field200);
        }
        this.method420();
        class24.method1761(this.field200);
        class33.method3241(this.field200);
        if (this.field179 != null) {
            this.field179.method293(this.field200);
        }
        this.method513();
    }

    @ObfuscatedName("ab.z(IIIII)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field209 != null) {
                field180++;
                if (field180 >= 3) {
                    this.method516("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field209 = this;
            Statics.field32 = arg0;
            Statics.field2650 = arg1;
            Statics.field4845 = arg2;
            Statics.field4848 = arg3;
            Statics.field4844 = this;
            if (Statics.field188 == null) {
                Statics.field188 = new class157();
            }
            Statics.field188.method2877(this, 1);
        } catch (Exception var6) {
            class468.method566((String) null, var6);
            this.method516("crash");
        }
    }

    @ObfuscatedName("ab.r(I)V")
    public final synchronized void method420() {
        Container var1 = this.method519();
        if (this.field200 != null) {
            this.field200.removeFocusListener(this);
            var1.remove(this.field200);
        }
        Statics.field32 = Math.max(var1.getWidth(), this.field195);
        Statics.field2650 = Math.max(var1.getHeight(), this.field196);
        if (this.field199 != null) {
            Insets var2 = this.field199.getInsets();
            Statics.field32 -= var2.right + var2.left;
            Statics.field2650 -= var2.top + var2.bottom;
        }
        this.field200 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field200);
        this.field200.setSize(Statics.field32, Statics.field2650);
        this.field200.setVisible(true);
        this.field200.setBackground(Color.BLACK);
        if (this.field199 == var1) {
            Insets var3 = this.field199.getInsets();
            this.field200.setLocation(this.field191 + var3.left, this.field194 + var3.top);
        } else {
            this.field200.setLocation(this.field191, this.field194);
        }
        this.field200.addFocusListener(this);
        this.field200.requestFocus();
        this.field201 = true;
        if (Statics.field1490 != null && Statics.field32 == Statics.field1490.field4779 && Statics.field2650 == Statics.field1490.field4780) {
            ((class31) Statics.field1490).method398(this.field200);
            Statics.field1490.method390(0, 0);
        } else {
            Statics.field1490 = new class31(Statics.field32, Statics.field2650, this.field200);
        }
        this.field204 = false;
        this.field205 = class270.method3146();
    }

    @ObfuscatedName("ab.y(I)Z")
    public final boolean method521() {
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
                this.method516("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1717 != null) {
                String var1 = Statics.field1717.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1724;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method516("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && Statics.method2457(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class344.method4416(var4) && class344.method6018(var4) < 10) {
                            this.method516("wrongjava");
                            return;
                        }
                    }
                    field210 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method420();
            this.method429();
            Statics.field4662 = class167.method1951();
            while (field181 == 0L || class270.method3146() < field181) {
                Statics.field186 = Statics.field4662.method2788(field185, field210);
                for (int var5 = 0; var5 < Statics.field186; var5++) {
                    this.method422();
                }
                this.method428();
                this.method439(this.field200);
            }
        } catch (Exception var7) {
            class468.method566((String) null, var7);
            this.method516("crash");
        }
        this.method510();
    }

    @ObfuscatedName("ab.p(I)V")
    public void method422() {
        long var1 = class270.method3146();
        long var3 = field193[Statics.field4263];
        field193[Statics.field4263] = var1;
        Statics.field4263 = Statics.field4263 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field4426 = field203;
        }
        this.method430();
    }

    @ObfuscatedName("ab.e(B)V")
    public void method428() {
        Container var1 = this.method519();
        long var2 = class270.method3146();
        long var4 = field189[Statics.field4438];
        field189[Statics.field4438] = var2;
        Statics.field4438 = Statics.field4438 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field207 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field202 - 1 > 50) {
            field202 -= 50;
            this.field201 = true;
            this.field200.setSize(Statics.field32, Statics.field2650);
            this.field200.setVisible(true);
            if (this.field199 == var1) {
                Insets var7 = this.field199.getInsets();
                this.field200.setLocation(this.field191 + var7.left, this.field194 + var7.top);
            } else {
                this.field200.setLocation(this.field191, this.field194);
            }
        }
        if (this.field204) {
            this.method418();
        }
        this.method424();
        this.method431(this.field201);
        if (this.field201) {
            this.method417();
        }
        this.field201 = false;
    }

    @ObfuscatedName("ab.b(B)V")
    public final void method424() {
        class385 var1 = this.method437();
        if (this.field206 != var1.field4382 || this.field192 != var1.field4381 || this.field190) {
            this.method499();
            this.field190 = false;
        }
    }

    @ObfuscatedName("ab.x(B)V")
    public final void method513() {
        this.field190 = true;
    }

    @ObfuscatedName("ab.f(B)V")
    public final synchronized void method510() {
        if (field182) {
            return;
        }
        field182 = true;
        try {
            this.field200.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method432();
        } catch (Exception var7) {
        }
        if (this.field199 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field188 != null) {
            try {
                Statics.field188.method2883();
            } catch (Exception var5) {
            }
        }
        this.method442();
    }

    @ObfuscatedName("cf.t(B)V")
    public static final void method1969() {
        Statics.field4662.method2790();
        for (int var0 = 0; var0 < 32; var0++) {
            field189[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field193[var1] = 0L;
        }
        Statics.field186 = 0;
    }

    public final void start() {
        if (field209 == this && !field182) {
            field181 = 0L;
        }
    }

    public final void stop() {
        if (field209 == this && !field182) {
            field181 = class270.method3146() + 4000L;
        }
    }

    public final void destroy() {
        if (field209 == this && !field182) {
            field181 = class270.method3146();
            class271.method2748(5000L);
            this.method510();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field209 != this || field182) {
            return;
        }
        this.field201 = true;
        if (class270.method3146() - this.field205 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field32 && var2.height >= Statics.field2650) {
                this.field204 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field203 = true;
        this.field201 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field203 = false;
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

    @ObfuscatedName("ab.av(ILjava/lang/String;ZI)V")
    public final void method433(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field200.getGraphics();
            if (Statics.field1590 == null) {
                Statics.field1590 = new Font("Helvetica", 1, 13);
                Statics.field1841 = this.field200.getFontMetrics(Statics.field1590);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field32, Statics.field2650);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1388 == null) {
                    Statics.field1388 = this.field200.createImage(304, 34);
                }
                Graphics var6 = Statics.field1388.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1590);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1841.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1388, Statics.field32 / 2 - 152, Statics.field2650 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field32 / 2 - 152;
                int var9 = Statics.field2650 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1590);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1841.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field200.repaint();
        }
    }

    @ObfuscatedName("ab.aj(I)V")
    public final void method476() {
        Statics.field1388 = null;
        Statics.field1590 = null;
        Statics.field1841 = null;
    }

    @ObfuscatedName("ab.ax(Ljava/lang/String;B)V")
    public void method516(String arg0) {
        if (this.field183) {
            return;
        }
        this.field183 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ab.ab(I)Ljava/awt/Container;")
    public Container method519() {
        return this.field199 == null ? this : this.field199;
    }

    @ObfuscatedName("ab.ak(I)Lnh;")
    public class385 method437() {
        Container var1 = this.method519();
        int var2 = Math.max(var1.getWidth(), this.field195);
        int var3 = Math.max(var1.getHeight(), this.field196);
        if (this.field199 != null) {
            Insets var4 = this.field199.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class385(var2, var3);
    }

    @ObfuscatedName("ab.au(I)Z")
    public final boolean method438() {
        return this.field199 != null;
    }

    @ObfuscatedName("j.ae(B)I")
    public static int method350() {
        int var0 = 0;
        if (Statics.field2849 == null || !Statics.field2849.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2849 = var2;
                        field211 = -1L;
                        field187 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2849 != null) {
            long var4 = class270.method3146();
            long var6 = Statics.field2849.getCollectionTime();
            if (field187 != -1L) {
                long var8 = var6 - field187;
                long var10 = var4 - field211;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field187 = var6;
            field211 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ab.m(B)V")
    public abstract void method416();

    public abstract void init();

    @ObfuscatedName("ab.j(I)V")
    public abstract void method429();

    @ObfuscatedName("ab.g(I)V")
    public abstract void method430();

    @ObfuscatedName("ab.ar(ZI)V")
    public abstract void method431(boolean arg0);

    @ObfuscatedName("ab.aq(I)V")
    public abstract void method432();

    @ObfuscatedName("ab.as(I)V")
    public abstract void method442();
}
