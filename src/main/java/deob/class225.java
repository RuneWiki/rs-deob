package deob;

@ObfuscatedName("iw")
public class class225 {

    @ObfuscatedName("iw.ba")
    public int field2374 = 0;

    @ObfuscatedName("iw.bm")
    public int field2375 = 0;

    @ObfuscatedName("iw.bp")
    public int field2376;

    @ObfuscatedName("iw.bw")
    public int field2377;

    @ObfuscatedName("iw.bj")
    public int[][] field2378;

    public class225(int arg0, int arg1) {
        this.field2376 = arg0;
        this.field2377 = arg1;
        this.field2378 = new int[this.field2376][this.field2377];
        this.method3987();
    }

    @ObfuscatedName("iw.at(I)V")
    public void method3987() {
        for (int var1 = 0; var1 < this.field2376; var1++) {
            for (int var2 = 0; var2 < this.field2377; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2376 - 5 || var2 >= this.field2377 - 5) {
                    this.field2378[var1][var2] = 16777215;
                } else {
                    this.field2378[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("iw.ah(IIIIZI)V")
    public void method3977(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2374;
        int var7 = arg1 - this.field2375;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3981(var6, var7, 128);
                this.method3981(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3981(var6, var7, 2);
                this.method3981(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3981(var6, var7, 8);
                this.method3981(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3981(var6, var7, 32);
                this.method3981(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3981(var6, var7, 1);
                this.method3981(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3981(var6, var7, 4);
                this.method3981(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3981(var6, var7, 16);
                this.method3981(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3981(var6, var7, 64);
                this.method3981(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3981(var6, var7, 130);
                this.method3981(var6 - 1, var7, 8);
                this.method3981(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3981(var6, var7, 10);
                this.method3981(var6, var7 + 1, 32);
                this.method3981(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3981(var6, var7, 40);
                this.method3981(var6 + 1, var7, 128);
                this.method3981(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3981(var6, var7, 160);
                this.method3981(var6, var7 - 1, 2);
                this.method3981(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3981(var6, var7, 65536);
                this.method3981(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3981(var6, var7, 1024);
                this.method3981(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3981(var6, var7, 4096);
                this.method3981(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3981(var6, var7, 16384);
                this.method3981(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3981(var6, var7, 512);
                this.method3981(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3981(var6, var7, 2048);
                this.method3981(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3981(var6, var7, 8192);
                this.method3981(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3981(var6, var7, 32768);
                this.method3981(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3981(var6, var7, 66560);
            this.method3981(var6 - 1, var7, 4096);
            this.method3981(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3981(var6, var7, 5120);
            this.method3981(var6, var7 + 1, 16384);
            this.method3981(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3981(var6, var7, 20480);
            this.method3981(var6 + 1, var7, 65536);
            this.method3981(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3981(var6, var7, 81920);
            this.method3981(var6, var7 - 1, 1024);
            this.method3981(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("iw.ar(IIIIZB)V")
    public void method3978(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2374;
        int var8 = arg1 - this.field2375;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2376) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2377) {
                        this.method3981(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iw.ao(III)V")
    public void method3980(int arg0, int arg1) {
        int var3 = arg0 - this.field2374;
        int var4 = arg1 - this.field2375;
        this.field2378[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("iw.ab(III)V")
    public void method3975(int arg0, int arg1) {
        int var3 = arg0 - this.field2374;
        int var4 = arg1 - this.field2375;
        this.field2378[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("iw.au(IIIB)V")
    public void method3981(int arg0, int arg1, int arg2) {
        this.field2378[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("iw.aa(IIIIZI)V")
    public void method4010(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2374;
        int var7 = arg1 - this.field2375;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3984(var6, var7, 128);
                this.method3984(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3984(var6, var7, 2);
                this.method3984(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3984(var6, var7, 8);
                this.method3984(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3984(var6, var7, 32);
                this.method3984(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3984(var6, var7, 1);
                this.method3984(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3984(var6, var7, 4);
                this.method3984(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3984(var6, var7, 16);
                this.method3984(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3984(var6, var7, 64);
                this.method3984(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3984(var6, var7, 130);
                this.method3984(var6 - 1, var7, 8);
                this.method3984(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3984(var6, var7, 10);
                this.method3984(var6, var7 + 1, 32);
                this.method3984(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3984(var6, var7, 40);
                this.method3984(var6 + 1, var7, 128);
                this.method3984(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3984(var6, var7, 160);
                this.method3984(var6, var7 - 1, 2);
                this.method3984(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3984(var6, var7, 65536);
                this.method3984(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3984(var6, var7, 1024);
                this.method3984(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3984(var6, var7, 4096);
                this.method3984(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3984(var6, var7, 16384);
                this.method3984(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3984(var6, var7, 512);
                this.method3984(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3984(var6, var7, 2048);
                this.method3984(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3984(var6, var7, 8192);
                this.method3984(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3984(var6, var7, 32768);
                this.method3984(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3984(var6, var7, 66560);
            this.method3984(var6 - 1, var7, 4096);
            this.method3984(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3984(var6, var7, 5120);
            this.method3984(var6, var7 + 1, 16384);
            this.method3984(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3984(var6, var7, 20480);
            this.method3984(var6 + 1, var7, 65536);
            this.method3984(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3984(var6, var7, 81920);
            this.method3984(var6, var7 - 1, 1024);
            this.method3984(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("iw.ac(IIIIIZI)V")
    public void method3983(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2374;
        int var9 = arg1 - this.field2375;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2376) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2377) {
                        this.method3984(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("iw.al(IIII)V")
    public void method3984(int arg0, int arg1, int arg2) {
        this.field2378[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("iw.az(IIB)V")
    public void method3990(int arg0, int arg1) {
        int var3 = arg0 - this.field2374;
        int var4 = arg1 - this.field2375;
        this.field2378[var3][var4] &= 0xFFFBFFFF;
    }
}
