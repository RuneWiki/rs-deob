package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("FTPNODIB")
public class CollisionMap {

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

	public CollisionMap(int arg0, int arg1) {
		sizeX = arg0;
		sizeZ = arg1;
		flags = new int[sizeX][sizeZ];
		reset();
	}

	@ObfuscatedName("FTPNODIB.a()V")
	public void reset() {
		for (int var1 = 0; var1 < sizeX; var1++) {
			for (int var2 = 0; var2 < sizeZ; var2++) {
				if (var1 == 0 || var2 == 0 || sizeX - 1 == var1 || sizeZ - 1 == var2) {
					flags[var1][var2] = 0xFFFFFF;
				} else {
					flags[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("FTPNODIB.a(IIIIBZ)V")
	public void addWall(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg2 -= offsetX;
		arg0 -= offsetZ;
		if (arg3 == 0) {
			if (arg1 == 0) {
				add(arg2, arg0, 128);
				add(arg2 - 1, arg0, 8);
			}

			if (arg1 == 1) {
				add(arg2, arg0, 2);
				add(arg2, arg0 + 1, 32);
			}

			if (arg1 == 2) {
				add(arg2, arg0, 8);
				add(arg2 + 1, arg0, 128);
			}

			if (arg1 == 3) {
				add(arg2, arg0, 32);
				add(arg2, arg0 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				add(arg2, arg0, 1);
				add(arg2 - 1, arg0 + 1, 16);
			}

			if (arg1 == 1) {
				add(arg2, arg0, 4);
				add(arg2 + 1, arg0 + 1, 64);
			}

			if (arg1 == 2) {
				add(arg2, arg0, 16);
				add(arg2 + 1, arg0 - 1, 1);
			}

			if (arg1 == 3) {
				add(arg2, arg0, 64);
				add(arg2 - 1, arg0 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				add(arg2, arg0, 130);
				add(arg2 - 1, arg0, 8);
				add(arg2, arg0 + 1, 32);
			}

			if (arg1 == 1) {
				add(arg2, arg0, 10);
				add(arg2, arg0 + 1, 32);
				add(arg2 + 1, arg0, 128);
			}

			if (arg1 == 2) {
				add(arg2, arg0, 40);
				add(arg2 + 1, arg0, 128);
				add(arg2, arg0 - 1, 2);
			}

			if (arg1 == 3) {
				add(arg2, arg0, 160);
				add(arg2, arg0 - 1, 2);
				add(arg2 - 1, arg0, 8);
			}
		}

		if (arg4) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					add(arg2, arg0, 0x10000);
					add(arg2 - 1, arg0, 4096);
				}

				if (arg1 == 1) {
					add(arg2, arg0, 1024);
					add(arg2, arg0 + 1, 16384);
				}

				if (arg1 == 2) {
					add(arg2, arg0, 4096);
					add(arg2 + 1, arg0, 0x10000);
				}

				if (arg1 == 3) {
					add(arg2, arg0, 16384);
					add(arg2, arg0 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					add(arg2, arg0, 512);
					add(arg2 - 1, arg0 + 1, 8192);
				}

				if (arg1 == 1) {
					add(arg2, arg0, 2048);
					add(arg2 + 1, arg0 + 1, 32768);
				}

				if (arg1 == 2) {
					add(arg2, arg0, 8192);
					add(arg2 + 1, arg0 - 1, 512);
				}

				if (arg1 == 3) {
					add(arg2, arg0, 32768);
					add(arg2 - 1, arg0 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					add(arg2, arg0, 66560);
					add(arg2 - 1, arg0, 4096);
					add(arg2, arg0 + 1, 16384);
				}

				if (arg1 == 1) {
					add(arg2, arg0, 5120);
					add(arg2, arg0 + 1, 16384);
					add(arg2 + 1, arg0, 0x10000);
				}

				if (arg1 == 2) {
					add(arg2, arg0, 20480);
					add(arg2 + 1, arg0, 0x10000);
					add(arg2, arg0 - 1, 1024);
				}

				if (arg1 == 3) {
					add(arg2, arg0, 81920);
					add(arg2, arg0 - 1, 1024);
					add(arg2 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("FTPNODIB.a(ZIIIIII)V")
	public void addLoc(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg3 -= offsetX;
		arg4 -= offsetZ;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg1;
			arg1 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg3; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg4; var10 < arg2 + arg4; var10++) {
					if (var10 >= 0 && var10 < sizeZ) {
						add(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("FTPNODIB.a(III)V")
	public void setBlocked(int arg0, int arg1) {
		arg1 -= offsetX;
		arg0 -= offsetZ;
		flags[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("FTPNODIB.b(III)V")
	public void add(int arg0, int arg1, int arg2) {
		flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("FTPNODIB.a(IIZZII)V")
	public void removeWall(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= offsetX;
		arg4 -= offsetZ;
		if (arg1 == 0) {
			if (arg0 == 0) {
				remove(128, arg3, arg4);
				remove(8, arg3 - 1, arg4);
			}

			if (arg0 == 1) {
				remove(2, arg3, arg4);
				remove(32, arg3, arg4 + 1);
			}

			if (arg0 == 2) {
				remove(8, arg3, arg4);
				remove(128, arg3 + 1, arg4);
			}

			if (arg0 == 3) {
				remove(32, arg3, arg4);
				remove(2, arg3, arg4 - 1);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				remove(1, arg3, arg4);
				remove(16, arg3 - 1, arg4 + 1);
			}

			if (arg0 == 1) {
				remove(4, arg3, arg4);
				remove(64, arg3 + 1, arg4 + 1);
			}

			if (arg0 == 2) {
				remove(16, arg3, arg4);
				remove(1, arg3 + 1, arg4 - 1);
			}

			if (arg0 == 3) {
				remove(64, arg3, arg4);
				remove(4, arg3 - 1, arg4 - 1);
			}
		}

		if (arg1 == 2) {
			if (arg0 == 0) {
				remove(130, arg3, arg4);
				remove(8, arg3 - 1, arg4);
				remove(32, arg3, arg4 + 1);
			}

			if (arg0 == 1) {
				remove(10, arg3, arg4);
				remove(32, arg3, arg4 + 1);
				remove(128, arg3 + 1, arg4);
			}

			if (arg0 == 2) {
				remove(40, arg3, arg4);
				remove(128, arg3 + 1, arg4);
				remove(2, arg3, arg4 - 1);
			}

			if (arg0 == 3) {
				remove(160, arg3, arg4);
				remove(2, arg3, arg4 - 1);
				remove(8, arg3 - 1, arg4);
			}
		}

		if (arg2) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					remove(0x10000, arg3, arg4);
					remove(4096, arg3 - 1, arg4);
				}

				if (arg0 == 1) {
					remove(1024, arg3, arg4);
					remove(16384, arg3, arg4 + 1);
				}

				if (arg0 == 2) {
					remove(4096, arg3, arg4);
					remove(0x10000, arg3 + 1, arg4);
				}

				if (arg0 == 3) {
					remove(16384, arg3, arg4);
					remove(1024, arg3, arg4 - 1);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					remove(512, arg3, arg4);
					remove(8192, arg3 - 1, arg4 + 1);
				}

				if (arg0 == 1) {
					remove(2048, arg3, arg4);
					remove(32768, arg3 + 1, arg4 + 1);
				}

				if (arg0 == 2) {
					remove(8192, arg3, arg4);
					remove(512, arg3 + 1, arg4 - 1);
				}

				if (arg0 == 3) {
					remove(32768, arg3, arg4);
					remove(2048, arg3 - 1, arg4 - 1);
				}
			}

			if (arg1 == 2) {
				if (arg0 == 0) {
					remove(66560, arg3, arg4);
					remove(4096, arg3 - 1, arg4);
					remove(16384, arg3, arg4 + 1);
				}

				if (arg0 == 1) {
					remove(5120, arg3, arg4);
					remove(16384, arg3, arg4 + 1);
					remove(0x10000, arg3 + 1, arg4);
				}

				if (arg0 == 2) {
					remove(20480, arg3, arg4);
					remove(0x10000, arg3 + 1, arg4);
					remove(1024, arg3, arg4 - 1);
				}

				if (arg0 == 3) {
					remove(81920, arg3, arg4);
					remove(1024, arg3, arg4 - 1);
					remove(4096, arg3 - 1, arg4);
					return;
				}
			}
		}
	}

	@ObfuscatedName("FTPNODIB.a(IIIIBIZ)V")
	public void removeLoc(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg2 -= offsetX;
		arg3 -= offsetZ;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg1;
			arg1 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg2; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg3; var10 < arg3 + arg4; var10++) {
					if (var10 >= 0 && var10 < sizeZ) {
						remove(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("FTPNODIB.a(IIII)V")
	public void remove(int arg0, int arg1, int arg2) {
		flags[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("FTPNODIB.c(III)V")
	public void removeBlocked(int arg0, int arg1) {
		arg1 -= offsetX;
		arg0 -= offsetZ;
		flags[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("FTPNODIB.a(IIIIIII)Z")
	public boolean reachedWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg2 == arg5) {
			return true;
		}

		arg1 -= offsetX;
		arg2 -= offsetZ;
		arg0 -= offsetX;
		arg5 -= offsetZ;
		if (arg4 == 0) {
			if (arg3 == 0) {
				if (arg0 - 1 == arg1 && arg2 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg2 && (flags[arg1][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg2 && (flags[arg1][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 == arg1 && arg5 + 1 == arg2) {
					return true;
				}

				if (arg0 - 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 + 1 == arg1 && arg2 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg2 && (flags[arg1][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg2 && (flags[arg1][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 == arg1 && arg5 - 1 == arg2) {
					return true;
				}

				if (arg0 - 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				if (arg0 - 1 == arg1 && arg2 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg2) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg2 && (flags[arg1][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg2) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg2 && (flags[arg1][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg2 && (flags[arg1][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg2) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 - 1 == arg1 && arg2 == arg5) {
					return true;
				}

				if (arg0 == arg1 && arg5 + 1 == arg2 && (flags[arg1][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg5 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg0 == arg1 && arg5 + 1 == arg2 && (flags[arg1][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg5 - 1 == arg2 && (flags[arg1][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg1 && arg2 == arg5 && (flags[arg1][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("FTPNODIB.b(IIIIIII)Z")
	public boolean reachedWallDecoration(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg1 == arg2) {
			return true;
		}

		arg5 -= offsetX;
		arg2 -= offsetZ;
		arg0 -= offsetX;
		arg1 -= offsetZ;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg0 + 1 == arg5 && arg1 == arg2 && (flags[arg5][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 - 1 == arg2 && (flags[arg5][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 - 1 == arg5 && arg1 == arg2 && (flags[arg5][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 - 1 == arg2 && (flags[arg5][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg0 - 1 == arg5 && arg1 == arg2 && (flags[arg5][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 + 1 == arg2 && (flags[arg5][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 + 1 == arg5 && arg1 == arg2 && (flags[arg5][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg1 + 1 == arg2 && (flags[arg5][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg0 == arg5 && arg1 + 1 == arg2 && (flags[arg5][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg5 && arg1 - 1 == arg2 && (flags[arg5][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg5 && arg1 == arg2 && (flags[arg5][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg5 && arg1 == arg2 && (flags[arg5][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("FTPNODIB.a(BIIIIIII)Z")
	public boolean reachedLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg5 - 1;
		int var9 = arg0 + arg3 - 1;
		if (arg2 >= arg1 && arg2 <= var8 && arg6 >= arg0 && arg6 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg2 && arg6 >= arg0 && arg6 <= var9 && (flags[arg2 - offsetX][arg6 - offsetZ] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg2 && arg6 >= arg0 && arg6 <= var9 && (flags[arg2 - offsetX][arg6 - offsetZ] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg6 && arg2 >= arg1 && arg2 <= var8 && (flags[arg2 - offsetX][arg6 - offsetZ] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg6 && arg2 >= arg1 && arg2 <= var8 && (flags[arg2 - offsetX][arg6 - offsetZ] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
