package deob;

@ObfuscatedName("af")
public class class40 extends class204 {

    @ObfuscatedName("af.s")
    public static class193 field862 = new class193(64);

    @ObfuscatedName("af.q")
    public static class193 field863 = new class193(50);

    @ObfuscatedName("af.j")
    public int field881;

    @ObfuscatedName("af.k")
    public String field865 = "null";

    @ObfuscatedName("af.i")
    public int field866 = 1;

    @ObfuscatedName("af.m")
    public int[] field886;

    @ObfuscatedName("af.p")
    public int[] field868;

    @ObfuscatedName("af.h")
    public int field867 = -1;

    @ObfuscatedName("af.e")
    public int field890 = -1;

    @ObfuscatedName("af.g")
    public int field871 = -1;

    @ObfuscatedName("af.b")
    public int field872 = -1;

    @ObfuscatedName("af.f")
    public int field896 = -1;

    @ObfuscatedName("af.y")
    public int field874 = -1;

    @ObfuscatedName("af.z")
    public int field875 = -1;

    @ObfuscatedName("af.t")
    public short[] field864;

    @ObfuscatedName("af.o")
    public short[] field870;

    @ObfuscatedName("af.r")
    public short[] field876;

    @ObfuscatedName("af.u")
    public short[] field879;

    @ObfuscatedName("af.v")
    public String[] field877 = new String[5];

    @ObfuscatedName("af.a")
    public boolean field873 = true;

    @ObfuscatedName("af.c")
    public int field882 = -1;

    @ObfuscatedName("af.l")
    public int field883 = 128;

    @ObfuscatedName("af.x")
    public int field884 = 128;

    @ObfuscatedName("af.w")
    public boolean field885 = false;

    @ObfuscatedName("af.aq")
    public int field880 = 0;

    @ObfuscatedName("af.az")
    public int field887 = 0;

    @ObfuscatedName("af.ab")
    public int field888 = -1;

    @ObfuscatedName("af.ac")
    public int field889 = 32;

    @ObfuscatedName("af.ad")
    public int[] field869;

    @ObfuscatedName("af.av")
    public int field891 = -1;

    @ObfuscatedName("af.ar")
    public int field892 = -1;

    @ObfuscatedName("af.al")
    public boolean field893 = true;

    @ObfuscatedName("af.aj")
    public boolean field894 = true;

    @ObfuscatedName("af.au")
    public boolean field895 = false;

    @ObfuscatedName("af.aw")
    public int field878 = 30;

    @ObfuscatedName("ad.n(IB)Laf;")
    public static class40 method639(int arg0) {
        class40 var1 = (class40) field862.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field860.method3010(9, arg0);
        class40 var3 = new class40();
        var3.field881 = arg0;
        if (var2 != null) {
            var3.method739(new class119(var2));
        }
        var3.method738();
        field862.method3481(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.d(I)V")
    public void method738() {
    }

    @ObfuscatedName("af.s(Ldq;I)V")
    public void method739(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method762(arg0, var2);
        }
    }

    @ObfuscatedName("af.q(Ldq;IB)V")
    public void method762(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2338();
            this.field886 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field886[var4] = arg0.method2377();
            }
        } else if (arg1 == 2) {
            this.field865 = arg0.method2492();
        } else if (arg1 == 12) {
            this.field866 = arg0.method2338();
        } else if (arg1 == 13) {
            this.field867 = arg0.method2377();
        } else if (arg1 == 14) {
            this.field872 = arg0.method2377();
        } else if (arg1 == 15) {
            this.field890 = arg0.method2377();
        } else if (arg1 == 16) {
            this.field871 = arg0.method2377();
        } else if (arg1 == 17) {
            this.field872 = arg0.method2377();
            this.field896 = arg0.method2377();
            this.field874 = arg0.method2377();
            this.field875 = arg0.method2377();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field877[arg1 - 30] = arg0.method2492();
            if (this.field877[arg1 - 30].equalsIgnoreCase(class157.field2512)) {
                this.field877[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2338();
            this.field864 = new short[var5];
            this.field870 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field864[var6] = (short) arg0.method2377();
                this.field870[var6] = (short) arg0.method2377();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2338();
            this.field876 = new short[var7];
            this.field879 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field876[var8] = (short) arg0.method2377();
                this.field879[var8] = (short) arg0.method2377();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2338();
            this.field868 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field868[var10] = arg0.method2377();
            }
        } else if (arg1 == 93) {
            this.field873 = false;
        } else if (arg1 == 95) {
            this.field882 = arg0.method2377();
        } else if (arg1 == 97) {
            this.field883 = arg0.method2377();
        } else if (arg1 == 98) {
            this.field884 = arg0.method2377();
        } else if (arg1 == 99) {
            this.field885 = true;
        } else if (arg1 == 100) {
            this.field880 = arg0.method2330();
        } else if (arg1 == 101) {
            this.field887 = arg0.method2330();
        } else if (arg1 == 102) {
            this.field888 = arg0.method2377();
        } else if (arg1 == 103) {
            this.field889 = arg0.method2377();
        } else if (arg1 == 106) {
            this.field891 = arg0.method2377();
            if (this.field891 == 65535) {
                this.field891 = -1;
            }
            this.field892 = arg0.method2377();
            if (this.field892 == 65535) {
                this.field892 = -1;
            }
            int var11 = arg0.method2338();
            this.field869 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field869[var12] = arg0.method2377();
                if (this.field869[var12] == 65535) {
                    this.field869[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field893 = false;
        } else if (arg1 == 109) {
            this.field894 = false;
        } else if (arg1 == 111) {
            this.field895 = true;
        } else if (arg1 == 112) {
            this.field878 = arg0.method2338();
        }
    }

    @ObfuscatedName("af.j(Lat;ILat;IB)Ldb;")
    public final class105 method754(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field869 != null) {
            class40 var5 = this.method742();
            return var5 == null ? null : var5.method754(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field863.method3478((long) this.field881);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field886.length; var8++) {
                if (!Statics.field861.method3012(this.field886[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field886.length];
            for (int var10 = 0; var10 < this.field886.length; var10++) {
                var9[var10] = class100.method2024(Statics.field861, this.field886[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field864 != null) {
                for (int var12 = 0; var12 < this.field864.length; var12++) {
                    var11.method2060(this.field864[var12], this.field870[var12]);
                }
            }
            if (this.field876 != null) {
                for (int var13 = 0; var13 < this.field876.length; var13++) {
                    var11.method2076(this.field876[var13], this.field879[var13]);
                }
            }
            var6 = var11.method2093(this.field880 + 64, this.field887 * 5 + 850, -30, -50, -30);
            field863.method3481(var6, (long) this.field881);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method824(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method840(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2124(true);
        } else {
            var14 = arg2.method840(var6, arg3);
        }
        if (this.field883 != 128 || this.field884 != 128) {
            var14.method2138(this.field883, this.field884, this.field883);
        }
        return var14;
    }

    @ObfuscatedName("af.k(I)Lcl;")
    public final class100 method741() {
        if (this.field869 != null) {
            class40 var1 = this.method742();
            return var1 == null ? null : var1.method741();
        } else if (this.field868 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field868.length; var3++) {
                if (!Statics.field861.method3012(this.field868[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field868.length];
            for (int var5 = 0; var5 < this.field868.length; var5++) {
                var4[var5] = class100.method2024(Statics.field861, this.field868[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field864 != null) {
                for (int var7 = 0; var7 < this.field864.length; var7++) {
                    var6.method2060(this.field864[var7], this.field870[var7]);
                }
            }
            if (this.field876 != null) {
                for (int var8 = 0; var8 < this.field876.length; var8++) {
                    var6.method2076(this.field876[var8], this.field879[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("af.i(I)Laf;")
    public final class40 method742() {
        int var1 = -1;
        if (this.field891 != -1) {
            var1 = class176.method3086(this.field891);
        } else if (this.field892 != -1) {
            var1 = class176.field2886[this.field892];
        }
        return var1 < 0 || var1 >= this.field869.length || this.field869[var1] == -1 ? null : method639(this.field869[var1]);
    }

    @ObfuscatedName("af.m(B)Z")
    public boolean method743() {
        if (this.field869 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field891 != -1) {
            var1 = class176.method3086(this.field891);
        } else if (this.field892 != -1) {
            var1 = class176.field2886[this.field892];
        }
        return var1 >= 0 && var1 < this.field869.length && this.field869[var1] != -1;
    }
}
