package deob;

@ObfuscatedName("gz")
public class class163 extends class141 {

    // $FF: synthetic field
    public final class144 this$0;

    @ObfuscatedName("gz.aj")
    public long field1771;

    @ObfuscatedName("gz.al")
    public String field1770;

    public class163(class144 arg0) {
        this.this$0 = arg0;
        this.field1771 = -1L;
        this.field1770 = null;
    }

    @ObfuscatedName("gz.aj(Lsy;I)V")
    public void method2930(class478 arg0) {
        if (arg0.method7909() != 255) {
            arg0.field4904--;
            this.field1771 = arg0.method7949();
        }
        this.field1770 = arg0.method8048();
    }

    @ObfuscatedName("gz.al(Lfi;B)V")
    public void method2932(class152 arg0) {
        arg0.method2985(this.field1771, this.field1770);
    }
}
