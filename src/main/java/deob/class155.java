package deob;

@ObfuscatedName("ft")
public class class155 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("ft.af")
    public long field1753;

    @ObfuscatedName("ft.an")
    public String field1750;

    @ObfuscatedName("ft.aw")
    public int field1749;

    public class155(class143 arg0) {
        this.this$0 = arg0;
        this.field1753 = -1L;
        this.field1750 = null;
        this.field1749 = 0;
    }

    @ObfuscatedName("ft.af(Lsg;I)V")
    public void method3021(class489 arg0) {
        if (arg0.method8248() != 255) {
            arg0.field4989--;
            this.field1753 = arg0.method8271();
        }
        this.field1750 = arg0.method8305();
        this.field1749 = arg0.method8250();
    }

    @ObfuscatedName("ft.an(Lfj;I)V")
    public void method3022(class151 arg0) {
        arg0.method3079(this.field1753, this.field1750, this.field1749);
    }
}
