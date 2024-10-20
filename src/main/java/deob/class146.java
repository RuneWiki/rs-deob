package deob;

@ObfuscatedName("er")
public class class146 extends class286 {

    @ObfuscatedName("er.v")
    public final boolean field1949;

    public class146(boolean arg0) {
        this.field1949 = arg0;
    }

    @ObfuscatedName("er.v(Lkx;Lkx;B)I")
    public int method2933(class290 arg0, class290 arg1) {
        if (arg0.field3664 == arg1.field3664) {
            return this.method4967(arg0, arg1);
        } else if (this.field1949) {
            return arg0.field3664 - arg1.field3664;
        } else {
            return arg1.field3664 - arg0.field3664;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2933((class290) arg0, (class290) arg1);
    }
}
