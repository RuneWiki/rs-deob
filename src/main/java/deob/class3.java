package deob;

@ObfuscatedName("j")
public final class class3 extends class38 {

    @ObfuscatedName("j.b")
    public String field27;

    @ObfuscatedName("j.g")
    public class180 field50;

    @ObfuscatedName("j.j")
    public int field36 = -1;

    @ObfuscatedName("j.d")
    public int field29 = -1;

    @ObfuscatedName("j.y")
    public String[] field31 = new String[3];

    @ObfuscatedName("j.r")
    public int field32;

    @ObfuscatedName("j.c")
    public int field44;

    @ObfuscatedName("j.l")
    public int field34;

    @ObfuscatedName("j.u")
    public int field35;

    @ObfuscatedName("j.p")
    public int field40;

    @ObfuscatedName("j.n")
    public int field37;

    @ObfuscatedName("j.w")
    public int field38;

    @ObfuscatedName("j.z")
    public int field39;

    @ObfuscatedName("j.k")
    public class106 field26;

    @ObfuscatedName("j.o")
    public int field47;

    @ObfuscatedName("j.t")
    public int field42;

    @ObfuscatedName("j.h")
    public int field43;

    @ObfuscatedName("j.v")
    public int field28;

    @ObfuscatedName("j.a")
    public boolean field45;

    @ObfuscatedName("j.f")
    public int field46;

    @ObfuscatedName("j.q")
    public boolean field41;

    @ObfuscatedName("j.m")
    public int field48;

    @ObfuscatedName("j.s")
    public int field49;

    @ObfuscatedName("j.i")
    public boolean field30;

    @ObfuscatedName("j.e")
    public int field51;

    @ObfuscatedName("j.aw")
    public int field52;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field31[var1] = "";
        }
        this.field32 = 0;
        this.field44 = 0;
        this.field35 = 0;
        this.field40 = 0;
        this.field45 = false;
        this.field46 = 0;
        this.field41 = false;
        this.field30 = false;
    }

    @ObfuscatedName("j.b(Lds;I)V")
    public final void method14(class120 arg0) {
        arg0.field1977 = 0;
        int var2 = arg0.method2344();
        this.field36 = arg0.method2345();
        this.field29 = arg0.method2345();
        int var3 = -1;
        this.field46 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2344();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2344();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2346();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class52.method727(var4[var5] - 512).field1123;
                    if (var8 != 0) {
                        this.field46 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2344();
            if (var11 < 0 || var11 >= Statics.field761[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field796 = arg0.method2346();
        if (this.field796 == 65535) {
            this.field796 = -1;
        }
        this.field797 = arg0.method2346();
        if (this.field797 == 65535) {
            this.field797 = -1;
        }
        this.field798 = this.field797;
        this.field799 = arg0.method2346();
        if (this.field799 == 65535) {
            this.field799 = -1;
        }
        this.field822 = arg0.method2346();
        if (this.field822 == 65535) {
            this.field822 = -1;
        }
        this.field801 = arg0.method2346();
        if (this.field801 == 65535) {
            this.field801 = -1;
        }
        this.field849 = arg0.method2346();
        if (this.field849 == 65535) {
            this.field849 = -1;
        }
        this.field803 = arg0.method2346();
        if (this.field803 == 65535) {
            this.field803 = -1;
        }
        this.field27 = arg0.method2352();
        if (Statics.field2263 == this) {
            Statics.field2208 = this.field27;
        }
        this.field32 = arg0.method2344();
        this.field44 = arg0.method2346();
        this.field41 = arg0.method2344() == 1;
        if (client.field549 == 0 && client.field355 >= 2) {
            this.field41 = false;
        }
        if (this.field50 == null) {
            this.field50 = new class180();
        }
        this.field50.method3281(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("j.g(B)I")
    public int method15() {
        return this.field50 == null || this.field50.field2912 == -1 ? 1 : class40.method3225(this.field50.field2912).field866;
    }

    @ObfuscatedName("j.j(I)Ldd;")
    public final class106 method16() {
        if (this.field50 == null) {
            return null;
        }
        class43 var1 = this.field802 != -1 && this.field828 == 0 ? class43.method175(this.field802) : null;
        class43 var2 = this.field819 == -1 || this.field45 || this.field819 == this.field796 && var1 != null ? null : class43.method175(this.field819);
        class106 var3 = this.field50.method3284(var1, this.field823, var2, this.field820);
        if (var3 == null) {
            return null;
        }
        var3.method2164();
        this.field840 = var3.field1437;
        if (!this.field45 && this.field836 != -1 && this.field812 != -1) {
            class106 var4 = class44.method701(this.field836).method889(this.field812);
            if (var4 != null) {
                var4.method2157(0, -this.field835, 0);
                class106[] var5 = new class106[] { var3, var4 };
                var3 = new class106(var5, 2);
            }
        }
        if (!this.field45 && this.field26 != null) {
            if (client.field297 >= this.field40) {
                this.field26 = null;
            }
            if (client.field297 >= this.field35 && client.field297 < this.field40) {
                class106 var6 = this.field26;
                var6.method2157(this.field37 - this.field814, this.field38 - this.field34, this.field39 - this.field792);
                if (this.field841 == 512) {
                    var6.method2148();
                    var6.method2148();
                    var6.method2148();
                } else if (this.field841 == 1024) {
                    var6.method2148();
                    var6.method2148();
                } else if (this.field841 == 1536) {
                    var6.method2148();
                }
                class106[] var7 = new class106[] { var3, var6 };
                var3 = new class106(var7, 2);
                if (this.field841 == 512) {
                    var6.method2148();
                } else if (this.field841 == 1024) {
                    var6.method2148();
                    var6.method2148();
                } else if (this.field841 == 1536) {
                    var6.method2148();
                    var6.method2148();
                    var6.method2148();
                }
                var6.method2157(this.field814 - this.field37, this.field34 - this.field38, this.field792 - this.field39);
            }
        }
        var3.field1812 = true;
        return var3;
    }

    @ObfuscatedName("j.d(IIBB)V")
    public final void method17(int arg0, int arg1, byte arg2) {
        if (this.field802 != -1 && class43.method175(this.field802).field979 == 1) {
            this.field802 = -1;
        }
        this.field818 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method18(arg0, arg1);
        } else if (this.field845[0] >= 0 && this.field845[0] < 104 && this.field832[0] >= 0 && this.field832[0] < 104) {
            if (arg2 == 2) {
                client.method842(this, arg0, arg1, (byte) 2);
            }
            this.method19(arg0, arg1, arg2);
        } else {
            this.method18(arg0, arg1);
        }
    }

    @ObfuscatedName("j.x(IIB)V")
    public void method18(int arg0, int arg1) {
        this.field809 = 0;
        this.field837 = 0;
        this.field848 = 0;
        this.field845[0] = arg0;
        this.field832[0] = arg1;
        int var3 = this.method15();
        this.field814 = this.field845[0] * 128 + var3 * 64;
        this.field792 = this.field832[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("j.y(IIBS)V")
    public final void method19(int arg0, int arg1, byte arg2) {
        if (this.field809 < 9) {
            this.field809++;
        }
        for (int var4 = this.field809; var4 > 0; var4--) {
            this.field845[var4] = this.field845[var4 - 1];
            this.field832[var4] = this.field832[var4 - 1];
            this.field847[var4] = this.field847[var4 - 1];
        }
        this.field845[0] = arg0;
        this.field832[0] = arg1;
        this.field847[0] = arg2;
    }

    @ObfuscatedName("j.r(B)Z")
    public final boolean method20() {
        return this.field50 != null;
    }
}
