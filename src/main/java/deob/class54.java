package deob;

@ObfuscatedName("bc")
public class class54 {

	@ObfuscatedName("bc.e")
	public int field753 = 0;

	@ObfuscatedName("bc.f")
	public int field754 = 0;

	@ObfuscatedName("bc.g")
	public int field755;

	@ObfuscatedName("bc.h")
	public int field756;

	@ObfuscatedName("bc.i")
	public int[][] field757;

	public class54(int arg0, int arg1) {
		field755 = arg0;
		field756 = arg1;
		field757 = new int[field755][field756];
		method272();
	}

	@ObfuscatedName("bc.a(B)V")
	public void method272() {
		for (int var1 = 0; var1 < field755; var1++) {
			for (int var2 = 0; var2 < field756; var2++) {
				if (var1 == 0 || var2 == 0 || field755 - 1 == var1 || field756 - 1 == var2) {
					field757[var1][var2] = 0xFFFFFF;
				} else {
					field757[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("bc.a(IIIIIZ)V")
	public void method273(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg3 -= field753;
		arg1 -= field754;
		if (arg0 == 0) {
			if (arg2 == 0) {
				method276(arg3, arg1, 128);
				method276(arg3 - 1, arg1, 8);
			}

			if (arg2 == 1) {
				method276(arg3, arg1, 2);
				method276(arg3, arg1 + 1, 32);
			}

			if (arg2 == 2) {
				method276(arg3, arg1, 8);
				method276(arg3 + 1, arg1, 128);
			}

			if (arg2 == 3) {
				method276(arg3, arg1, 32);
				method276(arg3, arg1 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				method276(arg3, arg1, 1);
				method276(arg3 - 1, arg1 + 1, 16);
			}

			if (arg2 == 1) {
				method276(arg3, arg1, 4);
				method276(arg3 + 1, arg1 + 1, 64);
			}

			if (arg2 == 2) {
				method276(arg3, arg1, 16);
				method276(arg3 + 1, arg1 - 1, 1);
			}

			if (arg2 == 3) {
				method276(arg3, arg1, 64);
				method276(arg3 - 1, arg1 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				method276(arg3, arg1, 130);
				method276(arg3 - 1, arg1, 8);
				method276(arg3, arg1 + 1, 32);
			}

			if (arg2 == 1) {
				method276(arg3, arg1, 10);
				method276(arg3, arg1 + 1, 32);
				method276(arg3 + 1, arg1, 128);
			}

			if (arg2 == 2) {
				method276(arg3, arg1, 40);
				method276(arg3 + 1, arg1, 128);
				method276(arg3, arg1 - 1, 2);
			}

			if (arg2 == 3) {
				method276(arg3, arg1, 160);
				method276(arg3, arg1 - 1, 2);
				method276(arg3 - 1, arg1, 8);
			}
		}

		if (arg4) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					method276(arg3, arg1, 0x10000);
					method276(arg3 - 1, arg1, 4096);
				}

				if (arg2 == 1) {
					method276(arg3, arg1, 1024);
					method276(arg3, arg1 + 1, 16384);
				}

				if (arg2 == 2) {
					method276(arg3, arg1, 4096);
					method276(arg3 + 1, arg1, 0x10000);
				}

				if (arg2 == 3) {
					method276(arg3, arg1, 16384);
					method276(arg3, arg1 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					method276(arg3, arg1, 512);
					method276(arg3 - 1, arg1 + 1, 8192);
				}

				if (arg2 == 1) {
					method276(arg3, arg1, 2048);
					method276(arg3 + 1, arg1 + 1, 32768);
				}

				if (arg2 == 2) {
					method276(arg3, arg1, 8192);
					method276(arg3 + 1, arg1 - 1, 512);
				}

				if (arg2 == 3) {
					method276(arg3, arg1, 32768);
					method276(arg3 - 1, arg1 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg2 == 0) {
					method276(arg3, arg1, 66560);
					method276(arg3 - 1, arg1, 4096);
					method276(arg3, arg1 + 1, 16384);
				}

				if (arg2 == 1) {
					method276(arg3, arg1, 5120);
					method276(arg3, arg1 + 1, 16384);
					method276(arg3 + 1, arg1, 0x10000);
				}

				if (arg2 == 2) {
					method276(arg3, arg1, 20480);
					method276(arg3 + 1, arg1, 0x10000);
					method276(arg3, arg1 - 1, 1024);
				}

				if (arg2 == 3) {
					method276(arg3, arg1, 81920);
					method276(arg3, arg1 - 1, 1024);
					method276(arg3 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("bc.a(IIZIIII)V")
	public void method274(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg0 -= field753;
		arg4 -= field754;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg3;
			arg3 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field755) {
				for (int var10 = arg4; var10 < arg1 + arg4; var10++) {
					if (var10 >= 0 && var10 < field756) {
						method276(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("bc.a(III)V")
	public void method275(int arg0, int arg1) {
		arg1 -= field753;
		arg0 -= field754;
		field757[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("bc.b(III)V")
	public void method276(int arg0, int arg1, int arg2) {
		field757[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("bc.a(IIIZII)V")
	public void method277(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg0 -= field753;
		arg3 -= field754;
		if (arg4 == 0) {
			if (arg1 == 0) {
				method279(arg0, arg3, 128);
				method279(arg0 - 1, arg3, 8);
			}

			if (arg1 == 1) {
				method279(arg0, arg3, 2);
				method279(arg0, arg3 + 1, 32);
			}

			if (arg1 == 2) {
				method279(arg0, arg3, 8);
				method279(arg0 + 1, arg3, 128);
			}

			if (arg1 == 3) {
				method279(arg0, arg3, 32);
				method279(arg0, arg3 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg1 == 0) {
				method279(arg0, arg3, 1);
				method279(arg0 - 1, arg3 + 1, 16);
			}

			if (arg1 == 1) {
				method279(arg0, arg3, 4);
				method279(arg0 + 1, arg3 + 1, 64);
			}

			if (arg1 == 2) {
				method279(arg0, arg3, 16);
				method279(arg0 + 1, arg3 - 1, 1);
			}

			if (arg1 == 3) {
				method279(arg0, arg3, 64);
				method279(arg0 - 1, arg3 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				method279(arg0, arg3, 130);
				method279(arg0 - 1, arg3, 8);
				method279(arg0, arg3 + 1, 32);
			}

			if (arg1 == 1) {
				method279(arg0, arg3, 10);
				method279(arg0, arg3 + 1, 32);
				method279(arg0 + 1, arg3, 128);
			}

			if (arg1 == 2) {
				method279(arg0, arg3, 40);
				method279(arg0 + 1, arg3, 128);
				method279(arg0, arg3 - 1, 2);
			}

			if (arg1 == 3) {
				method279(arg0, arg3, 160);
				method279(arg0, arg3 - 1, 2);
				method279(arg0 - 1, arg3, 8);
			}
		}

		if (arg2) {
			if (arg4 == 0) {
				if (arg1 == 0) {
					method279(arg0, arg3, 0x10000);
					method279(arg0 - 1, arg3, 4096);
				}

				if (arg1 == 1) {
					method279(arg0, arg3, 1024);
					method279(arg0, arg3 + 1, 16384);
				}

				if (arg1 == 2) {
					method279(arg0, arg3, 4096);
					method279(arg0 + 1, arg3, 0x10000);
				}

				if (arg1 == 3) {
					method279(arg0, arg3, 16384);
					method279(arg0, arg3 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg1 == 0) {
					method279(arg0, arg3, 512);
					method279(arg0 - 1, arg3 + 1, 8192);
				}

				if (arg1 == 1) {
					method279(arg0, arg3, 2048);
					method279(arg0 + 1, arg3 + 1, 32768);
				}

				if (arg1 == 2) {
					method279(arg0, arg3, 8192);
					method279(arg0 + 1, arg3 - 1, 512);
				}

				if (arg1 == 3) {
					method279(arg0, arg3, 32768);
					method279(arg0 - 1, arg3 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg1 == 0) {
					method279(arg0, arg3, 66560);
					method279(arg0 - 1, arg3, 4096);
					method279(arg0, arg3 + 1, 16384);
				}

				if (arg1 == 1) {
					method279(arg0, arg3, 5120);
					method279(arg0, arg3 + 1, 16384);
					method279(arg0 + 1, arg3, 0x10000);
				}

				if (arg1 == 2) {
					method279(arg0, arg3, 20480);
					method279(arg0 + 1, arg3, 0x10000);
					method279(arg0, arg3 - 1, 1024);
				}

				if (arg1 == 3) {
					method279(arg0, arg3, 81920);
					method279(arg0, arg3 - 1, 1024);
					method279(arg0 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("bc.a(IIZIIIZ)V")
	public void method278(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg5 -= field753;
		arg0 -= field754;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg3;
			arg3 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg5; var9 < arg3 + arg5; var9++) {
			if (var9 >= 0 && var9 < field755) {
				for (int var10 = arg0; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field756) {
						method279(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("bc.a(IBII)V")
	public void method279(int arg0, int arg1, int arg2) {
		field757[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("bc.c(III)V")
	public void method280(int arg0, int arg1) {
		arg0 -= field753;
		arg1 -= field754;
		field757[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("bc.a(IIIIIII)Z")
	public boolean method281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 == arg5 && arg0 == arg3) {
			return true;
		}

		arg5 -= field753;
		arg0 -= field754;
		arg4 -= field753;
		arg3 -= field754;
		if (arg1 == 0) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg3 + 1 == arg0 && (field757[arg5][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 - 1 == arg0 && (field757[arg5][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 == arg5 && arg3 + 1 == arg0) {
					return true;
				}

				if (arg4 - 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 + 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg3 + 1 == arg0 && (field757[arg5][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 - 1 == arg0 && (field757[arg5][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 == arg5 && arg3 - 1 == arg0) {
					return true;
				}

				if (arg4 - 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg3 + 1 == arg0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 - 1 == arg0 && (field757[arg5][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 - 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 + 1 == arg0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg3 - 1 == arg0 && (field757[arg5][arg0] & 0x280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 - 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x280108) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 + 1 == arg0 && (field757[arg5][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg3 - 1 == arg0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 - 1 == arg5 && arg0 == arg3) {
					return true;
				}

				if (arg4 == arg5 && arg3 + 1 == arg0 && (field757[arg5][arg0] & 0x280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x280180) == 0) {
					return true;
				}

				if (arg4 == arg5 && arg3 - 1 == arg0) {
					return true;
				}
			}
		}

		if (arg1 == 9) {
			if (arg4 == arg5 && arg3 + 1 == arg0 && (field757[arg5][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg4 == arg5 && arg3 - 1 == arg0 && (field757[arg5][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg5 && arg0 == arg3 && (field757[arg5][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("bc.a(IIBIIII)Z")
	public boolean method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg1 == arg4) {
			return true;
		}

		arg2 -= field753;
		arg1 -= field754;
		arg0 -= field753;
		arg4 -= field754;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg0 + 1 == arg2 && arg1 == arg4 && (field757[arg2][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg4 - 1 == arg1 && (field757[arg2][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 - 1 == arg2 && arg1 == arg4 && (field757[arg2][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg4 - 1 == arg1 && (field757[arg2][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg0 - 1 == arg2 && arg1 == arg4 && (field757[arg2][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg4 + 1 == arg1 && (field757[arg2][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 + 1 == arg2 && arg1 == arg4 && (field757[arg2][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg4 + 1 == arg1 && (field757[arg2][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg0 == arg2 && arg4 + 1 == arg1 && (field757[arg2][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg4 - 1 == arg1 && (field757[arg2][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg2 && arg1 == arg4 && (field757[arg2][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg2 && arg1 == arg4 && (field757[arg2][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("bc.a(IIIIIIII)Z")
	public boolean method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg1 + arg4 - 1;
		int var9 = arg2 + arg3 - 1;
		if (arg5 >= arg4 && arg5 <= var8 && arg6 >= arg2 && arg6 <= var9) {
			return true;
		}

		if (arg4 - 1 == arg5 && arg6 >= arg2 && arg6 <= var9 && (field757[arg5 - field753][arg6 - field754] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg6 >= arg2 && arg6 <= var9 && (field757[arg5 - field753][arg6 - field754] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg2 - 1 == arg6 && arg5 >= arg4 && arg5 <= var8 && (field757[arg5 - field753][arg6 - field754] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg6 && arg5 >= arg4 && arg5 <= var8 && (field757[arg5 - field753][arg6 - field754] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
