package deob;

import java.util.Arrays;

@ObfuscatedName("rj")
public class class455 {

	@ObfuscatedName("rj.aw")
	public static final class455 field5185 = new class455();

	@ObfuscatedName("rj.at")
	public static class455[] field5186 = new class455[0];

	@ObfuscatedName("rj.aq")
	public float[] field5187 = new float[16];

	static {
		method5094(16);
	}

	public class455() {
		this.method8434();
	}

	public class455(class455 arg0) {
		this.method8436(arg0);
	}

	public class455(class591 arg0, boolean arg1) {
		this.method8431(arg0, arg1);
	}

	@ObfuscatedName("ji.af(IB)V")
	public static void method5094(int arg0) {
		Statics.field5190 = arg0;
		field5186 = new class455[arg0];
		Statics.field1932 = 0;
	}

	@ObfuscatedName("pc.aw(I)Lrj;")
	public static class455 method7603() {
		class455[] var0 = field5186;
		synchronized (field5186) {
			if (Statics.field1932 == 0) {
				return new class455();
			} else {
				field5186[--Statics.field1932].method8434();
				return field5186[Statics.field1932];
			}
		}
	}

	@ObfuscatedName("fo.at(Lrj;I)Lrj;")
	public static class455 method3584(class455 arg0) {
		class455[] var1 = field5186;
		synchronized (field5186) {
			if (Statics.field1932 == 0) {
				return new class455(arg0);
			} else {
				field5186[--Statics.field1932].method8436(arg0);
				return field5186[Statics.field1932];
			}
		}
	}

	@ObfuscatedName("rj.ac(I)V")
	public void method8484() {
		class455[] var1 = field5186;
		synchronized (field5186) {
			if (Statics.field1932 < Statics.field5190) {
				field5186[++Statics.field1932 - 1] = this;
			}
		}
	}

	@ObfuscatedName("rj.ap(Lwb;ZI)V")
	public void method8431(class591 arg0, boolean arg1) {
		if (!arg1) {
			for (int var16 = 0; var16 < 16; var16++) {
				this.field5187[var16] = arg0.method10503();
			}
			return;
		}
		class456 var3 = new class456();
		int var5 = arg0.method10593();
		int var6 = var5 & 0x3FFF;
		float var7 = (float) ((double) var6 * 3.834951969714103E-4D);
		var3.method8525(var7);
		int var9 = arg0.method10593();
		int var10 = var9 & 0x3FFF;
		float var11 = (float) ((double) var10 * 3.834951969714103E-4D);
		var3.method8526(var11);
		int var13 = arg0.method10593();
		int var14 = var13 & 0x3FFF;
		float var15 = (float) ((double) var14 * 3.834951969714103E-4D);
		var3.method8527(var15);
		var3.method8541((float) arg0.method10593(), (float) arg0.method10593(), (float) arg0.method10593());
		this.method8443(var3);
	}

	@ObfuscatedName("rj.aq(I)[F")
	public float[] method8432() {
		float[] var1 = new float[3];
		if ((double) this.field5187[2] < 0.999D && (double) this.field5187[2] > -0.999D) {
			var1[1] = (float) -Math.asin((double) this.field5187[2]);
			double var2 = Math.cos((double) var1[1]);
			var1[0] = (float) Math.atan2((double) this.field5187[6] / var2, (double) this.field5187[10] / var2);
			var1[2] = (float) Math.atan2((double) this.field5187[1] / var2, (double) this.field5187[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float) Math.atan2((double) this.field5187[2], 0.0D);
			var1[2] = (float) Math.atan2((double) -this.field5187[9], (double) this.field5187[5]);
		}
		return var1;
	}

	@ObfuscatedName("rj.ao(S)[F")
	public float[] method8433() {
		float[] var1 = new float[] { (float) -Math.asin((double) this.field5187[6]), 0.0F, 0.0F };
		double var2 = Math.cos((double) var1[0]);
		if (Math.abs(var2) > 0.005D) {
			double var4 = (double) this.field5187[2];
			double var6 = (double) this.field5187[10];
			double var8 = (double) this.field5187[4];
			double var10 = (double) this.field5187[5];
			var1[1] = (float) Math.atan2(var4, var6);
			var1[2] = (float) Math.atan2(var8, var10);
		} else {
			double var12 = (double) this.field5187[1];
			double var14 = (double) this.field5187[0];
			if (this.field5187[6] < 0.0F) {
				var1[1] = (float) Math.atan2(var12, var14);
			} else {
				var1[1] = (float) -Math.atan2(var12, var14);
			}
			var1[2] = 0.0F;
		}
		return var1;
	}

	@ObfuscatedName("rj.as(I)V")
	public void method8434() {
		this.field5187[0] = 1.0F;
		this.field5187[1] = 0.0F;
		this.field5187[2] = 0.0F;
		this.field5187[3] = 0.0F;
		this.field5187[4] = 0.0F;
		this.field5187[5] = 1.0F;
		this.field5187[6] = 0.0F;
		this.field5187[7] = 0.0F;
		this.field5187[8] = 0.0F;
		this.field5187[9] = 0.0F;
		this.field5187[10] = 1.0F;
		this.field5187[11] = 0.0F;
		this.field5187[12] = 0.0F;
		this.field5187[13] = 0.0F;
		this.field5187[14] = 0.0F;
		this.field5187[15] = 1.0F;
	}

	@ObfuscatedName("rj.al(I)V")
	public void method8435() {
		this.field5187[0] = 0.0F;
		this.field5187[1] = 0.0F;
		this.field5187[2] = 0.0F;
		this.field5187[3] = 0.0F;
		this.field5187[4] = 0.0F;
		this.field5187[5] = 0.0F;
		this.field5187[6] = 0.0F;
		this.field5187[7] = 0.0F;
		this.field5187[8] = 0.0F;
		this.field5187[9] = 0.0F;
		this.field5187[10] = 0.0F;
		this.field5187[11] = 0.0F;
		this.field5187[12] = 0.0F;
		this.field5187[13] = 0.0F;
		this.field5187[14] = 0.0F;
		this.field5187[15] = 0.0F;
	}

	@ObfuscatedName("rj.au(Lrj;B)V")
	public void method8436(class455 arg0) {
		System.arraycopy(arg0.field5187, 0, this.field5187, 0, 16);
	}

	@ObfuscatedName("rj.ai(FB)V")
	public void method8437(float arg0) {
		this.method8476(arg0, arg0, arg0);
	}

	@ObfuscatedName("rj.aa(FFFI)V")
	public void method8476(float arg0, float arg1, float arg2) {
		this.method8434();
		this.field5187[0] = arg0;
		this.field5187[5] = arg1;
		this.field5187[10] = arg2;
	}

	@ObfuscatedName("rj.am(Lrj;I)V")
	public void method8439(class455 arg0) {
		for (int var2 = 0; var2 < this.field5187.length; var2++) {
			this.field5187[var2] += arg0.field5187[var2];
		}
	}

	@ObfuscatedName("rj.an(Lrj;I)V")
	public void method8517(class455 arg0) {
		float var2 = this.field5187[3] * arg0.field5187[12] + this.field5187[2] * arg0.field5187[8] + this.field5187[0] * arg0.field5187[0] + this.field5187[1] * arg0.field5187[4];
		float var3 = this.field5187[3] * arg0.field5187[13] + this.field5187[2] * arg0.field5187[9] + this.field5187[1] * arg0.field5187[5] + this.field5187[0] * arg0.field5187[1];
		float var4 = this.field5187[3] * arg0.field5187[14] + this.field5187[2] * arg0.field5187[10] + this.field5187[1] * arg0.field5187[6] + this.field5187[0] * arg0.field5187[2];
		float var5 = this.field5187[3] * arg0.field5187[15] + this.field5187[2] * arg0.field5187[11] + this.field5187[0] * arg0.field5187[3] + this.field5187[1] * arg0.field5187[7];
		float var6 = this.field5187[7] * arg0.field5187[12] + this.field5187[6] * arg0.field5187[8] + this.field5187[5] * arg0.field5187[4] + this.field5187[4] * arg0.field5187[0];
		float var7 = this.field5187[7] * arg0.field5187[13] + this.field5187[6] * arg0.field5187[9] + this.field5187[4] * arg0.field5187[1] + this.field5187[5] * arg0.field5187[5];
		float var8 = this.field5187[7] * arg0.field5187[14] + this.field5187[6] * arg0.field5187[10] + this.field5187[4] * arg0.field5187[2] + this.field5187[5] * arg0.field5187[6];
		float var9 = this.field5187[7] * arg0.field5187[15] + this.field5187[6] * arg0.field5187[11] + this.field5187[4] * arg0.field5187[3] + this.field5187[5] * arg0.field5187[7];
		float var10 = this.field5187[11] * arg0.field5187[12] + this.field5187[10] * arg0.field5187[8] + this.field5187[9] * arg0.field5187[4] + this.field5187[8] * arg0.field5187[0];
		float var11 = this.field5187[11] * arg0.field5187[13] + this.field5187[10] * arg0.field5187[9] + this.field5187[9] * arg0.field5187[5] + this.field5187[8] * arg0.field5187[1];
		float var12 = this.field5187[11] * arg0.field5187[14] + this.field5187[10] * arg0.field5187[10] + this.field5187[8] * arg0.field5187[2] + this.field5187[9] * arg0.field5187[6];
		float var13 = this.field5187[11] * arg0.field5187[15] + this.field5187[10] * arg0.field5187[11] + this.field5187[8] * arg0.field5187[3] + this.field5187[9] * arg0.field5187[7];
		float var14 = this.field5187[15] * arg0.field5187[12] + this.field5187[14] * arg0.field5187[8] + this.field5187[12] * arg0.field5187[0] + this.field5187[13] * arg0.field5187[4];
		float var15 = this.field5187[15] * arg0.field5187[13] + this.field5187[14] * arg0.field5187[9] + this.field5187[13] * arg0.field5187[5] + this.field5187[12] * arg0.field5187[1];
		float var16 = this.field5187[15] * arg0.field5187[14] + this.field5187[14] * arg0.field5187[10] + this.field5187[12] * arg0.field5187[2] + this.field5187[13] * arg0.field5187[6];
		float var17 = this.field5187[15] * arg0.field5187[15] + this.field5187[14] * arg0.field5187[11] + this.field5187[13] * arg0.field5187[7] + this.field5187[12] * arg0.field5187[3];
		this.field5187[0] = var2;
		this.field5187[1] = var3;
		this.field5187[2] = var4;
		this.field5187[3] = var5;
		this.field5187[4] = var6;
		this.field5187[5] = var7;
		this.field5187[6] = var8;
		this.field5187[7] = var9;
		this.field5187[8] = var10;
		this.field5187[9] = var11;
		this.field5187[10] = var12;
		this.field5187[11] = var13;
		this.field5187[12] = var14;
		this.field5187[13] = var15;
		this.field5187[14] = var16;
		this.field5187[15] = var17;
	}

	@ObfuscatedName("rj.ar(Lrq;I)V")
	public void method8441(class449 arg0) {
		float var2 = arg0.field5156.field5182 * arg0.field5156.field5182;
		float var3 = arg0.field5156.field5183 * arg0.field5156.field5182;
		float var4 = arg0.field5156.field5182 * arg0.field5156.field5180;
		float var5 = arg0.field5156.field5182 * arg0.field5156.field5181;
		float var6 = arg0.field5156.field5183 * arg0.field5156.field5183;
		float var7 = arg0.field5156.field5183 * arg0.field5156.field5180;
		float var8 = arg0.field5156.field5183 * arg0.field5156.field5181;
		float var9 = arg0.field5156.field5180 * arg0.field5156.field5180;
		float var10 = arg0.field5156.field5181 * arg0.field5156.field5180;
		float var11 = arg0.field5156.field5181 * arg0.field5156.field5181;
		this.field5187[0] = var2 + var6 - var11 - var9;
		this.field5187[1] = var5 + var7 + var7 + var5;
		this.field5187[2] = var8 - var4 - var4 + var8;
		this.field5187[4] = var7 - var5 - var5 + var7;
		this.field5187[5] = var2 + var9 - var6 - var11;
		this.field5187[6] = var3 + var10 + var10 + var3;
		this.field5187[8] = var4 + var8 + var8 + var4;
		this.field5187[9] = var10 - var3 - var3 + var10;
		this.field5187[10] = var2 + var11 - var9 - var6;
		float[] var12 = this.field5187;
		float[] var13 = this.field5187;
		this.field5187[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field5187[12] = arg0.field5155.field5176;
		this.field5187[13] = arg0.field5155.field5177;
		this.field5187[14] = arg0.field5155.field5170;
		this.field5187[15] = 1.0F;
	}

	@ObfuscatedName("rj.ae(Lrl;I)V")
	public void method8451(class454 arg0) {
		float var2 = arg0.field5182 * arg0.field5182;
		float var3 = arg0.field5183 * arg0.field5182;
		float var4 = arg0.field5182 * arg0.field5180;
		float var5 = arg0.field5182 * arg0.field5181;
		float var6 = arg0.field5183 * arg0.field5183;
		float var7 = arg0.field5183 * arg0.field5180;
		float var8 = arg0.field5183 * arg0.field5181;
		float var9 = arg0.field5180 * arg0.field5180;
		float var10 = arg0.field5181 * arg0.field5180;
		float var11 = arg0.field5181 * arg0.field5181;
		this.field5187[0] = var2 + var6 - var11 - var9;
		this.field5187[1] = var5 + var7 + var7 + var5;
		this.field5187[2] = var8 - var4 - var4 + var8;
		this.field5187[4] = var7 - var5 - var5 + var7;
		this.field5187[5] = var2 + var9 - var6 - var11;
		this.field5187[6] = var3 + var10 + var10 + var3;
		this.field5187[8] = var4 + var8 + var8 + var4;
		this.field5187[9] = var10 - var3 - var3 + var10;
		this.field5187[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("rj.ay(Lra;I)V")
	public void method8443(class456 arg0) {
		this.field5187[0] = arg0.field5202;
		this.field5187[1] = arg0.field5192;
		this.field5187[2] = arg0.field5193;
		this.field5187[3] = 0.0F;
		this.field5187[4] = arg0.field5191;
		this.field5187[5] = arg0.field5195;
		this.field5187[6] = arg0.field5196;
		this.field5187[7] = 0.0F;
		this.field5187[8] = arg0.field5197;
		this.field5187[9] = arg0.field5198;
		this.field5187[10] = arg0.field5199;
		this.field5187[11] = 0.0F;
		this.field5187[12] = arg0.field5200;
		this.field5187[13] = arg0.field5201;
		this.field5187[14] = arg0.field5194;
		this.field5187[15] = 1.0F;
	}

	@ObfuscatedName("rj.ad(I)F")
	public float method8444() {
		return this.field5187[3] * this.field5187[6] * this.field5187[9] * this.field5187[12] + (this.field5187[3] * this.field5187[5] * this.field5187[8] * this.field5187[14] + this.field5187[4] * this.field5187[3] * this.field5187[10] * this.field5187[13] + (this.field5187[2] * this.field5187[7] * this.field5187[8] * this.field5187[13] + this.field5187[5] * this.field5187[2] * this.field5187[11] * this.field5187[12] + (this.field5187[2] * this.field5187[4] * this.field5187[9] * this.field5187[15] + this.field5187[7] * this.field5187[1] * this.field5187[10] * this.field5187[12] + (this.field5187[6] * this.field5187[1] * this.field5187[8] * this.field5187[15] + this.field5187[4] * this.field5187[1] * this.field5187[11] * this.field5187[14] + (this.field5187[0] * this.field5187[7] * this.field5187[9] * this.field5187[14] + this.field5187[0] * this.field5187[6] * this.field5187[11] * this.field5187[13] + (this.field5187[0] * this.field5187[5] * this.field5187[10] * this.field5187[15] - this.field5187[5] * this.field5187[0] * this.field5187[11] * this.field5187[14] - this.field5187[0] * this.field5187[6] * this.field5187[9] * this.field5187[15]) - this.field5187[7] * this.field5187[0] * this.field5187[10] * this.field5187[13] - this.field5187[1] * this.field5187[4] * this.field5187[10] * this.field5187[15]) - this.field5187[1] * this.field5187[6] * this.field5187[11] * this.field5187[12] - this.field5187[7] * this.field5187[1] * this.field5187[8] * this.field5187[14]) - this.field5187[4] * this.field5187[2] * this.field5187[11] * this.field5187[13] - this.field5187[5] * this.field5187[2] * this.field5187[8] * this.field5187[15]) - this.field5187[7] * this.field5187[2] * this.field5187[9] * this.field5187[12] - this.field5187[4] * this.field5187[3] * this.field5187[9] * this.field5187[14]) - this.field5187[3] * this.field5187[5] * this.field5187[10] * this.field5187[12] - this.field5187[3] * this.field5187[6] * this.field5187[8] * this.field5187[13]);
	}

	@ObfuscatedName("rj.ag(I)V")
	public void method8445() {
		float var1 = 1.0F / this.method8444();
		float var2 = (this.field5187[9] * this.field5187[7] * this.field5187[14] + this.field5187[6] * this.field5187[11] * this.field5187[13] + (this.field5187[5] * this.field5187[10] * this.field5187[15] - this.field5187[5] * this.field5187[11] * this.field5187[14] - this.field5187[9] * this.field5187[6] * this.field5187[15]) - this.field5187[7] * this.field5187[10] * this.field5187[13]) * var1;
		float var3 = (this.field5187[10] * this.field5187[3] * this.field5187[13] + (this.field5187[9] * this.field5187[2] * this.field5187[15] + this.field5187[10] * -this.field5187[1] * this.field5187[15] + this.field5187[1] * this.field5187[11] * this.field5187[14] - this.field5187[2] * this.field5187[11] * this.field5187[13] - this.field5187[3] * this.field5187[9] * this.field5187[14])) * var1;
		float var4 = (this.field5187[5] * this.field5187[3] * this.field5187[14] + this.field5187[2] * this.field5187[7] * this.field5187[13] + (this.field5187[6] * this.field5187[1] * this.field5187[15] - this.field5187[7] * this.field5187[1] * this.field5187[14] - this.field5187[2] * this.field5187[5] * this.field5187[15]) - this.field5187[6] * this.field5187[3] * this.field5187[13]) * var1;
		float var5 = (this.field5187[6] * this.field5187[3] * this.field5187[9] + (this.field5187[2] * this.field5187[5] * this.field5187[11] + this.field5187[6] * -this.field5187[1] * this.field5187[11] + this.field5187[7] * this.field5187[1] * this.field5187[10] - this.field5187[7] * this.field5187[2] * this.field5187[9] - this.field5187[3] * this.field5187[5] * this.field5187[10])) * var1;
		float var6 = (this.field5187[7] * this.field5187[10] * this.field5187[12] + (this.field5187[8] * this.field5187[6] * this.field5187[15] + this.field5187[10] * -this.field5187[4] * this.field5187[15] + this.field5187[4] * this.field5187[11] * this.field5187[14] - this.field5187[11] * this.field5187[6] * this.field5187[12] - this.field5187[8] * this.field5187[7] * this.field5187[14])) * var1;
		float var7 = (this.field5187[8] * this.field5187[3] * this.field5187[14] + this.field5187[11] * this.field5187[2] * this.field5187[12] + (this.field5187[10] * this.field5187[0] * this.field5187[15] - this.field5187[11] * this.field5187[0] * this.field5187[14] - this.field5187[2] * this.field5187[8] * this.field5187[15]) - this.field5187[10] * this.field5187[3] * this.field5187[12]) * var1;
		float var8 = (this.field5187[6] * this.field5187[3] * this.field5187[12] + (this.field5187[2] * this.field5187[4] * this.field5187[15] + this.field5187[7] * this.field5187[0] * this.field5187[14] + this.field5187[6] * -this.field5187[0] * this.field5187[15] - this.field5187[2] * this.field5187[7] * this.field5187[12] - this.field5187[4] * this.field5187[3] * this.field5187[14])) * var1;
		float var9 = (this.field5187[3] * this.field5187[4] * this.field5187[10] + this.field5187[2] * this.field5187[7] * this.field5187[8] + (this.field5187[0] * this.field5187[6] * this.field5187[11] - this.field5187[0] * this.field5187[7] * this.field5187[10] - this.field5187[2] * this.field5187[4] * this.field5187[11]) - this.field5187[3] * this.field5187[6] * this.field5187[8]) * var1;
		float var10 = (this.field5187[8] * this.field5187[7] * this.field5187[13] + this.field5187[5] * this.field5187[11] * this.field5187[12] + (this.field5187[4] * this.field5187[9] * this.field5187[15] - this.field5187[4] * this.field5187[11] * this.field5187[13] - this.field5187[5] * this.field5187[8] * this.field5187[15]) - this.field5187[7] * this.field5187[9] * this.field5187[12]) * var1;
		float var11 = (this.field5187[3] * this.field5187[9] * this.field5187[12] + (this.field5187[1] * this.field5187[8] * this.field5187[15] + this.field5187[11] * this.field5187[0] * this.field5187[13] + this.field5187[9] * -this.field5187[0] * this.field5187[15] - this.field5187[1] * this.field5187[11] * this.field5187[12] - this.field5187[8] * this.field5187[3] * this.field5187[13])) * var1;
		float var12 = (this.field5187[3] * this.field5187[4] * this.field5187[13] + this.field5187[7] * this.field5187[1] * this.field5187[12] + (this.field5187[5] * this.field5187[0] * this.field5187[15] - this.field5187[7] * this.field5187[0] * this.field5187[13] - this.field5187[4] * this.field5187[1] * this.field5187[15]) - this.field5187[3] * this.field5187[5] * this.field5187[12]) * var1;
		float var13 = (this.field5187[3] * this.field5187[5] * this.field5187[8] + (this.field5187[4] * this.field5187[1] * this.field5187[11] + this.field5187[5] * -this.field5187[0] * this.field5187[11] + this.field5187[7] * this.field5187[0] * this.field5187[9] - this.field5187[7] * this.field5187[1] * this.field5187[8] - this.field5187[3] * this.field5187[4] * this.field5187[9])) * var1;
		float var14 = (this.field5187[6] * this.field5187[9] * this.field5187[12] + (this.field5187[8] * this.field5187[5] * this.field5187[14] + this.field5187[4] * this.field5187[10] * this.field5187[13] + this.field5187[9] * -this.field5187[4] * this.field5187[14] - this.field5187[10] * this.field5187[5] * this.field5187[12] - this.field5187[8] * this.field5187[6] * this.field5187[13])) * var1;
		float var15 = (this.field5187[8] * this.field5187[2] * this.field5187[13] + this.field5187[1] * this.field5187[10] * this.field5187[12] + (this.field5187[0] * this.field5187[9] * this.field5187[14] - this.field5187[10] * this.field5187[0] * this.field5187[13] - this.field5187[8] * this.field5187[1] * this.field5187[14]) - this.field5187[9] * this.field5187[2] * this.field5187[12]) * var1;
		float var16 = (this.field5187[5] * this.field5187[2] * this.field5187[12] + (this.field5187[1] * this.field5187[4] * this.field5187[14] + this.field5187[6] * this.field5187[0] * this.field5187[13] + this.field5187[5] * -this.field5187[0] * this.field5187[14] - this.field5187[1] * this.field5187[6] * this.field5187[12] - this.field5187[2] * this.field5187[4] * this.field5187[13])) * var1;
		float var17 = (this.field5187[2] * this.field5187[4] * this.field5187[9] + this.field5187[1] * this.field5187[6] * this.field5187[8] + (this.field5187[0] * this.field5187[5] * this.field5187[10] - this.field5187[0] * this.field5187[6] * this.field5187[9] - this.field5187[1] * this.field5187[4] * this.field5187[10]) - this.field5187[2] * this.field5187[5] * this.field5187[8]) * var1;
		this.field5187[0] = var2;
		this.field5187[1] = var3;
		this.field5187[2] = var4;
		this.field5187[3] = var5;
		this.field5187[4] = var6;
		this.field5187[5] = var7;
		this.field5187[6] = var8;
		this.field5187[7] = var9;
		this.field5187[8] = var10;
		this.field5187[9] = var11;
		this.field5187[10] = var12;
		this.field5187[11] = var13;
		this.field5187[12] = var14;
		this.field5187[13] = var15;
		this.field5187[14] = var16;
		this.field5187[15] = var17;
	}

	@ObfuscatedName("rj.av(FFFFB)V")
	public void method8446(float arg0, float arg1, float arg2, float arg3) {
		this.field5187[0] = arg0;
		this.field5187[1] = 0.0F;
		this.field5187[2] = 0.0F;
		this.field5187[3] = 0.0F;
		this.field5187[4] = 0.0F;
		this.field5187[5] = arg1;
		this.field5187[6] = 0.0F;
		this.field5187[7] = 0.0F;
		this.field5187[8] = 0.0F;
		this.field5187[9] = 0.0F;
		this.field5187[10] = arg2;
		this.field5187[11] = 0.0F;
		this.field5187[12] = 0.0F;
		this.field5187[13] = 0.0F;
		this.field5187[14] = 0.0F;
		this.field5187[15] = arg3;
	}

	@ObfuscatedName("rj.ah(FFF[FB)V")
	public void method8429(float arg0, float arg1, float arg2, float[] arg3) {
		arg3[0] = this.field5187[8] * arg2 + this.field5187[0] * arg0 + this.field5187[4] * arg1 + this.field5187[12];
		arg3[1] = this.field5187[9] * arg2 + this.field5187[5] * arg1 + this.field5187[1] * arg0 + this.field5187[13];
		arg3[2] = this.field5187[10] * arg2 + this.field5187[6] * arg1 + this.field5187[2] * arg0 + this.field5187[14];
		if (arg3.length > 3) {
			arg3[3] = this.field5187[11] * arg2 + this.field5187[7] * arg1 + this.field5187[3] * arg0 + this.field5187[15];
		}
	}

	@ObfuscatedName("rj.ab(FFFB)Lre;")
	public class453 method8488(float arg0, float arg1, float arg2) {
		float var4 = 1.0F / (this.field5187[11] * arg2 + this.field5187[3] * arg0 + this.field5187[7] * arg1 + this.field5187[15]);
		return class453.method6269((this.field5187[8] * arg2 + this.field5187[0] * arg0 + this.field5187[4] * arg1 + this.field5187[12]) * var4, (this.field5187[9] * arg2 + this.field5187[1] * arg0 + this.field5187[5] * arg1 + this.field5187[13]) * var4, (this.field5187[10] * arg2 + this.field5187[6] * arg1 + this.field5187[2] * arg0 + this.field5187[14]) * var4);
	}

	@ObfuscatedName("rj.ax(FFFS)F")
	public float method8449(float arg0, float arg1, float arg2) {
		return this.field5187[8] * arg2 + this.field5187[4] * arg1 + this.field5187[0] * arg0 + this.field5187[12];
	}

	@ObfuscatedName("rj.ak(FFFI)F")
	public float method8518(float arg0, float arg1, float arg2) {
		return this.field5187[9] * arg2 + this.field5187[1] * arg0 + this.field5187[5] * arg1 + this.field5187[13];
	}

	@ObfuscatedName("rj.aj(FFFB)F")
	public float method8447(float arg0, float arg1, float arg2) {
		return this.field5187[10] * arg2 + this.field5187[2] * arg0 + this.field5187[6] * arg1 + this.field5187[14];
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8433();
		this.method8432();
		for (int var2 = 0; var2 < 4; var2++) {
			for (int var3 = 0; var3 < 4; var3++) {
				if (var3 > 0) {
					var1.append("\t");
				}
				float var4 = this.field5187[var2 * 4 + var3];
				if (Math.sqrt((double) (var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}
				var1.append(var4);
			}
			var1.append("\n");
		}
		return var1.toString();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		return var2 * 31 + Arrays.hashCode(this.field5187);
	}

	public boolean equals(Object arg0) {
		if (!(arg0 instanceof class455)) {
			return false;
		}
		class455 var2 = (class455) arg0;
		for (int var3 = 0; var3 < 16; var3++) {
			if (this.field5187[var3] != var2.field5187[var3]) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("rj.az(I)[F")
	public float[] method8440() {
		float[] var1 = new float[3];
		class453 var2 = new class453(this.field5187[0], this.field5187[1], this.field5187[2]);
		class453 var3 = new class453(this.field5187[4], this.field5187[5], this.field5187[6]);
		class453 var4 = new class453(this.field5187[8], this.field5187[9], this.field5187[10]);
		var1[0] = var2.method8346();
		var1[1] = var3.method8346();
		var1[2] = var4.method8346();
		return var1;
	}
}
