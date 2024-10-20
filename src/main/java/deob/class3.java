package deob;

@ObfuscatedName("y")
public final class class3 extends class27 {

    @ObfuscatedName("y.c")
    public String field50;

    @ObfuscatedName("y.q")
    public class164 field31;

    @ObfuscatedName("y.y")
    public int field36 = -1;

    @ObfuscatedName("y.v")
    public int field33 = -1;

    @ObfuscatedName("y.g")
    public int field35 = 0;

    @ObfuscatedName("y.x")
    public int field44 = 0;

    @ObfuscatedName("y.u")
    public int field45;

    @ObfuscatedName("y.l")
    public int field37 = 0;

    @ObfuscatedName("y.a")
    public int field38 = 0;

    @ObfuscatedName("y.h")
    public int field39;

    @ObfuscatedName("y.t")
    public int field40;

    @ObfuscatedName("y.m")
    public int field41;

    @ObfuscatedName("y.s")
    public class112 field32;

    @ObfuscatedName("y.j")
    public int field43;

    @ObfuscatedName("y.b")
    public int field42;

    @ObfuscatedName("y.n")
    public int field49;

    @ObfuscatedName("y.z")
    public int field46;

    @ObfuscatedName("y.d")
    public boolean field47 = false;

    @ObfuscatedName("y.f")
    public int field48 = 0;

    @ObfuscatedName("y.c(Ldg;I)V")
    public final void method12(class127 arg0) {
        arg0.field2052 = 0;
        int var2 = arg0.method2383();
        this.field36 = arg0.method2319();
        this.field33 = arg0.method2319();
        int var3 = -1;
        this.field48 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2383();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2383();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2327();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method11(var4[var5] - 512).field1039;
                    if (var8 != 0) {
                        this.field48 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2383();
            if (var11 < 0 || var11 >= Statics.field2757[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field437 = arg0.method2327();
        if (this.field437 == 65535) {
            this.field437 = -1;
        }
        this.field438 = arg0.method2327();
        if (this.field438 == 65535) {
            this.field438 = -1;
        }
        this.field439 = this.field438;
        this.field436 = arg0.method2327();
        if (this.field436 == 65535) {
            this.field436 = -1;
        }
        this.field441 = arg0.method2327();
        if (this.field441 == 65535) {
            this.field441 = -1;
        }
        this.field442 = arg0.method2327();
        if (this.field442 == 65535) {
            this.field442 = -1;
        }
        this.field443 = arg0.method2327();
        if (this.field443 == 65535) {
            this.field443 = -1;
        }
        this.field444 = arg0.method2327();
        if (this.field444 == 65535) {
            this.field444 = -1;
        }
        this.field50 = arg0.method2315();
        if (Statics.field2555 == this) {
            Statics.field1434 = this.field50;
        }
        this.field35 = arg0.method2383();
        this.field44 = arg0.method2327();
        if (this.field31 == null) {
            this.field31 = new class164();
        }
        this.field31.method3061(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("y.q(B)Ldl;")
    public final class112 method13() {
        if (this.field31 == null) {
            return null;
        }
        class34 var1 = this.field461 != -1 && this.field464 == 0 ? Statics.method1425(this.field461) : null;
        class34 var2 = this.field458 == -1 || this.field47 || this.field458 == this.field437 && var1 != null ? null : Statics.method1425(this.field458);
        class112 var3 = this.field31.method3081(var1, this.field462, var2, this.field459);
        if (var3 == null) {
            return null;
        }
        var3.method2192();
        this.field440 = var3.field1569;
        if (!this.field47 && this.field484 != -1 && this.field467 != -1) {
            class112 var4 = class35.method743(this.field484).method720(this.field467);
            if (var4 != null) {
                var4.method2148(0, -this.field460, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field47 && this.field32 != null) {
            if (client.field503 >= this.field38) {
                this.field32 = null;
            }
            if (client.field503 >= this.field37 && client.field503 < this.field38) {
                class112 var6 = this.field32;
                var6.method2148(this.field39 - this.field468, this.field40 - this.field45, this.field41 - this.field435);
                if (this.field489 == 512) {
                    var6.method2144();
                    var6.method2144();
                    var6.method2144();
                } else if (this.field489 == 1024) {
                    var6.method2144();
                    var6.method2144();
                } else if (this.field489 == 1536) {
                    var6.method2144();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field489 == 512) {
                    var6.method2144();
                } else if (this.field489 == 1024) {
                    var6.method2144();
                    var6.method2144();
                } else if (this.field489 == 1536) {
                    var6.method2144();
                    var6.method2144();
                    var6.method2144();
                }
                var6.method2148(this.field468 - this.field39, this.field45 - this.field40, this.field435 - this.field41);
            }
        }
        var3.field1919 = true;
        return var3;
    }

    @ObfuscatedName("y.y(I)Z")
    public final boolean method14() {
        return this.field31 != null;
    }
}
