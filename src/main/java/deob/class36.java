package deob;

@ObfuscatedName("as")
public class class36 extends class185 {

    @ObfuscatedName("as.m")
    public static class174 field821 = new class174(64);

    @ObfuscatedName("as.e")
    public static class174 field808 = new class174(50);

    @ObfuscatedName("as.h")
    public int field809;

    @ObfuscatedName("as.p")
    public String field810 = "null";

    @ObfuscatedName("as.j")
    public int field844 = 1;

    @ObfuscatedName("as.i")
    public int[] field814;

    @ObfuscatedName("as.u")
    public int[] field813;

    @ObfuscatedName("as.l")
    public int field846 = -1;

    @ObfuscatedName("as.k")
    public int field833 = -1;

    @ObfuscatedName("as.q")
    public int field816 = -1;

    @ObfuscatedName("as.b")
    public int field817 = -1;

    @ObfuscatedName("as.w")
    public int field818 = -1;

    @ObfuscatedName("as.g")
    public int field819 = -1;

    @ObfuscatedName("as.s")
    public int field838 = -1;

    @ObfuscatedName("as.c")
    public short[] field811;

    @ObfuscatedName("as.r")
    public short[] field822;

    @ObfuscatedName("as.f")
    public short[] field843;

    @ObfuscatedName("as.t")
    public short[] field824;

    @ObfuscatedName("as.o")
    public String[] field825 = new String[5];

    @ObfuscatedName("as.z")
    public boolean field815 = true;

    @ObfuscatedName("as.d")
    public int field826 = -1;

    @ObfuscatedName("as.y")
    public int field828 = 128;

    @ObfuscatedName("as.a")
    public int field829 = 128;

    @ObfuscatedName("as.n")
    public boolean field830 = false;

    @ObfuscatedName("as.ae")
    public int field831 = 0;

    @ObfuscatedName("as.ay")
    public int field832 = 0;

    @ObfuscatedName("as.ac")
    public int field827 = -1;

    @ObfuscatedName("as.ag")
    public int field834 = 32;

    @ObfuscatedName("as.am")
    public int[] field835;

    @ObfuscatedName("as.au")
    public int field836 = -1;

    @ObfuscatedName("as.ai")
    public int field837 = -1;

    @ObfuscatedName("as.ab")
    public boolean field805 = true;

    @ObfuscatedName("as.az")
    public boolean field839 = true;

    @ObfuscatedName("as.as")
    public boolean field807 = false;

    @ObfuscatedName("as.ah")
    public int field820 = 30;

    @ObfuscatedName("k.x(II)Las;")
    public static class36 method119(int arg0) {
        class36 var1 = (class36) field821.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field823.method2751(9, arg0);
        class36 var3 = new class36();
        var3.field809 = arg0;
        if (var2 != null) {
            var3.method647(new class108(var2));
        }
        var3.method663();
        field821.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.v(B)V")
    public void method663() {
    }

    @ObfuscatedName("as.m(Ldm;I)V")
    public void method647(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method641(arg0, var2);
        }
    }

    @ObfuscatedName("as.e(Ldm;II)V")
    public void method641(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2299();
            this.field814 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field814[var4] = arg0.method2129();
            }
        } else if (arg1 == 2) {
            this.field810 = arg0.method2270();
        } else if (arg1 == 12) {
            this.field844 = arg0.method2299();
        } else if (arg1 == 13) {
            this.field846 = arg0.method2129();
        } else if (arg1 == 14) {
            this.field817 = arg0.method2129();
        } else if (arg1 == 15) {
            this.field833 = arg0.method2129();
        } else if (arg1 == 16) {
            this.field816 = arg0.method2129();
        } else if (arg1 == 17) {
            this.field817 = arg0.method2129();
            this.field818 = arg0.method2129();
            this.field819 = arg0.method2129();
            this.field838 = arg0.method2129();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field825[arg1 - 30] = arg0.method2270();
            if (this.field825[arg1 - 30].equalsIgnoreCase(class145.field2164)) {
                this.field825[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2299();
            this.field811 = new short[var5];
            this.field822 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field811[var6] = (short) arg0.method2129();
                this.field822[var6] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2299();
            this.field843 = new short[var7];
            this.field824 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field843[var8] = (short) arg0.method2129();
                this.field824[var8] = (short) arg0.method2129();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2299();
            this.field813 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field813[var10] = arg0.method2129();
            }
        } else if (arg1 == 93) {
            this.field815 = false;
        } else if (arg1 == 95) {
            this.field826 = arg0.method2129();
        } else if (arg1 == 97) {
            this.field828 = arg0.method2129();
        } else if (arg1 == 98) {
            this.field829 = arg0.method2129();
        } else if (arg1 == 99) {
            this.field830 = true;
        } else if (arg1 == 100) {
            this.field831 = arg0.method2128();
        } else if (arg1 == 101) {
            this.field832 = arg0.method2128() * 5;
        } else if (arg1 == 102) {
            this.field827 = arg0.method2129();
        } else if (arg1 == 103) {
            this.field834 = arg0.method2129();
        } else if (arg1 == 106) {
            this.field836 = arg0.method2129();
            if (this.field836 == 65535) {
                this.field836 = -1;
            }
            this.field837 = arg0.method2129();
            if (this.field837 == 65535) {
                this.field837 = -1;
            }
            int var11 = arg0.method2299();
            this.field835 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field835[var12] = arg0.method2129();
                if (this.field835[var12] == 65535) {
                    this.field835[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field805 = false;
        } else if (arg1 == 109) {
            this.field839 = false;
        } else if (arg1 == 111) {
            this.field807 = true;
        } else if (arg1 == 112) {
            this.field820 = arg0.method2299();
        }
    }

    @ObfuscatedName("as.h(Lar;ILar;IS)Lck;")
    public final class99 method642(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field835 != null) {
            class36 var5 = this.method649();
            return var5 == null ? null : var5.method642(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field808.method3186((long) this.field809);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field814.length; var8++) {
                if (!Statics.field806.method2728(this.field814[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field814.length];
            for (int var10 = 0; var10 < this.field814.length; var10++) {
                var9[var10] = class94.method1892(Statics.field806, this.field814[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field811 != null) {
                for (int var12 = 0; var12 < this.field811.length; var12++) {
                    var11.method1948(this.field811[var12], this.field822[var12]);
                }
            }
            if (this.field843 != null) {
                for (int var13 = 0; var13 < this.field843.length; var13++) {
                    var11.method1906(this.field843[var13], this.field824[var13]);
                }
            }
            var6 = var11.method1941(this.field831 + 64, this.field832 + 850, -30, -50, -30);
            field808.method3183(var6, (long) this.field809);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method739(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method736(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2018(true);
        } else {
            var14 = arg2.method736(var6, arg3);
        }
        if (this.field828 != 128 || this.field829 != 128) {
            var14.method1997(this.field828, this.field829, this.field828);
        }
        return var14;
    }

    @ObfuscatedName("as.p(I)Lcs;")
    public final class94 method643() {
        if (this.field835 != null) {
            class36 var1 = this.method649();
            return var1 == null ? null : var1.method643();
        } else if (this.field813 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field813.length; var3++) {
                if (!Statics.field806.method2728(this.field813[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field813.length];
            for (int var5 = 0; var5 < this.field813.length; var5++) {
                var4[var5] = class94.method1892(Statics.field806, this.field813[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field811 != null) {
                for (int var7 = 0; var7 < this.field811.length; var7++) {
                    var6.method1948(this.field811[var7], this.field822[var7]);
                }
            }
            if (this.field843 != null) {
                for (int var8 = 0; var8 < this.field843.length; var8++) {
                    var6.method1906(this.field843[var8], this.field824[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("as.j(I)Las;")
    public final class36 method649() {
        int var1 = -1;
        if (this.field836 != -1) {
            var1 = class157.method2401(this.field836);
        } else if (this.field837 != -1) {
            var1 = class157.field2672[this.field837];
        }
        return var1 < 0 || var1 >= this.field835.length || this.field835[var1] == -1 ? null : method119(this.field835[var1]);
    }

    @ObfuscatedName("as.i(I)Z")
    public boolean method640() {
        if (this.field835 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field836 != -1) {
            var1 = class157.method2401(this.field836);
        } else if (this.field837 != -1) {
            var1 = class157.field2672[this.field837];
        }
        return var1 >= 0 && var1 < this.field835.length && this.field835[var1] != -1;
    }

    @ObfuscatedName("aa.u(I)V")
    public static void method831() {
        field821.method3181();
        field808.method3181();
    }
}
