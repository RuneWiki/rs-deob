package deob;

@ObfuscatedName("bz")
public final class class73 extends class76 {

    @ObfuscatedName("bz.o")
    public class306 field842;

    @ObfuscatedName("bz.k")
    public class240 field848;

    @ObfuscatedName("bz.t")
    public int field839 = -1;

    @ObfuscatedName("bz.d")
    public int field858 = -1;

    @ObfuscatedName("bz.m")
    public String[] field840 = new String[3];

    @ObfuscatedName("bz.z")
    public int field841;

    @ObfuscatedName("bz.i")
    public int field863;

    @ObfuscatedName("bz.u")
    public int field843;

    @ObfuscatedName("bz.x")
    public int field847;

    @ObfuscatedName("bz.y")
    public int field845;

    @ObfuscatedName("bz.a")
    public int field846;

    @ObfuscatedName("bz.w")
    public int field859;

    @ObfuscatedName("bz.n")
    public int field844;

    @ObfuscatedName("bz.l")
    public class132 field849;

    @ObfuscatedName("bz.s")
    public int field850;

    @ObfuscatedName("bz.v")
    public int field851;

    @ObfuscatedName("bz.q")
    public int field852;

    @ObfuscatedName("bz.r")
    public int field853;

    @ObfuscatedName("bz.j")
    public boolean field854;

    @ObfuscatedName("bz.b")
    public int field855;

    @ObfuscatedName("bz.g")
    public boolean field856;

    @ObfuscatedName("bz.f")
    public int field857;

    @ObfuscatedName("bz.p")
    public int field837;

    @ObfuscatedName("bz.e")
    public class304 field860;

    @ObfuscatedName("bz.c")
    public class304 field836;

    @ObfuscatedName("bz.ab")
    public boolean field861;

    @ObfuscatedName("bz.ap")
    public int field862;

    @ObfuscatedName("bz.ag")
    public int field838;

    public class73() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field840[var1] = "";
        }
        this.field841 = 0;
        this.field863 = 0;
        this.field847 = 0;
        this.field845 = 0;
        this.field854 = false;
        this.field855 = 0;
        this.field856 = false;
        this.field860 = class304.field3852;
        this.field836 = class304.field3852;
        this.field861 = false;
    }

    @ObfuscatedName("bz.o(Lgc;I)V")
    public final void method1077(class195 arg0) {
        arg0.field2575 = 0;
        int var2 = arg0.method3205();
        this.field839 = arg0.method3210();
        this.field858 = arg0.method3210();
        int var3 = -1;
        this.field855 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3205();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3205();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3207();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class284.method660(var4[var5] - 512).field3691;
                    if (var8 != 0) {
                        this.field855 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3205();
            if (var11 < 0 || var11 >= Statics.field2792[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1202 = arg0.method3207();
        if (this.field1202 == 65535) {
            this.field1202 = -1;
        }
        this.field1164 = arg0.method3207();
        if (this.field1164 == 65535) {
            this.field1164 = -1;
        }
        this.field1165 = this.field1164;
        this.field1166 = arg0.method3207();
        if (this.field1166 == 65535) {
            this.field1166 = -1;
        }
        this.field1210 = arg0.method3207();
        if (this.field1210 == 65535) {
            this.field1210 = -1;
        }
        this.field1168 = arg0.method3207();
        if (this.field1168 == 65535) {
            this.field1168 = -1;
        }
        this.field1178 = arg0.method3207();
        if (this.field1178 == 65535) {
            this.field1178 = -1;
        }
        this.field1170 = arg0.method3207();
        if (this.field1170 == 65535) {
            this.field1170 = -1;
        }
        this.field842 = new class306(arg0.method3284(), Statics.field2519);
        this.method1075();
        this.method1078();
        if (Statics.field642 == this) {
            Statics.field2195 = this.field842.method5015();
        }
        this.field841 = arg0.method3205();
        this.field863 = arg0.method3207();
        this.field856 = arg0.method3205() == 1;
        if (client.field873 == 0 && client.field1102 >= 2) {
            this.field856 = false;
        }
        if (this.field848 == null) {
            this.field848 = new class240();
        }
        this.field848.method4035(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bz.k(I)Z")
    public boolean method1108() {
        if (class304.field3852 == this.field860) {
            this.method1076();
        }
        return class304.field3851 == this.field860;
    }

    @ObfuscatedName("bz.t(B)V")
    public void method1075() {
        this.field860 = class304.field3852;
    }

    @ObfuscatedName("bz.d(I)V")
    public void method1076() {
        this.field860 = Statics.field426.method1631(this.field842) ? class304.field3851 : class304.field3850;
    }

    @ObfuscatedName("bz.h(B)Z")
    public boolean method1090() {
        if (class304.field3852 == this.field836) {
            this.method1093();
        }
        return class304.field3851 == this.field836;
    }

    @ObfuscatedName("bz.m(I)V")
    public void method1078() {
        this.field836 = class304.field3852;
    }

    @ObfuscatedName("bz.z(B)V")
    public void method1093() {
        this.field836 = Statics.field696 != null && Statics.field696.method4918(this.field842) ? class304.field3851 : class304.field3850;
    }

    @ObfuscatedName("bz.i(I)I")
    public int method1080() {
        return this.field848 == null || this.field848.field2789 == -1 ? 1 : class286.method3973(this.field848.field2789).field3721;
    }

    @ObfuscatedName("bz.u(I)Lei;")
    public final class132 method1081() {
        if (this.field848 == null) {
            return null;
        }
        class288 var1 = this.field1190 != -1 && this.field1192 == 0 ? class288.method1535(this.field1190) : null;
        class288 var2 = this.field1187 == -1 || this.field854 || this.field1202 == this.field1187 && var1 != null ? null : class288.method1535(this.field1187);
        class132 var3 = this.field848.method4022(var1, this.field1191, var2, this.field1163);
        if (var3 == null) {
            return null;
        }
        var3.method2512();
        this.field1208 = var3.field2054;
        if (!this.field854 && this.field1195 != -1 && this.field1196 != -1) {
            class132 var4 = class273.method1734(this.field1195).method4416(this.field1196);
            if (var4 != null) {
                var4.method2475(0, -this.field1199, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (!this.field854 && this.field849 != null) {
            if (client.field929 >= this.field845) {
                this.field849 = null;
            }
            if (client.field929 >= this.field847 && client.field929 < this.field845) {
                class132 var6 = this.field849;
                var6.method2475(this.field846 - this.field1211, this.field859 - this.field843, this.field844 - this.field1188);
                if (this.field1209 == 512) {
                    var6.method2471();
                    var6.method2471();
                    var6.method2471();
                } else if (this.field1209 == 1024) {
                    var6.method2471();
                    var6.method2471();
                } else if (this.field1209 == 1536) {
                    var6.method2471();
                }
                class132[] var7 = new class132[] { var3, var6 };
                var3 = new class132(var7, 2);
                if (this.field1209 == 512) {
                    var6.method2471();
                } else if (this.field1209 == 1024) {
                    var6.method2471();
                    var6.method2471();
                } else if (this.field1209 == 1536) {
                    var6.method2471();
                    var6.method2471();
                    var6.method2471();
                }
                var6.method2475(this.field1211 - this.field846, this.field843 - this.field859, this.field1188 - this.field844);
            }
        }
        var3.field1875 = true;
        return var3;
    }

    @ObfuscatedName("bz.x(IIBI)V")
    public final void method1082(int arg0, int arg1, byte arg2) {
        if (this.field1190 != -1 && class288.method1535(this.field1190).field3770 == 1) {
            this.field1190 = -1;
        }
        this.field1186 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1083(arg0, arg1);
        } else if (this.field1213[0] >= 0 && this.field1213[0] < 104 && this.field1214[0] >= 0 && this.field1214[0] < 104) {
            if (arg2 == 2) {
                client.method10(this, arg0, arg1, (byte) 2);
            }
            this.method1073(arg0, arg1, arg2);
        } else {
            this.method1083(arg0, arg1);
        }
    }

    @ObfuscatedName("bz.y(III)V")
    public void method1083(int arg0, int arg1) {
        this.field1212 = 0;
        this.field1217 = 0;
        this.field1159 = 0;
        this.field1213[0] = arg0;
        this.field1214[0] = arg1;
        int var3 = this.method1080();
        this.field1211 = this.field1213[0] * 128 + var3 * 64;
        this.field1188 = this.field1214[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bz.a(IIBI)V")
    public final void method1073(int arg0, int arg1, byte arg2) {
        if (this.field1212 < 9) {
            this.field1212++;
        }
        for (int var4 = this.field1212; var4 > 0; var4--) {
            this.field1213[var4] = this.field1213[var4 - 1];
            this.field1214[var4] = this.field1214[var4 - 1];
            this.field1215[var4] = this.field1215[var4 - 1];
        }
        this.field1213[0] = arg0;
        this.field1214[0] = arg1;
        this.field1215[0] = arg2;
    }

    @ObfuscatedName("bz.v(I)Z")
    public final boolean method1084() {
        return this.field848 != null;
    }
}
