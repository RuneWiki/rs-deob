package deob;

@ObfuscatedName("jc")
public class class270 extends class214 {

    @ObfuscatedName("jc.h")
    public static class208 field3401 = new class208(64);

    @ObfuscatedName("jc.l")
    public char field3397;

    @ObfuscatedName("jc.g")
    public int field3399;

    @ObfuscatedName("jc.b")
    public String field3400;

    @ObfuscatedName("jc.a")
    public boolean field3398 = true;

    @ObfuscatedName("c.n(IS)Ljc;")
    public static class270 method53(int arg0) {
        class270 var1 = (class270) field3401.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2660.method4494(11, arg0);
        class270 var3 = new class270();
        if (var2 != null) {
            var3.method4774(new class190(var2));
        }
        var3.method4767();
        field3401.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.h(I)V")
    public void method4767() {
    }

    @ObfuscatedName("jc.l(Lgc;I)V")
    public void method4774(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4769(arg0, var2);
        }
    }

    @ObfuscatedName("jc.g(Lgc;II)V")
    public void method4769(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3397 = class307.method1086(arg0.method3512());
        } else if (arg1 == 2) {
            this.field3399 = arg0.method3562();
        } else if (arg1 == 4) {
            this.field3398 = false;
        } else if (arg1 == 5) {
            this.field3400 = arg0.method3520();
        }
    }

    @ObfuscatedName("jc.b(I)Z")
    public boolean method4770() {
        return this.field3397 == 's';
    }

    @ObfuscatedName("cm.a(S)V")
    public static void method1866() {
        field3401.method3899();
    }
}
