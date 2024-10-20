package deob;

@ObfuscatedName("al")
public class class35 extends class182 {

    @ObfuscatedName("al.y")
    public static class171 field811 = new class171(64);

    @ObfuscatedName("al.b")
    public static class171 field809 = new class171(50);

    @ObfuscatedName("al.w")
    public int field810;

    @ObfuscatedName("al.r")
    public String field836 = "null";

    @ObfuscatedName("al.l")
    public int field812 = 1;

    @ObfuscatedName("al.s")
    public int[] field813;

    @ObfuscatedName("al.f")
    public int[] field842;

    @ObfuscatedName("al.x")
    public int field815 = -1;

    @ObfuscatedName("al.h")
    public int field834 = -1;

    @ObfuscatedName("al.a")
    public int field817 = -1;

    @ObfuscatedName("al.u")
    public int field818 = -1;

    @ObfuscatedName("al.v")
    public int field819 = -1;

    @ObfuscatedName("al.i")
    public int field821 = -1;

    @ObfuscatedName("al.n")
    public int field841 = -1;

    @ObfuscatedName("al.d")
    public short[] field822;

    @ObfuscatedName("al.k")
    public short[] field823;

    @ObfuscatedName("al.p")
    public short[] field824;

    @ObfuscatedName("al.j")
    public short[] field825;

    @ObfuscatedName("al.z")
    public String[] field808 = new String[5];

    @ObfuscatedName("al.t")
    public boolean field827 = true;

    @ObfuscatedName("al.c")
    public int field828 = -1;

    @ObfuscatedName("al.q")
    public int field829 = 128;

    @ObfuscatedName("al.g")
    public int field830 = 128;

    @ObfuscatedName("al.m")
    public boolean field831 = false;

    @ObfuscatedName("al.ay")
    public int field832 = 0;

    @ObfuscatedName("al.ae")
    public int field833 = 0;

    @ObfuscatedName("al.af")
    public int field840 = -1;

    @ObfuscatedName("al.ab")
    public int field835 = 32;

    @ObfuscatedName("al.ao")
    public int[] field838;

    @ObfuscatedName("al.ak")
    public int field837 = -1;

    @ObfuscatedName("al.ah")
    public int field816 = -1;

    @ObfuscatedName("al.ai")
    public boolean field839 = true;

    @ObfuscatedName("al.al")
    public boolean field807 = true;

    @ObfuscatedName("al.av")
    public boolean field826 = false;

    @ObfuscatedName("al.ap")
    public int field820 = 30;

    @ObfuscatedName("q.e(Lez;Lez;I)V")
    public static void method510(class146 arg0, class146 arg1) {
        Statics.field814 = arg0;
        Statics.field2889 = arg1;
    }

    @ObfuscatedName("k.o(II)Lal;")
    public static class35 method472(int arg0) {
        class35 var1 = (class35) field811.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field814.method2709(9, arg0);
        class35 var3 = new class35();
        var3.field810 = arg0;
        if (var2 != null) {
            var3.method600(new class107(var2));
        }
        var3.method599();
        field811.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.y(B)V")
    public void method599() {
    }

    @ObfuscatedName("al.b(Ldl;B)V")
    public void method600(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method626(arg0, var2);
        }
    }

    @ObfuscatedName("al.w(Ldl;IB)V")
    public void method626(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2123();
            this.field813 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field813[var4] = arg0.method2232();
            }
        } else if (arg1 == 2) {
            this.field836 = arg0.method2073();
        } else if (arg1 == 12) {
            this.field812 = arg0.method2123();
        } else if (arg1 == 13) {
            this.field815 = arg0.method2232();
        } else if (arg1 == 14) {
            this.field818 = arg0.method2232();
        } else if (arg1 == 15) {
            this.field834 = arg0.method2232();
        } else if (arg1 == 16) {
            this.field817 = arg0.method2232();
        } else if (arg1 == 17) {
            this.field818 = arg0.method2232();
            this.field819 = arg0.method2232();
            this.field821 = arg0.method2232();
            this.field841 = arg0.method2232();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field808[arg1 - 30] = arg0.method2073();
            if (this.field808[arg1 - 30].equalsIgnoreCase(class142.field2145)) {
                this.field808[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2123();
            this.field822 = new short[var5];
            this.field823 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field822[var6] = (short) arg0.method2232();
                this.field823[var6] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2123();
            this.field824 = new short[var7];
            this.field825 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field824[var8] = (short) arg0.method2232();
                this.field825[var8] = (short) arg0.method2232();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2123();
            this.field842 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field842[var10] = arg0.method2232();
            }
        } else if (arg1 == 93) {
            this.field827 = false;
        } else if (arg1 == 95) {
            this.field828 = arg0.method2232();
        } else if (arg1 == 97) {
            this.field829 = arg0.method2232();
        } else if (arg1 == 98) {
            this.field830 = arg0.method2232();
        } else if (arg1 == 99) {
            this.field831 = true;
        } else if (arg1 == 100) {
            this.field832 = arg0.method2066();
        } else if (arg1 == 101) {
            this.field833 = arg0.method2066();
        } else if (arg1 == 102) {
            this.field840 = arg0.method2232();
        } else if (arg1 == 103) {
            this.field835 = arg0.method2232();
        } else if (arg1 == 106) {
            this.field837 = arg0.method2232();
            if (this.field837 == 65535) {
                this.field837 = -1;
            }
            this.field816 = arg0.method2232();
            if (this.field816 == 65535) {
                this.field816 = -1;
            }
            int var11 = arg0.method2123();
            this.field838 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field838[var12] = arg0.method2232();
                if (this.field838[var12] == 65535) {
                    this.field838[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field839 = false;
        } else if (arg1 == 109) {
            this.field807 = false;
        } else if (arg1 == 111) {
            this.field826 = true;
        } else if (arg1 == 112) {
            this.field820 = arg0.method2123();
        }
    }

    @ObfuscatedName("al.r(Lar;ILar;IB)Lcd;")
    public final class98 method601(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field838 != null) {
            class35 var5 = this.method603();
            return var5 == null ? null : var5.method601(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field809.method3058((long) this.field810);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field813.length; var8++) {
                if (!Statics.field2889.method2649(this.field813[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field813.length];
            for (int var10 = 0; var10 < this.field813.length; var10++) {
                var9[var10] = class93.method1831(Statics.field2889, this.field813[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field822 != null) {
                for (int var12 = 0; var12 < this.field822.length; var12++) {
                    var11.method1868(this.field822[var12], this.field823[var12]);
                }
            }
            if (this.field824 != null) {
                for (int var13 = 0; var13 < this.field824.length; var13++) {
                    var11.method1844(this.field824[var13], this.field825[var13]);
                }
            }
            var6 = var11.method1900(this.field832 + 64, this.field833 * 5 + 850, -30, -50, -30);
            field809.method3057(var6, (long) this.field810);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method706(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method729(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1924(true);
        } else {
            var14 = arg2.method729(var6, arg3);
        }
        if (this.field829 != 128 || this.field830 != 128) {
            var14.method1989(this.field829, this.field830, this.field829);
        }
        return var14;
    }

    @ObfuscatedName("al.l(S)Lck;")
    public final class93 method602() {
        if (this.field838 != null) {
            class35 var1 = this.method603();
            return var1 == null ? null : var1.method602();
        } else if (this.field842 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field842.length; var3++) {
                if (!Statics.field2889.method2649(this.field842[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field842.length];
            for (int var5 = 0; var5 < this.field842.length; var5++) {
                var4[var5] = class93.method1831(Statics.field2889, this.field842[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field822 != null) {
                for (int var7 = 0; var7 < this.field822.length; var7++) {
                    var6.method1868(this.field822[var7], this.field823[var7]);
                }
            }
            if (this.field824 != null) {
                for (int var8 = 0; var8 < this.field824.length; var8++) {
                    var6.method1844(this.field824[var8], this.field825[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("al.s(B)Lal;")
    public final class35 method603() {
        int var1 = -1;
        if (this.field837 != -1) {
            var1 = class154.method597(this.field837);
        } else if (this.field816 != -1) {
            var1 = class154.field2647[this.field816];
        }
        return var1 < 0 || var1 >= this.field838.length || this.field838[var1] == -1 ? null : method472(this.field838[var1]);
    }

    @ObfuscatedName("al.f(I)Z")
    public boolean method617() {
        if (this.field838 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field837 != -1) {
            var1 = class154.method597(this.field837);
        } else if (this.field816 != -1) {
            var1 = class154.field2647[this.field816];
        }
        return var1 >= 0 && var1 < this.field838.length && this.field838[var1] != -1;
    }
}
