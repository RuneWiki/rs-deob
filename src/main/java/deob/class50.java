package deob;

@ObfuscatedName("as")
public class class50 extends class208 {

    @ObfuscatedName("as.t")
    public static class197 field1049 = new class197(64);

    @ObfuscatedName("as.y")
    public static class197 field1062 = new class197(64);

    @ObfuscatedName("as.p")
    public int field1048;

    @ObfuscatedName("as.f")
    public int field1053 = 255;

    @ObfuscatedName("as.k")
    public int field1054 = 255;

    @ObfuscatedName("as.h")
    public int field1059 = -1;

    @ObfuscatedName("as.r")
    public int field1056 = 1;

    @ObfuscatedName("as.w")
    public int field1057 = 70;

    @ObfuscatedName("as.u")
    public int field1058 = -1;

    @ObfuscatedName("as.n")
    public int field1061 = -1;

    @ObfuscatedName("as.d")
    public int field1060 = 30;

    @ObfuscatedName("as.a")
    public int field1051 = 0;

    @ObfuscatedName("e.z(II)Las;")
    public static class50 method584(int arg0) {
        class50 var1 = (class50) field1049.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1050.method3091(33, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method953(new class123(var2));
        }
        field1049.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.t(Ldy;I)V")
    public void method953(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method954(arg0, var2);
        }
    }

    @ObfuscatedName("as.y(Ldy;IB)V")
    public void method954(class123 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2550();
        } else if (arg1 == 2) {
            this.field1053 = arg0.method2363();
        } else if (arg1 == 3) {
            this.field1054 = arg0.method2363();
        } else if (arg1 == 4) {
            this.field1059 = 0;
        } else if (arg1 == 5) {
            this.field1057 = arg0.method2550();
        } else if (arg1 == 6) {
            arg0.method2363();
        } else if (arg1 == 7) {
            this.field1058 = arg0.method2378();
        } else if (arg1 == 8) {
            this.field1061 = arg0.method2378();
        } else if (arg1 == 11) {
            this.field1059 = arg0.method2550();
        } else if (arg1 == 14) {
            this.field1060 = arg0.method2363();
        } else if (arg1 == 15) {
            this.field1051 = arg0.method2363();
        }
    }

    @ObfuscatedName("as.p(B)Lca;")
    public class82 method966() {
        if (this.field1058 < 0) {
            return null;
        }
        class82 var1 = (class82) field1062.method3523((long) this.field1058);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2977(Statics.field1055, this.field1058, 0);
        if (var2 != null) {
            field1062.method3521(var2, (long) this.field1058);
        }
        return var2;
    }

    @ObfuscatedName("as.g(I)Lca;")
    public class82 method956() {
        if (this.field1061 < 0) {
            return null;
        }
        class82 var1 = (class82) field1062.method3523((long) this.field1061);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method2977(Statics.field1055, this.field1061, 0);
        if (var2 != null) {
            field1062.method3521(var2, (long) this.field1061);
        }
        return var2;
    }

    @ObfuscatedName("eo.m(I)V")
    public static void method2804() {
        field1049.method3522();
        field1062.method3522();
    }
}
