package deob;

@ObfuscatedName("av")
public class class50 extends class208 {

    @ObfuscatedName("av.e")
    public static class197 field1092 = new class197(64);

    @ObfuscatedName("av.g")
    public static class197 field1082 = new class197(64);

    @ObfuscatedName("av.n")
    public int field1091;

    @ObfuscatedName("av.l")
    public int field1084 = 255;

    @ObfuscatedName("av.m")
    public int field1085 = 255;

    @ObfuscatedName("av.j")
    public int field1087 = -1;

    @ObfuscatedName("av.y")
    public int field1080 = 1;

    @ObfuscatedName("av.s")
    public int field1088 = 70;

    @ObfuscatedName("av.p")
    public int field1089 = -1;

    @ObfuscatedName("av.v")
    public int field1090 = -1;

    @ObfuscatedName("av.r")
    public int field1086 = 30;

    @ObfuscatedName("av.c")
    public int field1081 = 0;

    @ObfuscatedName("ar.i(II)Lav;")
    public static class50 method733(int arg0) {
        class50 var1 = (class50) field1092.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1083.method3086(33, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method967(new class123(var2));
        }
        field1092.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.h(Ldn;B)V")
    public void method967(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method983(arg0, var2);
        }
    }

    @ObfuscatedName("av.e(Ldn;II)V")
    public void method983(class123 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2406();
        } else if (arg1 == 2) {
            this.field1084 = arg0.method2404();
        } else if (arg1 == 3) {
            this.field1085 = arg0.method2404();
        } else if (arg1 == 4) {
            this.field1087 = 0;
        } else if (arg1 == 5) {
            this.field1088 = arg0.method2406();
        } else if (arg1 == 6) {
            arg0.method2404();
        } else if (arg1 == 7) {
            this.field1089 = arg0.method2477();
        } else if (arg1 == 8) {
            this.field1090 = arg0.method2477();
        } else if (arg1 == 11) {
            this.field1087 = arg0.method2406();
        } else if (arg1 == 14) {
            this.field1086 = arg0.method2404();
        } else if (arg1 == 15) {
            this.field1081 = arg0.method2404();
        }
    }

    @ObfuscatedName("av.g(I)Lcm;")
    public class82 method969() {
        if (this.field1089 < 0) {
            return null;
        }
        class82 var1 = (class82) field1082.method3541((long) this.field1089);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method14(Statics.field2194, this.field1089, 0);
        if (var2 != null) {
            field1082.method3532(var2, (long) this.field1089);
        }
        return var2;
    }

    @ObfuscatedName("av.n(I)Lcm;")
    public class82 method970() {
        if (this.field1090 < 0) {
            return null;
        }
        class82 var1 = (class82) field1082.method3541((long) this.field1090);
        if (var1 != null) {
            return var1;
        }
        class82 var2 = class80.method14(Statics.field2194, this.field1090, 0);
        if (var2 != null) {
            field1082.method3532(var2, (long) this.field1090);
        }
        return var2;
    }

    @ObfuscatedName("by.u(I)V")
    public static void method1132() {
        field1092.method3533();
        field1082.method3533();
    }
}
