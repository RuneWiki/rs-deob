package deob;

import java.util.Comparator;
import java.util.Map.Entry;

@ObfuscatedName("rp")
public class class463 implements Comparator {

    // $FF: synthetic field
    public final class462 this$0;

    public class463(class462 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("rp.ap(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I")
    public int method8202(Entry arg0, Entry arg1) {
        return ((Float) arg1.getValue()).compareTo((Float) arg0.getValue());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8202((Entry) arg0, (Entry) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
