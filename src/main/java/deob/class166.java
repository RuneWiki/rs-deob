package deob;

@ObfuscatedName("fx")
public class class166 extends class285 {

    @ObfuscatedName("fx.m")
    public final boolean field2006;

    public class166(boolean arg0) {
        this.field2006 = arg0;
    }

    @ObfuscatedName("fx.m(Lkx;Lkx;B)I")
    public int method3218(class289 arg0, class289 arg1) {
        if (arg0.field3643 == 0) {
            if (arg1.field3643 != 0) {
                return this.field2006 ? 1 : -1;
            }
        } else if (arg1.field3643 == 0) {
            return this.field2006 ? -1 : 1;
        }
        return this.method4799(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3218((class289) arg0, (class289) arg1);
    }
}
