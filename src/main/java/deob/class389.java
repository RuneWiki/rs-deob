package deob;

import java.util.Comparator;
import java.util.Map.Entry;

@ObfuscatedName("nl")
public class class389 implements Comparator {

    // $FF: synthetic field
    public final class388 this$0;

    public class389(class388 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("nl.f(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I")
    public int method6888(Entry arg0, Entry arg1) {
        return ((Float) arg1.getValue()).compareTo((Float) arg0.getValue());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6888((Entry) arg0, (Entry) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
