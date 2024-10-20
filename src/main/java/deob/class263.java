package deob;

@ObfuscatedName("jv")
public class class263 extends class185 {

    @ObfuscatedName("jv.d")
    public static class155 field3324 = new class155(64);

    @ObfuscatedName("jv.w")
    public static class155 field3322 = new class155(64);

    @ObfuscatedName("jv.v")
    public static class155 field3336 = new class155(20);

    @ObfuscatedName("jv.p")
    public int field3326 = -1;

    @ObfuscatedName("jv.n")
    public int field3329 = 16777215;

    @ObfuscatedName("jv.u")
    public int field3330 = 70;

    @ObfuscatedName("jv.h")
    public int field3331 = -1;

    @ObfuscatedName("jv.g")
    public int field3332 = -1;

    @ObfuscatedName("jv.i")
    public int field3333 = -1;

    @ObfuscatedName("jv.a")
    public int field3334 = -1;

    @ObfuscatedName("jv.b")
    public int field3339 = 0;

    @ObfuscatedName("jv.l")
    public int field3342 = 0;

    @ObfuscatedName("jv.r")
    public int field3335 = -1;

    @ObfuscatedName("jv.o")
    public String field3338 = "";

    @ObfuscatedName("jv.c")
    public int field3328 = -1;

    @ObfuscatedName("jv.j")
    public int field3340 = 0;

    @ObfuscatedName("jv.y")
    public int[] field3341;

    @ObfuscatedName("jv.f")
    public int field3337 = -1;

    @ObfuscatedName("jv.ae")
    public int field3343 = -1;

    @ObfuscatedName("l.x(II)Ljv;")
    public static class263 method183(int arg0) {
        class263 var1 = (class263) field3324.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3325.method3869(32, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4234(new class310(var2));
        }
        field3324.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.m(Lkb;I)V")
    public void method4234(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4235(arg0, var2);
        }
    }

    @ObfuscatedName("jv.k(Lkb;II)V")
    public void method4235(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3326 = arg0.method5154();
        } else if (arg1 == 2) {
            this.field3329 = arg0.method5264();
        } else if (arg1 == 3) {
            this.field3331 = arg0.method5154();
        } else if (arg1 == 4) {
            this.field3333 = arg0.method5154();
        } else if (arg1 == 5) {
            this.field3332 = arg0.method5154();
        } else if (arg1 == 6) {
            this.field3334 = arg0.method5154();
        } else if (arg1 == 7) {
            this.field3339 = arg0.method5140();
        } else if (arg1 == 8) {
            this.field3338 = arg0.method5147();
        } else if (arg1 == 9) {
            this.field3330 = arg0.method5139();
        } else if (arg1 == 10) {
            this.field3342 = arg0.method5140();
        } else if (arg1 == 11) {
            this.field3335 = 0;
        } else if (arg1 == 12) {
            this.field3328 = arg0.method5137();
        } else if (arg1 == 13) {
            this.field3340 = arg0.method5140();
        } else if (arg1 == 14) {
            this.field3335 = arg0.method5139();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field3337 = arg0.method5139();
            if (this.field3337 == 65535) {
                this.field3337 = -1;
            }
            this.field3343 = arg0.method5139();
            if (this.field3343 == 65535) {
                this.field3343 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method5139();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method5137();
            this.field3341 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field3341[var5] = arg0.method5139();
                if (this.field3341[var5] == 65535) {
                    this.field3341[var5] = -1;
                }
            }
            this.field3341[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("jv.d(I)Ljv;")
    public final class263 method4236() {
        int var1 = -1;
        if (this.field3337 != -1) {
            var1 = class222.method2013(this.field3337);
        } else if (this.field3343 != -1) {
            var1 = class222.field2527[this.field3343];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3341.length - 1) {
            var2 = this.field3341[var1];
        } else {
            var2 = this.field3341[this.field3341.length - 1];
        }
        return var2 == -1 ? null : method183(var2);
    }

    @ObfuscatedName("jv.w(II)Ljava/lang/String;")
    public String method4237(int arg0) {
        String var2 = this.field3338;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class301.method4644(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("jv.v(I)Lla;")
    public class335 method4250() {
        if (this.field3331 < 0) {
            return null;
        }
        class335 var1 = (class335) field3322.method3146((long) this.field3331);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method3441(Statics.field3323, this.field3331, 0);
        if (var2 != null) {
            field3322.method3152(var2, (long) this.field3331);
        }
        return var2;
    }

    @ObfuscatedName("jv.q(I)Lla;")
    public class335 method4239() {
        if (this.field3332 < 0) {
            return null;
        }
        class335 var1 = (class335) field3322.method3146((long) this.field3332);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method3441(Statics.field3323, this.field3332, 0);
        if (var2 != null) {
            field3322.method3152(var2, (long) this.field3332);
        }
        return var2;
    }

    @ObfuscatedName("jv.z(I)Lla;")
    public class335 method4240() {
        if (this.field3333 < 0) {
            return null;
        }
        class335 var1 = (class335) field3322.method3146((long) this.field3333);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method3441(Statics.field3323, this.field3333, 0);
        if (var2 != null) {
            field3322.method3152(var2, (long) this.field3333);
        }
        return var2;
    }

    @ObfuscatedName("jv.t(I)Lla;")
    public class335 method4241() {
        if (this.field3334 < 0) {
            return null;
        }
        class335 var1 = (class335) field3322.method3146((long) this.field3334);
        if (var1 != null) {
            return var1;
        }
        class335 var2 = class336.method3441(Statics.field3323, this.field3334, 0);
        if (var2 != null) {
            field3322.method3152(var2, (long) this.field3334);
        }
        return var2;
    }

    @ObfuscatedName("jv.e(I)Lkx;")
    public class305 method4244() {
        if (this.field3326 == -1) {
            return null;
        }
        class305 var1 = (class305) field3336.method3146((long) this.field3326);
        if (var1 != null) {
            return var1;
        }
        class244 var2 = Statics.field3323;
        class244 var3 = Statics.field3640;
        int var4 = this.field3326;
        class305 var5;
        if (class336.method3218(var2, var4, 0)) {
            var5 = class336.method2830(var3.method3869(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field3336.method3152(var5, (long) this.field3326);
        }
        return var5;
    }
}
