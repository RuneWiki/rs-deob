package deob;

import java.util.Comparator;

@ObfuscatedName("fs")
public class class161 implements Comparator {

    @ObfuscatedName("fs.z")
    public final boolean field2008;

    public class161(boolean arg0) {
        this.field2008 = arg0;
    }

    @ObfuscatedName("fs.z(Lko;Lko;I)I")
    public int method3207(class289 arg0, class289 arg1) {
        return this.field2008 ? arg0.field3633 - arg1.field3633 : arg1.field3633 - arg0.field3633;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3207((class289) arg0, (class289) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
