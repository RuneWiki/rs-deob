package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.f")
	public int field941 = 0;

	@ObfuscatedName("jc.g")
	public int field942 = 0;

	@ObfuscatedName("jc.h")
	public int field943;

	@ObfuscatedName("jc.i")
	public int field944;

	@ObfuscatedName("jc.j")
	public int[][] field945;

	public class62(int arg0, int arg1) {
		field943 = arg1;
		field944 = arg0;
		field945 = new int[field943][field944];
		method361();
	}

	@ObfuscatedName("jc.a(I)V")
	public void method361() {
		for (int var1 = 0; var1 < field943; var1++) {
			for (int var2 = 0; var2 < field944; var2++) {
				if (var1 == 0 || var2 == 0 || field943 - 1 == var1 || field944 - 1 == var2) {
					field945[var1][var2] = 0xFFFFFF;
				} else {
					field945[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIBZ)V")
	public void method362(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg2 -= field941;
		arg3 -= field942;
		if (arg1 == 0) {
			if (arg0 == 0) {
				method365(arg2, arg3, 128);
				method365(arg2 - 1, arg3, 8);
			}

			if (arg0 == 1) {
				method365(arg2, arg3, 2);
				method365(arg2, arg3 + 1, 32);
			}

			if (arg0 == 2) {
				method365(arg2, arg3, 8);
				method365(arg2 + 1, arg3, 128);
			}

			if (arg0 == 3) {
				method365(arg2, arg3, 32);
				method365(arg2, arg3 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg0 == 0) {
				method365(arg2, arg3, 1);
				method365(arg2 - 1, arg3 + 1, 16);
			}

			if (arg0 == 1) {
				method365(arg2, arg3, 4);
				method365(arg2 + 1, arg3 + 1, 64);
			}

			if (arg0 == 2) {
				method365(arg2, arg3, 16);
				method365(arg2 + 1, arg3 - 1, 1);
			}

			if (arg0 == 3) {
				method365(arg2, arg3, 64);
				method365(arg2 - 1, arg3 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg0 == 0) {
				method365(arg2, arg3, 130);
				method365(arg2 - 1, arg3, 8);
				method365(arg2, arg3 + 1, 32);
			}

			if (arg0 == 1) {
				method365(arg2, arg3, 10);
				method365(arg2, arg3 + 1, 32);
				method365(arg2 + 1, arg3, 128);
			}

			if (arg0 == 2) {
				method365(arg2, arg3, 40);
				method365(arg2 + 1, arg3, 128);
				method365(arg2, arg3 - 1, 2);
			}

			if (arg0 == 3) {
				method365(arg2, arg3, 160);
				method365(arg2, arg3 - 1, 2);
				method365(arg2 - 1, arg3, 8);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg0 == 0) {
					method365(arg2, arg3, 0x10000);
					method365(arg2 - 1, arg3, 4096);
				}

				if (arg0 == 1) {
					method365(arg2, arg3, 1024);
					method365(arg2, arg3 + 1, 16384);
				}

				if (arg0 == 2) {
					method365(arg2, arg3, 4096);
					method365(arg2 + 1, arg3, 0x10000);
				}

				if (arg0 == 3) {
					method365(arg2, arg3, 16384);
					method365(arg2, arg3 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg0 == 0) {
					method365(arg2, arg3, 512);
					method365(arg2 - 1, arg3 + 1, 8192);
				}

				if (arg0 == 1) {
					method365(arg2, arg3, 2048);
					method365(arg2 + 1, arg3 + 1, 32768);
				}

				if (arg0 == 2) {
					method365(arg2, arg3, 8192);
					method365(arg2 + 1, arg3 - 1, 512);
				}

				if (arg0 == 3) {
					method365(arg2, arg3, 32768);
					method365(arg2 - 1, arg3 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg0 == 0) {
					method365(arg2, arg3, 66560);
					method365(arg2 - 1, arg3, 4096);
					method365(arg2, arg3 + 1, 16384);
				}

				if (arg0 == 1) {
					method365(arg2, arg3, 5120);
					method365(arg2, arg3 + 1, 16384);
					method365(arg2 + 1, arg3, 0x10000);
				}

				if (arg0 == 2) {
					method365(arg2, arg3, 20480);
					method365(arg2 + 1, arg3, 0x10000);
					method365(arg2, arg3 - 1, 1024);
				}

				if (arg0 == 3) {
					method365(arg2, arg3, 81920);
					method365(arg2, arg3 - 1, 1024);
					method365(arg2 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIIIZ)V")
	public void method363(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg0 -= field941;
		arg2 -= field942;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg3;
			arg3 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field943) {
				for (int var10 = arg2; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field944) {
						method365(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void method364(int arg0, int arg1) {
		arg0 -= field941;
		arg1 -= field942;
		field945[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method365(int arg0, int arg1, int arg2) {
		field945[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IIIIZB)V")
	public void method366(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg2 -= field941;
		arg1 -= field942;
		if (arg3 == 0) {
			if (arg0 == 0) {
				method368(128, arg1, arg2);
				method368(8, arg1, arg2 - 1);
			}

			if (arg0 == 1) {
				method368(2, arg1, arg2);
				method368(32, arg1 + 1, arg2);
			}

			if (arg0 == 2) {
				method368(8, arg1, arg2);
				method368(128, arg1, arg2 + 1);
			}

			if (arg0 == 3) {
				method368(32, arg1, arg2);
				method368(2, arg1 - 1, arg2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				method368(1, arg1, arg2);
				method368(16, arg1 + 1, arg2 - 1);
			}

			if (arg0 == 1) {
				method368(4, arg1, arg2);
				method368(64, arg1 + 1, arg2 + 1);
			}

			if (arg0 == 2) {
				method368(16, arg1, arg2);
				method368(1, arg1 - 1, arg2 + 1);
			}

			if (arg0 == 3) {
				method368(64, arg1, arg2);
				method368(4, arg1 - 1, arg2 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg0 == 0) {
				method368(130, arg1, arg2);
				method368(8, arg1, arg2 - 1);
				method368(32, arg1 + 1, arg2);
			}

			if (arg0 == 1) {
				method368(10, arg1, arg2);
				method368(32, arg1 + 1, arg2);
				method368(128, arg1, arg2 + 1);
			}

			if (arg0 == 2) {
				method368(40, arg1, arg2);
				method368(128, arg1, arg2 + 1);
				method368(2, arg1 - 1, arg2);
			}

			if (arg0 == 3) {
				method368(160, arg1, arg2);
				method368(2, arg1 - 1, arg2);
				method368(8, arg1, arg2 - 1);
			}
		}

		if (arg4) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					method368(0x10000, arg1, arg2);
					method368(4096, arg1, arg2 - 1);
				}

				if (arg0 == 1) {
					method368(1024, arg1, arg2);
					method368(16384, arg1 + 1, arg2);
				}

				if (arg0 == 2) {
					method368(4096, arg1, arg2);
					method368(0x10000, arg1, arg2 + 1);
				}

				if (arg0 == 3) {
					method368(16384, arg1, arg2);
					method368(1024, arg1 - 1, arg2);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					method368(512, arg1, arg2);
					method368(8192, arg1 + 1, arg2 - 1);
				}

				if (arg0 == 1) {
					method368(2048, arg1, arg2);
					method368(32768, arg1 + 1, arg2 + 1);
				}

				if (arg0 == 2) {
					method368(8192, arg1, arg2);
					method368(512, arg1 - 1, arg2 + 1);
				}

				if (arg0 == 3) {
					method368(32768, arg1, arg2);
					method368(2048, arg1 - 1, arg2 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg0 == 0) {
					method368(66560, arg1, arg2);
					method368(4096, arg1, arg2 - 1);
					method368(16384, arg1 + 1, arg2);
				}

				if (arg0 == 1) {
					method368(5120, arg1, arg2);
					method368(16384, arg1 + 1, arg2);
					method368(0x10000, arg1, arg2 + 1);
				}

				if (arg0 == 2) {
					method368(20480, arg1, arg2);
					method368(0x10000, arg1, arg2 + 1);
					method368(1024, arg1 - 1, arg2);
				}

				if (arg0 == 3) {
					method368(81920, arg1, arg2);
					method368(1024, arg1 - 1, arg2);
					method368(4096, arg1, arg2 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IZIIIII)V")
	public void method367(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg4 -= field941;
		arg5 -= field942;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg2;
			arg2 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg4; var9 < arg2 + arg4; var9++) {
			if (var9 >= 0 && var9 < field943) {
				for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field944) {
						method368(var7, var10, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void method368(int arg0, int arg1, int arg2) {
		field945[arg2][arg1] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("jc.a(ZII)V")
	public void method369(int arg0, int arg1) {
		arg1 -= field941;
		arg0 -= field942;
		field945[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg3 && arg2 == arg4) {
			return true;
		}

		arg1 -= field941;
		arg4 -= field942;
		arg3 -= field941;
		arg2 -= field942;
		if (arg0 == 0) {
			if (arg5 == 0) {
				if (arg3 - 1 == arg1 && arg2 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg4 && (field945[arg1][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg4 && (field945[arg1][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 == arg3 && arg2 + 1 == arg4) {
					return true;
				}

				if (arg3 - 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 + 1 == arg1 && arg2 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg4 && (field945[arg1][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg4 && (field945[arg1][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 == arg3 && arg2 - 1 == arg4) {
					return true;
				}

				if (arg3 - 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg5 == 0) {
				if (arg3 - 1 == arg1 && arg2 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg4) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg4 && (field945[arg1][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg3 - 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg4) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg2 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg4 && (field945[arg1][arg4] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 - 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg4 && (field945[arg1][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg2 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg4) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg3 - 1 == arg1 && arg2 == arg4) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg4 && (field945[arg1][arg4] & 0x280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg1 == arg3 && arg2 + 1 == arg4 && (field945[arg1][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg3 && arg2 - 1 == arg4 && (field945[arg1][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg1 && arg2 == arg4 && (field945[arg1][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.b(IIIIIII)Z")
	public boolean method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg4 && arg2 == arg3) {
			return true;
		}

		arg4 -= field941;
		arg3 -= field942;
		arg1 -= field941;
		arg2 -= field942;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg1 + 1 == arg4 && arg2 == arg3 && (field945[arg4][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg3 && (field945[arg4][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 - 1 == arg4 && arg2 == arg3 && (field945[arg4][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 - 1 == arg3 && (field945[arg4][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg1 - 1 == arg4 && arg2 == arg3 && (field945[arg4][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg3 && (field945[arg4][arg3] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 + 1 == arg4 && arg2 == arg3 && (field945[arg4][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg2 + 1 == arg3 && (field945[arg4][arg3] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg1 == arg4 && arg2 + 1 == arg3 && (field945[arg4][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg4 && arg2 - 1 == arg3 && (field945[arg4][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg4 && arg2 == arg3 && (field945[arg4][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg4 && arg2 == arg3 && (field945[arg4][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIIII)Z")
	public boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg6 - 1;
		int var9 = arg1 + arg4 - 1;
		if (arg3 >= arg6 && arg3 <= var8 && arg5 >= arg1 && arg5 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg3 && arg5 >= arg1 && arg5 <= var9 && (field945[arg3 - field941][arg5 - field942] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg5 >= arg1 && arg5 <= var9 && (field945[arg3 - field941][arg5 - field942] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg5 && arg3 >= arg6 && arg3 <= var8 && (field945[arg3 - field941][arg5 - field942] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg5 && arg3 >= arg6 && arg3 <= var8 && (field945[arg3 - field941][arg5 - field942] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
