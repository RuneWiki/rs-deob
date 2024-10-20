package deob;

@ObfuscatedName("v")
public final class class3 extends class27 {

    @ObfuscatedName("v.g")
    public String field50;

    @ObfuscatedName("v.m")
    public class163 field39;

    @ObfuscatedName("v.v")
    public int field51 = -1;

    @ObfuscatedName("v.r")
    public int field37 = -1;

    @ObfuscatedName("v.n")
    public int field40 = 0;

    @ObfuscatedName("v.i")
    public int field38 = 0;

    @ObfuscatedName("v.s")
    public int field41;

    @ObfuscatedName("v.w")
    public int field36 = 0;

    @ObfuscatedName("v.d")
    public int field44 = 0;

    @ObfuscatedName("v.t")
    public int field45;

    @ObfuscatedName("v.f")
    public int field46;

    @ObfuscatedName("v.b")
    public int field47;

    @ObfuscatedName("v.z")
    public class112 field48;

    @ObfuscatedName("v.l")
    public int field49;

    @ObfuscatedName("v.e")
    public int field43;

    @ObfuscatedName("v.p")
    public int field55;

    @ObfuscatedName("v.o")
    public int field52;

    @ObfuscatedName("v.h")
    public boolean field53 = false;

    @ObfuscatedName("v.j")
    public int field54 = 0;

    @ObfuscatedName("v.g(Ldr;I)V")
    public final void method15(class127 arg0) {
        arg0.field2023 = 0;
        int var2 = arg0.method2414();
        this.field51 = arg0.method2415();
        this.field37 = arg0.method2415();
        int var3 = -1;
        this.field54 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2414();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2414();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2416();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method41(var4[var5] - 512).field1021;
                    if (var8 != 0) {
                        this.field54 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2414();
            if (var11 < 0 || var11 >= Statics.field2719[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field408 = arg0.method2416();
        if (this.field408 == 65535) {
            this.field408 = -1;
        }
        this.field409 = arg0.method2416();
        if (this.field409 == 65535) {
            this.field409 = -1;
        }
        this.field430 = this.field409;
        this.field411 = arg0.method2416();
        if (this.field411 == 65535) {
            this.field411 = -1;
        }
        this.field451 = arg0.method2416();
        if (this.field451 == 65535) {
            this.field451 = -1;
        }
        this.field445 = arg0.method2416();
        if (this.field445 == 65535) {
            this.field445 = -1;
        }
        this.field423 = arg0.method2416();
        if (this.field423 == 65535) {
            this.field423 = -1;
        }
        this.field415 = arg0.method2416();
        if (this.field415 == 65535) {
            this.field415 = -1;
        }
        this.field50 = arg0.method2422();
        if (Statics.field2706 == this) {
            Statics.field1410 = this.field50;
        }
        this.field40 = arg0.method2414();
        this.field38 = arg0.method2416();
        if (this.field39 == null) {
            this.field39 = new class163();
        }
        this.field39.method3156(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("v.m(B)Ldf;")
    public final class112 method30() {
        if (this.field39 == null) {
            return null;
        }
        class34 var1 = this.field432 != -1 && this.field435 == 0 ? class34.method1536(this.field432) : null;
        class34 var2 = this.field429 == -1 || this.field53 || this.field429 == this.field408 && var1 != null ? null : class34.method1536(this.field429);
        class112 var3 = this.field39.method3161(var1, this.field418, var2, this.field410);
        if (var3 == null) {
            return null;
        }
        var3.method2270();
        this.field452 = var3.field1549;
        if (!this.field53 && this.field437 != -1 && this.field405 != -1) {
            class112 var4 = class35.method226(this.field437).method738(this.field405);
            if (var4 != null) {
                var4.method2209(0, -this.field441, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field53 && this.field48 != null) {
            if (client.field476 >= this.field44) {
                this.field48 = null;
            }
            if (client.field476 >= this.field36 && client.field476 < this.field44) {
                class112 var6 = this.field48;
                var6.method2209(this.field45 - this.field463, this.field46 - this.field41, this.field47 - this.field404);
                if (this.field406 == 512) {
                    var6.method2214();
                    var6.method2214();
                    var6.method2214();
                } else if (this.field406 == 1024) {
                    var6.method2214();
                    var6.method2214();
                } else if (this.field406 == 1536) {
                    var6.method2214();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field406 == 512) {
                    var6.method2214();
                } else if (this.field406 == 1024) {
                    var6.method2214();
                    var6.method2214();
                } else if (this.field406 == 1536) {
                    var6.method2214();
                    var6.method2214();
                    var6.method2214();
                }
                var6.method2209(this.field463 - this.field45, this.field41 - this.field46, this.field404 - this.field47);
            }
        }
        var3.field1848 = true;
        return var3;
    }

    @ObfuscatedName("v.v(B)Z")
    public final boolean method20() {
        return this.field39 != null;
    }
}
