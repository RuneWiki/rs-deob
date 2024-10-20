package deob;

@ObfuscatedName("jb")
public class class262 extends class202 {

    @ObfuscatedName("jb.g")
    public static class197 field3470 = new class197(64);

    @ObfuscatedName("jb.x")
    public static class197 field3465 = new class197(64);

    @ObfuscatedName("jb.f")
    public static class197 field3466 = new class197(20);

    @ObfuscatedName("jb.o")
    public int field3481 = -1;

    @ObfuscatedName("jb.a")
    public int field3464 = 16777215;

    @ObfuscatedName("jb.q")
    public int field3471 = 70;

    @ObfuscatedName("jb.j")
    public int field3472 = -1;

    @ObfuscatedName("jb.m")
    public int field3474 = -1;

    @ObfuscatedName("jb.h")
    public int field3475 = -1;

    @ObfuscatedName("jb.c")
    public int field3473 = -1;

    @ObfuscatedName("jb.y")
    public int field3476 = 0;

    @ObfuscatedName("jb.p")
    public int field3477 = 0;

    @ObfuscatedName("jb.i")
    public int field3478 = -1;

    @ObfuscatedName("jb.l")
    public String field3479 = "";

    @ObfuscatedName("jb.z")
    public int field3480 = -1;

    @ObfuscatedName("jb.e")
    public int field3467 = 0;

    @ObfuscatedName("jb.v")
    public int[] field3482;

    @ObfuscatedName("jb.w")
    public int field3483 = -1;

    @ObfuscatedName("jb.av")
    public int field3484 = -1;

    @ObfuscatedName("bt.b(II)Ljb;")
    public static class262 method852(int arg0) {
        class262 var1 = (class262) field3470.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3461.method3887(32, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4207(new class181(var2));
        }
        field3470.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.s(Lfs;I)V")
    public void method4207(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4193(arg0, var2);
        }
    }

    @ObfuscatedName("jb.r(Lfs;IB)V")
    public void method4193(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3481 = arg0.method2960();
        } else if (arg1 == 2) {
            this.field3464 = arg0.method3010();
        } else if (arg1 == 3) {
            this.field3472 = arg0.method2960();
        } else if (arg1 == 4) {
            this.field3475 = arg0.method2960();
        } else if (arg1 == 5) {
            this.field3474 = arg0.method2960();
        } else if (arg1 == 6) {
            this.field3473 = arg0.method2960();
        } else if (arg1 == 7) {
            this.field3476 = arg0.method3050();
        } else if (arg1 == 8) {
            this.field3479 = arg0.method2970();
        } else if (arg1 == 9) {
            this.field3471 = arg0.method3081();
        } else if (arg1 == 10) {
            this.field3477 = arg0.method3050();
        } else if (arg1 == 11) {
            this.field3478 = 0;
        } else if (arg1 == 12) {
            this.field3480 = arg0.method2945();
        } else if (arg1 == 13) {
            this.field3467 = arg0.method3050();
        } else if (arg1 == 14) {
            this.field3478 = arg0.method3081();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3483 = arg0.method3081();
            if (this.field3483 == 65535) {
                this.field3483 = -1;
            }
            this.field3484 = arg0.method3081();
            if (this.field3484 == 65535) {
                this.field3484 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method3081();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2945();
            this.field3482 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3482[var5] = arg0.method3081();
                if (this.field3482[var5] == 65535) {
                    this.field3482[var5] = -1;
                }
            }
            this.field3482[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jb.g(B)Ljb;")
    public final class262 method4172() {
        int var1 = -1;
        if (this.field3483 != -1) {
            var1 = class219.method122(this.field3483);
        } else if (this.field3484 != -1) {
            var1 = class219.field2680[this.field3484];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3482.length - 1) {
            var2 = this.field3482[var1];
        } else {
            var2 = this.field3482[this.field3482.length - 1];
        }
        return var2 == -1 ? null : method852(var2);
    }

    @ObfuscatedName("jb.x(IB)Ljava/lang/String;")
    public String method4196(int arg0) {
        String var2 = this.field3479;
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

    @ObfuscatedName("jb.f(S)Lkb;")
    public class295 method4174() {
        if (this.field3472 < 0) {
            return null;
        }
        class295 var1 = (class295) field3465.method3330((long) this.field3472);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method2845(Statics.field3469, this.field3472, 0);
        if (var2 != null) {
            field3465.method3332(var2, (long) this.field3472);
        }
        return var2;
    }

    @ObfuscatedName("jb.u(I)Lkb;")
    public class295 method4175() {
        if (this.field3474 < 0) {
            return null;
        }
        class295 var1 = (class295) field3465.method3330((long) this.field3474);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method2845(Statics.field3469, this.field3474, 0);
        if (var2 != null) {
            field3465.method3332(var2, (long) this.field3474);
        }
        return var2;
    }

    @ObfuscatedName("jb.t(I)Lkb;")
    public class295 method4203() {
        if (this.field3475 < 0) {
            return null;
        }
        class295 var1 = (class295) field3465.method3330((long) this.field3475);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method2845(Statics.field3469, this.field3475, 0);
        if (var2 != null) {
            field3465.method3332(var2, (long) this.field3475);
        }
        return var2;
    }

    @ObfuscatedName("jb.k(I)Lkb;")
    public class295 method4177() {
        if (this.field3473 < 0) {
            return null;
        }
        class295 var1 = (class295) field3465.method3330((long) this.field3473);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method2845(Statics.field3469, this.field3473, 0);
        if (var2 != null) {
            field3465.method3332(var2, (long) this.field3473);
        }
        return var2;
    }

    @ObfuscatedName("jb.n(B)Ljn;")
    public class271 method4178() {
        if (this.field3481 == -1) {
            return null;
        }
        class271 var1 = (class271) field3466.method3330((long) this.field3481);
        if (var1 != null) {
            return var1;
        }
        class271 var2 = class296.method4644(Statics.field3469, Statics.field3463, this.field3481, 0);
        if (var2 != null) {
            field3466.method3332(var2, (long) this.field3481);
        }
        return var2;
    }
}
