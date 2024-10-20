package deob;

@ObfuscatedName("at")
public class class52 extends class208 {

    @ObfuscatedName("at.g")
    public static class197 field1109 = new class197(64);

    @ObfuscatedName("at.n")
    public static class197 field1111 = new class197(64);

    @ObfuscatedName("at.u")
    public static class197 field1107 = new class197(20);

    @ObfuscatedName("at.s")
    public int field1124 = -1;

    @ObfuscatedName("at.p")
    public int field1112 = 16777215;

    @ObfuscatedName("at.v")
    public int field1113 = 70;

    @ObfuscatedName("at.r")
    public int field1114 = -1;

    @ObfuscatedName("at.c")
    public int field1115 = -1;

    @ObfuscatedName("at.w")
    public int field1121 = -1;

    @ObfuscatedName("at.x")
    public int field1117 = -1;

    @ObfuscatedName("at.k")
    public int field1118 = 0;

    @ObfuscatedName("at.z")
    public int field1119 = 0;

    @ObfuscatedName("at.q")
    public int field1120 = -1;

    @ObfuscatedName("at.o")
    public String field1106 = "";

    @ObfuscatedName("at.f")
    public int field1122 = -1;

    @ObfuscatedName("at.b")
    public int field1123 = 0;

    @ObfuscatedName("at.t")
    public int[] field1105;

    @ObfuscatedName("at.a")
    public int field1125 = -1;

    @ObfuscatedName("at.am")
    public int field1126 = -1;

    @ObfuscatedName("fn.i(II)Lat;")
    public static class52 method3277(int arg0) {
        class52 var1 = (class52) field1109.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1128.method3086(32, arg0);
        class52 var3 = new class52();
        if (var2 != null) {
            var3.method1001(new class123(var2));
        }
        field1109.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.h(Ldn;B)V")
    public void method1001(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method1017(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldn;IB)V")
    public void method1017(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1124 = arg0.method2477();
        } else if (arg1 == 2) {
            this.field1112 = arg0.method2408();
        } else if (arg1 == 3) {
            this.field1114 = arg0.method2477();
        } else if (arg1 == 4) {
            this.field1121 = arg0.method2477();
        } else if (arg1 == 5) {
            this.field1115 = arg0.method2477();
        } else if (arg1 == 6) {
            this.field1117 = arg0.method2477();
        } else if (arg1 == 7) {
            this.field1118 = arg0.method2407();
        } else if (arg1 == 8) {
            this.field1106 = arg0.method2413();
        } else if (arg1 == 9) {
            this.field1113 = arg0.method2406();
        } else if (arg1 == 10) {
            this.field1119 = arg0.method2407();
        } else if (arg1 == 11) {
            this.field1120 = 0;
        } else if (arg1 == 12) {
            this.field1122 = arg0.method2404();
        } else if (arg1 == 13) {
            this.field1123 = arg0.method2407();
        } else if (arg1 == 14) {
            this.field1120 = arg0.method2406();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field1125 = arg0.method2406();
            if (this.field1125 == 65535) {
                this.field1125 = -1;
            }
            this.field1126 = arg0.method2406();
            if (this.field1126 == 65535) {
                this.field1126 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2406();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2404();
            this.field1105 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field1105[var5] = arg0.method2406();
                if (this.field1105[var5] == 65535) {
                    this.field1105[var5] = -1;
                }
            }
            this.field1105[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("at.g(S)Lat;")
    public final class52 method1003() {
        int var1 = -1;
        if (this.field1125 != -1) {
            var1 = class180.method123(this.field1125);
        } else if (this.field1126 != -1) {
            var1 = class180.field2955[this.field1126];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1105.length - 1) {
            var2 = this.field1105[var1];
        } else {
            var2 = this.field1105[this.field1105.length - 1];
        }
        return var2 == -1 ? null : method3277(var2);
    }

    @ObfuscatedName("at.n(II)Ljava/lang/String;")
    public String method1004(int arg0) {
        String var2 = this.field1106;
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

    @ObfuscatedName("at.u(B)Lcm;")
    public class82 method1005() {
        if (this.field1114 < 0) {
            return null;
        }
        class82 var1 = (class82) field1111.method3541((long) this.field1114);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method14(Statics.field1116, this.field1114, 0);
        if (var2 != null) {
            field1111.method3532(var2, (long) this.field1114);
        }
        return var2;
    }

    @ObfuscatedName("at.d(I)Lcm;")
    public class82 method1006() {
        if (this.field1115 < 0) {
            return null;
        }
        class82 var1 = (class82) field1111.method3541((long) this.field1115);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method14(Statics.field1116, this.field1115, 0);
        if (var2 != null) {
            field1111.method3532(var2, (long) this.field1115);
        }
        return var2;
    }

    @ObfuscatedName("at.l(I)Lcm;")
    public class82 method1007() {
        if (this.field1121 < 0) {
            return null;
        }
        class82 var1 = (class82) field1111.method3541((long) this.field1121);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method14(Statics.field1116, this.field1121, 0);
        if (var2 != null) {
            field1111.method3532(var2, (long) this.field1121);
        }
        return var2;
    }

    @ObfuscatedName("at.m(I)Lcm;")
    public class82 method1008() {
        if (this.field1117 < 0) {
            return null;
        }
        class82 var1 = (class82) field1111.method3541((long) this.field1117);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method14(Statics.field1116, this.field1117, 0);
        if (var2 != null) {
            field1111.method3532(var2, (long) this.field1117);
        }
        return var2;
    }

    @ObfuscatedName("at.j(B)Lhe;")
    public class228 method1025() {
        if (this.field1124 == -1) {
            return null;
        }
        class228 var1 = (class228) field1107.method3541((long) this.field1124);
        if (var1 != null) {
            return var1;
        }
        class228 var2 = class80.method966(Statics.field1116, Statics.field1103, this.field1124, 0);
        if (var2 != null) {
            field1107.method3532(var2, (long) this.field1124);
        }
        return var2;
    }
}
