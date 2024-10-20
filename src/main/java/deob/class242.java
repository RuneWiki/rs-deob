package deob;

@ObfuscatedName("ie")
public class class242 extends class176 {

    @ObfuscatedName("ie.q")
    public static class146 field3204 = new class146(256);

    @ObfuscatedName("ie.v")
    public final int field3206;

    @ObfuscatedName("ie.l")
    public int field3200 = -1;

    @ObfuscatedName("ie.c")
    public int field3201 = -1;

    @ObfuscatedName("ie.o")
    public String field3202;

    @ObfuscatedName("ie.i")
    public int field3203;

    @ObfuscatedName("ie.d")
    public int field3199 = 0;

    @ObfuscatedName("ie.p")
    public String[] field3205 = new String[5];

    @ObfuscatedName("ie.h")
    public String field3212;

    @ObfuscatedName("ie.k")
    public int[] field3207;

    @ObfuscatedName("ie.x")
    public int field3208 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.j")
    public int field3209 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.r")
    public int field3211 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.e")
    public int field3210 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.s")
    public class256 field3198 = class256.field3447;

    @ObfuscatedName("ie.b")
    public class239 field3213 = class239.field3181;

    @ObfuscatedName("ie.z")
    public int[] field3214;

    @ObfuscatedName("ie.f")
    public byte[] field3215;

    @ObfuscatedName("ie.g")
    public int field3216 = -1;

    public class242(int arg0) {
        this.field3206 = arg0;
    }

    @ObfuscatedName("bs.a(II)Lie;")
    public static class242 method1149(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field55.length || Statics.field55[arg0] == null ? new class242(arg0) : Statics.field55[arg0];
    }

    @ObfuscatedName("ie.t(Lkc;B)V")
    public void method4082(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4083(arg0, var2);
        }
    }

    @ObfuscatedName("ie.n(Lkc;II)V")
    public void method4083(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3200 = arg0.method5152();
        } else if (arg1 == 2) {
            this.field3201 = arg0.method5152();
        } else if (arg1 == 3) {
            this.field3202 = arg0.method5132();
        } else if (arg1 == 4) {
            this.field3203 = arg0.method5127();
        } else if (arg1 == 5) {
            arg0.method5127();
        } else if (arg1 == 6) {
            this.field3199 = arg0.method5123();
        } else if (arg1 == 7) {
            int var3 = arg0.method5123();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5123();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3205[arg1 - 10] = arg0.method5132();
        } else if (arg1 == 15) {
            int var4 = arg0.method5123();
            this.field3207 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3207[var5] = arg0.method5126();
            }
            arg0.method5155();
            int var6 = arg0.method5123();
            this.field3214 = new int[var6];
            for (int var7 = 0; var7 < this.field3214.length; var7++) {
                this.field3214[var7] = arg0.method5155();
            }
            this.field3215 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3215[var8] = arg0.method5268();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3212 = arg0.method5132();
            } else if (arg1 == 18) {
                arg0.method5152();
            } else if (arg1 == 19) {
                this.field3216 = arg0.method5166();
            } else if (arg1 == 21) {
                arg0.method5155();
            } else if (arg1 == 22) {
                arg0.method5155();
            } else if (arg1 == 23) {
                arg0.method5123();
                arg0.method5123();
                arg0.method5123();
            } else if (arg1 == 24) {
                arg0.method5126();
                arg0.method5126();
            } else if (arg1 == 25) {
                arg0.method5152();
            } else if (arg1 == 28) {
                arg0.method5123();
            } else if (arg1 == 29) {
                class256[] var9 = new class256[] { class256.field3450, class256.field3447, class256.field3448 };
                this.field3198 = (class256) class196.method292(var9, arg0.method5123());
            } else if (arg1 == 30) {
                class239[] var10 = new class239[] { class239.field3183, class239.field3181, class239.field3184 };
                this.field3213 = (class239) class196.method292(var10, arg0.method5123());
            }
        }
    }

    @ObfuscatedName("ie.q(B)V")
    public void method4088() {
        if (this.field3207 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3207.length; var1 += 2) {
            if (this.field3207[var1] < this.field3208) {
                this.field3208 = this.field3207[var1];
            } else if (this.field3207[var1] > this.field3211) {
                this.field3211 = this.field3207[var1];
            }
            if (this.field3207[var1 + 1] < this.field3209) {
                this.field3209 = this.field3207[var1 + 1];
            } else if (this.field3207[var1 + 1] > this.field3210) {
                this.field3210 = this.field3207[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ie.v(ZI)Llx;")
    public class325 method4099(boolean arg0) {
        int var2 = arg0 ? this.field3201 : this.field3200;
        return this.method4086(var2);
    }

    @ObfuscatedName("ie.l(II)Llx;")
    public class325 method4086(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class325 var2 = (class325) field3204.method3120((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class325 var3 = class326.method1991(Statics.field3197, arg0, 0);
        if (var3 != null) {
            field3204.method3122(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ie.c(I)I")
    public int method4098() {
        return this.field3206;
    }

    @ObfuscatedName("gq.o(I)V")
    public static void method3581() {
        field3204.method3123();
    }
}
