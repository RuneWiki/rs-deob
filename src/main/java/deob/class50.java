package deob;

@ObfuscatedName("al")
public class class50 extends class208 {

    @ObfuscatedName("al.r")
    public static class197 field1101 = new class197(64);

    @ObfuscatedName("al.e")
    public static class197 field1116 = new class197(64);

    @ObfuscatedName("al.h")
    public int field1103;

    @ObfuscatedName("al.u")
    public int field1105 = 255;

    @ObfuscatedName("al.n")
    public int field1106 = 255;

    @ObfuscatedName("al.b")
    public int field1112 = -1;

    @ObfuscatedName("al.m")
    public int field1108 = 1;

    @ObfuscatedName("al.q")
    public int field1109 = 70;

    @ObfuscatedName("al.p")
    public int field1110 = -1;

    @ObfuscatedName("al.w")
    public int field1113 = -1;

    @ObfuscatedName("al.o")
    public int field1111 = 30;

    @ObfuscatedName("j.l(Lfp;Lfp;B)V")
    public static void method563(class171 arg0, class171 arg1) {
        Statics.field1107 = arg0;
        Statics.field1102 = arg1;
    }

    @ObfuscatedName("al.g(Ldc;S)V")
    public void method1011(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method1012(arg0, var2);
        }
    }

    @ObfuscatedName("al.r(Ldc;II)V")
    public void method1012(class123 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2492();
        } else if (arg1 == 2) {
            this.field1105 = arg0.method2490();
        } else if (arg1 == 3) {
            this.field1106 = arg0.method2490();
        } else if (arg1 == 4) {
            this.field1112 = 0;
        } else if (arg1 == 5) {
            this.field1109 = arg0.method2492();
        } else if (arg1 == 6) {
            arg0.method2490();
        } else if (arg1 == 7) {
            this.field1110 = arg0.method2555();
        } else if (arg1 == 8) {
            this.field1113 = arg0.method2555();
        } else if (arg1 == 11) {
            this.field1112 = arg0.method2492();
        } else if (arg1 == 14) {
            this.field1111 = arg0.method2490();
        }
    }

    @ObfuscatedName("al.e(B)Lcl;")
    public class82 method1028() {
        if (this.field1110 < 0) {
            return null;
        }
        class82 var1 = (class82) field1116.method3653((long) this.field1110);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method684(Statics.field1102, this.field1110, 0);
        if (var2 != null) {
            field1116.method3655(var2, (long) this.field1110);
        }
        return var2;
    }

    @ObfuscatedName("al.h(I)Lcl;")
    public class82 method1014() {
        if (this.field1113 < 0) {
            return null;
        }
        class82 var1 = (class82) field1116.method3653((long) this.field1113);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method684(Statics.field1102, this.field1113, 0);
        if (var2 != null) {
            field1116.method3655(var2, (long) this.field1113);
        }
        return var2;
    }

    @ObfuscatedName("ad.s(I)V")
    public static void method623() {
        field1101.method3658();
        field1116.method3658();
    }
}
