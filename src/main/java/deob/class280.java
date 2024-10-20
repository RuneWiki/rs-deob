package deob;

@ObfuscatedName("jy")
public class class280 extends class346 {

    @ObfuscatedName("jy.p")
    public static class199 field3404 = new class199(256);

    @ObfuscatedName("jy.b")
    public final int field3405;

    @ObfuscatedName("jy.e")
    public int field3416 = -1;

    @ObfuscatedName("jy.k")
    public int field3421 = -1;

    @ObfuscatedName("jy.g")
    public String field3408;

    @ObfuscatedName("jy.h")
    public int field3418;

    @ObfuscatedName("jy.n")
    public int field3403 = 0;

    @ObfuscatedName("jy.m")
    public boolean field3412 = true;

    @ObfuscatedName("jy.d")
    public boolean field3413 = false;

    @ObfuscatedName("jy.c")
    public String[] field3406 = new String[5];

    @ObfuscatedName("jy.j")
    public String field3415;

    @ObfuscatedName("jy.r")
    public int[] field3420;

    @ObfuscatedName("jy.q")
    public int field3417 = Integer.MAX_VALUE;

    @ObfuscatedName("jy.t")
    public int field3423 = Integer.MAX_VALUE;

    @ObfuscatedName("jy.v")
    public int field3419 = Integer.MIN_VALUE;

    @ObfuscatedName("jy.x")
    public int field3407 = Integer.MIN_VALUE;

    @ObfuscatedName("jy.z")
    public class286 field3410 = class286.field3472;

    @ObfuscatedName("jy.i")
    public class288 field3422 = class288.field3514;

    @ObfuscatedName("jy.a")
    public int[] field3414;

    @ObfuscatedName("jy.w")
    public byte[] field3424;

    @ObfuscatedName("jy.s")
    public int field3409 = -1;

    public class280(int arg0) {
        this.field3405 = arg0;
    }

    @ObfuscatedName("v.f(Lir;Lir;I)Z")
    public static boolean method166(class253 arg0, class253 arg1) {
        Statics.field3425 = arg1;
        if (!arg0.method3954()) {
            return false;
        }
        Statics.field4124 = arg0.method3944(35);
        Statics.field3311 = new class280[Statics.field4124];
        for (int var2 = 0; var2 < Statics.field4124; var2++) {
            byte[] var3 = arg0.method3933(35, var2);
            Statics.field3311[var2] = new class280(var2);
            if (var3 != null) {
                Statics.field3311[var2].method4341(new class382(var3));
                Statics.field3311[var2].method4342();
            }
        }
        return true;
    }

    @ObfuscatedName("kp.o(II)Ljy;")
    public static class280 method4995(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3311.length || Statics.field3311[arg0] == null ? new class280(arg0) : Statics.field3311[arg0];
    }

    @ObfuscatedName("jy.u(Lnu;I)V")
    public void method4341(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4361(arg0, var2);
        }
    }

    @ObfuscatedName("jy.p(Lnu;II)V")
    public void method4361(class382 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3416 = arg0.method5873();
        } else if (arg1 == 2) {
            this.field3421 = arg0.method5873();
        } else if (arg1 == 3) {
            this.field3408 = arg0.method5865();
        } else if (arg1 == 4) {
            this.field3418 = arg0.method5875();
        } else if (arg1 == 5) {
            arg0.method5875();
        } else if (arg1 == 6) {
            this.field3403 = arg0.method5856();
        } else if (arg1 == 7) {
            int var3 = arg0.method5856();
            if ((var3 & 0x1) == 0) {
                this.field3412 = false;
            }
            if ((var3 & 0x2) == 2) {
                this.field3413 = true;
            }
        } else if (arg1 == 8) {
            arg0.method5856();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3406[arg1 - 10] = arg0.method5865();
        } else if (arg1 == 15) {
            int var4 = arg0.method5856();
            this.field3420 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3420[var5] = arg0.method5859();
            }
            arg0.method5861();
            int var6 = arg0.method5856();
            this.field3414 = new int[var6];
            for (int var7 = 0; var7 < this.field3414.length; var7++) {
                this.field3414[var7] = arg0.method5861();
            }
            this.field3424 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3424[var8] = arg0.method6045();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3415 = arg0.method5865();
            } else if (arg1 == 18) {
                arg0.method5873();
            } else if (arg1 == 19) {
                this.field3409 = arg0.method5858();
            } else if (arg1 == 21) {
                arg0.method5861();
            } else if (arg1 == 22) {
                arg0.method5861();
            } else if (arg1 == 23) {
                arg0.method5856();
                arg0.method5856();
                arg0.method5856();
            } else if (arg1 == 24) {
                arg0.method5859();
                arg0.method5859();
            } else if (arg1 == 25) {
                arg0.method5873();
            } else if (arg1 == 28) {
                arg0.method5856();
            } else if (arg1 == 29) {
                class286[] var9 = new class286[] { class286.field3469, class286.field3472, class286.field3470 };
                this.field3410 = (class286) class267.method2139(var9, arg0.method5856());
            } else if (arg1 == 30) {
                class288[] var10 = new class288[] { class288.field3514, class288.field3518, class288.field3515 };
                this.field3422 = (class288) class267.method2139(var10, arg0.method5856());
            }
        }
    }

    @ObfuscatedName("jy.b(I)V")
    public void method4342() {
        if (this.field3420 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3420.length; var1 += 2) {
            if (this.field3420[var1] < this.field3417) {
                this.field3417 = this.field3420[var1];
            } else if (this.field3420[var1] > this.field3419) {
                this.field3419 = this.field3420[var1];
            }
            if (this.field3420[var1 + 1] < this.field3423) {
                this.field3423 = this.field3420[var1 + 1];
            } else if (this.field3420[var1 + 1] > this.field3407) {
                this.field3407 = this.field3420[var1 + 1];
            }
        }
    }

    @ObfuscatedName("jy.e(ZI)Loh;")
    public class395 method4344(boolean arg0) {
        int var2 = arg0 ? this.field3421 : this.field3416;
        return this.method4345(var2);
    }

    @ObfuscatedName("jy.k(II)Loh;")
    public class395 method4345(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class395 var2 = (class395) field3404.method3398((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class395 var3 = class396.method3341(Statics.field3425, arg0, 0);
        if (var3 != null) {
            field3404.method3400(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("jy.g(I)I")
    public int method4346() {
        return this.field3405;
    }
}
