package deob;

@ObfuscatedName("aa")
public class class52 extends class208 {

    @ObfuscatedName("aa.e")
    public static class197 field1129 = new class197(64);

    @ObfuscatedName("aa.h")
    public static class197 field1130 = new class197(64);

    @ObfuscatedName("aa.s")
    public static class197 field1139 = new class197(20);

    @ObfuscatedName("aa.q")
    public int field1132 = -1;

    @ObfuscatedName("aa.p")
    public int field1134 = 16777215;

    @ObfuscatedName("aa.w")
    public int field1136 = 70;

    @ObfuscatedName("aa.o")
    public int field1131 = -1;

    @ObfuscatedName("aa.d")
    public int field1138 = -1;

    @ObfuscatedName("aa.f")
    public int field1137 = -1;

    @ObfuscatedName("aa.z")
    public int field1140 = -1;

    @ObfuscatedName("aa.i")
    public int field1141 = 0;

    @ObfuscatedName("aa.v")
    public int field1151 = 0;

    @ObfuscatedName("aa.j")
    public int field1143 = -1;

    @ObfuscatedName("aa.x")
    public String field1144 = "";

    @ObfuscatedName("aa.t")
    public int field1145 = -1;

    @ObfuscatedName("aa.y")
    public int field1146 = 0;

    @ObfuscatedName("s.l(IB)Laa;")
    public static class52 method53(int arg0) {
        class52 var1 = (class52) field1129.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1135.method3210(32, arg0);
        class52 var3 = new class52();
        if (var2 != null) {
            var3.method1054(new class123(var2));
        }
        field1129.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.g(Ldc;I)V")
    public void method1054(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method1055(arg0, var2);
        }
    }

    @ObfuscatedName("aa.r(Ldc;II)V")
    public void method1055(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1132 = arg0.method2555();
        } else if (arg1 == 2) {
            this.field1134 = arg0.method2494();
        } else if (arg1 == 3) {
            this.field1131 = arg0.method2555();
        } else if (arg1 == 4) {
            this.field1137 = arg0.method2555();
        } else if (arg1 == 5) {
            this.field1138 = arg0.method2555();
        } else if (arg1 == 6) {
            this.field1140 = arg0.method2555();
        } else if (arg1 == 7) {
            this.field1141 = arg0.method2493();
        } else if (arg1 == 8) {
            this.field1144 = arg0.method2499();
        } else if (arg1 == 9) {
            this.field1136 = arg0.method2492();
        } else if (arg1 == 10) {
            this.field1151 = arg0.method2493();
        } else if (arg1 == 11) {
            this.field1143 = 0;
        } else if (arg1 == 12) {
            this.field1145 = arg0.method2490();
        } else if (arg1 == 13) {
            this.field1146 = arg0.method2493();
        } else if (arg1 == 14) {
            this.field1143 = arg0.method2492();
        }
    }

    @ObfuscatedName("aa.e(IB)Ljava/lang/String;")
    public String method1056(int arg0) {
        String var2 = this.field1144;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class167.method576(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("aa.h(I)Lcl;")
    public class82 method1074() {
        if (this.field1131 < 0) {
            return null;
        }
        class82 var1 = (class82) field1130.method3653((long) this.field1131);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method684(Statics.field1128, this.field1131, 0);
        if (var2 != null) {
            field1130.method3655(var2, (long) this.field1131);
        }
        return var2;
    }

    @ObfuscatedName("aa.s(I)Lcl;")
    public class82 method1076() {
        if (this.field1138 < 0) {
            return null;
        }
        class82 var1 = (class82) field1130.method3653((long) this.field1138);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method684(Statics.field1128, this.field1138, 0);
        if (var2 != null) {
            field1130.method3655(var2, (long) this.field1138);
        }
        return var2;
    }

    @ObfuscatedName("aa.k(B)Lcl;")
    public class82 method1059() {
        if (this.field1137 < 0) {
            return null;
        }
        class82 var1 = (class82) field1130.method3653((long) this.field1137);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method684(Statics.field1128, this.field1137, 0);
        if (var2 != null) {
            field1130.method3655(var2, (long) this.field1137);
        }
        return var2;
    }

    @ObfuscatedName("aa.u(B)Lcl;")
    public class82 method1060() {
        if (this.field1140 < 0) {
            return null;
        }
        class82 var1 = (class82) field1130.method3653((long) this.field1140);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method684(Statics.field1128, this.field1140, 0);
        if (var2 != null) {
            field1130.method3655(var2, (long) this.field1140);
        }
        return var2;
    }

    @ObfuscatedName("aa.n(I)Lhc;")
    public class228 method1069() {
        if (this.field1132 == -1) {
            return null;
        }
        class228 var1 = (class228) field1139.method3653((long) this.field1132);
        if (var1 != null) {
            return var1;
        }
        class171 var2 = Statics.field1128;
        class171 var3 = Statics.field3227;
        int var4 = this.field1132;
        class228 var5;
        if (class80.method50(var2, var4, 0)) {
            byte[] var6 = var3.method3210(var4, 0);
            class228 var7;
            if (var6 == null) {
                var7 = null;
            } else {
                class228 var8 = new class228(var6, Statics.field1458, Statics.field2963, Statics.field3107, Statics.field1459, Statics.field1460, Statics.field2237);
                Statics.method1157();
                var7 = var8;
            }
            var5 = var7;
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field1139.method3655(var5, (long) this.field1132);
        }
        return var5;
    }

    @ObfuscatedName("dw.b(I)V")
    public static void method2349() {
        field1129.method3658();
        field1130.method3658();
        field1139.method3658();
    }
}
