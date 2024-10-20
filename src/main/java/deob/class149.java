package deob;

@ObfuscatedName("em")
public class class149 extends class127 {

    // $FF: synthetic field
    public final class130 this$0;

    @ObfuscatedName("em.c")
    public long field1674;

    @ObfuscatedName("em.l")
    public String field1670;

    public class149(class130 arg0) {
        this.this$0 = arg0;
        this.field1674 = -1L;
        this.field1670 = null;
    }

    @ObfuscatedName("em.c(Lpi;I)V")
    public void method2583(class421 arg0) {
        if (arg0.method6686() != 255) {
            arg0.field4512--;
            this.field1674 = arg0.method6670();
        }
        this.field1670 = arg0.method6721();
    }

    @ObfuscatedName("em.l(Ley;I)V")
    public void method2576(class138 arg0) {
        arg0.method2666(this.field1674, this.field1670);
    }
}
