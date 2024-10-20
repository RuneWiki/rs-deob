package deob;

@ObfuscatedName("p")
public final class class3 extends class27 {

    @ObfuscatedName("p.q")
    public String field36;

    @ObfuscatedName("p.c")
    public class164 field34;

    @ObfuscatedName("p.p")
    public int field33 = -1;

    @ObfuscatedName("p.z")
    public int field44 = -1;

    @ObfuscatedName("p.m")
    public int field35 = 0;

    @ObfuscatedName("p.k")
    public int field38 = 0;

    @ObfuscatedName("p.v")
    public int field37;

    @ObfuscatedName("p.y")
    public int field50 = 0;

    @ObfuscatedName("p.d")
    public int field49 = 0;

    @ObfuscatedName("p.l")
    public int field40;

    @ObfuscatedName("p.h")
    public int field41;

    @ObfuscatedName("p.b")
    public int field42;

    @ObfuscatedName("p.r")
    public class112 field43;

    @ObfuscatedName("p.t")
    public int field39;

    @ObfuscatedName("p.u")
    public int field45;

    @ObfuscatedName("p.g")
    public int field46;

    @ObfuscatedName("p.e")
    public int field47;

    @ObfuscatedName("p.n")
    public boolean field48 = false;

    @ObfuscatedName("p.o")
    public int field32 = 0;

    @ObfuscatedName("p.q(Ldo;I)V")
    public final void method18(class127 arg0) {
        arg0.field2039 = 0;
        int var2 = arg0.method2534();
        this.field33 = arg0.method2426();
        this.field44 = arg0.method2426();
        int var3 = -1;
        this.field32 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2534();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2534();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2427();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method782(var4[var5] - 512).field1000;
                    if (var8 != 0) {
                        this.field32 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2534();
            if (var11 < 0 || var11 >= Statics.field2035[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field432 = arg0.method2427();
        if (this.field432 == 65535) {
            this.field432 = -1;
        }
        this.field414 = arg0.method2427();
        if (this.field414 == 65535) {
            this.field414 = -1;
        }
        this.field415 = this.field414;
        this.field457 = arg0.method2427();
        if (this.field457 == 65535) {
            this.field457 = -1;
        }
        this.field447 = arg0.method2427();
        if (this.field447 == 65535) {
            this.field447 = -1;
        }
        this.field436 = arg0.method2427();
        if (this.field436 == 65535) {
            this.field436 = -1;
        }
        this.field419 = arg0.method2427();
        if (this.field419 == 65535) {
            this.field419 = -1;
        }
        this.field420 = arg0.method2427();
        if (this.field420 == 65535) {
            this.field420 = -1;
        }
        this.field36 = arg0.method2460();
        if (Statics.field2728 == this) {
            Statics.field1421 = this.field36;
        }
        this.field35 = arg0.method2534();
        this.field38 = arg0.method2427();
        if (this.field34 == null) {
            this.field34 = new class164();
        }
        this.field34.method3165(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("p.c(I)Ldn;")
    public final class112 method17() {
        if (this.field34 == null) {
            return null;
        }
        class34 var1 = this.field437 != -1 && this.field440 == 0 ? class34.method2178(this.field437) : null;
        class34 var2 = this.field452 == -1 || this.field48 || this.field452 == this.field432 && var1 != null ? null : class34.method2178(this.field452);
        class112 var3 = this.field34.method3185(var1, this.field438, var2, this.field435);
        if (var3 == null) {
            return null;
        }
        var3.method2213();
        this.field455 = var3.field1555;
        if (!this.field48 && this.field442 != -1 && this.field466 != -1) {
            class112 var4 = class35.method131(this.field442).method742(this.field466);
            if (var4 != null) {
                var4.method2223(0, -this.field446, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field48 && this.field43 != null) {
            if (client.field479 >= this.field49) {
                this.field43 = null;
            }
            if (client.field479 >= this.field50 && client.field479 < this.field49) {
                class112 var6 = this.field43;
                var6.method2223(this.field40 - this.field467, this.field41 - this.field37, this.field42 - this.field409);
                if (this.field456 == 512) {
                    var6.method2256();
                    var6.method2256();
                    var6.method2256();
                } else if (this.field456 == 1024) {
                    var6.method2256();
                    var6.method2256();
                } else if (this.field456 == 1536) {
                    var6.method2256();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field456 == 512) {
                    var6.method2256();
                } else if (this.field456 == 1024) {
                    var6.method2256();
                    var6.method2256();
                } else if (this.field456 == 1536) {
                    var6.method2256();
                    var6.method2256();
                    var6.method2256();
                }
                var6.method2223(this.field467 - this.field40, this.field37 - this.field41, this.field409 - this.field42);
            }
        }
        var3.field1863 = true;
        return var3;
    }

    @ObfuscatedName("p.p(S)Z")
    public final boolean method21() {
        return this.field34 != null;
    }
}
