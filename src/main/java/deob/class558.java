package deob;

import java.util.Comparator;

@ObfuscatedName("vj")
public class class558 implements Comparator {

    @ObfuscatedName("vj.ac")
    public final boolean field5478;

    public class558(boolean arg0) {
        this.field5478 = arg0;
    }

    @ObfuscatedName("vj.ac(Lss;Lss;I)I")
    public int method9285(class474 arg0, class474 arg1) {
        return this.field5478 ? arg0.method8064().method9625(arg1.method8064()) : arg1.method8064().method9625(arg0.method8064());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9285((class474) arg0, (class474) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
