package deob;

@ObfuscatedName("fh")
public class class174 {

    @ObfuscatedName("fh.g")
    public class186 field2856 = new class186();

    @ObfuscatedName("fh.s")
    public class186 field2855;

    public class174() {
        this.field2856.field2881 = this.field2856;
        this.field2856.field2880 = this.field2856;
    }

    @ObfuscatedName("fh.g(Lgw;)V")
    public void method3140(class186 arg0) {
        if (arg0.field2880 != null) {
            arg0.method3280();
        }
        arg0.field2880 = this.field2856.field2880;
        arg0.field2881 = this.field2856;
        arg0.field2880.field2881 = arg0;
        arg0.field2881.field2880 = arg0;
    }

    @ObfuscatedName("fh.s()Lgw;")
    public class186 method3141() {
        class186 var1 = this.field2856.field2881;
        if (this.field2856 == var1) {
            this.field2855 = null;
            return null;
        } else {
            this.field2855 = var1.field2881;
            return var1;
        }
    }

    @ObfuscatedName("fh.v()Lgw;")
    public class186 method3149() {
        class186 var1 = this.field2855;
        if (this.field2856 == var1) {
            this.field2855 = null;
            return null;
        } else {
            this.field2855 = var1.field2881;
            return var1;
        }
    }
}
