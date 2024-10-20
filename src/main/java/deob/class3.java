package deob;

@ObfuscatedName("g")
public final class class3 extends class27 {

    @ObfuscatedName("g.b")
    public String field32;

    @ObfuscatedName("g.e")
    public class164 field51;

    @ObfuscatedName("g.g")
    public int field45 = -1;

    @ObfuscatedName("g.o")
    public int field34 = -1;

    @ObfuscatedName("g.a")
    public int field35 = 0;

    @ObfuscatedName("g.h")
    public int field36 = 0;

    @ObfuscatedName("g.j")
    public int field37;

    @ObfuscatedName("g.f")
    public int field42 = 0;

    @ObfuscatedName("g.q")
    public int field40 = 0;

    @ObfuscatedName("g.l")
    public int field41;

    @ObfuscatedName("g.d")
    public int field31;

    @ObfuscatedName("g.z")
    public int field48;

    @ObfuscatedName("g.n")
    public class112 field43;

    @ObfuscatedName("g.t")
    public int field44;

    @ObfuscatedName("g.w")
    public int field39;

    @ObfuscatedName("g.r")
    public int field46;

    @ObfuscatedName("g.x")
    public int field47;

    @ObfuscatedName("g.v")
    public boolean field38 = false;

    @ObfuscatedName("g.y")
    public int field49 = 0;

    @ObfuscatedName("g.b(Ldv;B)V")
    public final void method14(class126 arg0) {
        arg0.field2027 = 0;
        int var2 = arg0.method2436();
        this.field45 = arg0.method2437();
        this.field34 = arg0.method2437();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2436();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2436();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2572();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method672(var4[var5] - 512).field972;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2436();
            if (var11 < 0 || var11 >= Statics.field2747[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field444 = arg0.method2572();
        if (this.field444 == 65535) {
            this.field444 = -1;
        }
        this.field434 = arg0.method2572();
        if (this.field434 == 65535) {
            this.field434 = -1;
        }
        this.field409 = this.field434;
        this.field415 = arg0.method2572();
        if (this.field415 == 65535) {
            this.field415 = -1;
        }
        this.field413 = arg0.method2572();
        if (this.field413 == 65535) {
            this.field413 = -1;
        }
        this.field422 = arg0.method2572();
        if (this.field422 == 65535) {
            this.field422 = -1;
        }
        this.field418 = arg0.method2572();
        if (this.field418 == 65535) {
            this.field418 = -1;
        }
        this.field419 = arg0.method2572();
        if (this.field419 == 65535) {
            this.field419 = -1;
        }
        this.field32 = arg0.method2444();
        if (Statics.field52 == this) {
            Statics.field1405 = this.field32;
        }
        this.field35 = arg0.method2436();
        this.field36 = arg0.method2572();
        if (this.field51 == null) {
            this.field51 = new class164();
        }
        this.field51.method3230(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("g.e(I)Ldp;")
    public final class112 method15() {
        if (this.field51 == null) {
            return null;
        }
        class34 var1 = this.field437 != -1 && this.field440 == 0 ? class34.method215(this.field437) : null;
        class34 var2 = this.field448 == -1 || this.field38 || this.field448 == this.field444 && var1 != null ? null : class34.method215(this.field448);
        class112 var3 = this.field51.method3213(var1, this.field438, var2, this.field435);
        if (var3 == null) {
            return null;
        }
        var3.method2226();
        this.field412 = var3.field1536;
        if (!this.field38 && this.field414 != -1 && this.field416 != -1) {
            class112 var4 = class35.method2850(this.field414).method741(this.field416);
            if (var4 != null) {
                var4.method2288(0, -this.field427, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field38 && this.field43 != null) {
            if (client.field477 >= this.field40) {
                this.field43 = null;
            }
            if (client.field477 >= this.field42 && client.field477 < this.field40) {
                class112 var6 = this.field43;
                var6.method2288(this.field41 - this.field443, this.field31 - this.field37, this.field48 - this.field408);
                if (this.field456 == 512) {
                    var6.method2232();
                    var6.method2232();
                    var6.method2232();
                } else if (this.field456 == 1024) {
                    var6.method2232();
                    var6.method2232();
                } else if (this.field456 == 1536) {
                    var6.method2232();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field456 == 512) {
                    var6.method2232();
                } else if (this.field456 == 1024) {
                    var6.method2232();
                    var6.method2232();
                } else if (this.field456 == 1536) {
                    var6.method2232();
                    var6.method2232();
                    var6.method2232();
                }
                var6.method2288(this.field443 - this.field41, this.field37 - this.field31, this.field408 - this.field48);
            }
        }
        var3.field1868 = true;
        return var3;
    }

    @ObfuscatedName("g.g(B)Z")
    public final boolean method16() {
        return this.field51 != null;
    }
}
