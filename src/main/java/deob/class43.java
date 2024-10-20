package deob;

@ObfuscatedName("ak")
public class class43 extends class204 {

    @ObfuscatedName("ak.l")
    public static class193 field987 = new class193(64);

    @ObfuscatedName("ak.u")
    public static class193 field973 = new class193(100);

    @ObfuscatedName("ak.a")
    public int[] field974;

    @ObfuscatedName("ak.h")
    public int[] field977;

    @ObfuscatedName("ak.i")
    public int[] field976;

    @ObfuscatedName("ak.t")
    public int[] field972;

    @ObfuscatedName("ak.k")
    public int field978 = -1;

    @ObfuscatedName("ak.s")
    public int[] field979;

    @ObfuscatedName("ak.w")
    public boolean field980 = false;

    @ObfuscatedName("ak.e")
    public int field971 = 5;

    @ObfuscatedName("ak.z")
    public int field982 = -1;

    @ObfuscatedName("ak.p")
    public int field983 = -1;

    @ObfuscatedName("ak.r")
    public int field984 = 99;

    @ObfuscatedName("ak.g")
    public int field981 = -1;

    @ObfuscatedName("ak.n")
    public int field986 = -1;

    @ObfuscatedName("ak.y")
    public int field970 = 2;

    @ObfuscatedName("i.j(Lfa;Lfa;Lfa;B)V")
    public static void method118(class167 arg0, class167 arg1, class167 arg2) {
        Statics.field990 = arg0;
        Statics.field2162 = arg1;
        Statics.field975 = arg2;
    }

    @ObfuscatedName("client.m(II)Lak;")
    public static class43 method575(int arg0) {
        class43 var1 = (class43) field987.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field990.method3124(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method872(new class119(var2));
        }
        var3.method891();
        field987.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.f(Ldc;I)V")
    public void method872(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method873(arg0, var2);
        }
    }

    @ObfuscatedName("ak.l(Ldc;IS)V")
    public void method873(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2374();
            this.field976 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field976[var4] = arg0.method2374();
            }
            this.field974 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field974[var5] = arg0.method2374();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field974[var6] += arg0.method2374() << 16;
            }
        } else if (arg1 == 2) {
            this.field978 = arg0.method2374();
        } else if (arg1 == 3) {
            int var7 = arg0.method2372();
            this.field979 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field979[var8] = arg0.method2372();
            }
            this.field979[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field980 = true;
        } else if (arg1 == 5) {
            this.field971 = arg0.method2372();
        } else if (arg1 == 6) {
            this.field982 = arg0.method2374();
        } else if (arg1 == 7) {
            this.field983 = arg0.method2374();
        } else if (arg1 == 8) {
            this.field984 = arg0.method2372();
        } else if (arg1 == 9) {
            this.field981 = arg0.method2372();
        } else if (arg1 == 10) {
            this.field986 = arg0.method2372();
        } else if (arg1 == 11) {
            this.field970 = arg0.method2372();
        } else if (arg1 == 12) {
            int var9 = arg0.method2372();
            this.field977 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field977[var10] = arg0.method2374();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field977[var11] += arg0.method2374() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2372();
            this.field972 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field972[var13] = arg0.method2376();
            }
        }
    }

    @ObfuscatedName("ak.u(I)V")
    public void method891() {
        if (this.field981 == -1) {
            if (this.field979 == null) {
                this.field981 = 0;
            } else {
                this.field981 = 2;
            }
        }
        if (this.field986 != -1) {
            return;
        }
        if (this.field979 == null) {
            this.field986 = 0;
        } else {
            this.field986 = 2;
        }
    }

    @ObfuscatedName("ak.a(Lda;II)Lda;")
    public class105 method871(class105 arg0, int arg1) {
        int var3 = this.field974[arg1];
        class103 var4 = method693(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2209(true);
        } else {
            class105 var6 = arg0.method2209(!var4.method2157(var5));
            var6.method2182(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.h(Lda;III)Lda;")
    public class105 method897(class105 arg0, int arg1, int arg2) {
        int var4 = this.field974[arg1];
        class103 var5 = method693(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2209(true);
        }
        class105 var7 = arg0.method2209(!var5.method2157(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2232();
        } else if (var8 == 2) {
            var7.method2186();
        } else if (var8 == 3) {
            var7.method2185();
        }
        var7.method2182(var5, var6);
        if (var8 == 1) {
            var7.method2185();
        } else if (var8 == 2) {
            var7.method2186();
        } else if (var8 == 3) {
            var7.method2232();
        }
        return var7;
    }

    @ObfuscatedName("ak.i(Lda;IB)Lda;")
    public class105 method898(class105 arg0, int arg1) {
        int var3 = this.field974[arg1];
        class103 var4 = method693(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2223(true);
        } else {
            class105 var6 = arg0.method2223(!var4.method2157(var5));
            var6.method2182(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.t(Lda;ILak;IB)Lda;")
    public class105 method884(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field974[arg1];
        class103 var6 = method693(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method871(arg0, arg3);
        }
        int var8 = arg2.field974[arg3];
        class103 var9 = method693(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2209(!var6.method2157(var7));
            var11.method2182(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2209(!var6.method2157(var7) & !var9.method2157(var10));
            var12.method2191(var6, var7, var9, var10, this.field979);
            return var12;
        }
    }

    @ObfuscatedName("ak.k(Lda;II)Lda;")
    public class105 method879(class105 arg0, int arg1) {
        int var3 = this.field974[arg1];
        class103 var4 = method693(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2209(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field977 != null && arg1 < this.field977.length) {
            int var8 = this.field977[arg1];
            var6 = method693(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2209(!var4.method2157(var5));
            var10.method2182(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2209(!var4.method2157(var5) & !var6.method2157(var7));
            var9.method2182(var4, var5);
            var9.method2182(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ai.s(II)Lcv;")
    public static class103 method693(int arg0) {
        class103 var1 = (class103) field973.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field2162;
        class167 var3 = Statics.field975;
        boolean var4 = true;
        int[] var5 = var2.method3093(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3090(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3090(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class103 var10;
        if (var4) {
            try {
                var10 = new class103(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field973.method3540(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("j.w(I)V")
    public static void method2() {
        field987.method3541();
        field973.method3541();
    }
}
