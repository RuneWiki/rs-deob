package deob;

@ObfuscatedName("an")
public class class35 extends class182 {

    @ObfuscatedName("an.i")
    public static class171 field790 = new class171(64);

    @ObfuscatedName("an.g")
    public static class171 field821 = new class171(50);

    @ObfuscatedName("an.x")
    public int field792;

    @ObfuscatedName("an.b")
    public String field811 = "null";

    @ObfuscatedName("an.q")
    public int field794 = 1;

    @ObfuscatedName("an.l")
    public int[] field820;

    @ObfuscatedName("an.m")
    public int[] field796;

    @ObfuscatedName("an.u")
    public int field797 = -1;

    @ObfuscatedName("an.s")
    public int field798 = -1;

    @ObfuscatedName("an.f")
    public int field799 = -1;

    @ObfuscatedName("an.p")
    public int field808 = -1;

    @ObfuscatedName("an.w")
    public int field801 = -1;

    @ObfuscatedName("an.y")
    public int field802 = -1;

    @ObfuscatedName("an.h")
    public int field825 = -1;

    @ObfuscatedName("an.j")
    public short[] field807;

    @ObfuscatedName("an.c")
    public short[] field805;

    @ObfuscatedName("an.d")
    public short[] field806;

    @ObfuscatedName("an.a")
    public short[] field824;

    @ObfuscatedName("an.o")
    public String[] field804 = new String[5];

    @ObfuscatedName("an.r")
    public boolean field809 = true;

    @ObfuscatedName("an.t")
    public int field810 = -1;

    @ObfuscatedName("an.k")
    public int field815 = 128;

    @ObfuscatedName("an.n")
    public int field812 = 128;

    @ObfuscatedName("an.z")
    public boolean field813 = false;

    @ObfuscatedName("an.av")
    public int field814 = 0;

    @ObfuscatedName("an.ao")
    public int field791 = 0;

    @ObfuscatedName("an.am")
    public int field828 = -1;

    @ObfuscatedName("an.ac")
    public int field817 = 32;

    @ObfuscatedName("an.ak")
    public int[] field818;

    @ObfuscatedName("an.ag")
    public int field819 = -1;

    @ObfuscatedName("an.ap")
    public int field793 = -1;

    @ObfuscatedName("an.ah")
    public boolean field795 = true;

    @ObfuscatedName("an.an")
    public boolean field816 = true;

    @ObfuscatedName("an.ay")
    public boolean field823 = false;

    @ObfuscatedName("an.af")
    public int field826 = 30;

    @ObfuscatedName("ep.e(Les;Les;I)V")
    public static void method2673(class146 arg0, class146 arg1) {
        Statics.field2023 = arg0;
        Statics.field789 = arg1;
    }

    @ObfuscatedName("ak.v(IB)Lan;")
    public static class35 method562(int arg0) {
        class35 var1 = (class35) field790.method3136((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2023.method2695(9, arg0);
        class35 var3 = new class35();
        var3.field792 = arg0;
        if (var2 != null) {
            var3.method596(new class107(var2));
        }
        var3.method595();
        field790.method3127(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.i(I)V")
    public void method595() {
    }

    @ObfuscatedName("an.g(Ldk;I)V")
    public void method596(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method622(arg0, var2);
        }
    }

    @ObfuscatedName("an.x(Ldk;II)V")
    public void method622(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2226();
            this.field820 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field820[var4] = arg0.method2152();
            }
        } else if (arg1 == 2) {
            this.field811 = arg0.method2124();
        } else if (arg1 == 12) {
            this.field794 = arg0.method2226();
        } else if (arg1 == 13) {
            this.field797 = arg0.method2152();
        } else if (arg1 == 14) {
            this.field808 = arg0.method2152();
        } else if (arg1 == 15) {
            this.field798 = arg0.method2152();
        } else if (arg1 == 16) {
            this.field799 = arg0.method2152();
        } else if (arg1 == 17) {
            this.field808 = arg0.method2152();
            this.field801 = arg0.method2152();
            this.field802 = arg0.method2152();
            this.field825 = arg0.method2152();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field804[arg1 - 30] = arg0.method2124();
            if (this.field804[arg1 - 30].equalsIgnoreCase(class142.field2372)) {
                this.field804[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2226();
            this.field807 = new short[var5];
            this.field805 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field807[var6] = (short) arg0.method2152();
                this.field805[var6] = (short) arg0.method2152();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2226();
            this.field806 = new short[var7];
            this.field824 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field806[var8] = (short) arg0.method2152();
                this.field824[var8] = (short) arg0.method2152();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2226();
            this.field796 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field796[var10] = arg0.method2152();
            }
        } else if (arg1 == 93) {
            this.field809 = false;
        } else if (arg1 == 95) {
            this.field810 = arg0.method2152();
        } else if (arg1 == 97) {
            this.field815 = arg0.method2152();
        } else if (arg1 == 98) {
            this.field812 = arg0.method2152();
        } else if (arg1 == 99) {
            this.field813 = true;
        } else if (arg1 == 100) {
            this.field814 = arg0.method2292();
        } else if (arg1 == 101) {
            this.field791 = arg0.method2292();
        } else if (arg1 == 102) {
            this.field828 = arg0.method2152();
        } else if (arg1 == 103) {
            this.field817 = arg0.method2152();
        } else if (arg1 == 106) {
            this.field819 = arg0.method2152();
            if (this.field819 == 65535) {
                this.field819 = -1;
            }
            this.field793 = arg0.method2152();
            if (this.field793 == 65535) {
                this.field793 = -1;
            }
            int var11 = arg0.method2226();
            this.field818 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field818[var12] = arg0.method2152();
                if (this.field818[var12] == 65535) {
                    this.field818[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field795 = false;
        } else if (arg1 == 109) {
            this.field816 = false;
        } else if (arg1 == 111) {
            this.field823 = true;
        } else if (arg1 == 112) {
            this.field826 = arg0.method2226();
        }
    }

    @ObfuscatedName("an.b(Laq;ILaq;IB)Lcz;")
    public final class98 method598(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field818 != null) {
            class35 var5 = this.method602();
            return var5 == null ? null : var5.method598(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field821.method3136((long) this.field792);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field820.length; var8++) {
                if (!Statics.field789.method2697(this.field820[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field820.length];
            for (int var10 = 0; var10 < this.field820.length; var10++) {
                var9[var10] = class93.method1877(Statics.field789, this.field820[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field807 != null) {
                for (int var12 = 0; var12 < this.field807.length; var12++) {
                    var11.method1890(this.field807[var12], this.field805[var12]);
                }
            }
            if (this.field806 != null) {
                for (int var13 = 0; var13 < this.field806.length; var13++) {
                    var11.method1883(this.field806[var13], this.field824[var13]);
                }
            }
            var6 = var11.method1897(this.field814 + 64, this.field791 * 5 + 850, -30, -50, -30);
            field821.method3127(var6, (long) this.field792);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method700(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method697(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1966(true);
        } else {
            var14 = arg2.method697(var6, arg3);
        }
        if (this.field815 != 128 || this.field812 != 128) {
            var14.method1980(this.field815, this.field812, this.field815);
        }
        return var14;
    }

    @ObfuscatedName("an.q(I)Lcr;")
    public final class93 method599() {
        if (this.field818 != null) {
            class35 var1 = this.method602();
            return var1 == null ? null : var1.method599();
        } else if (this.field796 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field796.length; var3++) {
                if (!Statics.field789.method2697(this.field796[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field796.length];
            for (int var5 = 0; var5 < this.field796.length; var5++) {
                var4[var5] = class93.method1877(Statics.field789, this.field796[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field807 != null) {
                for (int var7 = 0; var7 < this.field807.length; var7++) {
                    var6.method1890(this.field807[var7], this.field805[var7]);
                }
            }
            if (this.field806 != null) {
                for (int var8 = 0; var8 < this.field806.length; var8++) {
                    var6.method1883(this.field806[var8], this.field824[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("an.l(I)Lan;")
    public final class35 method602() {
        int var1 = -1;
        if (this.field819 != -1) {
            var1 = class154.method877(this.field819);
        } else if (this.field793 != -1) {
            var1 = class154.field2649[this.field793];
        }
        return var1 < 0 || var1 >= this.field818.length || this.field818[var1] == -1 ? null : method562(this.field818[var1]);
    }

    @ObfuscatedName("an.m(I)Z")
    public boolean method601() {
        if (this.field818 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field819 != -1) {
            var1 = class154.method877(this.field819);
        } else if (this.field793 != -1) {
            var1 = class154.field2649[this.field793];
        }
        return var1 >= 0 && var1 < this.field818.length && this.field818[var1] != -1;
    }

    @ObfuscatedName("s.u(S)V")
    public static void method129() {
        field790.method3128();
        field821.method3128();
    }
}
