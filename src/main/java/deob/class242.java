package deob;

@ObfuscatedName("is")
public class class242 extends class176 {

    @ObfuscatedName("is.g")
    public static class146 field3220 = new class146(256);

    @ObfuscatedName("is.z")
    public final int field3221;

    @ObfuscatedName("is.p")
    public int field3233 = -1;

    @ObfuscatedName("is.h")
    public int field3223 = -1;

    @ObfuscatedName("is.y")
    public String field3224;

    @ObfuscatedName("is.w")
    public int field3228;

    @ObfuscatedName("is.i")
    public int field3226 = 0;

    @ObfuscatedName("is.x")
    public String[] field3219 = new String[5];

    @ObfuscatedName("is.o")
    public String field3232;

    @ObfuscatedName("is.e")
    public int[] field3229;

    @ObfuscatedName("is.n")
    public int field3237 = Integer.MAX_VALUE;

    @ObfuscatedName("is.r")
    public int field3231 = Integer.MAX_VALUE;

    @ObfuscatedName("is.c")
    public int field3235 = Integer.MIN_VALUE;

    @ObfuscatedName("is.a")
    public int field3227 = Integer.MIN_VALUE;

    @ObfuscatedName("is.d")
    public class256 field3234 = class256.field3460;

    @ObfuscatedName("is.s")
    public class239 field3225 = class239.field3199;

    @ObfuscatedName("is.t")
    public int[] field3236;

    @ObfuscatedName("is.m")
    public byte[] field3218;

    @ObfuscatedName("is.v")
    public int field3238 = -1;

    public class242(int arg0) {
        this.field3221 = arg0;
    }

    @ObfuscatedName("cj.u(IS)Lis;")
    public static class242 method2014(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3230.length || Statics.field3230[arg0] == null ? new class242(arg0) : Statics.field3230[arg0];
    }

    @ObfuscatedName("is.f(Lkg;I)V")
    public void method4054(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4055(arg0, var2);
        }
    }

    @ObfuscatedName("is.b(Lkg;II)V")
    public void method4055(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3233 = arg0.method5155();
        } else if (arg1 == 2) {
            this.field3223 = arg0.method5155();
        } else if (arg1 == 3) {
            this.field3224 = arg0.method5147();
        } else if (arg1 == 4) {
            this.field3228 = arg0.method5287();
        } else if (arg1 == 5) {
            arg0.method5287();
        } else if (arg1 == 6) {
            this.field3226 = arg0.method5138();
        } else if (arg1 == 7) {
            int var3 = arg0.method5138();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5138();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3219[arg1 - 10] = arg0.method5147();
        } else if (arg1 == 15) {
            int var4 = arg0.method5138();
            this.field3229 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3229[var5] = arg0.method5141();
            }
            arg0.method5277();
            int var6 = arg0.method5138();
            this.field3236 = new int[var6];
            for (int var7 = 0; var7 < this.field3236.length; var7++) {
                this.field3236[var7] = arg0.method5277();
            }
            this.field3218 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3218[var8] = arg0.method5139();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3232 = arg0.method5147();
            } else if (arg1 == 18) {
                arg0.method5155();
            } else if (arg1 == 19) {
                this.field3238 = arg0.method5337();
            } else if (arg1 == 21) {
                arg0.method5277();
            } else if (arg1 == 22) {
                arg0.method5277();
            } else if (arg1 == 23) {
                arg0.method5138();
                arg0.method5138();
                arg0.method5138();
            } else if (arg1 == 24) {
                arg0.method5141();
                arg0.method5141();
            } else if (arg1 == 25) {
                arg0.method5155();
            } else if (arg1 == 28) {
                arg0.method5138();
            } else if (arg1 == 29) {
                class256[] var9 = new class256[] { class256.field3459, class256.field3463, class256.field3460 };
                this.field3234 = (class256) class196.method3304(var9, arg0.method5138());
            } else if (arg1 == 30) {
                this.field3225 = (class239) class196.method3304(class239.method1026(), arg0.method5138());
            }
        }
    }

    @ObfuscatedName("is.g(I)V")
    public void method4056() {
        if (this.field3229 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3229.length; var1 += 2) {
            if (this.field3229[var1] < this.field3237) {
                this.field3237 = this.field3229[var1];
            } else if (this.field3229[var1] > this.field3235) {
                this.field3235 = this.field3229[var1];
            }
            if (this.field3229[var1 + 1] < this.field3231) {
                this.field3231 = this.field3229[var1 + 1];
            } else if (this.field3229[var1 + 1] > this.field3227) {
                this.field3227 = this.field3229[var1 + 1];
            }
        }
    }

    @ObfuscatedName("is.z(ZI)Lln;")
    public class325 method4057(boolean arg0) {
        int var2 = arg0 ? this.field3223 : this.field3233;
        return this.method4074(var2);
    }

    @ObfuscatedName("is.p(IB)Lln;")
    public class325 method4074(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class325 var2 = (class325) field3220.method3076((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class325 var3 = class326.method4926(Statics.field2764, arg0, 0);
        if (var3 != null) {
            field3220.method3078(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("is.h(S)I")
    public int method4058() {
        return this.field3221;
    }

    @ObfuscatedName("ej.y(I)V")
    public static void method3047() {
        field3220.method3075();
    }
}
