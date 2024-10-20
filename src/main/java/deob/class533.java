package deob;

import java.util.Comparator;

@ObfuscatedName("ul")
public class class533 implements Comparator {

    @ObfuscatedName("ul.at")
    public final boolean field5201;

    public class533(boolean arg0) {
        this.field5201 = arg0;
    }

    @ObfuscatedName("ul.at(Lrf;Lrf;I)I")
    public int method8728(class445 arg0, class445 arg1) {
        return this.field5201 ? arg0.method7381(arg1) : arg1.method7381(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8728((class445) arg0, (class445) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
