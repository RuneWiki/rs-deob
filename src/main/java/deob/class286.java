package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("jh")
public abstract class class286 {

    @ObfuscatedName("jh.l")
    public final int field3621;

    @ObfuscatedName("jh.u")
    public int field3620 = 0;

    @ObfuscatedName("jh.q")
    public class283[] field3624;

    @ObfuscatedName("jh.k")
    public HashMap field3619;

    @ObfuscatedName("jh.i")
    public HashMap field3623;

    @ObfuscatedName("jh.x")
    public Comparator field3622 = null;

    public class286(int arg0) {
        this.field3621 = arg0;
        this.field3624 = this.method4924(arg0);
        this.field3619 = new HashMap(arg0 / 8);
        this.field3623 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("jh.b(I)V")
    public void method4932() {
        this.field3620 = 0;
        Arrays.fill(this.field3624, (Object) null);
        this.field3619.clear();
        this.field3623.clear();
    }

    @ObfuscatedName("jh.n(I)I")
    public int method4933() {
        return this.field3620;
    }

    @ObfuscatedName("jh.f(I)Z")
    public boolean method4934() {
        return this.field3621 == this.field3620;
    }

    @ObfuscatedName("jh.g(Lkm;I)Z")
    public boolean method4935(class292 arg0) {
        if (arg0.method5027()) {
            return this.field3619.containsKey(arg0) ? true : this.field3623.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jh.m(Lkm;I)Ljx;")
    public class283 method4936(class292 arg0) {
        class283 var2 = this.method4937(arg0);
        return var2 == null ? this.method4989(arg0) : var2;
    }

    @ObfuscatedName("jh.r(Lkm;I)Ljx;")
    public class283 method4937(class292 arg0) {
        return arg0.method5027() ? (class283) this.field3619.get(arg0) : null;
    }

    @ObfuscatedName("jh.t(Lkm;I)Ljx;")
    public class283 method4989(class292 arg0) {
        return arg0.method5027() ? (class283) this.field3623.get(arg0) : null;
    }

    @ObfuscatedName("jh.o(Lkm;I)Z")
    public final boolean method4992(class292 arg0) {
        class283 var2 = this.method4937(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4940(var2);
            return true;
        }
    }

    @ObfuscatedName("jh.y(Ljx;I)V")
    public final void method4940(class283 arg0) {
        int var2 = this.method4945(arg0);
        if (var2 != -1) {
            this.method4949(var2);
            this.method4994(arg0);
        }
    }

    @ObfuscatedName("jh.a(Lkm;I)Ljx;")
    public class283 method4977(class292 arg0) {
        return this.method4941(arg0, (class292) null);
    }

    @ObfuscatedName("jh.c(Lkm;Lkm;I)Ljx;")
    public class283 method4941(class292 arg0, class292 arg1) {
        if (this.method4937(arg0) != null) {
            throw new IllegalStateException();
        }
        class283 var3 = this.method4921();
        var3.method4896(arg0, arg1);
        this.method4947(var3);
        this.method4948(var3);
        return var3;
    }

    @ObfuscatedName("jh.v(IB)Ljx;")
    public final class283 method4942(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3620) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3624[arg0];
    }

    @ObfuscatedName("jh.af(I)V")
    public final void method4943() {
        if (this.field3622 == null) {
            Arrays.sort(this.field3624, 0, this.field3620);
        } else {
            Arrays.sort(this.field3624, 0, this.field3620, this.field3622);
        }
    }

    @ObfuscatedName("jh.ah(Ljx;Lkm;Lkm;B)V")
    public final void method4944(class283 arg0, class292 arg1, class292 arg2) {
        this.method4994(arg0);
        arg0.method4896(arg1, arg2);
        this.method4948(arg0);
    }

    @ObfuscatedName("jh.ab(Ljx;B)I")
    public final int method4945(class283 arg0) {
        for (int var2 = 0; var2 < this.field3620; var2++) {
            if (this.field3624[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("jh.aw(Ljx;I)V")
    public final void method4994(class283 arg0) {
        if (this.field3619.remove(arg0.field3611) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3612 != null) {
            this.field3623.remove(arg0.field3612);
        }
    }

    @ObfuscatedName("jh.ak(Ljx;I)V")
    public final void method4947(class283 arg0) {
        this.field3624[++this.field3620 - 1] = arg0;
    }

    @ObfuscatedName("jh.as(Ljx;I)V")
    public final void method4948(class283 arg0) {
        this.field3619.put(arg0.field3611, arg0);
        if (arg0.field3612 != null) {
            class283 var2 = (class283) this.field3623.put(arg0.field3612, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3612 = null;
            }
        }
    }

    @ObfuscatedName("jh.an(II)V")
    public final void method4949(int arg0) {
        this.field3620--;
        if (arg0 < this.field3620) {
            System.arraycopy(this.field3624, arg0 + 1, this.field3624, arg0, this.field3620 - arg0);
        }
    }

    @ObfuscatedName("jh.ao(S)V")
    public final void method4951() {
        this.field3622 = null;
    }

    @ObfuscatedName("jh.at(Ljava/util/Comparator;B)V")
    public final void method4952(Comparator arg0) {
        if (this.field3622 == null) {
            this.field3622 = arg0;
        } else if (this.field3622 instanceof class284) {
            ((class284) this.field3622).method4913(arg0);
        }
    }

    @ObfuscatedName("jh.w(II)[Ljx;")
    public abstract class283[] method4924(int arg0);

    @ObfuscatedName("jh.z(I)Ljx;")
    public abstract class283 method4921();
}
