package deob;

@ObfuscatedName("ip")
public class class223 {

	@ObfuscatedName("ip.af")
	public static int[] field2599 = new int[500];

	@ObfuscatedName("ip.aw")
	public static int[] field2590 = new int[500];

	@ObfuscatedName("ip.at")
	public static int[] field2594 = new int[500];

	@ObfuscatedName("ip.ac")
	public static int[] field2592 = new int[500];

	@ObfuscatedName("ip.ap")
	public class230 field2593 = null;

	@ObfuscatedName("ip.aq")
	public int field2589 = -1;

	@ObfuscatedName("ip.ao")
	public int[] field2595;

	@ObfuscatedName("ip.as")
	public int[] field2596;

	@ObfuscatedName("ip.al")
	public int[] field2597;

	@ObfuscatedName("ip.au")
	public int[] field2598;

	@ObfuscatedName("ip.ai")
	public boolean field2591 = false;

	public class223(byte[] arg0, class230 arg1) {
		this.field2593 = arg1;
		class591 var3 = new class591(arg0);
		class591 var4 = new class591(arg0);
		var3.field5920 = 2;
		int var5 = var3.method10339();
		int var6 = -1;
		int var7 = 0;
		var4.field5920 = var3.field5920 + var5;
		for (int var8 = 0; var8 < var5; var8++) {
			int var9 = var3.method10339();
			if (var9 > 0) {
				if (this.field2593.field2677[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; var10--) {
						if (this.field2593.field2677[var10] == 0) {
							field2599[var7] = var10;
							field2590[var7] = 0;
							field2594[var7] = 0;
							field2592[var7] = 0;
							var7++;
							break;
						}
					}
				}
				field2599[var7] = var8;
				short var11 = 0;
				if (this.field2593.field2677[var8] == 3) {
					var11 = 128;
				}
				if ((var9 & 0x1) == 0) {
					field2590[var7] = var11;
				} else {
					field2590[var7] = var4.method10354();
				}
				if ((var9 & 0x2) == 0) {
					field2594[var7] = var11;
				} else {
					field2594[var7] = var4.method10354();
				}
				if ((var9 & 0x4) == 0) {
					field2592[var7] = var11;
				} else {
					field2592[var7] = var4.method10354();
				}
				var6 = var8;
				var7++;
				if (this.field2593.field2677[var8] == 5) {
					this.field2591 = true;
				}
			}
		}
		if (var4.field5920 != arg0.length) {
			throw new RuntimeException();
		}
		this.field2589 = var7;
		this.field2595 = new int[var7];
		this.field2596 = new int[var7];
		this.field2597 = new int[var7];
		this.field2598 = new int[var7];
		for (int var12 = 0; var12 < var7; var12++) {
			this.field2595[var12] = field2599[var12];
			this.field2596[var12] = field2590[var12];
			this.field2597[var12] = field2594[var12];
			this.field2598[var12] = field2592[var12];
		}
		var3.field5920 = var4.field5920;
	}
}
