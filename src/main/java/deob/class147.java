package deob;

@ObfuscatedName("ff")
public class class147 extends class146 {

    // $FF: synthetic field
    public final class149 this$0;

    @ObfuscatedName("ff.aq")
    public int field1675;

    @ObfuscatedName("ff.aw")
    public boolean field1674;

    public class147(class149 arg0) {
        this.this$0 = arg0;
        this.field1675 = -1;
    }

    @ObfuscatedName("ff.aq(Luq;I)V")
    public void method3033(class534 arg0) {
        this.field1675 = arg0.method8593();
        this.field1674 = arg0.method8591() == 1;
    }

    @ObfuscatedName("ff.aw(Lgt;I)V")
    public void method3030(class157 arg0) {
        arg0.method3098(this.field1675, this.field1674);
    }
}
