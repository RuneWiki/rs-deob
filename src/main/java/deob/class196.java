package deob;

@ObfuscatedName("hh")
public class class196 extends class541 {

	@ObfuscatedName("hh.bw")
	public static class321 field2129 = new class321(64);

	@ObfuscatedName("hh.bc")
	public static class321 field2142 = new class321(50);

	@ObfuscatedName("hh.cw")
	public int field2108;

	@ObfuscatedName("hh.cz")
	public String field2111 = class394.field4507;

	@ObfuscatedName("hh.cf")
	public int field2112 = 1;

	@ObfuscatedName("hh.cg")
	public int[] field2113;

	@ObfuscatedName("hh.ci")
	public int[] field2106;

	@ObfuscatedName("hh.cp")
	public int field2115 = -1;

	@ObfuscatedName("hh.cm")
	public int field2109 = -1;

	@ObfuscatedName("hh.cc")
	public int field2117 = -1;

	@ObfuscatedName("hh.cj")
	public int field2118 = -1;

	@ObfuscatedName("hh.ce")
	public int field2130 = -1;

	@ObfuscatedName("hh.cr")
	public int field2133 = -1;

	@ObfuscatedName("hh.cb")
	public int field2114 = -1;

	@ObfuscatedName("hh.cu")
	public int field2122 = -1;

	@ObfuscatedName("hh.cq")
	public int field2134 = -1;

	@ObfuscatedName("hh.cn")
	public int field2156 = -1;

	@ObfuscatedName("hh.cl")
	public int field2125 = -1;

	@ObfuscatedName("hh.cx")
	public int field2126 = -1;

	@ObfuscatedName("hh.cv")
	public int field2127 = -1;

	@ObfuscatedName("hh.ca")
	public int field2116 = -1;

	@ObfuscatedName("hh.cy")
	public int field2123 = -1;

	@ObfuscatedName("hh.cd")
	public short[] field2128;

	@ObfuscatedName("hh.co")
	public short[] field2131;

	@ObfuscatedName("hh.ck")
	public short[] field2132;

	@ObfuscatedName("hh.ct")
	public short[] field2110;

	@ObfuscatedName("hh.ch")
	public String[] field2143 = new String[5];

	@ObfuscatedName("hh.cs")
	public boolean field2135 = true;

	@ObfuscatedName("hh.dd")
	public int field2136 = -1;

	@ObfuscatedName("hh.dr")
	public int field2137 = 128;

	@ObfuscatedName("hh.ds")
	public int field2138 = 128;

	@ObfuscatedName("hh.dt")
	public int field2139 = 0;

	@ObfuscatedName("hh.da")
	public int field2140 = 0;

	@ObfuscatedName("hh.dc")
	public int field2141 = 32;

	@ObfuscatedName("hh.dp")
	public int[] field2100;

	@ObfuscatedName("hh.dw")
	public int field2146 = -1;

	@ObfuscatedName("hh.db")
	public int field2144 = -1;

	@ObfuscatedName("hh.dq")
	public boolean field2145 = true;

	@ObfuscatedName("hh.dh")
	public boolean field2121 = true;

	@ObfuscatedName("hh.de")
	public boolean field2147 = false;

	@ObfuscatedName("hh.dy")
	public boolean field2148 = false;

	@ObfuscatedName("hh.dm")
	public int field2119 = -1;

	@ObfuscatedName("hh.dz")
	public class427 field2150;

	@ObfuscatedName("hh.dx")
	public int[] field2151 = new int[] { 1, 1, 1, 1, 1, 1 };

	@ObfuscatedName("hh.di")
	public int[] field2120 = null;

	@ObfuscatedName("hh.dj")
	public short[] field2153 = null;

	@ObfuscatedName("hh.du")
	public int field2154 = -1;

	@ObfuscatedName("hh.do")
	public class198 field2155 = class198.field2163;

	@ObfuscatedName("fe.af(Lpx;Lpx;I)V")
	public static void method3570(class413 arg0, class413 arg1) {
		Statics.field2102 = arg0;
		Statics.field1768 = arg1;
	}

	@ObfuscatedName("cb.aw(II)Lhh;")
	public static class196 method2096(int arg0) {
		class196 var1 = (class196) field2129.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field2102.method7692(9, arg0);
		class196 var3 = new class196();
		var3.field2108 = arg0;
		if (var2 != null) {
			var3.method4068(new class591(var2));
		}
		var3.method4025();
		field2129.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("ag.at(B)V")
	public static void method286() {
		field2129.method6456();
		field2142.method6456();
	}

	@ObfuscatedName("hh.ac(B)V")
	public void method4025() {
		if (this.field2154 == -1) {
			this.field2154 = (int) ((float) (this.field2112 * 128) * 0.4F);
		}
	}

	@ObfuscatedName("hh.ap(Lwb;I)V")
	public void method4068(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4027(arg0, var2);
		}
	}

	@ObfuscatedName("hh.aq(Lwb;II)V")
	public void method4027(class591 arg0, int arg1) {
		switch(arg1) {
			case 1:
				int var16 = arg0.method10339();
				this.field2113 = new int[var16];
				for (int var17 = 0; var17 < var16; var17++) {
					this.field2113[var17] = arg0.method10341();
				}
				return;
			case 2:
				this.field2111 = arg0.method10350();
				break;
			case 12:
				this.field2112 = arg0.method10339();
				break;
			case 13:
				this.field2115 = arg0.method10341();
				break;
			case 14:
				this.field2118 = arg0.method10341();
				break;
			case 15:
				this.field2109 = arg0.method10341();
				break;
			case 16:
				this.field2117 = arg0.method10341();
				break;
			case 17:
				this.field2118 = arg0.method10341();
				this.field2130 = arg0.method10341();
				this.field2133 = arg0.method10341();
				this.field2114 = arg0.method10341();
				break;
			case 18:
				arg0.method10341();
				break;
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
				this.field2143[arg1 - 30] = arg0.method10350();
				if (this.field2143[arg1 - 30].equalsIgnoreCase(class394.field4757)) {
					this.field2143[arg1 - 30] = null;
				}
				break;
			case 40:
				int var14 = arg0.method10339();
				this.field2128 = new short[var14];
				this.field2131 = new short[var14];
				for (int var15 = 0; var15 < var14; var15++) {
					this.field2128[var15] = (short) arg0.method10341();
					this.field2131[var15] = (short) arg0.method10341();
				}
				return;
			case 41:
				int var12 = arg0.method10339();
				this.field2132 = new short[var12];
				this.field2110 = new short[var12];
				for (int var13 = 0; var13 < var12; var13++) {
					this.field2132[var13] = (short) arg0.method10341();
					this.field2110[var13] = (short) arg0.method10341();
				}
				return;
			case 60:
				int var10 = arg0.method10339();
				this.field2106 = new int[var10];
				for (int var11 = 0; var11 < var10; var11++) {
					this.field2106[var11] = arg0.method10341();
				}
				return;
			case 74:
				this.field2151[0] = arg0.method10341();
				break;
			case 75:
				this.field2151[1] = arg0.method10341();
				break;
			case 76:
				this.field2151[2] = arg0.method10341();
				break;
			case 77:
				this.field2151[3] = arg0.method10341();
				break;
			case 78:
				this.field2151[4] = arg0.method10341();
				break;
			case 79:
				this.field2151[5] = arg0.method10341();
				break;
			case 93:
				this.field2135 = false;
				break;
			case 95:
				this.field2136 = arg0.method10341();
				break;
			case 97:
				this.field2137 = arg0.method10341();
				break;
			case 98:
				this.field2138 = arg0.method10341();
				break;
			case 99:
				this.field2155 = class198.field2164;
				break;
			case 100:
				this.field2139 = arg0.method10340();
				break;
			case 101:
				this.field2140 = arg0.method10340();
				break;
			case 102:
				int var6 = arg0.method10339();
				int var7 = 0;
				for (int var8 = var6; var8 != 0; var8 >>= 0x1) {
					var7++;
				}
				this.field2120 = new int[var7];
				this.field2153 = new short[var7];
				for (int var9 = 0; var9 < var7; var9++) {
					if ((var6 & 0x1 << var9) == 0) {
						this.field2120[var9] = -1;
						this.field2153[var9] = -1;
					} else {
						this.field2120[var9] = arg0.method10365();
						this.field2153[var9] = (short) arg0.method10356();
					}
				}
				return;
			case 103:
				this.field2141 = arg0.method10341();
				break;
			case 106:
			case 118:
				this.field2146 = arg0.method10341();
				if (this.field2146 == 65535) {
					this.field2146 = -1;
				}
				this.field2144 = arg0.method10341();
				if (this.field2144 == 65535) {
					this.field2144 = -1;
				}
				int var3 = -1;
				if (arg1 == 118) {
					var3 = arg0.method10341();
					if (var3 == 65535) {
						var3 = -1;
					}
				}
				int var4 = arg0.method10339();
				this.field2100 = new int[var4 + 2];
				for (int var5 = 0; var5 <= var4; var5++) {
					this.field2100[var5] = arg0.method10341();
					if (this.field2100[var5] == 65535) {
						this.field2100[var5] = -1;
					}
				}
				this.field2100[var4 + 1] = var3;
				break;
			case 107:
				this.field2145 = false;
				break;
			case 109:
				this.field2121 = false;
				break;
			case 111:
				this.field2155 = class198.field2165;
				break;
			case 114:
				this.field2122 = arg0.method10341();
				break;
			case 115:
				this.field2122 = arg0.method10341();
				this.field2134 = arg0.method10341();
				this.field2156 = arg0.method10341();
				this.field2125 = arg0.method10341();
				break;
			case 116:
				this.field2126 = arg0.method10341();
				break;
			case 117:
				this.field2126 = arg0.method10341();
				this.field2127 = arg0.method10341();
				this.field2116 = arg0.method10341();
				this.field2123 = arg0.method10341();
				break;
			case 122:
				this.field2147 = true;
				break;
			case 123:
				this.field2148 = true;
				break;
			case 124:
				this.field2119 = arg0.method10341();
				break;
			case 126:
				this.field2154 = arg0.method10341();
				break;
			case 249:
				this.field2150 = class189.method3595(arg0, this.field2150);
				break;
			default:
				System.out.println("Error unrecognised .npc config code:{ " + arg1);
		}
	}

	@ObfuscatedName("hh.ao(Lij;ILij;ILhq;B)Ljn;")
	public final class242 method4028(class216 arg0, int arg1, class216 arg2, int arg3, class195 arg4) {
		if (this.field2100 != null) {
			class196 var6 = this.method4066();
			return var6 == null ? null : var6.method4028(arg0, arg1, arg2, arg3, arg4);
		}
		long var7 = (long) this.field2108;
		if (arg4 != null) {
			var7 |= arg4.field2094 << 16;
		}
		class242 var9 = (class242) field2142.method6463(var7);
		if (var9 == null) {
			class220 var10 = this.method4030(this.field2113, arg4);
			if (var10 == null) {
				return null;
			}
			var9 = var10.method4553(this.field2139 + 64, this.field2140 * 5 + 850, -30, -50, -30);
			field2142.method6454(var9, var7);
		}
		class242 var11;
		if (arg0 != null && arg2 != null) {
			var11 = arg0.method4464(var9, arg1, arg2, arg3);
		} else if (arg0 != null) {
			var11 = arg0.method4461(var9, arg1);
		} else if (arg2 == null) {
			var11 = var9.method5123(true);
		} else {
			var11 = arg2.method4461(var9, arg3);
		}
		if (this.field2137 != 128 || this.field2138 != 128) {
			var11.method5144(this.field2137, this.field2138, this.field2137);
		}
		return var11;
	}

	@ObfuscatedName("hh.as(Lhq;B)Liu;")
	public final class220 method4078(class195 arg0) {
		if (this.field2100 == null) {
			return this.method4030(this.field2106, arg0);
		} else {
			class196 var2 = this.method4066();
			return var2 == null ? null : var2.method4078(arg0);
		}
	}

	@ObfuscatedName("hh.al([ILhq;I)Liu;")
	public class220 method4030(int[] arg0, class195 arg1) {
		int[] var3 = arg0;
		if (arg1 != null && arg1.field2096 != null) {
			var3 = arg1.field2096;
		}
		if (var3 == null) {
			return null;
		}
		boolean var4 = false;
		for (int var5 = 0; var5 < var3.length; var5++) {
			if (var3[var5] != -1 && !Statics.field1768.method7694(var3[var5], 0)) {
				var4 = true;
			}
		}
		if (var4) {
			return null;
		}
		class220[] var6 = new class220[var3.length];
		for (int var7 = 0; var7 < var3.length; var7++) {
			var6[var7] = class220.method4529(Statics.field1768, var3[var7], 0);
		}
		class220 var8;
		if (var6.length == 1) {
			var8 = var6[0];
			if (var8 == null) {
				var8 = new class220(var6, var6.length);
			}
		} else {
			var8 = new class220(var6, var6.length);
		}
		if (this.field2128 != null) {
			short[] var9 = this.field2131;
			if (arg1 != null && arg1.field2095 != null) {
				var9 = arg1.field2095;
			}
			for (int var10 = 0; var10 < this.field2128.length; var10++) {
				var8.method4543(this.field2128[var10], var9[var10]);
			}
		}
		if (this.field2132 != null) {
			short[] var11 = this.field2110;
			if (arg1 != null && arg1.field2093 != null) {
				var11 = arg1.field2093;
			}
			for (int var12 = 0; var12 < this.field2132.length; var12++) {
				var8.method4548(this.field2132[var12], var11[var12]);
			}
		}
		return var8;
	}

	@ObfuscatedName("hh.au(B)Lhh;")
	public final class196 method4066() {
		int var1 = -1;
		if (this.field2146 != -1) {
			var1 = class356.method5877(this.field2146);
		} else if (this.field2144 != -1) {
			var1 = Statics.field4023[this.field2144];
		}
		int var2;
		if (var1 >= 0 && var1 < this.field2100.length - 1) {
			var2 = this.field2100[var1];
		} else {
			var2 = this.field2100[this.field2100.length - 1];
		}
		return var2 == -1 ? null : method2096(var2);
	}

	@ObfuscatedName("hh.ai(B)Z")
	public boolean method4032() {
		if (this.field2100 == null) {
			return true;
		}
		int var1 = -1;
		if (this.field2146 != -1) {
			var1 = class356.method5877(this.field2146);
		} else if (this.field2144 != -1) {
			var1 = Statics.field4023[this.field2144];
		}
		if (var1 >= 0 && var1 < this.field2100.length) {
			return this.field2100[var1] != -1;
		} else {
			return this.field2100[this.field2100.length - 1] != -1;
		}
	}

	@ObfuscatedName("hh.aa(III)I")
	public int method4033(int arg0, int arg1) {
		return class189.method9753(this.field2150, arg0, arg1);
	}

	@ObfuscatedName("hh.am(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4038(int arg0, String arg1) {
		return class189.method7632(this.field2150, arg0, arg1);
	}

	@ObfuscatedName("hh.an(I)Z")
	public boolean method4035() {
		return this.field2120 != null && this.field2153 != null;
	}

	@ObfuscatedName("hh.ar(I)[I")
	public int[] method4036() {
		return this.field2120;
	}

	@ObfuscatedName("hh.ae(II)I")
	public int method4037(int arg0) {
		return this.field2120 == null || arg0 >= this.field2120.length ? -1 : this.field2120[arg0];
	}

	@ObfuscatedName("hh.ay(B)[S")
	public short[] method4034() {
		return this.field2153;
	}

	@ObfuscatedName("hh.ad(II)S")
	public short method4039(int arg0) {
		return this.field2153 == null || arg0 >= this.field2153.length ? -1 : this.field2153[arg0];
	}

	@ObfuscatedName("hh.ag(I)I")
	public int method4046() {
		return this.field2154;
	}
}
