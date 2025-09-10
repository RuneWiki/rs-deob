package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lw")
public class class292 {

	@ObfuscatedName("lw.af")
	public final class413 field3359;

	@ObfuscatedName("lw.aw")
	public final class413 field3369;

	@ObfuscatedName("lw.at")
	public final HashMap field3360;

	@ObfuscatedName("lw.ac")
	public int field3361 = 0;

	@ObfuscatedName("lw.ap")
	public boolean field3362 = false;

	@ObfuscatedName("lw.aq")
	public boolean field3371 = false;

	@ObfuscatedName("lw.ao")
	public class311 field3364;

	@ObfuscatedName("lw.as")
	public class606 field3365;

	@ObfuscatedName("lw.al")
	public HashMap field3366;

	@ObfuscatedName("lw.au")
	public class291[][] field3375;

	@ObfuscatedName("lw.ai")
	public HashMap field3368 = new HashMap();

	@ObfuscatedName("lw.aa")
	public class605[] field3363;

	@ObfuscatedName("lw.am")
	public int field3367;

	@ObfuscatedName("lw.an")
	public int field3358;

	@ObfuscatedName("lw.ar")
	public int field3372;

	@ObfuscatedName("lw.ae")
	public int field3373;

	public class292(class605[] arg0, HashMap arg1, class413 arg2, class413 arg3) {
		this.field3363 = arg0;
		this.field3360 = arg1;
		this.field3359 = arg2;
		this.field3369 = arg3;
	}

	@ObfuscatedName("lw.af(Lpx;Ljava/lang/String;ZI)V")
	public void method6191(class413 arg0, String arg1, boolean arg2) {
		if (this.field3371) {
			return;
		}
		this.field3362 = false;
		this.field3371 = true;
		System.nanoTime();
		int var4 = arg0.method7715(class309.field3499.field3497);
		int var5 = arg0.method7709(var4, arg1);
		class591 var6 = new class591(arg0.method7723(class309.field3499.field3497, arg1));
		class591 var7 = new class591(arg0.method7723(class309.field3495.field3497, arg1));
		System.nanoTime();
		System.nanoTime();
		this.field3364 = new class311();
		try {
			this.field3364.method6360(var6, var7, var5, arg2);
		} catch (IllegalStateException var20) {
			return;
		}
		this.field3364.method6035();
		this.field3364.method5992();
		this.field3364.method6050();
		this.field3367 = this.field3364.method5986() * 64;
		this.field3358 = this.field3364.method5988() * 64;
		this.field3372 = (this.field3364.method6008() - this.field3364.method5986() + 1) * 64;
		this.field3373 = (this.field3364.method5989() - this.field3364.method5988() + 1) * 64;
		int var9 = this.field3364.method6008() - this.field3364.method5986() + 1;
		int var10 = this.field3364.method5989() - this.field3364.method5988() + 1;
		System.nanoTime();
		System.nanoTime();
		class291.method3465();
		this.field3375 = new class291[var9][var10];
		Iterator var11 = this.field3364.field3504.iterator();
		while (var11.hasNext()) {
			class285 var12 = (class285) var11.next();
			int var13 = var12.field3432;
			int var14 = var12.field3430;
			int var15 = var13 - this.field3364.method5986();
			int var16 = var14 - this.field3364.method5988();
			this.field3375[var15][var16] = new class291(var13, var14, this.field3364.method5974(), this.field3360);
			this.field3375[var15][var16].method6053(var12, this.field3364.field3505);
		}
		for (int var17 = 0; var17 < var9; var17++) {
			for (int var18 = 0; var18 < var10; var18++) {
				if (this.field3375[var17][var18] == null) {
					this.field3375[var17][var18] = new class291(this.field3364.method5986() + var17, this.field3364.method5988() + var18, this.field3364.method5974(), this.field3360);
					this.field3375[var17][var18].method6139(this.field3364.field3503, this.field3364.field3505);
				}
			}
		}
		System.nanoTime();
		System.nanoTime();
		if (arg0.method7710(class309.field3496.field3497, arg1)) {
			byte[] var19 = arg0.method7723(class309.field3496.field3497, arg1);
			this.field3365 = class31.method3863(var19);
		}
		System.nanoTime();
		arg0.method7704();
		arg0.method7779();
		this.field3362 = true;
	}

	@ObfuscatedName("lw.aw(I)V")
	public final void method6199() {
		this.field3366 = null;
	}

	@ObfuscatedName("lw.at(IIIIIIIII)V")
	public final void method6193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int[] var9 = Statics.field5989;
		int var10 = Statics.field5990;
		int var11 = Statics.field5991;
		float[] var12 = Statics.field5988;
		int[] var13 = new int[4];
		class602.method10676(var13);
		class300 var14 = this.method6197(arg0, arg1, arg2, arg3);
		float var15 = this.method6202(arg6 - arg4, arg2 - arg0);
		int var16 = (int) Math.ceil((double) var15);
		this.field3361 = var16;
		if (!this.field3368.containsKey(var16)) {
			class312 var17 = new class312(var16);
			var17.method6379();
			this.field3368.put(var16, var17);
		}
		int var18 = var14.field3445 + var14.field3442 - 1;
		int var19 = var14.field3444 + var14.field3441 - 1;
		for (int var20 = var14.field3442; var20 <= var18; var20++) {
			for (int var21 = var14.field3444; var21 <= var19; var21++) {
				this.field3375[var20][var21].method6079(var16, (class312) this.field3368.get(var16), this.field3363, this.field3359, this.field3369, 0.725D);
			}
		}
		class226.method4640(var9, var10, var11, var12);
		class602.method10742(var13);
		int var22 = (int) (var15 * 64.0F);
		int var23 = this.field3367 + arg0;
		int var24 = this.field3358 + arg1;
		for (int var25 = var14.field3442; var25 < var14.field3445 + var14.field3442; var25++) {
			for (int var26 = var14.field3444; var26 < var14.field3444 + var14.field3441; var26++) {
				this.field3375[var25][var26].method6052((this.field3375[var25][var26].field3349 * 64 - var23) * var22 / 64 + arg4, arg7 - (this.field3375[var25][var26].field3354 * 64 - var24 + 64) * var22 / 64, var22);
			}
		}
	}

	@ObfuscatedName("lw.ac(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
	public final void method6228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, HashSet arg8, HashSet arg9, int arg10, int arg11, boolean arg12) {
		class300 var14 = this.method6197(arg0, arg1, arg2, arg3);
		float var15 = this.method6202(arg6 - arg4, arg2 - arg0);
		int var16 = (int) (var15 * 64.0F);
		int var17 = this.field3367 + arg0;
		int var18 = this.field3358 + arg1;
		for (int var19 = var14.field3442; var19 < var14.field3445 + var14.field3442; var19++) {
			for (int var20 = var14.field3444; var20 < var14.field3444 + var14.field3441; var20++) {
				if (arg12) {
					this.field3375[var19][var20].method6140();
				}
				this.field3375[var19][var20].method6157((this.field3375[var19][var20].field3349 * 64 - var17) * var16 / 64 + arg4, arg7 - (this.field3375[var19][var20].field3354 * 64 - var18 + 64) * var16 / 64, var16, arg8);
			}
		}
		if (arg9 == null || arg10 <= 0) {
			return;
		}
		for (int var21 = var14.field3442; var21 < var14.field3445 + var14.field3442; var21++) {
			for (int var22 = var14.field3444; var22 < var14.field3444 + var14.field3441; var22++) {
				this.field3375[var21][var22].method6063(arg9, arg10, arg11);
			}
		}
	}

	@ObfuscatedName("lw.ap(IIIILjava/util/HashSet;III)V")
	public void method6195(int arg0, int arg1, int arg2, int arg3, HashSet arg4, int arg5, int arg6) {
		if (this.field3365 == null) {
			return;
		}
		this.field3365.method10863(arg0, arg1, arg2, arg3);
		if (arg5 <= 0 || arg5 % arg6 >= arg6 / 2) {
			return;
		}
		if (this.field3366 == null) {
			this.method6201();
		}
		Iterator var8 = arg4.iterator();
		while (true) {
			List var10;
			do {
				if (!var8.hasNext()) {
					return;
				}
				int var9 = (Integer) var8.next();
				var10 = (List) this.field3366.get(var9);
			} while (var10 == null);
			Iterator var11 = var10.iterator();
			while (var11.hasNext()) {
				class308 var12 = (class308) var11.next();
				int var13 = (var12.field3492.field4027 - this.field3367) * arg2 / this.field3372;
				int var14 = arg3 - (var12.field3492.field4026 - this.field3358) * arg3 / this.field3373;
				class602.method10748(arg0 + var13, arg1 + var14, 2, 16776960, 256);
			}
		}
	}

	@ObfuscatedName("lw.aq(IIIIIIIIIII)Ljava/util/List;")
	public List method6203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		LinkedList var11 = new LinkedList();
		if (!this.field3362) {
			return var11;
		}
		class300 var12 = this.method6197(arg0, arg1, arg2, arg3);
		float var13 = this.method6202(arg6, arg2 - arg0);
		int var14 = (int) (var13 * 64.0F);
		int var15 = this.field3367 + arg0;
		int var16 = this.field3358 + arg1;
		for (int var17 = var12.field3442; var17 < var12.field3445 + var12.field3442; var17++) {
			for (int var18 = var12.field3444; var18 < var12.field3444 + var12.field3441; var18++) {
				List var19 = this.field3375[var17][var18].method6177((this.field3375[var17][var18].field3349 * 64 - var15) * var14 / 64 + arg4, arg5 + arg7 - (this.field3375[var17][var18].field3354 * 64 - var16 + 64) * var14 / 64, var14, arg8, arg9);
				if (!var19.isEmpty()) {
					var11.addAll(var19);
				}
			}
		}
		return var11;
	}

	@ObfuscatedName("lw.ao(IIIII)Lln;")
	public class300 method6197(int arg0, int arg1, int arg2, int arg3) {
		class300 var5 = new class300(this);
		int var6 = this.field3367 + arg0;
		int var7 = this.field3358 + arg1;
		int var8 = this.field3367 + arg2;
		int var9 = this.field3358 + arg3;
		int var10 = var6 / 64;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		var5.field3445 = var12 - var10 + 1;
		var5.field3441 = var13 - var11 + 1;
		var5.field3442 = var10 - this.field3364.method5986();
		var5.field3444 = var11 - this.field3364.method5988();
		if (var5.field3442 < 0) {
			var5.field3445 += var5.field3442;
			var5.field3442 = 0;
		}
		if (var5.field3442 > this.field3375.length - var5.field3445) {
			var5.field3445 = this.field3375.length - var5.field3442;
		}
		if (var5.field3444 < 0) {
			var5.field3441 += var5.field3444;
			var5.field3444 = 0;
		}
		if (var5.field3444 > this.field3375[0].length - var5.field3441) {
			var5.field3441 = this.field3375[0].length - var5.field3444;
		}
		var5.field3445 = Math.min(var5.field3445, this.field3375.length);
		var5.field3441 = Math.min(var5.field3441, this.field3375[0].length);
		return var5;
	}

	@ObfuscatedName("lw.as(I)Z")
	public boolean method6198() {
		return this.field3362;
	}

	@ObfuscatedName("lw.al(B)I")
	public int method6194() {
		return this.field3364.method5984();
	}

	@ObfuscatedName("lw.au(B)Ljava/util/HashMap;")
	public HashMap method6200() {
		this.method6201();
		return this.field3366;
	}

	@ObfuscatedName("lw.ai(B)V")
	public void method6201() {
		if (this.field3366 == null) {
			this.field3366 = new HashMap();
		}
		this.field3366.clear();
		for (int var1 = 0; var1 < this.field3375.length; var1++) {
			for (int var2 = 0; var2 < this.field3375[var1].length; var2++) {
				List var3 = this.field3375[var1][var2].method6084();
				Iterator var4 = var3.iterator();
				while (var4.hasNext()) {
					class308 var5 = (class308) var4.next();
					if (var5.method6341()) {
						int var6 = var5.method5939();
						if (this.field3366.containsKey(var6)) {
							List var8 = (List) this.field3366.get(var6);
							var8.add(var5);
						} else {
							LinkedList var7 = new LinkedList();
							var7.add(var5);
							this.field3366.put(var6, var7);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lw.aa(III)F")
	public float method6202(int arg0, int arg1) {
		float var3 = (float) arg0 / (float) arg1;
		if (var3 > 8.0F) {
			return 8.0F;
		} else if (var3 < 1.0F) {
			return 1.0F;
		} else {
			int var4 = Math.round(var3);
			return Math.abs((float) var4 - var3) < 0.05F ? (float) var4 : var3;
		}
	}
}
