package deob;

@ObfuscatedName("er")
public class class152 extends class289 {

    @ObfuscatedName("er.n")
    public final boolean field1981;

    public class152(boolean arg0) {
        this.field1981 = arg0;
    }

    @ObfuscatedName("er.n(Lkx;Lkx;I)I")
    public int method3186(class293 arg0, class293 arg1) {
        if (arg0.field3703 == arg1.field3703) {
            return this.method5147(arg0, arg1);
        } else if (this.field1981) {
            return arg0.field3703 - arg1.field3703;
        } else {
            return arg1.field3703 - arg0.field3703;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3186((class293) arg0, (class293) arg1);
    }
}
