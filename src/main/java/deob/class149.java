package deob;

@ObfuscatedName("ea")
public class class149 extends class127 {

    // $FF: synthetic field
    public final class130 this$0;

    @ObfuscatedName("ea.c")
    public long field1659;

    @ObfuscatedName("ea.b")
    public String field1653;

    public class149(class130 arg0) {
        this.this$0 = arg0;
        this.field1659 = -1L;
        this.field1653 = null;
    }

    @ObfuscatedName("ea.c(Lpi;I)V")
    public void method2590(class419 arg0) {
        if (arg0.method6781() != 255) {
            arg0.field4475--;
            this.field1659 = arg0.method6676();
        }
        this.field1653 = arg0.method6679();
    }

    @ObfuscatedName("ea.b(Lej;I)V")
    public void method2591(class138 arg0) {
        arg0.method2644(this.field1659, this.field1653);
    }
}
