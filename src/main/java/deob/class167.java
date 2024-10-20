package deob;

@ObfuscatedName("fp")
public class class167 extends class285 {

    @ObfuscatedName("fp.x")
    public final boolean field1996;

    public class167(boolean arg0) {
        this.field1996 = arg0;
    }

    @ObfuscatedName("fp.x(Lke;Lke;I)I")
    public int method3231(class289 arg0, class289 arg1) {
        if (arg0.field3611 == arg1.field3611) {
            return this.method4715(arg0, arg1);
        } else if (this.field1996) {
            return arg0.field3611 - arg1.field3611;
        } else {
            return arg1.field3611 - arg0.field3611;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3231((class289) arg0, (class289) arg1);
    }
}
