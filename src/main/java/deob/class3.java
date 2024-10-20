package deob;

@ObfuscatedName("x")
public final class class3 extends class26 {

    @ObfuscatedName("x.u")
    public String field41;

    @ObfuscatedName("x.k")
    public class162 field40;

    @ObfuscatedName("x.x")
    public int field35 = -1;

    @ObfuscatedName("x.m")
    public int field36 = -1;

    @ObfuscatedName("x.n")
    public int field42 = 0;

    @ObfuscatedName("x.q")
    public int field38 = 0;

    @ObfuscatedName("x.a")
    public int field39;

    @ObfuscatedName("x.g")
    public int field51 = 0;

    @ObfuscatedName("x.j")
    public int field33 = 0;

    @ObfuscatedName("x.l")
    public int field43;

    @ObfuscatedName("x.w")
    public int field50;

    @ObfuscatedName("x.z")
    public int field44;

    @ObfuscatedName("x.e")
    public class111 field45;

    @ObfuscatedName("x.b")
    public int field46;

    @ObfuscatedName("x.c")
    public int field47;

    @ObfuscatedName("x.d")
    public int field48;

    @ObfuscatedName("x.h")
    public int field52;

    @ObfuscatedName("x.i")
    public boolean field34 = false;

    @ObfuscatedName("x.v")
    public int field49 = 0;

    @ObfuscatedName("x.u(Ldl;B)V")
    public final void method22(class126 arg0) {
        arg0.field2024 = 0;
        int var2 = arg0.method2559();
        this.field35 = arg0.method2449();
        this.field36 = arg0.method2449();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2559();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2559();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2450();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class39.method525(var4[var5] - 512).field1006;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2559();
            if (var11 < 0 || var11 >= Statics.field2708[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field445 = arg0.method2450();
        if (this.field445 == 65535) {
            this.field445 = -1;
        }
        this.field412 = arg0.method2450();
        if (this.field412 == 65535) {
            this.field412 = -1;
        }
        this.field413 = this.field412;
        this.field414 = arg0.method2450();
        if (this.field414 == 65535) {
            this.field414 = -1;
        }
        this.field459 = arg0.method2450();
        if (this.field459 == 65535) {
            this.field459 = -1;
        }
        this.field452 = arg0.method2450();
        if (this.field452 == 65535) {
            this.field452 = -1;
        }
        this.field406 = arg0.method2450();
        if (this.field406 == 65535) {
            this.field406 = -1;
        }
        this.field418 = arg0.method2450();
        if (this.field418 == 65535) {
            this.field418 = -1;
        }
        this.field41 = arg0.method2630();
        if (Statics.field1242 == this) {
            Statics.field1396 = this.field41;
        }
        this.field42 = arg0.method2559();
        this.field38 = arg0.method2450();
        if (this.field40 == null) {
            this.field40 = new class162();
        }
        this.field40.method3184(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("x.k(B)Ldd;")
    public final class111 method30() {
        if (this.field40 == null) {
            return null;
        }
        class33 var1 = this.field456 != -1 && this.field438 == 0 ? Statics.method147(this.field456) : null;
        class33 var2 = this.field432 == -1 || this.field34 || this.field445 == this.field432 && var1 != null ? null : Statics.method147(this.field432);
        class111 var3 = this.field40.method3201(var1, this.field436, var2, this.field444);
        if (var3 == null) {
            return null;
        }
        var3.method2281();
        this.field408 = var3.field1525;
        if (!this.field34 && this.field415 != -1 && this.field441 != -1) {
            class111 var4 = class34.method203(this.field415).method711(this.field441);
            if (var4 != null) {
                var4.method2247(0, -this.field450, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (!this.field34 && this.field45 != null) {
            if (client.field477 >= this.field33) {
                this.field45 = null;
            }
            if (client.field477 >= this.field51 && client.field477 < this.field33) {
                class111 var6 = this.field45;
                var6.method2247(this.field43 - this.field433, this.field50 - this.field39, this.field44 - this.field407);
                if (this.field454 == 512) {
                    var6.method2243();
                    var6.method2243();
                    var6.method2243();
                } else if (this.field454 == 1024) {
                    var6.method2243();
                    var6.method2243();
                } else if (this.field454 == 1536) {
                    var6.method2243();
                }
                class111[] var7 = new class111[] { var3, var6 };
                var3 = new class111(var7, 2);
                if (this.field454 == 512) {
                    var6.method2243();
                } else if (this.field454 == 1024) {
                    var6.method2243();
                    var6.method2243();
                } else if (this.field454 == 1536) {
                    var6.method2243();
                    var6.method2243();
                    var6.method2243();
                }
                var6.method2247(this.field433 - this.field43, this.field39 - this.field50, this.field407 - this.field44);
            }
        }
        var3.field1863 = true;
        return var3;
    }

    @ObfuscatedName("x.x(I)Z")
    public final boolean method26() {
        return this.field40 != null;
    }
}
