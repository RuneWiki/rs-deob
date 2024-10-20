package deob;

@ObfuscatedName("ag")
public class class35 extends class180 {

    @ObfuscatedName("ag.k")
    public static class170 field807 = new class170(64);

    @ObfuscatedName("ag.v")
    public static class170 field785 = new class170(50);

    @ObfuscatedName("ag.l")
    public int field806;

    @ObfuscatedName("ag.g")
    public String field810 = "null";

    @ObfuscatedName("ag.a")
    public int field801 = 1;

    @ObfuscatedName("ag.x")
    public int[] field789;

    @ObfuscatedName("ag.r")
    public int[] field790;

    @ObfuscatedName("ag.w")
    public int field791 = -1;

    @ObfuscatedName("ag.c")
    public int field792 = -1;

    @ObfuscatedName("ag.f")
    public int field809 = -1;

    @ObfuscatedName("ag.o")
    public int field794 = -1;

    @ObfuscatedName("ag.p")
    public int field804 = -1;

    @ObfuscatedName("ag.n")
    public int field796 = -1;

    @ObfuscatedName("ag.m")
    public int field797 = -1;

    @ObfuscatedName("ag.s")
    public short[] field798;

    @ObfuscatedName("ag.t")
    public short[] field787;

    @ObfuscatedName("ag.j")
    public short[] field800;

    @ObfuscatedName("ag.b")
    public short[] field793;

    @ObfuscatedName("ag.i")
    public String[] field802 = new String[5];

    @ObfuscatedName("ag.h")
    public boolean field803 = true;

    @ObfuscatedName("ag.q")
    public int field808 = -1;

    @ObfuscatedName("ag.d")
    public int field805 = 128;

    @ObfuscatedName("ag.z")
    public int field795 = 128;

    @ObfuscatedName("ag.e")
    public boolean field799 = false;

    @ObfuscatedName("ag.av")
    public int field784 = 0;

    @ObfuscatedName("ag.al")
    public int field786 = 0;

    @ObfuscatedName("ag.aq")
    public int field788 = -1;

    @ObfuscatedName("ag.aa")
    public int field811 = 32;

    @ObfuscatedName("ag.ah")
    public int[] field812;

    @ObfuscatedName("ag.au")
    public int field813 = -1;

    @ObfuscatedName("ag.ai")
    public int field814 = -1;

    @ObfuscatedName("ag.ab")
    public boolean field815 = true;

    @ObfuscatedName("ag.ag")
    public boolean field816 = true;

    @ObfuscatedName("ag.ax")
    public boolean field817 = false;

    @ObfuscatedName("client.y(II)Lag;")
    public static class35 method189(int arg0) {
        class35 var1 = (class35) field807.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1774.method2704(9, arg0);
        class35 var3 = new class35();
        var3.field806 = arg0;
        if (var2 != null) {
            var3.method588(new class107(var2));
        }
        var3.method587();
        field807.method3147(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.u(I)V")
    public void method587() {
    }

    @ObfuscatedName("ag.k(Ldo;B)V")
    public void method588(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method594(arg0, var2);
        }
    }

    @ObfuscatedName("ag.v(Ldo;II)V")
    public void method594(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2109();
            this.field789 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field789[var4] = arg0.method2111();
            }
        } else if (arg1 == 2) {
            this.field810 = arg0.method2126();
        } else if (arg1 == 12) {
            this.field801 = arg0.method2109();
        } else if (arg1 == 13) {
            this.field791 = arg0.method2111();
        } else if (arg1 == 14) {
            this.field794 = arg0.method2111();
        } else if (arg1 == 15) {
            this.field792 = arg0.method2111();
        } else if (arg1 == 16) {
            this.field809 = arg0.method2111();
        } else if (arg1 == 17) {
            this.field794 = arg0.method2111();
            this.field804 = arg0.method2111();
            this.field796 = arg0.method2111();
            this.field797 = arg0.method2111();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field802[arg1 - 30] = arg0.method2126();
            if (this.field802[arg1 - 30].equalsIgnoreCase(class142.field2154)) {
                this.field802[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2109();
            this.field798 = new short[var5];
            this.field787 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field798[var6] = (short) arg0.method2111();
                this.field787[var6] = (short) arg0.method2111();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2109();
            this.field800 = new short[var7];
            this.field793 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field800[var8] = (short) arg0.method2111();
                this.field793[var8] = (short) arg0.method2111();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2109();
            this.field790 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field790[var10] = arg0.method2111();
            }
        } else if (arg1 == 93) {
            this.field803 = false;
        } else if (arg1 == 95) {
            this.field808 = arg0.method2111();
        } else if (arg1 == 97) {
            this.field805 = arg0.method2111();
        } else if (arg1 == 98) {
            this.field795 = arg0.method2111();
        } else if (arg1 == 99) {
            this.field799 = true;
        } else if (arg1 == 100) {
            this.field784 = arg0.method2110();
        } else if (arg1 == 101) {
            this.field786 = arg0.method2110() * 5;
        } else if (arg1 == 102) {
            this.field788 = arg0.method2111();
        } else if (arg1 == 103) {
            this.field811 = arg0.method2111();
        } else if (arg1 == 106) {
            this.field813 = arg0.method2111();
            if (this.field813 == 65535) {
                this.field813 = -1;
            }
            this.field814 = arg0.method2111();
            if (this.field814 == 65535) {
                this.field814 = -1;
            }
            int var11 = arg0.method2109();
            this.field812 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field812[var12] = arg0.method2111();
                if (this.field812[var12] == 65535) {
                    this.field812[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field815 = false;
        } else if (arg1 == 109) {
            this.field816 = false;
        } else if (arg1 == 111) {
            this.field817 = true;
        }
    }

    @ObfuscatedName("ag.l(Lao;ILao;IB)Lcz;")
    public final class98 method595(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field812 != null) {
            class35 var5 = this.method617();
            return var5 == null ? null : var5.method595(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field785.method3145((long) this.field806);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field789.length; var8++) {
                if (!Statics.field1440.method2737(this.field789[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field789.length];
            for (int var10 = 0; var10 < this.field789.length; var10++) {
                var9[var10] = class93.method1873(Statics.field1440, this.field789[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field798 != null) {
                for (int var12 = 0; var12 < this.field798.length; var12++) {
                    var11.method1886(this.field798[var12], this.field787[var12]);
                }
            }
            if (this.field800 != null) {
                for (int var13 = 0; var13 < this.field800.length; var13++) {
                    var11.method1930(this.field800[var13], this.field793[var13]);
                }
            }
            var6 = var11.method1894(this.field784 + 64, this.field786 + 850, -30, -50, -30);
            field785.method3147(var6, (long) this.field806);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method697(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method690(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1987(true);
        } else {
            var14 = arg2.method690(var6, arg3);
        }
        if (this.field805 != 128 || this.field795 != 128) {
            var14.method1978(this.field805, this.field795, this.field805);
        }
        return var14;
    }

    @ObfuscatedName("ag.g(I)Lca;")
    public final class93 method590() {
        if (this.field812 != null) {
            class35 var1 = this.method617();
            return var1 == null ? null : var1.method590();
        } else if (this.field790 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field790.length; var3++) {
                if (!Statics.field1440.method2737(this.field790[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field790.length];
            for (int var5 = 0; var5 < this.field790.length; var5++) {
                var4[var5] = class93.method1873(Statics.field1440, this.field790[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field798 != null) {
                for (int var7 = 0; var7 < this.field798.length; var7++) {
                    var6.method1886(this.field798[var7], this.field787[var7]);
                }
            }
            if (this.field800 != null) {
                for (int var8 = 0; var8 < this.field800.length; var8++) {
                    var6.method1930(this.field800[var8], this.field793[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ag.a(I)Lag;")
    public final class35 method617() {
        int var1 = -1;
        if (this.field813 != -1) {
            var1 = class153.method1769(this.field813);
        } else if (this.field814 != -1) {
            var1 = class153.field2628[this.field814];
        }
        return var1 < 0 || var1 >= this.field812.length || this.field812[var1] == -1 ? null : method189(this.field812[var1]);
    }

    @ObfuscatedName("ag.x(I)Z")
    public boolean method592() {
        if (this.field812 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field813 != -1) {
            var1 = class153.method1769(this.field813);
        } else if (this.field814 != -1) {
            var1 = class153.field2628[this.field814];
        }
        return var1 >= 0 && var1 < this.field812.length && this.field812[var1] != -1;
    }

    @ObfuscatedName("af.r(I)V")
    public static void method680() {
        field807.method3141();
        field785.method3141();
    }
}
