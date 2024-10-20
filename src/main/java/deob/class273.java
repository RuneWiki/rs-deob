package deob;

@ObfuscatedName("jn")
public class class273 {

    @ObfuscatedName("jn.m")
    public class188 field3570 = new class188();

    @ObfuscatedName("jn.o")
    public class188 field3569;

    public class273() {
        this.field3570.field2148 = this.field3570;
        this.field3570.field2149 = this.field3570;
    }

    @ObfuscatedName("jn.m(Lgd;)V")
    public void method4676(class188 arg0) {
        if (arg0.field2149 != null) {
            arg0.method3384();
        }
        arg0.field2149 = this.field3570.field2149;
        arg0.field2148 = this.field3570;
        arg0.field2149.field2148 = arg0;
        arg0.field2148.field2149 = arg0;
    }

    @ObfuscatedName("jn.o()Lgd;")
    public class188 method4677() {
        class188 var1 = this.field3570.field2148;
        if (this.field3570 == var1) {
            this.field3569 = null;
            return null;
        } else {
            this.field3569 = var1.field2148;
            return var1;
        }
    }

    @ObfuscatedName("jn.q()Lgd;")
    public class188 method4684() {
        class188 var1 = this.field3569;
        if (this.field3570 == var1) {
            this.field3569 = null;
            return null;
        } else {
            this.field3569 = var1.field2148;
            return var1;
        }
    }
}
