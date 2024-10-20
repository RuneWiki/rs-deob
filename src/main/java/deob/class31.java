package deob;

@ObfuscatedName("aq")
public class class31 extends class174 {

    @ObfuscatedName("aq.e")
    public static class170 field790 = new class170(64);

    @ObfuscatedName("aq.r")
    public static class170 field784 = new class170(50);

    @ObfuscatedName("aq.p")
    public int field788;

    @ObfuscatedName("aq.n")
    public String field786 = "null";

    @ObfuscatedName("aq.o")
    public int field793 = 1;

    @ObfuscatedName("aq.l")
    public int[] field815;

    @ObfuscatedName("aq.t")
    public int[] field789;

    @ObfuscatedName("aq.q")
    public int field787 = -1;

    @ObfuscatedName("aq.c")
    public int field791 = -1;

    @ObfuscatedName("aq.z")
    public int field792 = -1;

    @ObfuscatedName("aq.s")
    public int field783 = -1;

    @ObfuscatedName("aq.h")
    public int field794 = -1;

    @ObfuscatedName("aq.f")
    public int field795 = -1;

    @ObfuscatedName("aq.w")
    public int field798 = -1;

    @ObfuscatedName("aq.d")
    public short[] field797;

    @ObfuscatedName("aq.y")
    public short[] field818;

    @ObfuscatedName("aq.g")
    public short[] field799;

    @ObfuscatedName("aq.v")
    public short[] field800;

    @ObfuscatedName("aq.b")
    public String[] field820 = new String[5];

    @ObfuscatedName("aq.j")
    public boolean field802 = true;

    @ObfuscatedName("aq.m")
    public int field803 = -1;

    @ObfuscatedName("aq.k")
    public int field804 = 128;

    @ObfuscatedName("aq.u")
    public int field805 = 128;

    @ObfuscatedName("aq.i")
    public boolean field806 = false;

    @ObfuscatedName("aq.ah")
    public int field810 = 0;

    @ObfuscatedName("aq.ag")
    public int field808 = 0;

    @ObfuscatedName("aq.ay")
    public int field809 = -1;

    @ObfuscatedName("aq.as")
    public int field801 = 32;

    @ObfuscatedName("aq.aq")
    public int[] field811;

    @ObfuscatedName("aq.am")
    public int field812 = -1;

    @ObfuscatedName("aq.an")
    public int field785 = -1;

    @ObfuscatedName("aq.av")
    public boolean field814 = true;

    @ObfuscatedName("aq.at")
    public boolean field813 = true;

    @ObfuscatedName("cn.a(Leb;Leb;B)V")
    public static void method1978(class152 arg0, class152 arg1) {
        Statics.field2436 = arg0;
        Statics.field1820 = arg1;
    }

    @ObfuscatedName("fl.x(II)Laq;")
    public static class31 method3064(int arg0) {
        class31 var1 = (class31) field790.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2436.method2961(9, arg0);
        class31 var3 = new class31();
        var3.field788 = arg0;
        if (var2 != null) {
            var3.method607(new class127(var2));
        }
        var3.method606();
        field790.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.e(I)V")
    public void method606() {
    }

    @ObfuscatedName("aq.r(Ldy;I)V")
    public void method607(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method618(arg0, var2);
        }
    }

    @ObfuscatedName("aq.p(Ldy;II)V")
    public void method618(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2411();
            this.field815 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field815[var4] = arg0.method2413();
            }
        } else if (arg1 == 2) {
            this.field786 = arg0.method2564();
        } else if (arg1 == 12) {
            this.field793 = arg0.method2411();
        } else if (arg1 == 13) {
            this.field787 = arg0.method2413();
        } else if (arg1 == 14) {
            this.field783 = arg0.method2413();
        } else if (arg1 == 15) {
            this.field791 = arg0.method2413();
        } else if (arg1 == 16) {
            this.field792 = arg0.method2413();
        } else if (arg1 == 17) {
            this.field783 = arg0.method2413();
            this.field794 = arg0.method2413();
            this.field795 = arg0.method2413();
            this.field798 = arg0.method2413();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field820[arg1 - 30] = arg0.method2564();
            if (this.field820[arg1 - 30].equalsIgnoreCase(class134.field2076)) {
                this.field820[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2411();
            this.field797 = new short[var5];
            this.field818 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field797[var6] = (short) arg0.method2413();
                this.field818[var6] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2411();
            this.field799 = new short[var7];
            this.field800 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field799[var8] = (short) arg0.method2413();
                this.field800[var8] = (short) arg0.method2413();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2411();
            this.field789 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field789[var10] = arg0.method2413();
            }
        } else if (arg1 == 93) {
            this.field802 = false;
        } else if (arg1 == 95) {
            this.field803 = arg0.method2413();
        } else if (arg1 == 97) {
            this.field804 = arg0.method2413();
        } else if (arg1 == 98) {
            this.field805 = arg0.method2413();
        } else if (arg1 == 99) {
            this.field806 = true;
        } else if (arg1 == 100) {
            this.field810 = arg0.method2412();
        } else if (arg1 == 101) {
            this.field808 = arg0.method2412();
        } else if (arg1 == 102) {
            this.field809 = arg0.method2413();
        } else if (arg1 == 103) {
            this.field801 = arg0.method2413();
        } else if (arg1 == 106) {
            this.field812 = arg0.method2413();
            if (this.field812 == 65535) {
                this.field812 = -1;
            }
            this.field785 = arg0.method2413();
            if (this.field785 == 65535) {
                this.field785 = -1;
            }
            int var11 = arg0.method2411();
            this.field811 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field811[var12] = arg0.method2413();
                if (this.field811[var12] == 65535) {
                    this.field811[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field814 = false;
        } else if (arg1 == 109) {
            this.field813 = false;
        }
    }

    @ObfuscatedName("aq.n(Lav;ILav;IS)Ldd;")
    public final class112 method609(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field811 != null) {
            class31 var5 = this.method611();
            return var5 == null ? null : var5.method609(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field784.method3196((long) this.field788);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field815.length; var8++) {
                if (!Statics.field1820.method2939(this.field815[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field815.length];
            for (int var10 = 0; var10 < this.field815.length; var10++) {
                var9[var10] = class101.method1989(Statics.field1820, this.field815[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field797 != null) {
                for (int var12 = 0; var12 < this.field797.length; var12++) {
                    var11.method2002(this.field797[var12], this.field818[var12]);
                }
            }
            if (this.field799 != null) {
                for (int var13 = 0; var13 < this.field799.length; var13++) {
                    var11.method2021(this.field799[var13], this.field800[var13]);
                }
            }
            var6 = var11.method2010(this.field810 + 64, this.field808 * 5 + 850, -30, -50, -30);
            field784.method3193(var6, (long) this.field788);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method716(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method713(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2181(true);
        } else {
            var14 = arg2.method713(var6, arg3);
        }
        if (this.field804 != 128 || this.field805 != 128) {
            var14.method2215(this.field804, this.field805, this.field804);
        }
        return var14;
    }

    @ObfuscatedName("aq.o(I)Lcc;")
    public final class101 method610() {
        if (this.field811 != null) {
            class31 var1 = this.method611();
            return var1 == null ? null : var1.method610();
        } else if (this.field789 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field789.length; var3++) {
                if (!Statics.field1820.method2939(this.field789[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field789.length];
            for (int var5 = 0; var5 < this.field789.length; var5++) {
                var4[var5] = class101.method1989(Statics.field1820, this.field789[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field797 != null) {
                for (int var7 = 0; var7 < this.field797.length; var7++) {
                    var6.method2002(this.field797[var7], this.field818[var7]);
                }
            }
            if (this.field799 != null) {
                for (int var8 = 0; var8 < this.field799.length; var8++) {
                    var6.method2021(this.field799[var8], this.field800[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aq.l(I)Laq;")
    public final class31 method611() {
        int var1 = -1;
        if (this.field812 != -1) {
            var1 = class159.method2341(this.field812);
        } else if (this.field785 != -1) {
            var1 = class159.field2701[this.field785];
        }
        return var1 < 0 || var1 >= this.field811.length || this.field811[var1] == -1 ? null : method3064(this.field811[var1]);
    }

    @ObfuscatedName("aq.t(B)Z")
    public boolean method621() {
        if (this.field811 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field812 != -1) {
            var1 = class159.method2341(this.field812);
        } else if (this.field785 != -1) {
            var1 = class159.field2701[this.field785];
        }
        return var1 >= 0 && var1 < this.field811.length && this.field811[var1] != -1;
    }

    @ObfuscatedName("as.q(I)V")
    public static void method603() {
        field790.method3192();
        field784.method3192();
    }
}
