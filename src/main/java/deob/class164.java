package deob;

@ObfuscatedName("fc")
public class class164 {

    @ObfuscatedName("fc.aa")
    public int field2743 = 0;

    @ObfuscatedName("fc.av")
    public int field2744 = 0;

    @ObfuscatedName("fc.aq")
    public int field2730;

    @ObfuscatedName("fc.ak")
    public int field2727;

    @ObfuscatedName("fc.ad")
    public int[][] field2748;

    public class164(int arg0, int arg1) {
        this.field2730 = arg0;
        this.field2727 = arg1;
        this.field2748 = new int[this.field2730][this.field2727];
        this.method3231();
    }

    @ObfuscatedName("fc.g(B)V")
    public void method3231() {
        for (int var1 = 0; var1 < this.field2730; var1++) {
            for (int var2 = 0; var2 < this.field2727; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field2730 - 5 || var2 >= this.field2727 - 5) {
                    this.field2748[var1][var2] = 16777215;
                } else {
                    this.field2748[var1][var2] = 16777216;
                }
            }
        }
    }

    @ObfuscatedName("fc.m(IIIIZI)V")
    public void method3211(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2743;
        int var7 = arg1 - this.field2744;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3194(var6, var7, 128);
                this.method3194(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3194(var6, var7, 2);
                this.method3194(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3194(var6, var7, 8);
                this.method3194(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3194(var6, var7, 32);
                this.method3194(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3194(var6, var7, 1);
                this.method3194(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3194(var6, var7, 4);
                this.method3194(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3194(var6, var7, 16);
                this.method3194(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3194(var6, var7, 64);
                this.method3194(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3194(var6, var7, 130);
                this.method3194(var6 - 1, var7, 8);
                this.method3194(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3194(var6, var7, 10);
                this.method3194(var6, var7 + 1, 32);
                this.method3194(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3194(var6, var7, 40);
                this.method3194(var6 + 1, var7, 128);
                this.method3194(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3194(var6, var7, 160);
                this.method3194(var6, var7 - 1, 2);
                this.method3194(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3194(var6, var7, 65536);
                this.method3194(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3194(var6, var7, 1024);
                this.method3194(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3194(var6, var7, 4096);
                this.method3194(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3194(var6, var7, 16384);
                this.method3194(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3194(var6, var7, 512);
                this.method3194(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3194(var6, var7, 2048);
                this.method3194(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3194(var6, var7, 8192);
                this.method3194(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3194(var6, var7, 32768);
                this.method3194(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3194(var6, var7, 66560);
            this.method3194(var6 - 1, var7, 4096);
            this.method3194(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3194(var6, var7, 5120);
            this.method3194(var6, var7 + 1, 16384);
            this.method3194(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3194(var6, var7, 20480);
            this.method3194(var6 + 1, var7, 65536);
            this.method3194(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3194(var6, var7, 81920);
            this.method3194(var6, var7 - 1, 1024);
            this.method3194(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fc.v(IIIIZI)V")
    public void method3218(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field2743;
        int var8 = arg1 - this.field2744;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field2730) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field2727) {
                        this.method3194(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.r(III)V")
    public void method3209(int arg0, int arg1) {
        int var3 = arg0 - this.field2743;
        int var4 = arg1 - this.field2744;
        this.field2748[var3][var4] |= 0x200000;
    }

    @ObfuscatedName("fc.n(IIB)V")
    public void method3193(int arg0, int arg1) {
        int var3 = arg0 - this.field2743;
        int var4 = arg1 - this.field2744;
        this.field2748[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fc.i(IIII)V")
    public void method3194(int arg0, int arg1, int arg2) {
        this.field2748[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fc.s(IIIIZI)V")
    public void method3195(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field2743;
        int var7 = arg1 - this.field2744;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3197(var6, var7, 128);
                this.method3197(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method3197(var6, var7, 2);
                this.method3197(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method3197(var6, var7, 8);
                this.method3197(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method3197(var6, var7, 32);
                this.method3197(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3197(var6, var7, 1);
                this.method3197(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method3197(var6, var7, 4);
                this.method3197(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method3197(var6, var7, 16);
                this.method3197(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method3197(var6, var7, 64);
                this.method3197(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method3197(var6, var7, 130);
                this.method3197(var6 - 1, var7, 8);
                this.method3197(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method3197(var6, var7, 10);
                this.method3197(var6, var7 + 1, 32);
                this.method3197(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method3197(var6, var7, 40);
                this.method3197(var6 + 1, var7, 128);
                this.method3197(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method3197(var6, var7, 160);
                this.method3197(var6, var7 - 1, 2);
                this.method3197(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method3197(var6, var7, 65536);
                this.method3197(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method3197(var6, var7, 1024);
                this.method3197(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method3197(var6, var7, 4096);
                this.method3197(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method3197(var6, var7, 16384);
                this.method3197(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method3197(var6, var7, 512);
                this.method3197(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method3197(var6, var7, 2048);
                this.method3197(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method3197(var6, var7, 8192);
                this.method3197(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method3197(var6, var7, 32768);
                this.method3197(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method3197(var6, var7, 66560);
            this.method3197(var6 - 1, var7, 4096);
            this.method3197(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method3197(var6, var7, 5120);
            this.method3197(var6, var7 + 1, 16384);
            this.method3197(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method3197(var6, var7, 20480);
            this.method3197(var6 + 1, var7, 65536);
            this.method3197(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method3197(var6, var7, 81920);
            this.method3197(var6, var7 - 1, 1024);
            this.method3197(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fc.w(IIIIIZI)V")
    public void method3196(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field2743;
        int var9 = arg1 - this.field2744;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field2730) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field2727) {
                        this.method3197(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.d(IIIB)V")
    public void method3197(int arg0, int arg1, int arg2) {
        this.field2748[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fc.t(III)V")
    public void method3225(int arg0, int arg1) {
        int var3 = arg0 - this.field2743;
        int var4 = arg1 - this.field2744;
        this.field2748[var3][var4] &= 0xFFFBFFFF;
    }

    @ObfuscatedName("fc.f(IIIIIII)Z")
    public boolean method3199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == arg2 && arg1 == arg3) {
            return true;
        }
        int var7 = arg0 - this.field2743;
        int var8 = arg1 - this.field2744;
        int var9 = arg2 - this.field2743;
        int var10 = arg3 - this.field2744;
        if (arg4 == 0) {
            if (arg5 == 0) {
                if (var9 - 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2748[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2748[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var7 == var9 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 + 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2748[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2748[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var7 == var9 && var10 - 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                if (var9 - 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2748[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2748[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2748[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 - 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2748[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var7 == var9 && var10 + 1 == var8 && (this.field2748[var7][var8] & 0x20) == 0) {
                return true;
            }
            if (var7 == var9 && var10 - 1 == var8 && (this.field2748[var7][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fc.b(IIIIIII)Z")
    public boolean method3200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == arg2 && arg1 == arg3) {
            return true;
        }
        int var7 = arg0 - this.field2743;
        int var8 = arg1 - this.field2744;
        int var9 = arg2 - this.field2743;
        int var10 = arg3 - this.field2744;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var9 + 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x80) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2748[var7][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x8) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field2748[var7][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x8) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2748[var7][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 + 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x80) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field2748[var7][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var7 == var9 && var10 + 1 == var8 && (this.field2748[var7][var8] & 0x20) == 0) {
                return true;
            }
            if (var7 == var9 && var10 - 1 == var8 && (this.field2748[var7][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var7 && var8 == var10 && (this.field2748[var7][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fc.z(IIIIIIIB)Z")
    public boolean method3201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 + arg4 - 1;
        int var9 = arg3 + arg5 - 1;
        if (arg0 >= arg2 && arg0 <= var8 && arg1 >= arg3 && arg1 <= var9) {
            return true;
        } else if (arg2 - 1 == arg0 && arg1 >= arg3 && arg1 <= var9 && (this.field2748[arg0 - this.field2743][arg1 - this.field2744] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var8 + 1 == arg0 && arg1 >= arg3 && arg1 <= var9 && (this.field2748[arg0 - this.field2743][arg1 - this.field2744] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg1 && arg0 >= arg2 && arg0 <= var8 && (this.field2748[arg0 - this.field2743][arg1 - this.field2744] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg1 && arg0 >= arg2 && arg0 <= var8 && (this.field2748[arg0 - this.field2743][arg1 - this.field2744] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }
}
