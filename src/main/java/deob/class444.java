package deob;

import java.util.Comparator;

@ObfuscatedName("qr")
public class class444 implements Comparator {

    @ObfuscatedName("qr.v")
    public final boolean field4681;

    public class444(boolean arg0) {
        this.field4681 = arg0;
    }

    @ObfuscatedName("qr.v(Lnn;Lnn;I)I")
    public int method7235(class371 arg0, class371 arg1) {
        return this.field4681 ? arg0.method6104().method7527(arg1.method6104()) : arg1.method6104().method7527(arg0.method6104());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7235((class371) arg0, (class371) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
