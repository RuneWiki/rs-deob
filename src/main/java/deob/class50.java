package deob;

@ObfuscatedName("az")
public class class50 extends class208 {

    @ObfuscatedName("az.c")
    public static class197 field1098 = new class197(64);

    @ObfuscatedName("az.h")
    public static class197 field1099 = new class197(64);

    @ObfuscatedName("az.r")
    public int field1101;

    @ObfuscatedName("az.b")
    public int field1096 = 255;

    @ObfuscatedName("az.u")
    public int field1108 = 255;

    @ObfuscatedName("az.o")
    public int field1102 = -1;

    @ObfuscatedName("az.p")
    public int field1104 = 1;

    @ObfuscatedName("az.i")
    public int field1105 = 70;

    @ObfuscatedName("az.q")
    public int field1106 = -1;

    @ObfuscatedName("az.g")
    public int field1107 = -1;

    @ObfuscatedName("aq.e(IB)Laz;")
    public static class50 method773(int arg0) {
        class50 var1 = (class50) field1098.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1110.method3130(33, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method1019(new class123(var2));
        }
        field1098.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.l(Ldd;B)V")
    public void method1019(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method1032(arg0, var2);
        }
    }

    @ObfuscatedName("az.c(Ldd;II)V")
    public void method1032(class123 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2466();
        } else if (arg1 == 2) {
            this.field1096 = arg0.method2464();
        } else if (arg1 == 3) {
            this.field1108 = arg0.method2464();
        } else if (arg1 == 4) {
            this.field1102 = 0;
        } else if (arg1 == 5) {
            this.field1105 = arg0.method2466();
        } else if (arg1 == 6) {
            arg0.method2464();
        } else if (arg1 == 7) {
            this.field1106 = arg0.method2478();
        } else if (arg1 == 8) {
            this.field1107 = arg0.method2478();
        } else if (arg1 == 9) {
            arg0.method2478();
        } else if (arg1 == 10) {
            arg0.method2478();
        } else if (arg1 == 11) {
            this.field1102 = arg0.method2466();
        }
    }

    @ObfuscatedName("az.h(B)Lcf;")
    public class82 method1023() {
        if (this.field1106 < 0) {
            return null;
        }
        class82 var1 = (class82) field1099.method3589((long) this.field1106);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2387(Statics.field1097, this.field1106, 0);
        if (var2 != null) {
            field1099.method3591(var2, (long) this.field1106);
        }
        return var2;
    }

    @ObfuscatedName("az.r(I)Lcf;")
    public class82 method1022() {
        if (this.field1107 < 0) {
            return null;
        }
        class82 var1 = (class82) field1099.method3589((long) this.field1107);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2387(Statics.field1097, this.field1107, 0);
        if (var2 != null) {
            field1099.method3591(var2, (long) this.field1107);
        }
        return var2;
    }

    @ObfuscatedName("hv.a(I)V")
    public static void method3954() {
        field1098.method3590();
        field1099.method3590();
    }
}
