package deob;

@ObfuscatedName("fx")
public class class138 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("fx.af")
    public long field1633;

    @ObfuscatedName("fx.an")
    public String field1634;

    public class138(class143 arg0) {
        this.this$0 = arg0;
        this.field1633 = -1L;
        this.field1634 = null;
    }

    @ObfuscatedName("fx.af(Lsg;I)V")
    public void method3021(class489 arg0) {
        if (arg0.method8248() != 255) {
            arg0.field4989--;
            this.field1633 = arg0.method8271();
        }
        this.field1634 = arg0.method8305();
    }

    @ObfuscatedName("fx.an(Lfj;I)V")
    public void method3022(class151 arg0) {
        arg0.method3079(this.field1633, this.field1634, 0);
    }
}
