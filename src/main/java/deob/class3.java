package deob;

@ObfuscatedName("k")
public final class class3 extends class28 {

    @ObfuscatedName("k.e")
    public String field52;

    @ObfuscatedName("k.i")
    public class166 field37;

    @ObfuscatedName("k.k")
    public int field45 = -1;

    @ObfuscatedName("k.q")
    public int field36 = -1;

    @ObfuscatedName("k.j")
    public int field40 = 0;

    @ObfuscatedName("k.z")
    public int field41 = 0;

    @ObfuscatedName("k.m")
    public int field53;

    @ObfuscatedName("k.w")
    public int field43 = 0;

    @ObfuscatedName("k.a")
    public int field44 = 0;

    @ObfuscatedName("k.d")
    public int field38;

    @ObfuscatedName("k.u")
    public int field46;

    @ObfuscatedName("k.p")
    public int field42;

    @ObfuscatedName("k.t")
    public class113 field48;

    @ObfuscatedName("k.g")
    public int field54;

    @ObfuscatedName("k.o")
    public int field50;

    @ObfuscatedName("k.x")
    public int field51;

    @ObfuscatedName("k.c")
    public int field39;

    @ObfuscatedName("k.b")
    public boolean field49 = false;

    @ObfuscatedName("k.f")
    public int field47 = 0;

    @ObfuscatedName("k.e(Ldl;I)V")
    public final void method15(class128 arg0) {
        arg0.field2045 = 0;
        int var2 = arg0.method2548();
        this.field45 = arg0.method2455();
        this.field36 = arg0.method2455();
        int var3 = -1;
        this.field47 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2548();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2548();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2456();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class41.method2718(var4[var5] - 512).field1040;
                    if (var8 != 0) {
                        this.field47 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2548();
            if (var11 < 0 || var11 >= Statics.field2771[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field475 = arg0.method2456();
        if (this.field475 == 65535) {
            this.field475 = -1;
        }
        this.field444 = arg0.method2456();
        if (this.field444 == 65535) {
            this.field444 = -1;
        }
        this.field445 = this.field444;
        this.field446 = arg0.method2456();
        if (this.field446 == 65535) {
            this.field446 = -1;
        }
        this.field447 = arg0.method2456();
        if (this.field447 == 65535) {
            this.field447 = -1;
        }
        this.field484 = arg0.method2456();
        if (this.field484 == 65535) {
            this.field484 = -1;
        }
        this.field449 = arg0.method2456();
        if (this.field449 == 65535) {
            this.field449 = -1;
        }
        this.field483 = arg0.method2456();
        if (this.field483 == 65535) {
            this.field483 = -1;
        }
        this.field52 = arg0.method2559();
        if (Statics.field1383 == this) {
            Statics.field1419 = this.field52;
        }
        this.field40 = arg0.method2548();
        this.field41 = arg0.method2456();
        if (this.field37 == null) {
            this.field37 = new class166();
        }
        this.field37.method3237(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("k.i(B)Ldo;")
    public final class113 method16() {
        if (this.field37 == null) {
            return null;
        }
        class35 var1 = this.field450 != -1 && this.field464 == 0 ? class35.method28(this.field450) : null;
        class35 var2 = this.field468 == -1 || this.field49 || this.field475 == this.field468 && var1 != null ? null : class35.method28(this.field468);
        class113 var3 = this.field37.method3226(var1, this.field479, var2, this.field453);
        if (var3 == null) {
            return null;
        }
        var3.method2268();
        this.field485 = var3.field1545;
        if (!this.field49 && this.field472 != -1 && this.field473 != -1) {
            class113 var4 = class36.method867(this.field472).method795(this.field473);
            if (var4 != null) {
                var4.method2261(0, -this.field456, 0);
                class113[] var5 = new class113[] { var3, var4 };
                var3 = new class113(var5, 2);
            }
        }
        if (!this.field49 && this.field48 != null) {
            if (client.field569 >= this.field44) {
                this.field48 = null;
            }
            if (client.field569 >= this.field43 && client.field569 < this.field44) {
                class113 var6 = this.field48;
                var6.method2261(this.field38 - this.field443, this.field46 - this.field53, this.field42 - this.field439);
                if (this.field486 == 512) {
                    var6.method2252();
                    var6.method2252();
                    var6.method2252();
                } else if (this.field486 == 1024) {
                    var6.method2252();
                    var6.method2252();
                } else if (this.field486 == 1536) {
                    var6.method2252();
                }
                class113[] var7 = new class113[] { var3, var6 };
                var3 = new class113(var7, 2);
                if (this.field486 == 512) {
                    var6.method2252();
                } else if (this.field486 == 1024) {
                    var6.method2252();
                    var6.method2252();
                } else if (this.field486 == 1536) {
                    var6.method2252();
                    var6.method2252();
                    var6.method2252();
                }
                var6.method2261(this.field443 - this.field38, this.field53 - this.field46, this.field439 - this.field42);
            }
        }
        var3.field1881 = true;
        return var3;
    }

    @ObfuscatedName("k.k(B)Z")
    public final boolean method17() {
        return this.field37 != null;
    }
}
