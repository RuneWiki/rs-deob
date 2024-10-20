package deob;

import java.util.Comparator;

@ObfuscatedName("w")
public final class class19 implements Comparator {

    @ObfuscatedName("w.t(Lu;Lu;I)I")
    public int method129(class15 arg0, class15 arg1) {
        return arg0.method70().compareTo(arg1.method70());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method129((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
