package deob;

@ObfuscatedName("iy")
public class class253 extends class185 {

    @ObfuscatedName("iy.w")
    public static class155 field3241 = new class155(256);

    @ObfuscatedName("iy.t")
    public final int field3249;

    @ObfuscatedName("iy.j")
    public int field3246 = -1;

    @ObfuscatedName("iy.n")
    public int field3247 = -1;

    @ObfuscatedName("iy.p")
    public String field3248;

    @ObfuscatedName("iy.l")
    public int field3252;

    @ObfuscatedName("iy.z")
    public int field3250 = 0;

    @ObfuscatedName("iy.e")
    public boolean field3251 = true;

    @ObfuscatedName("iy.m")
    public boolean field3264 = false;

    @ObfuscatedName("iy.c")
    public String[] field3245 = new String[5];

    @ObfuscatedName("iy.i")
    public String field3254;

    @ObfuscatedName("iy.f")
    public int[] field3255;

    @ObfuscatedName("iy.a")
    public int field3256 = Integer.MAX_VALUE;

    @ObfuscatedName("iy.b")
    public int field3257 = Integer.MAX_VALUE;

    @ObfuscatedName("iy.y")
    public int field3258 = Integer.MIN_VALUE;

    @ObfuscatedName("iy.r")
    public int field3259 = Integer.MIN_VALUE;

    @ObfuscatedName("iy.q")
    public class267 field3260 = class267.field3490;

    @ObfuscatedName("iy.g")
    public class250 field3261 = class250.field3227;

    @ObfuscatedName("iy.s")
    public int[] field3262;

    @ObfuscatedName("iy.o")
    public byte[] field3243;

    @ObfuscatedName("iy.k")
    public int field3253 = -1;

    public class253(int arg0) {
        this.field3249 = arg0;
    }

    @ObfuscatedName("hx.h(Lib;Lib;I)Z")
    public static boolean method3660(class245 arg0, class245 arg1) {
        Statics.field3242 = arg1;
        if (!arg0.method3839()) {
            return false;
        }
        Statics.field3263 = arg0.method3846(35);
        Statics.field3244 = new class253[Statics.field3263];
        for (int var2 = 0; var2 < Statics.field3263; var2++) {
            byte[] var3 = arg0.method3834(35, var2);
            Statics.field3244[var2] = new class253(var2);
            if (var3 != null) {
                Statics.field3244[var2].method4023(new class311(var3));
                Statics.field3244[var2].method4022();
            }
        }
        return true;
    }

    @ObfuscatedName("ff.v(II)Liy;")
    public static class253 method3211(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3244.length || Statics.field3244[arg0] == null ? new class253(arg0) : Statics.field3244[arg0];
    }

    @ObfuscatedName("iy.x(Lkj;I)V")
    public void method4023(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4021(arg0, var2);
        }
    }

    @ObfuscatedName("iy.w(Lkj;II)V")
    public void method4021(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3246 = arg0.method5132();
        } else if (arg1 == 2) {
            this.field3247 = arg0.method5132();
        } else if (arg1 == 3) {
            this.field3248 = arg0.method5202();
        } else if (arg1 == 4) {
            this.field3252 = arg0.method5119();
        } else if (arg1 == 5) {
            arg0.method5119();
        } else if (arg1 == 6) {
            this.field3250 = arg0.method5274();
        } else if (arg1 == 7) {
            int var3 = arg0.method5274();
            if ((var3 & 0x1) == 0) {
                this.field3251 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field3264 = true;
            }
        } else if (arg1 == 8) {
            arg0.method5274();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3245[arg1 - 10] = arg0.method5202();
        } else if (arg1 == 15) {
            int var4 = arg0.method5274();
            this.field3255 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3255[var5] = arg0.method5118();
            }
            arg0.method5120();
            int var6 = arg0.method5274();
            this.field3262 = new int[var6];
            for (int var7 = 0; var7 < this.field3262.length; var7++) {
                this.field3262[var7] = arg0.method5120();
            }
            this.field3243 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3243[var8] = arg0.method5148();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3254 = arg0.method5202();
            } else if (arg1 == 18) {
                arg0.method5132();
            } else if (arg1 == 19) {
                this.field3253 = arg0.method5342();
            } else if (arg1 == 21) {
                arg0.method5120();
            } else if (arg1 == 22) {
                arg0.method5120();
            } else if (arg1 == 23) {
                arg0.method5274();
                arg0.method5274();
                arg0.method5274();
            } else if (arg1 == 24) {
                arg0.method5118();
                arg0.method5118();
            } else if (arg1 == 25) {
                arg0.method5132();
            } else if (arg1 == 28) {
                arg0.method5274();
            } else if (arg1 == 29) {
                class267[] var9 = new class267[] { class267.field3492, class267.field3490, class267.field3491 };
                this.field3260 = (class267) class205.method3134(var9, arg0.method5274());
            } else if (arg1 == 30) {
                class250[] var10 = new class250[] { class250.field3226, class250.field3230, class250.field3227 };
                this.field3261 = (class250) class205.method3134(var10, arg0.method5274());
            }
        }
    }

    @ObfuscatedName("iy.t(I)V")
    public void method4022() {
        if (this.field3255 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3255.length; var1 += 2) {
            if (this.field3255[var1] < this.field3256) {
                this.field3256 = this.field3255[var1];
            } else if (this.field3255[var1] > this.field3258) {
                this.field3258 = this.field3255[var1];
            }
            if (this.field3255[var1 + 1] < this.field3257) {
                this.field3257 = this.field3255[var1 + 1];
            } else if (this.field3255[var1 + 1] > this.field3259) {
                this.field3259 = this.field3255[var1 + 1];
            }
        }
    }

    @ObfuscatedName("iy.j(ZI)Llm;")
    public class336 method4038(boolean arg0) {
        int var2 = arg0 ? this.field3247 : this.field3246;
        return this.method4024(var2);
    }

    @ObfuscatedName("iy.n(II)Llm;")
    public class336 method4024(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class336 var2 = (class336) field3241.method3147((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class336 var3 = class337.method3795(Statics.field3242, arg0, 0);
        if (var3 != null) {
            field3241.method3145(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("iy.p(I)I")
    public int method4025() {
        return this.field3249;
    }
}
