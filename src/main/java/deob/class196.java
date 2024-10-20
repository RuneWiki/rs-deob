package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class196 implements Iterator {

    @ObfuscatedName("gg.y")
    public class193 field3018;

    @ObfuscatedName("gg.k")
    public class199 field3016;

    @ObfuscatedName("gg.g")
    public class199 field3017 = null;

    public class196(class193 arg0) {
        this.field3018 = arg0;
        this.field3016 = this.field3018.field3012.field3025;
        this.field3017 = null;
    }

    public Object next() {
        class199 var1 = this.field3016;
        if (this.field3018.field3012 == var1) {
            var1 = null;
            this.field3016 = null;
        } else {
            this.field3016 = var1.field3025;
        }
        this.field3017 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3018.field3012 != this.field3016;
    }

    public void remove() {
        if (this.field3017 == null) {
            throw new IllegalStateException();
        }
        this.field3017.method3482();
        this.field3017 = null;
    }
}
