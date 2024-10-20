package deob;

@ObfuscatedName("fl")
public class class142 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("fl.am")
    public long field1628;

    @ObfuscatedName("fl.ap")
    public String field1627;

    public class142(class147 arg0) {
        this.this$0 = arg0;
        this.field1628 = -1L;
        this.field1627 = null;
    }

    @ObfuscatedName("fl.am(Luk;I)V")
    public void method3060(class531 arg0) {
        if (arg0.method8561() != 255) {
            arg0.field5181--;
            this.field1628 = arg0.method8567();
        }
        this.field1627 = arg0.method8602();
    }

    @ObfuscatedName("fl.ap(Lfn;I)V")
    public void method3059(class155 arg0) {
        arg0.method3118(this.field1628, this.field1627, 0);
    }
}
