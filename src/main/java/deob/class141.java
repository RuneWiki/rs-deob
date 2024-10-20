package deob;

@ObfuscatedName("ex")
public class class141 extends class284 {

    @ObfuscatedName("ex.w")
    public final boolean field1901;

    public class141(boolean arg0) {
        this.field1901 = arg0;
    }

    @ObfuscatedName("ex.w(Lkd;Lkd;I)I")
    public int method2936(class288 arg0, class288 arg1) {
        if (client.field677 == arg0.field3649 && client.field677 == arg1.field3649) {
            return this.field1901 ? arg0.field3650 - arg1.field3650 : arg1.field3650 - arg0.field3650;
        } else {
            return this.method4931(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2936((class288) arg0, (class288) arg1);
    }
}
