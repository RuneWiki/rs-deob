package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("py")
public class class395 implements Iterable, Collection {

    @ObfuscatedName("py.ac")
    public class488 field4464 = new class488();

    @ObfuscatedName("py.al")
    public class488 field4463;

    public class395() {
        this.field4464.field4856 = this.field4464;
        this.field4464.field4858 = this.field4464;
    }

    @ObfuscatedName("py.ac()V")
    public void method6584() {
        while (this.field4464.field4856 != this.field4464) {
            this.field4464.field4856.method7776();
        }
    }

    @ObfuscatedName("py.al(Lsj;)V")
    public void method6593(class488 arg0) {
        if (arg0.field4858 != null) {
            arg0.method7776();
        }
        arg0.field4858 = this.field4464.field4858;
        arg0.field4856 = this.field4464;
        arg0.field4858.field4856 = arg0;
        arg0.field4856.field4858 = arg0;
    }

    @ObfuscatedName("py.ak(Lsj;)V")
    public void method6591(class488 arg0) {
        if (arg0.field4858 != null) {
            arg0.method7776();
        }
        arg0.field4858 = this.field4464;
        arg0.field4856 = this.field4464.field4856;
        arg0.field4858.field4856 = arg0;
        arg0.field4856.field4858 = arg0;
    }

    @ObfuscatedName("py.ax(Lsj;Lsj;)V")
    public static void method6576(class488 arg0, class488 arg1) {
        if (arg0.field4858 != null) {
            arg0.method7776();
        }
        arg0.field4858 = arg1;
        arg0.field4856 = arg1.field4856;
        arg0.field4858.field4856 = arg0;
        arg0.field4856.field4858 = arg0;
    }

    @ObfuscatedName("py.ao()Lsj;")
    public class488 method6577() {
        return this.method6578((class488) null);
    }

    @ObfuscatedName("py.ah(Lsj;)Lsj;")
    public class488 method6578(class488 arg0) {
        class488 var2;
        if (arg0 == null) {
            var2 = this.field4464.field4856;
        } else {
            var2 = arg0;
        }
        if (this.field4464 == var2) {
            this.field4463 = null;
            return null;
        } else {
            this.field4463 = var2.field4856;
            return var2;
        }
    }

    @ObfuscatedName("py.ar()Lsj;")
    public class488 method6623() {
        class488 var1 = this.field4463;
        if (this.field4464 == var1) {
            this.field4463 = null;
            return null;
        } else {
            this.field4463 = var1.field4856;
            return var1;
        }
    }

    @ObfuscatedName("py.ab()I")
    public int method6582() {
        int var1 = 0;
        for (class488 var2 = this.field4464.field4856; var2 != this.field4464; var2 = var2.field4856) {
            var1++;
        }
        return var1;
    }

    @ObfuscatedName("py.am()Z")
    public boolean method6581() {
        return this.field4464.field4856 == this.field4464;
    }

    @ObfuscatedName("py.av()[Lsj;")
    public class488[] method6586() {
        class488[] var1 = new class488[this.method6582()];
        int var2 = 0;
        for (class488 var3 = this.field4464.field4856; var3 != this.field4464; var3 = var3.field4856) {
            var1[var2++] = var3;
        }
        return var1;
    }

    public Iterator iterator() {
        return new class394(this);
    }

    public int size() {
        return this.method6582();
    }

    public boolean isEmpty() {
        return this.method6581();
    }

    public boolean contains(Object arg0) {
        throw new RuntimeException();
    }

    public Object[] toArray() {
        return this.method6586();
    }

    public Object[] toArray(Object[] arg0) {
        int var2 = 0;
        for (class488 var3 = this.field4464.field4856; var3 != this.field4464; var3 = var3.field4856) {
            arg0[var2++] = var3;
        }
        return arg0;
    }

    @ObfuscatedName("py.ag(Lsj;)Z")
    public boolean method6600(class488 arg0) {
        this.method6593(arg0);
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
        this.method6584();
    }

    public boolean add(Object arg0) {
        return this.method6600((class488) arg0);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
