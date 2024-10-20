package deob;

@ObfuscatedName("m")
public final class class3 extends class34 {

    @ObfuscatedName("m.x")
    public String field39;

    @ObfuscatedName("m.v")
    public class160 field29;

    @ObfuscatedName("m.m")
    public int field30 = -1;

    @ObfuscatedName("m.e")
    public int field38 = -1;

    @ObfuscatedName("m.h")
    public int field32 = 0;

    @ObfuscatedName("m.p")
    public int field34 = 0;

    @ObfuscatedName("m.j")
    public int field44;

    @ObfuscatedName("m.i")
    public int field35 = 0;

    @ObfuscatedName("m.u")
    public int field36 = 0;

    @ObfuscatedName("m.l")
    public int field40;

    @ObfuscatedName("m.k")
    public int field28;

    @ObfuscatedName("m.q")
    public int field31;

    @ObfuscatedName("m.b")
    public class99 field33;

    @ObfuscatedName("m.w")
    public int field41;

    @ObfuscatedName("m.g")
    public int field37;

    @ObfuscatedName("m.s")
    public int field43;

    @ObfuscatedName("m.c")
    public int field42;

    @ObfuscatedName("m.r")
    public boolean field45 = false;

    @ObfuscatedName("m.f")
    public int field46 = 0;

    @ObfuscatedName("m.t")
    public boolean field47 = false;

    @ObfuscatedName("m.x(Ldm;I)V")
    public final void method7(class108 arg0) {
        arg0.field1841 = 0;
        int var2 = arg0.method2299();
        this.field30 = arg0.method2128();
        this.field38 = arg0.method2128();
        int var3 = -1;
        this.field46 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2299();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2299();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2129();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class46.method1975(var4[var5] - 512).field1068;
                    if (var8 != 0) {
                        this.field46 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2299();
            if (var11 < 0 || var11 >= Statics.field1902[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field766 = arg0.method2129();
        if (this.field766 == 65535) {
            this.field766 = -1;
        }
        this.field790 = arg0.method2129();
        if (this.field790 == 65535) {
            this.field790 = -1;
        }
        this.field733 = this.field790;
        this.field740 = arg0.method2129();
        if (this.field740 == 65535) {
            this.field740 = -1;
        }
        this.field742 = arg0.method2129();
        if (this.field742 == 65535) {
            this.field742 = -1;
        }
        this.field760 = arg0.method2129();
        if (this.field760 == 65535) {
            this.field760 = -1;
        }
        this.field744 = arg0.method2129();
        if (this.field744 == 65535) {
            this.field744 = -1;
        }
        this.field741 = arg0.method2129();
        if (this.field741 == 65535) {
            this.field741 = -1;
        }
        this.field39 = arg0.method2270();
        if (Statics.field163 == this) {
            Statics.field2081 = this.field39;
        }
        this.field32 = arg0.method2299();
        this.field34 = arg0.method2129();
        this.field47 = arg0.method2299() == 1;
        if (client.field241 == 0 && client.field407 >= 2) {
            this.field47 = false;
        }
        if (this.field29 == null) {
            this.field29 = new class160();
        }
        this.field29.method2934(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("m.v(B)Lck;")
    public final class99 method18() {
        if (this.field29 == null) {
            return null;
        }
        class39 var1 = this.field764 != -1 && this.field767 == 0 ? class39.method633(this.field764) : null;
        class39 var2 = this.field761 == -1 || this.field45 || this.field766 == this.field761 && var1 != null ? null : class39.method633(this.field761);
        class99 var3 = this.field29.method2935(var1, this.field765, var2, this.field762);
        if (var3 == null) {
            return null;
        }
        var3.method1982();
        this.field734 = var3.field1354;
        if (!this.field45 && this.field786 != -1 && this.field770 != -1) {
            class99 var4 = class40.method517(this.field786).method771(this.field770);
            if (var4 != null) {
                var4.method1986(0, -this.field773, 0);
                class99[] var5 = new class99[] { var3, var4 };
                var3 = new class99(var5, 2);
            }
        }
        if (!this.field45 && this.field33 != null) {
            if (client.field348 >= this.field36) {
                this.field33 = null;
            }
            if (client.field348 >= this.field35 && client.field348 < this.field36) {
                class99 var6 = this.field33;
                var6.method1986(this.field40 - this.field747, this.field28 - this.field44, this.field31 - this.field749);
                if (this.field783 == 512) {
                    var6.method2001();
                    var6.method2001();
                    var6.method2001();
                } else if (this.field783 == 1024) {
                    var6.method2001();
                    var6.method2001();
                } else if (this.field783 == 1536) {
                    var6.method2001();
                }
                class99[] var7 = new class99[] { var3, var6 };
                var3 = new class99(var7, 2);
                if (this.field783 == 512) {
                    var6.method2001();
                } else if (this.field783 == 1024) {
                    var6.method2001();
                    var6.method2001();
                } else if (this.field783 == 1536) {
                    var6.method2001();
                    var6.method2001();
                    var6.method2001();
                }
                var6.method1986(this.field747 - this.field40, this.field44 - this.field28, this.field749 - this.field31);
            }
        }
        var3.field1724 = true;
        return var3;
    }

    @ObfuscatedName("m.m(I)Z")
    public final boolean method9() {
        return this.field29 != null;
    }
}
