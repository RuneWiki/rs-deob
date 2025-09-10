package deob;

@ObfuscatedName("ud")
public class class524 {

	@ObfuscatedName("ud.af")
	public final int field5532 = 1;

	@ObfuscatedName("ud.aw")
	public final int field5524 = 2;

	@ObfuscatedName("ud.at")
	public final int field5526 = 1;

	@ObfuscatedName("ud.ac")
	public final int field5527 = 1;

	@ObfuscatedName("ud.ap")
	public final int field5528 = 1;

	@ObfuscatedName("ud.aq")
	public final int[][] field5536 = new int[3][5];

	@ObfuscatedName("ud.ao")
	public int field5530 = -1;

	@ObfuscatedName("ud.as")
	public int field5540 = -1;

	@ObfuscatedName("ud.al")
	public int field5525 = -1;

	@ObfuscatedName("ud.au")
	public int field5533 = -1;

	@ObfuscatedName("ud.ai")
	public int field5529 = -1;

	@ObfuscatedName("ud.aa")
	public int field5535 = -1;

	@ObfuscatedName("ud.am")
	public int field5534 = -1;

	@ObfuscatedName("ud.an")
	public int field5537 = -1;

	@ObfuscatedName("ud.ar")
	public int field5538 = -1;

	@ObfuscatedName("ud.ae")
	public int field5539 = -1;

	@ObfuscatedName("ud.ay")
	public int field5531 = -1;

	@ObfuscatedName("ud.af(Lpx;I)V")
	public void method9658(class413 arg0) {
		byte[] var2 = arg0.method7775(class523.field5523.field5521);
		class591 var3 = new class591(var2);
		while (true) {
			while (true) {
				int var4 = var3.method10339();
				if (var4 == 0) {
					return;
				}
				switch(var4) {
					case 1:
						var3.method10419();
						break;
					case 2:
						this.field5530 = var3.method10365();
						this.field5540 = var3.method10365();
						this.field5525 = var3.method10365();
						this.field5533 = var3.method10365();
						this.field5529 = var3.method10365();
						this.field5535 = var3.method10365();
						this.field5534 = var3.method10365();
						this.field5537 = var3.method10365();
						this.field5538 = var3.method10365();
						this.field5539 = var3.method10365();
						this.field5531 = var3.method10365();
						break;
					case 3:
						for (int var5 = 0; var5 < this.field5536.length; var5++) {
							for (int var6 = 0; var6 < this.field5536[var5].length; var6++) {
								this.field5536[var5][var6] = var3.method10419();
							}
						}
				}
			}
		}
	}
}
