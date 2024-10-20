package deob;

@ObfuscatedName("gj")
public final class class201 {

    @ObfuscatedName("gj.w")
    public class207 field2433 = new class207();

    @ObfuscatedName("gj.m")
    public int field2432;

    @ObfuscatedName("gj.q")
    public int field2434;

    @ObfuscatedName("gj.b")
    public class203 field2435;

    @ObfuscatedName("gj.f")
    public class195 field2436 = new class195();

    public class201(int arg0) {
        this.field2432 = arg0;
        this.field2434 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2435 = new class203(var2);
    }

    @ObfuscatedName("gj.w(J)Lgc;")
    public class207 method3707(long arg0) {
        class207 var3 = (class207) this.field2435.method3748(arg0);
        if (var3 != null) {
            this.field2436.method3665(var3);
        }
        return var3;
    }

    @ObfuscatedName("gj.m(J)V")
    public void method3706(long arg0) {
        class207 var3 = (class207) this.field2435.method3748(arg0);
        if (var3 != null) {
            var3.method3782();
            var3.method3819();
            this.field2434++;
        }
    }

    @ObfuscatedName("gj.q(Lgc;J)V")
    public void method3712(class207 arg0, long arg1) {
        if (this.field2434 == 0) {
            class207 var4 = this.field2436.method3652();
            var4.method3782();
            var4.method3819();
            if (this.field2433 == var4) {
                class207 var5 = this.field2436.method3652();
                var5.method3782();
                var5.method3819();
            }
        } else {
            this.field2434--;
        }
        this.field2435.method3747(arg0, arg1);
        this.field2436.method3665(arg0);
    }

    @ObfuscatedName("gj.x()V")
    public void method3708() {
        this.field2436.method3657();
        this.field2435.method3738();
        this.field2433 = new class207();
        this.field2434 = this.field2432;
    }
}
