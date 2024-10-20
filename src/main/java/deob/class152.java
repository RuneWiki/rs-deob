package deob;

@ObfuscatedName("et")
public class class152 extends class156 {

    // $FF: synthetic field
    public final class157 this$0;

    @ObfuscatedName("et.f")
    public String field1745;

    @ObfuscatedName("et.w")
    public int field1749;

    @ObfuscatedName("et.v")
    public byte field1746;

    public class152(class157 arg0) {
        this.this$0 = arg0;
        this.field1745 = null;
    }

    @ObfuscatedName("et.f(Lrd;B)V")
    public void method3007(class474 arg0) {
        if (arg0.method7964() != 255) {
            arg0.field4939--;
            arg0.method8151();
        }
        this.field1745 = arg0.method7973();
        this.field1749 = arg0.method8032();
        this.field1746 = arg0.method7965();
        arg0.method8151();
    }

    @ObfuscatedName("et.w(Lfm;I)V")
    public void method3008(class160 arg0) {
        class142 var2 = new class142();
        var2.field1656 = new class497(this.field1745);
        var2.field1659 = this.field1749;
        var2.field1657 = this.field1746;
        arg0.method3115(var2);
    }
}
