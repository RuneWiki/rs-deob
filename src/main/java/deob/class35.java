package deob;

@ObfuscatedName("aj")
public class class35 extends class182 {

    @ObfuscatedName("aj.i")
    public static class171 field787 = new class171(64);

    @ObfuscatedName("aj.p")
    public static class171 field788 = new class171(50);

    @ObfuscatedName("aj.c")
    public int field803;

    @ObfuscatedName("aj.y")
    public String field790 = "null";

    @ObfuscatedName("aj.g")
    public int field791 = 1;

    @ObfuscatedName("aj.l")
    public int[] field806;

    @ObfuscatedName("aj.h")
    public int[] field822;

    @ObfuscatedName("aj.n")
    public int field794 = -1;

    @ObfuscatedName("aj.w")
    public int field795 = -1;

    @ObfuscatedName("aj.m")
    public int field799 = -1;

    @ObfuscatedName("aj.x")
    public int field797 = -1;

    @ObfuscatedName("aj.b")
    public int field798 = -1;

    @ObfuscatedName("aj.u")
    public int field807 = -1;

    @ObfuscatedName("aj.r")
    public int field800 = -1;

    @ObfuscatedName("aj.z")
    public short[] field801;

    @ObfuscatedName("aj.v")
    public short[] field802;

    @ObfuscatedName("aj.k")
    public short[] field804;

    @ObfuscatedName("aj.a")
    public short[] field823;

    @ObfuscatedName("aj.d")
    public String[] field805 = new String[5];

    @ObfuscatedName("aj.j")
    public boolean field816 = true;

    @ObfuscatedName("aj.s")
    public int field810 = -1;

    @ObfuscatedName("aj.f")
    public int field808 = 128;

    @ObfuscatedName("aj.e")
    public int field809 = 128;

    @ObfuscatedName("aj.q")
    public boolean field818 = false;

    @ObfuscatedName("aj.al")
    public int field811 = 0;

    @ObfuscatedName("aj.ao")
    public int field793 = 0;

    @ObfuscatedName("aj.ap")
    public int field813 = -1;

    @ObfuscatedName("aj.aa")
    public int field814 = 32;

    @ObfuscatedName("aj.ak")
    public int[] field815;

    @ObfuscatedName("aj.ah")
    public int field796 = -1;

    @ObfuscatedName("aj.as")
    public int field817 = -1;

    @ObfuscatedName("aj.aw")
    public boolean field786 = true;

    @ObfuscatedName("aj.aj")
    public boolean field819 = true;

    @ObfuscatedName("aj.af")
    public boolean field820 = false;

    @ObfuscatedName("aj.am")
    public int field821 = 30;

    @ObfuscatedName("client.t(IS)Laj;")
    public static class35 method454(int arg0) {
        class35 var1 = (class35) field787.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2650.method2668(9, arg0);
        class35 var3 = new class35();
        var3.field803 = arg0;
        if (var2 != null) {
            var3.method607(new class107(var2));
        }
        var3.method613();
        field787.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.o(I)V")
    public void method613() {
    }

    @ObfuscatedName("aj.i(Ldg;I)V")
    public void method607(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method606(arg0, var2);
        }
    }

    @ObfuscatedName("aj.p(Ldg;II)V")
    public void method606(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2118();
            this.field806 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field806[var4] = arg0.method2120();
            }
        } else if (arg1 == 2) {
            this.field790 = arg0.method2126();
        } else if (arg1 == 12) {
            this.field791 = arg0.method2118();
        } else if (arg1 == 13) {
            this.field794 = arg0.method2120();
        } else if (arg1 == 14) {
            this.field797 = arg0.method2120();
        } else if (arg1 == 15) {
            this.field795 = arg0.method2120();
        } else if (arg1 == 16) {
            this.field799 = arg0.method2120();
        } else if (arg1 == 17) {
            this.field797 = arg0.method2120();
            this.field798 = arg0.method2120();
            this.field807 = arg0.method2120();
            this.field800 = arg0.method2120();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field805[arg1 - 30] = arg0.method2126();
            if (this.field805[arg1 - 30].equalsIgnoreCase(class142.field2121)) {
                this.field805[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2118();
            this.field801 = new short[var5];
            this.field802 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field801[var6] = (short) arg0.method2120();
                this.field802[var6] = (short) arg0.method2120();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2118();
            this.field804 = new short[var7];
            this.field823 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field804[var8] = (short) arg0.method2120();
                this.field823[var8] = (short) arg0.method2120();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2118();
            this.field822 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field822[var10] = arg0.method2120();
            }
        } else if (arg1 == 93) {
            this.field816 = false;
        } else if (arg1 == 95) {
            this.field810 = arg0.method2120();
        } else if (arg1 == 97) {
            this.field808 = arg0.method2120();
        } else if (arg1 == 98) {
            this.field809 = arg0.method2120();
        } else if (arg1 == 99) {
            this.field818 = true;
        } else if (arg1 == 100) {
            this.field811 = arg0.method2253();
        } else if (arg1 == 101) {
            this.field793 = arg0.method2253();
        } else if (arg1 == 102) {
            this.field813 = arg0.method2120();
        } else if (arg1 == 103) {
            this.field814 = arg0.method2120();
        } else if (arg1 == 106) {
            this.field796 = arg0.method2120();
            if (this.field796 == 65535) {
                this.field796 = -1;
            }
            this.field817 = arg0.method2120();
            if (this.field817 == 65535) {
                this.field817 = -1;
            }
            int var11 = arg0.method2118();
            this.field815 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field815[var12] = arg0.method2120();
                if (this.field815[var12] == 65535) {
                    this.field815[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field786 = false;
        } else if (arg1 == 109) {
            this.field819 = false;
        } else if (arg1 == 111) {
            this.field820 = true;
        } else if (arg1 == 112) {
            this.field821 = arg0.method2118();
        }
    }

    @ObfuscatedName("aj.c(Lab;ILab;IB)Lcx;")
    public final class98 method609(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field815 != null) {
            class35 var5 = this.method611();
            return var5 == null ? null : var5.method609(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field788.method3099((long) this.field803);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field806.length; var8++) {
                if (!Statics.field792.method2670(this.field806[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field806.length];
            for (int var10 = 0; var10 < this.field806.length; var10++) {
                var9[var10] = class93.method1883(Statics.field792, this.field806[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field801 != null) {
                for (int var12 = 0; var12 < this.field801.length; var12++) {
                    var11.method1924(this.field801[var12], this.field802[var12]);
                }
            }
            if (this.field804 != null) {
                for (int var13 = 0; var13 < this.field804.length; var13++) {
                    var11.method1945(this.field804[var13], this.field823[var13]);
                }
            }
            var6 = var11.method1917(this.field811 + 64, this.field793 * 5 + 850, -30, -50, -30);
            field788.method3101(var6, (long) this.field803);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method713(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method710(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1971(true);
        } else {
            var14 = arg2.method710(var6, arg3);
        }
        if (this.field808 != 128 || this.field809 != 128) {
            var14.method2018(this.field808, this.field809, this.field808);
        }
        return var14;
    }

    @ObfuscatedName("aj.y(I)Lcd;")
    public final class93 method623() {
        if (this.field815 != null) {
            class35 var1 = this.method611();
            return var1 == null ? null : var1.method623();
        } else if (this.field822 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field822.length; var3++) {
                if (!Statics.field792.method2670(this.field822[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field822.length];
            for (int var5 = 0; var5 < this.field822.length; var5++) {
                var4[var5] = class93.method1883(Statics.field792, this.field822[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field801 != null) {
                for (int var7 = 0; var7 < this.field801.length; var7++) {
                    var6.method1924(this.field801[var7], this.field802[var7]);
                }
            }
            if (this.field804 != null) {
                for (int var8 = 0; var8 < this.field804.length; var8++) {
                    var6.method1945(this.field804[var8], this.field823[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aj.g(B)Laj;")
    public final class35 method611() {
        int var1 = -1;
        if (this.field796 != -1) {
            var1 = Statics.method2786(this.field796);
        } else if (this.field817 != -1) {
            var1 = class154.field2642[this.field817];
        }
        return var1 < 0 || var1 >= this.field815.length || this.field815[var1] == -1 ? null : method454(this.field815[var1]);
    }

    @ObfuscatedName("aj.l(I)Z")
    public boolean method612() {
        if (this.field815 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field796 != -1) {
            var1 = Statics.method2786(this.field796);
        } else if (this.field817 != -1) {
            var1 = class154.field2642[this.field817];
        }
        return var1 >= 0 && var1 < this.field815.length && this.field815[var1] != -1;
    }

    @ObfuscatedName("a.h(S)V")
    public static void method478() {
        field787.method3104();
        field788.method3104();
    }
}
