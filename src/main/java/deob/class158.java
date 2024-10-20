package deob;

@ObfuscatedName("fp")
public class class158 extends class276 {

    @ObfuscatedName("fp.c")
    public final boolean field1984;

    public class158(boolean arg0) {
        this.field1984 = arg0;
    }

    @ObfuscatedName("fp.c(Lje;Lje;I)I")
    public int method3193(class280 arg0, class280 arg1) {
        if (arg0.field3600 == arg1.field3600) {
            return this.method4714(arg0, arg1);
        } else if (this.field1984) {
            return arg0.field3600 - arg1.field3600;
        } else {
            return arg1.field3600 - arg0.field3600;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3193((class280) arg0, (class280) arg1);
    }
}
