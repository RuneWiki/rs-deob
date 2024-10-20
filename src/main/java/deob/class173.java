package deob;

@ObfuscatedName("fu")
public class class173 {

    @ObfuscatedName("fu.i")
    public class178 field2803 = new class178();

    @ObfuscatedName("fu.w")
    public class178 field2802;

    public class173() {
        this.field2803.field2815 = this.field2803;
        this.field2803.field2814 = this.field2803;
    }

    @ObfuscatedName("fu.i(Lfl;)V")
    public void method3261(class178 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3324();
        }
        arg0.field2814 = this.field2803.field2814;
        arg0.field2815 = this.field2803;
        arg0.field2814.field2815 = arg0;
        arg0.field2815.field2814 = arg0;
    }

    @ObfuscatedName("fu.w()Lfl;")
    public class178 method3267() {
        class178 var1 = this.field2803.field2815;
        if (this.field2803 == var1) {
            this.field2802 = null;
            return null;
        } else {
            this.field2802 = var1.field2815;
            return var1;
        }
    }

    @ObfuscatedName("fu.f()Lfl;")
    public class178 method3262() {
        class178 var1 = this.field2802;
        if (this.field2803 == var1) {
            this.field2802 = null;
            return null;
        } else {
            this.field2802 = var1.field2815;
            return var1;
        }
    }
}
