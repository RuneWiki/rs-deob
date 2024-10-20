package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jn")
public class class272 implements Iterable, Collection {

    @ObfuscatedName("jn.h")
    public class190 field3567 = new class190();

    @ObfuscatedName("jn.v")
    public class190 field3568;

    public class272() {
        this.field3567.field2137 = this.field3567;
        this.field3567.field2139 = this.field3567;
    }

    @ObfuscatedName("jn.h()V")
    public void method4461() {
        while (this.field3567.field2137 != this.field3567) {
            this.field3567.field2137.method3359();
        }
    }

    @ObfuscatedName("jn.v(Lgu;)V")
    public void method4472(class190 arg0) {
        if (arg0.field2139 != null) {
            arg0.method3359();
        }
        arg0.field2139 = this.field3567.field2139;
        arg0.field2137 = this.field3567;
        arg0.field2139.field2137 = arg0;
        arg0.field2137.field2139 = arg0;
    }

    @ObfuscatedName("jn.x(Lgu;)V")
    public void method4462(class190 arg0) {
        if (arg0.field2139 != null) {
            arg0.method3359();
        }
        arg0.field2139 = this.field3567;
        arg0.field2137 = this.field3567.field2137;
        arg0.field2139.field2137 = arg0;
        arg0.field2137.field2139 = arg0;
    }

    @ObfuscatedName("jn.w(Lgu;Lgu;)V")
    public static void method4463(class190 arg0, class190 arg1) {
        if (arg0.field2139 != null) {
            arg0.method3359();
        }
        arg0.field2139 = arg1;
        arg0.field2137 = arg1.field2137;
        arg0.field2139.field2137 = arg0;
        arg0.field2137.field2139 = arg0;
    }

    @ObfuscatedName("jn.t()Lgu;")
    public class190 method4467() {
        return this.method4465((class190) null);
    }

    @ObfuscatedName("jn.j(Lgu;)Lgu;")
    public class190 method4465(class190 arg0) {
        class190 var2;
        if (arg0 == null) {
            var2 = this.field3567.field2137;
        } else {
            var2 = arg0;
        }
        if (this.field3567 == var2) {
            this.field3568 = null;
            return null;
        } else {
            this.field3568 = var2.field2137;
            return var2;
        }
    }

    @ObfuscatedName("jn.n()Lgu;")
    public class190 method4466() {
        class190 var1 = this.field3568;
        if (this.field3567 == var1) {
            this.field3568 = null;
            return null;
        } else {
            this.field3568 = var1.field2137;
            return var1;
        }
    }

    @ObfuscatedName("jn.p()I")
    public int method4481() {
        int var1 = 0;
        for (class190 var2 = this.field3567.field2137; var2 != this.field3567; var2 = var2.field2137) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jn.l()Z")
    public boolean method4468() {
        return this.field3567.field2137 == this.field3567;
    }

    @ObfuscatedName("jn.z()[Lgu;")
    public class190[] method4469() {
        class190[] var1 = new class190[this.method4481()];
        int var2 = 0;
        for (class190 var3 = this.field3567.field2137; var3 != this.field3567; var3 = var3.field2137) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class276(this);
    }

    public int size() {
        return this.method4481();
    }

    public boolean isEmpty() {
        return this.method4468();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4469();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class190 var3 = this.field3567.field2137; var3 != this.field3567; var3 = var3.field2137) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jn.u(Lgu;)Z")
    public boolean method4460(class190 arg0) {
        this.method4472(arg0);
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
        this.method4461();
    }

    public boolean add(Object arg0) {
        return this.method4460((class190) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
