package deob;

@ObfuscatedName("im")
public class class243 extends class176 {

    @ObfuscatedName("im.e")
    public static class146 field3212 = new class146(256);

    @ObfuscatedName("im.i")
    public final int field3214;

    @ObfuscatedName("im.g")
    public int field3226 = -1;

    @ObfuscatedName("im.d")
    public int field3210 = -1;

    @ObfuscatedName("im.l")
    public String field3213;

    @ObfuscatedName("im.j")
    public int field3216;

    @ObfuscatedName("im.m")
    public int field3217 = 0;

    @ObfuscatedName("im.h")
    public String[] field3219 = new String[5];

    @ObfuscatedName("im.v")
    public String field3220;

    @ObfuscatedName("im.n")
    public int[] field3221;

    @ObfuscatedName("im.x")
    public int field3218 = Integer.MAX_VALUE;

    @ObfuscatedName("im.w")
    public int field3223 = Integer.MAX_VALUE;

    @ObfuscatedName("im.k")
    public int field3224 = Integer.MIN_VALUE;

    @ObfuscatedName("im.q")
    public int field3225 = Integer.MIN_VALUE;

    @ObfuscatedName("im.z")
    public class257 field3230 = class257.field3457;

    @ObfuscatedName("im.y")
    public class240 field3227 = class240.field3195;

    @ObfuscatedName("im.f")
    public int[] field3228;

    @ObfuscatedName("im.b")
    public byte[] field3229;

    @ObfuscatedName("im.r")
    public int field3215 = -1;

    public class243(int arg0) {
        this.field3214 = arg0;
    }

    @ObfuscatedName("cu.c(Lii;Lii;I)Z")
    public static boolean method2020(class235 arg0, class235 arg1) {
        Statics.field3222 = arg1;
        if (!arg0.method3841()) {
            return false;
        }
        Statics.field2720 = arg0.method3848(35);
        Statics.field3211 = new class243[Statics.field2720];
        for (int var2 = 0; var2 < Statics.field2720; var2++) {
            byte[] var3 = arg0.method3845(35, var2);
            Statics.field3211[var2] = new class243(var2);
            if (var3 != null) {
                Statics.field3211[var2].method4049(new class301(var3));
                Statics.field3211[var2].method4050();
            }
        }
        return true;
    }

    @ObfuscatedName("gs.t(II)Lim;")
    public static class243 method3377(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3211.length || Statics.field3211[arg0] == null ? new class243(arg0) : Statics.field3211[arg0];
    }

    @ObfuscatedName("im.o(Lkp;I)V")
    public void method4049(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4076(arg0, var2);
        }
    }

    @ObfuscatedName("im.e(Lkp;IS)V")
    public void method4076(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3226 = arg0.method5146();
        } else if (arg1 == 2) {
            this.field3210 = arg0.method5146();
        } else if (arg1 == 3) {
            this.field3213 = arg0.method5138();
        } else if (arg1 == 4) {
            this.field3216 = arg0.method5133();
        } else if (arg1 == 5) {
            arg0.method5133();
        } else if (arg1 == 6) {
            this.field3217 = arg0.method5129();
        } else if (arg1 == 7) {
            int var3 = arg0.method5129();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5129();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3219[arg1 - 10] = arg0.method5138();
        } else if (arg1 == 15) {
            int var4 = arg0.method5129();
            this.field3221 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3221[var5] = arg0.method5132();
            }
            arg0.method5134();
            int var6 = arg0.method5129();
            this.field3228 = new int[var6];
            for (int var7 = 0; var7 < this.field3228.length; var7++) {
                this.field3228[var7] = arg0.method5134();
            }
            this.field3229 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3229[var8] = arg0.method5130();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3220 = arg0.method5138();
            } else if (arg1 == 18) {
                arg0.method5146();
            } else if (arg1 == 19) {
                this.field3215 = arg0.method5124();
            } else if (arg1 == 21) {
                arg0.method5134();
            } else if (arg1 == 22) {
                arg0.method5134();
            } else if (arg1 == 23) {
                arg0.method5129();
                arg0.method5129();
                arg0.method5129();
            } else if (arg1 == 24) {
                arg0.method5132();
                arg0.method5132();
            } else if (arg1 == 25) {
                arg0.method5146();
            } else if (arg1 == 28) {
                arg0.method5129();
            } else if (arg1 == 29) {
                this.field3230 = (class257) class196.method222(class257.method1890(), arg0.method5129());
            } else if (arg1 == 30) {
                this.field3227 = (class240) class196.method222(class240.method1082(), arg0.method5129());
            }
        }
    }

    @ObfuscatedName("im.i(I)V")
    public void method4050() {
        if (this.field3221 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3221.length; var1 += 2) {
            if (this.field3221[var1] < this.field3218) {
                this.field3218 = this.field3221[var1];
            } else if (this.field3221[var1] > this.field3224) {
                this.field3224 = this.field3221[var1];
            }
            if (this.field3221[var1 + 1] < this.field3223) {
                this.field3223 = this.field3221[var1 + 1];
            } else if (this.field3221[var1 + 1] > this.field3225) {
                this.field3225 = this.field3221[var1 + 1];
            }
        }
    }

    @ObfuscatedName("im.g(ZB)Llt;")
    public class326 method4052(boolean arg0) {
        int var2 = arg0 ? this.field3210 : this.field3226;
        return this.method4053(var2);
    }

    @ObfuscatedName("im.d(II)Llt;")
    public class326 method4053(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class326 var2 = (class326) field3212.method3100((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class326 var3 = class327.method516(Statics.field3222, arg0, 0);
        if (var3 != null) {
            field3212.method3102(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("im.l(I)I")
    public int method4054() {
        return this.field3214;
    }

    @ObfuscatedName("en.j(I)V")
    public static void method3074() {
        field3212.method3103();
    }
}
