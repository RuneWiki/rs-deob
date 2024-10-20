package deob;

@ObfuscatedName("ev")
public class class143 extends class284 {

    @ObfuscatedName("ev.w")
    public final boolean field1910;

    public class143(boolean arg0) {
        this.field1910 = arg0;
    }

    @ObfuscatedName("ev.w(Lkd;Lkd;I)I")
    public int method2948(class288 arg0, class288 arg1) {
        if (arg0.field3649 == 0) {
            if (arg1.field3649 != 0) {
                return this.field1910 ? 1 : -1;
            }
        } else if (arg1.field3649 == 0) {
            return this.field1910 ? -1 : 1;
        }
        return this.method4931(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2948((class288) arg0, (class288) arg1);
    }
}
