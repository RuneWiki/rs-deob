package deob;

@ObfuscatedName("ab")
public class class35 extends class182 {

    @ObfuscatedName("ab.h")
    public static class171 field816 = new class171(64);

    @ObfuscatedName("ab.v")
    public static class171 field805 = new class171(50);

    @ObfuscatedName("ab.q")
    public int field806;

    @ObfuscatedName("ab.s")
    public String field807 = "null";

    @ObfuscatedName("ab.g")
    public int field812 = 1;

    @ObfuscatedName("ab.u")
    public int[] field809;

    @ObfuscatedName("ab.d")
    public int[] field810;

    @ObfuscatedName("ab.y")
    public int field818 = -1;

    @ObfuscatedName("ab.e")
    public int field820 = -1;

    @ObfuscatedName("ab.l")
    public int field813 = -1;

    @ObfuscatedName("ab.o")
    public int field814 = -1;

    @ObfuscatedName("ab.w")
    public int field835 = -1;

    @ObfuscatedName("ab.t")
    public int field823 = -1;

    @ObfuscatedName("ab.z")
    public int field803 = -1;

    @ObfuscatedName("ab.b")
    public short[] field804;

    @ObfuscatedName("ab.a")
    public short[] field819;

    @ObfuscatedName("ab.r")
    public short[] field828;

    @ObfuscatedName("ab.m")
    public short[] field821;

    @ObfuscatedName("ab.f")
    public String[] field822 = new String[5];

    @ObfuscatedName("ab.k")
    public boolean field808 = true;

    @ObfuscatedName("ab.p")
    public int field824 = -1;

    @ObfuscatedName("ab.n")
    public int field825 = 128;

    @ObfuscatedName("ab.j")
    public int field826 = 128;

    @ObfuscatedName("ab.x")
    public boolean field827 = false;

    @ObfuscatedName("ab.al")
    public int field833 = 0;

    @ObfuscatedName("ab.au")
    public int field829 = 0;

    @ObfuscatedName("ab.az")
    public int field830 = -1;

    @ObfuscatedName("ab.ag")
    public int field831 = 32;

    @ObfuscatedName("ab.aj")
    public int[] field832;

    @ObfuscatedName("ab.af")
    public int field802 = -1;

    @ObfuscatedName("ab.am")
    public int field834 = -1;

    @ObfuscatedName("ab.aa")
    public boolean field817 = true;

    @ObfuscatedName("ab.ab")
    public boolean field836 = true;

    @ObfuscatedName("ab.ai")
    public boolean field837 = false;

    @ObfuscatedName("ab.ak")
    public int field838 = 30;

    @ObfuscatedName("l.i(Ler;Ler;I)V")
    public static void method130(class146 arg0, class146 arg1) {
        Statics.field811 = arg0;
        Statics.field815 = arg1;
    }

    @ObfuscatedName("ez.c(II)Lab;")
    public static class35 method2723(int arg0) {
        class35 var1 = (class35) field816.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field811.method2811(9, arg0);
        class35 var3 = new class35();
        var3.field806 = arg0;
        if (var2 != null) {
            var3.method615(new class107(var2));
        }
        var3.method642();
        field816.method3186(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.h(B)V")
    public void method642() {
    }

    @ObfuscatedName("ab.v(Ldm;I)V")
    public void method615(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method616(arg0, var2);
        }
    }

    @ObfuscatedName("ab.q(Ldm;II)V")
    public void method616(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2151();
            this.field809 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field809[var4] = arg0.method2313();
            }
        } else if (arg1 == 2) {
            this.field807 = arg0.method2159();
        } else if (arg1 == 12) {
            this.field812 = arg0.method2151();
        } else if (arg1 == 13) {
            this.field818 = arg0.method2313();
        } else if (arg1 == 14) {
            this.field814 = arg0.method2313();
        } else if (arg1 == 15) {
            this.field820 = arg0.method2313();
        } else if (arg1 == 16) {
            this.field813 = arg0.method2313();
        } else if (arg1 == 17) {
            this.field814 = arg0.method2313();
            this.field835 = arg0.method2313();
            this.field823 = arg0.method2313();
            this.field803 = arg0.method2313();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field822[arg1 - 30] = arg0.method2159();
            if (this.field822[arg1 - 30].equalsIgnoreCase(class142.field2196)) {
                this.field822[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2151();
            this.field804 = new short[var5];
            this.field819 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field804[var6] = (short) arg0.method2313();
                this.field819[var6] = (short) arg0.method2313();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2151();
            this.field828 = new short[var7];
            this.field821 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field828[var8] = (short) arg0.method2313();
                this.field821[var8] = (short) arg0.method2313();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2151();
            this.field810 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field810[var10] = arg0.method2313();
            }
        } else if (arg1 == 93) {
            this.field808 = false;
        } else if (arg1 == 95) {
            this.field824 = arg0.method2313();
        } else if (arg1 == 97) {
            this.field825 = arg0.method2313();
        } else if (arg1 == 98) {
            this.field826 = arg0.method2313();
        } else if (arg1 == 99) {
            this.field827 = true;
        } else if (arg1 == 100) {
            this.field833 = arg0.method2152();
        } else if (arg1 == 101) {
            this.field829 = arg0.method2152() * 5;
        } else if (arg1 == 102) {
            this.field830 = arg0.method2313();
        } else if (arg1 == 103) {
            this.field831 = arg0.method2313();
        } else if (arg1 == 106) {
            this.field802 = arg0.method2313();
            if (this.field802 == 65535) {
                this.field802 = -1;
            }
            this.field834 = arg0.method2313();
            if (this.field834 == 65535) {
                this.field834 = -1;
            }
            int var11 = arg0.method2151();
            this.field832 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field832[var12] = arg0.method2313();
                if (this.field832[var12] == 65535) {
                    this.field832[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field817 = false;
        } else if (arg1 == 109) {
            this.field836 = false;
        } else if (arg1 == 111) {
            this.field837 = true;
        } else if (arg1 == 112) {
            this.field838 = arg0.method2151();
        }
    }

    @ObfuscatedName("ab.s(Lao;ILao;II)Lcc;")
    public final class98 method617(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field832 != null) {
            class35 var5 = this.method654();
            return var5 == null ? null : var5.method617(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field805.method3185((long) this.field806);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field809.length; var8++) {
                if (!Statics.field815.method2742(this.field809[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field809.length];
            for (int var10 = 0; var10 < this.field809.length; var10++) {
                var9[var10] = class93.method1903(Statics.field815, this.field809[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field804 != null) {
                for (int var12 = 0; var12 < this.field804.length; var12++) {
                    var11.method1915(this.field804[var12], this.field819[var12]);
                }
            }
            if (this.field828 != null) {
                for (int var13 = 0; var13 < this.field828.length; var13++) {
                    var11.method1916(this.field828[var13], this.field821[var13]);
                }
            }
            var6 = var11.method1902(this.field833 + 64, this.field829 + 850, -30, -50, -30);
            field805.method3186(var6, (long) this.field806);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method721(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method718(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2003(true);
        } else {
            var14 = arg2.method718(var6, arg3);
        }
        if (this.field825 != 128 || this.field826 != 128) {
            var14.method2017(this.field825, this.field826, this.field825);
        }
        return var14;
    }

    @ObfuscatedName("ab.g(I)Lcx;")
    public final class93 method618() {
        if (this.field832 != null) {
            class35 var1 = this.method654();
            return var1 == null ? null : var1.method618();
        } else if (this.field810 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field810.length; var3++) {
                if (!Statics.field815.method2742(this.field810[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field810.length];
            for (int var5 = 0; var5 < this.field810.length; var5++) {
                var4[var5] = class93.method1903(Statics.field815, this.field810[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field804 != null) {
                for (int var7 = 0; var7 < this.field804.length; var7++) {
                    var6.method1915(this.field804[var7], this.field819[var7]);
                }
            }
            if (this.field828 != null) {
                for (int var8 = 0; var8 < this.field828.length; var8++) {
                    var6.method1916(this.field828[var8], this.field821[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ab.u(I)Lab;")
    public final class35 method654() {
        int var1 = -1;
        if (this.field802 != -1) {
            var1 = class154.method711(this.field802);
        } else if (this.field834 != -1) {
            var1 = class154.field2661[this.field834];
        }
        return var1 < 0 || var1 >= this.field832.length || this.field832[var1] == -1 ? null : method2723(this.field832[var1]);
    }

    @ObfuscatedName("ab.d(I)Z")
    public boolean method620() {
        if (this.field832 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field802 != -1) {
            var1 = class154.method711(this.field802);
        } else if (this.field834 != -1) {
            var1 = class154.field2661[this.field834];
        }
        return var1 >= 0 && var1 < this.field832.length && this.field832[var1] != -1;
    }

    @ObfuscatedName("an.y(B)V")
    public static void method800() {
        field816.method3188();
        field805.method3188();
    }
}
