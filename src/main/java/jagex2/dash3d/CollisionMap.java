package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("jc")
public class CollisionMap {

	@ObfuscatedName("jc.j")
	public int startX = 0;

	@ObfuscatedName("jc.k")
	public int startZ = 0;

	@ObfuscatedName("jc.l")
	public int sizeX;

	@ObfuscatedName("jc.m")
	public int sizeZ;

	@ObfuscatedName("jc.n")
	public int[][] flags;

	public CollisionMap(int arg0, int arg1) {
		sizeX = arg1;
		sizeZ = arg0;
		flags = new int[sizeX][sizeZ];
		reset();
	}

	@ObfuscatedName("jc.a(I)V")
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

	@ObfuscatedName("jc.a(ZIZIII)V")
	public void addWall(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= startX;
		arg4 -= startZ;
		if (arg2 == 0) {
			if (arg0 == 0) {
				addCMap(arg3, arg4, 128);
				addCMap(arg3 - 1, arg4, 8);
			}

			if (arg0 == 1) {
				addCMap(arg3, arg4, 2);
				addCMap(arg3, arg4 + 1, 32);
			}

			if (arg0 == 2) {
				addCMap(arg3, arg4, 8);
				addCMap(arg3 + 1, arg4, 128);
			}

			if (arg0 == 3) {
				addCMap(arg3, arg4, 32);
				addCMap(arg3, arg4 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg0 == 0) {
				addCMap(arg3, arg4, 1);
				addCMap(arg3 - 1, arg4 + 1, 16);
			}

			if (arg0 == 1) {
				addCMap(arg3, arg4, 4);
				addCMap(arg3 + 1, arg4 + 1, 64);
			}

			if (arg0 == 2) {
				addCMap(arg3, arg4, 16);
				addCMap(arg3 + 1, arg4 - 1, 1);
			}

			if (arg0 == 3) {
				addCMap(arg3, arg4, 64);
				addCMap(arg3 - 1, arg4 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg0 == 0) {
				addCMap(arg3, arg4, 130);
				addCMap(arg3 - 1, arg4, 8);
				addCMap(arg3, arg4 + 1, 32);
			}

			if (arg0 == 1) {
				addCMap(arg3, arg4, 10);
				addCMap(arg3, arg4 + 1, 32);
				addCMap(arg3 + 1, arg4, 128);
			}

			if (arg0 == 2) {
				addCMap(arg3, arg4, 40);
				addCMap(arg3 + 1, arg4, 128);
				addCMap(arg3, arg4 - 1, 2);
			}

			if (arg0 == 3) {
				addCMap(arg3, arg4, 160);
				addCMap(arg3, arg4 - 1, 2);
				addCMap(arg3 - 1, arg4, 8);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg0 == 0) {
					addCMap(arg3, arg4, 0x10000);
					addCMap(arg3 - 1, arg4, 4096);
				}

				if (arg0 == 1) {
					addCMap(arg3, arg4, 1024);
					addCMap(arg3, arg4 + 1, 16384);
				}

				if (arg0 == 2) {
					addCMap(arg3, arg4, 4096);
					addCMap(arg3 + 1, arg4, 0x10000);
				}

				if (arg0 == 3) {
					addCMap(arg3, arg4, 16384);
					addCMap(arg3, arg4 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg0 == 0) {
					addCMap(arg3, arg4, 512);
					addCMap(arg3 - 1, arg4 + 1, 8192);
				}

				if (arg0 == 1) {
					addCMap(arg3, arg4, 2048);
					addCMap(arg3 + 1, arg4 + 1, 32768);
				}

				if (arg0 == 2) {
					addCMap(arg3, arg4, 8192);
					addCMap(arg3 + 1, arg4 - 1, 512);
				}

				if (arg0 == 3) {
					addCMap(arg3, arg4, 32768);
					addCMap(arg3 - 1, arg4 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg0 == 0) {
					addCMap(arg3, arg4, 66560);
					addCMap(arg3 - 1, arg4, 4096);
					addCMap(arg3, arg4 + 1, 16384);
				}

				if (arg0 == 1) {
					addCMap(arg3, arg4, 5120);
					addCMap(arg3, arg4 + 1, 16384);
					addCMap(arg3 + 1, arg4, 0x10000);
				}

				if (arg0 == 2) {
					addCMap(arg3, arg4, 20480);
					addCMap(arg3 + 1, arg4, 0x10000);
					addCMap(arg3, arg4 - 1, 1024);
				}

				if (arg0 == 3) {
					addCMap(arg3, arg4, 81920);
					addCMap(arg3, arg4 - 1, 1024);
					addCMap(arg3 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIZIIII)V")
	public void addLoc(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg3 -= startX;
		arg0 -= startZ;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg1;
			arg1 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg3; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg0; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < sizeZ) {
						addCMap(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IBI)V")
	public void blockGround(int arg0, int arg1) {
		arg0 -= startX;
		arg1 -= startZ;
		flags[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("jc.a(III)V")
	public void addCMap(int arg0, int arg1, int arg2) {
		flags[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IIIIZB)V")
	public void delWall(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg3 -= startX;
		arg2 -= startZ;
		if (arg1 == 0) {
			if (arg0 == 0) {
				remCMap(arg3, arg2, 128);
				remCMap(arg3 - 1, arg2, 8);
			}

			if (arg0 == 1) {
				remCMap(arg3, arg2, 2);
				remCMap(arg3, arg2 + 1, 32);
			}

			if (arg0 == 2) {
				remCMap(arg3, arg2, 8);
				remCMap(arg3 + 1, arg2, 128);
			}

			if (arg0 == 3) {
				remCMap(arg3, arg2, 32);
				remCMap(arg3, arg2 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				remCMap(arg3, arg2, 1);
				remCMap(arg3 - 1, arg2 + 1, 16);
			}

			if (arg0 == 1) {
				remCMap(arg3, arg2, 4);
				remCMap(arg3 + 1, arg2 + 1, 64);
			}

			if (arg0 == 2) {
				remCMap(arg3, arg2, 16);
				remCMap(arg3 + 1, arg2 - 1, 1);
			}

			if (arg0 == 3) {
				remCMap(arg3, arg2, 64);
				remCMap(arg3 - 1, arg2 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg0 == 0) {
				remCMap(arg3, arg2, 130);
				remCMap(arg3 - 1, arg2, 8);
				remCMap(arg3, arg2 + 1, 32);
			}

			if (arg0 == 1) {
				remCMap(arg3, arg2, 10);
				remCMap(arg3, arg2 + 1, 32);
				remCMap(arg3 + 1, arg2, 128);
			}

			if (arg0 == 2) {
				remCMap(arg3, arg2, 40);
				remCMap(arg3 + 1, arg2, 128);
				remCMap(arg3, arg2 - 1, 2);
			}

			if (arg0 == 3) {
				remCMap(arg3, arg2, 160);
				remCMap(arg3, arg2 - 1, 2);
				remCMap(arg3 - 1, arg2, 8);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					remCMap(arg3, arg2, 0x10000);
					remCMap(arg3 - 1, arg2, 4096);
				}

				if (arg0 == 1) {
					remCMap(arg3, arg2, 1024);
					remCMap(arg3, arg2 + 1, 16384);
				}

				if (arg0 == 2) {
					remCMap(arg3, arg2, 4096);
					remCMap(arg3 + 1, arg2, 0x10000);
				}

				if (arg0 == 3) {
					remCMap(arg3, arg2, 16384);
					remCMap(arg3, arg2 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					remCMap(arg3, arg2, 512);
					remCMap(arg3 - 1, arg2 + 1, 8192);
				}

				if (arg0 == 1) {
					remCMap(arg3, arg2, 2048);
					remCMap(arg3 + 1, arg2 + 1, 32768);
				}

				if (arg0 == 2) {
					remCMap(arg3, arg2, 8192);
					remCMap(arg3 + 1, arg2 - 1, 512);
				}

				if (arg0 == 3) {
					remCMap(arg3, arg2, 32768);
					remCMap(arg3 - 1, arg2 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg0 == 0) {
					remCMap(arg3, arg2, 66560);
					remCMap(arg3 - 1, arg2, 4096);
					remCMap(arg3, arg2 + 1, 16384);
				}

				if (arg0 == 1) {
					remCMap(arg3, arg2, 5120);
					remCMap(arg3, arg2 + 1, 16384);
					remCMap(arg3 + 1, arg2, 0x10000);
				}

				if (arg0 == 2) {
					remCMap(arg3, arg2, 20480);
					remCMap(arg3 + 1, arg2, 0x10000);
					remCMap(arg3, arg2 - 1, 1024);
				}

				if (arg0 == 3) {
					remCMap(arg3, arg2, 81920);
					remCMap(arg3, arg2 - 1, 1024);
					remCMap(arg3 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIZIII)V")
	public void delLoc(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg2 -= startX;
		arg1 -= startZ;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg5;
			arg5 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < sizeX) {
				for (int var10 = arg1; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < sizeZ) {
						remCMap(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void remCMap(int arg0, int arg1, int arg2) {
		flags[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("jc.a(IZI)V")
	public void unblockGround(int arg0, int arg1) {
		arg1 -= startX;
		arg0 -= startZ;
		flags[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean testWall(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg0 == arg4) {
			return true;
		}

		arg5 -= startX;
		arg4 -= startZ;
		arg3 -= startX;
		arg0 -= startZ;
		if (arg2 == 0) {
			if (arg1 == 0) {
				if (arg3 - 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg4 && (flags[arg5][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg4 && (flags[arg5][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg3 == arg5 && arg0 + 1 == arg4) {
					return true;
				}

				if (arg3 - 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg3 + 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg4 && (flags[arg5][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg4 && (flags[arg5][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg3 == arg5 && arg0 - 1 == arg4) {
					return true;
				}

				if (arg3 - 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg1 == 0) {
				if (arg3 - 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg4) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg4 && (flags[arg5][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg3 - 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg4) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg4 && (flags[arg5][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg3 - 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg4 && (flags[arg5][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg4) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg3 - 1 == arg5 && arg0 == arg4) {
					return true;
				}

				if (arg3 == arg5 && arg0 + 1 == arg4 && (flags[arg5][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg0 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg3 == arg5 && arg0 + 1 == arg4 && (flags[arg5][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg0 - 1 == arg4 && (flags[arg5][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg5 && arg0 == arg4 && (flags[arg5][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(BIIIIII)Z")
	public boolean testWDecor(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg1 == arg2) {
			return true;
		}

		arg5 -= startX;
		arg1 -= startZ;
		arg0 -= startX;
		arg2 -= startZ;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg0 + 1 == arg5 && arg1 == arg2 && (flags[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg2 - 1 == arg1 && (flags[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 - 1 == arg5 && arg1 == arg2 && (flags[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg2 - 1 == arg1 && (flags[arg5][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg0 - 1 == arg5 && arg1 == arg2 && (flags[arg5][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg2 + 1 == arg1 && (flags[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 + 1 == arg5 && arg1 == arg2 && (flags[arg5][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg2 + 1 == arg1 && (flags[arg5][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg0 == arg5 && arg2 + 1 == arg1 && (flags[arg5][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg5 && arg2 - 1 == arg1 && (flags[arg5][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg5 && arg1 == arg2 && (flags[arg5][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg5 && arg1 == arg2 && (flags[arg5][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean testLoc(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg6 - 1;
		int var9 = arg1 + arg3 - 1;
		if (arg4 >= arg6 && arg4 <= var8 && arg2 >= arg1 && arg2 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg4 && arg2 >= arg1 && arg2 <= var9 && (flags[arg4 - startX][arg2 - startZ] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg4 && arg2 >= arg1 && arg2 <= var9 && (flags[arg4 - startX][arg2 - startZ] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg2 && arg4 >= arg6 && arg4 <= var8 && (flags[arg4 - startX][arg2 - startZ] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg4 >= arg6 && arg4 <= var8 && (flags[arg4 - startX][arg2 - startZ] & 0x20) == 0 && (arg5 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
