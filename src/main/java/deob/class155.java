package deob;

@ObfuscatedName("em")
public class class155 extends class140 {

    // $FF: synthetic field
    public final class143 this$0;

    @ObfuscatedName("em.f")
    public long field1764;

    @ObfuscatedName("em.w")
    public String field1766;

    @ObfuscatedName("em.v")
    public int field1765;

    public class155(class143 arg0) {
        this.this$0 = arg0;
        this.field1764 = -1L;
        this.field1766 = null;
        this.field1765 = 0;
    }

    @ObfuscatedName("em.f(Lrd;S)V")
    public void method2984(class474 arg0) {
        if (arg0.method7964() != 255) {
            arg0.field4939--;
            this.field1764 = arg0.method8151();
        }
        this.field1766 = arg0.method7973();
        this.field1765 = arg0.method8032();
    }

    @ObfuscatedName("em.w(Leb;B)V")
    public void method2983(class151 arg0) {
        arg0.method3029(this.field1764, this.field1766, this.field1765);
    }
}
