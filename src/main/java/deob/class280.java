package deob;

@ObfuscatedName("ju")
public class class280 extends class214 {

    @ObfuscatedName("ju.x")
    public static class208 field3618 = new class208(64);

    @ObfuscatedName("ju.h")
    public static class208 field3619 = new class208(100);

    @ObfuscatedName("ju.f")
    public int[] field3620;

    @ObfuscatedName("ju.p")
    public int[] field3621;

    @ObfuscatedName("ju.m")
    public int[] field3622;

    @ObfuscatedName("ju.q")
    public int[] field3629;

    @ObfuscatedName("ju.b")
    public int field3624 = -1;

    @ObfuscatedName("ju.n")
    public int[] field3623;

    @ObfuscatedName("ju.e")
    public boolean field3626 = false;

    @ObfuscatedName("ju.r")
    public int field3627 = 5;

    @ObfuscatedName("ju.t")
    public int field3628 = -1;

    @ObfuscatedName("ju.l")
    public int field3616 = -1;

    @ObfuscatedName("ju.o")
    public int field3630 = 99;

    @ObfuscatedName("ju.u")
    public int field3632 = -1;

    @ObfuscatedName("ju.y")
    public int field3625 = -1;

    @ObfuscatedName("ju.k")
    public int field3633 = 2;

    @ObfuscatedName("eh.a(II)Lju;")
    public static class280 method3173(int arg0) {
        class280 var1 = (class280) field3618.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3634.method4422(12, arg0);
        class280 var3 = new class280();
        if (var2 != null) {
            var3.method5010(new class190(var2));
        }
        var3.method5036();
        field3618.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.s(Lgx;I)V")
    public void method5010(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method5024(arg0, var2);
        }
    }

    @ObfuscatedName("ju.g(Lgx;II)V")
    public void method5024(class190 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3610();
            this.field3622 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3622[var4] = arg0.method3610();
            }
            this.field3620 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3620[var5] = arg0.method3610();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3620[var6] += arg0.method3610() << 16;
            }
        } else if (arg1 == 2) {
            this.field3624 = arg0.method3610();
        } else if (arg1 == 3) {
            int var7 = arg0.method3443();
            this.field3623 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3623[var8] = arg0.method3443();
            }
            this.field3623[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3626 = true;
        } else if (arg1 == 5) {
            this.field3627 = arg0.method3443();
        } else if (arg1 == 6) {
            this.field3628 = arg0.method3610();
        } else if (arg1 == 7) {
            this.field3616 = arg0.method3610();
        } else if (arg1 == 8) {
            this.field3630 = arg0.method3443();
        } else if (arg1 == 9) {
            this.field3632 = arg0.method3443();
        } else if (arg1 == 10) {
            this.field3625 = arg0.method3443();
        } else if (arg1 == 11) {
            this.field3633 = arg0.method3443();
        } else if (arg1 == 12) {
            int var9 = arg0.method3443();
            this.field3621 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3621[var10] = arg0.method3610();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3621[var11] += arg0.method3610() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3443();
            this.field3629 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3629[var13] = arg0.method3459();
            }
        }
    }

    @ObfuscatedName("ju.x(B)V")
    public void method5036() {
        if (this.field3632 == -1) {
            if (this.field3623 == null) {
                this.field3632 = 0;
            } else {
                this.field3632 = 2;
            }
        }
        if (this.field3625 != -1) {
            return;
        }
        if (this.field3623 == null) {
            this.field3625 = 0;
        } else {
            this.field3625 = 2;
        }
    }

    @ObfuscatedName("ju.h(Ldv;II)Ldv;")
    public class127 method5013(class127 arg0, int arg1) {
        int var3 = this.field3620[arg1];
        class138 var4 = method3064(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2678(true);
        } else {
            class127 var6 = arg0.method2678(!var4.method3069(var5));
            var6.method2685(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ju.f(Ldv;III)Ldv;")
    public class127 method5014(class127 arg0, int arg1, int arg2) {
        int var4 = this.field3620[arg1];
        class138 var5 = method3064(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2678(true);
        }
        class127 var7 = arg0.method2678(!var5.method3069(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2680();
        } else if (var8 == 2) {
            var7.method2689();
        } else if (var8 == 3) {
            var7.method2692();
        }
        var7.method2685(var5, var6);
        if (var8 == 1) {
            var7.method2692();
        } else if (var8 == 2) {
            var7.method2689();
        } else if (var8 == 3) {
            var7.method2680();
        }
        return var7;
    }

    @ObfuscatedName("ju.p(Ldv;II)Ldv;")
    public class127 method5015(class127 arg0, int arg1) {
        int var3 = this.field3620[arg1];
        class138 var4 = method3064(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2679(true);
        } else {
            class127 var6 = arg0.method2679(!var4.method3069(var5));
            var6.method2685(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ju.m(Ldv;ILju;II)Ldv;")
    public class127 method5029(class127 arg0, int arg1, class280 arg2, int arg3) {
        int var5 = this.field3620[arg1];
        class138 var6 = method3064(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method5013(arg0, arg3);
        }
        int var8 = arg2.field3620[arg3];
        class138 var9 = method3064(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class127 var11 = arg0.method2678(!var6.method3069(var7));
            var11.method2685(var6, var7);
            return var11;
        } else {
            class127 var12 = arg0.method2678(!var6.method3069(var7) & !var9.method3069(var10));
            var12.method2682(var6, var7, var9, var10, this.field3623);
            return var12;
        }
    }

    @ObfuscatedName("ju.q(Ldv;II)Ldv;")
    public class127 method5017(class127 arg0, int arg1) {
        int var3 = this.field3620[arg1];
        class138 var4 = method3064(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2678(true);
        }
        class138 var6 = null;
        int var7 = 0;
        if (this.field3621 != null && arg1 < this.field3621.length) {
            int var8 = this.field3621[arg1];
            var6 = method3064(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class127 var10 = arg0.method2678(!var4.method3069(var5));
            var10.method2685(var4, var5);
            return var10;
        } else {
            class127 var9 = arg0.method2678(!var4.method3069(var5) & !var6.method3069(var7));
            var9.method2685(var4, var5);
            var9.method2685(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ep.b(II)Lei;")
    public static class138 method3064(int arg0) {
        class138 var1 = (class138) field3619.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class255 var2 = Statics.field3617;
        class255 var3 = Statics.field1882;
        boolean var4 = true;
        int[] var5 = var2.method4433(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4430(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4430(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class138 var10;
        if (var4) {
            try {
                var10 = new class138(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3619.method3878(var10, (long) arg0);
        }
        return var10;
    }
}
