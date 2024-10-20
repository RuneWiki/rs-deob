package deob;

@ObfuscatedName("ae")
public class class52 extends class208 {

    @ObfuscatedName("ae.o")
    public static class197 field1142 = new class197(64);

    @ObfuscatedName("ae.g")
    public static class197 field1136 = new class197(64);

    @ObfuscatedName("ae.l")
    public static class197 field1124 = new class197(20);

    @ObfuscatedName("ae.h")
    public int field1137 = -1;

    @ObfuscatedName("ae.u")
    public int field1127 = 16777215;

    @ObfuscatedName("ae.y")
    public int field1128 = 70;

    @ObfuscatedName("ae.p")
    public int field1129 = -1;

    @ObfuscatedName("ae.s")
    public int field1130 = -1;

    @ObfuscatedName("ae.f")
    public int field1119 = -1;

    @ObfuscatedName("ae.i")
    public int field1132 = -1;

    @ObfuscatedName("ae.d")
    public int field1134 = 0;

    @ObfuscatedName("ae.t")
    public int field1122 = 0;

    @ObfuscatedName("ae.c")
    public int field1135 = -1;

    @ObfuscatedName("ae.z")
    public String field1133 = "";

    @ObfuscatedName("ae.n")
    public int field1123 = -1;

    @ObfuscatedName("ae.q")
    public int field1131 = 0;

    @ObfuscatedName("i.m(II)Lae;")
    public static class52 method176(int arg0) {
        class52 var1 = (class52) field1142.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1138.method3086(32, arg0);
        class52 var3 = new class52();
        if (var2 != null) {
            var3.method1028(new class123(var2));
        }
        field1142.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.w(Ldj;I)V")
    public void method1028(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method1043(arg0, var2);
        }
    }

    @ObfuscatedName("ae.e(Ldj;II)V")
    public void method1043(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1137 = arg0.method2428();
        } else if (arg1 == 2) {
            this.field1127 = arg0.method2418();
        } else if (arg1 == 3) {
            this.field1129 = arg0.method2428();
        } else if (arg1 == 4) {
            this.field1119 = arg0.method2428();
        } else if (arg1 == 5) {
            this.field1130 = arg0.method2428();
        } else if (arg1 == 6) {
            this.field1132 = arg0.method2428();
        } else if (arg1 == 7) {
            this.field1134 = arg0.method2417();
        } else if (arg1 == 8) {
            this.field1133 = arg0.method2423();
        } else if (arg1 == 9) {
            this.field1128 = arg0.method2548();
        } else if (arg1 == 10) {
            this.field1122 = arg0.method2417();
        } else if (arg1 == 11) {
            this.field1135 = 0;
        } else if (arg1 == 12) {
            this.field1123 = arg0.method2398();
        } else if (arg1 == 13) {
            this.field1131 = arg0.method2417();
        } else if (arg1 == 14) {
            this.field1135 = arg0.method2548();
        }
    }

    @ObfuscatedName("ae.o(II)Ljava/lang/String;")
    public String method1027(int arg0) {
        String var2 = this.field1133;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class167.method3343(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ae.g(B)Lcz;")
    public class82 method1029() {
        if (this.field1129 < 0) {
            return null;
        }
        class82 var1 = (class82) field1136.method3556((long) this.field1129);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method3014(Statics.field1126, this.field1129, 0);
        if (var2 != null) {
            field1136.method3562(var2, (long) this.field1129);
        }
        return var2;
    }

    @ObfuscatedName("ae.l(I)Lcz;")
    public class82 method1025() {
        if (this.field1130 < 0) {
            return null;
        }
        class82 var1 = (class82) field1136.method3556((long) this.field1130);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method3014(Statics.field1126, this.field1130, 0);
        if (var2 != null) {
            field1136.method3562(var2, (long) this.field1130);
        }
        return var2;
    }

    @ObfuscatedName("ae.j(I)Lcz;")
    public class82 method1030() {
        if (this.field1119 < 0) {
            return null;
        }
        class82 var1 = (class82) field1136.method3556((long) this.field1119);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method3014(Statics.field1126, this.field1119, 0);
        if (var2 != null) {
            field1136.method3562(var2, (long) this.field1119);
        }
        return var2;
    }

    @ObfuscatedName("ae.r(B)Lcz;")
    public class82 method1031() {
        if (this.field1132 < 0) {
            return null;
        }
        class82 var1 = (class82) field1136.method3556((long) this.field1132);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method3014(Statics.field1126, this.field1132, 0);
        if (var2 != null) {
            field1136.method3562(var2, (long) this.field1132);
        }
        return var2;
    }

    @ObfuscatedName("ae.x(S)Lhm;")
    public class228 method1056() {
        if (this.field1137 == -1) {
            return null;
        }
        class228 var1 = (class228) field1124.method3556((long) this.field1137);
        if (var1 != null) {
            return var1;
        }
        class228 var2 = Statics.method2864(Statics.field1126, Statics.field1121, this.field1137, 0);
        if (var2 != null) {
            field1124.method3562(var2, (long) this.field1137);
        }
        return var2;
    }

    @ObfuscatedName("t.k(I)V")
    public static void method188() {
        field1142.method3553();
        field1136.method3553();
        field1124.method3553();
    }
}
