package deob;

@ObfuscatedName("bd")
public final class class74 extends class78 {

    @ObfuscatedName("bd.b")
    public String field823;

    @ObfuscatedName("bd.s")
    public class221 field816;

    @ObfuscatedName("bd.r")
    public int field826 = -1;

    @ObfuscatedName("bd.g")
    public int field818 = -1;

    @ObfuscatedName("bd.f")
    public String[] field837 = new String[3];

    @ObfuscatedName("bd.u")
    public int field820;

    @ObfuscatedName("bd.t")
    public int field815;

    @ObfuscatedName("bd.k")
    public int field822;

    @ObfuscatedName("bd.n")
    public int field840;

    @ObfuscatedName("bd.d")
    public int field838;

    @ObfuscatedName("bd.o")
    public int field825;

    @ObfuscatedName("bd.a")
    public int field824;

    @ObfuscatedName("bd.q")
    public int field827;

    @ObfuscatedName("bd.j")
    public class133 field828;

    @ObfuscatedName("bd.m")
    public int field829;

    @ObfuscatedName("bd.h")
    public int field830;

    @ObfuscatedName("bd.c")
    public int field831;

    @ObfuscatedName("bd.y")
    public int field832;

    @ObfuscatedName("bd.p")
    public boolean field833;

    @ObfuscatedName("bd.i")
    public int field817;

    @ObfuscatedName("bd.l")
    public boolean field821;

    @ObfuscatedName("bd.z")
    public int field836;

    @ObfuscatedName("bd.e")
    public int field835;

    @ObfuscatedName("bd.v")
    public boolean field819;

    @ObfuscatedName("bd.w")
    public int field839;

    @ObfuscatedName("bd.av")
    public int field834;

    public class74() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field837[var1] = "";
        }
        this.field820 = 0;
        this.field815 = 0;
        this.field840 = 0;
        this.field838 = 0;
        this.field833 = false;
        this.field817 = 0;
        this.field821 = false;
        this.field819 = false;
    }

    @ObfuscatedName("bd.b(Lfs;I)V")
    public final void method1009(class181 arg0) {
        arg0.field2488 = 0;
        int var2 = arg0.method2945();
        this.field826 = arg0.method2946();
        this.field818 = arg0.method2946();
        int var3 = -1;
        this.field817 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2945();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2945();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3081();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class264.method2662(var4[var5] - 512).field3588;
                    if (var8 != 0) {
                        this.field817 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2945();
            if (var11 < 0 || var11 >= Statics.field2693[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1150 = arg0.method3081();
        if (this.field1150 == 65535) {
            this.field1150 = -1;
        }
        this.field1151 = arg0.method3081();
        if (this.field1151 == 65535) {
            this.field1151 = -1;
        }
        this.field1172 = this.field1151;
        this.field1153 = arg0.method3081();
        if (this.field1153 == 65535) {
            this.field1153 = -1;
        }
        this.field1154 = arg0.method3081();
        if (this.field1154 == 65535) {
            this.field1154 = -1;
        }
        this.field1155 = arg0.method3081();
        if (this.field1155 == 65535) {
            this.field1155 = -1;
        }
        this.field1156 = arg0.method3081();
        if (this.field1156 == 65535) {
            this.field1156 = -1;
        }
        this.field1167 = arg0.method3081();
        if (this.field1167 == 65535) {
            this.field1167 = -1;
        }
        this.field823 = arg0.method2953();
        if (Statics.field3721 == this) {
            Statics.field3422 = this.field823;
        }
        this.field820 = arg0.method2945();
        this.field815 = arg0.method3081();
        this.field821 = arg0.method2945() == 1;
        if (client.field900 == 0 && client.field1015 >= 2) {
            this.field821 = false;
        }
        if (this.field816 == null) {
            this.field816 = new class221();
        }
        this.field816.method3701(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bd.s(S)I")
    public int method990() {
        return this.field816 == null || this.field816.field2691 == -1 ? 1 : class266.method3591(this.field816.field2691).field3607;
    }

    @ObfuscatedName("bd.r(I)Lev;")
    public final class133 method983() {
        if (this.field816 == null) {
            return null;
        }
        class268 var1 = this.field1158 != -1 && this.field1180 == 0 ? class268.method1560(this.field1158) : null;
        class268 var2 = this.field1174 == -1 || this.field833 || this.field1174 == this.field1150 && var1 != null ? null : class268.method1560(this.field1174);
        class133 var3 = this.field816.method3718(var1, this.field1178, var2, this.field1181);
        if (var3 == null) {
            return null;
        }
        var3.method2312();
        this.field1152 = var3.field2023;
        if (!this.field833 && this.field1182 != -1 && this.field1191 != -1) {
            class133 var4 = class253.method3933(this.field1182).method4018(this.field1191);
            if (var4 != null) {
                var4.method2324(0, -this.field1186, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (!this.field833 && this.field828 != null) {
            if (client.field872 >= this.field838) {
                this.field828 = null;
            }
            if (client.field872 >= this.field840 && client.field872 < this.field838) {
                class133 var6 = this.field828;
                var6.method2324(this.field825 - this.field1195, this.field824 - this.field822, this.field827 - this.field1157);
                if (this.field1183 == 512) {
                    var6.method2319();
                    var6.method2319();
                    var6.method2319();
                } else if (this.field1183 == 1024) {
                    var6.method2319();
                    var6.method2319();
                } else if (this.field1183 == 1536) {
                    var6.method2319();
                }
                class133[] var7 = new class133[] { var3, var6 };
                var3 = new class133(var7, 2);
                if (this.field1183 == 512) {
                    var6.method2319();
                } else if (this.field1183 == 1024) {
                    var6.method2319();
                    var6.method2319();
                } else if (this.field1183 == 1536) {
                    var6.method2319();
                    var6.method2319();
                    var6.method2319();
                }
                var6.method2324(this.field1195 - this.field825, this.field822 - this.field824, this.field1157 - this.field827);
            }
        }
        var3.field1832 = true;
        return var3;
    }

    @ObfuscatedName("bd.g(IIBB)V")
    public final void method988(int arg0, int arg1, byte arg2) {
        if (this.field1158 != -1 && class268.method1560(this.field1158).field3666 == 1) {
            this.field1158 = -1;
        }
        this.field1173 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method985(arg0, arg1);
        } else if (this.field1200[0] >= 0 && this.field1200[0] < 104 && this.field1201[0] >= 0 && this.field1201[0] < 104) {
            if (arg2 == 2) {
                client.method943(this, arg0, arg1, (byte) 2);
            }
            this.method986(arg0, arg1, arg2);
        } else {
            this.method985(arg0, arg1);
        }
    }

    @ObfuscatedName("bd.x(IIB)V")
    public void method985(int arg0, int arg1) {
        this.field1199 = 0;
        this.field1204 = 0;
        this.field1203 = 0;
        this.field1200[0] = arg0;
        this.field1201[0] = arg1;
        int var3 = this.method990();
        this.field1195 = this.field1200[0] * 128 + var3 * 64;
        this.field1157 = this.field1201[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bd.f(IIBB)V")
    public final void method986(int arg0, int arg1, byte arg2) {
        if (this.field1199 < 9) {
            this.field1199++;
        }
        for (int var4 = this.field1199; var4 > 0; var4--) {
            this.field1200[var4] = this.field1200[var4 - 1];
            this.field1201[var4] = this.field1201[var4 - 1];
            this.field1190[var4] = this.field1190[var4 - 1];
        }
        this.field1200[0] = arg0;
        this.field1201[0] = arg1;
        this.field1190[0] = arg2;
    }

    @ObfuscatedName("bd.u(B)Z")
    public final boolean method987() {
        return this.field816 != null;
    }
}
