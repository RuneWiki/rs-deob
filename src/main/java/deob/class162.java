package deob;

@ObfuscatedName("ge")
public class class162 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("ge.af")
    public long field1784;

    @ObfuscatedName("ge.an")
    public String field1782;

    public class162(class143 arg0) {
        this.this$0 = arg0;
        this.field1784 = -1L;
        this.field1782 = null;
    }

    @ObfuscatedName("ge.af(Lsg;I)V")
    public void method3021(class489 arg0) {
        if (arg0.method8248() != 255) {
            arg0.field4989--;
            this.field1784 = arg0.method8271();
        }
        this.field1782 = arg0.method8305();
    }

    @ObfuscatedName("ge.an(Lfj;I)V")
    public void method3022(class151 arg0) {
        arg0.method3089(this.field1784, this.field1782);
    }
}
