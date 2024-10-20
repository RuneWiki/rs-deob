package deob;

@ObfuscatedName("jd")
public class class266 extends class206 {

    @ObfuscatedName("jd.r")
    public static class201 field3507 = new class201(64);

    @ObfuscatedName("jd.h")
    public static class201 field3501 = new class201(64);

    @ObfuscatedName("jd.d")
    public static class201 field3502 = new class201(20);

    @ObfuscatedName("jd.u")
    public int field3505 = -1;

    @ObfuscatedName("jd.p")
    public int field3510 = 16777215;

    @ObfuscatedName("jd.w")
    public int field3504 = 70;

    @ObfuscatedName("jd.t")
    public int field3506 = -1;

    @ObfuscatedName("jd.o")
    public int field3509 = -1;

    @ObfuscatedName("jd.a")
    public int field3498 = -1;

    @ObfuscatedName("jd.i")
    public int field3511 = -1;

    @ObfuscatedName("jd.m")
    public int field3512 = 0;

    @ObfuscatedName("jd.x")
    public int field3500 = 0;

    @ObfuscatedName("jd.l")
    public int field3514 = -1;

    @ObfuscatedName("jd.j")
    public String field3515 = "";

    @ObfuscatedName("jd.g")
    public int field3513 = -1;

    @ObfuscatedName("jd.c")
    public int field3517 = 0;

    @ObfuscatedName("jd.k")
    public int[] field3508;

    @ObfuscatedName("jd.q")
    public int field3519 = -1;

    @ObfuscatedName("jd.ac")
    public int field3520 = -1;

    @ObfuscatedName("fy.n(IB)Ljd;")
    public static class266 method2943(int arg0) {
        class266 var1 = (class266) field3507.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3516.method3931(32, arg0);
        class266 var3 = new class266();
        if (var2 != null) {
            var3.method4272(new class185(var2));
        }
        field3507.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.v(Lgv;I)V")
    public void method4272(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4273(arg0, var2);
        }
    }

    @ObfuscatedName("jd.y(Lgv;IS)V")
    public void method4273(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3505 = arg0.method3200();
        } else if (arg1 == 2) {
            this.field3510 = arg0.method3025();
        } else if (arg1 == 3) {
            this.field3506 = arg0.method3200();
        } else if (arg1 == 4) {
            this.field3498 = arg0.method3200();
        } else if (arg1 == 5) {
            this.field3509 = arg0.method3200();
        } else if (arg1 == 6) {
            this.field3511 = arg0.method3200();
        } else if (arg1 == 7) {
            this.field3512 = arg0.method3024();
        } else if (arg1 == 8) {
            this.field3515 = arg0.method3031();
        } else if (arg1 == 9) {
            this.field3504 = arg0.method3015();
        } else if (arg1 == 10) {
            this.field3500 = arg0.method3024();
        } else if (arg1 == 11) {
            this.field3514 = 0;
        } else if (arg1 == 12) {
            this.field3513 = arg0.method3021();
        } else if (arg1 == 13) {
            this.field3517 = arg0.method3024();
        } else if (arg1 == 14) {
            this.field3514 = arg0.method3015();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3519 = arg0.method3015();
            if (this.field3519 == 65535) {
                this.field3519 = -1;
            }
            this.field3520 = arg0.method3015();
            if (this.field3520 == 65535) {
                this.field3520 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3015();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method3021();
            this.field3508 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3508[var5] = arg0.method3015();
                if (this.field3508[var5] == 65535) {
                    this.field3508[var5] = -1;
                }
            }
            this.field3508[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jd.r(S)Ljd;")
    public final class266 method4281() {
        int var1 = -1;
        if (this.field3519 != -1) {
            var1 = class223.method1428(this.field3519);
        } else if (this.field3520 != -1) {
            var1 = class223.field2726[this.field3520];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3508.length - 1) {
            var2 = this.field3508[var1];
        } else {
            var2 = this.field3508[this.field3508.length - 1];
        }
        return var2 == -1 ? null : method2943(var2);
    }

    @ObfuscatedName("jd.h(IB)Ljava/lang/String;")
    public String method4275(int arg0) {
        String var2 = this.field3515;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            String var4 = var2.substring(0, var3);
            String var5 = Integer.toString(arg0);
            var2 = var4 + var5 + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jd.d(B)Lkg;")
    public class299 method4276() {
        if (this.field3506 < 0) {
            return null;
        }
        class299 var1 = (class299) field3501.method3407((long) this.field3506);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method675(Statics.field726, this.field3506, 0);
        if (var2 != null) {
            field3501.method3408(var2, (long) this.field3506);
        }
        return var2;
    }

    @ObfuscatedName("jd.s(S)Lkg;")
    public class299 method4277() {
        if (this.field3509 < 0) {
            return null;
        }
        class299 var1 = (class299) field3501.method3407((long) this.field3509);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method675(Statics.field726, this.field3509, 0);
        if (var2 != null) {
            field3501.method3408(var2, (long) this.field3509);
        }
        return var2;
    }

    @ObfuscatedName("jd.b(I)Lkg;")
    public class299 method4299() {
        if (this.field3498 < 0) {
            return null;
        }
        class299 var1 = (class299) field3501.method3407((long) this.field3498);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method675(Statics.field726, this.field3498, 0);
        if (var2 != null) {
            field3501.method3408(var2, (long) this.field3498);
        }
        return var2;
    }

    @ObfuscatedName("jd.e(I)Lkg;")
    public class299 method4279() {
        if (this.field3511 < 0) {
            return null;
        }
        class299 var1 = (class299) field3501.method3407((long) this.field3511);
        if (var1 != null) {
            return var1;
        }
        class299 var2 = class300.method675(Statics.field726, this.field3511, 0);
        if (var2 != null) {
            field3501.method3408(var2, (long) this.field3511);
        }
        return var2;
    }

    @ObfuscatedName("jd.f(B)Ljz;")
    public class275 method4298() {
        if (this.field3505 == -1) {
            return null;
        }
        class275 var1 = (class275) field3502.method3407((long) this.field3505);
        if (var1 != null) {
            return var1;
        }
        class247 var2 = Statics.field726;
        class247 var3 = Statics.field3499;
        int var4 = this.field3505;
        class275 var5;
        if (class300.method4715(var2, var4, 0)) {
            byte[] var6 = var3.method3931(var4, 0);
            class275 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class275 var8 = new class275(var6, Statics.field3871, Statics.field3872, Statics.field636, Statics.field2100, Statics.field3870, Statics.field2552);
                class300.method2696();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3502.method3408(var5, (long) this.field3505);
        }
        return var5;
    }
}
