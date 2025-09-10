package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("tr")
public abstract class class502 {

	@ObfuscatedName("tr.al")
	public final int field5407;

	@ObfuscatedName("tr.au")
	public int field5402 = 0;

	@ObfuscatedName("tr.ai")
	public class500[] field5401;

	@ObfuscatedName("tr.aa")
	public HashMap field5404;

	@ObfuscatedName("tr.am")
	public HashMap field5405;

	@ObfuscatedName("tr.an")
	public Comparator field5406 = null;

	public class502(int arg0) {
		this.field5407 = arg0;
		this.field5401 = this.method9170(arg0);
		this.field5404 = new HashMap(arg0 / 8);
		this.field5405 = new HashMap(arg0 / 8);
	}

	@ObfuscatedName("tr.bd(I)V")
	public void method9262() {
		this.field5402 = 0;
		Arrays.fill(this.field5401, null);
		this.field5404.clear();
		this.field5405.clear();
	}

	@ObfuscatedName("tr.ba(B)I")
	public int method9263() {
		return this.field5402;
	}

	@ObfuscatedName("tr.bb(I)Z")
	public boolean method9284() {
		return this.field5407 == this.field5402;
	}

	@ObfuscatedName("tr.bo(Lxa;I)Z")
	public boolean method9265(class614 arg0) {
		if (arg0.method11024()) {
			return this.field5404.containsKey(arg0) ? true : this.field5405.containsKey(arg0);
		} else {
			return false;
		}
	}

	@ObfuscatedName("tr.bl(Lxa;B)Ltl;")
	public class500 method9298(class614 arg0) {
		class500 var2 = this.method9267(arg0);
		return var2 == null ? this.method9313(arg0) : var2;
	}

	@ObfuscatedName("tr.by(Lxa;B)Ltl;")
	public class500 method9267(class614 arg0) {
		return arg0.method11024() ? (class500) this.field5404.get(arg0) : null;
	}

	@ObfuscatedName("tr.bg(Lxa;B)Ltl;")
	public class500 method9313(class614 arg0) {
		return arg0.method11024() ? (class500) this.field5405.get(arg0) : null;
	}

	@ObfuscatedName("tr.bx(Lxa;B)Z")
	public final boolean method9269(class614 arg0) {
		class500 var2 = this.method9267(arg0);
		if (var2 == null) {
			return false;
		} else {
			this.method9299(var2);
			return true;
		}
	}

	@ObfuscatedName("tr.bq(Ltl;I)V")
	public final void method9299(class500 arg0) {
		int var2 = this.method9276(arg0);
		if (var2 != -1) {
			this.method9280(var2);
			this.method9277(arg0);
		}
	}

	@ObfuscatedName("tr.bz(Lxa;I)Ltl;")
	public class500 method9301(class614 arg0) {
		return this.method9270(arg0, null);
	}

	@ObfuscatedName("tr.bn(Lxa;Lxa;I)Ltl;")
	public class500 method9270(class614 arg0, class614 arg1) {
		if (this.method9267(arg0) != null) {
			throw new IllegalStateException();
		}
		class500 var3 = this.method9174();
		var3.method9249(arg0, arg1);
		this.method9261(var3);
		this.method9279(var3);
		return var3;
	}

	@ObfuscatedName("tr.be(II)Ltl;")
	public final class500 method9273(int arg0) {
		if (arg0 < 0 || arg0 >= this.field5402) {
			throw new ArrayIndexOutOfBoundsException(arg0);
		}
		return this.field5401[arg0];
	}

	@ObfuscatedName("tr.bh(S)V")
	public final void method9295() {
		if (this.field5406 == null) {
			Arrays.sort(this.field5401, 0, this.field5402);
		} else {
			Arrays.sort(this.field5401, 0, this.field5402, this.field5406);
		}
	}

	@ObfuscatedName("tr.bk(Ltl;Lxa;Lxa;B)V")
	public final void method9278(class500 arg0, class614 arg1, class614 arg2) {
		this.method9277(arg0);
		arg0.method9249(arg1, arg2);
		this.method9279(arg0);
	}

	@ObfuscatedName("tr.bp(Ltl;B)I")
	public final int method9276(class500 arg0) {
		for (int var2 = 0; var2 < this.field5402; var2++) {
			if (this.field5401[var2] == arg0) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("tr.br(Ltl;I)V")
	public final void method9277(class500 arg0) {
		if (this.field5404.remove(arg0.field5398) == null) {
			throw new IllegalStateException();
		} else if (arg0.field5397 != null) {
			this.field5405.remove(arg0.field5397);
		}
	}

	@ObfuscatedName("tr.bv(Ltl;I)V")
	public final void method9261(class500 arg0) {
		this.field5401[++this.field5402 - 1] = arg0;
	}

	@ObfuscatedName("tr.bj(Ltl;B)V")
	public final void method9279(class500 arg0) {
		this.field5404.put(arg0.field5398, arg0);
		if (arg0.field5397 != null) {
			class500 var2 = (class500) this.field5405.put(arg0.field5397, arg0);
			if (var2 != null && arg0 != var2) {
				var2.field5397 = null;
			}
		}
	}

	@ObfuscatedName("tr.bm(II)V")
	public final void method9280(int arg0) {
		this.field5402--;
		if (arg0 < this.field5402) {
			System.arraycopy(this.field5401, arg0 + 1, this.field5401, arg0, this.field5402 - arg0);
		}
	}

	@ObfuscatedName("tr.bf(B)V")
	public final void method9282() {
		this.field5406 = null;
	}

	@ObfuscatedName("tr.bw(Ljava/util/Comparator;I)V")
	public final void method9283(Comparator arg0) {
		if (this.field5406 == null) {
			this.field5406 = arg0;
		} else if (this.field5406 instanceof class501) {
			((class501) this.field5406).method9254(arg0);
		}
	}

	@ObfuscatedName("tr.aw(IB)[Ltl;")
	public abstract class500[] method9170(int arg0);

	@ObfuscatedName("tr.af(I)Ltl;")
	public abstract class500 method9174();
}
