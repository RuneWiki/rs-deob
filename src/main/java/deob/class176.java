package deob;

@ObfuscatedName("fq")
public class class176 {

    @ObfuscatedName("fq.aq")
    public int field2234 = 0;

    @ObfuscatedName("fq.ak")
    public int field2229 = 0;

    @ObfuscatedName("fq.al")
    public int field2236;

    @ObfuscatedName("fq.as")
    public int field2230;

    @ObfuscatedName("fq.az")
    public int[][] field2225;

    public class176(int arg0, int arg1) {
        this.field2236 = arg0;
        this.field2230 = arg1;
        this.field2225 = new int[this.field2236][this.field2230];
        this.method3101();
    }

    @ObfuscatedName("fq.b(I)V")
    public void method3101() {
        for (int var1 = 0; var1 < this.field2236; var1++) {
            for (int var2 = 0; var2 < this.field2230; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2236 - 5 || var2 >= this.field2230 - 5) {
                    this.field2225[var1][var2] = 16777215;
                } else {
                    this.field2225[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("fq.q(IIIIZI)V")
    public void method3087(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2234;
        int var7 = arg1 - this.field2229;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3086(var6, var7, 128);
                this.method3086(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3086(var6, var7, 2);
                this.method3086(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3086(var6, var7, 8);
                this.method3086(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3086(var6, var7, 32);
                this.method3086(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3086(var6, var7, 1);
                this.method3086(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3086(var6, var7, 4);
                this.method3086(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3086(var6, var7, 16);
                this.method3086(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3086(var6, var7, 64);
                this.method3086(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3086(var6, var7, 130);
                this.method3086(var6 - 1, var7, 8);
                this.method3086(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3086(var6, var7, 10);
                this.method3086(var6, var7 + 1, 32);
                this.method3086(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3086(var6, var7, 40);
                this.method3086(var6 + 1, var7, 128);
                this.method3086(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3086(var6, var7, 160);
                this.method3086(var6, var7 - 1, 2);
                this.method3086(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3086(var6, var7, 65536);
                this.method3086(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3086(var6, var7, 1024);
                this.method3086(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3086(var6, var7, 4096);
                this.method3086(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3086(var6, var7, 16384);
                this.method3086(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3086(var6, var7, 512);
                this.method3086(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3086(var6, var7, 2048);
                this.method3086(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3086(var6, var7, 8192);
                this.method3086(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3086(var6, var7, 32768);
                this.method3086(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3086(var6, var7, 66560);
            this.method3086(var6 - 1, var7, 4096);
            this.method3086(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3086(var6, var7, 5120);
            this.method3086(var6, var7 + 1, 16384);
            this.method3086(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3086(var6, var7, 20480);
            this.method3086(var6 + 1, var7, 65536);
            this.method3086(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3086(var6, var7, 81920);
            this.method3086(var6, var7 - 1, 1024);
            this.method3086(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fq.o(IIIIZI)V")
    public void method3088(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2234;
        int var8 = arg1 - this.field2229;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2236) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2230) {
                        this.method3086(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fq.p(IIB)V")
    public void method3096(int arg0, int arg1) {
        int var3 = arg0 - this.field2234;
        int var4 = arg1 - this.field2229;
        this.field2225[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("fq.a(III)V")
    public void method3114(int arg0, int arg1) {
        int var3 = arg0 - this.field2234;
        int var4 = arg1 - this.field2229;
        this.field2225[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fq.h(IIIB)V")
    public void method3086(int arg0, int arg1, int arg2) {
        this.field2225[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fq.l(IIIIZI)V")
    public void method3115(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2234;
        int var7 = arg1 - this.field2229;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3093(var6, var7, 128);
                this.method3093(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3093(var6, var7, 2);
                this.method3093(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3093(var6, var7, 8);
                this.method3093(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3093(var6, var7, 32);
                this.method3093(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3093(var6, var7, 1);
                this.method3093(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3093(var6, var7, 4);
                this.method3093(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3093(var6, var7, 16);
                this.method3093(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3093(var6, var7, 64);
                this.method3093(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3093(var6, var7, 130);
                this.method3093(var6 - 1, var7, 8);
                this.method3093(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3093(var6, var7, 10);
                this.method3093(var6, var7 + 1, 32);
                this.method3093(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3093(var6, var7, 40);
                this.method3093(var6 + 1, var7, 128);
                this.method3093(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3093(var6, var7, 160);
                this.method3093(var6, var7 - 1, 2);
                this.method3093(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3093(var6, var7, 65536);
                this.method3093(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3093(var6, var7, 1024);
                this.method3093(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3093(var6, var7, 4096);
                this.method3093(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3093(var6, var7, 16384);
                this.method3093(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3093(var6, var7, 512);
                this.method3093(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3093(var6, var7, 2048);
                this.method3093(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3093(var6, var7, 8192);
                this.method3093(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3093(var6, var7, 32768);
                this.method3093(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3093(var6, var7, 66560);
            this.method3093(var6 - 1, var7, 4096);
            this.method3093(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3093(var6, var7, 5120);
            this.method3093(var6, var7 + 1, 16384);
            this.method3093(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3093(var6, var7, 20480);
            this.method3093(var6 + 1, var7, 65536);
            this.method3093(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3093(var6, var7, 81920);
            this.method3093(var6, var7 - 1, 1024);
            this.method3093(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fq.y(IIIIIZI)V")
    public void method3092(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2234;
        int var9 = arg1 - this.field2229;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2236) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2230) {
                        this.method3093(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fq.g(IIII)V")
    public void method3093(int arg0, int arg1, int arg2) {
        this.field2225[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fq.c(III)V")
    public void method3094(int arg0, int arg1) {
        int var3 = arg0 - this.field2234;
        int var4 = arg1 - this.field2229;
        this.field2225[var3][var4] &= 0xFFFBFFFF;
    }
}
