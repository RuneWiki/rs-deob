package deob;

@ObfuscatedName("jv")
public class class271 extends class214 {

    @ObfuscatedName("jv.h")
    public static class208 field3404 = new class208(64);

    @ObfuscatedName("jv.l")
    public class205 field3406;

    @ObfuscatedName("cl.n(Lij;B)V")
    public static void method2055(class254 arg0) {
        Statics.field3402 = arg0;
    }

    @ObfuscatedName("kd.h(II)Ljv;")
    public static class271 method5316(int arg0) {
        class271 var1 = (class271) field3404.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3402.method4494(34, arg0);
        class271 var3 = new class271();
        if (var2 != null) {
            var3.method4808(new class190(var2));
        }
        var3.method4807();
        field3404.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.l(I)V")
    public void method4807() {
    }

    @ObfuscatedName("jv.g(Lgc;B)V")
    public void method4808(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4789(arg0, var2);
        }
    }

    @ObfuscatedName("jv.b(Lgc;II)V")
    public void method4789(class190 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3406 = class268.method4601(arg0, this.field3406);
        }
    }

    @ObfuscatedName("jv.a(IIB)I")
    public int method4790(int arg0, int arg1) {
        class205 var3 = this.field3406;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3870((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2517;
            }
        }
        return var4;
    }

    @ObfuscatedName("jv.c(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4791(int arg0, String arg1) {
        class205 var3 = this.field3406;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class203 var5 = (class203) var3.method3870((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2473;
            }
        }
        return var4;
    }

    @ObfuscatedName("ce.z(I)V")
    public static void method1946() {
        field3404.method3899();
    }
}
