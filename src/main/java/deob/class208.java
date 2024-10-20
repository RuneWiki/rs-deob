package deob;

@ObfuscatedName("gp")
public final class class208 {

    @ObfuscatedName("gp.a")
    public class214 field2496 = new class214();

    @ObfuscatedName("gp.s")
    public int field2495;

    @ObfuscatedName("gp.g")
    public int field2498;

    @ObfuscatedName("gp.x")
    public class210 field2494;

    @ObfuscatedName("gp.h")
    public class202 field2497 = new class202();

    public class208(int arg0) {
        this.field2495 = arg0;
        this.field2498 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2494 = new class210(var2);
    }

    @ObfuscatedName("gp.a(J)Lho;")
    public class214 method3885(long arg0) {
        class214 var3 = (class214) this.field2494.method3911(arg0);
        if (var3 != null) {
            this.field2497.method3818(var3);
        }
        return var3;
    }

    @ObfuscatedName("gp.s(J)V")
    public void method3875(long arg0) {
        class214 var3 = (class214) this.field2494.method3911(arg0);
        if (var3 != null) {
            var3.method3960();
            var3.method3997();
            this.field2498++;
        }
    }

    @ObfuscatedName("gp.g(Lho;J)V")
    public void method3878(class214 arg0, long arg1) {
        if (this.field2498 == 0) {
            class214 var4 = this.field2497.method3836();
            var4.method3960();
            var4.method3997();
            if (this.field2496 == var4) {
                class214 var5 = this.field2497.method3836();
                var5.method3960();
                var5.method3997();
            }
        } else {
            this.field2498--;
        }
        this.field2494.method3920(arg0, arg1);
        this.field2497.method3818(arg0);
    }

    @ObfuscatedName("gp.x()V")
    public void method3879() {
        this.field2497.method3822();
        this.field2494.method3925();
        this.field2496 = new class214();
        this.field2498 = this.field2495;
    }
}
