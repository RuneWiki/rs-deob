package deob;

@ObfuscatedName("n")
public final class class3 extends class27 {

    @ObfuscatedName("n.f")
    public String field45;

    @ObfuscatedName("n.t")
    public class164 field48;

    @ObfuscatedName("n.n")
    public int field34 = -1;

    @ObfuscatedName("n.e")
    public int field37 = -1;

    @ObfuscatedName("n.l")
    public int field38 = 0;

    @ObfuscatedName("n.d")
    public int field39 = 0;

    @ObfuscatedName("n.r")
    public int field40;

    @ObfuscatedName("n.k")
    public int field41 = 0;

    @ObfuscatedName("n.u")
    public int field42 = 0;

    @ObfuscatedName("n.o")
    public int field53;

    @ObfuscatedName("n.g")
    public int field47;

    @ObfuscatedName("n.s")
    public int field36;

    @ObfuscatedName("n.b")
    public class112 field46;

    @ObfuscatedName("n.v")
    public int field35;

    @ObfuscatedName("n.j")
    public int field43;

    @ObfuscatedName("n.q")
    public int field44;

    @ObfuscatedName("n.a")
    public int field50;

    @ObfuscatedName("n.c")
    public boolean field51 = false;

    @ObfuscatedName("n.m")
    public int field52 = 0;

    @ObfuscatedName("n.f(Ldq;B)V")
    public final void method12(class127 arg0) {
        arg0.field2033 = 0;
        int var2 = arg0.method2458();
        this.field34 = arg0.method2459();
        this.field37 = arg0.method2459();
        int var3 = -1;
        this.field52 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2458();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2458();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2460();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class40.method1433(var4[var5] - 512).field986;
                    if (var8 != 0) {
                        this.field52 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2458();
            if (var11 < 0 || var11 >= Statics.field2748[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field417 = arg0.method2460();
        if (this.field417 == 65535) {
            this.field417 = -1;
        }
        this.field407 = arg0.method2460();
        if (this.field407 == 65535) {
            this.field407 = -1;
        }
        this.field403 = this.field407;
        this.field404 = arg0.method2460();
        if (this.field404 == 65535) {
            this.field404 = -1;
        }
        this.field405 = arg0.method2460();
        if (this.field405 == 65535) {
            this.field405 = -1;
        }
        this.field406 = arg0.method2460();
        if (this.field406 == 65535) {
            this.field406 = -1;
        }
        this.field396 = arg0.method2460();
        if (this.field396 == 65535) {
            this.field396 = -1;
        }
        this.field408 = arg0.method2460();
        if (this.field408 == 65535) {
            this.field408 = -1;
        }
        this.field45 = arg0.method2636();
        if (Statics.field1424 == this) {
            Statics.field1404 = this.field45;
        }
        this.field38 = arg0.method2458();
        this.field39 = arg0.method2460();
        if (this.field48 == null) {
            this.field48 = new class164();
        }
        this.field48.method3228(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("n.t(I)Ldp;")
    public final class112 method13() {
        if (this.field48 == null) {
            return null;
        }
        class34 var1 = this.field425 != -1 && this.field428 == 0 ? class34.method572(this.field425) : null;
        class34 var2 = this.field422 == -1 || this.field51 || this.field422 == this.field417 && var1 != null ? null : class34.method572(this.field422);
        class112 var3 = this.field48.method3234(var1, this.field426, var2, this.field423);
        if (var3 == null) {
            return null;
        }
        var3.method2240();
        this.field451 = var3.field1542;
        if (!this.field51 && this.field413 != -1 && this.field398 != -1) {
            class112 var4 = class35.method115(this.field413).method737(this.field398);
            if (var4 != null) {
                var4.method2249(0, -this.field434, 0);
                class112[] var5 = new class112[] { var3, var4 };
                var3 = new class112(var5, 2);
            }
        }
        if (!this.field51 && this.field46 != null) {
            if (client.field484 >= this.field42) {
                this.field46 = null;
            }
            if (client.field484 >= this.field41 && client.field484 < this.field42) {
                class112 var6 = this.field46;
                var6.method2249(this.field53 - this.field401, this.field47 - this.field40, this.field36 - this.field414);
                if (this.field424 == 512) {
                    var6.method2286();
                    var6.method2286();
                    var6.method2286();
                } else if (this.field424 == 1024) {
                    var6.method2286();
                    var6.method2286();
                } else if (this.field424 == 1536) {
                    var6.method2286();
                }
                class112[] var7 = new class112[] { var3, var6 };
                var3 = new class112(var7, 2);
                if (this.field424 == 512) {
                    var6.method2286();
                } else if (this.field424 == 1024) {
                    var6.method2286();
                    var6.method2286();
                } else if (this.field424 == 1536) {
                    var6.method2286();
                    var6.method2286();
                    var6.method2286();
                }
                var6.method2249(this.field401 - this.field53, this.field40 - this.field47, this.field414 - this.field36);
            }
        }
        var3.field1868 = true;
        return var3;
    }

    @ObfuscatedName("n.n(I)Z")
    public final boolean method22() {
        return this.field48 != null;
    }
}
