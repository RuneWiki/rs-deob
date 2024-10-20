package deob;

@ObfuscatedName("at")
public class class37 extends class195 {

    @ObfuscatedName("at.a")
    public static class184 field849 = new class184(64);

    @ObfuscatedName("at.m")
    public static class184 field850 = new class184(50);

    @ObfuscatedName("at.s")
    public int field879;

    @ObfuscatedName("at.j")
    public String field852 = "null";

    @ObfuscatedName("at.f")
    public int field853 = 1;

    @ObfuscatedName("at.b")
    public int[] field854;

    @ObfuscatedName("at.t")
    public int[] field851;

    @ObfuscatedName("at.i")
    public int field856 = -1;

    @ObfuscatedName("at.c")
    public int field857 = -1;

    @ObfuscatedName("at.k")
    public int field884 = -1;

    @ObfuscatedName("at.x")
    public int field859 = -1;

    @ObfuscatedName("at.e")
    public int field883 = -1;

    @ObfuscatedName("at.q")
    public int field861 = -1;

    @ObfuscatedName("at.o")
    public int field862 = -1;

    @ObfuscatedName("at.r")
    public short[] field848;

    @ObfuscatedName("at.v")
    public short[] field874;

    @ObfuscatedName("at.h")
    public short[] field865;

    @ObfuscatedName("at.p")
    public short[] field860;

    @ObfuscatedName("at.y")
    public String[] field867 = new String[5];

    @ObfuscatedName("at.z")
    public boolean field868 = true;

    @ObfuscatedName("at.u")
    public int field869 = -1;

    @ObfuscatedName("at.w")
    public int field870 = 128;

    @ObfuscatedName("at.d")
    public int field871 = 128;

    @ObfuscatedName("at.l")
    public boolean field872 = false;

    @ObfuscatedName("at.aj")
    public int field863 = 0;

    @ObfuscatedName("at.aq")
    public int field876 = 0;

    @ObfuscatedName("at.al")
    public int field864 = -1;

    @ObfuscatedName("at.az")
    public int field875 = 32;

    @ObfuscatedName("at.ah")
    public int[] field877;

    @ObfuscatedName("at.ag")
    public int field878 = -1;

    @ObfuscatedName("at.ad")
    public int field858 = -1;

    @ObfuscatedName("at.ao")
    public boolean field880 = true;

    @ObfuscatedName("at.am")
    public boolean field881 = true;

    @ObfuscatedName("at.ax")
    public boolean field882 = false;

    @ObfuscatedName("at.at")
    public int field866 = 30;

    @ObfuscatedName("eg.n(Lfi;Lfi;B)V")
    public static void method2811(class158 arg0, class158 arg1) {
        Statics.field873 = arg0;
        Statics.field1872 = arg1;
    }

    @ObfuscatedName("y.g(II)Lat;")
    public static class37 method502(int arg0) {
        class37 var1 = (class37) field849.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field873.method2929(9, arg0);
        class37 var3 = new class37();
        var3.field879 = arg0;
        if (var2 != null) {
            var3.method653(new class111(var2));
        }
        var3.method664();
        field849.method3396(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.a(I)V")
    public void method664() {
    }

    @ObfuscatedName("at.m(Ldp;B)V")
    public void method653(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method654(arg0, var2);
        }
    }

    @ObfuscatedName("at.s(Ldp;II)V")
    public void method654(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2211();
            this.field854 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field854[var4] = arg0.method2395();
            }
        } else if (arg1 == 2) {
            this.field852 = arg0.method2223();
        } else if (arg1 == 12) {
            this.field853 = arg0.method2211();
        } else if (arg1 == 13) {
            this.field856 = arg0.method2395();
        } else if (arg1 == 14) {
            this.field859 = arg0.method2395();
        } else if (arg1 == 15) {
            this.field857 = arg0.method2395();
        } else if (arg1 == 16) {
            this.field884 = arg0.method2395();
        } else if (arg1 == 17) {
            this.field859 = arg0.method2395();
            this.field883 = arg0.method2395();
            this.field861 = arg0.method2395();
            this.field862 = arg0.method2395();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field867[arg1 - 30] = arg0.method2223();
            if (this.field867[arg1 - 30].equalsIgnoreCase(class148.field2204)) {
                this.field867[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2211();
            this.field848 = new short[var5];
            this.field874 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field848[var6] = (short) arg0.method2395();
                this.field874[var6] = (short) arg0.method2395();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2211();
            this.field865 = new short[var7];
            this.field860 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field865[var8] = (short) arg0.method2395();
                this.field860[var8] = (short) arg0.method2395();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2211();
            this.field851 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field851[var10] = arg0.method2395();
            }
        } else if (arg1 == 93) {
            this.field868 = false;
        } else if (arg1 == 95) {
            this.field869 = arg0.method2395();
        } else if (arg1 == 97) {
            this.field870 = arg0.method2395();
        } else if (arg1 == 98) {
            this.field871 = arg0.method2395();
        } else if (arg1 == 99) {
            this.field872 = true;
        } else if (arg1 == 100) {
            this.field863 = arg0.method2217();
        } else if (arg1 == 101) {
            this.field876 = arg0.method2217() * 5;
        } else if (arg1 == 102) {
            this.field864 = arg0.method2395();
        } else if (arg1 == 103) {
            this.field875 = arg0.method2395();
        } else if (arg1 == 106) {
            this.field878 = arg0.method2395();
            if (this.field878 == 65535) {
                this.field878 = -1;
            }
            this.field858 = arg0.method2395();
            if (this.field858 == 65535) {
                this.field858 = -1;
            }
            int var11 = arg0.method2211();
            this.field877 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field877[var12] = arg0.method2395();
                if (this.field877[var12] == 65535) {
                    this.field877[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field880 = false;
        } else if (arg1 == 109) {
            this.field881 = false;
        } else if (arg1 == 111) {
            this.field882 = true;
        } else if (arg1 == 112) {
            this.field866 = arg0.method2211();
        }
    }

    @ObfuscatedName("at.j(Law;ILaw;II)Lcs;")
    public final class100 method679(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field877 != null) {
            class37 var5 = this.method657();
            return var5 == null ? null : var5.method679(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field850.method3388((long) this.field879);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field854.length; var8++) {
                if (!Statics.field1872.method2987(this.field854[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field854.length];
            for (int var10 = 0; var10 < this.field854.length; var10++) {
                var9[var10] = class95.method2011(Statics.field1872, this.field854[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field848 != null) {
                for (int var12 = 0; var12 < this.field848.length; var12++) {
                    var11.method1991(this.field848[var12], this.field874[var12]);
                }
            }
            if (this.field865 != null) {
                for (int var13 = 0; var13 < this.field865.length; var13++) {
                    var11.method2030(this.field865[var13], this.field860[var13]);
                }
            }
            var6 = var11.method1982(this.field863 + 64, this.field876 + 850, -30, -50, -30);
            field850.method3396(var6, (long) this.field879);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method749(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method746(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2058(true);
        } else {
            var14 = arg2.method746(var6, arg3);
        }
        if (this.field870 != 128 || this.field871 != 128) {
            var14.method2072(this.field870, this.field871, this.field870);
        }
        return var14;
    }

    @ObfuscatedName("at.f(I)Lci;")
    public final class95 method656() {
        if (this.field877 != null) {
            class37 var1 = this.method657();
            return var1 == null ? null : var1.method656();
        } else if (this.field851 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field851.length; var3++) {
                if (!Statics.field1872.method2987(this.field851[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field851.length];
            for (int var5 = 0; var5 < this.field851.length; var5++) {
                var4[var5] = class95.method2011(Statics.field1872, this.field851[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field848 != null) {
                for (int var7 = 0; var7 < this.field848.length; var7++) {
                    var6.method1991(this.field848[var7], this.field874[var7]);
                }
            }
            if (this.field865 != null) {
                for (int var8 = 0; var8 < this.field865.length; var8++) {
                    var6.method2030(this.field865[var8], this.field860[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("at.b(I)Lat;")
    public final class37 method657() {
        int var1 = -1;
        if (this.field878 != -1) {
            var1 = Statics.method110(this.field878);
        } else if (this.field858 != -1) {
            var1 = class167.field2796[this.field858];
        }
        return var1 < 0 || var1 >= this.field877.length || this.field877[var1] == -1 ? null : method502(this.field877[var1]);
    }

    @ObfuscatedName("at.t(I)Z")
    public boolean method658() {
        if (this.field877 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field878 != -1) {
            var1 = Statics.method110(this.field878);
        } else if (this.field858 != -1) {
            var1 = class167.field2796[this.field858];
        }
        return var1 >= 0 && var1 < this.field877.length && this.field877[var1] != -1;
    }
}
