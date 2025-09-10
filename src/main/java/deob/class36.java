package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfuscatedName("by")
public class class36 implements MouseListener, MouseMotionListener, FocusListener {

	@ObfuscatedName("by.ac")
	public static int field219 = 0;

	@ObfuscatedName("by.ap")
	public static int field232 = 0;

	@ObfuscatedName("by.aq")
	public static int field221 = 0;

	@ObfuscatedName("by.ao")
	public static long field233 = 0L;

	@ObfuscatedName("by.as")
	public static int field223 = 0;

	@ObfuscatedName("by.al")
	public static int field222 = 0;

	@ObfuscatedName("by.au")
	public static int field225 = 0;

	@ObfuscatedName("by.ai")
	public static long field220 = 0L;

	@ObfuscatedName("by.aa")
	public static class36 field227 = new class36();

	@ObfuscatedName("by.am")
	public static volatile int field228 = 0;

	@ObfuscatedName("by.an")
	public static volatile int field229 = 0;

	@ObfuscatedName("by.ar")
	public static volatile int field226 = -1;

	@ObfuscatedName("by.ae")
	public static volatile int field231 = -1;

	@ObfuscatedName("by.ay")
	public static volatile long field238 = -1L;

	@ObfuscatedName("by.ad")
	public static volatile int field236 = 0;

	@ObfuscatedName("by.ag")
	public static volatile int field234 = 0;

	@ObfuscatedName("by.av")
	public static volatile int field235 = 0;

	@ObfuscatedName("by.ah")
	public static volatile long field217 = 0L;

	@ObfuscatedName("gp.aw(I)V")
	public static void method3864() {
		class36 var0 = field227;
		synchronized (field227) {
			field219 = field229;
			field232 = field226;
			field221 = field231;
			field233 = field238;
			field223 = field236;
			field222 = field234;
			field225 = field235;
			field220 = field217;
			field236 = 0;
		}
	}

	@ObfuscatedName("rx.at(I)I")
	public static int method8748() {
		return ++field228 - 1;
	}

	@ObfuscatedName("bx.ac(IB)V")
	public static void method735(int arg0) {
		field228 = arg0;
	}

	@ObfuscatedName("by.ap(Ljava/awt/event/MouseEvent;B)I")
	public final int method686(MouseEvent arg0) {
		int var2 = arg0.getButton();
		if (arg0.isAltDown() || var2 == 2) {
			return 4;
		} else if (arg0.isMetaDown() || var2 == 3) {
			return 2;
		} else {
			return 1;
		}
	}

	public final synchronized void mousePressed(MouseEvent arg0) {
		if (field227 != null) {
			field228 = 0;
			field234 = arg0.getX();
			field235 = arg0.getY();
			field217 = class335.method3987();
			field236 = this.method686(arg0);
			if (field236 != 0) {
				field229 = field236;
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	public final synchronized void mouseReleased(MouseEvent arg0) {
		if (field227 != null) {
			field228 = 0;
			field229 = 0;
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	public final void mouseClicked(MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	public final synchronized void mouseEntered(MouseEvent arg0) {
		this.mouseMoved(arg0);
	}

	public final synchronized void mouseExited(MouseEvent arg0) {
		if (field227 != null) {
			field228 = 0;
			field226 = -1;
			field231 = -1;
			field238 = arg0.getWhen();
		}
	}

	public final synchronized void mouseDragged(MouseEvent arg0) {
		this.mouseMoved(arg0);
	}

	public final synchronized void mouseMoved(MouseEvent arg0) {
		if (field227 != null) {
			field228 = 0;
			field226 = arg0.getX();
			field231 = arg0.getY();
			field238 = arg0.getWhen();
		}
	}

	public final void focusGained(FocusEvent arg0) {
	}

	public final synchronized void focusLost(FocusEvent arg0) {
		if (field227 != null) {
			field229 = 0;
		}
	}
}
