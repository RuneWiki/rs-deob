package deob;

@ObfuscatedName("fb")
public class class139 extends class141 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("fb.aj")
    public long field1611;

    @ObfuscatedName("fb.al")
    public String field1609;

    public class139(class144 arg0) {
        this.this$0 = arg0;
        this.field1611 = -1L;
        this.field1609 = null;
    }

    @ObfuscatedName("fb.aj(Lsy;I)V")
    public void method2930(class478 arg0) {
        if (arg0.method7909() != 255) {
            arg0.field4904--;
            this.field1611 = arg0.method7949();
        }
        this.field1609 = arg0.method8048();
    }

    @ObfuscatedName("fb.al(Lfi;B)V")
    public void method2932(class152 arg0) {
        arg0.method2982(this.field1611, this.field1609, 0);
    }
}
