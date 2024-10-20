package deob;

@ObfuscatedName("fu")
public class class153 extends class161 {

    // $FF: synthetic field
    public final class162 this$0;

    @ObfuscatedName("fu.at")
    public int field1685;

    public class153(class162 arg0) {
        this.this$0 = arg0;
        this.field1685 = -1;
    }

    @ObfuscatedName("fu.at(Luj;I)V")
    public void method3069(class527 arg0) {
        this.field1685 = arg0.method8412();
        arg0.method8410();
        if (arg0.method8410() != 255) {
            arg0.field5137--;
            arg0.method8417();
        }
    }

    @ObfuscatedName("fu.ah(Lgn;B)V")
    public void method3070(class165 arg0) {
        arg0.method3183(this.field1685);
    }
}
