package deob;

@ObfuscatedName("fh")
public class class159 extends class275 {

    @ObfuscatedName("fh.c")
    public final boolean field1965;

    public class159(boolean arg0) {
        this.field1965 = arg0;
    }

    @ObfuscatedName("fh.c(Lje;Lje;S)I")
    public int method3165(class279 arg0, class279 arg1) {
        if (arg0.field3580 == arg1.field3580) {
            return this.method4697(arg0, arg1);
        } else if (this.field1965) {
            return arg0.field3580 - arg1.field3580;
        } else {
            return arg1.field3580 - arg0.field3580;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3165((class279) arg0, (class279) arg1);
    }
}
