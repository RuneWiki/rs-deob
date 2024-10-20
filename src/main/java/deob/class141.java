package deob;

@ObfuscatedName("ed")
public class class141 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("ed.f")
    public int field1653;

    @ObfuscatedName("ed.w")
    public boolean field1652;

    public class141(class143 arg0) {
        this.this$0 = arg0;
        this.field1653 = -1;
    }

    @ObfuscatedName("ed.f(Lrd;S)V")
    public void method2984(class474 arg0) {
        this.field1653 = arg0.method8032();
        this.field1652 = arg0.method7964() == 1;
    }

    @ObfuscatedName("ed.w(Leb;B)V")
    public void method2983(class151 arg0) {
        arg0.method3036(this.field1653, this.field1652);
    }
}
