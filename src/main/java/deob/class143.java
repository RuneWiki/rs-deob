package deob;

@ObfuscatedName("ee")
public class class143 extends class286 {

    @ObfuscatedName("ee.v")
    public final boolean field1934;

    public class143(boolean arg0) {
        this.field1934 = arg0;
    }

    @ObfuscatedName("ee.v(Lkx;Lkx;I)I")
    public int method2910(class290 arg0, class290 arg1) {
        if (client.field711 == arg0.field3664 && client.field711 == arg1.field3664) {
            return this.field1934 ? arg0.field3662 - arg1.field3662 : arg1.field3662 - arg0.field3662;
        } else {
            return this.method4967(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2910((class290) arg0, (class290) arg1);
    }
}
