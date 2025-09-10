package deob;

@ObfuscatedName("df")
public class class99 {

	@ObfuscatedName("df.af")
	public int field1367;

	@ObfuscatedName("df.aw")
	public int field1366;

	@ObfuscatedName("df.at")
	public int field1361;

	@ObfuscatedName("df.ac")
	public int field1368 = 2;

	@ObfuscatedName("df.ap")
	public int[] field1363 = new int[2];

	@ObfuscatedName("df.aq")
	public int[] field1360 = new int[2];

	@ObfuscatedName("df.ao")
	public int field1365;

	@ObfuscatedName("df.as")
	public int field1362;

	@ObfuscatedName("df.al")
	public int field1364;

	@ObfuscatedName("df.au")
	public int field1359;

	@ObfuscatedName("df.ai")
	public int field1369;

	public class99() {
		this.field1363[0] = 0;
		this.field1363[1] = 65535;
		this.field1360[0] = 0;
		this.field1360[1] = 65535;
	}

	@ObfuscatedName("df.af(Lwb;)V")
	public final void method3015(class591 arg0) {
		this.field1361 = arg0.method10339();
		this.field1367 = arg0.method10345();
		this.field1366 = arg0.method10345();
		this.method3016(arg0);
	}

	@ObfuscatedName("df.aw(Lwb;)V")
	public final void method3016(class591 arg0) {
		this.field1368 = arg0.method10339();
		this.field1363 = new int[this.field1368];
		this.field1360 = new int[this.field1368];
		for (int var2 = 0; var2 < this.field1368; var2++) {
			this.field1363[var2] = arg0.method10341();
			this.field1360[var2] = arg0.method10341();
		}
	}

	@ObfuscatedName("df.at()V")
	public final void method3017() {
		this.field1365 = 0;
		this.field1362 = 0;
		this.field1364 = 0;
		this.field1359 = 0;
		this.field1369 = 0;
	}

	@ObfuscatedName("df.ac(I)I")
	public final int method3018(int arg0) {
		if (this.field1369 >= this.field1365) {
			this.field1359 = this.field1360[this.field1362++] << 15;
			if (this.field1362 >= this.field1368) {
				this.field1362 = this.field1368 - 1;
			}
			this.field1365 = (int) ((double) this.field1363[this.field1362] / 65536.0D * (double) arg0);
			if (this.field1365 > this.field1369) {
				this.field1364 = ((this.field1360[this.field1362] << 15) - this.field1359) / (this.field1365 - this.field1369);
			}
		}
		this.field1359 += this.field1364;
		this.field1369++;
		return this.field1359 - this.field1364 >> 15;
	}
}
