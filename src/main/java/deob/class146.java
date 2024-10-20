package deob;

@ObfuscatedName("fk")
public class class146 extends class145 {

    // $FF: synthetic field
    public final class148 this$0;

    @ObfuscatedName("fk.az")
    public int field1679;

    @ObfuscatedName("fk.ah")
    public boolean field1678;

    public class146(class148 arg0) {
        this.this$0 = arg0;
        this.field1679 = -1;
    }

    @ObfuscatedName("fk.az(Lur;I)V")
    public void method2978(class535 arg0) {
        this.field1679 = arg0.method8670();
        this.field1678 = arg0.method8462() == 1;
    }

    @ObfuscatedName("fk.ah(Lfp;B)V")
    public void method2980(class156 arg0) {
        arg0.method3033(this.field1679, this.field1678);
    }
}
