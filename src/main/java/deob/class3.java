package deob;

@ObfuscatedName("f")
public final class class3 extends class26 {

    @ObfuscatedName("f.c")
    public String field58;

    @ObfuscatedName("f.j")
    public class161 field43;

    @ObfuscatedName("f.f")
    public int field44 = -1;

    @ObfuscatedName("f.y")
    public int field49 = -1;

    @ObfuscatedName("f.x")
    public int field46 = 0;

    @ObfuscatedName("f.e")
    public int field51 = 0;

    @ObfuscatedName("f.m")
    public int field42;

    @ObfuscatedName("f.s")
    public int field55 = 0;

    @ObfuscatedName("f.p")
    public int field59 = 0;

    @ObfuscatedName("f.w")
    public int field50;

    @ObfuscatedName("f.r")
    public int field52;

    @ObfuscatedName("f.n")
    public int field53;

    @ObfuscatedName("f.b")
    public class111 field54;

    @ObfuscatedName("f.z")
    public int field47;

    @ObfuscatedName("f.h")
    public int field56;

    @ObfuscatedName("f.q")
    public int field57;

    @ObfuscatedName("f.l")
    public int field45;

    @ObfuscatedName("f.t")
    public boolean field48 = false;

    @ObfuscatedName("f.g")
    public int field60 = 0;

    @ObfuscatedName("f.c(Ldl;I)V")
    public final void method17(class125 arg0) {
        arg0.field2003 = 0;
        int var2 = arg0.method2326();
        this.field44 = arg0.method2347();
        this.field49 = arg0.method2347();
        int var3 = -1;
        this.field60 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2326();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2326();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2328();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class39.method2570(var4[var5] - 512).field1002;
                    if (var8 != 0) {
                        this.field60 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2326();
            if (var11 < 0 || var11 >= Statics.field2667[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field430 = arg0.method2328();
        if (this.field430 == 65535) {
            this.field430 = -1;
        }
        this.field461 = arg0.method2328();
        if (this.field461 == 65535) {
            this.field461 = -1;
        }
        this.field412 = this.field461;
        this.field413 = arg0.method2328();
        if (this.field413 == 65535) {
            this.field413 = -1;
        }
        this.field414 = arg0.method2328();
        if (this.field414 == 65535) {
            this.field414 = -1;
        }
        this.field433 = arg0.method2328();
        if (this.field433 == 65535) {
            this.field433 = -1;
        }
        this.field416 = arg0.method2328();
        if (this.field416 == 65535) {
            this.field416 = -1;
        }
        this.field417 = arg0.method2328();
        if (this.field417 == 65535) {
            this.field417 = -1;
        }
        this.field58 = arg0.method2515();
        if (Statics.field1623 == this) {
            Statics.field1388 = this.field58;
        }
        this.field46 = arg0.method2326();
        this.field51 = arg0.method2328();
        if (this.field43 == null) {
            this.field43 = new class161();
        }
        this.field43.method3008(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("f.j(B)Ldf;")
    public final class111 method18() {
        if (this.field43 == null) {
            return null;
        }
        class33 var1 = this.field434 != -1 && this.field437 == 0 ? class33.method2589(this.field434) : null;
        class33 var2 = this.field463 == -1 || this.field48 || this.field463 == this.field430 && var1 != null ? null : class33.method2589(this.field463);
        class111 var3 = this.field43.method3014(var1, this.field436, var2, this.field410);
        if (var3 == null) {
            return null;
        }
        var3.method2121();
        this.field405 = var3.field1521;
        if (!this.field48 && this.field447 != -1 && this.field440 != -1) {
            class111 var4 = class34.method135(this.field447).method708(this.field440);
            if (var4 != null) {
                var4.method2164(0, -this.field443, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (!this.field48 && this.field54 != null) {
            if (client.field516 >= this.field59) {
                this.field54 = null;
            }
            if (client.field516 >= this.field55 && client.field516 < this.field59) {
                class111 var6 = this.field54;
                var6.method2164(this.field50 - this.field446, this.field52 - this.field42, this.field53 - this.field406);
                if (this.field453 == 512) {
                    var6.method2127();
                    var6.method2127();
                    var6.method2127();
                } else if (this.field453 == 1024) {
                    var6.method2127();
                    var6.method2127();
                } else if (this.field453 == 1536) {
                    var6.method2127();
                }
                class111[] var7 = new class111[] { var3, var6 };
                var3 = new class111(var7, 2);
                if (this.field453 == 512) {
                    var6.method2127();
                } else if (this.field453 == 1024) {
                    var6.method2127();
                    var6.method2127();
                } else if (this.field453 == 1536) {
                    var6.method2127();
                    var6.method2127();
                    var6.method2127();
                }
                var6.method2164(this.field446 - this.field50, this.field42 - this.field52, this.field406 - this.field53);
            }
        }
        var3.field1860 = true;
        return var3;
    }

    @ObfuscatedName("f.f(I)Z")
    public final boolean method20() {
        return this.field43 != null;
    }
}
