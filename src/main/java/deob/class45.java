package deob;

@ObfuscatedName("ak")
public class class45 extends class208 {

    @ObfuscatedName("ak.z")
    public static class197 field1011 = new class197(64);

    @ObfuscatedName("ak.i")
    public static class197 field997 = new class197(100);

    @ObfuscatedName("ak.b")
    public int[] field1002;

    @ObfuscatedName("ak.l")
    public int[] field999;

    @ObfuscatedName("ak.m")
    public int[] field1000;

    @ObfuscatedName("ak.p")
    public int[] field1001;

    @ObfuscatedName("ak.f")
    public int field1003 = -1;

    @ObfuscatedName("ak.d")
    public int[] field995;

    @ObfuscatedName("ak.v")
    public boolean field1007 = false;

    @ObfuscatedName("ak.q")
    public int field1005 = 5;

    @ObfuscatedName("ak.t")
    public int field1006 = -1;

    @ObfuscatedName("ak.g")
    public int field994 = -1;

    @ObfuscatedName("ak.s")
    public int field1008 = 99;

    @ObfuscatedName("ak.h")
    public int field998 = -1;

    @ObfuscatedName("ak.u")
    public int field1010 = -1;

    @ObfuscatedName("ak.a")
    public int field996 = 2;

    @ObfuscatedName("dq.x(IB)Lak;")
    public static class45 method2337(int arg0) {
        class45 var1 = (class45) field1011.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2968.method3079(12, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method830(new class123(var2));
        }
        var3.method832();
        field1011.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.r(Ldp;B)V")
    public void method830(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method831(arg0, var2);
        }
    }

    @ObfuscatedName("ak.j(Ldp;II)V")
    public void method831(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2403();
            this.field1000 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1000[var4] = arg0.method2403();
            }
            this.field1002 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1002[var5] = arg0.method2403();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1002[var6] += arg0.method2403() << 16;
            }
        } else if (arg1 == 2) {
            this.field1003 = arg0.method2403();
        } else if (arg1 == 3) {
            int var7 = arg0.method2408();
            this.field995 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field995[var8] = arg0.method2408();
            }
            this.field995[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1007 = true;
        } else if (arg1 == 5) {
            this.field1005 = arg0.method2408();
        } else if (arg1 == 6) {
            this.field1006 = arg0.method2403();
        } else if (arg1 == 7) {
            this.field994 = arg0.method2403();
        } else if (arg1 == 8) {
            this.field1008 = arg0.method2408();
        } else if (arg1 == 9) {
            this.field998 = arg0.method2408();
        } else if (arg1 == 10) {
            this.field1010 = arg0.method2408();
        } else if (arg1 == 11) {
            this.field996 = arg0.method2408();
        } else if (arg1 == 12) {
            int var9 = arg0.method2408();
            this.field999 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field999[var10] = arg0.method2403();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field999[var11] += arg0.method2403() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2408();
            this.field1001 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1001[var13] = arg0.method2412();
            }
        }
    }

    @ObfuscatedName("ak.z(I)V")
    public void method832() {
        if (this.field998 == -1) {
            if (this.field995 == null) {
                this.field998 = 0;
            } else {
                this.field998 = 2;
            }
        }
        if (this.field1010 != -1) {
            return;
        }
        if (this.field995 == null) {
            this.field1010 = 0;
        } else {
            this.field1010 = 2;
        }
    }

    @ObfuscatedName("ak.i(Ldj;IB)Ldj;")
    public class109 method833(class109 arg0, int arg1) {
        int var3 = this.field1002[arg1];
        class107 var4 = method108(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2220(true);
        } else {
            class109 var6 = arg0.method2220(!var4.method2211(var5));
            var6.method2235(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.b(Ldj;IIB)Ldj;")
    public class109 method834(class109 arg0, int arg1, int arg2) {
        int var4 = this.field1002[arg1];
        class107 var5 = method108(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2220(true);
        }
        class109 var7 = arg0.method2220(!var5.method2211(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2231();
        } else if (var8 == 2) {
            var7.method2252();
        } else if (var8 == 3) {
            var7.method2288();
        }
        var7.method2235(var5, var6);
        if (var8 == 1) {
            var7.method2288();
        } else if (var8 == 2) {
            var7.method2252();
        } else if (var8 == 3) {
            var7.method2231();
        }
        return var7;
    }

    @ObfuscatedName("ak.l(Ldj;II)Ldj;")
    public class109 method835(class109 arg0, int arg1) {
        int var3 = this.field1002[arg1];
        class107 var4 = method108(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2218(true);
        } else {
            class109 var6 = arg0.method2218(!var4.method2211(var5));
            var6.method2235(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.m(Ldj;ILak;II)Ldj;")
    public class109 method849(class109 arg0, int arg1, class45 arg2, int arg3) {
        int var5 = this.field1002[arg1];
        class107 var6 = method108(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method833(arg0, arg3);
        }
        int var8 = arg2.field1002[arg3];
        class107 var9 = method108(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class109 var11 = arg0.method2220(!var6.method2211(var7));
            var11.method2235(var6, var7);
            return var11;
        } else {
            class109 var12 = arg0.method2220(!var6.method2211(var7) & !var9.method2211(var10));
            var12.method2227(var6, var7, var9, var10, this.field995);
            return var12;
        }
    }

    @ObfuscatedName("ak.p(Ldj;II)Ldj;")
    public class109 method837(class109 arg0, int arg1) {
        int var3 = this.field1002[arg1];
        class107 var4 = method108(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2220(true);
        }
        class107 var6 = null;
        int var7 = 0;
        if (this.field999 != null && arg1 < this.field999.length) {
            int var8 = this.field999[arg1];
            var6 = method108(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class109 var10 = arg0.method2220(!var4.method2211(var5));
            var10.method2235(var4, var5);
            return var10;
        } else {
            class109 var9 = arg0.method2220(!var4.method2211(var5) & !var6.method2211(var7));
            var9.method2235(var4, var5);
            var9.method2235(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("m.f(II)Ldu;")
    public static class107 method108(int arg0) {
        class107 var1 = (class107) field997.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class107 var2 = class107.method1819(Statics.field1004, Statics.field1009, arg0, false);
        if (var2 != null) {
            field997.method3535(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("dh.d(I)V")
    public static void method2313() {
        field1011.method3534();
        field997.method3534();
    }
}
