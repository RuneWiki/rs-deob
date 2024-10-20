package deob;

@ObfuscatedName("ft")
public class class157 extends class275 {

    @ObfuscatedName("ft.c")
    public final boolean field1956;

    public class157(boolean arg0) {
        this.field1956 = arg0;
    }

    @ObfuscatedName("ft.c(Lje;Lje;I)I")
    public int method3145(class279 arg0, class279 arg1) {
        if (arg0.field3582 == 0) {
            if (arg1.field3582 != 0) {
                return this.field1956 ? 1 : -1;
            }
        } else if (arg1.field3582 == 0) {
            return this.field1956 ? -1 : 1;
        }
        return this.method4697(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3145((class279) arg0, (class279) arg1);
    }
}
