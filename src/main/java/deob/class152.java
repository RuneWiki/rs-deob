package deob;

import java.util.Comparator;

@ObfuscatedName("er")
public class class152 implements Comparator {

    @ObfuscatedName("er.c")
    public final boolean field1938;

    public class152(boolean arg0) {
        this.field1938 = arg0;
    }

    @ObfuscatedName("er.c(Lje;Lje;B)I")
    public int method3103(class279 arg0, class279 arg1) {
        return this.field1938 ? arg0.field3581 - arg1.field3581 : arg1.field3581 - arg0.field3581;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3103((class279) arg0, (class279) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
