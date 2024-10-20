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

@ObfuscatedName("ai")
public abstract class class32 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ai.s")
    public static class32 field169 = null;

    @ObfuscatedName("ai.a")
    public static int field168 = 0;

    @ObfuscatedName("ai.o")
    public static long field171 = 0L;

    @ObfuscatedName("ai.g")
    public static boolean field172 = false;

    @ObfuscatedName("ai.e")
    public boolean field173 = false;

    @ObfuscatedName("ai.j")
    public static int field202 = 20;

    @ObfuscatedName("ai.b")
    public static int field195 = 1;

    @ObfuscatedName("ai.k")
    public static int field176 = 0;

    @ObfuscatedName("ai.u")
    public static long[] field177 = new long[32];

    @ObfuscatedName("ai.z")
    public static long[] field178 = new long[32];

    @ObfuscatedName("ai.d")
    public int field201;

    @ObfuscatedName("ai.r")
    public int field181;

    @ObfuscatedName("ai.m")
    public int field180 = 0;

    @ObfuscatedName("ai.c")
    public int field183 = 0;

    @ObfuscatedName("ai.v")
    public int field185;

    @ObfuscatedName("ai.ag")
    public int field186;

    @ObfuscatedName("ai.ae")
    public int field187;

    @ObfuscatedName("ai.aq")
    public int field175;

    @ObfuscatedName("ai.ai")
    public Frame field174;

    @ObfuscatedName("ai.ah")
    public Canvas field189;

    @ObfuscatedName("ai.as")
    public volatile boolean field191 = true;

    @ObfuscatedName("ai.az")
    public static int field192 = 500;

    @ObfuscatedName("ai.ac")
    public boolean field193 = false;

    @ObfuscatedName("ai.ak")
    public volatile boolean field194 = false;

    @ObfuscatedName("ai.ab")
    public volatile long field196 = 0L;

    @ObfuscatedName("ai.an")
    public class23 field190;

    @ObfuscatedName("ai.ax")
    public Clipboard field197;

    @ObfuscatedName("ai.av")
    public final EventQueue field198;

    @ObfuscatedName("ai.ap")
    public static volatile boolean field199 = true;

    @ObfuscatedName("ai.af")
    public static long field200 = -1L;

    @ObfuscatedName("ai.aw")
    public static long field188 = -1L;

    public class32() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field198 = var1;
        class25 var3 = new class25();
        Statics.field994 = var3;
    }

    @ObfuscatedName("ai.o(III)V")
    public final void method526(int arg0, int arg1) {
        if (this.field187 != arg0 || this.field175 != arg1) {
            this.method525();
        }
        this.field187 = arg0;
        this.field175 = arg1;
    }

    @ObfuscatedName("ai.g(Ljava/lang/Object;I)V")
    public final void method427(Object arg0) {
        if (this.field198 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field198.peekEvent() != null; var2++) {
            class399.method2872(1L);
        }
        if (arg0 != null) {
            this.field198.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ai.e(B)Leg;")
    public class145 method449() {
        if (this.field190 == null) {
            this.field190 = new class23();
            this.field190.method306(this.field189);
        }
        return this.field190;
    }

    @ObfuscatedName("ai.p(I)V")
    public void method503() {
        this.field197 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ai.j(Ljava/lang/String;B)V")
    public void method476(String arg0) {
        this.field197.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ai.b(I)V")
    public final void method553() {
        if (Statics.field1544.toLowerCase().indexOf("microsoft") == -1) {
            class24.field133[44] = 71;
            class24.field133[45] = 26;
            class24.field133[46] = 72;
            class24.field133[47] = 73;
            class24.field133[59] = 57;
            class24.field133[61] = 27;
            class24.field133[91] = 42;
            class24.field133[92] = 74;
            class24.field133[93] = 43;
            class24.field133[192] = 28;
            class24.field133[222] = 58;
            class24.field133[520] = 59;
        } else {
            class24.field133[186] = 57;
            class24.field133[187] = 27;
            class24.field133[188] = 71;
            class24.field133[189] = 26;
            class24.field133[190] = 72;
            class24.field133[191] = 73;
            class24.field133[192] = 58;
            class24.field133[219] = 42;
            class24.field133[220] = 74;
            class24.field133[221] = 43;
            class24.field133[222] = 59;
            class24.field133[223] = 28;
        }
        Canvas var1 = this.field189;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class24.field122);
        var1.addFocusListener(class24.field122);
    }

    @ObfuscatedName("ai.x(I)V")
    public final void method432() {
        Canvas var1 = this.field189;
        var1.addMouseListener(class33.field205);
        var1.addMouseMotionListener(class33.field205);
        var1.addFocusListener(class33.field205);
    }

    @ObfuscatedName("ai.y(B)V")
    public final void method484() {
        Container var1 = this.method453();
        if (var1 == null) {
            return;
        }
        class351 var2 = this.method537();
        this.field201 = Math.max(var2.field4022, this.field185);
        this.field181 = Math.max(var2.field4020, this.field186);
        if (this.field201 <= 0) {
            this.field201 = 1;
        }
        if (this.field181 <= 0) {
            this.field181 = 1;
        }
        Statics.field184 = Math.min(this.field201, this.field187);
        Statics.field137 = Math.min(this.field181, this.field175);
        this.field180 = (this.field201 - Statics.field184) / 2;
        this.field183 = 0;
        this.field189.setSize(Statics.field184, Statics.field137);
        Statics.field146 = new class31(Statics.field184, Statics.field137, this.field189);
        if (this.field174 == var1) {
            Insets var3 = this.field174.getInsets();
            this.field189.setLocation(this.field180 + var3.left, this.field183 + var3.top);
        } else {
            this.field189.setLocation(this.field180, this.field183);
        }
        this.field191 = true;
        this.method556();
    }

    @ObfuscatedName("ai.t(B)V")
    public void method434() {
        int var1 = this.field180;
        int var2 = this.field183;
        int var3 = this.field201 - Statics.field184 - var1;
        int var4 = this.field181 - Statics.field137 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method453();
            int var6 = 0;
            int var7 = 0;
            if (this.field174 == var5) {
                Insets var8 = this.field174.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field181);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field201, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field201 + var6 - var3, var7, var3, this.field181);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field181 + var7 - var4, this.field201, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ai.l(I)V")
    public final void method435() {
        Canvas var1 = this.field189;
        var1.removeKeyListener(class24.field122);
        var1.removeFocusListener(class24.field122);
        class24.field123 = -1;
        Statics.method4962(this.field189);
        if (this.field190 != null) {
            this.field190.method313(this.field189);
        }
        this.method437();
        Canvas var2 = this.field189;
        var2.setFocusTraversalKeysEnabled(false);
        var2.addKeyListener(class24.field122);
        var2.addFocusListener(class24.field122);
        Canvas var3 = this.field189;
        var3.addMouseListener(class33.field205);
        var3.addMouseMotionListener(class33.field205);
        var3.addFocusListener(class33.field205);
        if (this.field190 != null) {
            this.field190.method306(this.field189);
        }
        this.method525();
    }

    @ObfuscatedName("ai.u(IIII)V")
    public final void method436(int arg0, int arg1, int arg2) {
        try {
            if (field169 != null) {
                field168++;
                if (field168 >= 3) {
                    this.method459("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field169 = this;
            Statics.field184 = arg0;
            Statics.field137 = arg1;
            Statics.field4440 = arg2;
            Statics.field4443 = this;
            if (Statics.field182 == null) {
                Statics.field182 = new class143();
            }
            Statics.field182.method2570(this, 1);
        } catch (Exception var5) {
            class425.method2652((String) null, var5);
            this.method459("crash");
        }
    }

    @ObfuscatedName("ai.n(B)V")
    public final synchronized void method437() {
        Container var1 = this.method453();
        if (this.field189 != null) {
            this.field189.removeFocusListener(this);
            var1.remove(this.field189);
        }
        Statics.field184 = Math.max(var1.getWidth(), this.field185);
        Statics.field137 = Math.max(var1.getHeight(), this.field186);
        if (this.field174 != null) {
            Insets var2 = this.field174.getInsets();
            Statics.field184 -= var2.right + var2.left;
            Statics.field137 -= var2.top + var2.bottom;
        }
        this.field189 = new class26(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field189);
        this.field189.setSize(Statics.field184, Statics.field137);
        this.field189.setVisible(true);
        this.field189.setBackground(Color.BLACK);
        if (this.field174 == var1) {
            Insets var3 = this.field174.getInsets();
            this.field189.setLocation(this.field180 + var3.left, this.field183 + var3.top);
        } else {
            this.field189.setLocation(this.field180, this.field183);
        }
        this.field189.addFocusListener(this);
        this.field189.requestFocus();
        this.field191 = true;
        if (Statics.field146 != null && Statics.field184 == Statics.field146.field4374 && Statics.field137 == Statics.field146.field4375) {
            ((class31) Statics.field146).method411(this.field189);
            Statics.field146.method409(0, 0);
        } else {
            Statics.field146 = new class31(Statics.field184, Statics.field137, this.field189);
        }
        this.field194 = false;
        this.field196 = class398.method2381();
    }

    @ObfuscatedName("ai.z(I)Z")
    public final boolean method428() {
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
                this.method459("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1544 != null) {
                String var1 = Statics.field1544.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field3735;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method459("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class319.method2404(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class319.method2505(var4) && class319.method2587(var4) < 10) {
                            this.method459("wrongjava");
                            return;
                        }
                    }
                    field195 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method437();
            this.method454();
            class150 var5;
            try {
                var5 = new class142();
            } catch (Throwable var9) {
                var5 = new class148();
            }
            Statics.field1598 = var5;
            while (field171 == 0L || class398.method2381() < field171) {
                Statics.field6 = Statics.field1598.method2562(field202, field195);
                for (int var7 = 0; var7 < Statics.field6; var7++) {
                    this.method439();
                }
                this.method440();
                this.method427(this.field189);
            }
        } catch (Exception var10) {
            class425.method2652((String) null, var10);
            this.method459("crash");
        }
        this.method450();
    }

    @ObfuscatedName("ai.q(I)V")
    public void method439() {
        long var1 = class398.method2381();
        long var3 = field178[Statics.field179];
        field178[Statics.field179] = var1;
        Statics.field179 = Statics.field179 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2139 = field199;
        }
        this.method455();
    }

    @ObfuscatedName("ai.d(I)V")
    public void method440() {
        Container var1 = this.method453();
        long var2 = class398.method2381();
        long var4 = field177[Statics.field4058];
        field177[Statics.field4058] = var2;
        Statics.field4058 = Statics.field4058 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field176 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field192 - 1 > 50) {
            field192 -= 50;
            this.field191 = true;
            this.field189.setSize(Statics.field184, Statics.field137);
            this.field189.setVisible(true);
            if (this.field174 == var1) {
                Insets var7 = this.field174.getInsets();
                this.field189.setLocation(this.field180 + var7.left, this.field183 + var7.top);
            } else {
                this.field189.setLocation(this.field180, this.field183);
            }
        }
        if (this.field194) {
            this.method435();
        }
        this.method441();
        this.method456(this.field191);
        if (this.field191) {
            this.method434();
        }
        this.field191 = false;
    }

    @ObfuscatedName("ai.r(I)V")
    public final void method441() {
        class351 var1 = this.method537();
        if (this.field201 != var1.field4022 || this.field181 != var1.field4020 || this.field193) {
            this.method484();
            this.field193 = false;
        }
    }

    @ObfuscatedName("ai.m(I)V")
    public final void method525() {
        this.field193 = true;
    }

    @ObfuscatedName("ai.c(I)V")
    public final synchronized void method450() {
        if (field172) {
            return;
        }
        field172 = true;
        try {
            this.field189.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method457();
        } catch (Exception var7) {
        }
        if (this.field174 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field182 != null) {
            try {
                Statics.field182.method2567();
            } catch (Exception var5) {
            }
        }
        this.method425();
    }

    public final void start() {
        if (field169 == this && !field172) {
            field171 = 0L;
        }
    }

    public final void stop() {
        if (field169 == this && !field172) {
            field171 = class398.method2381() + 4000L;
        }
    }

    public final void destroy() {
        if (field169 == this && !field172) {
            field171 = class398.method2381();
            class399.method2872(5000L);
            this.method450();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field169 != this || field172) {
            return;
        }
        this.field191 = true;
        if (class398.method2381() - this.field196 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field184 && var2.height >= Statics.field137) {
                this.field194 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field199 = true;
        this.field191 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field199 = false;
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

    @ObfuscatedName("ai.ae(ILjava/lang/String;ZI)V")
    public final void method512(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field189.getGraphics();
            if (Statics.field1370 == null) {
                Statics.field1370 = new Font("Helvetica", 1, 13);
                Statics.field157 = this.field189.getFontMetrics(Statics.field1370);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field184, Statics.field137);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field90 == null) {
                    Statics.field90 = this.field189.createImage(304, 34);
                }
                Graphics var6 = Statics.field90.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1370);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field157.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field90, Statics.field184 / 2 - 152, Statics.field137 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field184 / 2 - 152;
                int var9 = Statics.field137 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1370);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field157.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field189.repaint();
        }
    }

    @ObfuscatedName("ai.aq(I)V")
    public final void method500() {
        Statics.field90 = null;
        Statics.field1370 = null;
        Statics.field157 = null;
    }

    @ObfuscatedName("ai.al(Ljava/lang/String;I)V")
    public void method459(String arg0) {
        if (this.field173) {
            return;
        }
        this.field173 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ai.am(I)Ljava/awt/Container;")
    public Container method453() {
        return this.field174 == null ? this : this.field174;
    }

    @ObfuscatedName("ai.ai(I)Lmo;")
    public class351 method537() {
        Container var1 = this.method453();
        int var2 = Math.max(var1.getWidth(), this.field185);
        int var3 = Math.max(var1.getHeight(), this.field186);
        if (this.field174 != null) {
            Insets var4 = this.field174.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class351(var2, var3);
    }

    @ObfuscatedName("ai.ah(S)Z")
    public final boolean method462() {
        return this.field174 != null;
    }

    @ObfuscatedName("hw.as(I)I")
    public static int method4029() {
        int var0 = 0;
        if (Statics.field1196 == null || !Statics.field1196.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1196 = var2;
                        field188 = -1L;
                        field200 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1196 != null) {
            long var4 = class398.method2381();
            long var6 = Statics.field1196.getCollectionTime();
            if (field200 != -1L) {
                long var8 = var6 - field200;
                long var10 = var4 - field188;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field200 = var6;
            field188 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ai.at(B)V")
    public abstract void method425();

    public abstract void init();

    @ObfuscatedName("ai.f(I)V")
    public abstract void method454();

    @ObfuscatedName("ai.h(I)V")
    public abstract void method455();

    @ObfuscatedName("ai.v(ZI)V")
    public abstract void method456(boolean arg0);

    @ObfuscatedName("ai.ag(S)V")
    public abstract void method457();

    @ObfuscatedName("ai.k(I)V")
    public abstract void method556();
}
