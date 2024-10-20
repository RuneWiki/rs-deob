package deob;

import java.util.Comparator;

@ObfuscatedName("vq")
public class class557 implements Comparator {

    @ObfuscatedName("vq.ac")
    public final boolean field5475;

    public class557(boolean arg0) {
        this.field5475 = arg0;
    }

    @ObfuscatedName("vq.ac(Lss;Lss;I)I")
    public int method9272(class474 arg0, class474 arg1) {
        return this.field5475 ? arg0.method8037(arg1) : arg1.method8037(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9272((class474) arg0, (class474) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
