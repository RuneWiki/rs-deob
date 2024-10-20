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

@ObfuscatedName("bb")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bb.al")
    public static class35 field216 = null;

    @ObfuscatedName("bb.ak")
    public static int field192 = 0;

    @ObfuscatedName("bb.ax")
    public static long field193 = 0L;

    @ObfuscatedName("bb.ao")
    public static boolean field194 = false;

    @ObfuscatedName("bb.ah")
    public boolean field195 = false;

    @ObfuscatedName("bb.ab")
    public static int field196 = 20;

    @ObfuscatedName("bb.am")
    public static int field197 = 1;

    @ObfuscatedName("bb.av")
    public static int field198 = 0;

    @ObfuscatedName("bb.ap")
    public static long[] field204 = new long[32];

    @ObfuscatedName("bb.as")
    public static long[] field201 = new long[32];

    @ObfuscatedName("bb.an")
    public int field207;

    @ObfuscatedName("bb.au")
    public int field199;

    @ObfuscatedName("bb.ai")
    public int field224 = 0;

    @ObfuscatedName("bb.ae")
    public int field205 = 0;

    @ObfuscatedName("bb.az")
    public int field206;

    @ObfuscatedName("bb.at")
    public int field210;

    @ObfuscatedName("bb.af")
    public int field208;

    @ObfuscatedName("bb.ad")
    public int field202;

    @ObfuscatedName("bb.bn")
    public boolean field191 = false;

    @ObfuscatedName("bb.bd")
    public Frame field211;

    @ObfuscatedName("bb.be")
    public Canvas field212;

    @ObfuscatedName("bb.bv")
    public volatile boolean field213 = true;

    @ObfuscatedName("bb.bz")
    public static int field190 = 500;

    @ObfuscatedName("bb.bb")
    public boolean field215 = false;

    @ObfuscatedName("bb.bo")
    public volatile boolean field203 = false;

    @ObfuscatedName("bb.bp")
    public volatile long field200 = 0L;

    @ObfuscatedName("bb.br")
    public class22 field209;

    @ObfuscatedName("bb.bs")
    public Clipboard field219;

    @ObfuscatedName("bb.bc")
    public final EventQueue field220;

    @ObfuscatedName("bb.bu")
    public static volatile boolean field221 = true;

    @ObfuscatedName("bb.bh")
    public static class26 field222 = new class26();

    @ObfuscatedName("bb.bg")
    public static long field223 = -1L;

    @ObfuscatedName("bb.bj")
    public static long field217 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field220 = var1;
        class43.method6747(new class23());
    }

    @ObfuscatedName("bb.ar(IIB)V")
    public final void method472(int arg0, int arg1) {
        if (this.field208 != arg0 || this.field202 != arg1) {
            this.method493();
        }
        this.field208 = arg0;
        this.field202 = arg1;
    }

    @ObfuscatedName("bb.ab(Ljava/lang/Object;B)V")
    public final void method473(Object arg0) {
        if (this.field220 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field220.peekEvent() != null; var2++) {
            class317.method2610(1L);
        }
        if (arg0 != null) {
            this.field220.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bb.am(I)Lgc;")
    public class177 method500() {
        if (this.field209 == null) {
            this.field209 = new class22();
            this.field209.method291(this.field212);
        }
        return this.field209;
    }

    @ObfuscatedName("bb.av(I)V")
    public void method475() {
        this.field219 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bb.ag(Ljava/lang/String;I)V")
    public void method549(String arg0) {
        this.field219.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bb.aa(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method476() {
        return this.field219;
    }

    @ObfuscatedName("bb.ap(B)V")
    public final void method626() {
        class29.method4849();
        field222.method334(this.field212);
    }

    @ObfuscatedName("eu.ay(B)I")
    public static final int method2801() {
        return field222.method336();
    }

    @ObfuscatedName("bb.as(I)V")
    public final void method530() {
        field222.method339();
    }

    @ObfuscatedName("bb.aj(Lbd;IS)V")
    public void method479(class30 arg0, int arg1) {
        field222.method338(arg0, arg1);
    }

    @ObfuscatedName("bb.an(I)V")
    public final void method543() {
        class36.method2182(this.field212);
    }

    @ObfuscatedName("bb.au(I)V")
    public final void method481() {
        Container var1 = this.method507();
        if (var1 == null) {
            return;
        }
        class461 var2 = this.method508();
        this.field207 = Math.max(var2.field4763, this.field206);
        this.field199 = Math.max(var2.field4765, this.field210);
        if (this.field207 <= 0) {
            this.field207 = 1;
        }
        if (this.field199 <= 0) {
            this.field199 = 1;
        }
        Statics.field3598 = Math.min(this.field207, this.field208);
        Statics.field4908 = Math.min(this.field199, this.field202);
        this.field224 = (this.field207 - Statics.field3598) / 2;
        this.field205 = 0;
        this.field212.setSize(Statics.field3598, Statics.field4908);
        Statics.field2346 = new class33(Statics.field3598, Statics.field4908, this.field212, this.field191);
        if (this.field211 == var1) {
            Insets var3 = this.field211.getInsets();
            this.field212.setLocation(this.field224 + var3.left, this.field205 + var3.top);
        } else {
            this.field212.setLocation(this.field224, this.field205);
        }
        this.field213 = true;
        this.method482();
    }

    @ObfuscatedName("bb.ae(I)V")
    public void method483() {
        int var1 = this.field224;
        int var2 = this.field205;
        int var3 = this.field207 - Statics.field3598 - var1;
        int var4 = this.field199 - Statics.field4908 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method507();
            int var6 = 0;
            int var7 = 0;
            if (this.field211 == var5) {
                Insets var8 = this.field211.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field199);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field207, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field207 + var6 - var3, var7, var3, this.field199);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field199 + var7 - var4, this.field207, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bb.aw(I)V")
    public final void method484() {
        field222.method348(this.field212);
        Canvas var1 = this.field212;
        var1.removeMouseListener(class36.field228);
        var1.removeMouseMotionListener(class36.field228);
        var1.removeFocusListener(class36.field228);
        class36.field230 = 0;
        if (this.field209 != null) {
            this.field209.method292(this.field212);
        }
        this.method497();
        field222.method334(this.field212);
        class36.method2182(this.field212);
        if (this.field209 != null) {
            this.field209.method291(this.field212);
        }
        this.method493();
    }

    @ObfuscatedName("bb.aq(IIIII)V")
    public final void method485(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field216 != null) {
                field192++;
                if (field192 >= 3) {
                    this.method506("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field216 = this;
            Statics.field3598 = arg0;
            Statics.field4908 = arg1;
            Statics.field5294 = arg2;
            Statics.field5295 = arg3;
            Statics.field4769 = this;
            if (Statics.field218 == null) {
                Statics.field218 = new class174();
            }
            Statics.field218.method3218(this, 1);
        } catch (Exception var6) {
            class556.method3321((String) null, var6);
            this.method506("crash");
        }
    }

    @ObfuscatedName("bb.az(I)V")
    public final synchronized void method497() {
        Container var1 = this.method507();
        if (this.field212 != null) {
            this.field212.removeFocusListener(this);
            var1.remove(this.field212);
        }
        Statics.field3598 = Math.max(var1.getWidth(), this.field206);
        Statics.field4908 = Math.max(var1.getHeight(), this.field210);
        if (this.field211 != null) {
            Insets var2 = this.field211.getInsets();
            Statics.field3598 -= var2.right + var2.left;
            Statics.field4908 -= var2.top + var2.bottom;
        }
        this.field212 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field212);
        this.field212.setSize(Statics.field3598, Statics.field4908);
        this.field212.setVisible(true);
        this.field212.setBackground(Color.BLACK);
        if (this.field211 == var1) {
            Insets var3 = this.field211.getInsets();
            this.field212.setLocation(this.field224 + var3.left, this.field205 + var3.top);
        } else {
            this.field212.setLocation(this.field224, this.field205);
        }
        this.field212.addFocusListener(this);
        this.field212.requestFocus();
        this.field213 = true;
        if (Statics.field2346 != null && Statics.field3598 == Statics.field2346.field5216 && Statics.field4908 == Statics.field2346.field5219) {
            ((class33) Statics.field2346).method451(this.field212);
            Statics.field2346.method452(0, 0);
        } else {
            Statics.field2346 = new class33(Statics.field3598, Statics.field4908, this.field212, this.field191);
        }
        this.field203 = false;
        this.field200 = class316.method6401();
    }

    @ObfuscatedName("bb.at(ZI)V")
    public void method487(boolean arg0) {
        if (this.field191 != arg0) {
            this.field191 = arg0;
            Statics.field2346.method8781(arg0);
            Statics.field2346.method8779();
        }
    }

    @ObfuscatedName("bb.af(I)Z")
    public final boolean method518() {
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
                this.method506("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1828 != null) {
                String var1 = Statics.field1828.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1823;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method506("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class402.method8966(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class402.method2596(var4) && class402.method677(var4) < 10) {
                            this.method506("wrongjava");
                            return;
                        }
                    }
                    field197 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method497();
            this.method501();
            Statics.field3401 = class185.method5221();
            while (field193 == 0L || class316.method6401() < field193) {
                Statics.field1753 = Statics.field3401.method3144(field196, field197);
                for (int var5 = 0; var5 < Statics.field1753; var5++) {
                    this.method489();
                }
                this.method491();
                this.method473(this.field212);
            }
        } catch (Exception var7) {
            class556.method3321((String) null, var7);
            this.method506("crash");
        }
        this.method502();
    }

    @ObfuscatedName("bb.ad(B)V")
    public void method489() {
        long var1 = class316.method6401();
        long var3 = field201[Statics.field1854];
        field201[Statics.field1854] = var1;
        Statics.field1854 = Statics.field1854 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field133 = field221;
        }
        this.method552();
    }

    @ObfuscatedName("bb.by(B)V")
    public final void method606() {
        this.field213 = true;
    }

    @ObfuscatedName("bb.bd(I)V")
    public void method491() {
        Container var1 = this.method507();
        long var2 = class316.method6401();
        long var4 = field204[Statics.field214];
        field204[Statics.field214] = var2;
        Statics.field214 = Statics.field214 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field198 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field190 - 1 > 50) {
            field190 -= 50;
            this.field213 = true;
            this.field212.setSize(Statics.field3598, Statics.field4908);
            this.field212.setVisible(true);
            if (this.field211 == var1) {
                Insets var7 = this.field211.getInsets();
                this.field212.setLocation(this.field224 + var7.left, this.field205 + var7.top);
            } else {
                this.field212.setLocation(this.field224, this.field205);
            }
        }
        if (this.field203) {
            this.method484();
        }
        this.method544();
        this.method562(this.field213);
        if (this.field213) {
            this.method483();
        }
        this.field213 = false;
    }

    @ObfuscatedName("bb.be(B)V")
    public final void method544() {
        class461 var1 = this.method508();
        if (this.field207 != var1.field4763 || this.field199 != var1.field4765 || this.field215) {
            this.method481();
            this.field215 = false;
        }
    }

    @ObfuscatedName("bb.bv(I)V")
    public final void method493() {
        this.field215 = true;
    }

    @ObfuscatedName("bb.ba(S)V")
    public final synchronized void method502() {
        if (field194) {
            return;
        }
        field194 = true;
        try {
            this.field212.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method477();
        } catch (Exception var7) {
        }
        if (this.field211 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field218 != null) {
            try {
                Statics.field218.method3224();
            } catch (Exception var5) {
            }
        }
        this.method510();
    }

    @ObfuscatedName("ae.bz(I)V")
    public static final void method274() {
        Statics.field3401.method3141();
        for (int var0 = 0; var0 < 32; var0++) {
            field204[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field201[var1] = 0L;
        }
        Statics.field1753 = 0;
    }

    public final void start() {
        if (field216 == this && !field194) {
            field193 = 0L;
        }
    }

    public final void stop() {
        if (field216 == this && !field194) {
            field193 = class316.method6401() + 4000L;
        }
    }

    public final void destroy() {
        if (field216 == this && !field194) {
            field193 = class316.method6401();
            class317.method2610(5000L);
            this.method502();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field216 != this || field194) {
            return;
        }
        this.field213 = true;
        if (class316.method6401() - this.field200 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field3598 && var2.height >= Statics.field4908) {
                this.field203 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field221 = true;
        this.field213 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field221 = false;
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

    @ObfuscatedName("bb.bm(ILjava/lang/String;ZI)V")
    public final void method628(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field212.getGraphics();
            if (Statics.field79 == null) {
                Statics.field79 = new Font("Helvetica", 1, 13);
                Statics.field80 = this.field212.getFontMetrics(Statics.field79);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field3598, Statics.field4908);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3444 == null) {
                    Statics.field3444 = this.field212.createImage(304, 34);
                }
                Graphics var6 = Statics.field3444.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field79);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field80.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3444, Statics.field3598 / 2 - 152, Statics.field4908 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field3598 / 2 - 152;
                int var9 = Statics.field4908 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field79);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field80.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field212.repaint();
        }
    }

    @ObfuscatedName("bb.br(I)V")
    public final void method505() {
        Statics.field3444 = null;
        Statics.field79 = null;
        Statics.field80 = null;
    }

    @ObfuscatedName("bb.bs(Ljava/lang/String;I)V")
    public void method506(String arg0) {
        if (this.field195) {
            return;
        }
        this.field195 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bb.bc(B)Ljava/awt/Container;")
    public Container method507() {
        return this.field211 == null ? this : this.field211;
    }

    @ObfuscatedName("bb.bu(I)Lrx;")
    public class461 method508() {
        Container var1 = this.method507();
        int var2 = Math.max(var1.getWidth(), this.field206);
        int var3 = Math.max(var1.getHeight(), this.field210);
        if (this.field211 != null) {
            Insets var4 = this.field211.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class461(var2, var3);
    }

    @ObfuscatedName("bb.bf(I)Z")
    public final boolean method527() {
        return this.field211 != null;
    }

    @ObfuscatedName("el.bh(I)I")
    public static int method2602() {
        int var0 = 0;
        if (Statics.field4373 == null || !Statics.field4373.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field4373 = var2;
                        field217 = -1L;
                        field223 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field4373 != null) {
            long var4 = class316.method6401();
            long var6 = Statics.field4373.getCollectionTime();
            if (field223 != -1L) {
                long var8 = var6 - field223;
                long var10 = var4 - field217;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field223 = var6;
            field217 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bb.bt(I)V")
    public abstract void method477();

    @ObfuscatedName("bb.ai(I)V")
    public abstract void method482();

    @ObfuscatedName("bb.bb(B)V")
    public abstract void method501();

    @ObfuscatedName("bb.bl(I)V")
    public abstract void method510();

    @ObfuscatedName("bb.bo(I)V")
    public abstract void method552();

    @ObfuscatedName("bb.bp(ZB)V")
    public abstract void method562(boolean arg0);

    public abstract void init();
}
