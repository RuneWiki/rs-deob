package deob;

import java.util.Arrays;
import java.util.HashMap;

@ObfuscatedName("jj")
public abstract class class276 {

    @ObfuscatedName("jj.h")
    public final int field3708;

    @ObfuscatedName("jj.i")
    public int field3709 = 0;

    @ObfuscatedName("jj.w")
    public class274[] field3712;

    @ObfuscatedName("jj.t")
    public HashMap field3711;

    @ObfuscatedName("jj.d")
    public HashMap field3710;

    public class276(int arg0) {
        this.field3708 = arg0;
        this.field3712 = this.method4830(arg0);
        this.field3711 = new HashMap(arg0 / 8);
        this.field3710 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("jj.k(I)V")
    public void method4907() {
        this.field3709 = 0;
        Arrays.fill(this.field3712, (Object) null);
        this.field3711.clear();
        this.field3710.clear();
    }

    @ObfuscatedName("jj.c(I)I")
    public int method4838() {
        return this.field3709;
    }

    @ObfuscatedName("jj.o(I)Z")
    public boolean method4839() {
        return this.field3709 == this.field3708;
    }

    @ObfuscatedName("jj.l(Lja;B)Z")
    public boolean method4863(class281 arg0) {
        if (arg0.method4923()) {
            return this.field3711.containsKey(arg0) ? true : this.field3710.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jj.f(Lja;B)Ljq;")
    public class274 method4840(class281 arg0) {
        class274 var2 = this.method4842(arg0);
        return var2 == null ? this.method4867(arg0) : var2;
    }

    @ObfuscatedName("jj.q(Lja;I)Ljq;")
    public class274 method4842(class281 arg0) {
        return arg0.method4923() ? (class274) this.field3711.get(arg0) : null;
    }

    @ObfuscatedName("jj.r(Lja;I)Ljq;")
    public class274 method4867(class281 arg0) {
        return arg0.method4923() ? (class274) this.field3710.get(arg0) : null;
    }

    @ObfuscatedName("jj.x(Lja;I)Z")
    public final boolean method4844(class281 arg0) {
        class274 var2 = this.method4842(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4845(var2);
            return true;
        }
    }

    @ObfuscatedName("jj.u(Ljq;B)V")
    public final void method4845(class274 arg0) {
        int var2 = this.method4850(arg0);
        if (var2 != -1) {
            this.method4876(var2);
            this.method4852(arg0);
        }
    }

    @ObfuscatedName("jj.a(Lja;I)Ljq;")
    public class274 method4846(class281 arg0) {
        return this.method4847(arg0, (class281) null);
    }

    @ObfuscatedName("jj.ad(Lja;Lja;I)Ljq;")
    public class274 method4847(class281 arg0, class281 arg1) {
        if (this.method4840(arg0) != null) {
            throw new IllegalStateException();
        }
        class274 var3 = this.method4826();
        var3.method4808(arg0, arg1);
        this.method4853(var3);
        this.method4843(var3);
        return var3;
    }

    @ObfuscatedName("jj.al(II)Ljq;")
    public final class274 method4848(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3709) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.field3712[arg0];
    }

    @ObfuscatedName("jj.aq(I)V")
    public final void method4849() {
        Arrays.sort(this.field3712, 0, this.field3709);
    }

    @ObfuscatedName("jj.ar(Ljq;Lja;Lja;I)V")
    public final void method4885(class274 arg0, class281 arg1, class281 arg2) {
        this.method4852(arg0);
        arg0.method4808(arg1, arg2);
        this.method4843(arg0);
    }

    @ObfuscatedName("jj.an(Ljq;I)I")
    public final int method4850(class274 arg0) {
        for (int var2 = 0; var2 < this.field3709; var2++) {
            if (this.field3712[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("jj.af(Ljq;I)V")
    public final void method4852(class274 arg0) {
        if (this.field3711.remove(arg0.field3702) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3701 != null) {
            this.field3710.remove(arg0.field3701);
        }
    }

    @ObfuscatedName("jj.as(Ljq;I)V")
    public final void method4853(class274 arg0) {
        this.field3712[++this.field3709 - 1] = arg0;
    }

    @ObfuscatedName("jj.ax(Ljq;I)V")
    public final void method4843(class274 arg0) {
        this.field3711.put(arg0.field3702, arg0);
        if (arg0.field3701 != null) {
            this.field3710.put(arg0.field3701, arg0);
        }
    }

    @ObfuscatedName("jj.ak(II)V")
    public final void method4876(int arg0) {
        this.field3709--;
        if (arg0 < this.field3709) {
            System.arraycopy(this.field3712, arg0 + 1, this.field3712, arg0, this.field3709 - arg0);
        }
    }

    @ObfuscatedName("jj.s(I)Ljq;")
    public abstract class274 method4826();

    @ObfuscatedName("jj.g(II)[Ljq;")
    public abstract class274[] method4830(int arg0);
}
