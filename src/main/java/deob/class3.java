package deob;

@ObfuscatedName("l")
public final class class3 extends class35 {

    @ObfuscatedName("l.e")
    public String field43;

    @ObfuscatedName("l.a")
    public class169 field34;

    @ObfuscatedName("l.l")
    public int field35 = -1;

    @ObfuscatedName("l.c")
    public int field36 = -1;

    @ObfuscatedName("l.u")
    public int field41 = 0;

    @ObfuscatedName("l.w")
    public int field38 = 0;

    @ObfuscatedName("l.i")
    public int field39;

    @ObfuscatedName("l.r")
    public int field40 = 0;

    @ObfuscatedName("l.f")
    public int field53 = 0;

    @ObfuscatedName("l.g")
    public int field37;

    @ObfuscatedName("l.o")
    public int field44;

    @ObfuscatedName("l.h")
    public int field52;

    @ObfuscatedName("l.s")
    public class100 field45;

    @ObfuscatedName("l.j")
    public int field46;

    @ObfuscatedName("l.m")
    public int field47;

    @ObfuscatedName("l.t")
    public int field48;

    @ObfuscatedName("l.z")
    public int field49;

    @ObfuscatedName("l.y")
    public boolean field42 = false;

    @ObfuscatedName("l.q")
    public int field51 = 0;

    @ObfuscatedName("l.d")
    public boolean field33 = false;

    @ObfuscatedName("l.e(Ldh;I)V")
    public final void method12(class111 arg0) {
        arg0.field1834 = 0;
        int var2 = arg0.method2176();
        this.field35 = arg0.method2162();
        this.field36 = arg0.method2162();
        int var3 = -1;
        this.field51 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2176();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2176();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2178();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class47.method2467(var4[var5] - 512).field1037;
                    if (var8 != 0) {
                        this.field51 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2176();
            if (var11 < 0 || var11 >= Statics.field1269[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field761 = arg0.method2178();
        if (this.field761 == 65535) {
            this.field761 = -1;
        }
        this.field727 = arg0.method2178();
        if (this.field727 == 65535) {
            this.field727 = -1;
        }
        this.field728 = this.field727;
        this.field729 = arg0.method2178();
        if (this.field729 == 65535) {
            this.field729 = -1;
        }
        this.field749 = arg0.method2178();
        if (this.field749 == 65535) {
            this.field749 = -1;
        }
        this.field758 = arg0.method2178();
        if (this.field758 == 65535) {
            this.field758 = -1;
        }
        this.field732 = arg0.method2178();
        if (this.field732 == 65535) {
            this.field732 = -1;
        }
        this.field733 = arg0.method2178();
        if (this.field733 == 65535) {
            this.field733 = -1;
        }
        this.field43 = arg0.method2167();
        if (Statics.field3024 == this) {
            Statics.field2077 = this.field43;
        }
        this.field41 = arg0.method2176();
        this.field38 = arg0.method2178();
        this.field33 = arg0.method2176() == 1;
        if (client.field247 == 0 && client.field412 >= 2) {
            this.field33 = false;
        }
        if (this.field34 == null) {
            this.field34 = new class169();
        }
        this.field34.method3052(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("l.a(I)Lcy;")
    public final class100 method30() {
        if (this.field34 == null) {
            return null;
        }
        class40 var1 = this.field782 != -1 && this.field756 == 0 ? class40.method1826(this.field782) : null;
        class40 var2 = this.field750 == -1 || this.field42 || this.field761 == this.field750 && var1 != null ? null : class40.method1826(this.field750);
        class100 var3 = this.field34.method3053(var1, this.field754, var2, this.field751);
        if (var3 == null) {
            return null;
        }
        var3.method2051();
        this.field771 = var3.field1324;
        if (!this.field42 && this.field774 != -1 && this.field759 != -1) {
            class100 var4 = class41.method2784(this.field774).method776(this.field759);
            if (var4 != null) {
                var4.method2030(0, -this.field747, 0);
                class100[] var5 = new class100[] { var3, var4 };
                var3 = new class100(var5, 2);
            }
        }
        if (!this.field42 && this.field45 != null) {
            if (client.field256 >= this.field53) {
                this.field45 = null;
            }
            if (client.field256 >= this.field40 && client.field256 < this.field53) {
                class100 var6 = this.field45;
                var6.method2030(this.field37 - this.field767, this.field44 - this.field39, this.field52 - this.field722);
                if (this.field772 == 512) {
                    var6.method2038();
                    var6.method2038();
                    var6.method2038();
                } else if (this.field772 == 1024) {
                    var6.method2038();
                    var6.method2038();
                } else if (this.field772 == 1536) {
                    var6.method2038();
                }
                class100[] var7 = new class100[] { var3, var6 };
                var3 = new class100(var7, 2);
                if (this.field772 == 512) {
                    var6.method2038();
                } else if (this.field772 == 1024) {
                    var6.method2038();
                    var6.method2038();
                } else if (this.field772 == 1536) {
                    var6.method2038();
                    var6.method2038();
                    var6.method2038();
                }
                var6.method2030(this.field767 - this.field37, this.field39 - this.field44, this.field722 - this.field52);
            }
        }
        var3.field1706 = true;
        return var3;
    }

    @ObfuscatedName("l.l(I)Z")
    public final boolean method25() {
        return this.field34 != null;
    }
}
