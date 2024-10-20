package deob;

@ObfuscatedName("eo")
public class class142 extends class127 {

    // $FF: synthetic field
    public final class130 this$0;

    @ObfuscatedName("eo.c")
    public long field1611;

    @ObfuscatedName("eo.b")
    public String field1608;

    @ObfuscatedName("eo.p")
    public int field1609;

    public class142(class130 arg0) {
        this.this$0 = arg0;
        this.field1611 = -1L;
        this.field1608 = null;
        this.field1609 = 0;
    }

    @ObfuscatedName("eo.c(Lpi;I)V")
    public void method2590(class419 arg0) {
        if (arg0.method6781() != 255) {
            arg0.field4475--;
            this.field1611 = arg0.method6676();
        }
        this.field1608 = arg0.method6679();
        this.field1609 = arg0.method6672();
    }

    @ObfuscatedName("eo.b(Lej;I)V")
    public void method2591(class138 arg0) {
        arg0.method2641(this.field1611, this.field1608, this.field1609);
    }
}
