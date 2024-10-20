package deob;

@ObfuscatedName("ac")
public class class52 extends class208 {

    @ObfuscatedName("ac.h")
    public static class197 field1124 = new class197(64);

    @ObfuscatedName("ac.r")
    public static class197 field1125 = new class197(64);

    @ObfuscatedName("ac.a")
    public static class197 field1126 = new class197(20);

    @ObfuscatedName("ac.q")
    public int field1132 = -1;

    @ObfuscatedName("ac.g")
    public int field1129 = 16777215;

    @ObfuscatedName("ac.j")
    public int field1130 = 70;

    @ObfuscatedName("ac.w")
    public int field1131 = -1;

    @ObfuscatedName("ac.x")
    public int field1137 = -1;

    @ObfuscatedName("ac.f")
    public int field1133 = -1;

    @ObfuscatedName("ac.t")
    public int field1134 = -1;

    @ObfuscatedName("ac.z")
    public int field1122 = 0;

    @ObfuscatedName("ac.y")
    public int field1123 = 0;

    @ObfuscatedName("ac.m")
    public int field1121 = -1;

    @ObfuscatedName("ac.v")
    public String field1138 = "";

    @ObfuscatedName("ac.k")
    public int field1144 = -1;

    @ObfuscatedName("ac.n")
    public int field1140 = 0;

    @ObfuscatedName("bq.e(II)Lac;")
    public static class52 method1191(int arg0) {
        class52 var1 = (class52) field1124.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1139.method3130(32, arg0);
        class52 var3 = new class52();
        if (var2 != null) {
            var3.method1060(new class123(var2));
        }
        field1124.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.l(Ldd;I)V")
    public void method1060(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method1057(arg0, var2);
        }
    }

    @ObfuscatedName("ac.c(Ldd;II)V")
    public void method1057(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1132 = arg0.method2478();
        } else if (arg1 == 2) {
            this.field1129 = arg0.method2557();
        } else if (arg1 == 3) {
            this.field1131 = arg0.method2478();
        } else if (arg1 == 4) {
            this.field1133 = arg0.method2478();
        } else if (arg1 == 5) {
            this.field1137 = arg0.method2478();
        } else if (arg1 == 6) {
            this.field1134 = arg0.method2478();
        } else if (arg1 == 7) {
            this.field1122 = arg0.method2467();
        } else if (arg1 == 8) {
            this.field1138 = arg0.method2472();
        } else if (arg1 == 9) {
            this.field1130 = arg0.method2466();
        } else if (arg1 == 10) {
            this.field1123 = arg0.method2467();
        } else if (arg1 == 11) {
            this.field1121 = 0;
        } else if (arg1 == 12) {
            this.field1144 = arg0.method2464();
        } else if (arg1 == 13) {
            this.field1140 = arg0.method2467();
        } else if (arg1 == 14) {
            this.field1121 = arg0.method2466();
        }
    }

    @ObfuscatedName("ac.h(II)Ljava/lang/String;")
    public String method1058(int arg0) {
        String var2 = this.field1138;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            String var4 = var2.substring(0, var3);
            String var5 = Integer.toString(arg0);
            var2 = var4 + var5 + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ac.r(I)Lcf;")
    public class82 method1059() {
        if (this.field1131 < 0) {
            return null;
        }
        class82 var1 = (class82) field1125.method3589((long) this.field1131);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2387(Statics.field1142, this.field1131, 0);
        if (var2 != null) {
            field1125.method3591(var2, (long) this.field1131);
        }
        return var2;
    }

    @ObfuscatedName("ac.a(I)Lcf;")
    public class82 method1077() {
        if (this.field1137 < 0) {
            return null;
        }
        class82 var1 = (class82) field1125.method3589((long) this.field1137);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2387(Statics.field1142, this.field1137, 0);
        if (var2 != null) {
            field1125.method3591(var2, (long) this.field1137);
        }
        return var2;
    }

    @ObfuscatedName("ac.b(I)Lcf;")
    public class82 method1061() {
        if (this.field1133 < 0) {
            return null;
        }
        class82 var1 = (class82) field1125.method3589((long) this.field1133);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2387(Statics.field1142, this.field1133, 0);
        if (var2 != null) {
            field1125.method3591(var2, (long) this.field1133);
        }
        return var2;
    }

    @ObfuscatedName("ac.u(I)Lcf;")
    public class82 method1084() {
        if (this.field1134 < 0) {
            return null;
        }
        class82 var1 = (class82) field1125.method3589((long) this.field1134);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2387(Statics.field1142, this.field1134, 0);
        if (var2 != null) {
            field1125.method3591(var2, (long) this.field1134);
        }
        return var2;
    }

    @ObfuscatedName("ac.o(I)Lhu;")
    public class228 method1063() {
        if (this.field1132 == -1) {
            return null;
        }
        class228 var1 = (class228) field1126.method3589((long) this.field1132);
        if (var1 != null) {
            return var1;
        }
        class228 var2 = class80.method2373(Statics.field1142, Statics.field1127, this.field1132, 0);
        if (var2 != null) {
            field1126.method3591(var2, (long) this.field1132);
        }
        return var2;
    }

    @ObfuscatedName("dy.p(B)V")
    public static void method2394() {
        field1124.method3590();
        field1125.method3590();
        field1126.method3590();
    }
}
