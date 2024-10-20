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

@ObfuscatedName("bs")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("bs.ad")
    public static class35 field174 = null;

    @ObfuscatedName("bs.ag")
    public static int field187 = 0;

    @ObfuscatedName("bs.ak")
    public static long field168 = 0L;

    @ObfuscatedName("bs.ap")
    public static boolean field172 = false;

    @ObfuscatedName("bs.an")
    public boolean field185 = false;

    @ObfuscatedName("bs.av")
    public static int field178 = 20;

    @ObfuscatedName("bs.ab")
    public static int field201 = 1;

    @ObfuscatedName("bs.ai")
    public static int field176 = 0;

    @ObfuscatedName("bs.ah")
    public static long[] field177 = new long[32];

    @ObfuscatedName("bs.ax")
    public static long[] field179 = new long[32];

    @ObfuscatedName("bs.ay")
    public int field180;

    @ObfuscatedName("bs.ao")
    public int field197;

    @ObfuscatedName("bs.aa")
    public int field181 = 0;

    @ObfuscatedName("bs.as")
    public int field183 = 0;

    @ObfuscatedName("bs.af")
    public int field184;

    @ObfuscatedName("bs.am")
    public int field175;

    @ObfuscatedName("bs.ar")
    public int field186;

    @ObfuscatedName("bs.bt")
    public int field182;

    @ObfuscatedName("bs.bj")
    public boolean field188 = false;

    @ObfuscatedName("bs.bo")
    public Frame field190;

    @ObfuscatedName("bs.bi")
    public Canvas field191;

    @ObfuscatedName("bs.ba")
    public volatile boolean field192 = true;

    @ObfuscatedName("bs.bs")
    public static int field193 = 500;

    @ObfuscatedName("bs.bp")
    public boolean field194 = false;

    @ObfuscatedName("bs.bx")
    public volatile boolean field195 = false;

    @ObfuscatedName("bs.bu")
    public volatile long field196 = 0L;

    @ObfuscatedName("bs.bl")
    public class22 field171;

    @ObfuscatedName("bs.bc")
    public Clipboard field198;

    @ObfuscatedName("bs.bv")
    public final EventQueue field170;

    @ObfuscatedName("bs.bb")
    public static volatile boolean field200 = true;

    @ObfuscatedName("bs.bh")
    public static class26 field199 = new class26();

    @ObfuscatedName("bs.bd")
    public static long field202 = -1L;

    @ObfuscatedName("bs.bz")
    public static long field203 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field170 = var1;
        class23 var3 = new class23();
        Statics.field910 = var3;
    }

    @ObfuscatedName("bs.aj(III)V")
    public final void method481(int arg0, int arg1) {
        if (this.field186 != arg0 || this.field182 != arg1) {
            this.method504();
        }
        this.field186 = arg0;
        this.field182 = arg1;
    }

    @ObfuscatedName("bs.av(Ljava/lang/Object;B)V")
    public final void method482(Object arg0) {
        if (this.field170 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field170.peekEvent() != null; var2++) {
            class328.method3390(1L);
        }
        if (arg0 != null) {
            this.field170.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("bs.ab(B)Liv;")
    public class219 method532() {
        if (this.field171 == null) {
            this.field171 = new class22();
            this.field171.method298(this.field191);
        }
        return this.field171;
    }

    @ObfuscatedName("bs.ai(B)V")
    public void method484() {
        this.field198 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("bs.ae(Ljava/lang/String;I)V")
    public void method552(String arg0) {
        this.field198.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("bs.au(B)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method486() {
        return this.field198;
    }

    @ObfuscatedName("bs.ah(I)V")
    public final void method487() {
        if (Statics.field2343.toLowerCase().indexOf("microsoft") == -1) {
            class29.field139[44] = 71;
            class29.field139[45] = 26;
            class29.field139[46] = 72;
            class29.field139[47] = 73;
            class29.field139[59] = 57;
            class29.field139[61] = 27;
            class29.field139[91] = 42;
            class29.field139[92] = 74;
            class29.field139[93] = 43;
            class29.field139[192] = 28;
            class29.field139[222] = 58;
            class29.field139[520] = 59;
        } else {
            class29.field139[186] = 57;
            class29.field139[187] = 27;
            class29.field139[188] = 71;
            class29.field139[189] = 26;
            class29.field139[190] = 72;
            class29.field139[191] = 73;
            class29.field139[192] = 58;
            class29.field139[219] = 42;
            class29.field139[220] = 74;
            class29.field139[221] = 43;
            class29.field139[222] = 59;
            class29.field139[223] = 28;
        }
        field199.method373(this.field191);
    }

    @ObfuscatedName("cz.az(I)I")
    public static final int method2058() {
        return field199.method350();
    }

    @ObfuscatedName("bs.ax(I)V")
    public final void method488() {
        field199.method383();
    }

    @ObfuscatedName("bs.ac(Lbm;II)V")
    public void method489(class30 arg0, int arg1) {
        field199.method349(arg0, arg1);
    }

    @ObfuscatedName("bs.al(B)V")
    public final void method490() {
        class36.method7254(this.field191);
    }

    @ObfuscatedName("bs.ay(B)V")
    public final void method528() {
        Container var1 = this.method514();
        if (var1 == null) {
            return;
        }
        class420 var2 = this.method515();
        this.field180 = Math.max(var2.field4686, this.field184);
        this.field197 = Math.max(var2.field4689, this.field175);
        if (this.field180 <= 0) {
            this.field180 = 1;
        }
        if (this.field197 <= 0) {
            this.field197 = 1;
        }
        Statics.field890 = Math.min(this.field180, this.field186);
        Statics.field5 = Math.min(this.field197, this.field182);
        this.field181 = (this.field180 - Statics.field890) / 2;
        this.field183 = 0;
        this.field191.setSize(Statics.field890, Statics.field5);
        Statics.field4766 = new class33(Statics.field890, Statics.field5, this.field191, this.field188);
        if (this.field190 == var1) {
            Insets var3 = this.field190.getInsets();
            this.field191.setLocation(this.field181 + var3.left, this.field183 + var3.top);
        } else {
            this.field191.setLocation(this.field181, this.field183);
        }
        this.field192 = true;
        this.method492();
    }

    @ObfuscatedName("bs.aa(I)V")
    public void method493() {
        int var1 = this.field181;
        int var2 = this.field183;
        int var3 = this.field180 - Statics.field890 - var1;
        int var4 = this.field197 - Statics.field5 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method514();
            int var6 = 0;
            int var7 = 0;
            if (this.field190 == var5) {
                Insets var8 = this.field190.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field197);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field180, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field180 + var6 - var3, var7, var3, this.field197);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field197 + var7 - var4, this.field180, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("bs.as(I)V")
    public final void method494() {
        field199.method352(this.field191);
        class36.method869(this.field191);
        if (this.field171 != null) {
            this.field171.method299(this.field191);
        }
        this.method496();
        field199.method373(this.field191);
        class36.method7254(this.field191);
        if (this.field171 != null) {
            this.field171.method298(this.field191);
        }
        this.method504();
    }

    @ObfuscatedName("bs.aw(IIIIB)V")
    public final void method495(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field174 != null) {
                field187++;
                if (field187 >= 3) {
                    this.method627("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field174 = this;
            Statics.field890 = arg0;
            Statics.field5 = arg1;
            Statics.field83 = arg2;
            Statics.field5518 = arg3;
            Statics.field4726 = this;
            if (Statics.field173 == null) {
                Statics.field173 = new class216();
            }
            Statics.field173.method3880(this, 1);
        } catch (Exception var6) {
            class572.method7807((String) null, var6);
            this.method627("crash");
        }
    }

    @ObfuscatedName("bs.at(B)V")
    public final synchronized void method496() {
        Container var1 = this.method514();
        if (this.field191 != null) {
            this.field191.removeFocusListener(this);
            var1.remove(this.field191);
        }
        Statics.field890 = Math.max(var1.getWidth(), this.field184);
        Statics.field5 = Math.max(var1.getHeight(), this.field175);
        if (this.field190 != null) {
            Insets var2 = this.field190.getInsets();
            Statics.field890 -= var2.right + var2.left;
            Statics.field5 -= var2.top + var2.bottom;
        }
        this.field191 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field191);
        this.field191.setSize(Statics.field890, Statics.field5);
        this.field191.setVisible(true);
        this.field191.setBackground(Color.BLACK);
        if (this.field190 == var1) {
            Insets var3 = this.field190.getInsets();
            this.field191.setLocation(this.field181 + var3.left, this.field183 + var3.top);
        } else {
            this.field191.setLocation(this.field181, this.field183);
        }
        this.field191.addFocusListener(this);
        this.field191.requestFocus();
        this.field192 = true;
        if (Statics.field4766 != null && Statics.field890 == Statics.field4766.field5443 && Statics.field5 == Statics.field4766.field5442) {
            ((class33) Statics.field4766).method460(this.field191);
            Statics.field4766.method461(0, 0);
        } else {
            Statics.field4766 = new class33(Statics.field890, Statics.field5, this.field191, this.field188);
        }
        this.field195 = false;
        this.field196 = class327.method4500();
    }

    @ObfuscatedName("bs.af(ZI)V")
    public void method497(boolean arg0) {
        if (this.field188 != arg0) {
            this.field188 = arg0;
            Statics.field4766.method9128(arg0);
            Statics.field4766.method9127();
        }
    }

    @ObfuscatedName("bs.am(B)Z")
    public final boolean method498() {
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
                this.method627("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field2343 != null) {
                String var1 = Statics.field2343.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field2346;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method627("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class416.method4577(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class416.method2403(var4) && class416.method6702(var4) < 10) {
                            this.method627("wrongjava");
                            return;
                        }
                    }
                    field201 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method496();
            this.method507();
            Statics.field1694 = class229.method6752();
            while (field168 == 0L || class327.method4500() < field168) {
                Statics.field1749 = Statics.field1694.method3802(field178, field201);
                for (int var5 = 0; var5 < Statics.field1749; var5++) {
                    this.method500();
                }
                this.method502();
                this.method482(this.field191);
            }
        } catch (Exception var7) {
            class572.method7807((String) null, var7);
            this.method627("crash");
        }
        this.method519();
    }

    @ObfuscatedName("bs.ar(I)V")
    public void method500() {
        long var1 = class327.method4500();
        long var3 = field179[Statics.field3644];
        field179[Statics.field3644] = var1;
        Statics.field3644 = Statics.field3644 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field5071 = field200;
        }
        this.method480();
    }

    @ObfuscatedName("bs.bt(I)V")
    public final void method501() {
        this.field192 = true;
    }

    @ObfuscatedName("bs.bj(I)V")
    public void method502() {
        Container var1 = this.method514();
        long var2 = class327.method4500();
        long var4 = field177[Statics.field169];
        field177[Statics.field169] = var2;
        Statics.field169 = Statics.field169 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field176 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field193 - 1 > 50) {
            field193 -= 50;
            this.field192 = true;
            this.field191.setSize(Statics.field890, Statics.field5);
            this.field191.setVisible(true);
            if (this.field190 == var1) {
                Insets var7 = this.field190.getInsets();
                this.field191.setLocation(this.field181 + var7.left, this.field183 + var7.top);
            } else {
                this.field191.setLocation(this.field181, this.field183);
            }
        }
        if (this.field195) {
            this.method494();
        }
        this.method503();
        this.method509(this.field192);
        if (this.field192) {
            this.method493();
        }
        this.field192 = false;
    }

    @ObfuscatedName("bs.bs(I)V")
    public final void method503() {
        class420 var1 = this.method515();
        if (this.field180 != var1.field4686 || this.field197 != var1.field4689 || this.field194) {
            this.method528();
            this.field194 = false;
        }
    }

    @ObfuscatedName("bs.bp(B)V")
    public final void method504() {
        this.field194 = true;
    }

    @ObfuscatedName("bs.bx(B)V")
    public final synchronized void method519() {
        if (field172) {
            return;
        }
        field172 = true;
        try {
            this.field191.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method545();
        } catch (Exception var7) {
        }
        if (this.field190 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field173 != null) {
            try {
                Statics.field173.method3884();
            } catch (Exception var5) {
            }
        }
        this.method517();
    }

    @ObfuscatedName("sx.bu(I)V")
    public static final void method7817() {
        Statics.field1694.method3803();
        for (int var0 = 0; var0 < 32; var0++) {
            field177[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field179[var1] = 0L;
        }
        Statics.field1749 = 0;
    }

    public final void start() {
        if (field174 == this && !field172) {
            field168 = 0L;
        }
    }

    public final void stop() {
        if (field174 == this && !field172) {
            field168 = class327.method4500() + 4000L;
        }
    }

    public final void destroy() {
        if (field174 == this && !field172) {
            field168 = class327.method4500();
            class328.method3390(5000L);
            this.method519();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field174 != this || field172) {
            return;
        }
        this.field192 = true;
        if (class327.method4500() - this.field196 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field890 && var2.height >= Statics.field5) {
                this.field195 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field200 = true;
        this.field192 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field200 = false;
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

    @ObfuscatedName("bs.bv(ILjava/lang/String;ZZI)V")
    public final void method542(int arg0, String arg1, boolean arg2, boolean arg3) {
        try {
            Graphics var5 = this.field191.getGraphics();
            if (Statics.field1188 == null) {
                Statics.field1188 = new Font("Helvetica", 1, 13);
                Statics.field189 = this.field191.getFontMetrics(Statics.field1188);
            }
            if (arg2 && !arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, Statics.field890, Statics.field5);
            }
            Color var6 = new Color(140, 17, 17);
            try {
                if (Statics.field1876 == null) {
                    Statics.field1876 = this.field191.createImage(304, 34);
                }
                Graphics var7 = Statics.field1876.getGraphics();
                var7.setColor(var6);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var7.setFont(Statics.field1188);
                var7.setColor(Color.white);
                var7.drawString(arg1, (304 - Statics.field189.stringWidth(arg1)) / 2, 22);
                var5.drawImage(Statics.field1876, Statics.field890 / 2 - 152, Statics.field5 / 2 + (arg3 ? 50 : -18), (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = Statics.field890 / 2 - 152;
                int var10 = Statics.field5 / 2 - 18;
                var5.setColor(var6);
                var5.drawRect(var9, var10, 303, 33);
                var5.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var10 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
                var5.setFont(Statics.field1188);
                var5.setColor(Color.white);
                var5.drawString(arg1, var9 + (304 - Statics.field189.stringWidth(arg1)) / 2, var10 + 22);
            }
        } catch (Exception var13) {
            this.field191.repaint();
        }
    }

    @ObfuscatedName("bs.bb(I)V")
    public final void method591() {
        Statics.field1876 = null;
        Statics.field1188 = null;
        Statics.field189 = null;
    }

    @ObfuscatedName("bs.bn(Ljava/lang/String;B)V")
    public void method627(String arg0) {
        if (this.field185) {
            return;
        }
        this.field185 = true;
        System.out.println("error_game_" + arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bs.bh(I)Ljava/awt/Container;")
    public Container method514() {
        return this.field190 == null ? this : this.field190;
    }

    @ObfuscatedName("bs.bq(I)Lqa;")
    public class420 method515() {
        Container var1 = this.method514();
        int var2 = Math.max(var1.getWidth(), this.field184);
        int var3 = Math.max(var1.getHeight(), this.field175);
        if (this.field190 != null) {
            Insets var4 = this.field190.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class420(var2, var3);
    }

    @ObfuscatedName("bs.bd(I)Z")
    public final boolean method483() {
        return this.field190 != null;
    }

    @ObfuscatedName("hw.bz(I)I")
    public static int method3371() {
        int var0 = 0;
        if (Statics.field5317 == null || !Statics.field5317.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field5317 = var2;
                        field203 = -1L;
                        field202 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field5317 != null) {
            long var4 = class327.method4500();
            long var6 = Statics.field5317.getCollectionTime();
            if (field202 != -1L) {
                long var8 = var6 - field202;
                long var10 = var4 - field203;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field202 = var6;
            field203 = var4;
        }
        return var0;
    }

    @ObfuscatedName("bs.bw(B)V")
    public abstract void method480();

    @ObfuscatedName("bs.ao(I)V")
    public abstract void method492();

    public abstract void init();

    @ObfuscatedName("bs.by(I)V")
    public abstract void method507();

    @ObfuscatedName("bs.bl(ZI)V")
    public abstract void method509(boolean arg0);

    @ObfuscatedName("bs.bk(I)V")
    public abstract void method517();

    @ObfuscatedName("bs.bc(I)V")
    public abstract void method545();
}
