package deob;

@ObfuscatedName("fp")
public class class163 extends class285 {

    @ObfuscatedName("fp.m")
    public final boolean field1996;

    public class163(boolean arg0) {
        this.field1996 = arg0;
    }

    @ObfuscatedName("fp.m(Lkx;Lkx;B)I")
    public int method3194(class289 arg0, class289 arg1) {
        if (client.field729 == arg0.field3643) {
            if (client.field729 != arg1.field3643) {
                return this.field1996 ? -1 : 1;
            }
        } else if (client.field729 == arg1.field3643) {
            return this.field1996 ? 1 : -1;
        }
        return this.method4799(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3194((class289) arg0, (class289) arg1);
    }
}
