package deob;

import java.util.Iterator;

@ObfuscatedName("hk")
public class class228 implements Iterable {

    @ObfuscatedName("hk.o")
    public class219 field2676 = new class219();

    @ObfuscatedName("hk.k")
    public class219 field2675;

    public class228() {
        this.field2676.field2658 = this.field2676;
        this.field2676.field2657 = this.field2676;
    }

    @ObfuscatedName("hk.o()V")
    public void method3769() {
        while (this.field2676.field2658 != this.field2676) {
            this.field2676.field2658.method3721();
        }
    }

    @ObfuscatedName("hk.k(Lht;)V")
    public void method3770(class219 arg0) {
        if (arg0.field2657 != null) {
            arg0.method3721();
        }
        arg0.field2657 = this.field2676.field2657;
        arg0.field2658 = this.field2676;
        arg0.field2657.field2658 = arg0;
        arg0.field2658.field2657 = arg0;
    }

    @ObfuscatedName("hk.t()Lht;")
    public class219 method3771() {
        class219 var1 = this.field2676.field2658;
        if (this.field2676 == var1) {
            return null;
        } else {
            var1.method3721();
            return var1;
        }
    }

    @ObfuscatedName("hk.d()Lht;")
    public class219 method3785() {
        return this.method3773((class219) null);
    }

    @ObfuscatedName("hk.h(Lht;)Lht;")
    public class219 method3773(class219 arg0) {
        class219 var2;
        if (arg0 == null) {
            var2 = this.field2676.field2658;
        } else {
            var2 = arg0;
        }
        if (this.field2676 == var2) {
            this.field2675 = null;
            return null;
        } else {
            this.field2675 = var2.field2658;
            return var2;
        }
    }

    @ObfuscatedName("hk.m()Lht;")
    public class219 method3774() {
        class219 var1 = this.field2675;
        if (this.field2676 == var1) {
            this.field2675 = null;
            return null;
        } else {
            this.field2675 = var1.field2658;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class227(this);
    }
}
