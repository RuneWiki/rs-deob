package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("jl")
public class class261 implements Iterable, Collection {

    @ObfuscatedName("jl.f")
    public class188 field3501 = new class188();

    @ObfuscatedName("jl.i")
    public class188 field3500;

    public class261() {
        this.field3501.field2323 = this.field3501;
        this.field3501.field2324 = this.field3501;
    }

    @ObfuscatedName("jl.f()V")
    public void method4444() {
        while (this.field3501.field2323 != this.field3501) {
            this.field3501.field2323.method3292();
        }
    }

    @ObfuscatedName("jl.i(Lgk;)V")
    public void method4445(class188 arg0) {
        if (arg0.field2324 != null) {
            arg0.method3292();
        }
        arg0.field2324 = this.field3501.field2324;
        arg0.field2323 = this.field3501;
        arg0.field2324.field2323 = arg0;
        arg0.field2323.field2324 = arg0;
    }

    @ObfuscatedName("jl.y(Lgk;)V")
    public void method4446(class188 arg0) {
        if (arg0.field2324 != null) {
            arg0.method3292();
        }
        arg0.field2324 = this.field3501;
        arg0.field2323 = this.field3501.field2323;
        arg0.field2324.field2323 = arg0;
        arg0.field2323.field2324 = arg0;
    }

    @ObfuscatedName("jl.w(Lgk;Lgk;)V")
    public static void method4453(class188 arg0, class188 arg1) {
        if (arg0.field2324 != null) {
            arg0.method3292();
        }
        arg0.field2324 = arg1;
        arg0.field2323 = arg1.field2323;
        arg0.field2324.field2323 = arg0;
        arg0.field2323.field2324 = arg0;
    }

    @ObfuscatedName("jl.p()Lgk;")
    public class188 method4447() {
        return this.method4455((class188) null);
    }

    @ObfuscatedName("jl.b(Lgk;)Lgk;")
    public class188 method4455(class188 arg0) {
        class188 var2;
        if (arg0 == null) {
            var2 = this.field3501.field2323;
        } else {
            var2 = arg0;
        }
        if (this.field3501 == var2) {
            this.field3500 = null;
            return null;
        } else {
            this.field3500 = var2.field2323;
            return var2;
        }
    }

    @ObfuscatedName("jl.e()Lgk;")
    public class188 method4487() {
        class188 var1 = this.field3500;
        if (this.field3501 == var1) {
            this.field3500 = null;
            return null;
        } else {
            this.field3500 = var1.field2323;
            return var1;
        }
    }

    @ObfuscatedName("jl.x()I")
    public int method4450() {
        int var1 = 0;
        for (class188 var2 = this.field3501.field2323; var2 != this.field3501; var2 = var2.field2323) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("jl.a()Z")
    public boolean method4451() {
        return this.field3501.field2323 == this.field3501;
    }

    @ObfuscatedName("jl.d()[Lgk;")
    public class188[] method4452() {
        class188[] var1 = new class188[this.method4450()];
        int var2 = 0;
        for (class188 var3 = this.field3501.field2323; var3 != this.field3501; var3 = var3.field2323) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class265(this);
    }

    public int size() {
        return this.method4450();
    }

    public boolean isEmpty() {
        return this.method4451();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method4452();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class188 var3 = this.field3501.field2323; var3 != this.field3501; var3 = var3.field2323) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("jl.c(Lgk;)Z")
    public boolean method4456(class188 arg0) {
        this.method4445(arg0);
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
        this.method4444();
    }

    public boolean add(Object arg0) {
        return this.method4456((class188) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
