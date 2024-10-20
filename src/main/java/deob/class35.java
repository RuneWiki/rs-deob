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
import java.net.URL;

@ObfuscatedName("bm")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bm.ah")
    public static class35 field183 = null;

    @ObfuscatedName("bm.ar")
    public static int field203 = 0;

    @ObfuscatedName("bm.ao")
    public static long field174 = 0L;

    @ObfuscatedName("bm.ab")
    public static boolean field175 = false;

    @ObfuscatedName("bm.au")
    public boolean field176 = false;

    @ObfuscatedName("bm.ac")
    public static int field202 = 20;

    @ObfuscatedName("bm.al")
    public static int field189 = 1;

    @ObfuscatedName("bm.az")
    public static int field201 = 0;

    @ObfuscatedName("bm.ax")
    public static long[] field181 = new long[32];

    @ObfuscatedName("bm.ay")
    public static long[] field179 = new long[32];

    @ObfuscatedName("bm.aj")
    public int field184;

    @ObfuscatedName("bm.am")
    public int field185;

    @ObfuscatedName("bm.aq")
    public int field186 = 0;

    @ObfuscatedName("bm.ai")
    public int field178 = 0;

    @ObfuscatedName("bm.an")
    public int field188;

    @ObfuscatedName("bm.ag")
    public int field196;

    @ObfuscatedName("bm.ad")
    public int field190;

    @ObfuscatedName("bm.af")
    public int field191;

    @ObfuscatedName("bm.be")
    public boolean field171 = false;

    @ObfuscatedName("bm.bi")
    public Frame field193;

    @ObfuscatedName("bm.bv")
    public Canvas field194;

    @ObfuscatedName("bm.bf")
    public volatile boolean field192 = true;

    @ObfuscatedName("bm.ba")
    public static int field187 = 500;

    @ObfuscatedName("bm.bm")
    public boolean field197 = false;

    @ObfuscatedName("bm.bp")
    public volatile boolean field198 = false;

    @ObfuscatedName("bm.bw")
    public volatile long field199 = 0L;

    @ObfuscatedName("bm.bo")
    public class22 field200;

    @ObfuscatedName("bm.bt")
    public Clipboard field173;

    @ObfuscatedName("bm.bu")
    public final EventQueue field205;

    @ObfuscatedName("bm.by")
    public static volatile boolean field180 = true;

    @ObfuscatedName("bm.bz")
    public static class26 field204 = new class26();

    @ObfuscatedName("bm.bs")
    public static long field172 = -1L;

    @ObfuscatedName("bm.bx")
    public static long field206 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field205 = var1;
        class23 var3 = new class23();
        Statics.field269 = var3;
    }

    @ObfuscatedName("bm.ao(IIB)V")
    public final void method491(int arg0, int arg1) {
        if (this.field190 != arg0 || this.field191 != arg1) {
            this.method514();
        }
        this.field190 = arg0;
        this.field191 = arg1;
    }

    @ObfuscatedName("bm.ab(Ljava/lang/Object;I)V")
    public final void method622(Object arg0) {
        if (this.field205 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field205.peekEvent() != null; var2++) {
            class314.method3920(1L);
        }
        if (arg0 != null) {
            this.field205.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bm.au(I)Lis;")
    public class213 method493() {
        if (this.field200 == null) {
            this.field200 = new class22();
            this.field200.method299(this.field194);
        }
        return this.field200;
    }

    @ObfuscatedName("bm.aa(I)V")
    public void method555() {
        this.field173 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bm.ac(Ljava/lang/String;B)V")
    public void method495(String arg0) {
        this.field173.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bm.al(B)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method492() {
        return this.field173;
    }

    @ObfuscatedName("bm.az(B)V")
    public final void method535() {
        if (Statics.field2269.toLowerCase().indexOf("microsoft") == -1) {
            class29.field147[44] = 71;
            class29.field147[45] = 26;
            class29.field147[46] = 72;
            class29.field147[47] = 73;
            class29.field147[59] = 57;
            class29.field147[61] = 27;
            class29.field147[91] = 42;
            class29.field147[92] = 74;
            class29.field147[93] = 43;
            class29.field147[192] = 28;
            class29.field147[222] = 58;
            class29.field147[520] = 59;
        } else {
            class29.field147[186] = 57;
            class29.field147[187] = 27;
            class29.field147[188] = 71;
            class29.field147[189] = 26;
            class29.field147[190] = 72;
            class29.field147[191] = 73;
            class29.field147[192] = 58;
            class29.field147[219] = 42;
            class29.field147[220] = 74;
            class29.field147[221] = 43;
            class29.field147[222] = 59;
            class29.field147[223] = 28;
        }
        field204.method355(this.field194);
    }

    @ObfuscatedName("gd.ap(B)I")
    public static final int method3345() {
        return field204.method354();
    }

    @ObfuscatedName("bm.av(I)V")
    public final void method561() {
        field204.method352();
    }

    @ObfuscatedName("bm.ax(Lbi;II)V")
    public void method499(class30 arg0, int arg1) {
        field204.method373(arg0, arg1);
    }

    @ObfuscatedName("bm.as(B)V")
    public final void method500() {
        Canvas var1 = this.field194;
        var1.addMouseListener(class36.field225);
        var1.addMouseMotionListener(class36.field225);
        var1.addFocusListener(class36.field225);
    }

    @ObfuscatedName("bm.ay(S)V")
    public final void method501() {
        Container var1 = this.method527();
        if (var1 == null) {
            return;
        }
        class458 var2 = this.method549();
        this.field184 = Math.max(var2.field4755, this.field188);
        this.field185 = Math.max(var2.field4757, this.field196);
        if (this.field184 <= 0) {
            this.field184 = 1;
        }
        if (this.field185 <= 0) {
            this.field185 = 1;
        }
        Statics.field4410 = Math.min(this.field184, this.field190);
        Statics.field321 = Math.min(this.field185, this.field191);
        this.field186 = (this.field184 - Statics.field4410) / 2;
        this.field178 = 0;
        this.field194.setSize(Statics.field4410, Statics.field321);
        Statics.field3588 = new class33(Statics.field4410, Statics.field321, this.field194, this.field171);
        if (this.field193 == var1) {
            Insets var3 = this.field193.getInsets();
            this.field194.setLocation(this.field186 + var3.left, this.field178 + var3.top);
        } else {
            this.field194.setLocation(this.field186, this.field178);
        }
        this.field192 = true;
        this.method502();
    }

    @ObfuscatedName("bm.aj(I)V")
    public void method503() {
        int var1 = this.field186;
        int var2 = this.field178;
        int var3 = this.field184 - Statics.field4410 - var1;
        int var4 = this.field185 - Statics.field321 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method527();
            int var6 = 0;
            int var7 = 0;
            if (this.field193 == var5) {
                Insets var8 = this.field193.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field185);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field184, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field184 + var6 - var3, var7, var3, this.field185);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field185 + var7 - var4, this.field184, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bm.am(I)V")
    public final void method504() {
        field204.method356(this.field194);
        class36.method5660(this.field194);
        if (this.field200 != null) {
            this.field200.method300(this.field194);
        }
        this.method580();
        field204.method355(this.field194);
        Canvas var1 = this.field194;
        var1.addMouseListener(class36.field225);
        var1.addMouseMotionListener(class36.field225);
        var1.addFocusListener(class36.field225);
        if (this.field200 != null) {
            this.field200.method299(this.field194);
        }
        this.method514();
    }

    @ObfuscatedName("bm.aq(IIIII)V")
    public final void method505(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field183 != null) {
                field203++;
                if (field203 >= 3) {
                    this.method526("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field183 = this;
            Statics.field4410 = arg0;
            Statics.field321 = arg1;
            Statics.field1639 = arg2;
            Statics.field5302 = arg3;
            Statics.field5298 = this;
            if (Statics.field195 == null) {
                Statics.field195 = new class210();
            }
            Statics.field195.method3875(this, 1);
        } catch (Exception var6) {
            class553.method6436((String) null, var6);
            this.method526("crash");
        }
    }

    @ObfuscatedName("bm.ai(I)V")
    public final synchronized void method580() {
        Container var1 = this.method527();
        if (this.field194 != null) {
            this.field194.removeFocusListener(this);
            var1.remove(this.field194);
        }
        Statics.field4410 = Math.max(var1.getWidth(), this.field188);
        Statics.field321 = Math.max(var1.getHeight(), this.field196);
        if (this.field193 != null) {
            Insets var2 = this.field193.getInsets();
            Statics.field4410 -= var2.right + var2.left;
            Statics.field321 -= var2.top + var2.bottom;
        }
        this.field194 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field194);
        this.field194.setSize(Statics.field4410, Statics.field321);
        this.field194.setVisible(true);
        this.field194.setBackground(Color.BLACK);
        if (this.field193 == var1) {
            Insets var3 = this.field193.getInsets();
            this.field194.setLocation(this.field186 + var3.left, this.field178 + var3.top);
        } else {
            this.field194.setLocation(this.field186, this.field178);
        }
        this.field194.addFocusListener(this);
        this.field194.requestFocus();
        this.field192 = true;
        if (Statics.field3588 != null && Statics.field4410 == Statics.field3588.field5217 && Statics.field321 == Statics.field3588.field5216) {
            ((class33) Statics.field3588).method468(this.field194);
            Statics.field3588.method469(0, 0);
        } else {
            Statics.field3588 = new class33(Statics.field4410, Statics.field321, this.field194, this.field171);
        }
        this.field198 = false;
        this.field199 = class313.method3460();
    }

    @ObfuscatedName("bm.aw(ZI)V")
    public void method507(boolean arg0) {
        if (this.field171 != arg0) {
            this.field171 = arg0;
            Statics.field3588.method8845(arg0);
            Statics.field3588.method8844();
        }
    }

    @ObfuscatedName("bm.ae(I)Z")
    public final boolean method508() {
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
                this.method526("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2269 != null) {
                String var1 = Statics.field2269.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2271;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method526("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class399.method2318(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class399.method5309(var4) && class399.method6184(var4) < 10) {
                            this.method526("wrongjava");
                            return;
                        }
                    }
                    field189 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method580();
            this.method520();
            Statics.field4264 = class221.method834();
            while (field174 == 0L || class313.method3460() < field174) {
                Statics.field177 = Statics.field4264.method3785(field202, field189);
                for (int var5 = 0; var5 < Statics.field177; var5++) {
                    this.method651();
                }
                this.method569();
                this.method622(this.field194);
            }
        } catch (Exception var7) {
            class553.method6436((String) null, var7);
            this.method526("crash");
        }
        this.method515();
    }

    @ObfuscatedName("bm.an(I)V")
    public void method651() {
        long var1 = class313.method3460();
        long var3 = field179[Statics.field89];
        field179[Statics.field89] = var1;
        Statics.field89 = Statics.field89 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3897 = field180;
        }
        this.method595();
    }

    @ObfuscatedName("bm.ag(B)V")
    public final void method511() {
        this.field192 = true;
    }

    @ObfuscatedName("bm.ad(I)V")
    public void method569() {
        Container var1 = this.method527();
        long var2 = class313.method3460();
        long var4 = field181[Statics.field182];
        field181[Statics.field182] = var2;
        Statics.field182 = Statics.field182 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field201 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field187 - 1 > 50) {
            field187 -= 50;
            this.field192 = true;
            this.field194.setSize(Statics.field4410, Statics.field321);
            this.field194.setVisible(true);
            if (this.field193 == var1) {
                Insets var7 = this.field193.getInsets();
                this.field194.setLocation(this.field186 + var7.left, this.field178 + var7.top);
            } else {
                this.field194.setLocation(this.field186, this.field178);
            }
        }
        if (this.field198) {
            this.method504();
        }
        this.method584();
        this.method497(this.field192);
        if (this.field192) {
            this.method503();
        }
        this.field192 = false;
    }

    @ObfuscatedName("bm.af(I)V")
    public final void method584() {
        class458 var1 = this.method549();
        if (this.field184 != var1.field4755 || this.field185 != var1.field4757 || this.field197) {
            this.method501();
            this.field197 = false;
        }
    }

    @ObfuscatedName("bm.be(I)V")
    public final void method514() {
        this.field197 = true;
    }

    @ObfuscatedName("bm.bd(I)V")
    public final synchronized void method515() {
        if (field175) {
            return;
        }
        field175 = true;
        try {
            this.field194.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method603();
        } catch (Exception var7) {
        }
        if (this.field193 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field195 != null) {
            try {
                Statics.field195.method3871();
            } catch (Exception var5) {
            }
        }
        this.method529();
    }

    @ObfuscatedName("jf.ba(S)V")
    public static final void method4369() {
        Statics.field4264.method3790();
        for (int var0 = 0; var0 < 32; var0++) {
            field181[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field179[var1] = 0L;
        }
        Statics.field177 = 0;
    }

    public final void start() {
        if (field183 == this && !field175) {
            field174 = 0L;
        }
    }

    public final void stop() {
        if (field183 == this && !field175) {
            field174 = class313.method3460() + 4000L;
        }
    }

    public final void destroy() {
        if (field183 == this && !field175) {
            field174 = class313.method3460();
            class314.method3920(5000L);
            this.method515();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field183 != this || field175) {
            return;
        }
        this.field192 = true;
        if (class313.method3460() - this.field199 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field4410 && var2.height >= Statics.field321) {
                this.field198 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field180 = true;
        this.field192 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field180 = false;
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
    public final void method524(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field194.getGraphics();
            if (Statics.field148 == null) {
                Statics.field148 = new Font("Helvetica", 1, 13);
                Statics.field11 = this.field194.getFontMetrics(Statics.field148);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field4410, Statics.field321);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field1683 == null) {
                    Statics.field1683 = this.field194.createImage(304, 34);
                }
                Graphics var6 = Statics.field1683.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field148);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field11.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field1683, Statics.field4410 / 2 - 152, Statics.field321 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field4410 / 2 - 152;
                int var9 = Statics.field321 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field148);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field11.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field194.repaint();
        }
    }

    @ObfuscatedName("bm.bo(I)V")
    public final void method509() {
        Statics.field1683 = null;
        Statics.field148 = null;
        Statics.field11 = null;
    }

    @ObfuscatedName("bm.bt(Ljava/lang/String;B)V")
    public void method526(String arg0) {
        if (this.field176) {
            return;
        }
        this.field176 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bm.bu(S)Ljava/awt/Container;")
    public Container method527() {
        return this.field193 == null ? this : this.field193;
    }

    @ObfuscatedName("bm.by(B)Lrv;")
    public class458 method549() {
        Container var1 = this.method527();
        int var2 = Math.max(var1.getWidth(), this.field188);
        int var3 = Math.max(var1.getHeight(), this.field196);
        if (this.field193 != null) {
            Insets var4 = this.field193.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class458(var2, var3);
    }

    @ObfuscatedName("bm.bh(B)Z")
    public final boolean method528() {
        return this.field193 != null;
    }

    @ObfuscatedName("bm.bw(ZI)V")
    public abstract void method497(boolean arg0);

    @ObfuscatedName("bm.ak(B)V")
    public abstract void method502();

    public abstract void init();

    @ObfuscatedName("bm.bm(I)V")
    public abstract void method520();

    @ObfuscatedName("bm.bc(B)V")
    public abstract void method529();

    @ObfuscatedName("bm.bp(I)V")
    public abstract void method595();

    @ObfuscatedName("bm.bj(I)V")
    public abstract void method603();
}
