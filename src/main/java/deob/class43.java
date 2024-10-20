package deob;

@ObfuscatedName("am")
public class class43 extends class205 {

    @ObfuscatedName("am.c")
    public static class194 field991 = new class194(64);

    @ObfuscatedName("am.y")
    public static class194 field992 = new class194(100);

    @ObfuscatedName("am.k")
    public int[] field990;

    @ObfuscatedName("am.r")
    public int[] field994;

    @ObfuscatedName("am.p")
    public int[] field996;

    @ObfuscatedName("am.q")
    public int[] field993;

    @ObfuscatedName("am.m")
    public int field999 = -1;

    @ObfuscatedName("am.e")
    public int[] field998;

    @ObfuscatedName("am.x")
    public boolean field1013 = false;

    @ObfuscatedName("am.z")
    public int field1000 = 5;

    @ObfuscatedName("am.i")
    public int field995 = -1;

    @ObfuscatedName("am.t")
    public int field1002 = -1;

    @ObfuscatedName("am.n")
    public int field1012 = 99;

    @ObfuscatedName("am.u")
    public int field1004 = -1;

    @ObfuscatedName("am.g")
    public int field1005 = -1;

    @ObfuscatedName("am.j")
    public int field1006 = 2;

    @ObfuscatedName("cq.a(IB)Lam;")
    public static class43 method2137(int arg0) {
        class43 var1 = (class43) field991.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2032.method3188(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method929(new class120(var2));
        }
        var3.method931();
        field991.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.w(Ldx;I)V")
    public void method929(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method930(arg0, var2);
        }
    }

    @ObfuscatedName("am.d(Ldx;II)V")
    public void method930(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2464();
            this.field996 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field996[var4] = arg0.method2464();
            }
            this.field990 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field990[var5] = arg0.method2464();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field990[var6] += arg0.method2464() << 16;
            }
        } else if (arg1 == 2) {
            this.field999 = arg0.method2464();
        } else if (arg1 == 3) {
            int var7 = arg0.method2462();
            this.field998 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field998[var8] = arg0.method2462();
            }
            this.field998[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1013 = true;
        } else if (arg1 == 5) {
            this.field1000 = arg0.method2462();
        } else if (arg1 == 6) {
            this.field995 = arg0.method2464();
        } else if (arg1 == 7) {
            this.field1002 = arg0.method2464();
        } else if (arg1 == 8) {
            this.field1012 = arg0.method2462();
        } else if (arg1 == 9) {
            this.field1004 = arg0.method2462();
        } else if (arg1 == 10) {
            this.field1005 = arg0.method2462();
        } else if (arg1 == 11) {
            this.field1006 = arg0.method2462();
        } else if (arg1 == 12) {
            int var9 = arg0.method2462();
            this.field994 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field994[var10] = arg0.method2464();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field994[var11] += arg0.method2464() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2462();
            this.field993 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field993[var13] = arg0.method2466();
            }
        }
    }

    @ObfuscatedName("am.c(B)V")
    public void method931() {
        if (this.field1004 == -1) {
            if (this.field998 == null) {
                this.field1004 = 0;
            } else {
                this.field1004 = 2;
            }
        }
        if (this.field1005 != -1) {
            return;
        }
        if (this.field998 == null) {
            this.field1005 = 0;
        } else {
            this.field1005 = 2;
        }
    }

    @ObfuscatedName("am.y(Ldr;II)Ldr;")
    public class106 method932(class106 arg0, int arg1) {
        int var3 = this.field990[arg1];
        class104 var4 = method2372(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2326(true);
        } else {
            class106 var6 = arg0.method2326(!var4.method2240(var5));
            var6.method2316(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("am.k(Ldr;III)Ldr;")
    public class106 method933(class106 arg0, int arg1, int arg2) {
        int var4 = this.field990[arg1];
        class104 var5 = method2372(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2326(true);
        }
        class106 var7 = arg0.method2326(!var5.method2240(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2258();
        } else if (var8 == 2) {
            var7.method2257();
        } else if (var8 == 3) {
            var7.method2256();
        }
        var7.method2316(var5, var6);
        if (var8 == 1) {
            var7.method2256();
        } else if (var8 == 2) {
            var7.method2257();
        } else if (var8 == 3) {
            var7.method2258();
        }
        return var7;
    }

    @ObfuscatedName("am.r(Ldr;II)Ldr;")
    public class106 method934(class106 arg0, int arg1) {
        int var3 = this.field990[arg1];
        class104 var4 = method2372(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2248(true);
        } else {
            class106 var6 = arg0.method2248(!var4.method2240(var5));
            var6.method2316(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("am.p(Ldr;ILam;II)Ldr;")
    public class106 method935(class106 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field990[arg1];
        class104 var6 = method2372(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method932(arg0, arg3);
        }
        int var8 = arg2.field990[arg3];
        class104 var9 = method2372(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class106 var11 = arg0.method2326(!var6.method2240(var7));
            var11.method2316(var6, var7);
            return var11;
        } else {
            class106 var12 = arg0.method2326(!var6.method2240(var7) & !var9.method2240(var10));
            var12.method2254(var6, var7, var9, var10, this.field998);
            return var12;
        }
    }

    @ObfuscatedName("am.q(Ldr;IB)Ldr;")
    public class106 method936(class106 arg0, int arg1) {
        int var3 = this.field990[arg1];
        class104 var4 = method2372(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2326(true);
        }
        class104 var6 = null;
        int var7 = 0;
        if (this.field994 != null && arg1 < this.field994.length) {
            int var8 = this.field994[arg1];
            var6 = method2372(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class106 var10 = arg0.method2326(!var4.method2240(var5));
            var10.method2316(var4, var5);
            return var10;
        } else {
            class106 var9 = arg0.method2326(!var4.method2240(var5) & !var6.method2240(var7));
            var9.method2316(var4, var5);
            var9.method2316(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("de.m(II)Lcl;")
    public static class104 method2372(int arg0) {
        class104 var1 = (class104) field992.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class104 var2 = class104.method1(Statics.field1009, Statics.field1963, arg0, false);
        if (var2 != null) {
            field992.method3581(var2, (long) arg0);
        }
        return var2;
    }
}
