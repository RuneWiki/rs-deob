package deob;

@ObfuscatedName("gp")
public class class168 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("gp.ac")
    public long field1790;

    @ObfuscatedName("gp.al")
    public String field1791;

    public class168(class149 arg0) {
        this.this$0 = arg0;
        this.field1790 = -1L;
        this.field1791 = null;
    }

    @ObfuscatedName("gp.ac(Lul;I)V")
    public void method2966(class530 arg0) {
        if (arg0.method8365() != 255) {
            arg0.field5140--;
            this.field1790 = arg0.method8573();
        }
        this.field1791 = arg0.method8375();
    }

    @ObfuscatedName("gp.al(Lgi;I)V")
    public void method2967(class157 arg0) {
        arg0.method3033(this.field1790, this.field1791);
    }
}
