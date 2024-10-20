package deob;

@ObfuscatedName("fp")
public class class154 extends class162 {

    // $FF: synthetic field
    public final class163 this$0;

    @ObfuscatedName("fp.ac")
    public int field1693;

    public class154(class163 arg0) {
        this.this$0 = arg0;
        this.field1693 = -1;
    }

    @ObfuscatedName("fp.ac(Lul;B)V")
    public void method3000(class530 arg0) {
        this.field1693 = arg0.method8598();
        arg0.method8365();
        if (arg0.method8365() != 255) {
            arg0.field5140--;
            arg0.method8573();
        }
    }

    @ObfuscatedName("fp.al(Lgb;B)V")
    public void method3008(class166 arg0) {
        arg0.method3119(this.field1693);
    }
}
