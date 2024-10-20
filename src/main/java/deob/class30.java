package deob;

@ObfuscatedName("aq")
public class class30 extends class173 {

    @ObfuscatedName("aq.w")
    public static class169 field777 = new class169(64);

    @ObfuscatedName("aq.h")
    public static class169 field778 = new class169(50);

    @ObfuscatedName("aq.v")
    public int field779;

    @ObfuscatedName("aq.k")
    public String field788 = "null";

    @ObfuscatedName("aq.g")
    public int field781 = 1;

    @ObfuscatedName("aq.n")
    public int[] field809;

    @ObfuscatedName("aq.c")
    public int[] field783;

    @ObfuscatedName("aq.o")
    public int field784 = -1;

    @ObfuscatedName("aq.u")
    public int field785 = -1;

    @ObfuscatedName("aq.z")
    public int field808 = -1;

    @ObfuscatedName("aq.e")
    public int field786 = -1;

    @ObfuscatedName("aq.l")
    public int field793 = -1;

    @ObfuscatedName("aq.m")
    public int field789 = -1;

    @ObfuscatedName("aq.s")
    public int field790 = -1;

    @ObfuscatedName("aq.i")
    public short[] field791;

    @ObfuscatedName("aq.y")
    public short[] field805;

    @ObfuscatedName("aq.d")
    public short[] field812;

    @ObfuscatedName("aq.f")
    public short[] field794;

    @ObfuscatedName("aq.a")
    public String[] field795 = new String[5];

    @ObfuscatedName("aq.x")
    public boolean field796 = true;

    @ObfuscatedName("aq.r")
    public int field787 = -1;

    @ObfuscatedName("aq.t")
    public int field775 = 128;

    @ObfuscatedName("aq.b")
    public int field799 = 128;

    @ObfuscatedName("aq.q")
    public boolean field792 = false;

    @ObfuscatedName("aq.ae")
    public int field801 = 0;

    @ObfuscatedName("aq.at")
    public int field780 = 0;

    @ObfuscatedName("aq.aj")
    public int field803 = -1;

    @ObfuscatedName("aq.aq")
    public int field804 = 32;

    @ObfuscatedName("aq.ac")
    public int[] field798;

    @ObfuscatedName("aq.az")
    public int field806 = -1;

    @ObfuscatedName("aq.ao")
    public int field807 = -1;

    @ObfuscatedName("aq.am")
    public boolean field776 = true;

    @ObfuscatedName("aq.ad")
    public boolean field802 = true;

    @ObfuscatedName("ds.p(Ler;Ler;I)V")
    public static void method2175(class151 arg0, class151 arg1) {
        Statics.field782 = arg0;
        Statics.field800 = arg1;
    }

    @ObfuscatedName("f.j(II)Laq;")
    public static class30 method175(int arg0) {
        class30 var1 = (class30) field777.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field782.method2973(9, arg0);
        class30 var3 = new class30();
        var3.field779 = arg0;
        if (var2 != null) {
            var3.method567(new class126(var2));
        }
        var3.method577();
        field777.method3223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.w(B)V")
    public void method577() {
    }

    @ObfuscatedName("aq.h(Ldv;I)V")
    public void method567(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method558(arg0, var2);
        }
    }

    @ObfuscatedName("aq.v(Ldv;II)V")
    public void method558(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2544();
            this.field809 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field809[var4] = arg0.method2489();
            }
        } else if (arg1 == 2) {
            this.field788 = arg0.method2383();
        } else if (arg1 == 12) {
            this.field781 = arg0.method2544();
        } else if (arg1 == 13) {
            this.field784 = arg0.method2489();
        } else if (arg1 == 14) {
            this.field786 = arg0.method2489();
        } else if (arg1 == 15) {
            this.field785 = arg0.method2489();
        } else if (arg1 == 16) {
            this.field808 = arg0.method2489();
        } else if (arg1 == 17) {
            this.field786 = arg0.method2489();
            this.field793 = arg0.method2489();
            this.field789 = arg0.method2489();
            this.field790 = arg0.method2489();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field795[arg1 - 30] = arg0.method2383();
            if (this.field795[arg1 - 30].equalsIgnoreCase(class133.field2140)) {
                this.field795[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2544();
            this.field791 = new short[var5];
            this.field805 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field791[var6] = (short) arg0.method2489();
                this.field805[var6] = (short) arg0.method2489();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2544();
            this.field812 = new short[var7];
            this.field794 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field812[var8] = (short) arg0.method2489();
                this.field794[var8] = (short) arg0.method2489();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2544();
            this.field783 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field783[var10] = arg0.method2489();
            }
        } else if (arg1 == 93) {
            this.field796 = false;
        } else if (arg1 == 95) {
            this.field787 = arg0.method2489();
        } else if (arg1 == 97) {
            this.field775 = arg0.method2489();
        } else if (arg1 == 98) {
            this.field799 = arg0.method2489();
        } else if (arg1 == 99) {
            this.field792 = true;
        } else if (arg1 == 100) {
            this.field801 = arg0.method2376();
        } else if (arg1 == 101) {
            this.field780 = arg0.method2376();
        } else if (arg1 == 102) {
            this.field803 = arg0.method2489();
        } else if (arg1 == 103) {
            this.field804 = arg0.method2489();
        } else if (arg1 == 106) {
            this.field806 = arg0.method2489();
            if (this.field806 == 65535) {
                this.field806 = -1;
            }
            this.field807 = arg0.method2489();
            if (this.field807 == 65535) {
                this.field807 = -1;
            }
            int var11 = arg0.method2544();
            this.field798 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field798[var12] = arg0.method2489();
                if (this.field798[var12] == 65535) {
                    this.field798[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field776 = false;
        } else if (arg1 == 109) {
            this.field802 = false;
        }
    }

    @ObfuscatedName("aq.k(Lao;ILao;IB)Ldm;")
    public final class111 method559(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field798 != null) {
            class30 var5 = this.method561();
            return var5 == null ? null : var5.method559(arg0, arg1, arg2, arg3);
        }
        class111 var6 = (class111) field778.method3214((long) this.field779);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field809.length; var8++) {
                if (!Statics.field800.method2915(this.field809[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field809.length];
            for (int var10 = 0; var10 < this.field809.length; var10++) {
                var9[var10] = class100.method1997(Statics.field800, this.field809[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field791 != null) {
                for (int var12 = 0; var12 < this.field791.length; var12++) {
                    var11.method2010(this.field791[var12], this.field805[var12]);
                }
            }
            if (this.field812 != null) {
                for (int var13 = 0; var13 < this.field812.length; var13++) {
                    var11.method2011(this.field812[var13], this.field794[var13]);
                }
            }
            var6 = var11.method2042(this.field801 + 64, this.field780 * 5 + 850, -30, -50, -30);
            field778.method3223(var6, (long) this.field779);
        }
        class111 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method677(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method674(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2181(true);
        } else {
            var14 = arg2.method674(var6, arg3);
        }
        if (this.field775 != 128 || this.field799 != 128) {
            var14.method2239(this.field775, this.field799, this.field775);
        }
        return var14;
    }

    @ObfuscatedName("aq.g(S)Lcu;")
    public final class100 method586() {
        if (this.field798 != null) {
            class30 var1 = this.method561();
            return var1 == null ? null : var1.method586();
        } else if (this.field783 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field783.length; var3++) {
                if (!Statics.field800.method2915(this.field783[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field783.length];
            for (int var5 = 0; var5 < this.field783.length; var5++) {
                var4[var5] = class100.method1997(Statics.field800, this.field783[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field791 != null) {
                for (int var7 = 0; var7 < this.field791.length; var7++) {
                    var6.method2010(this.field791[var7], this.field805[var7]);
                }
            }
            if (this.field812 != null) {
                for (int var8 = 0; var8 < this.field812.length; var8++) {
                    var6.method2011(this.field812[var8], this.field794[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aq.n(B)Laq;")
    public final class30 method561() {
        int var1 = -1;
        if (this.field806 != -1) {
            var1 = class158.method1991(this.field806);
        } else if (this.field807 != -1) {
            var1 = class158.field2700[this.field807];
        }
        return var1 < 0 || var1 >= this.field798.length || this.field798[var1] == -1 ? null : method175(this.field798[var1]);
    }

    @ObfuscatedName("aq.c(S)Z")
    public boolean method562() {
        if (this.field798 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field806 != -1) {
            var1 = class158.method1991(this.field806);
        } else if (this.field807 != -1) {
            var1 = class158.field2700[this.field807];
        }
        return var1 >= 0 && var1 < this.field798.length && this.field798[var1] != -1;
    }

    @ObfuscatedName("dy.o(B)V")
    public static void method2153() {
        field777.method3217();
        field778.method3217();
    }
}
