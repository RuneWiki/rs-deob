package deob;

@ObfuscatedName("ah")
public class class50 extends class208 {

    @ObfuscatedName("ah.f")
    public static class197 field1087 = new class197(64);

    @ObfuscatedName("ah.c")
    public static class197 field1091 = new class197(64);

    @ObfuscatedName("ah.v")
    public int field1089;

    @ObfuscatedName("ah.y")
    public int field1100 = 255;

    @ObfuscatedName("ah.u")
    public int field1092 = 255;

    @ObfuscatedName("ah.h")
    public int field1093 = -1;

    @ObfuscatedName("ah.l")
    public int field1094 = 1;

    @ObfuscatedName("ah.b")
    public int field1095 = 70;

    @ObfuscatedName("ah.g")
    public int field1098 = -1;

    @ObfuscatedName("ah.e")
    public int field1085 = -1;

    @ObfuscatedName("ah.p")
    public int field1099 = 30;

    @ObfuscatedName("ah.s")
    public int field1097 = 0;

    @ObfuscatedName("eu.k(Lfo;Lfo;B)V")
    public static void method2968(class171 arg0, class171 arg1) {
        Statics.field1088 = arg0;
        Statics.field1086 = arg1;
    }

    @ObfuscatedName("ed.q(IS)Lah;")
    public static class50 method2725(int arg0) {
        class50 var1 = (class50) field1087.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1088.method3097(33, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method973(new class123(var2));
        }
        field1087.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.f(Lde;I)V")
    public void method973(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method974(arg0, var2);
        }
    }

    @ObfuscatedName("ah.c(Lde;II)V")
    public void method974(class123 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2547();
        } else if (arg1 == 2) {
            this.field1100 = arg0.method2427();
        } else if (arg1 == 3) {
            this.field1092 = arg0.method2427();
        } else if (arg1 == 4) {
            this.field1093 = 0;
        } else if (arg1 == 5) {
            this.field1095 = arg0.method2547();
        } else if (arg1 == 6) {
            arg0.method2427();
        } else if (arg1 == 7) {
            this.field1098 = arg0.method2423();
        } else if (arg1 == 8) {
            this.field1085 = arg0.method2423();
        } else if (arg1 == 11) {
            this.field1093 = arg0.method2547();
        } else if (arg1 == 14) {
            this.field1099 = arg0.method2427();
        } else if (arg1 == 15) {
            this.field1097 = arg0.method2427();
        }
    }

    @ObfuscatedName("ah.v(B)Lcn;")
    public class82 method994() {
        if (this.field1098 < 0) {
            return null;
        }
        class82 var1 = (class82) field1091.method3535((long) this.field1098);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method419(Statics.field1086, this.field1098, 0);
        if (var2 != null) {
            field1091.method3537(var2, (long) this.field1098);
        }
        return var2;
    }

    @ObfuscatedName("ah.j(I)Lcn;")
    public class82 method976() {
        if (this.field1085 < 0) {
            return null;
        }
        class82 var1 = (class82) field1091.method3535((long) this.field1085);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method419(Statics.field1086, this.field1085, 0);
        if (var2 != null) {
            field1091.method3537(var2, (long) this.field1085);
        }
        return var2;
    }
}
