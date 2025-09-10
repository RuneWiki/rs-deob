package deob;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("fh")
public class class147 extends class541 {

	@ObfuscatedName("fh.at")
	public int field1730;

	@ObfuscatedName("fh.ac")
	public class139[][] field1733 = (class139[][]) null;

	@ObfuscatedName("fh.ap")
	public class139[][] field1738 = (class139[][]) null;

	@ObfuscatedName("fh.aq")
	public class230 field1732;

	@ObfuscatedName("fh.ao")
	public int field1731 = 0;

	@ObfuscatedName("fh.as")
	public boolean field1736;

	@ObfuscatedName("fh.al")
	public Future field1735;

	@ObfuscatedName("fh.au")
	public List field1734;

	public class147(class413 arg0, class413 arg1, int arg2) {
		this.field1730 = arg2;
		byte[] var4 = arg0.method7692(this.field1730 >> 16 & 0xFFFF, this.field1730 & 0xFFFF);
		class591 var5 = new class591(var4);
		int var6 = var5.method10339();
		int var7 = var5.method10341();
		byte[] var8 = arg1.method7699(var7, 0);
		this.field1732 = new class230(var7, var8);
		this.field1734 = new ArrayList();
		this.field1735 = Statics.field1232.submit(new class144(this, var5, var6));
	}

	@ObfuscatedName("lg.af(Lpx;Lpx;IB)Lfh;")
	public static class147 method6264(class413 arg0, class413 arg1, int arg2) {
		byte[] var3 = arg0.method7699(arg2 >> 16 & 0xFFFF, arg2 & 0xFFFF);
		boolean var4;
		if (var3 == null) {
			var4 = false;
		} else {
			int var5 = (var3[1] & 0xFF) << 8 | var3[2] & 0xFF;
			byte[] var6 = arg1.method7699(var5, 0);
			var4 = var6 != null;
		}
		if (!var4) {
			return null;
		}
		if (Statics.field1232 == null) {
			Statics.field1231 = Runtime.getRuntime().availableProcessors();
			Statics.field1232 = new ThreadPoolExecutor(0, Statics.field1231, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field1231 * 100 + 100), new class146());
		}
		try {
			return new class147(arg0, arg1, arg2);
		} catch (Exception var9) {
			return null;
		}
	}

	@ObfuscatedName("fh.aw(Lwb;IB)V")
	public void method3638(class591 arg0, int arg1) {
		arg0.method10341();
		arg0.method10341();
		this.field1731 = arg0.method10339();
		int var3 = arg0.method10341();
		this.field1738 = new class139[this.field1732.method4794().method4725()][];
		this.field1733 = new class139[this.field1732.method4793()][];
		class138[] var4 = new class138[var3];
		for (int var5 = 0; var5 < var3; var5++) {
			int var6 = arg0.method10339();
			class140 var7 = (class140) class432.method3817(class140.method7583(), var6);
			if (var7 == null) {
				var7 = class140.field1686;
			}
			int var10 = arg0.method10354();
			int var11 = arg0.method10339();
			class141 var12 = (class141) class432.method3817(class141.method6279(), var11);
			if (var12 == null) {
				var12 = class141.field1705;
			}
			class139 var15 = new class139();
			var15.method3529(arg0, arg1);
			var4[var5] = new class138(this, var15, var7, var12, var10);
			int var16 = var7.method3564();
			class139[][] var17;
			if (class140.field1683 == var7) {
				var17 = this.field1738;
			} else {
				var17 = this.field1733;
			}
			if (var17[var10] == null) {
				var17[var10] = new class139[var16];
			}
			if (class140.field1688 == var7) {
				this.field1736 = true;
			}
		}
		int var18 = var3 / Statics.field1231;
		int var19 = var3 % Statics.field1231;
		int var20 = 0;
		for (int var21 = 0; var21 < Statics.field1231; var21++) {
			int var22 = var20;
			var20 += var18;
			if (var19 > 0) {
				var20++;
				var19--;
			}
			if (var20 == var22) {
				break;
			}
			this.field1734.add(Statics.field1232.submit(new class142(this, var22, var20, var4)));
		}
	}

	@ObfuscatedName("fh.at(I)Z")
	public boolean method3609() {
		if (this.field1735 == null && this.field1734 == null) {
			return true;
		}
		if (this.field1735 != null) {
			if (!this.field1735.isDone()) {
				return false;
			}
			this.field1735 = null;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.field1734.size(); var2++) {
			if (((Future) this.field1734.get(var2)).isDone()) {
				this.field1734.remove(var2);
				var2--;
			} else {
				var1 = false;
			}
		}
		if (var1) {
			this.field1734 = null;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("fh.ac(I)I")
	public int method3610() {
		return this.field1731;
	}

	@ObfuscatedName("fh.ap(B)Z")
	public boolean method3611() {
		return this.field1736;
	}

	@ObfuscatedName("fh.aq(ILfa;III)V")
	public void method3612(int arg0, class136 arg1, int arg2, int arg3) {
		class455 var5 = class455.method7603();
		this.method3613(var5, arg2, arg1, arg0);
		this.method3625(var5, arg2, arg1, arg0);
		this.method3614(var5, arg2, arg1, arg0);
		arg1.method3497(var5);
		var5.method8484();
	}

	@ObfuscatedName("fh.ao(Lrj;ILfa;II)V")
	public void method3613(class455 arg0, int arg1, class136 arg2, int arg3) {
		float[] var5 = arg2.method3491(this.field1731);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1738[arg1] != null) {
			class139 var9 = this.field1738[arg1][0];
			class139 var10 = this.field1738[arg1][1];
			class139 var11 = this.field1738[arg1][2];
			if (var9 != null) {
				var6 = var9.method3531(arg3);
			}
			if (var10 != null) {
				var7 = var10.method3531(arg3);
			}
			if (var11 != null) {
				var8 = var11.method3531(arg3);
			}
		}
		class454 var12 = class454.method2375();
		var12.method8400(1.0F, 0.0F, 0.0F, var6);
		class454 var13 = class454.method2375();
		var13.method8400(0.0F, 1.0F, 0.0F, var7);
		class454 var14 = class454.method2375();
		var14.method8400(0.0F, 0.0F, 1.0F, var8);
		class454 var15 = class454.method2375();
		var15.method8403(var14);
		var15.method8403(var12);
		var15.method8403(var13);
		class455 var16 = class455.method7603();
		var16.method8451(var15);
		arg0.method8517(var16);
		var12.method8398();
		var13.method8398();
		var14.method8398();
		var15.method8398();
		var16.method8484();
	}

	@ObfuscatedName("fh.as(Lrj;ILfa;IB)V")
	public void method3614(class455 arg0, int arg1, class136 arg2, int arg3) {
		float[] var5 = arg2.method3492(this.field1731);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1738[arg1] != null) {
			class139 var9 = this.field1738[arg1][3];
			class139 var10 = this.field1738[arg1][4];
			class139 var11 = this.field1738[arg1][5];
			if (var9 != null) {
				var6 = var9.method3531(arg3);
			}
			if (var10 != null) {
				var7 = var10.method3531(arg3);
			}
			if (var11 != null) {
				var8 = var11.method3531(arg3);
			}
		}
		arg0.field5187[12] = var6;
		arg0.field5187[13] = var7;
		arg0.field5187[14] = var8;
	}

	@ObfuscatedName("fh.al(Lrj;ILfa;IB)V")
	public void method3625(class455 arg0, int arg1, class136 arg2, int arg3) {
		float[] var5 = arg2.method3493(this.field1731);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1738[arg1] != null) {
			class139 var9 = this.field1738[arg1][6];
			class139 var10 = this.field1738[arg1][7];
			class139 var11 = this.field1738[arg1][8];
			if (var9 != null) {
				var6 = var9.method3531(arg3);
			}
			if (var10 != null) {
				var7 = var10.method3531(arg3);
			}
			if (var11 != null) {
				var8 = var11.method3531(arg3);
			}
		}
		class455 var12 = class455.method7603();
		var12.method8476(var6, var7, var8);
		arg0.method8517(var12);
		var12.method8484();
	}
}
