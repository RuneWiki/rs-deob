package deob;

@ObfuscatedName("ac")
public class class53 {

	@ObfuscatedName("ac.g")
	public int field736 = 0;

	@ObfuscatedName("ac.h")
	public int field737 = 0;

	@ObfuscatedName("ac.i")
	public int field738;

	@ObfuscatedName("ac.j")
	public int field739;

	@ObfuscatedName("ac.k")
	public int[][] field740;

	public class53(int arg0, int arg1) {
		field738 = arg1;
		field739 = arg0;
		field740 = new int[field738][field739];
		method256();
	}

	@ObfuscatedName("ac.a(I)V")
	public void method256() {
		for (int var1 = 0; var1 < field738; var1++) {
			for (int var2 = 0; var2 < field739; var2++) {
				if (var1 == 0 || var2 == 0 || field738 - 1 == var1 || field739 - 1 == var2) {
					field740[var1][var2] = 0xFFFFFF;
				} else {
					field740[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("ac.a(IZIIII)V")
	public void method257(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg0 -= field736;
		arg3 -= field737;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method260(arg0, arg3, 128);
				method260(arg0 - 1, arg3, 8);
			}

			if (arg4 == 1) {
				method260(arg0, arg3, 2);
				method260(arg0, arg3 + 1, 32);
			}

			if (arg4 == 2) {
				method260(arg0, arg3, 8);
				method260(arg0 + 1, arg3, 128);
			}

			if (arg4 == 3) {
				method260(arg0, arg3, 32);
				method260(arg0, arg3 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method260(arg0, arg3, 1);
				method260(arg0 - 1, arg3 + 1, 16);
			}

			if (arg4 == 1) {
				method260(arg0, arg3, 4);
				method260(arg0 + 1, arg3 + 1, 64);
			}

			if (arg4 == 2) {
				method260(arg0, arg3, 16);
				method260(arg0 + 1, arg3 - 1, 1);
			}

			if (arg4 == 3) {
				method260(arg0, arg3, 64);
				method260(arg0 - 1, arg3 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method260(arg0, arg3, 130);
				method260(arg0 - 1, arg3, 8);
				method260(arg0, arg3 + 1, 32);
			}

			if (arg4 == 1) {
				method260(arg0, arg3, 10);
				method260(arg0, arg3 + 1, 32);
				method260(arg0 + 1, arg3, 128);
			}

			if (arg4 == 2) {
				method260(arg0, arg3, 40);
				method260(arg0 + 1, arg3, 128);
				method260(arg0, arg3 - 1, 2);
			}

			if (arg4 == 3) {
				method260(arg0, arg3, 160);
				method260(arg0, arg3 - 1, 2);
				method260(arg0 - 1, arg3, 8);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method260(arg0, arg3, 0x10000);
					method260(arg0 - 1, arg3, 4096);
				}

				if (arg4 == 1) {
					method260(arg0, arg3, 1024);
					method260(arg0, arg3 + 1, 16384);
				}

				if (arg4 == 2) {
					method260(arg0, arg3, 4096);
					method260(arg0 + 1, arg3, 0x10000);
				}

				if (arg4 == 3) {
					method260(arg0, arg3, 16384);
					method260(arg0, arg3 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method260(arg0, arg3, 512);
					method260(arg0 - 1, arg3 + 1, 8192);
				}

				if (arg4 == 1) {
					method260(arg0, arg3, 2048);
					method260(arg0 + 1, arg3 + 1, 32768);
				}

				if (arg4 == 2) {
					method260(arg0, arg3, 8192);
					method260(arg0 + 1, arg3 - 1, 512);
				}

				if (arg4 == 3) {
					method260(arg0, arg3, 32768);
					method260(arg0 - 1, arg3 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method260(arg0, arg3, 66560);
					method260(arg0 - 1, arg3, 4096);
					method260(arg0, arg3 + 1, 16384);
				}

				if (arg4 == 1) {
					method260(arg0, arg3, 5120);
					method260(arg0, arg3 + 1, 16384);
					method260(arg0 + 1, arg3, 0x10000);
				}

				if (arg4 == 2) {
					method260(arg0, arg3, 20480);
					method260(arg0 + 1, arg3, 0x10000);
					method260(arg0, arg3 - 1, 1024);
				}

				if (arg4 == 3) {
					method260(arg0, arg3, 81920);
					method260(arg0, arg3 - 1, 1024);
					method260(arg0 - 1, arg3, 4096);
				}
			}
		}
	}

	@ObfuscatedName("ac.a(ZIIIZII)V")
	public void method258(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg1 -= field736;
		arg2 -= field737;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg1; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field738) {
				for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field739) {
						method260(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ac.a(BII)V")
	public void method259(int arg0, int arg1) {
		arg1 -= field736;
		arg0 -= field737;
		field740[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("ac.a(III)V")
	public void method260(int arg0, int arg1, int arg2) {
		field740[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ac.a(ZIIIII)V")
	public void method261(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 -= field736;
		arg4 -= field737;
		if (arg3 == 0) {
			if (arg1 == 0) {
				method263(arg4, arg2, 128);
				method263(arg4, arg2 - 1, 8);
			}

			if (arg1 == 1) {
				method263(arg4, arg2, 2);
				method263(arg4 + 1, arg2, 32);
			}

			if (arg1 == 2) {
				method263(arg4, arg2, 8);
				method263(arg4, arg2 + 1, 128);
			}

			if (arg1 == 3) {
				method263(arg4, arg2, 32);
				method263(arg4 - 1, arg2, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				method263(arg4, arg2, 1);
				method263(arg4 + 1, arg2 - 1, 16);
			}

			if (arg1 == 1) {
				method263(arg4, arg2, 4);
				method263(arg4 + 1, arg2 + 1, 64);
			}

			if (arg1 == 2) {
				method263(arg4, arg2, 16);
				method263(arg4 - 1, arg2 + 1, 1);
			}

			if (arg1 == 3) {
				method263(arg4, arg2, 64);
				method263(arg4 - 1, arg2 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				method263(arg4, arg2, 130);
				method263(arg4, arg2 - 1, 8);
				method263(arg4 + 1, arg2, 32);
			}

			if (arg1 == 1) {
				method263(arg4, arg2, 10);
				method263(arg4 + 1, arg2, 32);
				method263(arg4, arg2 + 1, 128);
			}

			if (arg1 == 2) {
				method263(arg4, arg2, 40);
				method263(arg4, arg2 + 1, 128);
				method263(arg4 - 1, arg2, 2);
			}

			if (arg1 == 3) {
				method263(arg4, arg2, 160);
				method263(arg4 - 1, arg2, 2);
				method263(arg4, arg2 - 1, 8);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					method263(arg4, arg2, 0x10000);
					method263(arg4, arg2 - 1, 4096);
				}

				if (arg1 == 1) {
					method263(arg4, arg2, 1024);
					method263(arg4 + 1, arg2, 16384);
				}

				if (arg1 == 2) {
					method263(arg4, arg2, 4096);
					method263(arg4, arg2 + 1, 0x10000);
				}

				if (arg1 == 3) {
					method263(arg4, arg2, 16384);
					method263(arg4 - 1, arg2, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					method263(arg4, arg2, 512);
					method263(arg4 + 1, arg2 - 1, 8192);
				}

				if (arg1 == 1) {
					method263(arg4, arg2, 2048);
					method263(arg4 + 1, arg2 + 1, 32768);
				}

				if (arg1 == 2) {
					method263(arg4, arg2, 8192);
					method263(arg4 - 1, arg2 + 1, 512);
				}

				if (arg1 == 3) {
					method263(arg4, arg2, 32768);
					method263(arg4 - 1, arg2 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					method263(arg4, arg2, 66560);
					method263(arg4, arg2 - 1, 4096);
					method263(arg4 + 1, arg2, 16384);
				}

				if (arg1 == 1) {
					method263(arg4, arg2, 5120);
					method263(arg4 + 1, arg2, 16384);
					method263(arg4, arg2 + 1, 0x10000);
				}

				if (arg1 == 2) {
					method263(arg4, arg2, 20480);
					method263(arg4, arg2 + 1, 0x10000);
					method263(arg4 - 1, arg2, 1024);
				}

				if (arg1 == 3) {
					method263(arg4, arg2, 81920);
					method263(arg4 - 1, arg2, 1024);
					method263(arg4, arg2 - 1, 4096);
				}
			}
		}
	}

	@ObfuscatedName("ac.a(IZZIIII)V")
	public void method262(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg0 -= field736;
		arg5 -= field737;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg2;
			arg2 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field738) {
				for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field739) {
						method263(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ac.a(ZIII)V")
	public void method263(int arg0, int arg1, int arg2) {
		field740[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("ac.a(ZII)V")
	public void method264(int arg0, int arg1) {
		arg1 -= field736;
		arg0 -= field737;
		field740[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ac.a(IIZIIII)Z")
	public boolean method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg2 == arg3) {
			return true;
		}

		arg0 -= field736;
		arg2 -= field737;
		arg5 -= field736;
		arg3 -= field737;
		if (arg4 == 0) {
			if (arg1 == 0) {
				if (arg5 - 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2 && (field740[arg0][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2 && (field740[arg0][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg5 - 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg5 + 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2 && (field740[arg0][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2 && (field740[arg0][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 == arg5 && arg3 - 1 == arg2) {
					return true;
				}

				if (arg5 - 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg5 + 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg1 == 0) {
				if (arg5 - 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg5 + 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2 && (field740[arg0][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg5 - 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg5 + 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2 && (field740[arg0][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg5 - 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2 && (field740[arg0][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg5 - 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg2 && (field740[arg0][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg5 + 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg0 == arg5 && arg3 + 1 == arg2 && (field740[arg0][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg5 && arg3 - 1 == arg2 && (field740[arg0][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg0 && arg2 == arg3 && (field740[arg0][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ac.a(IIIIIII)Z")
	public boolean method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg1) {
			return true;
		}

		arg4 -= field736;
		arg1 -= field737;
		arg3 -= field736;
		arg0 -= field737;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg3 + 1 == arg4 && arg0 == arg1 && (field740[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg1 && (field740[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field740[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg1 && (field740[arg4][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field740[arg4][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg1 && (field740[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg3 + 1 == arg4 && arg0 == arg1 && (field740[arg4][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg1 && (field740[arg4][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg3 == arg4 && arg0 + 1 == arg1 && (field740[arg4][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg0 - 1 == arg1 && (field740[arg4][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg4 && arg0 == arg1 && (field740[arg4][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg4 && arg0 == arg1 && (field740[arg4][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ac.a(IIIIIIII)Z")
	public boolean method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg5 - 1;
		int var9 = arg0 + arg6 - 1;
		if (arg3 >= arg4 && arg3 <= var8 && arg1 >= arg6 && arg1 <= var9) {
			return true;
		}

		if (arg4 - 1 == arg3 && arg1 >= arg6 && arg1 <= var9 && (field740[arg3 - field736][arg1 - field737] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg1 >= arg6 && arg1 <= var9 && (field740[arg3 - field736][arg1 - field737] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg1 && arg3 >= arg4 && arg3 <= var8 && (field740[arg3 - field736][arg1 - field737] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg3 >= arg4 && arg3 <= var8 && (field740[arg3 - field736][arg1 - field737] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
