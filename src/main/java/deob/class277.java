package deob;

import java.util.Iterator;

@ObfuscatedName("jf")
public class class277 implements Iterable {

    @ObfuscatedName("jf.n")
    public class185 field3582 = new class185();

    @ObfuscatedName("jf.v")
    public class185 field3581;

    public class277() {
        this.field3582.field2133 = this.field3582;
        this.field3582.field2131 = this.field3582;
    }

    @ObfuscatedName("jf.n()V")
    public void method4785() {
        while (this.field3582.field2133 != this.field3582) {
            this.field3582.field2133.method3481();
        }
    }

    @ObfuscatedName("jf.v(Lgj;)V")
    public void method4772(class185 arg0) {
        if (arg0.field2131 != null) {
            arg0.method3481();
        }
        arg0.field2131 = this.field3582.field2131;
        arg0.field2133 = this.field3582;
        arg0.field2131.field2133 = arg0;
        arg0.field2133.field2131 = arg0;
    }

    @ObfuscatedName("jf.d(Lgj;Lgj;)V")
    public static void method4767(class185 arg0, class185 arg1) {
        if (arg0.field2131 != null) {
            arg0.method3481();
        }
        arg0.field2131 = arg1;
        arg0.field2133 = arg1.field2133;
        arg0.field2131.field2133 = arg0;
        arg0.field2133.field2131 = arg0;
    }

    @ObfuscatedName("jf.c()Lgj;")
    public class185 method4768() {
        class185 var1 = this.field3582.field2133;
        if (this.field3582 == var1) {
            return null;
        } else {
            var1.method3481();
            return var1;
        }
    }

    @ObfuscatedName("jf.y()Lgj;")
    public class185 method4764() {
        return this.method4770((class185) null);
    }

    @ObfuscatedName("jf.h(Lgj;)Lgj;")
    public class185 method4770(class185 arg0) {
        class185 var2;
        if (arg0 == null) {
            var2 = this.field3582.field2133;
        } else {
            var2 = arg0;
        }
        if (this.field3582 == var2) {
            this.field3581 = null;
            return null;
        } else {
            this.field3581 = var2.field2133;
            return var2;
        }
    }

    @ObfuscatedName("jf.z()Lgj;")
    public class185 method4771() {
        class185 var1 = this.field3581;
        if (this.field3582 == var1) {
            this.field3581 = null;
            return null;
        } else {
            this.field3581 = var1.field2133;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class275(this);
    }
}
