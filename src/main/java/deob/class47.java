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

@ObfuscatedName("aa")
public abstract class class47 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("aa.e")
    public static class47 field320 = null;

    @ObfuscatedName("aa.v")
    public static int field321 = 0;

    @ObfuscatedName("aa.j")
    public static long field327 = 0L;

    @ObfuscatedName("aa.o")
    public static boolean field333 = false;

    @ObfuscatedName("aa.m")
    public boolean field324 = false;

    @ObfuscatedName("aa.h")
    public static int field325 = 20;

    @ObfuscatedName("aa.d")
    public static int field326 = 1;

    @ObfuscatedName("aa.z")
    public static int field347 = 0;

    @ObfuscatedName("aa.k")
    public static long[] field319 = new long[32];

    @ObfuscatedName("aa.t")
    public static long[] field330 = new long[32];

    @ObfuscatedName("aa.q")
    public int field336;

    @ObfuscatedName("aa.s")
    public int field344;

    @ObfuscatedName("aa.p")
    public int field332 = 0;

    @ObfuscatedName("aa.c")
    public int field322 = 0;

    @ObfuscatedName("aa.a")
    public int field335;

    @ObfuscatedName("aa.aw")
    public int field329;

    @ObfuscatedName("aa.ak")
    public int field337;

    @ObfuscatedName("aa.ad")
    public int field334;

    @ObfuscatedName("aa.az")
    public Frame field339;

    @ObfuscatedName("aa.ap")
    public Canvas field340;

    @ObfuscatedName("aa.ag")
    public volatile boolean field341 = true;

    @ObfuscatedName("aa.aq")
    public static int field342 = 500;

    @ObfuscatedName("aa.ae")
    public boolean field343 = false;

    @ObfuscatedName("aa.ao")
    public volatile boolean field331 = false;

    @ObfuscatedName("aa.an")
    public volatile long field349 = 0L;

    @ObfuscatedName("aa.ac")
    public class38 field346;

    @ObfuscatedName("aa.as")
    public Clipboard field338;

    @ObfuscatedName("aa.au")
    public final EventQueue field348;

    @ObfuscatedName("aa.ay")
    public static volatile boolean field323 = true;

    @ObfuscatedName("aa.ai")
    public static long field350 = -1L;

    @ObfuscatedName("aa.av")
    public static long field351 = -1L;

    public class47() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field348 = var1;
        class53.method5287(new class40());
    }

    @ObfuscatedName("aa.o(III)V")
    public final void method403(int arg0, int arg1) {
        if (this.field337 != arg0 || this.field334 != arg1) {
            this.method419();
        }
        this.field337 = arg0;
        this.field334 = arg1;
    }

    @ObfuscatedName("aa.m(Ljava/lang/Object;I)V")
    public final void method528(Object arg0) {
        if (this.field348 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field348.peekEvent() != null; var2++) {
            class382.method169(1L);
        }
        if (arg0 != null) {
            this.field348.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("aa.r(B)Lei;")
    public class131 method483() {
        if (this.field346 == null) {
            this.field346 = new class38();
            this.field346.method269(this.field340);
        }
        return this.field346;
    }

    @ObfuscatedName("aa.h(I)V")
    public void method406() {
        this.field338 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("aa.d(Ljava/lang/String;I)V")
    public void method436(String arg0) {
        this.field338.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("aa.z(I)V")
    public final void method408() {
        class39.method4603();
        class39.method748(this.field340);
    }

    @ObfuscatedName("aa.b(B)V")
    public final void method409() {
        class48.method4006(this.field340);
    }

    @ObfuscatedName("aa.i(B)V")
    public final void method410() {
        Container var1 = this.method552();
        if (var1 == null) {
            return;
        }
        class338 var2 = this.method437();
        this.field336 = Math.max(var2.field3907, this.field335);
        this.field344 = Math.max(var2.field3905, this.field329);
        if (this.field336 <= 0) {
            this.field336 = 1;
        }
        if (this.field344 <= 0) {
            this.field344 = 1;
        }
        Statics.field1350 = Math.min(this.field336, this.field337);
        Statics.field5 = Math.min(this.field344, this.field334);
        this.field332 = (this.field336 - Statics.field1350) / 2;
        this.field322 = 0;
        this.field340.setSize(Statics.field1350, Statics.field5);
        Statics.field2061 = new class46(Statics.field1350, Statics.field5, this.field340);
        if (this.field339 == var1) {
            Insets var3 = this.field339.getInsets();
            this.field340.setLocation(this.field332 + var3.left, this.field322 + var3.top);
        } else {
            this.field340.setLocation(this.field332, this.field322);
        }
        this.field341 = true;
        this.method411();
    }

    @ObfuscatedName("aa.g(B)V")
    public void method412() {
        int var1 = this.field332;
        int var2 = this.field322;
        int var3 = this.field336 - Statics.field1350 - var1;
        int var4 = this.field344 - Statics.field5 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method552();
            int var6 = 0;
            int var7 = 0;
            if (this.field339 == var5) {
                Insets var8 = this.field339.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field344);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field336, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field336 + var6 - var3, var7, var3, this.field344);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field344 + var7 - var4, this.field336, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("aa.t(I)V")
    public final void method497() {
        class39.method171(this.field340);
        Canvas var1 = this.field340;
        var1.removeMouseListener(class48.field354);
        var1.removeMouseMotionListener(class48.field354);
        var1.removeFocusListener(class48.field354);
        class48.field369 = 0;
        if (this.field346 != null) {
            this.field346.method270(this.field340);
        }
        this.method414();
        class39.method748(this.field340);
        class48.method4006(this.field340);
        if (this.field346 != null) {
            this.field346.method269(this.field340);
        }
        this.method419();
    }

    @ObfuscatedName("aa.x(IIII)V")
    public final void method413(int arg0, int arg1, int arg2) {
        try {
            if (field320 != null) {
                field321++;
                if (field321 >= 3) {
                    this.method435("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field320 = this;
            Statics.field1350 = arg0;
            Statics.field5 = arg1;
            Statics.field4305 = arg2;
            Statics.field4304 = this;
            if (Statics.field345 == null) {
                Statics.field345 = new class129();
            }
            Statics.field345.method2330(this, 1);
        } catch (Exception var5) {
            class407.method5131((String) null, var5);
            this.method435("crash");
        }
    }

    @ObfuscatedName("aa.u(I)V")
    public final synchronized void method414() {
        Container var1 = this.method552();
        if (this.field340 != null) {
            this.field340.removeFocusListener(this);
            var1.remove(this.field340);
        }
        Statics.field1350 = Math.max(var1.getWidth(), this.field335);
        Statics.field5 = Math.max(var1.getHeight(), this.field329);
        if (this.field339 != null) {
            Insets var2 = this.field339.getInsets();
            Statics.field1350 -= var2.right + var2.left;
            Statics.field5 -= var2.top + var2.bottom;
        }
        this.field340 = new class41(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field340);
        this.field340.setSize(Statics.field1350, Statics.field5);
        this.field340.setVisible(true);
        this.field340.setBackground(Color.BLACK);
        if (this.field339 == var1) {
            Insets var3 = this.field339.getInsets();
            this.field340.setLocation(this.field332 + var3.left, this.field322 + var3.top);
        } else {
            this.field340.setLocation(this.field332, this.field322);
        }
        this.field340.addFocusListener(this);
        this.field340.requestFocus();
        this.field341 = true;
        if (Statics.field2061 != null && Statics.field1350 == Statics.field2061.field4237 && Statics.field5 == Statics.field2061.field4236) {
            ((class46) Statics.field2061).method391(this.field340);
            Statics.field2061.method380(0, 0);
        } else {
            Statics.field2061 = new class46(Statics.field1350, Statics.field5, this.field340);
        }
        this.field331 = false;
        this.field349 = class381.method4000();
    }

    @ObfuscatedName("aa.q(I)Z")
    public final boolean method455() {
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
                this.method435("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1485 != null) {
                String var1 = Statics.field1485.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1483;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method435("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class305.method2088(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class305.method4250(var4) && class305.method5652(var4) < 10) {
                            this.method435("wrongjava");
                            return;
                        }
                    }
                    field326 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method414();
            this.method422();
            class136 var5;
            try {
                var5 = new class128();
            } catch (Throwable var9) {
                var5 = new class134();
            }
            Statics.field1931 = var5;
            while (field327 == 0L || class381.method4000() < field327) {
                Statics.field4123 = Statics.field1931.method2318(field325, field326);
                for (int var7 = 0; var7 < Statics.field4123; var7++) {
                    this.method416();
                }
                this.method448();
                this.method528(this.field340);
            }
        } catch (Exception var10) {
            class407.method5131((String) null, var10);
            this.method435("crash");
        }
        this.method420();
    }

    @ObfuscatedName("aa.s(B)V")
    public void method416() {
        long var1 = class381.method4000();
        long var3 = field330[Statics.field1913];
        field330[Statics.field1913] = var1;
        Statics.field1913 = Statics.field1913 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field4270 = field323;
        }
        this.method427();
    }

    @ObfuscatedName("aa.p(I)V")
    public void method448() {
        Container var1 = this.method552();
        long var2 = class381.method4000();
        long var4 = field319[Statics.field573];
        field319[Statics.field573] = var2;
        Statics.field573 = Statics.field573 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field347 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field342 - 1 > 50) {
            field342 -= 50;
            this.field341 = true;
            this.field340.setSize(Statics.field1350, Statics.field5);
            this.field340.setVisible(true);
            if (this.field339 == var1) {
                Insets var7 = this.field339.getInsets();
                this.field340.setLocation(this.field332 + var7.left, this.field322 + var7.top);
            } else {
                this.field340.setLocation(this.field332, this.field322);
            }
        }
        if (this.field331) {
            this.method497();
        }
        this.method418();
        this.method431(this.field341);
        if (this.field341) {
            this.method412();
        }
        this.field341 = false;
    }

    @ObfuscatedName("aa.c(I)V")
    public final void method418() {
        class338 var1 = this.method437();
        if (this.field336 != var1.field3907 || this.field344 != var1.field3905 || this.field343) {
            this.method410();
            this.field343 = false;
        }
    }

    @ObfuscatedName("aa.n(I)V")
    public final void method419() {
        this.field343 = true;
    }

    @ObfuscatedName("aa.l(I)V")
    public final synchronized void method420() {
        if (field333) {
            return;
        }
        field333 = true;
        try {
            this.field340.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method531();
        } catch (Exception var7) {
        }
        if (this.field339 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field345 != null) {
            try {
                Statics.field345.method2333();
            } catch (Exception var5) {
            }
        }
        this.method439();
    }

    @ObfuscatedName("aw.w(I)V")
    public static final void method200() {
        Statics.field1931.method2316();
        for (int var0 = 0; var0 < 32; var0++) {
            field319[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field330[var1] = 0L;
        }
        Statics.field4123 = 0;
    }

    public final void start() {
        if (field320 == this && !field333) {
            field327 = 0L;
        }
    }

    public final void stop() {
        if (field320 == this && !field333) {
            field327 = class381.method4000() + 4000L;
        }
    }

    public final void destroy() {
        if (field320 == this && !field333) {
            field327 = class381.method4000();
            class382.method169(5000L);
            this.method420();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field320 != this || field333) {
            return;
        }
        this.field341 = true;
        if (class381.method4000() - this.field349 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1350 && var2.height >= Statics.field5) {
                this.field331 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field323 = true;
        this.field341 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field323 = false;
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

    @ObfuscatedName("aa.at(ILjava/lang/String;ZI)V")
    public final void method433(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field340.getGraphics();
            if (Statics.field120 == null) {
                Statics.field120 = new Font("Helvetica", 1, 13);
                Statics.field3219 = this.field340.getFontMetrics(Statics.field120);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1350, Statics.field5);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1528 == null) {
                    Statics.field1528 = this.field340.createImage(304, 34);
                }
                Graphics var6 = Statics.field1528.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field120);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3219.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1528, Statics.field1350 / 2 - 152, Statics.field5 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1350 / 2 - 152;
                int var9 = Statics.field5 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field120);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3219.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field340.repaint();
        }
    }

    @ObfuscatedName("aa.ah(I)V")
    public final void method509() {
        Statics.field1528 = null;
        Statics.field120 = null;
        Statics.field3219 = null;
    }

    @ObfuscatedName("aa.az(Ljava/lang/String;I)V")
    public void method435(String arg0) {
        if (this.field324) {
            return;
        }
        this.field324 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("aa.ap(B)Ljava/awt/Container;")
    public Container method552() {
        return this.field339 == null ? this : this.field339;
    }

    @ObfuscatedName("aa.ag(B)Llw;")
    public class338 method437() {
        Container var1 = this.method552();
        int var2 = Math.max(var1.getWidth(), this.field335);
        int var3 = Math.max(var1.getHeight(), this.field329);
        if (this.field339 != null) {
            Insets var4 = this.field339.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class338(var2, var3);
    }

    @ObfuscatedName("aa.ab(I)Z")
    public final boolean method438() {
        return this.field339 != null;
    }

    @ObfuscatedName("at.aq(I)I")
    public static int method215() {
        int var0 = 0;
        if (Statics.field124 == null || !Statics.field124.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field124 = var2;
                        field351 = -1L;
                        field350 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field124 != null) {
            long var4 = class381.method4000();
            long var6 = Statics.field124.getCollectionTime();
            if (field350 != -1L) {
                long var8 = var6 - field350;
                long var10 = var4 - field351;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field350 = var6;
            field351 = var4;
        }
        return var0;
    }

    @ObfuscatedName("aa.k(B)V")
    public abstract void method411();

    public abstract void init();

    @ObfuscatedName("aa.a(I)V")
    public abstract void method422();

    @ObfuscatedName("aa.aw(I)V")
    public abstract void method427();

    @ObfuscatedName("aa.ak(ZB)V")
    public abstract void method431(boolean arg0);

    @ObfuscatedName("aa.ae(I)V")
    public abstract void method439();

    @ObfuscatedName("aa.ad(I)V")
    public abstract void method531();
}
