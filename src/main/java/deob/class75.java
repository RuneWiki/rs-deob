package deob;

@ObfuscatedName("bg")
public final class class75 extends class79 {

    @ObfuscatedName("bg.d")
    public String field875;

    @ObfuscatedName("bg.q")
    public class214 field858;

    @ObfuscatedName("bg.x")
    public int field867 = -1;

    @ObfuscatedName("bg.y")
    public int field860 = -1;

    @ObfuscatedName("bg.f")
    public String[] field862 = new String[3];

    @ObfuscatedName("bg.v")
    public int field863;

    @ObfuscatedName("bg.t")
    public int field864;

    @ObfuscatedName("bg.i")
    public int field865;

    @ObfuscatedName("bg.r")
    public int field879;

    @ObfuscatedName("bg.g")
    public int field861;

    @ObfuscatedName("bg.s")
    public int field868;

    @ObfuscatedName("bg.o")
    public int field857;

    @ObfuscatedName("bg.p")
    public int field870;

    @ObfuscatedName("bg.u")
    public class134 field871;

    @ObfuscatedName("bg.b")
    public int field872;

    @ObfuscatedName("bg.w")
    public int field873;

    @ObfuscatedName("bg.k")
    public int field874;

    @ObfuscatedName("bg.n")
    public int field881;

    @ObfuscatedName("bg.c")
    public boolean field876;

    @ObfuscatedName("bg.l")
    public int field877;

    @ObfuscatedName("bg.m")
    public boolean field878;

    @ObfuscatedName("bg.a")
    public int field882;

    @ObfuscatedName("bg.h")
    public int field866;

    @ObfuscatedName("bg.z")
    public boolean field880;

    @ObfuscatedName("bg.j")
    public int field869;

    @ObfuscatedName("bg.am")
    public int field883;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field862[var1] = "";
        }
        this.field863 = 0;
        this.field864 = 0;
        this.field879 = 0;
        this.field861 = 0;
        this.field876 = false;
        this.field877 = 0;
        this.field878 = false;
        this.field880 = false;
    }

    @ObfuscatedName("bg.d(Lfw;B)V")
    public final void method1031(class174 arg0) {
        arg0.field2364 = 0;
        int var2 = arg0.method2921();
        this.field867 = arg0.method3082();
        this.field860 = arg0.method3082();
        int var3 = -1;
        this.field877 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2921();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2921();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2916();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method992(var4[var5] - 512).field3516;
                    if (var8 != 0) {
                        this.field877 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2921();
            if (var11 < 0 || var11 >= Statics.field2014[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1195 = arg0.method2916();
        if (this.field1195 == 65535) {
            this.field1195 = -1;
        }
        this.field1196 = arg0.method2916();
        if (this.field1196 == 65535) {
            this.field1196 = -1;
        }
        this.field1197 = this.field1196;
        this.field1198 = arg0.method2916();
        if (this.field1198 == 65535) {
            this.field1198 = -1;
        }
        this.field1206 = arg0.method2916();
        if (this.field1206 == 65535) {
            this.field1206 = -1;
        }
        this.field1250 = arg0.method2916();
        if (this.field1250 == 65535) {
            this.field1250 = -1;
        }
        this.field1201 = arg0.method2916();
        if (this.field1201 == 65535) {
            this.field1201 = -1;
        }
        this.field1218 = arg0.method2916();
        if (this.field1218 == 65535) {
            this.field1218 = -1;
        }
        this.field875 = arg0.method2922();
        if (Statics.field2829 == this) {
            Statics.field2190 = this.field875;
        }
        this.field863 = arg0.method2921();
        this.field864 = arg0.method2916();
        this.field878 = arg0.method2921() == 1;
        if (client.field895 == 0 && client.field914 >= 2) {
            this.field878 = false;
        }
        if (this.field858 == null) {
            this.field858 = new class214();
        }
        this.field858.method3614(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bg.q(B)I")
    public int method1033() {
        return this.field858 == null || this.field858.field2599 == -1 ? 1 : class259.method941(this.field858.field2599).field3536;
    }

    @ObfuscatedName("bg.x(I)Lev;")
    public final class134 method1046() {
        if (this.field858 == null) {
            return null;
        }
        class261 var1 = this.field1222 != -1 && this.field1225 == 0 ? class261.method494(this.field1222) : null;
        class261 var2 = this.field1211 == -1 || this.field876 || this.field1211 == this.field1195 && var1 != null ? null : class261.method494(this.field1211);
        class134 var3 = this.field858.method3620(var1, this.field1237, var2, this.field1223);
        if (var3 == null) {
            return null;
        }
        var3.method2270();
        this.field1240 = var3.field2088;
        if (!this.field876 && this.field1227 != -1 && this.field1228 != -1) {
            class134 var4 = class246.method465(this.field1227).method3935(this.field1228);
            if (var4 != null) {
                var4.method2281(0, -this.field1231, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field876 && this.field871 != null) {
            if (client.field902 >= this.field861) {
                this.field871 = null;
            }
            if (client.field902 >= this.field879 && client.field902 < this.field861) {
                class134 var6 = this.field871;
                var6.method2281(this.field868 - this.field1232, this.field857 - this.field865, this.field870 - this.field1191);
                if (this.field1241 == 512) {
                    var6.method2277();
                    var6.method2277();
                    var6.method2277();
                } else if (this.field1241 == 1024) {
                    var6.method2277();
                    var6.method2277();
                } else if (this.field1241 == 1536) {
                    var6.method2277();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1241 == 512) {
                    var6.method2277();
                } else if (this.field1241 == 1024) {
                    var6.method2277();
                    var6.method2277();
                } else if (this.field1241 == 1536) {
                    var6.method2277();
                    var6.method2277();
                    var6.method2277();
                }
                var6.method2281(this.field1232 - this.field868, this.field865 - this.field857, this.field1191 - this.field870);
            }
        }
        var3.field1903 = true;
        return var3;
    }

    @ObfuscatedName("bg.y(IIBI)V")
    public final void method1034(int arg0, int arg1, byte arg2) {
        if (this.field1222 != -1 && class261.method494(this.field1222).field3598 == 1) {
            this.field1222 = -1;
        }
        this.field1210 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1054(arg0, arg1);
        } else if (this.field1245[0] >= 0 && this.field1245[0] < 104 && this.field1246[0] >= 0 && this.field1246[0] < 104) {
            if (arg2 == 2) {
                client.method213(this, arg0, arg1, (byte) 2);
            }
            this.method1036(arg0, arg1, arg2);
        } else {
            this.method1054(arg0, arg1);
        }
    }

    @ObfuscatedName("bg.e(IIB)V")
    public void method1054(int arg0, int arg1) {
        this.field1235 = 0;
        this.field1249 = 0;
        this.field1248 = 0;
        this.field1245[0] = arg0;
        this.field1246[0] = arg1;
        int var3 = this.method1033();
        this.field1232 = this.field1245[0] * 128 + var3 * 64;
        this.field1191 = this.field1246[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bg.f(IIBI)V")
    public final void method1036(int arg0, int arg1, byte arg2) {
        if (this.field1235 < 9) {
            this.field1235++;
        }
        for (int var4 = this.field1235; var4 > 0; var4--) {
            this.field1245[var4] = this.field1245[var4 - 1];
            this.field1246[var4] = this.field1246[var4 - 1];
            this.field1247[var4] = this.field1247[var4 - 1];
        }
        this.field1245[0] = arg0;
        this.field1246[0] = arg1;
        this.field1247[0] = arg2;
    }

    @ObfuscatedName("bg.v(B)Z")
    public final boolean method1037() {
        return this.field858 != null;
    }
}
