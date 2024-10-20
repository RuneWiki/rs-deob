package deob;

@ObfuscatedName("it")
public class class242 extends class183 {

    @ObfuscatedName("it.w")
    public static class155 field3185 = new class155(256);

    @ObfuscatedName("it.p")
    public final int field3183;

    @ObfuscatedName("it.b")
    public int field3198 = -1;

    @ObfuscatedName("it.e")
    public int field3188 = -1;

    @ObfuscatedName("it.x")
    public String field3189;

    @ObfuscatedName("it.a")
    public int field3196;

    @ObfuscatedName("it.d")
    public int field3187 = 0;

    @ObfuscatedName("it.o")
    public String[] field3191 = new String[5];

    @ObfuscatedName("it.v")
    public String field3193;

    @ObfuscatedName("it.k")
    public int[] field3194;

    @ObfuscatedName("it.s")
    public int field3195 = Integer.MAX_VALUE;

    @ObfuscatedName("it.l")
    public int field3197 = Integer.MAX_VALUE;

    @ObfuscatedName("it.t")
    public int field3186 = Integer.MIN_VALUE;

    @ObfuscatedName("it.j")
    public int field3192 = Integer.MIN_VALUE;

    @ObfuscatedName("it.n")
    public class256 field3190 = class256.field3428;

    @ObfuscatedName("it.u")
    public class239 field3200 = class239.field3168;

    @ObfuscatedName("it.z")
    public int[] field3201;

    @ObfuscatedName("it.h")
    public byte[] field3199;

    @ObfuscatedName("it.m")
    public int field3202 = -1;

    public class242(int arg0) {
        this.field3183 = arg0;
    }

    @ObfuscatedName("ed.f(Lhz;Lhz;I)Z")
    public static boolean method3090(class234 arg0, class234 arg1) {
        Statics.field3203 = arg1;
        if (!arg0.method3827()) {
            return false;
        }
        Statics.field2301 = arg0.method3764(35);
        Statics.field3184 = new class242[Statics.field2301];
        for (int var2 = 0; var2 < Statics.field2301; var2++) {
            byte[] var3 = arg0.method3752(35, var2);
            Statics.field3184[var2] = new class242(var2);
            if (var3 != null) {
                Statics.field3184[var2].method3970(new class300(var3));
                Statics.field3184[var2].method3973();
            }
        }
        return true;
    }

    @ObfuscatedName("c.i(IB)Lit;")
    public static class242 method103(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3184.length || Statics.field3184[arg0] == null ? new class242(arg0) : Statics.field3184[arg0];
    }

    @ObfuscatedName("it.y(Lkq;I)V")
    public void method3970(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method3976(arg0, var2);
        }
    }

    @ObfuscatedName("it.w(Lkq;IB)V")
    public void method3976(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3198 = arg0.method5127();
        } else if (arg1 == 2) {
            this.field3188 = arg0.method5127();
        } else if (arg1 == 3) {
            this.field3189 = arg0.method5119();
        } else if (arg1 == 4) {
            this.field3196 = arg0.method5226();
        } else if (arg1 == 5) {
            arg0.method5226();
        } else if (arg1 == 6) {
            this.field3187 = arg0.method5110();
        } else if (arg1 == 7) {
            int var3 = arg0.method5110();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5110();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3191[arg1 - 10] = arg0.method5119();
        } else if (arg1 == 15) {
            int var4 = arg0.method5110();
            this.field3194 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3194[var5] = arg0.method5113();
            }
            arg0.method5192();
            int var6 = arg0.method5110();
            this.field3201 = new int[var6];
            for (int var7 = 0; var7 < this.field3201.length; var7++) {
                this.field3201[var7] = arg0.method5192();
            }
            this.field3199 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3199[var8] = arg0.method5297();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3193 = arg0.method5119();
            } else if (arg1 == 18) {
                arg0.method5127();
            } else if (arg1 == 19) {
                this.field3202 = arg0.method5112();
            } else if (arg1 == 21) {
                arg0.method5192();
            } else if (arg1 == 22) {
                arg0.method5192();
            } else if (arg1 == 23) {
                arg0.method5110();
                arg0.method5110();
                arg0.method5110();
            } else if (arg1 == 24) {
                arg0.method5113();
                arg0.method5113();
            } else if (arg1 == 25) {
                arg0.method5127();
            } else if (arg1 == 28) {
                arg0.method5110();
            } else if (arg1 == 29) {
                this.field3190 = (class256) class196.method2065(class256.method3056(), arg0.method5110());
            } else if (arg1 == 30) {
                class239[] var9 = new class239[] { class239.field3171, class239.field3168, class239.field3170 };
                this.field3200 = (class239) class196.method2065(var9, arg0.method5110());
            }
        }
    }

    @ObfuscatedName("it.p(B)V")
    public void method3973() {
        if (this.field3194 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3194.length; var1 += 2) {
            if (this.field3194[var1] < this.field3195) {
                this.field3195 = this.field3194[var1];
            } else if (this.field3194[var1] > this.field3186) {
                this.field3186 = this.field3194[var1];
            }
            if (this.field3194[var1 + 1] < this.field3197) {
                this.field3197 = this.field3194[var1 + 1];
            } else if (this.field3194[var1 + 1] > this.field3192) {
                this.field3192 = this.field3194[var1 + 1];
            }
        }
    }

    @ObfuscatedName("it.b(ZI)Lls;")
    public class325 method3987(boolean arg0) {
        int var2 = arg0 ? this.field3188 : this.field3198;
        return this.method3974(var2);
    }

    @ObfuscatedName("it.e(IB)Lls;")
    public class325 method3974(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class325 var2 = (class325) field3185.method3099((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class325 var3 = Statics.method4026(Statics.field3203, arg0, 0);
        if (var3 != null) {
            field3185.method3101(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("it.x(I)I")
    public int method3975() {
        return this.field3183;
    }
}
