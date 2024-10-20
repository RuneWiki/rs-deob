package deob;

@ObfuscatedName("by")
public final class class72 extends class75 {

    @ObfuscatedName("by.s")
    public class281 field819;

    @ObfuscatedName("by.g")
    public class225 field820;

    @ObfuscatedName("by.m")
    public int field809 = -1;

    @ObfuscatedName("by.h")
    public int field810 = -1;

    @ObfuscatedName("by.w")
    public String[] field811 = new String[3];

    @ObfuscatedName("by.t")
    public int field812;

    @ObfuscatedName("by.d")
    public int field807;

    @ObfuscatedName("by.z")
    public int field814;

    @ObfuscatedName("by.k")
    public int field815;

    @ObfuscatedName("by.c")
    public int field824;

    @ObfuscatedName("by.o")
    public int field817;

    @ObfuscatedName("by.l")
    public int field818;

    @ObfuscatedName("by.f")
    public int field808;

    @ObfuscatedName("by.q")
    public class131 field826;

    @ObfuscatedName("by.r")
    public int field821;

    @ObfuscatedName("by.x")
    public int field822;

    @ObfuscatedName("by.u")
    public int field816;

    @ObfuscatedName("by.b")
    public int field813;

    @ObfuscatedName("by.p")
    public boolean field825;

    @ObfuscatedName("by.y")
    public int field829;

    @ObfuscatedName("by.n")
    public boolean field827;

    @ObfuscatedName("by.j")
    public int field828;

    @ObfuscatedName("by.e")
    public int field823;

    @ObfuscatedName("by.v")
    public class279 field830;

    @ObfuscatedName("by.a")
    public class279 field831;

    @ObfuscatedName("by.ad")
    public boolean field832;

    @ObfuscatedName("by.al")
    public int field833;

    @ObfuscatedName("by.aq")
    public int field834;

    public class72() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field811[var1] = "";
        }
        this.field812 = 0;
        this.field807 = 0;
        this.field815 = 0;
        this.field824 = 0;
        this.field825 = false;
        this.field829 = 0;
        this.field827 = false;
        this.field830 = class279.field3717;
        this.field831 = class279.field3717;
        this.field832 = false;
    }

    @ObfuscatedName("by.s(Lgy;B)V")
    public final void method1031(class185 arg0) {
        arg0.field2514 = 0;
        int var2 = arg0.method3239();
        this.field809 = arg0.method3240();
        this.field810 = arg0.method3240();
        int var3 = -1;
        this.field829 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3239();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3239();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3241();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class268.method965(var4[var5] - 512).field3615;
                    if (var8 != 0) {
                        this.field829 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3239();
            if (var11 < 0 || var11 >= Statics.field238[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1138 = arg0.method3241();
        if (this.field1138 == 65535) {
            this.field1138 = -1;
        }
        this.field1121 = arg0.method3241();
        if (this.field1121 == 65535) {
            this.field1121 = -1;
        }
        this.field1122 = this.field1121;
        this.field1157 = arg0.method3241();
        if (this.field1157 == 65535) {
            this.field1157 = -1;
        }
        this.field1124 = arg0.method3241();
        if (this.field1124 == 65535) {
            this.field1124 = -1;
        }
        this.field1125 = arg0.method3241();
        if (this.field1125 == 65535) {
            this.field1125 = -1;
        }
        this.field1126 = arg0.method3241();
        if (this.field1126 == 65535) {
            this.field1126 = -1;
        }
        this.field1127 = arg0.method3241();
        if (this.field1127 == 65535) {
            this.field1127 = -1;
        }
        this.field819 = new class281(arg0.method3248(), Statics.field2740);
        this.method1033();
        this.method1062();
        if (Statics.field1754 == this) {
            Statics.field2118 = this.field819.method4922();
        }
        this.field812 = arg0.method3239();
        this.field807 = arg0.method3241();
        this.field827 = arg0.method3239() == 1;
        if (client.field1016 == 0 && client.field1084 >= 2) {
            this.field827 = false;
        }
        if (this.field820 == null) {
            this.field820 = new class225();
        }
        this.field820.method4069(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("by.g(S)Z")
    public boolean method1032() {
        if (class279.field3717 == this.field830) {
            this.method1055();
        }
        return class279.field3719 == this.field830;
    }

    @ObfuscatedName("by.m(I)V")
    public void method1033() {
        this.field830 = class279.field3717;
    }

    @ObfuscatedName("by.h(I)V")
    public void method1055() {
        this.field830 = Statics.field473.field1212.method4863(this.field819) ? class279.field3719 : class279.field3718;
    }

    @ObfuscatedName("by.i(B)Z")
    public boolean method1036() {
        if (class279.field3717 == this.field831) {
            this.method1037();
        }
        return class279.field3719 == this.field831;
    }

    @ObfuscatedName("by.w(I)V")
    public void method1062() {
        this.field831 = class279.field3717;
    }

    @ObfuscatedName("by.t(I)V")
    public void method1037() {
        this.field831 = Statics.field334 != null && Statics.field334.method4863(this.field819) ? class279.field3719 : class279.field3718;
    }

    @ObfuscatedName("by.d(I)I")
    public int method1038() {
        return this.field820 == null || this.field820.field2725 == -1 ? 1 : class270.method4416(this.field820.field2725).field3634;
    }

    @ObfuscatedName("by.z(I)Les;")
    public final class131 method1039() {
        if (this.field820 == null) {
            return null;
        }
        class272 var1 = this.field1147 != -1 && this.field1115 == 0 ? class272.method4180(this.field1147) : null;
        class272 var2 = this.field1144 == -1 || this.field825 || this.field1144 == this.field1138 && var1 != null ? null : class272.method4180(this.field1144);
        class131 var3 = this.field820.method4075(var1, this.field1171, var2, this.field1145);
        if (var3 == null) {
            return null;
        }
        var3.method2578();
        this.field1165 = var3.field2001;
        if (!this.field825 && this.field1152 != -1 && this.field1153 != -1) {
            class131 var4 = class257.method3116(this.field1152).method4406(this.field1153);
            if (var4 != null) {
                var4.method2586(0, -this.field1169, 0);
                class131[] var5 = new class131[] { var3, var4 };
                var3 = new class131(var5, 2);
            }
        }
        if (!this.field825 && this.field826 != null) {
            if (client.field1036 >= this.field824) {
                this.field826 = null;
            }
            if (client.field1036 >= this.field815 && client.field1036 < this.field824) {
                class131 var6 = this.field826;
                var6.method2586(this.field817 - this.field1129, this.field818 - this.field814, this.field808 - this.field1116);
                if (this.field1148 == 512) {
                    var6.method2534();
                    var6.method2534();
                    var6.method2534();
                } else if (this.field1148 == 1024) {
                    var6.method2534();
                    var6.method2534();
                } else if (this.field1148 == 1536) {
                    var6.method2534();
                }
                class131[] var7 = new class131[] { var3, var6 };
                var3 = new class131(var7, 2);
                if (this.field1148 == 512) {
                    var6.method2534();
                } else if (this.field1148 == 1024) {
                    var6.method2534();
                    var6.method2534();
                } else if (this.field1148 == 1536) {
                    var6.method2534();
                    var6.method2534();
                    var6.method2534();
                }
                var6.method2586(this.field1129 - this.field817, this.field814 - this.field818, this.field1116 - this.field808);
            }
        }
        var3.field1870 = true;
        return var3;
    }

    @ObfuscatedName("by.k(IIBI)V")
    public final void method1040(int arg0, int arg1, byte arg2) {
        if (this.field1147 != -1 && class272.method4180(this.field1147).field3694 == 1) {
            this.field1147 = -1;
        }
        this.field1143 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1034(arg0, arg1);
        } else if (this.field1170[0] >= 0 && this.field1170[0] < 104 && this.field1174[0] >= 0 && this.field1174[0] < 104) {
            if (arg2 == 2) {
                class72 var4 = this;
                int var5 = this.field1170[0];
                int var6 = this.field1174[0];
                int var7 = this.method1038();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class168.method2919(var5, var6, this.method1038(), client.method4403(arg0, arg1), client.field896[this.field828], true, client.field1096, client.field1097);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method1042(client.field1096[var9], client.field1097[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method1042(arg0, arg1, arg2);
        } else {
            this.method1034(arg0, arg1);
        }
    }

    @ObfuscatedName("by.c(III)V")
    public void method1034(int arg0, int arg1) {
        this.field1123 = 0;
        this.field1162 = 0;
        this.field1173 = 0;
        this.field1170[0] = arg0;
        this.field1174[0] = arg1;
        int var3 = this.method1038();
        this.field1129 = this.field1170[0] * 128 + var3 * 64;
        this.field1116 = this.field1174[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("by.o(IIBI)V")
    public final void method1042(int arg0, int arg1, byte arg2) {
        if (this.field1123 < 9) {
            this.field1123++;
        }
        for (int var4 = this.field1123; var4 > 0; var4--) {
            this.field1170[var4] = this.field1170[var4 - 1];
            this.field1174[var4] = this.field1174[var4 - 1];
            this.field1166[var4] = this.field1166[var4 - 1];
        }
        this.field1170[0] = arg0;
        this.field1174[0] = arg1;
        this.field1166[0] = arg2;
    }

    @ObfuscatedName("by.l(B)Z")
    public final boolean method1046() {
        return this.field820 != null;
    }
}
