package deob;

@ObfuscatedName("f")
public final class class3 extends class27 {

    @ObfuscatedName("f.i")
    public String field36;

    @ObfuscatedName("f.w")
    public class163 field33;

    @ObfuscatedName("f.f")
    public int field41 = -1;

    @ObfuscatedName("f.e")
    public int field32 = -1;

    @ObfuscatedName("f.t")
    public int field38 = 0;

    @ObfuscatedName("f.d")
    public int field37 = 0;

    @ObfuscatedName("f.p")
    public int field46;

    @ObfuscatedName("f.k")
    public int field34 = 0;

    @ObfuscatedName("f.r")
    public int field40 = 0;

    @ObfuscatedName("f.l")
    public int field35;

    @ObfuscatedName("f.a")
    public int field42;

    @ObfuscatedName("f.z")
    public int field43;

    @ObfuscatedName("f.s")
    public class112 field44;

    @ObfuscatedName("f.m")
    public int field45;

    @ObfuscatedName("f.u")
    public int field39;

    @ObfuscatedName("f.g")
    public int field47;

    @ObfuscatedName("f.o")
    public int field48;

    @ObfuscatedName("f.v")
    public boolean field49 = false;

    @ObfuscatedName("f.j")
    public int field50 = 0;

    @ObfuscatedName("f.i(Ldz;B)V")
    public final void method18(class127 arg0) {
        arg0.field2045 = 0;
        int var2 = arg0.method2472();
        this.field41 = arg0.method2453();
        this.field32 = arg0.method2453();
        int var3 = -1;
        this.field50 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2472();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2472();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2615();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method548(var4[var5] - 512).field1007;
                    if (var8 != 0) {
                        this.field50 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2472();
            if (var11 < 0 || var11 >= Statics.field1793[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field427 = arg0.method2615();
        if (this.field427 == 65535) {
            this.field427 = -1;
        }
        this.field428 = arg0.method2615();
        if (this.field428 == 65535) {
            this.field428 = -1;
        }
        this.field438 = this.field428;
        this.field430 = arg0.method2615();
        if (this.field430 == 65535) {
            this.field430 = -1;
        }
        this.field478 = arg0.method2615();
        if (this.field478 == 65535) {
            this.field478 = -1;
        }
        this.field424 = arg0.method2615();
        if (this.field424 == 65535) {
            this.field424 = -1;
        }
        this.field434 = arg0.method2615();
        if (this.field434 == 65535) {
            this.field434 = -1;
        }
        this.field455 = arg0.method2615();
        if (this.field455 == 65535) {
            this.field455 = -1;
        }
        this.field36 = arg0.method2460();
        if (Statics.field139 == this) {
            Statics.field1414 = this.field36;
        }
        this.field38 = arg0.method2472();
        this.field37 = arg0.method2615();
        if (this.field33 == null) {
            this.field33 = new class163();
        }
        this.field33.method3185(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("f.w(I)Ldb;")
    public final class112 method17() {
        if (this.field33 == null) {
            return null;
        }
        class34 var1 = this.field451 != -1 && this.field454 == 0 ? class34.method235(this.field451) : null;
        class34 var2 = this.field474 == -1 || this.field49 || this.field474 == this.field427 && var1 != null ? null : class34.method235(this.field474);
        class112 var3 = this.field33.method3168(var1, this.field452, var2, this.field465);
        if (var3 == null) {
            return null;
        }
        var3.method2244();
        this.field469 = var3.field1548;
        if (!this.field49 && this.field456 != -1 && this.field475 != -1) {
            class112 var4 = class35.method633(this.field456).method743(this.field475);
            if (var4 != null) {
                var4.method2264(0, -this.field431, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field49 && this.field44 != null) {
            if (client.field491 >= this.field40) {
                this.field44 = null;
            }
            if (client.field491 >= this.field34 && client.field491 < this.field40) {
                class112 var6 = this.field44;
                var6.method2264(this.field35 - this.field429, this.field42 - this.field46, this.field43 - this.field423);
                if (this.field470 == 512) {
                    var6.method2301();
                    var6.method2301();
                    var6.method2301();
                } else if (this.field470 == 1024) {
                    var6.method2301();
                    var6.method2301();
                } else if (this.field470 == 1536) {
                    var6.method2301();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field470 == 512) {
                    var6.method2301();
                } else if (this.field470 == 1024) {
                    var6.method2301();
                    var6.method2301();
                } else if (this.field470 == 1536) {
                    var6.method2301();
                    var6.method2301();
                    var6.method2301();
                }
                var6.method2264(this.field429 - this.field35, this.field46 - this.field42, this.field423 - this.field43);
            }
        }
        var3.field1889 = true;
        return var3;
    }

    @ObfuscatedName("f.f(B)Z")
    public final boolean method26() {
        return this.field33 != null;
    }
}
