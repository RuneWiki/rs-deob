package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class200 implements Iterable {

    @ObfuscatedName("gc.h")
    public class204 field3086 = new class204();

    public class200() {
        this.field3086.field3090 = this.field3086;
        this.field3086.field3091 = this.field3086;
    }

    @ObfuscatedName("gc.h()V")
    public void method3571() {
        while (this.field3086.field3090 != this.field3086) {
            this.field3086.field3090.method3605();
        }
    }

    @ObfuscatedName("gc.m(Lgh;)V")
    public void method3576(class204 arg0) {
        if (arg0.field3091 != null) {
            arg0.method3605();
        }
        arg0.field3091 = this.field3086.field3091;
        arg0.field3090 = this.field3086;
        arg0.field3091.field3090 = arg0;
        arg0.field3090.field3091 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
