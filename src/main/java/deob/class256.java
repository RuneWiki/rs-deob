package deob;

@ObfuscatedName("ie")
public class class256 extends class207 {

    @ObfuscatedName("ie.l")
    public static class201 field3252 = new class201(256);

    @ObfuscatedName("ie.u")
    public final int field3239;

    @ObfuscatedName("ie.q")
    public int field3240 = -1;

    @ObfuscatedName("ie.k")
    public int field3235 = -1;

    @ObfuscatedName("ie.i")
    public String field3242;

    @ObfuscatedName("ie.x")
    public int field3243;

    @ObfuscatedName("ie.e")
    public int field3244 = 0;

    @ObfuscatedName("ie.b")
    public String[] field3245 = new String[5];

    @ObfuscatedName("ie.n")
    public String field3256;

    @ObfuscatedName("ie.f")
    public int[] field3246;

    @ObfuscatedName("ie.g")
    public int field3248 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.m")
    public int field3236 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.r")
    public int field3250 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.t")
    public int field3249 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.o")
    public class271 field3253 = class271.field3480;

    @ObfuscatedName("ie.y")
    public class253 field3254 = class253.field3223;

    @ObfuscatedName("ie.a")
    public int[] field3251;

    @ObfuscatedName("ie.j")
    public byte[] field3255;

    @ObfuscatedName("ie.d")
    public int field3241 = -1;

    public class256(int arg0) {
        this.field3239 = arg0;
    }

    @ObfuscatedName("ie.z(Lgk;I)V")
    public void method4425(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4426(arg0, var2);
        }
    }

    @ObfuscatedName("ie.w(Lgk;IS)V")
    public void method4426(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3240 = arg0.method3249();
        } else if (arg1 == 2) {
            this.field3235 = arg0.method3249();
        } else if (arg1 == 3) {
            this.field3242 = arg0.method3441();
        } else if (arg1 == 4) {
            this.field3243 = arg0.method3255();
        } else if (arg1 == 5) {
            arg0.method3255();
        } else if (arg1 == 6) {
            this.field3244 = arg0.method3247();
        } else if (arg1 == 7) {
            int var3 = arg0.method3247();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3247();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3245[arg1 - 10] = arg0.method3441();
        } else if (arg1 == 15) {
            int var4 = arg0.method3247();
            this.field3246 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3246[var5] = arg0.method3254();
            }
            arg0.method3374();
            int var6 = arg0.method3247();
            this.field3251 = new int[var6];
            for (int var7 = 0; var7 < this.field3251.length; var7++) {
                this.field3251[var7] = arg0.method3374();
            }
            this.field3255 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3255[var8] = arg0.method3384();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3256 = arg0.method3441();
            } else if (arg1 == 18) {
                arg0.method3249();
            } else if (arg1 == 19) {
                this.field3241 = arg0.method3253();
            } else if (arg1 == 21) {
                arg0.method3374();
            } else if (arg1 == 22) {
                arg0.method3374();
            } else if (arg1 == 23) {
                arg0.method3247();
                arg0.method3247();
                arg0.method3247();
            } else if (arg1 == 24) {
                arg0.method3254();
                arg0.method3254();
            } else if (arg1 == 25) {
                arg0.method3249();
            } else if (arg1 == 28) {
                arg0.method3247();
            } else if (arg1 == 29) {
                class271[] var9 = new class271[] { class271.field3480, class271.field3485, class271.field3482 };
                this.field3253 = (class271) class178.method1685(var9, arg0.method3247());
            } else if (arg1 == 30) {
                class253[] var10 = new class253[] { class253.field3222, class253.field3223, class253.field3225 };
                this.field3254 = (class253) class178.method1685(var10, arg0.method3247());
            }
        }
    }

    @ObfuscatedName("ie.s(I)V")
    public void method4437() {
        if (this.field3246 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3246.length; var1 += 2) {
            if (this.field3246[var1] < this.field3248) {
                this.field3248 = this.field3246[var1];
            } else if (this.field3246[var1] > this.field3250) {
                this.field3250 = this.field3246[var1];
            }
            if (this.field3246[var1 + 1] < this.field3236) {
                this.field3236 = this.field3246[var1 + 1];
            } else if (this.field3246[var1 + 1] > this.field3249) {
                this.field3249 = this.field3246[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ie.l(ZB)Lll;")
    public class319 method4424(boolean arg0) {
        int var2 = arg0 ? this.field3235 : this.field3240;
        return this.method4429(var2);
    }

    @ObfuscatedName("ie.u(II)Lll;")
    public class319 method4429(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class319 var2 = (class319) field3252.method3681((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class319 var3 = class320.method4133(Statics.field3238, arg0, 0);
        if (var3 != null) {
            field3252.method3675(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ie.q(B)I")
    public int method4430() {
        return this.field3239;
    }

    @ObfuscatedName("fj.i(B)V")
    public static void method3147() {
        field3252.method3676();
    }
}
