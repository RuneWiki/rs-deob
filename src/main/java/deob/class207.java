package deob;

@ObfuscatedName("gz")
public final class class207 {

    @ObfuscatedName("gz.c")
    public class219 field2615 = new class219();

    public class207() {
        this.field2615.field2649 = this.field2615;
        this.field2615.field2650 = this.field2615;
    }

    @ObfuscatedName("gz.c(Lhv;)V")
    public void method3587(class219 arg0) {
        if (arg0.field2650 != null) {
            arg0.method3747();
        }
        arg0.field2650 = this.field2615.field2650;
        arg0.field2649 = this.field2615;
        arg0.field2650.field2649 = arg0;
        arg0.field2649.field2650 = arg0;
    }

    @ObfuscatedName("gz.i(Lhv;)V")
    public void method3574(class219 arg0) {
        if (arg0.field2650 != null) {
            arg0.method3747();
        }
        arg0.field2650 = this.field2615;
        arg0.field2649 = this.field2615.field2649;
        arg0.field2650.field2649 = arg0;
        arg0.field2649.field2650 = arg0;
    }

    @ObfuscatedName("gz.o(Lhv;Lhv;)V")
    public static void method3575(class219 arg0, class219 arg1) {
        if (arg0.field2650 != null) {
            arg0.method3747();
        }
        arg0.field2650 = arg1;
        arg0.field2649 = arg1.field2649;
        arg0.field2650.field2649 = arg0;
        arg0.field2649.field2650 = arg0;
    }

    @ObfuscatedName("gz.j()Lhv;")
    public class219 method3576() {
        class219 var1 = this.field2615.field2649;
        if (this.field2615 == var1) {
            return null;
        } else {
            var1.method3747();
            return var1;
        }
    }

    @ObfuscatedName("gz.k()Lhv;")
    public class219 method3577() {
        class219 var1 = this.field2615.field2649;
        return this.field2615 == var1 ? null : var1;
    }

    @ObfuscatedName("gz.x()V")
    public void method3578() {
        while (true) {
            class219 var1 = this.field2615.field2649;
            if (this.field2615 == var1) {
                return;
            }
            var1.method3747();
        }
    }
}
