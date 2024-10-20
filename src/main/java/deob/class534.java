package deob;

import java.util.Comparator;

@ObfuscatedName("ud")
public class class534 implements Comparator {

    @ObfuscatedName("ud.at")
    public final boolean field5202;

    public class534(boolean arg0) {
        this.field5202 = arg0;
    }

    @ObfuscatedName("ud.at(Lrf;Lrf;B)I")
    public int method8738(class445 arg0, class445 arg1) {
        return this.field5202 ? arg0.method7428().method9089(arg1.method7428()) : arg1.method7428().method9089(arg0.method7428());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8738((class445) arg0, (class445) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
