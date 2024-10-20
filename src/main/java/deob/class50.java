package deob;

@ObfuscatedName("ad")
public class class50 extends class208 {

    @ObfuscatedName("ad.n")
    public static class197 field1087 = new class197(64);

    @ObfuscatedName("ad.t")
    public static class197 field1074 = new class197(64);

    @ObfuscatedName("ad.v")
    public int field1075;

    @ObfuscatedName("ad.k")
    public int field1077 = 255;

    @ObfuscatedName("ad.c")
    public int field1083 = 255;

    @ObfuscatedName("ad.w")
    public int field1079 = -1;

    @ObfuscatedName("ad.l")
    public int field1090 = 1;

    @ObfuscatedName("ad.h")
    public int field1085 = 70;

    @ObfuscatedName("ad.i")
    public int field1082 = -1;

    @ObfuscatedName("ad.u")
    public int field1080 = -1;

    @ObfuscatedName("ad.x")
    public int field1084 = 30;

    @ObfuscatedName("ad.d")
    public int field1073 = 0;

    @ObfuscatedName("ha.f(Lfj;Lfj;S)V")
    public static void method3777(class171 arg0, class171 arg1) {
        Statics.field1081 = arg0;
        Statics.field2026 = arg1;
    }

    @ObfuscatedName("f.e(II)Lad;")
    public static class50 method2(int arg0) {
        class50 var1 = (class50) field1087.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1081.method3107(33, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method964(new class123(var2));
        }
        field1087.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.n(Ldx;B)V")
    public void method964(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method965(arg0, var2);
        }
    }

    @ObfuscatedName("ad.t(Ldx;IS)V")
    public void method965(class123 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2401();
        } else if (arg1 == 2) {
            this.field1077 = arg0.method2522();
        } else if (arg1 == 3) {
            this.field1083 = arg0.method2522();
        } else if (arg1 == 4) {
            this.field1079 = 0;
        } else if (arg1 == 5) {
            this.field1085 = arg0.method2401();
        } else if (arg1 == 6) {
            arg0.method2522();
        } else if (arg1 == 7) {
            this.field1082 = arg0.method2502();
        } else if (arg1 == 8) {
            this.field1080 = arg0.method2502();
        } else if (arg1 == 11) {
            this.field1079 = arg0.method2401();
        } else if (arg1 == 14) {
            this.field1084 = arg0.method2522();
        } else if (arg1 == 15) {
            this.field1073 = arg0.method2522();
        }
    }

    @ObfuscatedName("ad.v(I)Lcw;")
    public class82 method966() {
        if (this.field1082 < 0) {
            return null;
        }
        class82 var1 = (class82) field1074.method3569((long) this.field1082);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method15(Statics.field2026, this.field1082, 0);
        if (var2 != null) {
            field1074.method3571(var2, (long) this.field1082);
        }
        return var2;
    }

    @ObfuscatedName("ad.b(I)Lcw;")
    public class82 method976() {
        if (this.field1080 < 0) {
            return null;
        }
        class82 var1 = (class82) field1074.method3569((long) this.field1080);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method15(Statics.field2026, this.field1080, 0);
        if (var2 != null) {
            field1074.method3571(var2, (long) this.field1080);
        }
        return var2;
    }
}
