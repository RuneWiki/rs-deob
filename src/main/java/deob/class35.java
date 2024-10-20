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

@ObfuscatedName("br")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

    @ObfuscatedName("br.al")
    public static class35 field181 = null;

    @ObfuscatedName("br.ac")
    public static int field180 = 0;

    @ObfuscatedName("br.ab")
    public static long field183 = 0L;

    @ObfuscatedName("br.an")
    public static boolean field184 = false;

    @ObfuscatedName("br.ao")
    public boolean field185 = false;

    @ObfuscatedName("br.aq")
    public static int field187 = 20;

    @ObfuscatedName("br.ap")
    public static int field188 = 1;

    @ObfuscatedName("br.ar")
    public static int field189 = 0;

    @ObfuscatedName("br.as")
    public static long[] field191 = new long[32];

    @ObfuscatedName("br.am")
    public static long[] field192 = new long[32];

    @ObfuscatedName("br.ae")
    public int field193;

    @ObfuscatedName("br.au")
    public int field194;

    @ObfuscatedName("br.ag")
    public int field195 = 0;

    @ObfuscatedName("br.at")
    public int field196 = 0;

    @ObfuscatedName("br.aw")
    public int field216;

    @ObfuscatedName("br.aa")
    public int field199;

    @ObfuscatedName("br.ah")
    public int field217;

    @ObfuscatedName("br.ad")
    public int field200;

    @ObfuscatedName("br.bo")
    public Frame field202;

    @ObfuscatedName("br.bs")
    public Canvas field203;

    @ObfuscatedName("br.bg")
    public volatile boolean field205 = true;

    @ObfuscatedName("br.bl")
    public static int field201 = 500;

    @ObfuscatedName("br.bk")
    public boolean field206 = false;

    @ObfuscatedName("br.br")
    public volatile boolean field207 = false;

    @ObfuscatedName("br.ba")
    public volatile long field209 = 0L;

    @ObfuscatedName("br.bc")
    public class22 field190;

    @ObfuscatedName("br.bt")
    public Clipboard field210;

    @ObfuscatedName("br.be")
    public final EventQueue field215;

    @ObfuscatedName("br.bu")
    public static volatile boolean field212 = true;

    @ObfuscatedName("br.by")
    public static class26 field213 = new class26();

    @ObfuscatedName("br.bb")
    public static long field214 = -1L;

    @ObfuscatedName("br.bx")
    public static long field182 = -1L;

    public class35() {
        EventQueue var1 = null;
        try {
            var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable var4) {
        }
        this.field215 = var1;
        class23 var3 = new class23();
        Statics.field973 = var3;
    }

    @ObfuscatedName("br.ao(IIB)V")
    public final void method471(int arg0, int arg1) {
        if (this.field217 != arg0 || this.field200 != arg1) {
            this.method541();
        }
        this.field217 = arg0;
        this.field200 = arg1;
    }

    @ObfuscatedName("br.av(Ljava/lang/Object;I)V")
    public final void method553(Object arg0) {
        if (this.field215 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && this.field215.peekEvent() != null; var2++) {
            class291.method1994(1L);
        }
        if (arg0 != null) {
            this.field215.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @ObfuscatedName("br.aq(I)Lgc;")
    public class172 method517() {
        if (this.field190 == null) {
            this.field190 = new class22();
            this.field190.method291(this.field203);
        }
        return this.field190;
    }

    @ObfuscatedName("br.ap(I)V")
    public void method474() {
        this.field210 = this.getToolkit().getSystemClipboard();
    }

    @ObfuscatedName("br.ar(Ljava/lang/String;I)V")
    public void method475(String arg0) {
        this.field210.setContents(new StringSelection(arg0), (ClipboardOwner) null);
    }

    @ObfuscatedName("br.ak(I)Ljava/awt/datatransfer/Clipboard;")
    public Clipboard method476() {
        return this.field210;
    }

    @ObfuscatedName("br.ax(B)V")
    public final void method477() {
        if (Statics.field1809.toLowerCase().indexOf("microsoft") == -1) {
            class29.field149[44] = 71;
            class29.field149[45] = 26;
            class29.field149[46] = 72;
            class29.field149[47] = 73;
            class29.field149[59] = 57;
            class29.field149[61] = 27;
            class29.field149[91] = 42;
            class29.field149[92] = 74;
            class29.field149[93] = 43;
            class29.field149[192] = 28;
            class29.field149[222] = 58;
            class29.field149[520] = 59;
        } else {
            class29.field149[186] = 57;
            class29.field149[187] = 27;
            class29.field149[188] = 71;
            class29.field149[189] = 26;
            class29.field149[190] = 72;
            class29.field149[191] = 73;
            class29.field149[192] = 58;
            class29.field149[219] = 42;
            class29.field149[220] = 74;
            class29.field149[221] = 43;
            class29.field149[222] = 59;
            class29.field149[223] = 28;
        }
        field213.method338(this.field203);
    }

    @ObfuscatedName("br.as(S)V")
    public final void method478() {
        field213.method340();
    }

    @ObfuscatedName("br.ay(Lbs;II)V")
    public void method470(class30 arg0, int arg1) {
        field213.method336(arg0, arg1);
    }

    @ObfuscatedName("br.am(B)V")
    public final void method480() {
        class36.method4193(this.field203);
    }

    @ObfuscatedName("br.az(I)V")
    public final void method619() {
        Container var1 = this.method503();
        if (var1 == null) {
            return;
        }
        class417 var2 = this.method536();
        this.field193 = Math.max(var2.field4589, this.field216);
        this.field194 = Math.max(var2.field4588, this.field199);
        if (this.field193 <= 0) {
            this.field193 = 1;
        }
        if (this.field194 <= 0) {
            this.field194 = 1;
        }
        Statics.field208 = Math.min(this.field193, this.field217);
        Statics.field1637 = Math.min(this.field194, this.field200);
        this.field195 = (this.field193 - Statics.field208) / 2;
        this.field196 = 0;
        this.field203.setSize(Statics.field208, Statics.field1637);
        Statics.field3785 = new class33(Statics.field208, Statics.field1637, this.field203);
        if (this.field202 == var1) {
            Insets var3 = this.field202.getInsets();
            this.field203.setLocation(this.field195 + var3.left, this.field196 + var3.top);
        } else {
            this.field203.setLocation(this.field195, this.field196);
        }
        this.field205 = true;
        this.method482();
    }

    @ObfuscatedName("br.au(B)V")
    public void method588() {
        int var1 = this.field195;
        int var2 = this.field196;
        int var3 = this.field193 - Statics.field208 - var1;
        int var4 = this.field194 - Statics.field1637 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5 = this.method503();
            int var6 = 0;
            int var7 = 0;
            if (this.field202 == var5) {
                Insets var8 = this.field202.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, this.field194);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, this.field193, var2);
            }
            if (var3 > 0) {
                var9.fillRect(this.field193 + var6 - var3, var7, var3, this.field194);
            }
            if (var4 > 0) {
                var9.fillRect(var6, this.field194 + var7 - var4, this.field193, var4);
            }
        } catch (Exception var11) {
        }
    }

    @ObfuscatedName("br.ag(B)V")
    public final void method511() {
        field213.method342(this.field203);
        class36.method3231(this.field203);
        if (this.field190 != null) {
            this.field190.method297(this.field203);
        }
        this.method485();
        field213.method338(this.field203);
        class36.method4193(this.field203);
        if (this.field190 != null) {
            this.field190.method291(this.field203);
        }
        this.method541();
    }

    @ObfuscatedName("br.at(IIIII)V")
    public final void method484(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (field181 != null) {
                field180++;
                if (field180 >= 3) {
                    this.method493("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
            }
            field181 = this;
            Statics.field208 = arg0;
            Statics.field1637 = arg1;
            Statics.field5055 = arg2;
            Statics.field2094 = arg3;
            Statics.field5053 = this;
            if (Statics.field198 == null) {
                Statics.field198 = new class169();
            }
            Statics.field198.method3170(this, 1);
        } catch (Exception var6) {
            class504.method6263((String) null, var6);
            this.method493("crash");
        }
    }

    @ObfuscatedName("br.af(I)V")
    public final synchronized void method485() {
        Container var1 = this.method503();
        if (this.field203 != null) {
            this.field203.removeFocusListener(this);
            var1.remove(this.field203);
        }
        Statics.field208 = Math.max(var1.getWidth(), this.field216);
        Statics.field1637 = Math.max(var1.getHeight(), this.field199);
        if (this.field202 != null) {
            Insets var2 = this.field202.getInsets();
            Statics.field208 -= var2.right + var2.left;
            Statics.field1637 -= var2.top + var2.bottom;
        }
        this.field203 = new class24(this);
        var1.setBackground(Color.BLACK);
        var1.setLayout((LayoutManager) null);
        var1.add(this.field203);
        this.field203.setSize(Statics.field208, Statics.field1637);
        this.field203.setVisible(true);
        this.field203.setBackground(Color.BLACK);
        if (this.field202 == var1) {
            Insets var3 = this.field202.getInsets();
            this.field203.setLocation(this.field195 + var3.left, this.field196 + var3.top);
        } else {
            this.field203.setLocation(this.field195, this.field196);
        }
        this.field203.addFocusListener(this);
        this.field203.requestFocus();
        this.field205 = true;
        if (Statics.field3785 != null && Statics.field208 == Statics.field3785.field4977 && Statics.field1637 == Statics.field3785.field4978) {
            ((class33) Statics.field3785).method444(this.field203);
            Statics.field3785.method452(0, 0);
        } else {
            Statics.field3785 = new class33(Statics.field208, Statics.field1637, this.field203);
        }
        this.field207 = false;
        this.field209 = class290.method4466();
    }

    @ObfuscatedName("br.ai(I)Z")
    public final boolean method486() {
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
                this.method493("invalidhost");
                return false;
            }
        }
    }

    public void run() {
        try {
            if (Statics.field1809 != null) {
                String var1 = Statics.field1809.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = Statics.field1804;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                        this.method493("wrongjava");
                        return;
                    }
                    if (var2.startsWith("1.6.0_")) {
                        int var3;
                        for (var3 = 6; var3 < var2.length() && class368.method421(var2.charAt(var3)); var3++) {
                        }
                        String var4 = var2.substring(6, var3);
                        if (class368.method3084(var4) && class368.method5989(var4) < 10) {
                            this.method493("wrongjava");
                            return;
                        }
                    }
                    field188 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.method485();
            this.method497();
            Statics.field211 = class180.method7218();
            while (field183 == 0L || class290.method4466() < field183) {
                Statics.field186 = Statics.field211.method3095(field187, field188);
                for (int var5 = 0; var5 < Statics.field186; var5++) {
                    this.method488();
                }
                this.method489();
                this.method553(this.field203);
            }
        } catch (Exception var7) {
            class504.method6263((String) null, var7);
            this.method493("crash");
        }
        this.method523();
    }

    @ObfuscatedName("br.aw(I)V")
    public void method488() {
        long var1 = class290.method4466();
        long var3 = field192[Statics.field1895];
        field192[Statics.field1895] = var1;
        Statics.field1895 = Statics.field1895 + 1 & 0x1F;
        if (var3 != 0L && var1 > var3) {
        }
        synchronized (this) {
            Statics.field3427 = field212;
        }
        this.method498();
    }

    @ObfuscatedName("br.aa(I)V")
    public void method489() {
        Container var1 = this.method503();
        long var2 = class290.method4466();
        long var4 = field191[Statics.field2348];
        field191[Statics.field2348] = var2;
        Statics.field2348 = Statics.field2348 + 1 & 0x1F;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            field189 = ((var6 >> 1) + 32000) / var6;
        }
        if (++field201 - 1 > 50) {
            field201 -= 50;
            this.field205 = true;
            this.field203.setSize(Statics.field208, Statics.field1637);
            this.field203.setVisible(true);
            if (this.field202 == var1) {
                Insets var7 = this.field202.getInsets();
                this.field203.setLocation(this.field195 + var7.left, this.field196 + var7.top);
            } else {
                this.field203.setLocation(this.field195, this.field196);
            }
        }
        if (this.field207) {
            this.method511();
        }
        this.method483();
        this.method550(this.field205);
        if (this.field205) {
            this.method588();
        }
        this.field205 = false;
    }

    @ObfuscatedName("br.ah(I)V")
    public final void method483() {
        class417 var1 = this.method536();
        if (this.field193 != var1.field4589 || this.field194 != var1.field4588 || this.field206) {
            this.method619();
            this.field206 = false;
        }
    }

    @ObfuscatedName("br.ad(I)V")
    public final void method541() {
        this.field206 = true;
    }

    @ObfuscatedName("br.bm(B)V")
    public final synchronized void method523() {
        if (field184) {
            return;
        }
        field184 = true;
        try {
            this.field203.removeFocusListener(this);
        } catch (Exception var8) {
        }
        try {
            this.method613();
        } catch (Exception var7) {
        }
        if (this.field202 != null) {
            try {
                System.exit(0);
            } catch (Throwable var6) {
            }
        }
        if (Statics.field198 != null) {
            try {
                Statics.field198.method3175();
            } catch (Exception var5) {
            }
        }
        this.method506();
    }

    @ObfuscatedName("me.bl(I)V")
    public static final void method5785() {
        Statics.field211.method3089();
        for (int var0 = 0; var0 < 32; var0++) {
            field191[var0] = 0L;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            field192[var1] = 0L;
        }
        Statics.field186 = 0;
    }

    public final void start() {
        if (field181 == this && !field184) {
            field183 = 0L;
        }
    }

    public final void stop() {
        if (field181 == this && !field184) {
            field183 = class290.method4466() + 4000L;
        }
    }

    public final void destroy() {
        if (field181 == this && !field184) {
            field183 = class290.method4466();
            class291.method1994(5000L);
            this.method523();
        }
    }

    public final void update(Graphics arg0) {
        this.paint(arg0);
    }

    public final synchronized void paint(Graphics arg0) {
        if (field181 != this || field184) {
            return;
        }
        this.field205 = true;
        if (class290.method4466() - this.field209 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= Statics.field208 && var2.height >= Statics.field1637) {
                this.field207 = true;
            }
        }
    }

    public final void focusGained(FocusEvent arg0) {
        field212 = true;
        this.field205 = true;
    }

    public final void focusLost(FocusEvent arg0) {
        field212 = false;
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

    @ObfuscatedName("br.bq(ILjava/lang/String;ZS)V")
    public final void method521(int arg0, String arg1, boolean arg2) {
        try {
            Graphics var4 = this.field203.getGraphics();
            if (Statics.field3443 == null) {
                Statics.field3443 = new Font("Helvetica", 1, 13);
                Statics.field1614 = this.field203.getFontMetrics(Statics.field3443);
            }
            if (arg2) {
                var4.setColor(Color.black);
                var4.fillRect(0, 0, Statics.field208, Statics.field1637);
            }
            Color var5 = new Color(140, 17, 17);
            try {
                if (Statics.field3687 == null) {
                    Statics.field3687 = this.field203.createImage(304, 34);
                }
                Graphics var6 = Statics.field3687.getGraphics();
                var6.setColor(var5);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(Statics.field3443);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - Statics.field1614.stringWidth(arg1)) / 2, 22);
                var4.drawImage(Statics.field3687, Statics.field208 / 2 - 152, Statics.field1637 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = Statics.field208 / 2 - 152;
                int var9 = Statics.field1637 / 2 - 18;
                var4.setColor(var5);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - arg0 * 3, 30);
                var4.setFont(Statics.field3443);
                var4.setColor(Color.white);
                var4.drawString(arg1, var8 + (304 - Statics.field1614.stringWidth(arg1)) / 2, var9 + 22);
            }
        } catch (Exception var12) {
            this.field203.repaint();
        }
    }

    @ObfuscatedName("br.bc(B)V")
    public final void method501() {
        Statics.field3687 = null;
        Statics.field3443 = null;
        Statics.field1614 = null;
    }

    @ObfuscatedName("br.bt(Ljava/lang/String;I)V")
    public void method493(String arg0) {
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

    @ObfuscatedName("br.be(I)Ljava/awt/Container;")
    public Container method503() {
        return this.field202 == null ? this : this.field202;
    }

    @ObfuscatedName("br.bu(I)Lqy;")
    public class417 method536() {
        Container var1 = this.method503();
        int var2 = Math.max(var1.getWidth(), this.field216);
        int var3 = Math.max(var1.getHeight(), this.field199);
        if (this.field202 != null) {
            Insets var4 = this.field202.getInsets();
            var2 -= var4.right + var4.left;
            var3 -= var4.top + var4.bottom;
        }
        return new class417(var2, var3);
    }

    @ObfuscatedName("br.bd(I)Z")
    public final boolean method598() {
        return this.field202 != null;
    }

    @ObfuscatedName("ei.by(I)I")
    public static int method2561() {
        int var0 = 0;
        if (Statics.field1592 == null || !Statics.field1592.isValid()) {
            try {
                Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                while (var1.hasNext()) {
                    GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
                    if (var2.isValid()) {
                        Statics.field1592 = var2;
                        field182 = -1L;
                        field214 = -1L;
                    }
                }
            } catch (Throwable var12) {
            }
        }
        if (Statics.field1592 != null) {
            long var4 = class290.method4466();
            long var6 = Statics.field1592.getCollectionTime();
            if (field214 != -1L) {
                long var8 = var6 - field214;
                long var10 = var4 - field182;
                if (var10 != 0L) {
                    var0 = (int) (var8 * 100L / var10);
                }
            }
            field214 = var6;
            field182 = var4;
        }
        return var0;
    }

    @ObfuscatedName("br.ae(I)V")
    public abstract void method482();

    public abstract void init();

    @ObfuscatedName("br.bk(I)V")
    public abstract void method497();

    @ObfuscatedName("br.br(B)V")
    public abstract void method498();

    @ObfuscatedName("br.bp(B)V")
    public abstract void method506();

    @ObfuscatedName("br.ba(ZS)V")
    public abstract void method550(boolean arg0);

    @ObfuscatedName("br.bz(B)V")
    public abstract void method613();
}
