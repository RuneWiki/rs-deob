package deob;

@ObfuscatedName("eu")
public class class141 extends class286 {

    @ObfuscatedName("eu.v")
    public final boolean field1924;

    public class141(boolean arg0) {
        this.field1924 = arg0;
    }

    @ObfuscatedName("eu.v(Lkx;Lkx;S)I")
    public int method2896(class290 arg0, class290 arg1) {
        if (client.field711 == arg0.field3664 && client.field711 == arg1.field3664) {
            return this.field1924 ? arg0.method4951().method5086(arg1.method4951()) : arg1.method4951().method5086(arg0.method4951());
        } else {
            return this.method4967(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2896((class290) arg0, (class290) arg1);
    }
}
