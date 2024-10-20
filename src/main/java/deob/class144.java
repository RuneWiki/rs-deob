package deob;

@ObfuscatedName("fy")
public class class144 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("fy.af")
    public int field1668;

    @ObfuscatedName("fy.an")
    public byte field1669;

    public class144(class143 arg0) {
        this.this$0 = arg0;
        this.field1668 = -1;
    }

    @ObfuscatedName("fy.af(Lsg;I)V")
    public void method3021(class489 arg0) {
        this.field1668 = arg0.method8250();
        this.field1669 = arg0.method8249();
    }

    @ObfuscatedName("fy.an(Lfj;I)V")
    public void method3022(class151 arg0) {
        arg0.method3104(this.field1668, this.field1669);
    }
}
