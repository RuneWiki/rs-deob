package deob;

@ObfuscatedName("fn")
public class class141 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("fn.af")
    public int field1648;

    @ObfuscatedName("fn.an")
    public boolean field1647;

    public class141(class143 arg0) {
        this.this$0 = arg0;
        this.field1648 = -1;
    }

    @ObfuscatedName("fn.af(Lsg;I)V")
    public void method3021(class489 arg0) {
        this.field1648 = arg0.method8250();
        this.field1647 = arg0.method8248() == 1;
    }

    @ObfuscatedName("fn.an(Lfj;I)V")
    public void method3022(class151 arg0) {
        arg0.method3093(this.field1648, this.field1647);
    }
}
