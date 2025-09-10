package deob;

@ObfuscatedName("uv")
public class class546 implements class548 {

	@ObfuscatedName("uv.ac")
	public int field5603;

	@ObfuscatedName("uv.ap")
	public int field5605;

	@ObfuscatedName("uv.aq")
	public int field5606;

	@ObfuscatedName("uv.af(I)Lvj;")
	public class547 method9765() {
		byte var1;
		if (Statics.field3107.startsWith("win")) {
			var1 = 1;
		} else if (Statics.field3107.startsWith("mac")) {
			var1 = 2;
		} else if (Statics.field3107.startsWith("linux")) {
			var1 = 3;
		} else {
			var1 = 4;
		}
		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var37) {
			var2 = "";
		}
		String var4;
		try {
			var4 = System.getProperty("os.name").toLowerCase();
		} catch (Exception var36) {
			var4 = "";
		}
		String var6;
		try {
			var6 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var35) {
			var6 = "";
		}
		String var8 = "Unknown";
		String var9 = "1.1";
		try {
			var8 = System.getProperty("java.vendor");
			var9 = System.getProperty("java.version");
		} catch (Exception var34) {
		}
		boolean var11;
		if (var2.startsWith("amd64") || var2.startsWith("x86_64")) {
			var11 = true;
		} else {
			var11 = false;
		}
		byte var12 = 0;
		if (var1 == 1) {
			if (var6.indexOf("4.0") != -1) {
				var12 = 1;
			} else if (var6.indexOf("4.1") != -1) {
				var12 = 2;
			} else if (var6.indexOf("4.9") != -1) {
				var12 = 3;
			} else if (var6.indexOf("5.0") != -1) {
				var12 = 4;
			} else if (var6.indexOf("5.1") != -1) {
				var12 = 5;
			} else if (var6.indexOf("5.2") != -1) {
				var12 = 8;
			} else if (var6.indexOf("6.0") != -1) {
				var12 = 6;
			} else if (var6.indexOf("6.1") != -1) {
				var12 = 7;
			} else if (var6.indexOf("6.2") != -1) {
				var12 = 9;
			} else if (var6.indexOf("6.3") != -1) {
				var12 = 10;
			} else if (var6.indexOf("10.0") == -1) {
				if (var6.indexOf("11.0") != -1) {
					var12 = 12;
				}
			} else if (var4.indexOf("11") == -1) {
				var12 = 11;
			} else {
				var12 = 12;
			}
		} else if (var1 == 2) {
			if (var6.indexOf("10.4") != -1) {
				var12 = 20;
			} else if (var6.indexOf("10.5") != -1) {
				var12 = 21;
			} else if (var6.indexOf("10.6") != -1) {
				var12 = 22;
			} else if (var6.indexOf("10.7") != -1) {
				var12 = 23;
			} else if (var6.indexOf("10.8") != -1) {
				var12 = 24;
			} else if (var6.indexOf("10.9") != -1) {
				var12 = 25;
			} else if (var6.indexOf("10.10") != -1) {
				var12 = 26;
			} else if (var6.indexOf("10.11") != -1) {
				var12 = 27;
			} else if (var6.indexOf("10.12") != -1) {
				var12 = 28;
			} else if (var6.indexOf("10.13") != -1) {
				var12 = 29;
			} else if (var6.indexOf("10.14") != -1) {
				var12 = 30;
			} else if (var6.indexOf("10.15") != -1) {
				var12 = 31;
			} else if (var6.indexOf("11.") != -1) {
				var12 = 32;
			} else if (var6.indexOf("12.") != -1) {
				var12 = 33;
			} else if (var6.indexOf("13.") != -1) {
				var12 = 34;
			} else if (var6.indexOf("14.") != -1) {
				var12 = 35;
			}
		}
		byte var13;
		if (var8.toLowerCase().indexOf("sun") != -1) {
			var13 = 1;
		} else if (var8.toLowerCase().indexOf("microsoft") != -1) {
			var13 = 2;
		} else if (var8.toLowerCase().indexOf("apple") != -1) {
			var13 = 3;
		} else if (var8.toLowerCase().indexOf("oracle") == -1) {
			var13 = 4;
		} else {
			var13 = 5;
		}
		this.method9766(var9);
		boolean var14 = false;
		int var15 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var16;
		if (this.field5603 > 3) {
			var16 = Runtime.getRuntime().availableProcessors();
		} else {
			var16 = 0;
		}
		byte var17 = 0;
		String var18 = "";
		String var19 = "";
		String var20 = "";
		String var21 = "";
		String var22 = "";
		String var23 = "";
		boolean var24 = false;
		boolean var25 = false;
		boolean var26 = false;
		boolean var27 = false;
		int[] var28 = new int[3];
		boolean var29 = false;
		String var30 = "";
		String var31 = "";
		String var32 = "";
		boolean var33 = false;
		return new class547(var1, var11, var12, var13, this.field5603, this.field5605, this.field5606, false, var15, var16, var17, 0, var18, var19, var20, var21, 0, 0, 0, 0, var22, var23, var28, 0, "", "", var32);
	}

	@ObfuscatedName("uv.aw(Ljava/lang/String;I)V")
	public void method9766(String arg0) {
		if (arg0.startsWith("1.")) {
			this.method9767(arg0);
		} else {
			this.method9768(arg0);
		}
	}

	@ObfuscatedName("uv.at(Ljava/lang/String;B)V")
	public void method9767(String arg0) {
		String[] var2 = arg0.split("\\.");
		try {
			this.field5603 = Integer.parseInt(var2[1]);
			String[] var3 = var2[2].split("_");
			this.field5605 = Integer.parseInt(var3[0]);
			this.field5606 = Integer.parseInt(var3[1]);
		} catch (Exception var5) {
		}
	}

	@ObfuscatedName("uv.ac(Ljava/lang/String;I)V")
	public void method9768(String arg0) {
		String[] var2 = arg0.split("\\.");
		try {
			this.field5603 = Integer.parseInt(var2[0]);
			this.field5605 = Integer.parseInt(var2[1]);
			this.field5606 = Integer.parseInt(var2[2]);
		} catch (Exception var4) {
		}
	}
}
