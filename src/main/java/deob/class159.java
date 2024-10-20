package deob;

@ObfuscatedName("ga")
public class class159 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("ga.am")
    public long field1741;

    @ObfuscatedName("ga.ap")
    public String field1739;

    @ObfuscatedName("ga.af")
    public int field1740;

    public class159(class147 arg0) {
        this.this$0 = arg0;
        this.field1741 = -1L;
        this.field1739 = null;
        this.field1740 = 0;
    }

    @ObfuscatedName("ga.am(Luk;I)V")
    public void method3060(class531 arg0) {
        if (arg0.method8561() != 255) {
            arg0.field5181--;
            this.field1741 = arg0.method8567();
        }
        this.field1739 = arg0.method8602();
        this.field1740 = arg0.method8775();
    }

    @ObfuscatedName("ga.ap(Lfn;I)V")
    public void method3059(class155 arg0) {
        arg0.method3118(this.field1741, this.field1739, this.field1740);
    }
}
