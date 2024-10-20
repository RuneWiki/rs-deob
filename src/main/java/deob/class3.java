package deob;

@ObfuscatedName("o")
public final class class3 extends class27 {

    @ObfuscatedName("o.p")
    public String field40;

    @ObfuscatedName("o.i")
    public class163 field35;

    @ObfuscatedName("o.o")
    public int field52 = -1;

    @ObfuscatedName("o.n")
    public int field38 = -1;

    @ObfuscatedName("o.l")
    public int field42 = 0;

    @ObfuscatedName("o.v")
    public int field39 = 0;

    @ObfuscatedName("o.g")
    public int field45;

    @ObfuscatedName("o.x")
    public int field41 = 0;

    @ObfuscatedName("o.c")
    public int field36 = 0;

    @ObfuscatedName("o.f")
    public int field43;

    @ObfuscatedName("o.r")
    public int field46;

    @ObfuscatedName("o.d")
    public int field54;

    @ObfuscatedName("o.a")
    public class112 field44;

    @ObfuscatedName("o.q")
    public int field47;

    @ObfuscatedName("o.u")
    public int field48;

    @ObfuscatedName("o.w")
    public int field34;

    @ObfuscatedName("o.s")
    public int field50;

    @ObfuscatedName("o.e")
    public boolean field51 = false;

    @ObfuscatedName("o.b")
    public int field49 = 0;

    @ObfuscatedName("o.p(Ldt;I)V")
    public final void method20(class127 arg0) {
        arg0.field2038 = 0;
        int var2 = arg0.method2659();
        this.field52 = arg0.method2656();
        this.field38 = arg0.method2656();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2659();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2659();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2652();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method730(var4[var5] - 512).field1031;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2659();
            if (var11 < 0 || var11 >= Statics.field2733[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field449 = arg0.method2652();
        if (this.field449 == 65535) {
            this.field449 = -1;
        }
        this.field416 = arg0.method2652();
        if (this.field416 == 65535) {
            this.field416 = -1;
        }
        this.field417 = this.field416;
        this.field418 = arg0.method2652();
        if (this.field418 == 65535) {
            this.field418 = -1;
        }
        this.field419 = arg0.method2652();
        if (this.field419 == 65535) {
            this.field419 = -1;
        }
        this.field420 = arg0.method2652();
        if (this.field420 == 65535) {
            this.field420 = -1;
        }
        this.field421 = arg0.method2652();
        if (this.field421 == 65535) {
            this.field421 = -1;
        }
        this.field422 = arg0.method2652();
        if (this.field422 == 65535) {
            this.field422 = -1;
        }
        this.field40 = arg0.method2490();
        if (Statics.field2006 == this) {
            Statics.field389 = this.field40;
        }
        this.field42 = arg0.method2659();
        this.field39 = arg0.method2652();
        if (this.field35 == null) {
            this.field35 = new class163();
        }
        this.field35.method3203(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("o.i(I)Ldj;")
    public final class112 method21() {
        if (this.field35 == null) {
            return null;
        }
        class34 var1 = this.field439 != -1 && this.field414 == 0 ? class34.method160(this.field439) : null;
        class34 var2 = this.field436 == -1 || this.field51 || this.field449 == this.field436 && var1 != null ? null : class34.method160(this.field436);
        class112 var3 = this.field35.method3187(var1, this.field440, var2, this.field437);
        if (var3 == null) {
            return null;
        }
        var3.method2317();
        this.field457 = var3.field1550;
        if (!this.field51 && this.field444 != -1 && this.field465 != -1) {
            class112 var4 = class35.method2756(this.field444).method780(this.field465);
            if (var4 != null) {
                var4.method2281(0, -this.field448, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field51 && this.field44 != null) {
            if (client.field481 >= this.field36) {
                this.field44 = null;
            }
            if (client.field481 >= this.field41 && client.field481 < this.field36) {
                class112 var6 = this.field44;
                var6.method2281(this.field43 - this.field455, this.field46 - this.field45, this.field54 - this.field411);
                if (this.field458 == 512) {
                    var6.method2286();
                    var6.method2286();
                    var6.method2286();
                } else if (this.field458 == 1024) {
                    var6.method2286();
                    var6.method2286();
                } else if (this.field458 == 1536) {
                    var6.method2286();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field458 == 512) {
                    var6.method2286();
                } else if (this.field458 == 1024) {
                    var6.method2286();
                    var6.method2286();
                } else if (this.field458 == 1536) {
                    var6.method2286();
                    var6.method2286();
                    var6.method2286();
                }
                var6.method2281(this.field455 - this.field43, this.field45 - this.field46, this.field411 - this.field54);
            }
        }
        var3.field1886 = true;
        return var3;
    }

    @ObfuscatedName("o.o(I)Z")
    public final boolean method36() {
        return this.field35 != null;
    }
}
