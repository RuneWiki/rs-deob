package deob;

@ObfuscatedName("fl")
public class class157 extends class276 {

    @ObfuscatedName("fl.c")
    public final boolean field1983;

    public class157(boolean arg0) {
        this.field1983 = arg0;
    }

    @ObfuscatedName("fl.c(Lje;Lje;I)I")
    public int method3187(class280 arg0, class280 arg1) {
        if (arg0.field3600 == 0) {
            if (arg1.field3600 != 0) {
                return this.field1983 ? 1 : -1;
            }
        } else if (arg1.field3600 == 0) {
            return this.field1983 ? -1 : 1;
        }
        return this.method4714(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3187((class280) arg0, (class280) arg1);
    }
}
