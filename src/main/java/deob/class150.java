package deob;

@ObfuscatedName("fw")
public class class150 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("fw.ac")
    public int field1671;

    @ObfuscatedName("fw.al")
    public byte field1672;

    public class150(class149 arg0) {
        this.this$0 = arg0;
        this.field1671 = -1;
    }

    @ObfuscatedName("fw.ac(Lul;I)V")
    public void method2966(class530 arg0) {
        this.field1671 = arg0.method8598();
        this.field1672 = arg0.method8366();
    }

    @ObfuscatedName("fw.al(Lgi;I)V")
    public void method2967(class157 arg0) {
        arg0.method3052(this.field1671, this.field1672);
    }
}
