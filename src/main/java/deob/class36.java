package deob;

@ObfuscatedName("ab")
public class class36 extends class185 {

    @ObfuscatedName("ab.k")
    public static class174 field804 = new class174(64);

    @ObfuscatedName("ab.g")
    public static class174 field805 = new class174(50);

    @ObfuscatedName("ab.q")
    public int field806;

    @ObfuscatedName("ab.l")
    public String field841 = "null";

    @ObfuscatedName("ab.a")
    public int field808 = 1;

    @ObfuscatedName("ab.b")
    public int[] field827;

    @ObfuscatedName("ab.z")
    public int[] field823;

    @ObfuscatedName("ab.w")
    public int field811 = -1;

    @ObfuscatedName("ab.j")
    public int field831 = -1;

    @ObfuscatedName("ab.p")
    public int field813 = -1;

    @ObfuscatedName("ab.n")
    public int field814 = -1;

    @ObfuscatedName("ab.r")
    public int field815 = -1;

    @ObfuscatedName("ab.s")
    public int field810 = -1;

    @ObfuscatedName("ab.f")
    public int field812 = -1;

    @ObfuscatedName("ab.c")
    public short[] field818;

    @ObfuscatedName("ab.t")
    public short[] field819;

    @ObfuscatedName("ab.i")
    public short[] field822;

    @ObfuscatedName("ab.u")
    public short[] field821;

    @ObfuscatedName("ab.y")
    public String[] field838 = new String[5];

    @ObfuscatedName("ab.o")
    public boolean field820 = true;

    @ObfuscatedName("ab.m")
    public int field824 = -1;

    @ObfuscatedName("ab.h")
    public int field825 = 128;

    @ObfuscatedName("ab.x")
    public int field826 = 128;

    @ObfuscatedName("ab.d")
    public boolean field839 = false;

    @ObfuscatedName("ab.ac")
    public int field828 = 0;

    @ObfuscatedName("ab.ax")
    public int field802 = 0;

    @ObfuscatedName("ab.af")
    public int field807 = -1;

    @ObfuscatedName("ab.am")
    public int field803 = 32;

    @ObfuscatedName("ab.ah")
    public int[] field832;

    @ObfuscatedName("ab.ar")
    public int field833 = -1;

    @ObfuscatedName("ab.ad")
    public int field834 = -1;

    @ObfuscatedName("ab.ao")
    public boolean field835 = true;

    @ObfuscatedName("ab.ae")
    public boolean field836 = true;

    @ObfuscatedName("ab.ab")
    public boolean field837 = false;

    @ObfuscatedName("ab.ai")
    public int field830 = 30;

    @ObfuscatedName("ad.e(II)Lab;")
    public static class36 method571(int arg0) {
        class36 var1 = (class36) field804.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field817.method2721(9, arg0);
        class36 var3 = new class36();
        var3.field806 = arg0;
        if (var2 != null) {
            var3.method627(new class108(var2));
        }
        var3.method596();
        field804.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.v(S)V")
    public void method596() {
    }

    @ObfuscatedName("ab.k(Ldd;I)V")
    public void method627(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method598(arg0, var2);
        }
    }

    @ObfuscatedName("ab.g(Ldd;II)V")
    public void method598(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2122();
            this.field827 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field827[var4] = arg0.method2124();
            }
        } else if (arg1 == 2) {
            this.field841 = arg0.method2130();
        } else if (arg1 == 12) {
            this.field808 = arg0.method2122();
        } else if (arg1 == 13) {
            this.field811 = arg0.method2124();
        } else if (arg1 == 14) {
            this.field814 = arg0.method2124();
        } else if (arg1 == 15) {
            this.field831 = arg0.method2124();
        } else if (arg1 == 16) {
            this.field813 = arg0.method2124();
        } else if (arg1 == 17) {
            this.field814 = arg0.method2124();
            this.field815 = arg0.method2124();
            this.field810 = arg0.method2124();
            this.field812 = arg0.method2124();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field838[arg1 - 30] = arg0.method2130();
            if (this.field838[arg1 - 30].equalsIgnoreCase(class145.field2335)) {
                this.field838[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2122();
            this.field818 = new short[var5];
            this.field819 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field818[var6] = (short) arg0.method2124();
                this.field819[var6] = (short) arg0.method2124();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2122();
            this.field822 = new short[var7];
            this.field821 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field822[var8] = (short) arg0.method2124();
                this.field821[var8] = (short) arg0.method2124();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2122();
            this.field823 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field823[var10] = arg0.method2124();
            }
        } else if (arg1 == 93) {
            this.field820 = false;
        } else if (arg1 == 95) {
            this.field824 = arg0.method2124();
        } else if (arg1 == 97) {
            this.field825 = arg0.method2124();
        } else if (arg1 == 98) {
            this.field826 = arg0.method2124();
        } else if (arg1 == 99) {
            this.field839 = true;
        } else if (arg1 == 100) {
            this.field828 = arg0.method2190();
        } else if (arg1 == 101) {
            this.field802 = arg0.method2190();
        } else if (arg1 == 102) {
            this.field807 = arg0.method2124();
        } else if (arg1 == 103) {
            this.field803 = arg0.method2124();
        } else if (arg1 == 106) {
            this.field833 = arg0.method2124();
            if (this.field833 == 65535) {
                this.field833 = -1;
            }
            this.field834 = arg0.method2124();
            if (this.field834 == 65535) {
                this.field834 = -1;
            }
            int var11 = arg0.method2122();
            this.field832 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field832[var12] = arg0.method2124();
                if (this.field832[var12] == 65535) {
                    this.field832[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field835 = false;
        } else if (arg1 == 109) {
            this.field836 = false;
        } else if (arg1 == 111) {
            this.field837 = true;
        } else if (arg1 == 112) {
            this.field830 = arg0.method2122();
        }
    }

    @ObfuscatedName("ab.q(Lap;ILap;II)Lcu;")
    public final class99 method599(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field832 != null) {
            class36 var5 = this.method611();
            return var5 == null ? null : var5.method599(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field805.method3154((long) this.field806);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field827.length; var8++) {
                if (!Statics.field809.method2767(this.field827[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field827.length];
            for (int var10 = 0; var10 < this.field827.length; var10++) {
                var9[var10] = class94.method1890(Statics.field809, this.field827[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field818 != null) {
                for (int var12 = 0; var12 < this.field818.length; var12++) {
                    var11.method1901(this.field818[var12], this.field819[var12]);
                }
            }
            if (this.field822 != null) {
                for (int var13 = 0; var13 < this.field822.length; var13++) {
                    var11.method1902(this.field822[var13], this.field821[var13]);
                }
            }
            var6 = var11.method1909(this.field828 + 64, this.field802 * 5 + 850, -30, -50, -30);
            field805.method3156(var6, (long) this.field806);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method706(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method712(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1996(true);
        } else {
            var14 = arg2.method712(var6, arg3);
        }
        if (this.field825 != 128 || this.field826 != 128) {
            var14.method1983(this.field825, this.field826, this.field825);
        }
        return var14;
    }

    @ObfuscatedName("ab.l(I)Lcd;")
    public final class94 method620() {
        if (this.field832 != null) {
            class36 var1 = this.method611();
            return var1 == null ? null : var1.method620();
        } else if (this.field823 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field823.length; var3++) {
                if (!Statics.field809.method2767(this.field823[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field823.length];
            for (int var5 = 0; var5 < this.field823.length; var5++) {
                var4[var5] = class94.method1890(Statics.field809, this.field823[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field818 != null) {
                for (int var7 = 0; var7 < this.field818.length; var7++) {
                    var6.method1901(this.field818[var7], this.field819[var7]);
                }
            }
            if (this.field822 != null) {
                for (int var8 = 0; var8 < this.field822.length; var8++) {
                    var6.method1902(this.field822[var8], this.field821[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ab.a(I)Lab;")
    public final class36 method611() {
        int var1 = -1;
        if (this.field833 != -1) {
            var1 = class157.method82(this.field833);
        } else if (this.field834 != -1) {
            var1 = class157.field2678[this.field834];
        }
        return var1 < 0 || var1 >= this.field832.length || this.field832[var1] == -1 ? null : method571(this.field832[var1]);
    }

    @ObfuscatedName("ab.b(I)Z")
    public boolean method609() {
        if (this.field832 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field833 != -1) {
            var1 = class157.method82(this.field833);
        } else if (this.field834 != -1) {
            var1 = class157.field2678[this.field834];
        }
        return var1 >= 0 && var1 < this.field832.length && this.field832[var1] != -1;
    }

    @ObfuscatedName("q.z(I)V")
    public static void method32() {
        field804.method3157();
        field805.method3157();
    }
}
