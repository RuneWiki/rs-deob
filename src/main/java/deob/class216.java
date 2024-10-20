package deob;

import java.util.Iterator;

@ObfuscatedName("hr")
public class class216 implements Iterable {

    @ObfuscatedName("hr.t")
    public class217 field2635 = new class217();

    @ObfuscatedName("hr.q")
    public class217 field2634;

    public class216() {
        this.field2635.field2637 = this.field2635;
        this.field2635.field2638 = this.field2635;
    }

    @ObfuscatedName("hr.t()V")
    public void method3697() {
        while (this.field2635.field2637 != this.field2635) {
            this.field2635.field2637.method3721();
        }
    }

    @ObfuscatedName("hr.q(Lhx;)V")
    public void method3710(class217 arg0) {
        if (arg0.field2638 != null) {
            arg0.method3721();
        }
        arg0.field2638 = this.field2635.field2638;
        arg0.field2637 = this.field2635;
        arg0.field2638.field2637 = arg0;
        arg0.field2637.field2638 = arg0;
    }

    @ObfuscatedName("hr.i(Lhx;)V")
    public void method3680(class217 arg0) {
        if (arg0.field2638 != null) {
            arg0.method3721();
        }
        arg0.field2638 = this.field2635;
        arg0.field2637 = this.field2635.field2637;
        arg0.field2638.field2637 = arg0;
        arg0.field2637.field2638 = arg0;
    }

    @ObfuscatedName("hr.a(Lhx;Lhx;)V")
    public static void method3681(class217 arg0, class217 arg1) {
        if (arg0.field2638 != null) {
            arg0.method3721();
        }
        arg0.field2638 = arg1;
        arg0.field2637 = arg1.field2637;
        arg0.field2638.field2637 = arg0;
        arg0.field2637.field2638 = arg0;
    }

    @ObfuscatedName("hr.l()Lhx;")
    public class217 method3682() {
        class217 var1 = this.field2635.field2637;
        if (this.field2635 == var1) {
            return null;
        } else {
            var1.method3721();
            return var1;
        }
    }

    @ObfuscatedName("hr.b()Lhx;")
    public class217 method3683() {
        return this.method3684((class217) null);
    }

    @ObfuscatedName("hr.e(Lhx;)Lhx;")
    public class217 method3684(class217 arg0) {
        class217 var2;
        if (arg0 == null) {
            var2 = this.field2635.field2637;
        } else {
            var2 = arg0;
        }
        if (this.field2635 == var2) {
            this.field2634 = null;
            return null;
        } else {
            this.field2634 = var2.field2637;
            return var2;
        }
    }

    @ObfuscatedName("hr.x()Lhx;")
    public class217 method3702() {
        class217 var1 = this.field2634;
        if (this.field2635 == var1) {
            this.field2634 = null;
            return null;
        } else {
            this.field2634 = var1.field2637;
            return var1;
        }
    }

    @ObfuscatedName("hr.p()Z")
    public boolean method3686() {
        return this.field2635.field2637 == this.field2635;
    }

    public Iterator iterator() {
        return new class212(this);
    }
}
