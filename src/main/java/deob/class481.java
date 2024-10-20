package deob;

import java.util.Comparator;

@ObfuscatedName("ry")
public class class481 implements Comparator {

    @ObfuscatedName("ry.f")
    public final boolean field5002;

    public class481(boolean arg0) {
        this.field5002 = arg0;
    }

    @ObfuscatedName("ry.f(Low;Low;I)I")
    public int method8272(class401 arg0, class401 arg1) {
        return this.field5002 ? arg0.method7024().method8561(arg1.method7024()) : arg1.method7024().method8561(arg0.method7024());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8272((class401) arg0, (class401) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
