package deob;

import java.util.Comparator;
import java.util.Map.Entry;

@ObfuscatedName("ra")
public class class459 implements Comparator {

    // $FF: synthetic field
    public final class458 this$0;

    public class459(class458 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ra.aq(Ljava/util/Map$Entry;Ljava/util/Map$Entry;B)I")
    public int method7713(Entry arg0, Entry arg1) {
        return ((Float) arg1.getValue()).compareTo((Float) arg0.getValue());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7713((Entry) arg0, (Entry) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
