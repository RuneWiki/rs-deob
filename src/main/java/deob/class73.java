package deob;

@ObfuscatedName("bi")
public final class class73 extends class76 {

    @ObfuscatedName("bi.t")
    public class306 field820;

    @ObfuscatedName("bi.q")
    public class240 field836;

    @ObfuscatedName("bi.i")
    public int field817 = -1;

    @ObfuscatedName("bi.a")
    public int field818 = -1;

    @ObfuscatedName("bi.b")
    public String[] field831 = new String[3];

    @ObfuscatedName("bi.e")
    public int field833;

    @ObfuscatedName("bi.x")
    public int field828;

    @ObfuscatedName("bi.p")
    public int field823;

    @ObfuscatedName("bi.g")
    public int field824;

    @ObfuscatedName("bi.n")
    public int field825;

    @ObfuscatedName("bi.o")
    public int field826;

    @ObfuscatedName("bi.c")
    public int field827;

    @ObfuscatedName("bi.v")
    public int field841;

    @ObfuscatedName("bi.u")
    public class132 field829;

    @ObfuscatedName("bi.j")
    public int field816;

    @ObfuscatedName("bi.k")
    public int field815;

    @ObfuscatedName("bi.z")
    public int field830;

    @ObfuscatedName("bi.w")
    public int field842;

    @ObfuscatedName("bi.s")
    public boolean field834;

    @ObfuscatedName("bi.d")
    public int field835;

    @ObfuscatedName("bi.f")
    public boolean field843;

    @ObfuscatedName("bi.r")
    public int field837;

    @ObfuscatedName("bi.y")
    public int field838;

    @ObfuscatedName("bi.h")
    public class304 field839;

    @ObfuscatedName("bi.m")
    public class304 field840;

    @ObfuscatedName("bi.ay")
    public boolean field821;

    @ObfuscatedName("bi.ao")
    public int field822;

    @ObfuscatedName("bi.av")
    public int field832;

    public class73() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field831[var1] = "";
        }
        this.field833 = 0;
        this.field828 = 0;
        this.field824 = 0;
        this.field825 = 0;
        this.field834 = false;
        this.field835 = 0;
        this.field843 = false;
        this.field839 = class304.field3851;
        this.field840 = class304.field3851;
        this.field821 = false;
    }

    @ObfuscatedName("bi.t(Lgb;I)V")
    public final void method1115(class195 arg0) {
        arg0.field2545 = 0;
        int var2 = arg0.method3236();
        this.field817 = arg0.method3237();
        this.field818 = arg0.method3237();
        int var3 = -1;
        this.field835 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3236();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3236();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3238();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class284.method1694(var4[var5] - 512).field3683;
                    if (var8 != 0) {
                        this.field835 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3236();
            if (var11 < 0 || var11 >= Statics.field2789[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1181 = arg0.method3238();
        if (this.field1181 == 65535) {
            this.field1181 = -1;
        }
        this.field1144 = arg0.method3238();
        if (this.field1144 == 65535) {
            this.field1144 = -1;
        }
        this.field1165 = this.field1144;
        this.field1146 = arg0.method3238();
        if (this.field1146 == 65535) {
            this.field1146 = -1;
        }
        this.field1159 = arg0.method3238();
        if (this.field1159 == 65535) {
            this.field1159 = -1;
        }
        this.field1148 = arg0.method3238();
        if (this.field1148 == 65535) {
            this.field1148 = -1;
        }
        this.field1149 = arg0.method3238();
        if (this.field1149 == 65535) {
            this.field1149 = -1;
        }
        this.field1195 = arg0.method3238();
        if (this.field1195 == 65535) {
            this.field1195 = -1;
        }
        this.field820 = new class306(arg0.method3257(), Statics.field613);
        this.method1092();
        this.method1095();
        if (Statics.field434 == this) {
            Statics.field700 = this.field820.method5022();
        }
        this.field833 = arg0.method3236();
        this.field828 = arg0.method3238();
        this.field843 = arg0.method3236() == 1;
        if (client.field907 == 0 && client.field936 >= 2) {
            this.field843 = false;
        }
        if (this.field836 == null) {
            this.field836 = new class240();
        }
        this.field836.method4067(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bi.q(I)Z")
    public boolean method1127() {
        if (class304.field3851 == this.field839) {
            this.method1093();
        }
        return class304.field3847 == this.field839;
    }

    @ObfuscatedName("bi.i(B)V")
    public void method1092() {
        this.field839 = class304.field3851;
    }

    @ObfuscatedName("bi.a(I)V")
    public void method1093() {
        this.field839 = Statics.field2030.method1593(this.field820) ? class304.field3847 : class304.field3848;
    }

    @ObfuscatedName("bi.l(I)Z")
    public boolean method1094() {
        if (class304.field3851 == this.field840) {
            this.method1096();
        }
        return class304.field3847 == this.field840;
    }

    @ObfuscatedName("bi.b(I)V")
    public void method1095() {
        this.field840 = class304.field3851;
    }

    @ObfuscatedName("bi.e(B)V")
    public void method1096() {
        this.field840 = Statics.field616 != null && Statics.field616.method4973(this.field820) ? class304.field3847 : class304.field3848;
    }

    @ObfuscatedName("bi.x(B)I")
    public int method1129() {
        return this.field836 == null || this.field836.field2782 == -1 ? 1 : class286.method4012(this.field836.field2782).field3711;
    }

    @ObfuscatedName("bi.p(B)Lek;")
    public final class132 method1098() {
        if (this.field836 == null) {
            return null;
        }
        class288 var1 = this.field1170 != -1 && this.field1173 == 0 ? class288.method2932(this.field1170) : null;
        class288 var2 = this.field1172 == -1 || this.field834 || this.field1181 == this.field1172 && var1 != null ? null : class288.method2932(this.field1172);
        class132 var3 = this.field836.method4069(var1, this.field1171, var2, this.field1168);
        if (var3 == null) {
            return null;
        }
        var3.method2485();
        this.field1174 = var3.field2020;
        if (!this.field834 && this.field1190 != -1 && this.field1176 != -1) {
            class132 var4 = class273.method346(this.field1190).method4420(this.field1176);
            if (var4 != null) {
                var4.method2469(0, -this.field1179, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (!this.field834 && this.field829 != null) {
            if (client.field1108 >= this.field825) {
                this.field829 = null;
            }
            if (client.field1108 >= this.field824 && client.field1108 < this.field825) {
                class132 var6 = this.field829;
                var6.method2469(this.field826 - this.field1175, this.field827 - this.field823, this.field841 - this.field1138);
                if (this.field1155 == 512) {
                    var6.method2476();
                    var6.method2476();
                    var6.method2476();
                } else if (this.field1155 == 1024) {
                    var6.method2476();
                    var6.method2476();
                } else if (this.field1155 == 1536) {
                    var6.method2476();
                }
                class132[] var7 = new class132[] { var3, var6 };
                var3 = new class132(var7, 2);
                if (this.field1155 == 512) {
                    var6.method2476();
                } else if (this.field1155 == 1024) {
                    var6.method2476();
                    var6.method2476();
                } else if (this.field1155 == 1536) {
                    var6.method2476();
                    var6.method2476();
                    var6.method2476();
                }
                var6.method2469(this.field1175 - this.field826, this.field823 - this.field827, this.field1138 - this.field841);
            }
        }
        var3.field1850 = true;
        return var3;
    }

    @ObfuscatedName("bi.o(IIBI)V")
    public final void method1099(int arg0, int arg1, byte arg2) {
        if (this.field1170 != -1 && class288.method2932(this.field1170).field3772 == 1) {
            this.field1170 = -1;
        }
        this.field1143 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1103(arg0, arg1);
        } else if (this.field1193[0] >= 0 && this.field1193[0] < 104 && this.field1194[0] >= 0 && this.field1194[0] < 104) {
            if (arg2 == 2) {
                class73 var4 = this;
                int var5 = this.field1193[0];
                int var6 = this.field1194[0];
                int var7 = this.method1129();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class178.method2892(var5, var6, this.method1129(), client.method3175(arg0, arg1), client.field867[this.field837], true, client.field1119, client.field1120);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method1101(client.field1119[var9], client.field1120[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method1101(arg0, arg1, arg2);
        } else {
            this.method1103(arg0, arg1);
        }
    }

    @ObfuscatedName("bi.c(III)V")
    public void method1103(int arg0, int arg1) {
        this.field1192 = 0;
        this.field1197 = 0;
        this.field1196 = 0;
        this.field1193[0] = arg0;
        this.field1194[0] = arg1;
        int var3 = this.method1129();
        this.field1175 = this.field1193[0] * 128 + var3 * 64;
        this.field1138 = this.field1194[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bi.u(IIBI)V")
    public final void method1101(int arg0, int arg1, byte arg2) {
        if (this.field1192 < 9) {
            this.field1192++;
        }
        for (int var4 = this.field1192; var4 > 0; var4--) {
            this.field1193[var4] = this.field1193[var4 - 1];
            this.field1194[var4] = this.field1194[var4 - 1];
            this.field1180[var4] = this.field1180[var4 - 1];
        }
        this.field1193[0] = arg0;
        this.field1194[0] = arg1;
        this.field1180[0] = arg2;
    }

    @ObfuscatedName("bi.k(I)Z")
    public final boolean method1102() {
        return this.field836 != null;
    }
}
