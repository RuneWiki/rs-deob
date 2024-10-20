package deob;

@ObfuscatedName("ek")
public class class139 extends class284 {

    @ObfuscatedName("ek.w")
    public final boolean field1893;

    public class139(boolean arg0) {
        this.field1893 = arg0;
    }

    @ObfuscatedName("ek.w(Lkd;Lkd;I)I")
    public int method2920(class288 arg0, class288 arg1) {
        if (client.field677 == arg0.field3649 && client.field677 == arg1.field3649) {
            return this.field1893 ? arg0.method4910().method5050(arg1.method4910()) : arg1.method4910().method5050(arg0.method4910());
        } else {
            return this.method4931(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2920((class288) arg0, (class288) arg1);
    }
}
