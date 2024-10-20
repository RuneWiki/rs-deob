package deob;

@ObfuscatedName("ab")
public class class52 extends class208 {

    @ObfuscatedName("ab.t")
    public static class197 field1101 = new class197(64);

    @ObfuscatedName("ab.v")
    public static class197 field1120 = new class197(64);

    @ObfuscatedName("ab.b")
    public static class197 field1116 = new class197(20);

    @ObfuscatedName("ab.h")
    public int field1119 = -1;

    @ObfuscatedName("ab.i")
    public int field1105 = 16777215;

    @ObfuscatedName("ab.u")
    public int field1106 = 70;

    @ObfuscatedName("ab.x")
    public int field1107 = -1;

    @ObfuscatedName("ab.d")
    public int field1108 = -1;

    @ObfuscatedName("ab.o")
    public int field1109 = -1;

    @ObfuscatedName("ab.j")
    public int field1110 = -1;

    @ObfuscatedName("ab.q")
    public int field1122 = 0;

    @ObfuscatedName("ab.r")
    public int field1112 = 0;

    @ObfuscatedName("ab.a")
    public int field1113 = -1;

    @ObfuscatedName("ab.z")
    public String field1114 = "";

    @ObfuscatedName("ab.p")
    public int field1115 = -1;

    @ObfuscatedName("ab.y")
    public int field1099 = 0;

    @ObfuscatedName("ab.s")
    public int[] field1117;

    @ObfuscatedName("ab.g")
    public int field1118 = -1;

    @ObfuscatedName("ab.aj")
    public int field1102 = -1;

    @ObfuscatedName("an.f(Lfj;Lfj;Lfj;I)V")
    public static void method1005(class171 arg0, class171 arg1, class171 arg2) {
        Statics.field1103 = arg0;
        Statics.field1100 = arg1;
        Statics.field132 = arg2;
    }

    @ObfuscatedName("k.e(II)Lab;")
    public static class52 method93(int arg0) {
        class52 var1 = (class52) field1101.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1103.method3107(32, arg0);
        class52 var3 = new class52();
        if (var2 != null) {
            var3.method1012(new class123(var2));
        }
        field1101.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.n(Ldx;B)V")
    public void method1012(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method1013(arg0, var2);
        }
    }

    @ObfuscatedName("ab.t(Ldx;II)V")
    public void method1013(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1119 = arg0.method2502();
        } else if (arg1 == 2) {
            this.field1105 = arg0.method2403();
        } else if (arg1 == 3) {
            this.field1107 = arg0.method2502();
        } else if (arg1 == 4) {
            this.field1109 = arg0.method2502();
        } else if (arg1 == 5) {
            this.field1108 = arg0.method2502();
        } else if (arg1 == 6) {
            this.field1110 = arg0.method2502();
        } else if (arg1 == 7) {
            this.field1122 = arg0.method2499();
        } else if (arg1 == 8) {
            this.field1114 = arg0.method2383();
        } else if (arg1 == 9) {
            this.field1106 = arg0.method2401();
        } else if (arg1 == 10) {
            this.field1112 = arg0.method2499();
        } else if (arg1 == 11) {
            this.field1113 = 0;
        } else if (arg1 == 12) {
            this.field1115 = arg0.method2522();
        } else if (arg1 == 13) {
            this.field1099 = arg0.method2499();
        } else if (arg1 == 14) {
            this.field1113 = arg0.method2401();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1118 = arg0.method2401();
            if (this.field1118 == 65535) {
                this.field1118 = -1;
            }
            this.field1102 = arg0.method2401();
            if (this.field1102 == 65535) {
                this.field1102 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2401();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2522();
            this.field1117 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1117[var5] = arg0.method2401();
                if (this.field1117[var5] == 65535) {
                    this.field1117[var5] = -1;
                }
            }
            this.field1117[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ab.v(B)Lab;")
    public final class52 method1014() {
        int var1 = -1;
        if (this.field1118 != -1) {
            var1 = class180.method2322(this.field1118);
        } else if (this.field1102 != -1) {
            var1 = class180.field2941[this.field1102];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1117.length - 1) {
            var2 = this.field1117[var1];
        } else {
            var2 = this.field1117[this.field1117.length - 1];
        }
        return var2 == -1 ? null : method93(var2);
    }

    @ObfuscatedName("ab.b(II)Ljava/lang/String;")
    public String method1015(int arg0) {
        String var2 = this.field1114;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class167.method2998(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ab.m(I)Lcw;")
    public class82 method1040() {
        if (this.field1107 < 0) {
            return null;
        }
        class82 var1 = (class82) field1120.method3569((long) this.field1107);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method15(Statics.field1100, this.field1107, 0);
        if (var2 != null) {
            field1120.method3571(var2, (long) this.field1107);
        }
        return var2;
    }

    @ObfuscatedName("ab.k(I)Lcw;")
    public class82 method1017() {
        if (this.field1108 < 0) {
            return null;
        }
        class82 var1 = (class82) field1120.method3569((long) this.field1108);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method15(Statics.field1100, this.field1108, 0);
        if (var2 != null) {
            field1120.method3571(var2, (long) this.field1108);
        }
        return var2;
    }

    @ObfuscatedName("ab.c(I)Lcw;")
    public class82 method1038() {
        if (this.field1109 < 0) {
            return null;
        }
        class82 var1 = (class82) field1120.method3569((long) this.field1109);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method15(Statics.field1100, this.field1109, 0);
        if (var2 != null) {
            field1120.method3571(var2, (long) this.field1109);
        }
        return var2;
    }

    @ObfuscatedName("ab.w(B)Lcw;")
    public class82 method1019() {
        if (this.field1110 < 0) {
            return null;
        }
        class82 var1 = (class82) field1120.method3569((long) this.field1110);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method15(Statics.field1100, this.field1110, 0);
        if (var2 != null) {
            field1120.method3571(var2, (long) this.field1110);
        }
        return var2;
    }

    @ObfuscatedName("ab.l(B)Lhq;")
    public class228 method1020() {
        if (this.field1119 == -1) {
            return null;
        }
        class228 var1 = (class228) field1116.method3569((long) this.field1119);
        if (var1 != null) {
            return var1;
        }
        class228 var2 = class80.method1063(Statics.field1100, Statics.field132, this.field1119, 0);
        if (var2 != null) {
            field1116.method3571(var2, (long) this.field1119);
        }
        return var2;
    }
}
