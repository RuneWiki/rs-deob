package deob;

@ObfuscatedName("fm")
public class class160 extends class275 {

    @ObfuscatedName("fm.c")
    public final boolean field1969;

    public class160(boolean arg0) {
        this.field1969 = arg0;
    }

    @ObfuscatedName("fm.c(Lje;Lje;I)I")
    public int method3171(class279 arg0, class279 arg1) {
        if (arg0.field3582 == 0 || arg1.field3582 == 0) {
            return this.method4697(arg0, arg1);
        } else if (this.field1969) {
            return arg0.method4683().method4818(arg1.method4683());
        } else {
            return arg1.method4683().method4818(arg0.method4683());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3171((class279) arg0, (class279) arg1);
    }
}
