package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class192 implements Iterable {

    @ObfuscatedName("gi.a")
    public class193 field2463 = new class193();

    @ObfuscatedName("gi.j")
    public class193 field2464;

    public class192() {
        this.field2463.field2466 = this.field2463;
        this.field2463.field2465 = this.field2463;
    }

    @ObfuscatedName("gi.a(Lge;)V")
    public void method3287(class193 arg0) {
        if (arg0.field2465 != null) {
            arg0.method3308();
        }
        arg0.field2465 = this.field2463.field2465;
        arg0.field2466 = this.field2463;
        arg0.field2465.field2466 = arg0;
        arg0.field2466.field2465 = arg0;
    }

    @ObfuscatedName("gi.j(Lge;)V")
    public void method3279(class193 arg0) {
        if (arg0.field2465 != null) {
            arg0.method3308();
        }
        arg0.field2465 = this.field2463;
        arg0.field2466 = this.field2463.field2466;
        arg0.field2465.field2466 = arg0;
        arg0.field2466.field2465 = arg0;
    }

    @ObfuscatedName("gi.n(Lge;Lge;)V")
    public static void method3280(class193 arg0, class193 arg1) {
        if (arg0.field2465 != null) {
            arg0.method3308();
        }
        arg0.field2465 = arg1;
        arg0.field2466 = arg1.field2466;
        arg0.field2465.field2466 = arg0;
        arg0.field2466.field2465 = arg0;
    }

    @ObfuscatedName("gi.r()Lge;")
    public class193 method3283() {
        class193 var1 = this.field2463.field2466;
        if (this.field2463 == var1) {
            return null;
        } else {
            var1.method3308();
            return var1;
        }
    }

    @ObfuscatedName("gi.v()Lge;")
    public class193 method3282() {
        return this.method3303((class193) null);
    }

    @ObfuscatedName("gi.e(Lge;)Lge;")
    public class193 method3303(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2463.field2466;
        } else {
            var2 = arg0;
        }
        if (this.field2463 == var2) {
            this.field2464 = null;
            return null;
        } else {
            this.field2464 = var2.field2466;
            return var2;
        }
    }

    @ObfuscatedName("gi.l()Lge;")
    public class193 method3284() {
        class193 var1 = this.field2464;
        if (this.field2463 == var1) {
            this.field2464 = null;
            return null;
        } else {
            this.field2464 = var1.field2466;
            return var1;
        }
    }

    @ObfuscatedName("gi.s()Z")
    public boolean method3299() {
        return this.field2463.field2466 == this.field2463;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
