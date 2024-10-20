package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class19 implements Comparator {

    @ObfuscatedName("f.a(Lt;Lt;B)I")
    public int method120(class15 arg0, class15 arg1) {
        return arg0.method72().compareTo(arg1.method72());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method120((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
