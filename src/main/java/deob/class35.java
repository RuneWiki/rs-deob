package deob;

@ObfuscatedName("as")
public class class35 extends class182 {

    @ObfuscatedName("as.e")
    public static class171 field792 = new class171(64);

    @ObfuscatedName("as.i")
    public static class171 field793 = new class171(50);

    @ObfuscatedName("as.t")
    public int field821;

    @ObfuscatedName("as.z")
    public String field795 = "null";

    @ObfuscatedName("as.g")
    public int field796 = 1;

    @ObfuscatedName("as.c")
    public int[] field812;

    @ObfuscatedName("as.o")
    public int[] field806;

    @ObfuscatedName("as.q")
    public int field797 = -1;

    @ObfuscatedName("as.w")
    public int field800 = -1;

    @ObfuscatedName("as.y")
    public int field801 = -1;

    @ObfuscatedName("as.p")
    public int field802 = -1;

    @ObfuscatedName("as.m")
    public int field803 = -1;

    @ObfuscatedName("as.a")
    public int field804 = -1;

    @ObfuscatedName("as.u")
    public int field791 = -1;

    @ObfuscatedName("as.n")
    public short[] field809;

    @ObfuscatedName("as.x")
    public short[] field807;

    @ObfuscatedName("as.f")
    public short[] field810;

    @ObfuscatedName("as.v")
    public short[] field820;

    @ObfuscatedName("as.s")
    public String[] field808 = new String[5];

    @ObfuscatedName("as.r")
    public boolean field813 = true;

    @ObfuscatedName("as.j")
    public int field814 = -1;

    @ObfuscatedName("as.h")
    public int field794 = 128;

    @ObfuscatedName("as.d")
    public int field805 = 128;

    @ObfuscatedName("as.l")
    public boolean field815 = false;

    @ObfuscatedName("as.ag")
    public int field811 = 0;

    @ObfuscatedName("as.au")
    public int field817 = 0;

    @ObfuscatedName("as.ak")
    public int field818 = -1;

    @ObfuscatedName("as.aw")
    public int field819 = 32;

    @ObfuscatedName("as.at")
    public int[] field823;

    @ObfuscatedName("as.ah")
    public int field798 = -1;

    @ObfuscatedName("as.aj")
    public int field822 = -1;

    @ObfuscatedName("as.an")
    public boolean field816 = true;

    @ObfuscatedName("as.as")
    public boolean field824 = true;

    @ObfuscatedName("as.ap")
    public boolean field825 = false;

    @ObfuscatedName("as.ai")
    public int field826 = 30;

    @ObfuscatedName("ak.k(Ley;Ley;B)V")
    public static void method559(class146 arg0, class146 arg1) {
        Statics.field1460 = arg0;
        Statics.field799 = arg1;
    }

    @ObfuscatedName("v.b(II)Las;")
    public static class35 method479(int arg0) {
        class35 var1 = (class35) field792.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1460.method2759(9, arg0);
        class35 var3 = new class35();
        var3.field821 = arg0;
        if (var2 != null) {
            var3.method601(new class107(var2));
        }
        var3.method608();
        field792.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.e(I)V")
    public void method608() {
    }

    @ObfuscatedName("as.i(Ldi;B)V")
    public void method601(class107 arg0) {
        while (true) {
            int var2 = arg0.method2115();
            if (var2 == 0) {
                return;
            }
            this.method611(arg0, var2);
        }
    }

    @ObfuscatedName("as.t(Ldi;II)V")
    public void method611(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2115();
            this.field812 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field812[var4] = arg0.method2117();
            }
        } else if (arg1 == 2) {
            this.field795 = arg0.method2123();
        } else if (arg1 == 12) {
            this.field796 = arg0.method2115();
        } else if (arg1 == 13) {
            this.field797 = arg0.method2117();
        } else if (arg1 == 14) {
            this.field802 = arg0.method2117();
        } else if (arg1 == 15) {
            this.field800 = arg0.method2117();
        } else if (arg1 == 16) {
            this.field801 = arg0.method2117();
        } else if (arg1 == 17) {
            this.field802 = arg0.method2117();
            this.field803 = arg0.method2117();
            this.field804 = arg0.method2117();
            this.field791 = arg0.method2117();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field808[arg1 - 30] = arg0.method2123();
            if (this.field808[arg1 - 30].equalsIgnoreCase(class142.field2294)) {
                this.field808[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2115();
            this.field809 = new short[var5];
            this.field807 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field809[var6] = (short) arg0.method2117();
                this.field807[var6] = (short) arg0.method2117();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2115();
            this.field810 = new short[var7];
            this.field820 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field810[var8] = (short) arg0.method2117();
                this.field820[var8] = (short) arg0.method2117();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2115();
            this.field806 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field806[var10] = arg0.method2117();
            }
        } else if (arg1 == 93) {
            this.field813 = false;
        } else if (arg1 == 95) {
            this.field814 = arg0.method2117();
        } else if (arg1 == 97) {
            this.field794 = arg0.method2117();
        } else if (arg1 == 98) {
            this.field805 = arg0.method2117();
        } else if (arg1 == 99) {
            this.field815 = true;
        } else if (arg1 == 100) {
            this.field811 = arg0.method2116();
        } else if (arg1 == 101) {
            this.field817 = arg0.method2116();
        } else if (arg1 == 102) {
            this.field818 = arg0.method2117();
        } else if (arg1 == 103) {
            this.field819 = arg0.method2117();
        } else if (arg1 == 106) {
            this.field798 = arg0.method2117();
            if (this.field798 == 65535) {
                this.field798 = -1;
            }
            this.field822 = arg0.method2117();
            if (this.field822 == 65535) {
                this.field822 = -1;
            }
            int var11 = arg0.method2115();
            this.field823 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field823[var12] = arg0.method2117();
                if (this.field823[var12] == 65535) {
                    this.field823[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field816 = false;
        } else if (arg1 == 109) {
            this.field824 = false;
        } else if (arg1 == 111) {
            this.field825 = true;
        } else if (arg1 == 112) {
            this.field826 = arg0.method2115();
        }
    }

    @ObfuscatedName("as.z(Lav;ILav;II)Lck;")
    public final class98 method603(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field823 != null) {
            class35 var5 = this.method605();
            return var5 == null ? null : var5.method603(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field793.method3166((long) this.field821);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field812.length; var8++) {
                if (!Statics.field799.method2700(this.field812[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field812.length];
            for (int var10 = 0; var10 < this.field812.length; var10++) {
                var9[var10] = class93.method1881(Statics.field799, this.field812[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field809 != null) {
                for (int var12 = 0; var12 < this.field809.length; var12++) {
                    var11.method1895(this.field809[var12], this.field807[var12]);
                }
            }
            if (this.field810 != null) {
                for (int var13 = 0; var13 < this.field810.length; var13++) {
                    var11.method1924(this.field810[var13], this.field820[var13]);
                }
            }
            var6 = var11.method1902(this.field811 + 64, this.field817 * 5 + 850, -30, -50, -30);
            field793.method3161(var6, (long) this.field821);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method734(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method714(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2001(true);
        } else {
            var14 = arg2.method714(var6, arg3);
        }
        if (this.field794 != 128 || this.field805 != 128) {
            var14.method2020(this.field794, this.field805, this.field794);
        }
        return var14;
    }

    @ObfuscatedName("as.g(S)Lcv;")
    public final class93 method604() {
        if (this.field823 != null) {
            class35 var1 = this.method605();
            return var1 == null ? null : var1.method604();
        } else if (this.field806 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field806.length; var3++) {
                if (!Statics.field799.method2700(this.field806[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field806.length];
            for (int var5 = 0; var5 < this.field806.length; var5++) {
                var4[var5] = class93.method1881(Statics.field799, this.field806[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field809 != null) {
                for (int var7 = 0; var7 < this.field809.length; var7++) {
                    var6.method1895(this.field809[var7], this.field807[var7]);
                }
            }
            if (this.field810 != null) {
                for (int var8 = 0; var8 < this.field810.length; var8++) {
                    var6.method1924(this.field810[var8], this.field820[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("as.c(B)Las;")
    public final class35 method605() {
        int var1 = -1;
        if (this.field798 != -1) {
            var1 = class154.method2880(this.field798);
        } else if (this.field822 != -1) {
            var1 = class154.field2661[this.field822];
        }
        return var1 < 0 || var1 >= this.field823.length || this.field823[var1] == -1 ? null : method479(this.field823[var1]);
    }

    @ObfuscatedName("as.o(I)Z")
    public boolean method600() {
        if (this.field823 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field798 != -1) {
            var1 = class154.method2880(this.field798);
        } else if (this.field822 != -1) {
            var1 = class154.field2661[this.field822];
        }
        return var1 >= 0 && var1 < this.field823.length && this.field823[var1] != -1;
    }

    @ObfuscatedName("cj.q(B)V")
    public static void method1867() {
        field792.method3162();
        field793.method3162();
    }
}
