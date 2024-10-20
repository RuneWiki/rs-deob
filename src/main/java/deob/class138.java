package deob;

import java.util.Comparator;

@ObfuscatedName("ej")
public class class138 implements Comparator {

    @ObfuscatedName("ej.w")
    public final boolean field1888;

    public class138(boolean arg0) {
        this.field1888 = arg0;
    }

    @ObfuscatedName("ej.w(Lkd;Lkd;I)I")
    public int method2913(class288 arg0, class288 arg1) {
        return this.field1888 ? arg0.field3650 - arg1.field3650 : arg1.field3650 - arg0.field3650;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2913((class288) arg0, (class288) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
