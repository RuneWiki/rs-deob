package deob;

@ObfuscatedName("ic")
public class class259 extends class202 {

    @ObfuscatedName("ic.x")
    public static class197 field3456 = new class197(64);

    @ObfuscatedName("ic.k")
    public char field3457;

    @ObfuscatedName("ic.z")
    public int field3458;

    @ObfuscatedName("ic.v")
    public String field3459;

    @ObfuscatedName("ic.m")
    public boolean field3460 = true;

    @ObfuscatedName("hp.d(Lid;I)V")
    public static void method3813(class243 arg0) {
        Statics.field3455 = arg0;
    }

    @ObfuscatedName("bu.x(II)Lic;")
    public static class259 method1094(int arg0) {
        class259 var1 = (class259) field3456.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3455.method3935(11, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4249(new class181(var2));
        }
        var3.method4248();
        field3456.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.k(B)V")
    public void method4248() {
    }

    @ObfuscatedName("ic.z(Lfr;B)V")
    public void method4249(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4250(arg0, var2);
        }
    }

    @ObfuscatedName("ic.v(Lfr;II)V")
    public void method4250(class181 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3236();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class274.field3723[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3457 = var6;
        } else if (arg1 == 2) {
            this.field3458 = arg0.method3041();
        } else if (arg1 == 4) {
            this.field3460 = false;
        } else if (arg1 == 5) {
            this.field3459 = arg0.method3045();
        }
    }

    @ObfuscatedName("ic.m(B)Z")
    public boolean method4264() {
        return this.field3457 == 's';
    }

    @ObfuscatedName("fl.b(I)V")
    public static void method2958() {
        field3456.method3422();
    }
}
