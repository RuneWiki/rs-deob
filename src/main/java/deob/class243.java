package deob;

@ObfuscatedName("ip")
public class class243 extends class195 {

    @ObfuscatedName("ip.t")
    public static class190 field3301 = new class190(256);

    @ObfuscatedName("ip.w")
    public final int field3302;

    @ObfuscatedName("ip.z")
    public int field3313 = -1;

    @ObfuscatedName("ip.j")
    public int field3304 = -1;

    @ObfuscatedName("ip.i")
    public String field3299;

    @ObfuscatedName("ip.f")
    public int field3306;

    @ObfuscatedName("ip.c")
    public int field3316 = 0;

    @ObfuscatedName("ip.q")
    public String[] field3308 = new String[5];

    @ObfuscatedName("ip.n")
    public String field3309;

    @ObfuscatedName("ip.a")
    public int[] field3303;

    @ObfuscatedName("ip.g")
    public int field3300 = Integer.MAX_VALUE;

    @ObfuscatedName("ip.v")
    public int field3312 = Integer.MAX_VALUE;

    @ObfuscatedName("ip.s")
    public int field3310 = Integer.MIN_VALUE;

    @ObfuscatedName("ip.k")
    public int field3314 = Integer.MIN_VALUE;

    @ObfuscatedName("ip.r")
    public class258 field3315 = class258.field3550;

    @ObfuscatedName("ip.l")
    public class240 field3311 = class240.field3284;

    @ObfuscatedName("ip.h")
    public int[] field3317;

    @ObfuscatedName("ip.d")
    public byte[] field3318;

    @ObfuscatedName("ip.x")
    public int field3307 = -1;

    public class243(int arg0) {
        this.field3302 = arg0;
    }

    @ObfuscatedName("az.p(Lil;Lil;I)Z")
    public static boolean method577(class236 arg0, class236 arg1) {
        Statics.field3319 = arg1;
        if (!arg0.method3708()) {
            return false;
        }
        Statics.field2430 = arg0.method3784(35);
        Statics.field3305 = new class243[Statics.field2430];
        for (int var2 = 0; var2 < Statics.field2430; var2++) {
            byte[] var3 = arg0.method3720(35, var2);
            if (var3 != null) {
                Statics.field3305[var2] = new class243(var2);
                Statics.field3305[var2].method3875(new class174(var3));
                Statics.field3305[var2].method3869();
            }
        }
        return true;
    }

    @ObfuscatedName("ip.m(Lfr;I)V")
    public void method3875(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3868(arg0, var2);
        }
    }

    @ObfuscatedName("ip.e(Lfr;IB)V")
    public void method3868(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3313 = arg0.method2825();
        } else if (arg1 == 2) {
            this.field3304 = arg0.method2825();
        } else if (arg1 == 3) {
            this.field3299 = arg0.method2818();
        } else if (arg1 == 4) {
            this.field3306 = arg0.method2832();
        } else if (arg1 == 5) {
            arg0.method2832();
        } else if (arg1 == 6) {
            this.field3316 = arg0.method2810();
        } else if (arg1 == 7) {
            int var3 = arg0.method2810();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2810();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3308[arg1 - 10] = arg0.method2818();
        } else if (arg1 == 15) {
            int var4 = arg0.method2810();
            this.field3303 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3303[var5] = arg0.method3001();
            }
            arg0.method2803();
            int var6 = arg0.method2810();
            this.field3317 = new int[var6];
            for (int var7 = 0; var7 < this.field3317.length; var7++) {
                this.field3317[var7] = arg0.method2803();
            }
            this.field3318 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3318[var8] = arg0.method2811();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3309 = arg0.method2818();
            } else if (arg1 == 18) {
                arg0.method2825();
            } else if (arg1 == 19) {
                this.field3307 = arg0.method2824();
            } else if (arg1 == 21) {
                arg0.method2803();
            } else if (arg1 == 22) {
                arg0.method2803();
            } else if (arg1 == 23) {
                arg0.method2810();
                arg0.method2810();
                arg0.method2810();
            } else if (arg1 == 24) {
                arg0.method3001();
                arg0.method3001();
            } else if (arg1 == 25) {
                arg0.method2825();
            } else if (arg1 == 28) {
                arg0.method2810();
            } else if (arg1 == 29) {
                this.field3315 = (class258) Statics.method666(class258.method27(), arg0.method2810());
            } else if (arg1 == 30) {
                class240[] var9 = new class240[] { class240.field3284, class240.field3281, class240.field3282 };
                this.field3311 = (class240) Statics.method666(var9, arg0.method2810());
            }
        }
    }

    @ObfuscatedName("ip.t(I)V")
    public void method3869() {
        if (this.field3303 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3303.length; var1 += 2) {
            if (this.field3303[var1] < this.field3300) {
                this.field3300 = this.field3303[var1];
            } else if (this.field3303[var1] > this.field3310) {
                this.field3310 = this.field3303[var1];
            }
            if (this.field3303[var1 + 1] < this.field3312) {
                this.field3312 = this.field3303[var1 + 1];
            } else if (this.field3303[var1 + 1] > this.field3314) {
                this.field3314 = this.field3303[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ip.w(ZI)Ljy;")
    public class286 method3886(boolean arg0) {
        int var2 = arg0 ? this.field3304 : this.field3313;
        return this.method3877(var2);
    }

    @ObfuscatedName("ip.z(II)Ljy;")
    public class286 method3877(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class286 var2 = (class286) field3301.method3182((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class286 var3 = class287.method4306(Statics.field3319, arg0, 0);
        if (var3 != null) {
            field3301.method3179(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ip.j(B)I")
    public int method3872() {
        return this.field3302;
    }
}
