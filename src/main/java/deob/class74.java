package deob;

@ObfuscatedName("bw")
public final class class74 extends class78 {

    @ObfuscatedName("bw.d")
    public String field844;

    @ObfuscatedName("bw.x")
    public class221 field857;

    @ObfuscatedName("bw.k")
    public int field838 = -1;

    @ObfuscatedName("bw.z")
    public int field836 = -1;

    @ObfuscatedName("bw.m")
    public String[] field840 = new String[3];

    @ObfuscatedName("bw.b")
    public int field856;

    @ObfuscatedName("bw.t")
    public int field859;

    @ObfuscatedName("bw.p")
    public int field843;

    @ObfuscatedName("bw.r")
    public int field849;

    @ObfuscatedName("bw.l")
    public int field845;

    @ObfuscatedName("bw.u")
    public int field846;

    @ObfuscatedName("bw.n")
    public int field847;

    @ObfuscatedName("bw.c")
    public int field848;

    @ObfuscatedName("bw.y")
    public class133 field841;

    @ObfuscatedName("bw.j")
    public int field850;

    @ObfuscatedName("bw.f")
    public int field851;

    @ObfuscatedName("bw.s")
    public int field852;

    @ObfuscatedName("bw.e")
    public int field853;

    @ObfuscatedName("bw.q")
    public boolean field842;

    @ObfuscatedName("bw.h")
    public int field855;

    @ObfuscatedName("bw.i")
    public boolean field839;

    @ObfuscatedName("bw.o")
    public int field854;

    @ObfuscatedName("bw.w")
    public int field858;

    @ObfuscatedName("bw.g")
    public boolean field837;

    @ObfuscatedName("bw.a")
    public int field860;

    @ObfuscatedName("bw.ah")
    public int field861;

    public class74() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field840[var1] = "";
        }
        this.field856 = 0;
        this.field859 = 0;
        this.field849 = 0;
        this.field845 = 0;
        this.field842 = false;
        this.field855 = 0;
        this.field839 = false;
        this.field837 = false;
    }

    @ObfuscatedName("bw.d(Lfr;I)V")
    public final void method1059(class181 arg0) {
        arg0.field2498 = 0;
        int var2 = arg0.method3204();
        this.field838 = arg0.method3236();
        this.field836 = arg0.method3236();
        int var3 = -1;
        this.field855 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3204();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3204();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3179();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class264.method482(var4[var5] - 512).field3602;
                    if (var8 != 0) {
                        this.field855 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3204();
            if (var11 < 0 || var11 >= Statics.field2698[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1152 = arg0.method3179();
        if (this.field1152 == 65535) {
            this.field1152 = -1;
        }
        this.field1153 = arg0.method3179();
        if (this.field1153 == 65535) {
            this.field1153 = -1;
        }
        this.field1154 = this.field1153;
        this.field1155 = arg0.method3179();
        if (this.field1155 == 65535) {
            this.field1155 = -1;
        }
        this.field1156 = arg0.method3179();
        if (this.field1156 == 65535) {
            this.field1156 = -1;
        }
        this.field1157 = arg0.method3179();
        if (this.field1157 == 65535) {
            this.field1157 = -1;
        }
        this.field1158 = arg0.method3179();
        if (this.field1158 == 65535) {
            this.field1158 = -1;
        }
        this.field1159 = arg0.method3179();
        if (this.field1159 == 65535) {
            this.field1159 = -1;
        }
        this.field844 = arg0.method3045();
        if (Statics.field2501 == this) {
            Statics.field2128 = this.field844;
        }
        this.field856 = arg0.method3204();
        this.field859 = arg0.method3179();
        this.field839 = arg0.method3204() == 1;
        if (client.field875 == 0 && client.field1026 >= 2) {
            this.field839 = false;
        }
        if (this.field857 == null) {
            this.field857 = new class221();
        }
        this.field857.method3815(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bw.x(I)I")
    public int method1058() {
        return this.field857 == null || this.field857.field2701 == -1 ? 1 : class266.method4(this.field857.field2701).field3620;
    }

    @ObfuscatedName("bw.k(I)Leh;")
    public final class133 method1060() {
        if (this.field857 == null) {
            return null;
        }
        class268 var1 = this.field1192 != -1 && this.field1150 == 0 ? class268.method76(this.field1192) : null;
        class268 var2 = this.field1176 == -1 || this.field842 || this.field1176 == this.field1152 && var1 != null ? null : class268.method76(this.field1176);
        class133 var3 = this.field857.method3821(var1, this.field1206, var2, this.field1190);
        if (var3 == null) {
            return null;
        }
        var3.method2407();
        this.field1180 = var3.field2024;
        if (!this.field842 && this.field1201 != -1 && this.field1185 != -1) {
            class133 var4 = class253.method3903(this.field1201).method4151(this.field1185);
            if (var4 != null) {
                var4.method2419(0, -this.field1188, 0);
                class133[] var5 = new class133[] { var3, var4 };
                var3 = new class133(var5, 2);
            }
        }
        if (!this.field842 && this.field841 != null) {
            if (client.field881 >= this.field845) {
                this.field841 = null;
            }
            if (client.field881 >= this.field849 && client.field881 < this.field845) {
                class133 var6 = this.field841;
                var6.method2419(this.field846 - this.field1149, this.field847 - this.field843, this.field848 - this.field1198);
                if (this.field1151 == 512) {
                    var6.method2414();
                    var6.method2414();
                    var6.method2414();
                } else if (this.field1151 == 1024) {
                    var6.method2414();
                    var6.method2414();
                } else if (this.field1151 == 1536) {
                    var6.method2414();
                }
                class133[] var7 = new class133[] { var3, var6 };
                var3 = new class133(var7, 2);
                if (this.field1151 == 512) {
                    var6.method2414();
                } else if (this.field1151 == 1024) {
                    var6.method2414();
                    var6.method2414();
                } else if (this.field1151 == 1536) {
                    var6.method2414();
                    var6.method2414();
                    var6.method2414();
                }
                var6.method2419(this.field1149 - this.field846, this.field843 - this.field847, this.field1198 - this.field848);
            }
        }
        var3.field1856 = true;
        return var3;
    }

    @ObfuscatedName("bw.z(IIBI)V")
    public final void method1072(int arg0, int arg1, byte arg2) {
        if (this.field1192 != -1 && class268.method76(this.field1192).field3681 == 1) {
            this.field1192 = -1;
        }
        this.field1175 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1063(arg0, arg1);
        } else if (this.field1187[0] >= 0 && this.field1187[0] < 104 && this.field1203[0] >= 0 && this.field1203[0] < 104) {
            if (arg2 == 2) {
                client.method3276(this, arg0, arg1, (byte) 2);
            }
            this.method1064(arg0, arg1, arg2);
        } else {
            this.method1063(arg0, arg1);
        }
    }

    @ObfuscatedName("bw.v(III)V")
    public void method1063(int arg0, int arg1) {
        this.field1184 = 0;
        this.field1160 = 0;
        this.field1205 = 0;
        this.field1187[0] = arg0;
        this.field1203[0] = arg1;
        int var3 = this.method1058();
        this.field1149 = this.field1187[0] * 128 + var3 * 64;
        this.field1198 = this.field1203[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bw.m(IIBB)V")
    public final void method1064(int arg0, int arg1, byte arg2) {
        if (this.field1184 < 9) {
            this.field1184++;
        }
        for (int var4 = this.field1184; var4 > 0; var4--) {
            this.field1187[var4] = this.field1187[var4 - 1];
            this.field1203[var4] = this.field1203[var4 - 1];
            this.field1204[var4] = this.field1204[var4 - 1];
        }
        this.field1187[0] = arg0;
        this.field1203[0] = arg1;
        this.field1204[0] = arg2;
    }

    @ObfuscatedName("bw.b(B)Z")
    public final boolean method1065() {
        return this.field857 != null;
    }
}
