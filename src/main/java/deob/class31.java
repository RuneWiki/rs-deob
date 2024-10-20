package deob;

@ObfuscatedName("af")
public class class31 extends class172 {

    @ObfuscatedName("af.g")
    public static boolean field802 = false;

    @ObfuscatedName("af.j")
    public static class168 field799 = new class168(64);

    @ObfuscatedName("af.i")
    public static class168 field800 = new class168(500);

    @ObfuscatedName("af.o")
    public static class168 field839 = new class168(30);

    @ObfuscatedName("af.l")
    public static class168 field808 = new class168(30);

    @ObfuscatedName("af.p")
    public static class100[] field838 = new class100[4];

    @ObfuscatedName("af.t")
    public int field804;

    @ObfuscatedName("af.w")
    public int[] field805;

    @ObfuscatedName("af.r")
    public int[] field831;

    @ObfuscatedName("af.a")
    public String field807 = "null";

    @ObfuscatedName("af.q")
    public short[] field797;

    @ObfuscatedName("af.z")
    public short[] field809;

    @ObfuscatedName("af.d")
    public short[] field810;

    @ObfuscatedName("af.x")
    public short[] field811;

    @ObfuscatedName("af.s")
    public int field812 = 1;

    @ObfuscatedName("af.m")
    public int field813 = 1;

    @ObfuscatedName("af.y")
    public int field814 = 2;

    @ObfuscatedName("af.b")
    public boolean field815 = true;

    @ObfuscatedName("af.h")
    public int field830 = -1;

    @ObfuscatedName("af.f")
    public int field817 = -1;

    @ObfuscatedName("af.v")
    public boolean field816 = false;

    @ObfuscatedName("af.u")
    public boolean field801 = false;

    @ObfuscatedName("af.k")
    public int field820 = -1;

    @ObfuscatedName("af.c")
    public int field821 = 16;

    @ObfuscatedName("af.al")
    public int field822 = 0;

    @ObfuscatedName("af.ai")
    public int field824 = 0;

    @ObfuscatedName("af.ad")
    public String[] field818 = new String[5];

    @ObfuscatedName("af.aw")
    public int field825 = -1;

    @ObfuscatedName("af.af")
    public int field826 = -1;

    @ObfuscatedName("af.an")
    public boolean field827 = false;

    @ObfuscatedName("af.ao")
    public boolean field828 = true;

    @ObfuscatedName("af.ak")
    public int field829 = 128;

    @ObfuscatedName("af.ah")
    public int field823 = 128;

    @ObfuscatedName("af.aq")
    public int field798 = 128;

    @ObfuscatedName("af.ax")
    public int field832 = 0;

    @ObfuscatedName("af.ag")
    public int field833 = 0;

    @ObfuscatedName("af.am")
    public int field834 = 0;

    @ObfuscatedName("af.at")
    public int field835 = 0;

    @ObfuscatedName("af.ae")
    public boolean field836 = false;

    @ObfuscatedName("af.ay")
    public boolean field803 = false;

    @ObfuscatedName("af.as")
    public int field819 = -1;

    @ObfuscatedName("af.ar")
    public int[] field806;

    @ObfuscatedName("af.aj")
    public int field840 = -1;

    @ObfuscatedName("af.av")
    public int field841 = -1;

    @ObfuscatedName("af.az")
    public int field842 = -1;

    @ObfuscatedName("af.aa")
    public int field843 = 0;

    @ObfuscatedName("af.au")
    public int field844 = 0;

    @ObfuscatedName("af.ac")
    public int field845 = 0;

    @ObfuscatedName("af.ap")
    public int[] field846;

    @ObfuscatedName("cy.g(Lez;Lez;ZI)V")
    public static void method2225(class150 arg0, class150 arg1, boolean arg2) {
        Statics.field837 = arg0;
        Statics.field1251 = arg1;
        field802 = arg2;
    }

    @ObfuscatedName("c.e(IB)Laf;")
    public static class31 method245(int arg0) {
        class31 var1 = (class31) field799.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field837.method3012(6, arg0);
        class31 var3 = new class31();
        var3.field804 = arg0;
        if (var2 != null) {
            var3.method634(new class126(var2));
        }
        var3.method633();
        if (var3.field803) {
            var3.field814 = 0;
            var3.field815 = false;
        }
        field799.method3314(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.n(S)V")
    public void method633() {
        if (this.field830 == -1) {
            this.field830 = 0;
            if (this.field805 != null && (this.field831 == null || this.field831[0] == 10)) {
                this.field830 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field818[var1] != null) {
                    this.field830 = 1;
                }
            }
        }
        if (this.field819 == -1) {
            this.field819 = this.field814 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("af.j(Ldu;I)V")
    public void method634(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method635(arg0, var2);
        }
    }

    @ObfuscatedName("af.i(Ldu;IB)V")
    public void method635(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2485();
            if (var3 > 0) {
                if (this.field805 == null || field802) {
                    this.field831 = new int[var3];
                    this.field805 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field805[var4] = arg0.method2487();
                        this.field831[var4] = arg0.method2485();
                    }
                } else {
                    arg0.field2016 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field807 = arg0.method2470();
        } else if (arg1 == 5) {
            int var5 = arg0.method2485();
            if (var5 > 0) {
                if (this.field805 == null || field802) {
                    this.field831 = null;
                    this.field805 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field805[var6] = arg0.method2487();
                    }
                } else {
                    arg0.field2016 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field812 = arg0.method2485();
        } else if (arg1 == 15) {
            this.field813 = arg0.method2485();
        } else if (arg1 == 17) {
            this.field814 = 0;
            this.field815 = false;
        } else if (arg1 == 18) {
            this.field815 = false;
        } else if (arg1 == 19) {
            this.field830 = arg0.method2485();
        } else if (arg1 == 21) {
            this.field817 = 0;
        } else if (arg1 == 22) {
            this.field816 = true;
        } else if (arg1 == 23) {
            this.field801 = true;
        } else if (arg1 == 24) {
            this.field820 = arg0.method2487();
            if (this.field820 == 65535) {
                this.field820 = -1;
            }
        } else if (arg1 == 27) {
            this.field814 = 1;
        } else if (arg1 == 28) {
            this.field821 = arg0.method2485();
        } else if (arg1 == 29) {
            this.field822 = arg0.method2479();
        } else if (arg1 == 39) {
            this.field824 = arg0.method2479();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field818[arg1 - 30] = arg0.method2470();
            if (this.field818[arg1 - 30].equalsIgnoreCase(class133.field2061)) {
                this.field818[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2485();
            this.field797 = new short[var7];
            this.field809 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field797[var8] = (short) arg0.method2487();
                this.field809[var8] = (short) arg0.method2487();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2485();
            this.field810 = new short[var9];
            this.field811 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field810[var10] = (short) arg0.method2487();
                this.field811[var10] = (short) arg0.method2487();
            }
        } else if (arg1 == 60) {
            this.field825 = arg0.method2487();
        } else if (arg1 == 62) {
            this.field827 = true;
        } else if (arg1 == 64) {
            this.field828 = false;
        } else if (arg1 == 65) {
            this.field829 = arg0.method2487();
        } else if (arg1 == 66) {
            this.field823 = arg0.method2487();
        } else if (arg1 == 67) {
            this.field798 = arg0.method2487();
        } else if (arg1 == 68) {
            this.field826 = arg0.method2487();
        } else if (arg1 == 69) {
            this.field835 = arg0.method2485();
        } else if (arg1 == 70) {
            this.field832 = arg0.method2488();
        } else if (arg1 == 71) {
            this.field833 = arg0.method2488();
        } else if (arg1 == 72) {
            this.field834 = arg0.method2488();
        } else if (arg1 == 73) {
            this.field836 = true;
        } else if (arg1 == 74) {
            this.field803 = true;
        } else if (arg1 == 75) {
            this.field819 = arg0.method2485();
        } else if (arg1 == 77) {
            this.field840 = arg0.method2487();
            if (this.field840 == 65535) {
                this.field840 = -1;
            }
            this.field841 = arg0.method2487();
            if (this.field841 == 65535) {
                this.field841 = -1;
            }
            int var11 = arg0.method2485();
            this.field806 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field806[var12] = arg0.method2487();
                if (this.field806[var12] == 65535) {
                    this.field806[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field842 = arg0.method2487();
            this.field843 = arg0.method2485();
        } else if (arg1 == 79) {
            this.field844 = arg0.method2487();
            this.field845 = arg0.method2487();
            this.field843 = arg0.method2485();
            int var13 = arg0.method2485();
            this.field846 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field846[var14] = arg0.method2487();
            }
        } else if (arg1 == 81) {
            this.field817 = arg0.method2485() * 256;
        }
    }

    @ObfuscatedName("af.o(IS)Z")
    public final boolean method638(int arg0) {
        if (this.field831 != null) {
            for (int var4 = 0; var4 < this.field831.length; var4++) {
                if (this.field831[var4] == arg0) {
                    return Statics.field1251.method3014(this.field805[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field805 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field805.length; var3++) {
                var2 &= Statics.field1251.method3014(this.field805[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("af.l(B)Z")
    public final boolean method641() {
        if (this.field805 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field805.length; var2++) {
            var1 &= Statics.field1251.method3014(this.field805[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("af.p(II[[IIIIB)Lco;")
    public final class93 method665(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field831 == null) {
            var7 = (long) ((this.field804 << 10) + arg1);
        } else {
            var7 = (long) ((this.field804 << 10) + (arg0 << 3) + arg1);
        }
        class93 var9 = (class93) field839.method3311(var7);
        if (var9 == null) {
            class100 var10 = this.method640(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field816) {
                var10.field1689 = (short) (this.field822 + 64);
                var10.field1690 = (short) (this.field824 * 25 + 768);
                var10.method2086();
                var9 = var10;
            } else {
                var9 = var10.method2067(this.field822 + 64, this.field824 * 25 + 768, -50, -10, -50);
            }
            field839.method3314(var9, var7);
        }
        if (this.field816) {
            var9 = ((class100) var9).method2074();
        }
        if (this.field817 >= 0) {
            if (var9 instanceof class111) {
                var9 = ((class111) var9).method2263(arg2, arg3, arg4, arg5, true, this.field817);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2075(arg2, arg3, arg4, arg5, true, this.field817);
            }
        }
        return var9;
    }

    @ObfuscatedName("af.t(II[[IIIII)Ldk;")
    public final class111 method684(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field831 == null) {
            var7 = (long) ((this.field804 << 10) + arg1);
        } else {
            var7 = (long) ((this.field804 << 10) + (arg0 << 3) + arg1);
        }
        class111 var9 = (class111) field808.method3311(var7);
        if (var9 == null) {
            class100 var10 = this.method640(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2067(this.field822 + 64, this.field824 * 25 + 768, -50, -10, -50);
            field808.method3314(var9, var7);
        }
        if (this.field817 >= 0) {
            var9 = var9.method2263(arg2, arg3, arg4, arg5, true, this.field817);
        }
        return var9;
    }

    @ObfuscatedName("af.w(II[[IIIILao;IB)Ldk;")
    public final class111 method639(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class33 arg6, int arg7) {
        long var9;
        if (this.field831 == null) {
            var9 = (long) ((this.field804 << 10) + arg1);
        } else {
            var9 = (long) ((this.field804 << 10) + (arg0 << 3) + arg1);
        }
        class111 var11 = (class111) field808.method3311(var9);
        if (var11 == null) {
            class100 var12 = this.method640(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2067(this.field822 + 64, this.field824 * 25 + 768, -50, -10, -50);
            field808.method3314(var11, var9);
        }
        if (arg6 == null && this.field817 == -1) {
            return var11;
        }
        class111 var13;
        if (arg6 == null) {
            var13 = var11.method2264(true);
        } else {
            var13 = arg6.method712(var11, arg7, arg1);
        }
        if (this.field817 >= 0) {
            var13 = var13.method2263(arg2, arg3, arg4, arg5, false, this.field817);
        }
        return var13;
    }

    @ObfuscatedName("af.r(III)Lcm;")
    public final class100 method640(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field831 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field805 == null) {
                return null;
            }
            boolean var4 = this.field827;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field805.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field805[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field800.method3311((long) var7);
                if (var3 == null) {
                    var3 = class100.method2068(Statics.field1251, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2084();
                    }
                    field800.method3314(var3, (long) var7);
                }
                if (var5 > 1) {
                    field838[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field838, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field831.length; var9++) {
                if (this.field831[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field805[var8];
            boolean var11 = this.field827 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field800.method3311((long) var10);
            if (var3 == null) {
                var3 = class100.method2068(Statics.field1251, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2084();
                }
                field800.method3314(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field829 == 128 && this.field823 == 128 && this.field798 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field832 == 0 && this.field833 == 0 && this.field834 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field797 == null, this.field810 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2080(256);
            var14.method2081(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2077();
        } else if (var15 == 2) {
            var14.method2088();
        } else if (var15 == 3) {
            var14.method2121();
        }
        if (this.field797 != null) {
            for (int var16 = 0; var16 < this.field797.length; var16++) {
                var14.method2100(this.field797[var16], this.field809[var16]);
            }
        }
        if (this.field810 != null) {
            for (int var17 = 0; var17 < this.field810.length; var17++) {
                var14.method2083(this.field810[var17], this.field811[var17]);
            }
        }
        if (var12) {
            var14.method2085(this.field829, this.field823, this.field798);
        }
        if (var13) {
            var14.method2081(this.field832, this.field833, this.field834);
        }
        return var14;
    }

    @ObfuscatedName("af.a(B)Laf;")
    public final class31 method679() {
        int var1 = -1;
        if (this.field840 != -1) {
            var1 = class157.method1589(this.field840);
        } else if (this.field841 != -1) {
            var1 = class157.field2656[this.field841];
        }
        return var1 < 0 || var1 >= this.field806.length || this.field806[var1] == -1 ? null : method245(this.field806[var1]);
    }

    @ObfuscatedName("m.q(B)V")
    public static void method152() {
        field799.method3315();
        field800.method3315();
        field839.method3315();
        field808.method3315();
    }

    @ObfuscatedName("af.z(I)Z")
    public boolean method642() {
        if (this.field806 == null) {
            return this.field842 != -1 || this.field846 != null;
        }
        for (int var1 = 0; var1 < this.field806.length; var1++) {
            if (this.field806[var1] != -1) {
                class31 var2 = method245(this.field806[var1]);
                if (var2.field842 != -1 || var2.field846 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
