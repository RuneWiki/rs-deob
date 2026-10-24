package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("jc")
public class CollisionMap {

	@ObfuscatedName("jc.h")
	public int startX = 0;

	@ObfuscatedName("jc.i")
	public int startZ = 0;

	@ObfuscatedName("jc.j")
	public int sizeX;

	@ObfuscatedName("jc.k")
	public int sizeZ;

	@ObfuscatedName("jc.l")
	public int[][] flags;

	public CollisionMap(int arg0, int arg1) {
		sizeX = arg1;
		sizeZ = arg0;
		flags = new int[sizeX][sizeZ];
		reset();
	}

	@ObfuscatedName("jc.a(B)V")
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

	@ObfuscatedName("jc.a(IIZIBI)V")
	public void addWall(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg4 -= startX;
		arg3 -= startZ;
		if (arg1 == 0) {
			if (arg0 == 0) {
				addCMap(arg4, arg3, 128);
				addCMap(arg4 - 1, arg3, 8);
			}

			if (arg0 == 1) {
				addCMap(arg4, arg3, 2);
				addCMap(arg4, arg3 + 1, 32);
			}

			if (arg0 == 2) {
				addCMap(arg4, arg3, 8);
				addCMap(arg4 + 1, arg3, 128);
			}

			if (arg0 == 3) {
				addCMap(arg4, arg3, 32);
				addCMap(arg4, arg3 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				addCMap(arg4, arg3, 1);
				addCMap(arg4 - 1, arg3 + 1, 16);
			}

			if (arg0 == 1) {
				addCMap(arg4, arg3, 4);
				addCMap(arg4 + 1, arg3 + 1, 64);
			}

			if (arg0 == 2) {
				addCMap(arg4, arg3, 16);
				addCMap(arg4 + 1, arg3 - 1, 1);
			}

			if (arg0 == 3) {
				addCMap(arg4, arg3, 64);
				addCMap(arg4 - 1, arg3 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg0 == 0) {
				addCMap(arg4, arg3, 130);
				addCMap(arg4 - 1, arg3, 8);
				addCMap(arg4, arg3 + 1, 32);
			}

			if (arg0 == 1) {
				addCMap(arg4, arg3, 10);
				addCMap(arg4, arg3 + 1, 32);
				addCMap(arg4 + 1, arg3, 128);
			}

			if (arg0 == 2) {
				addCMap(arg4, arg3, 40);
				addCMap(arg4 + 1, arg3, 128);
				addCMap(arg4, arg3 - 1, 2);
			}

			if (arg0 == 3) {
				addCMap(arg4, arg3, 160);
				addCMap(arg4, arg3 - 1, 2);
				addCMap(arg4 - 1, arg3, 8);
			}
		}

		if (arg2) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					addCMap(arg4, arg3, 0x10000);
					addCMap(arg4 - 1, arg3, 4096);
				}

				if (arg0 == 1) {
					addCMap(arg4, arg3, 1024);
					addCMap(arg4, arg3 + 1, 16384);
				}

				if (arg0 == 2) {
					addCMap(arg4, arg3, 4096);
					addCMap(arg4 + 1, arg3, 0x10000);
				}

				if (arg0 == 3) {
					addCMap(arg4, arg3, 16384);
					addCMap(arg4, arg3 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					addCMap(arg4, arg3, 512);
					addCMap(arg4 - 1, arg3 + 1, 8192);
				}

				if (arg0 == 1) {
					addCMap(arg4, arg3, 2048);
					addCMap(arg4 + 1, arg3 + 1, 32768);
				}

				if (arg0 == 2) {
					addCMap(arg4, arg3, 8192);
					addCMap(arg4 + 1, arg3 - 1, 512);
				}

				if (arg0 == 3) {
					addCMap(arg4, arg3, 32768);
					addCMap(arg4 - 1, arg3 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg0 == 0) {
					addCMap(arg4, arg3, 66560);
					addCMap(arg4 - 1, arg3, 4096);
					addCMap(arg4, arg3 + 1, 16384);
				}

				if (arg0 == 1) {
					addCMap(arg4, arg3, 5120);
					addCMap(arg4, arg3 + 1, 16384);
					addCMap(arg4 + 1, arg3, 0x10000);
				}

				if (arg0 == 2) {
					addCMap(arg4, arg3, 20480);
					addCMap(arg4 + 1, arg3, 0x10000);
					addCMap(arg4, arg3 - 1, 1024);
				}

				if (arg0 == 3) {
					addCMap(arg4, arg3, 81920);
					addCMap(arg4, arg3 - 1, 1024);
					addCMap(arg4 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIIZI)V")
	public void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg1 -= startX;
		arg3 -= startZ;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg0;
			arg0 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg1; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg3; var10 < arg2 + arg3; var10++) {
					if (var10 >= 0 && var10 < sizeZ) {
						addCMap(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(ZII)V")
	public void blockGround(int arg0, int arg1) {
		arg0 -= startX;
		arg1 -= startZ;
		flags[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(BIZIII)V")
	public void delWall(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg4 -= startX;
		arg3 -= startZ;
		if (arg0 == 0) {
			if (arg2 == 0) {
				remCMap(arg3, 128, arg4);
				remCMap(arg3, 8, arg4 - 1);
			}

			if (arg2 == 1) {
				remCMap(arg3, 2, arg4);
				remCMap(arg3 + 1, 32, arg4);
			}

			if (arg2 == 2) {
				remCMap(arg3, 8, arg4);
				remCMap(arg3, 128, arg4 + 1);
			}

			if (arg2 == 3) {
				remCMap(arg3, 32, arg4);
				remCMap(arg3 - 1, 2, arg4);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				remCMap(arg3, 1, arg4);
				remCMap(arg3 + 1, 16, arg4 - 1);
			}

			if (arg2 == 1) {
				remCMap(arg3, 4, arg4);
				remCMap(arg3 + 1, 64, arg4 + 1);
			}

			if (arg2 == 2) {
				remCMap(arg3, 16, arg4);
				remCMap(arg3 - 1, 1, arg4 + 1);
			}

			if (arg2 == 3) {
				remCMap(arg3, 64, arg4);
				remCMap(arg3 - 1, 4, arg4 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				remCMap(arg3, 130, arg4);
				remCMap(arg3, 8, arg4 - 1);
				remCMap(arg3 + 1, 32, arg4);
			}

			if (arg2 == 1) {
				remCMap(arg3, 10, arg4);
				remCMap(arg3 + 1, 32, arg4);
				remCMap(arg3, 128, arg4 + 1);
			}

			if (arg2 == 2) {
				remCMap(arg3, 40, arg4);
				remCMap(arg3, 128, arg4 + 1);
				remCMap(arg3 - 1, 2, arg4);
			}

			if (arg2 == 3) {
				remCMap(arg3, 160, arg4);
				remCMap(arg3 - 1, 2, arg4);
				remCMap(arg3, 8, arg4 - 1);
			}
		}

		if (arg1) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					remCMap(arg3, 0x10000, arg4);
					remCMap(arg3, 4096, arg4 - 1);
				}

				if (arg2 == 1) {
					remCMap(arg3, 1024, arg4);
					remCMap(arg3 + 1, 16384, arg4);
				}

				if (arg2 == 2) {
					remCMap(arg3, 4096, arg4);
					remCMap(arg3, 0x10000, arg4 + 1);
				}

				if (arg2 == 3) {
					remCMap(arg3, 16384, arg4);
					remCMap(arg3 - 1, 1024, arg4);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					remCMap(arg3, 512, arg4);
					remCMap(arg3 + 1, 8192, arg4 - 1);
				}

				if (arg2 == 1) {
					remCMap(arg3, 2048, arg4);
					remCMap(arg3 + 1, 32768, arg4 + 1);
				}

				if (arg2 == 2) {
					remCMap(arg3, 8192, arg4);
					remCMap(arg3 - 1, 512, arg4 + 1);
				}

				if (arg2 == 3) {
					remCMap(arg3, 32768, arg4);
					remCMap(arg3 - 1, 2048, arg4 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg2 == 0) {
					remCMap(arg3, 66560, arg4);
					remCMap(arg3, 4096, arg4 - 1);
					remCMap(arg3 + 1, 16384, arg4);
				}

				if (arg2 == 1) {
					remCMap(arg3, 5120, arg4);
					remCMap(arg3 + 1, 16384, arg4);
					remCMap(arg3, 0x10000, arg4 + 1);
				}

				if (arg2 == 2) {
					remCMap(arg3, 20480, arg4);
					remCMap(arg3, 0x10000, arg4 + 1);
					remCMap(arg3 - 1, 1024, arg4);
				}

				if (arg2 == 3) {
					remCMap(arg3, 81920, arg4);
					remCMap(arg3 - 1, 1024, arg4);
					remCMap(arg3, 4096, arg4 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.b(IIIIIZI)V")
	public void delLoc(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= startX;
		arg2 -= startZ;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg1; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
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

	@ObfuscatedName("jc.b(III)V")
	public void unblockGround(int arg0, int arg1) {
		arg0 -= startX;
		arg1 -= startZ;
		flags[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(ZIIIIII)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg3 == arg5) {
			return true;
		}

		arg0 -= startX;
		arg5 -= startZ;
		arg2 -= startX;
		arg3 -= startZ;
		if (arg4 == 0) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg5 && (flags[arg0][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg5 && (flags[arg0][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 == arg2 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg2 - 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg5 && (flags[arg0][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg5 && (flags[arg0][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 == arg2 && arg3 - 1 == arg5) {
					return true;
				}

				if (arg2 - 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg5 && (flags[arg0][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 - 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg5 && (flags[arg0][arg5] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 - 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg5 && (flags[arg0][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg5) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg5 && (flags[arg0][arg5] & 0x280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg0 == arg2 && arg3 + 1 == arg5 && (flags[arg0][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg3 - 1 == arg5 && (flags[arg0][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg0 && arg3 == arg5 && (flags[arg0][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean testWDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg1 == arg5) {
			return true;
		}

		arg2 -= startX;
		arg5 -= startZ;
		arg0 -= startX;
		arg1 -= startZ;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg0 + 1 == arg2 && arg1 == arg5 && (flags[arg2][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 - 1 == arg5 && (flags[arg2][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 - 1 == arg2 && arg1 == arg5 && (flags[arg2][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 - 1 == arg5 && (flags[arg2][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg0 - 1 == arg2 && arg1 == arg5 && (flags[arg2][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 + 1 == arg5 && (flags[arg2][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 + 1 == arg2 && arg1 == arg5 && (flags[arg2][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg1 + 1 == arg5 && (flags[arg2][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg0 == arg2 && arg1 + 1 == arg5 && (flags[arg2][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg1 - 1 == arg5 && (flags[arg2][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg2 && arg1 == arg5 && (flags[arg2][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg2 && arg1 == arg5 && (flags[arg2][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg1 - 1;
		int var9 = arg3 + arg6 - 1;
		if (arg5 >= arg0 && arg5 <= var8 && arg4 >= arg3 && arg4 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg5 && arg4 >= arg3 && arg4 <= var9 && (flags[arg5 - startX][arg4 - startZ] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg4 >= arg3 && arg4 <= var9 && (flags[arg5 - startX][arg4 - startZ] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg4 && arg5 >= arg0 && arg5 <= var8 && (flags[arg5 - startX][arg4 - startZ] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg5 >= arg0 && arg5 <= var8 && (flags[arg5 - startX][arg4 - startZ] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
