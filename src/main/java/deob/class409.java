package deob;

import java.util.Comparator;
import java.util.Map.Entry;

@ObfuscatedName("pm")
public class class409 implements Comparator {

    // $FF: synthetic field
    public final class408 this$0;

    public class409(class408 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("pm.at(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I")
    public int method7024(Entry arg0, Entry arg1) {
        return ((Float) arg1.getValue()).compareTo((Float) arg0.getValue());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7024((Entry) arg0, (Entry) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
