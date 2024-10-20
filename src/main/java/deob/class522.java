package deob;

import java.util.Comparator;

@ObfuscatedName("uj")
public class class522 implements Comparator {

    @ObfuscatedName("uj.au")
    public final boolean field5173;

    public class522(boolean arg0) {
        this.field5173 = arg0;
    }

    @ObfuscatedName("uj.au(Lqs;Lqs;I)I")
    public int method8590(class433 arg0, class433 arg1) {
        return this.field5173 ? arg0.method7250().method8912(arg1.method7250()) : arg1.method7250().method8912(arg0.method7250());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8590((class433) arg0, (class433) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
