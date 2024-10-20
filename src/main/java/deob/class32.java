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

@ObfuscatedName("ao")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ao.c")
    public static class32 field187 = null;

    @ObfuscatedName("ao.i")
    public static int field209 = 0;

    @ObfuscatedName("ao.f")
    public static long field200 = 0L;

    @ObfuscatedName("ao.b")
    public static boolean field204 = false;

    @ObfuscatedName("ao.n")
    public boolean field190 = false;

    @ObfuscatedName("ao.l")
    public static int field191 = 20;

    @ObfuscatedName("ao.q")
    public static int field192 = 1;

    @ObfuscatedName("ao.o")
    public static int field193 = 0;

    @ObfuscatedName("ao.k")
    public static long[] field198 = new long[32];

    @ObfuscatedName("ao.m")
    public static long[] field189 = new long[32];

    @ObfuscatedName("ao.t")
    public int field196;

    @ObfuscatedName("ao.g")
    public int field197;

    @ObfuscatedName("ao.a")
    public int field186 = 0;

    @ObfuscatedName("ao.j")
    public int field199 = 0;

    @ObfuscatedName("ao.h")
    public int field206;

    @ObfuscatedName("ao.ae")
    public int field201;

    @ObfuscatedName("ao.aq")
    public int field202;

    @ObfuscatedName("ao.aw")
    public int field203;

    @ObfuscatedName("ao.ao")
    public Frame field188;

    @ObfuscatedName("ao.aj")
    public Canvas field205;

    @ObfuscatedName("ao.al")
    public volatile boolean field195 = true;

    @ObfuscatedName("ao.at")
    public static int field207 = 500;

    @ObfuscatedName("ao.an")
    public boolean field212 = false;

    @ObfuscatedName("ao.ay")
    public volatile boolean field215 = false;

    @ObfuscatedName("ao.ag")
    public volatile long field210 = 0L;

    @ObfuscatedName("ao.ab")
    public class23 field211;

    @ObfuscatedName("ao.au")
    public Clipboard field194;

    @ObfuscatedName("ao.af")
    public final EventQueue field213;

    @ObfuscatedName("ao.ad")
    public static volatile boolean field214 = true;

    @ObfuscatedName("ao.ar")
    public static long field208 = -1L;

    @ObfuscatedName("ao.ap")
    public static long field216 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field213 = var1;
        class25 var3 = new class25();
        Statics.field4332 = var3;
    }

    @ObfuscatedName("ao.f(III)V")
    public final void method418(int arg0, int arg1) {
        if (this.field202 != arg0 || this.field203 != arg1) {
            this.method461();
        }
        this.field202 = arg0;
        this.field203 = arg1;
    }

    @ObfuscatedName("ao.b(Ljava/lang/Object;I)V")
    public final void method507(Object arg0) {
        if (this.field213 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field213.peekEvent() != null; var2++) {
            class271.method2274(1L);
        }
        if (arg0 != null) {
            this.field213.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ao.n(I)Lfo;")
    public class159 method514() {
        if (this.field211 == null) {
            this.field211 = new class23();
            this.field211.method301(this.field205);
        }
        return this.field211;
    }

    @ObfuscatedName("ao.s(I)V")
    public void method431() {
        this.field194 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ao.l(Ljava/lang/String;B)V")
    public void method447(String arg0) {
        this.field194.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ao.q(I)V")
    public final void method422() {
        class24.method5218();
        Canvas var1 = this.field205;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class24.field126);
        var1.addFocusListener(class24.field126);
    }

    @ObfuscatedName("ao.o(B)V")
    public final void method423() {
        Canvas var1 = this.field205;
        var1.addMouseListener(class33.field222);
        var1.addMouseMotionListener(class33.field222);
        var1.addFocusListener(class33.field222);
    }

    @ObfuscatedName("ao.r(I)V")
    public final void method523() {
        Container var1 = this.method448();
        if (var1 == null) {
            return;
        }
        class384 var2 = this.method449();
        this.field196 = Math.max(var2.field4329, this.field206);
        this.field197 = Math.max(var2.field4327, this.field201);
        if (this.field196 <= 0) {
            this.field196 = 1;
        }
        if (this.field197 <= 0) {
            this.field197 = 1;
        }
        Statics.field1798 = Math.min(this.field196, this.field202);
        Statics.field4019 = Math.min(this.field197, this.field203);
        this.field186 = (this.field196 - Statics.field1798) / 2;
        this.field199 = 0;
        this.field205.setSize(Statics.field1798, Statics.field4019);
        Statics.field4530 = new class31(Statics.field1798, Statics.field4019, this.field205);
        if (this.field188 == var1) {
            Insets var3 = this.field188.getInsets();
            this.field205.setLocation(this.field186 + var3.left, this.field199 + var3.top);
        } else {
            this.field205.setLocation(this.field186, this.field199);
        }
        this.field195 = true;
        this.method425();
    }

    @ObfuscatedName("ao.w(I)V")
    public void method426() {
        int var1 = this.field186;
        int var2 = this.field199;
        int var3 = this.field196 - Statics.field1798 - var1;
        int var4 = this.field197 - Statics.field4019 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method448();
            int var6 = 0;
            int var7 = 0;
            if (this.field188 == var5) {
                Insets var8 = this.field188.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field197);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field196, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field196 + var6 - var3, var7, var3, this.field197);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field197 + var7 - var4, this.field196, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ao.k(B)V")
    public final void method427() {
        class24.method4446(this.field205);
        Canvas var1 = this.field205;
        var1.removeMouseListener(class33.field222);
        var1.removeMouseMotionListener(class33.field222);
        var1.removeFocusListener(class33.field222);
        class33.field236 = 0;
        if (this.field211 != null) {
            this.field211.method307(this.field205);
        }
        this.method429();
        Canvas var2 = this.field205;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class24.field126);
        var2.addFocusListener(class24.field126);
        Canvas var3 = this.field205;
        var3.addMouseListener(class33.field222);
        var3.addMouseMotionListener(class33.field222);
        var3.addFocusListener(class33.field222);
        if (this.field211 != null) {
            this.field211.method301(this.field205);
        }
        this.method461();
    }

    @ObfuscatedName("ao.d(IIIB)V")
    public final void method445(int arg0, int arg1, int arg2) {
        try {
            if (field187 != null) {
                field209++;
                if (field209 >= 3) {
                    this.method430("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field187 = this;
            Statics.field1798 = arg0;
            Statics.field4019 = arg1;
            Statics.field4755 = arg2;
            Statics.field4758 = this;
            if (Statics.field185 == null) {
                Statics.field185 = new class157();
            }
            Statics.field185.method2941(this, 1);
        } catch (Exception var5) {
            class462.method5173((String) null, var5);
            this.method430("crash");
        }
    }

    @ObfuscatedName("ao.m(I)V")
    public final synchronized void method429() {
        Container var1 = this.method448();
        if (this.field205 != null) {
            this.field205.removeFocusListener(this);
            var1.remove(this.field205);
        }
        Statics.field1798 = Math.max(var1.getWidth(), this.field206);
        Statics.field4019 = Math.max(var1.getHeight(), this.field201);
        if (this.field188 != null) {
            Insets var2 = this.field188.getInsets();
            Statics.field1798 -= var2.right + var2.left;
            Statics.field4019 -= var2.top + var2.bottom;
        }
        this.field205 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field205);
        this.field205.setSize(Statics.field1798, Statics.field4019);
        this.field205.setVisible(true);
        this.field205.setBackground(Color.BLACK);
        if (this.field188 == var1) {
            Insets var3 = this.field188.getInsets();
            this.field205.setLocation(this.field186 + var3.left, this.field199 + var3.top);
        } else {
            this.field205.setLocation(this.field186, this.field199);
        }
        this.field205.addFocusListener(this);
        this.field205.requestFocus();
        this.field195 = true;
        if (Statics.field4530 != null && Statics.field1798 == Statics.field4530.field4694 && Statics.field4019 == Statics.field4530.field4692) {
            ((class31) Statics.field4530).method401(this.field205);
            Statics.field4530.method402(0, 0);
        } else {
            Statics.field4530 = new class31(Statics.field1798, Statics.field4019, this.field205);
        }
        this.field215 = false;
        this.field210 = class270.method2724();
    }

    @ObfuscatedName("ao.u(I)Z")
    public final boolean method469() {
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
                this.method430("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1718 != null) {
                String var1 = Statics.field1718.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1713;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method430("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class348.method3075(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class348.method5206(var4) && class348.method283(var4) < 10) {
                            this.method430("wrongjava");
                            return;
                        }
                    }
                    field192 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method429();
            this.method421();
            class168 var5;
            try {
                var5 = new class154();
            } catch (Throwable var9) {
                var5 = new class165();
            }
            Statics.field4602 = var5;
            while (field200 == 0L || class270.method2724() < field200) {
                Statics.field4275 = Statics.field4602.method2869(field191, field192);
                for (int var7 = 0; var7 < Statics.field4275; var7++) {
                    this.method522();
                }
                this.method432();
                this.method507(this.field205);
            }
        } catch (Exception var10) {
            class462.method5173((String) null, var10);
            this.method430("crash");
        }
        this.method435();
    }

    @ObfuscatedName("ao.t(I)V")
    public void method522() {
        long var1 = class270.method2724();
        long var3 = field189[Statics.field312];
        field189[Statics.field312] = var1;
        Statics.field312 = Statics.field312 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1300 = field214;
        }
        this.method442();
    }

    @ObfuscatedName("ao.g(B)V")
    public void method432() {
        Container var1 = this.method448();
        long var2 = class270.method2724();
        long var4 = field198[Statics.field4518];
        field198[Statics.field4518] = var2;
        Statics.field4518 = Statics.field4518 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field193 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field207 - 1 > 50) {
            field207 -= 50;
            this.field195 = true;
            this.field205.setSize(Statics.field1798, Statics.field4019);
            this.field205.setVisible(true);
            if (this.field188 == var1) {
                Insets var7 = this.field188.getInsets();
                this.field205.setLocation(this.field186 + var7.left, this.field199 + var7.top);
            } else {
                this.field205.setLocation(this.field186, this.field199);
            }
        }
        if (this.field215) {
            this.method427();
        }
        this.method433();
        this.method473(this.field195);
        if (this.field195) {
            this.method426();
        }
        this.field195 = false;
    }

    @ObfuscatedName("ao.x(B)V")
    public final void method433() {
        class384 var1 = this.method449();
        if (this.field196 != var1.field4329 || this.field197 != var1.field4327 || this.field212) {
            this.method523();
            this.field212 = false;
        }
    }

    @ObfuscatedName("ao.a(I)V")
    public final void method461() {
        this.field212 = true;
    }

    @ObfuscatedName("ao.y(I)V")
    public final synchronized void method435() {
        if (field204) {
            return;
        }
        field204 = true;
        try {
            this.field205.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method444();
        } catch (Exception var7) {
        }
        if (this.field188 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field185 != null) {
            try {
                Statics.field185.method2948();
            } catch (Exception var5) {
            }
        }
        this.method450();
    }

    @ObfuscatedName("de.j(I)V")
    public static final void method2497() {
        Statics.field4602.method2866();
        for (int var0 = 0; var0 < 32; var0++) {
            field198[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field189[var1] = 0L;
        }
        Statics.field4275 = 0;
    }

    public final void start() {
        if (field187 == this && !field204) {
            field200 = 0L;
        }
    }

    public final void stop() {
        if (field187 == this && !field204) {
            field200 = class270.method2724() + 4000L;
        }
    }

    public final void destroy() {
        if (field187 == this && !field204) {
            field200 = class270.method2724();
            class271.method2274(5000L);
            this.method435();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field187 != this || field204) {
            return;
        }
        this.field195 = true;
        if (class270.method2724() - this.field210 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1798 && var2.height >= Statics.field4019) {
                this.field215 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field214 = true;
        this.field195 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field214 = false;
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

    @ObfuscatedName("ao.aq(ILjava/lang/String;ZB)V")
    public final void method485(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field205.getGraphics();
            if (Statics.field4455 == null) {
                Statics.field4455 = new Font("Helvetica", 1, 13);
                Statics.field2403 = this.field205.getFontMetrics(Statics.field4455);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1798, Statics.field4019);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field4 == null) {
                    Statics.field4 = this.field205.createImage(304, 34);
                }
                Graphics var6 = Statics.field4.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field4455);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2403.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field4, Statics.field1798 / 2 - 152, Statics.field4019 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1798 / 2 - 152;
                int var9 = Statics.field4019 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field4455);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2403.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field205.repaint();
        }
    }

    @ObfuscatedName("ao.aw(I)V")
    public final void method515() {
        Statics.field4 = null;
        Statics.field4455 = null;
        Statics.field2403 = null;
    }

    @ObfuscatedName("ao.am(Ljava/lang/String;I)V")
    public void method430(String arg0) {
        if (this.field190) {
            return;
        }
        this.field190 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ao.ak(B)Ljava/awt/Container;")
    public Container method448() {
        return this.field188 == null ? this : this.field188;
    }

    @ObfuscatedName("ao.ao(S)Lnm;")
    public class384 method449() {
        Container var1 = this.method448();
        int var2 = Math.max(var1.getWidth(), this.field206);
        int var3 = Math.max(var1.getHeight(), this.field201);
        if (this.field188 != null) {
            Insets var4 = this.field188.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class384(var2, var3);
    }

    @ObfuscatedName("ao.aj(I)Z")
    public final boolean method519() {
        return this.field188 != null;
    }

    @ObfuscatedName("hu.al(I)I")
    public static int method4124() {
        int var0 = 0;
        if (Statics.field292 == null || !Statics.field292.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field292 = var2;
                        field216 = -1L;
                        field208 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field292 != null) {
            long var4 = class270.method2724();
            long var6 = Statics.field292.getCollectionTime();
            if (field208 != -1L) {
                long var8 = var6 - field208;
                long var10 = var4 - field216;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field208 = var6;
            field216 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ao.e(I)V")
    public abstract void method421();

    @ObfuscatedName("ao.p(I)V")
    public abstract void method425();

    public abstract void init();

    @ObfuscatedName("ao.z(I)V")
    public abstract void method442();

    @ObfuscatedName("ao.ae(I)V")
    public abstract void method444();

    @ObfuscatedName("ao.av(I)V")
    public abstract void method450();

    @ObfuscatedName("ao.h(ZS)V")
    public abstract void method473(boolean arg0);
}
