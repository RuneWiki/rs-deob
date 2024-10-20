package deob;

@ObfuscatedName("o")
public final class class3 extends class27 {

    @ObfuscatedName("o.j")
    public String field37;

    @ObfuscatedName("o.f")
    public class164 field43;

    @ObfuscatedName("o.o")
    public int field33 = -1;

    @ObfuscatedName("o.h")
    public int field35 = -1;

    @ObfuscatedName("o.u")
    public int field34 = 0;

    @ObfuscatedName("o.a")
    public int field45 = 0;

    @ObfuscatedName("o.q")
    public int field47;

    @ObfuscatedName("o.t")
    public int field38 = 0;

    @ObfuscatedName("o.n")
    public int field39 = 0;

    @ObfuscatedName("o.i")
    public int field40;

    @ObfuscatedName("o.c")
    public int field41;

    @ObfuscatedName("o.b")
    public int field32;

    @ObfuscatedName("o.m")
    public class112 field42;

    @ObfuscatedName("o.g")
    public int field44;

    @ObfuscatedName("o.x")
    public int field31;

    @ObfuscatedName("o.r")
    public int field46;

    @ObfuscatedName("o.s")
    public int field36;

    @ObfuscatedName("o.l")
    public boolean field48 = false;

    @ObfuscatedName("o.k")
    public int field49 = 0;

    @ObfuscatedName("o.j(Ldq;I)V")
    public final void method25(class127 arg0) {
        arg0.field2035 = 0;
        int var2 = arg0.method2464();
        this.field33 = arg0.method2449();
        this.field35 = arg0.method2449();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2464();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2464();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2582();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method712(var4[var5] - 512).field983;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2464();
            if (var11 < 0 || var11 >= Statics.field2467[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field416 = arg0.method2582();
        if (this.field416 == 65535) {
            this.field416 = -1;
        }
        this.field437 = arg0.method2582();
        if (this.field437 == 65535) {
            this.field437 = -1;
        }
        this.field415 = this.field437;
        this.field439 = arg0.method2582();
        if (this.field439 == 65535) {
            this.field439 = -1;
        }
        this.field420 = arg0.method2582();
        if (this.field420 == 65535) {
            this.field420 = -1;
        }
        this.field450 = arg0.method2582();
        if (this.field450 == 65535) {
            this.field450 = -1;
        }
        this.field422 = arg0.method2582();
        if (this.field422 == 65535) {
            this.field422 = -1;
        }
        this.field456 = arg0.method2582();
        if (this.field456 == 65535) {
            this.field456 = -1;
        }
        this.field37 = arg0.method2518();
        if (Statics.field428 == this) {
            Statics.field1429 = this.field37;
        }
        this.field34 = arg0.method2464();
        this.field45 = arg0.method2582();
        if (this.field43 == null) {
            this.field43 = new class164();
        }
        this.field43.method3218(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("o.f(B)Ldo;")
    public final class112 method19() {
        if (this.field43 == null) {
            return null;
        }
        class34 var1 = this.field440 != -1 && this.field443 == 0 ? class34.method612(this.field440) : null;
        class34 var2 = this.field419 == -1 || this.field48 || this.field419 == this.field416 && var1 != null ? null : class34.method612(this.field419);
        class112 var3 = this.field43.method3224(var1, this.field441, var2, this.field438);
        if (var3 == null) {
            return null;
        }
        var3.method2240();
        this.field455 = var3.field1560;
        if (!this.field48 && this.field445 != -1 && this.field446 != -1) {
            class112 var4 = class35.method113(this.field445).method755(this.field446);
            if (var4 != null) {
                var4.method2289(0, -this.field449, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field48 && this.field42 != null) {
            if (client.field699 >= this.field39) {
                this.field42 = null;
            }
            if (client.field699 >= this.field38 && client.field699 < this.field39) {
                class112 var6 = this.field42;
                var6.method2289(this.field40 - this.field418, this.field41 - this.field47, this.field32 - this.field412);
                if (this.field459 == 512) {
                    var6.method2246();
                    var6.method2246();
                    var6.method2246();
                } else if (this.field459 == 1024) {
                    var6.method2246();
                    var6.method2246();
                } else if (this.field459 == 1536) {
                    var6.method2246();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field459 == 512) {
                    var6.method2246();
                } else if (this.field459 == 1024) {
                    var6.method2246();
                    var6.method2246();
                } else if (this.field459 == 1536) {
                    var6.method2246();
                    var6.method2246();
                    var6.method2246();
                }
                var6.method2289(this.field418 - this.field40, this.field47 - this.field41, this.field412 - this.field32);
            }
        }
        var3.field1864 = true;
        return var3;
    }

    @ObfuscatedName("o.o(I)Z")
    public final boolean method18() {
        return this.field43 != null;
    }
}
