package deob;

@ObfuscatedName("fy")
public class class160 {

    @ObfuscatedName("fy.ax")
    public int field1885 = 0;

    @ObfuscatedName("fy.au")
    public int field1888 = 0;

    @ObfuscatedName("fy.av")
    public int field1887;

    @ObfuscatedName("fy.as")
    public int field1881;

    @ObfuscatedName("fy.ao")
    public int[][] field1889;

    public class160(int arg0, int arg1) {
        this.field1887 = arg0;
        this.field1881 = arg1;
        this.field1889 = new int[this.field1887][this.field1881];
        this.method2851();
    }

    @ObfuscatedName("fy.s(I)V")
    public void method2851() {
        for (int var1 = 0; var1 < this.field1887; var1++) {
            for (int var2 = 0; var2 < this.field1881; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field1887 - 5 || var2 >= this.field1881 - 5) {
                    this.field1889[var1][var2] = 16777215;
                } else {
                    this.field1889[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("fy.t(IIIIZI)V")
    public void method2852(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1885;
        int var7 = arg1 - this.field1888;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2856(var6, var7, 128);
                this.method2856(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2856(var6, var7, 2);
                this.method2856(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2856(var6, var7, 8);
                this.method2856(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2856(var6, var7, 32);
                this.method2856(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2856(var6, var7, 1);
                this.method2856(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2856(var6, var7, 4);
                this.method2856(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2856(var6, var7, 16);
                this.method2856(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2856(var6, var7, 64);
                this.method2856(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2856(var6, var7, 130);
                this.method2856(var6 - 1, var7, 8);
                this.method2856(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2856(var6, var7, 10);
                this.method2856(var6, var7 + 1, 32);
                this.method2856(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2856(var6, var7, 40);
                this.method2856(var6 + 1, var7, 128);
                this.method2856(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2856(var6, var7, 160);
                this.method2856(var6, var7 - 1, 2);
                this.method2856(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2856(var6, var7, 65536);
                this.method2856(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2856(var6, var7, 1024);
                this.method2856(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2856(var6, var7, 4096);
                this.method2856(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2856(var6, var7, 16384);
                this.method2856(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2856(var6, var7, 512);
                this.method2856(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2856(var6, var7, 2048);
                this.method2856(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2856(var6, var7, 8192);
                this.method2856(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2856(var6, var7, 32768);
                this.method2856(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2856(var6, var7, 66560);
            this.method2856(var6 - 1, var7, 4096);
            this.method2856(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2856(var6, var7, 5120);
            this.method2856(var6, var7 + 1, 16384);
            this.method2856(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2856(var6, var7, 20480);
            this.method2856(var6 + 1, var7, 65536);
            this.method2856(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2856(var6, var7, 81920);
            this.method2856(var6, var7 - 1, 1024);
            this.method2856(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fy.v(IIIIZI)V")
    public void method2883(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field1885;
        int var8 = arg1 - this.field1888;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field1887) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field1881) {
                        this.method2856(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fy.j(IIB)V")
    public void method2850(int arg0, int arg1) {
        int var3 = arg0 - this.field1885;
        int var4 = arg1 - this.field1888;
        this.field1889[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("fy.l(III)V")
    public void method2877(int arg0, int arg1) {
        int var3 = arg0 - this.field1885;
        int var4 = arg1 - this.field1888;
        this.field1889[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fy.n(IIIB)V")
    public void method2856(int arg0, int arg1, int arg2) {
        this.field1889[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fy.w(IIIIZI)V")
    public void method2857(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field1885;
        int var7 = arg1 - this.field1888;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2859(var6, var7, 128);
                this.method2859(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method2859(var6, var7, 2);
                this.method2859(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method2859(var6, var7, 8);
                this.method2859(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method2859(var6, var7, 32);
                this.method2859(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2859(var6, var7, 1);
                this.method2859(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method2859(var6, var7, 4);
                this.method2859(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2859(var6, var7, 16);
                this.method2859(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method2859(var6, var7, 64);
                this.method2859(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method2859(var6, var7, 130);
                this.method2859(var6 - 1, var7, 8);
                this.method2859(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method2859(var6, var7, 10);
                this.method2859(var6, var7 + 1, 32);
                this.method2859(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method2859(var6, var7, 40);
                this.method2859(var6 + 1, var7, 128);
                this.method2859(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method2859(var6, var7, 160);
                this.method2859(var6, var7 - 1, 2);
                this.method2859(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method2859(var6, var7, 65536);
                this.method2859(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method2859(var6, var7, 1024);
                this.method2859(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method2859(var6, var7, 4096);
                this.method2859(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method2859(var6, var7, 16384);
                this.method2859(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method2859(var6, var7, 512);
                this.method2859(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method2859(var6, var7, 2048);
                this.method2859(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method2859(var6, var7, 8192);
                this.method2859(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method2859(var6, var7, 32768);
                this.method2859(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2859(var6, var7, 66560);
            this.method2859(var6 - 1, var7, 4096);
            this.method2859(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method2859(var6, var7, 5120);
            this.method2859(var6, var7 + 1, 16384);
            this.method2859(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method2859(var6, var7, 20480);
            this.method2859(var6 + 1, var7, 65536);
            this.method2859(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method2859(var6, var7, 81920);
            this.method2859(var6, var7 - 1, 1024);
            this.method2859(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fy.f(IIIIIZI)V")
    public void method2875(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field1885;
        int var9 = arg1 - this.field1888;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field1887) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1881) {
                        this.method2859(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fy.o(IIII)V")
    public void method2859(int arg0, int arg1, int arg2) {
        this.field1889[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fy.x(III)V")
    public void method2881(int arg0, int arg1) {
        int var3 = arg0 - this.field1885;
        int var4 = arg1 - this.field1888;
        this.field1889[var3][var4] &= 0xFFFBFFFF;
    }
}
