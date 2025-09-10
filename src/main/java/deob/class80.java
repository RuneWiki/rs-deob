package deob;

import java.util.Iterator;

@ObfuscatedName("dr")
public class class80 extends class545 {

	@ObfuscatedName("dr.af")
	public final class437 field1158 = new class437();

	@ObfuscatedName("dr.aw")
	public int field1173;

	@ObfuscatedName("dr.at")
	public class231 field1160;

	@ObfuscatedName("dr.ac")
	public class276[] field1176 = new class276[4];

	@ObfuscatedName("dr.ap")
	public int field1171;

	@ObfuscatedName("dr.aq")
	public int field1163;

	@ObfuscatedName("dr.ao")
	public int field1164;

	@ObfuscatedName("dr.as")
	public int field1165;

	@ObfuscatedName("dr.al")
	public int field1166;

	@ObfuscatedName("dr.au")
	public int[][] field1167;

	@ObfuscatedName("dr.ai")
	public int[][][] field1174;

	@ObfuscatedName("dr.aa")
	public byte[][][] field1169;

	@ObfuscatedName("dr.am")
	public class425 field1170;

	@ObfuscatedName("dr.an")
	public class425 field1161;

	@ObfuscatedName("dr.ar")
	public class427 field1172;

	@ObfuscatedName("dr.ae")
	public class437[][][] field1168;

	@ObfuscatedName("dr.ay")
	public class437 field1159 = new class437();

	@ObfuscatedName("dr.ad")
	public class437 field1175 = new class437();

	@ObfuscatedName("dr.ag")
	public class487 field1162 = new class487(149);

	@ObfuscatedName("dr.av")
	public class487 field1177 = new class487(25);

	public class80(int arg0, int arg1, int arg2, int arg3, class218 arg4) {
		this.field1173 = arg0;
		this.field1163 = arg1;
		this.field1164 = arg2;
		this.field1170 = new class425(arg0 == -1 ? 512 : 8);
		this.field1161 = new class425(arg0 == -1 ? 128 : 8);
		this.field1172 = new class427(arg0 == -1 ? 32 : 1);
		this.field1168 = new class437[4][arg1][arg2];
		this.field1174 = new int[4][arg1 + 1][arg2 + 1];
		this.field1169 = new byte[4][arg1][arg2];
		this.field1167 = new int[arg1][arg2];
		boolean var6 = arg0 != -1;
		for (int var7 = 0; var7 < 4; var7++) {
			this.field1176[var7] = new class276(arg1, arg2, var6);
		}
		this.field1160 = new class231(arg0, 4, arg1, arg2, arg3, arg4, this.field1174);
	}

	@ObfuscatedName("dr.af(I)Z")
	public boolean method2642() {
		return this.field1173 == -1;
	}

	@ObfuscatedName("dr.aw(I)V")
	public void method2632() {
		this.field1162.method9110();
		this.field1177.method9110();
		this.field1170.method7910();
		this.field1161.method7910();
		this.field1172.method7941();
		this.field1175.method8029();
		this.field1159 = new class437();
		for (int var1 = 0; var1 < 4; var1++) {
			for (int var2 = 0; var2 < this.field1163; var2++) {
				for (int var3 = 0; var3 < this.field1164; var3++) {
					this.field1168[var1][var2][var3] = null;
				}
			}
		}
		this.field1160.method4800();
		for (int var4 = 0; var4 < 4; var4++) {
			this.field1176[var4].method5725();
		}
	}

	@ObfuscatedName("dr.at(I)V")
	public void method2631() {
		this.field1170.method7910();
		Iterator var1 = this.field1161.iterator();
		while (var1.hasNext()) {
			class76 var2 = (class76) var1.next();
			var2.field1083 = -1;
			var2.field1049 = false;
		}
	}

	@ObfuscatedName("dr.ac(IB)Lcv;")
	public class70 method2634(int arg0) {
		return (class70) this.field1170.method7917((long) arg0);
	}

	@ObfuscatedName("dr.ap(B)Lqs;")
	public class437 method2635() {
		return this.field1158;
	}

	@ObfuscatedName("dr.aq(IIILib;II)V")
	public void method2636(int arg0, int arg1, int arg2, class213 arg3, int arg4) {
		class73 var6 = new class73(this.field1173, arg0, arg1, arg2, arg4, arg3);
		this.field1158.method8033(var6);
	}

	@ObfuscatedName("dr.ao(I)V")
	public void method2637() {
		for (class73 var1 = (class73) this.field1158.method8034(); var1 != null; var1 = (class73) this.field1158.method8036()) {
			var1.method2213();
		}
	}

	@ObfuscatedName("dr.as(IIILib;IB)V")
	public void method2638(int arg0, int arg1, int arg2, class213 arg3, int arg4) {
		if (arg3 == null || !arg3.method4313()) {
			return;
		}
		int var6 = arg3.field2330;
		int var7 = arg3.field2331;
		if (arg4 == 1 || arg4 == 3) {
			var6 = arg3.field2331;
			var7 = arg3.field2330;
		}
		int var8 = class357.method6807(arg1 + var6);
		int var9 = class357.method6807(arg2 + var7);
		int var10 = class357.method6807(arg1);
		int var11 = class357.method6807(arg2);
		int var12 = arg3.field2359;
		int var13 = class357.method6807(arg3.field2360);
		int var14 = class357.method6807(arg3.field2353);
		if (arg3.field2356 != null) {
			class213 var15 = arg3.method4310();
			if (var15 != null) {
				var12 = var15.field2359;
				var13 = class357.method6807(var15.field2360);
				var14 = class357.method6807(var15.field2353);
			}
		}
		for (class73 var16 = (class73) this.field1158.method8034(); var16 != null; var16 = (class73) this.field1158.method8036()) {
			if (var16.method2221() == arg0 && var16.method2215() == var10 && var16.method2278() == var11 && var16.method2216() == var8 && var16.method2218() == var9 && var16.method2251() == var12 && var16.method2220() == var13 && var16.method2261() == var14) {
				var16.method2213();
				break;
			}
		}
	}
}
