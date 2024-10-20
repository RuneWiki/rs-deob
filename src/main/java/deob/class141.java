package deob;

@ObfuscatedName("ef")
public final class class141 {

    @ObfuscatedName("ef.d")
    public class151 field2009 = new class151();

    public class141() {
        this.field2009.field2037 = this.field2009;
        this.field2009.field2038 = this.field2009;
    }

    @ObfuscatedName("ef.d(Lev;)V")
    public void method2550(class151 arg0) {
        if (arg0.field2038 != null) {
            arg0.method2689();
        }
        arg0.field2038 = this.field2009.field2038;
        arg0.field2037 = this.field2009;
        arg0.field2038.field2037 = arg0;
        arg0.field2037.field2038 = arg0;
    }

    @ObfuscatedName("ef.c(Lev;)V")
    public void method2552(class151 arg0) {
        if (arg0.field2038 != null) {
            arg0.method2689();
        }
        arg0.field2038 = this.field2009;
        arg0.field2037 = this.field2009.field2037;
        arg0.field2038.field2037 = arg0;
        arg0.field2037.field2038 = arg0;
    }

    @ObfuscatedName("ef.n()Lev;")
    public class151 method2553() {
        class151 var1 = this.field2009.field2037;
        if (this.field2009 == var1) {
            return null;
        } else {
            var1.method2689();
            return var1;
        }
    }

    @ObfuscatedName("ef.q()Lev;")
    public class151 method2554() {
        class151 var1 = this.field2009.field2037;
        return this.field2009 == var1 ? null : var1;
    }

    @ObfuscatedName("ef.t()V")
    public void method2561() {
        while (true) {
            class151 var1 = this.field2009.field2037;
            if (this.field2009 == var1) {
                return;
            }
            var1.method2689();
        }
    }
}
