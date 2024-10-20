package deob;

@ObfuscatedName("a")
public final class class3 extends class27 {

    @ObfuscatedName("a.i")
    public String field40;

    @ObfuscatedName("a.p")
    public class163 field32;

    @ObfuscatedName("a.a")
    public int field46 = -1;

    @ObfuscatedName("a.l")
    public int field34 = -1;

    @ObfuscatedName("a.q")
    public int field35 = 0;

    @ObfuscatedName("a.b")
    public int field50 = 0;

    @ObfuscatedName("a.u")
    public int field37;

    @ObfuscatedName("a.d")
    public int field38 = 0;

    @ObfuscatedName("a.m")
    public int field39 = 0;

    @ObfuscatedName("a.v")
    public int field53;

    @ObfuscatedName("a.j")
    public int field41;

    @ObfuscatedName("a.f")
    public int field42;

    @ObfuscatedName("a.h")
    public class112 field43;

    @ObfuscatedName("a.o")
    public int field44;

    @ObfuscatedName("a.z")
    public int field48;

    @ObfuscatedName("a.k")
    public int field33;

    @ObfuscatedName("a.y")
    public int field47;

    @ObfuscatedName("a.g")
    public boolean field45 = false;

    @ObfuscatedName("a.e")
    public int field49 = 0;

    @ObfuscatedName("a.i(Ldn;I)V")
    public final void method17(class127 arg0) {
        arg0.field2037 = 0;
        int var2 = arg0.method2411();
        this.field46 = arg0.method2475();
        this.field34 = arg0.method2475();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2411();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2411();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2413();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method44(var4[var5] - 512).field999;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2411();
            if (var11 < 0 || var11 >= Statics.field1997[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field424 = arg0.method2413();
        if (this.field424 == 65535) {
            this.field424 = -1;
        }
        this.field469 = arg0.method2413();
        if (this.field469 == 65535) {
            this.field469 = -1;
        }
        this.field421 = this.field469;
        this.field427 = arg0.method2413();
        if (this.field427 == 65535) {
            this.field427 = -1;
        }
        this.field428 = arg0.method2413();
        if (this.field428 == 65535) {
            this.field428 = -1;
        }
        this.field425 = arg0.method2413();
        if (this.field425 == 65535) {
            this.field425 = -1;
        }
        this.field419 = arg0.method2413();
        if (this.field419 == 65535) {
            this.field419 = -1;
        }
        this.field431 = arg0.method2413();
        if (this.field431 == 65535) {
            this.field431 = -1;
        }
        this.field40 = arg0.method2419();
        if (Statics.field1358 == this) {
            Statics.field1434 = this.field40;
        }
        this.field35 = arg0.method2411();
        this.field50 = arg0.method2413();
        if (this.field32 == null) {
            this.field32 = new class163();
        }
        this.field32.method3137(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("a.p(I)Ldc;")
    public final class112 method26() {
        if (this.field32 == null) {
            return null;
        }
        class34 var1 = this.field452 != -1 && this.field451 == 0 ? class34.method763(this.field452) : null;
        class34 var2 = this.field445 == -1 || this.field45 || this.field445 == this.field424 && var1 != null ? null : class34.method763(this.field445);
        class112 var3 = this.field32.method3161(var1, this.field449, var2, this.field433);
        if (var3 == null) {
            return null;
        }
        var3.method2174();
        this.field473 = var3.field1556;
        if (!this.field45 && this.field453 != -1 && this.field454 != -1) {
            class112 var4 = class35.method37(this.field453).method728(this.field454);
            if (var4 != null) {
                var4.method2184(0, -this.field457, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field45 && this.field43 != null) {
            if (client.field491 >= this.field39) {
                this.field43 = null;
            }
            if (client.field491 >= this.field38 && client.field491 < this.field39) {
                class112 var6 = this.field43;
                var6.method2184(this.field53 - this.field462, this.field41 - this.field37, this.field42 - this.field470);
                if (this.field467 == 512) {
                    var6.method2250();
                    var6.method2250();
                    var6.method2250();
                } else if (this.field467 == 1024) {
                    var6.method2250();
                    var6.method2250();
                } else if (this.field467 == 1536) {
                    var6.method2250();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field467 == 512) {
                    var6.method2250();
                } else if (this.field467 == 1024) {
                    var6.method2250();
                    var6.method2250();
                } else if (this.field467 == 1536) {
                    var6.method2250();
                    var6.method2250();
                    var6.method2250();
                }
                var6.method2184(this.field462 - this.field53, this.field37 - this.field41, this.field470 - this.field42);
            }
        }
        var3.field1892 = true;
        return var3;
    }

    @ObfuscatedName("a.a(I)Z")
    public final boolean method18() {
        return this.field32 != null;
    }
}
