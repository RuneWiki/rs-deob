package deob;

@ObfuscatedName("dn")
public class class98 {

	@ObfuscatedName("dn.am")
	public static int field1357 = 44100;

	@ObfuscatedName("dn.ag")
	public int field1337 = 32;

	@ObfuscatedName("dn.av")
	public int[] field1341;

	@ObfuscatedName("dn.ah")
	public class105 field1339;

	@ObfuscatedName("dn.ab")
	public long field1345 = class335.method3987();

	@ObfuscatedName("dn.ax")
	public int field1351;

	@ObfuscatedName("dn.ak")
	public int field1346;

	@ObfuscatedName("dn.aj")
	public int field1343;

	@ObfuscatedName("dn.az")
	public long field1349 = 0L;

	@ObfuscatedName("dn.bt")
	public int field1350 = 0;

	@ObfuscatedName("dn.bs")
	public int field1348 = 0;

	@ObfuscatedName("dn.bu")
	public int field1352 = 0;

	@ObfuscatedName("dn.bi")
	public long field1353 = 0L;

	@ObfuscatedName("dn.bd")
	public boolean field1354 = true;

	@ObfuscatedName("dn.ba")
	public int field1355 = 0;

	@ObfuscatedName("dn.bb")
	public class105[] field1356 = new class105[8];

	@ObfuscatedName("dn.bo")
	public class105[] field1344 = new class105[8];

	@ObfuscatedName("et.ag(IZIB)V")
	public static final void method3438(int arg0, boolean arg1, int arg2) {
		if (arg0 < 8000 || arg0 > 48000) {
			throw new IllegalArgumentException();
		}
		field1357 = arg0;
		Statics.field1340 = arg1;
		Statics.field905 = arg2;
	}

	@ObfuscatedName("aw.av(Lef;I)V")
	public static final void method8(class105 arg0) {
		arg0.field1412 = false;
		if (arg0.field1413 != null) {
			arg0.field1413.field1548 = 0;
		}
		for (class105 var1 = arg0.method2895(); var1 != null; var1 = arg0.method2896()) {
			method8(var1);
		}
	}

	@ObfuscatedName("dn.ah(Lef;I)V")
	public final synchronized void method2978(class105 arg0) {
		this.field1339 = arg0;
	}

	@ObfuscatedName("dn.ab(S)V")
	public final synchronized void method2979() {
		if (this.field1341 == null) {
			return;
		}
		long var1 = class335.method3987();
		try {
			if (this.field1349 != 0L) {
				if (var1 < this.field1349) {
					return;
				}
				this.method337(this.field1351);
				this.field1349 = 0L;
				this.field1354 = true;
			}
			int var3 = this.method338();
			if (this.field1352 - var3 > this.field1350) {
				this.field1350 = this.field1352 - var3;
			}
			int var4 = this.field1346 + this.field1343;
			if (var4 + 512 > 32768) {
				var4 = 32256;
			}
			if (var4 + 512 > this.field1351) {
				this.field1351 += 1024;
				if (this.field1351 > 32768) {
					this.field1351 = 32768;
				}
				this.method340();
				this.method337(this.field1351);
				var3 = 0;
				this.field1354 = true;
				if (var4 + 512 > this.field1351) {
					var4 = this.field1351 - 512;
					this.field1343 = var4 - this.field1346;
				}
			}
			while (var3 < var4) {
				this.method3008(this.field1341, 512);
				this.method339();
				var3 += 512;
			}
			if (var1 > this.field1353) {
				if (this.field1354) {
					this.field1354 = false;
				} else if (this.field1350 == 0 && this.field1348 == 0) {
					this.method340();
					this.field1349 = var1 + 2000L;
					return;
				} else {
					this.field1343 = Math.min(this.field1348, this.field1350);
					this.field1348 = this.field1350;
				}
				this.field1350 = 0;
				this.field1353 = var1 + 2000L;
			}
			this.field1352 = var3;
		} catch (Exception var8) {
			this.method340();
			this.field1349 = var1 + 2000L;
		}
		try {
			if (var1 > this.field1345 + 500000L) {
				var1 = this.field1345;
			}
			while (var1 > this.field1345 + 5000L) {
				this.method2983(512);
				this.field1345 += 512000 / field1357;
			}
		} catch (Exception var7) {
			this.field1345 = var1;
		}
	}

	@ObfuscatedName("dn.ax(B)V")
	public final void method2980() {
		this.field1354 = true;
	}

	@ObfuscatedName("dn.ak(I)V")
	public final synchronized void method2981() {
		this.field1354 = true;
		try {
			this.method352();
		} catch (Exception var2) {
			this.method340();
			this.field1349 = class335.method3987() + 2000L;
		}
	}

	@ObfuscatedName("dn.aj(I)V")
	public final synchronized void method2982() {
		if (Statics.field2576 != null) {
			boolean var1 = true;
			for (int var2 = 0; var2 < 2; var2++) {
				if (Statics.field2576.field1371[var2] == this) {
					Statics.field2576.field1371[var2] = null;
				}
				if (Statics.field2576.field1371[var2] != null) {
					var1 = false;
				}
			}
			if (var1) {
				Statics.field1347.shutdownNow();
				Statics.field1347 = null;
				Statics.field2576 = null;
			}
		}
		this.method340();
		this.field1341 = null;
	}

	@ObfuscatedName("dn.az(II)V")
	public final void method2983(int arg0) {
		this.field1355 -= arg0;
		if (this.field1355 < 0) {
			this.field1355 = 0;
		}
		if (this.field1339 != null) {
			this.field1339.method2900(arg0);
		}
	}

	@ObfuscatedName("dn.bt([II)V")
	public final void method3008(int[] arg0, int arg1) {
		int var3 = arg1;
		if (Statics.field1340) {
			var3 = arg1 << 1;
		}
		class481.method9003(arg0, 0, var3);
		this.field1355 -= arg1;
		if (this.field1339 != null && this.field1355 <= 0) {
			this.field1355 += field1357 >> 4;
			method8(this.field1339);
			this.method3007(this.field1339, this.field1339.method3085());
			int var4 = 0;
			int var5 = 255;
			int var6 = 7;
			label105: while (var5 != 0) {
				int var7;
				int var8;
				if (var6 < 0) {
					var7 = var6 & 0x3;
					var8 = -(var6 >> 2);
				} else {
					var7 = var6;
					var8 = 0;
				}
				for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
					if ((var9 & 0x1) != 0) {
						var5 &= ~(0x1 << var7);
						class105 var10 = null;
						class105 var11 = this.field1356[var7];
						label99: while (true) {
							while (true) {
								if (var11 == null) {
									break label99;
								}
								class118 var12 = var11.field1413;
								if (var12 == null || var12.field1548 <= var8) {
									var11.field1412 = true;
									int var13 = var11.method2915();
									var4 += var13;
									if (var12 != null) {
										var12.field1548 += var13;
									}
									if (var4 >= this.field1337) {
										break label105;
									}
									class105 var14 = var11.method2895();
									if (var14 != null) {
										int var15 = var11.field1414;
										while (var14 != null) {
											this.method3007(var14, var15 * var14.method3085() >> 8);
											var14 = var11.method2896();
										}
									}
									class105 var16 = var11.field1411;
									var11.field1411 = null;
									if (var10 == null) {
										this.field1356[var7] = var16;
									} else {
										var10.field1411 = var16;
									}
									if (var16 == null) {
										this.field1344[var7] = var10;
									}
									var11 = var16;
								} else {
									var5 |= 0x1 << var7;
									var10 = var11;
									var11 = var11.field1411;
								}
							}
						}
					}
					var7 += 4;
					var8++;
				}
				var6--;
			}
			for (int var17 = 0; var17 < 8; var17++) {
				class105 var18 = this.field1356[var17];
				class105[] var19 = this.field1356;
				this.field1344[var17] = null;
				var19[var17] = null;
				while (var18 != null) {
					class105 var21 = var18.field1411;
					var18.field1411 = null;
					var18 = var21;
				}
			}
		}
		if (this.field1355 < 0) {
			this.field1355 = 0;
		}
		if (this.field1339 != null) {
			this.field1339.method2899(arg0, 0, arg1);
		}
		this.field1345 = class335.method3987();
	}

	@ObfuscatedName("dn.bs(Lef;II)V")
	public final void method3007(class105 arg0, int arg1) {
		int var3 = arg1 >> 5;
		class105 var4 = this.field1344[var3];
		if (var4 == null) {
			this.field1356[var3] = arg0;
		} else {
			var4.field1411 = arg0;
		}
		this.field1344[var3] = arg0;
		arg0.field1414 = arg1;
	}

	@ObfuscatedName("dn.af(I)V")
	public void method346() throws Exception {
	}

	@ObfuscatedName("dn.aw(IB)V")
	public void method337(int arg0) throws Exception {
	}

	@ObfuscatedName("dn.at(B)I")
	public int method338() throws Exception {
		return this.field1351;
	}

	@ObfuscatedName("dn.ac()V")
	public void method339() throws Exception {
	}

	@ObfuscatedName("dn.ap(I)V")
	public void method340() {
	}

	@ObfuscatedName("dn.aq(I)V")
	public void method352() throws Exception {
	}
}
