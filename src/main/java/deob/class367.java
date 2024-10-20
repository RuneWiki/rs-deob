package deob;

import java.util.Comparator;

@ObfuscatedName("ow")
public final class class367 implements Comparator {

    @ObfuscatedName("ow.at(Lod;Lod;B)I")
    public int method6241(class365 arg0, class365 arg1) {
        return arg0.field4310.field4315 < arg1.field4310.field4315 ? -1 : (arg0.field4310.field4315 == arg1.field4310.field4315 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6241((class365) arg0, (class365) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
