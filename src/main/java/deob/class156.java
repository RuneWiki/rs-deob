package deob;

@ObfuscatedName("ed")
public class class156 extends class276 {

    @ObfuscatedName("ed.c")
    public final boolean field1977;

    public class156(boolean arg0) {
        this.field1977 = arg0;
    }

    @ObfuscatedName("ed.c(Lje;Lje;I)I")
    public int method3181(class280 arg0, class280 arg1) {
        if (arg0.field3600 == 0 || arg1.field3600 == 0) {
            return this.method4714(arg0, arg1);
        } else if (this.field1977) {
            return arg0.field3601 - arg1.field3601;
        } else {
            return arg1.field3601 - arg0.field3601;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3181((class280) arg0, (class280) arg1);
    }
}
