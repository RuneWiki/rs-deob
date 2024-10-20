package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class204 implements Iterable {

    @ObfuscatedName("gl.k")
    public class208 field3151 = new class208();

    public class204() {
        this.field3151.field3156 = this.field3151;
        this.field3151.field3157 = this.field3151;
    }

    @ObfuscatedName("gl.k()V")
    public void method3625() {
        while (this.field3151.field3156 != this.field3151) {
            this.field3151.field3156.method3684();
        }
    }

    @ObfuscatedName("gl.q(Lgv;)V")
    public void method3629(class208 arg0) {
        if (arg0.field3157 != null) {
            arg0.method3684();
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
