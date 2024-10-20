package deob;

@ObfuscatedName("fl")
public class class159 {

    @ObfuscatedName("fl.ag")
    public int field1910 = 0;

    @ObfuscatedName("fl.ab")
    public int field1909 = 0;

    @ObfuscatedName("fl.aq")
    public int field1898;

    @ObfuscatedName("fl.ae")
    public int field1911;

    @ObfuscatedName("fl.ao")
    public int[][] field1912;

    public class159(int arg0, int arg1) {
        this.field1898 = arg0;
        this.field1911 = arg1;
        this.field1912 = new int[this.field1898][this.field1911];
        this.method2894();
    }

    @ObfuscatedName("fl.f(I)V")
    public void method2894() {
        for (int var1 = 0; var1 < this.field1898; var1++) {
            for (int var2 = 0; var2 < this.field1911; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field1898 - 5 || var2 >= this.field1911 - 5) {
                    this.field1912[var1][var2] = 16777215;
                } else {
                    this.field1912[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("fl.e(IIIIZB)V")
    public void method2903(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1910;
        int var7 = arg1 - this.field1909;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2933(var6, var7, 128);
                this.method2933(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2933(var6, var7, 2);
                this.method2933(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2933(var6, var7, 8);
                this.method2933(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2933(var6, var7, 32);
                this.method2933(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2933(var6, var7, 1);
                this.method2933(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2933(var6, var7, 4);
                this.method2933(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2933(var6, var7, 16);
                this.method2933(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2933(var6, var7, 64);
                this.method2933(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2933(var6, var7, 130);
                this.method2933(var6 - 1, var7, 8);
                this.method2933(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2933(var6, var7, 10);
                this.method2933(var6, var7 + 1, 32);
                this.method2933(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2933(var6, var7, 40);
                this.method2933(var6 + 1, var7, 128);
                this.method2933(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2933(var6, var7, 160);
                this.method2933(var6, var7 - 1, 2);
                this.method2933(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2933(var6, var7, 65536);
                this.method2933(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2933(var6, var7, 1024);
                this.method2933(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2933(var6, var7, 4096);
                this.method2933(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2933(var6, var7, 16384);
                this.method2933(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2933(var6, var7, 512);
                this.method2933(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2933(var6, var7, 2048);
                this.method2933(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2933(var6, var7, 8192);
                this.method2933(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2933(var6, var7, 32768);
                this.method2933(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2933(var6, var7, 66560);
            this.method2933(var6 - 1, var7, 4096);
            this.method2933(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2933(var6, var7, 5120);
            this.method2933(var6, var7 + 1, 16384);
            this.method2933(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2933(var6, var7, 20480);
            this.method2933(var6 + 1, var7, 65536);
            this.method2933(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2933(var6, var7, 81920);
            this.method2933(var6, var7 - 1, 1024);
            this.method2933(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fl.v(IIIIZB)V")
    public void method2896(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field1910;
        int var8 = arg1 - this.field1909;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field1898) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field1911) {
                        this.method2933(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fl.y(III)V")
    public void method2934(int arg0, int arg1) {
        int var3 = arg0 - this.field1910;
        int var4 = arg1 - this.field1909;
        this.field1912[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("fl.j(III)V")
    public void method2898(int arg0, int arg1) {
        int var3 = arg0 - this.field1910;
        int var4 = arg1 - this.field1909;
        this.field1912[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fl.o(IIIB)V")
    public void method2933(int arg0, int arg1, int arg2) {
        this.field1912[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fl.m(IIIIZI)V")
    public void method2904(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1910;
        int var7 = arg1 - this.field1909;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2921(var6, var7, 128);
                this.method2921(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2921(var6, var7, 2);
                this.method2921(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2921(var6, var7, 8);
                this.method2921(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2921(var6, var7, 32);
                this.method2921(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2921(var6, var7, 1);
                this.method2921(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2921(var6, var7, 4);
                this.method2921(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2921(var6, var7, 16);
                this.method2921(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2921(var6, var7, 64);
                this.method2921(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2921(var6, var7, 130);
                this.method2921(var6 - 1, var7, 8);
                this.method2921(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2921(var6, var7, 10);
                this.method2921(var6, var7 + 1, 32);
                this.method2921(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2921(var6, var7, 40);
                this.method2921(var6 + 1, var7, 128);
                this.method2921(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2921(var6, var7, 160);
                this.method2921(var6, var7 - 1, 2);
                this.method2921(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2921(var6, var7, 65536);
                this.method2921(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2921(var6, var7, 1024);
                this.method2921(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2921(var6, var7, 4096);
                this.method2921(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2921(var6, var7, 16384);
                this.method2921(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2921(var6, var7, 512);
                this.method2921(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2921(var6, var7, 2048);
                this.method2921(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2921(var6, var7, 8192);
                this.method2921(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2921(var6, var7, 32768);
                this.method2921(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2921(var6, var7, 66560);
            this.method2921(var6 - 1, var7, 4096);
            this.method2921(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2921(var6, var7, 5120);
            this.method2921(var6, var7 + 1, 16384);
            this.method2921(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2921(var6, var7, 20480);
            this.method2921(var6 + 1, var7, 65536);
            this.method2921(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2921(var6, var7, 81920);
            this.method2921(var6, var7 - 1, 1024);
            this.method2921(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fl.r(IIIIIZI)V")
    public void method2901(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field1910;
        int var9 = arg1 - this.field1909;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field1898) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1911) {
                        this.method2921(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fl.h(IIII)V")
    public void method2921(int arg0, int arg1, int arg2) {
        this.field1912[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fl.d(III)V")
    public void method2893(int arg0, int arg1) {
        int var3 = arg0 - this.field1910;
        int var4 = arg1 - this.field1909;
        this.field1912[var3][var4] &= 0xFFFBFFFF;
    }
}
