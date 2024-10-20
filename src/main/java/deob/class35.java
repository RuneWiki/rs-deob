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

    @ObfuscatedName("ba.an")
    public static class35 field179 = null;

    @ObfuscatedName("ba.av")
    public static int field180 = 0;

    @ObfuscatedName("ba.as")
    public static long field181 = 0L;

    @ObfuscatedName("ba.ax")
    public static boolean field190 = false;

    @ObfuscatedName("ba.ap")
    public boolean field183 = false;

    @ObfuscatedName("ba.ak")
    public static int field185 = 20;

    @ObfuscatedName("ba.ae")
    public static int field186 = 1;

    @ObfuscatedName("ba.af")
    public static int field197 = 0;

    @ObfuscatedName("ba.aj")
    public static long[] field188 = new long[32];

    @ObfuscatedName("ba.ac")
    public static long[] field189 = new long[32];

    @ObfuscatedName("ba.ar")
    public int field200;

    @ObfuscatedName("ba.ah")
    public int field191;

    @ObfuscatedName("ba.az")
    public int field192 = 0;

    @ObfuscatedName("ba.au")
    public int field187 = 0;

    @ObfuscatedName("ba.aw")
    public int field194;

    @ObfuscatedName("ba.ay")
    public int field208;

    @ObfuscatedName("ba.al")
    public int field196;

    @ObfuscatedName("ba.am")
    public int field202;

    @ObfuscatedName("ba.bs")
    public boolean field210 = false;

    @ObfuscatedName("ba.bo")
    public Frame field199;

    @ObfuscatedName("ba.bq")
    public Canvas field193;

    @ObfuscatedName("ba.bg")
    public volatile boolean field201 = true;

    @ObfuscatedName("ba.bd")
    public static int field215 = 500;

    @ObfuscatedName("ba.ba")
    public boolean field178 = false;

    @ObfuscatedName("ba.bn")
    public volatile boolean field204 = false;

    @ObfuscatedName("ba.bb")
    public volatile long field207 = 0L;

    @ObfuscatedName("ba.bh")
    public class22 field206;

    @ObfuscatedName("ba.bp")
    public Clipboard field182;

    @ObfuscatedName("ba.bw")
    public final EventQueue field203;

    @ObfuscatedName("ba.bi")
    public static volatile boolean field209 = true;

    @ObfuscatedName("ba.bv")
    public static class26 field198 = new class26();

    @ObfuscatedName("ba.bm")
    public static long field211 = -1L;

    @ObfuscatedName("ba.br")
    public static long field212 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var3) {
        }
        this.field203 = var1;
        class43.method7458(new class23());
    }

    @ObfuscatedName("ba.ab(III)V")
    public final void method524(int arg0, int arg1) {
        if (this.field196 != arg0 || this.field202 != arg1) {
            this.method475();
        }
        this.field196 = arg0;
        this.field202 = arg1;
    }

    @ObfuscatedName("ba.ak(Ljava/lang/Object;B)V")
    public final void method456(Object arg0) {
        if (this.field203 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field203.peekEvent() != null; var2++) {
            class302.method3997(1L);
        }
        if (arg0 != null) {
            this.field203.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("ba.ae(I)Lgp;")
    public class174 method455() {
        if (this.field206 == null) {
            this.field206 = new class22();
            this.field206.method299(this.field193);
        }
        return this.field206;
    }

    @ObfuscatedName("ba.af(I)V")
    public void method608() {
        this.field182 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("ba.ao(Ljava/lang/String;I)V")
    public void method458(String arg0) {
        this.field182.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("ba.aa(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method459() {
        return this.field182;
    }

    @ObfuscatedName("ba.aj(I)V")
    public final void method460() {
        if (Statics.field1819.toLowerCase().indexOf("microsoft") == -1) {
            class29.field151[44] = 71;
            class29.field151[45] = 26;
            class29.field151[46] = 72;
            class29.field151[47] = 73;
            class29.field151[59] = 57;
            class29.field151[61] = 27;
            class29.field151[91] = 42;
            class29.field151[92] = 74;
            class29.field151[93] = 43;
            class29.field151[192] = 28;
            class29.field151[222] = 58;
            class29.field151[520] = 59;
        } else {
            class29.field151[186] = 57;
            class29.field151[187] = 27;
            class29.field151[188] = 71;
            class29.field151[189] = 26;
            class29.field151[190] = 72;
            class29.field151[191] = 73;
            class29.field151[192] = 58;
            class29.field151[219] = 42;
            class29.field151[220] = 74;
            class29.field151[221] = 43;
            class29.field151[222] = 59;
            class29.field151[223] = 28;
        }
        field198.method343(this.field193);
    }

    @ObfuscatedName("ba.ad(I)V")
    public final void method533() {
        field198.method344();
    }

    @ObfuscatedName("ba.ac(Lbo;II)V")
    public void method462(class30 arg0, int arg1) {
        field198.method340(arg0, arg1);
    }

    @ObfuscatedName("ba.ag(I)V")
    public final void method522() {
        class36.method4405(this.field193);
    }

    @ObfuscatedName("ba.ar(I)V")
    public final void method464() {
        Container var1 = this.method492();
        if (var1 == null) {
            return;
        }
        class434 var2 = this.method521();
        this.field200 = Math.max(var2.field4667, this.field194);
        this.field191 = Math.max(var2.field4665, this.field208);
        if (this.field200 <= 0) {
            this.field200 = 1;
        }
        if (this.field191 <= 0) {
            this.field191 = 1;
        }
        Statics.field4720 = Math.min(this.field200, this.field196);
        Statics.field3024 = Math.min(this.field191, this.field202);
        this.field192 = (this.field200 - Statics.field4720) / 2;
        this.field187 = 0;
        this.field193.setSize(Statics.field4720, Statics.field3024);
        Statics.field2978 = new class33(Statics.field4720, Statics.field3024, this.field193, this.field210);
        if (this.field199 == var1) {
            Insets var3 = this.field199.getInsets();
            this.field193.setLocation(this.field192 + var3.left, this.field187 + var3.top);
        } else {
            this.field193.setLocation(this.field192, this.field187);
        }
        this.field201 = true;
        this.method465();
    }

    @ObfuscatedName("ba.az(I)V")
    public void method466() {
        int var1 = this.field192;
        int var2 = this.field187;
        int var3 = this.field200 - Statics.field4720 - var1;
        int var4 = this.field191 - Statics.field3024 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method492();
            int var6 = 0;
            int var7 = 0;
            if (this.field199 == var5) {
                Insets var8 = this.field199.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field191);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field200, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field200 + var6 - var3, var7, var3, this.field191);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field191 + var7 - var4, this.field200, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("ba.au(I)V")
    public final void method467() {
        field198.method352(this.field193);
        class36.method2242(this.field193);
        if (this.field206 != null) {
            this.field206.method307(this.field193);
        }
        this.method542();
        field198.method343(this.field193);
        class36.method4405(this.field193);
        if (this.field206 != null) {
            this.field206.method299(this.field193);
        }
        this.method475();
    }

    @ObfuscatedName("ba.ai(IIIIB)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field179 != null) {
                field180++;
                if (field180 >= 3) {
                    this.method491("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field179 = this;
            Statics.field4720 = arg0;
            Statics.field3024 = arg1;
            Statics.field1755 = arg2;
            Statics.field1774 = arg3;
            Statics.field5178 = this;
            if (Statics.field205 == null) {
                Statics.field205 = new class171();
            }
            Statics.field205.method3180(this, 1);
        } catch (Exception var6) {
            class528.method4947((String) null, var6);
            this.method491("crash");
        }
    }

    @ObfuscatedName("ba.aq(I)V")
    public final synchronized void method542() {
        Container var1 = this.method492();
        if (this.field193 != null) {
            this.field193.removeFocusListener(this);
            var1.remove(this.field193);
        }
        Statics.field4720 = Math.max(var1.getWidth(), this.field194);
        Statics.field3024 = Math.max(var1.getHeight(), this.field208);
        if (this.field199 != null) {
            Insets var2 = this.field199.getInsets();
            Statics.field4720 -= var2.right + var2.left;
            Statics.field3024 -= var2.top + var2.bottom;
        }
        this.field193 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field193);
        this.field193.setSize(Statics.field4720, Statics.field3024);
        this.field193.setVisible(true);
        this.field193.setBackground(Color.BLACK);
        if (this.field199 == var1) {
            Insets var3 = this.field199.getInsets();
            this.field193.setLocation(this.field192 + var3.left, this.field187 + var3.top);
        } else {
            this.field193.setLocation(this.field192, this.field187);
        }
        this.field193.addFocusListener(this);
        this.field193.requestFocus();
        this.field201 = true;
        if (Statics.field2978 != null && Statics.field4720 == Statics.field2978.field5097 && Statics.field3024 == Statics.field2978.field5095) {
            ((class33) Statics.field2978).method442(this.field193);
            Statics.field2978.method433(0, 0);
        } else {
            Statics.field2978 = new class33(Statics.field4720, Statics.field3024, this.field193, this.field210);
        }
        this.field204 = false;
        this.field207 = class301.method4630();
    }

    @ObfuscatedName("ba.aw(ZI)V")
    public void method505(boolean arg0) {
        if (this.field210 != arg0) {
            this.field210 = arg0;
            Statics.field2978.method8552(arg0);
            Statics.field2978.method8555();
        }
    }

    @ObfuscatedName("ba.ay(B)Z")
    public final boolean method471() {
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
                this.method491("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1819 != null) {
                String var1 = Statics.field1819.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1816;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method491("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class385.method3055(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class385.method2955(var4) && class385.method4380(var4) < 10) {
                            this.method491("wrongjava");
                            return;
                        }
                    }
                    field186 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method542();
            this.method485();
            class182 var5;
            try {
                var5 = new class168();
            } catch (Throwable var9) {
                var5 = new class179();
            }
            Statics.field4628 = var5;
            while (field181 == 0L || class301.method4630() < field181) {
                Statics.field184 = Statics.field4628.method3101(field185, field186);
                for (int var7 = 0; var7 < Statics.field184; var7++) {
                    this.method560();
                }
                this.method473();
                this.method456(this.field193);
            }
        } catch (Exception var10) {
            class528.method4947((String) null, var10);
            this.method491("crash");
        }
        this.method476();
    }

    @ObfuscatedName("ba.al(I)V")
    public void method560() {
        long var1 = class301.method4630();
        long var3 = field189[Statics.field1401];
        field189[Statics.field1401] = var1;
        Statics.field1401 = Statics.field1401 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field156 = field209;
        }
        this.method486();
    }

    @ObfuscatedName("ba.bo(I)V")
    public void method473() {
        Container var1 = this.method492();
        long var2 = class301.method4630();
        long var4 = field188[Statics.field4623];
        field188[Statics.field4623] = var2;
        Statics.field4623 = Statics.field4623 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field197 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field215 - 1 > 50) {
            field215 -= 50;
            this.field201 = true;
            this.field193.setSize(Statics.field4720, Statics.field3024);
            this.field193.setVisible(true);
            if (this.field199 == var1) {
                Insets var7 = this.field199.getInsets();
                this.field193.setLocation(this.field192 + var7.left, this.field187 + var7.top);
            } else {
                this.field193.setLocation(this.field192, this.field187);
            }
        }
        if (this.field204) {
            this.method467();
        }
        this.method474();
        this.method548(this.field201);
        if (this.field201) {
            this.method466();
        }
        this.field201 = false;
    }

    @ObfuscatedName("ba.bq(I)V")
    public final void method474() {
        class434 var1 = this.method521();
        if (this.field200 != var1.field4667 || this.field191 != var1.field4665 || this.field178) {
            this.method464();
            this.field178 = false;
        }
    }

    @ObfuscatedName("ba.bg(I)V")
    public final void method475() {
        this.field178 = true;
    }

    @ObfuscatedName("ba.bf(I)V")
    public final synchronized void method476() {
        if (field190) {
            return;
        }
        field190 = true;
        try {
            this.field193.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method488();
        } catch (Exception var7) {
        }
        if (this.field199 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field205 != null) {
            try {
                Statics.field205.method3178();
            } catch (Exception var5) {
            }
        }
        this.method494();
    }

    @ObfuscatedName("ev.bd(I)V")
    public static final void method2774() {
        Statics.field4628.method3100();
        for (int var0 = 0; var0 < 32; var0++) {
            field188[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field189[var1] = 0L;
        }
        Statics.field184 = 0;
    }

    public final void start() {
        if (field179 == this && !field190) {
            field181 = 0L;
        }
    }

    public final void stop() {
        if (field179 == this && !field190) {
            field181 = class301.method4630() + 4000L;
        }
    }

    public final void destroy() {
        if (field179 == this && !field190) {
            field181 = class301.method4630();
            class302.method3997(5000L);
            this.method476();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field179 != this || field190) {
            return;
        }
        this.field201 = true;
        if (class301.method4630() - this.field207 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field4720 && var2.height >= Statics.field3024) {
                this.field204 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field209 = true;
        this.field201 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field209 = false;
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

    @ObfuscatedName("ba.be(ILjava/lang/String;ZI)V")
    public final void method571(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field193.getGraphics();
            if (Statics.field4760 == null) {
                Statics.field4760 = new Font("Helvetica", 1, 13);
                Statics.field1569 = this.field193.getFontMetrics(Statics.field4760);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field4720, Statics.field3024);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field433 == null) {
                    Statics.field433 = this.field193.createImage(304, 34);
                }
                Graphics var6 = Statics.field433.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field4760);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1569.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field433, Statics.field4720 / 2 - 152, Statics.field3024 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field4720 / 2 - 152;
                int var9 = Statics.field3024 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field4760);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1569.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field193.repaint();
        }
    }

    @ObfuscatedName("ba.bh(I)V")
    public final void method493() {
        Statics.field433 = null;
        Statics.field4760 = null;
        Statics.field1569 = null;
    }

    @ObfuscatedName("ba.bp(Ljava/lang/String;I)V")
    public void method491(String arg0) {
        if (this.field183) {
            return;
        }
        this.field183 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("ba.bw(I)Ljava/awt/Container;")
    public Container method492() {
        return this.field199 == null ? this : this.field199;
    }

    @ObfuscatedName("ba.bi(B)Lqs;")
    public class434 method521() {
        Container var1 = this.method492();
        int var2 = Math.max(var1.getWidth(), this.field194);
        int var3 = Math.max(var1.getHeight(), this.field208);
        if (this.field199 != null) {
            Insets var4 = this.field199.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class434(var2, var3);
    }

    @ObfuscatedName("ba.bk(I)Z")
    public final boolean method497() {
        return this.field199 != null;
    }

    @ObfuscatedName("fm.bv(B)I")
    public static int method2871() {
        int var0 = 0;
        if (Statics.field4534 == null || !Statics.field4534.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field4534 = var2;
                        field212 = -1L;
                        field211 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field4534 != null) {
            long var4 = class301.method4630();
            long var6 = Statics.field4534.getCollectionTime();
            if (field211 != -1L) {
                long var8 = var6 - field211;
                long var10 = var4 - field212;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field211 = var6;
            field212 = var4;
        }
        return var0;
    }

    @ObfuscatedName("ba.ah(B)V")
    public abstract void method465();

    public abstract void init();

    @ObfuscatedName("ba.ba(B)V")
    public abstract void method485();

    @ObfuscatedName("ba.bn(B)V")
    public abstract void method486();

    @ObfuscatedName("ba.bx(I)V")
    public abstract void method488();

    @ObfuscatedName("ba.bz(B)V")
    public abstract void method494();

    @ObfuscatedName("ba.bb(ZI)V")
    public abstract void method548(boolean arg0);
}
