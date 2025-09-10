package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("pk")
public class class414 {

	@ObfuscatedName("pk.ao")
	public int field4991 = 0;

	@ObfuscatedName("pk.as")
	public int field4987 = 0;

	@ObfuscatedName("pk.al")
	public class512 field4989;

	@ObfuscatedName("pk.au")
	public int field5002 = 0;

	@ObfuscatedName("pk.ai")
	public long field4984;

	@ObfuscatedName("pk.aa")
	public class429 field4992 = new class429(4096);

	@ObfuscatedName("pk.am")
	public int field4993 = 0;

	@ObfuscatedName("pk.an")
	public class429 field5011 = new class429(32);

	@ObfuscatedName("pk.ar")
	public int field5006 = 0;

	@ObfuscatedName("pk.ae")
	public class436 field5005 = new class436();

	@ObfuscatedName("pk.ay")
	public class429 field4997 = new class429(4096);

	@ObfuscatedName("pk.ad")
	public int field4983 = 0;

	@ObfuscatedName("pk.ag")
	public class429 field4999 = new class429(4096);

	@ObfuscatedName("pk.av")
	public int field5000 = 0;

	@ObfuscatedName("pk.ah")
	public boolean field5001;

	@ObfuscatedName("pk.ab")
	public class412 field4996;

	@ObfuscatedName("pk.ax")
	public class591 field5003 = new class591(8);

	@ObfuscatedName("pk.ak")
	public class591 field5004;

	@ObfuscatedName("pk.aj")
	public int field4994 = 0;

	@ObfuscatedName("pk.az")
	public CRC32 field4995 = new CRC32();

	@ObfuscatedName("pk.bt")
	public class591 field5007;

	@ObfuscatedName("pk.bs")
	public class410[] field5008 = new class410[256];

	@ObfuscatedName("pk.bu")
	public int field5009 = -1;

	@ObfuscatedName("pk.bi")
	public int field4998 = 255;

	@ObfuscatedName("pk.bd")
	public byte field4988 = 0;

	@ObfuscatedName("pk.af(I)Z")
	public boolean method7795() {
		long var1 = class335.method3987();
		int var3 = (int) (var1 - this.field4984);
		this.field4984 = var1;
		if (var3 > 200) {
			var3 = 200;
		}
		this.field5002 += var3;
		if (this.field5000 == 0 && this.field5006 == 0 && this.field4983 == 0 && this.field4993 == 0) {
			return true;
		} else if (this.field4989 == null) {
			return false;
		} else {
			try {
				if (this.field5002 > 30000) {
					throw new IOException();
				}
				while (this.field5006 < 200 && this.field4993 > 0) {
					class412 var4 = (class412) this.field4992.method7976();
					class591 var5 = new class591(4);
					var5.method10320(1);
					var5.method10322((int) var4.field5601);
					this.field4989.method9429(var5.field5917, 0, 4);
					this.field5011.method7975(var4, var4.field5601);
					this.field4993--;
					this.field5006++;
				}
				while (this.field5000 < 200 && this.field4983 > 0) {
					class412 var6 = (class412) this.field5005.method8017();
					class591 var7 = new class591(4);
					var7.method10320(0);
					var7.method10322((int) var6.field5601);
					this.field4989.method9429(var7.field5917, 0, 4);
					var6.method9759();
					this.field4999.method7975(var6, var6.field5601);
					this.field4983--;
					this.field5000++;
				}
				for (int var8 = 0; var8 < 100; var8++) {
					int var9 = this.field4989.method9418();
					if (var9 < 0) {
						throw new IOException();
					}
					if (var9 == 0) {
						break;
					}
					this.field5002 = 0;
					byte var10 = 0;
					if (this.field4996 == null) {
						var10 = 8;
					} else if (this.field4994 == 0) {
						var10 = 1;
					}
					if (var10 > 0) {
						int var11 = var10 - this.field5003.field5920;
						if (var11 > var9) {
							var11 = var9;
						}
						this.field4989.method9420(this.field5003.field5917, this.field5003.field5920, var11);
						if (this.field4988 != 0) {
							for (int var12 = 0; var12 < var11; var12++) {
								this.field5003.field5917[this.field5003.field5920 + var12] ^= this.field4988;
							}
						}
						this.field5003.field5920 += var11;
						if (this.field5003.field5920 < var10) {
							break;
						}
						if (this.field4996 == null) {
							this.field5003.field5920 = 0;
							int var13 = this.field5003.method10339();
							int var14 = this.field5003.method10341();
							int var15 = this.field5003.method10339();
							int var16 = this.field5003.method10345();
							long var17 = (long) ((var13 << 16) + var14);
							class412 var19 = (class412) this.field5011.method7973(var17);
							this.field5001 = true;
							if (var19 == null) {
								var19 = (class412) this.field4999.method7973(var17);
								this.field5001 = false;
							}
							if (var19 == null) {
								throw new IOException();
							}
							int var20 = var15 == 0 ? 5 : 9;
							this.field4996 = var19;
							this.field5004 = new class591(var16 + var20 + this.field4996.field4956);
							this.field5004.method10320(var15);
							this.field5004.method10547(var16);
							this.field4994 = 8;
							this.field5003.field5920 = 0;
						} else if (this.field4994 == 0) {
							if (this.field5003.field5917[0] == -1) {
								this.field4994 = 1;
								this.field5003.field5920 = 0;
							} else {
								this.field4996 = null;
							}
						}
					} else {
						int var21 = this.field5004.field5917.length - this.field4996.field4956;
						int var22 = 512 - this.field4994;
						if (var22 > var21 - this.field5004.field5920) {
							var22 = var21 - this.field5004.field5920;
						}
						if (var22 > var9) {
							var22 = var9;
						}
						this.field4989.method9420(this.field5004.field5917, this.field5004.field5920, var22);
						if (this.field4988 != 0) {
							for (int var23 = 0; var23 < var22; var23++) {
								this.field5004.field5917[this.field5004.field5920 + var23] ^= this.field4988;
							}
						}
						this.field5004.field5920 += var22;
						this.field4994 += var22;
						if (this.field5004.field5920 == var21) {
							if (this.field4996.field5601 == 16711935L) {
								this.field5007 = this.field5004;
								for (int var24 = 0; var24 < 256; var24++) {
									class410 var25 = this.field5008[var24];
									if (var25 != null) {
										this.method7789(var25, var24);
									}
								}
							} else {
								this.field4995.reset();
								this.field4995.update(this.field5004.field5917, 0, var21);
								int var26 = (int) this.field4995.getValue();
								if (this.field4996.field4957 != var26) {
									try {
										this.field4989.method9422();
									} catch (Exception var31) {
									}
									this.field4991++;
									this.field4989 = null;
									this.field4988 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								this.field4991 = 0;
								this.field4987 = 0;
								this.field4996.field4959.method7651((int) (this.field4996.field5601 & 0xFFFFL), this.field5004.field5917, (this.field4996.field5601 & 0xFF0000L) == 16711680L, this.field5001);
							}
							this.field4996.method2234();
							if (this.field5001) {
								this.field5006--;
							} else {
								this.field5000--;
							}
							this.field4994 = 0;
							this.field4996 = null;
							this.field5004 = null;
						} else {
							if (this.field4994 != 512) {
								break;
							}
							this.field4994 = 0;
						}
					}
				}
				return true;
			} catch (IOException var32) {
				try {
					this.field4989.method9422();
				} catch (Exception var30) {
				}
				this.field4987++;
				this.field4989 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("pk.aw(ZI)V")
	public void method7786(boolean arg0) {
		if (this.field4989 == null) {
			return;
		}
		try {
			class591 var2 = new class591(4);
			var2.method10320(arg0 ? 2 : 3);
			var2.method10322(0);
			this.field4989.method9429(var2.field5917, 0, 4);
		} catch (IOException var6) {
			try {
				this.field4989.method9422();
			} catch (Exception var5) {
			}
			this.field4987++;
			this.field4989 = null;
		}
	}

	@ObfuscatedName("pk.at(Ltf;ZI)V")
	public void method7801(class512 arg0, boolean arg1) {
		if (this.field4989 != null) {
			try {
				this.field4989.method9422();
			} catch (Exception var11) {
			}
			this.field4989 = null;
		}
		this.field4989 = arg0;
		this.method7786(arg1);
		this.field5003.field5920 = 0;
		this.field4996 = null;
		this.field5004 = null;
		this.field4994 = 0;
		while (true) {
			class412 var4 = (class412) this.field5011.method7976();
			if (var4 == null) {
				while (true) {
					class412 var5 = (class412) this.field4999.method7976();
					if (var5 == null) {
						if (this.field4988 != 0) {
							try {
								class591 var6 = new class591(4);
								var6.method10320(4);
								var6.method10320(this.field4988);
								var6.method10321(0);
								this.field4989.method9429(var6.field5917, 0, 4);
							} catch (IOException var10) {
								try {
									this.field4989.method9422();
								} catch (Exception var9) {
								}
								this.field4987++;
								this.field4989 = null;
							}
						}
						this.field5002 = 0;
						this.field4984 = class335.method3987();
						return;
					}
					this.field5005.method8016(var5);
					this.field4997.method7975(var5, var5.field5601);
					this.field4983++;
					this.field5000--;
				}
			}
			this.field4992.method7975(var4, var4.field5601);
			this.field4993++;
			this.field5006--;
		}
	}

	@ObfuscatedName("pk.ac(Lpw;II)V")
	public void method7788(class410 arg0, int arg1) {
		if (!arg0.field4917) {
			if (arg1 >= this.field4998) {
				throw new RuntimeException("");
			}
			if (arg1 > this.field5009) {
				this.field5009 = arg1;
			}
		} else if (!arg0.field4916) {
			if (arg1 <= this.field5009) {
				throw new RuntimeException("");
			}
			if (arg1 < this.field4998) {
				this.field4998 = arg1;
			}
		}
		if (this.field5007 == null) {
			this.method7787(null, class411.field4948.field4955, 255, 0, (byte) 0, true);
			this.field5008[arg1] = arg0;
		} else {
			this.method7789(arg0, arg1);
		}
	}

	@ObfuscatedName("pk.ap(Lpw;IB)V")
	public void method7789(class410 arg0, int arg1) {
		int var3 = arg1 * 8 + 5;
		int var4 = 0;
		int var5 = 0;
		if (var3 <= this.field5007.field5917.length - 8) {
			this.field5007.field5920 = var3;
			var4 = this.field5007.method10345();
			var5 = this.field5007.method10345();
		}
		if (var4 != 0 || var5 != 0) {
			arg0.method7652(var4, var5);
		} else if (arg0.field4917) {
			arg0.method7648();
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("pk.aq(Lpw;IIIBZI)V")
	public void method7787(class410 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
		long var7 = (long) ((arg1 << 16) + arg2);
		class412 var9 = (class412) this.field4992.method7973(var7);
		if (var9 != null) {
			return;
		}
		class412 var10 = (class412) this.field5011.method7973(var7);
		if (var10 != null) {
			return;
		}
		class412 var11 = (class412) this.field4997.method7973(var7);
		if (var11 == null) {
			if (!arg5) {
				class412 var12 = (class412) this.field4999.method7973(var7);
				if (var12 != null) {
					return;
				}
			}
			class412 var13 = new class412();
			var13.field4959 = arg0;
			var13.field4957 = arg3;
			var13.field4956 = arg4;
			if (arg5) {
				this.field4992.method7975(var13, var7);
				this.field4993++;
			} else {
				this.field5005.method8015(var13);
				this.field4997.method7975(var13, var7);
				this.field4983++;
			}
		} else if (arg5) {
			var11.method9759();
			this.field4992.method7975(var11, var7);
			this.field4983--;
			this.field4993++;
		}
	}

	@ObfuscatedName("pk.ao(III)V")
	public void method7790(int arg0, int arg1) {
		long var3 = (long) ((arg0 << 16) + arg1);
		class412 var5 = (class412) this.field4997.method7973(var3);
		if (var5 != null) {
			this.field5005.method8016(var5);
		}
	}

	@ObfuscatedName("pk.as(III)I")
	public int method7792(int arg0, int arg1) {
		long var3 = (long) ((arg0 << 16) + arg1);
		return this.field4996 != null && this.field4996.field5601 == var3 ? this.field5004.field5920 * 99 / (this.field5004.field5917.length - this.field4996.field4956) + 1 : 0;
	}

	@ObfuscatedName("pk.al(ZZB)I")
	public int method7793(boolean arg0, boolean arg1) {
		int var3 = 0;
		if (arg0) {
			var3 += this.field5006 + this.field4993;
		}
		if (arg1) {
			var3 += this.field5000 + this.field4983;
		}
		return var3;
	}

	@ObfuscatedName("pk.au(I)V")
	public void method7804() {
		if (this.field4989 == null) {
			return;
		}
		try {
			this.field4989.method9422();
		} catch (Exception var2) {
		}
		this.field4989 = null;
	}
}
