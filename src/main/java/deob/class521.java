package deob;

import java.util.Comparator;

@ObfuscatedName("ua")
public class class521 implements Comparator {

    @ObfuscatedName("ua.au")
    public final boolean field5172;

    public class521(boolean arg0) {
        this.field5172 = arg0;
    }

    @ObfuscatedName("ua.au(Lqs;Lqs;B)I")
    public int method8588(class433 arg0, class433 arg1) {
        return this.field5172 ? arg0.method7227(arg1) : arg1.method7227(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8588((class433) arg0, (class433) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
