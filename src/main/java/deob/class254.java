package deob;

@ObfuscatedName("ip")
public class class254 extends class206 {

    @ObfuscatedName("ip.h")
    public static class201 field3396 = new class201(256);

    @ObfuscatedName("ip.i")
    public final int field3380;

    @ObfuscatedName("ip.w")
    public int field3381 = -1;

    @ObfuscatedName("ip.t")
    public int field3382 = -1;

    @ObfuscatedName("ip.d")
    public String field3383;

    @ObfuscatedName("ip.z")
    public int field3384;

    @ObfuscatedName("ip.k")
    public int field3379 = 0;

    @ObfuscatedName("ip.o")
    public String[] field3398 = new String[5];

    @ObfuscatedName("ip.l")
    public String field3388;

    @ObfuscatedName("ip.f")
    public int[] field3389;

    @ObfuscatedName("ip.q")
    public int field3390 = Integer.MAX_VALUE;

    @ObfuscatedName("ip.r")
    public int field3391 = Integer.MAX_VALUE;

    @ObfuscatedName("ip.x")
    public int field3392 = Integer.MIN_VALUE;

    @ObfuscatedName("ip.u")
    public int field3393 = Integer.MIN_VALUE;

    @ObfuscatedName("ip.b")
    public class269 field3385 = class269.field3623;

    @ObfuscatedName("ip.p")
    public class251 field3376 = class251.field3360;

    @ObfuscatedName("ip.y")
    public int[] field3387;

    @ObfuscatedName("ip.n")
    public byte[] field3395;

    @ObfuscatedName("ip.j")
    public int field3397 = -1;

    public class254(int arg0) {
        this.field3380 = arg0;
    }

    @ObfuscatedName("br.s(Lir;Lir;I)Z")
    public static boolean method659(class247 arg0, class247 arg1) {
        Statics.field3377 = arg1;
        if (!arg0.method4189()) {
            return false;
        }
        Statics.field3394 = arg0.method4209(35);
        Statics.field3378 = new class254[Statics.field3394];
        for (int var2 = 0; var2 < Statics.field3394; var2++) {
            byte[] var3 = arg0.method4231(35, var2);
            if (var3 != null) {
                Statics.field3378[var2] = new class254(var2);
                Statics.field3378[var2].method4351(new class185(var3));
                Statics.field3378[var2].method4353();
            }
        }
        return true;
    }

    @ObfuscatedName("ip.g(Lgy;I)V")
    public void method4351(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4361(arg0, var2);
        }
    }

    @ObfuscatedName("ip.m(Lgy;II)V")
    public void method4361(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3381 = arg0.method3446();
        } else if (arg1 == 2) {
            this.field3382 = arg0.method3446();
        } else if (arg1 == 3) {
            this.field3383 = arg0.method3248();
        } else if (arg1 == 4) {
            this.field3384 = arg0.method3243();
        } else if (arg1 == 5) {
            arg0.method3243();
        } else if (arg1 == 6) {
            this.field3379 = arg0.method3239();
        } else if (arg1 == 7) {
            int var3 = arg0.method3239();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3239();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3398[arg1 - 10] = arg0.method3248();
        } else if (arg1 == 15) {
            int var4 = arg0.method3239();
            this.field3389 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3389[var5] = arg0.method3221();
            }
            arg0.method3292();
            int var6 = arg0.method3239();
            this.field3387 = new int[var6];
            for (int var7 = 0; var7 < this.field3387.length; var7++) {
                this.field3387[var7] = arg0.method3292();
            }
            this.field3395 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3395[var8] = arg0.method3240();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3388 = arg0.method3248();
            } else if (arg1 == 18) {
                arg0.method3446();
            } else if (arg1 == 19) {
                this.field3397 = arg0.method3241();
            } else if (arg1 == 21) {
                arg0.method3292();
            } else if (arg1 == 22) {
                arg0.method3292();
            } else if (arg1 == 23) {
                arg0.method3239();
                arg0.method3239();
                arg0.method3239();
            } else if (arg1 == 24) {
                arg0.method3221();
                arg0.method3221();
            } else if (arg1 == 25) {
                arg0.method3446();
            } else if (arg1 == 28) {
                arg0.method3239();
            } else if (arg1 == 29) {
                class269[] var9 = new class269[] { class269.field3623, class269.field3624, class269.field3626 };
                this.field3385 = (class269) class180.method1823(var9, arg0.method3239());
            } else if (arg1 == 30) {
                class251[] var10 = new class251[] { class251.field3360, class251.field3359, class251.field3361 };
                this.field3376 = (class251) class180.method1823(var10, arg0.method3239());
            }
        }
    }

    @ObfuscatedName("ip.h(B)V")
    public void method4353() {
        if (this.field3389 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3389.length; var1 += 2) {
            if (this.field3389[var1] < this.field3390) {
                this.field3390 = this.field3389[var1];
            } else if (this.field3389[var1] > this.field3392) {
                this.field3392 = this.field3389[var1];
            }
            if (this.field3389[var1 + 1] < this.field3391) {
                this.field3391 = this.field3389[var1 + 1];
            } else if (this.field3389[var1 + 1] > this.field3393) {
                this.field3393 = this.field3389[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ip.i(ZI)Lki;")
    public class310 method4354(boolean arg0) {
        int var2 = arg0 ? this.field3382 : this.field3381;
        return this.method4355(var2);
    }

    @ObfuscatedName("ip.w(II)Lki;")
    public class310 method4355(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class310 var2 = (class310) field3396.method3673((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class310 var3 = class311.method983(Statics.field3377, arg0, 0);
        if (var3 != null) {
            field3396.method3675(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ip.t(I)I")
    public int method4356() {
        return this.field3380;
    }
}
