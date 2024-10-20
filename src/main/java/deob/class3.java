package deob;

@ObfuscatedName("d")
public final class class3 extends class27 {

    @ObfuscatedName("d.y")
    public String field39;

    @ObfuscatedName("d.m")
    public class163 field29;

    @ObfuscatedName("d.d")
    public int field30 = -1;

    @ObfuscatedName("d.k")
    public int field31 = -1;

    @ObfuscatedName("d.n")
    public int field34 = 0;

    @ObfuscatedName("d.s")
    public int field45 = 0;

    @ObfuscatedName("d.x")
    public int field46;

    @ObfuscatedName("d.b")
    public int field35 = 0;

    @ObfuscatedName("d.j")
    public int field36 = 0;

    @ObfuscatedName("d.p")
    public int field32;

    @ObfuscatedName("d.l")
    public int field38;

    @ObfuscatedName("d.i")
    public int field41;

    @ObfuscatedName("d.r")
    public class112 field40;

    @ObfuscatedName("d.o")
    public int field33;

    @ObfuscatedName("d.c")
    public int field42;

    @ObfuscatedName("d.f")
    public int field43;

    @ObfuscatedName("d.a")
    public int field44;

    @ObfuscatedName("d.t")
    public boolean field37 = false;

    @ObfuscatedName("d.u")
    public int field28 = 0;

    @ObfuscatedName("d.y(Ldp;B)V")
    public final void method19(class127 arg0) {
        arg0.field2036 = 0;
        int var2 = arg0.method2534();
        this.field30 = arg0.method2459();
        this.field31 = arg0.method2459();
        int var3 = -1;
        this.field28 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2534();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2534();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2460();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method30(var4[var5] - 512).field1007;
                    if (var8 != 0) {
                        this.field28 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2534();
            if (var11 < 0 || var11 >= Statics.field2566[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field441 = arg0.method2460();
        if (this.field441 == 65535) {
            this.field441 = -1;
        }
        this.field404 = arg0.method2460();
        if (this.field404 == 65535) {
            this.field404 = -1;
        }
        this.field405 = this.field404;
        this.field406 = arg0.method2460();
        if (this.field406 == 65535) {
            this.field406 = -1;
        }
        this.field449 = arg0.method2460();
        if (this.field449 == 65535) {
            this.field449 = -1;
        }
        this.field408 = arg0.method2460();
        if (this.field408 == 65535) {
            this.field408 = -1;
        }
        this.field434 = arg0.method2460();
        if (this.field434 == 65535) {
            this.field434 = -1;
        }
        this.field410 = arg0.method2460();
        if (this.field410 == 65535) {
            this.field410 = -1;
        }
        this.field39 = arg0.method2466();
        if (Statics.field147 == this) {
            Statics.field1414 = this.field39;
        }
        this.field34 = arg0.method2534();
        this.field45 = arg0.method2460();
        if (this.field29 == null) {
            this.field29 = new class163();
        }
        this.field29.method3197(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("d.m(I)Ldw;")
    public final class112 method20() {
        if (this.field29 == null) {
            return null;
        }
        class34 var1 = this.field428 != -1 && this.field411 == 0 ? class34.method540(this.field428) : null;
        class34 var2 = this.field446 == -1 || this.field37 || this.field446 == this.field441 && var1 != null ? null : class34.method540(this.field446);
        class112 var3 = this.field29.method3203(var1, this.field419, var2, this.field426);
        if (var3 == null) {
            return null;
        }
        var3.method2277();
        this.field429 = var3.field1541;
        if (!this.field37 && this.field433 != -1 && this.field416 != -1) {
            class112 var4 = class35.method1458(this.field433).method760(this.field416);
            if (var4 != null) {
                var4.method2322(0, -this.field437, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field37 && this.field40 != null) {
            if (client.field691 >= this.field36) {
                this.field40 = null;
            }
            if (client.field691 >= this.field35 && client.field691 < this.field36) {
                class112 var6 = this.field40;
                var6.method2322(this.field32 - this.field444, this.field38 - this.field46, this.field41 - this.field399);
                if (this.field447 == 512) {
                    var6.method2254();
                    var6.method2254();
                    var6.method2254();
                } else if (this.field447 == 1024) {
                    var6.method2254();
                    var6.method2254();
                } else if (this.field447 == 1536) {
                    var6.method2254();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field447 == 512) {
                    var6.method2254();
                } else if (this.field447 == 1024) {
                    var6.method2254();
                    var6.method2254();
                } else if (this.field447 == 1536) {
                    var6.method2254();
                    var6.method2254();
                    var6.method2254();
                }
                var6.method2322(this.field444 - this.field32, this.field46 - this.field38, this.field399 - this.field41);
            }
        }
        var3.field1885 = true;
        return var3;
    }

    @ObfuscatedName("d.d(I)Z")
    public final boolean method33() {
        return this.field29 != null;
    }
}
