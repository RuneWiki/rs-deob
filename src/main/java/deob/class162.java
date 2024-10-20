package deob;

@ObfuscatedName("ft")
public class class162 extends class285 {

    @ObfuscatedName("ft.m")
    public final boolean field1993;

    public class162(boolean arg0) {
        this.field1993 = arg0;
    }

    @ObfuscatedName("ft.m(Lkx;Lkx;I)I")
    public int method3187(class289 arg0, class289 arg1) {
        if (client.field729 == arg0.field3643 && client.field729 == arg1.field3643) {
            return this.field1993 ? arg0.method4796().method4927(arg1.method4796()) : arg1.method4796().method4927(arg0.method4796());
        } else {
            return this.method4799(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3187((class289) arg0, (class289) arg1);
    }
}
