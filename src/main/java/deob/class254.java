package deob;

@ObfuscatedName("il")
public class class254 extends class176 {

    @ObfuscatedName("il.e")
    public static class146 field3337 = new class146(64);

    @ObfuscatedName("il.i")
    public static class146 field3326 = new class146(64);

    @ObfuscatedName("il.g")
    public static class146 field3321 = new class146(20);

    @ObfuscatedName("il.h")
    public int field3327 = -1;

    @ObfuscatedName("il.v")
    public int field3328 = 16777215;

    @ObfuscatedName("il.n")
    public int field3329 = 70;

    @ObfuscatedName("il.x")
    public int field3340 = -1;

    @ObfuscatedName("il.w")
    public int field3325 = -1;

    @ObfuscatedName("il.k")
    public int field3332 = -1;

    @ObfuscatedName("il.q")
    public int field3333 = -1;

    @ObfuscatedName("il.z")
    public int field3324 = 0;

    @ObfuscatedName("il.y")
    public int field3335 = 0;

    @ObfuscatedName("il.f")
    public int field3336 = -1;

    @ObfuscatedName("il.b")
    public String field3323 = "";

    @ObfuscatedName("il.r")
    public int field3338 = -1;

    @ObfuscatedName("il.s")
    public int field3339 = 0;

    @ObfuscatedName("il.a")
    public int[] field3334;

    @ObfuscatedName("il.u")
    public int field3341 = -1;

    @ObfuscatedName("il.ae")
    public int field3342 = -1;

    @ObfuscatedName("il.c(Lkp;I)V")
    public void method4246(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4247(arg0, var2);
        }
    }

    @ObfuscatedName("il.t(Lkp;II)V")
    public void method4247(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3327 = arg0.method5146();
        } else if (arg1 == 2) {
            this.field3328 = arg0.method5133();
        } else if (arg1 == 3) {
            this.field3340 = arg0.method5146();
        } else if (arg1 == 4) {
            this.field3332 = arg0.method5146();
        } else if (arg1 == 5) {
            this.field3325 = arg0.method5146();
        } else if (arg1 == 6) {
            this.field3333 = arg0.method5146();
        } else if (arg1 == 7) {
            this.field3324 = arg0.method5132();
        } else if (arg1 == 8) {
            this.field3323 = arg0.method5338();
        } else if (arg1 == 9) {
            this.field3329 = arg0.method5124();
        } else if (arg1 == 10) {
            this.field3335 = arg0.method5132();
        } else if (arg1 == 11) {
            this.field3336 = 0;
        } else if (arg1 == 12) {
            this.field3338 = arg0.method5129();
        } else if (arg1 == 13) {
            this.field3339 = arg0.method5132();
        } else if (arg1 == 14) {
            this.field3336 = arg0.method5124();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3341 = arg0.method5124();
            if (this.field3341 == 65535) {
                this.field3341 = -1;
            }
            this.field3342 = arg0.method5124();
            if (this.field3342 == 65535) {
                this.field3342 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5124();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5129();
            this.field3334 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3334[var5] = arg0.method5124();
                if (this.field3334[var5] == 65535) {
                    this.field3334[var5] = -1;
                }
            }
            this.field3334[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("il.o(B)Lil;")
    public final class254 method4271() {
        int var1 = -1;
        if (this.field3341 != -1) {
            var1 = Statics.method122(this.field3341);
        } else if (this.field3342 != -1) {
            var1 = class213.field2534[this.field3342];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3334.length - 1) {
            var2 = this.field3334[var1];
        } else {
            var2 = this.field3334[this.field3334.length - 1];
        }
        if (var2 == -1) {
            return null;
        }
        class254 var3 = (class254) field3337.method3100((long) var2);
        class254 var4;
        if (var3 == null) {
            byte[] var5 = Statics.field426.method3845(32, var2);
            class254 var6 = new class254();
            if (var5 != null) {
                var6.method4246(new class301(var5));
            }
            field3337.method3102(var6, (long) var2);
            var4 = var6;
        } else {
            var4 = var3;
        }
        return var4;
    }

    @ObfuscatedName("il.e(II)Ljava/lang/String;")
    public String method4267(int arg0) {
        String var2 = this.field3323;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class292.method1025(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("il.i(I)Llt;")
    public class326 method4250() {
        if (this.field3340 < 0) {
            return null;
        }
        class326 var1 = (class326) field3326.method3100((long) this.field3340);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method516(Statics.field3330, this.field3340, 0);
        if (var2 != null) {
            field3326.method3102(var2, (long) this.field3340);
        }
        return var2;
    }

    @ObfuscatedName("il.g(B)Llt;")
    public class326 method4251() {
        if (this.field3325 < 0) {
            return null;
        }
        class326 var1 = (class326) field3326.method3100((long) this.field3325);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method516(Statics.field3330, this.field3325, 0);
        if (var2 != null) {
            field3326.method3102(var2, (long) this.field3325);
        }
        return var2;
    }

    @ObfuscatedName("il.d(B)Llt;")
    public class326 method4252() {
        if (this.field3332 < 0) {
            return null;
        }
        class326 var1 = (class326) field3326.method3100((long) this.field3332);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method516(Statics.field3330, this.field3332, 0);
        if (var2 != null) {
            field3326.method3102(var2, (long) this.field3332);
        }
        return var2;
    }

    @ObfuscatedName("il.l(B)Llt;")
    public class326 method4253() {
        if (this.field3333 < 0) {
            return null;
        }
        class326 var1 = (class326) field3326.method3100((long) this.field3333);
        if (var1 != null) {
            return var1;
        }
        class326 var2 = class327.method516(Statics.field3330, this.field3333, 0);
        if (var2 != null) {
            field3326.method3102(var2, (long) this.field3333);
        }
        return var2;
    }

    @ObfuscatedName("il.j(I)Lko;")
    public class296 method4254() {
        if (this.field3327 == -1) {
            return null;
        }
        class296 var1 = (class296) field3321.method3100((long) this.field3327);
        if (var1 != null) {
            return var1;
        }
        class296 var2 = class327.method3063(Statics.field3330, Statics.field3322, this.field3327, 0);
        if (var2 != null) {
            field3321.method3102(var2, (long) this.field3327);
        }
        return var2;
    }
}
