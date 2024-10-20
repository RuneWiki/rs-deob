package deob;

@ObfuscatedName("ht")
public final class class222 {

    @ObfuscatedName("ht.f")
    public class348 field2568 = new class348();

    @ObfuscatedName("ht.e")
    public int field2572;

    @ObfuscatedName("ht.v")
    public int field2570;

    @ObfuscatedName("ht.y")
    public class362 field2571;

    @ObfuscatedName("ht.j")
    public class300 field2569 = new class300();

    public class222(int arg0) {
        this.field2572 = arg0;
        this.field2570 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2571 = new class362(var2);
    }

    @ObfuscatedName("ht.f(J)Lmm;")
    public class348 method3987(long arg0) {
        class348 var3 = (class348) this.field2571.method5668(arg0);
        if (var3 != null) {
            this.field2569.method4845(var3);
        }
        return var3;
    }

    @ObfuscatedName("ht.e(J)V")
    public void method3991(long arg0) {
        class348 var3 = (class348) this.field2571.method5668(arg0);
        if (var3 != null) {
            var3.method5407();
            var3.method5404();
            this.field2570++;
        }
    }

    @ObfuscatedName("ht.v(Lmm;J)V")
    public void method3988(class348 arg0, long arg1) {
        if (this.field2570 == 0) {
            class348 var4 = this.field2569.method4861();
            var4.method5407();
            var4.method5404();
            if (this.field2568 == var4) {
                class348 var5 = this.field2569.method4861();
                var5.method5407();
                var5.method5404();
            }
        } else {
            this.field2570--;
        }
        this.field2571.method5669(arg0, arg1);
        this.field2569.method4845(arg0);
    }

    @ObfuscatedName("ht.y()V")
    public void method3989() {
        this.field2569.method4846();
        this.field2571.method5670();
        this.field2568 = new class348();
        this.field2570 = this.field2572;
    }
}
