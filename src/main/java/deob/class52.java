package deob;

@ObfuscatedName("ab")
public class class52 extends class208 {

    @ObfuscatedName("ab.c")
    public static class197 field1113 = new class197(64);

    @ObfuscatedName("ab.v")
    public static class197 field1121 = new class197(64);

    @ObfuscatedName("ab.j")
    public static class197 field1117 = new class197(20);

    @ObfuscatedName("ab.b")
    public int field1120 = -1;

    @ObfuscatedName("ab.g")
    public int field1129 = 16777215;

    @ObfuscatedName("ab.e")
    public int field1122 = 70;

    @ObfuscatedName("ab.p")
    public int field1115 = -1;

    @ObfuscatedName("ab.s")
    public int field1124 = -1;

    @ObfuscatedName("ab.w")
    public int field1125 = -1;

    @ObfuscatedName("ab.i")
    public int field1126 = -1;

    @ObfuscatedName("ab.r")
    public int field1127 = 0;

    @ObfuscatedName("ab.a")
    public int field1130 = 0;

    @ObfuscatedName("ab.n")
    public int field1128 = -1;

    @ObfuscatedName("ab.z")
    public String field1118 = "";

    @ObfuscatedName("ab.x")
    public int field1131 = -1;

    @ObfuscatedName("ab.d")
    public int field1132 = 0;

    @ObfuscatedName("ab.t")
    public int[] field1133;

    @ObfuscatedName("ab.o")
    public int field1134 = -1;

    @ObfuscatedName("ab.aq")
    public int field1135 = -1;

    @ObfuscatedName("df.k(Lfo;Lfo;Lfo;I)V")
    public static void method2221(class171 arg0, class171 arg1, class171 arg2) {
        Statics.field1116 = arg0;
        Statics.field2962 = arg1;
        Statics.field1114 = arg2;
    }

    @ObfuscatedName("af.q(II)Lab;")
    public static class52 method858(int arg0) {
        class52 var1 = (class52) field1113.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1116.method3097(32, arg0);
        class52 var3 = new class52();
        if (var2 != null) {
            var3.method1011(new class123(var2));
        }
        field1113.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.f(Lde;I)V")
    public void method1011(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method1030(arg0, var2);
        }
    }

    @ObfuscatedName("ab.c(Lde;IB)V")
    public void method1030(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1120 = arg0.method2423();
        } else if (arg1 == 2) {
            this.field1129 = arg0.method2431();
        } else if (arg1 == 3) {
            this.field1115 = arg0.method2423();
        } else if (arg1 == 4) {
            this.field1125 = arg0.method2423();
        } else if (arg1 == 5) {
            this.field1124 = arg0.method2423();
        } else if (arg1 == 6) {
            this.field1126 = arg0.method2423();
        } else if (arg1 == 7) {
            this.field1127 = arg0.method2430();
        } else if (arg1 == 8) {
            this.field1118 = arg0.method2436();
        } else if (arg1 == 9) {
            this.field1122 = arg0.method2547();
        } else if (arg1 == 10) {
            this.field1130 = arg0.method2430();
        } else if (arg1 == 11) {
            this.field1128 = 0;
        } else if (arg1 == 12) {
            this.field1131 = arg0.method2427();
        } else if (arg1 == 13) {
            this.field1132 = arg0.method2430();
        } else if (arg1 == 14) {
            this.field1128 = arg0.method2547();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1134 = arg0.method2547();
            if (this.field1134 == 65535) {
                this.field1134 = -1;
            }
            this.field1135 = arg0.method2547();
            if (this.field1135 == 65535) {
                this.field1135 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2547();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2427();
            this.field1133 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1133[var5] = arg0.method2547();
                if (this.field1133[var5] == 65535) {
                    this.field1133[var5] = -1;
                }
            }
            this.field1133[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("ab.v(I)Lab;")
    public final class52 method1013() {
        int var1 = -1;
        if (this.field1134 != -1) {
            var1 = class180.method3744(this.field1134);
        } else if (this.field1135 != -1) {
            var1 = class180.field2953[this.field1135];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1133.length - 1) {
            var2 = this.field1133[var1];
        } else {
            var2 = this.field1133[this.field1133.length - 1];
        }
        return var2 == -1 ? null : method858(var2);
    }

    @ObfuscatedName("ab.j(II)Ljava/lang/String;")
    public String method1031(int arg0) {
        String var2 = this.field1118;
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

    @ObfuscatedName("ab.m(B)Lcn;")
    public class82 method1015() {
        if (this.field1115 < 0) {
            return null;
        }
        class82 var1 = (class82) field1121.method3535((long) this.field1115);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method419(Statics.field2962, this.field1115, 0);
        if (var2 != null) {
            field1121.method3537(var2, (long) this.field1115);
        }
        return var2;
    }

    @ObfuscatedName("ab.y(I)Lcn;")
    public class82 method1023() {
        if (this.field1124 < 0) {
            return null;
        }
        class82 var1 = (class82) field1121.method3535((long) this.field1124);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method419(Statics.field2962, this.field1124, 0);
        if (var2 != null) {
            field1121.method3537(var2, (long) this.field1124);
        }
        return var2;
    }

    @ObfuscatedName("ab.u(I)Lcn;")
    public class82 method1017() {
        if (this.field1125 < 0) {
            return null;
        }
        class82 var1 = (class82) field1121.method3535((long) this.field1125);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method419(Statics.field2962, this.field1125, 0);
        if (var2 != null) {
            field1121.method3537(var2, (long) this.field1125);
        }
        return var2;
    }

    @ObfuscatedName("ab.h(I)Lcn;")
    public class82 method1018() {
        if (this.field1126 < 0) {
            return null;
        }
        class82 var1 = (class82) field1121.method3535((long) this.field1126);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method419(Statics.field2962, this.field1126, 0);
        if (var2 != null) {
            field1121.method3537(var2, (long) this.field1126);
        }
        return var2;
    }

    @ObfuscatedName("ab.l(I)Lhd;")
    public class228 method1022() {
        if (this.field1120 == -1) {
            return null;
        }
        class228 var1 = (class228) field1117.method3535((long) this.field1120);
        if (var1 != null) {
            return var1;
        }
        class228 var2 = class80.method3738(Statics.field2962, Statics.field1114, this.field1120, 0);
        if (var2 != null) {
            field1117.method3537(var2, (long) this.field1120);
        }
        return var2;
    }
}
