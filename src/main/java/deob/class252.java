package deob;

@ObfuscatedName("io")
public class class252 extends class185 {

    @ObfuscatedName("io.d")
    public static class155 field3212 = new class155(256);

    @ObfuscatedName("io.w")
    public final int field3213;

    @ObfuscatedName("io.v")
    public int field3225 = -1;

    @ObfuscatedName("io.q")
    public int field3215 = -1;

    @ObfuscatedName("io.z")
    public String field3216;

    @ObfuscatedName("io.t")
    public int field3217;

    @ObfuscatedName("io.e")
    public int field3218 = 0;

    @ObfuscatedName("io.p")
    public String[] field3210 = new String[5];

    @ObfuscatedName("io.n")
    public String field3228;

    @ObfuscatedName("io.u")
    public int[] field3221;

    @ObfuscatedName("io.h")
    public int field3222 = Integer.MAX_VALUE;

    @ObfuscatedName("io.g")
    public int field3223 = Integer.MAX_VALUE;

    @ObfuscatedName("io.i")
    public int field3224 = Integer.MIN_VALUE;

    @ObfuscatedName("io.a")
    public int field3211 = Integer.MIN_VALUE;

    @ObfuscatedName("io.b")
    public class266 field3229 = class266.field3453;

    @ObfuscatedName("io.l")
    public class249 field3227 = class249.field3193;

    @ObfuscatedName("io.r")
    public int[] field3230;

    @ObfuscatedName("io.o")
    public byte[] field3219;

    @ObfuscatedName("io.c")
    public int field3214 = -1;

    public class252(int arg0) {
        this.field3213 = arg0;
    }

    @ObfuscatedName("f.x(II)Lio;")
    public static class252 method249(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3220.length || Statics.field3220[arg0] == null ? new class252(arg0) : Statics.field3220[arg0];
    }

    @ObfuscatedName("io.m(Lkb;B)V")
    public void method4080(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4073(arg0, var2);
        }
    }

    @ObfuscatedName("io.k(Lkb;II)V")
    public void method4073(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3225 = arg0.method5154();
        } else if (arg1 == 2) {
            this.field3215 = arg0.method5154();
        } else if (arg1 == 3) {
            this.field3216 = arg0.method5257();
        } else if (arg1 == 4) {
            this.field3217 = arg0.method5264();
        } else if (arg1 == 5) {
            arg0.method5264();
        } else if (arg1 == 6) {
            this.field3218 = arg0.method5137();
        } else if (arg1 == 7) {
            int var3 = arg0.method5137();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5137();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3210[arg1 - 10] = arg0.method5257();
        } else if (arg1 == 15) {
            int var4 = arg0.method5137();
            this.field3221 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3221[var5] = arg0.method5140();
            }
            arg0.method5142();
            int var6 = arg0.method5137();
            this.field3230 = new int[var6];
            for (int var7 = 0; var7 < this.field3230.length; var7++) {
                this.field3230[var7] = arg0.method5142();
            }
            this.field3219 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3219[var8] = arg0.method5138();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3228 = arg0.method5257();
            } else if (arg1 == 18) {
                arg0.method5154();
            } else if (arg1 == 19) {
                this.field3214 = arg0.method5139();
            } else if (arg1 == 21) {
                arg0.method5142();
            } else if (arg1 == 22) {
                arg0.method5142();
            } else if (arg1 == 23) {
                arg0.method5137();
                arg0.method5137();
                arg0.method5137();
            } else if (arg1 == 24) {
                arg0.method5140();
                arg0.method5140();
            } else if (arg1 == 25) {
                arg0.method5154();
            } else if (arg1 == 28) {
                arg0.method5137();
            } else if (arg1 == 29) {
                this.field3229 = (class266) class205.method129(class266.method3865(), arg0.method5137());
            } else if (arg1 == 30) {
                this.field3227 = (class249) class205.method129(class249.method3717(), arg0.method5137());
            }
        }
    }

    @ObfuscatedName("io.d(I)V")
    public void method4074() {
        if (this.field3221 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3221.length; var1 += 2) {
            if (this.field3221[var1] < this.field3222) {
                this.field3222 = this.field3221[var1];
            } else if (this.field3221[var1] > this.field3224) {
                this.field3224 = this.field3221[var1];
            }
            if (this.field3221[var1 + 1] < this.field3223) {
                this.field3223 = this.field3221[var1 + 1];
            } else if (this.field3221[var1 + 1] > this.field3211) {
                this.field3211 = this.field3221[var1 + 1];
            }
        }
    }

    @ObfuscatedName("io.w(ZI)Lla;")
    public class335 method4075(boolean arg0) {
        int var2 = arg0 ? this.field3215 : this.field3225;
        return this.method4076(var2);
    }

    @ObfuscatedName("io.v(II)Lla;")
    public class335 method4076(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class335 var2 = (class335) field3212.method3146((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class335 var3 = class336.method3441(Statics.field3226, arg0, 0);
        if (var3 != null) {
            field3212.method3152(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("io.q(I)I")
    public int method4090() {
        return this.field3213;
    }

    @ObfuscatedName("fg.z(B)V")
    public static void method3235() {
        field3212.method3141();
    }
}
