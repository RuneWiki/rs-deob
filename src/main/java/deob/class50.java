package deob;

@ObfuscatedName("al")
public class class50 extends class208 {

    @ObfuscatedName("al.j")
    public static class197 field1077 = new class197(64);

    @ObfuscatedName("al.z")
    public static class197 field1075 = new class197(64);

    @ObfuscatedName("al.i")
    public int field1076;

    @ObfuscatedName("al.m")
    public int field1082 = 255;

    @ObfuscatedName("al.p")
    public int field1078 = 255;

    @ObfuscatedName("al.f")
    public int field1074 = -1;

    @ObfuscatedName("al.d")
    public int field1080 = 1;

    @ObfuscatedName("al.v")
    public int field1081 = 70;

    @ObfuscatedName("al.q")
    public int field1072 = -1;

    @ObfuscatedName("al.t")
    public int field1083 = -1;

    @ObfuscatedName("al.g")
    public int field1084 = 30;

    @ObfuscatedName("al.s")
    public int field1085 = 0;

    @ObfuscatedName("ab.x(Lfp;Lfp;I)V")
    public static void method712(class171 arg0, class171 arg1) {
        Statics.field1079 = arg0;
        Statics.field1073 = arg1;
    }

    @ObfuscatedName("al.j(Ldp;I)V")
    public void method965(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method977(arg0, var2);
        }
    }

    @ObfuscatedName("al.z(Ldp;II)V")
    public void method977(class123 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2403();
        } else if (arg1 == 2) {
            this.field1082 = arg0.method2408();
        } else if (arg1 == 3) {
            this.field1078 = arg0.method2408();
        } else if (arg1 == 4) {
            this.field1074 = 0;
        } else if (arg1 == 5) {
            this.field1081 = arg0.method2403();
        } else if (arg1 == 6) {
            arg0.method2408();
        } else if (arg1 == 7) {
            this.field1072 = arg0.method2423();
        } else if (arg1 == 8) {
            this.field1083 = arg0.method2423();
        } else if (arg1 == 11) {
            this.field1074 = arg0.method2403();
        } else if (arg1 == 14) {
            this.field1084 = arg0.method2408();
        } else if (arg1 == 15) {
            this.field1085 = arg0.method2408();
        }
    }

    @ObfuscatedName("al.i(I)Lcd;")
    public class82 method979() {
        if (this.field1072 < 0) {
            return null;
        }
        class82 var1 = (class82) field1075.method3533((long) this.field1072);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method825(Statics.field1073, this.field1072, 0);
        if (var2 != null) {
            field1075.method3535(var2, (long) this.field1072);
        }
        return var2;
    }

    @ObfuscatedName("al.b(I)Lcd;")
    public class82 method964() {
        if (this.field1083 < 0) {
            return null;
        }
        class82 var1 = (class82) field1075.method3533((long) this.field1083);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method825(Statics.field1073, this.field1083, 0);
        if (var2 != null) {
            field1075.method3535(var2, (long) this.field1083);
        }
        return var2;
    }

    @ObfuscatedName("bg.l(I)V")
    public static void method1133() {
        field1077.method3534();
        field1075.method3534();
    }
}
