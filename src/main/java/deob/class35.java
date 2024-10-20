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

@ObfuscatedName("bm")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bm.ae")
    public static class35 field212 = null;

    @ObfuscatedName("bm.ao")
    public static int field198 = 0;

    @ObfuscatedName("bm.at")
    public static long field224 = 0L;

    @ObfuscatedName("bm.ac")
    public static boolean field208 = false;

    @ObfuscatedName("bm.ai")
    public boolean field196 = false;

    @ObfuscatedName("bm.ap")
    public static int field203 = 20;

    @ObfuscatedName("bm.aa")
    public static int field204 = 1;

    @ObfuscatedName("bm.af")
    public static int field206 = 0;

    @ObfuscatedName("bm.al")
    public static long[] field199 = new long[32];

    @ObfuscatedName("bm.ar")
    public static long[] field207 = new long[32];

    @ObfuscatedName("bm.ag")
    public int field214;

    @ObfuscatedName("bm.am")
    public int field220;

    @ObfuscatedName("bm.ax")
    public int field210 = 0;

    @ObfuscatedName("bm.ah")
    public int field230 = 0;

    @ObfuscatedName("bm.aj")
    public int field197;

    @ObfuscatedName("bm.av")
    public int field213;

    @ObfuscatedName("bm.aw")
    public int field219;

    @ObfuscatedName("bm.ak")
    public int field215;

    @ObfuscatedName("bm.bh")
    public boolean field216 = false;

    @ObfuscatedName("bm.bv")
    public Frame field217;

    @ObfuscatedName("bm.bt")
    public Canvas field218;

    @ObfuscatedName("bm.bd")
    public volatile boolean field209 = true;

    @ObfuscatedName("bm.bs")
    public static int field221 = 500;

    @ObfuscatedName("bm.bm")
    public boolean field222 = false;

    @ObfuscatedName("bm.bf")
    public volatile boolean field205 = false;

    @ObfuscatedName("bm.bq")
    public volatile long field211 = 0L;

    @ObfuscatedName("bm.bp")
    public class22 field225;

    @ObfuscatedName("bm.bu")
    public Clipboard field226;

    @ObfuscatedName("bm.bo")
    public final EventQueue field227;

    @ObfuscatedName("bm.bb")
    public static volatile boolean field228 = true;

    @ObfuscatedName("bm.be")
    public static class26 field229 = new class26();

    @ObfuscatedName("bm.bz")
    public static long field200 = -1L;

    @ObfuscatedName("bm.bx")
    public static long field231 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field227 = var1;
        class23 var3 = new class23();
        Statics.field2474 = var3;
    }

    @ObfuscatedName("bm.at(III)V")
    public final void method488(int arg0, int arg1) {
        if (this.field219 != arg0 || this.field215 != arg1) {
            this.method515();
        }
        this.field219 = arg0;
        this.field215 = arg1;
    }

    @ObfuscatedName("bm.ac(Ljava/lang/Object;I)V")
    public final void method531(Object arg0) {
        if (this.field227 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field227.peekEvent() != null; var2++) {
            class303.method2265(1L);
        }
        if (arg0 != null) {
            this.field227.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bm.ai(B)Lgk;")
    public class175 method653() {
        if (this.field225 == null) {
            this.field225 = new class22();
            this.field225.method301(this.field218);
        }
        return this.field225;
    }

    @ObfuscatedName("bm.az(B)V")
    public void method491() {
        this.field226 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bm.ap(Ljava/lang/String;S)V")
    public void method492(String arg0) {
        this.field226.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bm.aa(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method493() {
        return this.field226;
    }

    @ObfuscatedName("bm.af(I)V")
    public final void method494() {
        if (Statics.field1854.toLowerCase().indexOf("microsoft") == -1) {
            class29.field159[44] = 71;
            class29.field159[45] = 26;
            class29.field159[46] = 72;
            class29.field159[47] = 73;
            class29.field159[59] = 57;
            class29.field159[61] = 27;
            class29.field159[91] = 42;
            class29.field159[92] = 74;
            class29.field159[93] = 43;
            class29.field159[192] = 28;
            class29.field159[222] = 58;
            class29.field159[520] = 59;
        } else {
            class29.field159[186] = 57;
            class29.field159[187] = 27;
            class29.field159[188] = 71;
            class29.field159[189] = 26;
            class29.field159[190] = 72;
            class29.field159[191] = 73;
            class29.field159[192] = 58;
            class29.field159[219] = 42;
            class29.field159[220] = 74;
            class29.field159[221] = 43;
            class29.field159[222] = 59;
            class29.field159[223] = 28;
        }
        field229.method337(this.field218);
    }

    @ObfuscatedName("bm.ad(B)V")
    public final void method495() {
        field229.method342();
    }

    @ObfuscatedName("bm.aq(Lbv;II)V")
    public void method646(class30 arg0, int arg1) {
        field229.method338(arg0, arg1);
    }

    @ObfuscatedName("bm.al(I)V")
    public final void method497() {
        Canvas var1 = this.field218;
        var1.addMouseListener(class36.field252);
        var1.addMouseMotionListener(class36.field252);
        var1.addFocusListener(class36.field252);
    }

    @ObfuscatedName("bm.an(B)V")
    public final void method498() {
        Container var1 = this.method524();
        if (var1 == null) {
            return;
        }
        class446 var2 = this.method525();
        this.field214 = Math.max(var2.field4719, this.field197);
        this.field220 = Math.max(var2.field4717, this.field213);
        if (this.field214 <= 0) {
            this.field214 = 1;
        }
        if (this.field220 <= 0) {
            this.field220 = 1;
        }
        Statics.field1450 = Math.min(this.field214, this.field219);
        Statics.field1890 = Math.min(this.field220, this.field215);
        this.field210 = (this.field214 - Statics.field1450) / 2;
        this.field230 = 0;
        this.field218.setSize(Statics.field1450, Statics.field1890);
        Statics.field1358 = new class33(Statics.field1450, Statics.field1890, this.field218, this.field216);
        if (this.field217 == var1) {
            Insets var3 = this.field217.getInsets();
            this.field218.setLocation(this.field210 + var3.left, this.field230 + var3.top);
        } else {
            this.field218.setLocation(this.field210, this.field230);
        }
        this.field209 = true;
        this.method499();
    }

    @ObfuscatedName("bm.ab(I)V")
    public void method575() {
        int var1 = this.field210;
        int var2 = this.field230;
        int var3 = this.field214 - Statics.field1450 - var1;
        int var4 = this.field220 - Statics.field1890 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method524();
            int var6 = 0;
            int var7 = 0;
            if (this.field217 == var5) {
                Insets var8 = this.field217.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field220);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field214, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field214 + var6 - var3, var7, var3, this.field220);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field220 + var7 - var4, this.field214, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bm.ag(S)V")
    public final void method583() {
        field229.method341(this.field218);
        Canvas var1 = this.field218;
        var1.removeMouseListener(class36.field252);
        var1.removeMouseMotionListener(class36.field252);
        var1.removeFocusListener(class36.field252);
        class36.field237 = 0;
        if (this.field225 != null) {
            this.field225.method303(this.field218);
        }
        this.method503();
        field229.method337(this.field218);
        Canvas var2 = this.field218;
        var2.addMouseListener(class36.field252);
        var2.addMouseMotionListener(class36.field252);
        var2.addFocusListener(class36.field252);
        if (this.field225 != null) {
            this.field225.method301(this.field218);
        }
        this.method515();
    }

    @ObfuscatedName("bm.am(IIIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field212 != null) {
                field198++;
                if (field198 >= 3) {
                    this.method521("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field212 = this;
            Statics.field1450 = arg0;
            Statics.field1890 = arg1;
            Statics.field5271 = arg2;
            Statics.field5267 = arg3;
            Statics.field5265 = this;
            if (Statics.field201 == null) {
                Statics.field201 = new class172();
            }
            Statics.field201.method3205(this, 1);
        } catch (Exception var6) {
            Statics.method2661((String) null, var6);
            this.method521("crash");
        }
    }

    @ObfuscatedName("bm.ax(B)V")
    public final synchronized void method503() {
        Container var1 = this.method524();
        if (this.field218 != null) {
            this.field218.removeFocusListener(this);
            var1.remove(this.field218);
        }
        Statics.field1450 = Math.max(var1.getWidth(), this.field197);
        Statics.field1890 = Math.max(var1.getHeight(), this.field213);
        if (this.field217 != null) {
            Insets var2 = this.field217.getInsets();
            Statics.field1450 -= var2.right + var2.left;
            Statics.field1890 -= var2.top + var2.bottom;
        }
        this.field218 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field218);
        this.field218.setSize(Statics.field1450, Statics.field1890);
        this.field218.setVisible(true);
        this.field218.setBackground(Color.BLACK);
        if (this.field217 == var1) {
            Insets var3 = this.field217.getInsets();
            this.field218.setLocation(this.field210 + var3.left, this.field230 + var3.top);
        } else {
            this.field218.setLocation(this.field210, this.field230);
        }
        this.field218.addFocusListener(this);
        this.field218.requestFocus();
        this.field209 = true;
        if (Statics.field1358 != null && Statics.field1450 == Statics.field1358.field5190 && Statics.field1890 == Statics.field1358.field5192) {
            ((class33) Statics.field1358).method463(this.field218);
            Statics.field1358.method472(0, 0);
        } else {
            Statics.field1358 = new class33(Statics.field1450, Statics.field1890, this.field218, this.field216);
        }
        this.field205 = false;
        this.field211 = class302.method655();
    }

    @ObfuscatedName("bm.ah(ZI)V")
    public void method504(boolean arg0) {
        if (this.field216 != arg0) {
            this.field216 = arg0;
            Statics.field1358.method8687(arg0);
            Statics.field1358.method8690();
        }
    }

    @ObfuscatedName("bm.as(I)Z")
    public final boolean method542() {
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
                this.method521("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1854 != null) {
                String var1 = Statics.field1854.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1370;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method521("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && Statics.method5838(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class387.method3929(var4) && class387.method2307(var4) < 10) {
                            this.method521("wrongjava");
                            return;
                        }
                    }
                    field204 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method503();
            this.method589();
            class183 var5;
            try {
                var5 = new class169();
            } catch (Throwable var9) {
                var5 = new class180();
            }
            Statics.field3798 = var5;
            while (field224 == 0L || class302.method655() < field224) {
                Statics.field202 = Statics.field3798.method3105(field203, field204);
                for (int var7 = 0; var7 < Statics.field202; var7++) {
                    this.method507();
                }
                this.method509();
                this.method531(this.field218);
            }
        } catch (Exception var10) {
            Statics.method2661((String) null, var10);
            this.method521("crash");
        }
        this.method512();
    }

    @ObfuscatedName("bm.ay(I)V")
    public void method507() {
        long var1 = class302.method655();
        long var3 = field207[Statics.field1425];
        field207[Statics.field1425] = var1;
        Statics.field1425 = Statics.field1425 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field4372 = field228;
        }
        this.method592();
    }

    @ObfuscatedName("bm.aj(I)V")
    public final void method508() {
        this.field209 = true;
    }

    @ObfuscatedName("bm.av(I)V")
    public void method509() {
        Container var1 = this.method524();
        long var2 = class302.method655();
        long var4 = field199[Statics.field2139];
        field199[Statics.field2139] = var2;
        Statics.field2139 = Statics.field2139 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field206 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field221 - 1 > 50) {
            field221 -= 50;
            this.field209 = true;
            this.field218.setSize(Statics.field1450, Statics.field1890);
            this.field218.setVisible(true);
            if (this.field217 == var1) {
                Insets var7 = this.field217.getInsets();
                this.field218.setLocation(this.field210 + var7.left, this.field230 + var7.top);
            } else {
                this.field218.setLocation(this.field210, this.field230);
            }
        }
        if (this.field205) {
            this.method583();
        }
        this.method510();
        this.method520(this.field209);
        if (this.field209) {
            this.method575();
        }
        this.field209 = false;
    }

    @ObfuscatedName("bm.aw(I)V")
    public final void method510() {
        class446 var1 = this.method525();
        if (this.field214 != var1.field4719 || this.field220 != var1.field4717 || this.field222) {
            this.method498();
            this.field222 = false;
        }
    }

    @ObfuscatedName("bm.ak(B)V")
    public final void method515() {
        this.field222 = true;
    }

    @ObfuscatedName("bm.bh(B)V")
    public final synchronized void method512() {
        if (field208) {
            return;
        }
        field208 = true;
        try {
            this.field218.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method489();
        } catch (Exception var7) {
        }
        if (this.field217 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field201 != null) {
            try {
                Statics.field201.method3208();
            } catch (Exception var5) {
            }
        }
        this.method527();
    }

    @ObfuscatedName("er.bj(I)V")
    public static final void method2676() {
        Statics.field3798.method3109();
        for (int var0 = 0; var0 < 32; var0++) {
            field199[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field207[var1] = 0L;
        }
        Statics.field202 = 0;
    }

    public final void start() {
        if (field212 == this && !field208) {
            field224 = 0L;
        }
    }

    public final void stop() {
        if (field212 == this && !field208) {
            field224 = class302.method655() + 4000L;
        }
    }

    public final void destroy() {
        if (field212 == this && !field208) {
            field224 = class302.method655();
            class303.method2265(5000L);
            this.method512();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field212 != this || field208) {
            return;
        }
        this.field209 = true;
        if (class302.method655() - this.field211 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1450 && var2.height >= Statics.field1890) {
                this.field205 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field228 = true;
        this.field209 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field228 = false;
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

    @ObfuscatedName("bm.bq(ILjava/lang/String;ZB)V")
    public final void method513(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field218.getGraphics();
            if (Statics.field873 == null) {
                Statics.field873 = new Font("Helvetica", 1, 13);
                Statics.field1077 = this.field218.getFontMetrics(Statics.field873);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field1450, Statics.field1890);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field223 == null) {
                    Statics.field223 = this.field218.createImage(304, 34);
                }
                Graphics var6 = Statics.field223.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field873);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1077.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field223, Statics.field1450 / 2 - 152, Statics.field1890 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field1450 / 2 - 152;
                int var9 = Statics.field1890 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field873);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1077.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field218.repaint();
        }
    }

    @ObfuscatedName("bm.ba(I)V")
    public final void method652() {
        Statics.field223 = null;
        Statics.field873 = null;
        Statics.field1077 = null;
    }

    @ObfuscatedName("bm.bl(Ljava/lang/String;I)V")
    public void method521(String arg0) {
        if (this.field196) {
            return;
        }
        this.field196 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bm.bp(I)Ljava/awt/Container;")
    public Container method524() {
        return this.field217 == null ? this : this.field217;
    }

    @ObfuscatedName("bm.bu(I)Lrb;")
    public class446 method525() {
        Container var1 = this.method524();
        int var2 = Math.max(var1.getWidth(), this.field197);
        int var3 = Math.max(var1.getHeight(), this.field213);
        if (this.field217 != null) {
            Insets var4 = this.field217.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class446(var2, var3);
    }

    @ObfuscatedName("bm.bo(I)Z")
    public final boolean method529() {
        return this.field217 != null;
    }

    @ObfuscatedName("jd.bb(I)I")
    public static int method4949() {
        int var0 = 0;
        if (Statics.field4707 == null || !Statics.field4707.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field4707 = var2;
                        field231 = -1L;
                        field200 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field4707 != null) {
            long var4 = class302.method655();
            long var6 = Statics.field4707.getCollectionTime();
            if (field200 != -1L) {
                long var8 = var6 - field200;
                long var10 = var4 - field231;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field200 = var6;
            field231 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bm.bf(I)V")
    public abstract void method489();

    @ObfuscatedName("bm.ar(B)V")
    public abstract void method499();

    public abstract void init();

    @ObfuscatedName("bm.bm(ZI)V")
    public abstract void method520(boolean arg0);

    @ObfuscatedName("bm.br(I)V")
    public abstract void method527();

    @ObfuscatedName("bm.by(I)V")
    public abstract void method589();

    @ObfuscatedName("bm.bs(I)V")
    public abstract void method592();
}
