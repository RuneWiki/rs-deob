package deob;

@ObfuscatedName("ha")
public class class185 extends class541 {

	@ObfuscatedName("ha.at")
	public static class321 field1992 = new class321(256);

	@ObfuscatedName("ha.aq")
	public final int field1993;

	@ObfuscatedName("ha.ao")
	public int field1994 = -1;

	@ObfuscatedName("ha.as")
	public int field1995 = -1;

	@ObfuscatedName("ha.al")
	public String field1996;

	@ObfuscatedName("ha.au")
	public int field1997;

	@ObfuscatedName("ha.ai")
	public int field2007 = 0;

	@ObfuscatedName("ha.aa")
	public boolean field1999 = true;

	@ObfuscatedName("ha.am")
	public boolean field2001 = false;

	@ObfuscatedName("ha.an")
	public String[] field2009 = new String[5];

	@ObfuscatedName("ha.ar")
	public String field2002;

	@ObfuscatedName("ha.ae")
	public int[] field2003;

	@ObfuscatedName("ha.ay")
	public int field2004 = Integer.MAX_VALUE;

	@ObfuscatedName("ha.ad")
	public int field2008 = Integer.MAX_VALUE;

	@ObfuscatedName("ha.ag")
	public int field2006 = Integer.MIN_VALUE;

	@ObfuscatedName("ha.av")
	public int field1991 = Integer.MIN_VALUE;

	@ObfuscatedName("ha.ah")
	public class194 field2012 = class194.field2087;

	@ObfuscatedName("ha.ab")
	public class199 field2000 = class199.field2170;

	@ObfuscatedName("ha.ax")
	public int[] field2010;

	@ObfuscatedName("ha.ak")
	public byte[] field2011;

	@ObfuscatedName("ha.aj")
	public int field2005 = -1;

	public class185(int arg0) {
		this.field1993 = arg0;
	}

	@ObfuscatedName("tk.af(Lpx;Lpx;I)V")
	public static void method9222(class413 arg0, class413 arg1) {
		Statics.field1912 = arg1;
		Statics.field2013 = arg0.method7702(35);
		Statics.field3067 = new class185[Statics.field2013];
		for (int var2 = 0; var2 < Statics.field2013; var2++) {
			byte[] var3 = arg0.method7692(35, var2);
			Statics.field3067[var2] = new class185(var2);
			if (var3 != null) {
				Statics.field3067[var2].method3884(new class591(var3));
				Statics.field3067[var2].method3886();
			}
		}
	}

	@ObfuscatedName("hx.aw(IB)Lha;")
	public static class185 method4094(int arg0) {
		return arg0 < 0 || arg0 >= Statics.field3067.length || Statics.field3067[arg0] == null ? new class185(arg0) : Statics.field3067[arg0];
	}

	@ObfuscatedName("gn.at(B)V")
	public static void method3682() {
		field1992.method6456();
	}

	@ObfuscatedName("ha.ac(Lwb;I)V")
	public void method3884(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method3885(arg0, var2);
		}
	}

	@ObfuscatedName("ha.ap(Lwb;II)V")
	public void method3885(class591 arg0, int arg1) {
		if (arg1 == 1) {
			this.field1994 = arg0.method10365();
		} else if (arg1 == 2) {
			this.field1995 = arg0.method10365();
		} else if (arg1 == 3) {
			this.field1996 = arg0.method10350();
		} else if (arg1 == 4) {
			this.field1997 = arg0.method10419();
		} else if (arg1 == 5) {
			arg0.method10419();
		} else if (arg1 == 6) {
			this.field2007 = arg0.method10339();
		} else if (arg1 == 7) {
			int var3 = arg0.method10339();
			if ((var3 & 0x1) == 0) {
				this.field1999 = false;
			}
			if ((var3 & 0x2) == 2) {
				this.field2001 = true;
			}
		} else if (arg1 == 8) {
			arg0.method10339();
		} else if (arg1 >= 10 && arg1 <= 14) {
			this.field2009[arg1 - 10] = arg0.method10350();
		} else if (arg1 == 15) {
			int var4 = arg0.method10339();
			this.field2003 = new int[var4 * 2];
			for (int var5 = 0; var5 < var4 * 2; var5++) {
				this.field2003[var5] = arg0.method10593();
			}
			arg0.method10345();
			int var6 = arg0.method10339();
			this.field2010 = new int[var6];
			for (int var7 = 0; var7 < this.field2010.length; var7++) {
				this.field2010[var7] = arg0.method10345();
			}
			this.field2011 = new byte[var4];
			for (int var8 = 0; var8 < var4; var8++) {
				this.field2011[var8] = arg0.method10340();
			}
		} else if (arg1 != 16) {
			if (arg1 == 17) {
				this.field2002 = arg0.method10350();
			} else if (arg1 == 18) {
				arg0.method10365();
			} else if (arg1 == 19) {
				this.field2005 = arg0.method10341();
			} else if (arg1 == 21) {
				arg0.method10345();
			} else if (arg1 == 22) {
				arg0.method10345();
			} else if (arg1 == 23) {
				arg0.method10339();
				arg0.method10339();
				arg0.method10339();
			} else if (arg1 == 24) {
				arg0.method10593();
				arg0.method10593();
			} else if (arg1 == 25) {
				arg0.method10365();
			} else if (arg1 == 28) {
				arg0.method10339();
			} else if (arg1 == 29) {
				class194[] var9 = new class194[] { class194.field2087, class194.field2089, class194.field2090 };
				this.field2012 = (class194) class432.method3817(var9, arg0.method10339());
			} else if (arg1 == 30) {
				class199[] var10 = new class199[] { class199.field2168, class199.field2173, class199.field2170 };
				this.field2000 = (class199) class432.method3817(var10, arg0.method10339());
			}
		}
	}

	@ObfuscatedName("ha.aq(I)V")
	public void method3886() {
		if (this.field2003 == null) {
			return;
		}
		for (int var1 = 0; var1 < this.field2003.length; var1 += 2) {
			if (this.field2003[var1] < this.field2004) {
				this.field2004 = this.field2003[var1];
			} else if (this.field2003[var1] > this.field2006) {
				this.field2006 = this.field2003[var1];
			}
			if (this.field2003[var1 + 1] < this.field2008) {
				this.field2008 = this.field2003[var1 + 1];
			} else if (this.field2003[var1 + 1] > this.field1991) {
				this.field1991 = this.field2003[var1 + 1];
			}
		}
	}

	@ObfuscatedName("ha.ao(ZI)Lxt;")
	public class606 method3887(boolean arg0) {
		int var2 = arg0 ? this.field1995 : this.field1994;
		return this.method3895(var2);
	}

	@ObfuscatedName("ha.as(II)Lxt;")
	public class606 method3895(int arg0) {
		if (arg0 < 0) {
			return null;
		}
		class606 var2 = (class606) field1992.method6463((long) arg0);
		if (var2 != null) {
			return var2;
		}
		class606 var3 = class607.method3059(Statics.field1912, arg0, 0);
		if (var3 != null) {
			field1992.method6454(var3, (long) arg0);
		}
		return var3;
	}

	@ObfuscatedName("ha.al(I)I")
	public int method3893() {
		return this.field1993;
	}
}
