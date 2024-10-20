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

@ObfuscatedName("bf")
public abstract class class53 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bf.s")
    public static class53 field475 = null;

    @ObfuscatedName("bf.g")
    public static int field448 = 0;

    @ObfuscatedName("bf.h")
    public static long field449 = 0L;

    @ObfuscatedName("bf.f")
    public static boolean field450 = false;

    @ObfuscatedName("bf.p")
    public boolean field451 = false;

    @ObfuscatedName("bf.q")
    public static int field478 = 20;

    @ObfuscatedName("bf.b")
    public static int field463 = 1;

    @ObfuscatedName("bf.n")
    public static int field455 = 0;

    @ObfuscatedName("bf.t")
    public static long[] field456 = new long[32];

    @ObfuscatedName("bf.o")
    public static long[] field457 = new long[32];

    @ObfuscatedName("bf.k")
    public int field458;

    @ObfuscatedName("bf.v")
    public int field459;

    @ObfuscatedName("bf.d")
    public int field460 = 0;

    @ObfuscatedName("bf.i")
    public int field461 = 0;

    @ObfuscatedName("bf.z")
    public int field462;

    @ObfuscatedName("bf.ag")
    public int field452;

    @ObfuscatedName("bf.af")
    public int field474;

    @ObfuscatedName("bf.ay")
    public int field465;

    @ObfuscatedName("bf.ah")
    public Frame field467;

    @ObfuscatedName("bf.aw")
    public Canvas field468;

    @ObfuscatedName("bf.an")
    public volatile boolean field469 = true;

    @ObfuscatedName("bf.ae")
    public static int field470 = 500;

    @ObfuscatedName("bf.av")
    public boolean field471 = false;

    @ObfuscatedName("bf.au")
    public volatile boolean field472 = false;

    @ObfuscatedName("bf.aj")
    public volatile long field473 = 0L;

    @ObfuscatedName("bf.ai")
    public class44 field453;

    @ObfuscatedName("bf.aq")
    public Clipboard field454;

    @ObfuscatedName("bf.al")
    public final EventQueue field466;

    @ObfuscatedName("bf.az")
    public static volatile boolean field477 = true;

    @ObfuscatedName("bf.ad")
    public static long field476 = -1L;

    @ObfuscatedName("bf.ax")
    public static long field479 = -1L;

    public class53() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field466 = var1;
        class103.method3172(new class46());
    }

    @ObfuscatedName("bf.h(III)V")
    public final void method770(int arg0, int arg1) {
        if (this.field474 != arg0 || this.field465 != arg1) {
            this.method814();
        }
        this.field474 = arg0;
        this.field465 = arg1;
    }

    @ObfuscatedName("bf.f(Ljava/lang/Object;I)V")
    public final void method794(Object arg0) {
        if (this.field466 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field466.peekEvent() != null; var2++) {
            class199.method3774(1L);
        }
        if (arg0 != null) {
            this.field466.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bf.p(B)Lff;")
    public class164 method772() {
        if (this.field453 == null) {
            this.field453 = new class44();
            this.field453.method670(this.field468);
        }
        return this.field453;
    }

    @ObfuscatedName("bf.m(I)V")
    public void method773() {
        this.field454 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bf.q(Ljava/lang/String;I)V")
    public void method774(String arg0) {
        this.field454.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bf.b(I)V")
    public final void method775() {
        if (Statics.field2035.toLowerCase().indexOf("microsoft") == -1) {
            class45.field406[44] = 71;
            class45.field406[45] = 26;
            class45.field406[46] = 72;
            class45.field406[47] = 73;
            class45.field406[59] = 57;
            class45.field406[61] = 27;
            class45.field406[91] = 42;
            class45.field406[92] = 74;
            class45.field406[93] = 43;
            class45.field406[192] = 28;
            class45.field406[222] = 58;
            class45.field406[520] = 59;
        } else {
            class45.field406[186] = 57;
            class45.field406[187] = 27;
            class45.field406[188] = 71;
            class45.field406[189] = 26;
            class45.field406[190] = 72;
            class45.field406[191] = 73;
            class45.field406[192] = 58;
            class45.field406[219] = 42;
            class45.field406[220] = 74;
            class45.field406[221] = 43;
            class45.field406[222] = 59;
            class45.field406[223] = 28;
        }
        class45.method1071(this.field468);
    }

    @ObfuscatedName("bf.n(I)V")
    public final void method843() {
        class54.method5294(this.field468);
    }

    @ObfuscatedName("bf.e(I)V")
    public final void method777() {
        Container var1 = this.method801();
        if (var1 == null) {
            return;
        }
        class320 var2 = this.method902();
        this.field458 = Math.max(var2.field3847, this.field462);
        this.field459 = Math.max(var2.field3848, this.field452);
        if (this.field458 <= 0) {
            this.field458 = 1;
        }
        if (this.field459 <= 0) {
            this.field459 = 1;
        }
        Statics.field75 = Math.min(this.field458, this.field474);
        Statics.field348 = Math.min(this.field459, this.field465);
        this.field460 = (this.field458 - Statics.field75) / 2;
        this.field461 = 0;
        this.field468.setSize(Statics.field75, Statics.field348);
        Statics.field1290 = new class52(Statics.field75, Statics.field348, this.field468);
        if (this.field467 == var1) {
            Insets var3 = this.field467.getInsets();
            this.field468.setLocation(this.field460 + var3.left, this.field461 + var3.top);
        } else {
            this.field468.setLocation(this.field460, this.field461);
        }
        this.field469 = true;
        this.method778();
    }

    @ObfuscatedName("bf.t(I)V")
    public void method900() {
        int var1 = this.field460;
        int var2 = this.field461;
        int var3 = this.field458 - Statics.field75 - var1;
        int var4 = this.field459 - Statics.field348 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method801();
            int var6 = 0;
            int var7 = 0;
            if (this.field467 == var5) {
                Insets var8 = this.field467.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field459);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field458, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field458 + var6 - var3, var7, var3, this.field459);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field459 + var7 - var4, this.field458, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bf.l(B)V")
    public final void method780() {
        class45.method213(this.field468);
        class54.method3776(this.field468);
        if (this.field453 != null) {
            this.field453.method671(this.field468);
        }
        this.method782();
        class45.method1071(this.field468);
        class54.method5294(this.field468);
        if (this.field453 != null) {
            this.field453.method670(this.field468);
        }
        this.method814();
    }

    @ObfuscatedName("bf.k(IIIB)V")
    public final void method831(int arg0, int arg1, int arg2) {
        try {
            if (field475 != null) {
                field448++;
                if (field448 >= 3) {
                    this.method827("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field475 = this;
            Statics.field75 = arg0;
            Statics.field348 = arg1;
            Statics.field2021 = arg2;
            Statics.field2023 = this;
            if (Statics.field3849 == null) {
                Statics.field3849 = new class162();
            }
            Statics.field3849.method3221(this, 1);
        } catch (Exception var5) {
            class160.method2786((String) null, var5);
            this.method827("crash");
        }
    }

    @ObfuscatedName("bf.v(I)V")
    public final synchronized void method782() {
        Container var1 = this.method801();
        if (this.field468 != null) {
            this.field468.removeFocusListener(this);
            var1.remove(this.field468);
        }
        Statics.field75 = Math.max(var1.getWidth(), this.field462);
        Statics.field348 = Math.max(var1.getHeight(), this.field452);
        if (this.field467 != null) {
            Insets var2 = this.field467.getInsets();
            Statics.field75 -= var2.right + var2.left;
            Statics.field348 -= var2.top + var2.bottom;
        }
        this.field468 = new class48(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field468);
        this.field468.setSize(Statics.field75, Statics.field348);
        this.field468.setVisible(true);
        this.field468.setBackground(Color.BLACK);
        if (this.field467 == var1) {
            Insets var3 = this.field467.getInsets();
            this.field468.setLocation(this.field460 + var3.left, this.field461 + var3.top);
        } else {
            this.field468.setLocation(this.field460, this.field461);
        }
        this.field468.addFocusListener(this);
        this.field468.requestFocus();
        this.field469 = true;
        if (Statics.field1290 != null && Statics.field75 == Statics.field1290.field3869 && Statics.field348 == Statics.field1290.field3868) {
            ((class52) Statics.field1290).method753(this.field468);
            Statics.field1290.method755(0, 0);
        } else {
            Statics.field1290 = new class52(Statics.field75, Statics.field348, this.field468);
        }
        this.field472 = false;
        this.field473 = class192.method183();
    }

    @ObfuscatedName("bf.c(I)Z")
    public final boolean method783() {
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
                this.method827("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2035 != null) {
                String var1 = Statics.field2035.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2039;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method827("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class312.method3178(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class312.method3062(var4) && class312.method4724(var4) < 10) {
                            this.method827("wrongjava");
                            return;
                        }
                    }
                    field463 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method782();
            this.method795();
            class168 var5;
            try {
                var5 = new class157();
            } catch (Throwable var9) {
                var5 = new class158();
            }
            Statics.field2671 = var5;
            while (field449 == 0L || class192.method183() < field449) {
                Statics.field464 = Statics.field2671.method3183(field478, field463);
                for (int var7 = 0; var7 < Statics.field464; var7++) {
                    this.method807();
                }
                this.method785();
                this.method794(this.field468);
            }
        } catch (Exception var10) {
            class160.method2786((String) null, var10);
            this.method827("crash");
        }
        this.method788();
    }

    @ObfuscatedName("bf.aa(B)V")
    public void method807() {
        long var1 = class192.method183();
        long var3 = field457[Statics.field1134];
        field457[Statics.field1134] = var1;
        Statics.field1134 = Statics.field1134 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field244 = field477;
        }
        this.method791();
    }

    @ObfuscatedName("bf.ab(I)V")
    public void method785() {
        Container var1 = this.method801();
        long var2 = class192.method183();
        long var4 = field456[Statics.field36];
        field456[Statics.field36] = var2;
        Statics.field36 = Statics.field36 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field455 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field470 - 1 > 50) {
            field470 -= 50;
            this.field469 = true;
            this.field468.setSize(Statics.field75, Statics.field348);
            this.field468.setVisible(true);
            if (this.field467 == var1) {
                Insets var7 = this.field467.getInsets();
                this.field468.setLocation(this.field460 + var7.left, this.field461 + var7.top);
            } else {
                this.field468.setLocation(this.field460, this.field461);
            }
        }
        if (this.field472) {
            this.method780();
        }
        this.method881();
        this.method874(this.field469);
        if (this.field469) {
            this.method900();
        }
        this.field469 = false;
    }

    @ObfuscatedName("bf.ah(S)V")
    public final void method881() {
        class320 var1 = this.method902();
        if (this.field458 != var1.field3847 || this.field459 != var1.field3848 || this.field471) {
            this.method777();
            this.field471 = false;
        }
    }

    @ObfuscatedName("bf.aw(I)V")
    public final void method814() {
        this.field471 = true;
    }

    @ObfuscatedName("bf.an(I)V")
    public final synchronized void method788() {
        if (field450) {
            return;
        }
        field450 = true;
        try {
            this.field468.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method798();
        } catch (Exception var7) {
        }
        if (this.field467 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field3849 != null) {
            try {
                Statics.field3849.method3214();
            } catch (Exception var5) {
            }
        }
        this.method804();
    }

    @ObfuscatedName("bt.at(I)V")
    public static final void method1663() {
        Statics.field2671.method3180();
        for (int var0 = 0; var0 < 32; var0++) {
            field456[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field457[var1] = 0L;
        }
        Statics.field464 = 0;
    }

    public final void start() {
        if (field475 == this && !field450) {
            field449 = 0L;
        }
    }

    public final void stop() {
        if (field475 == this && !field450) {
            field449 = class192.method183() + 4000L;
        }
    }

    public final void destroy() {
        if (field475 == this && !field450) {
            field449 = class192.method183();
            class199.method3774(5000L);
            this.method788();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field475 != this || field450) {
            return;
        }
        this.field469 = true;
        if (class192.method183() - this.field473 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field75 && var2.height >= Statics.field348) {
                this.field472 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field477 = true;
        this.field469 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field477 = false;
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

    @ObfuscatedName("bf.as(ILjava/lang/String;ZI)V")
    public final void method799(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field468.getGraphics();
            if (Statics.field88 == null) {
                Statics.field88 = new Font("Helvetica", 1, 13);
                Statics.field447 = this.field468.getFontMetrics(Statics.field88);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field75, Statics.field348);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field281 == null) {
                    Statics.field281 = this.field468.createImage(304, 34);
                }
                Graphics var6 = Statics.field281.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field88);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field447.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field281, Statics.field75 / 2 - 152, Statics.field348 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field75 / 2 - 152;
                int var9 = Statics.field348 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field88);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field447.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field468.repaint();
        }
    }

    @ObfuscatedName("bf.ar(I)V")
    public final void method800() {
        Statics.field281 = null;
        Statics.field88 = null;
        Statics.field447 = null;
    }

    @ObfuscatedName("bf.ai(Ljava/lang/String;I)V")
    public void method827(String arg0) {
        if (this.field451) {
            return;
        }
        this.field451 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bf.aq(B)Ljava/awt/Container;")
    public Container method801() {
        return this.field467 == null ? this : this.field467;
    }

    @ObfuscatedName("bf.al(I)Llh;")
    public class320 method902() {
        Container var1 = this.method801();
        int var2 = Math.max(var1.getWidth(), this.field462);
        int var3 = Math.max(var1.getHeight(), this.field452);
        if (this.field467 != null) {
            Insets var4 = this.field467.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class320(var2, var3);
    }

    @ObfuscatedName("bf.az(I)Z")
    public final boolean method803() {
        return this.field467 != null;
    }

    @ObfuscatedName("s.ac(I)I")
    public static int method18() {
        int var0 = 0;
        if (Statics.field2427 == null || !Statics.field2427.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2427 = var2;
                        field479 = -1L;
                        field476 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2427 != null) {
            long var4 = class192.method183();
            long var6 = Statics.field2427.getCollectionTime();
            if (field476 != -1L) {
                long var8 = var6 - field476;
                long var10 = var4 - field479;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field476 = var6;
            field479 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bf.r(I)V")
    public abstract void method778();

    @ObfuscatedName("bf.av(B)V")
    public abstract void method791();

    public abstract void init();

    @ObfuscatedName("bf.ae(I)V")
    public abstract void method795();

    @ObfuscatedName("bf.aj(I)V")
    public abstract void method798();

    @ObfuscatedName("bf.ao(I)V")
    public abstract void method804();

    @ObfuscatedName("bf.au(ZB)V")
    public abstract void method874(boolean arg0);
}
