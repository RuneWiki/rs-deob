package deob;

@ObfuscatedName("pw")
public class class413 {

    @ObfuscatedName("pw.ac")
    public class503 field4684 = new class503();

    @ObfuscatedName("pw.ae")
    public class503 field4683;

    public class413() {
        this.field4684.field5113 = this.field4684;
        this.field4684.field5114 = this.field4684;
    }

    @ObfuscatedName("pw.ac(Ltn;)V")
    public void method7145(class503 arg0) {
        if (arg0.field5114 != null) {
            arg0.method8355();
        }
        arg0.field5114 = this.field4684.field5114;
        arg0.field5113 = this.field4684;
        arg0.field5114.field5113 = arg0;
        arg0.field5113.field5114 = arg0;
    }

    @ObfuscatedName("pw.ae()Ltn;")
    public class503 method7141() {
        class503 var1 = this.field4684.field5113;
        if (this.field4684 == var1) {
            this.field4683 = null;
            return null;
        } else {
            this.field4683 = var1.field5113;
            return var1;
        }
    }

    @ObfuscatedName("pw.ag()Ltn;")
    public class503 method7142() {
        class503 var1 = this.field4683;
        if (this.field4684 == var1) {
            this.field4683 = null;
            return null;
        } else {
            this.field4683 = var1.field5113;
            return var1;
        }
    }
}
