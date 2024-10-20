package deob;

import java.util.Comparator;

@ObfuscatedName("uj")
public class class541 implements Comparator {

    @ObfuscatedName("uj.aq")
    public final boolean field5267;

    public class541(boolean arg0) {
        this.field5267 = arg0;
    }

    @ObfuscatedName("uj.aq(Lra;Lra;I)I")
    public int method8878(class452 arg0, class452 arg1) {
        return this.field5267 ? arg0.method7559().method9190(arg1.method7559()) : arg1.method7559().method9190(arg0.method7559());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8878((class452) arg0, (class452) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
