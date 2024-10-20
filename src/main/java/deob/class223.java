package deob;

import java.util.Iterator;

@ObfuscatedName("hy")
public class class223 implements Iterable {

    @ObfuscatedName("hy.n")
    public class214 field2523 = new class214();

    @ObfuscatedName("hy.h")
    public class214 field2524;

    public class223() {
        this.field2523.field2506 = this.field2523;
        this.field2523.field2505 = this.field2523;
    }

    @ObfuscatedName("hy.n()V")
    public void method4061() {
        while (this.field2523.field2506 != this.field2523) {
            this.field2523.field2506.method4025();
        }
    }

    @ObfuscatedName("hy.h(Lhp;)V")
    public void method4067(class214 arg0) {
        if (arg0.field2505 != null) {
            arg0.method4025();
        }
        arg0.field2505 = this.field2523.field2505;
        arg0.field2506 = this.field2523;
        arg0.field2505.field2506 = arg0;
        arg0.field2506.field2505 = arg0;
    }

    @ObfuscatedName("hy.l()Lhp;")
    public class214 method4060() {
        class214 var1 = this.field2523.field2506;
        if (this.field2523 == var1) {
            return null;
        } else {
            var1.method4025();
            return var1;
        }
    }

    @ObfuscatedName("hy.g()Lhp;")
    public class214 method4062() {
        return this.method4063((class214) null);
    }

    @ObfuscatedName("hy.b(Lhp;)Lhp;")
    public class214 method4063(class214 arg0) {
        class214 var2;
        if (arg0 == null) {
            var2 = this.field2523.field2506;
        } else {
            var2 = arg0;
        }
        if (this.field2523 == var2) {
            this.field2524 = null;
            return null;
        } else {
            this.field2524 = var2.field2506;
            return var2;
        }
    }

    @ObfuscatedName("hy.a()Lhp;")
    public class214 method4064() {
        class214 var1 = this.field2524;
        if (this.field2523 == var1) {
            this.field2524 = null;
            return null;
        } else {
            this.field2524 = var1.field2506;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class222(this);
    }
}
