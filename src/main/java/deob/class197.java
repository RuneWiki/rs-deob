package deob;

@ObfuscatedName("gx")
public final class class197 {

    @ObfuscatedName("gx.d")
    public class202 field2555 = new class202();

    @ObfuscatedName("gx.x")
    public int field2553;

    @ObfuscatedName("gx.k")
    public int field2554;

    @ObfuscatedName("gx.z")
    public class198 field2552;

    @ObfuscatedName("gx.v")
    public class192 field2556 = new class192();

    public class197(int arg0) {
        this.field2553 = arg0;
        this.field2554 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2552 = new class198(var2);
    }

    @ObfuscatedName("gx.d(J)Lgt;")
    public class202 method3418(long arg0) {
        class202 var3 = (class202) this.field2552.method3438(arg0);
        if (var3 != null) {
            this.field2556.method3373(var3);
        }
        return var3;
    }

    @ObfuscatedName("gx.x(J)V")
    public void method3419(long arg0) {
        class202 var3 = (class202) this.field2552.method3438(arg0);
        if (var3 != null) {
            var3.method3475();
            var3.method3514();
            this.field2554++;
        }
    }

    @ObfuscatedName("gx.k(Lgt;J)V")
    public void method3417(class202 arg0, long arg1) {
        if (this.field2554 == 0) {
            class202 var4 = this.field2556.method3375();
            var4.method3475();
            var4.method3514();
            if (this.field2555 == var4) {
                class202 var5 = this.field2556.method3375();
                var5.method3475();
                var5.method3514();
            }
        } else {
            this.field2554--;
        }
        this.field2552.method3431(arg0, arg1);
        this.field2556.method3373(arg0);
    }

    @ObfuscatedName("gx.z()V")
    public void method3422() {
        this.field2556.method3386();
        this.field2552.method3441();
        this.field2555 = new class202();
        this.field2554 = this.field2553;
    }
}
