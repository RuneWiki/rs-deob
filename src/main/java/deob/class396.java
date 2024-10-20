package deob;

import java.util.Comparator;
import java.util.Map.Entry;

@ObfuscatedName("pp")
public class class396 implements Comparator {

    // $FF: synthetic field
    public final class395 this$0;

    public class396(class395 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("pp.af(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I")
    public int method7023(Entry arg0, Entry arg1) {
        return ((Float) arg1.getValue()).compareTo((Float) arg0.getValue());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7023((Entry) arg0, (Entry) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
