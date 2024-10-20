package deob;

@ObfuscatedName("gc")
public final class class190 {

    @ObfuscatedName("gc.a")
    public class195 field2456 = new class195();

    @ObfuscatedName("gc.j")
    public int field2454;

    @ObfuscatedName("gc.n")
    public int field2455;

    @ObfuscatedName("gc.r")
    public class191 field2453;

    @ObfuscatedName("gc.v")
    public class185 field2457 = new class185();

    public class190(int arg0) {
        this.field2454 = arg0;
        this.field2455 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2453 = new class191(var2);
    }

    @ObfuscatedName("gc.a(J)Lgn;")
    public class195 method3245(long arg0) {
        class195 var3 = (class195) this.field2453.method3264(arg0);
        if (var3 != null) {
            this.field2457.method3188(var3);
        }
        return var3;
    }

    @ObfuscatedName("gc.j(J)V")
    public void method3246(long arg0) {
        class195 var3 = (class195) this.field2453.method3264(arg0);
        if (var3 != null) {
            var3.method3308();
            var3.method3348();
            this.field2455++;
        }
    }

    @ObfuscatedName("gc.n(Lgn;J)V")
    public void method3247(class195 arg0, long arg1) {
        if (this.field2455 == 0) {
            class195 var4 = this.field2457.method3190();
            var4.method3308();
            var4.method3348();
            if (this.field2456 == var4) {
                class195 var5 = this.field2457.method3190();
                var5.method3308();
                var5.method3348();
            }
        } else {
            this.field2455--;
        }
        this.field2453.method3260(arg0, arg1);
        this.field2457.method3188(arg0);
    }

    @ObfuscatedName("gc.r()V")
    public void method3244() {
        this.field2457.method3203();
        this.field2453.method3261();
        this.field2456 = new class195();
        this.field2455 = this.field2454;
    }
}
