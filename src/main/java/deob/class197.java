package deob;

@ObfuscatedName("go")
public class class197 {

    @ObfuscatedName("go.m")
    public int field2948 = 0;

    @ObfuscatedName("go.ak")
    public int field2941 = 0;

    @ObfuscatedName("go.aw")
    public int field2950;

    @ObfuscatedName("go.af")
    public int field2951;

    @ObfuscatedName("go.ab")
    public int[][] field2952;

    public class197(int arg0, int arg1) {
        this.field2950 = arg0;
        this.field2951 = arg1;
        this.field2952 = new int[this.field2950][this.field2951];
        this.method3485();
    }

    @ObfuscatedName("go.t(I)V")
    public void method3485() {
        for (int var1 = 0; var1 < this.field2950; var1++) {
            for (int var2 = 0; var2 < this.field2951; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2950 - 5 || var2 >= this.field2951 - 5) {
                    this.field2952[var1][var2] = 16777215;
                } else {
                    this.field2952[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("go.s(IIIIZI)V")
    public void method3493(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2948;
        int var7 = arg1 - this.field2941;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3508(var6, var7, 128);
                this.method3508(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3508(var6, var7, 2);
                this.method3508(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3508(var6, var7, 8);
                this.method3508(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3508(var6, var7, 32);
                this.method3508(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3508(var6, var7, 1);
                this.method3508(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3508(var6, var7, 4);
                this.method3508(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3508(var6, var7, 16);
                this.method3508(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3508(var6, var7, 64);
                this.method3508(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3508(var6, var7, 130);
                this.method3508(var6 - 1, var7, 8);
                this.method3508(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3508(var6, var7, 10);
                this.method3508(var6, var7 + 1, 32);
                this.method3508(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3508(var6, var7, 40);
                this.method3508(var6 + 1, var7, 128);
                this.method3508(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3508(var6, var7, 160);
                this.method3508(var6, var7 - 1, 2);
                this.method3508(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3508(var6, var7, 65536);
                this.method3508(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3508(var6, var7, 1024);
                this.method3508(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3508(var6, var7, 4096);
                this.method3508(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3508(var6, var7, 16384);
                this.method3508(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3508(var6, var7, 512);
                this.method3508(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3508(var6, var7, 2048);
                this.method3508(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3508(var6, var7, 8192);
                this.method3508(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3508(var6, var7, 32768);
                this.method3508(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3508(var6, var7, 66560);
            this.method3508(var6 - 1, var7, 4096);
            this.method3508(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3508(var6, var7, 5120);
            this.method3508(var6, var7 + 1, 16384);
            this.method3508(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3508(var6, var7, 20480);
            this.method3508(var6 + 1, var7, 65536);
            this.method3508(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3508(var6, var7, 81920);
            this.method3508(var6, var7 - 1, 1024);
            this.method3508(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("go.f(IIIIZI)V")
    public void method3491(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2948;
        int var8 = arg1 - this.field2941;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2950) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2951) {
                        this.method3508(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("go.e(III)V")
    public void method3488(int arg0, int arg1) {
        int var3 = arg0 - this.field2948;
        int var4 = arg1 - this.field2941;
        this.field2952[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("go.d(IIB)V")
    public void method3495(int arg0, int arg1) {
        int var3 = arg0 - this.field2948;
        int var4 = arg1 - this.field2941;
        this.field2952[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("go.n(IIII)V")
    public void method3508(int arg0, int arg1, int arg2) {
        this.field2952[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("go.v(IIIIZI)V")
    public void method3497(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2948;
        int var7 = arg1 - this.field2941;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3511(var6, var7, 128);
                this.method3511(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3511(var6, var7, 2);
                this.method3511(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3511(var6, var7, 8);
                this.method3511(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3511(var6, var7, 32);
                this.method3511(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3511(var6, var7, 1);
                this.method3511(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3511(var6, var7, 4);
                this.method3511(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3511(var6, var7, 16);
                this.method3511(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3511(var6, var7, 64);
                this.method3511(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3511(var6, var7, 130);
                this.method3511(var6 - 1, var7, 8);
                this.method3511(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3511(var6, var7, 10);
                this.method3511(var6, var7 + 1, 32);
                this.method3511(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3511(var6, var7, 40);
                this.method3511(var6 + 1, var7, 128);
                this.method3511(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3511(var6, var7, 160);
                this.method3511(var6, var7 - 1, 2);
                this.method3511(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3511(var6, var7, 65536);
                this.method3511(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3511(var6, var7, 1024);
                this.method3511(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3511(var6, var7, 4096);
                this.method3511(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3511(var6, var7, 16384);
                this.method3511(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3511(var6, var7, 512);
                this.method3511(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3511(var6, var7, 2048);
                this.method3511(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3511(var6, var7, 8192);
                this.method3511(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3511(var6, var7, 32768);
                this.method3511(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3511(var6, var7, 66560);
            this.method3511(var6 - 1, var7, 4096);
            this.method3511(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3511(var6, var7, 5120);
            this.method3511(var6, var7 + 1, 16384);
            this.method3511(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3511(var6, var7, 20480);
            this.method3511(var6 + 1, var7, 65536);
            this.method3511(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3511(var6, var7, 81920);
            this.method3511(var6, var7 - 1, 1024);
            this.method3511(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("go.z(IIIIIZI)V")
    public void method3492(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2948;
        int var9 = arg1 - this.field2941;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2950) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2951) {
                        this.method3511(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("go.j(IIIB)V")
    public void method3511(int arg0, int arg1, int arg2) {
        this.field2952[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("go.u(III)V")
    public void method3494(int arg0, int arg1) {
        int var3 = arg0 - this.field2948;
        int var4 = arg1 - this.field2941;
        this.field2952[var3][var4] &= 0xFFFBFFFF;
    }
}
