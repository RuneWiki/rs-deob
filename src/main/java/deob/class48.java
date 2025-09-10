package deob;

import java.util.ArrayList;
import java.util.Arrays;

@ObfuscatedName("bj")
public class class48 {

	@ObfuscatedName("bj.af")
	public final ArrayList field679 = new ArrayList(1);

	@ObfuscatedName("bj.aw")
	public int field675 = 0;

	@ObfuscatedName("bj.at")
	public class357 field676 = new class357();

	@ObfuscatedName("bj.ac")
	public byte field677;

	@ObfuscatedName("bj.ap")
	public class281 field678;

	@ObfuscatedName("bj.aq")
	public class591 field681;

	@ObfuscatedName("bj.ao")
	public String[] field680 = new String[3];

	@ObfuscatedName("bj.as")
	public int field683 = -1;

	@ObfuscatedName("bj.al")
	public int field687 = 0;

	@ObfuscatedName("bj.au")
	public int field682 = -1;

	@ObfuscatedName("bj.ai")
	public int field684 = -1;

	public class48(int arg0) {
		this.field683 = arg0;
		for (int var2 = 0; var2 < 3; var2++) {
			this.field680[var2] = "";
		}
	}

	@ObfuscatedName("bj.af(B)V")
	public void method1747() {
		this.field681 = null;
		this.field679.clear();
	}

	@ObfuscatedName("bj.aw(II)V")
	public void method1777(int arg0) {
		this.field675 = arg0;
		this.field687 = 0;
		this.field682 = -1;
		this.field684 = -1;
		this.field677 = 0;
		this.field678 = class281.field3282;
		this.field681 = null;
	}

	@ObfuscatedName("bj.at(Lcv;B)V")
	public void method1749(class70 arg0) {
		this.field679.add(arg0);
	}

	@ObfuscatedName("bj.ac(Lcv;B)V")
	public void method1750(class70 arg0) {
		this.field679.remove(arg0);
	}

	@ObfuscatedName("bj.ap(B)V")
	public void method1776() {
		this.field679.clear();
	}

	@ObfuscatedName("bj.aq(ILdr;I)Lcv;")
	public class70 method1752(int arg0, class80 arg1) {
		class70 var3 = new class70(arg0);
		if (this.field681 != null) {
			var3.method2131(this.field681);
		}
		var3.field1098 = this.field687;
		var3.field1083 = this.field684;
		var3.field1055[0] = this.field678;
		var3.field934 = this.field676.field4028;
		var3.field1054 = arg1.field1173;
		var3.field939 = this.field680;
		var3.method2383(this.field676.field4027 - arg1.field1165, this.field676.field4026 - arg1.field1166);
		return var3;
	}

	@ObfuscatedName("bj.ao(I)Z")
	public boolean method1828() {
		return this.field675 == -1;
	}

	@ObfuscatedName("bj.as(I)V")
	public void method1754() {
		this.field675 = this.field676.method6816();
	}

	@ObfuscatedName("bj.al(III)V")
	public void method1755(int arg0, int arg1) {
		this.field676.method6812(this.field675, arg0, arg1);
		this.field675 = -1;
	}

	@ObfuscatedName("bj.au(I)I")
	public int method1756() {
		return this.field676.field4028;
	}

	@ObfuscatedName("bj.ai(II)V")
	public void method1790(int arg0) {
		this.field676.field4028 = arg0;
	}

	@ObfuscatedName("bj.aa(Lko;I)V")
	public void method1788(class281 arg0) {
		for (int var2 = 0; var2 < this.field679.size(); var2++) {
			class70 var3 = (class70) this.field679.get(var2);
			class80 var4 = var3.method2422();
			int var5 = this.field676.field4027 - var4.field1165;
			int var6 = this.field676.field4026 - var4.field1166;
			class281 var7 = arg0;
			boolean var8 = true;
			boolean var9 = true;
			if (var4.field1173 == -1 && client.field349 == this.field683 && class385.field4405 == Statics.field8 && (var3.field1056 < 1536 || var3.field1057 < 1536 || var3.field1056 >= 11776 || var3.field1057 >= 11776)) {
				var7 = class281.field3280;
			}
			var3.field934 = this.field676.field4028;
			if (class281.field3280 == var7) {
				var3.method2383(var5, var6);
			} else {
				var3.method2172(var4, var5, var6, var7);
			}
		}
	}

	@ObfuscatedName("bj.am(Lwb;I)V")
	public void method1833(class591 arg0) {
		this.field681 = arg0;
		for (int var2 = 0; var2 < this.field679.size(); var2++) {
			((class70) this.field679.get(var2)).method2131(this.field681);
		}
	}

	@ObfuscatedName("bj.an(III)V")
	public void method1800(int arg0, int arg1) {
		for (int var3 = 0; var3 < this.field679.size(); var3++) {
			client.method3768((class70) this.field679.get(var3), arg0, arg1);
		}
	}

	@ObfuscatedName("bj.ar(II)V")
	public void method1761(int arg0) {
		this.field684 = arg0;
		for (int var2 = 0; var2 < this.field679.size(); var2++) {
			((class76) this.field679.get(var2)).field1083 = arg0;
		}
	}

	@ObfuscatedName("bj.ae(Ljava/lang/String;I)V")
	public void method1762(String arg0) {
		boolean var2 = arg0.charAt(0) == '~';
		if (var2) {
			arg0 = arg0.substring(1);
		}
		class614 var3 = null;
		for (int var4 = 0; var4 < this.field679.size(); var4++) {
			class70 var5 = (class70) this.field679.get(var4);
			var5.field1102 = false;
			var5.field1080 = 0;
			var5.field1081 = 0;
			var5.field1079 = 150;
			var5.field1076 = arg0;
			var3 = var5.field935;
		}
		if (var3 != null && (var2 || client.field492 == this.field683)) {
			class92.method2825(2, var3.method11022(), arg0);
		}
	}

	@ObfuscatedName("bj.ay(IIIIIB)V")
	public void method1817(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < this.field679.size(); var6++) {
			((class76) this.field679.get(var6)).method2386(arg0, arg1, arg2, arg3, client.field413, arg4);
		}
	}

	@ObfuscatedName("bj.ad(IIIIII)V")
	public void method1760(int arg0, int arg1, int arg2, int arg3, int arg4) {
		for (int var6 = 0; var6 < this.field679.size(); var6++) {
			((class76) this.field679.get(var6)).method2408(arg0, client.field413, arg1, arg2, arg3, arg4);
		}
	}

	@ObfuscatedName("bj.ag(IB)V")
	public void method1765(int arg0) {
		for (int var2 = 0; var2 < this.field679.size(); var2++) {
			((class76) this.field679.get(var2)).method2388(arg0);
		}
	}

	@ObfuscatedName("bj.av(II)V")
	public void method1766(int arg0) {
		this.field682 = arg0;
		for (int var2 = 0; var2 < this.field679.size(); var2++) {
			class70 var3 = (class70) this.field679.get(var2);
			var3.field1050 = this.field682;
			if (var3.field1101 == 0) {
				var3.field1098 = this.field682;
				var3.method2393();
			}
		}
	}

	@ObfuscatedName("bj.ah(ILpg;ZLjava/lang/String;[BS)V")
	public void method1767(int arg0, class398 arg1, boolean arg2, String arg3, byte[] arg4) {
		boolean var6 = false;
		String var7 = null;
		for (int var8 = 0; var8 < this.field679.size(); var8++) {
			class70 var9 = (class70) this.field679.get(var8);
			if (var9.field935 != null && var9.field936 != null) {
				boolean var10 = false;
				if (arg1.field4820 && Statics.field280.method1512(var9.field935)) {
					var10 = true;
				}
				if (!var10 && client.field342 == 0 && !var9.field955) {
					var6 = true;
					var7 = var9.field935.method11022();
					var9.field1076 = arg3.trim();
					var9.field1080 = arg0 >> 8;
					var9.field1081 = arg0 & 0xFF;
					var9.field1079 = 150;
					var9.field1082 = class615.method10951(arg4);
					var9.field1102 = arg2;
					var9.field1078 = Statics.field1109 != var9 && arg1.field4820 && !client.field442.isEmpty() && arg3.toLowerCase().indexOf(client.field442) == -1;
				}
			}
		}
		if (!var6 || var7 == null) {
			return;
		}
		int var11;
		if (arg1.field4834) {
			var11 = arg2 ? 91 : 1;
		} else {
			var11 = arg2 ? 90 : 2;
		}
		if (arg1.field4816 == -1) {
			class92.method2825(var11, var7, arg3);
		} else {
			class92.method2825(var11, class83.method1981(arg1.field4816) + var7, arg3);
		}
	}

	@ObfuscatedName("bj.ab(IIIIIIII)V")
	public void method1768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		for (int var8 = 0; var8 < this.field679.size(); var8++) {
			class70 var9 = (class70) this.field679.get(var8);
			class80 var10 = var9.method2422();
			int var11 = this.field676.field4027 - var10.field1165;
			int var12 = this.field676.field4026 - var10.field1166;
			var9.field1090 = arg0 + var11;
			var9.field1092 = arg1 + var12;
			var9.field1073 = arg2 + var11;
			var9.field1085 = arg3 + var12;
			var9.field1086 = arg4;
			var9.field1095 = arg5;
			var9.field1096 = arg6;
			var9.field1041 = 0;
			var9.method2144(var9.field1073, var9.field1085);
			var9.field934 = this.field676.field4028;
		}
	}

	@ObfuscatedName("bj.ax([Ljava/lang/String;B)V")
	public void method1769(String[] arg0) {
		this.field680 = (String[]) Arrays.copyOf(arg0, arg0.length);
		for (int var2 = 0; var2 < this.field679.size(); var2++) {
			((class70) this.field679.get(var2)).field939 = (String[]) Arrays.copyOf(arg0, arg0.length);
		}
	}

	@ObfuscatedName("bj.ak(IIBBBBB)V")
	public void method1770(int arg0, int arg1, byte arg2, byte arg3, byte arg4, byte arg5) {
		for (int var7 = 0; var7 < this.field679.size(); var7++) {
			class70 var8 = (class70) this.field679.get(var7);
			var8.field1052 = arg0;
			var8.field1053 = arg1;
			var8.field1077.method5312(arg2, arg3, arg4, arg5);
		}
	}

	@ObfuscatedName("bj.aj(IIIII)V")
	public void method1748(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = 0; var5 < this.field679.size(); var5++) {
			((class76) this.field679.get(var5)).method2406(arg0, arg1, arg2, arg3);
		}
	}
}
