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

@ObfuscatedName("bi")
public abstract class class59 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bi.q")
    public static class59 field624 = null;

    @ObfuscatedName("bi.o")
    public static int field657 = 0;

    @ObfuscatedName("bi.p")
    public static long field626 = 0L;

    @ObfuscatedName("bi.a")
    public static boolean field655 = false;

    @ObfuscatedName("bi.h")
    public boolean field639 = false;

    @ObfuscatedName("bi.g")
    public static int field630 = 20;

    @ObfuscatedName("bi.c")
    public static int field634 = 1;

    @ObfuscatedName("bi.u")
    public static int field632 = 0;

    @ObfuscatedName("bi.v")
    public static long[] field640 = new long[32];

    @ObfuscatedName("bi.t")
    public static long[] field635 = new long[32];

    @ObfuscatedName("bi.m")
    public int field653;

    @ObfuscatedName("bi.j")
    public int field633;

    @ObfuscatedName("bi.z")
    public int field638 = 0;

    @ObfuscatedName("bi.e")
    public int field623 = 0;

    @ObfuscatedName("bi.i")
    public int field637;

    @ObfuscatedName("bi.av")
    public int field641;

    @ObfuscatedName("bi.ao")
    public int field642;

    @ObfuscatedName("bi.am")
    public int field643;

    @ObfuscatedName("bi.af")
    public Frame field644;

    @ObfuscatedName("bi.ai")
    public Canvas field645;

    @ObfuscatedName("bi.aq")
    public volatile boolean field646 = true;

    @ObfuscatedName("bi.al")
    public static int field648 = 500;

    @ObfuscatedName("bi.as")
    public boolean field649 = false;

    @ObfuscatedName("bi.az")
    public volatile boolean field650 = false;

    @ObfuscatedName("bi.ax")
    public volatile long field627 = 0L;

    @ObfuscatedName("bi.ag")
    public class50 field652;

    @ObfuscatedName("bi.au")
    public Clipboard field631;

    @ObfuscatedName("bi.ac")
    public final EventQueue field654;

    @ObfuscatedName("bi.ay")
    public static volatile boolean field628 = true;

    @ObfuscatedName("bi.aw")
    public static long field656 = -1L;

    @ObfuscatedName("bi.ab")
    public static long field651 = -1L;

    public class59() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field654 = var1;
        class52 var3 = new class52();
        Statics.field1513 = var3;
    }

    @ObfuscatedName("bi.a(III)V")
    public final void method765(int arg0, int arg1) {
        if (this.field642 != arg0 || this.field643 != arg1) {
            this.method816();
        }
        this.field642 = arg0;
        this.field643 = arg1;
    }

    @ObfuscatedName("bi.h(Ljava/lang/Object;I)V")
    public final void method839(Object arg0) {
        if (this.field654 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field654.peekEvent() != null; var2++) {
            class202.method141(1L);
        }
        if (arg0 != null) {
            this.field654.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bi.l(B)Lfu;")
    public class168 method767() {
        if (this.field652 == null) {
            this.field652 = new class50();
            this.field652.method661(this.field645);
        }
        return this.field652;
    }

    @ObfuscatedName("bi.y(I)V")
    public void method851() {
        this.field631 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bi.g(Ljava/lang/String;I)V")
    public void method769(String arg0) {
        this.field631.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bi.c(I)V")
    public final void method770() {
        if (Statics.field2159.toLowerCase().indexOf("microsoft") == -1) {
            class51.field576[44] = 71;
            class51.field576[45] = 26;
            class51.field576[46] = 72;
            class51.field576[47] = 73;
            class51.field576[59] = 57;
            class51.field576[61] = 27;
            class51.field576[91] = 42;
            class51.field576[92] = 74;
            class51.field576[93] = 43;
            class51.field576[192] = 28;
            class51.field576[222] = 58;
            class51.field576[520] = 59;
        } else {
            class51.field576[186] = 57;
            class51.field576[187] = 27;
            class51.field576[188] = 71;
            class51.field576[189] = 26;
            class51.field576[190] = 72;
            class51.field576[191] = 73;
            class51.field576[192] = 58;
            class51.field576[219] = 42;
            class51.field576[220] = 74;
            class51.field576[221] = 43;
            class51.field576[222] = 59;
            class51.field576[223] = 28;
        }
        class51.method28(this.field645);
    }

    @ObfuscatedName("bi.u(I)V")
    public final void method841() {
        class60.method703(this.field645);
    }

    @ObfuscatedName("bi.t(I)V")
    public final void method772() {
        Container var1 = this.method796();
        if (var1 == null) {
            return;
        }
        class316 var2 = this.method797();
        this.field653 = Math.max(var2.field3863, this.field637);
        this.field633 = Math.max(var2.field3862, this.field641);
        if (this.field653 <= 0) {
            this.field653 = 1;
        }
        if (this.field633 <= 0) {
            this.field633 = 1;
        }
        Statics.field9 = Math.min(this.field653, this.field642);
        Statics.field342 = Math.min(this.field633, this.field643);
        this.field638 = (this.field653 - Statics.field9) / 2;
        this.field623 = 0;
        this.field645.setSize(Statics.field9, Statics.field342);
        Statics.field3926 = new class58(Statics.field9, Statics.field342, this.field645);
        if (this.field644 == var1) {
            Insets var3 = this.field644.getInsets();
            this.field645.setLocation(this.field638 + var3.left, this.field623 + var3.top);
        } else {
            this.field645.setLocation(this.field638, this.field623);
        }
        this.field646 = true;
        this.method865();
    }

    @ObfuscatedName("bi.m(I)V")
    public void method774() {
        int var1 = this.field638;
        int var2 = this.field623;
        int var3 = this.field653 - Statics.field9 - var1;
        int var4 = this.field633 - Statics.field342 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method796();
            int var6 = 0;
            int var7 = 0;
            if (this.field644 == var5) {
                Insets var8 = this.field644.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field633);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field653, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field653 + var6 - var3, var7, var3, this.field633);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field633 + var7 - var4, this.field653, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bi.x(I)V")
    public final void method775() {
        class51.method178(this.field645);
        Canvas var1 = this.field645;
        var1.removeMouseListener(class60.field661);
        var1.removeMouseMotionListener(class60.field661);
        var1.removeFocusListener(class60.field661);
        class60.field663 = 0;
        if (this.field652 != null) {
            this.field652.method663(this.field645);
        }
        this.method804();
        class51.method28(this.field645);
        class60.method703(this.field645);
        if (this.field652 != null) {
            this.field652.method661(this.field645);
        }
        this.method816();
    }

    @ObfuscatedName("bi.w(IIII)V")
    public final void method907(int arg0, int arg1, int arg2) {
        try {
            if (field624 != null) {
                field657++;
                if (field657 >= 3) {
                    this.method773("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field624 = this;
            Statics.field9 = arg0;
            Statics.field342 = arg1;
            Statics.field2146 = arg2;
            Statics.field2148 = this;
            if (Statics.field636 == null) {
                Statics.field636 = new class166();
            }
            Statics.field636.method2985(this, 1);
        } catch (Exception var5) {
            class164.method482((String) null, var5);
            this.method773("crash");
        }
    }

    @ObfuscatedName("bi.j(I)V")
    public final synchronized void method804() {
        Container var1 = this.method796();
        if (this.field645 != null) {
            this.field645.removeFocusListener(this);
            var1.remove(this.field645);
        }
        Statics.field9 = Math.max(var1.getWidth(), this.field637);
        Statics.field342 = Math.max(var1.getHeight(), this.field641);
        if (this.field644 != null) {
            Insets var2 = this.field644.getInsets();
            Statics.field9 -= var2.right + var2.left;
            Statics.field342 -= var2.top + var2.bottom;
        }
        this.field645 = new class54(this);
        var1.add(this.field645);
        this.field645.setSize(Statics.field9, Statics.field342);
        this.field645.setVisible(true);
        this.field645.setBackground(Color.BLACK);
        if (this.field644 == var1) {
            Insets var3 = this.field644.getInsets();
            this.field645.setLocation(this.field638 + var3.left, this.field623 + var3.top);
        } else {
            this.field645.setLocation(this.field638, this.field623);
        }
        this.field645.addFocusListener(this);
        this.field645.requestFocus();
        this.field646 = true;
        if (Statics.field3926 != null && Statics.field9 == Statics.field3926.field3883 && Statics.field342 == Statics.field3926.field3885) {
            ((class58) Statics.field3926).method759(this.field645);
            Statics.field3926.method751(0, 0);
        } else {
            Statics.field3926 = new class58(Statics.field9, Statics.field342, this.field645);
        }
        this.field650 = false;
        this.field627 = class196.method3211();
    }

    @ObfuscatedName("bi.z(B)Z")
    public final boolean method777() {
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
                this.method773("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2159 != null) {
                String var1 = Statics.field2159.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field313;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method773("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class305.method1028(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class305.method1627(var4)) {
                            int var5 = class305.method2952(var4, 10, true);
                            if (var5 < 10) {
                                this.method773("wrongjava");
                                return;
                            }
                        }
                    }
                    field634 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method804();
            this.method790();
            class172 var6;
            try {
                var6 = new class161();
            } catch (Throwable var10) {
                var6 = new class162();
            }
            Statics.field629 = var6;
            while (field626 == 0L || class196.method3211() < field626) {
                Statics.field625 = Statics.field629.method2940(field630, field634);
                for (int var8 = 0; var8 < Statics.field625; var8++) {
                    this.method764();
                }
                this.method780();
                this.method839(this.field645);
            }
        } catch (Exception var11) {
            class164.method482((String) null, var11);
            this.method773("crash");
        }
        this.method783();
    }

    @ObfuscatedName("bi.e(I)V")
    public void method764() {
        long var1 = class196.method3211();
        long var3 = field635[Statics.field707];
        field635[Statics.field707] = var1;
        Statics.field707 = Statics.field707 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field2177 = field628;
        }
        this.method870();
    }

    @ObfuscatedName("bi.k(B)V")
    public void method780() {
        Container var1 = this.method796();
        long var2 = class196.method3211();
        long var4 = field640[Statics.field1291];
        field640[Statics.field1291] = var2;
        Statics.field1291 = Statics.field1291 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field632 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field648 - 1 > 50) {
            field648 -= 50;
            this.field646 = true;
            this.field645.setSize(Statics.field9, Statics.field342);
            this.field645.setVisible(true);
            if (this.field644 == var1) {
                Insets var7 = this.field644.getInsets();
                this.field645.setLocation(this.field638 + var7.left, this.field623 + var7.top);
            } else {
                this.field645.setLocation(this.field638, this.field623);
            }
        }
        if (this.field650) {
            this.method775();
        }
        this.method781();
        this.method791(this.field646);
        if (this.field646) {
            this.method774();
        }
        this.field646 = false;
    }

    @ObfuscatedName("bi.ao(I)V")
    public final void method781() {
        class316 var1 = this.method797();
        if (this.field653 != var1.field3863 || this.field633 != var1.field3862 || this.field649) {
            this.method772();
            this.field649 = false;
        }
    }

    @ObfuscatedName("bi.am(B)V")
    public final void method816() {
        this.field649 = true;
    }

    @ObfuscatedName("bi.aj(I)V")
    public final synchronized void method783() {
        if (field655) {
            return;
        }
        field655 = true;
        try {
            this.field645.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method792();
        } catch (Exception var7) {
        }
        if (this.field644 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field636 != null) {
            try {
                Statics.field636.method3000();
            } catch (Exception var5) {
            }
        }
        this.method799();
    }

    public final void start() {
        if (field624 == this && !field655) {
            field626 = 0L;
        }
    }

    public final void stop() {
        if (field624 == this && !field655) {
            field626 = class196.method3211() + 4000L;
        }
    }

    public final void destroy() {
        if (field624 == this && !field655) {
            field626 = class196.method3211();
            class202.method141(5000L);
            this.method783();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field624 != this || field655) {
            return;
        }
        this.field646 = true;
        if (class196.method3211() - this.field627 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field9 && var2.height >= Statics.field342) {
                this.field650 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field628 = true;
        this.field646 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field628 = false;
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

    @ObfuscatedName("bi.ak(ILjava/lang/String;ZI)V")
    public final void method807(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field645.getGraphics();
            if (Statics.field614 == null) {
                Statics.field614 = new Font("Helvetica", 1, 13);
                Statics.field2444 = this.field645.getFontMetrics(Statics.field614);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field9, Statics.field342);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field647 == null) {
                    Statics.field647 = this.field645.createImage(304, 34);
                }
                Graphics var6 = Statics.field647.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field614);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field2444.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field647, Statics.field9 / 2 - 152, Statics.field342 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field9 / 2 - 152;
                int var9 = Statics.field342 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field614);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field2444.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field645.repaint();
        }
    }

    @ObfuscatedName("bi.al(I)V")
    public final void method794() {
        Statics.field647 = null;
        Statics.field614 = null;
        Statics.field2444 = null;
    }

    @ObfuscatedName("bi.as(Ljava/lang/String;I)V")
    public void method773(String arg0) {
        if (this.field639) {
            return;
        }
        this.field639 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bi.au(I)Ljava/awt/Container;")
    public Container method796() {
        return this.field644 == null ? this : this.field644;
    }

    @ObfuscatedName("bi.ac(I)Llq;")
    public class316 method797() {
        Container var1 = this.method796();
        int var2 = Math.max(var1.getWidth(), this.field637);
        int var3 = Math.max(var1.getHeight(), this.field641);
        if (this.field644 != null) {
            Insets var4 = this.field644.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class316(var2, var3);
    }

    @ObfuscatedName("bi.ay(B)Z")
    public final boolean method798() {
        return this.field644 != null;
    }

    @ObfuscatedName("aj.at(I)I")
    public static int method255() {
        int var0 = 0;
        if (Statics.field431 == null || !Statics.field431.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field431 = var2;
                        field651 = -1L;
                        field656 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field431 != null) {
            long var4 = class196.method3211();
            long var6 = Statics.field431.getCollectionTime();
            if (field656 != -1L) {
                long var8 = var6 - field656;
                long var10 = var4 - field651;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field656 = var6;
            field651 = var4;
        }
        return var0;
    }

    public abstract void init();

    @ObfuscatedName("bi.ah(I)V")
    public abstract void method790();

    @ObfuscatedName("bi.ai(ZB)V")
    public abstract void method791(boolean arg0);

    @ObfuscatedName("bi.aq(I)V")
    public abstract void method792();

    @ObfuscatedName("bi.aa(I)V")
    public abstract void method799();

    @ObfuscatedName("bi.f(I)V")
    public abstract void method865();

    @ObfuscatedName("bi.af(I)V")
    public abstract void method870();
}
