package deob;

@ObfuscatedName("ae")
public class class31 extends class174 {

    @ObfuscatedName("ae.p")
    public static class170 field784 = new class170(64);

    @ObfuscatedName("ae.z")
    public static class170 field796 = new class170(50);

    @ObfuscatedName("ae.m")
    public int field779;

    @ObfuscatedName("ae.k")
    public String field780 = "null";

    @ObfuscatedName("ae.v")
    public int field781 = 1;

    @ObfuscatedName("ae.y")
    public int[] field782;

    @ObfuscatedName("ae.d")
    public int[] field777;

    @ObfuscatedName("ae.l")
    public int field809 = -1;

    @ObfuscatedName("ae.h")
    public int field785 = -1;

    @ObfuscatedName("ae.b")
    public int field786 = -1;

    @ObfuscatedName("ae.r")
    public int field787 = -1;

    @ObfuscatedName("ae.t")
    public int field788 = -1;

    @ObfuscatedName("ae.u")
    public int field789 = -1;

    @ObfuscatedName("ae.g")
    public int field790 = -1;

    @ObfuscatedName("ae.e")
    public short[] field791;

    @ObfuscatedName("ae.n")
    public short[] field792;

    @ObfuscatedName("ae.o")
    public short[] field783;

    @ObfuscatedName("ae.a")
    public short[] field794;

    @ObfuscatedName("ae.f")
    public String[] field806 = new String[5];

    @ObfuscatedName("ae.s")
    public boolean field776 = true;

    @ObfuscatedName("ae.w")
    public int field807 = -1;

    @ObfuscatedName("ae.x")
    public int field798 = 128;

    @ObfuscatedName("ae.j")
    public int field797 = 128;

    @ObfuscatedName("ae.i")
    public boolean field775 = false;

    @ObfuscatedName("ae.ap")
    public int field801 = 0;

    @ObfuscatedName("ae.am")
    public int field799 = 0;

    @ObfuscatedName("ae.ao")
    public int field803 = -1;

    @ObfuscatedName("ae.af")
    public int field804 = 32;

    @ObfuscatedName("ae.ae")
    public int[] field805;

    @ObfuscatedName("ae.az")
    public int field800 = -1;

    @ObfuscatedName("ae.al")
    public int field802 = -1;

    @ObfuscatedName("ae.ak")
    public boolean field808 = true;

    @ObfuscatedName("ae.ac")
    public boolean field778 = true;

    @ObfuscatedName("h.q(Ley;Ley;I)V")
    public static void method100(class153 arg0, class153 arg1) {
        Statics.field793 = arg0;
        Statics.field795 = arg1;
    }

    @ObfuscatedName("ao.c(II)Lae;")
    public static class31 method561(int arg0) {
        class31 var1 = (class31) field784.method3215((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field793.method2952(9, arg0);
        class31 var3 = new class31();
        var3.field779 = arg0;
        if (var2 != null) {
            var3.method607(new class127(var2));
        }
        var3.method606();
        field784.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.p(I)V")
    public void method606() {
    }

    @ObfuscatedName("ae.z(Ldo;B)V")
    public void method607(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method608(arg0, var2);
        }
    }

    @ObfuscatedName("ae.m(Ldo;IB)V")
    public void method608(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2534();
            this.field782 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field782[var4] = arg0.method2427();
            }
        } else if (arg1 == 2) {
            this.field780 = arg0.method2460();
        } else if (arg1 == 12) {
            this.field781 = arg0.method2534();
        } else if (arg1 == 13) {
            this.field809 = arg0.method2427();
        } else if (arg1 == 14) {
            this.field787 = arg0.method2427();
        } else if (arg1 == 15) {
            this.field785 = arg0.method2427();
        } else if (arg1 == 16) {
            this.field786 = arg0.method2427();
        } else if (arg1 == 17) {
            this.field787 = arg0.method2427();
            this.field788 = arg0.method2427();
            this.field789 = arg0.method2427();
            this.field790 = arg0.method2427();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field806[arg1 - 30] = arg0.method2460();
            if (this.field806[arg1 - 30].equalsIgnoreCase(class135.field2108)) {
                this.field806[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2534();
            this.field791 = new short[var5];
            this.field792 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field791[var6] = (short) arg0.method2427();
                this.field792[var6] = (short) arg0.method2427();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2534();
            this.field783 = new short[var7];
            this.field794 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field783[var8] = (short) arg0.method2427();
                this.field794[var8] = (short) arg0.method2427();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2534();
            this.field777 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field777[var10] = arg0.method2427();
            }
        } else if (arg1 == 93) {
            this.field776 = false;
        } else if (arg1 == 95) {
            this.field807 = arg0.method2427();
        } else if (arg1 == 97) {
            this.field798 = arg0.method2427();
        } else if (arg1 == 98) {
            this.field797 = arg0.method2427();
        } else if (arg1 == 99) {
            this.field775 = true;
        } else if (arg1 == 100) {
            this.field801 = arg0.method2426();
        } else if (arg1 == 101) {
            this.field799 = arg0.method2426();
        } else if (arg1 == 102) {
            this.field803 = arg0.method2427();
        } else if (arg1 == 103) {
            this.field804 = arg0.method2427();
        } else if (arg1 == 106) {
            this.field800 = arg0.method2427();
            if (this.field800 == 65535) {
                this.field800 = -1;
            }
            this.field802 = arg0.method2427();
            if (this.field802 == 65535) {
                this.field802 = -1;
            }
            int var11 = arg0.method2534();
            this.field805 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field805[var12] = arg0.method2427();
                if (this.field805[var12] == 65535) {
                    this.field805[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field808 = false;
        } else if (arg1 == 109) {
            this.field778 = false;
        }
    }

    @ObfuscatedName("ae.k(Lak;ILak;II)Ldn;")
    public final class112 method629(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field805 != null) {
            class31 var5 = this.method611();
            return var5 == null ? null : var5.method629(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field796.method3215((long) this.field779);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field782.length; var8++) {
                if (!Statics.field795.method2971(this.field782[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field782.length];
            for (int var10 = 0; var10 < this.field782.length; var10++) {
                var9[var10] = class101.method2039(Statics.field795, this.field782[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field791 != null) {
                for (int var12 = 0; var12 < this.field791.length; var12++) {
                    var11.method2072(this.field791[var12], this.field792[var12]);
                }
            }
            if (this.field783 != null) {
                for (int var13 = 0; var13 < this.field783.length; var13++) {
                    var11.method2042(this.field783[var13], this.field794[var13]);
                }
            }
            var6 = var11.method2049(this.field801 + 64, this.field799 * 5 + 850, -30, -50, -30);
            field796.method3225(var6, (long) this.field779);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method713(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method710(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2210(true);
        } else {
            var14 = arg2.method710(var6, arg3);
        }
        if (this.field798 != 128 || this.field797 != 128) {
            var14.method2236(this.field798, this.field797, this.field798);
        }
        return var14;
    }

    @ObfuscatedName("ae.v(I)Lcy;")
    public final class101 method610() {
        if (this.field805 != null) {
            class31 var1 = this.method611();
            return var1 == null ? null : var1.method610();
        } else if (this.field777 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field777.length; var3++) {
                if (!Statics.field795.method2971(this.field777[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field777.length];
            for (int var5 = 0; var5 < this.field777.length; var5++) {
                var4[var5] = class101.method2039(Statics.field795, this.field777[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field791 != null) {
                for (int var7 = 0; var7 < this.field791.length; var7++) {
                    var6.method2072(this.field791[var7], this.field792[var7]);
                }
            }
            if (this.field783 != null) {
                for (int var8 = 0; var8 < this.field783.length; var8++) {
                    var6.method2042(this.field783[var8], this.field794[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ae.y(I)Lae;")
    public final class31 method611() {
        int var1 = -1;
        if (this.field800 != -1) {
            var1 = class160.method2965(this.field800);
        } else if (this.field802 != -1) {
            var1 = class160.field2731[this.field802];
        }
        return var1 < 0 || var1 >= this.field805.length || this.field805[var1] == -1 ? null : method561(this.field805[var1]);
    }

    @ObfuscatedName("ae.d(B)Z")
    public boolean method612() {
        if (this.field805 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field800 != -1) {
            var1 = class160.method2965(this.field800);
        } else if (this.field802 != -1) {
            var1 = class160.field2731[this.field802];
        }
        return var1 >= 0 && var1 < this.field805.length && this.field805[var1] != -1;
    }

    @ObfuscatedName("d.l(B)V")
    public static void method84() {
        field784.method3218();
        field796.method3218();
    }
}
