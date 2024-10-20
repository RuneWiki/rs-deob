package deob;

import java.util.Comparator;

@ObfuscatedName("fb")
public class class161 implements Comparator {

    @ObfuscatedName("fb.n")
    public final boolean field1980;

    public class161(boolean arg0) {
        this.field1980 = arg0;
    }

    @ObfuscatedName("fb.n(Lky;Lky;B)I")
    public int method3264(class290 arg0, class290 arg1) {
        return this.field1980 ? arg0.field3647 - arg1.field3647 : arg1.field3647 - arg0.field3647;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3264((class290) arg0, (class290) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
