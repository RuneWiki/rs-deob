package deob;

@ObfuscatedName("ef")
public class class135 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("ef.c")
    public int field1553;

    public class135(class144 arg0) {
        this.this$0 = arg0;
        this.field1553 = -1;
    }

    @ObfuscatedName("ef.c(Lpi;B)V")
    public void method2619(class419 arg0) {
        this.field1553 = arg0.method6672();
        arg0.method6781();
        if (arg0.method6781() != 255) {
            arg0.field4475--;
            arg0.method6676();
        }
    }

    @ObfuscatedName("ef.b(Lei;B)V")
    public void method2621(class147 arg0) {
        arg0.method2746(this.field1553);
    }
}
