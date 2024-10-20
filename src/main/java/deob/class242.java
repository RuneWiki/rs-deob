package deob;

@ObfuscatedName("iu")
public class class242 extends class176 {

    @ObfuscatedName("iu.g")
    public static class146 field3187 = new class146(256);

    @ObfuscatedName("iu.l")
    public final int field3198;

    @ObfuscatedName("iu.u")
    public int field3189 = -1;

    @ObfuscatedName("iu.j")
    public int field3206 = -1;

    @ObfuscatedName("iu.v")
    public String field3194;

    @ObfuscatedName("iu.d")
    public int field3196;

    @ObfuscatedName("iu.z")
    public int field3193 = 0;

    @ObfuscatedName("iu.h")
    public String[] field3197 = new String[5];

    @ObfuscatedName("iu.f")
    public String field3185;

    @ObfuscatedName("iu.s")
    public int[] field3184;

    @ObfuscatedName("iu.p")
    public int field3195 = Integer.MAX_VALUE;

    @ObfuscatedName("iu.e")
    public int field3199 = Integer.MAX_VALUE;

    @ObfuscatedName("iu.i")
    public int field3200 = Integer.MIN_VALUE;

    @ObfuscatedName("iu.q")
    public int field3201 = Integer.MIN_VALUE;

    @ObfuscatedName("iu.y")
    public class256 field3202 = class256.field3434;

    @ObfuscatedName("iu.r")
    public class239 field3203 = class239.field3172;

    @ObfuscatedName("iu.k")
    public int[] field3204;

    @ObfuscatedName("iu.w")
    public byte[] field3205;

    @ObfuscatedName("iu.m")
    public int field3188 = -1;

    public class242(int arg0) {
        this.field3198 = arg0;
    }

    @ObfuscatedName("ad.c(II)Liu;")
    public static class242 method481(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3192.length || Statics.field3192[arg0] == null ? new class242(arg0) : Statics.field3192[arg0];
    }

    @ObfuscatedName("iu.x(Lkz;I)V")
    public void method4030(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4031(arg0, var2);
        }
    }

    @ObfuscatedName("iu.t(Lkz;II)V")
    public void method4031(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3189 = arg0.method5261();
        } else if (arg1 == 2) {
            this.field3206 = arg0.method5261();
        } else if (arg1 == 3) {
            this.field3194 = arg0.method5112();
        } else if (arg1 == 4) {
            this.field3196 = arg0.method5107();
        } else if (arg1 == 5) {
            arg0.method5107();
        } else if (arg1 == 6) {
            this.field3193 = arg0.method5103();
        } else if (arg1 == 7) {
            int var3 = arg0.method5103();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5103();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3197[arg1 - 10] = arg0.method5112();
        } else if (arg1 == 15) {
            int var4 = arg0.method5103();
            this.field3184 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3184[var5] = arg0.method5106();
            }
            arg0.method5208();
            int var6 = arg0.method5103();
            this.field3204 = new int[var6];
            for (int var7 = 0; var7 < this.field3204.length; var7++) {
                this.field3204[var7] = arg0.method5208();
            }
            this.field3205 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3205[var8] = arg0.method5168();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3185 = arg0.method5112();
            } else if (arg1 == 18) {
                arg0.method5261();
            } else if (arg1 == 19) {
                this.field3188 = arg0.method5304();
            } else if (arg1 == 21) {
                arg0.method5208();
            } else if (arg1 == 22) {
                arg0.method5208();
            } else if (arg1 == 23) {
                arg0.method5103();
                arg0.method5103();
                arg0.method5103();
            } else if (arg1 == 24) {
                arg0.method5106();
                arg0.method5106();
            } else if (arg1 == 25) {
                arg0.method5261();
            } else if (arg1 == 28) {
                arg0.method5103();
            } else if (arg1 == 29) {
                this.field3202 = (class256) class196.method3332(class256.method4067(), arg0.method5103());
            } else if (arg1 == 30) {
                this.field3203 = (class239) class196.method3332(class239.method994(), arg0.method5103());
            }
        }
    }

    @ObfuscatedName("iu.g(I)V")
    public void method4049() {
        if (this.field3184 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3184.length; var1 += 2) {
            if (this.field3184[var1] < this.field3195) {
                this.field3195 = this.field3184[var1];
            } else if (this.field3184[var1] > this.field3200) {
                this.field3200 = this.field3184[var1];
            }
            if (this.field3184[var1 + 1] < this.field3199) {
                this.field3199 = this.field3184[var1 + 1];
            } else if (this.field3184[var1 + 1] > this.field3201) {
                this.field3201 = this.field3184[var1 + 1];
            }
        }
    }

    @ObfuscatedName("iu.l(ZB)Lli;")
    public class325 method4033(boolean arg0) {
        int var2 = arg0 ? this.field3206 : this.field3189;
        return this.method4057(var2);
    }

    @ObfuscatedName("iu.u(IB)Lli;")
    public class325 method4057(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class325 var2 = (class325) field3187.method3061((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class325 var3 = class326.method5636(Statics.field3191, arg0, 0);
        if (var3 != null) {
            field3187.method3062(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("iu.j(I)I")
    public int method4052() {
        return this.field3198;
    }

    @ObfuscatedName("ai.v(B)V")
    public static void method692() {
        field3187.method3063();
    }
}
