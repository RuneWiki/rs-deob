package deob;

@ObfuscatedName("go")
public final class class190 {

    @ObfuscatedName("go.p")
    public class195 field2472 = new class195();

    @ObfuscatedName("go.m")
    public int field2471;

    @ObfuscatedName("go.e")
    public int field2470;

    @ObfuscatedName("go.t")
    public class191 field2473;

    @ObfuscatedName("go.w")
    public class185 field2474 = new class185();

    public class190(int arg0) {
        this.field2471 = arg0;
        this.field2470 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2473 = new class191(var2);
    }

    @ObfuscatedName("go.p(J)Lgp;")
    public class195 method3182(long arg0) {
        class195 var3 = (class195) this.field2473.method3190(arg0);
        if (var3 != null) {
            this.field2474.method3152(var3);
        }
        return var3;
    }

    @ObfuscatedName("go.m(J)V")
    public void method3178(long arg0) {
        class195 var3 = (class195) this.field2473.method3190(arg0);
        if (var3 != null) {
            var3.method3234();
            var3.method3285();
            this.field2470++;
        }
    }

    @ObfuscatedName("go.e(Lgp;J)V")
    public void method3179(class195 arg0, long arg1) {
        if (this.field2470 == 0) {
            class195 var4 = this.field2474.method3136();
            var4.method3234();
            var4.method3285();
            if (this.field2472 == var4) {
                class195 var5 = this.field2474.method3136();
                var5.method3234();
                var5.method3285();
            }
        } else {
            this.field2470--;
        }
        this.field2473.method3191(arg0, arg1);
        this.field2474.method3152(arg0);
    }

    @ObfuscatedName("go.t()V")
    public void method3180() {
        this.field2474.method3148();
        this.field2473.method3192();
        this.field2472 = new class195();
        this.field2470 = this.field2471;
    }
}
