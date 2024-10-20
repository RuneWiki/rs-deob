package deob;

@ObfuscatedName("aa")
public class class43 extends class205 {

    @ObfuscatedName("aa.b")
    public static class194 field1014 = new class194(64);

    @ObfuscatedName("aa.l")
    public static class194 field1002 = new class194(100);

    @ObfuscatedName("aa.d")
    public int[] field1000;

    @ObfuscatedName("aa.n")
    public int[] field1004;

    @ObfuscatedName("aa.m")
    public int[] field1005;

    @ObfuscatedName("aa.g")
    public int[] field1006;

    @ObfuscatedName("aa.s")
    public int field1015 = -1;

    @ObfuscatedName("aa.r")
    public int[] field1008;

    @ObfuscatedName("aa.k")
    public boolean field1020 = false;

    @ObfuscatedName("aa.o")
    public int field1010 = 5;

    @ObfuscatedName("aa.q")
    public int field1011 = -1;

    @ObfuscatedName("aa.p")
    public int field1007 = -1;

    @ObfuscatedName("aa.h")
    public int field1013 = 99;

    @ObfuscatedName("aa.e")
    public int field1009 = -1;

    @ObfuscatedName("aa.t")
    public int field998 = -1;

    @ObfuscatedName("aa.w")
    public int field1016 = 2;

    @ObfuscatedName("av.f(II)Laa;")
    public static class43 method745(int arg0) {
        class43 var1 = (class43) field1014.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1012.method3061(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method902(new class120(var2));
        }
        var3.method874();
        field1014.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.u(Ldj;S)V")
    public void method902(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method873(arg0, var2);
        }
    }

    @ObfuscatedName("aa.x(Ldj;IB)V")
    public void method873(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2387();
            this.field1005 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1005[var4] = arg0.method2387();
            }
            this.field1000 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1000[var5] = arg0.method2387();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1000[var6] += arg0.method2387() << 16;
            }
        } else if (arg1 == 2) {
            this.field1015 = arg0.method2387();
        } else if (arg1 == 3) {
            int var7 = arg0.method2385();
            this.field1008 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1008[var8] = arg0.method2385();
            }
            this.field1008[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1020 = true;
        } else if (arg1 == 5) {
            this.field1010 = arg0.method2385();
        } else if (arg1 == 6) {
            this.field1011 = arg0.method2387();
        } else if (arg1 == 7) {
            this.field1007 = arg0.method2387();
        } else if (arg1 == 8) {
            this.field1013 = arg0.method2385();
        } else if (arg1 == 9) {
            this.field1009 = arg0.method2385();
        } else if (arg1 == 10) {
            this.field998 = arg0.method2385();
        } else if (arg1 == 11) {
            this.field1016 = arg0.method2385();
        } else if (arg1 == 12) {
            int var9 = arg0.method2385();
            this.field1004 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1004[var10] = arg0.method2387();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1004[var11] += arg0.method2387() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2385();
            this.field1006 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1006[var13] = arg0.method2389();
            }
        }
    }

    @ObfuscatedName("aa.b(I)V")
    public void method874() {
        if (this.field1009 == -1) {
            if (this.field1008 == null) {
                this.field1009 = 0;
            } else {
                this.field1009 = 2;
            }
        }
        if (this.field998 != -1) {
            return;
        }
        if (this.field1008 == null) {
            this.field998 = 0;
        } else {
            this.field998 = 2;
        }
    }

    @ObfuscatedName("aa.l(Ldr;II)Ldr;")
    public class106 method901(class106 arg0, int arg1) {
        int var3 = this.field1000[arg1];
        class104 var4 = method2257(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2192(true);
        } else {
            class106 var6 = arg0.method2192(!var4.method2185(var5));
            var6.method2211(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.d(Ldr;IIB)Ldr;")
    public class106 method876(class106 arg0, int arg1, int arg2) {
        int var4 = this.field1000[arg1];
        class104 var5 = method2257(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2192(true);
        }
        class106 var7 = arg0.method2192(!var5.method2185(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2201();
        } else if (var8 == 2) {
            var7.method2253();
        } else if (var8 == 3) {
            var7.method2221();
        }
        var7.method2211(var5, var6);
        if (var8 == 1) {
            var7.method2221();
        } else if (var8 == 2) {
            var7.method2253();
        } else if (var8 == 3) {
            var7.method2201();
        }
        return var7;
    }

    @ObfuscatedName("aa.n(Ldr;II)Ldr;")
    public class106 method900(class106 arg0, int arg1) {
        int var3 = this.field1000[arg1];
        class104 var4 = method2257(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2193(true);
        } else {
            class106 var6 = arg0.method2193(!var4.method2185(var5));
            var6.method2211(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.m(Ldr;ILaa;IB)Ldr;")
    public class106 method878(class106 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field1000[arg1];
        class104 var6 = method2257(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method901(arg0, arg3);
        }
        int var8 = arg2.field1000[arg3];
        class104 var9 = method2257(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class106 var11 = arg0.method2192(!var6.method2185(var7));
            var11.method2211(var6, var7);
            return var11;
        } else {
            class106 var12 = arg0.method2192(!var6.method2185(var7) & !var9.method2185(var10));
            var12.method2199(var6, var7, var9, var10, this.field1008);
            return var12;
        }
    }

    @ObfuscatedName("aa.g(Ldr;IB)Ldr;")
    public class106 method893(class106 arg0, int arg1) {
        int var3 = this.field1000[arg1];
        class104 var4 = method2257(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2192(true);
        }
        class104 var6 = null;
        int var7 = 0;
        if (this.field1004 != null && arg1 < this.field1004.length) {
            int var8 = this.field1004[arg1];
            var6 = method2257(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class106 var10 = arg0.method2192(!var4.method2185(var5));
            var10.method2211(var4, var5);
            return var10;
        } else {
            class106 var9 = arg0.method2192(!var4.method2185(var5) & !var6.method2185(var7));
            var9.method2211(var4, var5);
            var9.method2211(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dw.s(II)Lce;")
    public static class104 method2257(int arg0) {
        class104 var1 = (class104) field1002.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class168 var2 = Statics.field999;
        class168 var3 = Statics.field1001;
        boolean var4 = true;
        int[] var5 = var2.method3117(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3070(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3070(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class104 var10;
        if (var4) {
            try {
                var10 = new class104(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field1002.method3521(var10, (long) arg0);
        }
        return var10;
    }
}
