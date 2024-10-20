package deob;

@ObfuscatedName("ao")
public class class33 extends class172 {

    @ObfuscatedName("ao.j")
    public static class168 field861 = new class168(64);

    @ObfuscatedName("ao.i")
    public static class168 field864 = new class168(100);

    @ObfuscatedName("ao.o")
    public int[] field863;

    @ObfuscatedName("ao.l")
    public int[] field877;

    @ObfuscatedName("ao.p")
    public int[] field862;

    @ObfuscatedName("ao.t")
    public int[] field866;

    @ObfuscatedName("ao.w")
    public int field867 = -1;

    @ObfuscatedName("ao.r")
    public int[] field868;

    @ObfuscatedName("ao.a")
    public boolean field859 = false;

    @ObfuscatedName("ao.q")
    public int field875 = 5;

    @ObfuscatedName("ao.z")
    public int field871 = -1;

    @ObfuscatedName("ao.d")
    public int field872 = -1;

    @ObfuscatedName("ao.x")
    public int field873 = 99;

    @ObfuscatedName("ao.s")
    public int field870 = -1;

    @ObfuscatedName("ao.m")
    public int field880 = -1;

    @ObfuscatedName("ao.y")
    public int field876 = 2;

    @ObfuscatedName("bg.g(Lez;Lez;Lez;I)V")
    public static void method1502(class150 arg0, class150 arg1, class150 arg2) {
        Statics.field869 = arg0;
        Statics.field2420 = arg1;
        Statics.field860 = arg2;
    }

    @ObfuscatedName("k.e(II)Lao;")
    public static class33 method224(int arg0) {
        class33 var1 = (class33) field861.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field869.method3012(12, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method707(new class126(var2));
        }
        var3.method710();
        field861.method3314(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.n(Ldu;B)V")
    public void method707(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method711(arg0, var2);
        }
    }

    @ObfuscatedName("ao.j(Ldu;II)V")
    public void method711(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2487();
            this.field862 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field862[var4] = arg0.method2487();
            }
            this.field863 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field863[var5] = arg0.method2487();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field863[var6] += arg0.method2487() << 16;
            }
        } else if (arg1 == 2) {
            this.field867 = arg0.method2487();
        } else if (arg1 == 3) {
            int var7 = arg0.method2485();
            this.field868 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field868[var8] = arg0.method2485();
            }
            this.field868[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field859 = true;
        } else if (arg1 == 5) {
            this.field875 = arg0.method2485();
        } else if (arg1 == 6) {
            this.field871 = arg0.method2487();
        } else if (arg1 == 7) {
            this.field872 = arg0.method2487();
        } else if (arg1 == 8) {
            this.field873 = arg0.method2485();
        } else if (arg1 == 9) {
            this.field870 = arg0.method2485();
        } else if (arg1 == 10) {
            this.field880 = arg0.method2485();
        } else if (arg1 == 11) {
            this.field876 = arg0.method2485();
        } else if (arg1 == 12) {
            int var9 = arg0.method2485();
            this.field877 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field877[var10] = arg0.method2487();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field877[var11] += arg0.method2487() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2485();
            this.field866 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field866[var13] = arg0.method2489();
            }
        }
    }

    @ObfuscatedName("ao.i(I)V")
    public void method710() {
        if (this.field870 == -1) {
            if (this.field868 == null) {
                this.field870 = 0;
            } else {
                this.field870 = 2;
            }
        }
        if (this.field880 != -1) {
            return;
        }
        if (this.field868 == null) {
            this.field880 = 0;
        } else {
            this.field880 = 2;
        }
    }

    @ObfuscatedName("ao.o(Ldk;IB)Ldk;")
    public class111 method717(class111 arg0, int arg1) {
        int var3 = this.field863[arg1];
        class108 var4 = method95(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2264(true);
        } else {
            class111 var6 = arg0.method2264(!var4.method2246(var5));
            var6.method2304(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.l(Ldk;III)Ldk;")
    public class111 method712(class111 arg0, int arg1, int arg2) {
        int var4 = this.field863[arg1];
        class108 var5 = method95(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2264(true);
        }
        class111 var7 = arg0.method2264(!var5.method2246(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2275();
        } else if (var8 == 2) {
            var7.method2283();
        } else if (var8 == 3) {
            var7.method2273();
        }
        var7.method2304(var5, var6);
        if (var8 == 1) {
            var7.method2273();
        } else if (var8 == 2) {
            var7.method2283();
        } else if (var8 == 3) {
            var7.method2275();
        }
        return var7;
    }

    @ObfuscatedName("ao.p(Ldk;II)Ldk;")
    public class111 method713(class111 arg0, int arg1) {
        int var3 = this.field863[arg1];
        class108 var4 = method95(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2312(true);
        } else {
            class111 var6 = arg0.method2312(!var4.method2246(var5));
            var6.method2304(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.t(Ldk;ILao;IS)Ldk;")
    public class111 method708(class111 arg0, int arg1, class33 arg2, int arg3) {
        int var5 = this.field863[arg1];
        class108 var6 = method95(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method717(arg0, arg3);
        }
        int var8 = arg2.field863[arg3];
        class108 var9 = method95(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class111 var11 = arg0.method2264(!var6.method2246(var7));
            var11.method2304(var6, var7);
            return var11;
        } else {
            class111 var12 = arg0.method2264(!var6.method2246(var7) & !var9.method2246(var10));
            var12.method2271(var6, var7, var9, var10, this.field868);
            return var12;
        }
    }

    @ObfuscatedName("ao.w(Ldk;IB)Ldk;")
    public class111 method709(class111 arg0, int arg1) {
        int var3 = this.field863[arg1];
        class108 var4 = method95(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2264(true);
        }
        class108 var6 = null;
        int var7 = 0;
        if (this.field877 != null && arg1 < this.field877.length) {
            int var8 = this.field877[arg1];
            var6 = method95(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class111 var10 = arg0.method2264(!var4.method2246(var5));
            var10.method2304(var4, var5);
            return var10;
        } else {
            class111 var9 = arg0.method2264(!var4.method2246(var5) & !var6.method2246(var7));
            var9.method2304(var4, var5);
            var9.method2304(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("t.r(II)Ldq;")
    public static class108 method95(int arg0) {
        class108 var1 = (class108) field864.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class150 var2 = Statics.field2420;
        class150 var3 = Statics.field860;
        boolean var4 = true;
        int[] var5 = var2.method3031(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3018(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3018(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class108 var10;
        if (var4) {
            try {
                var10 = new class108(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field864.method3314(var10, (long) arg0);
        }
        return var10;
    }
}
