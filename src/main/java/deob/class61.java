package deob;

@ObfuscatedName("ic")
public class class61 {

	@ObfuscatedName("ic.h")
	public int field907 = 0;

	@ObfuscatedName("ic.i")
	public int field908 = 0;

	@ObfuscatedName("ic.j")
	public int field909;

	@ObfuscatedName("ic.k")
	public int field910;

	@ObfuscatedName("ic.l")
	public int[][] field911;

	public class61(int arg0, int arg1) {
		field909 = arg0;
		field910 = arg1;
		field911 = new int[field909][field910];
		method346();
	}

	@ObfuscatedName("ic.a(B)V")
	public void method346() {
		for (int var1 = 0; var1 < field909; var1++) {
			for (int var2 = 0; var2 < field910; var2++) {
				if (var1 == 0 || var2 == 0 || field909 - 1 == var1 || field910 - 1 == var2) {
					field911[var1][var2] = 0xFFFFFF;
				} else {
					field911[var1][var2] = 0;
				}
			}
		}
	}

	@ObfuscatedName("ic.a(IIZIII)V")
	public void method347(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg4 -= field907;
		arg2 -= field908;
		if (arg3 == 0) {
			if (arg0 == 0) {
				method350(arg4, arg2, 128);
				method350(arg4 - 1, arg2, 8);
			}

			if (arg0 == 1) {
				method350(arg4, arg2, 2);
				method350(arg4, arg2 + 1, 32);
			}

			if (arg0 == 2) {
				method350(arg4, arg2, 8);
				method350(arg4 + 1, arg2, 128);
			}

			if (arg0 == 3) {
				method350(arg4, arg2, 32);
				method350(arg4, arg2 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				method350(arg4, arg2, 1);
				method350(arg4 - 1, arg2 + 1, 16);
			}

			if (arg0 == 1) {
				method350(arg4, arg2, 4);
				method350(arg4 + 1, arg2 + 1, 64);
			}

			if (arg0 == 2) {
				method350(arg4, arg2, 16);
				method350(arg4 + 1, arg2 - 1, 1);
			}

			if (arg0 == 3) {
				method350(arg4, arg2, 64);
				method350(arg4 - 1, arg2 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg0 == 0) {
				method350(arg4, arg2, 130);
				method350(arg4 - 1, arg2, 8);
				method350(arg4, arg2 + 1, 32);
			}

			if (arg0 == 1) {
				method350(arg4, arg2, 10);
				method350(arg4, arg2 + 1, 32);
				method350(arg4 + 1, arg2, 128);
			}

			if (arg0 == 2) {
				method350(arg4, arg2, 40);
				method350(arg4 + 1, arg2, 128);
				method350(arg4, arg2 - 1, 2);
			}

			if (arg0 == 3) {
				method350(arg4, arg2, 160);
				method350(arg4, arg2 - 1, 2);
				method350(arg4 - 1, arg2, 8);
			}
		}

		if (arg1) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					method350(arg4, arg2, 0x10000);
					method350(arg4 - 1, arg2, 4096);
				}

				if (arg0 == 1) {
					method350(arg4, arg2, 1024);
					method350(arg4, arg2 + 1, 16384);
				}

				if (arg0 == 2) {
					method350(arg4, arg2, 4096);
					method350(arg4 + 1, arg2, 0x10000);
				}

				if (arg0 == 3) {
					method350(arg4, arg2, 16384);
					method350(arg4, arg2 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					method350(arg4, arg2, 512);
					method350(arg4 - 1, arg2 + 1, 8192);
				}

				if (arg0 == 1) {
					method350(arg4, arg2, 2048);
					method350(arg4 + 1, arg2 + 1, 32768);
				}

				if (arg0 == 2) {
					method350(arg4, arg2, 8192);
					method350(arg4 + 1, arg2 - 1, 512);
				}

				if (arg0 == 3) {
					method350(arg4, arg2, 32768);
					method350(arg4 - 1, arg2 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg0 == 0) {
					method350(arg4, arg2, 66560);
					method350(arg4 - 1, arg2, 4096);
					method350(arg4, arg2 + 1, 16384);
				}

				if (arg0 == 1) {
					method350(arg4, arg2, 5120);
					method350(arg4, arg2 + 1, 16384);
					method350(arg4 + 1, arg2, 0x10000);
				}

				if (arg0 == 2) {
					method350(arg4, arg2, 20480);
					method350(arg4 + 1, arg2, 0x10000);
					method350(arg4, arg2 - 1, 1024);
				}

				if (arg0 == 3) {
					method350(arg4, arg2, 81920);
					method350(arg4, arg2 - 1, 1024);
					method350(arg4 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ic.a(ZIIZIII)V")
	public void method348(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg4 -= field907;
		arg2 -= field908;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg5;
			arg5 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg4; var9 < arg4 + arg5; var9++) {
			if (var9 >= 0 && var9 < field909) {
				for (int var10 = arg2; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field910) {
						method350(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("ic.a(IBI)V")
	public void method349(int arg0, int arg1) {
		arg1 -= field907;
		arg0 -= field908;
		field911[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("ic.a(III)V")
	public void method350(int arg0, int arg1, int arg2) {
		field911[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("ic.a(ZIIZII)V")
	public void method351(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field907;
		arg4 -= field908;
		if (arg2 == 0) {
			if (arg1 == 0) {
				method353(arg4, 128, arg3);
				method353(arg4, 8, arg3 - 1);
			}

			if (arg1 == 1) {
				method353(arg4, 2, arg3);
				method353(arg4 + 1, 32, arg3);
			}

			if (arg1 == 2) {
				method353(arg4, 8, arg3);
				method353(arg4, 128, arg3 + 1);
			}

			if (arg1 == 3) {
				method353(arg4, 32, arg3);
				method353(arg4 - 1, 2, arg3);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg1 == 0) {
				method353(arg4, 1, arg3);
				method353(arg4 + 1, 16, arg3 - 1);
			}

			if (arg1 == 1) {
				method353(arg4, 4, arg3);
				method353(arg4 + 1, 64, arg3 + 1);
			}

			if (arg1 == 2) {
				method353(arg4, 16, arg3);
				method353(arg4 - 1, 1, arg3 + 1);
			}

			if (arg1 == 3) {
				method353(arg4, 64, arg3);
				method353(arg4 - 1, 4, arg3 - 1);
			}
		}

		if (arg2 == 2) {
			if (arg1 == 0) {
				method353(arg4, 130, arg3);
				method353(arg4, 8, arg3 - 1);
				method353(arg4 + 1, 32, arg3);
			}

			if (arg1 == 1) {
				method353(arg4, 10, arg3);
				method353(arg4 + 1, 32, arg3);
				method353(arg4, 128, arg3 + 1);
			}

			if (arg1 == 2) {
				method353(arg4, 40, arg3);
				method353(arg4, 128, arg3 + 1);
				method353(arg4 - 1, 2, arg3);
			}

			if (arg1 == 3) {
				method353(arg4, 160, arg3);
				method353(arg4 - 1, 2, arg3);
				method353(arg4, 8, arg3 - 1);
			}
		}

		if (arg0) {
			if (arg2 == 0) {
				if (arg1 == 0) {
					method353(arg4, 0x10000, arg3);
					method353(arg4, 4096, arg3 - 1);
				}

				if (arg1 == 1) {
					method353(arg4, 1024, arg3);
					method353(arg4 + 1, 16384, arg3);
				}

				if (arg1 == 2) {
					method353(arg4, 4096, arg3);
					method353(arg4, 0x10000, arg3 + 1);
				}

				if (arg1 == 3) {
					method353(arg4, 16384, arg3);
					method353(arg4 - 1, 1024, arg3);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg1 == 0) {
					method353(arg4, 512, arg3);
					method353(arg4 + 1, 8192, arg3 - 1);
				}

				if (arg1 == 1) {
					method353(arg4, 2048, arg3);
					method353(arg4 + 1, 32768, arg3 + 1);
				}

				if (arg1 == 2) {
					method353(arg4, 8192, arg3);
					method353(arg4 - 1, 512, arg3 + 1);
				}

				if (arg1 == 3) {
					method353(arg4, 32768, arg3);
					method353(arg4 - 1, 2048, arg3 - 1);
				}
			}

			if (arg2 == 2) {
				if (arg1 == 0) {
					method353(arg4, 66560, arg3);
					method353(arg4, 4096, arg3 - 1);
					method353(arg4 + 1, 16384, arg3);
				}

				if (arg1 == 1) {
					method353(arg4, 5120, arg3);
					method353(arg4 + 1, 16384, arg3);
					method353(arg4, 0x10000, arg3 + 1);
				}

				if (arg1 == 2) {
					method353(arg4, 20480, arg3);
					method353(arg4, 0x10000, arg3 + 1);
					method353(arg4 - 1, 1024, arg3);
				}

				if (arg1 == 3) {
					method353(arg4, 81920, arg3);
					method353(arg4 - 1, 1024, arg3);
					method353(arg4, 4096, arg3 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("ic.a(ZIIIIII)V")
	public void method352(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg1 -= field907;
		arg2 -= field908;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg3;
			arg3 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field909) {
				for (int var10 = arg2; var10 < arg2 + arg4; var10++) {
					if (var10 >= 0 && var10 < field910) {
						method353(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("ic.a(IIII)V")
	public void method353(int arg0, int arg1, int arg2) {
		field911[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("ic.b(III)V")
	public void method354(int arg0, int arg1) {
		arg1 -= field907;
		arg0 -= field908;
		field911[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("ic.a(IIIIIII)Z")
	public boolean method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg4 && arg2 == arg3) {
			return true;
		}

		arg4 -= field907;
		arg2 -= field908;
		arg1 -= field907;
		arg3 -= field908;
		if (arg0 == 0) {
			if (arg5 == 0) {
				if (arg1 - 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2 && (field911[arg4][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2 && (field911[arg4][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 == arg4 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg1 + 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2 && (field911[arg4][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2 && (field911[arg4][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 == arg4 && arg3 - 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg5 == 0) {
				if (arg1 - 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2 && (field911[arg4][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 - 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2 && (field911[arg4][arg2] & 0x280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg1 - 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2 && (field911[arg4][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 - 1 == arg4 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg2 && (field911[arg4][arg2] & 0x280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg1 == arg4 && arg3 + 1 == arg2 && (field911[arg4][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg4 && arg3 - 1 == arg2 && (field911[arg4][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg4 && arg2 == arg3 && (field911[arg4][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ic.b(IIIIIII)Z")
	public boolean method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg3 && arg1 == arg4) {
			return true;
		}

		arg3 -= field907;
		arg1 -= field908;
		arg2 -= field907;
		arg4 -= field908;
		if (arg5 == 6 || arg5 == 7) {
			if (arg5 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg2 + 1 == arg3 && arg1 == arg4 && (field911[arg3][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1 && (field911[arg3][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg2 - 1 == arg3 && arg1 == arg4 && (field911[arg3][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1 && (field911[arg3][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg2 - 1 == arg3 && arg1 == arg4 && (field911[arg3][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1 && (field911[arg3][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg2 + 1 == arg3 && arg1 == arg4 && (field911[arg3][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1 && (field911[arg3][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 8) {
			if (arg2 == arg3 && arg4 + 1 == arg1 && (field911[arg3][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg3 && arg4 - 1 == arg1 && (field911[arg3][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg3 && arg1 == arg4 && (field911[arg3][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg3 && arg1 == arg4 && (field911[arg3][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ic.a(IIIIIIII)Z")
	public boolean method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg3 - 1;
		int var9 = arg0 + arg1 - 1;
		if (arg4 >= arg3 && arg4 <= var8 && arg6 >= arg1 && arg6 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg4 && arg6 >= arg1 && arg6 <= var9 && (field911[arg4 - field907][arg6 - field908] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg4 && arg6 >= arg1 && arg6 <= var9 && (field911[arg4 - field907][arg6 - field908] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg6 && arg4 >= arg3 && arg4 <= var8 && (field911[arg4 - field907][arg6 - field908] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg6 && arg4 >= arg3 && arg4 <= var8 && (field911[arg4 - field907][arg6 - field908] & 0x20) == 0 && (arg5 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
