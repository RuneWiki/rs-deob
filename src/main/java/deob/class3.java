package deob;

@ObfuscatedName("k")
public final class class3 extends class27 {

    @ObfuscatedName("k.x")
    public String field39;

    @ObfuscatedName("k.p")
    public class163 field28;

    @ObfuscatedName("k.k")
    public int field29 = -1;

    @ObfuscatedName("k.a")
    public int field30 = -1;

    @ObfuscatedName("k.q")
    public int field49 = 0;

    @ObfuscatedName("k.j")
    public int field50 = 0;

    @ObfuscatedName("k.v")
    public int field33;

    @ObfuscatedName("k.w")
    public int field34 = 0;

    @ObfuscatedName("k.l")
    public int field45 = 0;

    @ObfuscatedName("k.s")
    public int field36;

    @ObfuscatedName("k.n")
    public int field35;

    @ObfuscatedName("k.c")
    public int field47;

    @ObfuscatedName("k.h")
    public class112 field37;

    @ObfuscatedName("k.u")
    public int field40;

    @ObfuscatedName("k.y")
    public int field41;

    @ObfuscatedName("k.b")
    public int field31;

    @ObfuscatedName("k.t")
    public int field38;

    @ObfuscatedName("k.r")
    public boolean field44 = false;

    @ObfuscatedName("k.g")
    public int field27 = 0;

    @ObfuscatedName("k.x(Ldg;I)V")
    public final void method12(class127 arg0) {
        arg0.field2008 = 0;
        int var2 = arg0.method2484();
        this.field29 = arg0.method2411();
        this.field30 = arg0.method2411();
        int var3 = -1;
        this.field27 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2484();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2484();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2539();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method125(var4[var5] - 512).field956;
                    if (var8 != 0) {
                        this.field27 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2484();
            if (var11 < 0 || var11 >= Statics.field2719[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field387 = arg0.method2539();
        if (this.field387 == 65535) {
            this.field387 = -1;
        }
        this.field388 = arg0.method2539();
        if (this.field388 == 65535) {
            this.field388 = -1;
        }
        this.field389 = this.field388;
        this.field390 = arg0.method2539();
        if (this.field390 == 65535) {
            this.field390 = -1;
        }
        this.field412 = arg0.method2539();
        if (this.field412 == 65535) {
            this.field412 = -1;
        }
        this.field442 = arg0.method2539();
        if (this.field442 == 65535) {
            this.field442 = -1;
        }
        this.field403 = arg0.method2539();
        if (this.field403 == 65535) {
            this.field403 = -1;
        }
        this.field394 = arg0.method2539();
        if (this.field394 == 65535) {
            this.field394 = -1;
        }
        this.field39 = arg0.method2571();
        if (Statics.field714 == this) {
            Statics.field1389 = this.field39;
        }
        this.field49 = arg0.method2484();
        this.field50 = arg0.method2539();
        if (this.field28 == null) {
            this.field28 = new class163();
        }
        this.field28.method3113(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("k.p(I)Ldi;")
    public final class112 method10() {
        if (this.field28 == null) {
            return null;
        }
        class34 var1 = this.field411 != -1 && this.field414 == 0 ? class34.method516(this.field411) : null;
        class34 var2 = this.field408 == -1 || this.field44 || this.field408 == this.field387 && var1 != null ? null : class34.method516(this.field408);
        class112 var3 = this.field28.method3140(var1, this.field398, var2, this.field429);
        if (var3 == null) {
            return null;
        }
        var3.method2242();
        this.field391 = var3.field1524;
        if (!this.field44 && this.field416 != -1 && this.field417 != -1) {
            class112 var4 = class35.method1621(this.field416).method717(this.field417);
            if (var4 != null) {
                var4.method2230(0, -this.field392, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field44 && this.field37 != null) {
            if (client.field668 >= this.field45) {
                this.field37 = null;
            }
            if (client.field668 >= this.field34 && client.field668 < this.field45) {
                class112 var6 = this.field37;
                var6.method2230(this.field36 - this.field399, this.field35 - this.field33, this.field47 - this.field383);
                if (this.field430 == 512) {
                    var6.method2200();
                    var6.method2200();
                    var6.method2200();
                } else if (this.field430 == 1024) {
                    var6.method2200();
                    var6.method2200();
                } else if (this.field430 == 1536) {
                    var6.method2200();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field430 == 512) {
                    var6.method2200();
                } else if (this.field430 == 1024) {
                    var6.method2200();
                    var6.method2200();
                } else if (this.field430 == 1536) {
                    var6.method2200();
                    var6.method2200();
                    var6.method2200();
                }
                var6.method2230(this.field399 - this.field36, this.field33 - this.field35, this.field383 - this.field47);
            }
        }
        var3.field1854 = true;
        return var3;
    }

    @ObfuscatedName("k.k(I)Z")
    public final boolean method11() {
        return this.field28 != null;
    }
}
