package deob;

@ObfuscatedName("ae")
public class class50 extends class208 {

    @ObfuscatedName("ae.v")
    public static class197 field1100 = new class197(64);

    @ObfuscatedName("ae.r")
    public static class197 field1094 = new class197(64);

    @ObfuscatedName("ae.z")
    public int field1095;

    @ObfuscatedName("ae.i")
    public int field1097 = 255;

    @ObfuscatedName("ae.g")
    public int field1092 = 255;

    @ObfuscatedName("ae.m")
    public int field1093 = -1;

    @ObfuscatedName("ae.k")
    public int field1096 = 1;

    @ObfuscatedName("ae.x")
    public int field1101 = 70;

    @ObfuscatedName("ae.u")
    public int field1102 = -1;

    @ObfuscatedName("ae.j")
    public int field1103 = -1;

    @ObfuscatedName("ae.q")
    public int field1104 = 30;

    @ObfuscatedName("ae.w")
    public int field1105 = 0;

    @ObfuscatedName("j.a(Lfu;Lfu;I)V")
    public static void method164(class171 arg0, class171 arg1) {
        Statics.field1099 = arg0;
        Statics.field1091 = arg1;
    }

    @ObfuscatedName("dv.d(II)Lae;")
    public static class50 method2274(int arg0) {
        class50 var1 = (class50) field1100.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1099.method3117(33, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method987(new class123(var2));
        }
        field1100.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.v(Ldb;I)V")
    public void method987(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method988(arg0, var2);
        }
    }

    @ObfuscatedName("ae.r(Ldb;II)V")
    public void method988(class123 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2584();
        } else if (arg1 == 2) {
            this.field1097 = arg0.method2395();
        } else if (arg1 == 3) {
            this.field1092 = arg0.method2395();
        } else if (arg1 == 4) {
            this.field1093 = 0;
        } else if (arg1 == 5) {
            this.field1101 = arg0.method2584();
        } else if (arg1 == 6) {
            arg0.method2395();
        } else if (arg1 == 7) {
            this.field1102 = arg0.method2410();
        } else if (arg1 == 8) {
            this.field1103 = arg0.method2410();
        } else if (arg1 == 11) {
            this.field1093 = arg0.method2584();
        } else if (arg1 == 14) {
            this.field1104 = arg0.method2395();
        } else if (arg1 == 15) {
            this.field1105 = arg0.method2395();
        }
    }

    @ObfuscatedName("ae.z(I)Lcr;")
    public class82 method1002() {
        if (this.field1102 < 0) {
            return null;
        }
        class82 var1 = (class82) field1094.method3544((long) this.field1102);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method560(Statics.field1091, this.field1102, 0);
        if (var2 != null) {
            field1094.method3546(var2, (long) this.field1102);
        }
        return var2;
    }

    @ObfuscatedName("ae.t(I)Lcr;")
    public class82 method990() {
        if (this.field1103 < 0) {
            return null;
        }
        class82 var1 = (class82) field1094.method3544((long) this.field1103);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method560(Statics.field1091, this.field1103, 0);
        if (var2 != null) {
            field1094.method3546(var2, (long) this.field1103);
        }
        return var2;
    }
}
