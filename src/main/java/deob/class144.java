package deob;

@ObfuscatedName("eh")
public class class144 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("eh.f")
    public int field1669;

    @ObfuscatedName("eh.w")
    public byte field1672;

    public class144(class143 arg0) {
        this.this$0 = arg0;
        this.field1669 = -1;
    }

    @ObfuscatedName("eh.f(Lrd;S)V")
    public void method2984(class474 arg0) {
        this.field1669 = arg0.method8032();
        this.field1672 = arg0.method7965();
    }

    @ObfuscatedName("eh.w(Leb;B)V")
    public void method2983(class151 arg0) {
        arg0.method3060(this.field1669, this.field1672);
    }
}
