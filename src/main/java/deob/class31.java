package deob;

@ObfuscatedName("aw")
public class class31 extends class174 {

    @ObfuscatedName("aw.f")
    public static class170 field786 = new class170(64);

    @ObfuscatedName("aw.e")
    public static class170 field807 = new class170(50);

    @ObfuscatedName("aw.t")
    public int field788;

    @ObfuscatedName("aw.d")
    public String field789 = "null";

    @ObfuscatedName("aw.p")
    public int field785 = 1;

    @ObfuscatedName("aw.k")
    public int[] field791;

    @ObfuscatedName("aw.r")
    public int[] field792;

    @ObfuscatedName("aw.l")
    public int field790 = -1;

    @ObfuscatedName("aw.a")
    public int field808 = -1;

    @ObfuscatedName("aw.z")
    public int field795 = -1;

    @ObfuscatedName("aw.s")
    public int field796 = -1;

    @ObfuscatedName("aw.m")
    public int field797 = -1;

    @ObfuscatedName("aw.u")
    public int field798 = -1;

    @ObfuscatedName("aw.g")
    public int field799 = -1;

    @ObfuscatedName("aw.o")
    public short[] field800;

    @ObfuscatedName("aw.v")
    public short[] field818;

    @ObfuscatedName("aw.j")
    public short[] field787;

    @ObfuscatedName("aw.n")
    public short[] field803;

    @ObfuscatedName("aw.q")
    public String[] field816 = new String[5];

    @ObfuscatedName("aw.c")
    public boolean field805 = true;

    @ObfuscatedName("aw.h")
    public int field806 = -1;

    @ObfuscatedName("aw.b")
    public int field819 = 128;

    @ObfuscatedName("aw.y")
    public int field813 = 128;

    @ObfuscatedName("aw.x")
    public boolean field809 = false;

    @ObfuscatedName("aw.ao")
    public int field810 = 0;

    @ObfuscatedName("aw.ae")
    public int field811 = 0;

    @ObfuscatedName("aw.aa")
    public int field812 = -1;

    @ObfuscatedName("aw.ah")
    public int field801 = 32;

    @ObfuscatedName("aw.aw")
    public int[] field814;

    @ObfuscatedName("aw.an")
    public int field815 = -1;

    @ObfuscatedName("aw.av")
    public int field784 = -1;

    @ObfuscatedName("aw.ak")
    public boolean field817 = true;

    @ObfuscatedName("aw.ax")
    public boolean field804 = true;

    @ObfuscatedName("cc.i(Leg;Leg;B)V")
    public static void method1655(class152 arg0, class152 arg1) {
        Statics.field794 = arg0;
        Statics.field793 = arg1;
    }

    @ObfuscatedName("h.w(II)Law;")
    public static class31 method232(int arg0) {
        class31 var1 = (class31) field786.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field794.method2970(9, arg0);
        class31 var3 = new class31();
        var3.field788 = arg0;
        if (var2 != null) {
            var3.method606(new class127(var2));
        }
        var3.method605();
        field786.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.f(B)V")
    public void method605() {
    }

    @ObfuscatedName("aw.e(Ldz;B)V")
    public void method606(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method607(arg0, var2);
        }
    }

    @ObfuscatedName("aw.t(Ldz;II)V")
    public void method607(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2472();
            this.field791 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field791[var4] = arg0.method2615();
            }
        } else if (arg1 == 2) {
            this.field789 = arg0.method2460();
        } else if (arg1 == 12) {
            this.field785 = arg0.method2472();
        } else if (arg1 == 13) {
            this.field790 = arg0.method2615();
        } else if (arg1 == 14) {
            this.field796 = arg0.method2615();
        } else if (arg1 == 15) {
            this.field808 = arg0.method2615();
        } else if (arg1 == 16) {
            this.field795 = arg0.method2615();
        } else if (arg1 == 17) {
            this.field796 = arg0.method2615();
            this.field797 = arg0.method2615();
            this.field798 = arg0.method2615();
            this.field799 = arg0.method2615();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field816[arg1 - 30] = arg0.method2460();
            if (this.field816[arg1 - 30].equalsIgnoreCase(class134.field2123)) {
                this.field816[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2472();
            this.field800 = new short[var5];
            this.field818 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field800[var6] = (short) arg0.method2615();
                this.field818[var6] = (short) arg0.method2615();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2472();
            this.field787 = new short[var7];
            this.field803 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field787[var8] = (short) arg0.method2615();
                this.field803[var8] = (short) arg0.method2615();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2472();
            this.field792 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field792[var10] = arg0.method2615();
            }
        } else if (arg1 == 93) {
            this.field805 = false;
        } else if (arg1 == 95) {
            this.field806 = arg0.method2615();
        } else if (arg1 == 97) {
            this.field819 = arg0.method2615();
        } else if (arg1 == 98) {
            this.field813 = arg0.method2615();
        } else if (arg1 == 99) {
            this.field809 = true;
        } else if (arg1 == 100) {
            this.field810 = arg0.method2453();
        } else if (arg1 == 101) {
            this.field811 = arg0.method2453();
        } else if (arg1 == 102) {
            this.field812 = arg0.method2615();
        } else if (arg1 == 103) {
            this.field801 = arg0.method2615();
        } else if (arg1 == 106) {
            this.field815 = arg0.method2615();
            if (this.field815 == 65535) {
                this.field815 = -1;
            }
            this.field784 = arg0.method2615();
            if (this.field784 == 65535) {
                this.field784 = -1;
            }
            int var11 = arg0.method2472();
            this.field814 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field814[var12] = arg0.method2615();
                if (this.field814[var12] == 65535) {
                    this.field814[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field817 = false;
        } else if (arg1 == 109) {
            this.field804 = false;
        }
    }

    @ObfuscatedName("aw.d(Lak;ILak;II)Ldb;")
    public final class112 method620(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field814 != null) {
            class31 var5 = this.method634();
            return var5 == null ? null : var5.method620(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field807.method3235((long) this.field788);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field791.length; var8++) {
                if (!Statics.field793.method2972(this.field791[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field791.length];
            for (int var10 = 0; var10 < this.field791.length; var10++) {
                var9[var10] = class101.method2052(Statics.field793, this.field791[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field800 != null) {
                for (int var12 = 0; var12 < this.field800.length; var12++) {
                    var11.method2064(this.field800[var12], this.field818[var12]);
                }
            }
            if (this.field787 != null) {
                for (int var13 = 0; var13 < this.field787.length; var13++) {
                    var11.method2066(this.field787[var13], this.field803[var13]);
                }
            }
            var6 = var11.method2112(this.field810 + 64, this.field811 * 5 + 850, -30, -50, -30);
            field807.method3234(var6, (long) this.field788);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method705(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method712(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2241(true);
        } else {
            var14 = arg2.method712(var6, arg3);
        }
        if (this.field819 != 128 || this.field813 != 128) {
            var14.method2255(this.field819, this.field813, this.field819);
        }
        return var14;
    }

    @ObfuscatedName("aw.p(I)Lco;")
    public final class101 method609() {
        if (this.field814 != null) {
            class31 var1 = this.method634();
            return var1 == null ? null : var1.method609();
        } else if (this.field792 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field792.length; var3++) {
                if (!Statics.field793.method2972(this.field792[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field792.length];
            for (int var5 = 0; var5 < this.field792.length; var5++) {
                var4[var5] = class101.method2052(Statics.field793, this.field792[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field800 != null) {
                for (int var7 = 0; var7 < this.field800.length; var7++) {
                    var6.method2064(this.field800[var7], this.field818[var7]);
                }
            }
            if (this.field787 != null) {
                for (int var8 = 0; var8 < this.field787.length; var8++) {
                    var6.method2066(this.field787[var8], this.field803[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aw.k(B)Law;")
    public final class31 method634() {
        int var1 = -1;
        if (this.field815 != -1) {
            var1 = class159.method2663(this.field815);
        } else if (this.field784 != -1) {
            var1 = class159.field2697[this.field784];
        }
        return var1 < 0 || var1 >= this.field814.length || this.field814[var1] == -1 ? null : method232(this.field814[var1]);
    }

    @ObfuscatedName("aw.r(I)Z")
    public boolean method611() {
        if (this.field814 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field815 != -1) {
            var1 = class159.method2663(this.field815);
        } else if (this.field784 != -1) {
            var1 = class159.field2697[this.field784];
        }
        return var1 >= 0 && var1 < this.field814.length && this.field814[var1] != -1;
    }
}
