package deob;

@ObfuscatedName("at")
public class class40 extends class204 {

    @ObfuscatedName("at.y")
    public static class193 field845 = new class193(64);

    @ObfuscatedName("at.u")
    public static class193 field846 = new class193(50);

    @ObfuscatedName("at.k")
    public int field847;

    @ObfuscatedName("at.j")
    public String field848 = "null";

    @ObfuscatedName("at.i")
    public int field876 = 1;

    @ObfuscatedName("at.x")
    public int[] field857;

    @ObfuscatedName("at.g")
    public int[] field851;

    @ObfuscatedName("at.e")
    public int field844 = -1;

    @ObfuscatedName("at.p")
    public int field852 = -1;

    @ObfuscatedName("at.a")
    public int field878 = -1;

    @ObfuscatedName("at.v")
    public int field843 = -1;

    @ObfuscatedName("at.c")
    public int field854 = -1;

    @ObfuscatedName("at.s")
    public int field873 = -1;

    @ObfuscatedName("at.r")
    public int field858 = -1;

    @ObfuscatedName("at.h")
    public short[] field859;

    @ObfuscatedName("at.n")
    public short[] field860;

    @ObfuscatedName("at.b")
    public short[] field861;

    @ObfuscatedName("at.f")
    public short[] field862;

    @ObfuscatedName("at.d")
    public String[] field874 = new String[5];

    @ObfuscatedName("at.q")
    public boolean field864 = true;

    @ObfuscatedName("at.o")
    public int field865 = -1;

    @ObfuscatedName("at.w")
    public int field866 = 128;

    @ObfuscatedName("at.z")
    public int field867 = 128;

    @ObfuscatedName("at.t")
    public boolean field868 = false;

    @ObfuscatedName("at.aq")
    public int field869 = 0;

    @ObfuscatedName("at.an")
    public int field870 = 0;

    @ObfuscatedName("at.av")
    public int field871 = -1;

    @ObfuscatedName("at.ac")
    public int field872 = 32;

    @ObfuscatedName("at.ar")
    public int[] field849;

    @ObfuscatedName("at.ah")
    public int field853 = -1;

    @ObfuscatedName("at.ab")
    public int field875 = -1;

    @ObfuscatedName("at.au")
    public boolean field863 = true;

    @ObfuscatedName("at.ao")
    public boolean field877 = true;

    @ObfuscatedName("at.am")
    public boolean field856 = false;

    @ObfuscatedName("at.aa")
    public int field879 = 30;

    @ObfuscatedName("k.m(II)Lat;")
    public static class40 method50(int arg0) {
        class40 var1 = (class40) field845.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field855.method3080(9, arg0);
        class40 var3 = new class40();
        var3.field847 = arg0;
        if (var2 != null) {
            var3.method796(new class119(var2));
        }
        var3.method782();
        field845.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.l(I)V")
    public void method782() {
    }

    @ObfuscatedName("at.y(Ldx;B)V")
    public void method796(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method783(arg0, var2);
        }
    }

    @ObfuscatedName("at.u(Ldx;II)V")
    public void method783(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2562();
            this.field857 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field857[var4] = arg0.method2541();
            }
        } else if (arg1 == 2) {
            this.field848 = arg0.method2389();
        } else if (arg1 == 12) {
            this.field876 = arg0.method2562();
        } else if (arg1 == 13) {
            this.field844 = arg0.method2541();
        } else if (arg1 == 14) {
            this.field843 = arg0.method2541();
        } else if (arg1 == 15) {
            this.field852 = arg0.method2541();
        } else if (arg1 == 16) {
            this.field878 = arg0.method2541();
        } else if (arg1 == 17) {
            this.field843 = arg0.method2541();
            this.field854 = arg0.method2541();
            this.field873 = arg0.method2541();
            this.field858 = arg0.method2541();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field874[arg1 - 30] = arg0.method2389();
            if (this.field874[arg1 - 30].equalsIgnoreCase(class157.field2286)) {
                this.field874[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2562();
            this.field859 = new short[var5];
            this.field860 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field859[var6] = (short) arg0.method2541();
                this.field860[var6] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2562();
            this.field861 = new short[var7];
            this.field862 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field861[var8] = (short) arg0.method2541();
                this.field862[var8] = (short) arg0.method2541();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2562();
            this.field851 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field851[var10] = arg0.method2541();
            }
        } else if (arg1 == 93) {
            this.field864 = false;
        } else if (arg1 == 95) {
            this.field865 = arg0.method2541();
        } else if (arg1 == 97) {
            this.field866 = arg0.method2541();
        } else if (arg1 == 98) {
            this.field867 = arg0.method2541();
        } else if (arg1 == 99) {
            this.field868 = true;
        } else if (arg1 == 100) {
            this.field869 = arg0.method2382();
        } else if (arg1 == 101) {
            this.field870 = arg0.method2382() * 5;
        } else if (arg1 == 102) {
            this.field871 = arg0.method2541();
        } else if (arg1 == 103) {
            this.field872 = arg0.method2541();
        } else if (arg1 == 106) {
            this.field853 = arg0.method2541();
            if (this.field853 == 65535) {
                this.field853 = -1;
            }
            this.field875 = arg0.method2541();
            if (this.field875 == 65535) {
                this.field875 = -1;
            }
            int var11 = arg0.method2562();
            this.field849 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field849[var12] = arg0.method2541();
                if (this.field849[var12] == 65535) {
                    this.field849[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field863 = false;
        } else if (arg1 == 109) {
            this.field877 = false;
        } else if (arg1 == 111) {
            this.field856 = true;
        } else if (arg1 == 112) {
            this.field879 = arg0.method2562();
        }
    }

    @ObfuscatedName("at.k(Laf;ILaf;II)Ldb;")
    public final class105 method810(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field849 != null) {
            class40 var5 = this.method786();
            return var5 == null ? null : var5.method810(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field846.method3537((long) this.field847);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field857.length; var8++) {
                if (!Statics.field850.method3095(this.field857[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field857.length];
            for (int var10 = 0; var10 < this.field857.length; var10++) {
                var9[var10] = class100.method2097(Statics.field850, this.field857[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field859 != null) {
                for (int var12 = 0; var12 < this.field859.length; var12++) {
                    var11.method2106(this.field859[var12], this.field860[var12]);
                }
            }
            if (this.field861 != null) {
                for (int var13 = 0; var13 < this.field861.length; var13++) {
                    var11.method2107(this.field861[var13], this.field862[var13]);
                }
            }
            var6 = var11.method2114(this.field869 + 64, this.field870 + 850, -30, -50, -30);
            field846.method3539(var6, (long) this.field847);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method885(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method906(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2203(true);
        } else {
            var14 = arg2.method906(var6, arg3);
        }
        if (this.field866 != 128 || this.field867 != 128) {
            var14.method2224(this.field866, this.field867, this.field866);
        }
        return var14;
    }

    @ObfuscatedName("at.j(I)Lcy;")
    public final class100 method785() {
        if (this.field849 != null) {
            class40 var1 = this.method786();
            return var1 == null ? null : var1.method785();
        } else if (this.field851 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field851.length; var3++) {
                if (!Statics.field850.method3095(this.field851[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field851.length];
            for (int var5 = 0; var5 < this.field851.length; var5++) {
                var4[var5] = class100.method2097(Statics.field850, this.field851[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field859 != null) {
                for (int var7 = 0; var7 < this.field859.length; var7++) {
                    var6.method2106(this.field859[var7], this.field860[var7]);
                }
            }
            if (this.field861 != null) {
                for (int var8 = 0; var8 < this.field861.length; var8++) {
                    var6.method2107(this.field861[var8], this.field862[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("at.i(I)Lat;")
    public final class40 method786() {
        int var1 = -1;
        if (this.field853 != -1) {
            var1 = class176.method2171(this.field853);
        } else if (this.field875 != -1) {
            var1 = class176.field2878[this.field875];
        }
        return var1 < 0 || var1 >= this.field849.length || this.field849[var1] == -1 ? null : method50(this.field849[var1]);
    }

    @ObfuscatedName("at.x(I)Z")
    public boolean method787() {
        if (this.field849 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field853 != -1) {
            var1 = class176.method2171(this.field853);
        } else if (this.field875 != -1) {
            var1 = class176.field2878[this.field875];
        }
        return var1 >= 0 && var1 < this.field849.length && this.field849[var1] != -1;
    }

    @ObfuscatedName("ac.g(B)V")
    public static void method680() {
        field845.method3540();
        field846.method3540();
    }
}
