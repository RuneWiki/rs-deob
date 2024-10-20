package deob;

@ObfuscatedName("af")
public class class52 extends class208 {

    @ObfuscatedName("af.y")
    public static class197 field1077 = new class197(64);

    @ObfuscatedName("af.p")
    public static class197 field1084 = new class197(64);

    @ObfuscatedName("af.g")
    public static class197 field1079 = new class197(20);

    @ObfuscatedName("af.w")
    public int field1093 = -1;

    @ObfuscatedName("af.u")
    public int field1078 = 16777215;

    @ObfuscatedName("af.n")
    public int field1085 = 70;

    @ObfuscatedName("af.d")
    public int field1086 = -1;

    @ObfuscatedName("af.a")
    public int field1076 = -1;

    @ObfuscatedName("af.b")
    public int field1088 = -1;

    @ObfuscatedName("af.q")
    public int field1098 = -1;

    @ObfuscatedName("af.o")
    public int field1090 = 0;

    @ObfuscatedName("af.c")
    public int field1091 = 0;

    @ObfuscatedName("af.i")
    public int field1083 = -1;

    @ObfuscatedName("af.x")
    public String field1082 = "";

    @ObfuscatedName("af.v")
    public int field1094 = -1;

    @ObfuscatedName("af.l")
    public int field1095 = 0;

    @ObfuscatedName("af.e")
    public int[] field1096;

    @ObfuscatedName("af.j")
    public int field1097 = -1;

    @ObfuscatedName("af.ae")
    public int field1075 = -1;

    @ObfuscatedName("h.s(IB)Laf;")
    public static class52 method118(int arg0) {
        class52 var1 = (class52) field1077.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1102.method3091(32, arg0);
        class52 var3 = new class52();
        if (var2 != null) {
            var3.method988(new class123(var2));
        }
        field1077.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.z(Ldy;B)V")
    public void method988(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method989(arg0, var2);
        }
    }

    @ObfuscatedName("af.t(Ldy;II)V")
    public void method989(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1093 = arg0.method2378();
        } else if (arg1 == 2) {
            this.field1078 = arg0.method2367();
        } else if (arg1 == 3) {
            this.field1086 = arg0.method2378();
        } else if (arg1 == 4) {
            this.field1088 = arg0.method2378();
        } else if (arg1 == 5) {
            this.field1076 = arg0.method2378();
        } else if (arg1 == 6) {
            this.field1098 = arg0.method2378();
        } else if (arg1 == 7) {
            this.field1090 = arg0.method2356();
        } else if (arg1 == 8) {
            this.field1082 = arg0.method2372();
        } else if (arg1 == 9) {
            this.field1085 = arg0.method2550();
        } else if (arg1 == 10) {
            this.field1091 = arg0.method2356();
        } else if (arg1 == 11) {
            this.field1083 = 0;
        } else if (arg1 == 12) {
            this.field1094 = arg0.method2363();
        } else if (arg1 == 13) {
            this.field1095 = arg0.method2356();
        } else if (arg1 == 14) {
            this.field1083 = arg0.method2550();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1097 = arg0.method2550();
            if (this.field1097 == 65535) {
                this.field1097 = -1;
            }
            this.field1075 = arg0.method2550();
            if (this.field1075 == 65535) {
                this.field1075 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2550();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2363();
            this.field1096 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1096[var5] = arg0.method2550();
                if (this.field1096[var5] == 65535) {
                    this.field1096[var5] = -1;
                }
            }
            this.field1096[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("af.y(I)Laf;")
    public final class52 method990() {
        int var1 = -1;
        if (this.field1097 != -1) {
            var1 = class180.method3191(this.field1097);
        } else if (this.field1075 != -1) {
            var1 = class180.field2952[this.field1075];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1096.length - 1) {
            var2 = this.field1096[var1];
        } else {
            var2 = this.field1096[this.field1096.length - 1];
        }
        return var2 == -1 ? null : method118(var2);
    }

    @ObfuscatedName("af.p(IB)Ljava/lang/String;")
    public String method991(int arg0) {
        String var2 = this.field1082;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class167.method2806(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("af.g(I)Lca;")
    public class82 method992() {
        if (this.field1086 < 0) {
            return null;
        }
        class82 var1 = (class82) field1084.method3523((long) this.field1086);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2977(Statics.field1074, this.field1086, 0);
        if (var2 != null) {
            field1084.method3521(var2, (long) this.field1086);
        }
        return var2;
    }

    @ObfuscatedName("af.m(S)Lca;")
    public class82 method987() {
        if (this.field1076 < 0) {
            return null;
        }
        class82 var1 = (class82) field1084.method3523((long) this.field1076);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2977(Statics.field1074, this.field1076, 0);
        if (var2 != null) {
            field1084.method3521(var2, (long) this.field1076);
        }
        return var2;
    }

    @ObfuscatedName("af.f(I)Lca;")
    public class82 method994() {
        if (this.field1088 < 0) {
            return null;
        }
        class82 var1 = (class82) field1084.method3523((long) this.field1088);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2977(Statics.field1074, this.field1088, 0);
        if (var2 != null) {
            field1084.method3521(var2, (long) this.field1088);
        }
        return var2;
    }

    @ObfuscatedName("af.k(I)Lca;")
    public class82 method995() {
        if (this.field1098 < 0) {
            return null;
        }
        class82 var1 = (class82) field1084.method3523((long) this.field1098);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2977(Statics.field1074, this.field1098, 0);
        if (var2 != null) {
            field1084.method3521(var2, (long) this.field1098);
        }
        return var2;
    }

    @ObfuscatedName("af.h(B)Lhq;")
    public class228 method1015() {
        if (this.field1093 == -1) {
            return null;
        }
        class228 var1 = (class228) field1079.method3523((long) this.field1093);
        if (var1 != null) {
            return var1;
        }
        class171 var2 = Statics.field1074;
        class171 var3 = Statics.field1092;
        int var4 = this.field1093;
        class228 var5;
        if (class80.method722(var2, var4, 0)) {
            var5 = class80.method3512(var3.method3091(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field1079.method3521(var5, (long) this.field1093);
        }
        return var5;
    }
}
