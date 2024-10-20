package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kt")
public abstract class class300 {

    @ObfuscatedName("kt.d")
    public final int field3839;

    @ObfuscatedName("kt.h")
    public int field3842 = 0;

    @ObfuscatedName("kt.m")
    public class297[] field3840;

    @ObfuscatedName("kt.z")
    public HashMap field3838;

    @ObfuscatedName("kt.i")
    public HashMap field3841;

    @ObfuscatedName("kt.u")
    public Comparator field3843 = null;

    public class300(int arg0) {
        this.field3839 = arg0;
        this.field3840 = this.method4905(arg0);
        this.field3838 = new HashMap(arg0 / 8);
        this.field3841 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kt.a(B)V")
    public void method4914() {
        this.field3842 = 0;
        Arrays.fill(this.field3840, (Object) null);
        this.field3838.clear();
        this.field3841.clear();
    }

    @ObfuscatedName("kt.v(I)I")
    public int method4916() {
        return this.field3842;
    }

    @ObfuscatedName("kt.q(I)Z")
    public boolean method4917() {
        return this.field3842 == this.field3839;
    }

    @ObfuscatedName("kt.r(Lkz;I)Z")
    public boolean method4918(class306 arg0) {
        if (arg0.method5017()) {
            return this.field3838.containsKey(arg0) ? true : this.field3841.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kt.j(Lkz;I)Lku;")
    public class297 method4919(class306 arg0) {
        class297 var2 = this.method4936(arg0);
        return var2 == null ? this.method4921(arg0) : var2;
    }

    @ObfuscatedName("kt.b(Lkz;I)Lku;")
    public class297 method4936(class306 arg0) {
        return arg0.method5017() ? (class297) this.field3838.get(arg0) : null;
    }

    @ObfuscatedName("kt.g(Lkz;B)Lku;")
    public class297 method4921(class306 arg0) {
        return arg0.method5017() ? (class297) this.field3841.get(arg0) : null;
    }

    @ObfuscatedName("kt.f(Lkz;I)Z")
    public final boolean method4951(class306 arg0) {
        class297 var2 = this.method4936(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4923(var2);
            return true;
        }
    }

    @ObfuscatedName("kt.p(Lku;B)V")
    public final void method4923(class297 arg0) {
        int var2 = this.method4929(arg0);
        if (var2 != -1) {
            this.method4937(var2);
            this.method4930(arg0);
        }
    }

    @ObfuscatedName("kt.e(Lkz;I)Lku;")
    public class297 method4924(class306 arg0) {
        return this.method4925(arg0, (class306) null);
    }

    @ObfuscatedName("kt.c(Lkz;Lkz;I)Lku;")
    public class297 method4925(class306 arg0, class306 arg1) {
        if (this.method4936(arg0) != null) {
            throw new IllegalStateException();
        }
        class297 var3 = this.method4904();
        var3.method4876(arg0, arg1);
        this.method4955(var3);
        this.method4931(var3);
        return var3;
    }

    @ObfuscatedName("kt.ag(II)Lku;")
    public final class297 method4926(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3842) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3840[arg0];
    }

    @ObfuscatedName("kt.at(B)V")
    public final void method4939() {
        if (this.field3843 == null) {
            Arrays.sort(this.field3840, 0, this.field3842);
        } else {
            Arrays.sort(this.field3840, 0, this.field3842, this.field3843);
        }
    }

    @ObfuscatedName("kt.ac(Lku;Lkz;Lkz;B)V")
    public final void method4928(class297 arg0, class306 arg1, class306 arg2) {
        this.method4930(arg0);
        arg0.method4876(arg1, arg2);
        this.method4931(arg0);
    }

    @ObfuscatedName("kt.al(Lku;I)I")
    public final int method4929(class297 arg0) {
        for (int var2 = 0; var2 < this.field3842; var2++) {
            if (this.field3840[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kt.ah(Lku;I)V")
    public final void method4930(class297 arg0) {
        if (this.field3838.remove(arg0.field3830) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3831 != null) {
            this.field3841.remove(arg0.field3831);
        }
    }

    @ObfuscatedName("kt.af(Lku;I)V")
    public final void method4955(class297 arg0) {
        this.field3840[++this.field3842 - 1] = arg0;
    }

    @ObfuscatedName("kt.aq(Lku;I)V")
    public final void method4931(class297 arg0) {
        this.field3838.put(arg0.field3830, arg0);
        if (arg0.field3831 != null) {
            class297 var2 = (class297) this.field3841.put(arg0.field3831, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3831 = null;
            }
        }
    }

    @ObfuscatedName("kt.ai(IB)V")
    public final void method4937(int arg0) {
        this.field3842--;
        if (arg0 < this.field3842) {
            System.arraycopy(this.field3840, arg0 + 1, this.field3840, arg0, this.field3842 - arg0);
        }
    }

    @ObfuscatedName("kt.az(I)V")
    public final void method4934() {
        this.field3843 = null;
    }

    @ObfuscatedName("kt.aa(Ljava/util/Comparator;I)V")
    public final void method4935(Comparator arg0) {
        if (this.field3843 == null) {
            this.field3843 = arg0;
        } else if (this.field3843 instanceof class298) {
            ((class298) this.field3843).method4895(arg0);
        }
    }

    @ObfuscatedName("kt.k(II)[Lku;")
    public abstract class297[] method4905(int arg0);

    @ObfuscatedName("kt.o(B)Lku;")
    public abstract class297 method4904();
}
