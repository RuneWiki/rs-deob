package deob;

@ObfuscatedName("em")
public class class142 extends class284 {

    @ObfuscatedName("em.w")
    public final boolean field1906;

    public class142(boolean arg0) {
        this.field1906 = arg0;
    }

    @ObfuscatedName("em.w(Lkd;Lkd;S)I")
    public int method2941(class288 arg0, class288 arg1) {
        if (arg0.field3649 == 0 || arg1.field3649 == 0) {
            return this.method4931(arg0, arg1);
        } else if (this.field1906) {
            return arg0.field3650 - arg1.field3650;
        } else {
            return arg1.field3650 - arg0.field3650;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2941((class288) arg0, (class288) arg1);
    }
}
