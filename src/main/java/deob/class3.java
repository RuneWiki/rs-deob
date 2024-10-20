package deob;

@ObfuscatedName("g")
public final class class3 extends class35 {

    @ObfuscatedName("g.y")
    public String field49;

    @ObfuscatedName("g.k")
    public class170 field36;

    @ObfuscatedName("g.g")
    public int field43 = -1;

    @ObfuscatedName("g.n")
    public int field38 = -1;

    @ObfuscatedName("g.t")
    public int field39 = 0;

    @ObfuscatedName("g.e")
    public int field40 = 0;

    @ObfuscatedName("g.q")
    public int field35;

    @ObfuscatedName("g.z")
    public int field41 = 0;

    @ObfuscatedName("g.v")
    public int field47 = 0;

    @ObfuscatedName("g.b")
    public int field44;

    @ObfuscatedName("g.f")
    public int field45;

    @ObfuscatedName("g.i")
    public int field51;

    @ObfuscatedName("g.w")
    public class100 field42;

    @ObfuscatedName("g.l")
    public int field48;

    @ObfuscatedName("g.j")
    public int field37;

    @ObfuscatedName("g.s")
    public int field50;

    @ObfuscatedName("g.r")
    public int field46;

    @ObfuscatedName("g.h")
    public boolean field52 = false;

    @ObfuscatedName("g.x")
    public int field53 = 0;

    @ObfuscatedName("g.m")
    public boolean field54 = false;

    @ObfuscatedName("g.y(Ldw;B)V")
    public final void method25(class111 arg0) {
        arg0.field1902 = 0;
        int var2 = arg0.method2205();
        this.field43 = arg0.method2199();
        this.field38 = arg0.method2199();
        int var3 = -1;
        this.field53 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2205();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2205();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2339();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method859(var4[var5] - 512).field1053;
                    if (var8 != 0) {
                        this.field53 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2205();
            if (var11 < 0 || var11 >= Statics.field2835[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field766 = arg0.method2339();
        if (this.field766 == 65535) {
            this.field766 = -1;
        }
        this.field814 = arg0.method2339();
        if (this.field814 == 65535) {
            this.field814 = -1;
        }
        this.field768 = this.field814;
        this.field769 = arg0.method2339();
        if (this.field769 == 65535) {
            this.field769 = -1;
        }
        this.field787 = arg0.method2339();
        if (this.field787 == 65535) {
            this.field787 = -1;
        }
        this.field771 = arg0.method2339();
        if (this.field771 == 65535) {
            this.field771 = -1;
        }
        this.field820 = arg0.method2339();
        if (this.field820 == 65535) {
            this.field820 = -1;
        }
        this.field792 = arg0.method2339();
        if (this.field792 == 65535) {
            this.field792 = -1;
        }
        this.field49 = arg0.method2170();
        if (Statics.field2098 == this) {
            Statics.field2144 = this.field49;
        }
        this.field39 = arg0.method2205();
        this.field40 = arg0.method2339();
        this.field54 = arg0.method2205() == 1;
        if (client.field264 == 0 && client.field434 >= 2) {
            this.field54 = false;
        }
        if (this.field36 == null) {
            this.field36 = new class170();
        }
        this.field36.method3105(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("g.k(I)Lch;")
    public final class100 method16() {
        if (this.field36 == null) {
            return null;
        }
        class40 var1 = this.field777 != -1 && this.field795 == 0 ? class40.method547(this.field777) : null;
        class40 var2 = this.field789 == -1 || this.field52 || this.field789 == this.field766 && var1 != null ? null : class40.method547(this.field789);
        class100 var3 = this.field36.method3096(var1, this.field793, var2, this.field790);
        if (var3 == null) {
            return null;
        }
        var3.method2000();
        this.field810 = var3.field1383;
        if (!this.field52 && this.field797 != -1 && this.field798 != -1) {
            class100 var4 = class41.method2077(this.field797).method799(this.field798);
            if (var4 != null) {
                var4.method2067(0, -this.field801, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field52 && this.field42 != null) {
            if (client.field423 >= this.field47) {
                this.field42 = null;
            }
            if (client.field423 >= this.field41 && client.field423 < this.field47) {
                class100 var6 = this.field42;
                var6.method2067(this.field44 - this.field802, this.field45 - this.field35, this.field51 - this.field762);
                if (this.field811 == 512) {
                    var6.method2057();
                    var6.method2057();
                    var6.method2057();
                } else if (this.field811 == 1024) {
                    var6.method2057();
                    var6.method2057();
                } else if (this.field811 == 1536) {
                    var6.method2057();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field811 == 512) {
                    var6.method2057();
                } else if (this.field811 == 1024) {
                    var6.method2057();
                    var6.method2057();
                } else if (this.field811 == 1536) {
                    var6.method2057();
                    var6.method2057();
                    var6.method2057();
                }
                var6.method2067(this.field802 - this.field44, this.field35 - this.field45, this.field762 - this.field51);
            }
        }
        var3.field1733 = true;
        return var3;
    }

    @ObfuscatedName("g.g(I)Z")
    public final boolean method19() {
        return this.field36 != null;
    }
}
