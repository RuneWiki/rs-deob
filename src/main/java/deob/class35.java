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

@ObfuscatedName("bz")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bz.aw")
    public static class35 field157 = null;

    @ObfuscatedName("bz.ak")
    public static int field159 = 0;

    @ObfuscatedName("bz.aj")
    public static long field160 = 0L;

    @ObfuscatedName("bz.ai")
    public static boolean field161 = false;

    @ObfuscatedName("bz.ay")
    public boolean field178 = false;

    @ObfuscatedName("bz.ae")
    public static int field179 = 20;

    @ObfuscatedName("bz.am")
    public static int field164 = 1;

    @ObfuscatedName("bz.at")
    public static int field165 = 0;

    @ObfuscatedName("bz.ao")
    public static long[] field167 = new long[32];

    @ObfuscatedName("bz.ar")
    public static long[] field182 = new long[32];

    @ObfuscatedName("bz.ag")
    public int field168;

    @ObfuscatedName("bz.ad")
    public int field170;

    @ObfuscatedName("bz.ac")
    public int field171 = 0;

    @ObfuscatedName("bz.av")
    public int field163 = 0;

    @ObfuscatedName("bz.al")
    public int field173;

    @ObfuscatedName("bz.aa")
    public int field190;

    @ObfuscatedName("bz.ah")
    public int field175;

    @ObfuscatedName("bz.bh")
    public int field193;

    @ObfuscatedName("bz.bj")
    public boolean field177 = false;

    @ObfuscatedName("bz.bk")
    public Frame field188;

    @ObfuscatedName("bz.bb")
    public Canvas field172;

    @ObfuscatedName("bz.bq")
    public volatile boolean field180 = true;

    @ObfuscatedName("bz.bz")
    public static int field162 = 500;

    @ObfuscatedName("bz.bc")
    public boolean field183 = false;

    @ObfuscatedName("bz.by")
    public volatile boolean field184 = false;

    @ObfuscatedName("bz.br")
    public volatile long field174 = 0L;

    @ObfuscatedName("bz.bt")
    public class22 field186;

    @ObfuscatedName("bz.bs")
    public Clipboard field187;

    @ObfuscatedName("bz.bm")
    public final EventQueue field158;

    @ObfuscatedName("bz.bo")
    public static volatile boolean field189 = true;

    @ObfuscatedName("bz.ba")
    public static class26 field176 = new class26();

    @ObfuscatedName("bz.bi")
    public static long field191 = -1L;

    @ObfuscatedName("bz.bf")
    public static long field192 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field158 = var1;
        class23 var3 = new class23();
        Statics.field270 = var3;
    }

    @ObfuscatedName("bz.aj(III)V")
    public final void method490(int arg0, int arg1) {
        if (this.field175 != arg0 || this.field193 != arg1) {
            this.method579();
        }
        this.field175 = arg0;
        this.field193 = arg1;
    }

    @ObfuscatedName("bz.ai(Ljava/lang/Object;I)V")
    public final void method492(Object arg0) {
        if (this.field158 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field158.peekEvent() != null; var2++) {
            class331.method1920(1L);
        }
        if (arg0 != null) {
            this.field158.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bz.ay(I)Liv;")
    public class222 method552() {
        if (this.field186 == null) {
            this.field186 = new class22();
            this.field186.method303(this.field172);
        }
        return this.field186;
    }

    @ObfuscatedName("bz.as(B)V")
    public void method513() {
        this.field187 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bz.ae(Ljava/lang/String;I)V")
    public void method494(String arg0) {
        this.field187.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bz.am(B)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method495() {
        return this.field187;
    }

    @ObfuscatedName("bz.at(I)V")
    public final void method496() {
        if (Statics.field2375.toLowerCase().indexOf("microsoft") == -1) {
            class29.field128[44] = 71;
            class29.field128[45] = 26;
            class29.field128[46] = 72;
            class29.field128[47] = 73;
            class29.field128[59] = 57;
            class29.field128[61] = 27;
            class29.field128[91] = 42;
            class29.field128[92] = 74;
            class29.field128[93] = 43;
            class29.field128[192] = 28;
            class29.field128[222] = 58;
            class29.field128[520] = 59;
        } else {
            class29.field128[186] = 57;
            class29.field128[187] = 27;
            class29.field128[188] = 71;
            class29.field128[189] = 26;
            class29.field128[190] = 72;
            class29.field128[191] = 73;
            class29.field128[192] = 58;
            class29.field128[219] = 42;
            class29.field128[220] = 74;
            class29.field128[221] = 43;
            class29.field128[222] = 59;
            class29.field128[223] = 28;
        }
        field176.method371(this.field172);
    }

    @ObfuscatedName("bz.au(I)V")
    public final void method497() {
        field176.method372();
    }

    @ObfuscatedName("bz.an(Lbx;II)V")
    public void method572(class30 arg0, int arg1) {
        field176.method351(arg0, arg1);
    }

    @ObfuscatedName("bz.ao(I)V")
    public final void method591() {
        Canvas var1 = this.field172;
        var1.addMouseListener(class36.field212);
        var1.addMouseMotionListener(class36.field212);
        var1.addFocusListener(class36.field212);
    }

    @ObfuscatedName("bz.af(I)V")
    public final void method590() {
        Container var1 = this.method525();
        if (var1 == null) {
            return;
        }
        class424 var2 = this.method526();
        this.field168 = Math.max(var2.field4760, this.field173);
        this.field170 = Math.max(var2.field4761, this.field190);
        if (this.field168 <= 0) {
            this.field168 = 1;
        }
        if (this.field170 <= 0) {
            this.field170 = 1;
        }
        Statics.field74 = Math.min(this.field168, this.field175);
        Statics.field2983 = Math.min(this.field170, this.field193);
        this.field171 = (this.field168 - Statics.field74) / 2;
        this.field163 = 0;
        this.field172.setSize(Statics.field74, Statics.field2983);
        Statics.field2344 = new class33(Statics.field74, Statics.field2983, this.field172, this.field177);
        if (this.field188 == var1) {
            Insets var3 = this.field188.getInsets();
            this.field172.setLocation(this.field171 + var3.left, this.field163 + var3.top);
        } else {
            this.field172.setLocation(this.field171, this.field163);
        }
        this.field180 = true;
        this.method500();
    }

    @ObfuscatedName("bz.ab(I)V")
    public void method501() {
        int var1 = this.field171;
        int var2 = this.field163;
        int var3 = this.field168 - Statics.field74 - var1;
        int var4 = this.field170 - Statics.field2983 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method525();
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
                var9.fillRect(var6, var7, var1, this.field170);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field168, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field168 + var6 - var3, var7, var3, this.field170);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field170 + var7 - var4, this.field168, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bz.az(I)V")
    public final void method502() {
        field176.method354(this.field172);
        class36.method6688(this.field172);
        if (this.field186 != null) {
            this.field186.method304(this.field172);
        }
        this.method640();
        field176.method371(this.field172);
        Canvas var1 = this.field172;
        var1.addMouseListener(class36.field212);
        var1.addMouseMotionListener(class36.field212);
        var1.addFocusListener(class36.field212);
        if (this.field186 != null) {
            this.field186.method303(this.field172);
        }
        this.method579();
    }

    @ObfuscatedName("bz.ag(IIIII)V")
    public final void method489(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field157 != null) {
                field159++;
                if (field159 >= 3) {
                    this.method603("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field157 = this;
            Statics.field74 = arg0;
            Statics.field2983 = arg1;
            Statics.field5138 = arg2;
            Statics.field5637 = arg3;
            Statics.field5636 = this;
            if (Statics.field185 == null) {
                Statics.field185 = new class219();
            }
            Statics.field185.method4224(this, 1);
        } catch (Exception var6) {
            class584.method8201((String) null, var6);
            this.method603("crash");
        }
    }

    @ObfuscatedName("bz.ad(I)V")
    public final synchronized void method640() {
        Container var1 = this.method525();
        if (this.field172 != null) {
            this.field172.removeFocusListener(this);
            var1.remove(this.field172);
        }
        Statics.field74 = Math.max(var1.getWidth(), this.field173);
        Statics.field2983 = Math.max(var1.getHeight(), this.field190);
        if (this.field188 != null) {
            Insets var2 = this.field188.getInsets();
            Statics.field74 -= var2.right + var2.left;
            Statics.field2983 -= var2.top + var2.bottom;
        }
        this.field172 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field172);
        this.field172.setSize(Statics.field74, Statics.field2983);
        this.field172.setVisible(true);
        this.field172.setBackground(Color.BLACK);
        if (this.field188 == var1) {
            Insets var3 = this.field188.getInsets();
            this.field172.setLocation(this.field171 + var3.left, this.field163 + var3.top);
        } else {
            this.field172.setLocation(this.field171, this.field163);
        }
        this.field172.addFocusListener(this);
        this.field172.requestFocus();
        this.field180 = true;
        if (Statics.field2344 != null && Statics.field74 == Statics.field2344.field5543 && Statics.field2983 == Statics.field2344.field5542) {
            ((class33) Statics.field2344).method468(this.field172);
            Statics.field2344.method470(0, 0);
        } else {
            Statics.field2344 = new class33(Statics.field74, Statics.field2983, this.field172, this.field177);
        }
        this.field184 = false;
        this.field174 = class330.method2257();
    }

    @ObfuscatedName("bz.ac(ZI)V")
    public void method617(boolean arg0) {
        if (this.field177 != arg0) {
            this.field177 = arg0;
            Statics.field2344.method9698(arg0);
            Statics.field2344.method9696();
        }
    }

    @ObfuscatedName("bz.av(I)Z")
    public final boolean method506() {
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
                this.method603("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2375 != null) {
                String var1 = Statics.field2375.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2372;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method603("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && Statics.method3817(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class420.method5805(var4) && class420.method434(var4) < 10) {
                            this.method603("wrongjava");
                            return;
                        }
                    }
                    field164 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method640();
            this.method570();
            Statics.field166 = class232.method1229();
            while (field160 == 0L || class330.method2257() < field160) {
                Statics.field2743 = Statics.field166.method4142(field179, field164);
                for (int var5 = 0; var5 < Statics.field2743; var5++) {
                    this.method507();
                }
                this.method515();
                this.method492(this.field172);
            }
        } catch (Exception var7) {
            class584.method8201((String) null, var7);
            this.method603("crash");
        }
        this.method577();
    }

    @ObfuscatedName("bz.ax(I)V")
    public void method507() {
        long var1 = class330.method2257();
        long var3 = field182[Statics.field4683];
        field182[Statics.field4683] = var1;
        Statics.field4683 = Statics.field4683 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3283 = field189;
        }
        this.method607();
    }

    @ObfuscatedName("bz.aq(B)V")
    public final void method508() {
        this.field180 = true;
    }

    @ObfuscatedName("bz.bx(B)V")
    public void method515() {
        Container var1 = this.method525();
        long var2 = class330.method2257();
        long var4 = field167[Statics.field1748];
        field167[Statics.field1748] = var2;
        Statics.field1748 = Statics.field1748 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field165 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field162 - 1 > 50) {
            field162 -= 50;
            this.field180 = true;
            this.field172.setSize(Statics.field74, Statics.field2983);
            this.field172.setVisible(true);
            if (this.field188 == var1) {
                Insets var7 = this.field188.getInsets();
                this.field172.setLocation(this.field171 + var7.left, this.field163 + var7.top);
            } else {
                this.field172.setLocation(this.field171, this.field163);
            }
        }
        if (this.field184) {
            this.method502();
        }
        this.method546();
        this.method520(this.field180);
        if (this.field180) {
            this.method501();
        }
        this.field180 = false;
    }

    @ObfuscatedName("bz.bk(B)V")
    public final void method546() {
        class424 var1 = this.method526();
        if (this.field168 != var1.field4760 || this.field170 != var1.field4761 || this.field183) {
            this.method590();
            this.field183 = false;
        }
    }

    @ObfuscatedName("bz.bb(I)V")
    public final void method579() {
        this.field183 = true;
    }

    @ObfuscatedName("bz.bq(I)V")
    public final synchronized void method577() {
        if (field161) {
            return;
        }
        field161 = true;
        try {
            this.field172.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method521();
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
                Statics.field185.method4221();
            } catch (Exception var5) {
            }
        }
        this.method528();
    }

    @ObfuscatedName("gw.bp(B)V")
    public static final void method3561() {
        Statics.field166.method4141();
        for (int var0 = 0; var0 < 32; var0++) {
            field167[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field182[var1] = 0L;
        }
        Statics.field2743 = 0;
    }

    public final void start() {
        if (field157 == this && !field161) {
            field160 = 0L;
        }
    }

    public final void stop() {
        if (field157 == this && !field161) {
            field160 = class330.method2257() + 4000L;
        }
    }

    public final void destroy() {
        if (field157 == this && !field161) {
            field160 = class330.method2257();
            class331.method1920(5000L);
            this.method577();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field157 != this || field161) {
            return;
        }
        this.field180 = true;
        if (class330.method2257() - this.field174 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field74 && var2.height >= Statics.field2983) {
                this.field184 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field189 = true;
        this.field180 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field189 = false;
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

    @ObfuscatedName("bz.bn(ILjava/lang/String;ZZB)V")
    public final void method522(int arg0, String arg1, boolean arg2, boolean arg3) {
        try {
            Graphics var5 = this.field172.getGraphics();
            if (Statics.field1434 == null) {
                Statics.field1434 = new Font("Helvetica", 1, 13);
                Statics.field1416 = this.field172.getFontMetrics(Statics.field1434);
            }
            if (arg2 && !arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, Statics.field74, Statics.field2983);
            }
            Color var6 = new Color(140, 17, 17);
            try {
                if (Statics.field181 == null) {
                    Statics.field181 = this.field172.createImage(304, 34);
                }
                Graphics var7 = Statics.field181.getGraphics();
                var7.setColor(var6);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var7.setFont(Statics.field1434);
                var7.setColor(Color.white);
                var7.drawString(arg1, (304 - Statics.field1416.stringWidth(arg1)) / 2, 22);
                var5.drawImage(Statics.field181, Statics.field74 / 2 - 152, (arg3 ? 50 : -18) + Statics.field2983 / 2, (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = Statics.field74 / 2 - 152;
                int var10 = Statics.field2983 / 2 - 18;
                var5.setColor(var6);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1434);
                var5.setColor(Color.white);
                var5.drawString(arg1, var9 + (304 - Statics.field1416.stringWidth(arg1)) / 2, var10 + 22);
            }
        } catch (Exception var13) {
            this.field172.repaint();
        }
    }

    @ObfuscatedName("bz.bu(I)V")
    public final void method523() {
        Statics.field181 = null;
        Statics.field1434 = null;
        Statics.field1416 = null;
    }

    @ObfuscatedName("bz.bt(Ljava/lang/String;I)V")
    public void method603(String arg0) {
        if (this.field178) {
            return;
        }
        this.field178 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bz.bs(B)Ljava/awt/Container;")
    public Container method525() {
        return this.field188 == null ? this : this.field188;
    }

    @ObfuscatedName("bz.bm(I)Lqg;")
    public class424 method526() {
        Container var1 = this.method525();
        int var2 = Math.max(var1.getWidth(), this.field173);
        int var3 = Math.max(var1.getHeight(), this.field190);
        if (this.field188 != null) {
            Insets var4 = this.field188.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class424(var2, var3);
    }

    @ObfuscatedName("bz.bo(I)Z")
    public final boolean method527() {
        return this.field188 != null;
    }

    @ObfuscatedName("og.bd(B)I")
    public static int method6925() {
        int var0 = 0;
        if (Statics.field1529 == null || !Statics.field1529.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1529 = var2;
                        field192 = -1L;
                        field191 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1529 != null) {
            long var4 = class330.method2257();
            long var6 = Statics.field1529.getCollectionTime();
            if (field191 != -1L) {
                long var8 = var6 - field191;
                long var10 = var4 - field192;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field191 = var6;
            field192 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bz.ar(I)V")
    public abstract void method500();

    @ObfuscatedName("bz.by(ZI)V")
    public abstract void method520(boolean arg0);

    @ObfuscatedName("bz.br(I)V")
    public abstract void method521();

    @ObfuscatedName("bz.ba(I)V")
    public abstract void method528();

    @ObfuscatedName("bz.bz(B)V")
    public abstract void method570();

    @ObfuscatedName("bz.bc(I)V")
    public abstract void method607();

    public abstract void init();
}
