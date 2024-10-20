package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("jm")
public abstract class class277 {

    @ObfuscatedName("jm.g")
    public final int field3571;

    @ObfuscatedName("jm.l")
    public int field3575 = 0;

    @ObfuscatedName("jm.u")
    public class274[] field3573;

    @ObfuscatedName("jm.j")
    public HashMap field3574;

    @ObfuscatedName("jm.v")
    public HashMap field3572;

    @ObfuscatedName("jm.d")
    public Comparator field3576 = null;

    public class277(int arg0) {
        this.field3571 = arg0;
        this.field3573 = this.method4712(arg0);
        this.field3574 = new HashMap(arg0 / 8);
        this.field3572 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("jm.s(B)V")
    public void method4723() {
        this.field3575 = 0;
        Arrays.fill(this.field3573, (Object) null);
        this.field3574.clear();
        this.field3572.clear();
    }

    @ObfuscatedName("jm.p(I)I")
    public int method4784() {
        return this.field3575;
    }

    @ObfuscatedName("jm.e(B)Z")
    public boolean method4773() {
        return this.field3575 == this.field3571;
    }

    @ObfuscatedName("jm.i(Ljt;B)Z")
    public boolean method4774(class283 arg0) {
        if (arg0.method4814()) {
            return this.field3574.containsKey(arg0) ? true : this.field3572.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jm.q(Ljt;I)Ljw;")
    public class274 method4727(class283 arg0) {
        class274 var2 = this.method4728(arg0);
        return var2 == null ? this.method4729(arg0) : var2;
    }

    @ObfuscatedName("jm.r(Ljt;I)Ljw;")
    public class274 method4728(class283 arg0) {
        return arg0.method4814() ? (class274) this.field3574.get(arg0) : null;
    }

    @ObfuscatedName("jm.k(Ljt;B)Ljw;")
    public class274 method4729(class283 arg0) {
        return arg0.method4814() ? (class274) this.field3572.get(arg0) : null;
    }

    @ObfuscatedName("jm.w(Ljt;I)Z")
    public final boolean method4730(class283 arg0) {
        class274 var2 = this.method4728(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4731(var2);
            return true;
        }
    }

    @ObfuscatedName("jm.m(Ljw;B)V")
    public final void method4731(class274 arg0) {
        int var2 = this.method4737(arg0);
        if (var2 != -1) {
            this.method4741(var2);
            this.method4738(arg0);
        }
    }

    @ObfuscatedName("jm.o(Ljt;S)Ljw;")
    public class274 method4722(class283 arg0) {
        return this.method4764(arg0, (class283) null);
    }

    @ObfuscatedName("jm.a(Ljt;Ljt;B)Ljw;")
    public class274 method4764(class283 arg0, class283 arg1) {
        if (this.method4728(arg0) != null) {
            throw new IllegalStateException();
        }
        class274 var3 = this.method4718();
        var3.method4689(arg0, arg1);
        this.method4739(var3);
        this.method4740(var3);
        return var3;
    }

    @ObfuscatedName("jm.b(II)Ljw;")
    public final class274 method4734(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3575) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3573[arg0];
    }

    @ObfuscatedName("jm.ag(I)V")
    public final void method4735() {
        if (this.field3576 == null) {
            Arrays.sort(this.field3573, 0, this.field3575);
        } else {
            Arrays.sort(this.field3573, 0, this.field3575, this.field3576);
        }
    }

    @ObfuscatedName("jm.at(Ljw;Ljt;Ljt;B)V")
    public final void method4736(class274 arg0, class283 arg1, class283 arg2) {
        this.method4738(arg0);
        arg0.method4689(arg1, arg2);
        this.method4740(arg0);
    }

    @ObfuscatedName("jm.ao(Ljw;S)I")
    public final int method4737(class274 arg0) {
        for (int var2 = 0; var2 < this.field3575; var2++) {
            if (this.field3573[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("jm.av(Ljw;B)V")
    public final void method4738(class274 arg0) {
        if (this.field3574.remove(arg0.field3562) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3563 != null) {
            this.field3572.remove(arg0.field3563);
        }
    }

    @ObfuscatedName("jm.an(Ljw;I)V")
    public final void method4739(class274 arg0) {
        this.field3573[++this.field3575 - 1] = arg0;
    }

    @ObfuscatedName("jm.al(Ljw;I)V")
    public final void method4740(class274 arg0) {
        this.field3574.put(arg0.field3562, arg0);
        if (arg0.field3563 != null) {
            class274 var2 = (class274) this.field3572.put(arg0.field3563, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3563 = null;
            }
        }
    }

    @ObfuscatedName("jm.as(IB)V")
    public final void method4741(int arg0) {
        this.field3575--;
        if (arg0 < this.field3575) {
            System.arraycopy(this.field3573, arg0 + 1, this.field3573, arg0, this.field3575 - arg0);
        }
    }

    @ObfuscatedName("jm.ad(I)V")
    public final void method4756() {
        this.field3576 = null;
    }

    @ObfuscatedName("jm.ap(Ljava/util/Comparator;B)V")
    public final void method4742(Comparator arg0) {
        if (this.field3576 == null) {
            this.field3576 = arg0;
        } else if (this.field3576 instanceof class275) {
            ((class275) this.field3576).method4698(arg0);
        }
    }

    @ObfuscatedName("jm.c(I)Ljw;")
    public abstract class274 method4718();

    @ObfuscatedName("jm.x(II)[Ljw;")
    public abstract class274[] method4712(int arg0);
}
