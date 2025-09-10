package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("lb")
public class class291 {

	@ObfuscatedName("lb.ap")
	public static class319 field3346 = new class319(37748736, 256);

	@ObfuscatedName("lb.aq")
	public final HashMap field3348;

	@ObfuscatedName("lb.ao")
	public int field3349;

	@ObfuscatedName("lb.as")
	public int field3354;

	@ObfuscatedName("lb.al")
	public class285 field3343;

	@ObfuscatedName("lb.au")
	public LinkedList field3356;

	@ObfuscatedName("lb.ai")
	public int field3352;

	@ObfuscatedName("lb.aa")
	public int field3353;

	@ObfuscatedName("lb.am")
	public List field3351;

	@ObfuscatedName("lb.an")
	public HashMap field3355;

	public class291(int arg0, int arg1, int arg2, HashMap arg3) {
		this.field3349 = arg0;
		this.field3354 = arg1;
		this.field3356 = new LinkedList();
		this.field3351 = new LinkedList();
		this.field3355 = new HashMap();
		this.field3352 = arg2 | 0xFF000000;
		this.field3348 = arg3;
	}

	@ObfuscatedName("kc.af(IIIB)J")
	public static long method5795(int arg0, int arg1, int arg2) {
		return (long) (arg2 << 16 | arg0 << 8 | arg1);
	}

	@ObfuscatedName("de.aw(IIIB)Lxt;")
	public static class606 method2810(int arg0, int arg1, int arg2) {
		return (class606) field3346.method6423(method5795(arg0, arg1, arg2));
	}

	@ObfuscatedName("bd.at(Lxt;IIIB)V")
	public static void method462(class606 arg0, int arg1, int arg2, int arg3) {
		field3346.method6422(arg0, method5795(arg1, arg2, arg3), arg0.field6019.length * 4);
	}

	@ObfuscatedName("fd.ac(B)V")
	public static void method3465() {
		field3346.method6432();
	}

	@ObfuscatedName("lb.ap(IIIS)V")
	public void method6052(int arg0, int arg1, int arg2) {
		class606 var4 = method2810(this.field3349, this.field3354, this.field3353);
		if (var4 == null) {
			return;
		}
		if (this.field3353 * 64 == arg2) {
			var4.method10817(arg0, arg1);
		} else {
			var4.method10846(arg0, arg1, arg2, arg2);
		}
	}

	@ObfuscatedName("lb.aq(Lkv;Ljava/util/List;I)V")
	public void method6053(class285 arg0, List arg1) {
		this.field3355.clear();
		this.field3343 = arg0;
		this.method6135(arg1);
	}

	@ObfuscatedName("lb.ao(Ljava/util/HashSet;Ljava/util/List;I)V")
	public void method6139(HashSet arg0, List arg1) {
		this.field3355.clear();
		Iterator var3 = arg0.iterator();
		while (var3.hasNext()) {
			class293 var4 = (class293) var3.next();
			if (var4.method6289() == this.field3349 && var4.method6290() == this.field3354) {
				this.field3356.add(var4);
			}
		}
		this.method6135(arg1);
	}

	@ObfuscatedName("lb.as(IIIILlv;B)V")
	public void method6055(int arg0, int arg1, int arg2, int arg3, class299 arg4) {
		for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
			label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
				for (int var8 = 0; var8 < arg4.field3429; var8++) {
					class301[] var9 = arg4.field3438[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						class301[] var10 = var9;
						for (int var11 = 0; var11 < var10.length; var11++) {
							class213 var13;
							boolean var18;
							label58: {
								class301 var12 = var10[var11];
								var13 = class213.method8013(var12.field3449);
								if (var13.field2356 != null) {
									int[] var14 = var13.field2356;
									for (int var15 = 0; var15 < var14.length; var15++) {
										int var16 = var14[var15];
										class213 var17 = class213.method8013(var16);
										if (var17.field2343 != -1) {
											var18 = true;
											break label58;
										}
									}
								} else if (var13.field2343 != -1) {
									var18 = true;
									break label58;
								}
								var18 = false;
							}
							if (var18) {
								this.method6086(var13, var8, var6, var7, arg4);
								continue label67;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lb.al(Lib;IIILlv;B)V")
	public void method6086(class213 arg0, int arg1, int arg2, int arg3, class299 arg4) {
		class357 var6 = new class357(arg1, this.field3349 * 64 + arg2, this.field3354 * 64 + arg3);
		Object var7 = null;
		class357 var8;
		if (this.field3343 == null) {
			class293 var9 = (class293) arg4;
			var8 = new class357(var9.field3426 + arg1, var9.field3434 * 64 + arg2 + var9.method6240() * 8, var9.field3427 * 64 + arg3 + var9.method6235() * 8);
		} else {
			var8 = new class357(this.field3343.field3426 + arg1, this.field3343.field3434 * 64 + arg2, this.field3343.field3427 * 64 + arg3);
		}
		class308 var10;
		if (arg0.field2356 == null) {
			class185 var11 = class185.method4094(arg0.field2343);
			var10 = new class296(var8, var6, var11.field1993, this.method6082(var11));
		} else {
			var10 = new class288(var8, var6, arg0.field2322, this);
		}
		class185 var12 = class185.method4094(var10.method5939());
		if (var12.field1999) {
			this.field3355.put(new class357(0, arg2, arg3), var10);
		}
	}

	@ObfuscatedName("lb.au(I)V")
	public void method6140() {
		Iterator var1 = this.field3355.values().iterator();
		while (var1.hasNext()) {
			class308 var2 = (class308) var1.next();
			if (var2 instanceof class288) {
				((class288) var2).method5931();
			}
		}
	}

	@ObfuscatedName("lb.ai(Ljava/util/List;I)V")
	public void method6135(List arg0) {
		Iterator var2 = arg0.iterator();
		while (var2.hasNext()) {
			class296 var3 = (class296) var2.next();
			if (class185.method4094(var3.field3401).field1999 && var3.field3492.field4027 >> 6 == this.field3349 && var3.field3492.field4026 >> 6 == this.field3354) {
				class296 var4 = new class296(var3.field3492, var3.field3492, var3.field3401, this.method6081(var3.field3401));
				this.field3351.add(var4);
			}
		}
	}

	@ObfuscatedName("lb.aa(I)V")
	public void method6122() {
		if (this.field3343 != null) {
			this.field3343.method6291();
			return;
		}
		Iterator var1 = this.field3356.iterator();
		while (var1.hasNext()) {
			class293 var2 = (class293) var1.next();
			var2.method6291();
		}
	}

	@ObfuscatedName("lb.am(Lpx;B)Z")
	public boolean method6060(class413 arg0) {
		this.field3355.clear();
		if (this.field3343 == null) {
			boolean var2 = true;
			Iterator var3 = this.field3356.iterator();
			while (var3.hasNext()) {
				class293 var4 = (class293) var3.next();
				var4.method6312(arg0);
				var2 &= var4.method6283();
			}
			if (var2) {
				Iterator var5 = this.field3356.iterator();
				while (var5.hasNext()) {
					class293 var6 = (class293) var5.next();
					this.method6055(var6.method6238() * 8, var6.method6239() * 8, 8, 8, var6);
				}
			}
			return var2;
		} else {
			this.field3343.method6312(arg0);
			if (this.field3343.method6283()) {
				this.method6055(0, 0, 64, 64, this.field3343);
				return true;
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("lb.an(ILlt;[Lxc;Lpx;Lpx;D)V")
	public void method6079(int arg0, class312 arg1, class605[] arg2, class413 arg3, class413 arg4, double arg5) {
		this.field3353 = arg0;
		if (this.field3343 == null && this.field3356.isEmpty() || method2810(this.field3349, this.field3354, arg0) != null) {
			return;
		}
		if (class226.method4631() != arg5) {
			class226.method4628(arg5);
		}
		boolean var8 = true;
		boolean var9 = var8 & this.method6060(arg3);
		int var10;
		if (this.field3343 == null) {
			var10 = ((class299) this.field3356.getFirst()).field3433;
		} else {
			var10 = this.field3343.field3433;
		}
		boolean var11 = var9 & arg4.method7761(var10);
		if (!var11) {
			return;
		}
		byte[] var12 = arg4.method7775(var10);
		class302 var13 = class302.method3818(var12);
		class606 var14 = new class606(this.field3353 * 64, this.field3353 * 64);
		var14.method10801();
		if (this.field3343 == null) {
			this.method6065(arg1, arg2, var13);
		} else {
			this.method6066(arg1, arg2, var13);
		}
		method462(var14, this.field3349, this.field3354, this.field3353);
		this.method6122();
	}

	@ObfuscatedName("lb.ar(IIILjava/util/HashSet;I)V")
	public void method6157(int arg0, int arg1, int arg2, HashSet arg3) {
		if (arg3 == null) {
			arg3 = new HashSet();
		}
		this.method6072(arg0, arg1, arg3, arg2);
		this.method6078(arg0, arg1, arg3, arg2);
	}

	@ObfuscatedName("lb.ae(Ljava/util/HashSet;III)V")
	public void method6063(HashSet arg0, int arg1, int arg2) {
		Iterator var4 = this.field3355.values().iterator();
		while (var4.hasNext()) {
			class308 var5 = (class308) var4.next();
			if (var5.method6341()) {
				int var6 = var5.method5939();
				if (arg0.contains(var6)) {
					class185 var7 = class185.method4094(var6);
					this.method6162(var7, var5.field3491, var5.field3490, arg1, arg2);
				}
			}
		}
		this.method6073(arg0, arg1, arg2);
	}

	@ObfuscatedName("lb.ay(Llt;[Lxc;Llr;I)V")
	public void method6066(class312 arg0, class605[] arg1, class302 arg2) {
		for (int var4 = 0; var4 < 64; var4++) {
			for (int var5 = 0; var5 < 64; var5++) {
				this.method6067(var4, var5, this.field3343, arg0, arg2);
				this.method6068(var4, var5, this.field3343, arg0);
			}
		}
		for (int var6 = 0; var6 < 64; var6++) {
			for (int var7 = 0; var7 < 64; var7++) {
				this.method6100(var6, var7, this.field3343, arg0, arg1);
			}
		}
	}

	@ObfuscatedName("lb.ad(Llt;[Lxc;Llr;B)V")
	public void method6065(class312 arg0, class605[] arg1, class302 arg2) {
		Iterator var4 = this.field3356.iterator();
		while (var4.hasNext()) {
			class293 var5 = (class293) var4.next();
			for (int var6 = var5.method6238() * 8; var6 < var5.method6238() * 8 + 8; var6++) {
				for (int var7 = var5.method6239() * 8; var7 < var5.method6239() * 8 + 8; var7++) {
					this.method6067(var6, var7, var5, arg0, arg2);
					this.method6068(var6, var7, var5, arg0);
				}
			}
		}
		Iterator var8 = this.field3356.iterator();
		while (var8.hasNext()) {
			class293 var9 = (class293) var8.next();
			for (int var10 = var9.method6238() * 8; var10 < var9.method6238() * 8 + 8; var10++) {
				for (int var11 = var9.method6239() * 8; var11 < var9.method6239() * 8 + 8; var11++) {
					this.method6100(var10, var11, var9, arg0, arg1);
				}
			}
		}
	}

	@ObfuscatedName("lb.ag(IILlv;Llt;[Lxc;B)V")
	public void method6100(int arg0, int arg1, class299 arg2, class312 arg3, class605[] arg4) {
		this.method6071(arg0, arg1, arg2);
		this.method6070(arg0, arg1, arg2, arg4);
	}

	@ObfuscatedName("lb.av(IILlv;Llt;Llr;I)V")
	public void method6067(int arg0, int arg1, class299 arg2, class312 arg3, class302 arg4) {
		int var6 = arg2.field3431[0][arg0][arg1] - 1;
		int var7 = arg2.field3435[0][arg0][arg1] - 1;
		if (var6 == -1 && var7 == -1) {
			class602.method10682(this.field3353 * arg0, this.field3353 * (63 - arg1), this.field3353, this.field3353, this.field3352);
		}
		int var8 = 16711935;
		if (var7 != -1) {
			var8 = Statics.method2764(var7, this.field3352);
		}
		if (var7 > -1 && arg2.field3436[0][arg0][arg1] == 0) {
			class602.method10682(this.field3353 * arg0, this.field3353 * (63 - arg1), this.field3353, this.field3353, var8);
			return;
		}
		int var9 = this.method6069(arg0, arg1, arg2, arg4);
		if (var7 == -1) {
			class602.method10682(this.field3353 * arg0, this.field3353 * (63 - arg1), this.field3353, this.field3353, var9);
		} else {
			arg3.method6370(this.field3353 * arg0, this.field3353 * (63 - arg1), var9, var8, this.field3353, this.field3353, arg2.field3436[0][arg0][arg1], arg2.field3437[0][arg0][arg1]);
		}
	}

	@ObfuscatedName("lb.ah(IILlv;Llt;B)V")
	public void method6068(int arg0, int arg1, class299 arg2, class312 arg3) {
		for (int var5 = 1; var5 < arg2.field3429; var5++) {
			int var6 = arg2.field3435[var5][arg0][arg1] - 1;
			if (var6 > -1) {
				int var7 = Statics.method2764(var6, this.field3352);
				if (arg2.field3436[var5][arg0][arg1] == 0) {
					class602.method10682(this.field3353 * arg0, this.field3353 * (63 - arg1), this.field3353, this.field3353, var7);
				} else {
					arg3.method6370(this.field3353 * arg0, this.field3353 * (63 - arg1), 0, var7, this.field3353, this.field3353, arg2.field3436[var5][arg0][arg1], arg2.field3437[var5][arg0][arg1]);
				}
			}
		}
	}

	@ObfuscatedName("lb.ab(IILlv;Llr;I)I")
	public int method6069(int arg0, int arg1, class299 arg2, class302 arg3) {
		return arg2.field3431[0][arg0][arg1] == 0 ? this.field3352 : arg3.method6318(arg0, arg1);
	}

	@ObfuscatedName("lb.ax(IILlv;[Lxc;I)V")
	public void method6070(int arg0, int arg1, class299 arg2, class605[] arg3) {
		for (int var5 = 0; var5 < arg2.field3429; var5++) {
			class301[] var6 = arg2.field3438[var5][arg0][arg1];
			if (var6 != null && var6.length != 0) {
				class301[] var7 = var6;
				for (int var8 = 0; var8 < var7.length; var8++) {
					class301 var9 = var7[var8];
					if (!class379.method6987(var9.field3447)) {
						int var10 = var9.field3447;
						boolean var11 = class379.field4345.field4365 == var10;
						if (!var11) {
							continue;
						}
					}
					class213 var12 = class213.method8013(var9.field3449);
					if (var12.field2344 != -1) {
						int var13 = var9.field3446 == 1 || var9.field3446 == 3 ? var12.field2330 : var12.field2331;
						arg3[var12.field2344].method10791(this.field3353 * arg0, this.field3353 * (64 - var13 - arg1), this.field3353 * 2, this.field3353 * 2);
					}
				}
			}
		}
	}

	@ObfuscatedName("lb.ak(IILlv;B)V")
	public void method6071(int arg0, int arg1, class299 arg2) {
		for (int var4 = 0; var4 < arg2.field3429; var4++) {
			class301[] var5 = arg2.field3438[var4][arg0][arg1];
			if (var5 != null && var5.length != 0) {
				class301[] var6 = var5;
				for (int var7 = 0; var7 < var6.length; var7++) {
					class301 var8 = var6[var7];
					int var9 = var8.field3447;
					boolean var10 = var9 >= class379.field4366.field4365 && var9 <= class379.field4356.field4365 || class379.field4361.field4365 == var9;
					if (var10) {
						class213 var11 = class213.method8013(var8.field3449);
						int var12 = var11.field2309 == 0 ? -3355444 : -3407872;
						if (class379.field4366.field4365 == var8.field3447) {
							this.method6085(arg0, arg1, var8.field3446, var12);
						}
						if (class379.field4346.field4365 == var8.field3447) {
							this.method6085(arg0, arg1, var8.field3446, -3355444);
							this.method6085(arg0, arg1, var8.field3446 + 1, var12);
						}
						if (class379.field4356.field4365 == var8.field3447) {
							if (var8.field3446 == 0) {
								class602.method10685(this.field3353 * arg0, this.field3353 * (63 - arg1), 1, var12);
							}
							if (var8.field3446 == 1) {
								class602.method10685(this.field3353 * arg0 + this.field3353 - 1, this.field3353 * (63 - arg1), 1, var12);
							}
							if (var8.field3446 == 2) {
								class602.method10685(this.field3353 * arg0 + this.field3353 - 1, this.field3353 * (63 - arg1) + this.field3353 - 1, 1, var12);
							}
							if (var8.field3446 == 3) {
								class602.method10685(this.field3353 * arg0, this.field3353 * (63 - arg1) + this.field3353 - 1, 1, var12);
							}
						}
						if (class379.field4361.field4365 == var8.field3447) {
							int var13 = var8.field3446 % 2;
							if (var13 == 0) {
								for (int var14 = 0; var14 < this.field3353; var14++) {
									class602.method10685(this.field3353 * arg0 + var14, this.field3353 * (64 - arg1) - 1 - var14, 1, var12);
								}
							} else {
								for (int var15 = 0; var15 < this.field3353; var15++) {
									class602.method10685(this.field3353 * arg0 + var15, this.field3353 * (63 - arg1) + var15, 1, var12);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("lb.aj(IILjava/util/HashSet;II)V")
	public void method6072(int arg0, int arg1, HashSet arg2, int arg3) {
		float var5 = (float) arg3 / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.field3355.entrySet().iterator();
		while (var7.hasNext()) {
			Entry var8 = (Entry) var7.next();
			class357 var9 = (class357) var8.getKey();
			int var10 = (int) ((float) var9.field4027 * var5 + (float) arg0 - var6);
			int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field4026 * var5 - var6);
			class308 var12 = (class308) var8.getValue();
			if (var12 != null && var12.method6341()) {
				var12.field3491 = var10;
				var12.field3490 = var11;
				class185 var13 = class185.method4094(var12.method5939());
				if (!arg2.contains(var13.method3893())) {
					this.method6075(var12, var10, var11, var5);
				}
			}
		}
	}

	@ObfuscatedName("lb.az(Ljava/util/HashSet;III)V")
	public void method6073(HashSet arg0, int arg1, int arg2) {
		Iterator var4 = this.field3351.iterator();
		while (var4.hasNext()) {
			class308 var5 = (class308) var4.next();
			if (var5.method6341()) {
				class185 var6 = class185.method4094(var5.method5939());
				if (var6 != null && arg0.contains(var6.method3893())) {
					this.method6162(var6, var5.field3491, var5.field3490, arg1, arg2);
				}
			}
		}
	}

	@ObfuscatedName("lb.bt(Lha;IIIII)V")
	public void method6162(class185 arg0, int arg1, int arg2, int arg3, int arg4) {
		class606 var6 = arg0.method3887(false);
		if (var6 == null) {
			return;
		}
		var6.method10818(arg1 - var6.field6020 / 2, arg2 - var6.field6021 / 2);
		if (arg3 % arg4 < arg4 / 2) {
			class602.method10748(arg1, arg2, 15, 16776960, 128);
			class602.method10748(arg1, arg2, 7, 16777215, 256);
		}
	}

	@ObfuscatedName("lb.bs(Lle;IIFI)V")
	public void method6075(class308 arg0, int arg1, int arg2, float arg3) {
		class185 var5 = class185.method4094(arg0.method5939());
		this.method6076(var5, arg1, arg2);
		this.method6077(arg0, var5, arg1, arg2, arg3);
	}

	@ObfuscatedName("lb.bu(Lha;IIB)V")
	public void method6076(class185 arg0, int arg1, int arg2) {
		class606 var4 = arg0.method3887(false);
		if (var4 != null) {
			int var5 = this.method6061(var4, arg0.field2012);
			int var6 = this.method6080(var4, arg0.field2000);
			var4.method10818(arg1 + var5, arg2 + var6);
		}
	}

	@ObfuscatedName("lb.bi(Lle;Lha;IIFI)V")
	public void method6077(class308 arg0, class185 arg1, int arg2, int arg3, float arg4) {
		class303 var6 = arg0.method5933();
		if (var6 != null && var6.field3458.method5917(arg4)) {
			class462 var7 = (class462) this.field3348.get(var6.field3458);
			var7.method8767(var6.field3459, arg2 - var6.field3457 / 2, arg3, var6.field3457, var6.field3460, arg1.field1997 | 0xFF000000, 0, 1, 0, var7.field5252 / 2);
		}
	}

	@ObfuscatedName("lb.bd(IILjava/util/HashSet;II)V")
	public void method6078(int arg0, int arg1, HashSet arg2, int arg3) {
		float var5 = (float) arg3 / 64.0F;
		Iterator var6 = this.field3351.iterator();
		while (var6.hasNext()) {
			class308 var7 = (class308) var6.next();
			if (var7.method6341()) {
				int var8 = var7.field3492.field4027 % 64;
				int var9 = var7.field3492.field4026 % 64;
				var7.field3491 = (int) ((float) var8 * var5 + (float) arg0);
				var7.field3490 = (int) ((float) (63 - var9) * var5 + (float) arg1);
				if (!arg2.contains(var7.method5939())) {
					this.method6075(var7, var7.field3491, var7.field3490, var5);
				}
			}
		}
	}

	@ObfuscatedName("lb.ba(Lxt;Lhp;I)I")
	public int method6061(class606 arg0, class194 arg1) {
		switch(arg1.field2091) {
			case 0:
				return -arg0.field6020 / 2;
			case 2:
				return 0;
			default:
				return -arg0.field6020;
		}
	}

	@ObfuscatedName("lb.bb(Lxt;Lhx;I)I")
	public int method6080(class606 arg0, class199 arg1) {
		switch(arg1.field2167) {
			case 1:
				return 0;
			case 2:
				return -arg0.field6021 / 2;
			default:
				return -arg0.field6021;
		}
	}

	@ObfuscatedName("lb.bo(II)Lls;")
	public class303 method6081(int arg0) {
		class185 var2 = class185.method4094(arg0);
		return this.method6082(var2);
	}

	@ObfuscatedName("lb.bl(Lha;B)Lls;")
	public class303 method6082(class185 arg0) {
		if (arg0.field1996 == null || this.field3348 == null || this.field3348.get(class287.field3299) == null) {
			return null;
		}
		class287 var2 = class287.method5919(arg0.field2007);
		if (var2 == null) {
			return null;
		}
		class462 var3 = (class462) this.field3348.get(var2);
		if (var3 == null) {
			return null;
		}
		int var4 = var3.method8761(arg0.field1996, 1000000);
		String[] var5 = new String[var4];
		var3.method8759(arg0.field1996, null, var5);
		int var6 = var5.length * var3.field5252 / 2;
		int var7 = 0;
		String[] var8 = var5;
		for (int var9 = 0; var9 < var8.length; var9++) {
			String var10 = var8[var9];
			int var11 = var3.method8758(var10);
			if (var11 > var7) {
				var7 = var11;
			}
		}
		return new class303(arg0.field1996, var7, var6, var2);
	}

	@ObfuscatedName("lb.by(IIIIII)Ljava/util/List;")
	public List method6177(int arg0, int arg1, int arg2, int arg3, int arg4) {
		LinkedList var6 = new LinkedList();
		if (arg3 < arg0 || arg4 < arg1) {
			return var6;
		} else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
			Iterator var7 = this.field3355.values().iterator();
			while (var7.hasNext()) {
				class308 var8 = (class308) var7.next();
				if (var8.method6341() && var8.method6343(arg3, arg4)) {
					var6.add(var8);
				}
			}
			Iterator var9 = this.field3351.iterator();
			while (var9.hasNext()) {
				class308 var10 = (class308) var9.next();
				if (var10.method6341() && var10.method6343(arg3, arg4)) {
					var6.add(var10);
				}
			}
			return var6;
		} else {
			return var6;
		}
	}

	@ObfuscatedName("lb.bg(I)Ljava/util/List;")
	public List method6084() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.field3351);
		var1.addAll(this.field3355.values());
		return var1;
	}

	@ObfuscatedName("lb.bx(IIIII)V")
	public void method6085(int arg0, int arg1, int arg2, int arg3) {
		int var5 = arg2 % 4;
		if (var5 == 0) {
			class602.method10690(this.field3353 * arg0, this.field3353 * (63 - arg1), this.field3353, arg3);
		}
		if (var5 == 1) {
			class602.method10685(this.field3353 * arg0, this.field3353 * (63 - arg1), this.field3353, arg3);
		}
		if (var5 == 2) {
			class602.method10690(this.field3353 * arg0 + this.field3353 - 1, this.field3353 * (63 - arg1), this.field3353, arg3);
		}
		if (var5 == 3) {
			class602.method10685(this.field3353 * arg0, this.field3353 * (63 - arg1) + this.field3353 - 1, this.field3353, arg3);
		}
	}
}
