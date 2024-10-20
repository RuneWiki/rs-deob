package deob;

@ObfuscatedName("a")
public final class class3 extends class27 {

    @ObfuscatedName("a.p")
    public String field33;

    @ObfuscatedName("a.e")
    public class164 field31;

    @ObfuscatedName("a.a")
    public int field32 = -1;

    @ObfuscatedName("a.h")
    public int field36 = -1;

    @ObfuscatedName("a.y")
    public int field34 = 0;

    @ObfuscatedName("a.j")
    public int field49 = 0;

    @ObfuscatedName("a.l")
    public int field35;

    @ObfuscatedName("a.f")
    public int field42 = 0;

    @ObfuscatedName("a.n")
    public int field38 = 0;

    @ObfuscatedName("a.k")
    public int field39;

    @ObfuscatedName("a.q")
    public int field40;

    @ObfuscatedName("a.w")
    public int field41;

    @ObfuscatedName("a.v")
    public class112 field30;

    @ObfuscatedName("a.z")
    public int field37;

    @ObfuscatedName("a.m")
    public int field44;

    @ObfuscatedName("a.r")
    public int field45;

    @ObfuscatedName("a.u")
    public int field46;

    @ObfuscatedName("a.i")
    public boolean field47 = false;

    @ObfuscatedName("a.x")
    public int field48 = 0;

    @ObfuscatedName("a.p(Ldj;I)V")
    public final void method18(class127 arg0) {
        arg0.field2029 = 0;
        int var2 = arg0.method2494();
        this.field32 = arg0.method2604();
        this.field36 = arg0.method2604();
        int var3 = -1;
        this.field48 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2494();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2494();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2496();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method1554(var4[var5] - 512).field1013;
                    if (var8 != 0) {
                        this.field48 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2494();
            if (var11 < 0 || var11 >= Statics.field2732[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field402 = arg0.method2496();
        if (this.field402 == 65535) {
            this.field402 = -1;
        }
        this.field403 = arg0.method2496();
        if (this.field403 == 65535) {
            this.field403 = -1;
        }
        this.field404 = this.field403;
        this.field405 = arg0.method2496();
        if (this.field405 == 65535) {
            this.field405 = -1;
        }
        this.field406 = arg0.method2496();
        if (this.field406 == 65535) {
            this.field406 = -1;
        }
        this.field407 = arg0.method2496();
        if (this.field407 == 65535) {
            this.field407 = -1;
        }
        this.field408 = arg0.method2496();
        if (this.field408 == 65535) {
            this.field408 = -1;
        }
        this.field409 = arg0.method2496();
        if (this.field409 == 65535) {
            this.field409 = -1;
        }
        this.field33 = arg0.method2502();
        if (Statics.field1271 == this) {
            Statics.field1421 = this.field33;
        }
        this.field34 = arg0.method2494();
        this.field49 = arg0.method2496();
        if (this.field31 == null) {
            this.field31 = new class164();
        }
        this.field31.method3230(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("a.e(I)Lds;")
    public final class112 method19() {
        if (this.field31 == null) {
            return null;
        }
        class34 var1 = this.field456 != -1 && this.field429 == 0 ? Statics.method1204(this.field456) : null;
        class34 var2 = this.field423 == -1 || this.field47 || this.field423 == this.field402 && var1 != null ? null : Statics.method1204(this.field423);
        class112 var3 = this.field31.method3236(var1, this.field427, var2, this.field401);
        if (var3 == null) {
            return null;
        }
        var3.method2303();
        this.field444 = var3.field1554;
        if (!this.field47 && this.field415 != -1 && this.field432 != -1) {
            class112 var4 = class35.method163(this.field415).method760(this.field432);
            if (var4 != null) {
                var4.method2313(0, -this.field435, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field47 && this.field30 != null) {
            if (client.field476 >= this.field38) {
                this.field30 = null;
            }
            if (client.field476 >= this.field42 && client.field476 < this.field38) {
                class112 var6 = this.field30;
                var6.method2313(this.field39 - this.field418, this.field40 - this.field35, this.field41 - this.field398);
                if (this.field445 == 512) {
                    var6.method2266();
                    var6.method2266();
                    var6.method2266();
                } else if (this.field445 == 1024) {
                    var6.method2266();
                    var6.method2266();
                } else if (this.field445 == 1536) {
                    var6.method2266();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field445 == 512) {
                    var6.method2266();
                } else if (this.field445 == 1024) {
                    var6.method2266();
                    var6.method2266();
                } else if (this.field445 == 1536) {
                    var6.method2266();
                    var6.method2266();
                    var6.method2266();
                }
                var6.method2313(this.field418 - this.field39, this.field35 - this.field40, this.field398 - this.field41);
            }
        }
        var3.field1905 = true;
        return var3;
    }

    @ObfuscatedName("a.a(B)Z")
    public final boolean method20() {
        return this.field31 != null;
    }
}
