package deob;

@ObfuscatedName("v")
public final class class3 extends class27 {

    @ObfuscatedName("v.j")
    public String field39;

    @ObfuscatedName("v.r")
    public class163 field30;

    @ObfuscatedName("v.v")
    public int field31 = -1;

    @ObfuscatedName("v.p")
    public int field29 = -1;

    @ObfuscatedName("v.e")
    public int field46 = 0;

    @ObfuscatedName("v.d")
    public int field34 = 0;

    @ObfuscatedName("v.y")
    public int field35;

    @ObfuscatedName("v.x")
    public int field36 = 0;

    @ObfuscatedName("v.t")
    public int field33 = 0;

    @ObfuscatedName("v.i")
    public int field42;

    @ObfuscatedName("v.z")
    public int field37;

    @ObfuscatedName("v.o")
    public int field40;

    @ObfuscatedName("v.u")
    public class112 field41;

    @ObfuscatedName("v.f")
    public int field38;

    @ObfuscatedName("v.k")
    public int field43;

    @ObfuscatedName("v.q")
    public int field44;

    @ObfuscatedName("v.a")
    public int field45;

    @ObfuscatedName("v.w")
    public boolean field32 = false;

    @ObfuscatedName("v.g")
    public int field47 = 0;

    @ObfuscatedName("v.j(Ldn;I)V")
    public final void method15(class127 arg0) {
        arg0.field2022 = 0;
        int var2 = arg0.method2441();
        this.field31 = arg0.method2442();
        this.field29 = arg0.method2442();
        int var3 = -1;
        this.field47 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2441();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2441();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2609();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method789(var4[var5] - 512).field985;
                    if (var8 != 0) {
                        this.field47 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2441();
            if (var11 < 0 || var11 >= Statics.field2018[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field452 = arg0.method2609();
        if (this.field452 == 65535) {
            this.field452 = -1;
        }
        this.field412 = arg0.method2609();
        if (this.field412 == 65535) {
            this.field412 = -1;
        }
        this.field413 = this.field412;
        this.field414 = arg0.method2609();
        if (this.field414 == 65535) {
            this.field414 = -1;
        }
        this.field418 = arg0.method2609();
        if (this.field418 == 65535) {
            this.field418 = -1;
        }
        this.field416 = arg0.method2609();
        if (this.field416 == 65535) {
            this.field416 = -1;
        }
        this.field417 = arg0.method2609();
        if (this.field417 == 65535) {
            this.field417 = -1;
        }
        this.field466 = arg0.method2609();
        if (this.field466 == 65535) {
            this.field466 = -1;
        }
        this.field39 = arg0.method2449();
        if (Statics.field71 == this) {
            Statics.field1396 = this.field39;
        }
        this.field46 = arg0.method2441();
        this.field34 = arg0.method2609();
        if (this.field30 == null) {
            this.field30 = new class163();
        }
        this.field30.method3174(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("v.r(B)Ldt;")
    public final class112 method18() {
        if (this.field30 == null) {
            return null;
        }
        class34 var1 = this.field435 != -1 && this.field438 == 0 ? class34.method2349(this.field435) : null;
        class34 var2 = this.field432 == -1 || this.field32 || this.field452 == this.field432 && var1 != null ? null : class34.method2349(this.field432);
        class112 var3 = this.field30.method3175(var1, this.field421, var2, this.field433);
        if (var3 == null) {
            return null;
        }
        var3.method2307();
        this.field453 = var3.field1533;
        if (!this.field32 && this.field455 != -1 && this.field441 != -1) {
            class112 var4 = class35.method233(this.field455).method736(this.field441);
            if (var4 != null) {
                var4.method2243(0, -this.field444, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field32 && this.field41 != null) {
            if (client.field482 >= this.field33) {
                this.field41 = null;
            }
            if (client.field482 >= this.field36 && client.field482 < this.field33) {
                class112 var6 = this.field41;
                var6.method2243(this.field42 - this.field410, this.field37 - this.field35, this.field40 - this.field407);
                if (this.field454 == 512) {
                    var6.method2239();
                    var6.method2239();
                    var6.method2239();
                } else if (this.field454 == 1024) {
                    var6.method2239();
                    var6.method2239();
                } else if (this.field454 == 1536) {
                    var6.method2239();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field454 == 512) {
                    var6.method2239();
                } else if (this.field454 == 1024) {
                    var6.method2239();
                    var6.method2239();
                } else if (this.field454 == 1536) {
                    var6.method2239();
                    var6.method2239();
                    var6.method2239();
                }
                var6.method2243(this.field410 - this.field42, this.field35 - this.field37, this.field407 - this.field40);
            }
        }
        var3.field1864 = true;
        return var3;
    }

    @ObfuscatedName("v.v(I)Z")
    public final boolean method17() {
        return this.field30 != null;
    }
}
