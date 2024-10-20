package deob;

@ObfuscatedName("go")
public final class class190 {

    @ObfuscatedName("go.w")
    public class195 field2455 = new class195();

    @ObfuscatedName("go.s")
    public int field2453;

    @ObfuscatedName("go.q")
    public int field2452;

    @ObfuscatedName("go.o")
    public class191 field2454;

    @ObfuscatedName("go.g")
    public class185 field2456 = new class185();

    public class190(int arg0) {
        this.field2453 = arg0;
        this.field2452 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2454 = new class191(var2);
    }

    @ObfuscatedName("go.w(J)Lgp;")
    public class195 method3357(long arg0) {
        class195 var3 = (class195) this.field2454.method3387(arg0);
        if (var3 != null) {
            this.field2456.method3307(var3);
        }
        return var3;
    }

    @ObfuscatedName("go.s(J)V")
    public void method3359(long arg0) {
        class195 var3 = (class195) this.field2454.method3387(arg0);
        if (var3 != null) {
            var3.method3425();
            var3.method3457();
            this.field2452++;
        }
    }

    @ObfuscatedName("go.q(Lgp;J)V")
    public void method3371(class195 arg0, long arg1) {
        if (this.field2452 == 0) {
            class195 var4 = this.field2456.method3309();
            var4.method3425();
            var4.method3457();
            if (this.field2455 == var4) {
                class195 var5 = this.field2456.method3309();
                var5.method3425();
                var5.method3457();
            }
        } else {
            this.field2452--;
        }
        this.field2454.method3374(arg0, arg1);
        this.field2456.method3307(arg0);
    }

    @ObfuscatedName("go.o()V")
    public void method3361() {
        this.field2456.method3306();
        this.field2454.method3376();
        this.field2455 = new class195();
        this.field2452 = this.field2453;
    }
}
