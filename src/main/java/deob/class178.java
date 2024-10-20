package deob;

@ObfuscatedName("fp")
public class class178 {

    @ObfuscatedName("fp.b")
    public class190 field2877 = new class190();

    @ObfuscatedName("fp.e")
    public class190 field2878;

    public class178() {
        this.field2877.field2903 = this.field2877;
        this.field2877.field2902 = this.field2877;
    }

    @ObfuscatedName("fp.b(Lgn;)V")
    public void method3250(class190 arg0) {
        if (arg0.field2902 != null) {
            arg0.method3388();
        }
        arg0.field2902 = this.field2877.field2902;
        arg0.field2903 = this.field2877;
        arg0.field2902.field2903 = arg0;
        arg0.field2903.field2902 = arg0;
    }

    @ObfuscatedName("fp.e()Lgn;")
    public class190 method3253() {
        class190 var1 = this.field2877.field2903;
        if (this.field2877 == var1) {
            this.field2878 = null;
            return null;
        } else {
            this.field2878 = var1.field2903;
            return var1;
        }
    }

    @ObfuscatedName("fp.i()Lgn;")
    public class190 method3244() {
        class190 var1 = this.field2878;
        if (this.field2877 == var1) {
            this.field2878 = null;
            return null;
        } else {
            this.field2878 = var1.field2903;
            return var1;
        }
    }
}
