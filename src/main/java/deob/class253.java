package deob;

@ObfuscatedName("ix")
public class class253 extends class176 {

    @ObfuscatedName("ix.g")
    public static class146 field3331 = new class146(64);

    @ObfuscatedName("ix.z")
    public static class146 field3332 = new class146(64);

    @ObfuscatedName("ix.p")
    public static class146 field3333 = new class146(20);

    @ObfuscatedName("ix.x")
    public int field3337 = -1;

    @ObfuscatedName("ix.o")
    public int field3338 = 16777215;

    @ObfuscatedName("ix.e")
    public int field3339 = 70;

    @ObfuscatedName("ix.n")
    public int field3352 = -1;

    @ObfuscatedName("ix.r")
    public int field3341 = -1;

    @ObfuscatedName("ix.c")
    public int field3342 = -1;

    @ObfuscatedName("ix.a")
    public int field3350 = -1;

    @ObfuscatedName("ix.d")
    public int field3344 = 0;

    @ObfuscatedName("ix.s")
    public int field3328 = 0;

    @ObfuscatedName("ix.t")
    public int field3349 = -1;

    @ObfuscatedName("ix.m")
    public String field3347 = "";

    @ObfuscatedName("ix.v")
    public int field3348 = -1;

    @ObfuscatedName("ix.q")
    public int field3334 = 0;

    @ObfuscatedName("ix.l")
    public int[] field3330;

    @ObfuscatedName("ix.j")
    public int field3340 = -1;

    @ObfuscatedName("ix.af")
    public int field3343 = -1;

    @ObfuscatedName("ae.u(II)Lix;")
    public static class253 method660(int arg0) {
        class253 var1 = (class253) field3331.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3351.method3928(32, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4261(new class300(var2));
        }
        field3331.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.f(Lkg;B)V")
    public void method4261(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4254(arg0, var2);
        }
    }

    @ObfuscatedName("ix.b(Lkg;II)V")
    public void method4254(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3337 = arg0.method5155();
        } else if (arg1 == 2) {
            this.field3338 = arg0.method5287();
        } else if (arg1 == 3) {
            this.field3352 = arg0.method5155();
        } else if (arg1 == 4) {
            this.field3342 = arg0.method5155();
        } else if (arg1 == 5) {
            this.field3341 = arg0.method5155();
        } else if (arg1 == 6) {
            this.field3350 = arg0.method5155();
        } else if (arg1 == 7) {
            this.field3344 = arg0.method5141();
        } else if (arg1 == 8) {
            this.field3347 = arg0.method5148();
        } else if (arg1 == 9) {
            this.field3339 = arg0.method5337();
        } else if (arg1 == 10) {
            this.field3328 = arg0.method5141();
        } else if (arg1 == 11) {
            this.field3349 = 0;
        } else if (arg1 == 12) {
            this.field3348 = arg0.method5138();
        } else if (arg1 == 13) {
            this.field3334 = arg0.method5141();
        } else if (arg1 == 14) {
            this.field3349 = arg0.method5337();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3340 = arg0.method5337();
            if (this.field3340 == 65535) {
                this.field3340 = -1;
            }
            this.field3343 = arg0.method5337();
            if (this.field3343 == 65535) {
                this.field3343 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5337();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5138();
            this.field3330 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3330[var5] = arg0.method5337();
                if (this.field3330[var5] == 65535) {
                    this.field3330[var5] = -1;
                }
            }
            this.field3330[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ix.g(I)Lix;")
    public final class253 method4255() {
        int var1 = -1;
        if (this.field3340 != -1) {
            var1 = class213.method3238(this.field3340);
        } else if (this.field3343 != -1) {
            var1 = class213.field2531[this.field3343];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3330.length - 1) {
            var2 = this.field3330[var1];
        } else {
            var2 = this.field3330[this.field3330.length - 1];
        }
        if (var2 == -1) {
            return null;
        }
        class253 var3 = (class253) field3331.method3076((long) var2);
        class253 var4;
        if (var3 == null) {
            byte[] var5 = Statics.field3351.method3928(32, var2);
            class253 var6 = new class253();
            if (var5 != null) {
                var6.method4261(new class300(var5));
            }
            field3331.method3078(var6, (long) var2);
            var4 = var6;
        } else {
            var4 = var3;
        }
        return var4;
    }

    @ObfuscatedName("ix.z(II)Ljava/lang/String;")
    public String method4271(int arg0) {
        String var2 = this.field3347;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class291.method4183(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ix.p(I)Lln;")
    public class325 method4257() {
        if (this.field3352 < 0) {
            return null;
        }
        class325 var1 = (class325) field3332.method3076((long) this.field3352);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4926(Statics.field3329, this.field3352, 0);
        if (var2 != null) {
            field3332.method3078(var2, (long) this.field3352);
        }
        return var2;
    }

    @ObfuscatedName("ix.h(I)Lln;")
    public class325 method4258() {
        if (this.field3341 < 0) {
            return null;
        }
        class325 var1 = (class325) field3332.method3076((long) this.field3341);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4926(Statics.field3329, this.field3341, 0);
        if (var2 != null) {
            field3332.method3078(var2, (long) this.field3341);
        }
        return var2;
    }

    @ObfuscatedName("ix.y(I)Lln;")
    public class325 method4266() {
        if (this.field3342 < 0) {
            return null;
        }
        class325 var1 = (class325) field3332.method3076((long) this.field3342);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4926(Statics.field3329, this.field3342, 0);
        if (var2 != null) {
            field3332.method3078(var2, (long) this.field3342);
        }
        return var2;
    }

    @ObfuscatedName("ix.w(B)Lln;")
    public class325 method4252() {
        if (this.field3350 < 0) {
            return null;
        }
        class325 var1 = (class325) field3332.method3076((long) this.field3350);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4926(Statics.field3329, this.field3350, 0);
        if (var2 != null) {
            field3332.method3078(var2, (long) this.field3350);
        }
        return var2;
    }

    @ObfuscatedName("ix.i(I)Lky;")
    public class295 method4281() {
        if (this.field3337 == -1) {
            return null;
        }
        class295 var1 = (class295) field3333.method3076((long) this.field3337);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class326.method1044(Statics.field3329, Statics.field3345, this.field3337, 0);
        if (var2 != null) {
            field3333.method3078(var2, (long) this.field3337);
        }
        return var2;
    }
}
