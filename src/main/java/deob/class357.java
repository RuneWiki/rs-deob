package deob;

import java.util.Iterator;

@ObfuscatedName("mm")
public class class357 implements Iterable {

    @ObfuscatedName("mm.h")
    public class428 field4342 = new class428();

    @ObfuscatedName("mm.e")
    public class428 field4343;

    public class357() {
        this.field4342.field4679 = this.field4342;
        this.field4342.field4677 = this.field4342;
    }

    @ObfuscatedName("mm.h()V")
    public void method6234() {
        while (this.field4342.field4679 != this.field4342) {
            this.field4342.field4679.method7225();
        }
    }

    @ObfuscatedName("mm.e(Lpw;)V")
    public void method6235(class428 arg0) {
        if (arg0.field4677 != null) {
            arg0.method7225();
        }
        arg0.field4677 = this.field4342.field4677;
        arg0.field4679 = this.field4342;
        arg0.field4677.field4679 = arg0;
        arg0.field4679.field4677 = arg0;
    }

    @ObfuscatedName("mm.v(Lpw;Lpw;)V")
    public static void method6246(class428 arg0, class428 arg1) {
        if (arg0.field4677 != null) {
            arg0.method7225();
        }
        arg0.field4677 = arg1;
        arg0.field4679 = arg1.field4679;
        arg0.field4677.field4679 = arg0;
        arg0.field4679.field4677 = arg0;
    }

    @ObfuscatedName("mm.x()Lpw;")
    public class428 method6237() {
        class428 var1 = this.field4342.field4679;
        if (this.field4342 == var1) {
            return null;
        } else {
            var1.method7225();
            return var1;
        }
    }

    @ObfuscatedName("mm.m()Lpw;")
    public class428 method6238() {
        return this.method6239((class428) null);
    }

    @ObfuscatedName("mm.q(Lpw;)Lpw;")
    public class428 method6239(class428 arg0) {
        class428 var2;
        if (arg0 == null) {
            var2 = this.field4342.field4679;
        } else {
            var2 = arg0;
        }
        if (this.field4342 == var2) {
            this.field4343 = null;
            return null;
        } else {
            this.field4343 = var2.field4679;
            return var2;
        }
    }

    @ObfuscatedName("mm.f()Lpw;")
    public class428 method6247() {
        class428 var1 = this.field4343;
        if (this.field4342 == var1) {
            this.field4343 = null;
            return null;
        } else {
            this.field4343 = var1.field4679;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class356(this);
    }
}
