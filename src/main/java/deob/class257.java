package deob;

@ObfuscatedName("ih")
public class class257 extends class196 {

    @ObfuscatedName("ih.j")
    public static boolean field3452 = false;

    @ObfuscatedName("ih.p")
    public static class191 field3429 = new class191(4096);

    @ObfuscatedName("ih.x")
    public static class191 field3477 = new class191(500);

    @ObfuscatedName("ih.g")
    public static class191 field3430 = new class191(30);

    @ObfuscatedName("ih.c")
    public static class191 field3432 = new class191(30);

    @ObfuscatedName("ih.l")
    public static class129[] field3433 = new class129[4];

    @ObfuscatedName("ih.w")
    public int field3462;

    @ObfuscatedName("ih.b")
    public int[] field3434;

    @ObfuscatedName("ih.o")
    public int[] field3436;

    @ObfuscatedName("ih.m")
    public String field3437 = "null";

    @ObfuscatedName("ih.i")
    public short[] field3474;

    @ObfuscatedName("ih.s")
    public short[] field3439;

    @ObfuscatedName("ih.r")
    public short[] field3461;

    @ObfuscatedName("ih.e")
    public short[] field3465;

    @ObfuscatedName("ih.a")
    public int field3442 = 1;

    @ObfuscatedName("ih.v")
    public int field3443 = 1;

    @ObfuscatedName("ih.t")
    public int field3449 = 2;

    @ObfuscatedName("ih.y")
    public boolean field3445 = true;

    @ObfuscatedName("ih.z")
    public int field3446 = -1;

    @ObfuscatedName("ih.u")
    public int field3447 = -1;

    @ObfuscatedName("ih.k")
    public boolean field3448 = false;

    @ObfuscatedName("ih.q")
    public boolean field3453 = false;

    @ObfuscatedName("ih.n")
    public int field3450 = -1;

    @ObfuscatedName("ih.d")
    public int field3451 = 16;

    @ObfuscatedName("ih.ax")
    public int field3444 = 0;

    @ObfuscatedName("ih.ao")
    public int field3463 = 0;

    @ObfuscatedName("ih.an")
    public String[] field3441 = new String[5];

    @ObfuscatedName("ih.ar")
    public int field3455 = -1;

    @ObfuscatedName("ih.ag")
    public int field3456 = -1;

    @ObfuscatedName("ih.av")
    public boolean field3457 = false;

    @ObfuscatedName("ih.ab")
    public boolean field3458 = true;

    @ObfuscatedName("ih.aj")
    public int field3459 = 128;

    @ObfuscatedName("ih.ae")
    public int field3460 = 128;

    @ObfuscatedName("ih.at")
    public int field3426 = 128;

    @ObfuscatedName("ih.as")
    public int field3472 = 0;

    @ObfuscatedName("ih.af")
    public int field3469 = 0;

    @ObfuscatedName("ih.au")
    public int field3464 = 0;

    @ObfuscatedName("ih.az")
    public boolean field3431 = false;

    @ObfuscatedName("ih.al")
    public boolean field3466 = false;

    @ObfuscatedName("ih.am")
    public int field3467 = -1;

    @ObfuscatedName("ih.ah")
    public int[] field3468;

    @ObfuscatedName("ih.ap")
    public int field3454 = -1;

    @ObfuscatedName("ih.ad")
    public int field3470 = -1;

    @ObfuscatedName("ih.aa")
    public int field3471 = -1;

    @ObfuscatedName("ih.aw")
    public int field3438 = 0;

    @ObfuscatedName("ih.aq")
    public int field3473 = 0;

    @ObfuscatedName("ih.ai")
    public int field3435 = 0;

    @ObfuscatedName("ih.ak")
    public int[] field3475;

    @ObfuscatedName("ih.ac")
    public class188 field3476;

    @ObfuscatedName("af.j(IS)Lih;")
    public static class257 method483(int arg0) {
        class257 var1 = (class257) field3429.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3427.method3773(6, arg0);
        class257 var3 = new class257();
        var3.field3462 = arg0;
        if (var2 != null) {
            var3.method4202(new class175(var2));
        }
        var3.method4200();
        if (var3.field3466) {
            var3.field3449 = 0;
            var3.field3445 = false;
        }
        field3429.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.h(I)V")
    public void method4200() {
        if (this.field3446 == -1) {
            this.field3446 = 0;
            if (this.field3434 != null && (this.field3436 == null || this.field3436[0] == 10)) {
                this.field3446 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3441[var1] != null) {
                    this.field3446 = 1;
                }
            }
        }
        if (this.field3467 == -1) {
            this.field3467 = this.field3449 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ih.f(Lfb;I)V")
    public void method4202(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4203(arg0, var2);
        }
    }

    @ObfuscatedName("ih.p(Lfb;IB)V")
    public void method4203(class175 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2903();
            if (var3 > 0) {
                if (this.field3434 == null || field3452) {
                    this.field3436 = new int[var3];
                    this.field3434 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3434[var4] = arg0.method3023();
                        this.field3436[var4] = arg0.method2903();
                    }
                } else {
                    arg0.field2394 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3437 = arg0.method2911();
        } else if (arg1 == 5) {
            int var5 = arg0.method2903();
            if (var5 > 0) {
                if (this.field3434 == null || field3452) {
                    this.field3436 = null;
                    this.field3434 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3434[var6] = arg0.method3023();
                    }
                } else {
                    arg0.field2394 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3442 = arg0.method2903();
        } else if (arg1 == 15) {
            this.field3443 = arg0.method2903();
        } else if (arg1 == 17) {
            this.field3449 = 0;
            this.field3445 = false;
        } else if (arg1 == 18) {
            this.field3445 = false;
        } else if (arg1 == 19) {
            this.field3446 = arg0.method2903();
        } else if (arg1 == 21) {
            this.field3447 = 0;
        } else if (arg1 == 22) {
            this.field3448 = true;
        } else if (arg1 == 23) {
            this.field3453 = true;
        } else if (arg1 == 24) {
            this.field3450 = arg0.method3023();
            if (this.field3450 == 65535) {
                this.field3450 = -1;
            }
        } else if (arg1 == 27) {
            this.field3449 = 1;
        } else if (arg1 == 28) {
            this.field3451 = arg0.method2903();
        } else if (arg1 == 29) {
            this.field3444 = arg0.method2980();
        } else if (arg1 == 39) {
            this.field3463 = arg0.method2980() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3441[arg1 - 30] = arg0.method2911();
            if (this.field3441[arg1 - 30].equalsIgnoreCase(class227.field2979)) {
                this.field3441[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2903();
            this.field3474 = new short[var7];
            this.field3439 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3474[var8] = (short) arg0.method3023();
                this.field3439[var8] = (short) arg0.method3023();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2903();
            this.field3461 = new short[var9];
            this.field3465 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3461[var10] = (short) arg0.method3023();
                this.field3465[var10] = (short) arg0.method3023();
            }
        } else if (arg1 == 62) {
            this.field3457 = true;
        } else if (arg1 == 64) {
            this.field3458 = false;
        } else if (arg1 == 65) {
            this.field3459 = arg0.method3023();
        } else if (arg1 == 66) {
            this.field3460 = arg0.method3023();
        } else if (arg1 == 67) {
            this.field3426 = arg0.method3023();
        } else if (arg1 == 68) {
            this.field3456 = arg0.method3023();
        } else if (arg1 == 69) {
            arg0.method2903();
        } else if (arg1 == 70) {
            this.field3472 = arg0.method3077();
        } else if (arg1 == 71) {
            this.field3469 = arg0.method3077();
        } else if (arg1 == 72) {
            this.field3464 = arg0.method3077();
        } else if (arg1 == 73) {
            this.field3431 = true;
        } else if (arg1 == 74) {
            this.field3466 = true;
        } else if (arg1 == 75) {
            this.field3467 = arg0.method2903();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3454 = arg0.method3023();
            if (this.field3454 == 65535) {
                this.field3454 = -1;
            }
            this.field3470 = arg0.method3023();
            if (this.field3470 == 65535) {
                this.field3470 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method3023();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2903();
            this.field3468 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3468[var15] = arg0.method3023();
                if (this.field3468[var15] == 65535) {
                    this.field3468[var15] = -1;
                }
            }
            this.field3468[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3471 = arg0.method3023();
            this.field3438 = arg0.method2903();
        } else if (arg1 == 79) {
            this.field3473 = arg0.method3023();
            this.field3435 = arg0.method3023();
            this.field3438 = arg0.method2903();
            int var11 = arg0.method2903();
            this.field3475 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3475[var12] = arg0.method3023();
            }
        } else if (arg1 == 81) {
            this.field3447 = arg0.method2903() * 256;
        } else if (arg1 == 82) {
            this.field3455 = arg0.method3023();
        } else if (arg1 == 249) {
            this.field3476 = class251.method3769(arg0, this.field3476);
        }
    }

    @ObfuscatedName("ih.x(II)Z")
    public final boolean method4204(int arg0) {
        if (this.field3436 != null) {
            for (int var4 = 0; var4 < this.field3436.length; var4++) {
                if (this.field3436[var4] == arg0) {
                    return Statics.field3428.method3775(this.field3434[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3434 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3434.length; var3++) {
                var2 &= Statics.field3428.method3775(this.field3434[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ih.g(I)Z")
    public final boolean method4218() {
        if (this.field3434 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3434.length; var2++) {
            var1 &= Statics.field3428.method3775(this.field3434[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ih.c(II[[IIIII)Leq;")
    public final class143 method4206(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3436 == null) {
            var7 = (long) ((this.field3462 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3462 << 10) + (arg0 << 3) + arg1);
        }
        class143 var9 = (class143) field3430.method3271(var7);
        if (var9 == null) {
            class129 var10 = this.method4219(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3448) {
                var10.field1833 = (short) (this.field3444 + 64);
                var10.field1819 = (short) (this.field3463 + 768);
                var10.method2226();
                var9 = var10;
            } else {
                var9 = var10.method2229(this.field3444 + 64, this.field3463 + 768, -50, -10, -50);
            }
            field3430.method3270(var9, var7);
        }
        if (this.field3448) {
            var9 = ((class129) var9).method2214();
        }
        if (this.field3447 >= 0) {
            if (var9 instanceof class135) {
                var9 = ((class135) var9).method2301(arg2, arg3, arg4, arg5, true, this.field3447);
            } else if (var9 instanceof class129) {
                var9 = ((class129) var9).method2215(arg2, arg3, arg4, arg5, true, this.field3447);
            }
        }
        return var9;
    }

    @ObfuscatedName("ih.l(II[[IIIII)Leo;")
    public final class135 method4205(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3436 == null) {
            var7 = (long) ((this.field3462 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3462 << 10) + (arg0 << 3) + arg1);
        }
        class135 var9 = (class135) field3432.method3271(var7);
        if (var9 == null) {
            class129 var10 = this.method4219(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2229(this.field3444 + 64, this.field3463 + 768, -50, -10, -50);
            field3432.method3270(var9, var7);
        }
        if (this.field3447 >= 0) {
            var9 = var9.method2301(arg2, arg3, arg4, arg5, true, this.field3447);
        }
        return var9;
    }

    @ObfuscatedName("ih.w(II[[IIIILjf;II)Leo;")
    public final class135 method4208(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class262 arg6, int arg7) {
        long var9;
        if (this.field3436 == null) {
            var9 = (long) ((this.field3462 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3462 << 10) + (arg0 << 3) + arg1);
        }
        class135 var11 = (class135) field3432.method3271(var9);
        if (var11 == null) {
            class129 var12 = this.method4219(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2229(this.field3444 + 64, this.field3463 + 768, -50, -10, -50);
            field3432.method3270(var11, var9);
        }
        if (arg6 == null && this.field3447 == -1) {
            return var11;
        }
        class135 var13;
        if (arg6 == null) {
            var13 = var11.method2302(true);
        } else {
            var13 = arg6.method4370(var11, arg7, arg1);
        }
        if (this.field3447 >= 0) {
            var13 = var13.method2301(arg2, arg3, arg4, arg5, false, this.field3447);
        }
        return var13;
    }

    @ObfuscatedName("ih.b(III)Ldi;")
    public final class129 method4219(int arg0, int arg1) {
        class129 var3 = null;
        if (this.field3436 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3434 == null) {
                return null;
            }
            boolean var4 = this.field3457;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3434.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3434[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class129) field3477.method3271((long) var7);
                if (var3 == null) {
                    var3 = class129.method2208(Statics.field3428, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2253();
                    }
                    field3477.method3270(var3, (long) var7);
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
            for (int var9 = 0; var9 < this.field3436.length; var9++) {
                if (this.field3436[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3434[var8];
            boolean var11 = this.field3457 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class129) field3477.method3271((long) var10);
            if (var3 == null) {
                var3 = class129.method2208(Statics.field3428, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2253();
                }
                field3477.method3270(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3459 == 128 && this.field3460 == 128 && this.field3426 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3472 == 0 && this.field3469 == 0 && this.field3464 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class129 var14 = new class129(var3, arg1 == 0 && !var12 && !var13, this.field3474 == null, this.field3461 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2254(256);
            var14.method2221(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2217();
        } else if (var15 == 2) {
            var14.method2218();
        } else if (var15 == 3) {
            var14.method2219();
        }
        if (this.field3474 != null) {
            for (int var16 = 0; var16 < this.field3474.length; var16++) {
                var14.method2241(this.field3474[var16], this.field3439[var16]);
            }
        }
        if (this.field3461 != null) {
            for (int var17 = 0; var17 < this.field3461.length; var17++) {
                var14.method2223(this.field3461[var17], this.field3465[var17]);
            }
        }
        if (var12) {
            var14.method2225(this.field3459, this.field3460, this.field3426);
        }
        if (var13) {
            var14.method2221(this.field3472, this.field3469, this.field3464);
        }
        return var14;
    }

    @ObfuscatedName("ih.o(I)Lih;")
    public final class257 method4210() {
        int var1 = -1;
        if (this.field3454 != -1) {
            var1 = class213.method13(this.field3454);
        } else if (this.field3470 != -1) {
            var1 = class213.field2604[this.field3470];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3468.length - 1) {
            var2 = this.field3468[var1];
        } else {
            var2 = this.field3468[this.field3468.length - 1];
        }
        return var2 == -1 ? null : method483(var2);
    }

    @ObfuscatedName("ih.m(III)I")
    public int method4211(int arg0, int arg1) {
        return class251.method1735(this.field3476, arg0, arg1);
    }

    @ObfuscatedName("ih.e(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4212(int arg0, String arg1) {
        return class251.method246(this.field3476, arg0, arg1);
    }

    @ObfuscatedName("dj.a(I)V")
    public static void method1958() {
        field3429.method3259();
        field3477.method3259();
        field3430.method3259();
        field3432.method3259();
    }

    @ObfuscatedName("ih.v(B)Z")
    public boolean method4224() {
        if (this.field3468 == null) {
            return this.field3471 != -1 || this.field3475 != null;
        }
        for (int var1 = 0; var1 < this.field3468.length; var1++) {
            if (this.field3468[var1] != -1) {
                class257 var2 = method483(this.field3468[var1]);
                if (var2.field3471 != -1 || var2.field3475 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
