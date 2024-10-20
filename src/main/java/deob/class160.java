package deob;

@ObfuscatedName("fs")
public class class160 extends class276 {

    @ObfuscatedName("fs.c")
    public final boolean field1990;

    public class160(boolean arg0) {
        this.field1990 = arg0;
    }

    @ObfuscatedName("fs.c(Lje;Lje;B)I")
    public int method3213(class280 arg0, class280 arg1) {
        if (arg0.field3600 == 0 || arg1.field3600 == 0) {
            return this.method4714(arg0, arg1);
        } else if (this.field1990) {
            return arg0.method4689().method4832(arg1.method4689());
        } else {
            return arg1.method4689().method4832(arg0.method4689());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3213((class280) arg0, (class280) arg1);
    }
}
