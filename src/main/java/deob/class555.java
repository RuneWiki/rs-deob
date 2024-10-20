package deob;

import java.util.Comparator;

@ObfuscatedName("va")
public class class555 implements Comparator {

    @ObfuscatedName("va.ab")
    public final boolean field5443;

    public class555(boolean arg0) {
        this.field5443 = arg0;
    }

    @ObfuscatedName("va.ab(Lsz;Lsz;B)I")
    public int method9098(class472 arg0, class472 arg1) {
        return this.field5443 ? arg0.method7906(arg1) : arg1.method7906(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9098((class472) arg0, (class472) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
