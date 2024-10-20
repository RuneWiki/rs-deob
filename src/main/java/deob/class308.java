package deob;

@ObfuscatedName("kg")
public final class class308 {

    @ObfuscatedName("kg.n")
    public class364 field3816 = new class364();

    public class308() {
        this.field3816.field4049 = this.field3816;
        this.field3816.field4050 = this.field3816;
    }

    @ObfuscatedName("kg.n(Lmc;)V")
    public void method4946(class364 arg0) {
        if (arg0.field4050 != null) {
            arg0.method5728();
        }
        arg0.field4050 = this.field3816.field4050;
        arg0.field4049 = this.field3816;
        arg0.field4050.field4049 = arg0;
        arg0.field4049.field4050 = arg0;
    }

    @ObfuscatedName("kg.c(Lmc;)V")
    public void method4948(class364 arg0) {
        if (arg0.field4050 != null) {
            arg0.method5728();
        }
        arg0.field4050 = this.field3816;
        arg0.field4049 = this.field3816.field4049;
        arg0.field4050.field4049 = arg0;
        arg0.field4049.field4050 = arg0;
    }

    @ObfuscatedName("kg.m()Lmc;")
    public class364 method4947() {
        class364 var1 = this.field3816.field4049;
        return this.field3816 == var1 ? null : var1;
    }
}
