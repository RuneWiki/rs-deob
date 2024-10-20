package deob;

import java.util.Comparator;

@ObfuscatedName("ed")
public class class150 implements Comparator {

    @ObfuscatedName("ed.g")
    public final boolean field2109;

    public class150(boolean arg0) {
        this.field2109 = arg0;
    }

    @ObfuscatedName("ed.g(Lku;Lku;I)I")
    public int method2960(class302 arg0, class302 arg1) {
        return this.field2109 ? arg0.field3852 - arg1.field3852 : arg1.field3852 - arg0.field3852;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2960((class302) arg0, (class302) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
