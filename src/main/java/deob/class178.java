package deob;

@ObfuscatedName("fq")
public class class178 {

    @ObfuscatedName("fq.a")
    public class190 field2881 = new class190();

    @ObfuscatedName("fq.v")
    public class190 field2880;

    public class178() {
        this.field2881.field2906 = this.field2881;
        this.field2881.field2905 = this.field2881;
    }

    @ObfuscatedName("fq.a(Lgj;)V")
    public void method3201(class190 arg0) {
        if (arg0.field2905 != null) {
            arg0.method3340();
        }
        arg0.field2905 = this.field2881.field2905;
        arg0.field2906 = this.field2881;
        arg0.field2905.field2906 = arg0;
        arg0.field2906.field2905 = arg0;
    }

    @ObfuscatedName("fq.v()Lgj;")
    public class190 method3200() {
        class190 var1 = this.field2881.field2906;
        if (this.field2881 == var1) {
            this.field2880 = null;
            return null;
        } else {
            this.field2880 = var1.field2906;
            return var1;
        }
    }

    @ObfuscatedName("fq.i()Lgj;")
    public class190 method3203() {
        class190 var1 = this.field2880;
        if (this.field2881 == var1) {
            this.field2880 = null;
            return null;
        } else {
            this.field2880 = var1.field2906;
            return var1;
        }
    }
}
