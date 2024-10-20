package deob;

@ObfuscatedName("c")
public final class class3 extends class27 {

    @ObfuscatedName("c.t")
    public String field51;

    @ObfuscatedName("c.l")
    public class163 field37;

    @ObfuscatedName("c.c")
    public int field38 = -1;

    @ObfuscatedName("c.d")
    public int field36 = -1;

    @ObfuscatedName("c.b")
    public int field40 = 0;

    @ObfuscatedName("c.i")
    public int field45 = 0;

    @ObfuscatedName("c.p")
    public int field42;

    @ObfuscatedName("c.y")
    public int field44 = 0;

    @ObfuscatedName("c.u")
    public int field57 = 0;

    @ObfuscatedName("c.z")
    public int field52;

    @ObfuscatedName("c.j")
    public int field46;

    @ObfuscatedName("c.h")
    public int field47;

    @ObfuscatedName("c.x")
    public class112 field48;

    @ObfuscatedName("c.q")
    public int field49;

    @ObfuscatedName("c.w")
    public int field50;

    @ObfuscatedName("c.k")
    public int field53;

    @ObfuscatedName("c.o")
    public int field56;

    @ObfuscatedName("c.f")
    public boolean field41 = false;

    @ObfuscatedName("c.r")
    public int field54 = 0;

    @ObfuscatedName("c.t(Ldo;I)V")
    public final void method17(class127 arg0) {
        arg0.field2059 = 0;
        int var2 = arg0.method2438();
        this.field38 = arg0.method2629();
        this.field36 = arg0.method2629();
        int var3 = -1;
        this.field54 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2438();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2438();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2440();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method119(var4[var5] - 512).field1050;
                    if (var8 != 0) {
                        this.field54 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2438();
            if (var11 < 0 || var11 >= Statics.field2735[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field443 = arg0.method2440();
        if (this.field443 == 65535) {
            this.field443 = -1;
        }
        this.field436 = arg0.method2440();
        if (this.field436 == 65535) {
            this.field436 = -1;
        }
        this.field437 = this.field436;
        this.field484 = arg0.method2440();
        if (this.field484 == 65535) {
            this.field484 = -1;
        }
        this.field439 = arg0.method2440();
        if (this.field439 == 65535) {
            this.field439 = -1;
        }
        this.field461 = arg0.method2440();
        if (this.field461 == 65535) {
            this.field461 = -1;
        }
        this.field441 = arg0.method2440();
        if (this.field441 == 65535) {
            this.field441 = -1;
        }
        this.field442 = arg0.method2440();
        if (this.field442 == 65535) {
            this.field442 = -1;
        }
        this.field51 = arg0.method2627();
        if (Statics.field1431 == this) {
            Statics.field2053 = this.field51;
        }
        this.field40 = arg0.method2438();
        this.field45 = arg0.method2440();
        if (this.field37 == null) {
            this.field37 = new class163();
        }
        this.field37.method3185(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("c.l(I)Ldk;")
    public final class112 method18() {
        if (this.field37 == null) {
            return null;
        }
        class34 var1 = this.field459 != -1 && this.field462 == 0 ? Statics.method31(this.field459) : null;
        class34 var2 = this.field434 == -1 || this.field41 || this.field443 == this.field434 && var1 != null ? null : Statics.method31(this.field434);
        class112 var3 = this.field37.method3191(var1, this.field452, var2, this.field464);
        if (var3 == null) {
            return null;
        }
        var3.method2238();
        this.field477 = var3.field1588;
        if (!this.field41 && this.field435 != -1 && this.field486 != -1) {
            class112 var4 = class35.method711(this.field435).method773(this.field486);
            if (var4 != null) {
                var4.method2243(0, -this.field468, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field41 && this.field48 != null) {
            if (client.field652 >= this.field57) {
                this.field48 = null;
            }
            if (client.field652 >= this.field44 && client.field652 < this.field57) {
                class112 var6 = this.field48;
                var6.method2243(this.field52 - this.field431, this.field46 - this.field42, this.field47 - this.field440);
                if (this.field478 == 512) {
                    var6.method2295();
                    var6.method2295();
                    var6.method2295();
                } else if (this.field478 == 1024) {
                    var6.method2295();
                    var6.method2295();
                } else if (this.field478 == 1536) {
                    var6.method2295();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field478 == 512) {
                    var6.method2295();
                } else if (this.field478 == 1024) {
                    var6.method2295();
                    var6.method2295();
                } else if (this.field478 == 1536) {
                    var6.method2295();
                    var6.method2295();
                    var6.method2295();
                }
                var6.method2243(this.field431 - this.field52, this.field42 - this.field46, this.field440 - this.field47);
            }
        }
        var3.field1878 = true;
        return var3;
    }

    @ObfuscatedName("c.c(B)Z")
    public final boolean method21() {
        return this.field37 != null;
    }
}
