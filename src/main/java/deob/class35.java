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

@ObfuscatedName("bl")
public abstract class class35 extends Applet implements Runnable, FocusListener, WindowListener {

	@ObfuscatedName("bl.at")
	public static int field191 = 20;

	@ObfuscatedName("bl.ac")
	public static int field180 = 0;

	@ObfuscatedName("bl.au")
	public static class35 field184 = null;

	@ObfuscatedName("bl.ai")
	public static int field205 = 0;

	@ObfuscatedName("bl.aa")
	public static long field186 = 0L;

	@ObfuscatedName("bl.am")
	public static boolean field187 = false;

	@ObfuscatedName("bl.ar")
	public static int field188 = 1;

	@ObfuscatedName("bl.ay")
	public static long[] field189 = new long[32];

	@ObfuscatedName("bl.ag")
	public static long[] field185 = new long[32];

	@ObfuscatedName("bl.ak")
	public static int field192 = 500;

	@ObfuscatedName("bl.aj")
	public static volatile boolean field193 = true;

	@ObfuscatedName("bl.az")
	public static class26 field194 = new class26();

	@ObfuscatedName("bl.bs")
	public static long field195 = -1L;

	@ObfuscatedName("bl.bu")
	public static long field196 = -1L;

	@ObfuscatedName("bl.bi")
	public final EventQueue field197;

	@ObfuscatedName("bl.bd")
	public int field198;

	@ObfuscatedName("bl.ba")
	public int field199;

	@ObfuscatedName("bl.bb")
	public boolean field207 = false;

	@ObfuscatedName("bl.bo")
	public boolean field201 = false;

	@ObfuscatedName("bl.bl")
	public int field202 = 0;

	@ObfuscatedName("bl.by")
	public int field200 = 0;

	@ObfuscatedName("bl.bg")
	public int field177;

	@ObfuscatedName("bl.bx")
	public int field211;

	@ObfuscatedName("bl.bq")
	public int field206;

	@ObfuscatedName("bl.bz")
	public int field204;

	@ObfuscatedName("bl.bn")
	public Frame field183;

	@ObfuscatedName("bl.be")
	public Canvas field209;

	@ObfuscatedName("bl.bh")
	public volatile boolean field210 = true;

	@ObfuscatedName("bl.bk")
	public boolean field178 = false;

	@ObfuscatedName("bl.bp")
	public volatile boolean field212 = false;

	@ObfuscatedName("bl.br")
	public volatile long field213 = 0L;

	@ObfuscatedName("bl.bv")
	public class22 field214;

	@ObfuscatedName("bl.bj")
	public Clipboard field215;

	public class35() {
		EventQueue var1 = null;
		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var4) {
		}
		this.field197 = var1;
		class23 var3 = new class23();
		Statics.field2177 = var3;
	}

	@ObfuscatedName("dr.ap(I)I")
	public static final int method2652() {
		return field194.method376();
	}

	@ObfuscatedName("fj.aq(I)V")
	public static final void method3593() {
		Statics.field5742.method5414();
		for (int var0 = 0; var0 < 32; var0++) {
			field189[var0] = 0L;
		}
		for (int var1 = 0; var1 < 32; var1++) {
			field185[var1] = 0L;
		}
		Statics.field4052 = 0;
	}

	@ObfuscatedName("kf.ao(I)I")
	public static int method5563() {
		int var0 = 0;
		if (Statics.field2788 == null || !Statics.field2788.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean) var1.next();
					if (var2.isValid()) {
						Statics.field2788 = var2;
						field196 = -1L;
						field195 = -1L;
					}
				}
			} catch (Throwable var12) {
			}
		}
		if (Statics.field2788 != null) {
			long var4 = class335.method3987();
			long var6 = Statics.field2788.getCollectionTime();
			if (field195 != -1L) {
				long var8 = var6 - field195;
				long var10 = var4 - field196;
				if (var10 != 0L) {
					var0 = (int) (var8 * 100L / var10);
				}
			}
			field195 = var6;
			field196 = var4;
		}
		return var0;
	}

	@ObfuscatedName("bl.as(III)V")
	public final void method586(int arg0, int arg1) {
		if (this.field206 != arg0 || this.field204 != arg1) {
			this.method524();
		}
		this.field206 = arg0;
		this.field204 = arg1;
	}

	@ObfuscatedName("bl.al(Ljava/lang/Object;B)V")
	public final void method504(Object arg0) {
		if (this.field197 == null) {
			return;
		}
		for (int var2 = 0; var2 < 50 && this.field197.peekEvent() != null; var2++) {
			class336.method3770(1L);
		}
		if (arg0 != null) {
			this.field197.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@ObfuscatedName("bl.au(I)Lkx;")
	public class262 method658() {
		if (this.field214 == null) {
			this.field214 = new class22();
			this.field214.method310(this.field209);
		}
		return this.field214;
	}

	@ObfuscatedName("bl.ai(B)V")
	public void method506() {
		this.field215 = this.getToolkit().getSystemClipboard();
	}

	@ObfuscatedName("bl.aa(Ljava/lang/String;B)V")
	public void method554(String arg0) {
		this.field215.setContents(new StringSelection(arg0), null);
	}

	@ObfuscatedName("bl.am(I)Ljava/awt/datatransfer/Clipboard;")
	public Clipboard method680() {
		return this.field215;
	}

	@ObfuscatedName("bl.an(I)V")
	public final void method507() {
		if (Statics.field3093.toLowerCase().indexOf("microsoft") == -1) {
			class28.field130[44] = 71;
			class28.field130[45] = 26;
			class28.field130[46] = 72;
			class28.field130[47] = 73;
			class28.field130[59] = 57;
			class28.field130[61] = 27;
			class28.field130[91] = 42;
			class28.field130[92] = 74;
			class28.field130[93] = 43;
			class28.field130[192] = 28;
			class28.field130[222] = 58;
			class28.field130[520] = 59;
		} else {
			class28.field130[186] = 57;
			class28.field130[187] = 27;
			class28.field130[188] = 71;
			class28.field130[189] = 26;
			class28.field130[190] = 72;
			class28.field130[191] = 73;
			class28.field130[192] = 58;
			class28.field130[219] = 42;
			class28.field130[220] = 74;
			class28.field130[221] = 43;
			class28.field130[222] = 59;
			class28.field130[223] = 28;
		}
		field194.method355(this.field209);
	}

	@ObfuscatedName("bl.ar(I)V")
	public final void method659() {
		field194.method357();
	}

	@ObfuscatedName("bl.ae(Lbi;II)V")
	public void method542(class30 arg0, int arg1) {
		field194.method371(arg0, arg1);
	}

	@ObfuscatedName("bl.ay(B)V")
	public final void method512() {
		Canvas var1 = this.field209;
		var1.addMouseListener(class36.field227);
		var1.addMouseMotionListener(class36.field227);
		var1.addFocusListener(class36.field227);
	}

	@ObfuscatedName("bl.ad(I)V")
	public final void method633() {
		Container var1 = this.method508();
		if (var1 == null) {
			return;
		}
		class450 var2 = this.method539();
		this.field198 = Math.max(var2.field5163, this.field177);
		this.field199 = Math.max(var2.field5164, this.field211);
		if (this.field198 <= 0) {
			this.field198 = 1;
		}
		if (this.field199 <= 0) {
			this.field199 = 1;
		}
		Statics.field208 = Math.min(this.field198, this.field206);
		Statics.field4810 = Math.min(this.field199, this.field204);
		this.field202 = (this.field198 - Statics.field208) / 2;
		this.field200 = 0;
		this.field209.setSize(Statics.field208, Statics.field4810);
		Statics.field182 = new class33(Statics.field208, Statics.field4810, this.field209, this.field207);
		if (this.field183 == var1) {
			Insets var3 = this.field183.getInsets();
			this.field209.setLocation(this.field202 + var3.left, this.field200 + var3.top);
		} else {
			this.field209.setLocation(this.field202, this.field200);
		}
		this.field210 = true;
		this.method511();
	}

	@ObfuscatedName("bl.av(I)V")
	public void method527() {
		int var1 = this.field202;
		int var2 = this.field200;
		int var3 = this.field198 - Statics.field208 - var1;
		int var4 = this.field199 - Statics.field4810 - var2;
		if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
			return;
		}
		try {
			Container var5 = this.method508();
			int var6 = 0;
			int var7 = 0;
			if (this.field183 == var5) {
				Insets var8 = this.field183.getInsets();
				var6 = var8.left;
				var7 = var8.top;
			}
			Graphics var9 = var5.getGraphics();
			var9.setColor(Color.black);
			if (var1 > 0) {
				var9.fillRect(var6, var7, var1, this.field199);
			}
			if (var2 > 0) {
				var9.fillRect(var6, var7, this.field198, var2);
			}
			if (var3 > 0) {
				var9.fillRect(this.field198 + var6 - var3, var7, var3, this.field199);
			}
			if (var4 > 0) {
				var9.fillRect(var6, this.field199 + var7 - var4, this.field198, var4);
			}
		} catch (Exception var11) {
		}
	}

	@ObfuscatedName("bl.ah(B)V")
	public final void method515() {
		field194.method356(this.field209);
		Statics.method9747(this.field209);
		if (this.field214 != null) {
			this.field214.method313(this.field209);
		}
		this.method517();
		field194.method355(this.field209);
		Canvas var1 = this.field209;
		var1.addMouseListener(class36.field227);
		var1.addMouseMotionListener(class36.field227);
		var1.addFocusListener(class36.field227);
		if (this.field214 != null) {
			this.field214.method310(this.field209);
		}
		this.method524();
	}

	@ObfuscatedName("bl.ab(IIIII)V")
	public final void method516(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (field184 != null) {
				field205++;
				if (field205 >= 3) {
					this.method537("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			field184 = this;
			Statics.field208 = arg0;
			Statics.field4810 = arg1;
			Statics.field6086 = arg2;
			Statics.field6089 = arg3;
			Statics.field6092 = this;
			if (Statics.field1567 == null) {
				Statics.field1567 = new class259();
			}
			Statics.field1567.method5505(this, 1);
		} catch (Exception var6) {
			class617.method9413(null, var6);
			this.method537("crash");
		}
	}

	@ObfuscatedName("bl.ax(I)V")
	public final synchronized void method517() {
		Container var1 = this.method508();
		if (this.field209 != null) {
			this.field209.removeFocusListener(this);
			var1.remove(this.field209);
		}
		Statics.field208 = Math.max(var1.getWidth(), this.field177);
		Statics.field4810 = Math.max(var1.getHeight(), this.field211);
		if (this.field183 != null) {
			Insets var2 = this.field183.getInsets();
			Statics.field208 -= var2.right + var2.left;
			Statics.field4810 -= var2.top + var2.bottom;
		}
		this.field209 = new class24(this);
		var1.setBackground(Color.BLACK);
		var1.setLayout(null);
		var1.add(this.field209);
		this.field209.setSize(Statics.field208, Statics.field4810);
		this.field209.setVisible(true);
		this.field209.setBackground(Color.BLACK);
		if (this.field183 == var1) {
			Insets var3 = this.field183.getInsets();
			this.field209.setLocation(this.field202 + var3.left, this.field200 + var3.top);
		} else {
			this.field209.setLocation(this.field202, this.field200);
		}
		this.field209.addFocusListener(this);
		this.field209.requestFocus();
		this.field210 = true;
		if (Statics.field182 != null && Statics.field208 == Statics.field182.field5998 && Statics.field4810 == Statics.field182.field5999) {
			((class33) Statics.field182).method478(this.field209);
			Statics.field182.method479(0, 0);
		} else {
			Statics.field182 = new class33(Statics.field208, Statics.field4810, this.field209, this.field207);
		}
		this.field212 = false;
		this.field213 = class335.method3987();
	}

	@ObfuscatedName("bl.ak(ZI)V")
	public void method518(boolean arg0) {
		if (this.field207 != arg0) {
			this.field207 = arg0;
			Statics.field182.method10767(arg0);
			Statics.field182.method10770();
		}
	}

	@ObfuscatedName("bl.aj(I)Z")
	public final boolean method526() {
		String var1 = this.getDocumentBase().getHost().toLowerCase();
		if (var1.equals("jagex.com") || var1.endsWith(".jagex.com")) {
			return true;
		} else if (var1.equals("runescape.com") || var1.endsWith(".runescape.com")) {
			return true;
		} else if (var1.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (!var1.isEmpty() && var1.charAt(var1.length() - 1) >= '0' && var1.charAt(var1.length() - 1) <= '9') {
				var1 = var1.substring(0, var1.length() - 1);
			}
			if (var1.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method537("invalidhost");
				return false;
			}
		}
	}

	public void run() {
		try {
			if (Statics.field3093 != null) {
				String var1 = Statics.field3093.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = Statics.field1589;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.method537("wrongjava");
						return;
					}
					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class446.method7633(var2.charAt(var3)); var3++) {
						}
						String var4 = var2.substring(6, var3);
						if (class446.method1561(var4) && class446.method4011(var4) < 10) {
							this.method537("wrongjava");
							return;
						}
					}
					field188 = 5;
				}
			}
			this.setFocusCycleRoot(true);
			this.method517();
			this.method682();
			class272 var5;
			try {
				var5 = new class255();
			} catch (Throwable var9) {
				var5 = new class264();
			}
			Statics.field5742 = var5;
			while (field186 == 0L || class335.method3987() < field186) {
				Statics.field4052 = Statics.field5742.method5416(field191, field188);
				for (int var7 = 0; var7 < Statics.field4052; var7++) {
					this.method520();
				}
				this.method522();
				this.method504(this.field209);
			}
		} catch (Exception var10) {
			class617.method9413(null, var10);
			this.method537("crash");
		}
		this.method661();
	}

	@ObfuscatedName("bl.az(B)V")
	public void method520() {
		long var1 = class335.method3987();
		long var3 = field185[Statics.field2250];
		field185[Statics.field2250] = var1;
		Statics.field2250 = Statics.field2250 + 1 & 0x1F;
		if (var3 != 0L && var1 > var3) {
		}
		synchronized (this) {
			Statics.field179 = field193;
		}
		this.method618();
	}

	@ObfuscatedName("bl.bt(B)V")
	public final void method653() {
		this.field210 = true;
	}

	@ObfuscatedName("bl.bs(B)V")
	public void method522() {
		Container var1 = this.method508();
		long var2 = class335.method3987();
		long var4 = field189[Statics.field190];
		field189[Statics.field190] = var2;
		Statics.field190 = Statics.field190 + 1 & 0x1F;
		if (var4 != 0L && var2 > var4) {
			int var6 = (int) (var2 - var4);
			field180 = ((var6 >> 1) + 32000) / var6;
		}
		if (++field192 - 1 > 50) {
			field192 -= 50;
			this.field210 = true;
			this.field209.setSize(Statics.field208, Statics.field4810);
			this.field209.setVisible(true);
			if (this.field183 == var1) {
				Insets var7 = this.field183.getInsets();
				this.field209.setLocation(this.field202 + var7.left, this.field200 + var7.top);
			} else {
				this.field209.setLocation(this.field202, this.field200);
			}
		}
		if (this.field212) {
			this.method515();
		}
		this.method589();
		this.method533(this.field210);
		if (this.field210) {
			this.method527();
		}
		this.field210 = false;
	}

	@ObfuscatedName("bl.bu(B)V")
	public final void method589() {
		class450 var1 = this.method539();
		if (this.field198 != var1.field5163 || this.field199 != var1.field5164 || this.field178) {
			this.method633();
			this.field178 = false;
		}
	}

	@ObfuscatedName("bl.bi(S)V")
	public final void method524() {
		this.field178 = true;
	}

	@ObfuscatedName("bl.bd(B)V")
	public final synchronized void method661() {
		if (field187) {
			return;
		}
		field187 = true;
		try {
			this.field209.removeFocusListener(this);
		} catch (Exception var8) {
		}
		try {
			this.method534();
		} catch (Exception var7) {
		}
		if (this.field183 != null) {
			try {
				System.exit(0);
			} catch (Throwable var6) {
			}
		}
		if (Statics.field1567 != null) {
			try {
				Statics.field1567.method5507();
			} catch (Exception var5) {
			}
		}
		this.method541();
	}

	public final void start() {
		if (field184 == this && !field187) {
			field186 = 0L;
		}
	}

	public final void stop() {
		if (field184 == this && !field187) {
			field186 = class335.method3987() + 4000L;
		}
	}

	public final void destroy() {
		if (field184 == this && !field187) {
			field186 = class335.method3987();
			class336.method3770(5000L);
			this.method661();
		}
	}

	public final void update(Graphics arg0) {
		this.paint(arg0);
	}

	public final synchronized void paint(Graphics arg0) {
		if (field184 != this || field187) {
			return;
		}
		this.field210 = true;
		if (class335.method3987() - this.field213 > 1000L) {
			Rectangle var2 = arg0.getClipBounds();
			if (var2 == null || var2.width >= Statics.field208 && var2.height >= Statics.field4810) {
				this.field212 = true;
			}
		}
	}

	public final void focusGained(FocusEvent arg0) {
		field193 = true;
		this.field210 = true;
	}

	public final void focusLost(FocusEvent arg0) {
		field193 = false;
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

	@ObfuscatedName("bl.by(ILjava/lang/String;ZZI)V")
	public final void method637(int arg0, String arg1, boolean arg2, boolean arg3) {
		try {
			Graphics var5 = this.field209.getGraphics();
			if (Statics.field2078 == null) {
				Statics.field2078 = new Font("Helvetica", 1, 13);
				Statics.field1974 = this.field209.getFontMetrics(Statics.field2078);
			}
			if (arg2 && !arg3) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, Statics.field208, Statics.field4810);
			}
			Color var6 = new Color(140, 17, 17);
			try {
				if (Statics.field5469 == null) {
					Statics.field5469 = this.field209.createImage(304, 34);
				}
				Graphics var7 = Statics.field5469.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, arg0 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				var7.setFont(Statics.field2078);
				var7.setColor(Color.white);
				var7.drawString(arg1, (304 - Statics.field1974.stringWidth(arg1)) / 2, 22);
				var5.drawImage(Statics.field5469, Statics.field208 / 2 - 152, Statics.field4810 / 2 + (arg3 ? 50 : -18), null);
			} catch (Exception var12) {
				int var9 = Statics.field208 / 2 - 152;
				int var10 = Statics.field4810 / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var9, var10, 303, 33);
				var5.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var9 + 1, var10 + 1, 301, 31);
				var5.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - arg0 * 3, 30);
				var5.setFont(Statics.field2078);
				var5.setColor(Color.white);
				var5.drawString(arg1, var9 + (304 - Statics.field1974.stringWidth(arg1)) / 2, var10 + 22);
			}
		} catch (Exception var13) {
			this.field209.repaint();
		}
	}

	@ObfuscatedName("bl.be(I)V")
	public final void method536() {
		Statics.field5469 = null;
		Statics.field2078 = null;
		Statics.field1974 = null;
	}

	@ObfuscatedName("bl.bh(Ljava/lang/String;I)V")
	public void method537(String arg0) {
		if (this.field201) {
			return;
		}
		this.field201 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("bl.bk(I)Ljava/awt/Container;")
	public Container method508() {
		return this.field183 == null ? this : this.field183;
	}

	@ObfuscatedName("bl.bp(B)Lrw;")
	public class450 method539() {
		Container var1 = this.method508();
		int var2 = Math.max(var1.getWidth(), this.field177);
		int var3 = Math.max(var1.getHeight(), this.field211);
		if (this.field183 != null) {
			Insets var4 = this.field183.getInsets();
			var2 -= var4.right + var4.left;
			var3 -= var4.top + var4.bottom;
		}
		return new class450(var2, var3);
	}

	@ObfuscatedName("bl.br(S)Z")
	public final boolean method540() {
		return this.field183 != null;
	}

	@ObfuscatedName("bl.ag(B)V")
	public abstract void method511();

	public abstract void init();

	@ObfuscatedName("bl.bo(ZI)V")
	public abstract void method533(boolean arg0);

	@ObfuscatedName("bl.bl(I)V")
	public abstract void method534();

	@ObfuscatedName("bl.bv(I)V")
	public abstract void method541();

	@ObfuscatedName("bl.bb(I)V")
	public abstract void method618();

	@ObfuscatedName("bl.ba(B)V")
	public abstract void method682();
}
