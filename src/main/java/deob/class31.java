package deob;

@ObfuscatedName("ax")
public class class31 extends class174 {

    @ObfuscatedName("ax.s")
    public static class170 field787 = new class170(64);

    @ObfuscatedName("ax.o")
    public static class170 field782 = new class170(50);

    @ObfuscatedName("ax.p")
    public int field784;

    @ObfuscatedName("ax.x")
    public String field785 = "null";

    @ObfuscatedName("ax.k")
    public int field794 = 1;

    @ObfuscatedName("ax.r")
    public int[] field793;

    @ObfuscatedName("ax.z")
    public int[] field788;

    @ObfuscatedName("ax.n")
    public int field797 = -1;

    @ObfuscatedName("ax.j")
    public int field803 = -1;

    @ObfuscatedName("ax.b")
    public int field791 = -1;

    @ObfuscatedName("ax.t")
    public int field792 = -1;

    @ObfuscatedName("ax.q")
    public int field780 = -1;

    @ObfuscatedName("ax.e")
    public int field783 = -1;

    @ObfuscatedName("ax.l")
    public int field795 = -1;

    @ObfuscatedName("ax.u")
    public short[] field796;

    @ObfuscatedName("ax.m")
    public short[] field786;

    @ObfuscatedName("ax.a")
    public short[] field798;

    @ObfuscatedName("ax.f")
    public short[] field799;

    @ObfuscatedName("ax.y")
    public String[] field800 = new String[5];

    @ObfuscatedName("ax.v")
    public boolean field801 = true;

    @ObfuscatedName("ax.w")
    public int field802 = -1;

    @ObfuscatedName("ax.d")
    public int field808 = 128;

    @ObfuscatedName("ax.i")
    public int field807 = 128;

    @ObfuscatedName("ax.c")
    public boolean field805 = false;

    @ObfuscatedName("ax.af")
    public int field806 = 0;

    @ObfuscatedName("ax.aq")
    public int field790 = 0;

    @ObfuscatedName("ax.at")
    public int field789 = -1;

    @ObfuscatedName("ax.aw")
    public int field809 = 32;

    @ObfuscatedName("ax.ax")
    public int[] field810;

    @ObfuscatedName("ax.ak")
    public int field811 = -1;

    @ObfuscatedName("ax.ar")
    public int field812 = -1;

    @ObfuscatedName("ax.az")
    public boolean field813 = true;

    @ObfuscatedName("ax.ai")
    public boolean field814 = true;

    @ObfuscatedName("n.g(Leu;Leu;B)V")
    public static void method105(class153 arg0, class153 arg1) {
        Statics.field804 = arg0;
        Statics.field781 = arg1;
    }

    @ObfuscatedName("ah.h(II)Lax;")
    public static class31 method898(int arg0) {
        class31 var1 = (class31) field787.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field804.method3080(9, arg0);
        class31 var3 = new class31();
        var3.field784 = arg0;
        if (var2 != null) {
            var3.method608(new class127(var2));
        }
        var3.method607();
        field787.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.s(I)V")
    public void method607() {
    }

    @ObfuscatedName("ax.o(Ldw;B)V")
    public void method608(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method609(arg0, var2);
        }
    }

    @ObfuscatedName("ax.p(Ldw;II)V")
    public void method609(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2499();
            this.field793 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field793[var4] = arg0.method2501();
            }
        } else if (arg1 == 2) {
            this.field785 = arg0.method2507();
        } else if (arg1 == 12) {
            this.field794 = arg0.method2499();
        } else if (arg1 == 13) {
            this.field797 = arg0.method2501();
        } else if (arg1 == 14) {
            this.field792 = arg0.method2501();
        } else if (arg1 == 15) {
            this.field803 = arg0.method2501();
        } else if (arg1 == 16) {
            this.field791 = arg0.method2501();
        } else if (arg1 == 17) {
            this.field792 = arg0.method2501();
            this.field780 = arg0.method2501();
            this.field783 = arg0.method2501();
            this.field795 = arg0.method2501();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field800[arg1 - 30] = arg0.method2507();
            if (this.field800[arg1 - 30].equalsIgnoreCase(class135.field2092)) {
                this.field800[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2499();
            this.field796 = new short[var5];
            this.field786 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field796[var6] = (short) arg0.method2501();
                this.field786[var6] = (short) arg0.method2501();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2499();
            this.field798 = new short[var7];
            this.field799 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field798[var8] = (short) arg0.method2501();
                this.field799[var8] = (short) arg0.method2501();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2499();
            this.field788 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field788[var10] = arg0.method2501();
            }
        } else if (arg1 == 93) {
            this.field801 = false;
        } else if (arg1 == 95) {
            this.field802 = arg0.method2501();
        } else if (arg1 == 97) {
            this.field808 = arg0.method2501();
        } else if (arg1 == 98) {
            this.field807 = arg0.method2501();
        } else if (arg1 == 99) {
            this.field805 = true;
        } else if (arg1 == 100) {
            this.field806 = arg0.method2500();
        } else if (arg1 == 101) {
            this.field790 = arg0.method2500();
        } else if (arg1 == 102) {
            this.field789 = arg0.method2501();
        } else if (arg1 == 103) {
            this.field809 = arg0.method2501();
        } else if (arg1 == 106) {
            this.field811 = arg0.method2501();
            if (this.field811 == 65535) {
                this.field811 = -1;
            }
            this.field812 = arg0.method2501();
            if (this.field812 == 65535) {
                this.field812 = -1;
            }
            int var11 = arg0.method2499();
            this.field810 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field810[var12] = arg0.method2501();
                if (this.field810[var12] == 65535) {
                    this.field810[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field813 = false;
        } else if (arg1 == 109) {
            this.field814 = false;
        }
    }

    @ObfuscatedName("ax.x(Laz;ILaz;II)Ldn;")
    public final class112 method610(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field810 != null) {
            class31 var5 = this.method612();
            return var5 == null ? null : var5.method610(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field782.method3303((long) this.field784);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field793.length; var8++) {
                if (!Statics.field781.method3084(this.field793[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field793.length];
            for (int var10 = 0; var10 < this.field793.length; var10++) {
                var9[var10] = class101.method2085(Statics.field781, this.field793[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field796 != null) {
                for (int var12 = 0; var12 < this.field796.length; var12++) {
                    var11.method2097(this.field796[var12], this.field786[var12]);
                }
            }
            if (this.field798 != null) {
                for (int var13 = 0; var13 < this.field798.length; var13++) {
                    var11.method2167(this.field798[var13], this.field799[var13]);
                }
            }
            var6 = var11.method2104(this.field806 + 64, this.field790 * 5 + 850, -30, -50, -30);
            field782.method3313(var6, (long) this.field784);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method719(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method712(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2273(true);
        } else {
            var14 = arg2.method712(var6, arg3);
        }
        if (this.field808 != 128 || this.field807 != 128) {
            var14.method2287(this.field808, this.field807, this.field808);
        }
        return var14;
    }

    @ObfuscatedName("ax.k(S)Lcz;")
    public final class101 method611() {
        if (this.field810 != null) {
            class31 var1 = this.method612();
            return var1 == null ? null : var1.method611();
        } else if (this.field788 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field788.length; var3++) {
                if (!Statics.field781.method3084(this.field788[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field788.length];
            for (int var5 = 0; var5 < this.field788.length; var5++) {
                var4[var5] = class101.method2085(Statics.field781, this.field788[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field796 != null) {
                for (int var7 = 0; var7 < this.field796.length; var7++) {
                    var6.method2097(this.field796[var7], this.field786[var7]);
                }
            }
            if (this.field798 != null) {
                for (int var8 = 0; var8 < this.field798.length; var8++) {
                    var6.method2167(this.field798[var8], this.field799[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ax.r(I)Lax;")
    public final class31 method612() {
        int var1 = -1;
        if (this.field811 != -1) {
            var1 = class160.method154(this.field811);
        } else if (this.field812 != -1) {
            var1 = class160.field2727[this.field812];
        }
        return var1 < 0 || var1 >= this.field810.length || this.field810[var1] == -1 ? null : method898(this.field810[var1]);
    }

    @ObfuscatedName("ax.z(I)Z")
    public boolean method613() {
        if (this.field810 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field811 != -1) {
            var1 = class160.method154(this.field811);
        } else if (this.field812 != -1) {
            var1 = class160.field2727[this.field812];
        }
        return var1 >= 0 && var1 < this.field810.length && this.field810[var1] != -1;
    }

    @ObfuscatedName("ah.n(I)V")
    public static void method899() {
        field787.method3306();
        field782.method3306();
    }
}
