package deob;

@ObfuscatedName("jc")
public class class62 {

	@ObfuscatedName("jc.i")
	public int field939 = 0;

	@ObfuscatedName("jc.j")
	public int field940 = 0;

	@ObfuscatedName("jc.k")
	public int field941;

	@ObfuscatedName("jc.l")
	public int field942;

	@ObfuscatedName("jc.m")
	public int[][] field943;

	public class62(int arg0, int arg1) {
		field941 = arg1;
		field942 = arg0;
		field943 = new int[field941][field942];
		method361();
	}

	@ObfuscatedName("jc.a(I)V")
	public void method361() {
		for (int var1 = 0; var1 < field941; var1++) {
			for (int var2 = 0; var2 < field942; var2++) {
				if (var1 == 0 || var2 == 0 || field941 - 1 == var1 || field942 - 1 == var2) {
					field943[var1][var2] = 0xFFFFFF;
				} else {
					field943[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IZIIII)V")
	public void method362(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field939;
		arg0 -= field940;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method365(arg3, arg0, 128);
				method365(arg3 - 1, arg0, 8);
			}

			if (arg4 == 1) {
				method365(arg3, arg0, 2);
				method365(arg3, arg0 + 1, 32);
			}

			if (arg4 == 2) {
				method365(arg3, arg0, 8);
				method365(arg3 + 1, arg0, 128);
			}

			if (arg4 == 3) {
				method365(arg3, arg0, 32);
				method365(arg3, arg0 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method365(arg3, arg0, 1);
				method365(arg3 - 1, arg0 + 1, 16);
			}

			if (arg4 == 1) {
				method365(arg3, arg0, 4);
				method365(arg3 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method365(arg3, arg0, 16);
				method365(arg3 + 1, arg0 - 1, 1);
			}

			if (arg4 == 3) {
				method365(arg3, arg0, 64);
				method365(arg3 - 1, arg0 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method365(arg3, arg0, 130);
				method365(arg3 - 1, arg0, 8);
				method365(arg3, arg0 + 1, 32);
			}

			if (arg4 == 1) {
				method365(arg3, arg0, 10);
				method365(arg3, arg0 + 1, 32);
				method365(arg3 + 1, arg0, 128);
			}

			if (arg4 == 2) {
				method365(arg3, arg0, 40);
				method365(arg3 + 1, arg0, 128);
				method365(arg3, arg0 - 1, 2);
			}

			if (arg4 == 3) {
				method365(arg3, arg0, 160);
				method365(arg3, arg0 - 1, 2);
				method365(arg3 - 1, arg0, 8);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method365(arg3, arg0, 0x10000);
					method365(arg3 - 1, arg0, 4096);
				}

				if (arg4 == 1) {
					method365(arg3, arg0, 1024);
					method365(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 2) {
					method365(arg3, arg0, 4096);
					method365(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 3) {
					method365(arg3, arg0, 16384);
					method365(arg3, arg0 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method365(arg3, arg0, 512);
					method365(arg3 - 1, arg0 + 1, 8192);
				}

				if (arg4 == 1) {
					method365(arg3, arg0, 2048);
					method365(arg3 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method365(arg3, arg0, 8192);
					method365(arg3 + 1, arg0 - 1, 512);
				}

				if (arg4 == 3) {
					method365(arg3, arg0, 32768);
					method365(arg3 - 1, arg0 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method365(arg3, arg0, 66560);
					method365(arg3 - 1, arg0, 4096);
					method365(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 1) {
					method365(arg3, arg0, 5120);
					method365(arg3, arg0 + 1, 16384);
					method365(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 2) {
					method365(arg3, arg0, 20480);
					method365(arg3 + 1, arg0, 0x10000);
					method365(arg3, arg0 - 1, 1024);
				}

				if (arg4 == 3) {
					method365(arg3, arg0, 81920);
					method365(arg3, arg0 - 1, 1024);
					method365(arg3 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIIIIZI)V")
	public void method363(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg5 -= field939;
		arg1 -= field940;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg3;
			arg3 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg5; var9 < arg3 + arg5; var9++) {
			if (var9 >= 0 && var9 < field941) {
				for (int var10 = arg1; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field942) {
						method365(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(III)V")
	public void method364(int arg0, int arg1) {
		arg1 -= field939;
		arg0 -= field940;
		field943[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("jc.b(III)V")
	public void method365(int arg0, int arg1, int arg2) {
		field943[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("jc.a(IBIIZI)V")
	public void method366(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg0 -= field939;
		arg1 -= field940;
		if (arg4 == 0) {
			if (arg2 == 0) {
				method368(arg1, 128, arg0);
				method368(arg1, 8, arg0 - 1);
			}

			if (arg2 == 1) {
				method368(arg1, 2, arg0);
				method368(arg1 + 1, 32, arg0);
			}

			if (arg2 == 2) {
				method368(arg1, 8, arg0);
				method368(arg1, 128, arg0 + 1);
			}

			if (arg2 == 3) {
				method368(arg1, 32, arg0);
				method368(arg1 - 1, 2, arg0);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				method368(arg1, 1, arg0);
				method368(arg1 + 1, 16, arg0 - 1);
			}

			if (arg2 == 1) {
				method368(arg1, 4, arg0);
				method368(arg1 + 1, 64, arg0 + 1);
			}

			if (arg2 == 2) {
				method368(arg1, 16, arg0);
				method368(arg1 - 1, 1, arg0 + 1);
			}

			if (arg2 == 3) {
				method368(arg1, 64, arg0);
				method368(arg1 - 1, 4, arg0 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				method368(arg1, 130, arg0);
				method368(arg1, 8, arg0 - 1);
				method368(arg1 + 1, 32, arg0);
			}

			if (arg2 == 1) {
				method368(arg1, 10, arg0);
				method368(arg1 + 1, 32, arg0);
				method368(arg1, 128, arg0 + 1);
			}

			if (arg2 == 2) {
				method368(arg1, 40, arg0);
				method368(arg1, 128, arg0 + 1);
				method368(arg1 - 1, 2, arg0);
			}

			if (arg2 == 3) {
				method368(arg1, 160, arg0);
				method368(arg1 - 1, 2, arg0);
				method368(arg1, 8, arg0 - 1);
			}
		}

		if (arg3) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					method368(arg1, 0x10000, arg0);
					method368(arg1, 4096, arg0 - 1);
				}

				if (arg2 == 1) {
					method368(arg1, 1024, arg0);
					method368(arg1 + 1, 16384, arg0);
				}

				if (arg2 == 2) {
					method368(arg1, 4096, arg0);
					method368(arg1, 0x10000, arg0 + 1);
				}

				if (arg2 == 3) {
					method368(arg1, 16384, arg0);
					method368(arg1 - 1, 1024, arg0);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					method368(arg1, 512, arg0);
					method368(arg1 + 1, 8192, arg0 - 1);
				}

				if (arg2 == 1) {
					method368(arg1, 2048, arg0);
					method368(arg1 + 1, 32768, arg0 + 1);
				}

				if (arg2 == 2) {
					method368(arg1, 8192, arg0);
					method368(arg1 - 1, 512, arg0 + 1);
				}

				if (arg2 == 3) {
					method368(arg1, 32768, arg0);
					method368(arg1 - 1, 2048, arg0 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg2 == 0) {
					method368(arg1, 66560, arg0);
					method368(arg1, 4096, arg0 - 1);
					method368(arg1 + 1, 16384, arg0);
				}

				if (arg2 == 1) {
					method368(arg1, 5120, arg0);
					method368(arg1 + 1, 16384, arg0);
					method368(arg1, 0x10000, arg0 + 1);
				}

				if (arg2 == 2) {
					method368(arg1, 20480, arg0);
					method368(arg1, 0x10000, arg0 + 1);
					method368(arg1 - 1, 1024, arg0);
				}

				if (arg2 == 3) {
					method368(arg1, 81920, arg0);
					method368(arg1 - 1, 1024, arg0);
					method368(arg1, 4096, arg0 - 1);
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

		arg2 -= field939;
		arg3 -= field940;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg2; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field941) {
				for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field942) {
						method368(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("jc.a(IIII)V")
	public void method368(int arg0, int arg1, int arg2) {
		field943[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("jc.a(IIB)V")
	public void method369(int arg0, int arg1) {
		arg1 -= field939;
		arg0 -= field940;
		field943[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("jc.a(IIIBIII)Z")
	public boolean method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg2 == arg3) {
			return true;
		}

		arg5 -= field939;
		arg3 -= field940;
		arg1 -= field939;
		arg2 -= field940;
		if (arg0 == 0) {
			if (arg4 == 0) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field943[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field943[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg1 == arg5 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field943[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field943[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg1 == arg5 && arg2 - 1 == arg3) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg4 == 0) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field943[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field943[arg5][arg3] & 0x280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field943[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field943[arg5][arg3] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg1 == arg5 && arg2 + 1 == arg3 && (field943[arg5][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg2 - 1 == arg3 && (field943[arg5][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg5 && arg2 == arg3 && (field943[arg5][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIII)Z")
	public boolean method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg2 == arg5) {
			return true;
		}

		arg4 -= field939;
		arg2 -= field940;
		arg0 -= field939;
		arg5 -= field940;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg0 + 1 == arg4 && arg2 == arg5 && (field943[arg4][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg2 && (field943[arg4][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg4 && arg2 == arg5 && (field943[arg4][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg2 && (field943[arg4][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg4 && arg2 == arg5 && (field943[arg4][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg2 && (field943[arg4][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 + 1 == arg4 && arg2 == arg5 && (field943[arg4][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg2 && (field943[arg4][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg0 == arg4 && arg5 + 1 == arg2 && (field943[arg4][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg5 - 1 == arg2 && (field943[arg4][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg4 && arg2 == arg5 && (field943[arg4][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg4 && arg2 == arg5 && (field943[arg4][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("jc.a(IIIIIZII)Z")
	public boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg2 - 1;
		int var9 = arg0 + arg3 - 1;
		if (arg6 >= arg1 && arg6 <= var8 && arg4 >= arg3 && arg4 <= var9) {
			return true;
		}

		if (arg1 - 1 == arg6 && arg4 >= arg3 && arg4 <= var9 && (field943[arg6 - field939][arg4 - field940] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg4 >= arg3 && arg4 <= var9 && (field943[arg6 - field939][arg4 - field940] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg4 && arg6 >= arg1 && arg6 <= var8 && (field943[arg6 - field939][arg4 - field940] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg6 >= arg1 && arg6 <= var8 && (field943[arg6 - field939][arg4 - field940] & 0x20) == 0 && (arg5 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
