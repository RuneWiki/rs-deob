package deob;

import java.util.Comparator;

@ObfuscatedName("vq")
public class class552 implements Comparator {

    @ObfuscatedName("vq.ak")
    public final boolean field5405;

    public class552(boolean arg0) {
        this.field5405 = arg0;
    }

    @ObfuscatedName("vq.ak(Lsg;Lsg;I)I")
    public int method9078(class470 arg0, class470 arg1) {
        return this.field5405 ? arg0.method7852(arg1) : arg1.method7852(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9078((class470) arg0, (class470) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
