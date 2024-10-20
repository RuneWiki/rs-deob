package deob;

@ObfuscatedName("fy")
public class class167 extends class285 {

    @ObfuscatedName("fy.m")
    public final boolean field2012;

    public class167(boolean arg0) {
        this.field2012 = arg0;
    }

    @ObfuscatedName("fy.m(Lkx;Lkx;I)I")
    public int method3220(class289 arg0, class289 arg1) {
        if (arg0.field3643 == arg1.field3643) {
            return this.method4799(arg0, arg1);
        } else if (this.field2012) {
            return arg0.field3643 - arg1.field3643;
        } else {
            return arg1.field3643 - arg0.field3643;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3220((class289) arg0, (class289) arg1);
    }
}
