package deob;

@ObfuscatedName("ar")
public class class35 extends class182 {

    @ObfuscatedName("ar.f")
    public static class171 field784 = new class171(64);

    @ObfuscatedName("ar.e")
    public static class171 field793 = new class171(50);

    @ObfuscatedName("ar.d")
    public int field785;

    @ObfuscatedName("ar.n")
    public String field787 = "null";

    @ObfuscatedName("ar.v")
    public int field789 = 1;

    @ObfuscatedName("ar.z")
    public int[] field794;

    @ObfuscatedName("ar.j")
    public int[] field800;

    @ObfuscatedName("ar.u")
    public int field791 = -1;

    @ObfuscatedName("ar.g")
    public int field792 = -1;

    @ObfuscatedName("ar.a")
    public int field818 = -1;

    @ObfuscatedName("ar.c")
    public int field802 = -1;

    @ObfuscatedName("ar.w")
    public int field795 = -1;

    @ObfuscatedName("ar.l")
    public int field786 = -1;

    @ObfuscatedName("ar.q")
    public int field797 = -1;

    @ObfuscatedName("ar.x")
    public short[] field798;

    @ObfuscatedName("ar.p")
    public short[] field799;

    @ObfuscatedName("ar.y")
    public short[] field796;

    @ObfuscatedName("ar.r")
    public short[] field801;

    @ObfuscatedName("ar.k")
    public String[] field816 = new String[5];

    @ObfuscatedName("ar.b")
    public boolean field803 = true;

    @ObfuscatedName("ar.h")
    public int field804 = -1;

    @ObfuscatedName("ar.i")
    public int field782 = 128;

    @ObfuscatedName("ar.o")
    public int field806 = 128;

    @ObfuscatedName("ar.m")
    public boolean field807 = false;

    @ObfuscatedName("ar.ak")
    public int field808 = 0;

    @ObfuscatedName("ar.aw")
    public int field809 = 0;

    @ObfuscatedName("ar.af")
    public int field810 = -1;

    @ObfuscatedName("ar.ab")
    public int field811 = 32;

    @ObfuscatedName("ar.ao")
    public int[] field817;

    @ObfuscatedName("ar.ah")
    public int field813 = -1;

    @ObfuscatedName("ar.ae")
    public int field790 = -1;

    @ObfuscatedName("ar.ax")
    public boolean field815 = true;

    @ObfuscatedName("ar.ar")
    public boolean field805 = true;

    @ObfuscatedName("ar.aq")
    public boolean field788 = false;

    @ObfuscatedName("ar.am")
    public int field812 = 30;

    @ObfuscatedName("u.t(II)Lar;")
    public static class35 method121(int arg0) {
        class35 var1 = (class35) field784.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field814.method2709(9, arg0);
        class35 var3 = new class35();
        var3.field785 = arg0;
        if (var2 != null) {
            var3.method594(new class107(var2));
        }
        var3.method604();
        field784.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.s(B)V")
    public void method604() {
    }

    @ObfuscatedName("ar.f(Ldb;I)V")
    public void method594(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method595(arg0, var2);
        }
    }

    @ObfuscatedName("ar.e(Ldb;II)V")
    public void method595(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2101();
            this.field794 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field794[var4] = arg0.method2103();
            }
        } else if (arg1 == 2) {
            this.field787 = arg0.method2109();
        } else if (arg1 == 12) {
            this.field789 = arg0.method2101();
        } else if (arg1 == 13) {
            this.field791 = arg0.method2103();
        } else if (arg1 == 14) {
            this.field802 = arg0.method2103();
        } else if (arg1 == 15) {
            this.field792 = arg0.method2103();
        } else if (arg1 == 16) {
            this.field818 = arg0.method2103();
        } else if (arg1 == 17) {
            this.field802 = arg0.method2103();
            this.field795 = arg0.method2103();
            this.field786 = arg0.method2103();
            this.field797 = arg0.method2103();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field816[arg1 - 30] = arg0.method2109();
            if (this.field816[arg1 - 30].equalsIgnoreCase(class142.field2229)) {
                this.field816[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2101();
            this.field798 = new short[var5];
            this.field799 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field798[var6] = (short) arg0.method2103();
                this.field799[var6] = (short) arg0.method2103();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2101();
            this.field796 = new short[var7];
            this.field801 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field796[var8] = (short) arg0.method2103();
                this.field801[var8] = (short) arg0.method2103();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2101();
            this.field800 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field800[var10] = arg0.method2103();
            }
        } else if (arg1 == 93) {
            this.field803 = false;
        } else if (arg1 == 95) {
            this.field804 = arg0.method2103();
        } else if (arg1 == 97) {
            this.field782 = arg0.method2103();
        } else if (arg1 == 98) {
            this.field806 = arg0.method2103();
        } else if (arg1 == 99) {
            this.field807 = true;
        } else if (arg1 == 100) {
            this.field808 = arg0.method2102();
        } else if (arg1 == 101) {
            this.field809 = arg0.method2102();
        } else if (arg1 == 102) {
            this.field810 = arg0.method2103();
        } else if (arg1 == 103) {
            this.field811 = arg0.method2103();
        } else if (arg1 == 106) {
            this.field813 = arg0.method2103();
            if (this.field813 == 65535) {
                this.field813 = -1;
            }
            this.field790 = arg0.method2103();
            if (this.field790 == 65535) {
                this.field790 = -1;
            }
            int var11 = arg0.method2101();
            this.field817 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field817[var12] = arg0.method2103();
                if (this.field817[var12] == 65535) {
                    this.field817[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field815 = false;
        } else if (arg1 == 109) {
            this.field805 = false;
        } else if (arg1 == 111) {
            this.field788 = true;
        } else if (arg1 == 112) {
            this.field812 = arg0.method2101();
        }
    }

    @ObfuscatedName("ar.d(Laz;ILaz;IB)Lcc;")
    public final class98 method596(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field817 != null) {
            class35 var5 = this.method593();
            return var5 == null ? null : var5.method596(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field793.method3170((long) this.field785);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field794.length; var8++) {
                if (!Statics.field783.method2740(this.field794[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field794.length];
            for (int var10 = 0; var10 < this.field794.length; var10++) {
                var9[var10] = class93.method1872(Statics.field783, this.field794[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field798 != null) {
                for (int var12 = 0; var12 < this.field798.length; var12++) {
                    var11.method1864(this.field798[var12], this.field799[var12]);
                }
            }
            if (this.field796 != null) {
                for (int var13 = 0; var13 < this.field796.length; var13++) {
                    var11.method1865(this.field796[var13], this.field801[var13]);
                }
            }
            var6 = var11.method1871(this.field808 + 64, this.field809 * 5 + 850, -30, -50, -30);
            field793.method3168(var6, (long) this.field785);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method695(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method703(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1975(true);
        } else {
            var14 = arg2.method703(var6, arg3);
        }
        if (this.field782 != 128 || this.field806 != 128) {
            var14.method1957(this.field782, this.field806, this.field782);
        }
        return var14;
    }

    @ObfuscatedName("ar.n(B)Lca;")
    public final class93 method598() {
        if (this.field817 != null) {
            class35 var1 = this.method593();
            return var1 == null ? null : var1.method598();
        } else if (this.field800 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field800.length; var3++) {
                if (!Statics.field783.method2740(this.field800[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field800.length];
            for (int var5 = 0; var5 < this.field800.length; var5++) {
                var4[var5] = class93.method1872(Statics.field783, this.field800[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field798 != null) {
                for (int var7 = 0; var7 < this.field798.length; var7++) {
                    var6.method1864(this.field798[var7], this.field799[var7]);
                }
            }
            if (this.field796 != null) {
                for (int var8 = 0; var8 < this.field796.length; var8++) {
                    var6.method1865(this.field796[var8], this.field801[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ar.v(B)Lar;")
    public final class35 method593() {
        int var1 = -1;
        if (this.field813 != -1) {
            var1 = class154.method2402(this.field813);
        } else if (this.field790 != -1) {
            var1 = class154.field2650[this.field790];
        }
        return var1 < 0 || var1 >= this.field817.length || this.field817[var1] == -1 ? null : method121(this.field817[var1]);
    }

    @ObfuscatedName("ar.z(B)Z")
    public boolean method599() {
        if (this.field817 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field813 != -1) {
            var1 = class154.method2402(this.field813);
        } else if (this.field790 != -1) {
            var1 = class154.field2650[this.field790];
        }
        return var1 >= 0 && var1 < this.field817.length && this.field817[var1] != -1;
    }
}
