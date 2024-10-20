package deob;

@ObfuscatedName("ai")
public class class173 extends class6 {

    @ObfuscatedName("ai.f")
    public int[] field2588;

    @ObfuscatedName("ai.g")
    public boolean field2577 = false;

    @ObfuscatedName("ai.d")
    public int[] field2584;

    @ObfuscatedName("ai.e")
    public int field2579 = -1;

    @ObfuscatedName("ai.n")
    public int field2585 = 2;

    @ObfuscatedName("ai.o")
    public int field2578 = 5;

    @ObfuscatedName("ai.l")
    public int[] field2572;

    @ObfuscatedName("ai.j")
    public int field2575 = -1;

    @ObfuscatedName("ai.i")
    public int field2582 = -1;

    @ObfuscatedName("ai.w")
    public static class2 field2569 = new class2(64);

    @ObfuscatedName("ai.t")
    public static class2 field2570 = new class2(100);

    @ObfuscatedName("ai.s")
    public int[] field2574;

    @ObfuscatedName("ai.r")
    public int field2583 = -1;

    @ObfuscatedName("ai.q")
    public int field2580 = -1;

    @ObfuscatedName("ai.z")
    public int field2581 = 99;

    @ObfuscatedName("ai.x")
    public int[] field2587;

    @ObfuscatedName("ai.h(Ldp;B)V")
    public void method3003(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method3004(arg0, var2);
        }
    }

    @ObfuscatedName("ai.k(Ldp;II)V")
    public void method3004(class50 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method720();
            this.field2588 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2588[var4] = arg0.method720();
            }
            this.field2584 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2584[var5] = arg0.method720();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2584[var6] += arg0.method720() << 16;
            }
        } else if (arg1 == 2) {
            this.field2575 = arg0.method720();
        } else if (arg1 == 3) {
            int var7 = arg0.method726();
            this.field2587 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2587[var8] = arg0.method726();
            }
            this.field2587[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2577 = true;
        } else if (arg1 == 5) {
            this.field2578 = arg0.method726();
        } else if (arg1 == 6) {
            this.field2579 = arg0.method720();
        } else if (arg1 == 7) {
            this.field2580 = arg0.method720();
        } else if (arg1 == 8) {
            this.field2581 = arg0.method726();
        } else if (arg1 == 9) {
            this.field2582 = arg0.method726();
        } else if (arg1 == 10) {
            this.field2583 = arg0.method726();
        } else if (arg1 == 11) {
            this.field2585 = arg0.method726();
        } else if (arg1 == 12) {
            int var9 = arg0.method726();
            this.field2572 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2572[var10] = arg0.method720();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2572[var11] += arg0.method720() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method726();
            this.field2574 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2574[var13] = arg0.method728();
            }
        }
    }

    @ObfuscatedName("ai.t(Ldu;II)Ldu;")
    public class27 method3006(class27 arg0, int arg1) {
        int var3 = this.field2584[arg1];
        class28 var4 = method1799(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method386(true);
        } else {
            class27 var6 = arg0.method386(!var4.method474(var5));
            var6.method466(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ai.d(Ldu;III)Ldu;")
    public class27 method3007(class27 arg0, int arg1, int arg2) {
        int var4 = this.field2584[arg1];
        class28 var5 = method1799(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method386(true);
        }
        class27 var7 = arg0.method386(!var5.method474(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method397();
        } else if (var8 == 2) {
            var7.method396();
        } else if (var8 == 3) {
            var7.method395();
        }
        var7.method466(var5, var6);
        if (var8 == 1) {
            var7.method395();
        } else if (var8 == 2) {
            var7.method396();
        } else if (var8 == 3) {
            var7.method397();
        }
        return var7;
    }

    @ObfuscatedName("ai.s(Ldu;II)Ldu;")
    public class27 method3010(class27 arg0, int arg1) {
        int var3 = this.field2584[arg1];
        class28 var4 = method1799(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method386(true);
        }
        class28 var6 = null;
        int var7 = 0;
        if (this.field2572 != null && arg1 < this.field2572.length) {
            int var8 = this.field2572[arg1];
            var6 = method1799(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class27 var10 = arg0.method386(!var4.method474(var5));
            var10.method466(var4, var5);
            return var10;
        } else {
            class27 var9 = arg0.method386(!var4.method474(var5) & !var6.method474(var7));
            var9.method466(var4, var5);
            var9.method466(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ai.w(I)V")
    public void method3011() {
        if (this.field2582 == -1) {
            if (this.field2587 == null) {
                this.field2582 = 0;
            } else {
                this.field2582 = 2;
            }
        }
        if (this.field2583 != -1) {
            return;
        }
        if (this.field2587 == null) {
            this.field2583 = 0;
        } else {
            this.field2583 = 2;
        }
    }

    @ObfuscatedName("ai.l(Ldu;IB)Ldu;")
    public class27 method3018(class27 arg0, int arg1) {
        int var3 = this.field2584[arg1];
        class28 var4 = method1799(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method403(true);
        } else {
            class27 var6 = arg0.method403(!var4.method474(var5));
            var6.method466(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ai.f(Ldu;ILai;II)Ldu;")
    public class27 method3029(class27 arg0, int arg1, class173 arg2, int arg3) {
        int var5 = this.field2584[arg1];
        class28 var6 = method1799(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3006(arg0, arg3);
        }
        int var8 = arg2.field2584[arg3];
        class28 var9 = method1799(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class27 var11 = arg0.method386(!var6.method474(var7));
            var11.method466(var6, var7);
            return var11;
        } else {
            class27 var12 = arg0.method386(!var6.method474(var7) & !var9.method474(var10));
            var12.method393(var6, var7, var9, var10, this.field2587);
            return var12;
        }
    }

    @ObfuscatedName("client.j(II)Ldv;")
    public static class28 method1799(int arg0) {
        class28 var1 = (class28) field2570.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class28 var2 = class28.method1192(Statics.field2573, Statics.field49, arg0, false);
        if (var2 != null) {
            field2570.method4(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("ap.b(IB)Lai;")
    public static class173 method3098(int arg0) {
        class173 var1 = (class173) field2569.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2567.method1266(12, arg0);
        class173 var3 = new class173();
        if (var2 != null) {
            var3.method3003(new class50(var2));
        }
        var3.method3011();
        field2569.method4(var3, (long) arg0);
        return var3;
    }
}
