package deob;

import java.util.Comparator;

@ObfuscatedName("rh")
public class class480 implements Comparator {

    @ObfuscatedName("rh.f")
    public final boolean field5000;

    public class480(boolean arg0) {
        this.field5000 = arg0;
    }

    @ObfuscatedName("rh.f(Low;Low;B)I")
    public int method8263(class401 arg0, class401 arg1) {
        return this.field5000 ? arg0.method6988(arg1) : arg1.method6988(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8263((class401) arg0, (class401) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
