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

@ObfuscatedName("bx")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bx.ay")
    public static class35 field158 = null;

    @ObfuscatedName("bx.an")
    public static int field172 = 0;

    @ObfuscatedName("bx.au")
    public static long field161 = 0L;

    @ObfuscatedName("bx.ax")
    public static boolean field162 = false;

    @ObfuscatedName("bx.ao")
    public boolean field159 = false;

    @ObfuscatedName("bx.ac")
    public static int field165 = 20;

    @ObfuscatedName("bx.ae")
    public static int field166 = 1;

    @ObfuscatedName("bx.ad")
    public static int field167 = 0;

    @ObfuscatedName("bx.aj")
    public static long[] field186 = new long[32];

    @ObfuscatedName("bx.aw")
    public static long[] field193 = new long[32];

    @ObfuscatedName("bx.ah")
    public int field170;

    @ObfuscatedName("bx.ag")
    public int field171;

    @ObfuscatedName("bx.av")
    public int field180 = 0;

    @ObfuscatedName("bx.ar")
    public int field173 = 0;

    @ObfuscatedName("bx.ai")
    public int field174;

    @ObfuscatedName("bx.at")
    public int field175;

    @ObfuscatedName("bx.az")
    public int field184;

    @ObfuscatedName("bx.bg")
    public int field160;

    @ObfuscatedName("bx.bz")
    public boolean field178 = false;

    @ObfuscatedName("bx.bo")
    public Frame field179;

    @ObfuscatedName("bx.bm")
    public Canvas field177;

    @ObfuscatedName("bx.bd")
    public volatile boolean field181 = true;

    @ObfuscatedName("bx.bx")
    public static int field182 = 500;

    @ObfuscatedName("bx.bv")
    public boolean field183 = false;

    @ObfuscatedName("bx.bu")
    public volatile boolean field168 = false;

    @ObfuscatedName("bx.bp")
    public volatile long field185 = 0L;

    @ObfuscatedName("bx.bq")
    public class22 field176;

    @ObfuscatedName("bx.bt")
    public Clipboard field169;

    @ObfuscatedName("bx.bi")
    public final EventQueue field189;

    @ObfuscatedName("bx.be")
    public static volatile boolean field190 = true;

    @ObfuscatedName("bx.bn")
    public static class26 field188 = new class26();

    @ObfuscatedName("bx.bk")
    public static long field192 = -1L;

    @ObfuscatedName("bx.bs")
    public static long field191 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field189 = var1;
        class43.method5497(new class23());
    }

    @ObfuscatedName("bx.am(III)V")
    public final void method458(int arg0, int arg1) {
        if (this.field184 != arg0 || this.field160 != arg1) {
            this.method568();
        }
        this.field184 = arg0;
        this.field160 = arg1;
    }

    @ObfuscatedName("bx.ac(Ljava/lang/Object;I)V")
    public final void method450(Object arg0) {
        if (this.field189 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field189.peekEvent() != null; var2++) {
            class330.method3326(1L);
        }
        if (arg0 != null) {
            this.field189.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bx.ae(I)Lip;")
    public class216 method451() {
        if (this.field176 == null) {
            this.field176 = new class22();
            this.field176.method276(this.field177);
        }
        return this.field176;
    }

    @ObfuscatedName("bx.ad(I)V")
    public void method539() {
        this.field169 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bx.aq(Ljava/lang/String;B)V")
    public void method452(String arg0) {
        this.field169.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bx.al(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method476() {
        return this.field169;
    }

    @ObfuscatedName("bx.aj(I)V")
    public final void method454() {
        class29.method4195();
        field188.method318(this.field177);
    }

    @ObfuscatedName("mi.as(B)I")
    public static final int method5601() {
        return field188.method317();
    }

    @ObfuscatedName("bx.aw(I)V")
    public final void method455() {
        field188.method349();
    }

    @ObfuscatedName("bx.af(Lbc;II)V")
    public void method499(class30 arg0, int arg1) {
        field188.method322(arg0, arg1);
    }

    @ObfuscatedName("bx.aa(I)V")
    public final void method457() {
        Canvas var1 = this.field177;
        var1.addMouseListener(class36.field197);
        var1.addMouseMotionListener(class36.field197);
        var1.addFocusListener(class36.field197);
    }

    @ObfuscatedName("bx.ah(I)V")
    public final void method503() {
        Container var1 = this.method516();
        if (var1 == null) {
            return;
        }
        class421 var2 = this.method500();
        this.field170 = Math.max(var2.field4661, this.field174);
        this.field171 = Math.max(var2.field4664, this.field175);
        if (this.field170 <= 0) {
            this.field170 = 1;
        }
        if (this.field171 <= 0) {
            this.field171 = 1;
        }
        Statics.field1345 = Math.min(this.field170, this.field184);
        Statics.field467 = Math.min(this.field171, this.field160);
        this.field180 = (this.field170 - Statics.field1345) / 2;
        this.field173 = 0;
        this.field177.setSize(Statics.field1345, Statics.field467);
        Statics.field3197 = new class33(Statics.field1345, Statics.field467, this.field177, this.field178);
        if (this.field179 == var1) {
            Insets var3 = this.field179.getInsets();
            this.field177.setLocation(this.field180 + var3.left, this.field173 + var3.top);
        } else {
            this.field177.setLocation(this.field180, this.field173);
        }
        this.field181 = true;
        this.method485();
    }

    @ObfuscatedName("bx.av(I)V")
    public void method460() {
        int var1 = this.field180;
        int var2 = this.field173;
        int var3 = this.field170 - Statics.field1345 - var1;
        int var4 = this.field171 - Statics.field467 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method516();
            int var6 = 0;
            int var7 = 0;
            if (this.field179 == var5) {
                Insets var8 = this.field179.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field171);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field170, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field170 + var6 - var3, var7, var3, this.field171);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field171 + var7 - var4, this.field170, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bx.ar(B)V")
    public final void method461() {
        field188.method319(this.field177);
        class36.method264(this.field177);
        if (this.field176 != null) {
            this.field176.method275(this.field177);
        }
        this.method463();
        field188.method318(this.field177);
        Canvas var1 = this.field177;
        var1.addMouseListener(class36.field197);
        var1.addMouseMotionListener(class36.field197);
        var1.addFocusListener(class36.field197);
        if (this.field176 != null) {
            this.field176.method276(this.field177);
        }
        this.method568();
    }

    @ObfuscatedName("bx.ap(IIIII)V")
    public final void method462(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field158 != null) {
                field172++;
                if (field172 >= 3) {
                    this.method486("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field158 = this;
            Statics.field1345 = arg0;
            Statics.field467 = arg1;
            Statics.field5554 = arg2;
            Statics.field1060 = arg3;
            Statics.field2527 = this;
            if (Statics.field163 == null) {
                Statics.field163 = new class213();
            }
            Statics.field163.method4201(this, 1);
        } catch (Exception var6) {
            class575.method2216((String) null, var6);
            this.method486("crash");
        }
    }

    @ObfuscatedName("bx.ak(I)V")
    public final synchronized void method463() {
        Container var1 = this.method516();
        if (this.field177 != null) {
            this.field177.removeFocusListener(this);
            var1.remove(this.field177);
        }
        Statics.field1345 = Math.max(var1.getWidth(), this.field174);
        Statics.field467 = Math.max(var1.getHeight(), this.field175);
        if (this.field179 != null) {
            Insets var2 = this.field179.getInsets();
            Statics.field1345 -= var2.right + var2.left;
            Statics.field467 -= var2.top + var2.bottom;
        }
        this.field177 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field177);
        this.field177.setSize(Statics.field1345, Statics.field467);
        this.field177.setVisible(true);
        this.field177.setBackground(Color.BLACK);
        if (this.field179 == var1) {
            Insets var3 = this.field179.getInsets();
            this.field177.setLocation(this.field180 + var3.left, this.field173 + var3.top);
        } else {
            this.field177.setLocation(this.field180, this.field173);
        }
        this.field177.addFocusListener(this);
        this.field177.requestFocus();
        this.field181 = true;
        if (Statics.field3197 != null && Statics.field1345 == Statics.field3197.field5458 && Statics.field467 == Statics.field3197.field5456) {
            ((class33) Statics.field3197).method424(this.field177);
            Statics.field3197.method435(0, 0);
        } else {
            Statics.field3197 = new class33(Statics.field1345, Statics.field467, this.field177, this.field178);
        }
        this.field168 = false;
        this.field185 = class329.method5009();
    }

    @ObfuscatedName("bx.ai(ZB)V")
    public void method583(boolean arg0) {
        if (this.field178 != arg0) {
            this.field178 = arg0;
            Statics.field3197.method9207(arg0);
            Statics.field3197.method9208();
        }
    }

    @ObfuscatedName("bx.at(I)Z")
    public final boolean method465() {
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
                this.method486("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1617 != null) {
                String var1 = Statics.field1617.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2345;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method486("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class417.method4709(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class417.method3101(var4) && class417.method1138(var4) < 10) {
                            this.method486("wrongjava");
                            return;
                        }
                    }
                    field166 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method463();
            this.method477();
            Statics.field4803 = class226.method294();
            while (field161 == 0L || class329.method5009() < field161) {
                Statics.field164 = Statics.field4803.method4130(field165, field166);
                for (int var5 = 0; var5 < Statics.field164; var5++) {
                    this.method475();
                }
                this.method468();
                this.method450(this.field177);
            }
        } catch (Exception var7) {
            class575.method2216((String) null, var7);
            this.method486("crash");
        }
        this.method471();
    }

    @ObfuscatedName("bx.az(B)V")
    public void method475() {
        long var1 = class329.method5009();
        long var3 = field193[Statics.field13];
        field193[Statics.field13] = var1;
        Statics.field13 = Statics.field13 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3540 = field190;
        }
        this.method478();
    }

    @ObfuscatedName("bx.bg(I)V")
    public final void method467() {
        this.field181 = true;
    }

    @ObfuscatedName("bx.bz(I)V")
    public void method468() {
        Container var1 = this.method516();
        long var2 = class329.method5009();
        long var4 = field186[Statics.field1796];
        field186[Statics.field1796] = var2;
        Statics.field1796 = Statics.field1796 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field167 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field182 - 1 > 50) {
            field182 -= 50;
            this.field181 = true;
            this.field177.setSize(Statics.field1345, Statics.field467);
            this.field177.setVisible(true);
            if (this.field179 == var1) {
                Insets var7 = this.field179.getInsets();
                this.field177.setLocation(this.field180 + var7.left, this.field173 + var7.top);
            } else {
                this.field177.setLocation(this.field180, this.field173);
            }
        }
        if (this.field168) {
            this.method461();
        }
        this.method469();
        this.method479(this.field181);
        if (this.field181) {
            this.method460();
        }
        this.field181 = false;
    }

    @ObfuscatedName("bx.bj(I)V")
    public final void method469() {
        class421 var1 = this.method500();
        if (this.field170 != var1.field4661 || this.field171 != var1.field4664 || this.field183) {
            this.method503();
            this.field183 = false;
        }
    }

    @ObfuscatedName("bx.bx(I)V")
    public final void method568() {
        this.field183 = true;
    }

    @ObfuscatedName("bx.bv(I)V")
    public final synchronized void method471() {
        if (field162) {
            return;
        }
        field162 = true;
        try {
            this.field177.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method557();
        } catch (Exception var7) {
        }
        if (this.field179 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field163 != null) {
            try {
                Statics.field163.method4198();
            } catch (Exception var5) {
            }
        }
        this.method453();
    }

    @ObfuscatedName("es.bu(I)V")
    public static final void method2926() {
        Statics.field4803.method4134();
        for (int var0 = 0; var0 < 32; var0++) {
            field186[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field193[var1] = 0L;
        }
        Statics.field164 = 0;
    }

    public final void start() {
        if (field158 == this && !field162) {
            field161 = 0L;
        }
    }

    public final void stop() {
        if (field158 == this && !field162) {
            field161 = class329.method5009() + 4000L;
        }
    }

    public final void destroy() {
        if (field158 == this && !field162) {
            field161 = class329.method5009();
            class330.method3326(5000L);
            this.method471();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field158 != this || field162) {
            return;
        }
        this.field181 = true;
        if (class329.method5009() - this.field185 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field1345 && var2.height >= Statics.field467) {
                this.field168 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field190 = true;
        this.field181 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field190 = false;
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

    @ObfuscatedName("bx.bt(ILjava/lang/String;ZZB)V")
    public final void method481(int arg0, String arg1, boolean arg2, boolean arg3) {
        try {
            Graphics var5 = this.field177.getGraphics();
            if (Statics.field472 == null) {
                Statics.field472 = new Font("Helvetica", 1, 13);
                Statics.field2244 = this.field177.getFontMetrics(Statics.field472);
            }
            if (arg2 && !arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, Statics.field1345, Statics.field467);
            }
            Color var6 = new Color(140, 17, 17);
            try {
                if (Statics.field5281 == null) {
                    Statics.field5281 = this.field177.createImage(304, 34);
                }
                Graphics var7 = Statics.field5281.getGraphics();
                var7.setColor(var6);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var7.setFont(Statics.field472);
                var7.setColor(Color.white);
                var7.drawString(arg1, (304 - Statics.field2244.stringWidth(arg1)) / 2, 22);
                var5.drawImage(Statics.field5281, Statics.field1345 / 2 - 152, Statics.field467 / 2 + (arg3 ? 50 : -18), (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = Statics.field1345 / 2 - 152;
                int var10 = Statics.field467 / 2 - 18;
                var5.setColor(var6);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field472);
                var5.setColor(Color.white);
                var5.drawString(arg1, var9 + (304 - Statics.field2244.stringWidth(arg1)) / 2, var10 + 22);
            }
        } catch (Exception var13) {
            this.field177.repaint();
        }
    }

    @ObfuscatedName("bx.bi(I)V")
    public final void method482() {
        Statics.field5281 = null;
        Statics.field472 = null;
        Statics.field2244 = null;
    }

    @ObfuscatedName("bx.be(Ljava/lang/String;B)V")
    public void method486(String arg0) {
        if (this.field159) {
            return;
        }
        this.field159 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bx.ba(I)Ljava/awt/Container;")
    public Container method516() {
        return this.field179 == null ? this : this.field179;
    }

    @ObfuscatedName("bx.bn(I)Lqw;")
    public class421 method500() {
        Container var1 = this.method516();
        int var2 = Math.max(var1.getWidth(), this.field174);
        int var3 = Math.max(var1.getHeight(), this.field175);
        if (this.field179 != null) {
            Insets var4 = this.field179.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class421(var2, var3);
    }

    @ObfuscatedName("bx.bw(I)Z")
    public final boolean method524() {
        return this.field179 != null;
    }

    @ObfuscatedName("oi.bk(B)I")
    public static int method6565() {
        int var0 = 0;
        if (Statics.field2694 == null || !Statics.field2694.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field2694 = var2;
                        field191 = -1L;
                        field192 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field2694 != null) {
            long var4 = class329.method5009();
            long var6 = Statics.field2694.getCollectionTime();
            if (field192 != -1L) {
                long var8 = var6 - field192;
                long var10 = var4 - field191;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field192 = var6;
            field191 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bx.bs(B)V")
    public abstract void method453();

    public abstract void init();

    @ObfuscatedName("bx.bp(I)V")
    public abstract void method477();

    @ObfuscatedName("bx.br(I)V")
    public abstract void method478();

    @ObfuscatedName("bx.bf(ZI)V")
    public abstract void method479(boolean arg0);

    @ObfuscatedName("bx.ag(S)V")
    public abstract void method485();

    @ObfuscatedName("bx.bq(B)V")
    public abstract void method557();
}
