package jagex2.dash3d;

import deob.ObfuscatedName;

public class CollisionMap {

	@ObfuscatedName("FTPNODIB.a")
	public boolean _flowObfuscator1 = true;

	@ObfuscatedName("FTPNODIB.b")
	public int _flowObfuscator2 = -32357;

	@ObfuscatedName("FTPNODIB.c")
	public boolean _flowObfuscator3 = false;

	@ObfuscatedName("FTPNODIB.d")
	public int _flowObfuscator4 = 7;

	@ObfuscatedName("FTPNODIB.e")
	public boolean _flowObfuscator5 = true;

	@ObfuscatedName("FTPNODIB.f")
	public boolean _flowObfuscator6 = true;

	@ObfuscatedName("FTPNODIB.g")
	public byte _flowObfuscator7 = 2;

	@ObfuscatedName("FTPNODIB.h")
	public byte _flowObfuscator8 = -101;

	@ObfuscatedName("FTPNODIB.i")
	public int offsetX = 0;

	@ObfuscatedName("FTPNODIB.j")
	public int offsetZ = 0;

	@ObfuscatedName("FTPNODIB.k")
	public int sizeX;

	@ObfuscatedName("FTPNODIB.l")
	public int sizeZ;

	@ObfuscatedName("FTPNODIB.m")
	public int[][] flags;

	public CollisionMap(int arg0, int arg1, boolean arg2) {
		this.sizeX = arg0;
		this.sizeZ = arg1;
		this.flags = new int[this.sizeX][this.sizeZ];
		this.reset();
		if (!arg2) {
			this._flowObfuscator2 = -496;
		}
	}

	@ObfuscatedName("FTPNODIB.a()V")
	public void reset() {
		for (int var1 = 0; var1 < this.sizeX; var1++) {
			for (int var2 = 0; var2 < this.sizeZ; var2++) {
				if (var1 == 0 || var2 == 0 || this.sizeX - 1 == var1 || this.sizeZ - 1 == var2) {
					this.flags[var1][var2] = 16777215;
				} else {
					this.flags[var1][var2] = 16777216;
				}
			}
		}
	}

	@ObfuscatedName("FTPNODIB.a(IIIIBZ)V")
	public void addWall(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
		int var7 = arg2 - this.offsetX;
		int var8 = arg0 - this.offsetZ;
		if (arg4 != 1) {
			return;
		}
		boolean var9 = false;
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.add(var7, var8, 128);
				this.add(var7 - 1, var8, 8);
			}
			if (arg1 == 1) {
				this.add(var7, var8, 2);
				this.add(var7, var8 + 1, 32);
			}
			if (arg1 == 2) {
				this.add(var7, var8, 8);
				this.add(var7 + 1, var8, 128);
			}
			if (arg1 == 3) {
				this.add(var7, var8, 32);
				this.add(var7, var8 - 1, 2);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.add(var7, var8, 1);
				this.add(var7 - 1, var8 + 1, 16);
			}
			if (arg1 == 1) {
				this.add(var7, var8, 4);
				this.add(var7 + 1, var8 + 1, 64);
			}
			if (arg1 == 2) {
				this.add(var7, var8, 16);
				this.add(var7 + 1, var8 - 1, 1);
			}
			if (arg1 == 3) {
				this.add(var7, var8, 64);
				this.add(var7 - 1, var8 - 1, 4);
			}
		}
		if (arg3 == 2) {
			if (arg1 == 0) {
				this.add(var7, var8, 130);
				this.add(var7 - 1, var8, 8);
				this.add(var7, var8 + 1, 32);
			}
			if (arg1 == 1) {
				this.add(var7, var8, 10);
				this.add(var7, var8 + 1, 32);
				this.add(var7 + 1, var8, 128);
			}
			if (arg1 == 2) {
				this.add(var7, var8, 40);
				this.add(var7 + 1, var8, 128);
				this.add(var7, var8 - 1, 2);
			}
			if (arg1 == 3) {
				this.add(var7, var8, 160);
				this.add(var7, var8 - 1, 2);
				this.add(var7 - 1, var8, 8);
			}
		}
		if (!arg5) {
			return;
		}
		if (arg3 == 0) {
			if (arg1 == 0) {
				this.add(var7, var8, 65536);
				this.add(var7 - 1, var8, 4096);
			}
			if (arg1 == 1) {
				this.add(var7, var8, 1024);
				this.add(var7, var8 + 1, 16384);
			}
			if (arg1 == 2) {
				this.add(var7, var8, 4096);
				this.add(var7 + 1, var8, 65536);
			}
			if (arg1 == 3) {
				this.add(var7, var8, 16384);
				this.add(var7, var8 - 1, 1024);
			}
		}
		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				this.add(var7, var8, 512);
				this.add(var7 - 1, var8 + 1, 8192);
			}
			if (arg1 == 1) {
				this.add(var7, var8, 2048);
				this.add(var7 + 1, var8 + 1, 32768);
			}
			if (arg1 == 2) {
				this.add(var7, var8, 8192);
				this.add(var7 + 1, var8 - 1, 512);
			}
			if (arg1 == 3) {
				this.add(var7, var8, 32768);
				this.add(var7 - 1, var8 - 1, 2048);
			}
		}
		if (arg3 != 2) {
			return;
		}
		if (arg1 == 0) {
			this.add(var7, var8, 66560);
			this.add(var7 - 1, var8, 4096);
			this.add(var7, var8 + 1, 16384);
		}
		if (arg1 == 1) {
			this.add(var7, var8, 5120);
			this.add(var7, var8 + 1, 16384);
			this.add(var7 + 1, var8, 65536);
		}
		if (arg1 == 2) {
			this.add(var7, var8, 20480);
			this.add(var7 + 1, var8, 65536);
			this.add(var7, var8 - 1, 1024);
		}
		if (arg1 == 3) {
			this.add(var7, var8, 81920);
			this.add(var7, var8 - 1, 1024);
			this.add(var7 - 1, var8, 4096);
			return;
		}
	}

	@ObfuscatedName("FTPNODIB.a(ZIIIIII)V")
	public void addLoc(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = 256;
		if (arg0) {
			var8 += 131072;
		}
		int var9 = arg4 - this.offsetX;
		int var10 = 14 / arg1;
		int var11 = arg5 - this.offsetZ;
		if (arg6 == 1 || arg6 == 3) {
			int var12 = arg2;
			arg2 = arg3;
			arg3 = var12;
		}
		for (int var13 = var9; var13 < arg2 + var9; var13++) {
			if (var13 >= 0 && var13 < this.sizeX) {
				for (int var14 = var11; var14 < arg3 + var11; var14++) {
					if (var14 >= 0 && var14 < this.sizeZ) {
						this.add(var13, var14, var8);
					}
				}
			}
		}
	}

	@ObfuscatedName("FTPNODIB.a(III)V")
	public void setBlocked(int arg0, int arg1, int arg2) {
		int var4 = arg2 - this.offsetX;
		if (arg1 != 0) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		int var5 = arg0 - this.offsetZ;
		this.flags[var4][var5] |= 0x200000;
	}

	@ObfuscatedName("FTPNODIB.b(III)V")
	public void add(int arg0, int arg1, int arg2) {
		this.flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("FTPNODIB.a(IIZZII)V")
	public void removeWall(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
		int var7 = arg4 - this.offsetX;
		int var8 = arg5 - this.offsetZ;
		if (!arg3) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.remove(128, var7, var8, 933);
				this.remove(8, var7 - 1, var8, 933);
			}
			if (arg0 == 1) {
				this.remove(2, var7, var8, 933);
				this.remove(32, var7, var8 + 1, 933);
			}
			if (arg0 == 2) {
				this.remove(8, var7, var8, 933);
				this.remove(128, var7 + 1, var8, 933);
			}
			if (arg0 == 3) {
				this.remove(32, var7, var8, 933);
				this.remove(2, var7, var8 - 1, 933);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.remove(1, var7, var8, 933);
				this.remove(16, var7 - 1, var8 + 1, 933);
			}
			if (arg0 == 1) {
				this.remove(4, var7, var8, 933);
				this.remove(64, var7 + 1, var8 + 1, 933);
			}
			if (arg0 == 2) {
				this.remove(16, var7, var8, 933);
				this.remove(1, var7 + 1, var8 - 1, 933);
			}
			if (arg0 == 3) {
				this.remove(64, var7, var8, 933);
				this.remove(4, var7 - 1, var8 - 1, 933);
			}
		}
		if (arg1 == 2) {
			if (arg0 == 0) {
				this.remove(130, var7, var8, 933);
				this.remove(8, var7 - 1, var8, 933);
				this.remove(32, var7, var8 + 1, 933);
			}
			if (arg0 == 1) {
				this.remove(10, var7, var8, 933);
				this.remove(32, var7, var8 + 1, 933);
				this.remove(128, var7 + 1, var8, 933);
			}
			if (arg0 == 2) {
				this.remove(40, var7, var8, 933);
				this.remove(128, var7 + 1, var8, 933);
				this.remove(2, var7, var8 - 1, 933);
			}
			if (arg0 == 3) {
				this.remove(160, var7, var8, 933);
				this.remove(2, var7, var8 - 1, 933);
				this.remove(8, var7 - 1, var8, 933);
			}
		}
		if (!arg2) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 == 0) {
				this.remove(65536, var7, var8, 933);
				this.remove(4096, var7 - 1, var8, 933);
			}
			if (arg0 == 1) {
				this.remove(1024, var7, var8, 933);
				this.remove(16384, var7, var8 + 1, 933);
			}
			if (arg0 == 2) {
				this.remove(4096, var7, var8, 933);
				this.remove(65536, var7 + 1, var8, 933);
			}
			if (arg0 == 3) {
				this.remove(16384, var7, var8, 933);
				this.remove(1024, var7, var8 - 1, 933);
			}
		}
		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				this.remove(512, var7, var8, 933);
				this.remove(8192, var7 - 1, var8 + 1, 933);
			}
			if (arg0 == 1) {
				this.remove(2048, var7, var8, 933);
				this.remove(32768, var7 + 1, var8 + 1, 933);
			}
			if (arg0 == 2) {
				this.remove(8192, var7, var8, 933);
				this.remove(512, var7 + 1, var8 - 1, 933);
			}
			if (arg0 == 3) {
				this.remove(32768, var7, var8, 933);
				this.remove(2048, var7 - 1, var8 - 1, 933);
			}
		}
		if (arg1 != 2) {
			return;
		}
		if (arg0 == 0) {
			this.remove(66560, var7, var8, 933);
			this.remove(4096, var7 - 1, var8, 933);
			this.remove(16384, var7, var8 + 1, 933);
		}
		if (arg0 == 1) {
			this.remove(5120, var7, var8, 933);
			this.remove(16384, var7, var8 + 1, 933);
			this.remove(65536, var7 + 1, var8, 933);
		}
		if (arg0 == 2) {
			this.remove(20480, var7, var8, 933);
			this.remove(65536, var7 + 1, var8, 933);
			this.remove(1024, var7, var8 - 1, 933);
		}
		if (arg0 == 3) {
			this.remove(81920, var7, var8, 933);
			this.remove(1024, var7, var8 - 1, 933);
			this.remove(4096, var7 - 1, var8, 933);
			return;
		}
	}

	@ObfuscatedName("FTPNODIB.a(IIIIBIZ)V")
	public void removeLoc(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
		int var8 = 256;
		if (arg6) {
			var8 += 131072;
		}
		int var9 = arg2 - this.offsetX;
		int var10 = arg3 - this.offsetZ;
		if (arg4 != 6) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		if (arg0 == 1 || arg0 == 3) {
			int var11 = arg1;
			arg1 = arg5;
			arg5 = var11;
		}
		for (int var12 = var9; var12 < arg1 + var9; var12++) {
			if (var12 >= 0 && var12 < this.sizeX) {
				for (int var13 = var10; var13 < arg5 + var10; var13++) {
					if (var13 >= 0 && var13 < this.sizeZ) {
						this.remove(var8, var12, var13, 933);
					}
				}
			}
		}
	}

	@ObfuscatedName("FTPNODIB.a(IIII)V")
	public void remove(int arg0, int arg1, int arg2, int arg3) {
		int var5 = 36 / arg3;
		this.flags[arg1][arg2] &= 16777215 - arg0;
	}

	@ObfuscatedName("FTPNODIB.c(III)V")
	public void removeBlocked(int arg0, int arg1, int arg2) {
		int var4 = arg2 - this.offsetX;
		int var5 = arg1 - this.offsetZ;
		int var6 = 6 / arg0;
		this.flags[var4][var5] &= 0xDFFFFF;
	}

	@ObfuscatedName("FTPNODIB.a(IIIIIII)Z")
	public boolean reachedWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg3 != 0) {
			this._flowObfuscator1 = !this._flowObfuscator1;
		}
		if (arg0 == arg1 && arg2 == arg6) {
			return true;
		}
		int var8 = arg1 - this.offsetX;
		int var9 = arg2 - this.offsetZ;
		int var10 = arg0 - this.offsetX;
		int var11 = arg6 - this.offsetZ;
		if (arg5 == 0) {
			if (arg4 == 0) {
				if (var10 - 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x1280120) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (var8 == var10 && var11 + 1 == var9) {
					return true;
				}
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x1280108) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (var10 + 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x1280120) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (var8 == var10 && var11 - 1 == var9) {
					return true;
				}
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x1280108) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x1280180) == 0) {
					return true;
				}
			}
		}
		if (arg5 == 2) {
			if (arg4 == 0) {
				if (var10 - 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x1280180) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x1280108) == 0) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x1280108) == 0) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x1280120) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9) {
					return true;
				}
			} else if (arg4 == 3) {
				if (var10 - 1 == var8 && var9 == var11) {
					return true;
				}
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x1280120) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x1280180) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9) {
					return true;
				}
			}
		}
		if (arg5 == 9) {
			if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x20) == 0) {
				return true;
			}
			if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
				return true;
			}
			if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
				return true;
			}
			if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("FTPNODIB.b(IIIIIII)Z")
	public boolean reachedWallDecoration(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 != 0) {
			throw new NullPointerException();
		} else if (arg0 == arg5 && arg1 == arg2) {
			return true;
		} else {
			int var8 = arg5 - this.offsetX;
			int var9 = arg2 - this.offsetZ;
			int var10 = arg0 - this.offsetX;
			int var11 = arg1 - this.offsetZ;
			if (arg3 == 6 || arg3 == 7) {
				if (arg3 == 7) {
					arg4 = arg4 + 2 & 0x3;
				}
				if (arg4 == 0) {
					if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 1) {
					if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
						return true;
					}
				} else if (arg4 == 2) {
					if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
						return true;
					}
					if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x20) == 0) {
						return true;
					}
				} else if (arg4 == 3) {
					if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
						return true;
					}
					if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x20) == 0) {
						return true;
					}
				}
			}
			if (arg3 == 8) {
				if (var8 == var10 && var11 + 1 == var9 && (this.flags[var8][var9] & 0x20) == 0) {
					return true;
				}
				if (var8 == var10 && var11 - 1 == var9 && (this.flags[var8][var9] & 0x2) == 0) {
					return true;
				}
				if (var10 - 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x8) == 0) {
					return true;
				}
				if (var10 + 1 == var8 && var9 == var11 && (this.flags[var8][var9] & 0x80) == 0) {
					return true;
				}
			}
			return false;
		}
	}

	@ObfuscatedName("FTPNODIB.a(BIIIIIII)Z")
	public boolean reachedLoc(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		if (arg0 != 1) {
			throw new NullPointerException();
		}
		int var9 = arg2 + arg6 - 1;
		int var10 = arg1 + arg4 - 1;
		if (arg3 >= arg2 && arg3 <= var9 && arg7 >= arg1 && arg7 <= var10) {
			return true;
		} else if (arg2 - 1 == arg3 && arg7 >= arg1 && arg7 <= var10 && (this.flags[arg3 - this.offsetX][arg7 - this.offsetZ] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		} else if (var9 + 1 == arg3 && arg7 >= arg1 && arg7 <= var10 && (this.flags[arg3 - this.offsetX][arg7 - this.offsetZ] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		} else if (arg1 - 1 == arg7 && arg3 >= arg2 && arg3 <= var9 && (this.flags[arg3 - this.offsetX][arg7 - this.offsetZ] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		} else {
			return var10 + 1 == arg7 && arg3 >= arg2 && arg3 <= var9 && (this.flags[arg3 - this.offsetX][arg7 - this.offsetZ] & 0x20) == 0 && (arg5 & 0x1) == 0;
		}
	}
}
