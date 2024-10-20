package deob;

@ObfuscatedName("gc")
public final class class201 {

    @ObfuscatedName("gc.s")
    public class206 field2575 = new class206();

    @ObfuscatedName("gc.g")
    public int field2574;

    @ObfuscatedName("gc.m")
    public int field2572;

    @ObfuscatedName("gc.h")
    public class202 field2573;

    @ObfuscatedName("gc.i")
    public class196 field2576 = new class196();

    public class201(int arg0) {
        this.field2574 = arg0;
        this.field2572 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2573 = new class202(var2);
    }

    @ObfuscatedName("gc.s(J)Lgv;")
    public class206 method3673(long arg0) {
        class206 var3 = (class206) this.field2573.method3704(arg0);
        if (var3 != null) {
            this.field2576.method3627(var3);
        }
        return var3;
    }

    @ObfuscatedName("gc.g(J)V")
    public void method3687(long arg0) {
        class206 var3 = (class206) this.field2573.method3704(arg0);
        if (var3 != null) {
            var3.method3740();
            var3.method3781();
            this.field2572++;
        }
    }

    @ObfuscatedName("gc.m(Lgv;J)V")
    public void method3675(class206 arg0, long arg1) {
        if (this.field2572 == 0) {
            class206 var4 = this.field2576.method3629();
            var4.method3740();
            var4.method3781();
            if (this.field2575 == var4) {
                class206 var5 = this.field2576.method3629();
                var5.method3740();
                var5.method3781();
            }
        } else {
            this.field2572--;
        }
        this.field2573.method3691(arg0, arg1);
        this.field2576.method3627(arg0);
    }

    @ObfuscatedName("gc.h()V")
    public void method3674() {
        this.field2576.method3631();
        this.field2573.method3692();
        this.field2575 = new class206();
        this.field2572 = this.field2574;
    }
}
