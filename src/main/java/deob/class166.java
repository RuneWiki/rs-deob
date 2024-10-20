package deob;

@ObfuscatedName("gv")
public class class166 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("gv.am")
    public long field1781;

    @ObfuscatedName("gv.ap")
    public String field1777;

    public class166(class147 arg0) {
        this.this$0 = arg0;
        this.field1781 = -1L;
        this.field1777 = null;
    }

    @ObfuscatedName("gv.am(Luk;I)V")
    public void method3060(class531 arg0) {
        if (arg0.method8561() != 255) {
            arg0.field5181--;
            this.field1781 = arg0.method8567();
        }
        this.field1777 = arg0.method8602();
    }

    @ObfuscatedName("gv.ap(Lfn;I)V")
    public void method3059(class155 arg0) {
        arg0.method3121(this.field1781, this.field1777);
    }
}
