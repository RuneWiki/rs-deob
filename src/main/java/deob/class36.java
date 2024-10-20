package deob;

@ObfuscatedName("ai")
public class class36 extends class181 {

    @ObfuscatedName("ai.z")
    public static boolean field825 = false;

    @ObfuscatedName("ai.y")
    public static class171 field809 = new class171(64);

    @ObfuscatedName("ai.i")
    public static class171 field810 = new class171(500);

    @ObfuscatedName("ai.b")
    public static class171 field806 = new class171(30);

    @ObfuscatedName("ai.s")
    public static class171 field853 = new class171(30);

    @ObfuscatedName("ai.q")
    public static class93[] field817 = new class93[4];

    @ObfuscatedName("ai.p")
    public int field814;

    @ObfuscatedName("ai.h")
    public int[] field833;

    @ObfuscatedName("ai.r")
    public int[] field816;

    @ObfuscatedName("ai.o")
    public String field815 = "null";

    @ObfuscatedName("ai.f")
    public short[] field818;

    @ObfuscatedName("ai.u")
    public short[] field819;

    @ObfuscatedName("ai.c")
    public short[] field820;

    @ObfuscatedName("ai.l")
    public short[] field834;

    @ObfuscatedName("ai.w")
    public int field822 = 1;

    @ObfuscatedName("ai.x")
    public int field823 = 1;

    @ObfuscatedName("ai.t")
    public int field824 = 2;

    @ObfuscatedName("ai.k")
    public boolean field813 = true;

    @ObfuscatedName("ai.e")
    public int field835 = -1;

    @ObfuscatedName("ai.v")
    public int field827 = -1;

    @ObfuscatedName("ai.n")
    public boolean field855 = false;

    @ObfuscatedName("ai.d")
    public boolean field829 = false;

    @ObfuscatedName("ai.m")
    public int field830 = -1;

    @ObfuscatedName("ai.g")
    public int field826 = 16;

    @ObfuscatedName("ai.aq")
    public int field832 = 0;

    @ObfuscatedName("ai.ao")
    public int field807 = 0;

    @ObfuscatedName("ai.af")
    public String[] field811 = new String[5];

    @ObfuscatedName("ai.ag")
    public int field852 = -1;

    @ObfuscatedName("ai.ad")
    public int field836 = -1;

    @ObfuscatedName("ai.ak")
    public boolean field837 = false;

    @ObfuscatedName("ai.aj")
    public boolean field812 = true;

    @ObfuscatedName("ai.as")
    public int field839 = 128;

    @ObfuscatedName("ai.al")
    public int field840 = 128;

    @ObfuscatedName("ai.ai")
    public int field841 = 128;

    @ObfuscatedName("ai.az")
    public int field842 = 0;

    @ObfuscatedName("ai.aw")
    public int field843 = 0;

    @ObfuscatedName("ai.ay")
    public int field844 = 0;

    @ObfuscatedName("ai.au")
    public boolean field851 = false;

    @ObfuscatedName("ai.ar")
    public boolean field846 = false;

    @ObfuscatedName("ai.ap")
    public int field847 = -1;

    @ObfuscatedName("ai.an")
    public int[] field848;

    @ObfuscatedName("ai.ae")
    public int field849 = -1;

    @ObfuscatedName("ai.aa")
    public int field821 = -1;

    @ObfuscatedName("ai.ax")
    public int field828 = -1;

    @ObfuscatedName("ai.am")
    public int field831 = 0;

    @ObfuscatedName("ai.ab")
    public int field845 = 0;

    @ObfuscatedName("ai.at")
    public int field854 = 0;

    @ObfuscatedName("ai.ah")
    public int[] field850;

    @ObfuscatedName("q.z(Ler;Ler;ZB)V")
    public static void method85(class146 arg0, class146 arg1, boolean arg2) {
        Statics.field838 = arg0;
        Statics.field808 = arg1;
        field825 = arg2;
    }

    @ObfuscatedName("w.j(II)Lai;")
    public static class36 method167(int arg0) {
        class36 var1 = (class36) field809.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field838.method2705(6, arg0);
        class36 var3 = new class36();
        var3.field814 = arg0;
        if (var2 != null) {
            var3.method649(new class107(var2));
        }
        var3.method629();
        if (var3.field846) {
            var3.field824 = 0;
            var3.field813 = false;
        }
        field809.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.a(B)V")
    public void method629() {
        if (this.field835 == -1) {
            this.field835 = 0;
            if (this.field833 != null && (this.field816 == null || this.field816[0] == 10)) {
                this.field835 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field811[var1] != null) {
                    this.field835 = 1;
                }
            }
        }
        if (this.field847 == -1) {
            this.field847 = this.field824 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.y(Ldq;I)V")
    public void method649(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method644(arg0, var2);
        }
    }

    @ObfuscatedName("ai.i(Ldq;II)V")
    public void method644(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2122();
            if (var3 > 0) {
                if (this.field833 == null || field825) {
                    this.field816 = new int[var3];
                    this.field833 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field833[var4] = arg0.method2239();
                        this.field816[var4] = arg0.method2122();
                    }
                } else {
                    arg0.field1819 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field815 = arg0.method2130();
        } else if (arg1 == 5) {
            int var5 = arg0.method2122();
            if (var5 > 0) {
                if (this.field833 == null || field825) {
                    this.field816 = null;
                    this.field833 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field833[var6] = arg0.method2239();
                    }
                } else {
                    arg0.field1819 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field822 = arg0.method2122();
        } else if (arg1 == 15) {
            this.field823 = arg0.method2122();
        } else if (arg1 == 17) {
            this.field824 = 0;
            this.field813 = false;
        } else if (arg1 == 18) {
            this.field813 = false;
        } else if (arg1 == 19) {
            this.field835 = arg0.method2122();
        } else if (arg1 == 21) {
            this.field827 = 0;
        } else if (arg1 == 22) {
            this.field855 = true;
        } else if (arg1 == 23) {
            this.field829 = true;
        } else if (arg1 == 24) {
            this.field830 = arg0.method2239();
            if (this.field830 == 65535) {
                this.field830 = -1;
            }
        } else if (arg1 == 27) {
            this.field824 = 1;
        } else if (arg1 == 28) {
            this.field826 = arg0.method2122();
        } else if (arg1 == 29) {
            this.field832 = arg0.method2201();
        } else if (arg1 == 39) {
            this.field807 = arg0.method2201() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field811[arg1 - 30] = arg0.method2130();
            if (this.field811[arg1 - 30].equalsIgnoreCase(class142.field2134)) {
                this.field811[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2122();
            this.field818 = new short[var7];
            this.field819 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field818[var8] = (short) arg0.method2239();
                this.field819[var8] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2122();
            this.field820 = new short[var9];
            this.field834 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field820[var10] = (short) arg0.method2239();
                this.field834[var10] = (short) arg0.method2239();
            }
        } else if (arg1 == 60) {
            this.field852 = arg0.method2239();
        } else if (arg1 == 62) {
            this.field837 = true;
        } else if (arg1 == 64) {
            this.field812 = false;
        } else if (arg1 == 65) {
            this.field839 = arg0.method2239();
        } else if (arg1 == 66) {
            this.field840 = arg0.method2239();
        } else if (arg1 == 67) {
            this.field841 = arg0.method2239();
        } else if (arg1 == 68) {
            this.field836 = arg0.method2239();
        } else if (arg1 == 69) {
            arg0.method2122();
        } else if (arg1 == 70) {
            this.field842 = arg0.method2125();
        } else if (arg1 == 71) {
            this.field843 = arg0.method2125();
        } else if (arg1 == 72) {
            this.field844 = arg0.method2125();
        } else if (arg1 == 73) {
            this.field851 = true;
        } else if (arg1 == 74) {
            this.field846 = true;
        } else if (arg1 == 75) {
            this.field847 = arg0.method2122();
        } else if (arg1 == 77) {
            this.field849 = arg0.method2239();
            if (this.field849 == 65535) {
                this.field849 = -1;
            }
            this.field821 = arg0.method2239();
            if (this.field821 == 65535) {
                this.field821 = -1;
            }
            int var11 = arg0.method2122();
            this.field848 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field848[var12] = arg0.method2239();
                if (this.field848[var12] == 65535) {
                    this.field848[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field828 = arg0.method2239();
            this.field831 = arg0.method2122();
        } else if (arg1 == 79) {
            this.field845 = arg0.method2239();
            this.field854 = arg0.method2239();
            this.field831 = arg0.method2122();
            int var13 = arg0.method2122();
            this.field850 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field850[var14] = arg0.method2239();
            }
        } else if (arg1 == 81) {
            this.field827 = arg0.method2122() * 256;
        }
    }

    @ObfuscatedName("ai.b(IB)Z")
    public final boolean method630(int arg0) {
        if (this.field816 != null) {
            for (int var4 = 0; var4 < this.field816.length; var4++) {
                if (this.field816[var4] == arg0) {
                    return Statics.field808.method2772(this.field833[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field833 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field833.length; var3++) {
                var2 &= Statics.field808.method2772(this.field833[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.s(I)Z")
    public final boolean method652() {
        if (this.field833 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field833.length; var2++) {
            var1 &= Statics.field808.method2772(this.field833[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.q(II[[IIIII)Lbf;")
    public final class78 method632(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field816 == null) {
            var7 = (long) ((this.field814 << 10) + arg1);
        } else {
            var7 = (long) ((this.field814 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field806.method3162(var7);
        if (var9 == null) {
            class93 var10 = this.method637(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field855) {
                var10.field1593 = (short) (this.field832 + 64);
                var10.field1592 = (short) (this.field807 + 768);
                var10.method1900();
                var9 = var10;
            } else {
                var9 = var10.method1897(this.field832 + 64, this.field807 + 768, -50, -10, -50);
            }
            field806.method3171(var9, var7);
        }
        if (this.field855) {
            var9 = ((class93) var9).method1889();
        }
        if (this.field827 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1977(arg2, arg3, arg4, arg5, true, this.field827);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1917(arg2, arg3, arg4, arg5, true, this.field827);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.p(II[[IIIII)Lcu;")
    public final class98 method633(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field816 == null) {
            var7 = (long) ((this.field814 << 10) + arg1);
        } else {
            var7 = (long) ((this.field814 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field853.method3162(var7);
        if (var9 == null) {
            class93 var10 = this.method637(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1897(this.field832 + 64, this.field807 + 768, -50, -10, -50);
            field853.method3171(var9, var7);
        }
        if (this.field827 >= 0) {
            var9 = var9.method1977(arg2, arg3, arg4, arg5, true, this.field827);
        }
        return var9;
    }

    @ObfuscatedName("ai.h(II[[IIIILaw;II)Lcu;")
    public final class98 method634(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field816 == null) {
            var9 = (long) ((this.field814 << 10) + arg1);
        } else {
            var9 = (long) ((this.field814 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field853.method3162(var9);
        if (var11 == null) {
            class93 var12 = this.method637(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1897(this.field832 + 64, this.field807 + 768, -50, -10, -50);
            field853.method3171(var11, var9);
        }
        if (arg6 == null && this.field827 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1999(true);
        } else {
            var13 = arg6.method708(var11, arg7, arg1);
        }
        if (this.field827 >= 0) {
            var13 = var13.method1977(arg2, arg3, arg4, arg5, false, this.field827);
        }
        return var13;
    }

    @ObfuscatedName("ai.r(III)Lcy;")
    public final class93 method637(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field816 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field833 == null) {
                return null;
            }
            boolean var4 = this.field837;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field833.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field833[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field810.method3162((long) var7);
                if (var3 == null) {
                    var3 = class93.method1883(Statics.field808, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1898();
                    }
                    field810.method3171(var3, (long) var7);
                }
                if (var5 > 1) {
                    field817[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field817, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field816.length; var9++) {
                if (this.field816[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field833[var8];
            boolean var11 = this.field837 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field810.method3162((long) var10);
            if (var3 == null) {
                var3 = class93.method1883(Statics.field808, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1898();
                }
                field810.method3171(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field839 == 128 && this.field840 == 128 && this.field841 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field842 == 0 && this.field843 == 0 && this.field844 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field818 == null, this.field820 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1895(256);
            var14.method1896(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1892();
        } else if (var15 == 2) {
            var14.method1928();
        } else if (var15 == 3) {
            var14.method1947();
        }
        if (this.field818 != null) {
            for (int var16 = 0; var16 < this.field818.length; var16++) {
                var14.method1888(this.field818[var16], this.field819[var16]);
            }
        }
        if (this.field820 != null) {
            for (int var17 = 0; var17 < this.field820.length; var17++) {
                var14.method1930(this.field820[var17], this.field834[var17]);
            }
        }
        if (var12) {
            var14.method1899(this.field839, this.field840, this.field841);
        }
        if (var13) {
            var14.method1896(this.field842, this.field843, this.field844);
        }
        return var14;
    }

    @ObfuscatedName("ai.o(I)Lai;")
    public final class36 method636() {
        int var1 = -1;
        if (this.field849 != -1) {
            var1 = class154.method2824(this.field849);
        } else if (this.field821 != -1) {
            var1 = class154.field2649[this.field821];
        }
        return var1 < 0 || var1 >= this.field848.length || this.field848[var1] == -1 ? null : method167(this.field848[var1]);
    }

    @ObfuscatedName("ai.f(B)Z")
    public boolean method631() {
        if (this.field848 == null) {
            return this.field828 != -1 || this.field850 != null;
        }
        for (int var1 = 0; var1 < this.field848.length; var1++) {
            if (this.field848[var1] != -1) {
                class36 var2 = method167(this.field848[var1]);
                if (var2.field828 != -1 || var2.field850 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
