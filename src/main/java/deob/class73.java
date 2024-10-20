package deob;

@ObfuscatedName("bd")
public final class class73 extends class76 {

    @ObfuscatedName("bd.d")
    public class306 field848;

    @ObfuscatedName("bd.z")
    public class240 field824;

    @ObfuscatedName("bd.n")
    public int field825 = -1;

    @ObfuscatedName("bd.r")
    public int field826 = -1;

    @ObfuscatedName("bd.y")
    public String[] field828 = new String[3];

    @ObfuscatedName("bd.k")
    public int field829;

    @ObfuscatedName("bd.s")
    public int field830;

    @ObfuscatedName("bd.p")
    public int field840;

    @ObfuscatedName("bd.x")
    public int field832;

    @ObfuscatedName("bd.m")
    public int field823;

    @ObfuscatedName("bd.h")
    public int field831;

    @ObfuscatedName("bd.t")
    public int field838;

    @ObfuscatedName("bd.i")
    public int field836;

    @ObfuscatedName("bd.u")
    public class132 field837;

    @ObfuscatedName("bd.q")
    public int field833;

    @ObfuscatedName("bd.v")
    public int field839;

    @ObfuscatedName("bd.f")
    public int field847;

    @ObfuscatedName("bd.b")
    public int field835;

    @ObfuscatedName("bd.c")
    public boolean field842;

    @ObfuscatedName("bd.j")
    public int field843;

    @ObfuscatedName("bd.l")
    public boolean field844;

    @ObfuscatedName("bd.g")
    public int field845;

    @ObfuscatedName("bd.w")
    public int field846;

    @ObfuscatedName("bd.o")
    public class304 field850;

    @ObfuscatedName("bd.a")
    public class304 field849;

    @ObfuscatedName("bd.ak")
    public boolean field841;

    @ObfuscatedName("bd.ap")
    public int field827;

    @ObfuscatedName("bd.ac")
    public int field851;

    public class73() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field828[var1] = "";
        }
        this.field829 = 0;
        this.field830 = 0;
        this.field832 = 0;
        this.field823 = 0;
        this.field842 = false;
        this.field843 = 0;
        this.field844 = false;
        this.field850 = class304.field3845;
        this.field849 = class304.field3845;
        this.field841 = false;
    }

    @ObfuscatedName("bd.d(Lgy;I)V")
    public final void method1036(class195 arg0) {
        arg0.field2568 = 0;
        int var2 = arg0.method3330();
        this.field825 = arg0.method3421();
        this.field826 = arg0.method3421();
        int var3 = -1;
        this.field843 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3330();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3330();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3269();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class284.method4245(var4[var5] - 512).field3688;
                    if (var8 != 0) {
                        this.field843 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3330();
            if (var11 < 0 || var11 >= Statics.field2777[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1181 = arg0.method3269();
        if (this.field1181 == 65535) {
            this.field1181 = -1;
        }
        this.field1146 = arg0.method3269();
        if (this.field1146 == 65535) {
            this.field1146 = -1;
        }
        this.field1149 = this.field1146;
        this.field1164 = arg0.method3269();
        if (this.field1164 == 65535) {
            this.field1164 = -1;
        }
        this.field1140 = arg0.method3269();
        if (this.field1140 == 65535) {
            this.field1140 = -1;
        }
        this.field1150 = arg0.method3269();
        if (this.field1150 == 65535) {
            this.field1150 = -1;
        }
        this.field1148 = arg0.method3269();
        if (this.field1148 == 65535) {
            this.field1148 = -1;
        }
        this.field1152 = arg0.method3269();
        if (this.field1152 == 65535) {
            this.field1152 = -1;
        }
        this.field848 = new class306(arg0.method3268(), Statics.field347);
        this.method1038();
        this.method1041();
        if (Statics.field302 == this) {
            Statics.field2173 = this.field848.method5095();
        }
        this.field829 = arg0.method3330();
        this.field830 = arg0.method3269();
        this.field844 = arg0.method3330() == 1;
        if (client.field860 == 0 && client.field1018 >= 2) {
            this.field844 = false;
        }
        if (this.field824 == null) {
            this.field824 = new class240();
        }
        this.field824.method4126(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bd.z(I)Z")
    public boolean method1037() {
        if (class304.field3845 == this.field850) {
            this.method1065();
        }
        return class304.field3843 == this.field850;
    }

    @ObfuscatedName("bd.n(I)V")
    public void method1038() {
        this.field850 = class304.field3845;
    }

    @ObfuscatedName("bd.r(I)V")
    public void method1065() {
        this.field850 = Statics.field1319.method1588(this.field848) ? class304.field3843 : class304.field3844;
    }

    @ObfuscatedName("bd.e(S)Z")
    public boolean method1064() {
        if (class304.field3845 == this.field849) {
            this.method1042();
        }
        return class304.field3843 == this.field849;
    }

    @ObfuscatedName("bd.y(I)V")
    public void method1041() {
        this.field849 = class304.field3845;
    }

    @ObfuscatedName("bd.k(I)V")
    public void method1042() {
        this.field849 = Statics.field785 != null && Statics.field785.method5002(this.field848) ? class304.field3843 : class304.field3844;
    }

    @ObfuscatedName("bd.s(I)I")
    public int method1077() {
        return this.field824 == null || this.field824.field2800 == -1 ? 1 : class286.method4254(this.field824.field2800).field3710;
    }

    @ObfuscatedName("bd.x(I)Lel;")
    public final class132 method1067() {
        if (this.field824 == null) {
            return null;
        }
        class288 var1 = this.field1172 != -1 && this.field1175 == 0 ? class288.method4510(this.field1172) : null;
        class288 var2 = this.field1169 == -1 || this.field842 || this.field1181 == this.field1169 && var1 != null ? null : class288.method4510(this.field1169);
        class132 var3 = this.field824.method4131(var1, this.field1173, var2, this.field1170);
        if (var3 == null) {
            return null;
        }
        var3.method2592();
        this.field1190 = var3.field2027;
        if (!this.field842 && this.field1177 != -1 && this.field1178 != -1) {
            class132 var4 = class273.method698(this.field1177).method4528(this.field1178);
            if (var4 != null) {
                var4.method2558(0, -this.field1158, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (!this.field842 && this.field837 != null) {
            if (client.field866 >= this.field823) {
                this.field837 = null;
            }
            if (client.field866 >= this.field832 && client.field866 < this.field823) {
                class132 var6 = this.field837;
                var6.method2558(this.field831 - this.field1186, this.field838 - this.field840, this.field836 - this.field1151);
                if (this.field1191 == 512) {
                    var6.method2559();
                    var6.method2559();
                    var6.method2559();
                } else if (this.field1191 == 1024) {
                    var6.method2559();
                    var6.method2559();
                } else if (this.field1191 == 1536) {
                    var6.method2559();
                }
                class132[] var7 = new class132[] { var3, var6 };
                var3 = new class132(var7, 2);
                if (this.field1191 == 512) {
                    var6.method2559();
                } else if (this.field1191 == 1024) {
                    var6.method2559();
                    var6.method2559();
                } else if (this.field1191 == 1536) {
                    var6.method2559();
                    var6.method2559();
                    var6.method2559();
                }
                var6.method2558(this.field1186 - this.field831, this.field840 - this.field838, this.field1151 - this.field836);
            }
        }
        var3.field1860 = true;
        return var3;
    }

    @ObfuscatedName("bd.h(IIBI)V")
    public final void method1045(int arg0, int arg1, byte arg2) {
        if (this.field1172 != -1 && class288.method4510(this.field1172).field3768 == 1) {
            this.field1172 = -1;
        }
        this.field1143 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1046(arg0, arg1);
        } else if (this.field1195[0] >= 0 && this.field1195[0] < 104 && this.field1196[0] >= 0 && this.field1196[0] < 104) {
            if (arg2 == 2) {
                client.method3221(this, arg0, arg1, (byte) 2);
            }
            this.method1057(arg0, arg1, arg2);
        } else {
            this.method1046(arg0, arg1);
        }
    }

    @ObfuscatedName("bd.t(III)V")
    public void method1046(int arg0, int arg1) {
        this.field1193 = 0;
        this.field1199 = 0;
        this.field1198 = 0;
        this.field1195[0] = arg0;
        this.field1196[0] = arg1;
        int var3 = this.method1077();
        this.field1186 = this.field1195[0] * 128 + var3 * 64;
        this.field1151 = this.field1196[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bd.i(IIBI)V")
    public final void method1057(int arg0, int arg1, byte arg2) {
        if (this.field1193 < 9) {
            this.field1193++;
        }
        for (int var4 = this.field1193; var4 > 0; var4--) {
            this.field1195[var4] = this.field1195[var4 - 1];
            this.field1196[var4] = this.field1196[var4 - 1];
            this.field1160[var4] = this.field1160[var4 - 1];
        }
        this.field1195[0] = arg0;
        this.field1196[0] = arg1;
        this.field1160[0] = arg2;
    }

    @ObfuscatedName("bd.u(I)Z")
    public final boolean method1048() {
        return this.field824 != null;
    }
}
