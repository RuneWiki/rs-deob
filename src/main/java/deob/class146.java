package deob;

@ObfuscatedName("eq")
public class class146 extends class284 {

    @ObfuscatedName("eq.w")
    public final boolean field1925;

    public class146(boolean arg0) {
        this.field1925 = arg0;
    }

    @ObfuscatedName("eq.w(Lkd;Lkd;I)I")
    public int method2962(class288 arg0, class288 arg1) {
        if (arg0.field3649 == 0 || arg1.field3649 == 0) {
            return this.method4931(arg0, arg1);
        } else if (this.field1925) {
            return arg0.method4910().method5050(arg1.method4910());
        } else {
            return arg1.method4910().method5050(arg0.method4910());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2962((class288) arg0, (class288) arg1);
    }
}
