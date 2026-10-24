package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("ec")
public class CollisionMap {

	@ObfuscatedName("ec.f")
	public int startX = 0;

	@ObfuscatedName("ec.g")
	public int startZ = 0;

	@ObfuscatedName("ec.h")
	public int sizeX;

	@ObfuscatedName("ec.i")
	public int sizeZ;

	@ObfuscatedName("ec.j")
	public int[][] flags;

	public CollisionMap(int arg0, int arg1) {
		sizeX = arg0;
		sizeZ = arg1;
		flags = new int[sizeX][sizeZ];
		reset();
	}

	@ObfuscatedName("ec.a(B)V")
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

	@ObfuscatedName("ec.a(ZIIIZI)V")
	public void addWall(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg2 -= startX;
		arg1 -= startZ;
		if (arg4 == 0) {
			if (arg0 == 0) {
				addCMap(arg2, arg1, 128);
				addCMap(arg2 - 1, arg1, 8);
			}

			if (arg0 == 1) {
				addCMap(arg2, arg1, 2);
				addCMap(arg2, arg1 + 1, 32);
			}

			if (arg0 == 2) {
				addCMap(arg2, arg1, 8);
				addCMap(arg2 + 1, arg1, 128);
			}

			if (arg0 == 3) {
				addCMap(arg2, arg1, 32);
				addCMap(arg2, arg1 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				addCMap(arg2, arg1, 1);
				addCMap(arg2 - 1, arg1 + 1, 16);
			}

			if (arg0 == 1) {
				addCMap(arg2, arg1, 4);
				addCMap(arg2 + 1, arg1 + 1, 64);
			}

			if (arg0 == 2) {
				addCMap(arg2, arg1, 16);
				addCMap(arg2 + 1, arg1 - 1, 1);
			}

			if (arg0 == 3) {
				addCMap(arg2, arg1, 64);
				addCMap(arg2 - 1, arg1 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				addCMap(arg2, arg1, 130);
				addCMap(arg2 - 1, arg1, 8);
				addCMap(arg2, arg1 + 1, 32);
			}

			if (arg0 == 1) {
				addCMap(arg2, arg1, 10);
				addCMap(arg2, arg1 + 1, 32);
				addCMap(arg2 + 1, arg1, 128);
			}

			if (arg0 == 2) {
				addCMap(arg2, arg1, 40);
				addCMap(arg2 + 1, arg1, 128);
				addCMap(arg2, arg1 - 1, 2);
			}

			if (arg0 == 3) {
				addCMap(arg2, arg1, 160);
				addCMap(arg2, arg1 - 1, 2);
				addCMap(arg2 - 1, arg1, 8);
			}
		}

		if (arg3) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					addCMap(arg2, arg1, 0x10000);
					addCMap(arg2 - 1, arg1, 4096);
				}

				if (arg0 == 1) {
					addCMap(arg2, arg1, 1024);
					addCMap(arg2, arg1 + 1, 16384);
				}

				if (arg0 == 2) {
					addCMap(arg2, arg1, 4096);
					addCMap(arg2 + 1, arg1, 0x10000);
				}

				if (arg0 == 3) {
					addCMap(arg2, arg1, 16384);
					addCMap(arg2, arg1 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					addCMap(arg2, arg1, 512);
					addCMap(arg2 - 1, arg1 + 1, 8192);
				}

				if (arg0 == 1) {
					addCMap(arg2, arg1, 2048);
					addCMap(arg2 + 1, arg1 + 1, 32768);
				}

				if (arg0 == 2) {
					addCMap(arg2, arg1, 8192);
					addCMap(arg2 + 1, arg1 - 1, 512);
				}

				if (arg0 == 3) {
					addCMap(arg2, arg1, 32768);
					addCMap(arg2 - 1, arg1 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg0 == 0) {
					addCMap(arg2, arg1, 66560);
					addCMap(arg2 - 1, arg1, 4096);
					addCMap(arg2, arg1 + 1, 16384);
				}

				if (arg0 == 1) {
					addCMap(arg2, arg1, 5120);
					addCMap(arg2, arg1 + 1, 16384);
					addCMap(arg2 + 1, arg1, 0x10000);
				}

				if (arg0 == 2) {
					addCMap(arg2, arg1, 20480);
					addCMap(arg2 + 1, arg1, 0x10000);
					addCMap(arg2, arg1 - 1, 1024);
				}

				if (arg0 == 3) {
					addCMap(arg2, arg1, 81920);
					addCMap(arg2, arg1 - 1, 1024);
					addCMap(arg2 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIIIZ)V")
	public void addLoc(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg3 -= startX;
		arg4 -= startZ;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg2;
			arg2 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg3; var9 < arg2 + arg3; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg4; var10 < arg1 + arg4; var10++) {
					if (var10 >= 0 && var10 < sizeZ) {
						addCMap(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(BII)V")
	public void blockGround(int arg0, int arg1) {
		arg1 -= startX;
		arg0 -= startZ;
		flags[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("ec.a(III)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ec.a(ZIIIII)V")
	public void delWall(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 -= startX;
		arg3 -= startZ;
		if (arg4 == 0) {
			if (arg1 == 0) {
				remCMap(arg3, arg2, 128);
				remCMap(arg3, arg2 - 1, 8);
			}

			if (arg1 == 1) {
				remCMap(arg3, arg2, 2);
				remCMap(arg3 + 1, arg2, 32);
			}

			if (arg1 == 2) {
				remCMap(arg3, arg2, 8);
				remCMap(arg3, arg2 + 1, 128);
			}

			if (arg1 == 3) {
				remCMap(arg3, arg2, 32);
				remCMap(arg3 - 1, arg2, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				remCMap(arg3, arg2, 1);
				remCMap(arg3 + 1, arg2 - 1, 16);
			}

			if (arg1 == 1) {
				remCMap(arg3, arg2, 4);
				remCMap(arg3 + 1, arg2 + 1, 64);
			}

			if (arg1 == 2) {
				remCMap(arg3, arg2, 16);
				remCMap(arg3 - 1, arg2 + 1, 1);
			}

			if (arg1 == 3) {
				remCMap(arg3, arg2, 64);
				remCMap(arg3 - 1, arg2 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				remCMap(arg3, arg2, 130);
				remCMap(arg3, arg2 - 1, 8);
				remCMap(arg3 + 1, arg2, 32);
			}

			if (arg1 == 1) {
				remCMap(arg3, arg2, 10);
				remCMap(arg3 + 1, arg2, 32);
				remCMap(arg3, arg2 + 1, 128);
			}

			if (arg1 == 2) {
				remCMap(arg3, arg2, 40);
				remCMap(arg3, arg2 + 1, 128);
				remCMap(arg3 - 1, arg2, 2);
			}

			if (arg1 == 3) {
				remCMap(arg3, arg2, 160);
				remCMap(arg3 - 1, arg2, 2);
				remCMap(arg3, arg2 - 1, 8);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					remCMap(arg3, arg2, 0x10000);
					remCMap(arg3, arg2 - 1, 4096);
				}

				if (arg1 == 1) {
					remCMap(arg3, arg2, 1024);
					remCMap(arg3 + 1, arg2, 16384);
				}

				if (arg1 == 2) {
					remCMap(arg3, arg2, 4096);
					remCMap(arg3, arg2 + 1, 0x10000);
				}

				if (arg1 == 3) {
					remCMap(arg3, arg2, 16384);
					remCMap(arg3 - 1, arg2, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					remCMap(arg3, arg2, 512);
					remCMap(arg3 + 1, arg2 - 1, 8192);
				}

				if (arg1 == 1) {
					remCMap(arg3, arg2, 2048);
					remCMap(arg3 + 1, arg2 + 1, 32768);
				}

				if (arg1 == 2) {
					remCMap(arg3, arg2, 8192);
					remCMap(arg3 - 1, arg2 + 1, 512);
				}

				if (arg1 == 3) {
					remCMap(arg3, arg2, 32768);
					remCMap(arg3 - 1, arg2 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					remCMap(arg3, arg2, 66560);
					remCMap(arg3, arg2 - 1, 4096);
					remCMap(arg3 + 1, arg2, 16384);
				}

				if (arg1 == 1) {
					remCMap(arg3, arg2, 5120);
					remCMap(arg3 + 1, arg2, 16384);
					remCMap(arg3, arg2 + 1, 0x10000);
				}

				if (arg1 == 2) {
					remCMap(arg3, arg2, 20480);
					remCMap(arg3, arg2 + 1, 0x10000);
					remCMap(arg3 - 1, arg2, 1024);
				}

				if (arg1 == 3) {
					remCMap(arg3, arg2, 81920);
					remCMap(arg3 - 1, arg2, 1024);
					remCMap(arg3, arg2 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IIIIZZI)V")
	public void delLoc(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= startX;
		arg0 -= startZ;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg3;
			arg3 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg0; var10 < arg0 + arg5; var10++) {
					if (var10 >= 0 && var10 < sizeZ) {
						remCMap(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ec.a(IBII)V")
	public void remCMap(int arg0, int arg1, int arg2) {
		flags[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("ec.b(III)V")
	public void unblockGround(int arg0, int arg1) {
		arg1 -= startX;
		arg0 -= startZ;
		flags[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ec.a(IIIIIII)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg1 == arg3) {
			return true;
		}

		arg5 -= startX;
		arg3 -= startZ;
		arg4 -= startX;
		arg1 -= startZ;
		if (arg2 == 0) {
			if (arg0 == 0) {
				if (arg4 - 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg3 && (flags[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg3 && (flags[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg4 == arg5 && arg1 + 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg4 + 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg3 && (flags[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg3 && (flags[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg4 == arg5 && arg1 - 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg0 == 0) {
				if (arg4 - 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg3 && (flags[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg4 - 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg3 && (flags[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg4 - 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg3 && (flags[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg3) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg4 - 1 == arg5 && arg1 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg1 + 1 == arg3 && (flags[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg1 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg4 == arg5 && arg1 + 1 == arg3 && (flags[arg5][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg1 - 1 == arg3 && (flags[arg5][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg5 && arg1 == arg3 && (flags[arg5][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.b(IIIIIII)Z")
	public boolean testWDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg3 && arg4 == arg5) {
			return true;
		}

		arg2 -= startX;
		arg4 -= startZ;
		arg3 -= startX;
		arg5 -= startZ;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg3 + 1 == arg2 && arg4 == arg5 && (flags[arg2][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg4 && (flags[arg2][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg3 - 1 == arg2 && arg4 == arg5 && (flags[arg2][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 - 1 == arg4 && (flags[arg2][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg3 - 1 == arg2 && arg4 == arg5 && (flags[arg2][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg4 && (flags[arg2][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg3 + 1 == arg2 && arg4 == arg5 && (flags[arg2][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg5 + 1 == arg4 && (flags[arg2][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg2 == arg3 && arg5 + 1 == arg4 && (flags[arg2][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg3 && arg5 - 1 == arg4 && (flags[arg2][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg2 && arg4 == arg5 && (flags[arg2][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg2 && arg4 == arg5 && (flags[arg2][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ec.a(IIIIIIII)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg3 + arg6 - 1;
		int var9 = arg1 + arg5 - 1;
		if (arg2 >= arg3 && arg2 <= var8 && arg0 >= arg5 && arg0 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg2 && arg0 >= arg5 && arg0 <= var9 && (flags[arg2 - startX][arg0 - startZ] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg2 && arg0 >= arg5 && arg0 <= var9 && (flags[arg2 - startX][arg0 - startZ] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg5 - 1 == arg0 && arg2 >= arg3 && arg2 <= var8 && (flags[arg2 - startX][arg0 - startZ] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg0 && arg2 >= arg3 && arg2 <= var8 && (flags[arg2 - startX][arg0 - startZ] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
