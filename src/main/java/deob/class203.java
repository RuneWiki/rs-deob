package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class203 implements Iterable {

    @ObfuscatedName("gz.f")
    public class209 field3104 = new class209();

    public class203() {
        this.field3104.field3117 = this.field3104;
        this.field3104.field3118 = this.field3104;
    }

    @ObfuscatedName("gz.f(Lhf;)V")
    public void method3631(class209 arg0) {
        if (arg0.field3118 != null) {
            arg0.method3679();
        }
        arg0.field3118 = this.field3104.field3118;
        arg0.field3117 = this.field3104;
        arg0.field3118.field3117 = arg0;
        arg0.field3117.field3118 = arg0;
    }

    @ObfuscatedName("gz.u()Lhf;")
    public class209 method3624() {
        return this.method3630((class209) null);
    }

    @ObfuscatedName("gz.x(Lhf;)Lhf;")
    public class209 method3630(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field3104.field3117;
        } else {
            var2 = arg0;
        }
        return this.field3104 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
