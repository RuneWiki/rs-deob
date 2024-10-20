package deob;

@ObfuscatedName("fl")
public class class173 {

    @ObfuscatedName("fl.g")
    public class178 field2808 = new class178();

    @ObfuscatedName("fl.h")
    public class178 field2809;

    public class173() {
        this.field2808.field2821 = this.field2808;
        this.field2808.field2820 = this.field2808;
    }

    @ObfuscatedName("fl.g(Lfr;)V")
    public void method3339(class178 arg0) {
        if (arg0.field2820 != null) {
            arg0.method3400();
        }
        arg0.field2820 = this.field2808.field2820;
        arg0.field2821 = this.field2808;
        arg0.field2820.field2821 = arg0;
        arg0.field2821.field2820 = arg0;
    }

    @ObfuscatedName("fl.h()Lfr;")
    public class178 method3341() {
        class178 var1 = this.field2808.field2821;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2821;
            return var1;
        }
    }

    @ObfuscatedName("fl.s()Lfr;")
    public class178 method3332() {
        class178 var1 = this.field2809;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2821;
            return var1;
        }
    }
}
