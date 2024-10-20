package deob;

@ObfuscatedName("ar")
public class class35 extends class180 {

    @ObfuscatedName("ar.a")
    public static class170 field785 = new class170(64);

    @ObfuscatedName("ar.g")
    public static class170 field819 = new class170(50);

    @ObfuscatedName("ar.u")
    public int field787;

    @ObfuscatedName("ar.k")
    public String field790 = "null";

    @ObfuscatedName("ar.m")
    public int field791 = 1;

    @ObfuscatedName("ar.t")
    public int[] field792;

    @ObfuscatedName("ar.l")
    public int[] field793;

    @ObfuscatedName("ar.f")
    public int field822 = -1;

    @ObfuscatedName("ar.c")
    public int field795 = -1;

    @ObfuscatedName("ar.i")
    public int field794 = -1;

    @ObfuscatedName("ar.o")
    public int field797 = -1;

    @ObfuscatedName("ar.d")
    public int field796 = -1;

    @ObfuscatedName("ar.b")
    public int field786 = -1;

    @ObfuscatedName("ar.v")
    public int field800 = -1;

    @ObfuscatedName("ar.n")
    public short[] field801;

    @ObfuscatedName("ar.w")
    public short[] field802;

    @ObfuscatedName("ar.z")
    public short[] field803;

    @ObfuscatedName("ar.x")
    public short[] field804;

    @ObfuscatedName("ar.q")
    public String[] field799 = new String[5];

    @ObfuscatedName("ar.s")
    public boolean field806 = true;

    @ObfuscatedName("ar.j")
    public int field807 = -1;

    @ObfuscatedName("ar.y")
    public int field808 = 128;

    @ObfuscatedName("ar.r")
    public int field809 = 128;

    @ObfuscatedName("ar.h")
    public boolean field810 = false;

    @ObfuscatedName("ar.ak")
    public int field813 = 0;

    @ObfuscatedName("ar.ab")
    public int field812 = 0;

    @ObfuscatedName("ar.as")
    public int field788 = -1;

    @ObfuscatedName("ar.aq")
    public int field814 = 32;

    @ObfuscatedName("ar.ai")
    public int[] field798;

    @ObfuscatedName("ar.aw")
    public int field816 = -1;

    @ObfuscatedName("ar.aj")
    public int field817 = -1;

    @ObfuscatedName("ar.ax")
    public boolean field818 = true;

    @ObfuscatedName("ar.ar")
    public boolean field789 = true;

    @ObfuscatedName("ar.ac")
    public boolean field820 = false;

    @ObfuscatedName("d.e(IB)Lar;")
    public static class35 method131(int arg0) {
        class35 var1 = (class35) field785.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field811.method2717(9, arg0);
        class35 var3 = new class35();
        var3.field787 = arg0;
        if (var2 != null) {
            var3.method621(new class107(var2));
        }
        var3.method643();
        field785.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.p(B)V")
    public void method643() {
    }

    @ObfuscatedName("ar.a(Ldp;B)V")
    public void method621(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method622(arg0, var2);
        }
    }

    @ObfuscatedName("ar.g(Ldp;II)V")
    public void method622(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2125();
            this.field792 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field792[var4] = arg0.method2182();
            }
        } else if (arg1 == 2) {
            this.field790 = arg0.method2149();
        } else if (arg1 == 12) {
            this.field791 = arg0.method2125();
        } else if (arg1 == 13) {
            this.field822 = arg0.method2182();
        } else if (arg1 == 14) {
            this.field797 = arg0.method2182();
        } else if (arg1 == 15) {
            this.field795 = arg0.method2182();
        } else if (arg1 == 16) {
            this.field794 = arg0.method2182();
        } else if (arg1 == 17) {
            this.field797 = arg0.method2182();
            this.field796 = arg0.method2182();
            this.field786 = arg0.method2182();
            this.field800 = arg0.method2182();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field799[arg1 - 30] = arg0.method2149();
            if (this.field799[arg1 - 30].equalsIgnoreCase(class142.field2147)) {
                this.field799[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2125();
            this.field801 = new short[var5];
            this.field802 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field801[var6] = (short) arg0.method2182();
                this.field802[var6] = (short) arg0.method2182();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2125();
            this.field803 = new short[var7];
            this.field804 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field803[var8] = (short) arg0.method2182();
                this.field804[var8] = (short) arg0.method2182();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2125();
            this.field793 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field793[var10] = arg0.method2182();
            }
        } else if (arg1 == 93) {
            this.field806 = false;
        } else if (arg1 == 95) {
            this.field807 = arg0.method2182();
        } else if (arg1 == 97) {
            this.field808 = arg0.method2182();
        } else if (arg1 == 98) {
            this.field809 = arg0.method2182();
        } else if (arg1 == 99) {
            this.field810 = true;
        } else if (arg1 == 100) {
            this.field813 = arg0.method2201();
        } else if (arg1 == 101) {
            this.field812 = arg0.method2201() * 5;
        } else if (arg1 == 102) {
            this.field788 = arg0.method2182();
        } else if (arg1 == 103) {
            this.field814 = arg0.method2182();
        } else if (arg1 == 106) {
            this.field816 = arg0.method2182();
            if (this.field816 == 65535) {
                this.field816 = -1;
            }
            this.field817 = arg0.method2182();
            if (this.field817 == 65535) {
                this.field817 = -1;
            }
            int var11 = arg0.method2125();
            this.field798 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field798[var12] = arg0.method2182();
                if (this.field798[var12] == 65535) {
                    this.field798[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field818 = false;
        } else if (arg1 == 109) {
            this.field789 = false;
        } else if (arg1 == 111) {
            this.field820 = true;
        }
    }

    @ObfuscatedName("ar.u(Laz;ILaz;II)Lcs;")
    public final class98 method634(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field798 != null) {
            class35 var5 = this.method623();
            return var5 == null ? null : var5.method634(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field819.method3166((long) this.field787);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field792.length; var8++) {
                if (!Statics.field805.method2719(this.field792[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field792.length];
            for (int var10 = 0; var10 < this.field792.length; var10++) {
                var9[var10] = class93.method1960(Statics.field805, this.field792[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field801 != null) {
                for (int var12 = 0; var12 < this.field801.length; var12++) {
                    var11.method1892(this.field801[var12], this.field802[var12]);
                }
            }
            if (this.field803 != null) {
                for (int var13 = 0; var13 < this.field803.length; var13++) {
                    var11.method1904(this.field803[var13], this.field804[var13]);
                }
            }
            var6 = var11.method1911(this.field813 + 64, this.field812 + 850, -30, -50, -30);
            field819.method3161(var6, (long) this.field787);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method731(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method728(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1985(true);
        } else {
            var14 = arg2.method728(var6, arg3);
        }
        if (this.field808 != 128 || this.field809 != 128) {
            var14.method1999(this.field808, this.field809, this.field808);
        }
        return var14;
    }

    @ObfuscatedName("ar.k(B)Lcw;")
    public final class93 method629() {
        if (this.field798 != null) {
            class35 var1 = this.method623();
            return var1 == null ? null : var1.method629();
        } else if (this.field793 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field793.length; var3++) {
                if (!Statics.field805.method2719(this.field793[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field793.length];
            for (int var5 = 0; var5 < this.field793.length; var5++) {
                var4[var5] = class93.method1960(Statics.field805, this.field793[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field801 != null) {
                for (int var7 = 0; var7 < this.field801.length; var7++) {
                    var6.method1892(this.field801[var7], this.field802[var7]);
                }
            }
            if (this.field803 != null) {
                for (int var8 = 0; var8 < this.field803.length; var8++) {
                    var6.method1904(this.field803[var8], this.field804[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ar.m(I)Lar;")
    public final class35 method623() {
        int var1 = -1;
        if (this.field816 != -1) {
            var1 = class153.method3431(this.field816);
        } else if (this.field817 != -1) {
            var1 = class153.field2645[this.field817];
        }
        return var1 < 0 || var1 >= this.field798.length || this.field798[var1] == -1 ? null : method131(this.field798[var1]);
    }

    @ObfuscatedName("ar.t(I)Z")
    public boolean method638() {
        if (this.field798 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field816 != -1) {
            var1 = class153.method3431(this.field816);
        } else if (this.field817 != -1) {
            var1 = class153.field2645[this.field817];
        }
        return var1 >= 0 && var1 < this.field798.length && this.field798[var1] != -1;
    }

    @ObfuscatedName("s.l(I)V")
    public static void method503() {
        field785.method3162();
        field819.method3162();
    }
}
