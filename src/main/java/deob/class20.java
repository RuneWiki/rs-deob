package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class20 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class20(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("q.g(Lgi;Lgi;B)I")
    public int method464(class195 arg0, class195 arg1) {
        if (arg0.field2914 == arg1.field2914) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field243 == arg0.field2914) {
                return -1;
            }
            if (client.field243 == arg1.field2914) {
                return 1;
            }
        }
        return arg0.field2914 < arg1.field2914 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method464((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
