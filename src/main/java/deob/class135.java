package deob;

@ObfuscatedName("eh")
public class class135 extends class143 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("eh.c")
    public int field1574;

    public class135(class144 arg0) {
        this.this$0 = arg0;
        this.field1574 = -1;
    }

    @ObfuscatedName("eh.c(Lpi;B)V")
    public void method2616(class421 arg0) {
        this.field1574 = arg0.method6666();
        arg0.method6686();
        if (arg0.method6686() != 255) {
            arg0.field4512--;
            arg0.method6670();
        }
    }

    @ObfuscatedName("eh.l(Leg;B)V")
    public void method2621(class147 arg0) {
        arg0.method2715(this.field1574);
    }
}
