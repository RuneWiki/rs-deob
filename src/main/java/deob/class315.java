package deob;

import java.util.Comparator;

@ObfuscatedName("lq")
public class class315 implements Comparator {

    @ObfuscatedName("lq.q")
    public final boolean field3846;

    public class315(boolean arg0) {
        this.field3846 = arg0;
    }

    @ObfuscatedName("lq.q(Ljd;Ljd;I)I")
    public int method5443(class275 arg0, class275 arg1) {
        return this.field3846 ? arg0.method4660(arg1) : arg1.method4660(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5443((class275) arg0, (class275) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
