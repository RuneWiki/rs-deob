package deob;

@ObfuscatedName("as")
public class class43 extends class204 {

    @ObfuscatedName("as.o")
    public static class193 field982 = new class193(64);

    @ObfuscatedName("as.g")
    public static class193 field983 = new class193(100);

    @ObfuscatedName("as.m")
    public int[] field981;

    @ObfuscatedName("as.b")
    public int[] field985;

    @ObfuscatedName("as.p")
    public int[] field984;

    @ObfuscatedName("as.t")
    public int[] field987;

    @ObfuscatedName("as.w")
    public int field988 = -1;

    @ObfuscatedName("as.x")
    public int[] field986;

    @ObfuscatedName("as.k")
    public boolean field990 = false;

    @ObfuscatedName("as.z")
    public int field1001 = 5;

    @ObfuscatedName("as.v")
    public int field992 = -1;

    @ObfuscatedName("as.j")
    public int field993 = -1;

    @ObfuscatedName("as.f")
    public int field994 = 99;

    @ObfuscatedName("as.c")
    public int field995 = -1;

    @ObfuscatedName("as.s")
    public int field996 = -1;

    @ObfuscatedName("as.r")
    public int field997 = 2;

    @ObfuscatedName("dd.l(II)Las;")
    public static class43 method2304(int arg0) {
        class43 var1 = (class43) field982.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field991.method3050(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method861(new class119(var2));
        }
        var3.method886();
        field982.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.e(Ldl;I)V")
    public void method861(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method862(arg0, var2);
        }
    }

    @ObfuscatedName("as.q(Ldl;II)V")
    public void method862(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2440();
            this.field984 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field984[var4] = arg0.method2440();
            }
            this.field981 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field981[var5] = arg0.method2440();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field981[var6] += arg0.method2440() << 16;
            }
        } else if (arg1 == 2) {
            this.field988 = arg0.method2440();
        } else if (arg1 == 3) {
            int var7 = arg0.method2388();
            this.field986 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field986[var8] = arg0.method2388();
            }
            this.field986[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field990 = true;
        } else if (arg1 == 5) {
            this.field1001 = arg0.method2388();
        } else if (arg1 == 6) {
            this.field992 = arg0.method2440();
        } else if (arg1 == 7) {
            this.field993 = arg0.method2440();
        } else if (arg1 == 8) {
            this.field994 = arg0.method2388();
        } else if (arg1 == 9) {
            this.field995 = arg0.method2388();
        } else if (arg1 == 10) {
            this.field996 = arg0.method2388();
        } else if (arg1 == 11) {
            this.field997 = arg0.method2388();
        } else if (arg1 == 12) {
            int var9 = arg0.method2388();
            this.field985 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field985[var10] = arg0.method2440();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field985[var11] += arg0.method2440() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2388();
            this.field987 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field987[var13] = arg0.method2460();
            }
        }
    }

    @ObfuscatedName("as.o(B)V")
    public void method886() {
        if (this.field995 == -1) {
            if (this.field986 == null) {
                this.field995 = 0;
            } else {
                this.field995 = 2;
            }
        }
        if (this.field996 != -1) {
            return;
        }
        if (this.field986 == null) {
            this.field996 = 0;
        } else {
            this.field996 = 2;
        }
    }

    @ObfuscatedName("as.g(Ldt;II)Ldt;")
    public class105 method864(class105 arg0, int arg1) {
        int var3 = this.field981[arg1];
        class103 var4 = method3040(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2243(true);
        } else {
            class105 var6 = arg0.method2243(!var4.method2168(var5));
            var6.method2210(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("as.m(Ldt;III)Ldt;")
    public class105 method865(class105 arg0, int arg1, int arg2) {
        int var4 = this.field981[arg1];
        class103 var5 = method3040(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2243(true);
        }
        class105 var7 = arg0.method2243(!var5.method2168(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2182();
        } else if (var8 == 2) {
            var7.method2181();
        } else if (var8 == 3) {
            var7.method2199();
        }
        var7.method2210(var5, var6);
        if (var8 == 1) {
            var7.method2199();
        } else if (var8 == 2) {
            var7.method2181();
        } else if (var8 == 3) {
            var7.method2182();
        }
        return var7;
    }

    @ObfuscatedName("as.b(Ldt;II)Ldt;")
    public class105 method866(class105 arg0, int arg1) {
        int var3 = this.field981[arg1];
        class103 var4 = method3040(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2175(true);
        } else {
            class105 var6 = arg0.method2175(!var4.method2168(var5));
            var6.method2210(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("as.p(Ldt;ILas;II)Ldt;")
    public class105 method869(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field981[arg1];
        class103 var6 = method3040(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method864(arg0, arg3);
        }
        int var8 = arg2.field981[arg3];
        class103 var9 = method3040(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2243(!var6.method2168(var7));
            var11.method2210(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2243(!var6.method2168(var7) & !var9.method2168(var10));
            var12.method2233(var6, var7, var9, var10, this.field986);
            return var12;
        }
    }

    @ObfuscatedName("as.t(Ldt;II)Ldt;")
    public class105 method868(class105 arg0, int arg1) {
        int var3 = this.field981[arg1];
        class103 var4 = method3040(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2243(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field985 != null && arg1 < this.field985.length) {
            int var8 = this.field985[arg1];
            var6 = method3040(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2243(!var4.method2168(var5));
            var10.method2210(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2243(!var4.method2168(var5) & !var6.method2168(var7));
            var9.method2210(var4, var5);
            var9.method2210(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fz.w(II)Lci;")
    public static class103 method3040(int arg0) {
        class103 var1 = (class103) field983.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field1963;
        class167 var3 = Statics.field2630;
        boolean var4 = true;
        int[] var5 = var2.method3059(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3099(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3099(var8, 0);
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
            field983.method3479(var10, (long) arg0);
        }
        return var10;
    }
}
