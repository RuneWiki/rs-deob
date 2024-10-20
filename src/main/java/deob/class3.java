package deob;

@ObfuscatedName("a")
public final class class3 extends class27 {

    @ObfuscatedName("a.d")
    public String field52;

    @ObfuscatedName("a.g")
    public class163 field40;

    @ObfuscatedName("a.a")
    public int field54 = -1;

    @ObfuscatedName("a.t")
    public int field42 = -1;

    @ObfuscatedName("a.f")
    public int field43 = 0;

    @ObfuscatedName("a.c")
    public int field58 = 0;

    @ObfuscatedName("a.p")
    public int field45;

    @ObfuscatedName("a.s")
    public int field46 = 0;

    @ObfuscatedName("a.k")
    public int field47 = 0;

    @ObfuscatedName("a.m")
    public int field48;

    @ObfuscatedName("a.y")
    public int field51;

    @ObfuscatedName("a.b")
    public int field50;

    @ObfuscatedName("a.l")
    public class112 field41;

    @ObfuscatedName("a.x")
    public int field39;

    @ObfuscatedName("a.z")
    public int field53;

    @ObfuscatedName("a.r")
    public int field55;

    @ObfuscatedName("a.h")
    public int field49;

    @ObfuscatedName("a.v")
    public boolean field56 = false;

    @ObfuscatedName("a.u")
    public int field57 = 0;

    @ObfuscatedName("a.d(Ldo;B)V")
    public final void method16(class127 arg0) {
        arg0.field2042 = 0;
        int var2 = arg0.method2509();
        this.field54 = arg0.method2500();
        this.field42 = arg0.method2500();
        int var3 = -1;
        this.field57 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2509();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2509();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2512();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method211(var4[var5] - 512).field1021;
                    if (var8 != 0) {
                        this.field57 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2509();
            if (var11 < 0 || var11 >= Statics.field1508[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field412 = arg0.method2512();
        if (this.field412 == 65535) {
            this.field412 = -1;
        }
        this.field405 = arg0.method2512();
        if (this.field405 == 65535) {
            this.field405 = -1;
        }
        this.field443 = this.field405;
        this.field407 = arg0.method2512();
        if (this.field407 == 65535) {
            this.field407 = -1;
        }
        this.field426 = arg0.method2512();
        if (this.field426 == 65535) {
            this.field426 = -1;
        }
        this.field409 = arg0.method2512();
        if (this.field409 == 65535) {
            this.field409 = -1;
        }
        this.field406 = arg0.method2512();
        if (this.field406 == 65535) {
            this.field406 = -1;
        }
        this.field411 = arg0.method2512();
        if (this.field411 == 65535) {
            this.field411 = -1;
        }
        this.field52 = arg0.method2408();
        if (Statics.field2319 == this) {
            Statics.field1260 = this.field52;
        }
        this.field43 = arg0.method2509();
        this.field58 = arg0.method2512();
        if (this.field40 == null) {
            this.field40 = new class163();
        }
        this.field40.method3138(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("a.g(I)Ldd;")
    public final class112 method18() {
        if (this.field40 == null) {
            return null;
        }
        class34 var1 = this.field428 != -1 && this.field431 == 0 ? class34.method136(this.field428) : null;
        class34 var2 = this.field408 == -1 || this.field56 || this.field412 == this.field408 && var1 != null ? null : class34.method136(this.field408);
        class112 var3 = this.field40.method3135(var1, this.field445, var2, this.field440);
        if (var3 == null) {
            return null;
        }
        var3.method2190();
        this.field446 = var3.field1545;
        if (!this.field56 && this.field455 != -1 && this.field429 != -1) {
            class112 var4 = class35.method102(this.field455).method715(this.field429);
            if (var4 != null) {
                var4.method2200(0, -this.field437, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field56 && this.field41 != null) {
            if (client.field472 >= this.field47) {
                this.field41 = null;
            }
            if (client.field472 >= this.field46 && client.field472 < this.field47) {
                class112 var6 = this.field41;
                var6.method2200(this.field48 - this.field420, this.field51 - this.field45, this.field50 - this.field400);
                if (this.field447 == 512) {
                    var6.method2207();
                    var6.method2207();
                    var6.method2207();
                } else if (this.field447 == 1024) {
                    var6.method2207();
                    var6.method2207();
                } else if (this.field447 == 1536) {
                    var6.method2207();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field447 == 512) {
                    var6.method2207();
                } else if (this.field447 == 1024) {
                    var6.method2207();
                    var6.method2207();
                } else if (this.field447 == 1536) {
                    var6.method2207();
                    var6.method2207();
                    var6.method2207();
                }
                var6.method2200(this.field420 - this.field48, this.field45 - this.field51, this.field400 - this.field50);
            }
        }
        var3.field1913 = true;
        return var3;
    }

    @ObfuscatedName("a.a(I)Z")
    public final boolean method19() {
        return this.field40 != null;
    }
}
