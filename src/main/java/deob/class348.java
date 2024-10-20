package deob;

@ObfuscatedName("mp")
public final class class348 {

    @ObfuscatedName("mp.a")
    public class425 field4274 = new class425();

    public class348() {
        this.field4274.field4629 = this.field4274;
        this.field4274.field4630 = this.field4274;
    }

    @ObfuscatedName("mp.a(Lpu;)V")
    public void method6016(class425 arg0) {
        if (arg0.field4630 != null) {
            arg0.method7169();
        }
        arg0.field4630 = this.field4274.field4630;
        arg0.field4629 = this.field4274;
        arg0.field4630.field4629 = arg0;
        arg0.field4629.field4630 = arg0;
    }

    @ObfuscatedName("mp.f(Lpu;)V")
    public void method6024(class425 arg0) {
        if (arg0.field4630 != null) {
            arg0.method7169();
        }
        arg0.field4630 = this.field4274;
        arg0.field4629 = this.field4274.field4629;
        arg0.field4630.field4629 = arg0;
        arg0.field4629.field4630 = arg0;
    }

    @ObfuscatedName("mp.c()Lpu;")
    public class425 method6018() {
        class425 var1 = this.field4274.field4629;
        return this.field4274 == var1 ? null : var1;
    }
}
