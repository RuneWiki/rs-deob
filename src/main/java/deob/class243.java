package deob;

@ObfuscatedName("ij")
public class class243 extends class195 {

    @ObfuscatedName("ij.g")
    public static class190 field3266 = new class190(256);

    @ObfuscatedName("ij.d")
    public final int field3284;

    @ObfuscatedName("ij.b")
    public int field3268 = -1;

    @ObfuscatedName("ij.k")
    public int field3287 = -1;

    @ObfuscatedName("ij.f")
    public String field3270;

    @ObfuscatedName("ij.j")
    public int field3272;

    @ObfuscatedName("ij.q")
    public int field3269 = 0;

    @ObfuscatedName("ij.i")
    public String[] field3273 = new String[5];

    @ObfuscatedName("ij.s")
    public String field3274;

    @ObfuscatedName("ij.n")
    public int[] field3275;

    @ObfuscatedName("ij.c")
    public int field3271 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.v")
    public int field3277 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.u")
    public int field3278 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.w")
    public int field3279 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.z")
    public class258 field3267 = class258.field3525;

    @ObfuscatedName("ij.y")
    public class240 field3281 = class240.field3246;

    @ObfuscatedName("ij.p")
    public int[] field3282;

    @ObfuscatedName("ij.l")
    public byte[] field3283;

    @ObfuscatedName("ij.x")
    public int field3265 = -1;

    public class243(int arg0) {
        this.field3284 = arg0;
    }

    @ObfuscatedName("ij.e(Lfw;I)V")
    public void method3917(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method3923(arg0, var2);
        }
    }

    @ObfuscatedName("ij.o(Lfw;IS)V")
    public void method3923(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3268 = arg0.method3012();
        } else if (arg1 == 2) {
            this.field3287 = arg0.method3012();
        } else if (arg1 == 3) {
            this.field3270 = arg0.method2899();
        } else if (arg1 == 4) {
            this.field3272 = arg0.method2890();
        } else if (arg1 == 5) {
            arg0.method2890();
        } else if (arg1 == 6) {
            this.field3269 = arg0.method2891();
        } else if (arg1 == 7) {
            int var3 = arg0.method2891();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2891();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3273[arg1 - 10] = arg0.method2899();
        } else if (arg1 == 15) {
            int var4 = arg0.method2891();
            this.field3275 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3275[var5] = arg0.method2894();
            }
            arg0.method2896();
            int var6 = arg0.method2891();
            this.field3282 = new int[var6];
            for (int var7 = 0; var7 < this.field3282.length; var7++) {
                this.field3282[var7] = arg0.method2896();
            }
            this.field3283 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3283[var8] = arg0.method2944();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3274 = arg0.method2899();
            } else if (arg1 == 18) {
                arg0.method3012();
            } else if (arg1 == 19) {
                this.field3265 = arg0.method2930();
            } else if (arg1 == 21) {
                arg0.method2896();
            } else if (arg1 == 22) {
                arg0.method2896();
            } else if (arg1 == 23) {
                arg0.method2891();
                arg0.method2891();
                arg0.method2891();
            } else if (arg1 == 24) {
                arg0.method2894();
                arg0.method2894();
            } else if (arg1 == 25) {
                arg0.method3012();
            } else if (arg1 == 28) {
                arg0.method2891();
            } else if (arg1 == 29) {
                class258[] var9 = new class258[] { class258.field3524, class258.field3523, class258.field3525 };
                this.field3267 = (class258) class169.method999(var9, arg0.method2891());
            } else if (arg1 == 30) {
                this.field3281 = (class240) class169.method999(class240.method3736(), arg0.method2891());
            }
        }
    }

    @ObfuscatedName("ij.m(I)V")
    public void method3919() {
        if (this.field3275 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3275.length; var1 += 2) {
            if (this.field3275[var1] < this.field3271) {
                this.field3271 = this.field3275[var1];
            } else if (this.field3275[var1] > this.field3278) {
                this.field3278 = this.field3275[var1];
            }
            if (this.field3275[var1 + 1] < this.field3277) {
                this.field3277 = this.field3275[var1 + 1];
            } else if (this.field3275[var1 + 1] > this.field3279) {
                this.field3279 = this.field3275[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ij.g(ZB)Lje;")
    public class286 method3920(boolean arg0) {
        int var2 = arg0 ? this.field3287 : this.field3268;
        return this.method3921(var2);
    }

    @ObfuscatedName("ij.d(IB)Lje;")
    public class286 method3921(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class286 var2 = (class286) field3266.method3248((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class286 var3 = class287.method4552(Statics.field2320, arg0, 0);
        if (var3 != null) {
            field3266.method3250(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ij.b(I)I")
    public int method3925() {
        return this.field3284;
    }
}
