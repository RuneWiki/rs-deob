package deob;

@ObfuscatedName("fi")
public class class167 {

    @ObfuscatedName("fi.ae")
    public int field2231 = 0;

    @ObfuscatedName("fi.av")
    public int field2232 = 0;

    @ObfuscatedName("fi.am")
    public int field2233;

    @ObfuscatedName("fi.ax")
    public int field2226;

    @ObfuscatedName("fi.ah")
    public int[][] field2230;

    public class167(int arg0, int arg1) {
        this.field2233 = arg0;
        this.field2226 = arg1;
        this.field2230 = new int[this.field2233][this.field2226];
        this.method2904();
    }

    @ObfuscatedName("fi.n(I)V")
    public void method2904() {
        for (int var1 = 0; var1 < this.field2233; var1++) {
            for (int var2 = 0; var2 < this.field2226; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2233 - 5 || var2 >= this.field2226 - 5) {
                    this.field2230[var1][var2] = 16777215;
                } else {
                    this.field2230[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("fi.v(IIIIZB)V")
    public void method2897(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2231;
        int var7 = arg1 - this.field2232;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2891(var6, var7, 128);
                this.method2891(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2891(var6, var7, 2);
                this.method2891(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2891(var6, var7, 8);
                this.method2891(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2891(var6, var7, 32);
                this.method2891(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2891(var6, var7, 1);
                this.method2891(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2891(var6, var7, 4);
                this.method2891(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2891(var6, var7, 16);
                this.method2891(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2891(var6, var7, 64);
                this.method2891(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2891(var6, var7, 130);
                this.method2891(var6 - 1, var7, 8);
                this.method2891(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2891(var6, var7, 10);
                this.method2891(var6, var7 + 1, 32);
                this.method2891(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2891(var6, var7, 40);
                this.method2891(var6 + 1, var7, 128);
                this.method2891(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2891(var6, var7, 160);
                this.method2891(var6, var7 - 1, 2);
                this.method2891(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2891(var6, var7, 65536);
                this.method2891(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2891(var6, var7, 1024);
                this.method2891(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2891(var6, var7, 4096);
                this.method2891(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2891(var6, var7, 16384);
                this.method2891(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2891(var6, var7, 512);
                this.method2891(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2891(var6, var7, 2048);
                this.method2891(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2891(var6, var7, 8192);
                this.method2891(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2891(var6, var7, 32768);
                this.method2891(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2891(var6, var7, 66560);
            this.method2891(var6 - 1, var7, 4096);
            this.method2891(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2891(var6, var7, 5120);
            this.method2891(var6, var7 + 1, 16384);
            this.method2891(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2891(var6, var7, 20480);
            this.method2891(var6 + 1, var7, 65536);
            this.method2891(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2891(var6, var7, 81920);
            this.method2891(var6, var7 - 1, 1024);
            this.method2891(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fi.y(IIIIZB)V")
    public void method2888(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2231;
        int var8 = arg1 - this.field2232;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2233) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2226) {
                        this.method2891(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fi.r(IIS)V")
    public void method2889(int arg0, int arg1) {
        int var3 = arg0 - this.field2231;
        int var4 = arg1 - this.field2232;
        this.field2230[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("fi.h(III)V")
    public void method2890(int arg0, int arg1) {
        int var3 = arg0 - this.field2231;
        int var4 = arg1 - this.field2232;
        this.field2230[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fi.d(IIII)V")
    public void method2891(int arg0, int arg1, int arg2) {
        this.field2230[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fi.s(IIIIZI)V")
    public void method2892(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2231;
        int var7 = arg1 - this.field2232;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2906(var6, var7, 128);
                this.method2906(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2906(var6, var7, 2);
                this.method2906(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2906(var6, var7, 8);
                this.method2906(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2906(var6, var7, 32);
                this.method2906(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2906(var6, var7, 1);
                this.method2906(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2906(var6, var7, 4);
                this.method2906(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2906(var6, var7, 16);
                this.method2906(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2906(var6, var7, 64);
                this.method2906(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2906(var6, var7, 130);
                this.method2906(var6 - 1, var7, 8);
                this.method2906(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2906(var6, var7, 10);
                this.method2906(var6, var7 + 1, 32);
                this.method2906(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2906(var6, var7, 40);
                this.method2906(var6 + 1, var7, 128);
                this.method2906(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2906(var6, var7, 160);
                this.method2906(var6, var7 - 1, 2);
                this.method2906(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2906(var6, var7, 65536);
                this.method2906(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2906(var6, var7, 1024);
                this.method2906(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2906(var6, var7, 4096);
                this.method2906(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2906(var6, var7, 16384);
                this.method2906(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2906(var6, var7, 512);
                this.method2906(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2906(var6, var7, 2048);
                this.method2906(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2906(var6, var7, 8192);
                this.method2906(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2906(var6, var7, 32768);
                this.method2906(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2906(var6, var7, 66560);
            this.method2906(var6 - 1, var7, 4096);
            this.method2906(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2906(var6, var7, 5120);
            this.method2906(var6, var7 + 1, 16384);
            this.method2906(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2906(var6, var7, 20480);
            this.method2906(var6 + 1, var7, 65536);
            this.method2906(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2906(var6, var7, 81920);
            this.method2906(var6, var7 - 1, 1024);
            this.method2906(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fi.b(IIIIIZI)V")
    public void method2893(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2231;
        int var9 = arg1 - this.field2232;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2233) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2226) {
                        this.method2906(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fi.e(IIII)V")
    public void method2906(int arg0, int arg1, int arg2) {
        this.field2230[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fi.f(III)V")
    public void method2917(int arg0, int arg1) {
        int var3 = arg0 - this.field2231;
        int var4 = arg1 - this.field2232;
        this.field2230[var3][var4] &= 0xFFFBFFFF;
    }
}
