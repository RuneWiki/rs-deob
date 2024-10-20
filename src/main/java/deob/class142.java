package deob;

@ObfuscatedName("fv")
public class class142 extends class141 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("fv.aj")
    public int field1616;

    @ObfuscatedName("fv.al")
    public boolean field1617;

    public class142(class144 arg0) {
        this.this$0 = arg0;
        this.field1616 = -1;
    }

    @ObfuscatedName("fv.aj(Lsy;I)V")
    public void method2930(class478 arg0) {
        this.field1616 = arg0.method7905();
        this.field1617 = arg0.method7909() == 1;
    }

    @ObfuscatedName("fv.al(Lfi;B)V")
    public void method2932(class152 arg0) {
        arg0.method2989(this.field1616, this.field1617);
    }
}
