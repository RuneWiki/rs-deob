package deob;

import java.io.IOException;

@ObfuscatedName("to")
public class class516 {

	@ObfuscatedName("to.af")
	public static byte[] field5471 = new byte[520];

	@ObfuscatedName("to.aw")
	public class567 field5470 = null;

	@ObfuscatedName("to.at")
	public class567 field5473 = null;

	@ObfuscatedName("to.ac")
	public int field5472;

	@ObfuscatedName("to.ap")
	public int field5474 = 65000;

	public class516(int arg0, class567 arg1, class567 arg2, int arg3) {
		this.field5472 = arg0;
		this.field5470 = arg1;
		this.field5473 = arg2;
		this.field5474 = arg3;
	}

	@ObfuscatedName("to.af(II)[B")
	public byte[] method9492(int arg0) {
		class567 var2 = this.field5470;
		synchronized (this.field5470) {
			Object var10000;
			try {
				if (this.field5473.method10093() < (long) (arg0 * 6 + 6)) {
					var10000 = null;
					return (byte[]) var10000;
				}
				this.field5473.method10092((long) (arg0 * 6));
				this.field5473.method10096(field5471, 0, 6);
				int var3 = (field5471[2] & 0xFF) + ((field5471[1] & 0xFF) << 8) + ((field5471[0] & 0xFF) << 16);
				int var4 = (field5471[5] & 0xFF) + ((field5471[4] & 0xFF) << 8) + ((field5471[3] & 0xFF) << 16);
				if (var3 < 0 || var3 > this.field5474) {
					var10000 = null;
					return (byte[]) var10000;
				}
				if (var4 > 0 && (long) var4 <= this.field5470.method10093() / 520L) {
					byte[] var5 = new byte[var3];
					int var6 = 0;
					int var7 = 0;
					while (var6 < var3) {
						if (var4 == 0) {
							var10000 = null;
							return (byte[]) var10000;
						}
						this.field5470.method10092((long) var4 * 520L);
						int var8 = var3 - var6;
						byte var9;
						int var10;
						int var11;
						int var12;
						int var13;
						if (arg0 > 65535) {
							if (var8 > 510) {
								var8 = 510;
							}
							var9 = 10;
							this.field5470.method10096(field5471, 0, var8 + var9);
							var10 = (field5471[3] & 0xFF) + ((field5471[2] & 0xFF) << 8) + ((field5471[1] & 0xFF) << 16) + ((field5471[0] & 0xFF) << 24);
							var11 = ((field5471[4] & 0xFF) << 8) + (field5471[5] & 0xFF);
							var12 = (field5471[8] & 0xFF) + ((field5471[7] & 0xFF) << 8) + ((field5471[6] & 0xFF) << 16);
							var13 = field5471[9] & 0xFF;
						} else {
							if (var8 > 512) {
								var8 = 512;
							}
							var9 = 8;
							this.field5470.method10096(field5471, 0, var8 + var9);
							var10 = ((field5471[0] & 0xFF) << 8) + (field5471[1] & 0xFF);
							var11 = ((field5471[2] & 0xFF) << 8) + (field5471[3] & 0xFF);
							var12 = (field5471[6] & 0xFF) + ((field5471[4] & 0xFF) << 16) + ((field5471[5] & 0xFF) << 8);
							var13 = field5471[7] & 0xFF;
						}
						if (arg0 == var10 && var7 == var11 && this.field5472 == var13) {
							if (var12 >= 0 && (long) var12 <= this.field5470.method10093() / 520L) {
								int var14 = var8 + var9;
								for (int var15 = var9; var15 < var14; var15++) {
									var5[var6++] = field5471[var15];
								}
								var4 = var12;
								var7++;
								continue;
							}
							var10000 = null;
							return (byte[]) var10000;
						}
						var10000 = null;
						return (byte[]) var10000;
					}
					byte[] var20 = var5;
					return var20;
				}
				var10000 = null;
			} catch (IOException var18) {
				return null;
			}
			return (byte[]) var10000;
		}
	}

	@ObfuscatedName("to.aw(I[BIB)Z")
	public boolean method9493(int arg0, byte[] arg1, int arg2) {
		class567 var4 = this.field5470;
		synchronized (this.field5470) {
			if (arg2 < 0 || arg2 > this.field5474) {
				throw new IllegalArgumentException("" + this.field5472 + ',' + arg0 + ',' + arg2);
			}
			boolean var5 = this.method9494(arg0, arg1, arg2, true);
			if (!var5) {
				var5 = this.method9494(arg0, arg1, arg2, false);
			}
			return var5;
		}
	}

	@ObfuscatedName("to.at(I[BIZB)Z")
	public boolean method9494(int arg0, byte[] arg1, int arg2, boolean arg3) {
		class567 var5 = this.field5470;
		synchronized (this.field5470) {
			try {
				int var6;
				boolean var10000;
				if (arg3) {
					if (this.field5473.method10093() < (long) (arg0 * 6 + 6)) {
						var10000 = false;
						return var10000;
					}
					this.field5473.method10092((long) (arg0 * 6));
					this.field5473.method10096(field5471, 0, 6);
					var6 = (field5471[5] & 0xFF) + ((field5471[4] & 0xFF) << 8) + ((field5471[3] & 0xFF) << 16);
					if (var6 <= 0 || (long) var6 > this.field5470.method10093() / 520L) {
						var10000 = false;
						return var10000;
					}
				} else {
					var6 = (int) ((this.field5470.method10094().length() + 519L) / 520L);
					if (var6 == 0) {
						var6 = 1;
					}
				}
				int var7 = 0;
				int var8 = 0;
				int var9 = var6;
				while (var7 < arg2) {
					int var10 = 0;
					if (arg3) {
						this.field5470.method10092((long) var9 * 520L);
						int var11;
						int var12;
						int var13;
						if (arg0 > 65535) {
							this.field5470.method10096(field5471, 0, 10);
							var11 = (field5471[3] & 0xFF) + ((field5471[2] & 0xFF) << 8) + ((field5471[0] & 0xFF) << 24) + ((field5471[1] & 0xFF) << 16);
							var12 = ((field5471[4] & 0xFF) << 8) + (field5471[5] & 0xFF);
							var10 = (field5471[8] & 0xFF) + ((field5471[7] & 0xFF) << 8) + ((field5471[6] & 0xFF) << 16);
							var13 = field5471[9] & 0xFF;
						} else {
							this.field5470.method10096(field5471, 0, 8);
							var11 = ((field5471[0] & 0xFF) << 8) + (field5471[1] & 0xFF);
							var12 = ((field5471[2] & 0xFF) << 8) + (field5471[3] & 0xFF);
							var10 = (field5471[6] & 0xFF) + ((field5471[4] & 0xFF) << 16) + ((field5471[5] & 0xFF) << 8);
							var13 = field5471[7] & 0xFF;
						}
						if (arg0 != var11 || var8 != var12 || this.field5472 != var13) {
							var10000 = false;
							return var10000;
						}
						if (var10 < 0 || (long) var10 > this.field5470.method10093() / 520L) {
							var10000 = false;
							return var10000;
						}
					}
					if (var10 == 0) {
						arg3 = false;
						var10 = (int) ((this.field5470.method10094().length() + 519L) / 520L);
						if (var10 == 0) {
							var10++;
						}
						if (var9 == var10) {
							var10++;
						}
					}
					if (arg0 > 65535) {
						if (arg2 - var7 <= 510) {
							var10 = 0;
						}
						field5471[0] = (byte) (arg0 >> 24);
						field5471[1] = (byte) (arg0 >> 16);
						field5471[2] = (byte) (arg0 >> 8);
						field5471[3] = (byte) arg0;
						field5471[4] = (byte) (var8 >> 8);
						field5471[5] = (byte) var8;
						field5471[6] = (byte) (var10 >> 16);
						field5471[7] = (byte) (var10 >> 8);
						field5471[8] = (byte) var10;
						field5471[9] = (byte) this.field5472;
						this.field5470.method10092((long) var9 * 520L);
						this.field5470.method10113(field5471, 0, 10);
						int var14 = arg2 - var7;
						if (var14 > 510) {
							var14 = 510;
						}
						this.field5470.method10113(arg1, var7, var14);
						var7 += var14;
					} else {
						if (arg2 - var7 <= 512) {
							var10 = 0;
						}
						field5471[0] = (byte) (arg0 >> 8);
						field5471[1] = (byte) arg0;
						field5471[2] = (byte) (var8 >> 8);
						field5471[3] = (byte) var8;
						field5471[4] = (byte) (var10 >> 16);
						field5471[5] = (byte) (var10 >> 8);
						field5471[6] = (byte) var10;
						field5471[7] = (byte) this.field5472;
						this.field5470.method10092((long) var9 * 520L);
						this.field5470.method10113(field5471, 0, 8);
						int var15 = arg2 - var7;
						if (var15 > 512) {
							var15 = 512;
						}
						this.field5470.method10113(arg1, var7, var15);
						var7 += var15;
					}
					var9 = var10;
					var8++;
				}
				field5471[0] = (byte) (arg2 >> 16);
				field5471[1] = (byte) (arg2 >> 8);
				field5471[2] = (byte) arg2;
				field5471[3] = (byte) (var6 >> 16);
				field5471[4] = (byte) (var6 >> 8);
				field5471[5] = (byte) var6;
				this.field5473.method10092((long) (arg0 * 6));
				this.field5473.method10113(field5471, 0, 6);
				var10000 = true;
				return var10000;
			} catch (IOException var18) {
				return false;
			}
		}
	}

	public String toString() {
		return "" + this.field5472;
	}
}
