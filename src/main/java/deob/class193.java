package deob;

@ObfuscatedName("ga")
public final class class193 {

    @ObfuscatedName("ga.o")
    public class204 field3064 = new class204();

    @ObfuscatedName("ga.f")
    public int field3062;

    @ObfuscatedName("ga.i")
    public int field3063;

    @ObfuscatedName("ga.h")
    public class196 field3061;

    @ObfuscatedName("ga.q")
    public class203 field3065 = new class203();

    public class193(int arg0) {
        this.field3062 = arg0;
        this.field3063 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3061 = new class196(var2);
    }

    @ObfuscatedName("ga.o(J)Lgn;")
    public class204 method3456(long arg0) {
        class204 var3 = (class204) this.field3061.method3482(arg0);
        if (var3 != null) {
            this.field3065.method3571(var3);
        }
        return var3;
    }

    @ObfuscatedName("ga.f(J)V")
    public void method3450(long arg0) {
        class204 var3 = (class204) this.field3061.method3482(arg0);
        if (var3 != null) {
            var3.method3605();
            var3.method3580();
            this.field3063++;
        }
    }

    @ObfuscatedName("ga.i(Lgn;J)V")
    public void method3451(class204 arg0, long arg1) {
        if (this.field3063 == 0) {
            class204 var4 = this.field3065.method3573();
            var4.method3605();
            var4.method3580();
            if (this.field3064 == var4) {
                class204 var5 = this.field3065.method3573();
                var5.method3605();
                var5.method3580();
            }
        } else {
            this.field3063--;
        }
        this.field3061.method3495(arg0, arg1);
        this.field3065.method3571(arg0);
    }

    @ObfuscatedName("ga.h()V")
    public void method3452() {
        this.field3065.method3570();
        this.field3061.method3485();
        this.field3064 = new class204();
        this.field3063 = this.field3062;
    }
}
