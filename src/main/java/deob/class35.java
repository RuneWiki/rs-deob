package deob;

@ObfuscatedName("ap")
public class class35 extends class183 {

    @ObfuscatedName("ap.h")
    public static class172 field789 = new class172(64);

    @ObfuscatedName("ap.m")
    public static class172 field790 = new class172(50);

    @ObfuscatedName("ap.u")
    public int field791;

    @ObfuscatedName("ap.j")
    public String field821 = "null";

    @ObfuscatedName("ap.b")
    public int field799 = 1;

    @ObfuscatedName("ap.v")
    public int[] field793;

    @ObfuscatedName("ap.y")
    public int[] field787;

    @ObfuscatedName("ap.w")
    public int field796 = -1;

    @ObfuscatedName("ap.x")
    public int field797 = -1;

    @ObfuscatedName("ap.k")
    public int field798 = -1;

    @ObfuscatedName("ap.o")
    public int field803 = -1;

    @ObfuscatedName("ap.a")
    public int field800 = -1;

    @ObfuscatedName("ap.f")
    public int field825 = -1;

    @ObfuscatedName("ap.r")
    public int field802 = -1;

    @ObfuscatedName("ap.e")
    public short[] field811;

    @ObfuscatedName("ap.t")
    public short[] field805;

    @ObfuscatedName("ap.c")
    public short[] field806;

    @ObfuscatedName("ap.l")
    public short[] field795;

    @ObfuscatedName("ap.n")
    public String[] field807 = new String[5];

    @ObfuscatedName("ap.d")
    public boolean field804 = true;

    @ObfuscatedName("ap.p")
    public int field809 = -1;

    @ObfuscatedName("ap.z")
    public int field810 = 128;

    @ObfuscatedName("ap.q")
    public int field817 = 128;

    @ObfuscatedName("ap.i")
    public boolean field812 = false;

    @ObfuscatedName("ap.ah")
    public int field813 = 0;

    @ObfuscatedName("ap.aj")
    public int field814 = 0;

    @ObfuscatedName("ap.aq")
    public int field815 = -1;

    @ObfuscatedName("ap.aa")
    public int field816 = 32;

    @ObfuscatedName("ap.ar")
    public int[] field808;

    @ObfuscatedName("ap.at")
    public int field818 = -1;

    @ObfuscatedName("ap.av")
    public int field819 = -1;

    @ObfuscatedName("ap.af")
    public boolean field820 = true;

    @ObfuscatedName("ap.ap")
    public boolean field792 = true;

    @ObfuscatedName("ap.ao")
    public boolean field822 = false;

    @ObfuscatedName("ap.az")
    public int field823 = 30;

    @ObfuscatedName("s.g(II)Lap;")
    public static class35 method12(int arg0) {
        class35 var1 = (class35) field789.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field794.method2667(9, arg0);
        class35 var3 = new class35();
        var3.field791 = arg0;
        if (var2 != null) {
            var3.method618(new class107(var2));
        }
        var3.method649();
        field789.method3126(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.s(I)V")
    public void method649() {
    }

    @ObfuscatedName("ap.h(Ldi;I)V")
    public void method618(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method619(arg0, var2);
        }
    }

    @ObfuscatedName("ap.m(Ldi;IB)V")
    public void method619(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2101();
            this.field793 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field793[var4] = arg0.method2166();
            }
        } else if (arg1 == 2) {
            this.field821 = arg0.method2137();
        } else if (arg1 == 12) {
            this.field799 = arg0.method2101();
        } else if (arg1 == 13) {
            this.field796 = arg0.method2166();
        } else if (arg1 == 14) {
            this.field803 = arg0.method2166();
        } else if (arg1 == 15) {
            this.field797 = arg0.method2166();
        } else if (arg1 == 16) {
            this.field798 = arg0.method2166();
        } else if (arg1 == 17) {
            this.field803 = arg0.method2166();
            this.field800 = arg0.method2166();
            this.field825 = arg0.method2166();
            this.field802 = arg0.method2166();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field807[arg1 - 30] = arg0.method2137();
            if (this.field807[arg1 - 30].equalsIgnoreCase(class143.field2143)) {
                this.field807[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2101();
            this.field811 = new short[var5];
            this.field805 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field811[var6] = (short) arg0.method2166();
                this.field805[var6] = (short) arg0.method2166();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2101();
            this.field806 = new short[var7];
            this.field795 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field806[var8] = (short) arg0.method2166();
                this.field795[var8] = (short) arg0.method2166();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2101();
            this.field787 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field787[var10] = arg0.method2166();
            }
        } else if (arg1 == 93) {
            this.field804 = false;
        } else if (arg1 == 95) {
            this.field809 = arg0.method2166();
        } else if (arg1 == 97) {
            this.field810 = arg0.method2166();
        } else if (arg1 == 98) {
            this.field817 = arg0.method2166();
        } else if (arg1 == 99) {
            this.field812 = true;
        } else if (arg1 == 100) {
            this.field813 = arg0.method2263();
        } else if (arg1 == 101) {
            this.field814 = arg0.method2263();
        } else if (arg1 == 102) {
            this.field815 = arg0.method2166();
        } else if (arg1 == 103) {
            this.field816 = arg0.method2166();
        } else if (arg1 == 106) {
            this.field818 = arg0.method2166();
            if (this.field818 == 65535) {
                this.field818 = -1;
            }
            this.field819 = arg0.method2166();
            if (this.field819 == 65535) {
                this.field819 = -1;
            }
            int var11 = arg0.method2101();
            this.field808 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field808[var12] = arg0.method2166();
                if (this.field808[var12] == 65535) {
                    this.field808[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field820 = false;
        } else if (arg1 == 109) {
            this.field792 = false;
        } else if (arg1 == 111) {
            this.field822 = true;
        } else if (arg1 == 112) {
            this.field823 = arg0.method2101();
        }
    }

    @ObfuscatedName("ap.u(Lac;ILac;II)Lcl;")
    public final class98 method620(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field808 != null) {
            class35 var5 = this.method643();
            return var5 == null ? null : var5.method620(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field790.method3130((long) this.field791);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field793.length; var8++) {
                if (!Statics.field788.method2716(this.field793[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field793.length];
            for (int var10 = 0; var10 < this.field793.length; var10++) {
                var9[var10] = class93.method1865(Statics.field788, this.field793[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field811 != null) {
                for (int var12 = 0; var12 < this.field811.length; var12++) {
                    var11.method1877(this.field811[var12], this.field805[var12]);
                }
            }
            if (this.field806 != null) {
                for (int var13 = 0; var13 < this.field806.length; var13++) {
                    var11.method1878(this.field806[var13], this.field795[var13]);
                }
            }
            var6 = var11.method1885(this.field813 + 64, this.field814 * 5 + 850, -30, -50, -30);
            field790.method3126(var6, (long) this.field791);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method711(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method708(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1955(true);
        } else {
            var14 = arg2.method708(var6, arg3);
        }
        if (this.field810 != 128 || this.field817 != 128) {
            var14.method1969(this.field810, this.field817, this.field810);
        }
        return var14;
    }

    @ObfuscatedName("ap.j(B)Lcv;")
    public final class93 method621() {
        if (this.field808 != null) {
            class35 var1 = this.method643();
            return var1 == null ? null : var1.method621();
        } else if (this.field787 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field787.length; var3++) {
                if (!Statics.field788.method2716(this.field787[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field787.length];
            for (int var5 = 0; var5 < this.field787.length; var5++) {
                var4[var5] = class93.method1865(Statics.field788, this.field787[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field811 != null) {
                for (int var7 = 0; var7 < this.field811.length; var7++) {
                    var6.method1877(this.field811[var7], this.field805[var7]);
                }
            }
            if (this.field806 != null) {
                for (int var8 = 0; var8 < this.field806.length; var8++) {
                    var6.method1878(this.field806[var8], this.field795[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ap.b(B)Lap;")
    public final class35 method643() {
        int var1 = -1;
        if (this.field818 != -1) {
            var1 = class155.method1855(this.field818);
        } else if (this.field819 != -1) {
            var1 = class155.field2664[this.field819];
        }
        return var1 < 0 || var1 >= this.field808.length || this.field808[var1] == -1 ? null : method12(this.field808[var1]);
    }

    @ObfuscatedName("ap.v(I)Z")
    public boolean method630() {
        if (this.field808 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field818 != -1) {
            var1 = class155.method1855(this.field818);
        } else if (this.field819 != -1) {
            var1 = class155.field2664[this.field819];
        }
        return var1 >= 0 && var1 < this.field808.length && this.field808[var1] != -1;
    }
}
