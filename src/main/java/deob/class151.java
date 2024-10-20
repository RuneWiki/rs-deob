package deob;

@ObfuscatedName("ed")
public class class151 extends class129 {

    // $FF: synthetic field
    public final class132 this$0;

    @ObfuscatedName("ed.s")
    public long field1686;

    @ObfuscatedName("ed.h")
    public String field1679;

    public class151(class132 arg0) {
        this.this$0 = arg0;
        this.field1686 = -1L;
        this.field1679 = null;
    }

    @ObfuscatedName("ed.s(Lqr;I)V")
    public void method2621(class444 arg0) {
        if (arg0.method6929() != 255) {
            arg0.field4708--;
            this.field1686 = arg0.method6935();
        }
        this.field1679 = arg0.method6938();
    }

    @ObfuscatedName("ed.h(Leh;B)V")
    public void method2622(class140 arg0) {
        arg0.method2680(this.field1686, this.field1679);
    }
}
