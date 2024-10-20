package deob;

@ObfuscatedName("fk")
public class class165 extends class285 {

    @ObfuscatedName("fk.m")
    public final boolean field2000;

    public class165(boolean arg0) {
        this.field2000 = arg0;
    }

    @ObfuscatedName("fk.m(Lkx;Lkx;B)I")
    public int method3206(class289 arg0, class289 arg1) {
        if (arg0.field3643 == 0 || arg1.field3643 == 0) {
            return this.method4799(arg0, arg1);
        } else if (this.field2000) {
            return arg0.field3641 - arg1.field3641;
        } else {
            return arg1.field3641 - arg0.field3641;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3206((class289) arg0, (class289) arg1);
    }
}
