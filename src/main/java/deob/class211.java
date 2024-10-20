package deob;

@ObfuscatedName("hb")
public class class211 {

    @ObfuscatedName("hb.c")
    public int field3028 = 0;

    @ObfuscatedName("hb.an")
    public int field3029 = 0;

    @ObfuscatedName("hb.as")
    public int field3023;

    @ObfuscatedName("hb.ah")
    public int field3030;

    @ObfuscatedName("hb.ar")
    public int[][] field3032;

    public class211(int arg0, int arg1) {
        this.field3023 = arg0;
        this.field3030 = arg1;
        this.field3032 = new int[this.field3023][this.field3030];
        this.method3597();
    }

    @ObfuscatedName("hb.a(I)V")
    public void method3597() {
        for (int var1 = 0; var1 < this.field3023; var1++) {
            for (int var2 = 0; var2 < this.field3030; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field3023 - 5 || var2 >= this.field3030 - 5) {
                    this.field3032[var1][var2] = 16777215;
                } else {
                    this.field3032[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("hb.v(IIIIZI)V")
    public void method3576(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field3028;
        int var7 = arg1 - this.field3029;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3580(var6, var7, 128);
                this.method3580(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3580(var6, var7, 2);
                this.method3580(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3580(var6, var7, 8);
                this.method3580(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3580(var6, var7, 32);
                this.method3580(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3580(var6, var7, 1);
                this.method3580(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3580(var6, var7, 4);
                this.method3580(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3580(var6, var7, 16);
                this.method3580(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3580(var6, var7, 64);
                this.method3580(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3580(var6, var7, 130);
                this.method3580(var6 - 1, var7, 8);
                this.method3580(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3580(var6, var7, 10);
                this.method3580(var6, var7 + 1, 32);
                this.method3580(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3580(var6, var7, 40);
                this.method3580(var6 + 1, var7, 128);
                this.method3580(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3580(var6, var7, 160);
                this.method3580(var6, var7 - 1, 2);
                this.method3580(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3580(var6, var7, 65536);
                this.method3580(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3580(var6, var7, 1024);
                this.method3580(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3580(var6, var7, 4096);
                this.method3580(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3580(var6, var7, 16384);
                this.method3580(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3580(var6, var7, 512);
                this.method3580(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3580(var6, var7, 2048);
                this.method3580(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3580(var6, var7, 8192);
                this.method3580(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3580(var6, var7, 32768);
                this.method3580(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3580(var6, var7, 66560);
            this.method3580(var6 - 1, var7, 4096);
            this.method3580(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3580(var6, var7, 5120);
            this.method3580(var6, var7 + 1, 16384);
            this.method3580(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3580(var6, var7, 20480);
            this.method3580(var6 + 1, var7, 65536);
            this.method3580(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3580(var6, var7, 81920);
            this.method3580(var6, var7 - 1, 1024);
            this.method3580(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("hb.i(IIIIZI)V")
    public void method3577(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field3028;
        int var8 = arg1 - this.field3029;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field3023) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field3030) {
                        this.method3580(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hb.b(III)V")
    public void method3578(int arg0, int arg1) {
        int var3 = arg0 - this.field3028;
        int var4 = arg1 - this.field3029;
        this.field3032[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("hb.l(III)V")
    public void method3598(int arg0, int arg1) {
        int var3 = arg0 - this.field3028;
        int var4 = arg1 - this.field3029;
        this.field3032[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("hb.m(IIII)V")
    public void method3580(int arg0, int arg1, int arg2) {
        this.field3032[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("hb.w(IIIIZI)V")
    public void method3593(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field3028;
        int var7 = arg1 - this.field3029;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3583(var6, var7, 128);
                this.method3583(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3583(var6, var7, 2);
                this.method3583(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3583(var6, var7, 8);
                this.method3583(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3583(var6, var7, 32);
                this.method3583(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3583(var6, var7, 1);
                this.method3583(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3583(var6, var7, 4);
                this.method3583(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3583(var6, var7, 16);
                this.method3583(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3583(var6, var7, 64);
                this.method3583(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3583(var6, var7, 130);
                this.method3583(var6 - 1, var7, 8);
                this.method3583(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3583(var6, var7, 10);
                this.method3583(var6, var7 + 1, 32);
                this.method3583(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3583(var6, var7, 40);
                this.method3583(var6 + 1, var7, 128);
                this.method3583(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3583(var6, var7, 160);
                this.method3583(var6, var7 - 1, 2);
                this.method3583(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3583(var6, var7, 65536);
                this.method3583(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3583(var6, var7, 1024);
                this.method3583(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3583(var6, var7, 4096);
                this.method3583(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3583(var6, var7, 16384);
                this.method3583(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3583(var6, var7, 512);
                this.method3583(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3583(var6, var7, 2048);
                this.method3583(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3583(var6, var7, 8192);
                this.method3583(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3583(var6, var7, 32768);
                this.method3583(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3583(var6, var7, 66560);
            this.method3583(var6 - 1, var7, 4096);
            this.method3583(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3583(var6, var7, 5120);
            this.method3583(var6, var7 + 1, 16384);
            this.method3583(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3583(var6, var7, 20480);
            this.method3583(var6 + 1, var7, 65536);
            this.method3583(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3583(var6, var7, 81920);
            this.method3583(var6, var7 - 1, 1024);
            this.method3583(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("hb.e(IIIIIZI)V")
    public void method3582(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field3028;
        int var9 = arg1 - this.field3029;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field3023) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field3030) {
                        this.method3583(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hb.n(IIIB)V")
    public void method3583(int arg0, int arg1, int arg2) {
        this.field3032[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("hb.s(IIB)V")
    public void method3584(int arg0, int arg1) {
        int var3 = arg0 - this.field3028;
        int var4 = arg1 - this.field3029;
        this.field3032[var3][var4] &= 0xFFFBFFFF;
    }
}
