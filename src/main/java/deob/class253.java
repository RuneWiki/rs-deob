package deob;

@ObfuscatedName("ic")
public class class253 extends class185 {

    @ObfuscatedName("ic.c")
    public static class155 field3248 = new class155(256);

    @ObfuscatedName("ic.y")
    public final int field3249;

    @ObfuscatedName("ic.h")
    public int field3250 = -1;

    @ObfuscatedName("ic.z")
    public int field3252 = -1;

    @ObfuscatedName("ic.e")
    public String field3255;

    @ObfuscatedName("ic.q")
    public int field3246;

    @ObfuscatedName("ic.l")
    public int field3245 = 0;

    @ObfuscatedName("ic.b")
    public boolean field3251 = true;

    @ObfuscatedName("ic.a")
    public boolean field3256 = false;

    @ObfuscatedName("ic.w")
    public String[] field3257 = new String[5];

    @ObfuscatedName("ic.k")
    public String field3258;

    @ObfuscatedName("ic.i")
    public int[] field3259;

    @ObfuscatedName("ic.x")
    public int field3254 = Integer.MAX_VALUE;

    @ObfuscatedName("ic.f")
    public int field3260 = Integer.MAX_VALUE;

    @ObfuscatedName("ic.g")
    public int field3262 = Integer.MIN_VALUE;

    @ObfuscatedName("ic.u")
    public int field3263 = Integer.MIN_VALUE;

    @ObfuscatedName("ic.t")
    public class267 field3264 = class267.field3497;

    @ObfuscatedName("ic.p")
    public class250 field3265 = class250.field3233;

    @ObfuscatedName("ic.m")
    public int[] field3266;

    @ObfuscatedName("ic.r")
    public byte[] field3267;

    @ObfuscatedName("ic.o")
    public int field3268 = -1;

    public class253(int arg0) {
        this.field3249 = arg0;
    }

    @ObfuscatedName("ij.n(IB)Lic;")
    public static class253 method4155(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3261.length || Statics.field3261[arg0] == null ? new class253(arg0) : Statics.field3261[arg0];
    }

    @ObfuscatedName("ic.v(Lkx;B)V")
    public void method4175(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4176(arg0, var2);
        }
    }

    @ObfuscatedName("ic.d(Lkx;II)V")
    public void method4176(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3250 = arg0.method5389();
        } else if (arg1 == 2) {
            this.field3252 = arg0.method5389();
        } else if (arg1 == 3) {
            this.field3255 = arg0.method5465();
        } else if (arg1 == 4) {
            this.field3246 = arg0.method5263();
        } else if (arg1 == 5) {
            arg0.method5263();
        } else if (arg1 == 6) {
            this.field3245 = arg0.method5310();
        } else if (arg1 == 7) {
            int var3 = arg0.method5310();
            if ((var3 & 0x1) == 0) {
                this.field3251 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field3256 = true;
            }
        } else if (arg1 == 8) {
            arg0.method5310();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3257[arg1 - 10] = arg0.method5465();
        } else if (arg1 == 15) {
            int var4 = arg0.method5310();
            this.field3259 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3259[var5] = arg0.method5226();
            }
            arg0.method5455();
            int var6 = arg0.method5310();
            this.field3266 = new int[var6];
            for (int var7 = 0; var7 < this.field3266.length; var7++) {
                this.field3266[var7] = arg0.method5455();
            }
            this.field3267 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3267[var8] = arg0.method5293();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3258 = arg0.method5465();
            } else if (arg1 == 18) {
                arg0.method5389();
            } else if (arg1 == 19) {
                this.field3268 = arg0.method5247();
            } else if (arg1 == 21) {
                arg0.method5455();
            } else if (arg1 == 22) {
                arg0.method5455();
            } else if (arg1 == 23) {
                arg0.method5310();
                arg0.method5310();
                arg0.method5310();
            } else if (arg1 == 24) {
                arg0.method5226();
                arg0.method5226();
            } else if (arg1 == 25) {
                arg0.method5389();
            } else if (arg1 == 28) {
                arg0.method5310();
            } else if (arg1 == 29) {
                this.field3264 = (class267) class205.method1123(class267.method999(), arg0.method5310());
            } else if (arg1 == 30) {
                this.field3265 = (class250) class205.method1123(class250.method3351(), arg0.method5310());
            }
        }
    }

    @ObfuscatedName("ic.c(I)V")
    public void method4181() {
        if (this.field3259 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3259.length; var1 += 2) {
            if (this.field3259[var1] < this.field3254) {
                this.field3254 = this.field3259[var1];
            } else if (this.field3259[var1] > this.field3262) {
                this.field3262 = this.field3259[var1];
            }
            if (this.field3259[var1 + 1] < this.field3260) {
                this.field3260 = this.field3259[var1 + 1];
            } else if (this.field3259[var1 + 1] > this.field3263) {
                this.field3263 = this.field3259[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ic.y(ZI)Llm;")
    public class336 method4178(boolean arg0) {
        int var2 = arg0 ? this.field3252 : this.field3250;
        return this.method4179(var2);
    }

    @ObfuscatedName("ic.h(IB)Llm;")
    public class336 method4179(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class336 var2 = (class336) field3248.method3220((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class336 var3 = class337.method5613(Statics.field3253, arg0, 0);
        if (var3 != null) {
            field3248.method3217(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ic.z(I)I")
    public int method4180() {
        return this.field3249;
    }

    @ObfuscatedName("df.e(B)V")
    public static void method2698() {
        field3248.method3218();
    }
}
