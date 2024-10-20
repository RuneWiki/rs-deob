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
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ba.ae")
    public static class35 field175 = null;

    @ObfuscatedName("ba.ag")
    public static int field179 = 0;

    @ObfuscatedName("ba.am")
    public static long field166 = 0L;

    @ObfuscatedName("ba.ax")
    public static boolean field167 = false;

    @ObfuscatedName("ba.aq")
    public boolean field168 = false;

    @ObfuscatedName("ba.at")
    public static int field191 = 20;

    @ObfuscatedName("ba.au")
    public static int field164 = 1;

    @ObfuscatedName("ba.ar")
    public static int field172 = 0;

    @ObfuscatedName("ba.ah")
    public static long[] field174 = new long[32];

    @ObfuscatedName("ba.ab")
    public static long[] field193 = new long[32];

    @ObfuscatedName("ba.ai")
    public int field176;

    @ObfuscatedName("ba.ao")
    public int field177;

    @ObfuscatedName("ba.as")
    public int field178 = 0;

    @ObfuscatedName("ba.ay")
    public int field195 = 0;

    @ObfuscatedName("ba.aw")
    public int field186;

    @ObfuscatedName("ba.an")
    public int field165;

    @ObfuscatedName("ba.ak")
    public int field182;

    @ObfuscatedName("ba.bn")
    public int field183;

    @ObfuscatedName("ba.bh")
    public boolean field173 = false;

    @ObfuscatedName("ba.bf")
    public Frame field185;

    @ObfuscatedName("ba.bm")
    public Canvas field181;

    @ObfuscatedName("ba.bs")
    public volatile boolean field187 = true;

    @ObfuscatedName("ba.ba")
    public static int field188 = 500;

    @ObfuscatedName("ba.bj")
    public boolean field189 = false;

    @ObfuscatedName("ba.bp")
    public volatile boolean field190 = false;

    @ObfuscatedName("ba.by")
    public volatile long field180 = 0L;

    @ObfuscatedName("ba.bg")
    public class22 field171;

    @ObfuscatedName("ba.bl")
    public Clipboard field184;

    @ObfuscatedName("ba.bz")
    public final EventQueue field194;

    @ObfuscatedName("ba.bu")
    public static volatile boolean field192 = true;

    @ObfuscatedName("ba.bo")
    public static class26 field196 = new class26();

    @ObfuscatedName("ba.bt")
    public static long field197 = -1L;

    @ObfuscatedName("ba.bq")
    public static long field198 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field194 = var1;
        class23 var3 = new class23();
        Statics.field264 = var3;
    }

    @ObfuscatedName("ba.aq(III)V")
    public final void method590(int arg0, int arg1) {
        if (this.field182 != arg0 || this.field183 != arg1) {
            this.method592();
        }
        this.field182 = arg0;
        this.field183 = arg1;
    }

    @ObfuscatedName("ba.af(Ljava/lang/Object;I)V")
    public final void method476(Object arg0) {
        if (this.field194 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field194.peekEvent() != null; var2++) {
            class332.method4128(1L);
        }
        if (arg0 != null) {
            this.field194.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ba.at(I)Liw;")
    public class222 method477() {
        if (this.field171 == null) {
            this.field171 = new class22();
            this.field171.method297(this.field181);
        }
        return this.field171;
    }

    @ObfuscatedName("ba.au(B)V")
    public void method478() {
        this.field184 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ba.ar(Ljava/lang/String;I)V")
    public void method499(String arg0) {
        this.field184.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ba.al(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method480() {
        return this.field184;
    }

    @ObfuscatedName("ba.ad(I)V")
    public final void method474() {
        if (Statics.field2378.toLowerCase().indexOf("microsoft") == -1) {
            class29.field132[44] = 71;
            class29.field132[45] = 26;
            class29.field132[46] = 72;
            class29.field132[47] = 73;
            class29.field132[59] = 57;
            class29.field132[61] = 27;
            class29.field132[91] = 42;
            class29.field132[92] = 74;
            class29.field132[93] = 43;
            class29.field132[192] = 28;
            class29.field132[222] = 58;
            class29.field132[520] = 59;
        } else {
            class29.field132[186] = 57;
            class29.field132[187] = 27;
            class29.field132[188] = 71;
            class29.field132[189] = 26;
            class29.field132[190] = 72;
            class29.field132[191] = 73;
            class29.field132[192] = 58;
            class29.field132[219] = 42;
            class29.field132[220] = 74;
            class29.field132[221] = 43;
            class29.field132[222] = 59;
            class29.field132[223] = 28;
        }
        field196.method358(this.field181);
    }

    @ObfuscatedName("ba.ah(I)V")
    public final void method482() {
        field196.method335();
    }

    @ObfuscatedName("ba.ap(Lbx;II)V")
    public void method483(class30 arg0, int arg1) {
        field196.method354(arg0, arg1);
    }

    @ObfuscatedName("ba.ab(I)V")
    public final void method484() {
        Canvas var1 = this.field181;
        var1.addMouseListener(class36.field202);
        var1.addMouseMotionListener(class36.field202);
        var1.addFocusListener(class36.field202);
    }

    @ObfuscatedName("ba.az(I)V")
    public final void method485() {
        Container var1 = this.method626();
        if (var1 == null) {
            return;
        }
        class423 var2 = this.method512();
        this.field176 = Math.max(var2.field4711, this.field186);
        this.field177 = Math.max(var2.field4713, this.field165);
        if (this.field176 <= 0) {
            this.field176 = 1;
        }
        if (this.field177 <= 0) {
            this.field177 = 1;
        }
        Statics.field1721 = Math.min(this.field176, this.field182);
        Statics.field1500 = Math.min(this.field177, this.field183);
        this.field178 = (this.field176 - Statics.field1721) / 2;
        this.field195 = 0;
        this.field181.setSize(Statics.field1721, Statics.field1500);
        Statics.field3281 = new class33(Statics.field1721, Statics.field1500, this.field181, this.field173);
        if (this.field185 == var1) {
            Insets var3 = this.field185.getInsets();
            this.field181.setLocation(this.field178 + var3.left, this.field195 + var3.top);
        } else {
            this.field181.setLocation(this.field178, this.field195);
        }
        this.field187 = true;
        this.method486();
    }

    @ObfuscatedName("ba.ai(I)V")
    public void method539() {
        int var1 = this.field178;
        int var2 = this.field195;
        int var3 = this.field176 - Statics.field1721 - var1;
        int var4 = this.field177 - Statics.field1500 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method626();
            int var6 = 0;
            int var7 = 0;
            if (this.field185 == var5) {
                Insets var8 = this.field185.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field177);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field176, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field176 + var6 - var3, var7, var3, this.field177);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field177 + var7 - var4, this.field176, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ba.ao(I)V")
    public final void method498() {
        field196.method334(this.field181);
        Canvas var1 = this.field181;
        var1.removeMouseListener(class36.field202);
        var1.removeMouseMotionListener(class36.field202);
        var1.removeFocusListener(class36.field202);
        class36.field204 = 0;
        if (this.field171 != null) {
            this.field171.method296(this.field181);
        }
        this.method489();
        field196.method358(this.field181);
        Canvas var2 = this.field181;
        var2.addMouseListener(class36.field202);
        var2.addMouseMotionListener(class36.field202);
        var2.addFocusListener(class36.field202);
        if (this.field171 != null) {
            this.field171.method297(this.field181);
        }
        this.method592();
    }

    @ObfuscatedName("ba.as(IIIII)V")
    public final void method533(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field175 != null) {
                field179++;
                if (field179 >= 3) {
                    this.method624("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field175 = this;
            Statics.field1721 = arg0;
            Statics.field1500 = arg1;
            Statics.field4876 = arg2;
            Statics.field3215 = arg3;
            Statics.field5583 = this;
            if (Statics.field170 == null) {
                Statics.field170 = new class219();
            }
            Statics.field170.method4099(this, 1);
        } catch (Exception var6) {
            class577.method3409((String) null, var6);
            this.method624("crash");
        }
    }

    @ObfuscatedName("ba.ay(I)V")
    public final synchronized void method489() {
        Container var1 = this.method626();
        if (this.field181 != null) {
            this.field181.removeFocusListener(this);
            var1.remove(this.field181);
        }
        Statics.field1721 = Math.max(var1.getWidth(), this.field186);
        Statics.field1500 = Math.max(var1.getHeight(), this.field165);
        if (this.field185 != null) {
            Insets var2 = this.field185.getInsets();
            Statics.field1721 -= var2.right + var2.left;
            Statics.field1500 -= var2.top + var2.bottom;
        }
        this.field181 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field181);
        this.field181.setSize(Statics.field1721, Statics.field1500);
        this.field181.setVisible(true);
        this.field181.setBackground(Color.BLACK);
        if (this.field185 == var1) {
            Insets var3 = this.field185.getInsets();
            this.field181.setLocation(this.field178 + var3.left, this.field195 + var3.top);
        } else {
            this.field181.setLocation(this.field178, this.field195);
        }
        this.field181.addFocusListener(this);
        this.field181.requestFocus();
        this.field187 = true;
        if (Statics.field3281 != null && Statics.field1721 == Statics.field3281.field5492 && Statics.field1500 == Statics.field3281.field5493) {
            ((class33) Statics.field3281).method454(this.field181);
            Statics.field3281.method463(0, 0);
        } else {
            Statics.field3281 = new class33(Statics.field1721, Statics.field1500, this.field181, this.field173);
        }
        this.field190 = false;
        this.field180 = class331.method3482();
    }

    @ObfuscatedName("ba.aj(ZI)V")
    public void method490(boolean arg0) {
        if (this.field173 != arg0) {
            this.field173 = arg0;
            Statics.field3281.method9378(arg0);
            Statics.field3281.method9375();
        }
    }

    @ObfuscatedName("ba.av(I)Z")
    public final boolean method501() {
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
                this.method624("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2378 != null) {
                String var1 = Statics.field2378.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2372;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method624("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class419.method2557(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class419.method4011(var4) && class419.method4086(var4) < 10) {
                            this.method624("wrongjava");
                            return;
                        }
                    }
                    field164 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method489();
            this.method528();
            class232 var5;
            try {
                var5 = new class215();
            } catch (Throwable var9) {
                var5 = new class224();
            }
            Statics.field3774 = var5;
            while (field166 == 0L || class331.method3482() < field166) {
                Statics.field169 = Statics.field3774.method4014(field191, field164);
                for (int var7 = 0; var7 < Statics.field169; var7++) {
                    this.method492();
                }
                this.method605();
                this.method476(this.field181);
            }
        } catch (Exception var10) {
            class577.method3409((String) null, var10);
            this.method624("crash");
        }
        this.method496();
    }

    @ObfuscatedName("ba.aw(I)V")
    public void method492() {
        long var1 = class331.method3482();
        long var3 = field193[Statics.field3814];
        field193[Statics.field3814] = var1;
        Statics.field3814 = Statics.field3814 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field1877 = field192;
        }
        this.method505();
    }

    @ObfuscatedName("ba.an(B)V")
    public final void method500() {
        this.field187 = true;
    }

    @ObfuscatedName("ba.ak(I)V")
    public void method605() {
        Container var1 = this.method626();
        long var2 = class331.method3482();
        long var4 = field174[Statics.field4994];
        field174[Statics.field4994] = var2;
        Statics.field4994 = Statics.field4994 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field172 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field188 - 1 > 50) {
            field188 -= 50;
            this.field187 = true;
            this.field181.setSize(Statics.field1721, Statics.field1500);
            this.field181.setVisible(true);
            if (this.field185 == var1) {
                Insets var7 = this.field185.getInsets();
                this.field181.setLocation(this.field178 + var7.left, this.field195 + var7.top);
            } else {
                this.field181.setLocation(this.field178, this.field195);
            }
        }
        if (this.field190) {
            this.method498();
        }
        this.method494();
        this.method506(this.field187);
        if (this.field187) {
            this.method539();
        }
        this.field187 = false;
    }

    @ObfuscatedName("ba.bn(B)V")
    public final void method494() {
        class423 var1 = this.method512();
        if (this.field176 != var1.field4711 || this.field177 != var1.field4713 || this.field189) {
            this.method485();
            this.field189 = false;
        }
    }

    @ObfuscatedName("ba.bh(B)V")
    public final void method592() {
        this.field189 = true;
    }

    @ObfuscatedName("ba.bd(I)V")
    public final synchronized void method496() {
        if (field167) {
            return;
        }
        field167 = true;
        try {
            this.field181.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method507();
        } catch (Exception var7) {
        }
        if (this.field185 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field170 != null) {
            try {
                Statics.field170.method4098();
            } catch (Exception var5) {
            }
        }
        this.method514();
    }

    @ObfuscatedName("hr.bx(I)V")
    public static final void method3530() {
        Statics.field3774.method4018();
        for (int var0 = 0; var0 < 32; var0++) {
            field174[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field193[var1] = 0L;
        }
        Statics.field169 = 0;
    }

    public final void start() {
        if (field175 == this && !field167) {
            field166 = 0L;
        }
    }

    public final void stop() {
        if (field175 == this && !field167) {
            field166 = class331.method3482() + 4000L;
        }
    }

    public final void destroy() {
        if (field175 == this && !field167) {
            field166 = class331.method3482();
            class332.method4128(5000L);
            this.method496();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field175 != this || field167) {
            return;
        }
        this.field187 = true;
        if (class331.method3482() - this.field180 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1721 && var2.height >= Statics.field1500) {
                this.field190 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field192 = true;
        this.field187 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field192 = false;
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

    @ObfuscatedName("ba.bb(ILjava/lang/String;ZZI)V")
    public final void method508(int arg0, String arg1, boolean arg2, boolean arg3) {
        try {
            Graphics var5 = this.field181.getGraphics();
            if (Statics.field1473 == null) {
                Statics.field1473 = new Font("Helvetica", 1, 13);
                Statics.field1612 = this.field181.getFontMetrics(Statics.field1473);
            }
            if (arg2 && !arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, Statics.field1721, Statics.field1500);
            }
            Color var6 = new Color(140, 17, 17);
            try {
                if (Statics.field1833 == null) {
                    Statics.field1833 = this.field181.createImage(304, 34);
                }
                Graphics var7 = Statics.field1833.getGraphics();
                var7.setColor(var6);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var7.setFont(Statics.field1473);
                var7.setColor(Color.white);
                var7.drawString(arg1, (304 - Statics.field1612.stringWidth(arg1)) / 2, 22);
                var5.drawImage(Statics.field1833, Statics.field1721 / 2 - 152, Statics.field1500 / 2 + (arg3 ? 50 : -18), (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = Statics.field1721 / 2 - 152;
                int var10 = Statics.field1500 / 2 - 18;
                var5.setColor(var6);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1473);
                var5.setColor(Color.white);
                var5.drawString(arg1, var9 + (304 - Statics.field1612.stringWidth(arg1)) / 2, var10 + 22);
            }
        } catch (Exception var13) {
            this.field181.repaint();
        }
    }

    @ObfuscatedName("ba.bi(B)V")
    public final void method550() {
        Statics.field1833 = null;
        Statics.field1473 = null;
        Statics.field1612 = null;
    }

    @ObfuscatedName("ba.bg(Ljava/lang/String;I)V")
    public void method624(String arg0) {
        if (this.field168) {
            return;
        }
        this.field168 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ba.bl(I)Ljava/awt/Container;")
    public Container method626() {
        return this.field185 == null ? this : this.field185;
    }

    @ObfuscatedName("ba.bz(I)Lqy;")
    public class423 method512() {
        Container var1 = this.method626();
        int var2 = Math.max(var1.getWidth(), this.field186);
        int var3 = Math.max(var1.getHeight(), this.field165);
        if (this.field185 != null) {
            Insets var4 = this.field185.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class423(var2, var3);
    }

    @ObfuscatedName("ba.bu(B)Z")
    public final boolean method509() {
        return this.field185 != null;
    }

    @ObfuscatedName("tm.br(I)I")
    public static int method8354() {
        int var0 = 0;
        if (Statics.field1122 == null || !Statics.field1122.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1122 = var2;
                        field198 = -1L;
                        field197 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1122 != null) {
            long var4 = class331.method3482();
            long var6 = Statics.field1122.getCollectionTime();
            if (field197 != -1L) {
                long var8 = var6 - field197;
                long var10 = var4 - field198;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field197 = var6;
            field198 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ba.aa(I)V")
    public abstract void method486();

    public abstract void init();

    @ObfuscatedName("ba.bj(I)V")
    public abstract void method505();

    @ObfuscatedName("ba.bp(ZI)V")
    public abstract void method506(boolean arg0);

    @ObfuscatedName("ba.by(I)V")
    public abstract void method507();

    @ObfuscatedName("ba.bo(I)V")
    public abstract void method514();

    @ObfuscatedName("ba.bf(I)V")
    public abstract void method528();
}
