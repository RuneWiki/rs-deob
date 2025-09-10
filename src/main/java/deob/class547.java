package deob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@ObfuscatedName("vj")
public class class547 extends class545 implements class119 {

	@ObfuscatedName("vj.be")
	public int field5616;

	@ObfuscatedName("vj.bh")
	public boolean field5617;

	@ObfuscatedName("vj.bk")
	public int field5618;

	@ObfuscatedName("vj.bp")
	public int field5629;

	@ObfuscatedName("vj.br")
	public int field5637;

	@ObfuscatedName("vj.bv")
	public int field5610;

	@ObfuscatedName("vj.bj")
	public int field5609;

	@ObfuscatedName("vj.bm")
	public boolean field5623;

	@ObfuscatedName("vj.bf")
	public int field5633;

	@ObfuscatedName("vj.bw")
	public int field5625;

	@ObfuscatedName("vj.bc")
	public int field5626;

	@ObfuscatedName("vj.cw")
	public int field5627;

	@ObfuscatedName("vj.cz")
	public String field5628;

	@ObfuscatedName("vj.cf")
	public String field5612;

	@ObfuscatedName("vj.cg")
	public String field5630;

	@ObfuscatedName("vj.ci")
	public String field5631;

	@ObfuscatedName("vj.cp")
	public int field5632;

	@ObfuscatedName("vj.cm")
	public int field5611;

	@ObfuscatedName("vj.cc")
	public int field5634;

	@ObfuscatedName("vj.cj")
	public int field5635;

	@ObfuscatedName("vj.ce")
	public String field5636;

	@ObfuscatedName("vj.cr")
	public String field5622;

	@ObfuscatedName("vj.cb")
	public int[] field5638 = new int[3];

	@ObfuscatedName("vj.cu")
	public int field5639;

	@ObfuscatedName("vj.cq")
	public String field5640;

	@ObfuscatedName("vj.cn")
	public String field5621;

	public class547(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, String arg12, String arg13, String arg14, String arg15, int arg16, int arg17, int arg18, int arg19, String arg20, String arg21, int[] arg22, int arg23, String arg24, String arg25, String arg26) {
		this.field5616 = arg0;
		this.field5617 = arg1;
		this.field5618 = arg2;
		this.field5629 = arg3;
		this.field5637 = arg4;
		this.field5610 = arg5;
		this.field5609 = arg6;
		this.field5623 = arg7;
		this.field5633 = arg8;
		this.field5625 = arg9;
		this.field5626 = arg10;
		this.field5627 = arg11;
		this.field5628 = arg12;
		this.field5612 = arg13;
		this.field5630 = arg14;
		this.field5631 = arg15;
		this.field5632 = arg16;
		this.field5611 = arg17;
		this.field5634 = arg18;
		this.field5635 = arg19;
		this.field5636 = arg20;
		this.field5622 = arg21;
		this.field5638 = arg22;
		this.field5639 = arg23;
		this.field5640 = arg24;
		this.field5621 = arg25;
	}

	@ObfuscatedName("vj.af(Lwb;I)V")
	public void method9780(class591 arg0) {
		arg0.method10320(9);
		arg0.method10320(this.field5616);
		arg0.method10320(this.field5617 ? 1 : 0);
		arg0.method10321(this.field5618);
		arg0.method10320(this.field5629);
		arg0.method10320(this.field5637);
		arg0.method10320(this.field5610);
		arg0.method10320(this.field5609);
		arg0.method10320(this.field5623 ? 1 : 0);
		arg0.method10321(this.field5633);
		arg0.method10320(this.field5625);
		arg0.method10322(this.field5626);
		arg0.method10321(this.field5627);
		arg0.method10471(this.field5628);
		arg0.method10471(this.field5612);
		arg0.method10471(this.field5630);
		arg0.method10471(this.field5631);
		arg0.method10320(this.field5611);
		arg0.method10321(this.field5632);
		arg0.method10471(this.field5636);
		arg0.method10471(this.field5622);
		arg0.method10320(this.field5634);
		arg0.method10320(this.field5635);
		for (int var2 = 0; var2 < this.field5638.length; var2++) {
			arg0.method10547(this.field5638[var2]);
		}
		arg0.method10547(this.field5639);
		arg0.method10471(this.field5640);
		arg0.method10471(this.field5621);
	}

	@ObfuscatedName("vj.aw(I)I")
	public int method9781() {
		byte var1 = 39;
		String var3 = this.field5628;
		int var4 = var3.length() + 2;
		int var5 = var1 + var4;
		int var6 = var5 + class591.method9489(this.field5612);
		String var8 = this.field5630;
		int var9 = var8.length() + 2;
		int var10 = var6 + var9;
		String var12 = this.field5631;
		int var13 = var12.length() + 2;
		int var14 = var10 + var13;
		int var15 = var14 + class591.method9489(this.field5636);
		int var16 = var15 + class591.method9489(this.field5622);
		int var17 = var16 + class591.method9489(this.field5640);
		String var19 = this.field5621;
		int var20 = var19.length() + 2;
		return var17 + var20;
	}

	@ObfuscatedName("vj.at(IB)Ljava/lang/String;")
	public String method9788(int arg0) {
		String var2 = "";
		String var3 = "12345678-0000-0000-0000-123456789012";
		String var4;
		switch(arg0) {
			case 1:
				var4 = "wmic csproduct get UUID";
				break;
			case 2:
				var4 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
				break;
			case 3:
				var4 = "cat /etc/machine-id";
				break;
			default:
				return "Unknown";
		}
		BufferedReader var5 = null;
		try {
			Process var6 = Runtime.getRuntime().exec(var4);
			var5 = new BufferedReader(new InputStreamReader(var6.getInputStream()));
			StringBuilder var7 = new StringBuilder();
			String var8;
			while ((var8 = var5.readLine()) != null) {
				var7.append(var8 + "\n");
			}
			if (arg0 == 1) {
				var3 = var7.substring(var7.indexOf("\n"), var7.length()).trim();
			} else if (arg0 == 2) {
				int var9 = var7.indexOf("UUID: ") + 36;
				var3 = var7.substring(var7.indexOf("UUID: "), var9).replace("UUID: ", "");
			} else if (arg0 == 3) {
				if (var7.length() == 33) {
					var7 = new StringBuilder(var7.substring(0, var7.length() - 1));
				}
				if (var7.length() == 32) {
					var7.insert(20, "-");
					var7.insert(16, "-");
					var7.insert(12, "-");
					var7.insert(8, "-");
					var3 = var7.toString();
				} else {
					var3 = "12345678-0000-0000-0000-123456789012";
				}
			}
		} catch (Exception var21) {
		} finally {
			try {
				if (var5 != null) {
					var5.close();
				}
			} catch (IOException var20) {
			}
		}
		return var3;
	}
}
