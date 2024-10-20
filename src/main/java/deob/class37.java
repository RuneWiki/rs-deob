package deob;

@ObfuscatedName("ap")
public class class37 extends class195 {

    @ObfuscatedName("ap.a")
    public static class184 field848 = new class184(64);

    @ObfuscatedName("ap.w")
    public static class184 field880 = new class184(50);

    @ObfuscatedName("ap.m")
    public int field858;

    @ObfuscatedName("ap.h")
    public String field851 = "null";

    @ObfuscatedName("ap.i")
    public int field852 = 1;

    @ObfuscatedName("ap.r")
    public int[] field878;

    @ObfuscatedName("ap.l")
    public int[] field854;

    @ObfuscatedName("ap.f")
    public int field855 = -1;

    @ObfuscatedName("ap.e")
    public int field863 = -1;

    @ObfuscatedName("ap.z")
    public int field868 = -1;

    @ObfuscatedName("ap.v")
    public int field886 = -1;

    @ObfuscatedName("ap.x")
    public int field859 = -1;

    @ObfuscatedName("ap.q")
    public int field860 = -1;

    @ObfuscatedName("ap.b")
    public int field861 = -1;

    @ObfuscatedName("ap.u")
    public short[] field871;

    @ObfuscatedName("ap.t")
    public short[] field850;

    @ObfuscatedName("ap.s")
    public short[] field864;

    @ObfuscatedName("ap.p")
    public short[] field865;

    @ObfuscatedName("ap.d")
    public String[] field866 = new String[5];

    @ObfuscatedName("ap.j")
    public boolean field867 = true;

    @ObfuscatedName("ap.k")
    public int field884 = -1;

    @ObfuscatedName("ap.y")
    public int field862 = 128;

    @ObfuscatedName("ap.c")
    public int field846 = 128;

    @ObfuscatedName("ap.g")
    public boolean field849 = false;

    @ObfuscatedName("ap.av")
    public int field872 = 0;

    @ObfuscatedName("ap.ag")
    public int field873 = 0;

    @ObfuscatedName("ap.aq")
    public int field874 = -1;

    @ObfuscatedName("ap.an")
    public int field853 = 32;

    @ObfuscatedName("ap.ao")
    public int[] field876;

    @ObfuscatedName("ap.aj")
    public int field877 = -1;

    @ObfuscatedName("ap.ax")
    public int field856 = -1;

    @ObfuscatedName("ap.ac")
    public boolean field879 = true;

    @ObfuscatedName("ap.al")
    public boolean field857 = true;

    @ObfuscatedName("ap.au")
    public boolean field881 = false;

    @ObfuscatedName("ap.ap")
    public int field882 = 30;

    @ObfuscatedName("x.n(II)Lap;")
    public static class37 method141(int arg0) {
        class37 var1 = (class37) field848.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field883.method2925(9, arg0);
        class37 var3 = new class37();
        var3.field858 = arg0;
        if (var2 != null) {
            var3.method674(new class111(var2));
        }
        var3.method668();
        field848.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.o(I)V")
    public void method668() {
    }

    @ObfuscatedName("ap.a(Ldl;B)V")
    public void method674(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method666(arg0, var2);
        }
    }

    @ObfuscatedName("ap.w(Ldl;II)V")
    public void method666(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2234();
            this.field878 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field878[var4] = arg0.method2236();
            }
        } else if (arg1 == 2) {
            this.field851 = arg0.method2242();
        } else if (arg1 == 12) {
            this.field852 = arg0.method2234();
        } else if (arg1 == 13) {
            this.field855 = arg0.method2236();
        } else if (arg1 == 14) {
            this.field886 = arg0.method2236();
        } else if (arg1 == 15) {
            this.field863 = arg0.method2236();
        } else if (arg1 == 16) {
            this.field868 = arg0.method2236();
        } else if (arg1 == 17) {
            this.field886 = arg0.method2236();
            this.field859 = arg0.method2236();
            this.field860 = arg0.method2236();
            this.field861 = arg0.method2236();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field866[arg1 - 30] = arg0.method2242();
            if (this.field866[arg1 - 30].equalsIgnoreCase(class148.field2214)) {
                this.field866[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2234();
            this.field871 = new short[var5];
            this.field850 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field871[var6] = (short) arg0.method2236();
                this.field850[var6] = (short) arg0.method2236();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2234();
            this.field864 = new short[var7];
            this.field865 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field864[var8] = (short) arg0.method2236();
                this.field865[var8] = (short) arg0.method2236();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2234();
            this.field854 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field854[var10] = arg0.method2236();
            }
        } else if (arg1 == 93) {
            this.field867 = false;
        } else if (arg1 == 95) {
            this.field884 = arg0.method2236();
        } else if (arg1 == 97) {
            this.field862 = arg0.method2236();
        } else if (arg1 == 98) {
            this.field846 = arg0.method2236();
        } else if (arg1 == 99) {
            this.field849 = true;
        } else if (arg1 == 100) {
            this.field872 = arg0.method2235();
        } else if (arg1 == 101) {
            this.field873 = arg0.method2235();
        } else if (arg1 == 102) {
            this.field874 = arg0.method2236();
        } else if (arg1 == 103) {
            this.field853 = arg0.method2236();
        } else if (arg1 == 106) {
            this.field877 = arg0.method2236();
            if (this.field877 == 65535) {
                this.field877 = -1;
            }
            this.field856 = arg0.method2236();
            if (this.field856 == 65535) {
                this.field856 = -1;
            }
            int var11 = arg0.method2234();
            this.field876 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field876[var12] = arg0.method2236();
                if (this.field876[var12] == 65535) {
                    this.field876[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field879 = false;
        } else if (arg1 == 109) {
            this.field857 = false;
        } else if (arg1 == 111) {
            this.field881 = true;
        } else if (arg1 == 112) {
            this.field882 = arg0.method2234();
        }
    }

    @ObfuscatedName("ap.m(Lae;ILae;II)Lcp;")
    public final class100 method667(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field876 != null) {
            class37 var5 = this.method663();
            return var5 == null ? null : var5.method667(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field880.method3373((long) this.field858);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field878.length; var8++) {
                if (!Statics.field847.method2995(this.field878[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field878.length];
            for (int var10 = 0; var10 < this.field878.length; var10++) {
                var9[var10] = class95.method2050(Statics.field847, this.field878[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field871 != null) {
                for (int var12 = 0; var12 < this.field871.length; var12++) {
                    var11.method1985(this.field871[var12], this.field850[var12]);
                }
            }
            if (this.field864 != null) {
                for (int var13 = 0; var13 < this.field864.length; var13++) {
                    var11.method1986(this.field864[var13], this.field865[var13]);
                }
            }
            var6 = var11.method2033(this.field872 + 64, this.field873 * 5 + 850, -30, -50, -30);
            field880.method3372(var6, (long) this.field858);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method771(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method777(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2078(true);
        } else {
            var14 = arg2.method777(var6, arg3);
        }
        if (this.field862 != 128 || this.field846 != 128) {
            var14.method2091(this.field862, this.field846, this.field862);
        }
        return var14;
    }

    @ObfuscatedName("ap.h(B)Lcz;")
    public final class95 method684() {
        if (this.field876 != null) {
            class37 var1 = this.method663();
            return var1 == null ? null : var1.method684();
        } else if (this.field854 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field854.length; var3++) {
                if (!Statics.field847.method2995(this.field854[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field854.length];
            for (int var5 = 0; var5 < this.field854.length; var5++) {
                var4[var5] = class95.method2050(Statics.field847, this.field854[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field871 != null) {
                for (int var7 = 0; var7 < this.field871.length; var7++) {
                    var6.method1985(this.field871[var7], this.field850[var7]);
                }
            }
            if (this.field864 != null) {
                for (int var8 = 0; var8 < this.field864.length; var8++) {
                    var6.method1986(this.field864[var8], this.field865[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ap.i(I)Lap;")
    public final class37 method663() {
        int var1 = -1;
        if (this.field877 != -1) {
            var1 = class167.method792(this.field877);
        } else if (this.field856 != -1) {
            var1 = class167.field2811[this.field856];
        }
        return var1 < 0 || var1 >= this.field876.length || this.field876[var1] == -1 ? null : method141(this.field876[var1]);
    }

    @ObfuscatedName("ap.r(I)Z")
    public boolean method670() {
        if (this.field876 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field877 != -1) {
            var1 = class167.method792(this.field877);
        } else if (this.field856 != -1) {
            var1 = class167.field2811[this.field856];
        }
        return var1 >= 0 && var1 < this.field876.length && this.field876[var1] != -1;
    }
}
