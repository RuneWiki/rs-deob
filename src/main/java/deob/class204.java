package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class204 implements Iterable {

    @ObfuscatedName("gw.s")
    public class208 field3151 = new class208();

    public class204() {
        this.field3151.field3156 = this.field3151;
        this.field3151.field3157 = this.field3151;
    }

    @ObfuscatedName("gw.s()V")
    public void method3619() {
        while (this.field3151.field3156 != this.field3151) {
            this.field3151.field3156.method3674();
        }
    }

    @ObfuscatedName("gw.z(Lgc;)V")
    public void method3620(class208 arg0) {
        if (arg0.field3157 != null) {
            arg0.method3674();
        }
        arg0.field3157 = this.field3151.field3157;
        arg0.field3156 = this.field3151;
        arg0.field3157.field3156 = arg0;
        arg0.field3156.field3157 = arg0;
    }

    public Iterator iterator() {
        return new class210(this);
    }
}
