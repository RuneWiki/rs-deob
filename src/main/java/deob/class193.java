package deob;

@ObfuscatedName("gr")
public final class class193 {

    @ObfuscatedName("gr.w")
    public class198 field2478 = new class198();

    @ObfuscatedName("gr.o")
    public int field2476;

    @ObfuscatedName("gr.x")
    public int field2477;

    @ObfuscatedName("gr.k")
    public class194 field2479;

    @ObfuscatedName("gr.f")
    public class188 field2480 = new class188();

    public class193(int arg0) {
        this.field2476 = arg0;
        this.field2477 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2479 = new class194(var2);
    }

    @ObfuscatedName("gr.w(J)Lgw;")
    public class198 method3239(long arg0) {
        class198 var3 = (class198) this.field2479.method3252(arg0);
        if (var3 != null) {
            this.field2480.method3192(var3);
        }
        return var3;
    }

    @ObfuscatedName("gr.o(J)V")
    public void method3240(long arg0) {
        class198 var3 = (class198) this.field2479.method3252(arg0);
        if (var3 != null) {
            var3.method3294();
            var3.method3331();
            this.field2477++;
        }
    }

    @ObfuscatedName("gr.x(Lgw;J)V")
    public void method3241(class198 arg0, long arg1) {
        if (this.field2477 == 0) {
            class198 var4 = this.field2480.method3194();
            var4.method3294();
            var4.method3331();
            if (this.field2478 == var4) {
                class198 var5 = this.field2480.method3194();
                var5.method3294();
                var5.method3331();
            }
        } else {
            this.field2477--;
        }
        this.field2479.method3253(arg0, arg1);
        this.field2480.method3192(arg0);
    }

    @ObfuscatedName("gr.k()V")
    public void method3242() {
        this.field2480.method3198();
        this.field2479.method3254();
        this.field2478 = new class198();
        this.field2477 = this.field2476;
    }
}
