package deob;

@ObfuscatedName("ao")
public class class37 extends class195 {

    @ObfuscatedName("ao.p")
    public static class184 field823 = new class184(64);

    @ObfuscatedName("ao.e")
    public static class184 field809 = new class184(50);

    @ObfuscatedName("ao.i")
    public int field810;

    @ObfuscatedName("ao.o")
    public String field816 = "null";

    @ObfuscatedName("ao.f")
    public int field812 = 1;

    @ObfuscatedName("ao.d")
    public int[] field837;

    @ObfuscatedName("ao.j")
    public int[] field814;

    @ObfuscatedName("ao.x")
    public int field815 = -1;

    @ObfuscatedName("ao.v")
    public int field807 = -1;

    @ObfuscatedName("ao.a")
    public int field817 = -1;

    @ObfuscatedName("ao.l")
    public int field818 = -1;

    @ObfuscatedName("ao.h")
    public int field819 = -1;

    @ObfuscatedName("ao.c")
    public int field820 = -1;

    @ObfuscatedName("ao.u")
    public int field821 = -1;

    @ObfuscatedName("ao.r")
    public short[] field822;

    @ObfuscatedName("ao.k")
    public short[] field827;

    @ObfuscatedName("ao.w")
    public short[] field841;

    @ObfuscatedName("ao.q")
    public short[] field825;

    @ObfuscatedName("ao.g")
    public String[] field826 = new String[5];

    @ObfuscatedName("ao.z")
    public boolean field813 = true;

    @ObfuscatedName("ao.m")
    public int field828 = -1;

    @ObfuscatedName("ao.y")
    public int field829 = 128;

    @ObfuscatedName("ao.n")
    public int field830 = 128;

    @ObfuscatedName("ao.s")
    public boolean field831 = false;

    @ObfuscatedName("ao.ac")
    public int field824 = 0;

    @ObfuscatedName("ao.au")
    public int field833 = 0;

    @ObfuscatedName("ao.ap")
    public int field834 = -1;

    @ObfuscatedName("ao.ah")
    public int field835 = 32;

    @ObfuscatedName("ao.ae")
    public int[] field808;

    @ObfuscatedName("ao.ag")
    public int field836 = -1;

    @ObfuscatedName("ao.as")
    public int field806 = -1;

    @ObfuscatedName("ao.at")
    public boolean field839 = true;

    @ObfuscatedName("ao.aw")
    public boolean field840 = true;

    @ObfuscatedName("ao.ay")
    public boolean field832 = false;

    @ObfuscatedName("ao.ao")
    public int field842 = 30;

    @ObfuscatedName("er.t(IB)Lao;")
    public static class37 method2676(int arg0) {
        class37 var1 = (class37) field823.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field838.method2881(9, arg0);
        class37 var3 = new class37();
        var3.field810 = arg0;
        if (var2 != null) {
            var3.method694(new class111(var2));
        }
        var3.method702();
        field823.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.b(I)V")
    public void method702() {
    }

    @ObfuscatedName("ao.p(Ldc;I)V")
    public void method694(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method688(arg0, var2);
        }
    }

    @ObfuscatedName("ao.e(Ldc;II)V")
    public void method688(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2172();
            this.field837 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field837[var4] = arg0.method2255();
            }
        } else if (arg1 == 2) {
            this.field816 = arg0.method2180();
        } else if (arg1 == 12) {
            this.field812 = arg0.method2172();
        } else if (arg1 == 13) {
            this.field815 = arg0.method2255();
        } else if (arg1 == 14) {
            this.field818 = arg0.method2255();
        } else if (arg1 == 15) {
            this.field807 = arg0.method2255();
        } else if (arg1 == 16) {
            this.field817 = arg0.method2255();
        } else if (arg1 == 17) {
            this.field818 = arg0.method2255();
            this.field819 = arg0.method2255();
            this.field820 = arg0.method2255();
            this.field821 = arg0.method2255();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field826[arg1 - 30] = arg0.method2180();
            if (this.field826[arg1 - 30].equalsIgnoreCase(class148.field2189)) {
                this.field826[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2172();
            this.field822 = new short[var5];
            this.field827 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field822[var6] = (short) arg0.method2255();
                this.field827[var6] = (short) arg0.method2255();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2172();
            this.field841 = new short[var7];
            this.field825 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field841[var8] = (short) arg0.method2255();
                this.field825[var8] = (short) arg0.method2255();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2172();
            this.field814 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field814[var10] = arg0.method2255();
            }
        } else if (arg1 == 93) {
            this.field813 = false;
        } else if (arg1 == 95) {
            this.field828 = arg0.method2255();
        } else if (arg1 == 97) {
            this.field829 = arg0.method2255();
        } else if (arg1 == 98) {
            this.field830 = arg0.method2255();
        } else if (arg1 == 99) {
            this.field831 = true;
        } else if (arg1 == 100) {
            this.field824 = arg0.method2358();
        } else if (arg1 == 101) {
            this.field833 = arg0.method2358();
        } else if (arg1 == 102) {
            this.field834 = arg0.method2255();
        } else if (arg1 == 103) {
            this.field835 = arg0.method2255();
        } else if (arg1 == 106) {
            this.field836 = arg0.method2255();
            if (this.field836 == 65535) {
                this.field836 = -1;
            }
            this.field806 = arg0.method2255();
            if (this.field806 == 65535) {
                this.field806 = -1;
            }
            int var11 = arg0.method2172();
            this.field808 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field808[var12] = arg0.method2255();
                if (this.field808[var12] == 65535) {
                    this.field808[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field839 = false;
        } else if (arg1 == 109) {
            this.field840 = false;
        } else if (arg1 == 111) {
            this.field832 = true;
        } else if (arg1 == 112) {
            this.field842 = arg0.method2172();
        }
    }

    @ObfuscatedName("ao.i(Laj;ILaj;II)Lcs;")
    public final class100 method689(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field808 != null) {
            class37 var5 = this.method691();
            return var5 == null ? null : var5.method689(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field809.method3339((long) this.field810);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field837.length; var8++) {
                if (!Statics.field811.method2953(this.field837[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field837.length];
            for (int var10 = 0; var10 < this.field837.length; var10++) {
                var9[var10] = class95.method1964(Statics.field811, this.field837[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field822 != null) {
                for (int var12 = 0; var12 < this.field822.length; var12++) {
                    var11.method1995(this.field822[var12], this.field827[var12]);
                }
            }
            if (this.field841 != null) {
                for (int var13 = 0; var13 < this.field841.length; var13++) {
                    var11.method1943(this.field841[var13], this.field825[var13]);
                }
            }
            var6 = var11.method1950(this.field824 + 64, this.field833 * 5 + 850, -30, -50, -30);
            field809.method3341(var6, (long) this.field810);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method794(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method787(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2053(true);
        } else {
            var14 = arg2.method787(var6, arg3);
        }
        if (this.field829 != 128 || this.field830 != 128) {
            var14.method2023(this.field829, this.field830, this.field829);
        }
        return var14;
    }

    @ObfuscatedName("ao.o(I)Lcg;")
    public final class95 method690() {
        if (this.field808 != null) {
            class37 var1 = this.method691();
            return var1 == null ? null : var1.method690();
        } else if (this.field814 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field814.length; var3++) {
                if (!Statics.field811.method2953(this.field814[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field814.length];
            for (int var5 = 0; var5 < this.field814.length; var5++) {
                var4[var5] = class95.method1964(Statics.field811, this.field814[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field822 != null) {
                for (int var7 = 0; var7 < this.field822.length; var7++) {
                    var6.method1995(this.field822[var7], this.field827[var7]);
                }
            }
            if (this.field841 != null) {
                for (int var8 = 0; var8 < this.field841.length; var8++) {
                    var6.method1943(this.field841[var8], this.field825[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ao.f(I)Lao;")
    public final class37 method691() {
        int var1 = -1;
        if (this.field836 != -1) {
            var1 = class167.method2416(this.field836);
        } else if (this.field806 != -1) {
            var1 = class167.field2787[this.field806];
        }
        return var1 < 0 || var1 >= this.field808.length || this.field808[var1] == -1 ? null : method2676(this.field808[var1]);
    }

    @ObfuscatedName("ao.d(I)Z")
    public boolean method687() {
        if (this.field808 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field836 != -1) {
            var1 = class167.method2416(this.field836);
        } else if (this.field806 != -1) {
            var1 = class167.field2787[this.field806];
        }
        return var1 >= 0 && var1 < this.field808.length && this.field808[var1] != -1;
    }

    @ObfuscatedName("cc.j(I)V")
    public static void method1927() {
        field823.method3342();
        field809.method3342();
    }
}
