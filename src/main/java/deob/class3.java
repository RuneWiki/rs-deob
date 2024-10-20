package deob;

@ObfuscatedName("m")
public final class class3 extends class27 {

    @ObfuscatedName("m.i")
    public String field58;

    @ObfuscatedName("m.v")
    public class163 field49;

    @ObfuscatedName("m.m")
    public int field38 = -1;

    @ObfuscatedName("m.j")
    public int field39 = -1;

    @ObfuscatedName("m.o")
    public int field40 = 0;

    @ObfuscatedName("m.l")
    public int field41 = 0;

    @ObfuscatedName("m.g")
    public int field42;

    @ObfuscatedName("m.w")
    public int field43 = 0;

    @ObfuscatedName("m.c")
    public int field44 = 0;

    @ObfuscatedName("m.z")
    public int field45;

    @ObfuscatedName("m.f")
    public int field46;

    @ObfuscatedName("m.a")
    public int field37;

    @ObfuscatedName("m.d")
    public class112 field48;

    @ObfuscatedName("m.e")
    public int field53;

    @ObfuscatedName("m.y")
    public int field47;

    @ObfuscatedName("m.k")
    public int field51;

    @ObfuscatedName("m.h")
    public int field52;

    @ObfuscatedName("m.x")
    public boolean field56 = false;

    @ObfuscatedName("m.b")
    public int field36 = 0;

    @ObfuscatedName("m.i(Lda;I)V")
    public final void method19(class127 arg0) {
        arg0.field2039 = 0;
        int var2 = arg0.method2491();
        this.field38 = arg0.method2492();
        this.field39 = arg0.method2492();
        int var3 = -1;
        this.field36 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2491();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2491();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2493();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method259(var4[var5] - 512).field1027;
                    if (var8 != 0) {
                        this.field36 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2491();
            if (var11 < 0 || var11 >= Statics.field2730[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field443 = arg0.method2493();
        if (this.field443 == 65535) {
            this.field443 = -1;
        }
        this.field425 = arg0.method2493();
        if (this.field425 == 65535) {
            this.field425 = -1;
        }
        this.field426 = this.field425;
        this.field434 = arg0.method2493();
        if (this.field434 == 65535) {
            this.field434 = -1;
        }
        this.field428 = arg0.method2493();
        if (this.field428 == 65535) {
            this.field428 = -1;
        }
        this.field429 = arg0.method2493();
        if (this.field429 == 65535) {
            this.field429 = -1;
        }
        this.field436 = arg0.method2493();
        if (this.field436 == 65535) {
            this.field436 = -1;
        }
        this.field431 = arg0.method2493();
        if (this.field431 == 65535) {
            this.field431 = -1;
        }
        this.field58 = arg0.method2500();
        if (Statics.field885 == this) {
            Statics.field1417 = this.field58;
        }
        this.field40 = arg0.method2491();
        this.field41 = arg0.method2493();
        if (this.field49 == null) {
            this.field49 = new class163();
        }
        this.field49.method3230(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("m.v(I)Ldl;")
    public final class112 method15() {
        if (this.field49 == null) {
            return null;
        }
        class34 var1 = this.field448 != -1 && this.field451 == 0 ? class34.method1443(this.field448) : null;
        class34 var2 = this.field445 == -1 || this.field56 || this.field445 == this.field443 && var1 != null ? null : class34.method1443(this.field445);
        class112 var3 = this.field49.method3235(var1, this.field449, var2, this.field446);
        if (var3 == null) {
            return null;
        }
        var3.method2273();
        this.field421 = var3.field1556;
        if (!this.field56 && this.field455 != -1 && this.field468 != -1) {
            class112 var4 = class35.method713(this.field455).method766(this.field468);
            if (var4 != null) {
                var4.method2283(0, -this.field457, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field56 && this.field48 != null) {
            if (client.field491 >= this.field44) {
                this.field48 = null;
            }
            if (client.field491 >= this.field43 && client.field491 < this.field44) {
                class112 var6 = this.field48;
                var6.method2283(this.field45 - this.field471, this.field46 - this.field42, this.field37 - this.field420);
                if (this.field454 == 512) {
                    var6.method2320();
                    var6.method2320();
                    var6.method2320();
                } else if (this.field454 == 1024) {
                    var6.method2320();
                    var6.method2320();
                } else if (this.field454 == 1536) {
                    var6.method2320();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field454 == 512) {
                    var6.method2320();
                } else if (this.field454 == 1024) {
                    var6.method2320();
                    var6.method2320();
                } else if (this.field454 == 1536) {
                    var6.method2320();
                    var6.method2320();
                    var6.method2320();
                }
                var6.method2283(this.field471 - this.field45, this.field42 - this.field46, this.field420 - this.field37);
            }
        }
        var3.field1889 = true;
        return var3;
    }

    @ObfuscatedName("m.m(B)Z")
    public final boolean method16() {
        return this.field49 != null;
    }
}
