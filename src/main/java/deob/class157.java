package deob;

@ObfuscatedName("fq")
public class class157 extends class287 {

    @ObfuscatedName("fq.m")
    public final boolean field1965;

    public class157(boolean arg0) {
        this.field1965 = arg0;
    }

    @ObfuscatedName("fq.m(Lke;Lke;I)I")
    public int method3090(class291 arg0, class291 arg1) {
        if (arg0.field3703 == arg1.field3703) {
            return this.method5011(arg0, arg1);
        } else if (this.field1965) {
            return arg0.field3703 - arg1.field3703;
        } else {
            return arg1.field3703 - arg0.field3703;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3090((class291) arg0, (class291) arg1);
    }
}
