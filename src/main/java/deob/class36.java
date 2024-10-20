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

@ObfuscatedName("ae")
public abstract class class36 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("ae.f")
    public static class36 field231 = null;

    @ObfuscatedName("ae.c")
    public static int field198 = 0;

    @ObfuscatedName("ae.h")
    public static long field196 = 0L;

    @ObfuscatedName("ae.j")
    public static boolean field200 = false;

    @ObfuscatedName("ae.d")
    public boolean field208 = false;

    @ObfuscatedName("ae.r")
    public static int field218 = 20;

    @ObfuscatedName("ae.l")
    public static int field203 = 1;

    @ObfuscatedName("ae.s")
    public static int field204 = 0;

    @ObfuscatedName("ae.o")
    public static long[] field206 = new long[32];

    @ObfuscatedName("ae.z")
    public static long[] field197 = new long[32];

    @ObfuscatedName("ae.m")
    public int field201;

    @ObfuscatedName("ae.q")
    public int field209;

    @ObfuscatedName("ae.i")
    public int field210 = 0;

    @ObfuscatedName("ae.e")
    public int field211 = 0;

    @ObfuscatedName("ae.v")
    public int field225;

    @ObfuscatedName("ae.aj")
    public int field214;

    @ObfuscatedName("ae.an")
    public int field215;

    @ObfuscatedName("ae.ah")
    public int field216;

    @ObfuscatedName("ae.af")
    public Frame field217;

    @ObfuscatedName("ae.ad")
    public Canvas field220;

    @ObfuscatedName("ae.av")
    public volatile boolean field219 = true;

    @ObfuscatedName("ae.ae")
    public static int field213 = 500;

    @ObfuscatedName("ae.ap")
    public boolean field221 = false;

    @ObfuscatedName("ae.as")
    public volatile boolean field222 = false;

    @ObfuscatedName("ae.aq")
    public volatile long field202 = 0L;

    @ObfuscatedName("ae.am")
    public class23 field224;

    @ObfuscatedName("ae.az")
    public Clipboard field212;

    @ObfuscatedName("ae.ab")
    public final EventQueue field226;

    @ObfuscatedName("ae.ai")
    public static volatile boolean field227 = true;

    @ObfuscatedName("ae.aw")
    public static class27 field228 = new class27();

    @ObfuscatedName("ae.ar")
    public static long field229 = -1L;

    @ObfuscatedName("ae.ay")
    public static long field230 = -1L;

    public class36() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field226 = var1;
        class44.method3659(new class24());
    }

    @ObfuscatedName("ae.n(III)V")
    public final void method571(int arg0, int arg1) {
        if (this.field215 != arg0 || this.field216 != arg1) {
            this.method649();
        }
        this.field215 = arg0;
        this.field216 = arg1;
    }

    @ObfuscatedName("ae.r(Ljava/lang/Object;B)V")
    public final void method572(Object arg0) {
        if (this.field226 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field226.peekEvent() != null; var2++) {
            class281.method3621(1L);
        }
        if (arg0 != null) {
            this.field226.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ae.l(I)Lfk;")
    public class166 method502() {
        if (this.field224 == null) {
            this.field224 = new class23();
            this.field224.method304(this.field220);
        }
        return this.field224;
    }

    @ObfuscatedName("ae.s(I)V")
    public void method503() {
        this.field212 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ae.p(Ljava/lang/String;I)V")
    public void method522(String arg0) {
        this.field212.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ae.b(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method505() {
        return this.field212;
    }

    @ObfuscatedName("ae.o(B)V")
    public final void method632() {
        if (Statics.field1789.toLowerCase().indexOf("microsoft") == -1) {
            class30.field157[44] = 71;
            class30.field157[45] = 26;
            class30.field157[46] = 72;
            class30.field157[47] = 73;
            class30.field157[59] = 57;
            class30.field157[61] = 27;
            class30.field157[91] = 42;
            class30.field157[92] = 74;
            class30.field157[93] = 43;
            class30.field157[192] = 28;
            class30.field157[222] = 58;
            class30.field157[520] = 59;
        } else {
            class30.field157[186] = 57;
            class30.field157[187] = 27;
            class30.field157[188] = 71;
            class30.field157[189] = 26;
            class30.field157[190] = 72;
            class30.field157[191] = 73;
            class30.field157[192] = 58;
            class30.field157[219] = 42;
            class30.field157[220] = 74;
            class30.field157[221] = 43;
            class30.field157[222] = 59;
            class30.field157[223] = 28;
        }
        field228.method349(this.field220);
    }

    @ObfuscatedName("ae.u(I)V")
    public final void method598() {
        field228.method351();
    }

    @ObfuscatedName("ae.z(Lac;IB)V")
    public void method508(class31 arg0, int arg1) {
        field228.method379(arg0, arg1);
    }

    @ObfuscatedName("ae.t(I)V")
    public final void method509() {
        Canvas var1 = this.field220;
        var1.addMouseListener(class37.field249);
        var1.addMouseMotionListener(class37.field249);
        var1.addFocusListener(class37.field249);
    }

    @ObfuscatedName("ae.w(I)V")
    public final void method510() {
        Container var1 = this.method533();
        if (var1 == null) {
            return;
        }
        class404 var2 = this.method534();
        this.field201 = Math.max(var2.field4549, this.field225);
        this.field209 = Math.max(var2.field4546, this.field214);
        if (this.field201 <= 0) {
            this.field201 = 1;
        }
        if (this.field209 <= 0) {
            this.field209 = 1;
        }
        Statics.field223 = Math.min(this.field201, this.field215);
        Statics.field59 = Math.min(this.field209, this.field216);
        this.field210 = (this.field201 - Statics.field223) / 2;
        this.field211 = 0;
        this.field220.setSize(Statics.field223, Statics.field59);
        Statics.field3 = new class34(Statics.field223, Statics.field59, this.field220);
        if (this.field217 == var1) {
            Insets var3 = this.field217.getInsets();
            this.field220.setLocation(this.field210 + var3.left, this.field211 + var3.top);
        } else {
            this.field220.setLocation(this.field210, this.field211);
        }
        this.field219 = true;
        this.method658();
    }

    @ObfuscatedName("ae.q(B)V")
    public void method631() {
        int var1 = this.field210;
        int var2 = this.field211;
        int var3 = this.field201 - Statics.field223 - var1;
        int var4 = this.field209 - Statics.field59 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method533();
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
                var9.fillRect(var6, var7, var1, this.field209);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field201, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field201 + var6 - var3, var7, var3, this.field209);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field209 + var7 - var4, this.field201, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ae.i(I)V")
    public final void method513() {
        field228.method350(this.field220);
        Canvas var1 = this.field220;
        var1.removeMouseListener(class37.field249);
        var1.removeMouseMotionListener(class37.field249);
        var1.removeFocusListener(class37.field249);
        class37.field248 = 0;
        if (this.field224 != null) {
            this.field224.method303(this.field220);
        }
        this.method500();
        field228.method349(this.field220);
        Canvas var2 = this.field220;
        var2.addMouseListener(class37.field249);
        var2.addMouseMotionListener(class37.field249);
        var2.addFocusListener(class37.field249);
        if (this.field224 != null) {
            this.field224.method304(this.field220);
        }
        this.method649();
    }

    @ObfuscatedName("ae.e(IIIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field231 != null) {
                field198++;
                if (field198 >= 3) {
                    this.method532("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field231 = this;
            Statics.field223 = arg0;
            Statics.field59 = arg1;
            Statics.field5021 = arg2;
            Statics.field5019 = arg3;
            Statics.field5024 = this;
            if (Statics.field199 == null) {
                Statics.field199 = new class164();
            }
            Statics.field199.method3064(this, 1);
        } catch (Exception var6) {
            class489.method7161((String) null, var6);
            this.method532("crash");
        }
    }

    @ObfuscatedName("ae.g(I)V")
    public final synchronized void method500() {
        Container var1 = this.method533();
        if (this.field220 != null) {
            this.field220.removeFocusListener(this);
            var1.remove(this.field220);
        }
        Statics.field223 = Math.max(var1.getWidth(), this.field225);
        Statics.field59 = Math.max(var1.getHeight(), this.field214);
        if (this.field217 != null) {
            Insets var2 = this.field217.getInsets();
            Statics.field223 -= var2.right + var2.left;
            Statics.field59 -= var2.top + var2.bottom;
        }
        this.field220 = new class25(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field220);
        this.field220.setSize(Statics.field223, Statics.field59);
        this.field220.setVisible(true);
        this.field220.setBackground(Color.BLACK);
        if (this.field217 == var1) {
            Insets var3 = this.field217.getInsets();
            this.field220.setLocation(this.field210 + var3.left, this.field211 + var3.top);
        } else {
            this.field220.setLocation(this.field210, this.field211);
        }
        this.field220.addFocusListener(this);
        this.field220.requestFocus();
        this.field219 = true;
        if (Statics.field3 != null && Statics.field223 == Statics.field3.field4943 && Statics.field59 == Statics.field3.field4941) {
            ((class34) Statics.field3).method483(this.field220);
            Statics.field3.method476(0, 0);
        } else {
            Statics.field3 = new class34(Statics.field223, Statics.field59, this.field220);
        }
        this.field222 = false;
        this.field202 = class280.method2629();
    }

    @ObfuscatedName("ae.k(I)Z")
    public final boolean method606() {
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
                this.method532("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1789 != null) {
                String var1 = Statics.field1789.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1782;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method532("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class358.method5949(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class358.method4635(var4) && class358.method2449(var4) < 10) {
                            this.method532("wrongjava");
                            return;
                        }
                    }
                    field203 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method500();
            this.method526();
            class174 var5;
            try {
                var5 = new class161();
            } catch (Throwable var9) {
                var5 = new class171();
            }
            Statics.field4316 = var5;
            while (field196 == 0L || class280.method2629() < field196) {
                Statics.field2360 = Statics.field4316.method2983(field218, field203);
                for (int var7 = 0; var7 < Statics.field2360; var7++) {
                    this.method540();
                }
                this.method518();
                this.method572(this.field220);
            }
        } catch (Exception var10) {
            class489.method7161((String) null, var10);
            this.method532("crash");
        }
        this.method573();
    }

    @ObfuscatedName("ae.v(B)V")
    public void method540() {
        long var1 = class280.method2629();
        long var3 = field197[Statics.field67];
        field197[Statics.field67] = var1;
        Statics.field67 = Statics.field67 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field986 = field227;
        }
        this.method527();
    }

    @ObfuscatedName("ae.aj(I)V")
    public void method518() {
        Container var1 = this.method533();
        long var2 = class280.method2629();
        long var4 = field206[Statics.field3744];
        field206[Statics.field3744] = var2;
        Statics.field3744 = Statics.field3744 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field204 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field213 - 1 > 50) {
            field213 -= 50;
            this.field219 = true;
            this.field220.setSize(Statics.field223, Statics.field59);
            this.field220.setVisible(true);
            if (this.field217 == var1) {
                Insets var7 = this.field217.getInsets();
                this.field220.setLocation(this.field210 + var7.left, this.field211 + var7.top);
            } else {
                this.field220.setLocation(this.field210, this.field211);
            }
        }
        if (this.field222) {
            this.method513();
        }
        this.method519();
        this.method525(this.field219);
        if (this.field219) {
            this.method631();
        }
        this.field219 = false;
    }

    @ObfuscatedName("ae.an(B)V")
    public final void method519() {
        class404 var1 = this.method534();
        if (this.field201 != var1.field4549 || this.field209 != var1.field4546 || this.field221) {
            this.method510();
            this.field221 = false;
        }
    }

    @ObfuscatedName("ae.ah(I)V")
    public final void method649() {
        this.field221 = true;
    }

    @ObfuscatedName("ae.ao(I)V")
    public final synchronized void method573() {
        if (field200) {
            return;
        }
        field200 = true;
        try {
            this.field220.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method514();
        } catch (Exception var7) {
        }
        if (this.field217 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field199 != null) {
            try {
                Statics.field199.method3054();
            } catch (Exception var5) {
            }
        }
        this.method512();
    }

    @ObfuscatedName("ma.ac(S)V")
    public static final void method6188() {
        Statics.field4316.method2982();
        for (int var0 = 0; var0 < 32; var0++) {
            field206[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field197[var1] = 0L;
        }
        Statics.field2360 = 0;
    }

    public final void start() {
        if (field231 == this && !field200) {
            field196 = 0L;
        }
    }

    public final void stop() {
        if (field231 == this && !field200) {
            field196 = class280.method2629() + 4000L;
        }
    }

    public final void destroy() {
        if (field231 == this && !field200) {
            field196 = class280.method2629();
            class281.method3621(5000L);
            this.method573();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field231 != this || field200) {
            return;
        }
        this.field219 = true;
        if (class280.method2629() - this.field202 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field223 && var2.height >= Statics.field59) {
                this.field222 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field227 = true;
        this.field219 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field227 = false;
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

    @ObfuscatedName("ae.ae(ILjava/lang/String;ZI)V")
    public final void method536(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field220.getGraphics();
            if (Statics.field1517 == null) {
                Statics.field1517 = new Font("Helvetica", 1, 13);
                Statics.field61 = this.field220.getFontMetrics(Statics.field1517);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field223, Statics.field59);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1296 == null) {
                    Statics.field1296 = this.field220.createImage(304, 34);
                }
                Graphics var6 = Statics.field1296.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field1517);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field61.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1296, Statics.field223 / 2 - 152, Statics.field59 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field223 / 2 - 152;
                int var9 = Statics.field59 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field1517);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field61.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field220.repaint();
        }
    }

    @ObfuscatedName("ae.ap(B)V")
    public final void method531() {
        Statics.field1296 = null;
        Statics.field1517 = null;
        Statics.field61 = null;
    }

    @ObfuscatedName("ae.az(Ljava/lang/String;S)V")
    public void method532(String arg0) {
        if (this.field208) {
            return;
        }
        this.field208 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ae.ab(B)Ljava/awt/Container;")
    public Container method533() {
        return this.field217 == null ? this : this.field217;
    }

    @ObfuscatedName("ae.ai(I)Loq;")
    public class404 method534() {
        Container var1 = this.method533();
        int var2 = Math.max(var1.getWidth(), this.field225);
        int var3 = Math.max(var1.getHeight(), this.field214);
        if (this.field217 != null) {
            Insets var4 = this.field217.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class404(var2, var3);
    }

    @ObfuscatedName("ae.au(I)Z")
    public final boolean method621() {
        return this.field217 != null;
    }

    @ObfuscatedName("iz.aw(I)I")
    public static int method4716() {
        int var0 = 0;
        if (Statics.field2724 == null || !Statics.field2724.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2724 = var2;
                        field230 = -1L;
                        field229 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2724 != null) {
            long var4 = class280.method2629();
            long var6 = Statics.field2724.getCollectionTime();
            if (field229 != -1L) {
                long var8 = var6 - field229;
                long var10 = var4 - field230;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field229 = var6;
            field230 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ae.at(I)V")
    public abstract void method512();

    @ObfuscatedName("ae.ak(S)V")
    public abstract void method514();

    @ObfuscatedName("ae.av(ZI)V")
    public abstract void method525(boolean arg0);

    public abstract void init();

    @ObfuscatedName("ae.af(I)V")
    public abstract void method526();

    @ObfuscatedName("ae.ad(I)V")
    public abstract void method527();

    @ObfuscatedName("ae.m(I)V")
    public abstract void method658();
}
