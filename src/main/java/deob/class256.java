package deob;

@ObfuscatedName("it")
public class class256 extends class195 {

    @ObfuscatedName("it.c")
    public static boolean field3429 = false;

    @ObfuscatedName("it.u")
    public static class190 field3413 = new class190(4096);

    @ObfuscatedName("it.g")
    public static class190 field3444 = new class190(500);

    @ObfuscatedName("it.m")
    public static class190 field3415 = new class190(30);

    @ObfuscatedName("it.s")
    public static class190 field3414 = new class190(30);

    @ObfuscatedName("it.x")
    public static class128[] field3462 = new class128[4];

    @ObfuscatedName("it.p")
    public int field3418;

    @ObfuscatedName("it.k")
    public int[] field3447;

    @ObfuscatedName("it.r")
    public int[] field3420;

    @ObfuscatedName("it.w")
    public String field3458 = "null";

    @ObfuscatedName("it.v")
    public short[] field3422;

    @ObfuscatedName("it.h")
    public short[] field3423;

    @ObfuscatedName("it.t")
    public short[] field3427;

    @ObfuscatedName("it.a")
    public short[] field3411;

    @ObfuscatedName("it.e")
    public int field3426 = 1;

    @ObfuscatedName("it.y")
    public int field3425 = 1;

    @ObfuscatedName("it.l")
    public int field3428 = 2;

    @ObfuscatedName("it.q")
    public boolean field3440 = true;

    @ObfuscatedName("it.f")
    public int field3430 = -1;

    @ObfuscatedName("it.j")
    public int field3431 = -1;

    @ObfuscatedName("it.n")
    public boolean field3435 = false;

    @ObfuscatedName("it.z")
    public boolean field3433 = false;

    @ObfuscatedName("it.b")
    public int field3434 = -1;

    @ObfuscatedName("it.d")
    public int field3448 = 16;

    @ObfuscatedName("it.ap")
    public int field3436 = 0;

    @ObfuscatedName("it.aj")
    public int field3437 = 0;

    @ObfuscatedName("it.am")
    public String[] field3438 = new String[5];

    @ObfuscatedName("it.ag")
    public int field3439 = -1;

    @ObfuscatedName("it.av")
    public int field3421 = -1;

    @ObfuscatedName("it.al")
    public boolean field3461 = false;

    @ObfuscatedName("it.ab")
    public boolean field3442 = true;

    @ObfuscatedName("it.af")
    public int field3443 = 128;

    @ObfuscatedName("it.ak")
    public int field3446 = 128;

    @ObfuscatedName("it.ar")
    public int field3445 = 128;

    @ObfuscatedName("it.an")
    public int field3441 = 0;

    @ObfuscatedName("it.at")
    public int field3424 = 0;

    @ObfuscatedName("it.aw")
    public int field3417 = 0;

    @ObfuscatedName("it.ad")
    public boolean field3449 = false;

    @ObfuscatedName("it.ac")
    public boolean field3450 = false;

    @ObfuscatedName("it.ae")
    public int field3432 = -1;

    @ObfuscatedName("it.ah")
    public int[] field3452;

    @ObfuscatedName("it.ax")
    public int field3453 = -1;

    @ObfuscatedName("it.ai")
    public int field3454 = -1;

    @ObfuscatedName("it.aa")
    public int field3455 = -1;

    @ObfuscatedName("it.aq")
    public int field3456 = 0;

    @ObfuscatedName("it.as")
    public int field3457 = 0;

    @ObfuscatedName("it.au")
    public int field3419 = 0;

    @ObfuscatedName("it.az")
    public int[] field3459;

    @ObfuscatedName("it.ay")
    public class187 field3460;

    @ObfuscatedName("ff.c(IS)Lit;")
    public static class256 method2825(int arg0) {
        class256 var1 = (class256) field3413.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3412.method3741(6, arg0);
        class256 var3 = new class256();
        var3.field3418 = arg0;
        if (var2 != null) {
            var3.method4093(new class174(var2));
        }
        var3.method4092();
        if (var3.field3450) {
            var3.field3428 = 0;
            var3.field3440 = false;
        }
        field3413.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.o(I)V")
    public void method4092() {
        if (this.field3430 == -1) {
            this.field3430 = 0;
            if (this.field3447 != null && (this.field3420 == null || this.field3420[0] == 10)) {
                this.field3430 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3438[var1] != null) {
                    this.field3430 = 1;
                }
            }
        }
        if (this.field3432 == -1) {
            this.field3432 = this.field3428 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("it.i(Lfp;I)V")
    public void method4093(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method4094(arg0, var2);
        }
    }

    @ObfuscatedName("it.u(Lfp;IB)V")
    public void method4094(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2843();
            if (var3 > 0) {
                if (this.field3447 == null || field3429) {
                    this.field3420 = new int[var3];
                    this.field3447 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3447[var4] = arg0.method2861();
                        this.field3420[var4] = arg0.method2843();
                    }
                } else {
                    arg0.field2357 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3458 = arg0.method2867();
        } else if (arg1 == 5) {
            int var5 = arg0.method2843();
            if (var5 > 0) {
                if (this.field3447 == null || field3429) {
                    this.field3420 = null;
                    this.field3447 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3447[var6] = arg0.method2861();
                    }
                } else {
                    arg0.field2357 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3426 = arg0.method2843();
        } else if (arg1 == 15) {
            this.field3425 = arg0.method2843();
        } else if (arg1 == 17) {
            this.field3428 = 0;
            this.field3440 = false;
        } else if (arg1 == 18) {
            this.field3440 = false;
        } else if (arg1 == 19) {
            this.field3430 = arg0.method2843();
        } else if (arg1 == 21) {
            this.field3431 = 0;
        } else if (arg1 == 22) {
            this.field3435 = true;
        } else if (arg1 == 23) {
            this.field3433 = true;
        } else if (arg1 == 24) {
            this.field3434 = arg0.method2861();
            if (this.field3434 == 65535) {
                this.field3434 = -1;
            }
        } else if (arg1 == 27) {
            this.field3428 = 1;
        } else if (arg1 == 28) {
            this.field3448 = arg0.method2843();
        } else if (arg1 == 29) {
            this.field3436 = arg0.method3014();
        } else if (arg1 == 39) {
            this.field3437 = arg0.method3014() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3438[arg1 - 30] = arg0.method2867();
            if (this.field3438[arg1 - 30].equalsIgnoreCase(class226.field2875)) {
                this.field3438[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2843();
            this.field3422 = new short[var7];
            this.field3423 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3422[var8] = (short) arg0.method2861();
                this.field3423[var8] = (short) arg0.method2861();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2843();
            this.field3427 = new short[var9];
            this.field3411 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3427[var10] = (short) arg0.method2861();
                this.field3411[var10] = (short) arg0.method2861();
            }
        } else if (arg1 == 62) {
            this.field3461 = true;
        } else if (arg1 == 64) {
            this.field3442 = false;
        } else if (arg1 == 65) {
            this.field3443 = arg0.method2861();
        } else if (arg1 == 66) {
            this.field3446 = arg0.method2861();
        } else if (arg1 == 67) {
            this.field3445 = arg0.method2861();
        } else if (arg1 == 68) {
            this.field3421 = arg0.method2861();
        } else if (arg1 == 69) {
            arg0.method2843();
        } else if (arg1 == 70) {
            this.field3441 = arg0.method3061();
        } else if (arg1 == 71) {
            this.field3424 = arg0.method3061();
        } else if (arg1 == 72) {
            this.field3417 = arg0.method3061();
        } else if (arg1 == 73) {
            this.field3449 = true;
        } else if (arg1 == 74) {
            this.field3450 = true;
        } else if (arg1 == 75) {
            this.field3432 = arg0.method2843();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3453 = arg0.method2861();
            if (this.field3453 == 65535) {
                this.field3453 = -1;
            }
            this.field3454 = arg0.method2861();
            if (this.field3454 == 65535) {
                this.field3454 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2861();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2843();
            this.field3452 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3452[var15] = arg0.method2861();
                if (this.field3452[var15] == 65535) {
                    this.field3452[var15] = -1;
                }
            }
            this.field3452[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3455 = arg0.method2861();
            this.field3456 = arg0.method2843();
        } else if (arg1 == 79) {
            this.field3457 = arg0.method2861();
            this.field3419 = arg0.method2861();
            this.field3456 = arg0.method2843();
            int var11 = arg0.method2843();
            this.field3459 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3459[var12] = arg0.method2861();
            }
        } else if (arg1 == 81) {
            this.field3431 = arg0.method2843() * 256;
        } else if (arg1 == 82) {
            this.field3439 = arg0.method2861();
        } else if (arg1 == 249) {
            this.field3460 = class250.method558(arg0, this.field3460);
        }
    }

    @ObfuscatedName("it.g(IB)Z")
    public final boolean method4095(int arg0) {
        if (this.field3420 != null) {
            for (int var4 = 0; var4 < this.field3420.length; var4++) {
                if (this.field3420[var4] == arg0) {
                    return Statics.field512.method3716(this.field3447[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3447 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3447.length; var3++) {
                var2 &= Statics.field512.method3716(this.field3447[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("it.m(I)Z")
    public final boolean method4096() {
        if (this.field3447 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3447.length; var2++) {
            var1 &= Statics.field512.method3716(this.field3447[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("it.s(II[[IIIII)Lev;")
    public final class142 method4097(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3420 == null) {
            var7 = (long) ((this.field3418 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3418 << 10) + (arg0 << 3) + arg1);
        }
        class142 var9 = (class142) field3415.method3220(var7);
        if (var9 == null) {
            class128 var10 = this.method4100(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3435) {
                var10.field1764 = (short) (this.field3436 + 64);
                var10.field1772 = (short) (this.field3437 + 768);
                var10.method2157();
                var9 = var10;
            } else {
                var9 = var10.method2142(this.field3436 + 64, this.field3437 + 768, -50, -10, -50);
            }
            field3415.method3233(var9, var7);
        }
        if (this.field3435) {
            var9 = ((class128) var9).method2206();
        }
        if (this.field3431 >= 0) {
            if (var9 instanceof class134) {
                var9 = ((class134) var9).method2284(arg2, arg3, arg4, arg5, true, this.field3431);
            } else if (var9 instanceof class128) {
                var9 = ((class128) var9).method2146(arg2, arg3, arg4, arg5, true, this.field3431);
            }
        }
        return var9;
    }

    @ObfuscatedName("it.x(II[[IIIII)Leo;")
    public final class134 method4098(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3420 == null) {
            var7 = (long) ((this.field3418 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3418 << 10) + (arg0 << 3) + arg1);
        }
        class134 var9 = (class134) field3414.method3220(var7);
        if (var9 == null) {
            class128 var10 = this.method4100(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2142(this.field3436 + 64, this.field3437 + 768, -50, -10, -50);
            field3414.method3233(var9, var7);
        }
        if (this.field3431 >= 0) {
            var9 = var9.method2284(arg2, arg3, arg4, arg5, true, this.field3431);
        }
        return var9;
    }

    @ObfuscatedName("it.p(II[[IIIILjc;IB)Leo;")
    public final class134 method4099(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class261 arg6, int arg7) {
        long var9;
        if (this.field3420 == null) {
            var9 = (long) ((this.field3418 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3418 << 10) + (arg0 << 3) + arg1);
        }
        class134 var11 = (class134) field3414.method3220(var9);
        if (var11 == null) {
            class128 var12 = this.method4100(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2142(this.field3436 + 64, this.field3437 + 768, -50, -10, -50);
            field3414.method3233(var11, var9);
        }
        if (arg6 == null && this.field3431 == -1) {
            return var11;
        }
        class134 var13;
        if (arg6 == null) {
            var13 = var11.method2236(true);
        } else {
            var13 = arg6.method4271(var11, arg7, arg1);
        }
        if (this.field3431 >= 0) {
            var13 = var13.method2284(arg2, arg3, arg4, arg5, false, this.field3431);
        }
        return var13;
    }

    @ObfuscatedName("it.k(IIB)Ldj;")
    public final class128 method4100(int arg0, int arg1) {
        class128 var3 = null;
        if (this.field3420 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3447 == null) {
                return null;
            }
            boolean var4 = this.field3461;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3447.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3447[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class128) field3444.method3220((long) var7);
                if (var3 == null) {
                    var3 = class128.method2138(Statics.field512, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2155();
                    }
                    field3444.method3233(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3462[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class128(field3462, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3420.length; var9++) {
                if (this.field3420[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3447[var8];
            boolean var11 = this.field3461 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class128) field3444.method3220((long) var10);
            if (var3 == null) {
                var3 = class128.method2138(Statics.field512, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2155();
                }
                field3444.method3233(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3443 == 128 && this.field3446 == 128 && this.field3445 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3441 == 0 && this.field3424 == 0 && this.field3417 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class128 var14 = new class128(var3, arg1 == 0 && !var12 && !var13, this.field3422 == null, this.field3427 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2186(256);
            var14.method2152(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2148();
        } else if (var15 == 2) {
            var14.method2149();
        } else if (var15 == 3) {
            var14.method2150();
        }
        if (this.field3422 != null) {
            for (int var16 = 0; var16 < this.field3422.length; var16++) {
                var14.method2153(this.field3422[var16], this.field3423[var16]);
            }
        }
        if (this.field3427 != null) {
            for (int var17 = 0; var17 < this.field3427.length; var17++) {
                var14.method2154(this.field3427[var17], this.field3411[var17]);
            }
        }
        if (var12) {
            var14.method2156(this.field3443, this.field3446, this.field3445);
        }
        if (var13) {
            var14.method2152(this.field3441, this.field3424, this.field3417);
        }
        return var14;
    }

    @ObfuscatedName("it.r(I)Lit;")
    public final class256 method4115() {
        int var1 = -1;
        if (this.field3453 != -1) {
            var1 = class212.method117(this.field3453);
        } else if (this.field3454 != -1) {
            var1 = class212.field2573[this.field3454];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3452.length - 1) {
            var2 = this.field3452[var1];
        } else {
            var2 = this.field3452[this.field3452.length - 1];
        }
        return var2 == -1 ? null : method2825(var2);
    }

    @ObfuscatedName("it.w(IIB)I")
    public int method4126(int arg0, int arg1) {
        return class250.method1861(this.field3460, arg0, arg1);
    }

    @ObfuscatedName("it.v(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4135(int arg0, String arg1) {
        return class250.method3707(this.field3460, arg0, arg1);
    }

    @ObfuscatedName("it.h(I)Z")
    public boolean method4104() {
        if (this.field3452 == null) {
            return this.field3455 != -1 || this.field3459 != null;
        }
        for (int var1 = 0; var1 < this.field3452.length; var1++) {
            if (this.field3452[var1] != -1) {
                class256 var2 = method2825(this.field3452[var1]);
                if (var2.field3455 != -1 || var2.field3459 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
