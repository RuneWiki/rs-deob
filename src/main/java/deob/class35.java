package deob;

@ObfuscatedName("an")
public class class35 extends class181 {

    @ObfuscatedName("an.y")
    public static class171 field806 = new class171(64);

    @ObfuscatedName("an.h")
    public static class171 field812 = new class171(50);

    @ObfuscatedName("an.r")
    public int field811;

    @ObfuscatedName("an.e")
    public String field820 = "null";

    @ObfuscatedName("an.k")
    public int field808 = 1;

    @ObfuscatedName("an.b")
    public int[] field809;

    @ObfuscatedName("an.n")
    public int[] field804;

    @ObfuscatedName("an.a")
    public int field832 = -1;

    @ObfuscatedName("an.q")
    public int field837 = -1;

    @ObfuscatedName("an.i")
    public int field813 = -1;

    @ObfuscatedName("an.f")
    public int field814 = -1;

    @ObfuscatedName("an.o")
    public int field815 = -1;

    @ObfuscatedName("an.t")
    public int field816 = -1;

    @ObfuscatedName("an.c")
    public int field817 = -1;

    @ObfuscatedName("an.d")
    public short[] field818;

    @ObfuscatedName("an.g")
    public short[] field819;

    @ObfuscatedName("an.s")
    public short[] field828;

    @ObfuscatedName("an.m")
    public short[] field821;

    @ObfuscatedName("an.v")
    public String[] field822 = new String[5];

    @ObfuscatedName("an.u")
    public boolean field823 = true;

    @ObfuscatedName("an.p")
    public int field824 = -1;

    @ObfuscatedName("an.l")
    public int field825 = 128;

    @ObfuscatedName("an.w")
    public int field805 = 128;

    @ObfuscatedName("an.x")
    public boolean field827 = false;

    @ObfuscatedName("an.aj")
    public int field826 = 0;

    @ObfuscatedName("an.al")
    public int field810 = 0;

    @ObfuscatedName("an.af")
    public int field830 = -1;

    @ObfuscatedName("an.ai")
    public int field831 = 32;

    @ObfuscatedName("an.ak")
    public int[] field803;

    @ObfuscatedName("an.ae")
    public int field833 = -1;

    @ObfuscatedName("an.ag")
    public int field834 = -1;

    @ObfuscatedName("an.ar")
    public boolean field835 = true;

    @ObfuscatedName("an.an")
    public boolean field836 = true;

    @ObfuscatedName("an.av")
    public boolean field807 = false;

    @ObfuscatedName("u.z(IB)Lan;")
    public static class35 method464(int arg0) {
        class35 var1 = (class35) field806.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field829.method2739(9, arg0);
        class35 var3 = new class35();
        var3.field811 = arg0;
        if (var2 != null) {
            var3.method610(new class107(var2));
        }
        var3.method591();
        field806.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.y(I)V")
    public void method591() {
    }

    @ObfuscatedName("an.h(Lde;I)V")
    public void method610(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method593(arg0, var2);
        }
    }

    @ObfuscatedName("an.r(Lde;II)V")
    public void method593(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2130();
            this.field809 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field809[var4] = arg0.method2132();
            }
        } else if (arg1 == 2) {
            this.field820 = arg0.method2138();
        } else if (arg1 == 12) {
            this.field808 = arg0.method2130();
        } else if (arg1 == 13) {
            this.field832 = arg0.method2132();
        } else if (arg1 == 14) {
            this.field814 = arg0.method2132();
        } else if (arg1 == 15) {
            this.field837 = arg0.method2132();
        } else if (arg1 == 16) {
            this.field813 = arg0.method2132();
        } else if (arg1 == 17) {
            this.field814 = arg0.method2132();
            this.field815 = arg0.method2132();
            this.field816 = arg0.method2132();
            this.field817 = arg0.method2132();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field822[arg1 - 30] = arg0.method2138();
            if (this.field822[arg1 - 30].equalsIgnoreCase(class142.field2158)) {
                this.field822[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2130();
            this.field818 = new short[var5];
            this.field819 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field818[var6] = (short) arg0.method2132();
                this.field819[var6] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2130();
            this.field828 = new short[var7];
            this.field821 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field828[var8] = (short) arg0.method2132();
                this.field821[var8] = (short) arg0.method2132();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2130();
            this.field804 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field804[var10] = arg0.method2132();
            }
        } else if (arg1 == 93) {
            this.field823 = false;
        } else if (arg1 == 95) {
            this.field824 = arg0.method2132();
        } else if (arg1 == 97) {
            this.field825 = arg0.method2132();
        } else if (arg1 == 98) {
            this.field805 = arg0.method2132();
        } else if (arg1 == 99) {
            this.field827 = true;
        } else if (arg1 == 100) {
            this.field826 = arg0.method2131();
        } else if (arg1 == 101) {
            this.field810 = arg0.method2131() * 5;
        } else if (arg1 == 102) {
            this.field830 = arg0.method2132();
        } else if (arg1 == 103) {
            this.field831 = arg0.method2132();
        } else if (arg1 == 106) {
            this.field833 = arg0.method2132();
            if (this.field833 == 65535) {
                this.field833 = -1;
            }
            this.field834 = arg0.method2132();
            if (this.field834 == 65535) {
                this.field834 = -1;
            }
            int var11 = arg0.method2130();
            this.field803 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field803[var12] = arg0.method2132();
                if (this.field803[var12] == 65535) {
                    this.field803[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field835 = false;
        } else if (arg1 == 109) {
            this.field836 = false;
        } else if (arg1 == 111) {
            this.field807 = true;
        }
    }

    @ObfuscatedName("an.e(Laq;ILaq;II)Lcl;")
    public final class98 method594(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field803 != null) {
            class35 var5 = this.method596();
            return var5 == null ? null : var5.method594(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field812.method3171((long) this.field811);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field809.length; var8++) {
                if (!Statics.field1676.method2741(this.field809[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field809.length];
            for (int var10 = 0; var10 < this.field809.length; var10++) {
                var9[var10] = class93.method1938(Statics.field1676, this.field809[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field818 != null) {
                for (int var12 = 0; var12 < this.field818.length; var12++) {
                    var11.method1906(this.field818[var12], this.field819[var12]);
                }
            }
            if (this.field828 != null) {
                for (int var13 = 0; var13 < this.field828.length; var13++) {
                    var11.method1907(this.field828[var13], this.field821[var13]);
                }
            }
            var6 = var11.method1914(this.field826 + 64, this.field810 + 850, -30, -50, -30);
            field812.method3173(var6, (long) this.field811);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method689(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method686(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1985(true);
        } else {
            var14 = arg2.method686(var6, arg3);
        }
        if (this.field825 != 128 || this.field805 != 128) {
            var14.method1998(this.field825, this.field805, this.field825);
        }
        return var14;
    }

    @ObfuscatedName("an.k(B)Lcx;")
    public final class93 method592() {
        if (this.field803 != null) {
            class35 var1 = this.method596();
            return var1 == null ? null : var1.method592();
        } else if (this.field804 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field804.length; var3++) {
                if (!Statics.field1676.method2741(this.field804[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field804.length];
            for (int var5 = 0; var5 < this.field804.length; var5++) {
                var4[var5] = class93.method1938(Statics.field1676, this.field804[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field818 != null) {
                for (int var7 = 0; var7 < this.field818.length; var7++) {
                    var6.method1906(this.field818[var7], this.field819[var7]);
                }
            }
            if (this.field828 != null) {
                for (int var8 = 0; var8 < this.field828.length; var8++) {
                    var6.method1907(this.field828[var8], this.field821[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("an.b(I)Lan;")
    public final class35 method596() {
        int var1 = -1;
        if (this.field833 != -1) {
            var1 = class154.method480(this.field833);
        } else if (this.field834 != -1) {
            var1 = class154.field2664[this.field834];
        }
        return var1 < 0 || var1 >= this.field803.length || this.field803[var1] == -1 ? null : method464(this.field803[var1]);
    }

    @ObfuscatedName("an.n(S)Z")
    public boolean method597() {
        if (this.field803 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field833 != -1) {
            var1 = class154.method480(this.field833);
        } else if (this.field834 != -1) {
            var1 = class154.field2664[this.field834];
        }
        return var1 >= 0 && var1 < this.field803.length && this.field803[var1] != -1;
    }
}
