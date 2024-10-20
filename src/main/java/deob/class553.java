package deob;

import java.util.Comparator;

@ObfuscatedName("vd")
public class class553 implements Comparator {

    @ObfuscatedName("vd.ak")
    public final boolean field5406;

    public class553(boolean arg0) {
        this.field5406 = arg0;
    }

    @ObfuscatedName("vd.ak(Lsg;Lsg;I)I")
    public int method9089(class470 arg0, class470 arg1) {
        return this.field5406 ? arg0.method7890().method9400(arg1.method7890()) : arg1.method7890().method9400(arg0.method7890());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9089((class470) arg0, (class470) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
