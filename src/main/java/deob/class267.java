package deob;

@ObfuscatedName("jv")
public class class267 extends class206 {

    @ObfuscatedName("jv.p")
    public static boolean field3541 = false;

    @ObfuscatedName("jv.s")
    public static class201 field3542 = new class201(4096);

    @ObfuscatedName("jv.j")
    public static class201 field3499 = new class201(500);

    @ObfuscatedName("jv.a")
    public static class201 field3500 = new class201(30);

    @ObfuscatedName("jv.t")
    public static class201 field3537 = new class201(30);

    @ObfuscatedName("jv.r")
    public static class125[] field3502 = new class125[4];

    @ObfuscatedName("jv.m")
    public int field3503;

    @ObfuscatedName("jv.h")
    public int[] field3504;

    @ObfuscatedName("jv.o")
    public int[] field3505;

    @ObfuscatedName("jv.x")
    public String field3506 = "null";

    @ObfuscatedName("jv.q")
    public short[] field3507;

    @ObfuscatedName("jv.v")
    public short[] field3508;

    @ObfuscatedName("jv.n")
    public short[] field3509;

    @ObfuscatedName("jv.y")
    public short[] field3498;

    @ObfuscatedName("jv.d")
    public int field3511 = 1;

    @ObfuscatedName("jv.l")
    public int field3512 = 1;

    @ObfuscatedName("jv.f")
    public int field3513 = 2;

    @ObfuscatedName("jv.k")
    public boolean field3514 = true;

    @ObfuscatedName("jv.e")
    public int field3515 = -1;

    @ObfuscatedName("jv.u")
    public int field3516 = -1;

    @ObfuscatedName("jv.g")
    public boolean field3517 = false;

    @ObfuscatedName("jv.z")
    public boolean field3518 = false;

    @ObfuscatedName("jv.b")
    public int field3519 = -1;

    @ObfuscatedName("jv.c")
    public int field3520 = 16;

    @ObfuscatedName("jv.aa")
    public int field3521 = 0;

    @ObfuscatedName("jv.ap")
    public int field3531 = 0;

    @ObfuscatedName("jv.ao")
    public String[] field3501 = new String[5];

    @ObfuscatedName("jv.ar")
    public int field3543 = -1;

    @ObfuscatedName("jv.ay")
    public int field3525 = -1;

    @ObfuscatedName("jv.ax")
    public boolean field3526 = false;

    @ObfuscatedName("jv.ae")
    public boolean field3527 = true;

    @ObfuscatedName("jv.ah")
    public int field3534 = 128;

    @ObfuscatedName("jv.ai")
    public int field3524 = 128;

    @ObfuscatedName("jv.au")
    public int field3530 = 128;

    @ObfuscatedName("jv.am")
    public int field3523 = 0;

    @ObfuscatedName("jv.af")
    public int field3532 = 0;

    @ObfuscatedName("jv.an")
    public int field3533 = 0;

    @ObfuscatedName("jv.ag")
    public boolean field3496 = false;

    @ObfuscatedName("jv.av")
    public boolean field3535 = false;

    @ObfuscatedName("jv.aw")
    public int field3536 = -1;

    @ObfuscatedName("jv.ad")
    public int[] field3529;

    @ObfuscatedName("jv.ab")
    public int field3538 = -1;

    @ObfuscatedName("jv.aq")
    public int field3540 = -1;

    @ObfuscatedName("jv.ac")
    public int field3545 = -1;

    @ObfuscatedName("jv.ak")
    public int field3539 = 0;

    @ObfuscatedName("jv.az")
    public int field3522 = 0;

    @ObfuscatedName("jv.as")
    public int field3528 = 0;

    @ObfuscatedName("jv.at")
    public int[] field3544;

    @ObfuscatedName("jv.aj")
    public class198 field3510;

    @ObfuscatedName("dx.p(II)Ljv;")
    public static class267 method2363(int arg0) {
        class267 var1 = (class267) field3542.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1547.method4032(6, arg0);
        class267 var3 = new class267();
        var3.field3503 = arg0;
        if (var2 != null) {
            var3.method4462(new class185(var2));
        }
        var3.method4471();
        if (var3.field3535) {
            var3.field3513 = 0;
            var3.field3514 = false;
        }
        field3542.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.i(I)V")
    public void method4471() {
        if (this.field3515 == -1) {
            this.field3515 = 0;
            if (this.field3504 != null && (this.field3505 == null || this.field3505[0] == 10)) {
                this.field3515 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3501[var1] != null) {
                    this.field3515 = 1;
                }
            }
        }
        if (this.field3536 == -1) {
            this.field3536 = this.field3513 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jv.w(Lgj;I)V")
    public void method4462(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4463(arg0, var2);
        }
    }

    @ObfuscatedName("jv.s(Lgj;II)V")
    public void method4463(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3197();
            if (var3 > 0) {
                if (this.field3504 == null || field3541) {
                    this.field3505 = new int[var3];
                    this.field3504 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3504[var4] = arg0.method3124();
                        this.field3505[var4] = arg0.method3197();
                    }
                } else {
                    arg0.field2488 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3506 = arg0.method3131();
        } else if (arg1 == 5) {
            int var5 = arg0.method3197();
            if (var5 > 0) {
                if (this.field3504 == null || field3541) {
                    this.field3505 = null;
                    this.field3504 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3504[var6] = arg0.method3124();
                    }
                } else {
                    arg0.field2488 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3511 = arg0.method3197();
        } else if (arg1 == 15) {
            this.field3512 = arg0.method3197();
        } else if (arg1 == 17) {
            this.field3513 = 0;
            this.field3514 = false;
        } else if (arg1 == 18) {
            this.field3514 = false;
        } else if (arg1 == 19) {
            this.field3515 = arg0.method3197();
        } else if (arg1 == 21) {
            this.field3516 = 0;
        } else if (arg1 == 22) {
            this.field3517 = true;
        } else if (arg1 == 23) {
            this.field3518 = true;
        } else if (arg1 == 24) {
            this.field3519 = arg0.method3124();
            if (this.field3519 == 65535) {
                this.field3519 = -1;
            }
        } else if (arg1 == 27) {
            this.field3513 = 1;
        } else if (arg1 == 28) {
            this.field3520 = arg0.method3197();
        } else if (arg1 == 29) {
            this.field3521 = arg0.method3123();
        } else if (arg1 == 39) {
            this.field3531 = arg0.method3123() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3501[arg1 - 30] = arg0.method3131();
            if (this.field3501[arg1 - 30].equalsIgnoreCase(class237.field2937)) {
                this.field3501[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method3197();
            this.field3507 = new short[var7];
            this.field3508 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3507[var8] = (short) arg0.method3124();
                this.field3508[var8] = (short) arg0.method3124();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method3197();
            this.field3509 = new short[var9];
            this.field3498 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3509[var10] = (short) arg0.method3124();
                this.field3498[var10] = (short) arg0.method3124();
            }
        } else if (arg1 == 62) {
            this.field3526 = true;
        } else if (arg1 == 64) {
            this.field3527 = false;
        } else if (arg1 == 65) {
            this.field3534 = arg0.method3124();
        } else if (arg1 == 66) {
            this.field3524 = arg0.method3124();
        } else if (arg1 == 67) {
            this.field3530 = arg0.method3124();
        } else if (arg1 == 68) {
            this.field3525 = arg0.method3124();
        } else if (arg1 == 69) {
            arg0.method3197();
        } else if (arg1 == 70) {
            this.field3523 = arg0.method3125();
        } else if (arg1 == 71) {
            this.field3532 = arg0.method3125();
        } else if (arg1 == 72) {
            this.field3533 = arg0.method3125();
        } else if (arg1 == 73) {
            this.field3496 = true;
        } else if (arg1 == 74) {
            this.field3535 = true;
        } else if (arg1 == 75) {
            this.field3536 = arg0.method3197();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3538 = arg0.method3124();
            if (this.field3538 == 65535) {
                this.field3538 = -1;
            }
            this.field3540 = arg0.method3124();
            if (this.field3540 == 65535) {
                this.field3540 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3124();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method3197();
            this.field3529 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3529[var15] = arg0.method3124();
                if (this.field3529[var15] == 65535) {
                    this.field3529[var15] = -1;
                }
            }
            this.field3529[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3545 = arg0.method3124();
            this.field3539 = arg0.method3197();
        } else if (arg1 == 79) {
            this.field3522 = arg0.method3124();
            this.field3528 = arg0.method3124();
            this.field3539 = arg0.method3197();
            int var11 = arg0.method3197();
            this.field3544 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3544[var12] = arg0.method3124();
            }
        } else if (arg1 == 81) {
            this.field3516 = arg0.method3197() * 256;
        } else if (arg1 == 82) {
            this.field3543 = arg0.method3124();
        } else if (arg1 == 249) {
            this.field3510 = class261.method3985(arg0, this.field3510);
        }
    }

    @ObfuscatedName("jv.j(II)Z")
    public final boolean method4441(int arg0) {
        if (this.field3505 != null) {
            for (int var4 = 0; var4 < this.field3505.length; var4++) {
                if (this.field3505[var4] == arg0) {
                    return Statics.field3497.method4034(this.field3504[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3504 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3504.length; var3++) {
                var2 &= Statics.field3497.method4034(this.field3504[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jv.a(I)Z")
    public final boolean method4472() {
        if (this.field3504 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3504.length; var2++) {
            var1 &= Statics.field3497.method4034(this.field3504[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jv.t(II[[IIIII)Lec;")
    public final class139 method4434(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3505 == null) {
            var7 = (long) ((this.field3503 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3503 << 10) + (arg0 << 3) + arg1);
        }
        class139 var9 = (class139) field3500.method3504(var7);
        if (var9 == null) {
            class125 var10 = this.method4437(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3517) {
                var10.field1705 = (short) (this.field3521 + 64);
                var10.field1706 = (short) (this.field3531 + 768);
                var10.method2387();
                var9 = var10;
            } else {
                var9 = var10.method2391(this.field3521 + 64, this.field3531 + 768, -50, -10, -50);
            }
            field3500.method3506(var9, var7);
        }
        if (this.field3517) {
            var9 = ((class125) var9).method2376();
        }
        if (this.field3516 >= 0) {
            if (var9 instanceof class131) {
                var9 = ((class131) var9).method2471(arg2, arg3, arg4, arg5, true, this.field3516);
            } else if (var9 instanceof class125) {
                var9 = ((class125) var9).method2399(arg2, arg3, arg4, arg5, true, this.field3516);
            }
        }
        return var9;
    }

    @ObfuscatedName("jv.r(II[[IIIII)Len;")
    public final class131 method4449(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3505 == null) {
            var7 = (long) ((this.field3503 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3503 << 10) + (arg0 << 3) + arg1);
        }
        class131 var9 = (class131) field3537.method3504(var7);
        if (var9 == null) {
            class125 var10 = this.method4437(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2391(this.field3521 + 64, this.field3531 + 768, -50, -10, -50);
            field3537.method3506(var9, var7);
        }
        if (this.field3516 >= 0) {
            var9 = var9.method2471(arg2, arg3, arg4, arg5, true, this.field3516);
        }
        return var9;
    }

    @ObfuscatedName("jv.m(II[[IIIILjm;II)Len;")
    public final class131 method4436(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class272 arg6, int arg7) {
        long var9;
        if (this.field3505 == null) {
            var9 = (long) ((this.field3503 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3503 << 10) + (arg0 << 3) + arg1);
        }
        class131 var11 = (class131) field3537.method3504(var9);
        if (var11 == null) {
            class125 var12 = this.method4437(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2391(this.field3521 + 64, this.field3531 + 768, -50, -10, -50);
            field3537.method3506(var11, var9);
        }
        if (arg6 == null && this.field3516 == -1) {
            return var11;
        }
        class131 var13;
        if (arg6 == null) {
            var13 = var11.method2462(true);
        } else {
            var13 = arg6.method4599(var11, arg7, arg1);
        }
        if (this.field3516 >= 0) {
            var13 = var13.method2471(arg2, arg3, arg4, arg5, false, this.field3516);
        }
        return var13;
    }

    @ObfuscatedName("jv.h(III)Ldy;")
    public final class125 method4437(int arg0, int arg1) {
        class125 var3 = null;
        if (this.field3505 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3504 == null) {
                return null;
            }
            boolean var4 = this.field3526;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3504.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3504[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class125) field3499.method3504((long) var7);
                if (var3 == null) {
                    var3 = class125.method2372(Statics.field3497, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2402();
                    }
                    field3499.method3506(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3502[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class125(field3502, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3505.length; var9++) {
                if (this.field3505[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3504[var8];
            boolean var11 = this.field3526 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class125) field3499.method3504((long) var10);
            if (var3 == null) {
                var3 = class125.method2372(Statics.field3497, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2402();
                }
                field3499.method3506(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3534 == 128 && this.field3524 == 128 && this.field3530 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3523 == 0 && this.field3532 == 0 && this.field3533 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class125 var14 = new class125(var3, arg1 == 0 && !var12 && !var13, this.field3507 == null, this.field3509 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2381(256);
            var14.method2377(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2413();
        } else if (var15 == 2) {
            var14.method2379();
        } else if (var15 == 3) {
            var14.method2380();
        }
        if (this.field3507 != null) {
            for (int var16 = 0; var16 < this.field3507.length; var16++) {
                var14.method2383(this.field3507[var16], this.field3508[var16]);
            }
        }
        if (this.field3509 != null) {
            for (int var17 = 0; var17 < this.field3509.length; var17++) {
                var14.method2384(this.field3509[var17], this.field3498[var17]);
            }
        }
        if (var12) {
            var14.method2382(this.field3534, this.field3524, this.field3530);
        }
        if (var13) {
            var14.method2377(this.field3523, this.field3532, this.field3533);
        }
        return var14;
    }

    @ObfuscatedName("jv.o(B)Ljv;")
    public final class267 method4438() {
        int var1 = -1;
        if (this.field3538 != -1) {
            var1 = class223.method3012(this.field3538);
        } else if (this.field3540 != -1) {
            var1 = class223.field2691[this.field3540];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3529.length - 1) {
            var2 = this.field3529[var1];
        } else {
            var2 = this.field3529[this.field3529.length - 1];
        }
        return var2 == -1 ? null : method2363(var2);
    }

    @ObfuscatedName("jv.x(IIB)I")
    public int method4439(int arg0, int arg1) {
        return class261.method3004(this.field3510, arg0, arg1);
    }

    @ObfuscatedName("jv.q(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4440(int arg0, String arg1) {
        return class261.method997(this.field3510, arg0, arg1);
    }

    @ObfuscatedName("jv.l(I)Z")
    public boolean method4467() {
        if (this.field3529 == null) {
            return this.field3545 != -1 || this.field3544 != null;
        }
        for (int var1 = 0; var1 < this.field3529.length; var1++) {
            if (this.field3529[var1] != -1) {
                class267 var2 = method2363(this.field3529[var1]);
                if (var2.field3545 != -1 || var2.field3544 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
