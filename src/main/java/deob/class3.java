package deob;

@ObfuscatedName("n")
public final class class3 extends class26 {

    @ObfuscatedName("n.g")
    public String field36;

    @ObfuscatedName("n.e")
    public class161 field28;

    @ObfuscatedName("n.n")
    public int field29 = -1;

    @ObfuscatedName("n.j")
    public int field30 = -1;

    @ObfuscatedName("n.i")
    public int field32 = 0;

    @ObfuscatedName("n.o")
    public int field41 = 0;

    @ObfuscatedName("n.l")
    public int field43;

    @ObfuscatedName("n.p")
    public int field34 = 0;

    @ObfuscatedName("n.t")
    public int field35 = 0;

    @ObfuscatedName("n.w")
    public int field31;

    @ObfuscatedName("n.r")
    public int field37;

    @ObfuscatedName("n.a")
    public int field39;

    @ObfuscatedName("n.q")
    public class111 field27;

    @ObfuscatedName("n.z")
    public int field40;

    @ObfuscatedName("n.d")
    public int field45;

    @ObfuscatedName("n.x")
    public int field42;

    @ObfuscatedName("n.s")
    public int field38;

    @ObfuscatedName("n.m")
    public boolean field44 = false;

    @ObfuscatedName("n.y")
    public int field33 = 0;

    @ObfuscatedName("n.g(Ldu;I)V")
    public final void method16(class126 arg0) {
        arg0.field2016 = 0;
        int var2 = arg0.method2485();
        this.field29 = arg0.method2479();
        this.field30 = arg0.method2479();
        int var3 = -1;
        this.field33 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2485();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2485();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2487();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class39.method196(var4[var5] - 512).field980;
                    if (var8 != 0) {
                        this.field33 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2485();
            if (var11 < 0 || var11 >= Statics.field2679[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field429 = arg0.method2487();
        if (this.field429 == 65535) {
            this.field429 = -1;
        }
        this.field445 = arg0.method2487();
        if (this.field445 == 65535) {
            this.field445 = -1;
        }
        this.field410 = this.field445;
        this.field407 = arg0.method2487();
        if (this.field407 == 65535) {
            this.field407 = -1;
        }
        this.field412 = arg0.method2487();
        if (this.field412 == 65535) {
            this.field412 = -1;
        }
        this.field413 = arg0.method2487();
        if (this.field413 == 65535) {
            this.field413 = -1;
        }
        this.field414 = arg0.method2487();
        if (this.field414 == 65535) {
            this.field414 = -1;
        }
        this.field438 = arg0.method2487();
        if (this.field438 == 65535) {
            this.field438 = -1;
        }
        this.field36 = arg0.method2470();
        if (Statics.field2611 == this) {
            Statics.field1404 = this.field36;
        }
        this.field32 = arg0.method2485();
        this.field41 = arg0.method2487();
        if (this.field28 == null) {
            this.field28 = new class161();
        }
        this.field28.method3249(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("n.e(I)Ldk;")
    public final class111 method19() {
        if (this.field28 == null) {
            return null;
        }
        class33 var1 = this.field432 != -1 && this.field418 == 0 ? class33.method224(this.field432) : null;
        class33 var2 = this.field409 == -1 || this.field44 || this.field429 == this.field409 && var1 != null ? null : class33.method224(this.field409);
        class111 var3 = this.field28.method3235(var1, this.field435, var2, this.field430);
        if (var3 == null) {
            return null;
        }
        var3.method2267();
        this.field427 = var3.field1534;
        if (!this.field44 && this.field437 != -1 && this.field459 != -1) {
            class111 var4 = class34.method895(this.field437).method749(this.field459);
            if (var4 != null) {
                var4.method2277(0, -this.field444, 0);
                class111[] var5 = new class111[] { var3, var4 };
                var3 = new class111(var5, 2);
            }
        }
        if (!this.field44 && this.field27 != null) {
            if (client.field652 >= this.field35) {
                this.field27 = null;
            }
            if (client.field652 >= this.field34 && client.field652 < this.field35) {
                class111 var6 = this.field27;
                var6.method2277(this.field31 - this.field441, this.field37 - this.field43, this.field39 - this.field433);
                if (this.field451 == 512) {
                    var6.method2273();
                    var6.method2273();
                    var6.method2273();
                } else if (this.field451 == 1024) {
                    var6.method2273();
                    var6.method2273();
                } else if (this.field451 == 1536) {
                    var6.method2273();
                }
                class111[] var7 = new class111[] { var3, var6 };
                var3 = new class111(var7, 2);
                if (this.field451 == 512) {
                    var6.method2273();
                } else if (this.field451 == 1024) {
                    var6.method2273();
                    var6.method2273();
                } else if (this.field451 == 1536) {
                    var6.method2273();
                    var6.method2273();
                    var6.method2273();
                }
                var6.method2277(this.field441 - this.field31, this.field43 - this.field37, this.field433 - this.field39);
            }
        }
        var3.field1852 = true;
        return var3;
    }

    @ObfuscatedName("n.n(I)Z")
    public final boolean method18() {
        return this.field28 != null;
    }
}
