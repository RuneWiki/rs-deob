package deob;

@ObfuscatedName("ia")
public class class257 extends class196 {

    @ObfuscatedName("ia.e")
    public static boolean field3453 = false;

    @ObfuscatedName("ia.y")
    public static class191 field3429 = new class191(4096);

    @ObfuscatedName("ia.w")
    public static class191 field3438 = new class191(500);

    @ObfuscatedName("ia.k")
    public static class191 field3431 = new class191(30);

    @ObfuscatedName("ia.v")
    public static class191 field3467 = new class191(30);

    @ObfuscatedName("ia.z")
    public static class129[] field3433 = new class129[4];

    @ObfuscatedName("ia.r")
    public int field3428;

    @ObfuscatedName("ia.u")
    public int[] field3435;

    @ObfuscatedName("ia.d")
    public int[] field3461;

    @ObfuscatedName("ia.o")
    public String field3437 = "null";

    @ObfuscatedName("ia.l")
    public short[] field3455;

    @ObfuscatedName("ia.h")
    public short[] field3439;

    @ObfuscatedName("ia.s")
    public short[] field3440;

    @ObfuscatedName("ia.c")
    public short[] field3441;

    @ObfuscatedName("ia.m")
    public int field3476 = 1;

    @ObfuscatedName("ia.a")
    public int field3443 = 1;

    @ObfuscatedName("ia.t")
    public int field3442 = 2;

    @ObfuscatedName("ia.p")
    public boolean field3434 = true;

    @ObfuscatedName("ia.f")
    public int field3436 = -1;

    @ObfuscatedName("ia.b")
    public int field3447 = -1;

    @ObfuscatedName("ia.x")
    public boolean field3448 = false;

    @ObfuscatedName("ia.i")
    public boolean field3454 = false;

    @ObfuscatedName("ia.j")
    public int field3450 = -1;

    @ObfuscatedName("ia.q")
    public int field3430 = 16;

    @ObfuscatedName("ia.ag")
    public int field3451 = 0;

    @ObfuscatedName("ia.ay")
    public int field3444 = 0;

    @ObfuscatedName("ia.au")
    public String[] field3427 = new String[5];

    @ObfuscatedName("ia.ah")
    public int field3457 = -1;

    @ObfuscatedName("ia.ao")
    public int field3445 = -1;

    @ObfuscatedName("ia.al")
    public boolean field3449 = false;

    @ObfuscatedName("ia.ae")
    public boolean field3472 = true;

    @ObfuscatedName("ia.ax")
    public int field3459 = 128;

    @ObfuscatedName("ia.az")
    public int field3460 = 128;

    @ObfuscatedName("ia.aw")
    public int field3456 = 128;

    @ObfuscatedName("ia.av")
    public int field3470 = 0;

    @ObfuscatedName("ia.ac")
    public int field3463 = 0;

    @ObfuscatedName("ia.ak")
    public int field3464 = 0;

    @ObfuscatedName("ia.ad")
    public boolean field3465 = false;

    @ObfuscatedName("ia.at")
    public boolean field3466 = false;

    @ObfuscatedName("ia.af")
    public int field3452 = -1;

    @ObfuscatedName("ia.am")
    public int[] field3468;

    @ObfuscatedName("ia.aq")
    public int field3469 = -1;

    @ObfuscatedName("ia.as")
    public int field3432 = -1;

    @ObfuscatedName("ia.ab")
    public int field3471 = -1;

    @ObfuscatedName("ia.ap")
    public int field3458 = 0;

    @ObfuscatedName("ia.ai")
    public int field3473 = 0;

    @ObfuscatedName("ia.an")
    public int field3474 = 0;

    @ObfuscatedName("ia.ar")
    public int[] field3475;

    @ObfuscatedName("ia.aj")
    public class188 field3446;

    @ObfuscatedName("ao.e(IB)Lia;")
    public static class257 method247(int arg0) {
        class257 var1 = (class257) field3429.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3669.method3817(6, arg0);
        class257 var3 = new class257();
        var3.field3428 = arg0;
        if (var2 != null) {
            var3.method4221(new class175(var2));
        }
        var3.method4255();
        if (var3.field3466) {
            var3.field3442 = 0;
            var3.field3434 = false;
        }
        field3429.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.n(S)V")
    public void method4255() {
        if (this.field3436 == -1) {
            this.field3436 = 0;
            if (this.field3435 != null && (this.field3461 == null || this.field3461[0] == 10)) {
                this.field3436 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3427[var1] != null) {
                    this.field3436 = 1;
                }
            }
        }
        if (this.field3452 == -1) {
            this.field3452 = this.field3442 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ia.g(Lfh;B)V")
    public void method4221(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4263(arg0, var2);
        }
    }

    @ObfuscatedName("ia.y(Lfh;II)V")
    public void method4263(class175 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2928();
            if (var3 > 0) {
                if (this.field3435 == null || field3453) {
                    this.field3461 = new int[var3];
                    this.field3435 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3435[var4] = arg0.method3091();
                        this.field3461[var4] = arg0.method2928();
                    }
                } else {
                    arg0.field2381 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3437 = arg0.method3113();
        } else if (arg1 == 5) {
            int var5 = arg0.method2928();
            if (var5 > 0) {
                if (this.field3435 == null || field3453) {
                    this.field3461 = null;
                    this.field3435 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3435[var6] = arg0.method3091();
                    }
                } else {
                    arg0.field2381 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3476 = arg0.method2928();
        } else if (arg1 == 15) {
            this.field3443 = arg0.method2928();
        } else if (arg1 == 17) {
            this.field3442 = 0;
            this.field3434 = false;
        } else if (arg1 == 18) {
            this.field3434 = false;
        } else if (arg1 == 19) {
            this.field3436 = arg0.method2928();
        } else if (arg1 == 21) {
            this.field3447 = 0;
        } else if (arg1 == 22) {
            this.field3448 = true;
        } else if (arg1 == 23) {
            this.field3454 = true;
        } else if (arg1 == 24) {
            this.field3450 = arg0.method3091();
            if (this.field3450 == 65535) {
                this.field3450 = -1;
            }
        } else if (arg1 == 27) {
            this.field3442 = 1;
        } else if (arg1 == 28) {
            this.field3430 = arg0.method2928();
        } else if (arg1 == 29) {
            this.field3451 = arg0.method2998();
        } else if (arg1 == 39) {
            this.field3444 = arg0.method2998() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3427[arg1 - 30] = arg0.method3113();
            if (this.field3427[arg1 - 30].equalsIgnoreCase(class227.field2829)) {
                this.field3427[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2928();
            this.field3455 = new short[var7];
            this.field3439 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3455[var8] = (short) arg0.method3091();
                this.field3439[var8] = (short) arg0.method3091();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2928();
            this.field3440 = new short[var9];
            this.field3441 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3440[var10] = (short) arg0.method3091();
                this.field3441[var10] = (short) arg0.method3091();
            }
        } else if (arg1 == 62) {
            this.field3449 = true;
        } else if (arg1 == 64) {
            this.field3472 = false;
        } else if (arg1 == 65) {
            this.field3459 = arg0.method3091();
        } else if (arg1 == 66) {
            this.field3460 = arg0.method3091();
        } else if (arg1 == 67) {
            this.field3456 = arg0.method3091();
        } else if (arg1 == 68) {
            this.field3445 = arg0.method3091();
        } else if (arg1 == 69) {
            arg0.method2928();
        } else if (arg1 == 70) {
            this.field3470 = arg0.method2931();
        } else if (arg1 == 71) {
            this.field3463 = arg0.method2931();
        } else if (arg1 == 72) {
            this.field3464 = arg0.method2931();
        } else if (arg1 == 73) {
            this.field3465 = true;
        } else if (arg1 == 74) {
            this.field3466 = true;
        } else if (arg1 == 75) {
            this.field3452 = arg0.method2928();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3469 = arg0.method3091();
            if (this.field3469 == 65535) {
                this.field3469 = -1;
            }
            this.field3432 = arg0.method3091();
            if (this.field3432 == 65535) {
                this.field3432 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3091();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2928();
            this.field3468 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3468[var15] = arg0.method3091();
                if (this.field3468[var15] == 65535) {
                    this.field3468[var15] = -1;
                }
            }
            this.field3468[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3471 = arg0.method3091();
            this.field3458 = arg0.method2928();
        } else if (arg1 == 79) {
            this.field3473 = arg0.method3091();
            this.field3474 = arg0.method3091();
            this.field3458 = arg0.method2928();
            int var11 = arg0.method2928();
            this.field3475 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3475[var12] = arg0.method3091();
            }
        } else if (arg1 == 81) {
            this.field3447 = arg0.method2928() * 256;
        } else if (arg1 == 82) {
            this.field3457 = arg0.method3091();
        } else if (arg1 == 249) {
            this.field3446 = class251.method990(arg0, this.field3446);
        }
    }

    @ObfuscatedName("ia.w(II)Z")
    public final boolean method4223(int arg0) {
        if (this.field3461 != null) {
            for (int var4 = 0; var4 < this.field3461.length; var4++) {
                if (this.field3461[var4] == arg0) {
                    return Statics.field3462.method3819(this.field3435[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3435 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3435.length; var3++) {
                var2 &= Statics.field3462.method3819(this.field3435[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ia.k(B)Z")
    public final boolean method4265() {
        if (this.field3435 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3435.length; var2++) {
            var1 &= Statics.field3462.method3819(this.field3435[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ia.v(II[[IIIII)Leg;")
    public final class143 method4225(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3461 == null) {
            var7 = (long) ((this.field3428 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3428 << 10) + (arg0 << 3) + arg1);
        }
        class143 var9 = (class143) field3431.method3288(var7);
        if (var9 == null) {
            class129 var10 = this.method4228(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3448) {
                var10.field1815 = (short) (this.field3451 + 64);
                var10.field1781 = (short) (this.field3444 + 768);
                var10.method2285();
                var9 = var10;
            } else {
                var9 = var10.method2242(this.field3451 + 64, this.field3444 + 768, -50, -10, -50);
            }
            field3431.method3278(var9, var7);
        }
        if (this.field3448) {
            var9 = ((class129) var9).method2226();
        }
        if (this.field3447 >= 0) {
            if (var9 instanceof class135) {
                var9 = ((class135) var9).method2346(arg2, arg3, arg4, arg5, true, this.field3447);
            } else if (var9 instanceof class129) {
                var9 = ((class129) var9).method2227(arg2, arg3, arg4, arg5, true, this.field3447);
            }
        }
        return var9;
    }

    @ObfuscatedName("ia.z(II[[IIIIB)Lew;")
    public final class135 method4226(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3461 == null) {
            var7 = (long) ((this.field3428 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3428 << 10) + (arg0 << 3) + arg1);
        }
        class135 var9 = (class135) field3467.method3288(var7);
        if (var9 == null) {
            class129 var10 = this.method4228(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2242(this.field3451 + 64, this.field3444 + 768, -50, -10, -50);
            field3467.method3278(var9, var7);
        }
        if (this.field3447 >= 0) {
            var9 = var9.method2346(arg2, arg3, arg4, arg5, true, this.field3447);
        }
        return var9;
    }

    @ObfuscatedName("ia.r(II[[IIIILjd;IS)Lew;")
    public final class135 method4227(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class262 arg6, int arg7) {
        long var9;
        if (this.field3461 == null) {
            var9 = (long) ((this.field3428 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3428 << 10) + (arg0 << 3) + arg1);
        }
        class135 var11 = (class135) field3467.method3288(var9);
        if (var11 == null) {
            class129 var12 = this.method4228(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2242(this.field3451 + 64, this.field3444 + 768, -50, -10, -50);
            field3467.method3278(var11, var9);
        }
        if (arg6 == null && this.field3447 == -1) {
            return var11;
        }
        class135 var13;
        if (arg6 == null) {
            var13 = var11.method2409(true);
        } else {
            var13 = arg6.method4424(var11, arg7, arg1);
        }
        if (this.field3447 >= 0) {
            var13 = var13.method2346(arg2, arg3, arg4, arg5, false, this.field3447);
        }
        return var13;
    }

    @ObfuscatedName("ia.u(III)Ldn;")
    public final class129 method4228(int arg0, int arg1) {
        class129 var3 = null;
        if (this.field3461 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3435 == null) {
                return null;
            }
            boolean var4 = this.field3449;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3435.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3435[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class129) field3438.method3288((long) var7);
                if (var3 == null) {
                    var3 = class129.method2235(Statics.field3462, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2264();
                    }
                    field3438.method3278(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3433[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class129(field3433, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3461.length; var9++) {
                if (this.field3461[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3435[var8];
            boolean var11 = this.field3449 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class129) field3438.method3288((long) var10);
            if (var3 == null) {
                var3 = class129.method2235(Statics.field3462, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2264();
                }
                field3438.method3278(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3459 == 128 && this.field3460 == 128 && this.field3456 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3470 == 0 && this.field3463 == 0 && this.field3464 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class129 var14 = new class129(var3, arg1 == 0 && !var12 && !var13, this.field3455 == null, this.field3440 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2232(256);
            var14.method2222(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2229();
        } else if (var15 == 2) {
            var14.method2259();
        } else if (var15 == 3) {
            var14.method2231();
        }
        if (this.field3455 != null) {
            for (int var16 = 0; var16 < this.field3455.length; var16++) {
                var14.method2234(this.field3455[var16], this.field3439[var16]);
            }
        }
        if (this.field3440 != null) {
            for (int var17 = 0; var17 < this.field3440.length; var17++) {
                var14.method2248(this.field3440[var17], this.field3441[var17]);
            }
        }
        if (var12) {
            var14.method2237(this.field3459, this.field3460, this.field3456);
        }
        if (var13) {
            var14.method2222(this.field3470, this.field3463, this.field3464);
        }
        return var14;
    }

    @ObfuscatedName("ia.d(B)Lia;")
    public final class257 method4229() {
        int var1 = -1;
        if (this.field3469 != -1) {
            var1 = class213.method3619(this.field3469);
        } else if (this.field3432 != -1) {
            var1 = class213.field2585[this.field3432];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3468.length - 1) {
            var2 = this.field3468[var1];
        } else {
            var2 = this.field3468[this.field3468.length - 1];
        }
        return var2 == -1 ? null : method247(var2);
    }

    @ObfuscatedName("ia.o(III)I")
    public int method4230(int arg0, int arg1) {
        return class251.method464(this.field3446, arg0, arg1);
    }

    @ObfuscatedName("ia.s(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4219(int arg0, String arg1) {
        return class251.method2901(this.field3446, arg0, arg1);
    }

    @ObfuscatedName("ia.c(I)Z")
    public boolean method4232() {
        if (this.field3468 == null) {
            return this.field3471 != -1 || this.field3475 != null;
        }
        for (int var1 = 0; var1 < this.field3468.length; var1++) {
            if (this.field3468[var1] != -1) {
                class257 var2 = method247(this.field3468[var1]);
                if (var2.field3471 != -1 || var2.field3475 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
