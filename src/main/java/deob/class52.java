package deob;

@ObfuscatedName("aj")
public class class52 extends class208 {

    @ObfuscatedName("aj.r")
    public static class197 field1127 = new class197(64);

    @ObfuscatedName("aj.z")
    public static class197 field1128 = new class197(64);

    @ObfuscatedName("aj.t")
    public static class197 field1129 = new class197(20);

    @ObfuscatedName("aj.x")
    public int field1131 = -1;

    @ObfuscatedName("aj.u")
    public int field1143 = 16777215;

    @ObfuscatedName("aj.j")
    public int field1133 = 70;

    @ObfuscatedName("aj.q")
    public int field1124 = -1;

    @ObfuscatedName("aj.w")
    public int field1134 = -1;

    @ObfuscatedName("aj.b")
    public int field1136 = -1;

    @ObfuscatedName("aj.p")
    public int field1132 = -1;

    @ObfuscatedName("aj.o")
    public int field1138 = 0;

    @ObfuscatedName("aj.y")
    public int field1139 = 0;

    @ObfuscatedName("aj.s")
    public int field1140 = -1;

    @ObfuscatedName("aj.e")
    public String field1141 = "";

    @ObfuscatedName("aj.h")
    public int field1142 = -1;

    @ObfuscatedName("aj.l")
    public int field1144 = 0;

    @ObfuscatedName("aa.a(Lfu;Lfu;Lfu;I)V")
    public static void method681(class171 arg0, class171 arg1, class171 arg2) {
        Statics.field1135 = arg0;
        Statics.field1125 = arg1;
        Statics.field1126 = arg2;
    }

    @ObfuscatedName("y.d(II)Laj;")
    public static class52 method219(int arg0) {
        class52 var1 = (class52) field1127.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1135.method3117(32, arg0);
        class52 var3 = new class52();
        if (var2 != null) {
            var3.method1064(new class123(var2));
        }
        field1127.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.v(Ldb;B)V")
    public void method1064(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method1054(arg0, var2);
        }
    }

    @ObfuscatedName("aj.r(Ldb;II)V")
    public void method1054(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1131 = arg0.method2410();
        } else if (arg1 == 2) {
            this.field1143 = arg0.method2399();
        } else if (arg1 == 3) {
            this.field1124 = arg0.method2410();
        } else if (arg1 == 4) {
            this.field1136 = arg0.method2410();
        } else if (arg1 == 5) {
            this.field1134 = arg0.method2410();
        } else if (arg1 == 6) {
            this.field1132 = arg0.method2410();
        } else if (arg1 == 7) {
            this.field1138 = arg0.method2485();
        } else if (arg1 == 8) {
            this.field1141 = arg0.method2398();
        } else if (arg1 == 9) {
            this.field1133 = arg0.method2584();
        } else if (arg1 == 10) {
            this.field1139 = arg0.method2485();
        } else if (arg1 == 11) {
            this.field1140 = 0;
        } else if (arg1 == 12) {
            this.field1142 = arg0.method2395();
        } else if (arg1 == 13) {
            this.field1144 = arg0.method2485();
        } else if (arg1 == 14) {
            this.field1140 = arg0.method2584();
        }
    }

    @ObfuscatedName("aj.z(II)Ljava/lang/String;")
    public String method1029(int arg0) {
        String var2 = this.field1141;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class167.method594(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("aj.t(B)Lcr;")
    public class82 method1028() {
        if (this.field1124 < 0) {
            return null;
        }
        class82 var1 = (class82) field1128.method3544((long) this.field1124);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method560(Statics.field1125, this.field1124, 0);
        if (var2 != null) {
            field1128.method3546(var2, (long) this.field1124);
        }
        return var2;
    }

    @ObfuscatedName("aj.n(I)Lcr;")
    public class82 method1031() {
        if (this.field1134 < 0) {
            return null;
        }
        class82 var1 = (class82) field1128.method3544((long) this.field1134);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method560(Statics.field1125, this.field1134, 0);
        if (var2 != null) {
            field1128.method3546(var2, (long) this.field1134);
        }
        return var2;
    }

    @ObfuscatedName("aj.i(I)Lcr;")
    public class82 method1035() {
        if (this.field1136 < 0) {
            return null;
        }
        class82 var1 = (class82) field1128.method3544((long) this.field1136);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method560(Statics.field1125, this.field1136, 0);
        if (var2 != null) {
            field1128.method3546(var2, (long) this.field1136);
        }
        return var2;
    }

    @ObfuscatedName("aj.g(I)Lcr;")
    public class82 method1033() {
        if (this.field1132 < 0) {
            return null;
        }
        class82 var1 = (class82) field1128.method3544((long) this.field1132);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method560(Statics.field1125, this.field1132, 0);
        if (var2 != null) {
            field1128.method3546(var2, (long) this.field1132);
        }
        return var2;
    }

    @ObfuscatedName("aj.m(I)Lhy;")
    public class228 method1034() {
        if (this.field1131 == -1) {
            return null;
        }
        class228 var1 = (class228) field1129.method3544((long) this.field1131);
        if (var1 != null) {
            return var1;
        }
        class171 var2 = Statics.field1125;
        class171 var3 = Statics.field1126;
        int var4 = this.field1131;
        class228 var5;
        if (class80.method2684(var2, var4, 0)) {
            byte[] var6 = var3.method3117(var4, 0);
            class228 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class228 var8 = new class228(var6, Statics.field1463, Statics.field1459, Statics.field1269, Statics.field1462, Statics.field2127, Statics.field140);
                class80.method736();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field1129.method3546(var5, (long) this.field1131);
        }
        return var5;
    }

    @ObfuscatedName("i.k(I)V")
    public static void method107() {
        field1127.method3552();
        field1128.method3552();
        field1129.method3552();
    }
}
