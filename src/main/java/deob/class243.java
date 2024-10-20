package deob;

@ObfuscatedName("is")
public class class243 extends class195 {

    @ObfuscatedName("is.u")
    public static class190 field3264 = new class190(256);

    @ObfuscatedName("is.g")
    public final int field3276;

    @ObfuscatedName("is.m")
    public int field3275 = -1;

    @ObfuscatedName("is.s")
    public int field3279 = -1;

    @ObfuscatedName("is.x")
    public String field3268;

    @ObfuscatedName("is.p")
    public int field3269;

    @ObfuscatedName("is.k")
    public int field3270 = 0;

    @ObfuscatedName("is.w")
    public String[] field3271 = new String[5];

    @ObfuscatedName("is.v")
    public String field3272;

    @ObfuscatedName("is.h")
    public int[] field3273;

    @ObfuscatedName("is.t")
    public int field3274 = Integer.MAX_VALUE;

    @ObfuscatedName("is.a")
    public int field3284 = Integer.MAX_VALUE;

    @ObfuscatedName("is.e")
    public int field3267 = Integer.MIN_VALUE;

    @ObfuscatedName("is.y")
    public int field3265 = Integer.MIN_VALUE;

    @ObfuscatedName("is.l")
    public class258 field3281 = class258.field3521;

    @ObfuscatedName("is.q")
    public class240 field3277 = class240.field3247;

    @ObfuscatedName("is.f")
    public int[] field3263;

    @ObfuscatedName("is.j")
    public byte[] field3280;

    @ObfuscatedName("is.n")
    public int field3282 = -1;

    public class243(int arg0) {
        this.field3276 = arg0;
    }

    @ObfuscatedName("fe.c(Lip;Lip;I)Z")
    public static boolean method3077(class236 arg0, class236 arg1) {
        Statics.field3278 = arg1;
        if (!arg0.method3718()) {
            return false;
        }
        Statics.field3666 = arg0.method3739(35);
        Statics.field3266 = new class243[Statics.field3666];
        for (int var2 = 0; var2 < Statics.field3666; var2++) {
            byte[] var3 = arg0.method3741(35, var2);
            if (var3 != null) {
                Statics.field3266[var2] = new class243(var2);
                Statics.field3266[var2].method3880(new class174(var3));
                Statics.field3266[var2].method3877();
            }
        }
        return true;
    }

    @ObfuscatedName("is.o(Lfp;I)V")
    public void method3880(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method3876(arg0, var2);
        }
    }

    @ObfuscatedName("is.i(Lfp;IB)V")
    public void method3876(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3275 = arg0.method3030();
        } else if (arg1 == 2) {
            this.field3279 = arg0.method3030();
        } else if (arg1 == 3) {
            this.field3268 = arg0.method2867();
        } else if (arg1 == 4) {
            this.field3269 = arg0.method2994();
        } else if (arg1 == 5) {
            arg0.method2994();
        } else if (arg1 == 6) {
            this.field3270 = arg0.method2843();
        } else if (arg1 == 7) {
            int var3 = arg0.method2843();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2843();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3271[arg1 - 10] = arg0.method2867();
        } else if (arg1 == 15) {
            int var4 = arg0.method2843();
            this.field3273 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3273[var5] = arg0.method3061();
            }
            arg0.method2987();
            int var6 = arg0.method2843();
            this.field3263 = new int[var6];
            for (int var7 = 0; var7 < this.field3263.length; var7++) {
                this.field3263[var7] = arg0.method2987();
            }
            this.field3280 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3280[var8] = arg0.method3014();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3272 = arg0.method2867();
            } else if (arg1 == 18) {
                arg0.method3030();
            } else if (arg1 == 19) {
                this.field3282 = arg0.method2861();
            } else if (arg1 == 21) {
                arg0.method2987();
            } else if (arg1 == 22) {
                arg0.method2987();
            } else if (arg1 == 23) {
                arg0.method2843();
                arg0.method2843();
                arg0.method2843();
            } else if (arg1 == 24) {
                arg0.method3061();
                arg0.method3061();
            } else if (arg1 == 25) {
                arg0.method3030();
            } else if (arg1 == 28) {
                arg0.method2843();
            } else if (arg1 == 29) {
                this.field3281 = (class258) class169.method454(class258.method1499(), arg0.method2843());
            } else if (arg1 == 30) {
                this.field3277 = (class240) class169.method454(class240.method598(), arg0.method2843());
            }
        }
    }

    @ObfuscatedName("is.u(I)V")
    public void method3877() {
        if (this.field3273 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3273.length; var1 += 2) {
            if (this.field3273[var1] < this.field3274) {
                this.field3274 = this.field3273[var1];
            } else if (this.field3273[var1] > this.field3267) {
                this.field3267 = this.field3273[var1];
            }
            if (this.field3273[var1 + 1] < this.field3284) {
                this.field3284 = this.field3273[var1 + 1];
            } else if (this.field3273[var1 + 1] > this.field3265) {
                this.field3265 = this.field3273[var1 + 1];
            }
        }
    }

    @ObfuscatedName("is.g(ZI)Ljj;")
    public class286 method3875(boolean arg0) {
        int var2 = arg0 ? this.field3279 : this.field3275;
        return this.method3888(var2);
    }

    @ObfuscatedName("is.m(IS)Ljj;")
    public class286 method3888(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class286 var2 = (class286) field3264.method3220((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class286 var3 = class287.method4240(Statics.field3278, arg0, 0);
        if (var3 != null) {
            field3264.method3233(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("is.s(B)I")
    public int method3881() {
        return this.field3276;
    }
}
