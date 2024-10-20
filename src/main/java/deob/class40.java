package deob;

@ObfuscatedName("ay")
public class class40 extends class205 {

    @ObfuscatedName("ay.j")
    public static class194 field862 = new class194(64);

    @ObfuscatedName("ay.d")
    public static class194 field863 = new class194(50);

    @ObfuscatedName("ay.x")
    public int field868;

    @ObfuscatedName("ay.y")
    public String field865 = "null";

    @ObfuscatedName("ay.r")
    public int field866 = 1;

    @ObfuscatedName("ay.c")
    public int[] field897;

    @ObfuscatedName("ay.l")
    public int[] field888;

    @ObfuscatedName("ay.u")
    public int field869 = -1;

    @ObfuscatedName("ay.p")
    public int field870 = -1;

    @ObfuscatedName("ay.n")
    public int field861 = -1;

    @ObfuscatedName("ay.w")
    public int field872 = -1;

    @ObfuscatedName("ay.z")
    public int field895 = -1;

    @ObfuscatedName("ay.k")
    public int field874 = -1;

    @ObfuscatedName("ay.o")
    public int field867 = -1;

    @ObfuscatedName("ay.t")
    public short[] field876;

    @ObfuscatedName("ay.h")
    public short[] field864;

    @ObfuscatedName("ay.v")
    public short[] field878;

    @ObfuscatedName("ay.a")
    public short[] field879;

    @ObfuscatedName("ay.f")
    public String[] field880 = new String[5];

    @ObfuscatedName("ay.q")
    public boolean field881 = true;

    @ObfuscatedName("ay.m")
    public int field882 = -1;

    @ObfuscatedName("ay.s")
    public int field886 = 128;

    @ObfuscatedName("ay.i")
    public int field884 = 128;

    @ObfuscatedName("ay.e")
    public boolean field877 = false;

    @ObfuscatedName("ay.aw")
    public int field873 = 0;

    @ObfuscatedName("ay.an")
    public int field860 = 0;

    @ObfuscatedName("ay.ag")
    public int field871 = -1;

    @ObfuscatedName("ay.ae")
    public int field892 = 32;

    @ObfuscatedName("ay.aj")
    public int[] field890;

    @ObfuscatedName("ay.ah")
    public int field891 = -1;

    @ObfuscatedName("ay.af")
    public int field875 = -1;

    @ObfuscatedName("ay.az")
    public boolean field893 = true;

    @ObfuscatedName("ay.ax")
    public boolean field889 = true;

    @ObfuscatedName("ay.ac")
    public boolean field894 = false;

    @ObfuscatedName("ay.ar")
    public int field896 = 30;

    @ObfuscatedName("client.b(Lfl;Lfl;I)V")
    public static void method544(class168 arg0, class168 arg1) {
        Statics.field887 = arg0;
        Statics.field885 = arg1;
    }

    @ObfuscatedName("ff.g(IS)Lay;")
    public static class40 method3225(int arg0) {
        class40 var1 = (class40) field862.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field887.method3037(9, arg0);
        class40 var3 = new class40();
        var3.field868 = arg0;
        if (var2 != null) {
            var3.method770(new class120(var2));
        }
        var3.method749();
        field862.method3490(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.j(I)V")
    public void method749() {
    }

    @ObfuscatedName("ay.d(Lds;B)V")
    public void method770(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method761(arg0, var2);
        }
    }

    @ObfuscatedName("ay.x(Lds;IB)V")
    public void method761(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2344();
            this.field897 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field897[var4] = arg0.method2346();
            }
        } else if (arg1 == 2) {
            this.field865 = arg0.method2352();
        } else if (arg1 == 12) {
            this.field866 = arg0.method2344();
        } else if (arg1 == 13) {
            this.field869 = arg0.method2346();
        } else if (arg1 == 14) {
            this.field872 = arg0.method2346();
        } else if (arg1 == 15) {
            this.field870 = arg0.method2346();
        } else if (arg1 == 16) {
            this.field861 = arg0.method2346();
        } else if (arg1 == 17) {
            this.field872 = arg0.method2346();
            this.field895 = arg0.method2346();
            this.field874 = arg0.method2346();
            this.field867 = arg0.method2346();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field880[arg1 - 30] = arg0.method2352();
            if (this.field880[arg1 - 30].equalsIgnoreCase(class158.field2300)) {
                this.field880[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2344();
            this.field876 = new short[var5];
            this.field864 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field876[var6] = (short) arg0.method2346();
                this.field864[var6] = (short) arg0.method2346();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2344();
            this.field878 = new short[var7];
            this.field879 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field878[var8] = (short) arg0.method2346();
                this.field879[var8] = (short) arg0.method2346();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2344();
            this.field888 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field888[var10] = arg0.method2346();
            }
        } else if (arg1 == 93) {
            this.field881 = false;
        } else if (arg1 == 95) {
            this.field882 = arg0.method2346();
        } else if (arg1 == 97) {
            this.field886 = arg0.method2346();
        } else if (arg1 == 98) {
            this.field884 = arg0.method2346();
        } else if (arg1 == 99) {
            this.field877 = true;
        } else if (arg1 == 100) {
            this.field873 = arg0.method2345();
        } else if (arg1 == 101) {
            this.field860 = arg0.method2345();
        } else if (arg1 == 102) {
            this.field871 = arg0.method2346();
        } else if (arg1 == 103) {
            this.field892 = arg0.method2346();
        } else if (arg1 == 106) {
            this.field891 = arg0.method2346();
            if (this.field891 == 65535) {
                this.field891 = -1;
            }
            this.field875 = arg0.method2346();
            if (this.field875 == 65535) {
                this.field875 = -1;
            }
            int var11 = arg0.method2344();
            this.field890 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field890[var12] = arg0.method2346();
                if (this.field890[var12] == 65535) {
                    this.field890[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field893 = false;
        } else if (arg1 == 109) {
            this.field889 = false;
        } else if (arg1 == 111) {
            this.field894 = true;
        } else if (arg1 == 112) {
            this.field896 = arg0.method2344();
        }
    }

    @ObfuscatedName("ay.y(Lau;ILau;II)Ldd;")
    public final class106 method752(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field890 != null) {
            class40 var5 = this.method754();
            return var5 == null ? null : var5.method752(arg0, arg1, arg2, arg3);
        }
        class106 var6 = (class106) field863.method3495((long) this.field868);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field897.length; var8++) {
                if (!Statics.field885.method3039(this.field897[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field897.length];
            for (int var10 = 0; var10 < this.field897.length; var10++) {
                var9[var10] = class101.method2051(Statics.field885, this.field897[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field876 != null) {
                for (int var12 = 0; var12 < this.field876.length; var12++) {
                    var11.method2064(this.field876[var12], this.field864[var12]);
                }
            }
            if (this.field878 != null) {
                for (int var13 = 0; var13 < this.field878.length; var13++) {
                    var11.method2065(this.field878[var13], this.field879[var13]);
                }
            }
            var6 = var11.method2072(this.field873 + 64, this.field860 * 5 + 850, -30, -50, -30);
            field863.method3490(var6, (long) this.field868);
        }
        class106 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method853(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method875(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2139(true);
        } else {
            var14 = arg2.method875(var6, arg3);
        }
        if (this.field886 != 128 || this.field884 != 128) {
            var14.method2153(this.field886, this.field884, this.field886);
        }
        return var14;
    }

    @ObfuscatedName("ay.r(I)Lch;")
    public final class101 method774() {
        if (this.field890 != null) {
            class40 var1 = this.method754();
            return var1 == null ? null : var1.method774();
        } else if (this.field888 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field888.length; var3++) {
                if (!Statics.field885.method3039(this.field888[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field888.length];
            for (int var5 = 0; var5 < this.field888.length; var5++) {
                var4[var5] = class101.method2051(Statics.field885, this.field888[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field876 != null) {
                for (int var7 = 0; var7 < this.field876.length; var7++) {
                    var6.method2064(this.field876[var7], this.field864[var7]);
                }
            }
            if (this.field878 != null) {
                for (int var8 = 0; var8 < this.field878.length; var8++) {
                    var6.method2065(this.field878[var8], this.field879[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ay.c(I)Lay;")
    public final class40 method754() {
        int var1 = -1;
        if (this.field891 != -1) {
            var1 = class177.method89(this.field891);
        } else if (this.field875 != -1) {
            var1 = class177.field2897[this.field875];
        }
        return var1 < 0 || var1 >= this.field890.length || this.field890[var1] == -1 ? null : method3225(this.field890[var1]);
    }

    @ObfuscatedName("ay.l(I)Z")
    public boolean method750() {
        if (this.field890 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field891 != -1) {
            var1 = class177.method89(this.field891);
        } else if (this.field875 != -1) {
            var1 = class177.field2897[this.field875];
        }
        return var1 >= 0 && var1 < this.field890.length && this.field890[var1] != -1;
    }
}
