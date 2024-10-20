package deob;

@ObfuscatedName("fx")
public class class159 extends class276 {

    @ObfuscatedName("fx.c")
    public final boolean field1987;

    public class159(boolean arg0) {
        this.field1987 = arg0;
    }

    @ObfuscatedName("fx.c(Lje;Lje;I)I")
    public int method3204(class280 arg0, class280 arg1) {
        if (arg0.field3602 == arg1.field3602) {
            return this.method4714(arg0, arg1);
        } else if (this.field1987) {
            return arg0.field3602 - arg1.field3602;
        } else {
            return arg1.field3602 - arg0.field3602;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3204((class280) arg0, (class280) arg1);
    }
}
