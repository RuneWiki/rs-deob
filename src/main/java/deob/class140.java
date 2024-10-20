package deob;

@ObfuscatedName("el")
public class class140 extends class133 {

    // $FF: synthetic field
    public final class134 this$0;

    @ObfuscatedName("el.i")
    public String field1527;

    @ObfuscatedName("el.w")
    public byte field1528;

    @ObfuscatedName("el.s")
    public byte field1529;

    public class140(class134 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("el.i(Lop;I)V")
    public void method2411(class401 arg0) {
        this.field1527 = arg0.method6369();
        if (this.field1527 != null) {
            arg0.method6240();
            this.field1528 = arg0.method6241();
            this.field1529 = arg0.method6241();
        }
    }

    @ObfuscatedName("el.w(Lea;I)V")
    public void method2419(class137 arg0) {
        arg0.field1516 = this.field1527;
        if (this.field1527 != null) {
            arg0.field1517 = this.field1528;
            arg0.field1512 = this.field1529;
        }
    }
}
