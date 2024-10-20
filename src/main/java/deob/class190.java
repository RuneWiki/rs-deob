package deob;

@ObfuscatedName("gc")
public final class class190 {

    @ObfuscatedName("gc.n")
    public class195 field2470 = new class195();

    @ObfuscatedName("gc.p")
    public int field2471;

    @ObfuscatedName("gc.i")
    public int field2472;

    @ObfuscatedName("gc.j")
    public class191 field2473;

    @ObfuscatedName("gc.f")
    public class185 field2474 = new class185();

    public class190(int arg0) {
        this.field2471 = arg0;
        this.field2472 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2473 = new class191(var2);
    }

    @ObfuscatedName("gc.n(J)Lgu;")
    public class195 method3280(long arg0) {
        class195 var3 = (class195) this.field2473.method3295(arg0);
        if (var3 != null) {
            this.field2474.method3222(var3);
        }
        return var3;
    }

    @ObfuscatedName("gc.p(J)V")
    public void method3279(long arg0) {
        class195 var3 = (class195) this.field2473.method3295(arg0);
        if (var3 != null) {
            var3.method3347();
            var3.method3391();
            this.field2472++;
        }
    }

    @ObfuscatedName("gc.i(Lgu;J)V")
    public void method3282(class195 arg0, long arg1) {
        if (this.field2472 == 0) {
            class195 var4 = this.field2474.method3226();
            var4.method3347();
            var4.method3391();
            if (this.field2470 == var4) {
                class195 var5 = this.field2474.method3226();
                var5.method3347();
                var5.method3391();
            }
        } else {
            this.field2472--;
        }
        this.field2473.method3296(arg0, arg1);
        this.field2474.method3222(arg0);
    }

    @ObfuscatedName("gc.j()V")
    public void method3286() {
        this.field2474.method3240();
        this.field2473.method3313();
        this.field2470 = new class195();
        this.field2472 = this.field2471;
    }
}
