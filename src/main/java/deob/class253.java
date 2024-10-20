package deob;

@ObfuscatedName("ij")
public class class253 extends class185 {

    @ObfuscatedName("ij.m")
    public static class155 field3255 = new class155(256);

    @ObfuscatedName("ij.z")
    public final int field3242;

    @ObfuscatedName("ij.q")
    public int field3260 = -1;

    @ObfuscatedName("ij.k")
    public int field3245 = -1;

    @ObfuscatedName("ij.c")
    public String field3250;

    @ObfuscatedName("ij.u")
    public int field3246;

    @ObfuscatedName("ij.t")
    public int field3247 = 0;

    @ObfuscatedName("ij.o")
    public boolean field3259 = true;

    @ObfuscatedName("ij.n")
    public boolean field3249 = false;

    @ObfuscatedName("ij.x")
    public String[] field3239 = new String[5];

    @ObfuscatedName("ij.p")
    public String field3251;

    @ObfuscatedName("ij.r")
    public int[] field3244;

    @ObfuscatedName("ij.y")
    public int field3253 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.s")
    public int field3254 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.j")
    public int field3248 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.w")
    public int field3256 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.v")
    public class267 field3257 = class267.field3481;

    @ObfuscatedName("ij.d")
    public class250 field3258 = class250.field3222;

    @ObfuscatedName("ij.a")
    public int[] field3252;

    @ObfuscatedName("ij.g")
    public byte[] field3241;

    @ObfuscatedName("ij.h")
    public int field3261 = -1;

    public class253(int arg0) {
        this.field3242 = arg0;
    }

    @ObfuscatedName("fr.f(Liw;Liw;I)Z")
    public static boolean method3208(class245 arg0, class245 arg1) {
        Statics.field3243 = arg1;
        if (!arg0.method3910()) {
            return false;
        }
        Statics.field1159 = arg0.method3963(35);
        Statics.field3240 = new class253[Statics.field1159];
        for (int var2 = 0; var2 < Statics.field1159; var2++) {
            byte[] var3 = arg0.method3905(35, var2);
            Statics.field3240[var2] = new class253(var2);
            if (var3 != null) {
                Statics.field3240[var2].method4114(new class311(var3));
                Statics.field3240[var2].method4109();
            }
        }
        return true;
    }

    @ObfuscatedName("gg.b(II)Lij;")
    public static class253 method3431(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3240.length || Statics.field3240[arg0] == null ? new class253(arg0) : Statics.field3240[arg0];
    }

    @ObfuscatedName("ij.l(Lkb;S)V")
    public void method4114(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4108(arg0, var2);
        }
    }

    @ObfuscatedName("ij.m(Lkb;II)V")
    public void method4108(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3260 = arg0.method5394();
        } else if (arg1 == 2) {
            this.field3245 = arg0.method5394();
        } else if (arg1 == 3) {
            this.field3250 = arg0.method5189();
        } else if (arg1 == 4) {
            this.field3246 = arg0.method5184();
        } else if (arg1 == 5) {
            arg0.method5184();
        } else if (arg1 == 6) {
            this.field3247 = arg0.method5276();
        } else if (arg1 == 7) {
            int var3 = arg0.method5276();
            if ((var3 & 0x1) == 0) {
                this.field3259 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field3249 = true;
            }
        } else if (arg1 == 8) {
            arg0.method5276();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3239[arg1 - 10] = arg0.method5189();
        } else if (arg1 == 15) {
            int var4 = arg0.method5276();
            this.field3244 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3244[var5] = arg0.method5183();
            }
            arg0.method5330();
            int var6 = arg0.method5276();
            this.field3252 = new int[var6];
            for (int var7 = 0; var7 < this.field3252.length; var7++) {
                this.field3252[var7] = arg0.method5330();
            }
            this.field3241 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3241[var8] = arg0.method5181();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3251 = arg0.method5189();
            } else if (arg1 == 18) {
                arg0.method5394();
            } else if (arg1 == 19) {
                this.field3261 = arg0.method5163();
            } else if (arg1 == 21) {
                arg0.method5330();
            } else if (arg1 == 22) {
                arg0.method5330();
            } else if (arg1 == 23) {
                arg0.method5276();
                arg0.method5276();
                arg0.method5276();
            } else if (arg1 == 24) {
                arg0.method5183();
                arg0.method5183();
            } else if (arg1 == 25) {
                arg0.method5394();
            } else if (arg1 == 28) {
                arg0.method5276();
            } else if (arg1 == 29) {
                class267[] var9 = new class267[] { class267.field3480, class267.field3482, class267.field3481 };
                this.field3257 = (class267) class205.method3432(var9, arg0.method5276());
            } else if (arg1 == 30) {
                this.field3258 = (class250) class205.method3432(class250.method1120(), arg0.method5276());
            }
        }
    }

    @ObfuscatedName("ij.z(I)V")
    public void method4109() {
        if (this.field3244 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3244.length; var1 += 2) {
            if (this.field3244[var1] < this.field3253) {
                this.field3253 = this.field3244[var1];
            } else if (this.field3244[var1] > this.field3248) {
                this.field3248 = this.field3244[var1];
            }
            if (this.field3244[var1 + 1] < this.field3254) {
                this.field3254 = this.field3244[var1 + 1];
            } else if (this.field3244[var1 + 1] > this.field3256) {
                this.field3256 = this.field3244[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ij.q(ZI)Llc;")
    public class336 method4137(boolean arg0) {
        int var2 = arg0 ? this.field3245 : this.field3260;
        return this.method4110(var2);
    }

    @ObfuscatedName("ij.k(II)Llc;")
    public class336 method4110(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class336 var2 = (class336) field3255.method3155((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class336 var3 = class337.method2722(Statics.field3243, arg0, 0);
        if (var3 != null) {
            field3255.method3157(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ij.c(I)I")
    public int method4111() {
        return this.field3242;
    }

    @ObfuscatedName("x.u(B)V")
    public static void method118() {
        field3255.method3158();
    }
}
