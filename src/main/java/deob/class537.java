package deob;

import java.util.Comparator;

@ObfuscatedName("ux")
public class class537 implements Comparator {

    @ObfuscatedName("ux.ac")
    public final boolean field5204;

    public class537(boolean arg0) {
        this.field5204 = arg0;
    }

    @ObfuscatedName("ux.ac(Lrp;Lrp;B)I")
    public int method8677(class448 arg0, class448 arg1) {
        return this.field5204 ? arg0.method7329().method8989(arg1.method7329()) : arg1.method7329().method8989(arg0.method7329());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8677((class448) arg0, (class448) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
