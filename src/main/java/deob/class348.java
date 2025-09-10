package deob;

@ObfuscatedName("nl")
public class class348 extends class105 {

	@ObfuscatedName("nl.af")
	public class437 field3972 = new class437();

	@ObfuscatedName("nl.aw")
	public class94 field3970 = new class94();

	@ObfuscatedName("nl.at")
	public class341 field3973;

	public class348(class341 arg0) {
		this.field3973 = arg0;
	}

	@ObfuscatedName("nl.aq()Lef;")
	public class105 method2895() {
		class350 var1 = (class350) this.field3972.method8034();
		if (var1 == null) {
			return null;
		} else if (var1.field3995 == null) {
			return this.method2896();
		} else {
			return var1.field3995;
		}
	}

	@ObfuscatedName("nl.ao()Lef;")
	public class105 method2896() {
		class350 var1;
		do {
			var1 = (class350) this.field3972.method8036();
			if (var1 == null) {
				return null;
			}
		} while (var1.field3995 == null);
		return var1.field3995;
	}

	@ObfuscatedName("nl.as()I")
	public int method2915() {
		return 0;
	}

	@ObfuscatedName("nl.al([III)V")
	public void method2899(int[] arg0, int arg1, int arg2) {
		this.field3970.method2899(arg0, arg1, arg2);
		for (class350 var4 = (class350) this.field3972.method8034(); var4 != null; var4 = (class350) this.field3972.method8036()) {
			if (!this.field3973.method6639(var4)) {
				int var5 = arg1;
				int var6 = arg2;
				do {
					if (var6 <= var4.field3996) {
						this.method6761(var4, arg0, var5, var6, var5 + var6);
						var4.field3996 -= var6;
						break;
					}
					this.method6761(var4, arg0, var5, var4.field3996, var5 + var6);
					var5 += var4.field3996;
					var6 -= var4.field3996;
				} while (!this.field3973.method6602(var4, arg0, var5, var6));
			}
		}
	}

	@ObfuscatedName("nl.ai(I)V")
	public void method2900(int arg0) {
		this.field3970.method2900(arg0);
		for (class350 var2 = (class350) this.field3972.method8034(); var2 != null; var2 = (class350) this.field3972.method8036()) {
			if (!this.field3973.method6639(var2)) {
				int var3 = arg0;
				do {
					if (var3 <= var2.field3996) {
						this.method6756(var2, var3);
						var2.field3996 -= var3;
						break;
					}
					this.method6756(var2, var2.field3996);
					var3 -= var2.field3996;
				} while (!this.field3973.method6602(var2, null, 0, var3));
			}
		}
	}

	@ObfuscatedName("nl.af(Lno;[IIIIB)V")
	public void method6761(class350 arg0, int[] arg1, int arg2, int arg3, int arg4) {
		if ((this.field3973.field3906[arg0.field3977] & 0x4) != 0 && arg0.field3989 < 0) {
			int var6 = this.field3973.field3908[arg0.field3977] / class98.field1357;
			while (true) {
				int var7 = (var6 + 1048575 - arg0.field3997) / var6;
				if (var7 > arg3) {
					arg0.field3997 += arg3 * var6;
					break;
				}
				arg0.field3995.method2899(arg1, arg2, var7);
				arg2 += var7;
				arg3 -= var7;
				arg0.field3997 += var6 * var7 - 1048576;
				int var8 = class98.field1357 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}
				class104 var10 = arg0.field3995;
				if (this.field3973.field3929[arg0.field3977] == 0) {
					arg0.field3995 = class104.method3068(arg0.field3979, var10.method3100(), var10.method3091(), var10.method3177());
				} else {
					arg0.field3995 = class104.method3068(arg0.field3979, var10.method3100(), 0, var10.method3177());
					this.field3973.method6594(arg0, arg0.field3992.field3960[arg0.field3982] < 0);
					arg0.field3995.method3097(var8, var10.method3091());
				}
				if (arg0.field3992.field3960[arg0.field3982] < 0) {
					arg0.field3995.method3087(-1);
				}
				var10.method3099(var8);
				var10.method2899(arg1, arg2, arg4 - arg2);
				if (var10.method3103()) {
					this.field3970.method2890(var10);
				}
			}
		}
		arg0.field3995.method2899(arg1, arg2, arg3);
	}

	@ObfuscatedName("nl.aw(Lno;IB)V")
	public void method6756(class350 arg0, int arg1) {
		if ((this.field3973.field3906[arg0.field3977] & 0x4) != 0 && arg0.field3989 < 0) {
			int var3 = this.field3973.field3908[arg0.field3977] / class98.field1357;
			int var4 = (var3 + 1048575 - arg0.field3997) / var3;
			arg0.field3997 = arg0.field3997 + arg1 * var3 & 0xFFFFF;
			if (var4 <= arg1) {
				if (this.field3973.field3929[arg0.field3977] == 0) {
					arg0.field3995 = class104.method3068(arg0.field3979, arg0.field3995.method3100(), arg0.field3995.method3091(), arg0.field3995.method3177());
				} else {
					arg0.field3995 = class104.method3068(arg0.field3979, arg0.field3995.method3100(), 0, arg0.field3995.method3177());
					this.field3973.method6594(arg0, arg0.field3992.field3960[arg0.field3982] < 0);
				}
				if (arg0.field3992.field3960[arg0.field3982] < 0) {
					arg0.field3995.method3087(-1);
				}
				arg1 = arg0.field3997 / var3;
			}
		}
		arg0.field3995.method2900(arg1);
	}
}
