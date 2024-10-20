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

@ObfuscatedName("be")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("be.al")
    public static class35 field184 = null;

    @ObfuscatedName("be.aj")
    public static int field185 = 0;

    @ObfuscatedName("be.az")
    public static long field186 = 0L;

    @ObfuscatedName("be.af")
    public static boolean field187 = false;

    @ObfuscatedName("be.aa")
    public boolean field188 = false;

    @ObfuscatedName("be.ab")
    public static int field189 = 20;

    @ObfuscatedName("be.ac")
    public static int field194 = 1;

    @ObfuscatedName("be.ao")
    public static int field195 = 0;

    @ObfuscatedName("be.aq")
    public static long[] field193 = new long[32];

    @ObfuscatedName("be.ae")
    public static long[] field199 = new long[32];

    @ObfuscatedName("be.au")
    public int field191;

    @ObfuscatedName("be.as")
    public int field196;

    @ObfuscatedName("be.aw")
    public int field197 = 0;

    @ObfuscatedName("be.ad")
    public int field198 = 0;

    @ObfuscatedName("be.am")
    public int field200;

    @ObfuscatedName("be.ar")
    public int field183;

    @ObfuscatedName("be.ag")
    public int field202;

    @ObfuscatedName("be.bs")
    public int field203;

    @ObfuscatedName("be.bo")
    public boolean field204 = false;

    @ObfuscatedName("be.bt")
    public Frame field213;

    @ObfuscatedName("be.bn")
    public Canvas field206;

    @ObfuscatedName("be.bw")
    public volatile boolean field207 = true;

    @ObfuscatedName("be.be")
    public static int field208 = 500;

    @ObfuscatedName("be.bg")
    public boolean field209 = false;

    @ObfuscatedName("be.bu")
    public volatile boolean field210 = false;

    @ObfuscatedName("be.bh")
    public volatile long field201 = 0L;

    @ObfuscatedName("be.br")
    public class22 field219;

    @ObfuscatedName("be.bx")
    public Clipboard field212;

    @ObfuscatedName("be.bd")
    public final EventQueue field214;

    @ObfuscatedName("be.bv")
    public static volatile boolean field215 = true;

    @ObfuscatedName("be.bq")
    public static class26 field216 = new class26();

    @ObfuscatedName("be.bc")
    public static long field205 = -1L;

    @ObfuscatedName("be.bz")
    public static long field218 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field214 = var1;
        class43.method3472(new class23());
    }

    @ObfuscatedName("be.ab(III)V")
    public final void method473(int arg0, int arg1) {
        if (this.field202 != arg0 || this.field203 != arg1) {
            this.method556();
        }
        this.field202 = arg0;
        this.field203 = arg1;
    }

    @ObfuscatedName("be.ac(Ljava/lang/Object;B)V")
    public final void method634(Object arg0) {
        if (this.field214 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field214.peekEvent() != null; var2++) {
            class327.method8101(1L);
        }
        if (arg0 != null) {
            this.field214.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("be.ao(I)Lgq;")
    public class180 method475() {
        if (this.field219 == null) {
            this.field219 = new class22();
            this.field219.method276(this.field206);
        }
        return this.field219;
    }

    @ObfuscatedName("be.ah(I)V")
    public void method476() {
        this.field212 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("be.av(Ljava/lang/String;S)V")
    public void method477(String arg0) {
        this.field212.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("be.aq(B)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method478() {
        return this.field212;
    }

    @ObfuscatedName("be.ap(I)V")
    public final void method498() {
        class29.method2670();
        field216.method339(this.field206);
    }

    @ObfuscatedName("be.ae(B)V")
    public final void method480() {
        field216.method354();
    }

    @ObfuscatedName("be.ax(Lbi;II)V")
    public void method481(class30 arg0, int arg1) {
        field216.method335(arg0, arg1);
    }

    @ObfuscatedName("be.ay(I)V")
    public final void method611() {
        Canvas var1 = this.field206;
        var1.addMouseListener(class36.field224);
        var1.addMouseMotionListener(class36.field224);
        var1.addFocusListener(class36.field224);
    }

    @ObfuscatedName("be.au(I)V")
    public final void method539() {
        Container var1 = this.method643();
        if (var1 == null) {
            return;
        }
        class419 var2 = this.method509();
        this.field191 = Math.max(var2.field4673, this.field200);
        this.field196 = Math.max(var2.field4671, this.field183);
        if (this.field191 <= 0) {
            this.field191 = 1;
        }
        if (this.field196 <= 0) {
            this.field196 = 1;
        }
        Statics.field190 = Math.min(this.field191, this.field202);
        Statics.field5283 = Math.min(this.field196, this.field203);
        this.field197 = (this.field191 - Statics.field190) / 2;
        this.field198 = 0;
        this.field206.setSize(Statics.field190, Statics.field5283);
        Statics.field3196 = new class33(Statics.field190, Statics.field5283, this.field206, this.field204);
        if (this.field213 == var1) {
            Insets var3 = this.field213.getInsets();
            this.field206.setLocation(this.field197 + var3.left, this.field198 + var3.top);
        } else {
            this.field206.setLocation(this.field197, this.field198);
        }
        this.field207 = true;
        this.method546();
    }

    @ObfuscatedName("be.aw(I)V")
    public void method592() {
        int var1 = this.field197;
        int var2 = this.field198;
        int var3 = this.field191 - Statics.field190 - var1;
        int var4 = this.field196 - Statics.field5283 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method643();
            int var6 = 0;
            int var7 = 0;
            if (this.field213 == var5) {
                Insets var8 = this.field213.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field196);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field191, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field191 + var6 - var3, var7, var3, this.field196);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field196 + var7 - var4, this.field191, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("be.ad(I)V")
    public final void method485() {
        field216.method344(this.field206);
        class36.method4156(this.field206);
        if (this.field219 != null) {
            this.field219.method278(this.field206);
        }
        this.method506();
        field216.method339(this.field206);
        Canvas var1 = this.field206;
        var1.addMouseListener(class36.field224);
        var1.addMouseMotionListener(class36.field224);
        var1.addFocusListener(class36.field224);
        if (this.field219 != null) {
            this.field219.method276(this.field206);
        }
        this.method556();
    }

    @ObfuscatedName("be.ai(IIIII)V")
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field184 != null) {
                field185++;
                if (field185 >= 3) {
                    this.method507("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field184 = this;
            Statics.field190 = arg0;
            Statics.field5283 = arg1;
            Statics.field5274 = arg2;
            Statics.field5496 = arg3;
            Statics.field5499 = this;
            if (Statics.field217 == null) {
                Statics.field217 = new class177();
            }
            Statics.field217.method3313(this, 1);
        } catch (Exception var6) {
            class571.method8083((String) null, var6);
            this.method507("crash");
        }
    }

    @ObfuscatedName("be.an(I)V")
    public final synchronized void method506() {
        Container var1 = this.method643();
        if (this.field206 != null) {
            this.field206.removeFocusListener(this);
            var1.remove(this.field206);
        }
        Statics.field190 = Math.max(var1.getWidth(), this.field200);
        Statics.field5283 = Math.max(var1.getHeight(), this.field183);
        if (this.field213 != null) {
            Insets var2 = this.field213.getInsets();
            Statics.field190 -= var2.right + var2.left;
            Statics.field5283 -= var2.top + var2.bottom;
        }
        this.field206 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field206);
        this.field206.setSize(Statics.field190, Statics.field5283);
        this.field206.setVisible(true);
        this.field206.setBackground(Color.BLACK);
        if (this.field213 == var1) {
            Insets var3 = this.field213.getInsets();
            this.field206.setLocation(this.field197 + var3.left, this.field198 + var3.top);
        } else {
            this.field206.setLocation(this.field197, this.field198);
        }
        this.field206.addFocusListener(this);
        this.field206.requestFocus();
        this.field207 = true;
        if (Statics.field3196 != null && Statics.field190 == Statics.field3196.field5425 && Statics.field5283 == Statics.field3196.field5423) {
            ((class33) Statics.field3196).method463(this.field206);
            Statics.field3196.method451(0, 0);
        } else {
            Statics.field3196 = new class33(Statics.field190, Statics.field5283, this.field206, this.field204);
        }
        this.field210 = false;
        this.field201 = class326.method2895();
    }

    @ObfuscatedName("be.am(ZI)V")
    public void method488(boolean arg0) {
        if (this.field204 != arg0) {
            this.field204 = arg0;
            Statics.field3196.method9186(arg0);
            Statics.field3196.method9185();
        }
    }

    @ObfuscatedName("be.ar(I)Z")
    public final boolean method489() {
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
                this.method507("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1880 != null) {
                String var1 = Statics.field1880.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1872;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method507("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class415.method37(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class415.method3648(var4) && class415.method3328(var4) < 10) {
                            this.method507("wrongjava");
                            return;
                        }
                    }
                    field194 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method506();
            this.method501();
            class190 var5;
            try {
                var5 = new class173();
            } catch (Throwable var9) {
                var5 = new class182();
            }
            Statics.field5431 = var5;
            while (field186 == 0L || class326.method2895() < field186) {
                Statics.field4958 = Statics.field5431.method3221(field189, field194);
                for (int var7 = 0; var7 < Statics.field4958; var7++) {
                    this.method490();
                }
                this.method566();
                this.method634(this.field206);
            }
        } catch (Exception var10) {
            class571.method8083((String) null, var10);
            this.method507("crash");
        }
        this.method495();
    }

    @ObfuscatedName("be.ag(B)V")
    public void method490() {
        long var1 = class326.method2895();
        long var3 = field199[Statics.field56];
        field199[Statics.field56] = var1;
        Statics.field56 = Statics.field56 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field4865 = field215;
        }
        this.method492();
    }

    @ObfuscatedName("be.bs(I)V")
    public final void method491() {
        this.field207 = true;
    }

    @ObfuscatedName("be.bl(I)V")
    public void method566() {
        Container var1 = this.method643();
        long var2 = class326.method2895();
        long var4 = field193[Statics.field4576];
        field193[Statics.field4576] = var2;
        Statics.field4576 = Statics.field4576 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field195 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field208 - 1 > 50) {
            field208 -= 50;
            this.field207 = true;
            this.field206.setSize(Statics.field190, Statics.field5283);
            this.field206.setVisible(true);
            if (this.field213 == var1) {
                Insets var7 = this.field213.getInsets();
                this.field206.setLocation(this.field197 + var7.left, this.field198 + var7.top);
            } else {
                this.field206.setLocation(this.field197, this.field198);
            }
        }
        if (this.field210) {
            this.method485();
        }
        this.method508();
        this.method503(this.field207);
        if (this.field207) {
            this.method592();
        }
        this.field207 = false;
    }

    @ObfuscatedName("be.be(B)V")
    public final void method508() {
        class419 var1 = this.method509();
        if (this.field191 != var1.field4673 || this.field196 != var1.field4671 || this.field209) {
            this.method539();
            this.field209 = false;
        }
    }

    @ObfuscatedName("be.bg(B)V")
    public final void method556() {
        this.field209 = true;
    }

    @ObfuscatedName("be.bu(I)V")
    public final synchronized void method495() {
        if (field187) {
            return;
        }
        field187 = true;
        try {
            this.field206.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method504();
        } catch (Exception var7) {
        }
        if (this.field213 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field217 != null) {
            try {
                Statics.field217.method3325();
            } catch (Exception var5) {
            }
        }
        this.method511();
    }

    @ObfuscatedName("am.bh(I)V")
    public static final void method307() {
        Statics.field5431.method3220();
        for (int var0 = 0; var0 < 32; var0++) {
            field193[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field199[var1] = 0L;
        }
        Statics.field4958 = 0;
    }

    public final void start() {
        if (field184 == this && !field187) {
            field186 = 0L;
        }
    }

    public final void stop() {
        if (field184 == this && !field187) {
            field186 = class326.method2895() + 4000L;
        }
    }

    public final void destroy() {
        if (field184 == this && !field187) {
            field186 = class326.method2895();
            class327.method8101(5000L);
            this.method495();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field184 != this || field187) {
            return;
        }
        this.field207 = true;
        if (class326.method2895() - this.field201 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field190 && var2.height >= Statics.field5283) {
                this.field210 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field215 = true;
        this.field207 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field215 = false;
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

    @ObfuscatedName("be.bd(ILjava/lang/String;ZZB)V")
    public final void method505(int arg0, String arg1, boolean arg2, boolean arg3) {
        try {
            Graphics var5 = this.field206.getGraphics();
            if (Statics.field114 == null) {
                Statics.field114 = new Font("Helvetica", 1, 13);
                Statics.field3146 = this.field206.getFontMetrics(Statics.field114);
            }
            if (arg2 && !arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, Statics.field190, Statics.field5283);
            }
            Color var6 = new Color(140, 17, 17);
            try {
                if (Statics.field54 == null) {
                    Statics.field54 = this.field206.createImage(304, 34);
                }
                Graphics var7 = Statics.field54.getGraphics();
                var7.setColor(var6);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var7.setFont(Statics.field114);
                var7.setColor(Color.white);
                var7.drawString(arg1, (304 - Statics.field3146.stringWidth(arg1)) / 2, 22);
                var5.drawImage(Statics.field54, Statics.field190 / 2 - 152, Statics.field5283 / 2 + (arg3 ? 50 : -18), (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = Statics.field190 / 2 - 152;
                int var10 = Statics.field5283 / 2 - 18;
                var5.setColor(var6);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field114);
                var5.setColor(Color.white);
                var5.drawString(arg1, var9 + (304 - Statics.field3146.stringWidth(arg1)) / 2, var10 + 22);
            }
        } catch (Exception var13) {
            this.field206.repaint();
        }
    }

    @ObfuscatedName("be.bv(I)V")
    public final void method620() {
        Statics.field54 = null;
        Statics.field114 = null;
        Statics.field3146 = null;
    }

    @ObfuscatedName("be.bm(Ljava/lang/String;I)V")
    public void method507(String arg0) {
        if (this.field188) {
            return;
        }
        this.field188 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("be.bq(B)Ljava/awt/Container;")
    public Container method643() {
        return this.field213 == null ? this : this.field213;
    }

    @ObfuscatedName("be.bj(I)Lqi;")
    public class419 method509() {
        Container var1 = this.method643();
        int var2 = Math.max(var1.getWidth(), this.field200);
        int var3 = Math.max(var1.getHeight(), this.field183);
        if (this.field213 != null) {
            Insets var4 = this.field213.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class419(var2, var3);
    }

    @ObfuscatedName("be.bc(I)Z")
    public final boolean method510() {
        return this.field213 != null;
    }

    @ObfuscatedName("hk.bz(B)I")
    public static int method3568() {
        int var0 = 0;
        if (Statics.field1865 == null || !Statics.field1865.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1865 = var2;
                        field218 = -1L;
                        field205 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1865 != null) {
            long var4 = class326.method2895();
            long var6 = Statics.field1865.getCollectionTime();
            if (field205 != -1L) {
                long var8 = var6 - field205;
                long var10 = var4 - field218;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field205 = var6;
            field218 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("be.bp(B)V")
    public abstract void method492();

    @ObfuscatedName("be.bk(S)V")
    public abstract void method501();

    @ObfuscatedName("be.br(ZI)V")
    public abstract void method503(boolean arg0);

    @ObfuscatedName("be.bx(I)V")
    public abstract void method504();

    @ObfuscatedName("be.ba(I)V")
    public abstract void method511();

    @ObfuscatedName("be.as(I)V")
    public abstract void method546();
}
