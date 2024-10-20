package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("mv")
public class class354 implements Iterable, Collection {

    @ObfuscatedName("mv.h")
    public class433 field4335 = new class433();

    @ObfuscatedName("mv.e")
    public class433 field4336;

    public class354() {
        this.field4335.field4684 = this.field4335;
        this.field4335.field4685 = this.field4335;
    }

    @ObfuscatedName("mv.h()V")
    public void method6132() {
        while (this.field4335.field4684 != this.field4335) {
            this.field4335.field4684.method7230();
        }
    }

    @ObfuscatedName("mv.e(Lpl;)V")
    public void method6143(class433 arg0) {
        if (arg0.field4685 != null) {
            arg0.method7230();
        }
        arg0.field4685 = this.field4335.field4685;
        arg0.field4684 = this.field4335;
        arg0.field4685.field4684 = arg0;
        arg0.field4684.field4685 = arg0;
    }

    @ObfuscatedName("mv.v(Lpl;)V")
    public void method6133(class433 arg0) {
        if (arg0.field4685 != null) {
            arg0.method7230();
        }
        arg0.field4685 = this.field4335;
        arg0.field4684 = this.field4335.field4684;
        arg0.field4685.field4684 = arg0;
        arg0.field4684.field4685 = arg0;
    }

    @ObfuscatedName("mv.x(Lpl;Lpl;)V")
    public static void method6198(class433 arg0, class433 arg1) {
        if (arg0.field4685 != null) {
            arg0.method7230();
        }
        arg0.field4685 = arg1;
        arg0.field4684 = arg1.field4684;
        arg0.field4685.field4684 = arg0;
        arg0.field4684.field4685 = arg0;
    }

    @ObfuscatedName("mv.m()Lpl;")
    public class433 method6176() {
        return this.method6135((class433) null);
    }

    @ObfuscatedName("mv.q(Lpl;)Lpl;")
    public class433 method6135(class433 arg0) {
        class433 var2;
        if (arg0 == null) {
            var2 = this.field4335.field4684;
        } else {
            var2 = arg0;
        }
        if (this.field4335 == var2) {
            this.field4336 = null;
            return null;
        } else {
            this.field4336 = var2.field4684;
            return var2;
        }
    }

    @ObfuscatedName("mv.f()Lpl;")
    public class433 method6136() {
        class433 var1 = this.field4336;
        if (this.field4335 == var1) {
            this.field4336 = null;
            return null;
        } else {
            this.field4336 = var1.field4684;
            return var1;
        }
    }

    @ObfuscatedName("mv.r()I")
    public int method6137() {
        int var1 = 0;
        for (class433 var2 = this.field4335.field4684; var2 != this.field4335; var2 = var2.field4684) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("mv.u()Z")
    public boolean method6138() {
        return this.field4335.field4684 == this.field4335;
    }

    @ObfuscatedName("mv.b()[Lpl;")
    public class433[] method6139() {
        class433[] var1 = new class433[this.method6137()];
        int var2 = 0;
        for (class433 var3 = this.field4335.field4684; var3 != this.field4335; var3 = var3.field4684) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class353(this);
    }

    public int size() {
        return this.method6137();
    }

    public boolean isEmpty() {
        return this.method6138();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6139();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class433 var3 = this.field4335.field4684; var3 != this.field4335; var3 = var3.field4684) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("mv.j(Lpl;)Z")
    public boolean method6174(class433 arg0) {
        this.method6143(arg0);
        return true;
    }

    public boolean remove(Object arg0) {
        throw new RuntimeException();
    }

    public boolean containsAll(Collection arg0) {
        throw new RuntimeException();
    }

    public boolean addAll(Collection arg0) {
        throw new RuntimeException();
    }

    public boolean removeAll(Collection arg0) {
        throw new RuntimeException();
    }

    public boolean retainAll(Collection arg0) {
        throw new RuntimeException();
    }

    public void clear() {
        this.method6132();
    }

    public boolean add(Object arg0) {
        return this.method6174((class433) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
