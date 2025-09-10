package deob;

import java.util.Iterator;

@ObfuscatedName("cz")
public class class54 extends class234 {

	@ObfuscatedName("cz.af")
	public int field779;

	@ObfuscatedName("cz.aw")
	public int field784;

	@ObfuscatedName("cz.at")
	public int field768;

	@ObfuscatedName("cz.ac")
	public int field785;

	@ObfuscatedName("cz.ap")
	public int field771;

	@ObfuscatedName("cz.aq")
	public int field772;

	@ObfuscatedName("cz.ao")
	public int field767;

	@ObfuscatedName("cz.as")
	public int field770;

	@ObfuscatedName("cz.al")
	public int field775;

	@ObfuscatedName("cz.au")
	public int field776;

	@ObfuscatedName("cz.ai")
	public int field790;

	@ObfuscatedName("cz.aa")
	public int field778;

	@ObfuscatedName("cz.am")
	public int field791;

	@ObfuscatedName("cz.an")
	public int field780;

	@ObfuscatedName("cz.ar")
	public double field774;

	@ObfuscatedName("cz.ae")
	public double field782;

	@ObfuscatedName("cz.ay")
	public double field783;

	@ObfuscatedName("cz.ad")
	public int field777;

	@ObfuscatedName("cz.ag")
	public int field769;

	@ObfuscatedName("cz.av")
	public boolean field786 = false;

	@ObfuscatedName("cz.ah")
	public double field787;

	@ObfuscatedName("cz.ab")
	public int field788;

	@ObfuscatedName("cz.ax")
	public final class470 field789 = new class470();

	public class54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
		this.field779 = arg0;
		this.field784 = arg1;
		this.field768 = arg2;
		this.field785 = arg3;
		this.field771 = arg4;
		this.field772 = arg5;
		this.field767 = arg6;
		this.field770 = arg7;
		this.field775 = arg8;
		this.field776 = arg9;
		this.field788 = arg10;
		this.field790 = arg11;
		this.field778 = arg12;
		this.field791 = arg13;
		this.field780 = arg14;
		this.field789.method8908(class202.method8008(this.field788).field2199);
	}

	@ObfuscatedName("md.af(II)Z")
	public static boolean method6521(int arg0) {
		return arg0 != 0;
	}

	@ObfuscatedName("kn.aw(IB)I")
	public static int method5555(int arg0) {
		return arg0 - 1;
	}

	@ObfuscatedName("cz.ac(III)V")
	public void method1941(int arg0, int arg1) {
		this.field784 += arg0;
		this.field768 += arg1;
		this.field767 += arg0;
		this.field770 += arg1;
		this.field774 += class357.method6807(arg0);
		this.field782 += class357.method6807(arg1);
	}

	@ObfuscatedName("cz.ap(Lco;IIB)V")
	public void method1932(class74 arg0, int arg1, int arg2) {
		if (arg1 < this.field790) {
			return;
		}
		class453 var4 = method6952(this.field776, this.field767, this.field770, this.field772, arg0);
		int var5 = (int) var4.field5176;
		int var6 = (int) var4.field5170;
		int var7 = (int) var4.field5177 - this.field775;
		var4.method8336();
		if (!this.field786) {
			class453 var8 = method6952(this.field771, this.field784, this.field768, this.field779, arg0);
			int var9 = (int) var8.field5176;
			int var10 = (int) var8.field5170;
			int var11 = (int) var8.field5177 - this.field785;
			var8.method8336();
			double var12 = (double) (var5 - var9);
			double var14 = (double) (var6 - var10);
			double var16 = Math.sqrt(var12 * var12 + var14 * var14);
			this.field774 = Math.abs(var16) < 0.009999999776482582D ? (double) var9 : (double) this.field780 * var12 / var16 + (double) var9;
			this.field782 = Math.abs(var16) < 0.009999999776482582D ? (double) var10 : (double) this.field780 * var14 / var16 + (double) var10;
			this.field783 = var11;
		}
		double var18 = (double) (this.field778 + 1 - arg1);
		double var20 = ((double) var5 - this.field774) / var18;
		double var22 = ((double) var6 - this.field782) / var18;
		double var24 = Math.sqrt(var20 * var20 + var22 * var22);
		if (!this.field786) {
			this.field787 = -var24 * Math.tan((double) this.field791 * 0.02454369D);
		}
		double var26 = ((double) var7 - this.field783 - this.field787 * var18) * 2.0D / (var18 * var18);
		this.field786 = true;
		this.field774 += (double) arg2 * var20;
		this.field782 += (double) arg2 * var22;
		this.field783 += var26 * 0.5D * (double) arg2 * (double) arg2 + (double) arg2 * this.field787;
		this.field787 += (double) arg2 * var26;
		this.field777 = (int) (Math.atan2(var20, var22) * 325.949D) + 1024 & 0x7FF;
		this.field769 = (int) (Math.atan2(this.field787, var24) * 325.949D) & 0x7FF;
		client.field400.method10043(Statics.field3837, (int) this.field774, (int) this.field782, false);
		class468.method3602(this.field789, arg2, client.field400);
		client.field400.method10041();
	}

	@ObfuscatedName("oz.aq(IIIILco;B)Lre;")
	public static class453 method6952(int arg0, int arg1, int arg2, int arg3, class74 arg4) {
		class453 var5 = null;
		class80 var6 = null;
		if (method6521(arg0)) {
			boolean var7 = arg0 > 0;
			class76 var12;
			if (var7) {
				int var8 = method5555(arg0);
				Iterator var9 = arg4.iterator();
				class80 var11;
				while (true) {
					if (var9.hasNext()) {
						class80 var10 = (class80) var9.next();
						if (var10.field1161.method7917((long) var8) == null) {
							continue;
						}
						var11 = var10;
						break;
					}
					var11 = arg4.method2304();
					break;
				}
				var6 = var11;
				var12 = (class76) var11.field1161.method7917((long) var8);
			} else {
				int var13 = -arg0 - 1;
				var6 = class510.method7843(var13, arg4);
				var12 = var6.method2634(var13);
			}
			if (var12 != null) {
				class357 var15 = var12.method2396(var6);
				class453[] var16 = class453.field5172;
				class453 var17;
				synchronized (class453.field5172) {
					if (class453.field5174 == 0) {
						var17 = new class453();
					} else {
						class453.field5172[--class453.field5174].method8348();
						var17 = class453.field5172[class453.field5174];
					}
				}
				var5 = var17;
				var17.field5176 = var15.field4027;
				var17.field5170 = var15.field4026;
			}
		}
		if (var5 == null) {
			var6 = arg4.method2306(arg1, arg2);
			int var19 = arg1 - var6.field1165;
			int var20 = arg2 - var6.field1166;
			class506 var21 = (class506) arg4.method2304().field1172.method7946((long) var6.field1173);
			if (var21 == null) {
				var5 = class453.method6269((float) class357.method6806(var19), 0.0F, (float) class357.method6806(var20));
			} else {
				var5 = var21.method9356(class357.method6806(var19), class357.method6806(var20));
			}
		}
		int var23 = (int) var5.field5176;
		int var24 = (int) var5.field5170;
		int var25 = client.method7784(var6, var23, var24, arg3);
		class506 var26 = (class506) Statics.field3837.field1172.method7946((long) var6.field1173);
		if (var26 != null) {
			var25 += client.method7784(Statics.field3837, var26.method2394(), var26.method2395(), var26.method2177());
		}
		var5.field5177 = var25;
		return var5;
	}

	@ObfuscatedName("cz.at(I)Ljn;")
	public final class242 method1847() {
		if (this.field789.method8902(30)) {
			return null;
		}
		class202 var1 = class202.method8008(this.field788);
		class242 var2 = var1.method4106(this.field789.method8900());
		if (var2 == null) {
			return null;
		} else {
			var2.method5142(this.field769);
			return var2;
		}
	}
}
