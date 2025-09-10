package deob;

import java.util.Arrays;

@ObfuscatedName("ti")
public class class520 {

	@ObfuscatedName("ti.aw")
	public final class575 field5505;

	@ObfuscatedName("ti.at")
	public final boolean field5502;

	@ObfuscatedName("ti.ac")
	public int field5503;

	@ObfuscatedName("ti.ap")
	public int field5504;

	@ObfuscatedName("ti.aq")
	public Object field5501;

	@ObfuscatedName("ti.ao")
	public int[] field5506;

	@ObfuscatedName("ti.as")
	public long[] field5509;

	@ObfuscatedName("ti.al")
	public Object[] field5507;

	public class520(class575 arg0, boolean arg1) {
		this.field5505 = arg0;
		this.field5502 = arg1;
	}

	public class520(class575 arg0, Object arg1, int arg2, int arg3) {
		this.field5502 = true;
		this.field5505 = arg0;
		this.field5504 = arg3;
		this.field5501 = arg1;
		if (class575.field5821 == arg0) {
			this.field5506 = new int[arg3];
		} else if (class575.field5817 == arg0) {
			this.field5509 = new long[arg3];
		} else if (class575.field5825 == arg0) {
			this.field5507 = new String[arg3];
		}
		this.method9585(arg2);
	}

	@ObfuscatedName("ti.af(I)[I")
	public final int[] method9541() {
		return this.field5506;
	}

	@ObfuscatedName("ti.aw(I)[J")
	public final long[] method9543() {
		return this.field5509;
	}

	@ObfuscatedName("ti.at(I)[Ljava/lang/Object;")
	public final Object[] method9544() {
		return this.field5507;
	}

	@ObfuscatedName("ti.ac(I)I")
	public final int method9545() {
		return this.field5503;
	}

	@ObfuscatedName("ti.ap(II)Ljava/lang/Object;")
	public final Object method9546(int arg0) {
		if (class575.field5821 == this.field5505) {
			return this.field5506[arg0];
		} else if (class575.field5817 == this.field5505) {
			return this.field5509[arg0];
		} else {
			return this.field5507[arg0];
		}
	}

	@ObfuscatedName("ti.aq(ILjava/lang/Object;I)V")
	public final void method9586(int arg0, Object arg1) {
		if (class575.field5821 == this.field5505) {
			this.field5506[arg0] = (Integer) arg1;
		} else if (class575.field5817 == this.field5505) {
			this.field5509[arg0] = (Long) arg1;
		} else {
			this.field5507[arg0] = arg1;
		}
	}

	@ObfuscatedName("ti.ao(II)V")
	public final void method9560(int arg0) {
		this.method9578(arg0);
		this.method9585(arg0);
	}

	@ObfuscatedName("ti.as(II)V")
	public final void method9578(int arg0) {
		if (!this.field5502) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 > 5000) {
			throw new RuntimeException();
		} else if (arg0 > this.field5504) {
			this.method9551(this.method9550(arg0));
		}
	}

	@ObfuscatedName("ti.al(IB)I")
	public int method9550(int arg0) {
		int var2 = (this.field5504 >> 1) + this.field5504;
		return Math.max(arg0, Math.min(var2, 5000));
	}

	@ObfuscatedName("ti.au(IB)V")
	public void method9551(int arg0) {
		if (this.field5504 == arg0) {
			return;
		}
		this.field5504 = arg0;
		if (class575.field5821 == this.field5505) {
			this.field5506 = Arrays.copyOf(this.field5506, arg0);
		} else if (class575.field5817 == this.field5505) {
			this.field5509 = Arrays.copyOf(this.field5509, arg0);
		} else if (class575.field5825 == this.field5505) {
			this.field5507 = Arrays.copyOf(this.field5507, arg0);
		}
	}

	@ObfuscatedName("ti.ai(IB)V")
	public final void method9585(int arg0) {
		int var2 = this.field5503;
		this.field5503 = arg0;
		if (arg0 < var2) {
			if (class575.field5821 == this.field5505) {
				Arrays.fill(this.field5506, arg0, var2, 0);
			} else if (class575.field5817 == this.field5505) {
				Arrays.fill(this.field5509, arg0, var2, 0L);
			} else {
				Arrays.fill(this.field5507, arg0, var2, null);
			}
		} else if (arg0 > var2) {
			if (class575.field5821 == this.field5505) {
				int var3 = (Integer) this.field5501;
				if (var3 != 0) {
					Arrays.fill(this.field5506, var2, arg0, var3);
				}
			} else if (class575.field5817 == this.field5505) {
				long var4 = (Long) this.field5501;
				if (var4 != 0L) {
					Arrays.fill(this.field5509, var2, arg0, var4);
				}
			} else if (this.field5501 != null) {
				Arrays.fill(this.field5507, var2, arg0, this.field5501);
			}
		}
	}

	@ObfuscatedName("qv.aa([IB)Lti;")
	public static class520 method7905(int[] arg0) {
		class520 var1 = new class520(class575.field5821, true);
		var1.field5506 = arg0;
		var1.field5503 = arg0.length;
		var1.field5504 = arg0.length;
		return var1;
	}

	@ObfuscatedName("ec.am([JI)Lti;")
	public static class520 method3236(long[] arg0) {
		class520 var1 = new class520(class575.field5817, false);
		var1.field5509 = arg0;
		var1.field5503 = arg0.length;
		var1.field5504 = arg0.length;
		return var1;
	}

	@ObfuscatedName("ld.an([Ljava/lang/String;I)Lti;")
	public static class520 method6337(String[] arg0) {
		class520 var1 = new class520(class575.field5825, false);
		var1.field5507 = arg0;
		var1.field5503 = arg0.length;
		var1.field5504 = arg0.length;
		return var1;
	}

	@ObfuscatedName("ti.ar(Lwb;I)V")
	public void method9552(class591 arg0) {
		arg0.method10321(this.field5503);
		if (class575.field5821 == this.field5505) {
			arg0.method10320(0);
			for (int var2 = 0; var2 < this.field5503; var2++) {
				arg0.method10547(this.field5506[var2]);
			}
		} else if (class575.field5817 == this.field5505) {
			arg0.method10320(1);
			for (int var3 = 0; var3 < this.field5503; var3++) {
				arg0.method10325(this.field5509[var3]);
			}
		} else if (class575.field5825 == this.field5505) {
			arg0.method10320(2);
			for (int var4 = 0; var4 < this.field5503; var4++) {
				arg0.method10504((String) this.field5507[var4]);
			}
		}
	}

	@ObfuscatedName("pd.ae(Lwb;I)Lti;")
	public static class520 method7590(class591 arg0) {
		int var1 = arg0.method10341();
		if (var1 < 0 || var1 > 5000) {
			throw new RuntimeException();
		}
		int var2 = arg0.method10339();
		if (var2 == 0) {
			int[] var3 = new int[var1];
			for (int var4 = 0; var4 < var1; var4++) {
				var3[var4] = arg0.method10345();
			}
			class520 var5 = new class520(class575.field5821, false);
			var5.field5506 = var3;
			var5.field5503 = var3.length;
			var5.field5504 = var3.length;
			return var5;
		} else if (var2 == 1) {
			long[] var7 = new long[var1];
			for (int var8 = 0; var8 < var1; var8++) {
				var7[var8] = arg0.method10346();
			}
			return method3236(var7);
		} else if (var2 == 2) {
			String[] var9 = new String[var1];
			for (int var10 = 0; var10 < var1; var10++) {
				var9[var10] = arg0.method10350();
			}
			return method6337(var9);
		} else {
			throw new RuntimeException();
		}
	}
}
