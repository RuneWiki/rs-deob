package deob;

@ObfuscatedName("gg")
public final class class193 {

    @ObfuscatedName("gg.y")
    public class204 field3055 = new class204();

    @ObfuscatedName("gg.d")
    public int field3056;

    @ObfuscatedName("gg.g")
    public int field3059;

    @ObfuscatedName("gg.w")
    public class196 field3058;

    @ObfuscatedName("gg.e")
    public class203 field3057 = new class203();

    public class193(int arg0) {
        this.field3056 = arg0;
        this.field3059 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3058 = new class196(var2);
    }

    @ObfuscatedName("gg.y(J)Lgt;")
    public class204 method3425(long arg0) {
        class204 var3 = (class204) this.field3058.method3459(arg0);
        if (var3 != null) {
            this.field3057.method3544(var3);
        }
        return var3;
    }

    @ObfuscatedName("gg.d(J)V")
    public void method3426(long arg0) {
        class204 var3 = (class204) this.field3058.method3459(arg0);
        if (var3 != null) {
            var3.method3588();
            var3.method3561();
            this.field3059++;
        }
    }

    @ObfuscatedName("gg.g(Lgt;J)V")
    public void method3427(class204 arg0, long arg1) {
        if (this.field3059 == 0) {
            class204 var4 = this.field3057.method3543();
            var4.method3588();
            var4.method3561();
            if (this.field3055 == var4) {
                class204 var5 = this.field3057.method3543();
                var5.method3588();
                var5.method3561();
            }
        } else {
            this.field3059--;
        }
        this.field3058.method3460(arg0, arg1);
        this.field3057.method3544(arg0);
    }

    @ObfuscatedName("gg.w()V")
    public void method3428() {
        this.field3057.method3548();
        this.field3058.method3467();
        this.field3055 = new class204();
        this.field3059 = this.field3056;
    }
}
