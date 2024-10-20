package deob;

@ObfuscatedName("gu")
public final class class193 {

    @ObfuscatedName("gu.c")
    public class204 field3063 = new class204();

    @ObfuscatedName("gu.h")
    public int field3061;

    @ObfuscatedName("gu.k")
    public int field3062;

    @ObfuscatedName("gu.t")
    public class196 field3060;

    @ObfuscatedName("gu.g")
    public class203 field3064 = new class203();

    public class193(int arg0) {
        this.field3061 = arg0;
        this.field3062 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3060 = new class196(var2);
    }

    @ObfuscatedName("gu.c(J)Lgq;")
    public class204 method3485(long arg0) {
        class204 var3 = (class204) this.field3060.method3521(arg0);
        if (var3 != null) {
            this.field3064.method3611(var3);
        }
        return var3;
    }

    @ObfuscatedName("gu.h(J)V")
    public void method3496(long arg0) {
        class204 var3 = (class204) this.field3060.method3521(arg0);
        if (var3 != null) {
            var3.method3646();
            var3.method3626();
            this.field3062++;
        }
    }

    @ObfuscatedName("gu.k(Lgq;J)V")
    public void method3487(class204 arg0, long arg1) {
        if (this.field3062 == 0) {
            class204 var4 = this.field3064.method3617();
            var4.method3646();
            var4.method3626();
            if (this.field3063 == var4) {
                class204 var5 = this.field3064.method3617();
                var5.method3646();
                var5.method3626();
            }
        } else {
            this.field3062--;
        }
        this.field3060.method3531(arg0, arg1);
        this.field3064.method3611(arg0);
    }

    @ObfuscatedName("gu.t()V")
    public void method3488() {
        this.field3064.method3614();
        this.field3060.method3523();
        this.field3063 = new class204();
        this.field3062 = this.field3061;
    }
}
