package deob;

@ObfuscatedName("eg")
public class class149 extends class289 {

    @ObfuscatedName("eg.n")
    public final boolean field1965;

    public class149(boolean arg0) {
        this.field1965 = arg0;
    }

    @ObfuscatedName("eg.n(Lkx;Lkx;I)I")
    public int method3157(class293 arg0, class293 arg1) {
        if (arg0.field3701 == 0 || arg1.field3701 == 0) {
            return this.method5147(arg0, arg1);
        } else if (this.field1965) {
            return arg0.field3702 - arg1.field3702;
        } else {
            return arg1.field3702 - arg0.field3702;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3157((class293) arg0, (class293) arg1);
    }
}
