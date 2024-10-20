package deob;

@ObfuscatedName("aa")
public class class40 extends class205 {

    @ObfuscatedName("aa.m")
    public static class194 field903 = new class194(64);

    @ObfuscatedName("aa.z")
    public static class194 field879 = new class194(50);

    @ObfuscatedName("aa.x")
    public int field899;

    @ObfuscatedName("aa.e")
    public String field868 = "null";

    @ObfuscatedName("aa.i")
    public int field869 = 1;

    @ObfuscatedName("aa.c")
    public int[] field870;

    @ObfuscatedName("aa.n")
    public int[] field871;

    @ObfuscatedName("aa.l")
    public int field872 = -1;

    @ObfuscatedName("aa.u")
    public int field885 = -1;

    @ObfuscatedName("aa.r")
    public int field874 = -1;

    @ObfuscatedName("aa.a")
    public int field875 = -1;

    @ObfuscatedName("aa.d")
    public int field876 = -1;

    @ObfuscatedName("aa.p")
    public int field877 = -1;

    @ObfuscatedName("aa.q")
    public int field878 = -1;

    @ObfuscatedName("aa.b")
    public short[] field867;

    @ObfuscatedName("aa.t")
    public short[] field880;

    @ObfuscatedName("aa.y")
    public short[] field890;

    @ObfuscatedName("aa.w")
    public short[] field882;

    @ObfuscatedName("aa.g")
    public String[] field883 = new String[5];

    @ObfuscatedName("aa.s")
    public boolean field884 = true;

    @ObfuscatedName("aa.k")
    public int field866 = -1;

    @ObfuscatedName("aa.o")
    public int field892 = 128;

    @ObfuscatedName("aa.v")
    public int field887 = 128;

    @ObfuscatedName("aa.f")
    public boolean field865 = false;

    @ObfuscatedName("aa.au")
    public int field889 = 0;

    @ObfuscatedName("aa.aq")
    public int field886 = 0;

    @ObfuscatedName("aa.ab")
    public int field891 = -1;

    @ObfuscatedName("aa.am")
    public int field895 = 32;

    @ObfuscatedName("aa.an")
    public int[] field893;

    @ObfuscatedName("aa.aj")
    public int field894 = -1;

    @ObfuscatedName("aa.ay")
    public int field864 = -1;

    @ObfuscatedName("aa.ao")
    public boolean field881 = true;

    @ObfuscatedName("aa.ag")
    public boolean field897 = true;

    @ObfuscatedName("aa.as")
    public boolean field898 = false;

    @ObfuscatedName("aa.az")
    public int field873 = 30;

    @ObfuscatedName("fr.j(II)Laa;")
    public static class40 method2927(int arg0) {
        class40 var1 = (class40) field903.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field896.method3011(9, arg0);
        class40 var3 = new class40();
        var3.field899 = arg0;
        if (var2 != null) {
            var3.method743(new class120(var2));
        }
        var3.method769();
        field903.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.h(I)V")
    public void method769() {
    }

    @ObfuscatedName("aa.m(Ldx;I)V")
    public void method743(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method767(arg0, var2);
        }
    }

    @ObfuscatedName("aa.z(Ldx;II)V")
    public void method767(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2361();
            this.field870 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field870[var4] = arg0.method2363();
            }
        } else if (arg1 == 2) {
            this.field868 = arg0.method2369();
        } else if (arg1 == 12) {
            this.field869 = arg0.method2361();
        } else if (arg1 == 13) {
            this.field872 = arg0.method2363();
        } else if (arg1 == 14) {
            this.field875 = arg0.method2363();
        } else if (arg1 == 15) {
            this.field885 = arg0.method2363();
        } else if (arg1 == 16) {
            this.field874 = arg0.method2363();
        } else if (arg1 == 17) {
            this.field875 = arg0.method2363();
            this.field876 = arg0.method2363();
            this.field877 = arg0.method2363();
            this.field878 = arg0.method2363();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field883[arg1 - 30] = arg0.method2369();
            if (this.field883[arg1 - 30].equalsIgnoreCase(class158.field2302)) {
                this.field883[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2361();
            this.field867 = new short[var5];
            this.field880 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field867[var6] = (short) arg0.method2363();
                this.field880[var6] = (short) arg0.method2363();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2361();
            this.field890 = new short[var7];
            this.field882 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field890[var8] = (short) arg0.method2363();
                this.field882[var8] = (short) arg0.method2363();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2361();
            this.field871 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field871[var10] = arg0.method2363();
            }
        } else if (arg1 == 93) {
            this.field884 = false;
        } else if (arg1 == 95) {
            this.field866 = arg0.method2363();
        } else if (arg1 == 97) {
            this.field892 = arg0.method2363();
        } else if (arg1 == 98) {
            this.field887 = arg0.method2363();
        } else if (arg1 == 99) {
            this.field865 = true;
        } else if (arg1 == 100) {
            this.field889 = arg0.method2531();
        } else if (arg1 == 101) {
            this.field886 = arg0.method2531();
        } else if (arg1 == 102) {
            this.field891 = arg0.method2363();
        } else if (arg1 == 103) {
            this.field895 = arg0.method2363();
        } else if (arg1 == 106) {
            this.field894 = arg0.method2363();
            if (this.field894 == 65535) {
                this.field894 = -1;
            }
            this.field864 = arg0.method2363();
            if (this.field864 == 65535) {
                this.field864 = -1;
            }
            int var11 = arg0.method2361();
            this.field893 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field893[var12] = arg0.method2363();
                if (this.field893[var12] == 65535) {
                    this.field893[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field881 = false;
        } else if (arg1 == 109) {
            this.field897 = false;
        } else if (arg1 == 111) {
            this.field898 = true;
        } else if (arg1 == 112) {
            this.field873 = arg0.method2361();
        }
    }

    @ObfuscatedName("aa.x(Lae;ILae;II)Ldf;")
    public final class106 method742(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field893 != null) {
            class40 var5 = this.method746();
            return var5 == null ? null : var5.method742(arg0, arg1, arg2, arg3);
        }
        class106 var6 = (class106) field879.method3460((long) this.field899);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field870.length; var8++) {
                if (!Statics.field2913.method3088(this.field870[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field870.length];
            for (int var10 = 0; var10 < this.field870.length; var10++) {
                var9[var10] = class101.method2069(Statics.field2913, this.field870[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field867 != null) {
                for (int var12 = 0; var12 < this.field867.length; var12++) {
                    var11.method2073(this.field867[var12], this.field880[var12]);
                }
            }
            if (this.field890 != null) {
                for (int var13 = 0; var13 < this.field890.length; var13++) {
                    var11.method2085(this.field890[var13], this.field882[var13]);
                }
            }
            var6 = var11.method2089(this.field889 + 64, this.field886 * 5 + 850, -30, -50, -30);
            field879.method3462(var6, (long) this.field899);
        }
        class106 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method843(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method845(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2157(true);
        } else {
            var14 = arg2.method845(var6, arg3);
        }
        if (this.field892 != 128 || this.field887 != 128) {
            var14.method2192(this.field892, this.field887, this.field892);
        }
        return var14;
    }

    @ObfuscatedName("aa.e(I)Lcd;")
    public final class101 method745() {
        if (this.field893 != null) {
            class40 var1 = this.method746();
            return var1 == null ? null : var1.method745();
        } else if (this.field871 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field871.length; var3++) {
                if (!Statics.field2913.method3088(this.field871[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field871.length];
            for (int var5 = 0; var5 < this.field871.length; var5++) {
                var4[var5] = class101.method2069(Statics.field2913, this.field871[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field867 != null) {
                for (int var7 = 0; var7 < this.field867.length; var7++) {
                    var6.method2073(this.field867[var7], this.field880[var7]);
                }
            }
            if (this.field890 != null) {
                for (int var8 = 0; var8 < this.field890.length; var8++) {
                    var6.method2085(this.field890[var8], this.field882[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aa.i(I)Laa;")
    public final class40 method746() {
        int var1 = -1;
        if (this.field894 != -1) {
            var1 = class177.method1227(this.field894);
        } else if (this.field864 != -1) {
            var1 = class177.field2901[this.field864];
        }
        return var1 < 0 || var1 >= this.field893.length || this.field893[var1] == -1 ? null : method2927(this.field893[var1]);
    }

    @ObfuscatedName("aa.c(I)Z")
    public boolean method747() {
        if (this.field893 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field894 != -1) {
            var1 = class177.method1227(this.field894);
        } else if (this.field864 != -1) {
            var1 = class177.field2901[this.field864];
        }
        return var1 >= 0 && var1 < this.field893.length && this.field893[var1] != -1;
    }

    @ObfuscatedName("ag.n(I)V")
    public static void method705() {
        field903.method3463();
        field879.method3463();
    }
}
