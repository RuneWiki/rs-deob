package deob;

@ObfuscatedName("ay")
public class class37 extends class194 {

    @ObfuscatedName("ay.l")
    public static class183 field792 = new class183(64);

    @ObfuscatedName("ay.c")
    public static class183 field797 = new class183(50);

    @ObfuscatedName("ay.u")
    public int field794;

    @ObfuscatedName("ay.w")
    public String field795 = "null";

    @ObfuscatedName("ay.i")
    public int field796 = 1;

    @ObfuscatedName("ay.r")
    public int[] field809;

    @ObfuscatedName("ay.f")
    public int[] field816;

    @ObfuscatedName("ay.g")
    public int field799 = -1;

    @ObfuscatedName("ay.o")
    public int field800 = -1;

    @ObfuscatedName("ay.h")
    public int field801 = -1;

    @ObfuscatedName("ay.s")
    public int field802 = -1;

    @ObfuscatedName("ay.j")
    public int field803 = -1;

    @ObfuscatedName("ay.m")
    public int field804 = -1;

    @ObfuscatedName("ay.t")
    public int field826 = -1;

    @ObfuscatedName("ay.z")
    public short[] field808;

    @ObfuscatedName("ay.y")
    public short[] field806;

    @ObfuscatedName("ay.q")
    public short[] field820;

    @ObfuscatedName("ay.d")
    public short[] field805;

    @ObfuscatedName("ay.b")
    public String[] field814 = new String[5];

    @ObfuscatedName("ay.x")
    public boolean field811 = true;

    @ObfuscatedName("ay.n")
    public int field812 = -1;

    @ObfuscatedName("ay.v")
    public int field813 = 128;

    @ObfuscatedName("ay.p")
    public int field818 = 128;

    @ObfuscatedName("ay.k")
    public boolean field815 = false;

    @ObfuscatedName("ay.ax")
    public int field810 = 0;

    @ObfuscatedName("ay.ap")
    public int field817 = 0;

    @ObfuscatedName("ay.ao")
    public int field827 = -1;

    @ObfuscatedName("ay.ai")
    public int field819 = 32;

    @ObfuscatedName("ay.aw")
    public int[] field807;

    @ObfuscatedName("ay.am")
    public int field821 = -1;

    @ObfuscatedName("ay.au")
    public int field822 = -1;

    @ObfuscatedName("ay.ae")
    public boolean field823 = true;

    @ObfuscatedName("ay.ab")
    public boolean field790 = true;

    @ObfuscatedName("ay.av")
    public boolean field825 = false;

    @ObfuscatedName("ay.ay")
    public int field824 = 30;

    @ObfuscatedName("ar.e(IB)Lay;")
    public static class37 method843(int arg0) {
        class37 var1 = (class37) field792.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field798.method2843(9, arg0);
        class37 var3 = new class37();
        var3.field794 = arg0;
        if (var2 != null) {
            var3.method650(new class111(var2));
        }
        var3.method661();
        field792.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.a(I)V")
    public void method661() {
    }

    @ObfuscatedName("ay.l(Ldh;I)V")
    public void method650(class111 arg0) {
        while (true) {
            int var2 = arg0.method2176();
            if (var2 == 0) {
                return;
            }
            this.method651(arg0, var2);
        }
    }

    @ObfuscatedName("ay.c(Ldh;II)V")
    public void method651(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2176();
            this.field809 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field809[var4] = arg0.method2178();
            }
        } else if (arg1 == 2) {
            this.field795 = arg0.method2167();
        } else if (arg1 == 12) {
            this.field796 = arg0.method2176();
        } else if (arg1 == 13) {
            this.field799 = arg0.method2178();
        } else if (arg1 == 14) {
            this.field802 = arg0.method2178();
        } else if (arg1 == 15) {
            this.field800 = arg0.method2178();
        } else if (arg1 == 16) {
            this.field801 = arg0.method2178();
        } else if (arg1 == 17) {
            this.field802 = arg0.method2178();
            this.field803 = arg0.method2178();
            this.field804 = arg0.method2178();
            this.field826 = arg0.method2178();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field814[arg1 - 30] = arg0.method2167();
            if (this.field814[arg1 - 30].equalsIgnoreCase(class148.field2162)) {
                this.field814[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2176();
            this.field808 = new short[var5];
            this.field806 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field808[var6] = (short) arg0.method2178();
                this.field806[var6] = (short) arg0.method2178();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2176();
            this.field820 = new short[var7];
            this.field805 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field820[var8] = (short) arg0.method2178();
                this.field805[var8] = (short) arg0.method2178();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2176();
            this.field816 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field816[var10] = arg0.method2178();
            }
        } else if (arg1 == 93) {
            this.field811 = false;
        } else if (arg1 == 95) {
            this.field812 = arg0.method2178();
        } else if (arg1 == 97) {
            this.field813 = arg0.method2178();
        } else if (arg1 == 98) {
            this.field818 = arg0.method2178();
        } else if (arg1 == 99) {
            this.field815 = true;
        } else if (arg1 == 100) {
            this.field810 = arg0.method2162();
        } else if (arg1 == 101) {
            this.field817 = arg0.method2162() * 5;
        } else if (arg1 == 102) {
            this.field827 = arg0.method2178();
        } else if (arg1 == 103) {
            this.field819 = arg0.method2178();
        } else if (arg1 == 106) {
            this.field821 = arg0.method2178();
            if (this.field821 == 65535) {
                this.field821 = -1;
            }
            this.field822 = arg0.method2178();
            if (this.field822 == 65535) {
                this.field822 = -1;
            }
            int var11 = arg0.method2176();
            this.field807 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field807[var12] = arg0.method2178();
                if (this.field807[var12] == 65535) {
                    this.field807[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field823 = false;
        } else if (arg1 == 109) {
            this.field790 = false;
        } else if (arg1 == 111) {
            this.field825 = true;
        } else if (arg1 == 112) {
            this.field824 = arg0.method2176();
        }
    }

    @ObfuscatedName("ay.u(Lah;ILah;IB)Lcy;")
    public final class100 method648(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field807 != null) {
            class37 var5 = this.method654();
            return var5 == null ? null : var5.method648(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field797.method3302((long) this.field794);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field809.length; var8++) {
                if (!Statics.field791.method2856(this.field809[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field809.length];
            for (int var10 = 0; var10 < this.field809.length; var10++) {
                var9[var10] = class95.method1937(Statics.field791, this.field809[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field808 != null) {
                for (int var12 = 0; var12 < this.field808.length; var12++) {
                    var11.method1936(this.field808[var12], this.field806[var12]);
                }
            }
            if (this.field820 != null) {
                for (int var13 = 0; var13 < this.field820.length; var13++) {
                    var11.method1951(this.field820[var13], this.field805[var13]);
                }
            }
            var6 = var11.method1957(this.field810 + 64, this.field817 + 850, -30, -50, -30);
            field797.method3304(var6, (long) this.field794);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method747(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method749(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2058(true);
        } else {
            var14 = arg2.method749(var6, arg3);
        }
        if (this.field813 != 128 || this.field818 != 128) {
            var14.method2031(this.field813, this.field818, this.field813);
        }
        return var14;
    }

    @ObfuscatedName("ay.w(B)Lcr;")
    public final class95 method653() {
        if (this.field807 != null) {
            class37 var1 = this.method654();
            return var1 == null ? null : var1.method653();
        } else if (this.field816 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field816.length; var3++) {
                if (!Statics.field791.method2856(this.field816[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field816.length];
            for (int var5 = 0; var5 < this.field816.length; var5++) {
                var4[var5] = class95.method1937(Statics.field791, this.field816[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field808 != null) {
                for (int var7 = 0; var7 < this.field808.length; var7++) {
                    var6.method1936(this.field808[var7], this.field806[var7]);
                }
            }
            if (this.field820 != null) {
                for (int var8 = 0; var8 < this.field820.length; var8++) {
                    var6.method1951(this.field820[var8], this.field805[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ay.i(I)Lay;")
    public final class37 method654() {
        int var1 = -1;
        if (this.field821 != -1) {
            var1 = class166.method40(this.field821);
        } else if (this.field822 != -1) {
            var1 = class166.field2753[this.field822];
        }
        return var1 < 0 || var1 >= this.field807.length || this.field807[var1] == -1 ? null : method843(this.field807[var1]);
    }

    @ObfuscatedName("ay.r(I)Z")
    public boolean method655() {
        if (this.field807 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field821 != -1) {
            var1 = class166.method40(this.field821);
        } else if (this.field822 != -1) {
            var1 = class166.field2753[this.field822];
        }
        return var1 >= 0 && var1 < this.field807.length && this.field807[var1] != -1;
    }

    @ObfuscatedName("by.f(I)V")
    public static void method1439() {
        field792.method3303();
        field797.method3303();
    }
}
