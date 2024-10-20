package deob;

@ObfuscatedName("fz")
public class class158 {

    @ObfuscatedName("fz.ag")
    public int field1898 = 0;

    @ObfuscatedName("fz.ax")
    public int field1905 = 0;

    @ObfuscatedName("fz.as")
    public int field1901;

    @ObfuscatedName("fz.aj")
    public int field1902;

    @ObfuscatedName("fz.am")
    public int[][] field1903;

    public class158(int arg0, int arg1) {
        this.field1901 = arg0;
        this.field1902 = arg1;
        this.field1903 = new int[this.field1901][this.field1902];
        this.method2910();
    }

    @ObfuscatedName("fz.v(I)V")
    public void method2910() {
        for (int var1 = 0; var1 < this.field1901; var1++) {
            for (int var2 = 0; var2 < this.field1902; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field1901 - 5 || var2 >= this.field1902 - 5) {
                    this.field1903[var1][var2] = 16777215;
                } else {
                    this.field1903[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("fz.n(IIIIZI)V")
    public void method2923(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1898;
        int var7 = arg1 - this.field1905;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2926(var6, var7, 128);
                this.method2926(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2926(var6, var7, 2);
                this.method2926(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2926(var6, var7, 8);
                this.method2926(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2926(var6, var7, 32);
                this.method2926(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2926(var6, var7, 1);
                this.method2926(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2926(var6, var7, 4);
                this.method2926(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2926(var6, var7, 16);
                this.method2926(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2926(var6, var7, 64);
                this.method2926(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2926(var6, var7, 130);
                this.method2926(var6 - 1, var7, 8);
                this.method2926(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2926(var6, var7, 10);
                this.method2926(var6, var7 + 1, 32);
                this.method2926(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2926(var6, var7, 40);
                this.method2926(var6 + 1, var7, 128);
                this.method2926(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2926(var6, var7, 160);
                this.method2926(var6, var7 - 1, 2);
                this.method2926(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2926(var6, var7, 65536);
                this.method2926(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2926(var6, var7, 1024);
                this.method2926(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2926(var6, var7, 4096);
                this.method2926(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2926(var6, var7, 16384);
                this.method2926(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2926(var6, var7, 512);
                this.method2926(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2926(var6, var7, 2048);
                this.method2926(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2926(var6, var7, 8192);
                this.method2926(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2926(var6, var7, 32768);
                this.method2926(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2926(var6, var7, 66560);
            this.method2926(var6 - 1, var7, 4096);
            this.method2926(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2926(var6, var7, 5120);
            this.method2926(var6, var7 + 1, 16384);
            this.method2926(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2926(var6, var7, 20480);
            this.method2926(var6 + 1, var7, 65536);
            this.method2926(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2926(var6, var7, 81920);
            this.method2926(var6, var7 - 1, 1024);
            this.method2926(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fz.f(IIIIZI)V")
    public void method2912(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field1898;
        int var8 = arg1 - this.field1905;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field1901) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field1902) {
                        this.method2926(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fz.y(III)V")
    public void method2941(int arg0, int arg1) {
        int var3 = arg0 - this.field1898;
        int var4 = arg1 - this.field1905;
        this.field1903[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("fz.p(III)V")
    public void method2924(int arg0, int arg1) {
        int var3 = arg0 - this.field1898;
        int var4 = arg1 - this.field1905;
        this.field1903[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fz.j(IIII)V")
    public void method2926(int arg0, int arg1, int arg2) {
        this.field1903[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fz.r(IIIIZI)V")
    public void method2915(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1898;
        int var7 = arg1 - this.field1905;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2917(var6, var7, 128);
                this.method2917(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2917(var6, var7, 2);
                this.method2917(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2917(var6, var7, 8);
                this.method2917(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2917(var6, var7, 32);
                this.method2917(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2917(var6, var7, 1);
                this.method2917(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2917(var6, var7, 4);
                this.method2917(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2917(var6, var7, 16);
                this.method2917(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2917(var6, var7, 64);
                this.method2917(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2917(var6, var7, 130);
                this.method2917(var6 - 1, var7, 8);
                this.method2917(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2917(var6, var7, 10);
                this.method2917(var6, var7 + 1, 32);
                this.method2917(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2917(var6, var7, 40);
                this.method2917(var6 + 1, var7, 128);
                this.method2917(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2917(var6, var7, 160);
                this.method2917(var6, var7 - 1, 2);
                this.method2917(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2917(var6, var7, 65536);
                this.method2917(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2917(var6, var7, 1024);
                this.method2917(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2917(var6, var7, 4096);
                this.method2917(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2917(var6, var7, 16384);
                this.method2917(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2917(var6, var7, 512);
                this.method2917(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2917(var6, var7, 2048);
                this.method2917(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2917(var6, var7, 8192);
                this.method2917(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2917(var6, var7, 32768);
                this.method2917(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2917(var6, var7, 66560);
            this.method2917(var6 - 1, var7, 4096);
            this.method2917(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2917(var6, var7, 5120);
            this.method2917(var6, var7 + 1, 16384);
            this.method2917(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2917(var6, var7, 20480);
            this.method2917(var6 + 1, var7, 65536);
            this.method2917(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2917(var6, var7, 81920);
            this.method2917(var6, var7 - 1, 1024);
            this.method2917(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fz.b(IIIIIZI)V")
    public void method2916(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field1898;
        int var9 = arg1 - this.field1905;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field1901) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1902) {
                        this.method2917(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fz.d(IIII)V")
    public void method2917(int arg0, int arg1, int arg2) {
        this.field1903[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fz.s(III)V")
    public void method2909(int arg0, int arg1) {
        int var3 = arg0 - this.field1898;
        int var4 = arg1 - this.field1905;
        this.field1903[var3][var4] &= 0xFFFBFFFF;
    }
}
