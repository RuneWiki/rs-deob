package deob;

@ObfuscatedName("ag")
public class class31 extends class174 {

    @ObfuscatedName("ag.y")
    public static class170 field792 = new class170(64);

    @ObfuscatedName("ag.v")
    public static class170 field815 = new class170(50);

    @ObfuscatedName("ag.g")
    public int field790;

    @ObfuscatedName("ag.x")
    public String field795 = "null";

    @ObfuscatedName("ag.u")
    public int field796 = 1;

    @ObfuscatedName("ag.l")
    public int[] field797;

    @ObfuscatedName("ag.a")
    public int[] field798;

    @ObfuscatedName("ag.h")
    public int field799 = -1;

    @ObfuscatedName("ag.t")
    public int field800 = -1;

    @ObfuscatedName("ag.m")
    public int field801 = -1;

    @ObfuscatedName("ag.s")
    public int field802 = -1;

    @ObfuscatedName("ag.j")
    public int field803 = -1;

    @ObfuscatedName("ag.b")
    public int field793 = -1;

    @ObfuscatedName("ag.n")
    public int field805 = -1;

    @ObfuscatedName("ag.z")
    public short[] field806;

    @ObfuscatedName("ag.d")
    public short[] field807;

    @ObfuscatedName("ag.f")
    public short[] field808;

    @ObfuscatedName("ag.o")
    public short[] field804;

    @ObfuscatedName("ag.r")
    public String[] field810 = new String[5];

    @ObfuscatedName("ag.k")
    public boolean field811 = true;

    @ObfuscatedName("ag.w")
    public int field794 = -1;

    @ObfuscatedName("ag.e")
    public int field813 = 128;

    @ObfuscatedName("ag.p")
    public int field814 = 128;

    @ObfuscatedName("ag.i")
    public boolean field820 = false;

    @ObfuscatedName("ag.ap")
    public int field816 = 0;

    @ObfuscatedName("ag.as")
    public int field812 = 0;

    @ObfuscatedName("ag.ak")
    public int field809 = -1;

    @ObfuscatedName("ag.af")
    public int field819 = 32;

    @ObfuscatedName("ag.ag")
    public int[] field824;

    @ObfuscatedName("ag.aj")
    public int field821 = -1;

    @ObfuscatedName("ag.ac")
    public int field822 = -1;

    @ObfuscatedName("ag.an")
    public boolean field823 = true;

    @ObfuscatedName("ag.ad")
    public boolean field825 = true;

    @ObfuscatedName("p.c(Ley;Ley;I)V")
    public static void method211(class153 arg0, class153 arg1) {
        Statics.field817 = arg0;
        Statics.field791 = arg1;
    }

    @ObfuscatedName("j.q(IB)Lag;")
    public static class31 method131(int arg0) {
        class31 var1 = (class31) field792.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field817.method2886(9, arg0);
        class31 var3 = new class31();
        var3.field790 = arg0;
        if (var2 != null) {
            var3.method579(new class127(var2));
        }
        var3.method585();
        field792.method3092(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.y(B)V")
    public void method585() {
    }

    @ObfuscatedName("ag.v(Ldg;I)V")
    public void method579(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method588(arg0, var2);
        }
    }

    @ObfuscatedName("ag.g(Ldg;IB)V")
    public void method588(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2383();
            this.field797 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field797[var4] = arg0.method2327();
            }
        } else if (arg1 == 2) {
            this.field795 = arg0.method2315();
        } else if (arg1 == 12) {
            this.field796 = arg0.method2383();
        } else if (arg1 == 13) {
            this.field799 = arg0.method2327();
        } else if (arg1 == 14) {
            this.field802 = arg0.method2327();
        } else if (arg1 == 15) {
            this.field800 = arg0.method2327();
        } else if (arg1 == 16) {
            this.field801 = arg0.method2327();
        } else if (arg1 == 17) {
            this.field802 = arg0.method2327();
            this.field803 = arg0.method2327();
            this.field793 = arg0.method2327();
            this.field805 = arg0.method2327();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field810[arg1 - 30] = arg0.method2315();
            if (this.field810[arg1 - 30].equalsIgnoreCase(class135.field2118)) {
                this.field810[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2383();
            this.field806 = new short[var5];
            this.field807 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field806[var6] = (short) arg0.method2327();
                this.field807[var6] = (short) arg0.method2327();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2383();
            this.field808 = new short[var7];
            this.field804 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field808[var8] = (short) arg0.method2327();
                this.field804[var8] = (short) arg0.method2327();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2383();
            this.field798 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field798[var10] = arg0.method2327();
            }
        } else if (arg1 == 93) {
            this.field811 = false;
        } else if (arg1 == 95) {
            this.field794 = arg0.method2327();
        } else if (arg1 == 97) {
            this.field813 = arg0.method2327();
        } else if (arg1 == 98) {
            this.field814 = arg0.method2327();
        } else if (arg1 == 99) {
            this.field820 = true;
        } else if (arg1 == 100) {
            this.field816 = arg0.method2319();
        } else if (arg1 == 101) {
            this.field812 = arg0.method2319();
        } else if (arg1 == 102) {
            this.field809 = arg0.method2327();
        } else if (arg1 == 103) {
            this.field819 = arg0.method2327();
        } else if (arg1 == 106) {
            this.field821 = arg0.method2327();
            if (this.field821 == 65535) {
                this.field821 = -1;
            }
            this.field822 = arg0.method2327();
            if (this.field822 == 65535) {
                this.field822 = -1;
            }
            int var11 = arg0.method2383();
            this.field824 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field824[var12] = arg0.method2327();
                if (this.field824[var12] == 65535) {
                    this.field824[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field823 = false;
        } else if (arg1 == 109) {
            this.field825 = false;
        }
    }

    @ObfuscatedName("ag.x(Lan;ILan;II)Ldl;")
    public final class112 method578(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field824 != null) {
            class31 var5 = this.method583();
            return var5 == null ? null : var5.method578(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field815.method3097((long) this.field790);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field797.length; var8++) {
                if (!Statics.field791.method2888(this.field797[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field797.length];
            for (int var10 = 0; var10 < this.field797.length; var10++) {
                var9[var10] = class101.method1979(Statics.field791, this.field797[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field806 != null) {
                for (int var12 = 0; var12 < this.field806.length; var12++) {
                    var11.method1976(this.field806[var12], this.field807[var12]);
                }
            }
            if (this.field808 != null) {
                for (int var13 = 0; var13 < this.field808.length; var13++) {
                    var11.method1980(this.field808[var13], this.field804[var13]);
                }
            }
            var6 = var11.method1971(this.field816 + 64, this.field812 * 5 + 850, -30, -50, -30);
            field815.method3092(var6, (long) this.field790);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method703(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method678(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2138(true);
        } else {
            var14 = arg2.method678(var6, arg3);
        }
        if (this.field813 != 128 || this.field814 != 128) {
            var14.method2149(this.field813, this.field814, this.field813);
        }
        return var14;
    }

    @ObfuscatedName("ag.u(I)Lcz;")
    public final class101 method582() {
        if (this.field824 != null) {
            class31 var1 = this.method583();
            return var1 == null ? null : var1.method582();
        } else if (this.field798 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field798.length; var3++) {
                if (!Statics.field791.method2888(this.field798[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field798.length];
            for (int var5 = 0; var5 < this.field798.length; var5++) {
                var4[var5] = class101.method1979(Statics.field791, this.field798[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field806 != null) {
                for (int var7 = 0; var7 < this.field806.length; var7++) {
                    var6.method1976(this.field806[var7], this.field807[var7]);
                }
            }
            if (this.field808 != null) {
                for (int var8 = 0; var8 < this.field808.length; var8++) {
                    var6.method1980(this.field808[var8], this.field804[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ag.l(I)Lag;")
    public final class31 method583() {
        int var1 = -1;
        if (this.field821 != -1) {
            var1 = class160.method2195(this.field821);
        } else if (this.field822 != -1) {
            var1 = class160.field2731[this.field822];
        }
        return var1 < 0 || var1 >= this.field824.length || this.field824[var1] == -1 ? null : method131(this.field824[var1]);
    }

    @ObfuscatedName("ag.a(I)Z")
    public boolean method584() {
        if (this.field824 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field821 != -1) {
            var1 = class160.method2195(this.field821);
        } else if (this.field822 != -1) {
            var1 = class160.field2731[this.field822];
        }
        return var1 >= 0 && var1 < this.field824.length && this.field824[var1] != -1;
    }
}
