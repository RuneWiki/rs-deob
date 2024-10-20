package deob;

@ObfuscatedName("fm")
public class class8 {

    @ObfuscatedName("fm.ar")
    public int field40;

    @ObfuscatedName("fm.ak")
    public int field38 = 0;

    @ObfuscatedName("fm.ai")
    public int field32;

    @ObfuscatedName("fm.ab")
    public int field31 = 0;

    @ObfuscatedName("fm.ah")
    public int[][] field42;

    @ObfuscatedName("fm.b(I)V")
    public void method56() {
        for (int var1 = 0; var1 < this.field40; var1++) {
            for (int var2 = 0; var2 < this.field32; var2++) {
                if (var1 == 0 || var2 == 0 || var1 >= this.field40 - 5 || var2 >= this.field32 - 5) {
                    this.field42[var1][var2] = 16777215;
                } else {
                    this.field42[var1][var2] = 16777216;
                }
            }
        }
    }

    public class8(int arg0, int arg1) {
        this.field40 = arg0;
        this.field32 = arg1;
        this.field42 = new int[this.field40][this.field32];
        this.method56();
    }

    @ObfuscatedName("fm.d(IIIB)V")
    public void method59(int arg0, int arg1, int arg2) {
        this.field42[arg0][arg1] |= arg2;
    }

    @ObfuscatedName("fm.l(IIIIZI)V")
    public void method61(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field38;
        int var7 = arg1 - this.field31;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method92(var6, var7, 128);
                this.method92(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method92(var6, var7, 2);
                this.method92(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method92(var6, var7, 8);
                this.method92(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method92(var6, var7, 32);
                this.method92(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method92(var6, var7, 1);
                this.method92(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method92(var6, var7, 4);
                this.method92(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method92(var6, var7, 16);
                this.method92(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method92(var6, var7, 64);
                this.method92(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method92(var6, var7, 130);
                this.method92(var6 - 1, var7, 8);
                this.method92(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method92(var6, var7, 10);
                this.method92(var6, var7 + 1, 32);
                this.method92(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method92(var6, var7, 40);
                this.method92(var6 + 1, var7, 128);
                this.method92(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method92(var6, var7, 160);
                this.method92(var6, var7 - 1, 2);
                this.method92(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method92(var6, var7, 65536);
                this.method92(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method92(var6, var7, 1024);
                this.method92(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method92(var6, var7, 4096);
                this.method92(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method92(var6, var7, 16384);
                this.method92(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method92(var6, var7, 512);
                this.method92(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method92(var6, var7, 2048);
                this.method92(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method92(var6, var7, 8192);
                this.method92(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method92(var6, var7, 32768);
                this.method92(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method92(var6, var7, 66560);
            this.method92(var6 - 1, var7, 4096);
            this.method92(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method92(var6, var7, 5120);
            this.method92(var6, var7 + 1, 16384);
            this.method92(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method92(var6, var7, 20480);
            this.method92(var6 + 1, var7, 65536);
            this.method92(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method92(var6, var7, 81920);
            this.method92(var6, var7 - 1, 1024);
            this.method92(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fm.f(IIIIIZI)V")
    public void method62(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 256;
        if (arg5) {
            var7 += 131072;
        }
        int var8 = arg0 - this.field38;
        int var9 = arg1 - this.field31;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        for (int var11 = var8; var11 < arg2 + var8; var11++) {
            if (var11 >= 0 && var11 < this.field40) {
                for (int var12 = var9; var12 < arg3 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field32) {
                        this.method92(var11, var12, var7);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.k(IIIIZI)V")
    public void method63(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = 256;
        if (arg4) {
            var6 += 131072;
        }
        int var7 = arg0 - this.field38;
        int var8 = arg1 - this.field31;
        for (int var9 = var7; var9 < arg2 + var7; var9++) {
            if (var9 >= 0 && var9 < this.field40) {
                for (int var10 = var8; var10 < arg3 + var8; var10++) {
                    if (var10 >= 0 && var10 < this.field32) {
                        this.method59(var9, var10, var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fm.j(IIB)V")
    public void method64(int arg0, int arg1) {
        int var3 = arg0 - this.field38;
        int var4 = arg1 - this.field31;
        this.field42[var3][var4] &= 0xFFFBFFFF;
    }

    @ObfuscatedName("fm.x(IIIIIIB)Z")
    public boolean method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == arg2 && arg1 == arg3) {
            return true;
        }
        int var7 = arg0 - this.field38;
        int var8 = arg1 - this.field31;
        int var9 = arg2 - this.field38;
        int var10 = arg3 - this.field31;
        if (arg4 == 0) {
            if (arg5 == 0) {
                if (var9 - 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field42[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field42[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var7 == var9 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 + 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field42[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field42[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var7 == var9 && var10 - 1 == var8) {
                    return true;
                }
                if (var9 - 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x12C0180) == 0) {
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
                if (var9 + 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field42[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field42[var7][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field42[var7][var8] & 0x12C0120) == 0) {
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
                if (var7 == var9 && var10 + 1 == var8 && (this.field42[var7][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 + 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var7 == var9 && var10 + 1 == var8 && (this.field42[var7][var8] & 0x20) == 0) {
                return true;
            }
            if (var7 == var9 && var10 - 1 == var8 && (this.field42[var7][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fm.o(IIIIIIII)Z")
    public boolean method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 + arg4 - 1;
        int var9 = arg3 + arg5 - 1;
        if (arg0 >= arg2 && arg0 <= var8 && arg1 >= arg3 && arg1 <= var9) {
            return true;
        } else if (arg2 - 1 == arg0 && arg1 >= arg3 && arg1 <= var9 && (this.field42[arg0 - this.field38][arg1 - this.field31] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var8 + 1 == arg0 && arg1 >= arg3 && arg1 <= var9 && (this.field42[arg0 - this.field38][arg1 - this.field31] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg1 && arg0 >= arg2 && arg0 <= var8 && (this.field42[arg0 - this.field38][arg1 - this.field31] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg1 && arg0 >= arg2 && arg0 <= var8 && (this.field42[arg0 - this.field38][arg1 - this.field31] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @ObfuscatedName("fm.t(III)V")
    public void method71(int arg0, int arg1) {
        int var3 = arg0 - this.field38;
        int var4 = arg1 - this.field31;
        this.field42[var3][var4] |= 0x40000;
    }

    @ObfuscatedName("fm.g(IIIIIII)Z")
    public boolean method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == arg2 && arg1 == arg3) {
            return true;
        }
        int var7 = arg0 - this.field38;
        int var8 = arg1 - this.field31;
        int var9 = arg2 - this.field38;
        int var10 = arg3 - this.field31;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg5 = arg5 + 2 & 0x3;
            }
            if (arg5 == 0) {
                if (var9 + 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x80) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field42[var7][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x8) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 - 1 == var8 && (this.field42[var7][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var9 - 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x8) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field42[var7][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 + 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x80) == 0) {
                    return true;
                }
                if (var7 == var9 && var10 + 1 == var8 && (this.field42[var7][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var7 == var9 && var10 + 1 == var8 && (this.field42[var7][var8] & 0x20) == 0) {
                return true;
            }
            if (var7 == var9 && var10 - 1 == var8 && (this.field42[var7][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var7 && var8 == var10 && (this.field42[var7][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fm.h(IIIIZB)V")
    public void method91(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg0 - this.field38;
        int var7 = arg1 - this.field31;
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method59(var6, var7, 128);
                this.method59(var6 - 1, var7, 8);
            }
            if (arg3 == 1) {
                this.method59(var6, var7, 2);
                this.method59(var6, var7 + 1, 32);
            }
            if (arg3 == 2) {
                this.method59(var6, var7, 8);
                this.method59(var6 + 1, var7, 128);
            }
            if (arg3 == 3) {
                this.method59(var6, var7, 32);
                this.method59(var6, var7 - 1, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method59(var6, var7, 1);
                this.method59(var6 - 1, var7 + 1, 16);
            }
            if (arg3 == 1) {
                this.method59(var6, var7, 4);
                this.method59(var6 + 1, var7 + 1, 64);
            }
            if (arg3 == 2) {
                this.method59(var6, var7, 16);
                this.method59(var6 + 1, var7 - 1, 1);
            }
            if (arg3 == 3) {
                this.method59(var6, var7, 64);
                this.method59(var6 - 1, var7 - 1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg3 == 0) {
                this.method59(var6, var7, 130);
                this.method59(var6 - 1, var7, 8);
                this.method59(var6, var7 + 1, 32);
            }
            if (arg3 == 1) {
                this.method59(var6, var7, 10);
                this.method59(var6, var7 + 1, 32);
                this.method59(var6 + 1, var7, 128);
            }
            if (arg3 == 2) {
                this.method59(var6, var7, 40);
                this.method59(var6 + 1, var7, 128);
                this.method59(var6, var7 - 1, 2);
            }
            if (arg3 == 3) {
                this.method59(var6, var7, 160);
                this.method59(var6, var7 - 1, 2);
                this.method59(var6 - 1, var7, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg2 == 0) {
            if (arg3 == 0) {
                this.method59(var6, var7, 65536);
                this.method59(var6 - 1, var7, 4096);
            }
            if (arg3 == 1) {
                this.method59(var6, var7, 1024);
                this.method59(var6, var7 + 1, 16384);
            }
            if (arg3 == 2) {
                this.method59(var6, var7, 4096);
                this.method59(var6 + 1, var7, 65536);
            }
            if (arg3 == 3) {
                this.method59(var6, var7, 16384);
                this.method59(var6, var7 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg3 == 0) {
                this.method59(var6, var7, 512);
                this.method59(var6 - 1, var7 + 1, 8192);
            }
            if (arg3 == 1) {
                this.method59(var6, var7, 2048);
                this.method59(var6 + 1, var7 + 1, 32768);
            }
            if (arg3 == 2) {
                this.method59(var6, var7, 8192);
                this.method59(var6 + 1, var7 - 1, 512);
            }
            if (arg3 == 3) {
                this.method59(var6, var7, 32768);
                this.method59(var6 - 1, var7 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method59(var6, var7, 66560);
            this.method59(var6 - 1, var7, 4096);
            this.method59(var6, var7 + 1, 16384);
        }
        if (arg3 == 1) {
            this.method59(var6, var7, 5120);
            this.method59(var6, var7 + 1, 16384);
            this.method59(var6 + 1, var7, 65536);
        }
        if (arg3 == 2) {
            this.method59(var6, var7, 20480);
            this.method59(var6 + 1, var7, 65536);
            this.method59(var6, var7 - 1, 1024);
        }
        if (arg3 == 3) {
            this.method59(var6, var7, 81920);
            this.method59(var6, var7 - 1, 1024);
            this.method59(var6 - 1, var7, 4096);
        }
    }

    @ObfuscatedName("fm.s(IIII)V")
    public void method92(int arg0, int arg1, int arg2) {
        this.field42[arg0][arg1] &= ~arg2;
    }

    @ObfuscatedName("fm.w(III)V")
    public void method94(int arg0, int arg1) {
        int var3 = arg0 - this.field38;
        int var4 = arg1 - this.field31;
        this.field42[var3][var4] |= 0x200000;
    }
}
