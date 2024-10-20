package deob;

@ObfuscatedName("ir")
public final class class257 {

    @ObfuscatedName("ir.o")
    public class406 field2935 = new class406();

    @ObfuscatedName("ir.q")
    public int field2936;

    @ObfuscatedName("ir.l")
    public int field2937;

    @ObfuscatedName("ir.k")
    public class420 field2938;

    @ObfuscatedName("ir.a")
    public class340 field2939 = new class340();

    public class257(int arg0) {
        this.field2936 = arg0;
        this.field2937 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2938 = new class420(var2);
    }

    @ObfuscatedName("ir.o(J)Loq;")
    public class406 method4566(long arg0) {
        class406 var3 = (class406) this.field2938.method6665(arg0);
        if (var3 != null) {
            this.field2939.method5572(var3);
        }
        return var3;
    }

    @ObfuscatedName("ir.q(J)V")
    public void method4567(long arg0) {
        class406 var3 = (class406) this.field2938.method6665(arg0);
        if (var3 != null) {
            var3.method6399();
            var3.method6393();
            this.field2937++;
        }
    }

    @ObfuscatedName("ir.l(Loq;J)V")
    public void method4571(class406 arg0, long arg1) {
        if (this.field2937 == 0) {
            class406 var4 = this.field2939.method5582();
            var4.method6399();
            var4.method6393();
            if (this.field2935 == var4) {
                class406 var5 = this.field2939.method5582();
                var5.method6399();
                var5.method6393();
            }
        } else {
            this.field2937--;
        }
        this.field2938.method6666(arg0, arg1);
        this.field2939.method5572(arg0);
    }

    @ObfuscatedName("ir.k()V")
    public void method4569() {
        this.field2939.method5571();
        this.field2938.method6668();
        this.field2935 = new class406();
        this.field2937 = this.field2936;
    }
}
