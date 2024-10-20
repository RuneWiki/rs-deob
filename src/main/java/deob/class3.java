package deob;

@ObfuscatedName("r")
public final class class3 extends class28 {

    @ObfuscatedName("r.i")
    public String field47;

    @ObfuscatedName("r.b")
    public class166 field38;

    @ObfuscatedName("r.r")
    public int field33 = -1;

    @ObfuscatedName("r.l")
    public int field34 = -1;

    @ObfuscatedName("r.s")
    public int field35 = 0;

    @ObfuscatedName("r.d")
    public int field36 = 0;

    @ObfuscatedName("r.e")
    public int field32;

    @ObfuscatedName("r.u")
    public int field37 = 0;

    @ObfuscatedName("r.q")
    public int field39 = 0;

    @ObfuscatedName("r.o")
    public int field40;

    @ObfuscatedName("r.v")
    public int field41;

    @ObfuscatedName("r.m")
    public int field42;

    @ObfuscatedName("r.x")
    public class113 field53;

    @ObfuscatedName("r.w")
    public int field44;

    @ObfuscatedName("r.p")
    public int field45;

    @ObfuscatedName("r.z")
    public int field46;

    @ObfuscatedName("r.h")
    public int field31;

    @ObfuscatedName("r.a")
    public boolean field43 = false;

    @ObfuscatedName("r.c")
    public int field49 = 0;

    @ObfuscatedName("r.i(Lds;B)V")
    public final void method12(class128 arg0) {
        arg0.field2048 = 0;
        int var2 = arg0.method2531();
        this.field33 = arg0.method2464();
        this.field34 = arg0.method2464();
        int var3 = -1;
        this.field49 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2531();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2531();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2473();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class41.method1342(var4[var5] - 512).field1032;
                    if (var8 != 0) {
                        this.field49 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2531();
            if (var11 < 0 || var11 >= Statics.field66[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field423 = arg0.method2473();
        if (this.field423 == 65535) {
            this.field423 = -1;
        }
        this.field424 = arg0.method2473();
        if (this.field424 == 65535) {
            this.field424 = -1;
        }
        this.field426 = this.field424;
        this.field440 = arg0.method2473();
        if (this.field440 == 65535) {
            this.field440 = -1;
        }
        this.field432 = arg0.method2473();
        if (this.field432 == 65535) {
            this.field432 = -1;
        }
        this.field472 = arg0.method2473();
        if (this.field472 == 65535) {
            this.field472 = -1;
        }
        this.field429 = arg0.method2473();
        if (this.field429 == 65535) {
            this.field429 = -1;
        }
        this.field430 = arg0.method2473();
        if (this.field430 == 65535) {
            this.field430 = -1;
        }
        this.field47 = arg0.method2618();
        if (Statics.field1683 == this) {
            Statics.field1438 = this.field47;
        }
        this.field35 = arg0.method2531();
        this.field36 = arg0.method2473();
        if (this.field38 == null) {
            this.field38 = new class166();
        }
        this.field38.method3254(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("r.b(I)Ldt;")
    public final class113 method26() {
        if (this.field38 == null) {
            return null;
        }
        class35 var1 = this.field459 != -1 && this.field451 == 0 ? class35.method708(this.field459) : null;
        class35 var2 = this.field445 == -1 || this.field43 || this.field445 == this.field423 && var1 != null ? null : class35.method708(this.field445);
        class113 var3 = this.field38.method3243(var1, this.field449, var2, this.field461);
        if (var3 == null) {
            return null;
        }
        var3.method2271();
        this.field434 = var3.field1564;
        if (!this.field43 && this.field453 != -1 && this.field454 != -1) {
            class113 var4 = Statics.method623(this.field453).method756(this.field454);
            if (var4 != null) {
                var4.method2270(0, -this.field457, 0);
                class113[] var5 = new class113[] { var3, var4 };
                var3 = new class113(var5, 2);
            }
        }
        if (!this.field43 && this.field53 != null) {
            if (client.field735 >= this.field39) {
                this.field53 = null;
            }
            if (client.field735 >= this.field37 && client.field735 < this.field39) {
                class113 var6 = this.field53;
                var6.method2270(this.field40 - this.field470, this.field41 - this.field32, this.field42 - this.field419);
                if (this.field467 == 512) {
                    var6.method2266();
                    var6.method2266();
                    var6.method2266();
                } else if (this.field467 == 1024) {
                    var6.method2266();
                    var6.method2266();
                } else if (this.field467 == 1536) {
                    var6.method2266();
                }
                class113[] var7 = new class113[] { var3, var6 };
                var3 = new class113(var7, 2);
                if (this.field467 == 512) {
                    var6.method2266();
                } else if (this.field467 == 1024) {
                    var6.method2266();
                    var6.method2266();
                } else if (this.field467 == 1536) {
                    var6.method2266();
                    var6.method2266();
                    var6.method2266();
                }
                var6.method2270(this.field470 - this.field40, this.field32 - this.field41, this.field419 - this.field42);
            }
        }
        var3.field1888 = true;
        return var3;
    }

    @ObfuscatedName("r.r(B)Z")
    public final boolean method14() {
        return this.field38 != null;
    }
}
