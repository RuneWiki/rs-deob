package deob;

@ObfuscatedName("jw")
public class class264 extends class185 {

    @ObfuscatedName("jw.x")
    public static boolean field3357 = false;

    @ObfuscatedName("jw.d")
    public static class155 field3347 = new class155(4096);

    @ObfuscatedName("jw.w")
    public static class155 field3348 = new class155(500);

    @ObfuscatedName("jw.v")
    public static class155 field3349 = new class155(30);

    @ObfuscatedName("jw.q")
    public static class155 field3353 = new class155(30);

    @ObfuscatedName("jw.z")
    public static class131[] field3377 = new class131[4];

    @ObfuscatedName("jw.t")
    public int field3352;

    @ObfuscatedName("jw.e")
    public int[] field3390;

    @ObfuscatedName("jw.s")
    public int[] field3354;

    @ObfuscatedName("jw.p")
    public String field3355 = class234.field2765;

    @ObfuscatedName("jw.n")
    public short[] field3356;

    @ObfuscatedName("jw.u")
    public short[] field3359;

    @ObfuscatedName("jw.h")
    public short[] field3371;

    @ObfuscatedName("jw.g")
    public short[] field3395;

    @ObfuscatedName("jw.i")
    public int field3360 = 1;

    @ObfuscatedName("jw.a")
    public int field3361 = 1;

    @ObfuscatedName("jw.b")
    public int field3362 = 2;

    @ObfuscatedName("jw.l")
    public boolean field3385 = true;

    @ObfuscatedName("jw.r")
    public int field3364 = -1;

    @ObfuscatedName("jw.o")
    public int field3365 = -1;

    @ObfuscatedName("jw.c")
    public boolean field3366 = false;

    @ObfuscatedName("jw.j")
    public boolean field3344 = false;

    @ObfuscatedName("jw.y")
    public int field3368 = -1;

    @ObfuscatedName("jw.f")
    public int field3394 = 16;

    @ObfuscatedName("jw.ae")
    public int field3358 = 0;

    @ObfuscatedName("jw.an")
    public int field3350 = 0;

    @ObfuscatedName("jw.ai")
    public String[] field3369 = new String[5];

    @ObfuscatedName("jw.ap")
    public int field3373 = -1;

    @ObfuscatedName("jw.ab")
    public int field3392 = -1;

    @ObfuscatedName("jw.ar")
    public boolean field3375 = false;

    @ObfuscatedName("jw.af")
    public boolean field3376 = true;

    @ObfuscatedName("jw.at")
    public int field3363 = 128;

    @ObfuscatedName("jw.al")
    public int field3378 = 128;

    @ObfuscatedName("jw.as")
    public int field3379 = 128;

    @ObfuscatedName("jw.am")
    public int field3380 = 0;

    @ObfuscatedName("jw.au")
    public int field3381 = 0;

    @ObfuscatedName("jw.ao")
    public int field3382 = 0;

    @ObfuscatedName("jw.aq")
    public boolean field3383 = false;

    @ObfuscatedName("jw.av")
    public boolean field3384 = false;

    @ObfuscatedName("jw.ak")
    public int field3372 = -1;

    @ObfuscatedName("jw.aa")
    public int[] field3386;

    @ObfuscatedName("jw.ax")
    public int field3387 = -1;

    @ObfuscatedName("jw.az")
    public int field3388 = -1;

    @ObfuscatedName("jw.aj")
    public int field3351 = -1;

    @ObfuscatedName("jw.ay")
    public int field3389 = 0;

    @ObfuscatedName("jw.ad")
    public int field3391 = 0;

    @ObfuscatedName("jw.ac")
    public int field3367 = 0;

    @ObfuscatedName("jw.ah")
    public int[] field3393;

    @ObfuscatedName("jw.ag")
    public class326 field3370;

    @ObfuscatedName("ae.x(Liy;Liy;ZI)V")
    public static void method260(class244 arg0, class244 arg1, boolean arg2) {
        Statics.field3345 = arg0;
        Statics.field3346 = arg1;
        field3357 = arg2;
    }

    @ObfuscatedName("at.m(II)Ljw;")
    public static class264 method363(int arg0) {
        class264 var1 = (class264) field3347.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3345.method3869(6, arg0);
        class264 var3 = new class264();
        var3.field3352 = arg0;
        if (var2 != null) {
            var3.method4267(new class310(var2));
        }
        var3.method4266();
        if (var3.field3384) {
            var3.field3362 = 0;
            var3.field3385 = false;
        }
        field3347.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jw.k(I)V")
    public void method4266() {
        if (this.field3364 == -1) {
            this.field3364 = 0;
            if (this.field3390 != null && (this.field3354 == null || this.field3354[0] == 10)) {
                this.field3364 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field3369[var1] != null) {
                    this.field3364 = 1;
                }
            }
        }
        if (this.field3372 == -1) {
            this.field3372 = this.field3362 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("jw.d(Lkb;I)V")
    public void method4267(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4268(arg0, var2);
        }
    }

    @ObfuscatedName("jw.w(Lkb;II)V")
    public void method4268(class310 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5137();
            if (var3 > 0) {
                if (this.field3390 == null || field3357) {
                    this.field3354 = new int[var3];
                    this.field3390 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field3390[var4] = arg0.method5139();
                        this.field3354[var4] = arg0.method5137();
                    }
                } else {
                    arg0.field3711 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field3355 = arg0.method5257();
        } else if (arg1 == 5) {
            int var5 = arg0.method5137();
            if (var5 > 0) {
                if (this.field3390 == null || field3357) {
                    this.field3354 = null;
                    this.field3390 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field3390[var6] = arg0.method5139();
                    }
                } else {
                    arg0.field3711 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field3360 = arg0.method5137();
        } else if (arg1 == 15) {
            this.field3361 = arg0.method5137();
        } else if (arg1 == 17) {
            this.field3362 = 0;
            this.field3385 = false;
        } else if (arg1 == 18) {
            this.field3385 = false;
        } else if (arg1 == 19) {
            this.field3364 = arg0.method5137();
        } else if (arg1 == 21) {
            this.field3365 = 0;
        } else if (arg1 == 22) {
            this.field3366 = true;
        } else if (arg1 == 23) {
            this.field3344 = true;
        } else if (arg1 == 24) {
            this.field3368 = arg0.method5139();
            if (this.field3368 == 65535) {
                this.field3368 = -1;
            }
        } else if (arg1 == 27) {
            this.field3362 = 1;
        } else if (arg1 == 28) {
            this.field3394 = arg0.method5137();
        } else if (arg1 == 29) {
            this.field3358 = arg0.method5138();
        } else if (arg1 == 39) {
            this.field3350 = arg0.method5138() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3369[arg1 - 30] = arg0.method5257();
            if (this.field3369[arg1 - 30].equalsIgnoreCase(class234.field2908)) {
                this.field3369[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method5137();
            this.field3356 = new short[var7];
            this.field3359 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3356[var8] = (short) arg0.method5139();
                this.field3359[var8] = (short) arg0.method5139();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method5137();
            this.field3371 = new short[var9];
            this.field3395 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3371[var10] = (short) arg0.method5139();
                this.field3395[var10] = (short) arg0.method5139();
            }
        } else if (arg1 == 62) {
            this.field3375 = true;
        } else if (arg1 == 64) {
            this.field3376 = false;
        } else if (arg1 == 65) {
            this.field3363 = arg0.method5139();
        } else if (arg1 == 66) {
            this.field3378 = arg0.method5139();
        } else if (arg1 == 67) {
            this.field3379 = arg0.method5139();
        } else if (arg1 == 68) {
            this.field3392 = arg0.method5139();
        } else if (arg1 == 69) {
            arg0.method5137();
        } else if (arg1 == 70) {
            this.field3380 = arg0.method5140();
        } else if (arg1 == 71) {
            this.field3381 = arg0.method5140();
        } else if (arg1 == 72) {
            this.field3382 = arg0.method5140();
        } else if (arg1 == 73) {
            this.field3383 = true;
        } else if (arg1 == 74) {
            this.field3384 = true;
        } else if (arg1 == 75) {
            this.field3372 = arg0.method5137();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field3387 = arg0.method5139();
            if (this.field3387 == 65535) {
                this.field3387 = -1;
            }
            this.field3388 = arg0.method5139();
            if (this.field3388 == 65535) {
                this.field3388 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method5139();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method5137();
            this.field3386 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field3386[var15] = arg0.method5139();
                if (this.field3386[var15] == 65535) {
                    this.field3386[var15] = -1;
                }
            }
            this.field3386[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field3351 = arg0.method5139();
            this.field3389 = arg0.method5137();
        } else if (arg1 == 79) {
            this.field3391 = arg0.method5139();
            this.field3367 = arg0.method5139();
            this.field3389 = arg0.method5137();
            int var11 = arg0.method5137();
            this.field3393 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3393[var12] = arg0.method5139();
            }
        } else if (arg1 == 81) {
            this.field3365 = arg0.method5137() * 256;
        } else if (arg1 == 82) {
            this.field3373 = arg0.method5139();
        } else if (arg1 == 249) {
            this.field3370 = Statics.method4011(arg0, this.field3370);
        }
    }

    @ObfuscatedName("jw.v(II)Z")
    public final boolean method4269(int arg0) {
        if (this.field3354 != null) {
            for (int var4 = 0; var4 < this.field3354.length; var4++) {
                if (this.field3354[var4] == arg0) {
                    return Statics.field3346.method3883(this.field3390[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field3390 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3390.length; var3++) {
                var2 &= Statics.field3346.method3883(this.field3390[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jw.q(B)Z")
    public final boolean method4270() {
        if (this.field3390 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3390.length; var2++) {
            var1 &= Statics.field3346.method3883(this.field3390[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("jw.z(II[[IIIII)Lee;")
    public final class145 method4286(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3354 == null) {
            var7 = (long) ((this.field3352 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3352 << 10) + (arg0 << 3) + arg1);
        }
        class145 var9 = (class145) field3349.method3146(var7);
        if (var9 == null) {
            class131 var10 = this.method4284(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field3366) {
                var10.field1588 = (short) (this.field3358 + 64);
                var10.field1594 = (short) (this.field3350 + 768);
                var10.method2633();
                var9 = var10;
            } else {
                var9 = var10.method2636(this.field3358 + 64, this.field3350 + 768, -50, -10, -50);
            }
            field3349.method3152(var9, var7);
        }
        if (this.field3366) {
            var9 = ((class131) var9).method2621();
        }
        if (this.field3365 >= 0) {
            if (var9 instanceof class137) {
                var9 = ((class137) var9).method2735(arg2, arg3, arg4, arg5, true, this.field3365);
            } else if (var9 instanceof class131) {
                var9 = ((class131) var9).method2622(arg2, arg3, arg4, arg5, true, this.field3365);
            }
        }
        return var9;
    }

    @ObfuscatedName("jw.t(II[[IIIII)Lel;")
    public final class137 method4271(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field3354 == null) {
            var7 = (long) ((this.field3352 << 10) + arg1);
        } else {
            var7 = (long) ((this.field3352 << 10) + (arg0 << 3) + arg1);
        }
        class137 var9 = (class137) field3353.method3146(var7);
        if (var9 == null) {
            class131 var10 = this.method4284(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2636(this.field3358 + 64, this.field3350 + 768, -50, -10, -50);
            field3353.method3152(var9, var7);
        }
        if (this.field3365 >= 0) {
            var9 = var9.method2735(arg2, arg3, arg4, arg5, true, this.field3365);
        }
        return var9;
    }

    @ObfuscatedName("jw.e(II[[IIIILjc;IS)Lel;")
    public final class137 method4273(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class269 arg6, int arg7) {
        long var9;
        if (this.field3354 == null) {
            var9 = (long) ((this.field3352 << 10) + arg1);
        } else {
            var9 = (long) ((this.field3352 << 10) + (arg0 << 3) + arg1);
        }
        class137 var11 = (class137) field3353.method3146(var9);
        if (var11 == null) {
            class131 var12 = this.method4284(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2636(this.field3358 + 64, this.field3350 + 768, -50, -10, -50);
            field3353.method3152(var11, var9);
        }
        if (arg6 == null && this.field3365 == -1) {
            return var11;
        }
        class137 var13;
        if (arg6 == null) {
            var13 = var11.method2721(true);
        } else {
            var13 = arg6.method4449(var11, arg7, arg1);
        }
        if (this.field3365 >= 0) {
            var13 = var13.method2735(arg2, arg3, arg4, arg5, false, this.field3365);
        }
        return var13;
    }

    @ObfuscatedName("jw.s(III)Lea;")
    public final class131 method4284(int arg0, int arg1) {
        class131 var3 = null;
        if (this.field3354 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field3390 == null) {
                return null;
            }
            boolean var4 = this.field3375;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field3390.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field3390[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class131) field3348.method3146((long) var7);
                if (var3 == null) {
                    var3 = class131.method2615(Statics.field3346, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2631();
                    }
                    field3348.method3152(var3, (long) var7);
                }
                if (var5 > 1) {
                    field3377[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class131(field3377, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field3354.length; var9++) {
                if (this.field3354[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field3390[var8];
            boolean var11 = this.field3375 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class131) field3348.method3146((long) var10);
            if (var3 == null) {
                var3 = class131.method2615(Statics.field3346, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2631();
                }
                field3348.method3152(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field3363 == 128 && this.field3378 == 128 && this.field3379 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field3380 == 0 && this.field3381 == 0 && this.field3382 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class131 var14 = new class131(var3, arg1 == 0 && !var12 && !var13, this.field3356 == null, this.field3371 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2627(256);
            var14.method2628(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2624();
        } else if (var15 == 2) {
            var14.method2625();
        } else if (var15 == 3) {
            var14.method2646();
        }
        if (this.field3356 != null) {
            for (int var16 = 0; var16 < this.field3356.length; var16++) {
                var14.method2629(this.field3356[var16], this.field3359[var16]);
            }
        }
        if (this.field3371 != null) {
            for (int var17 = 0; var17 < this.field3371.length; var17++) {
                var14.method2681(this.field3371[var17], this.field3395[var17]);
            }
        }
        if (var12) {
            var14.method2632(this.field3363, this.field3378, this.field3379);
        }
        if (var13) {
            var14.method2628(this.field3380, this.field3381, this.field3382);
        }
        return var14;
    }

    @ObfuscatedName("jw.p(S)Ljw;")
    public final class264 method4277() {
        int var1 = -1;
        if (this.field3387 != -1) {
            var1 = class222.method2013(this.field3387);
        } else if (this.field3388 != -1) {
            var1 = class222.field2527[this.field3388];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3386.length - 1) {
            var2 = this.field3386[var1];
        } else {
            var2 = this.field3386[this.field3386.length - 1];
        }
        return var2 == -1 ? null : method363(var2);
    }

    @ObfuscatedName("jw.n(IIB)I")
    public int method4299(int arg0, int arg1) {
        class326 var3 = this.field3370;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5519((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2115;
            }
        }
        return var4;
    }

    @ObfuscatedName("jw.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4312(int arg0, String arg1) {
        return Statics.method95(this.field3370, arg0, arg1);
    }

    @ObfuscatedName("bw.h(I)V")
    public static void method1659() {
        field3347.method3141();
        field3348.method3141();
        field3349.method3141();
        field3353.method3141();
    }

    @ObfuscatedName("jw.g(I)Z")
    public boolean method4278() {
        if (this.field3386 == null) {
            return this.field3351 != -1 || this.field3393 != null;
        }
        for (int var1 = 0; var1 < this.field3386.length; var1++) {
            if (this.field3386[var1] != -1) {
                class264 var2 = method363(this.field3386[var1]);
                if (var2.field3351 != -1 || var2.field3393 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
