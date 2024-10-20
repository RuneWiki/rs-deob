package deob;

@ObfuscatedName("ft")
public class class145 extends class144 {

    // $FF: synthetic field
    public final class147 this$0;

    @ObfuscatedName("ft.am")
    public int field1640;

    @ObfuscatedName("ft.ap")
    public boolean field1639;

    public class145(class147 arg0) {
        this.this$0 = arg0;
        this.field1640 = -1;
    }

    @ObfuscatedName("ft.am(Luk;I)V")
    public void method3060(class531 arg0) {
        this.field1640 = arg0.method8775();
        this.field1639 = arg0.method8561() == 1;
    }

    @ObfuscatedName("ft.ap(Lfn;I)V")
    public void method3059(class155 arg0) {
        arg0.method3125(this.field1640, this.field1639);
    }
}
