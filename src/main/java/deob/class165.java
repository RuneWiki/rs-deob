package deob;

@ObfuscatedName("fv")
public class class165 extends class285 {

    @ObfuscatedName("fv.x")
    public final boolean field1993;

    public class165(boolean arg0) {
        this.field1993 = arg0;
    }

    @ObfuscatedName("fv.x(Lke;Lke;I)I")
    public int method3213(class289 arg0, class289 arg1) {
        if (arg0.field3611 == 0 || arg1.field3611 == 0) {
            return this.method4715(arg0, arg1);
        } else if (this.field1993) {
            return arg0.field3610 - arg1.field3610;
        } else {
            return arg1.field3610 - arg0.field3610;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3213((class289) arg0, (class289) arg1);
    }
}
