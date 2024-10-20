package deob;

@ObfuscatedName("ga")
public final class class201 {

    @ObfuscatedName("ga.n")
    public class206 field2586 = new class206();

    @ObfuscatedName("ga.v")
    public int field2585;

    @ObfuscatedName("ga.y")
    public int field2584;

    @ObfuscatedName("ga.r")
    public class202 field2587;

    @ObfuscatedName("ga.h")
    public class196 field2588 = new class196();

    public class201(int arg0) {
        this.field2585 = arg0;
        this.field2584 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2587 = new class202(var2);
    }

    @ObfuscatedName("ga.n(J)Lgd;")
    public class206 method3407(long arg0) {
        class206 var3 = (class206) this.field2587.method3416(arg0);
        if (var3 != null) {
            this.field2588.method3372(var3);
        }
        return var3;
    }

    @ObfuscatedName("ga.v(J)V")
    public void method3412(long arg0) {
        class206 var3 = (class206) this.field2587.method3416(arg0);
        if (var3 != null) {
            var3.method3474();
            var3.method3515();
            this.field2584++;
        }
    }

    @ObfuscatedName("ga.y(Lgd;J)V")
    public void method3408(class206 arg0, long arg1) {
        if (this.field2584 == 0) {
            class206 var4 = this.field2588.method3361();
            var4.method3474();
            var4.method3515();
            if (this.field2586 == var4) {
                class206 var5 = this.field2588.method3361();
                var5.method3474();
                var5.method3515();
            }
        } else {
            this.field2584--;
        }
        this.field2587.method3417(arg0, arg1);
        this.field2588.method3372(arg0);
    }

    @ObfuscatedName("ga.r()V")
    public void method3409() {
        this.field2588.method3363();
        this.field2587.method3418();
        this.field2586 = new class206();
        this.field2584 = this.field2585;
    }
}
