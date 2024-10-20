package deob;

@ObfuscatedName("eq")
public class class151 extends class289 {

    @ObfuscatedName("eq.n")
    public final boolean field1979;

    public class151(boolean arg0) {
        this.field1979 = arg0;
    }

    @ObfuscatedName("eq.n(Lkx;Lkx;B)I")
    public int method3177(class293 arg0, class293 arg1) {
        if (arg0.field3701 == arg1.field3701) {
            return this.method5147(arg0, arg1);
        } else if (this.field1979) {
            return arg0.field3701 - arg1.field3701;
        } else {
            return arg1.field3701 - arg0.field3701;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3177((class293) arg0, (class293) arg1);
    }
}
