package deob;

@ObfuscatedName("bj")
public final class class75 extends class79 {

    @ObfuscatedName("bj.i")
    public String field881;

    @ObfuscatedName("bj.h")
    public class214 field855;

    @ObfuscatedName("bj.u")
    public int field854 = -1;

    @ObfuscatedName("bj.q")
    public int field879 = -1;

    @ObfuscatedName("bj.v")
    public String[] field858 = new String[3];

    @ObfuscatedName("bj.t")
    public int field859;

    @ObfuscatedName("bj.p")
    public int field856;

    @ObfuscatedName("bj.l")
    public int field863;

    @ObfuscatedName("bj.a")
    public int field860;

    @ObfuscatedName("bj.k")
    public int field874;

    @ObfuscatedName("bj.r")
    public int field864;

    @ObfuscatedName("bj.b")
    public int field865;

    @ObfuscatedName("bj.x")
    public int field866;

    @ObfuscatedName("bj.o")
    public class134 field867;

    @ObfuscatedName("bj.j")
    public int field857;

    @ObfuscatedName("bj.m")
    public int field861;

    @ObfuscatedName("bj.d")
    public int field870;

    @ObfuscatedName("bj.e")
    public int field871;

    @ObfuscatedName("bj.s")
    public boolean field872;

    @ObfuscatedName("bj.n")
    public int field873;

    @ObfuscatedName("bj.y")
    public boolean field868;

    @ObfuscatedName("bj.w")
    public int field875;

    @ObfuscatedName("bj.f")
    public int field876;

    @ObfuscatedName("bj.c")
    public boolean field877;

    @ObfuscatedName("bj.z")
    public int field878;

    @ObfuscatedName("bj.ay")
    public int field862;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field858[var1] = "";
        }
        this.field859 = 0;
        this.field856 = 0;
        this.field860 = 0;
        this.field874 = 0;
        this.field872 = false;
        this.field873 = 0;
        this.field868 = false;
        this.field877 = false;
    }

    @ObfuscatedName("bj.i(Lfv;I)V")
    public final void method1051(class174 arg0) {
        arg0.field2384 = 0;
        int var2 = arg0.method2930();
        this.field854 = arg0.method2931();
        this.field879 = arg0.method2931();
        int var3 = -1;
        this.field873 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2930();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2930();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2932();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class257.method678(var4[var5] - 512).field3492;
                    if (var8 != 0) {
                        this.field873 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2930();
            if (var11 < 0 || var11 >= Statics.field2612[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1204 = arg0.method2932();
        if (this.field1204 == 65535) {
            this.field1204 = -1;
        }
        this.field1205 = arg0.method2932();
        if (this.field1205 == 65535) {
            this.field1205 = -1;
        }
        this.field1206 = this.field1205;
        this.field1228 = arg0.method2932();
        if (this.field1228 == 65535) {
            this.field1228 = -1;
        }
        this.field1252 = arg0.method2932();
        if (this.field1252 == 65535) {
            this.field1252 = -1;
        }
        this.field1209 = arg0.method2932();
        if (this.field1209 == 65535) {
            this.field1209 = -1;
        }
        this.field1227 = arg0.method2932();
        if (this.field1227 == 65535) {
            this.field1227 = -1;
        }
        this.field1211 = arg0.method2932();
        if (this.field1211 == 65535) {
            this.field1211 = -1;
        }
        this.field881 = arg0.method2938();
        if (Statics.field308 == this) {
            Statics.field2197 = this.field881;
        }
        this.field859 = arg0.method2930();
        this.field856 = arg0.method2932();
        this.field868 = arg0.method2930() == 1;
        if (client.field927 == 0 && client.field1058 >= 2) {
            this.field868 = false;
        }
        if (this.field855 == null) {
            this.field855 = new class214();
        }
        this.field855.method3702(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bj.h(I)I")
    public int method1052() {
        return this.field855 == null || this.field855.field2609 == -1 ? 1 : Statics.method3810(this.field855.field2609).field3549;
    }

    @ObfuscatedName("bj.u(I)Lew;")
    public final class134 method1053() {
        if (this.field855 == null) {
            return null;
        }
        class261 var1 = this.field1241 != -1 && this.field1233 == 0 ? class261.method2856(this.field1241) : null;
        class261 var2 = this.field1222 == -1 || this.field872 || this.field1222 == this.field1204 && var1 != null ? null : class261.method2856(this.field1222);
        class134 var3 = this.field855.method3694(var1, this.field1232, var2, this.field1242);
        if (var3 == null) {
            return null;
        }
        var3.method2359();
        this.field1249 = var3.field2104;
        if (!this.field872 && this.field1236 != -1 && this.field1229 != -1) {
            class134 var4 = class246.method3468(this.field1236).method4051(this.field1229);
            if (var4 != null) {
                var4.method2349(0, -this.field1240, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field872 && this.field867 != null) {
            if (client.field900 >= this.field874) {
                this.field867 = null;
            }
            if (client.field900 >= this.field860 && client.field900 < this.field874) {
                class134 var6 = this.field867;
                var6.method2349(this.field864 - this.field1247, this.field865 - this.field863, this.field866 - this.field1200);
                if (this.field1248 == 512) {
                    var6.method2330();
                    var6.method2330();
                    var6.method2330();
                } else if (this.field1248 == 1024) {
                    var6.method2330();
                    var6.method2330();
                } else if (this.field1248 == 1536) {
                    var6.method2330();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1248 == 512) {
                    var6.method2330();
                } else if (this.field1248 == 1024) {
                    var6.method2330();
                    var6.method2330();
                } else if (this.field1248 == 1536) {
                    var6.method2330();
                    var6.method2330();
                    var6.method2330();
                }
                var6.method2349(this.field1247 - this.field864, this.field863 - this.field865, this.field1200 - this.field866);
            }
        }
        var3.field1909 = true;
        return var3;
    }

    @ObfuscatedName("bj.q(IIBI)V")
    public final void method1054(int arg0, int arg1, byte arg2) {
        if (this.field1241 != -1 && class261.method2856(this.field1241).field3611 == 1) {
            this.field1241 = -1;
        }
        this.field1231 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1055(arg0, arg1);
        } else if (this.field1254[0] >= 0 && this.field1254[0] < 104 && this.field1255[0] >= 0 && this.field1255[0] < 104) {
            if (arg2 == 2) {
                client.method487(this, arg0, arg1, (byte) 2);
            }
            this.method1073(arg0, arg1, arg2);
        } else {
            this.method1055(arg0, arg1);
        }
    }

    @ObfuscatedName("bj.g(III)V")
    public void method1055(int arg0, int arg1) {
        this.field1253 = 0;
        this.field1237 = 0;
        this.field1258 = 0;
        this.field1254[0] = arg0;
        this.field1255[0] = arg1;
        int var3 = this.method1052();
        this.field1247 = this.field1254[0] * 128 + var3 * 64;
        this.field1200 = this.field1255[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bj.v(IIBI)V")
    public final void method1073(int arg0, int arg1, byte arg2) {
        if (this.field1253 < 9) {
            this.field1253++;
        }
        for (int var4 = this.field1253; var4 > 0; var4--) {
            this.field1254[var4] = this.field1254[var4 - 1];
            this.field1255[var4] = this.field1255[var4 - 1];
            this.field1256[var4] = this.field1256[var4 - 1];
        }
        this.field1254[0] = arg0;
        this.field1255[0] = arg1;
        this.field1256[0] = arg2;
    }

    @ObfuscatedName("bj.t(I)Z")
    public final boolean method1057() {
        return this.field855 != null;
    }
}
