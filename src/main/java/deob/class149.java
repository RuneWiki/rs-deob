package deob;

@ObfuscatedName("fm")
public class class149 extends class157 {

    // $FF: synthetic field
    public final class158 this$0;

    @ObfuscatedName("fm.aj")
    public int field1673;

    public class149(class158 arg0) {
        this.this$0 = arg0;
        this.field1673 = -1;
    }

    @ObfuscatedName("fm.aj(Lsy;I)V")
    public void method2959(class478 arg0) {
        this.field1673 = arg0.method7905();
        arg0.method7909();
        if (arg0.method7909() != 255) {
            arg0.field4904--;
            arg0.method7949();
        }
    }

    @ObfuscatedName("fm.al(Lgn;B)V")
    public void method2961(class161 arg0) {
        arg0.method3074(this.field1673);
    }
}
