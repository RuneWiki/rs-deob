package deob;

@ObfuscatedName("az")
public class class50 extends class208 {

    @ObfuscatedName("az.e")
    public static class197 field1089 = new class197(64);

    @ObfuscatedName("az.o")
    public static class197 field1099 = new class197(64);

    @ObfuscatedName("az.g")
    public int field1091;

    @ObfuscatedName("az.r")
    public int field1092 = 255;

    @ObfuscatedName("az.x")
    public int field1093 = 255;

    @ObfuscatedName("az.k")
    public int field1101 = -1;

    @ObfuscatedName("az.v")
    public int field1102 = 1;

    @ObfuscatedName("az.h")
    public int field1096 = 70;

    @ObfuscatedName("az.u")
    public int field1097 = -1;

    @ObfuscatedName("az.y")
    public int field1098 = -1;

    @ObfuscatedName("az.p")
    public int field1103 = 30;

    @ObfuscatedName("y.m(Lfa;Lfa;B)V")
    public static void method148(class171 arg0, class171 arg1) {
        Statics.field1090 = arg0;
        Statics.field1104 = arg1;
    }

    @ObfuscatedName("fq.w(II)Laz;")
    public static class50 method3215(int arg0) {
        class50 var1 = (class50) field1089.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1090.method3086(33, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method986(new class123(var2));
        }
        field1089.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.e(Ldj;B)V")
    public void method986(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method997(arg0, var2);
        }
    }

    @ObfuscatedName("az.o(Ldj;IB)V")
    public void method997(class123 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2548();
        } else if (arg1 == 2) {
            this.field1092 = arg0.method2398();
        } else if (arg1 == 3) {
            this.field1093 = arg0.method2398();
        } else if (arg1 == 4) {
            this.field1101 = 0;
        } else if (arg1 == 5) {
            this.field1096 = arg0.method2548();
        } else if (arg1 == 6) {
            arg0.method2398();
        } else if (arg1 == 7) {
            this.field1097 = arg0.method2428();
        } else if (arg1 == 8) {
            this.field1098 = arg0.method2428();
        } else if (arg1 == 11) {
            this.field1101 = arg0.method2548();
        } else if (arg1 == 14) {
            this.field1103 = arg0.method2398();
        }
    }

    @ObfuscatedName("az.g(I)Lcz;")
    public class82 method998() {
        if (this.field1097 < 0) {
            return null;
        }
        class82 var1 = (class82) field1099.method3556((long) this.field1097);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method3014(Statics.field1104, this.field1097, 0);
        if (var2 != null) {
            field1099.method3562(var2, (long) this.field1097);
        }
        return var2;
    }

    @ObfuscatedName("az.l(I)Lcz;")
    public class82 method989() {
        if (this.field1098 < 0) {
            return null;
        }
        class82 var1 = (class82) field1099.method3556((long) this.field1098);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method3014(Statics.field1104, this.field1098, 0);
        if (var2 != null) {
            field1099.method3562(var2, (long) this.field1098);
        }
        return var2;
    }

    @ObfuscatedName("af.j(I)V")
    public static void method730() {
        field1089.method3553();
        field1099.method3553();
    }
}
