package deob;

@ObfuscatedName("aj")
public class class35 extends class182 {

    @ObfuscatedName("aj.y")
    public static class171 field798 = new class171(64);

    @ObfuscatedName("aj.w")
    public static class171 field799 = new class171(50);

    @ObfuscatedName("aj.m")
    public int field805;

    @ObfuscatedName("aj.j")
    public String field801 = "null";

    @ObfuscatedName("aj.g")
    public int field823 = 1;

    @ObfuscatedName("aj.p")
    public int[] field802;

    @ObfuscatedName("aj.o")
    public int[] field804;

    @ObfuscatedName("aj.b")
    public int field821 = -1;

    @ObfuscatedName("aj.x")
    public int field806 = -1;

    @ObfuscatedName("aj.n")
    public int field803 = -1;

    @ObfuscatedName("aj.d")
    public int field808 = -1;

    @ObfuscatedName("aj.s")
    public int field812 = -1;

    @ObfuscatedName("aj.v")
    public int field810 = -1;

    @ObfuscatedName("aj.t")
    public int field825 = -1;

    @ObfuscatedName("aj.u")
    public short[] field816;

    @ObfuscatedName("aj.l")
    public short[] field813;

    @ObfuscatedName("aj.i")
    public short[] field814;

    @ObfuscatedName("aj.h")
    public short[] field815;

    @ObfuscatedName("aj.e")
    public String[] field826 = new String[5];

    @ObfuscatedName("aj.a")
    public boolean field807 = true;

    @ObfuscatedName("aj.c")
    public int field818 = -1;

    @ObfuscatedName("aj.f")
    public int field819 = 128;

    @ObfuscatedName("aj.q")
    public int field820 = 128;

    @ObfuscatedName("aj.z")
    public boolean field835 = false;

    @ObfuscatedName("aj.aa")
    public int field822 = 0;

    @ObfuscatedName("aj.ak")
    public int field796 = 0;

    @ObfuscatedName("aj.al")
    public int field824 = -1;

    @ObfuscatedName("aj.aw")
    public int field828 = 32;

    @ObfuscatedName("aj.ai")
    public int[] field800;

    @ObfuscatedName("aj.av")
    public int field827 = -1;

    @ObfuscatedName("aj.an")
    public int field811 = -1;

    @ObfuscatedName("aj.aq")
    public boolean field829 = true;

    @ObfuscatedName("aj.aj")
    public boolean field830 = true;

    @ObfuscatedName("aj.az")
    public boolean field831 = false;

    @ObfuscatedName("aj.ax")
    public int field832 = 30;

    @ObfuscatedName("ae.k(Lee;Lee;I)V")
    public static void method802(class146 arg0, class146 arg1) {
        Statics.field817 = arg0;
        Statics.field797 = arg1;
    }

    @ObfuscatedName("at.r(II)Laj;")
    public static class35 method917(int arg0) {
        class35 var1 = (class35) field798.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field817.method2749(9, arg0);
        class35 var3 = new class35();
        var3.field805 = arg0;
        if (var2 != null) {
            var3.method597(new class107(var2));
        }
        var3.method605();
        field798.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.y(S)V")
    public void method605() {
    }

    @ObfuscatedName("aj.w(Lde;I)V")
    public void method597(class107 arg0) {
        while (true) {
            int var2 = arg0.method2111();
            if (var2 == 0) {
                return;
            }
            this.method596(arg0, var2);
        }
    }

    @ObfuscatedName("aj.m(Lde;IB)V")
    public void method596(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2111();
            this.field802 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field802[var4] = arg0.method2232();
            }
        } else if (arg1 == 2) {
            this.field801 = arg0.method2119();
        } else if (arg1 == 12) {
            this.field823 = arg0.method2111();
        } else if (arg1 == 13) {
            this.field821 = arg0.method2232();
        } else if (arg1 == 14) {
            this.field808 = arg0.method2232();
        } else if (arg1 == 15) {
            this.field806 = arg0.method2232();
        } else if (arg1 == 16) {
            this.field803 = arg0.method2232();
        } else if (arg1 == 17) {
            this.field808 = arg0.method2232();
            this.field812 = arg0.method2232();
            this.field810 = arg0.method2232();
            this.field825 = arg0.method2232();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field826[arg1 - 30] = arg0.method2119();
            if (this.field826[arg1 - 30].equalsIgnoreCase(class142.field2205)) {
                this.field826[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2111();
            this.field816 = new short[var5];
            this.field813 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field816[var6] = (short) arg0.method2232();
                this.field813[var6] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2111();
            this.field814 = new short[var7];
            this.field815 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field814[var8] = (short) arg0.method2232();
                this.field815[var8] = (short) arg0.method2232();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2111();
            this.field804 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field804[var10] = arg0.method2232();
            }
        } else if (arg1 == 93) {
            this.field807 = false;
        } else if (arg1 == 95) {
            this.field818 = arg0.method2232();
        } else if (arg1 == 97) {
            this.field819 = arg0.method2232();
        } else if (arg1 == 98) {
            this.field820 = arg0.method2232();
        } else if (arg1 == 99) {
            this.field835 = true;
        } else if (arg1 == 100) {
            this.field822 = arg0.method2112();
        } else if (arg1 == 101) {
            this.field796 = arg0.method2112();
        } else if (arg1 == 102) {
            this.field824 = arg0.method2232();
        } else if (arg1 == 103) {
            this.field828 = arg0.method2232();
        } else if (arg1 == 106) {
            this.field827 = arg0.method2232();
            if (this.field827 == 65535) {
                this.field827 = -1;
            }
            this.field811 = arg0.method2232();
            if (this.field811 == 65535) {
                this.field811 = -1;
            }
            int var11 = arg0.method2111();
            this.field800 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field800[var12] = arg0.method2232();
                if (this.field800[var12] == 65535) {
                    this.field800[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field829 = false;
        } else if (arg1 == 109) {
            this.field830 = false;
        } else if (arg1 == 111) {
            this.field831 = true;
        } else if (arg1 == 112) {
            this.field832 = arg0.method2111();
        }
    }

    @ObfuscatedName("aj.j(Lap;ILap;II)Lcp;")
    public final class98 method599(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field800 != null) {
            class35 var5 = this.method601();
            return var5 == null ? null : var5.method599(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field799.method3141((long) this.field805);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field802.length; var8++) {
                if (!Statics.field797.method2727(this.field802[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field802.length];
            for (int var10 = 0; var10 < this.field802.length; var10++) {
                var9[var10] = class93.method1922(Statics.field797, this.field802[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field816 != null) {
                for (int var12 = 0; var12 < this.field816.length; var12++) {
                    var11.method1925(this.field816[var12], this.field813[var12]);
                }
            }
            if (this.field814 != null) {
                for (int var13 = 0; var13 < this.field814.length; var13++) {
                    var11.method1885(this.field814[var13], this.field815[var13]);
                }
            }
            var6 = var11.method1892(this.field822 + 64, this.field796 * 5 + 850, -30, -50, -30);
            field799.method3137(var6, (long) this.field805);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method728(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method700(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1977(true);
        } else {
            var14 = arg2.method700(var6, arg3);
        }
        if (this.field819 != 128 || this.field820 != 128) {
            var14.method1991(this.field819, this.field820, this.field819);
        }
        return var14;
    }

    @ObfuscatedName("aj.g(I)Lcl;")
    public final class93 method625() {
        if (this.field800 != null) {
            class35 var1 = this.method601();
            return var1 == null ? null : var1.method625();
        } else if (this.field804 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field804.length; var3++) {
                if (!Statics.field797.method2727(this.field804[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field804.length];
            for (int var5 = 0; var5 < this.field804.length; var5++) {
                var4[var5] = class93.method1922(Statics.field797, this.field804[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field816 != null) {
                for (int var7 = 0; var7 < this.field816.length; var7++) {
                    var6.method1925(this.field816[var7], this.field813[var7]);
                }
            }
            if (this.field814 != null) {
                for (int var8 = 0; var8 < this.field814.length; var8++) {
                    var6.method1885(this.field814[var8], this.field815[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aj.p(I)Laj;")
    public final class35 method601() {
        int var1 = -1;
        if (this.field827 != -1) {
            var1 = class154.method2548(this.field827);
        } else if (this.field811 != -1) {
            var1 = class154.field2665[this.field811];
        }
        return var1 < 0 || var1 >= this.field800.length || this.field800[var1] == -1 ? null : method917(this.field800[var1]);
    }

    @ObfuscatedName("aj.o(B)Z")
    public boolean method602() {
        if (this.field800 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field827 != -1) {
            var1 = class154.method2548(this.field827);
        } else if (this.field811 != -1) {
            var1 = class154.field2665[this.field811];
        }
        return var1 >= 0 && var1 < this.field800.length && this.field800[var1] != -1;
    }
}
