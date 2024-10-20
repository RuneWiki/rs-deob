package deob;

@ObfuscatedName("ae")
public class class52 extends class208 {

    @ObfuscatedName("ae.z")
    public static class197 field1098 = new class197(64);

    @ObfuscatedName("ae.i")
    public static class197 field1100 = new class197(64);

    @ObfuscatedName("ae.b")
    public static class197 field1101 = new class197(20);

    @ObfuscatedName("ae.v")
    public int field1104 = -1;

    @ObfuscatedName("ae.q")
    public int field1096 = 16777215;

    @ObfuscatedName("ae.t")
    public int field1107 = 70;

    @ObfuscatedName("ae.g")
    public int field1115 = -1;

    @ObfuscatedName("ae.s")
    public int field1109 = -1;

    @ObfuscatedName("ae.h")
    public int field1099 = -1;

    @ObfuscatedName("ae.u")
    public int field1110 = -1;

    @ObfuscatedName("ae.a")
    public int field1106 = 0;

    @ObfuscatedName("ae.e")
    public int field1117 = 0;

    @ObfuscatedName("ae.c")
    public int field1113 = -1;

    @ObfuscatedName("ae.n")
    public String field1114 = "";

    @ObfuscatedName("ae.y")
    public int field1108 = -1;

    @ObfuscatedName("ae.k")
    public int field1116 = 0;

    @ObfuscatedName("av.x(II)Lae;")
    public static class52 method921(int arg0) {
        class52 var1 = (class52) field1098.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1111.method3079(32, arg0);
        class52 var3 = new class52();
        if (var2 != null) {
            var3.method998(new class123(var2));
        }
        field1098.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.r(Ldp;B)V")
    public void method998(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method1005(arg0, var2);
        }
    }

    @ObfuscatedName("ae.j(Ldp;IB)V")
    public void method1005(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1104 = arg0.method2423();
        } else if (arg1 == 2) {
            this.field1096 = arg0.method2412();
        } else if (arg1 == 3) {
            this.field1115 = arg0.method2423();
        } else if (arg1 == 4) {
            this.field1099 = arg0.method2423();
        } else if (arg1 == 5) {
            this.field1109 = arg0.method2423();
        } else if (arg1 == 6) {
            this.field1110 = arg0.method2423();
        } else if (arg1 == 7) {
            this.field1106 = arg0.method2611();
        } else if (arg1 == 8) {
            this.field1114 = arg0.method2487();
        } else if (arg1 == 9) {
            this.field1107 = arg0.method2403();
        } else if (arg1 == 10) {
            this.field1117 = arg0.method2611();
        } else if (arg1 == 11) {
            this.field1113 = 0;
        } else if (arg1 == 12) {
            this.field1108 = arg0.method2408();
        } else if (arg1 == 13) {
            this.field1116 = arg0.method2611();
        } else if (arg1 == 14) {
            this.field1113 = arg0.method2403();
        }
    }

    @ObfuscatedName("ae.z(IB)Ljava/lang/String;")
    public String method1020(int arg0) {
        String var2 = this.field1114;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class167.method144(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("ae.i(B)Lcd;")
    public class82 method1004() {
        if (this.field1115 < 0) {
            return null;
        }
        class82 var1 = (class82) field1100.method3533((long) this.field1115);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method825(Statics.field1097, this.field1115, 0);
        if (var2 != null) {
            field1100.method3535(var2, (long) this.field1115);
        }
        return var2;
    }

    @ObfuscatedName("ae.b(I)Lcd;")
    public class82 method997() {
        if (this.field1109 < 0) {
            return null;
        }
        class82 var1 = (class82) field1100.method3533((long) this.field1109);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method825(Statics.field1097, this.field1109, 0);
        if (var2 != null) {
            field1100.method3535(var2, (long) this.field1109);
        }
        return var2;
    }

    @ObfuscatedName("ae.l(S)Lcd;")
    public class82 method1002() {
        if (this.field1099 < 0) {
            return null;
        }
        class82 var1 = (class82) field1100.method3533((long) this.field1099);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method825(Statics.field1097, this.field1099, 0);
        if (var2 != null) {
            field1100.method3535(var2, (long) this.field1099);
        }
        return var2;
    }

    @ObfuscatedName("ae.m(I)Lcd;")
    public class82 method1014() {
        if (this.field1110 < 0) {
            return null;
        }
        class82 var1 = (class82) field1100.method3533((long) this.field1110);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method825(Statics.field1097, this.field1110, 0);
        if (var2 != null) {
            field1100.method3535(var2, (long) this.field1110);
        }
        return var2;
    }

    @ObfuscatedName("ae.p(I)Lhy;")
    public class228 method1019() {
        if (this.field1104 == -1) {
            return null;
        }
        class228 var1 = (class228) field1101.method3533((long) this.field1104);
        if (var1 != null) {
            return var1;
        }
        class171 var2 = Statics.field1097;
        class171 var3 = Statics.field1105;
        int var4 = this.field1104;
        class228 var5;
        if (class80.method744(var2, var4, 0)) {
            var5 = class80.method2207(var3.method3079(var4, 0));
        } else {
            var5 = null;
        }
        if (var5 != null) {
            field1101.method3535(var5, (long) this.field1104);
        }
        return var5;
    }
}
