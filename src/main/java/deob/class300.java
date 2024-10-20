package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kb")
public abstract class class300 {

    @ObfuscatedName("kb.j")
    public final int field3834;

    @ObfuscatedName("kb.k")
    public int field3835 = 0;

    @ObfuscatedName("kb.x")
    public class297[] field3833;

    @ObfuscatedName("kb.z")
    public HashMap field3831;

    @ObfuscatedName("kb.p")
    public HashMap field3832;

    @ObfuscatedName("kb.w")
    public Comparator field3836 = null;

    public class300(int arg0) {
        this.field3834 = arg0;
        this.field3833 = this.method4932(arg0);
        this.field3831 = new HashMap(arg0 / 8);
        this.field3832 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kb.b(I)V")
    public void method4971() {
        this.field3835 = 0;
        Arrays.fill(this.field3833, (Object) null);
        this.field3831.clear();
        this.field3832.clear();
    }

    @ObfuscatedName("kb.h(I)I")
    public int method4938() {
        return this.field3835;
    }

    @ObfuscatedName("kb.n(I)Z")
    public boolean method4939() {
        return this.field3835 == this.field3834;
    }

    @ObfuscatedName("kb.u(Lko;B)Z")
    public boolean method4940(class306 arg0) {
        if (arg0.method5052()) {
            return this.field3831.containsKey(arg0) ? true : this.field3832.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kb.q(Lko;I)Lku;")
    public class297 method4941(class306 arg0) {
        class297 var2 = this.method4943(arg0);
        return var2 == null ? this.method4979(arg0) : var2;
    }

    @ObfuscatedName("kb.g(Lko;I)Lku;")
    public class297 method4943(class306 arg0) {
        return arg0.method5052() ? (class297) this.field3831.get(arg0) : null;
    }

    @ObfuscatedName("kb.y(Lko;I)Lku;")
    public class297 method4979(class306 arg0) {
        return arg0.method5052() ? (class297) this.field3832.get(arg0) : null;
    }

    @ObfuscatedName("kb.s(Lko;I)Z")
    public final boolean method4965(class306 arg0) {
        class297 var2 = this.method4943(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4945(var2);
            return true;
        }
    }

    @ObfuscatedName("kb.ac(Lku;I)V")
    public final void method4945(class297 arg0) {
        int var2 = this.method4951(arg0);
        if (var2 != -1) {
            this.method4966(var2);
            this.method4952(arg0);
        }
    }

    @ObfuscatedName("kb.ap(Lko;I)Lku;")
    public class297 method4946(class306 arg0) {
        return this.method4947(arg0, (class306) null);
    }

    @ObfuscatedName("kb.al(Lko;Lko;B)Lku;")
    public class297 method4947(class306 arg0, class306 arg1) {
        if (this.method4943(arg0) != null) {
            throw new IllegalStateException();
        }
        class297 var3 = this.method4925();
        var3.method4887(arg0, arg1);
        this.method4989(var3);
        this.method4953(var3);
        return var3;
    }

    @ObfuscatedName("kb.ai(II)Lku;")
    public final class297 method4970(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3835) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3833[arg0];
    }

    @ObfuscatedName("kb.ab(B)V")
    public final void method4956() {
        if (this.field3836 == null) {
            Arrays.sort(this.field3833, 0, this.field3835);
        } else {
            Arrays.sort(this.field3833, 0, this.field3835, this.field3836);
        }
    }

    @ObfuscatedName("kb.ak(Lku;Lko;Lko;I)V")
    public final void method4950(class297 arg0, class306 arg1, class306 arg2) {
        this.method4952(arg0);
        arg0.method4887(arg1, arg2);
        this.method4953(arg0);
    }

    @ObfuscatedName("kb.as(Lku;I)I")
    public final int method4951(class297 arg0) {
        for (int var2 = 0; var2 < this.field3835; var2++) {
            if (this.field3833[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kb.aa(Lku;S)V")
    public final void method4952(class297 arg0) {
        if (this.field3831.remove(arg0.field3824) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3823 != null) {
            this.field3832.remove(arg0.field3823);
        }
    }

    @ObfuscatedName("kb.ah(Lku;B)V")
    public final void method4989(class297 arg0) {
        this.field3833[++this.field3835 - 1] = arg0;
    }

    @ObfuscatedName("kb.ao(Lku;B)V")
    public final void method4953(class297 arg0) {
        this.field3831.put(arg0.field3824, arg0);
        if (arg0.field3823 != null) {
            class297 var2 = (class297) this.field3832.put(arg0.field3823, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3823 = null;
            }
        }
    }

    @ObfuscatedName("kb.am(IB)V")
    public final void method4966(int arg0) {
        this.field3835--;
        if (arg0 < this.field3835) {
            System.arraycopy(this.field3833, arg0 + 1, this.field3833, arg0, this.field3835 - arg0);
        }
    }

    @ObfuscatedName("kb.aq(I)V")
    public final void method4957() {
        this.field3836 = null;
    }

    @ObfuscatedName("kb.ae(Ljava/util/Comparator;I)V")
    public final void method4994(Comparator arg0) {
        if (this.field3836 == null) {
            this.field3836 = arg0;
        } else if (this.field3836 instanceof class298) {
            ((class298) this.field3836).method4911(arg0);
        }
    }

    @ObfuscatedName("kb.i(II)[Lku;")
    public abstract class297[] method4932(int arg0);

    @ObfuscatedName("kb.c(I)Lku;")
    public abstract class297 method4925();
}
