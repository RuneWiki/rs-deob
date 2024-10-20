package deob;

@ObfuscatedName("bx")
public final class class73 extends class76 {

    @ObfuscatedName("bx.c")
    public class306 field824;

    @ObfuscatedName("bx.i")
    public class240 field821;

    @ObfuscatedName("bx.o")
    public int field823 = -1;

    @ObfuscatedName("bx.j")
    public int field831 = -1;

    @ObfuscatedName("bx.x")
    public String[] field826 = new String[3];

    @ObfuscatedName("bx.z")
    public int field833;

    @ObfuscatedName("bx.p")
    public int field828;

    @ObfuscatedName("bx.w")
    public int field829;

    @ObfuscatedName("bx.r")
    public int field845;

    @ObfuscatedName("bx.d")
    public int field830;

    @ObfuscatedName("bx.a")
    public int field832;

    @ObfuscatedName("bx.e")
    public int field822;

    @ObfuscatedName("bx.f")
    public int field834;

    @ObfuscatedName("bx.l")
    public class132 field835;

    @ObfuscatedName("bx.m")
    public int field836;

    @ObfuscatedName("bx.b")
    public int field827;

    @ObfuscatedName("bx.h")
    public int field849;

    @ObfuscatedName("bx.t")
    public int field839;

    @ObfuscatedName("bx.v")
    public boolean field840;

    @ObfuscatedName("bx.n")
    public int field841;

    @ObfuscatedName("bx.u")
    public boolean field837;

    @ObfuscatedName("bx.q")
    public int field843;

    @ObfuscatedName("bx.g")
    public int field844;

    @ObfuscatedName("bx.y")
    public class304 field842;

    @ObfuscatedName("bx.s")
    public class304 field846;

    @ObfuscatedName("bx.ac")
    public boolean field838;

    @ObfuscatedName("bx.ap")
    public int field848;

    @ObfuscatedName("bx.al")
    public int field847;

    public class73() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field826[var1] = "";
        }
        this.field833 = 0;
        this.field828 = 0;
        this.field845 = 0;
        this.field830 = 0;
        this.field840 = false;
        this.field841 = 0;
        this.field837 = false;
        this.field842 = class304.field3843;
        this.field846 = class304.field3843;
        this.field838 = false;
    }

    @ObfuscatedName("bx.c(Lgp;I)V")
    public final void method1035(class195 arg0) {
        arg0.field2566 = 0;
        int var2 = arg0.method3429();
        this.field823 = arg0.method3226();
        this.field831 = arg0.method3226();
        int var3 = -1;
        this.field841 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3429();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3429();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3218();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class284.method2869(var4[var5] - 512).field3683;
                    if (var8 != 0) {
                        this.field841 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3429();
            if (var11 < 0 || var11 >= Statics.field630[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1156 = arg0.method3218();
        if (this.field1156 == 65535) {
            this.field1156 = -1;
        }
        this.field1196 = arg0.method3218();
        if (this.field1196 == 65535) {
            this.field1196 = -1;
        }
        this.field1158 = this.field1196;
        this.field1159 = arg0.method3218();
        if (this.field1159 == 65535) {
            this.field1159 = -1;
        }
        this.field1173 = arg0.method3218();
        if (this.field1173 == 65535) {
            this.field1173 = -1;
        }
        this.field1161 = arg0.method3218();
        if (this.field1161 == 65535) {
            this.field1161 = -1;
        }
        this.field1162 = arg0.method3218();
        if (this.field1162 == 65535) {
            this.field1162 = -1;
        }
        this.field1163 = arg0.method3218();
        if (this.field1163 == 65535) {
            this.field1163 = -1;
        }
        this.field824 = new class306(arg0.method3427(), Statics.field1108);
        this.method1061();
        this.method1040();
        if (Statics.field260 == this) {
            Statics.field2177 = this.field824.method5038();
        }
        this.field833 = arg0.method3429();
        this.field828 = arg0.method3218();
        this.field837 = arg0.method3429() == 1;
        if (client.field956 == 0 && client.field1024 >= 2) {
            this.field837 = false;
        }
        if (this.field821 == null) {
            this.field821 = new class240();
        }
        this.field821.method4062(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bx.i(I)Z")
    public boolean method1036() {
        if (class304.field3843 == this.field842) {
            this.method1038();
        }
        return class304.field3842 == this.field842;
    }

    @ObfuscatedName("bx.o(I)V")
    public void method1061() {
        this.field842 = class304.field3843;
    }

    @ObfuscatedName("bx.j(I)V")
    public void method1038() {
        this.field842 = Statics.field2183.method1534(this.field824) ? class304.field3842 : class304.field3844;
    }

    @ObfuscatedName("bx.k(I)Z")
    public boolean method1039() {
        if (class304.field3843 == this.field846) {
            this.method1041();
        }
        return class304.field3842 == this.field846;
    }

    @ObfuscatedName("bx.x(B)V")
    public void method1040() {
        this.field846 = class304.field3843;
    }

    @ObfuscatedName("bx.z(B)V")
    public void method1041() {
        this.field846 = Statics.field444 != null && Statics.field444.method4940(this.field824) ? class304.field3842 : class304.field3844;
    }

    @ObfuscatedName("bx.p(I)I")
    public int method1063() {
        return this.field821 == null || this.field821.field2784 == -1 ? 1 : class286.method995(this.field821.field2784).field3703;
    }

    @ObfuscatedName("bx.w(B)Led;")
    public final class132 method1043() {
        if (this.field821 == null) {
            return null;
        }
        class288 var1 = this.field1183 != -1 && this.field1165 == 0 ? class288.method3535(this.field1183) : null;
        class288 var2 = this.field1174 == -1 || this.field840 || this.field1174 == this.field1156 && var1 != null ? null : class288.method3535(this.field1174);
        class132 var3 = this.field821.method4067(var1, this.field1184, var2, this.field1181);
        if (var3 == null) {
            return null;
        }
        var3.method2475();
        this.field1201 = var3.field2043;
        if (!this.field840 && this.field1188 != -1 && this.field1160 != -1) {
            class132 var4 = class273.method4166(this.field1188).method4422(this.field1160);
            if (var4 != null) {
                var4.method2486(0, -this.field1192, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (!this.field840 && this.field835 != null) {
            if (client.field867 >= this.field830) {
                this.field835 = null;
            }
            if (client.field867 >= this.field845 && client.field867 < this.field830) {
                class132 var6 = this.field835;
                var6.method2486(this.field832 - this.field1186, this.field822 - this.field829, this.field834 - this.field1210);
                if (this.field1202 == 512) {
                    var6.method2482();
                    var6.method2482();
                    var6.method2482();
                } else if (this.field1202 == 1024) {
                    var6.method2482();
                    var6.method2482();
                } else if (this.field1202 == 1536) {
                    var6.method2482();
                }
                class132[] var7 = new class132[] { var3, var6 };
                var3 = new class132(var7, 2);
                if (this.field1202 == 512) {
                    var6.method2482();
                } else if (this.field1202 == 1024) {
                    var6.method2482();
                    var6.method2482();
                } else if (this.field1202 == 1536) {
                    var6.method2482();
                    var6.method2482();
                    var6.method2482();
                }
                var6.method2486(this.field1186 - this.field832, this.field829 - this.field822, this.field1210 - this.field834);
            }
        }
        var3.field1851 = true;
        return var3;
    }

    @ObfuscatedName("bx.r(IIBB)V")
    public final void method1044(int arg0, int arg1, byte arg2) {
        if (this.field1183 != -1 && class288.method3535(this.field1183).field3763 == 1) {
            this.field1183 = -1;
        }
        this.field1166 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1054(arg0, arg1);
        } else if (this.field1189[0] >= 0 && this.field1189[0] < 104 && this.field1207[0] >= 0 && this.field1207[0] < 104) {
            if (arg2 == 2) {
                class73 var4 = this;
                int var5 = this.field1189[0];
                int var6 = this.field1207[0];
                int var7 = this.method1063();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class178.method134(var5, var6, this.method1063(), client.method546(arg0, arg1), client.field1048[this.field843], true, client.field1129, client.field967);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method1062(client.field1129[var9], client.field967[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method1062(arg0, arg1, arg2);
        } else {
            this.method1054(arg0, arg1);
        }
    }

    @ObfuscatedName("bx.d(III)V")
    public void method1054(int arg0, int arg1) {
        this.field1205 = 0;
        this.field1195 = 0;
        this.field1209 = 0;
        this.field1189[0] = arg0;
        this.field1207[0] = arg1;
        int var3 = this.method1063();
        this.field1186 = this.field1189[0] * 128 + var3 * 64;
        this.field1210 = this.field1207[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bx.a(IIBB)V")
    public final void method1062(int arg0, int arg1, byte arg2) {
        if (this.field1205 < 9) {
            this.field1205++;
        }
        for (int var4 = this.field1205; var4 > 0; var4--) {
            this.field1189[var4] = this.field1189[var4 - 1];
            this.field1207[var4] = this.field1207[var4 - 1];
            this.field1177[var4] = this.field1177[var4 - 1];
        }
        this.field1189[0] = arg0;
        this.field1207[0] = arg1;
        this.field1177[0] = arg2;
    }

    @ObfuscatedName("bx.b(I)Z")
    public final boolean method1052() {
        return this.field821 != null;
    }
}
