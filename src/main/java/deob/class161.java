package deob;

@ObfuscatedName("gq")
public class class161 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("gq.ac")
    public long field1752;

    @ObfuscatedName("gq.al")
    public String field1749;

    @ObfuscatedName("gq.ak")
    public int field1750;

    public class161(class149 arg0) {
        this.this$0 = arg0;
        this.field1752 = -1L;
        this.field1749 = null;
        this.field1750 = 0;
    }

    @ObfuscatedName("gq.ac(Lul;I)V")
    public void method2966(class530 arg0) {
        if (arg0.method8365() != 255) {
            arg0.field5140--;
            this.field1752 = arg0.method8573();
        }
        this.field1749 = arg0.method8375();
        this.field1750 = arg0.method8598();
    }

    @ObfuscatedName("gq.al(Lgi;I)V")
    public void method2967(class157 arg0) {
        arg0.method3024(this.field1752, this.field1749, this.field1750);
    }
}
