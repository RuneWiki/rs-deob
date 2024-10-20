package deob;

@ObfuscatedName("fa")
public class class159 extends class137 {

    // $FF: synthetic field
    public final class140 this$0;

    @ObfuscatedName("fa.h")
    public long field1813;

    @ObfuscatedName("fa.e")
    public String field1809;

    public class159(class140 arg0) {
        this.this$0 = arg0;
        this.field1813 = -1L;
        this.field1809 = null;
    }

    @ObfuscatedName("fa.h(Lqy;I)V")
    public void method2882(class467 arg0) {
        if (arg0.method7792() != 255) {
            arg0.field4915--;
            this.field1813 = arg0.method7958();
        }
        this.field1809 = arg0.method7800();
    }

    @ObfuscatedName("fa.e(Lep;I)V")
    public void method2881(class148 arg0) {
        arg0.method2939(this.field1813, this.field1809);
    }
}
