package deob;

@ObfuscatedName("jq")
public final class class261 {

    @ObfuscatedName("jq.c")
    public class176 field3528 = new class176();

    public class261() {
        this.field3528.field2106 = this.field3528;
        this.field3528.field2107 = this.field3528;
    }

    @ObfuscatedName("jq.c(Lfa;)V")
    public void method4465(class176 arg0) {
        if (arg0.field2107 != null) {
            arg0.method3342();
        }
        arg0.field2107 = this.field3528.field2107;
        arg0.field2106 = this.field3528;
        arg0.field2107.field2106 = arg0;
        arg0.field2106.field2107 = arg0;
    }

    @ObfuscatedName("jq.t(Lfa;)V")
    public void method4470(class176 arg0) {
        if (arg0.field2107 != null) {
            arg0.method3342();
        }
        arg0.field2107 = this.field3528;
        arg0.field2106 = this.field3528.field2106;
        arg0.field2107.field2106 = arg0;
        arg0.field2106.field2107 = arg0;
    }

    @ObfuscatedName("jq.o()Lfa;")
    public class176 method4466() {
        class176 var1 = this.field3528.field2106;
        return this.field3528 == var1 ? null : var1;
    }
}
