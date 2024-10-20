package deob;

import java.util.Comparator;

@ObfuscatedName("ty")
public class class496 implements Comparator {

    @ObfuscatedName("ty.af")
    public final boolean field5057;

    public class496(boolean arg0) {
        this.field5057 = arg0;
    }

    @ObfuscatedName("ty.af(Lpw;Lpw;I)I")
    public int method8551(class408 arg0, class408 arg1) {
        return this.field5057 ? arg0.method7167().method8845(arg1.method7167()) : arg1.method7167().method8845(arg0.method7167());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8551((class408) arg0, (class408) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
