package deob;

@ObfuscatedName("gz")
public class class195 {

    @ObfuscatedName("gz.c")
    public class207 field3070 = new class207();

    @ObfuscatedName("gz.h")
    public class207 field3069;

    public class195() {
        this.field3070.field3094 = this.field3070;
        this.field3070.field3095 = this.field3070;
    }

    @ObfuscatedName("gz.c(Lgr;)V")
    public void method3511(class207 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3643();
        }
        arg0.field3095 = this.field3070.field3095;
        arg0.field3094 = this.field3070;
        arg0.field3095.field3094 = arg0;
        arg0.field3094.field3095 = arg0;
    }

    @ObfuscatedName("gz.h()Lgr;")
    public class207 method3513() {
        class207 var1 = this.field3070.field3094;
        if (this.field3070 == var1) {
            this.field3069 = null;
            return null;
        } else {
            this.field3069 = var1.field3094;
            return var1;
        }
    }

    @ObfuscatedName("gz.k()Lgr;")
    public class207 method3512() {
        class207 var1 = this.field3069;
        if (this.field3070 == var1) {
            this.field3069 = null;
            return null;
        } else {
            this.field3069 = var1.field3094;
            return var1;
        }
    }
}
