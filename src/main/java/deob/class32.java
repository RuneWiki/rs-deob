package deob;

@ObfuscatedName("ak")
public class class32 extends class174 {

    @ObfuscatedName("ak.g")
    public static boolean field829 = false;

    @ObfuscatedName("ak.o")
    public static class170 field818 = new class170(64);

    @ObfuscatedName("ak.p")
    public static class170 field820 = new class170(500);

    @ObfuscatedName("ak.x")
    public static class170 field821 = new class170(30);

    @ObfuscatedName("ak.k")
    public static class170 field822 = new class170(30);

    @ObfuscatedName("ak.r")
    public static class101[] field834 = new class101[4];

    @ObfuscatedName("ak.z")
    public int field824;

    @ObfuscatedName("ak.n")
    public int[] field863;

    @ObfuscatedName("ak.j")
    public int[] field825;

    @ObfuscatedName("ak.b")
    public String field827 = "null";

    @ObfuscatedName("ak.t")
    public short[] field819;

    @ObfuscatedName("ak.q")
    public short[] field835;

    @ObfuscatedName("ak.e")
    public short[] field837;

    @ObfuscatedName("ak.l")
    public short[] field832;

    @ObfuscatedName("ak.u")
    public int field823 = 1;

    @ObfuscatedName("ak.m")
    public int field833 = 1;

    @ObfuscatedName("ak.a")
    public int field836 = 2;

    @ObfuscatedName("ak.f")
    public boolean field831 = true;

    @ObfuscatedName("ak.y")
    public int field828 = -1;

    @ObfuscatedName("ak.v")
    public int field826 = -1;

    @ObfuscatedName("ak.w")
    public boolean field864 = false;

    @ObfuscatedName("ak.d")
    public boolean field839 = false;

    @ObfuscatedName("ak.i")
    public int field840 = -1;

    @ObfuscatedName("ak.c")
    public int field841 = 16;

    @ObfuscatedName("ak.af")
    public int field842 = 0;

    @ObfuscatedName("ak.aq")
    public int field830 = 0;

    @ObfuscatedName("ak.at")
    public String[] field844 = new String[5];

    @ObfuscatedName("ak.aw")
    public int field845 = -1;

    @ObfuscatedName("ak.ax")
    public int field838 = -1;

    @ObfuscatedName("ak.ak")
    public boolean field847 = false;

    @ObfuscatedName("ak.ar")
    public boolean field848 = true;

    @ObfuscatedName("ak.az")
    public int field846 = 128;

    @ObfuscatedName("ak.ai")
    public int field850 = 128;

    @ObfuscatedName("ak.aj")
    public int field851 = 128;

    @ObfuscatedName("ak.ap")
    public int field852 = 0;

    @ObfuscatedName("ak.av")
    public int field853 = 0;

    @ObfuscatedName("ak.ad")
    public int field854 = 0;

    @ObfuscatedName("ak.ae")
    public boolean field855 = false;

    @ObfuscatedName("ak.ah")
    public boolean field856 = false;

    @ObfuscatedName("ak.am")
    public int field857 = -1;

    @ObfuscatedName("ak.ay")
    public int[] field816;

    @ObfuscatedName("ak.ag")
    public int field859 = -1;

    @ObfuscatedName("ak.al")
    public int field860 = -1;

    @ObfuscatedName("ak.an")
    public int field861 = -1;

    @ObfuscatedName("ak.aa")
    public int field862 = 0;

    @ObfuscatedName("ak.ao")
    public int field858 = 0;

    @ObfuscatedName("ak.au")
    public int field849 = 0;

    @ObfuscatedName("ak.ab")
    public int[] field865;

    @ObfuscatedName("c.g(IB)Lak;")
    public static class32 method249(int arg0) {
        class32 var1 = (class32) field818.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field817.method3080(6, arg0);
        class32 var3 = new class32();
        var3.field824 = arg0;
        if (var2 != null) {
            var3.method668(new class127(var2));
        }
        var3.method648();
        if (var3.field856) {
            var3.field836 = 0;
            var3.field831 = false;
        }
        field818.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.h(I)V")
    public void method648() {
        if (this.field828 == -1) {
            this.field828 = 0;
            if (this.field863 != null && (this.field825 == null || this.field825[0] == 10)) {
                this.field828 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field844[var1] != null) {
                    this.field828 = 1;
                }
            }
        }
        if (this.field857 == -1) {
            this.field857 = this.field836 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ak.s(Ldw;I)V")
    public void method668(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method650(arg0, var2);
        }
    }

    @ObfuscatedName("ak.o(Ldw;II)V")
    public void method650(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2499();
            if (var3 > 0) {
                if (this.field863 == null || field829) {
                    this.field825 = new int[var3];
                    this.field863 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field863[var4] = arg0.method2501();
                        this.field825[var4] = arg0.method2499();
                    }
                } else {
                    arg0.field2027 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field827 = arg0.method2507();
        } else if (arg1 == 5) {
            int var5 = arg0.method2499();
            if (var5 > 0) {
                if (this.field863 == null || field829) {
                    this.field825 = null;
                    this.field863 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field863[var6] = arg0.method2501();
                    }
                } else {
                    arg0.field2027 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field823 = arg0.method2499();
        } else if (arg1 == 15) {
            this.field833 = arg0.method2499();
        } else if (arg1 == 17) {
            this.field836 = 0;
            this.field831 = false;
        } else if (arg1 == 18) {
            this.field831 = false;
        } else if (arg1 == 19) {
            this.field828 = arg0.method2499();
        } else if (arg1 == 21) {
            this.field826 = 0;
        } else if (arg1 == 22) {
            this.field864 = true;
        } else if (arg1 == 23) {
            this.field839 = true;
        } else if (arg1 == 24) {
            this.field840 = arg0.method2501();
            if (this.field840 == 65535) {
                this.field840 = -1;
            }
        } else if (arg1 == 27) {
            this.field836 = 1;
        } else if (arg1 == 28) {
            this.field841 = arg0.method2499();
        } else if (arg1 == 29) {
            this.field842 = arg0.method2500();
        } else if (arg1 == 39) {
            this.field830 = arg0.method2500() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field844[arg1 - 30] = arg0.method2507();
            if (this.field844[arg1 - 30].equalsIgnoreCase(class135.field2092)) {
                this.field844[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2499();
            this.field819 = new short[var7];
            this.field835 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field819[var8] = (short) arg0.method2501();
                this.field835[var8] = (short) arg0.method2501();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2499();
            this.field837 = new short[var9];
            this.field832 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field837[var10] = (short) arg0.method2501();
                this.field832[var10] = (short) arg0.method2501();
            }
        } else if (arg1 == 60) {
            this.field845 = arg0.method2501();
        } else if (arg1 == 62) {
            this.field847 = true;
        } else if (arg1 == 64) {
            this.field848 = false;
        } else if (arg1 == 65) {
            this.field846 = arg0.method2501();
        } else if (arg1 == 66) {
            this.field850 = arg0.method2501();
        } else if (arg1 == 67) {
            this.field851 = arg0.method2501();
        } else if (arg1 == 68) {
            this.field838 = arg0.method2501();
        } else if (arg1 == 69) {
            arg0.method2499();
        } else if (arg1 == 70) {
            this.field852 = arg0.method2511();
        } else if (arg1 == 71) {
            this.field853 = arg0.method2511();
        } else if (arg1 == 72) {
            this.field854 = arg0.method2511();
        } else if (arg1 == 73) {
            this.field855 = true;
        } else if (arg1 == 74) {
            this.field856 = true;
        } else if (arg1 == 75) {
            this.field857 = arg0.method2499();
        } else if (arg1 == 77) {
            this.field859 = arg0.method2501();
            if (this.field859 == 65535) {
                this.field859 = -1;
            }
            this.field860 = arg0.method2501();
            if (this.field860 == 65535) {
                this.field860 = -1;
            }
            int var11 = arg0.method2499();
            this.field816 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field816[var12] = arg0.method2501();
                if (this.field816[var12] == 65535) {
                    this.field816[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field861 = arg0.method2501();
            this.field862 = arg0.method2499();
        } else if (arg1 == 79) {
            this.field858 = arg0.method2501();
            this.field849 = arg0.method2501();
            this.field862 = arg0.method2499();
            int var13 = arg0.method2499();
            this.field865 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field865[var14] = arg0.method2501();
            }
        } else if (arg1 == 81) {
            this.field826 = arg0.method2499() * 256;
        }
    }

    @ObfuscatedName("ak.p(II)Z")
    public final boolean method677(int arg0) {
        if (this.field825 != null) {
            for (int var4 = 0; var4 < this.field825.length; var4++) {
                if (this.field825[var4] == arg0) {
                    return Statics.field843.method3084(this.field863[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field863 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field863.length; var3++) {
                var2 &= Statics.field843.method3084(this.field863[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ak.x(B)Z")
    public final boolean method655() {
        if (this.field863 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field863.length; var2++) {
            var1 &= Statics.field843.method3084(this.field863[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ak.k(II[[IIIII)Lcm;")
    public final class94 method651(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field825 == null) {
            var7 = (long) ((this.field824 << 10) + arg1);
        } else {
            var7 = (long) ((this.field824 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field821.method3303(var7);
        if (var9 == null) {
            class101 var10 = this.method649(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field864) {
                var10.field1696 = (short) (this.field842 + 64);
                var10.field1704 = (short) (this.field830 + 768);
                var10.method2113();
                var9 = var10;
            } else {
                var9 = var10.method2104(this.field842 + 64, this.field830 + 768, -50, -10, -50);
            }
            field821.method3313(var9, var7);
        }
        if (this.field864) {
            var9 = ((class101) var9).method2089();
        }
        if (this.field826 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2331(arg2, arg3, arg4, arg5, true, this.field826);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2090(arg2, arg3, arg4, arg5, true, this.field826);
            }
        }
        return var9;
    }

    @ObfuscatedName("ak.r(II[[IIIII)Ldn;")
    public final class112 method653(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field825 == null) {
            var7 = (long) ((this.field824 << 10) + arg1);
        } else {
            var7 = (long) ((this.field824 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field822.method3303(var7);
        if (var9 == null) {
            class101 var10 = this.method649(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2104(this.field842 + 64, this.field830 + 768, -50, -10, -50);
            field822.method3313(var9, var7);
        }
        if (this.field826 >= 0) {
            var9 = var9.method2331(arg2, arg3, arg4, arg5, true, this.field826);
        }
        return var9;
    }

    @ObfuscatedName("ak.z(II[[IIIILaz;IB)Ldn;")
    public final class112 method652(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field825 == null) {
            var9 = (long) ((this.field824 << 10) + arg1);
        } else {
            var9 = (long) ((this.field824 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field822.method3303(var9);
        if (var11 == null) {
            class101 var12 = this.method649(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2104(this.field842 + 64, this.field830 + 768, -50, -10, -50);
            field822.method3313(var11, var9);
        }
        if (arg6 == null && this.field826 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2273(true);
        } else {
            var13 = arg6.method713(var11, arg7, arg1);
        }
        if (this.field826 >= 0) {
            var13 = var13.method2331(arg2, arg3, arg4, arg5, false, this.field826);
        }
        return var13;
    }

    @ObfuscatedName("ak.n(IIB)Lcz;")
    public final class101 method649(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field825 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field863 == null) {
                return null;
            }
            boolean var4 = this.field847;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field863.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field863[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field820.method3303((long) var7);
                if (var3 == null) {
                    var3 = class101.method2085(Statics.field843, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2099();
                    }
                    field820.method3313(var3, (long) var7);
                }
                if (var5 > 1) {
                    field834[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field834, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field825.length; var9++) {
                if (this.field825[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field863[var8];
            boolean var11 = this.field847 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field820.method3303((long) var10);
            if (var3 == null) {
                var3 = class101.method2085(Statics.field843, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2099();
                }
                field820.method3313(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field846 == 128 && this.field850 == 128 && this.field851 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field852 == 0 && this.field853 == 0 && this.field854 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field819 == null, this.field837 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2088(256);
            var14.method2096(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2092();
        } else if (var15 == 2) {
            var14.method2107();
        } else if (var15 == 3) {
            var14.method2162();
        }
        if (this.field819 != null) {
            for (int var16 = 0; var16 < this.field819.length; var16++) {
                var14.method2097(this.field819[var16], this.field835[var16]);
            }
        }
        if (this.field837 != null) {
            for (int var17 = 0; var17 < this.field837.length; var17++) {
                var14.method2167(this.field837[var17], this.field832[var17]);
            }
        }
        if (var12) {
            var14.method2093(this.field846, this.field850, this.field851);
        }
        if (var13) {
            var14.method2096(this.field852, this.field853, this.field854);
        }
        return var14;
    }

    @ObfuscatedName("ak.j(I)Lak;")
    public final class32 method656() {
        int var1 = -1;
        if (this.field859 != -1) {
            var1 = class160.method154(this.field859);
        } else if (this.field860 != -1) {
            var1 = class160.field2727[this.field860];
        }
        return var1 < 0 || var1 >= this.field816.length || this.field816[var1] == -1 ? null : method249(this.field816[var1]);
    }

    @ObfuscatedName("ak.t(I)Z")
    public boolean method678() {
        if (this.field816 == null) {
            return this.field861 != -1 || this.field865 != null;
        }
        for (int var1 = 0; var1 < this.field816.length; var1++) {
            if (this.field816[var1] != -1) {
                class32 var2 = method249(this.field816[var1]);
                if (var2.field861 != -1 || var2.field865 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
