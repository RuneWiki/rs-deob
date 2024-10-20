package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class204 implements Iterable {

    @ObfuscatedName("ge.f")
    public class208 field3151 = new class208();

    public class204() {
        this.field3151.field3157 = this.field3151;
        this.field3151.field3156 = this.field3151;
    }

    @ObfuscatedName("ge.f()V")
    public void method3677() {
        while (this.field3151.field3157 != this.field3151) {
            this.field3151.field3157.method3724();
        }
    }

    @ObfuscatedName("ge.e(Lgi;)V")
    public void method3674(class208 arg0) {
        if (arg0.field3156 != null) {
            arg0.method3724();
        }
        arg0.field3156 = this.field3151.field3156;
        arg0.field3157 = this.field3151;
        arg0.field3156.field3157 = arg0;
        arg0.field3157.field3156 = arg0;
    }

    public Iterator iterator() {
        return new class210(this);
    }
}
