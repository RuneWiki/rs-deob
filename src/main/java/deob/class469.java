package deob;

import java.util.Comparator;

@ObfuscatedName("re")
public class class469 implements Comparator {

    @ObfuscatedName("re.a")
    public final boolean field4928;

    public class469(boolean arg0) {
        this.field4928 = arg0;
    }

    @ObfuscatedName("re.a(Loj;Loj;B)I")
    public int method7988(class391 arg0, class391 arg1) {
        return this.field4928 ? arg0.method6692(arg1) : arg1.method6692(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7988((class391) arg0, (class391) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
