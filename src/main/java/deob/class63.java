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

@ObfuscatedName("bt")
public abstract class class63 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bt.v")
    public static class63 field460 = null;

    @ObfuscatedName("bt.d")
    public static int field479 = 0;

    @ObfuscatedName("bt.c")
    public static long field480 = 0L;

    @ObfuscatedName("bt.h")
    public static boolean field463 = false;

    @ObfuscatedName("bt.z")
    public boolean field464 = false;

    @ObfuscatedName("bt.q")
    public static int field483 = 20;

    @ObfuscatedName("bt.l")
    public static int field466 = 1;

    @ObfuscatedName("bt.s")
    public static int field459 = 0;

    @ObfuscatedName("bt.k")
    public static long[] field478 = new long[32];

    @ObfuscatedName("bt.f")
    public static long[] field475 = new long[32];

    @ObfuscatedName("bt.u")
    public int field467;

    @ObfuscatedName("bt.t")
    public int field471;

    @ObfuscatedName("bt.p")
    public int field472 = 0;

    @ObfuscatedName("bt.m")
    public int field473 = 0;

    @ObfuscatedName("bt.j")
    public int field474;

    @ObfuscatedName("bt.ay")
    public int field461;

    @ObfuscatedName("bt.am")
    public int field476;

    @ObfuscatedName("bt.ag")
    public int field477;

    @ObfuscatedName("bt.aq")
    public Frame field491;

    @ObfuscatedName("bt.at")
    public Canvas field470;

    @ObfuscatedName("bt.ak")
    public volatile boolean field469 = true;

    @ObfuscatedName("bt.ar")
    public static int field482 = 500;

    @ObfuscatedName("bt.al")
    public boolean field489 = false;

    @ObfuscatedName("bt.aa")
    public volatile boolean field484 = false;

    @ObfuscatedName("bt.as")
    public volatile long field485 = 0L;

    @ObfuscatedName("bt.ah")
    public class54 field462;

    @ObfuscatedName("bt.ap")
    public Clipboard field487;

    @ObfuscatedName("bt.aj")
    public final EventQueue field488;

    @ObfuscatedName("bt.an")
    public static volatile boolean field468 = true;

    @ObfuscatedName("bt.au")
    public static long field490 = -1L;

    @ObfuscatedName("bt.ad")
    public static long field492 = -1L;

    public class63() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field488 = var1;
        class56 var3 = new class56();
        Statics.field16 = var3;
    }

    @ObfuscatedName("bt.c(III)V")
    public final void method899(int arg0, int arg1) {
        if (this.field476 != arg0 || this.field477 != arg1) {
            this.method869();
        }
        this.field476 = arg0;
        this.field477 = arg1;
    }

    @ObfuscatedName("bt.y(Ljava/lang/Object;I)V")
    public final void method976(Object arg0) {
        if (this.field488 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field488.peekEvent() != null; var2++) {
            class309.method1173(1L);
        }
        if (arg0 != null) {
            this.field488.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bt.h(I)Lfo;")
    public class178 method856() {
        if (this.field462 == null) {
            this.field462 = new class54();
            this.field462.method744(this.field470);
        }
        return this.field462;
    }

    @ObfuscatedName("bt.z(B)V")
    public void method874() {
        this.field487 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bt.e(Ljava/lang/String;I)V")
    public void method857(String arg0) {
        this.field487.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bt.q(I)V")
    public final void method858() {
        if (Statics.field2048.toLowerCase().indexOf("microsoft") == -1) {
            class55.field427[44] = 71;
            class55.field427[45] = 26;
            class55.field427[46] = 72;
            class55.field427[47] = 73;
            class55.field427[59] = 57;
            class55.field427[61] = 27;
            class55.field427[91] = 42;
            class55.field427[92] = 74;
            class55.field427[93] = 43;
            class55.field427[192] = 28;
            class55.field427[222] = 58;
            class55.field427[520] = 59;
        } else {
            class55.field427[186] = 57;
            class55.field427[187] = 27;
            class55.field427[188] = 71;
            class55.field427[189] = 26;
            class55.field427[190] = 72;
            class55.field427[191] = 73;
            class55.field427[192] = 58;
            class55.field427[219] = 42;
            class55.field427[220] = 74;
            class55.field427[221] = 43;
            class55.field427[222] = 59;
            class55.field427[223] = 28;
        }
        Canvas var1 = this.field470;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class55.field409);
        var1.addFocusListener(class55.field409);
    }

    @ObfuscatedName("bt.l(I)V")
    public final void method859() {
        Statics.method426(this.field470);
    }

    @ObfuscatedName("bt.s(I)V")
    public final void method860() {
        Container var1 = this.method886();
        if (var1 == null) {
            return;
        }
        class330 var2 = this.method887();
        this.field467 = Math.max(var2.field3881, this.field474);
        this.field471 = Math.max(var2.field3877, this.field461);
        if (this.field467 <= 0) {
            this.field467 = 1;
        }
        if (this.field471 <= 0) {
            this.field471 = 1;
        }
        Statics.field88 = Math.min(this.field467, this.field476);
        Statics.field145 = Math.min(this.field471, this.field477);
        this.field472 = (this.field467 - Statics.field88) / 2;
        this.field473 = 0;
        this.field470.setSize(Statics.field88, Statics.field145);
        Statics.field2072 = new class62(Statics.field88, Statics.field145, this.field470);
        if (this.field491 == var1) {
            Insets var3 = this.field491.getInsets();
            this.field470.setLocation(this.field472 + var3.left, this.field473 + var3.top);
        } else {
            this.field470.setLocation(this.field472, this.field473);
        }
        this.field469 = true;
        this.method861();
    }

    @ObfuscatedName("bt.a(I)V")
    public void method923() {
        int var1 = this.field472;
        int var2 = this.field473;
        int var3 = this.field467 - Statics.field88 - var1;
        int var4 = this.field471 - Statics.field145 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method886();
            int var6 = 0;
            int var7 = 0;
            if (this.field491 == var5) {
                Insets var8 = this.field491.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field471);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field467, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field467 + var6 - var3, var7, var3, this.field471);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field471 + var7 - var4, this.field467, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bt.w(B)V")
    public final void method970() {
        class55.method3970(this.field470);
        Canvas var1 = this.field470;
        var1.removeMouseListener(class64.field495);
        var1.removeMouseMotionListener(class64.field495);
        var1.removeFocusListener(class64.field495);
        class64.field505 = 0;
        if (this.field462 != null) {
            this.field462.method745(this.field470);
        }
        this.method910();
        Canvas var2 = this.field470;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class55.field409);
        var2.addFocusListener(class55.field409);
        Statics.method426(this.field470);
        if (this.field462 != null) {
            this.field462.method744(this.field470);
        }
        this.method869();
    }

    @ObfuscatedName("bt.t(IIII)V")
    public final void method920(int arg0, int arg1, int arg2) {
        try {
            if (field460 != null) {
                field479++;
                if (field479 >= 3) {
                    this.method885("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field460 = this;
            Statics.field88 = arg0;
            Statics.field145 = arg1;
            Statics.field4084 = arg2;
            Statics.field4086 = this;
            if (Statics.field465 == null) {
                Statics.field465 = new class176();
            }
            Statics.field465.method3387(this, 1);
        } catch (Exception var5) {
            class352.method4617((String) null, var5);
            this.method885("crash");
        }
    }

    @ObfuscatedName("bt.p(S)V")
    public final synchronized void method910() {
        Container var1 = this.method886();
        if (this.field470 != null) {
            this.field470.removeFocusListener(this);
            var1.remove(this.field470);
        }
        Statics.field88 = Math.max(var1.getWidth(), this.field474);
        Statics.field145 = Math.max(var1.getHeight(), this.field461);
        if (this.field491 != null) {
            Insets var2 = this.field491.getInsets();
            Statics.field88 -= var2.right + var2.left;
            Statics.field145 -= var2.top + var2.bottom;
        }
        this.field470 = new class58(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field470);
        this.field470.setSize(Statics.field88, Statics.field145);
        this.field470.setVisible(true);
        this.field470.setBackground(Color.BLACK);
        if (this.field491 == var1) {
            Insets var3 = this.field491.getInsets();
            this.field470.setLocation(this.field472 + var3.left, this.field473 + var3.top);
        } else {
            this.field470.setLocation(this.field472, this.field473);
        }
        this.field470.addFocusListener(this);
        this.field470.requestFocus();
        this.field469 = true;
        if (Statics.field2072 != null && Statics.field88 == Statics.field2072.field3894 && Statics.field145 == Statics.field2072.field3892) {
            ((class62) Statics.field2072).method844(this.field470);
            Statics.field2072.method838(0, 0);
        } else {
            Statics.field2072 = new class62(Statics.field88, Statics.field145, this.field470);
        }
        this.field484 = false;
        this.field485 = class308.method1082();
    }

    @ObfuscatedName("bt.o(I)Z")
    public final boolean method942() {
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
                this.method885("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2048 != null) {
                String var1 = Statics.field2048.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2050;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method885("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class302.method3958(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class302.method344(var4) && class302.method3791(var4) < 10) {
                            this.method885("wrongjava");
                            return;
                        }
                    }
                    field466 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method910();
            this.method879();
            class180 var5;
            try {
                var5 = new class173();
            } catch (Throwable var9) {
                var5 = new class174();
            }
            Statics.field262 = var5;
            while (field480 == 0L || class308.method1082() < field480) {
                Statics.field1771 = Statics.field262.method3360(field483, field466);
                for (int var7 = 0; var7 < Statics.field1771; var7++) {
                    this.method949();
                }
                this.method868();
                this.method976(this.field470);
            }
        } catch (Exception var10) {
            class352.method4617((String) null, var10);
            this.method885("crash");
        }
        this.method870();
    }

    @ObfuscatedName("bt.ay(B)V")
    public void method949() {
        long var1 = class308.method1082();
        long var3 = field475[Statics.field1938];
        field475[Statics.field1938] = var1;
        Statics.field1938 = Statics.field1938 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1441 = field468;
        }
        this.method880();
    }

    @ObfuscatedName("bt.am(I)V")
    public void method868() {
        Container var1 = this.method886();
        long var2 = class308.method1082();
        long var4 = field478[Statics.field456];
        field478[Statics.field456] = var2;
        Statics.field456 = Statics.field456 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field459 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field482 - 1 > 50) {
            field482 -= 50;
            this.field469 = true;
            this.field470.setSize(Statics.field88, Statics.field145);
            this.field470.setVisible(true);
            if (this.field491 == var1) {
                Insets var7 = this.field491.getInsets();
                this.field470.setLocation(this.field472 + var7.left, this.field473 + var7.top);
            } else {
                this.field470.setLocation(this.field472, this.field473);
            }
        }
        if (this.field484) {
            this.method970();
        }
        this.method965();
        this.method881(this.field469);
        if (this.field469) {
            this.method923();
        }
        this.field469 = false;
    }

    @ObfuscatedName("bt.ag(B)V")
    public final void method965() {
        class330 var1 = this.method887();
        if (this.field467 != var1.field3881 || this.field471 != var1.field3877 || this.field489) {
            this.method860();
            this.field489 = false;
        }
    }

    @ObfuscatedName("bt.ae(I)V")
    public final void method869() {
        this.field489 = true;
    }

    @ObfuscatedName("bt.ac(I)V")
    public final synchronized void method870() {
        if (field463) {
            return;
        }
        field463 = true;
        try {
            this.field470.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method985();
        } catch (Exception var7) {
        }
        if (this.field491 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field465 != null) {
            try {
                Statics.field465.method3379();
            } catch (Exception var5) {
            }
        }
        this.method889();
    }

    public final void start() {
        if (field460 == this && !field463) {
            field480 = 0L;
        }
    }

    public final void stop() {
        if (field460 == this && !field463) {
            field480 = class308.method1082() + 4000L;
        }
    }

    public final void destroy() {
        if (field460 == this && !field463) {
            field480 = class308.method1082();
            class309.method1173(5000L);
            this.method870();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field460 != this || field463) {
            return;
        }
        this.field469 = true;
        if (class308.method1082() - this.field485 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field88 && var2.height >= Statics.field145) {
                this.field484 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field468 = true;
        this.field469 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field468 = false;
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

    @ObfuscatedName("bt.ar(ILjava/lang/String;ZS)V")
    public final void method883(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field470.getGraphics();
            if (Statics.field162 == null) {
                Statics.field162 = new Font("Helvetica", 1, 13);
                Statics.field120 = this.field470.getFontMetrics(Statics.field162);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field88, Statics.field145);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field481 == null) {
                    Statics.field481 = this.field470.createImage(304, 34);
                }
                Graphics var6 = Statics.field481.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field162);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field120.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field481, Statics.field88 / 2 - 152, Statics.field145 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field88 / 2 - 152;
                int var9 = Statics.field145 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field162);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field120.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field470.repaint();
        }
    }

    @ObfuscatedName("bt.al(I)V")
    public final void method940() {
        Statics.field481 = null;
        Statics.field162 = null;
        Statics.field120 = null;
    }

    @ObfuscatedName("bt.aa(Ljava/lang/String;B)V")
    public void method885(String arg0) {
        if (this.field464) {
            return;
        }
        this.field464 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bt.as(I)Ljava/awt/Container;")
    public Container method886() {
        return this.field491 == null ? this : this.field491;
    }

    @ObfuscatedName("bt.aw(I)Lli;")
    public class330 method887() {
        Container var1 = this.method886();
        int var2 = Math.max(var1.getWidth(), this.field474);
        int var3 = Math.max(var1.getHeight(), this.field461);
        if (this.field491 != null) {
            Insets var4 = this.field491.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class330(var2, var3);
    }

    @ObfuscatedName("bt.az(I)Z")
    public final boolean method888() {
        return this.field491 != null;
    }

    @ObfuscatedName("g.ah(B)I")
    public static int method150() {
        int var0 = 0;
        if (Statics.field299 == null || !Statics.field299.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field299 = var2;
                        field492 = -1L;
                        field490 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field299 != null) {
            long var4 = class308.method1082();
            long var6 = Statics.field299.getCollectionTime();
            if (field490 != -1L) {
                long var8 = var6 - field490;
                long var10 = var4 - field492;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field490 = var6;
            field492 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bt.b(I)V")
    public abstract void method861();

    public abstract void init();

    @ObfuscatedName("bt.aq(I)V")
    public abstract void method879();

    @ObfuscatedName("bt.at(B)V")
    public abstract void method880();

    @ObfuscatedName("bt.ak(ZI)V")
    public abstract void method881(boolean arg0);

    @ObfuscatedName("bt.ap(B)V")
    public abstract void method889();

    @ObfuscatedName("bt.ax(I)V")
    public abstract void method985();
}
