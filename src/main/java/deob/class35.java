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

    @ObfuscatedName("bm.an")
    public static class35 field197 = null;

    @ObfuscatedName("bm.aw")
    public static int field198 = 0;

    @ObfuscatedName("bm.ac")
    public static long field227 = 0L;

    @ObfuscatedName("bm.au")
    public static boolean field223 = false;

    @ObfuscatedName("bm.ab")
    public boolean field200 = false;

    @ObfuscatedName("bm.al")
    public static int field202 = 20;

    @ObfuscatedName("bm.at")
    public static int field203 = 1;

    @ObfuscatedName("bm.aa")
    public static int field204 = 0;

    @ObfuscatedName("bm.ax")
    public static long[] field218 = new long[32];

    @ObfuscatedName("bm.ag")
    public static long[] field206 = new long[32];

    @ObfuscatedName("bm.av")
    public int field207;

    @ObfuscatedName("bm.ar")
    public int field209;

    @ObfuscatedName("bm.am")
    public int field225 = 0;

    @ObfuscatedName("bm.as")
    public int field210 = 0;

    @ObfuscatedName("bm.az")
    public int field212;

    @ObfuscatedName("bm.ad")
    public int field213;

    @ObfuscatedName("bm.ae")
    public int field214;

    @ObfuscatedName("bm.ap")
    public int field199;

    @ObfuscatedName("bm.by")
    public boolean field216 = false;

    @ObfuscatedName("bm.be")
    public Frame field215;

    @ObfuscatedName("bm.bk")
    public Canvas field196;

    @ObfuscatedName("bm.bx")
    public volatile boolean field219 = true;

    @ObfuscatedName("bm.bz")
    public static int field220 = 500;

    @ObfuscatedName("bm.bm")
    public boolean field221 = false;

    @ObfuscatedName("bm.bd")
    public volatile boolean field222 = false;

    @ObfuscatedName("bm.bt")
    public volatile long field205 = 0L;

    @ObfuscatedName("bm.bs")
    public class22 field224;

    @ObfuscatedName("bm.br")
    public Clipboard field228;

    @ObfuscatedName("bm.bg")
    public final EventQueue field226;

    @ObfuscatedName("bm.bu")
    public static volatile boolean field208 = true;

    @ObfuscatedName("bm.bq")
    public static class26 field217 = new class26();

    @ObfuscatedName("bm.bv")
    public static long field229 = -1L;

    @ObfuscatedName("bm.bl")
    public static long field230 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field226 = var1;
        class23 var3 = new class23();
        Statics.field300 = var3;
    }

    @ObfuscatedName("bm.al(IIB)V")
    public final void method515(int arg0, int arg1) {
        if (this.field214 != arg0 || this.field199 != arg1) {
            this.method593();
        }
        this.field214 = arg0;
        this.field199 = arg1;
    }

    @ObfuscatedName("bm.at(Ljava/lang/Object;I)V")
    public final void method509(Object arg0) {
        if (this.field226 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field226.peekEvent() != null; var2++) {
            class295.method5489(1L);
        }
        if (arg0 != null) {
            this.field226.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bm.aa(I)Lgf;")
    public class171 method510() {
        if (this.field224 == null) {
            this.field224 = new class22();
            this.field224.method302(this.field196);
        }
        return this.field224;
    }

    @ObfuscatedName("bm.ay(I)V")
    public void method636() {
        this.field228 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bm.ao(Ljava/lang/String;B)V")
    public void method548(String arg0) {
        this.field228.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bm.ax(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method513() {
        return this.field228;
    }

    @ObfuscatedName("bm.ai(B)V")
    public final void method514() {
        class29.method3152();
        field217.method348(this.field196);
    }

    @ObfuscatedName("bm.ag(B)V")
    public final void method533() {
        field217.method350();
    }

    @ObfuscatedName("bm.ah(Lbe;IB)V")
    public void method516(class30 arg0, int arg1) {
        field217.method346(arg0, arg1);
    }

    @ObfuscatedName("bm.av(B)V")
    public final void method642() {
        class36.method7022(this.field196);
    }

    @ObfuscatedName("bm.ar(I)V")
    public final void method531() {
        Container var1 = this.method623();
        if (var1 == null) {
            return;
        }
        class421 var2 = this.method543();
        this.field207 = Math.max(var2.field4648, this.field212);
        this.field209 = Math.max(var2.field4651, this.field213);
        if (this.field207 <= 0) {
            this.field207 = 1;
        }
        if (this.field209 <= 0) {
            this.field209 = 1;
        }
        Statics.field211 = Math.min(this.field207, this.field214);
        Statics.field3026 = Math.min(this.field209, this.field199);
        this.field225 = (this.field207 - Statics.field211) / 2;
        this.field210 = 0;
        this.field196.setSize(Statics.field211, Statics.field3026);
        Statics.field2381 = new class33(Statics.field211, Statics.field3026, this.field196, this.field216);
        if (this.field215 == var1) {
            Insets var3 = this.field215.getInsets();
            this.field196.setLocation(this.field225 + var3.left, this.field210 + var3.top);
        } else {
            this.field196.setLocation(this.field225, this.field210);
        }
        this.field219 = true;
        this.method519();
    }

    @ObfuscatedName("bm.as(B)V")
    public void method676() {
        int var1 = this.field225;
        int var2 = this.field210;
        int var3 = this.field207 - Statics.field211 - var1;
        int var4 = this.field209 - Statics.field3026 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method623();
            int var6 = 0;
            int var7 = 0;
            if (this.field215 == var5) {
                Insets var8 = this.field215.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field209);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field207, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field207 + var6 - var3, var7, var3, this.field209);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field209 + var7 - var4, this.field207, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bm.aj(I)V")
    public final void method511() {
        field217.method363(this.field196);
        Canvas var1 = this.field196;
        var1.removeMouseListener(class36.field235);
        var1.removeMouseMotionListener(class36.field235);
        var1.removeFocusListener(class36.field235);
        class36.field237 = 0;
        if (this.field224 != null) {
            this.field224.method301(this.field196);
        }
        this.method523();
        field217.method348(this.field196);
        class36.method7022(this.field196);
        if (this.field224 != null) {
            this.field224.method302(this.field196);
        }
        this.method593();
    }

    @ObfuscatedName("bm.ak(IIIIB)V")
    public final void method605(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field197 != null) {
                field198++;
                if (field198 >= 3) {
                    this.method541("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field197 = this;
            Statics.field211 = arg0;
            Statics.field3026 = arg1;
            Statics.field5155 = arg2;
            Statics.field4732 = arg3;
            Statics.field1322 = this;
            if (Statics.field201 == null) {
                Statics.field201 = new class168();
            }
            Statics.field201.method3274(this, 1);
        } catch (Exception var6) {
            class516.method6950((String) null, var6);
            this.method541("crash");
        }
    }

    @ObfuscatedName("bm.az(I)V")
    public final synchronized void method523() {
        Container var1 = this.method623();
        if (this.field196 != null) {
            this.field196.removeFocusListener(this);
            var1.remove(this.field196);
        }
        Statics.field211 = Math.max(var1.getWidth(), this.field212);
        Statics.field3026 = Math.max(var1.getHeight(), this.field213);
        if (this.field215 != null) {
            Insets var2 = this.field215.getInsets();
            Statics.field211 -= var2.right + var2.left;
            Statics.field3026 -= var2.top + var2.bottom;
        }
        this.field196 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field196);
        this.field196.setSize(Statics.field211, Statics.field3026);
        this.field196.setVisible(true);
        this.field196.setBackground(Color.BLACK);
        if (this.field215 == var1) {
            Insets var3 = this.field215.getInsets();
            this.field196.setLocation(this.field225 + var3.left, this.field210 + var3.top);
        } else {
            this.field196.setLocation(this.field225, this.field210);
        }
        this.field196.addFocusListener(this);
        this.field196.requestFocus();
        this.field219 = true;
        if (Statics.field2381 != null && Statics.field211 == Statics.field2381.field5069 && Statics.field3026 == Statics.field2381.field5071) {
            ((class33) Statics.field2381).method475(this.field196);
            Statics.field2381.method476(0, 0);
        } else {
            Statics.field2381 = new class33(Statics.field211, Statics.field3026, this.field196, this.field216);
        }
        this.field222 = false;
        this.field205 = class294.method2504();
    }

    @ObfuscatedName("bm.ad(ZB)V")
    public void method524(boolean arg0) {
        if (this.field216 != arg0) {
            this.field216 = arg0;
            Statics.field2381.method8641(arg0);
            Statics.field2381.method8640();
        }
    }

    @ObfuscatedName("bm.ae(I)Z")
    public final boolean method525() {
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
                this.method541("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1817 != null) {
                String var1 = Statics.field1817.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1818;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method541("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class372.method3077(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class372.method4954(var4) && class372.method5157(var4) < 10) {
                            this.method541("wrongjava");
                            return;
                        }
                    }
                    field203 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method523();
            this.method542();
            Statics.field4547 = class179.method3073();
            while (field227 == 0L || class294.method2504() < field227) {
                Statics.field3738 = Statics.field4547.method3190(field202, field203);
                for (int var5 = 0; var5 < Statics.field3738; var5++) {
                    this.method526();
                }
                this.method535();
                this.method509(this.field196);
            }
        } catch (Exception var7) {
            class516.method6950((String) null, var7);
            this.method541("crash");
        }
        this.method540();
    }

    @ObfuscatedName("bm.ap(I)V")
    public void method526() {
        long var1 = class294.method2504();
        long var3 = field206[Statics.field3835];
        field206[Statics.field3835] = var1;
        Statics.field3835 = Statics.field3835 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3732 = field208;
        }
        this.method530();
    }

    @ObfuscatedName("bm.by(B)V")
    public void method535() {
        Container var1 = this.method623();
        long var2 = class294.method2504();
        long var4 = field218[Statics.field2521];
        field218[Statics.field2521] = var2;
        Statics.field2521 = Statics.field2521 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field204 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field220 - 1 > 50) {
            field220 -= 50;
            this.field219 = true;
            this.field196.setSize(Statics.field211, Statics.field3026);
            this.field196.setVisible(true);
            if (this.field215 == var1) {
                Insets var7 = this.field215.getInsets();
                this.field196.setLocation(this.field225 + var7.left, this.field210 + var7.top);
            } else {
                this.field196.setLocation(this.field225, this.field210);
            }
        }
        if (this.field222) {
            this.method511();
        }
        this.method528();
        this.method537(this.field219);
        if (this.field219) {
            this.method676();
        }
        this.field219 = false;
    }

    @ObfuscatedName("bm.bb(I)V")
    public final void method528() {
        class421 var1 = this.method543();
        if (this.field207 != var1.field4648 || this.field209 != var1.field4651 || this.field221) {
            this.method531();
            this.field221 = false;
        }
    }

    @ObfuscatedName("bm.bi(I)V")
    public final void method593() {
        this.field221 = true;
    }

    @ObfuscatedName("bm.be(I)V")
    public final synchronized void method540() {
        if (field223) {
            return;
        }
        field223 = true;
        try {
            this.field196.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method534();
        } catch (Exception var7) {
        }
        if (this.field215 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field201 != null) {
            try {
                Statics.field201.method3271();
            } catch (Exception var5) {
            }
        }
        this.method545();
    }

    public final void start() {
        if (field197 == this && !field223) {
            field227 = 0L;
        }
    }

    public final void stop() {
        if (field197 == this && !field223) {
            field227 = class294.method2504() + 4000L;
        }
    }

    public final void destroy() {
        if (field197 == this && !field223) {
            field227 = class294.method2504();
            class295.method5489(5000L);
            this.method540();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field197 != this || field223) {
            return;
        }
        this.field219 = true;
        if (class294.method2504() - this.field205 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field211 && var2.height >= Statics.field3026) {
                this.field222 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field208 = true;
        this.field219 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field208 = false;
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

    @ObfuscatedName("bm.bn(ILjava/lang/String;ZI)V")
    public final void method539(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field196.getGraphics();
            if (Statics.field2858 == null) {
                Statics.field2858 = new Font("Helvetica", 1, 13);
                Statics.field149 = this.field196.getFontMetrics(Statics.field2858);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field211, Statics.field3026);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1395 == null) {
                    Statics.field1395 = this.field196.createImage(304, 34);
                }
                Graphics var6 = Statics.field1395.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field2858);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field149.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1395, Statics.field211 / 2 - 152, Statics.field3026 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field211 / 2 - 152;
                int var9 = Statics.field3026 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field2858);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field149.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field196.repaint();
        }
    }

    @ObfuscatedName("bm.bs(I)V")
    public final void method637() {
        Statics.field1395 = null;
        Statics.field2858 = null;
        Statics.field149 = null;
    }

    @ObfuscatedName("bm.br(Ljava/lang/String;I)V")
    public void method541(String arg0) {
        if (this.field200) {
            return;
        }
        this.field200 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bm.bg(B)Ljava/awt/Container;")
    public Container method623() {
        return this.field215 == null ? this : this.field215;
    }

    @ObfuscatedName("bm.bu(I)Lqu;")
    public class421 method543() {
        Container var1 = this.method623();
        int var2 = Math.max(var1.getWidth(), this.field212);
        int var3 = Math.max(var1.getHeight(), this.field213);
        if (this.field215 != null) {
            Insets var4 = this.field215.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class421(var2, var3);
    }

    @ObfuscatedName("bm.bf(I)Z")
    public final boolean method661() {
        return this.field215 != null;
    }

    @ObfuscatedName("nl.bq(I)I")
    public static int method6162() {
        int var0 = 0;
        if (Statics.field3353 == null || !Statics.field3353.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field3353 = var2;
                        field230 = -1L;
                        field229 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field3353 != null) {
            long var4 = class294.method2504();
            long var6 = Statics.field3353.getCollectionTime();
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

    @ObfuscatedName("bm.am(B)V")
    public abstract void method519();

    @ObfuscatedName("bm.bd(I)V")
    public abstract void method530();

    @ObfuscatedName("bm.bj(I)V")
    public abstract void method534();

    public abstract void init();

    @ObfuscatedName("bm.bt(ZS)V")
    public abstract void method537(boolean arg0);

    @ObfuscatedName("bm.bm(B)V")
    public abstract void method542();

    @ObfuscatedName("bm.ba(I)V")
    public abstract void method545();
}
