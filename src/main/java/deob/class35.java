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

@ObfuscatedName("bq")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bq.ay")
    public static class35 field201 = null;

    @ObfuscatedName("bq.ar")
    public static int field202 = 0;

    @ObfuscatedName("bq.am")
    public static long field217 = 0L;

    @ObfuscatedName("bq.as")
    public static boolean field204 = false;

    @ObfuscatedName("bq.aj")
    public boolean field205 = false;

    @ObfuscatedName("bq.az")
    public static int field200 = 20;

    @ObfuscatedName("bq.av")
    public static int field207 = 1;

    @ObfuscatedName("bq.ap")
    public static int field208 = 0;

    @ObfuscatedName("bq.ah")
    public static long[] field209 = new long[32];

    @ObfuscatedName("bq.aa")
    public static long[] field210 = new long[32];

    @ObfuscatedName("bq.ae")
    public int field226;

    @ObfuscatedName("bq.ab")
    public int field203;

    @ObfuscatedName("bq.ad")
    public int field213 = 0;

    @ObfuscatedName("bq.ao")
    public int field223 = 0;

    @ObfuscatedName("bq.an")
    public int field215;

    @ObfuscatedName("bq.af")
    public int field216;

    @ObfuscatedName("bq.ai")
    public int field220;

    @ObfuscatedName("bq.al")
    public int field218;

    @ObfuscatedName("bq.bd")
    public boolean field211 = false;

    @ObfuscatedName("bq.ba")
    public Frame field212;

    @ObfuscatedName("bq.bf")
    public Canvas field221;

    @ObfuscatedName("bq.bs")
    public volatile boolean field222 = true;

    @ObfuscatedName("bq.bv")
    public static int field219 = 500;

    @ObfuscatedName("bq.bq")
    public boolean field224 = false;

    @ObfuscatedName("bq.bo")
    public volatile boolean field225 = false;

    @ObfuscatedName("bq.br")
    public volatile long field230 = 0L;

    @ObfuscatedName("bq.bc")
    public class22 field232;

    @ObfuscatedName("bq.bi")
    public Clipboard field228;

    @ObfuscatedName("bq.bu")
    public final EventQueue field229;

    @ObfuscatedName("bq.bk")
    public static volatile boolean field227 = true;

    @ObfuscatedName("bq.bx")
    public static class26 field231 = new class26();

    @ObfuscatedName("bq.bm")
    public static long field234 = -1L;

    @ObfuscatedName("bq.bl")
    public static long field233 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field229 = var1;
        class43.method3371(new class23());
    }

    @ObfuscatedName("bq.az(III)V")
    public final void method466(int arg0, int arg1) {
        if (this.field220 != arg0 || this.field218 != arg1) {
            this.method487();
        }
        this.field220 = arg0;
        this.field218 = arg1;
    }

    @ObfuscatedName("bq.av(Ljava/lang/Object;I)V")
    public final void method541(Object arg0) {
        if (this.field229 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field229.peekEvent() != null; var2++) {
            class304.method173(1L);
        }
        if (arg0 != null) {
            this.field229.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bq.ap(I)Lgf;")
    public class175 method532() {
        if (this.field232 == null) {
            this.field232 = new class22();
            this.field232.method295(this.field221);
        }
        return this.field232;
    }

    @ObfuscatedName("bq.aq(B)V")
    public void method469() {
        this.field228 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bq.at(Ljava/lang/String;I)V")
    public void method613(String arg0) {
        this.field228.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bq.ah(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method471() {
        return this.field228;
    }

    @ObfuscatedName("bq.ax(I)V")
    public final void method472() {
        class29.method5253();
        field231.method341(this.field221);
    }

    @ObfuscatedName("ay.aa(I)I")
    public static final int method12() {
        return field231.method340();
    }

    @ObfuscatedName("bq.au(S)V")
    public final void method473() {
        field231.method343();
    }

    @ObfuscatedName("bq.ae(Lba;II)V")
    public void method474(class30 arg0, int arg1) {
        field231.method338(arg0, arg1);
    }

    @ObfuscatedName("bq.ab(B)V")
    public final void method478() {
        class36.method6022(this.field221);
    }

    @ObfuscatedName("bq.ad(I)V")
    public final void method476() {
        Container var1 = this.method503();
        if (var1 == null) {
            return;
        }
        class447 var2 = this.method556();
        this.field226 = Math.max(var2.field4724, this.field215);
        this.field203 = Math.max(var2.field4722, this.field216);
        if (this.field226 <= 0) {
            this.field226 = 1;
        }
        if (this.field203 <= 0) {
            this.field203 = 1;
        }
        Statics.field4328 = Math.min(this.field226, this.field220);
        Statics.field4883 = Math.min(this.field203, this.field218);
        this.field213 = (this.field226 - Statics.field4328) / 2;
        this.field223 = 0;
        this.field221.setSize(Statics.field4328, Statics.field4883);
        Statics.field1742 = new class33(Statics.field4328, Statics.field4883, this.field221, this.field211);
        if (this.field212 == var1) {
            Insets var3 = this.field212.getInsets();
            this.field221.setLocation(this.field213 + var3.left, this.field223 + var3.top);
        } else {
            this.field221.setLocation(this.field213, this.field223);
        }
        this.field222 = true;
        this.method477();
    }

    @ObfuscatedName("bq.ac(B)V")
    public void method576() {
        int var1 = this.field213;
        int var2 = this.field223;
        int var3 = this.field226 - Statics.field4328 - var1;
        int var4 = this.field203 - Statics.field4883 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method503();
            int var6 = 0;
            int var7 = 0;
            if (this.field212 == var5) {
                Insets var8 = this.field212.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field203);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field226, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field226 + var6 - var3, var7, var3, this.field203);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field203 + var7 - var4, this.field226, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bq.ak(I)V")
    public final void method479() {
        field231.method342(this.field221);
        Canvas var1 = this.field221;
        var1.removeMouseListener(class36.field236);
        var1.removeMouseMotionListener(class36.field236);
        var1.removeFocusListener(class36.field236);
        class36.field240 = 0;
        if (this.field232 != null) {
            this.field232.method293(this.field221);
        }
        this.method481();
        field231.method341(this.field221);
        class36.method6022(this.field221);
        if (this.field232 != null) {
            this.field232.method295(this.field221);
        }
        this.method487();
    }

    @ObfuscatedName("bq.an(IIIIB)V")
    public final void method480(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field201 != null) {
                field202++;
                if (field202 >= 3) {
                    this.method489("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field201 = this;
            Statics.field4328 = arg0;
            Statics.field4883 = arg1;
            Statics.field5234 = arg2;
            Statics.field5236 = arg3;
            Statics.field5239 = this;
            if (Statics.field206 == null) {
                Statics.field206 = new class172();
            }
            Statics.field206.method3205(this, 1);
        } catch (Exception var6) {
            class541.method5458((String) null, var6);
            this.method489("crash");
        }
    }

    @ObfuscatedName("bq.af(I)V")
    public final synchronized void method481() {
        Container var1 = this.method503();
        if (this.field221 != null) {
            this.field221.removeFocusListener(this);
            var1.remove(this.field221);
        }
        Statics.field4328 = Math.max(var1.getWidth(), this.field215);
        Statics.field4883 = Math.max(var1.getHeight(), this.field216);
        if (this.field212 != null) {
            Insets var2 = this.field212.getInsets();
            Statics.field4328 -= var2.right + var2.left;
            Statics.field4883 -= var2.top + var2.bottom;
        }
        this.field221 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field221);
        this.field221.setSize(Statics.field4328, Statics.field4883);
        this.field221.setVisible(true);
        this.field221.setBackground(Color.BLACK);
        if (this.field212 == var1) {
            Insets var3 = this.field212.getInsets();
            this.field221.setLocation(this.field213 + var3.left, this.field223 + var3.top);
        } else {
            this.field221.setLocation(this.field213, this.field223);
        }
        this.field221.addFocusListener(this);
        this.field221.requestFocus();
        this.field222 = true;
        if (Statics.field1742 != null && Statics.field4328 == Statics.field1742.field5146 && Statics.field4883 == Statics.field1742.field5148) {
            ((class33) Statics.field1742).method451(this.field221);
            Statics.field1742.method453(0, 0);
        } else {
            Statics.field1742 = new class33(Statics.field4328, Statics.field4883, this.field221, this.field211);
        }
        this.field225 = false;
        this.field230 = class303.method2705();
    }

    @ObfuscatedName("bq.ai(ZI)V")
    public void method482(boolean arg0) {
        if (this.field211 != arg0) {
            this.field211 = arg0;
            Statics.field1742.method8660(arg0);
            Statics.field1742.method8659();
        }
    }

    @ObfuscatedName("bq.al(B)Z")
    public final boolean method483() {
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
                this.method489("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1826 != null) {
                String var1 = Statics.field1826.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1823;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method489("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class388.method3115(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class388.method4188(var4) && class388.method5252(var4) < 10) {
                            this.method489("wrongjava");
                            return;
                        }
                    }
                    field207 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method481();
            this.method496();
            class183 var5;
            try {
                var5 = new class169();
            } catch (Throwable var9) {
                var5 = new class180();
            }
            Statics.field2085 = var5;
            while (field217 == 0L || class303.method2705() < field217) {
                Statics.field3477 = Statics.field2085.method3121(field200, field207);
                for (int var7 = 0; var7 < Statics.field3477; var7++) {
                    this.method484();
                }
                this.method508();
                this.method541(this.field221);
            }
        } catch (Exception var10) {
            class541.method5458((String) null, var10);
            this.method489("crash");
        }
        this.method488();
    }

    @ObfuscatedName("bq.bd(I)V")
    public void method484() {
        long var1 = class303.method2705();
        long var3 = field210[Statics.field7];
        field210[Statics.field7] = var1;
        Statics.field7 = Statics.field7 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3546 = field227;
        }
        this.method497();
    }

    @ObfuscatedName("bq.bb(I)V")
    public void method508() {
        Container var1 = this.method503();
        long var2 = class303.method2705();
        long var4 = field209[Statics.field3349];
        field209[Statics.field3349] = var2;
        Statics.field3349 = Statics.field3349 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field208 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field219 - 1 > 50) {
            field219 -= 50;
            this.field222 = true;
            this.field221.setSize(Statics.field4328, Statics.field4883);
            this.field221.setVisible(true);
            if (this.field212 == var1) {
                Insets var7 = this.field212.getInsets();
                this.field221.setLocation(this.field213 + var7.left, this.field223 + var7.top);
            } else {
                this.field221.setLocation(this.field213, this.field223);
            }
        }
        if (this.field225) {
            this.method479();
        }
        this.method502();
        this.method498(this.field222);
        if (this.field222) {
            this.method576();
        }
        this.field222 = false;
    }

    @ObfuscatedName("bq.bn(I)V")
    public final void method502() {
        class447 var1 = this.method556();
        if (this.field226 != var1.field4724 || this.field203 != var1.field4722 || this.field224) {
            this.method476();
            this.field224 = false;
        }
    }

    @ObfuscatedName("bq.ba(I)V")
    public final void method487() {
        this.field224 = true;
    }

    @ObfuscatedName("bq.bq(B)V")
    public final synchronized void method488() {
        if (field204) {
            return;
        }
        field204 = true;
        try {
            this.field221.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method574();
        } catch (Exception var7) {
        }
        if (this.field212 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field206 != null) {
            try {
                Statics.field206.method3203();
            } catch (Exception var5) {
            }
        }
        this.method559();
    }

    @ObfuscatedName("ha.bo(I)V")
    public static final void method3347() {
        Statics.field2085.method3120();
        for (int var0 = 0; var0 < 32; var0++) {
            field209[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field210[var1] = 0L;
        }
        Statics.field3477 = 0;
    }

    public final void start() {
        if (field201 == this && !field204) {
            field217 = 0L;
        }
    }

    public final void stop() {
        if (field201 == this && !field204) {
            field217 = class303.method2705() + 4000L;
        }
    }

    public final void destroy() {
        if (field201 == this && !field204) {
            field217 = class303.method2705();
            class304.method173(5000L);
            this.method488();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field201 != this || field204) {
            return;
        }
        this.field222 = true;
        if (class303.method2705() - this.field230 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field4328 && var2.height >= Statics.field4883) {
                this.field225 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field227 = true;
        this.field222 = true;
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

    @ObfuscatedName("bq.bi(ILjava/lang/String;ZB)V")
    public final void method499(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field221.getGraphics();
            if (Statics.field333 == null) {
                Statics.field333 = new Font("Helvetica", 1, 13);
                Statics.field82 = this.field221.getFontMetrics(Statics.field333);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field4328, Statics.field4883);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field4804 == null) {
                    Statics.field4804 = this.field221.createImage(304, 34);
                }
                Graphics var6 = Statics.field4804.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field333);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field82.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field4804, Statics.field4328 / 2 - 152, Statics.field4883 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field4328 / 2 - 152;
                int var9 = Statics.field4883 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field333);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field82.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field221.repaint();
        }
    }

    @ObfuscatedName("bq.bu(B)V")
    public final void method627() {
        Statics.field4804 = null;
        Statics.field333 = null;
        Statics.field82 = null;
    }

    @ObfuscatedName("bq.bk(Ljava/lang/String;I)V")
    public void method489(String arg0) {
        if (this.field205) {
            return;
        }
        this.field205 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bq.bz(I)Ljava/awt/Container;")
    public Container method503() {
        return this.field212 == null ? this : this.field212;
    }

    @ObfuscatedName("bq.bx(I)Lrk;")
    public class447 method556() {
        Container var1 = this.method503();
        int var2 = Math.max(var1.getWidth(), this.field215);
        int var3 = Math.max(var1.getHeight(), this.field216);
        if (this.field212 != null) {
            Insets var4 = this.field212.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class447(var2, var3);
    }

    @ObfuscatedName("bq.bh(I)Z")
    public final boolean method505() {
        return this.field212 != null;
    }

    @ObfuscatedName("bb.bm(I)I")
    public static int method395() {
        int var0 = 0;
        if (Statics.field1446 == null || !Statics.field1446.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1446 = var2;
                        field233 = -1L;
                        field234 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1446 != null) {
            long var4 = class303.method2705();
            long var6 = Statics.field1446.getCollectionTime();
            if (field234 != -1L) {
                long var8 = var6 - field234;
                long var10 = var4 - field233;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field234 = var6;
            field233 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bq.ao(B)V")
    public abstract void method477();

    public abstract void init();

    @ObfuscatedName("bq.br(B)V")
    public abstract void method496();

    @ObfuscatedName("bq.bw(I)V")
    public abstract void method497();

    @ObfuscatedName("bq.be(ZB)V")
    public abstract void method498(boolean arg0);

    @ObfuscatedName("bq.bl(I)V")
    public abstract void method559();

    @ObfuscatedName("bq.bc(B)V")
    public abstract void method574();
}
