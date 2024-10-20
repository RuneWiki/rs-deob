package deob;

@ObfuscatedName("en")
public class class149 extends class153 {

    // $FF: synthetic field
    public final class154 this$0;

    @ObfuscatedName("en.h")
    public String field1749;

    @ObfuscatedName("en.e")
    public int field1748;

    @ObfuscatedName("en.v")
    public byte field1750;

    public class149(class154 arg0) {
        this.this$0 = arg0;
        this.field1749 = null;
    }

    @ObfuscatedName("en.h(Lqy;I)V")
    public void method2911(class467 arg0) {
        if (arg0.method7792() != 255) {
            arg0.field4915--;
            arg0.method7958();
        }
        this.field1749 = arg0.method7800();
        this.field1748 = arg0.method7794();
        this.field1750 = arg0.method7793();
        arg0.method7958();
    }

    @ObfuscatedName("en.e(Lfn;I)V")
    public void method2916(class157 arg0) {
        class139 var2 = new class139();
        var2.field1662 = new class490(this.field1749);
        var2.field1664 = this.field1748;
        var2.field1665 = this.field1750;
        arg0.method3029(var2);
    }
}
