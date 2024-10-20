package deob;

@ObfuscatedName("bq")
public final class class74 extends class78 {

    @ObfuscatedName("bq.m")
    public String field852;

    @ObfuscatedName("bq.p")
    public class221 field833;

    @ObfuscatedName("bq.i")
    public int field857 = -1;

    @ObfuscatedName("bq.j")
    public int field843 = -1;

    @ObfuscatedName("bq.x")
    public String[] field834 = new String[3];

    @ObfuscatedName("bq.e")
    public int field836;

    @ObfuscatedName("bq.l")
    public int field838;

    @ObfuscatedName("bq.b")
    public int field832;

    @ObfuscatedName("bq.n")
    public int field840;

    @ObfuscatedName("bq.c")
    public int field841;

    @ObfuscatedName("bq.a")
    public int field847;

    @ObfuscatedName("bq.y")
    public int field842;

    @ObfuscatedName("bq.w")
    public int field839;

    @ObfuscatedName("bq.k")
    public class133 field835;

    @ObfuscatedName("bq.t")
    public int field846;

    @ObfuscatedName("bq.h")
    public int field837;

    @ObfuscatedName("bq.u")
    public int field848;

    @ObfuscatedName("bq.r")
    public int field849;

    @ObfuscatedName("bq.g")
    public boolean field850;

    @ObfuscatedName("bq.z")
    public int field851;

    @ObfuscatedName("bq.o")
    public boolean field845;

    @ObfuscatedName("bq.d")
    public int field853;

    @ObfuscatedName("bq.s")
    public int field854;

    @ObfuscatedName("bq.f")
    public boolean field855;

    @ObfuscatedName("bq.q")
    public int field856;

    @ObfuscatedName("bq.al")
    public int field859;

    public class74() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field834[var1] = "";
        }
        this.field836 = 0;
        this.field838 = 0;
        this.field840 = 0;
        this.field841 = 0;
        this.field850 = false;
        this.field851 = 0;
        this.field845 = false;
        this.field855 = false;
    }

    @ObfuscatedName("bq.m(Lfv;I)V")
    public final void method1068(class181 arg0) {
        arg0.field2498 = 0;
        int var2 = arg0.method3012();
        this.field857 = arg0.method3013();
        this.field843 = arg0.method3013();
        int var3 = -1;
        this.field851 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3012();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3012();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3009();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class264.method4124(var4[var5] - 512).field3589;
                    if (var8 != 0) {
                        this.field851 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3012();
            if (var11 < 0 || var11 >= Statics.field2703[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1175 = arg0.method3009();
        if (this.field1175 == 65535) {
            this.field1175 = -1;
        }
        this.field1150 = arg0.method3009();
        if (this.field1150 == 65535) {
            this.field1150 = -1;
        }
        this.field1151 = this.field1150;
        this.field1152 = arg0.method3009();
        if (this.field1152 == 65535) {
            this.field1152 = -1;
        }
        this.field1153 = arg0.method3009();
        if (this.field1153 == 65535) {
            this.field1153 = -1;
        }
        this.field1154 = arg0.method3009();
        if (this.field1154 == 65535) {
            this.field1154 = -1;
        }
        this.field1155 = arg0.method3009();
        if (this.field1155 == 65535) {
            this.field1155 = -1;
        }
        this.field1156 = arg0.method3009();
        if (this.field1156 == 65535) {
            this.field1156 = -1;
        }
        this.field852 = arg0.method3021();
        if (Statics.field601 == this) {
            Statics.field2137 = this.field852;
        }
        this.field836 = arg0.method3012();
        this.field838 = arg0.method3009();
        this.field845 = arg0.method3012() == 1;
        if (client.field873 == 0 && client.field1017 >= 2) {
            this.field845 = false;
        }
        if (this.field833 == null) {
            this.field833 = new class221();
        }
        this.field833.method3786(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bq.p(B)I")
    public int method1069() {
        return this.field833 == null || this.field833.field2705 == -1 ? 1 : class266.method1704(this.field833.field2705).field3626;
    }

    @ObfuscatedName("bq.i(I)Len;")
    public final class133 method1070() {
        if (this.field833 == null) {
            return null;
        }
        class268 var1 = this.field1176 != -1 && this.field1179 == 0 ? class268.method2289(this.field1176) : null;
        class268 var2 = this.field1173 == -1 || this.field850 || this.field1175 == this.field1173 && var1 != null ? null : class268.method2289(this.field1173);
        class133 var3 = this.field833.method3790(var1, this.field1177, var2, this.field1174);
        if (var3 == null) {
            return null;
        }
        var3.method2385();
        this.field1162 = var3.field2037;
        if (!this.field850 && this.field1181 != -1 && this.field1182 != -1) {
            class133 var4 = class253.method4750(this.field1181).method4154(this.field1182);
            if (var4 != null) {
                var4.method2412(0, -this.field1185, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (!this.field850 && this.field835 != null) {
            if (client.field1054 >= this.field841) {
                this.field835 = null;
            }
            if (client.field1054 >= this.field840 && client.field1054 < this.field841) {
                class133 var6 = this.field835;
                var6.method2412(this.field847 - this.field1188, this.field842 - this.field832, this.field839 - this.field1145);
                if (this.field1195 == 512) {
                    var6.method2446();
                    var6.method2446();
                    var6.method2446();
                } else if (this.field1195 == 1024) {
                    var6.method2446();
                    var6.method2446();
                } else if (this.field1195 == 1536) {
                    var6.method2446();
                }
                class133[] var7 = new class133[] { var3, var6 };
                var3 = new class133(var7, 2);
                if (this.field1195 == 512) {
                    var6.method2446();
                } else if (this.field1195 == 1024) {
                    var6.method2446();
                    var6.method2446();
                } else if (this.field1195 == 1536) {
                    var6.method2446();
                    var6.method2446();
                    var6.method2446();
                }
                var6.method2412(this.field1188 - this.field847, this.field832 - this.field842, this.field1145 - this.field839);
            }
        }
        var3.field1861 = true;
        return var3;
    }

    @ObfuscatedName("bq.j(IIBI)V")
    public final void method1071(int arg0, int arg1, byte arg2) {
        if (this.field1176 != -1 && class268.method2289(this.field1176).field3672 == 1) {
            this.field1176 = -1;
        }
        this.field1203 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1072(arg0, arg1);
        } else if (this.field1199[0] >= 0 && this.field1199[0] < 104 && this.field1172[0] >= 0 && this.field1172[0] < 104) {
            if (arg2 == 2) {
                class74 var4 = this;
                int var5 = this.field1199[0];
                int var6 = this.field1172[0];
                int var7 = this.method1069();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method1069();
                    client.field961.field2215 = arg0;
                    client.field961.field2216 = arg1;
                    client.field961.field2218 = 1;
                    client.field961.field2217 = 1;
                    class73 var11 = client.field961;
                    int var12 = class164.method66(var5, var6, var10, var11, client.field922[this.field853], true, client.field1130, client.field1087);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method1074(client.field1130[var13], client.field1087[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method1074(arg0, arg1, arg2);
        } else {
            this.method1072(arg0, arg1);
        }
    }

    @ObfuscatedName("bq.v(IIS)V")
    public void method1072(int arg0, int arg1) {
        this.field1198 = 0;
        this.field1187 = 0;
        this.field1158 = 0;
        this.field1199[0] = arg0;
        this.field1172[0] = arg1;
        int var3 = this.method1069();
        this.field1188 = this.field1199[0] * 128 + var3 * 64;
        this.field1145 = this.field1172[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bq.x(IIBI)V")
    public final void method1074(int arg0, int arg1, byte arg2) {
        if (this.field1198 < 9) {
            this.field1198++;
        }
        for (int var4 = this.field1198; var4 > 0; var4--) {
            this.field1199[var4] = this.field1199[var4 - 1];
            this.field1172[var4] = this.field1172[var4 - 1];
            this.field1190[var4] = this.field1190[var4 - 1];
        }
        this.field1199[0] = arg0;
        this.field1172[0] = arg1;
        this.field1190[0] = arg2;
    }

    @ObfuscatedName("bq.e(I)Z")
    public final boolean method1073() {
        return this.field833 != null;
    }
}
