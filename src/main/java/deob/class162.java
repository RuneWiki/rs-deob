package deob;

@ObfuscatedName("fl")
public class class162 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("fl.f")
    public long field1804;

    @ObfuscatedName("fl.w")
    public String field1805;

    public class162(class143 arg0) {
        this.this$0 = arg0;
        this.field1804 = -1L;
        this.field1805 = null;
    }

    @ObfuscatedName("fl.f(Lrd;S)V")
    public void method2984(class474 arg0) {
        if (arg0.method7964() != 255) {
            arg0.field4939--;
            this.field1804 = arg0.method8151();
        }
        this.field1805 = arg0.method7973();
    }

    @ObfuscatedName("fl.w(Leb;B)V")
    public void method2983(class151 arg0) {
        arg0.method3032(this.field1804, this.field1805);
    }
}
