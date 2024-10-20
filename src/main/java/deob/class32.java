package deob;

@ObfuscatedName("am")
public class class32 extends class174 {

    @ObfuscatedName("am.b")
    public static boolean field807 = false;

    @ObfuscatedName("am.o")
    public static class170 field803 = new class170(64);

    @ObfuscatedName("am.a")
    public static class170 field804 = new class170(500);

    @ObfuscatedName("am.h")
    public static class170 field805 = new class170(30);

    @ObfuscatedName("am.j")
    public static class170 field806 = new class170(30);

    @ObfuscatedName("am.f")
    public static class101[] field833 = new class101[4];

    @ObfuscatedName("am.q")
    public int field829;

    @ObfuscatedName("am.l")
    public int[] field841;

    @ObfuscatedName("am.d")
    public int[] field810;

    @ObfuscatedName("am.z")
    public String field811 = "null";

    @ObfuscatedName("am.n")
    public short[] field816;

    @ObfuscatedName("am.t")
    public short[] field813;

    @ObfuscatedName("am.w")
    public short[] field845;

    @ObfuscatedName("am.r")
    public short[] field815;

    @ObfuscatedName("am.x")
    public int field809 = 1;

    @ObfuscatedName("am.v")
    public int field817 = 1;

    @ObfuscatedName("am.y")
    public int field823 = 2;

    @ObfuscatedName("am.k")
    public boolean field819 = true;

    @ObfuscatedName("am.p")
    public int field831 = -1;

    @ObfuscatedName("am.s")
    public int field821 = -1;

    @ObfuscatedName("am.m")
    public boolean field822 = false;

    @ObfuscatedName("am.c")
    public boolean field824 = false;

    @ObfuscatedName("am.i")
    public int field830 = -1;

    @ObfuscatedName("am.u")
    public int field834 = 16;

    @ObfuscatedName("am.at")
    public int field826 = 0;

    @ObfuscatedName("am.as")
    public int field851 = 0;

    @ObfuscatedName("am.ax")
    public String[] field828 = new String[5];

    @ObfuscatedName("am.ao")
    public int field827 = -1;

    @ObfuscatedName("am.aq")
    public int field801 = -1;

    @ObfuscatedName("am.am")
    public boolean field825 = false;

    @ObfuscatedName("am.al")
    public boolean field832 = true;

    @ObfuscatedName("am.ab")
    public int field818 = 128;

    @ObfuscatedName("am.aw")
    public int field812 = 128;

    @ObfuscatedName("am.ah")
    public int field835 = 128;

    @ObfuscatedName("am.aa")
    public int field836 = 0;

    @ObfuscatedName("am.ay")
    public int field837 = 0;

    @ObfuscatedName("am.ak")
    public int field838 = 0;

    @ObfuscatedName("am.az")
    public boolean field839 = false;

    @ObfuscatedName("am.ap")
    public boolean field840 = false;

    @ObfuscatedName("am.af")
    public int field814 = -1;

    @ObfuscatedName("am.au")
    public int[] field842;

    @ObfuscatedName("am.an")
    public int field843 = -1;

    @ObfuscatedName("am.av")
    public int field844 = -1;

    @ObfuscatedName("am.ac")
    public int field820 = -1;

    @ObfuscatedName("am.ae")
    public int field800 = 0;

    @ObfuscatedName("am.ai")
    public int field847 = 0;

    @ObfuscatedName("am.ag")
    public int field848 = 0;

    @ObfuscatedName("am.aj")
    public int[] field849;

    @ObfuscatedName("s.b(Lej;Lej;ZI)V")
    public static void method209(class153 arg0, class153 arg1, boolean arg2) {
        Statics.field846 = arg0;
        Statics.field802 = arg1;
        field807 = arg2;
    }

    @ObfuscatedName("j.e(II)Lam;")
    public static class32 method48(int arg0) {
        class32 var1 = (class32) field803.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field846.method3026(6, arg0);
        class32 var3 = new class32();
        var3.field829 = arg0;
        if (var2 != null) {
            var3.method633(new class126(var2));
        }
        var3.method653();
        if (var3.field840) {
            var3.field823 = 0;
            var3.field819 = false;
        }
        field803.method3252(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.g(I)V")
    public void method653() {
        if (this.field831 == -1) {
            this.field831 = 0;
            if (this.field841 != null && (this.field810 == null || this.field810[0] == 10)) {
                this.field831 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field828[var1] != null) {
                    this.field831 = 1;
                }
            }
        }
        if (this.field814 == -1) {
            this.field814 = this.field823 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("am.o(Ldv;I)V")
    public void method633(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method643(arg0, var2);
        }
    }

    @ObfuscatedName("am.a(Ldv;IB)V")
    public void method643(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2436();
            if (var3 > 0) {
                if (this.field841 == null || field807) {
                    this.field810 = new int[var3];
                    this.field841 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field841[var4] = arg0.method2572();
                        this.field810[var4] = arg0.method2436();
                    }
                } else {
                    arg0.field2027 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field811 = arg0.method2444();
        } else if (arg1 == 5) {
            int var5 = arg0.method2436();
            if (var5 > 0) {
                if (this.field841 == null || field807) {
                    this.field810 = null;
                    this.field841 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field841[var6] = arg0.method2572();
                    }
                } else {
                    arg0.field2027 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field809 = arg0.method2436();
        } else if (arg1 == 15) {
            this.field817 = arg0.method2436();
        } else if (arg1 == 17) {
            this.field823 = 0;
            this.field819 = false;
        } else if (arg1 == 18) {
            this.field819 = false;
        } else if (arg1 == 19) {
            this.field831 = arg0.method2436();
        } else if (arg1 == 21) {
            this.field821 = 0;
        } else if (arg1 == 22) {
            this.field822 = true;
        } else if (arg1 == 23) {
            this.field824 = true;
        } else if (arg1 == 24) {
            this.field830 = arg0.method2572();
            if (this.field830 == 65535) {
                this.field830 = -1;
            }
        } else if (arg1 == 27) {
            this.field823 = 1;
        } else if (arg1 == 28) {
            this.field834 = arg0.method2436();
        } else if (arg1 == 29) {
            this.field826 = arg0.method2437();
        } else if (arg1 == 39) {
            this.field851 = arg0.method2437() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field828[arg1 - 30] = arg0.method2444();
            if (this.field828[arg1 - 30].equalsIgnoreCase(class135.field2241)) {
                this.field828[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2436();
            this.field816 = new short[var7];
            this.field813 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field816[var8] = (short) arg0.method2572();
                this.field813[var8] = (short) arg0.method2572();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2436();
            this.field845 = new short[var9];
            this.field815 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field845[var10] = (short) arg0.method2572();
                this.field815[var10] = (short) arg0.method2572();
            }
        } else if (arg1 == 60) {
            this.field827 = arg0.method2572();
        } else if (arg1 == 62) {
            this.field825 = true;
        } else if (arg1 == 64) {
            this.field832 = false;
        } else if (arg1 == 65) {
            this.field818 = arg0.method2572();
        } else if (arg1 == 66) {
            this.field812 = arg0.method2572();
        } else if (arg1 == 67) {
            this.field835 = arg0.method2572();
        } else if (arg1 == 68) {
            this.field801 = arg0.method2572();
        } else if (arg1 == 69) {
            arg0.method2436();
        } else if (arg1 == 70) {
            this.field836 = arg0.method2531();
        } else if (arg1 == 71) {
            this.field837 = arg0.method2531();
        } else if (arg1 == 72) {
            this.field838 = arg0.method2531();
        } else if (arg1 == 73) {
            this.field839 = true;
        } else if (arg1 == 74) {
            this.field840 = true;
        } else if (arg1 == 75) {
            this.field814 = arg0.method2436();
        } else if (arg1 == 77) {
            this.field843 = arg0.method2572();
            if (this.field843 == 65535) {
                this.field843 = -1;
            }
            this.field844 = arg0.method2572();
            if (this.field844 == 65535) {
                this.field844 = -1;
            }
            int var11 = arg0.method2436();
            this.field842 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field842[var12] = arg0.method2572();
                if (this.field842[var12] == 65535) {
                    this.field842[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field820 = arg0.method2572();
            this.field800 = arg0.method2436();
        } else if (arg1 == 79) {
            this.field847 = arg0.method2572();
            this.field848 = arg0.method2572();
            this.field800 = arg0.method2436();
            int var13 = arg0.method2436();
            this.field849 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field849[var14] = arg0.method2572();
            }
        } else if (arg1 == 81) {
            this.field821 = arg0.method2436() * 256;
        }
    }

    @ObfuscatedName("am.h(IB)Z")
    public final boolean method632(int arg0) {
        if (this.field810 != null) {
            for (int var4 = 0; var4 < this.field810.length; var4++) {
                if (this.field810[var4] == arg0) {
                    return Statics.field802.method2998(this.field841[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field841 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field841.length; var3++) {
                var2 &= Statics.field802.method2998(this.field841[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("am.j(I)Z")
    public final boolean method638() {
        if (this.field841 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field841.length; var2++) {
            var1 &= Statics.field802.method2998(this.field841[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("am.f(II[[IIIIB)Lcf;")
    public final class94 method637(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field810 == null) {
            var7 = (long) ((this.field829 << 10) + arg1);
        } else {
            var7 = (long) ((this.field829 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field805.method3248(var7);
        if (var9 == null) {
            class101 var10 = this.method640(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field822) {
                var10.field1663 = (short) (this.field826 + 64);
                var10.field1697 = (short) (this.field851 + 768);
                var10.method2067();
                var9 = var10;
            } else {
                var9 = var10.method2056(this.field826 + 64, this.field851 + 768, -50, -10, -50);
            }
            field805.method3252(var9, var7);
        }
        if (this.field822) {
            var9 = ((class101) var9).method2039();
        }
        if (this.field821 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2222(arg2, arg3, arg4, arg5, true, this.field821);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2040(arg2, arg3, arg4, arg5, true, this.field821);
            }
        }
        return var9;
    }

    @ObfuscatedName("am.q(II[[IIIII)Ldp;")
    public final class112 method647(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field810 == null) {
            var7 = (long) ((this.field829 << 10) + arg1);
        } else {
            var7 = (long) ((this.field829 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field806.method3248(var7);
        if (var9 == null) {
            class101 var10 = this.method640(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2056(this.field826 + 64, this.field851 + 768, -50, -10, -50);
            field806.method3252(var9, var7);
        }
        if (this.field821 >= 0) {
            var9 = var9.method2222(arg2, arg3, arg4, arg5, true, this.field821);
        }
        return var9;
    }

    @ObfuscatedName("am.l(II[[IIIILab;II)Ldp;")
    public final class112 method639(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field810 == null) {
            var9 = (long) ((this.field829 << 10) + arg1);
        } else {
            var9 = (long) ((this.field829 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field806.method3248(var9);
        if (var11 == null) {
            class101 var12 = this.method640(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2056(this.field826 + 64, this.field851 + 768, -50, -10, -50);
            field806.method3252(var11, var9);
        }
        if (arg6 == null && this.field821 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2247(true);
        } else {
            var13 = arg6.method695(var11, arg7, arg1);
        }
        if (this.field821 >= 0) {
            var13 = var13.method2222(arg2, arg3, arg4, arg5, false, this.field821);
        }
        return var13;
    }

    @ObfuscatedName("am.d(III)Lcu;")
    public final class101 method640(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field810 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field841 == null) {
                return null;
            }
            boolean var4 = this.field825;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field841.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field841[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field804.method3248((long) var7);
                if (var3 == null) {
                    var3 = class101.method2032(Statics.field802, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2049();
                    }
                    field804.method3252(var3, (long) var7);
                }
                if (var5 > 1) {
                    field833[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field833, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field810.length; var9++) {
                if (this.field810[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field841[var8];
            boolean var11 = this.field825 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field804.method3248((long) var10);
            if (var3 == null) {
                var3 = class101.method2032(Statics.field802, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2049();
                }
                field804.method3252(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field818 == 128 && this.field812 == 128 && this.field835 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field836 == 0 && this.field837 == 0 && this.field838 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field816 == null, this.field845 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2045(256);
            var14.method2071(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2078();
        } else if (var15 == 2) {
            var14.method2043();
        } else if (var15 == 3) {
            var14.method2044();
        }
        if (this.field816 != null) {
            for (int var16 = 0; var16 < this.field816.length; var16++) {
                var14.method2047(this.field816[var16], this.field813[var16]);
            }
        }
        if (this.field845 != null) {
            for (int var17 = 0; var17 < this.field845.length; var17++) {
                var14.method2048(this.field845[var17], this.field815[var17]);
            }
        }
        if (var12) {
            var14.method2042(this.field818, this.field812, this.field835);
        }
        if (var13) {
            var14.method2071(this.field836, this.field837, this.field838);
        }
        return var14;
    }

    @ObfuscatedName("am.z(I)Lam;")
    public final class32 method641() {
        int var1 = -1;
        if (this.field843 != -1) {
            var1 = class160.method748(this.field843);
        } else if (this.field844 != -1) {
            var1 = class160.field2726[this.field844];
        }
        return var1 < 0 || var1 >= this.field842.length || this.field842[var1] == -1 ? null : method48(this.field842[var1]);
    }

    @ObfuscatedName("cs.n(I)V")
    public static void method1647() {
        field803.method3251();
        field804.method3251();
        field805.method3251();
        field806.method3251();
    }

    @ObfuscatedName("am.t(I)Z")
    public boolean method642() {
        if (this.field842 == null) {
            return this.field820 != -1 || this.field849 != null;
        }
        for (int var1 = 0; var1 < this.field842.length; var1++) {
            if (this.field842[var1] != -1) {
                class32 var2 = method48(this.field842[var1]);
                if (var2.field820 != -1 || var2.field849 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
