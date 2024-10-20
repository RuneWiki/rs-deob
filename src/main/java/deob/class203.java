package deob;

@ObfuscatedName("gy")
public final class class203 {

    @ObfuscatedName("gy.f")
    public class209 field2469 = new class209();

    @ObfuscatedName("gy.h")
    public int field2470;

    @ObfuscatedName("gy.e")
    public int field2471;

    @ObfuscatedName("gy.b")
    public class205 field2472;

    @ObfuscatedName("gy.l")
    public class197 field2473 = new class197();

    public class203(int arg0) {
        this.field2470 = arg0;
        this.field2471 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2472 = new class205(var2);
    }

    @ObfuscatedName("gy.f(J)Lhp;")
    public class209 method3724(long arg0) {
        class209 var3 = (class209) this.field2472.method3759(arg0);
        if (var3 != null) {
            this.field2473.method3673(var3);
        }
        return var3;
    }

    @ObfuscatedName("gy.h(J)V")
    public void method3732(long arg0) {
        class209 var3 = (class209) this.field2472.method3759(arg0);
        if (var3 != null) {
            var3.method3812();
            var3.method3845();
            this.field2471++;
        }
    }

    @ObfuscatedName("gy.e(Lhp;J)V")
    public void method3723(class209 arg0, long arg1) {
        if (this.field2471 == 0) {
            class209 var4 = this.field2473.method3670();
            var4.method3812();
            var4.method3845();
            if (this.field2469 == var4) {
                class209 var5 = this.field2473.method3670();
                var5.method3812();
                var5.method3845();
            }
        } else {
            this.field2471--;
        }
        this.field2472.method3761(arg0, arg1);
        this.field2473.method3673(arg0);
    }

    @ObfuscatedName("gy.b()V")
    public void method3725() {
        this.field2473.method3688();
        this.field2472.method3762();
        this.field2469 = new class209();
        this.field2471 = this.field2470;
    }
}
