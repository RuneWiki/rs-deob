package deob;

@ObfuscatedName("fm")
public class class147 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("fm.ac")
    public int field1652;

    @ObfuscatedName("fm.al")
    public boolean field1653;

    public class147(class149 arg0) {
        this.this$0 = arg0;
        this.field1652 = -1;
    }

    @ObfuscatedName("fm.ac(Lul;I)V")
    public void method2966(class530 arg0) {
        this.field1652 = arg0.method8598();
        this.field1653 = arg0.method8365() == 1;
    }

    @ObfuscatedName("fm.al(Lgi;I)V")
    public void method2967(class157 arg0) {
        arg0.method3031(this.field1652, this.field1653);
    }
}
