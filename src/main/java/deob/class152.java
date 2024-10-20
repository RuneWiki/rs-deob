package deob;

import java.util.Comparator;

@ObfuscatedName("ez")
public class class152 implements Comparator {

    @ObfuscatedName("ez.c")
    public final boolean field1961;

    public class152(boolean arg0) {
        this.field1961 = arg0;
    }

    @ObfuscatedName("ez.c(Lje;Lje;I)I")
    public int method3149(class280 arg0, class280 arg1) {
        return this.field1961 ? arg0.field3601 - arg1.field3601 : arg1.field3601 - arg0.field3601;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3149((class280) arg0, (class280) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
