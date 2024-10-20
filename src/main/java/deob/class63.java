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

@ObfuscatedName("ba")
public abstract class class63 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ba.b")
    public static class63 field468 = null;

    @ObfuscatedName("ba.l")
    public static int field470 = 0;

    @ObfuscatedName("ba.m")
    public static long field490 = 0L;

    @ObfuscatedName("ba.z")
    public static boolean field481 = false;

    @ObfuscatedName("ba.q")
    public boolean field487 = false;

    @ObfuscatedName("ba.c")
    public static int field469 = 20;

    @ObfuscatedName("ba.u")
    public static int field475 = 1;

    @ObfuscatedName("ba.t")
    public static int field476 = 0;

    @ObfuscatedName("ba.n")
    public static long[] field477 = new long[32];

    @ObfuscatedName("ba.r")
    public static long[] field471 = new long[32];

    @ObfuscatedName("ba.j")
    public int field479;

    @ObfuscatedName("ba.v")
    public int field472;

    @ObfuscatedName("ba.d")
    public int field478 = 0;

    @ObfuscatedName("ba.a")
    public int field482 = 0;

    @ObfuscatedName("ba.i")
    public int field483;

    @ObfuscatedName("ba.ab")
    public int field484;

    @ObfuscatedName("ba.ac")
    public int field485;

    @ObfuscatedName("ba.ao")
    public int field486;

    @ObfuscatedName("ba.ar")
    public Frame field473;

    @ObfuscatedName("ba.ay")
    public Canvas field488;

    @ObfuscatedName("ba.ah")
    public volatile boolean field489 = true;

    @ObfuscatedName("ba.ak")
    public static int field496 = 500;

    @ObfuscatedName("ba.au")
    public boolean field491 = false;

    @ObfuscatedName("ba.ai")
    public volatile boolean field480 = false;

    @ObfuscatedName("ba.ax")
    public volatile long field493 = 0L;

    @ObfuscatedName("ba.aw")
    public class54 field494;

    @ObfuscatedName("ba.an")
    public Clipboard field495;

    @ObfuscatedName("ba.am")
    public final EventQueue field498;

    @ObfuscatedName("ba.aa")
    public static volatile boolean field497 = true;

    @ObfuscatedName("ba.aj")
    public static long field474 = -1L;

    @ObfuscatedName("ba.ae")
    public static long field499 = -1L;

    public class63() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field498 = var1;
        class56 var3 = new class56();
        Statics.field592 = var3;
    }

    @ObfuscatedName("ba.z(IIS)V")
    public final void method847(int arg0, int arg1) {
        if (this.field485 != arg0 || this.field486 != arg1) {
            this.method864();
        }
        this.field485 = arg0;
        this.field486 = arg1;
    }

    @ObfuscatedName("ba.q(Ljava/lang/Object;I)V")
    public final void method848(Object arg0) {
        if (this.field498 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field498.peekEvent() != null; var2++) {
            class309.method735(1L);
        }
        if (arg0 != null) {
            this.field498.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ba.k(I)Lfq;")
    public class178 method902() {
        if (this.field494 == null) {
            this.field494 = new class54();
            this.field494.method742(this.field488);
        }
        return this.field494;
    }

    @ObfuscatedName("ba.c(I)V")
    public void method850() {
        this.field495 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ba.u(Ljava/lang/String;I)V")
    public void method957(String arg0) {
        this.field495.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ba.t(B)V")
    public final void method852() {
        class55.method196();
        class55.method2871(this.field488);
    }

    @ObfuscatedName("ba.e(I)V")
    public final void method939() {
        class64.method2634(this.field488);
    }

    @ObfuscatedName("ba.o(B)V")
    public final void method854() {
        Container var1 = this.method880();
        if (var1 == null) {
            return;
        }
        class330 var2 = this.method881();
        this.field479 = Math.max(var2.field3878, this.field483);
        this.field472 = Math.max(var2.field3880, this.field484);
        if (this.field479 <= 0) {
            this.field479 = 1;
        }
        if (this.field472 <= 0) {
            this.field472 = 1;
        }
        Statics.field567 = Math.min(this.field479, this.field485);
        Statics.field1150 = Math.min(this.field472, this.field486);
        this.field478 = (this.field479 - Statics.field567) / 2;
        this.field482 = 0;
        this.field488.setSize(Statics.field567, Statics.field1150);
        Statics.field119 = new class62(Statics.field567, Statics.field1150, this.field488);
        if (this.field473 == var1) {
            Insets var3 = this.field473.getInsets();
            this.field488.setLocation(this.field478 + var3.left, this.field482 + var3.top);
        } else {
            this.field488.setLocation(this.field478, this.field482);
        }
        this.field489 = true;
        this.method900();
    }

    @ObfuscatedName("ba.x(I)V")
    public void method856() {
        int var1 = this.field478;
        int var2 = this.field482;
        int var3 = this.field479 - Statics.field567 - var1;
        int var4 = this.field472 - Statics.field1150 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method880();
            int var6 = 0;
            int var7 = 0;
            if (this.field473 == var5) {
                Insets var8 = this.field473.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field472);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field479, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field479 + var6 - var3, var7, var3, this.field472);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field472 + var7 - var4, this.field479, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ba.p(I)V")
    public final void method857() {
        Canvas var1 = this.field488;
        var1.removeKeyListener(class55.field413);
        var1.removeFocusListener(class55.field413);
        class55.field424 = -1;
        Canvas var2 = this.field488;
        var2.removeMouseListener(class64.field527);
        var2.removeMouseMotionListener(class64.field527);
        var2.removeFocusListener(class64.field527);
        class64.field508 = 0;
        if (this.field494 != null) {
            this.field494.method743(this.field488);
        }
        this.method859();
        class55.method2871(this.field488);
        class64.method2634(this.field488);
        if (this.field494 != null) {
            this.field494.method742(this.field488);
        }
        this.method864();
    }

    @ObfuscatedName("ba.r(IIII)V")
    public final void method858(int arg0, int arg1, int arg2) {
        try {
            if (field468 != null) {
                field470++;
                if (field470 >= 3) {
                    this.method879("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field468 = this;
            Statics.field567 = arg0;
            Statics.field1150 = arg1;
            Statics.field4083 = arg2;
            Statics.field4081 = this;
            if (Statics.field501 == null) {
                Statics.field501 = new class176();
            }
            Statics.field501.method3287(this, 1);
        } catch (Exception var5) {
            class352.method2205((String) null, var5);
            this.method879("crash");
        }
    }

    @ObfuscatedName("ba.y(I)V")
    public final synchronized void method859() {
        Container var1 = this.method880();
        if (this.field488 != null) {
            this.field488.removeFocusListener(this);
            var1.remove(this.field488);
        }
        Statics.field567 = Math.max(var1.getWidth(), this.field483);
        Statics.field1150 = Math.max(var1.getHeight(), this.field484);
        if (this.field473 != null) {
            Insets var2 = this.field473.getInsets();
            Statics.field567 -= var2.right + var2.left;
            Statics.field1150 -= var2.top + var2.bottom;
        }
        this.field488 = new class58(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field488);
        this.field488.setSize(Statics.field567, Statics.field1150);
        this.field488.setVisible(true);
        this.field488.setBackground(Color.BLACK);
        if (this.field473 == var1) {
            Insets var3 = this.field473.getInsets();
            this.field488.setLocation(this.field478 + var3.left, this.field482 + var3.top);
        } else {
            this.field488.setLocation(this.field478, this.field482);
        }
        this.field488.addFocusListener(this);
        this.field488.requestFocus();
        this.field489 = true;
        if (Statics.field119 != null && Statics.field567 == Statics.field119.field3892 && Statics.field1150 == Statics.field119.field3893) {
            ((class62) Statics.field119).method827(this.field488);
            Statics.field119.method828(0, 0);
        } else {
            Statics.field119 = new class62(Statics.field567, Statics.field1150, this.field488);
        }
        this.field480 = false;
        this.field493 = class308.method4786();
    }

    @ObfuscatedName("ba.s(B)Z")
    public final boolean method860() {
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
                this.method879("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2059 != null) {
                String var1 = Statics.field2059.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2071;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method879("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class302.method11(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class302.method3434(var4) && class302.method1841(var4) < 10) {
                            this.method879("wrongjava");
                            return;
                        }
                    }
                    field475 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method859();
            this.method873();
            Statics.field2019 = class180.method1681();
            while (field490 == 0L || class308.method4786() < field490) {
                Statics.field500 = Statics.field2019.method3280(field469, field475);
                for (int var5 = 0; var5 < Statics.field500; var5++) {
                    this.method861();
                }
                this.method862();
                this.method848(this.field488);
            }
        } catch (Exception var7) {
            class352.method2205((String) null, var7);
            this.method879("crash");
        }
        this.method865();
    }

    @ObfuscatedName("ba.j(I)V")
    public void method861() {
        long var1 = class308.method4786();
        long var3 = field471[Statics.field23];
        field471[Statics.field23] = var1;
        Statics.field23 = Statics.field23 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field39 = field497;
        }
        this.method874();
    }

    @ObfuscatedName("ba.d(B)V")
    public void method862() {
        Container var1 = this.method880();
        long var2 = class308.method4786();
        long var4 = field477[Statics.field3846];
        field477[Statics.field3846] = var2;
        Statics.field3846 = Statics.field3846 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field476 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field496 - 1 > 50) {
            field496 -= 50;
            this.field489 = true;
            this.field488.setSize(Statics.field567, Statics.field1150);
            this.field488.setVisible(true);
            if (this.field473 == var1) {
                Insets var7 = this.field473.getInsets();
                this.field488.setLocation(this.field478 + var7.left, this.field482 + var7.top);
            } else {
                this.field488.setLocation(this.field478, this.field482);
            }
        }
        if (this.field480) {
            this.method857();
        }
        this.method863();
        this.method943(this.field489);
        if (this.field489) {
            this.method856();
        }
        this.field489 = false;
    }

    @ObfuscatedName("ba.a(I)V")
    public final void method863() {
        class330 var1 = this.method881();
        if (this.field479 != var1.field3878 || this.field472 != var1.field3880 || this.field491) {
            this.method854();
            this.field491 = false;
        }
    }

    @ObfuscatedName("ba.g(B)V")
    public final void method864() {
        this.field491 = true;
    }

    @ObfuscatedName("ba.ar(I)V")
    public final synchronized void method865() {
        if (field481) {
            return;
        }
        field481 = true;
        try {
            this.field488.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method876();
        } catch (Exception var7) {
        }
        if (this.field473 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field501 != null) {
            try {
                Statics.field501.method3297();
            } catch (Exception var5) {
            }
        }
        this.method883();
    }

    @ObfuscatedName("ai.ay(I)V")
    public static final void method443() {
        Statics.field2019.method3274();
        for (int var0 = 0; var0 < 32; var0++) {
            field477[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field471[var1] = 0L;
        }
        Statics.field500 = 0;
    }

    public final void start() {
        if (field468 == this && !field481) {
            field490 = 0L;
        }
    }

    public final void stop() {
        if (field468 == this && !field481) {
            field490 = class308.method4786() + 4000L;
        }
    }

    public final void destroy() {
        if (field468 == this && !field481) {
            field490 = class308.method4786();
            class309.method735(5000L);
            this.method865();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field468 != this || field481) {
            return;
        }
        this.field489 = true;
        if (class308.method4786() - this.field493 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field567 && var2.height >= Statics.field1150) {
                this.field480 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field497 = true;
        this.field489 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field497 = false;
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

    @ObfuscatedName("ba.ai(ILjava/lang/String;ZB)V")
    public final void method877(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field488.getGraphics();
            if (Statics.field1782 == null) {
                Statics.field1782 = new Font("Helvetica", 1, 13);
                Statics.field401 = this.field488.getFontMetrics(Statics.field1782);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field567, Statics.field1150);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field2780 == null) {
                    Statics.field2780 = this.field488.createImage(304, 34);
                }
                Graphics var6 = Statics.field2780.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1782);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field401.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field2780, Statics.field567 / 2 - 152, Statics.field1150 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field567 / 2 - 152;
                int var9 = Statics.field1150 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1782);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field401.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field488.repaint();
        }
    }

    @ObfuscatedName("ba.ax(B)V")
    public final void method953() {
        Statics.field2780 = null;
        Statics.field1782 = null;
        Statics.field401 = null;
    }

    @ObfuscatedName("ba.ag(Ljava/lang/String;I)V")
    public void method879(String arg0) {
        if (this.field487) {
            return;
        }
        this.field487 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ba.aq(B)Ljava/awt/Container;")
    public Container method880() {
        return this.field473 == null ? this : this.field473;
    }

    @ObfuscatedName("ba.aw(B)Llw;")
    public class330 method881() {
        Container var1 = this.method880();
        int var2 = Math.max(var1.getWidth(), this.field483);
        int var3 = Math.max(var1.getHeight(), this.field484);
        if (this.field473 != null) {
            Insets var4 = this.field473.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class330(var2, var3);
    }

    @ObfuscatedName("ba.an(I)Z")
    public final boolean method882() {
        return this.field473 != null;
    }

    @ObfuscatedName("ih.am(I)I")
    public static int method3889() {
        int var0 = 0;
        if (Statics.field229 == null || !Statics.field229.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field229 = var2;
                        field499 = -1L;
                        field474 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field229 != null) {
            long var4 = class308.method4786();
            long var6 = Statics.field229.getCollectionTime();
            if (field474 != -1L) {
                long var8 = var6 - field474;
                long var10 = var4 - field499;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field474 = var6;
            field499 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("ba.ah(I)V")
    public abstract void method873();

    @ObfuscatedName("ba.az(I)V")
    public abstract void method874();

    @ObfuscatedName("ba.au(B)V")
    public abstract void method876();

    @ObfuscatedName("ba.aa(B)V")
    public abstract void method883();

    @ObfuscatedName("ba.n(I)V")
    public abstract void method900();

    @ObfuscatedName("ba.ak(ZI)V")
    public abstract void method943(boolean arg0);
}
