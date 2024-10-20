package deob;

@ObfuscatedName("c")
public final class class3 extends class26 {

    @ObfuscatedName("c.z")
    public String field51;

    @ObfuscatedName("c.h")
    public class161 field36;

    @ObfuscatedName("c.c")
    public int field37 = -1;

    @ObfuscatedName("c.p")
    public int field38 = -1;

    @ObfuscatedName("c.i")
    public int field44 = 0;

    @ObfuscatedName("c.v")
    public int field42 = 0;

    @ObfuscatedName("c.l")
    public int field41;

    @ObfuscatedName("c.m")
    public int field57 = 0;

    @ObfuscatedName("c.g")
    public int field43 = 0;

    @ObfuscatedName("c.t")
    public int field35;

    @ObfuscatedName("c.o")
    public int field45;

    @ObfuscatedName("c.b")
    public int field46;

    @ObfuscatedName("c.d")
    public class111 field47;

    @ObfuscatedName("c.k")
    public int field48;

    @ObfuscatedName("c.f")
    public int field49;

    @ObfuscatedName("c.e")
    public int field50;

    @ObfuscatedName("c.u")
    public int field53;

    @ObfuscatedName("c.n")
    public boolean field52 = false;

    @ObfuscatedName("c.q")
    public int field40 = 0;

    @ObfuscatedName("c.z(Ldq;B)V")
    public final void method14(class126 arg0) {
        arg0.field2003 = 0;
        int var2 = arg0.method2450();
        this.field37 = arg0.method2451();
        this.field38 = arg0.method2451();
        int var3 = -1;
        this.field40 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2450();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2450();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2627();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class39.method2704(var4[var5] - 512).field987;
                    if (var8 != 0) {
                        this.field40 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2450();
            if (var11 < 0 || var11 >= Statics.field2665[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field430 = arg0.method2627();
        if (this.field430 == 65535) {
            this.field430 = -1;
        }
        this.field415 = arg0.method2627();
        if (this.field415 == 65535) {
            this.field415 = -1;
        }
        this.field416 = this.field415;
        this.field417 = arg0.method2627();
        if (this.field417 == 65535) {
            this.field417 = -1;
        }
        this.field449 = arg0.method2627();
        if (this.field449 == 65535) {
            this.field449 = -1;
        }
        this.field419 = arg0.method2627();
        if (this.field419 == 65535) {
            this.field419 = -1;
        }
        this.field420 = arg0.method2627();
        if (this.field420 == 65535) {
            this.field420 = -1;
        }
        this.field421 = arg0.method2627();
        if (this.field421 == 65535) {
            this.field421 = -1;
        }
        this.field51 = arg0.method2603();
        if (Statics.field1033 == this) {
            Statics.field2407 = this.field51;
        }
        this.field44 = arg0.method2450();
        this.field42 = arg0.method2627();
        if (this.field36 == null) {
            this.field36 = new class161();
        }
        this.field36.method3159(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("c.h(I)Ldh;")
    public final class111 method15() {
        if (this.field36 == null) {
            return null;
        }
        class33 var1 = this.field438 != -1 && this.field440 == 0 ? class33.method2674(this.field438) : null;
        class33 var2 = this.field435 == -1 || this.field52 || this.field435 == this.field430 && var1 != null ? null : class33.method2674(this.field435);
        class111 var3 = this.field36.method3165(var1, this.field439, var2, this.field436);
        if (var3 == null) {
            return null;
        }
        var3.method2219();
        this.field456 = var3.field1537;
        if (!this.field52 && this.field443 != -1 && this.field464 != -1) {
            class111 var4 = Statics.method813(this.field443).method748(this.field464);
            if (var4 != null) {
                var4.method2238(0, -this.field414, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (!this.field52 && this.field47 != null) {
            if (client.field481 >= this.field43) {
                this.field47 = null;
            }
            if (client.field481 >= this.field57 && client.field481 < this.field43) {
                class111 var6 = this.field47;
                var6.method2238(this.field35 - this.field448, this.field45 - this.field41, this.field46 - this.field410);
                if (this.field462 == 512) {
                    var6.method2225();
                    var6.method2225();
                    var6.method2225();
                } else if (this.field462 == 1024) {
                    var6.method2225();
                    var6.method2225();
                } else if (this.field462 == 1536) {
                    var6.method2225();
                }
                class111[] var7 = new class111[] { var3, var6 };
                var3 = new class111(var7, 2);
                if (this.field462 == 512) {
                    var6.method2225();
                } else if (this.field462 == 1024) {
                    var6.method2225();
                    var6.method2225();
                } else if (this.field462 == 1536) {
                    var6.method2225();
                    var6.method2225();
                    var6.method2225();
                }
                var6.method2238(this.field448 - this.field35, this.field41 - this.field45, this.field410 - this.field46);
            }
        }
        var3.field1865 = true;
        return var3;
    }

    @ObfuscatedName("c.c(B)Z")
    public final boolean method16() {
        return this.field36 != null;
    }
}
