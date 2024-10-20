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

@ObfuscatedName("al")
public abstract class class47 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("al.o")
    public static class47 field316 = null;

    @ObfuscatedName("al.u")
    public static int field305 = 0;

    @ObfuscatedName("al.p")
    public static long field306 = 0L;

    @ObfuscatedName("al.b")
    public static boolean field307 = false;

    @ObfuscatedName("al.e")
    public boolean field326 = false;

    @ObfuscatedName("al.g")
    public static int field309 = 20;

    @ObfuscatedName("al.h")
    public static int field310 = 1;

    @ObfuscatedName("al.n")
    public static int field311 = 0;

    @ObfuscatedName("al.d")
    public static long[] field331 = new long[32];

    @ObfuscatedName("al.j")
    public static long[] field314 = new long[32];

    @ObfuscatedName("al.q")
    public int field315;

    @ObfuscatedName("al.t")
    public int field313;

    @ObfuscatedName("al.v")
    public int field335 = 0;

    @ObfuscatedName("al.z")
    public int field318 = 0;

    @ObfuscatedName("al.s")
    public int field333;

    @ObfuscatedName("al.ac")
    public int field321;

    @ObfuscatedName("al.ay")
    public int field327;

    @ObfuscatedName("al.am")
    public int field323;

    @ObfuscatedName("al.at")
    public Frame field324;

    @ObfuscatedName("al.aj")
    public Canvas field325;

    @ObfuscatedName("al.aw")
    public volatile boolean field317 = true;

    @ObfuscatedName("al.ax")
    public static int field322 = 500;

    @ObfuscatedName("al.as")
    public boolean field328 = false;

    @ObfuscatedName("al.ad")
    public volatile boolean field329 = false;

    @ObfuscatedName("al.af")
    public volatile long field304 = 0L;

    @ObfuscatedName("al.av")
    public class38 field332;

    @ObfuscatedName("al.az")
    public Clipboard field303;

    @ObfuscatedName("al.au")
    public final EventQueue field334;

    @ObfuscatedName("al.ab")
    public static volatile boolean field319 = true;

    @ObfuscatedName("al.ar")
    public static long field336 = -1L;

    @ObfuscatedName("al.ak")
    public static long field337 = -1L;

    public class47() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field334 = var1;
        class40 var3 = new class40();
        Statics.field3756 = var3;
    }

    @ObfuscatedName("al.k(IIB)V")
    public final void method366(int arg0, int arg1) {
        if (this.field327 != arg0 || this.field323 != arg1) {
            this.method384();
        }
        this.field327 = arg0;
        this.field323 = arg1;
    }

    @ObfuscatedName("al.g(Ljava/lang/Object;I)V")
    public final void method408(Object arg0) {
        if (this.field334 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field334.peekEvent() != null; var2++) {
            class380.method4072(1L);
        }
        if (arg0 != null) {
            this.field334.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("al.h(I)Ldw;")
    public class130 method503() {
        if (this.field332 == null) {
            this.field332 = new class38();
            this.field332.method272(this.field325);
        }
        return this.field332;
    }

    @ObfuscatedName("al.n(I)V")
    public void method369() {
        this.field303 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("al.l(Ljava/lang/String;I)V")
    public void method370(String arg0) {
        this.field303.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("al.m(I)V")
    public final void method471() {
        class39.method1665();
        Canvas var1 = this.field325;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class39.field270);
        var1.addFocusListener(class39.field270);
    }

    @ObfuscatedName("al.d(I)V")
    public final void method372() {
        class48.method2133(this.field325);
    }

    @ObfuscatedName("al.c(B)V")
    public final void method493() {
        Container var1 = this.method398();
        if (var1 == null) {
            return;
        }
        class336 var2 = this.method399();
        this.field315 = Math.max(var2.field3911, this.field333);
        this.field313 = Math.max(var2.field3913, this.field321);
        if (this.field315 <= 0) {
            this.field315 = 1;
        }
        if (this.field313 <= 0) {
            this.field313 = 1;
        }
        Statics.field1143 = Math.min(this.field315, this.field327);
        Statics.field320 = Math.min(this.field313, this.field323);
        this.field335 = (this.field315 - Statics.field1143) / 2;
        this.field318 = 0;
        this.field325.setSize(Statics.field1143, Statics.field320);
        Statics.field330 = new class46(Statics.field1143, Statics.field320, this.field325);
        if (this.field324 == var1) {
            Insets var3 = this.field324.getInsets();
            this.field325.setLocation(this.field335 + var3.left, this.field318 + var3.top);
        } else {
            this.field325.setLocation(this.field335, this.field318);
        }
        this.field317 = true;
        this.method374();
    }

    @ObfuscatedName("al.r(I)V")
    public void method375() {
        int var1 = this.field335;
        int var2 = this.field318;
        int var3 = this.field315 - Statics.field1143 - var1;
        int var4 = this.field313 - Statics.field320 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method398();
            int var6 = 0;
            int var7 = 0;
            if (this.field324 == var5) {
                Insets var8 = this.field324.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field313);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field315, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field315 + var6 - var3, var7, var3, this.field313);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field313 + var7 - var4, this.field315, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("al.q(I)V")
    public final void method376() {
        Canvas var1 = this.field325;
        var1.removeKeyListener(class39.field270);
        var1.removeFocusListener(class39.field270);
        class39.field260 = -1;
        class48.method2363(this.field325);
        if (this.field332 != null) {
            this.field332.method265(this.field325);
        }
        this.method378();
        Canvas var2 = this.field325;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class39.field270);
        var2.addFocusListener(class39.field270);
        class48.method2133(this.field325);
        if (this.field332 != null) {
            this.field332.method272(this.field325);
        }
        this.method384();
    }

    @ObfuscatedName("al.t(IIII)V")
    public final void method377(int arg0, int arg1, int arg2) {
        try {
            if (field316 != null) {
                field305++;
                if (field305 >= 3) {
                    this.method397("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field316 = this;
            Statics.field1143 = arg0;
            Statics.field320 = arg1;
            Statics.field4289 = arg2;
            Statics.field1108 = this;
            if (Statics.field308 == null) {
                Statics.field308 = new class128();
            }
            Statics.field308.method2223(this, 1);
        } catch (Exception var5) {
            class405.method3718((String) null, var5);
            this.method397("crash");
        }
    }

    @ObfuscatedName("al.w(I)V")
    public final synchronized void method378() {
        Container var1 = this.method398();
        if (this.field325 != null) {
            this.field325.removeFocusListener(this);
            var1.remove(this.field325);
        }
        Statics.field1143 = Math.max(var1.getWidth(), this.field333);
        Statics.field320 = Math.max(var1.getHeight(), this.field321);
        if (this.field324 != null) {
            Insets var2 = this.field324.getInsets();
            Statics.field1143 -= var2.right + var2.left;
            Statics.field320 -= var2.top + var2.bottom;
        }
        this.field325 = new class41(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field325);
        this.field325.setSize(Statics.field1143, Statics.field320);
        this.field325.setVisible(true);
        this.field325.setBackground(Color.BLACK);
        if (this.field324 == var1) {
            Insets var3 = this.field324.getInsets();
            this.field325.setLocation(this.field335 + var3.left, this.field318 + var3.top);
        } else {
            this.field325.setLocation(this.field335, this.field318);
        }
        this.field325.addFocusListener(this);
        this.field325.requestFocus();
        this.field317 = true;
        if (Statics.field330 != null && Statics.field1143 == Statics.field330.field4225 && Statics.field320 == Statics.field330.field4227) {
            ((class46) Statics.field330).method350(this.field325);
            Statics.field330.method355(0, 0);
        } else {
            Statics.field330 = new class46(Statics.field1143, Statics.field320, this.field325);
        }
        this.field329 = false;
        this.field304 = class379.method1540();
    }

    @ObfuscatedName("al.s(B)Z")
    public final boolean method379() {
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
                this.method397("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1466 != null) {
                String var1 = Statics.field1466.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1474;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method397("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class303.method2131(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class303.method2462(var4) && class303.method931(var4) < 10) {
                            this.method397("wrongjava");
                            return;
                        }
                    }
                    field310 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method378();
            this.method367();
            Statics.field512 = class135.method5799();
            while (field306 == 0L || class379.method1540() < field306) {
                Statics.field2807 = Statics.field512.method2209(field309, field310);
                for (int var5 = 0; var5 < Statics.field2807; var5++) {
                    this.method411();
                }
                this.method400();
                this.method408(this.field325);
            }
        } catch (Exception var7) {
            class405.method3718((String) null, var7);
            this.method397("crash");
        }
        this.method385();
    }

    @ObfuscatedName("al.y(B)V")
    public void method411() {
        long var1 = class379.method1540();
        long var3 = field314[Statics.field219];
        field314[Statics.field219] = var1;
        Statics.field219 = Statics.field219 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3314 = field319;
        }
        this.method392();
    }

    @ObfuscatedName("al.ac(B)V")
    public void method400() {
        Container var1 = this.method398();
        long var2 = class379.method1540();
        long var4 = field331[Statics.field1554];
        field331[Statics.field1554] = var2;
        Statics.field1554 = Statics.field1554 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field311 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field322 - 1 > 50) {
            field322 -= 50;
            this.field317 = true;
            this.field325.setSize(Statics.field1143, Statics.field320);
            this.field325.setVisible(true);
            if (this.field324 == var1) {
                Insets var7 = this.field324.getInsets();
                this.field325.setLocation(this.field335 + var7.left, this.field318 + var7.top);
            } else {
                this.field325.setLocation(this.field335, this.field318);
            }
        }
        if (this.field329) {
            this.method376();
        }
        this.method497();
        this.method391(this.field317);
        if (this.field317) {
            this.method375();
        }
        this.field317 = false;
    }

    @ObfuscatedName("al.ay(I)V")
    public final void method497() {
        class336 var1 = this.method399();
        if (this.field315 != var1.field3911 || this.field313 != var1.field3913 || this.field328) {
            this.method493();
            this.field328 = false;
        }
    }

    @ObfuscatedName("al.am(I)V")
    public final void method384() {
        this.field328 = true;
    }

    @ObfuscatedName("al.ag(I)V")
    public final synchronized void method385() {
        if (field307) {
            return;
        }
        field307 = true;
        try {
            this.field325.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method394();
        } catch (Exception var7) {
        }
        if (this.field324 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field308 != null) {
            try {
                Statics.field308.method2217();
            } catch (Exception var5) {
            }
        }
        this.method401();
    }

    public final void start() {
        if (field316 == this && !field307) {
            field306 = 0L;
        }
    }

    public final void stop() {
        if (field316 == this && !field307) {
            field306 = class379.method1540() + 4000L;
        }
    }

    public final void destroy() {
        if (field316 == this && !field307) {
            field306 = class379.method1540();
            class380.method4072(5000L);
            this.method385();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field316 != this || field307) {
            return;
        }
        this.field317 = true;
        if (class379.method1540() - this.field304 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1143 && var2.height >= Statics.field320) {
                this.field329 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field319 = true;
        this.field317 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field319 = false;
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

    @ObfuscatedName("al.ap(ILjava/lang/String;ZI)V")
    public final void method395(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field325.getGraphics();
            if (Statics.field205 == null) {
                Statics.field205 = new Font("Helvetica", 1, 13);
                Statics.field3312 = this.field325.getFontMetrics(Statics.field205);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1143, Statics.field320);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3319 == null) {
                    Statics.field3319 = this.field325.createImage(304, 34);
                }
                Graphics var6 = Statics.field3319.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field205);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field3312.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3319, Statics.field1143 / 2 - 152, Statics.field320 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1143 / 2 - 152;
                int var9 = Statics.field320 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field205);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field3312.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field325.repaint();
        }
    }

    @ObfuscatedName("al.ax(I)V")
    public final void method418() {
        Statics.field3319 = null;
        Statics.field205 = null;
        Statics.field3312 = null;
    }

    @ObfuscatedName("al.as(Ljava/lang/String;I)V")
    public void method397(String arg0) {
        if (this.field326) {
            return;
        }
        this.field326 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("al.ad(I)Ljava/awt/Container;")
    public Container method398() {
        return this.field324 == null ? this : this.field324;
    }

    @ObfuscatedName("al.af(B)Llj;")
    public class336 method399() {
        Container var1 = this.method398();
        int var2 = Math.max(var1.getWidth(), this.field333);
        int var3 = Math.max(var1.getHeight(), this.field321);
        if (this.field324 != null) {
            Insets var4 = this.field324.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class336(var2, var3);
    }

    @ObfuscatedName("al.ao(I)Z")
    public final boolean method386() {
        return this.field324 != null;
    }

    @ObfuscatedName("co.ai(B)I")
    public static int method1655() {
        int var0 = 0;
        if (Statics.field172 == null || !Statics.field172.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field172 = var2;
                        field337 = -1L;
                        field336 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field172 != null) {
            long var4 = class379.method1540();
            long var6 = Statics.field172.getCollectionTime();
            if (field336 != -1L) {
                long var8 = var6 - field336;
                long var10 = var4 - field337;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field336 = var6;
            field337 = var4;
        }
        return var0;
    }

    @ObfuscatedName("al.aq(I)V")
    public abstract void method367();

    @ObfuscatedName("al.j(I)V")
    public abstract void method374();

    public abstract void init();

    @ObfuscatedName("al.aj(ZI)V")
    public abstract void method391(boolean arg0);

    @ObfuscatedName("al.at(B)V")
    public abstract void method392();

    @ObfuscatedName("al.aw(B)V")
    public abstract void method394();

    @ObfuscatedName("al.av(I)V")
    public abstract void method401();
}
