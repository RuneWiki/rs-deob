package deob;

@ObfuscatedName("ka")
public class class293 extends class346 {

    @ObfuscatedName("ka.o")
    public static class199 field3559 = new class199(64);

    @ObfuscatedName("ka.u")
    public class360 field3561;

    @ObfuscatedName("gc.f(II)Lka;")
    public static class293 method3426(int arg0) {
        class293 var1 = (class293) field3559.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3560.method3933(34, arg0);
        class293 var3 = new class293();
        if (var2 != null) {
            var3.method4550(new class382(var2));
        }
        var3.method4533();
        field3559.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ka.o(I)V")
    public void method4533() {
    }

    @ObfuscatedName("ka.u(Lnu;I)V")
    public void method4550(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4534(arg0, var2);
        }
    }

    @ObfuscatedName("ka.p(Lnu;II)V")
    public void method4534(class382 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3561 = class284.method1975(arg0, this.field3561);
        }
    }

    @ObfuscatedName("ka.b(III)I")
    public int method4557(int arg0, int arg1) {
        class360 var3 = this.field3561;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class350 var5 = (class350) var3.method5621((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3940;
            }
        }
        return var4;
    }

    @ObfuscatedName("ka.e(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4536(int arg0, String arg1) {
        return class284.method549(this.field3561, arg0, arg1);
    }

    @ObfuscatedName("kz.k(I)V")
    public static void method4523() {
        field3559.method3392();
    }
}
