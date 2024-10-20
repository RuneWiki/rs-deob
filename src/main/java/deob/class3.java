package deob;

@ObfuscatedName("a")
public final class class3 extends class33 {

    @ObfuscatedName("a.e")
    public String field50;

    @ObfuscatedName("a.p")
    public class156 field40;

    @ObfuscatedName("a.a")
    public int field41 = -1;

    @ObfuscatedName("a.g")
    public int field42 = -1;

    @ObfuscatedName("a.u")
    public int field55 = 0;

    @ObfuscatedName("a.k")
    public int field44 = 0;

    @ObfuscatedName("a.m")
    public int field45;

    @ObfuscatedName("a.t")
    public int field43 = 0;

    @ObfuscatedName("a.l")
    public int field59 = 0;

    @ObfuscatedName("a.f")
    public int field39;

    @ObfuscatedName("a.c")
    public int field49;

    @ObfuscatedName("a.i")
    public int field48;

    @ObfuscatedName("a.o")
    public class98 field47;

    @ObfuscatedName("a.d")
    public int field52;

    @ObfuscatedName("a.b")
    public int field53;

    @ObfuscatedName("a.v")
    public int field54;

    @ObfuscatedName("a.n")
    public int field58;

    @ObfuscatedName("a.w")
    public boolean field56 = false;

    @ObfuscatedName("a.z")
    public int field46 = 0;

    @ObfuscatedName("a.e(Ldp;B)V")
    public final void method22(class107 arg0) {
        arg0.field1841 = 0;
        int var2 = arg0.method2125();
        this.field41 = arg0.method2201();
        this.field42 = arg0.method2201();
        int var3 = -1;
        this.field46 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2125();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2125();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2182();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class45.method573(var4[var5] - 512).field1044;
                    if (var8 != 0) {
                        this.field46 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2125();
            if (var11 < 0 || var11 >= Statics.field1272[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field717 = arg0.method2182();
        if (this.field717 == 65535) {
            this.field717 = -1;
        }
        this.field718 = arg0.method2182();
        if (this.field718 == 65535) {
            this.field718 = -1;
        }
        this.field721 = this.field718;
        this.field720 = arg0.method2182();
        if (this.field720 == 65535) {
            this.field720 = -1;
        }
        this.field755 = arg0.method2182();
        if (this.field755 == 65535) {
            this.field755 = -1;
        }
        this.field741 = arg0.method2182();
        if (this.field741 == 65535) {
            this.field741 = -1;
        }
        this.field757 = arg0.method2182();
        if (this.field757 == 65535) {
            this.field757 = -1;
        }
        this.field724 = arg0.method2182();
        if (this.field724 == 65535) {
            this.field724 = -1;
        }
        this.field50 = arg0.method2149();
        if (Statics.field521 == this) {
            Statics.field2078 = this.field50;
        }
        this.field55 = arg0.method2125();
        this.field44 = arg0.method2182();
        if (this.field40 == null) {
            this.field40 = new class156();
        }
        this.field40.method2948(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("a.p(B)Lcs;")
    public final class98 method12() {
        if (this.field40 == null) {
            return null;
        }
        class38 var1 = this.field742 != -1 && this.field745 == 0 ? class38.method81(this.field742) : null;
        class38 var2 = this.field739 == -1 || this.field56 || this.field739 == this.field717 && var1 != null ? null : class38.method81(this.field739);
        class98 var3 = this.field40.method2937(var1, this.field713, var2, this.field761);
        if (var3 == null) {
            return null;
        }
        var3.method1988();
        this.field760 = var3.field1343;
        if (!this.field56 && this.field751 != -1 && this.field748 != -1) {
            class98 var4 = class39.method467(this.field751).method771(this.field748);
            if (var4 != null) {
                var4.method1993(0, -this.field753, 0);
                class98[] var5 = new class98[] { var3, var4 };
                var3 = new class98(var5, 2);
            }
        }
        if (!this.field56 && this.field47 != null) {
            if (client.field265 >= this.field59) {
                this.field47 = null;
            }
            if (client.field265 >= this.field43 && client.field265 < this.field59) {
                class98 var6 = this.field47;
                var6.method1993(this.field39 - this.field729, this.field49 - this.field45, this.field48 - this.field740);
                if (this.field732 == 512) {
                    var6.method2030();
                    var6.method2030();
                    var6.method2030();
                } else if (this.field732 == 1024) {
                    var6.method2030();
                    var6.method2030();
                } else if (this.field732 == 1536) {
                    var6.method2030();
                }
                class98[] var7 = new class98[] { var3, var6 };
                var3 = new class98(var7, 2);
                if (this.field732 == 512) {
                    var6.method2030();
                } else if (this.field732 == 1024) {
                    var6.method2030();
                    var6.method2030();
                } else if (this.field732 == 1536) {
                    var6.method2030();
                    var6.method2030();
                    var6.method2030();
                }
                var6.method1993(this.field729 - this.field39, this.field45 - this.field49, this.field740 - this.field48);
            }
        }
        var3.field1710 = true;
        return var3;
    }

    @ObfuscatedName("a.a(I)Z")
    public final boolean method14() {
        return this.field40 != null;
    }
}
