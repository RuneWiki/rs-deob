package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("jc")
public class CollisionMap {

	@ObfuscatedName("jc.g")
	public int startX = 0;

	@ObfuscatedName("jc.h")
	public int startZ = 0;

	@ObfuscatedName("jc.i")
	public int sizeX;

	@ObfuscatedName("jc.j")
	public int sizeZ;

	@ObfuscatedName("jc.k")
	public int[][] flags;

	public CollisionMap(int arg0, int arg1) {
		sizeX = arg1;
		sizeZ = arg0;
		flags = new int[sizeX][sizeZ];
		reset();
	}

	@ObfuscatedName("jc.a(Z)V")
	public void reset() {
		for (int var1 = 0; var1 < sizeX; var1++) {
			for (int var2 = 0; var2 < sizeZ; var2++) {
				if (var1 == 0 || var2 == 0 || sizeX - 1 == var1 || sizeZ - 1 == var2) {
					flags[var1][var2] = 0xFFFFFF;
				} else {
					flags[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIZI)V")
	public void addWall(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg0 -= startX;
		arg1 -= startZ;
		if (arg4 == 0) {
			if (arg2 == 0) {
				addCMap(arg0, arg1, 128);
				addCMap(arg0 - 1, arg1, 8);
			}

			if (arg2 == 1) {
				addCMap(arg0, arg1, 2);
				addCMap(arg0, arg1 + 1, 32);
			}

			if (arg2 == 2) {
				addCMap(arg0, arg1, 8);
				addCMap(arg0 + 1, arg1, 128);
			}

			if (arg2 == 3) {
				addCMap(arg0, arg1, 32);
				addCMap(arg0, arg1 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				addCMap(arg0, arg1, 1);
				addCMap(arg0 - 1, arg1 + 1, 16);
			}

			if (arg2 == 1) {
				addCMap(arg0, arg1, 4);
				addCMap(arg0 + 1, arg1 + 1, 64);
			}

			if (arg2 == 2) {
				addCMap(arg0, arg1, 16);
				addCMap(arg0 + 1, arg1 - 1, 1);
			}

			if (arg2 == 3) {
				addCMap(arg0, arg1, 64);
				addCMap(arg0 - 1, arg1 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				addCMap(arg0, arg1, 130);
				addCMap(arg0 - 1, arg1, 8);
				addCMap(arg0, arg1 + 1, 32);
			}

			if (arg2 == 1) {
				addCMap(arg0, arg1, 10);
				addCMap(arg0, arg1 + 1, 32);
				addCMap(arg0 + 1, arg1, 128);
			}

			if (arg2 == 2) {
				addCMap(arg0, arg1, 40);
				addCMap(arg0 + 1, arg1, 128);
				addCMap(arg0, arg1 - 1, 2);
			}

			if (arg2 == 3) {
				addCMap(arg0, arg1, 160);
				addCMap(arg0, arg1 - 1, 2);
				addCMap(arg0 - 1, arg1, 8);
			}
		}

		if (arg3) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					addCMap(arg0, arg1, 0x10000);
					addCMap(arg0 - 1, arg1, 4096);
				}

				if (arg2 == 1) {
					addCMap(arg0, arg1, 1024);
					addCMap(arg0, arg1 + 1, 16384);
				}

				if (arg2 == 2) {
					addCMap(arg0, arg1, 4096);
					addCMap(arg0 + 1, arg1, 0x10000);
				}

				if (arg2 == 3) {
					addCMap(arg0, arg1, 16384);
					addCMap(arg0, arg1 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					addCMap(arg0, arg1, 512);
					addCMap(arg0 - 1, arg1 + 1, 8192);
				}

				if (arg2 == 1) {
					addCMap(arg0, arg1, 2048);
					addCMap(arg0 + 1, arg1 + 1, 32768);
				}

				if (arg2 == 2) {
					addCMap(arg0, arg1, 8192);
					addCMap(arg0 + 1, arg1 - 1, 512);
				}

				if (arg2 == 3) {
					addCMap(arg0, arg1, 32768);
					addCMap(arg0 - 1, arg1 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg2 == 0) {
					addCMap(arg0, arg1, 66560);
					addCMap(arg0 - 1, arg1, 4096);
					addCMap(arg0, arg1 + 1, 16384);
				}

				if (arg2 == 1) {
					addCMap(arg0, arg1, 5120);
					addCMap(arg0, arg1 + 1, 16384);
					addCMap(arg0 + 1, arg1, 0x10000);
				}

				if (arg2 == 2) {
					addCMap(arg0, arg1, 20480);
					addCMap(arg0 + 1, arg1, 0x10000);
					addCMap(arg0, arg1 - 1, 1024);
				}

				if (arg2 == 3) {
					addCMap(arg0, arg1, 81920);
					addCMap(arg0, arg1 - 1, 1024);
					addCMap(arg0 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(ZIIIIII)V")
	public void addLoc(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg5 -= startX;
		arg1 -= startZ;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg3;
			arg3 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg5; var9 < arg3 + arg5; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg1; var10 < arg1 + arg4; var10++) {
					if (var10 >= 0 && var10 < sizeZ) {
						addCMap(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void blockGround(int arg0, int arg1) {
		arg1 -= startX;
		arg0 -= startZ;
		flags[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IBIIIZ)V")
	public void delWall(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg1 -= startX;
		arg3 -= startZ;
		if (arg0 == 0) {
			if (arg2 == 0) {
				remCMap(arg3, 128, arg1);
				remCMap(arg3, 8, arg1 - 1);
			}

			if (arg2 == 1) {
				remCMap(arg3, 2, arg1);
				remCMap(arg3 + 1, 32, arg1);
			}

			if (arg2 == 2) {
				remCMap(arg3, 8, arg1);
				remCMap(arg3, 128, arg1 + 1);
			}

			if (arg2 == 3) {
				remCMap(arg3, 32, arg1);
				remCMap(arg3 - 1, 2, arg1);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				remCMap(arg3, 1, arg1);
				remCMap(arg3 + 1, 16, arg1 - 1);
			}

			if (arg2 == 1) {
				remCMap(arg3, 4, arg1);
				remCMap(arg3 + 1, 64, arg1 + 1);
			}

			if (arg2 == 2) {
				remCMap(arg3, 16, arg1);
				remCMap(arg3 - 1, 1, arg1 + 1);
			}

			if (arg2 == 3) {
				remCMap(arg3, 64, arg1);
				remCMap(arg3 - 1, 4, arg1 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				remCMap(arg3, 130, arg1);
				remCMap(arg3, 8, arg1 - 1);
				remCMap(arg3 + 1, 32, arg1);
			}

			if (arg2 == 1) {
				remCMap(arg3, 10, arg1);
				remCMap(arg3 + 1, 32, arg1);
				remCMap(arg3, 128, arg1 + 1);
			}

			if (arg2 == 2) {
				remCMap(arg3, 40, arg1);
				remCMap(arg3, 128, arg1 + 1);
				remCMap(arg3 - 1, 2, arg1);
			}

			if (arg2 == 3) {
				remCMap(arg3, 160, arg1);
				remCMap(arg3 - 1, 2, arg1);
				remCMap(arg3, 8, arg1 - 1);
			}
		}

		if (arg4) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					remCMap(arg3, 0x10000, arg1);
					remCMap(arg3, 4096, arg1 - 1);
				}

				if (arg2 == 1) {
					remCMap(arg3, 1024, arg1);
					remCMap(arg3 + 1, 16384, arg1);
				}

				if (arg2 == 2) {
					remCMap(arg3, 4096, arg1);
					remCMap(arg3, 0x10000, arg1 + 1);
				}

				if (arg2 == 3) {
					remCMap(arg3, 16384, arg1);
					remCMap(arg3 - 1, 1024, arg1);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					remCMap(arg3, 512, arg1);
					remCMap(arg3 + 1, 8192, arg1 - 1);
				}

				if (arg2 == 1) {
					remCMap(arg3, 2048, arg1);
					remCMap(arg3 + 1, 32768, arg1 + 1);
				}

				if (arg2 == 2) {
					remCMap(arg3, 8192, arg1);
					remCMap(arg3 - 1, 512, arg1 + 1);
				}

				if (arg2 == 3) {
					remCMap(arg3, 32768, arg1);
					remCMap(arg3 - 1, 2048, arg1 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg2 == 0) {
					remCMap(arg3, 66560, arg1);
					remCMap(arg3, 4096, arg1 - 1);
					remCMap(arg3 + 1, 16384, arg1);
				}

				if (arg2 == 1) {
					remCMap(arg3, 5120, arg1);
					remCMap(arg3 + 1, 16384, arg1);
					remCMap(arg3, 0x10000, arg1 + 1);
				}

				if (arg2 == 2) {
					remCMap(arg3, 20480, arg1);
					remCMap(arg3, 0x10000, arg1 + 1);
					remCMap(arg3 - 1, 1024, arg1);
				}

				if (arg2 == 3) {
					remCMap(arg3, 81920, arg1);
					remCMap(arg3 - 1, 1024, arg1);
					remCMap(arg3, 4096, arg1 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(ZIIBIII)V")
	public void delLoc(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg5 -= startX;
		arg2 -= startZ;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg1;
			arg1 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg5; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg2; var10 < arg2 + arg3; var10++) {
					if (var10 >= 0 && var10 < sizeZ) {
						remCMap(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void remCMap(int arg0, int arg1, int arg2) {
		flags[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("jc.a(ZII)V")
	public void unblockGround(int arg0, int arg1) {
		arg1 -= startX;
		arg0 -= startZ;
		flags[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg2 == arg3) {
			return true;
		}

		arg5 -= startX;
		arg2 -= startZ;
		arg1 -= startX;
		arg3 -= startZ;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (flags[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (flags[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (flags[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (flags[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 == arg5 && arg3 - 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (flags[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (flags[arg5][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (flags[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (flags[arg5][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg1 == arg5 && arg3 + 1 == arg2 && (flags[arg5][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg3 - 1 == arg2 && (flags[arg5][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg5 && arg2 == arg3 && (flags[arg5][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.b(ZIIIIII)Z")
	public boolean testWDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg1 == arg5) {
			return true;
		}

		arg4 -= startX;
		arg1 -= startZ;
		arg0 -= startX;
		arg5 -= startZ;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg0 + 1 == arg4 && arg1 == arg5 && (flags[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg1 && (flags[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg4 && arg1 == arg5 && (flags[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg1 && (flags[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg4 && arg1 == arg5 && (flags[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg1 && (flags[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 + 1 == arg4 && arg1 == arg5 && (flags[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg1 && (flags[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg0 == arg4 && arg5 + 1 == arg1 && (flags[arg4][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg5 - 1 == arg1 && (flags[arg4][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg4 && arg1 == arg5 && (flags[arg4][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg4 && arg1 == arg5 && (flags[arg4][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg3 - 1;
		int var9 = arg5 + arg6 - 1;
		if (arg1 >= arg3 && arg1 <= var8 && arg4 >= arg6 && arg4 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg1 && arg4 >= arg6 && arg4 <= var9 && (flags[arg1 - startX][arg4 - startZ] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg4 >= arg6 && arg4 <= var9 && (flags[arg1 - startX][arg4 - startZ] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg4 && arg1 >= arg3 && arg1 <= var8 && (flags[arg1 - startX][arg4 - startZ] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg1 >= arg3 && arg1 <= var8 && (flags[arg1 - startX][arg4 - startZ] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
