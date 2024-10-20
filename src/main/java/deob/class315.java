package deob;

import java.util.Comparator;

@ObfuscatedName("lr")
public class class315 implements Comparator {

    @ObfuscatedName("lr.c")
    public final boolean field3817;

    public class315(boolean arg0) {
        this.field3817 = arg0;
    }

    @ObfuscatedName("lr.c(Ljk;Ljk;I)I")
    public int method5482(class275 arg0, class275 arg1) {
        return this.field3817 ? arg0.method4693(arg1) : arg1.method4693(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5482((class275) arg0, (class275) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
