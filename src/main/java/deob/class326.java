package deob;

import java.util.Comparator;

@ObfuscatedName("le")
public final class class326 implements Comparator {

    @ObfuscatedName("le.v(Llc;Llc;B)I")
    public int method5456(class324 arg0, class324 arg1) {
        return arg0.field4023.field4027 < arg1.field4023.field4027 ? -1 : (arg0.field4023.field4027 == arg1.field4023.field4027 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5456((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
