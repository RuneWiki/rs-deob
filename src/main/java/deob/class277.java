package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("jw")
public abstract class class277 {

    @ObfuscatedName("jw.k")
    public final int field3583;

    @ObfuscatedName("jw.u")
    public int field3580 = 0;

    @ObfuscatedName("jw.n")
    public class274[] field3581;

    @ObfuscatedName("jw.t")
    public HashMap field3584;

    @ObfuscatedName("jw.q")
    public HashMap field3585;

    @ObfuscatedName("jw.x")
    public Comparator field3579 = null;

    public class277(int arg0) {
        this.field3583 = arg0;
        this.field3581 = this.method4663(arg0);
        this.field3584 = new HashMap(arg0 / 8);
        this.field3585 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("jw.x(I)V")
    public void method4727() {
        this.field3580 = 0;
        Arrays.fill(this.field3581, (Object) null);
        this.field3584.clear();
        this.field3585.clear();
    }

    @ObfuscatedName("jw.d(I)I")
    public int method4699() {
        return this.field3580;
    }

    @ObfuscatedName("jw.f(B)Z")
    public boolean method4694() {
        return this.field3583 == this.field3580;
    }

    @ObfuscatedName("jw.c(Ljx;S)Z")
    public boolean method4673(class283 arg0) {
        if (arg0.method4768()) {
            return this.field3584.containsKey(arg0) ? true : this.field3585.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jw.r(Ljx;I)Lju;")
    public class274 method4674(class283 arg0) {
        class274 var2 = this.method4713(arg0);
        return var2 == null ? this.method4676(arg0) : var2;
    }

    @ObfuscatedName("jw.y(Ljx;I)Lju;")
    public class274 method4713(class283 arg0) {
        return arg0.method4768() ? (class274) this.field3584.get(arg0) : null;
    }

    @ObfuscatedName("jw.p(Ljx;I)Lju;")
    public class274 method4676(class283 arg0) {
        return arg0.method4768() ? (class274) this.field3585.get(arg0) : null;
    }

    @ObfuscatedName("jw.g(Ljx;B)Z")
    public final boolean method4677(class283 arg0) {
        class274 var2 = this.method4713(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4678(var2);
            return true;
        }
    }

    @ObfuscatedName("jw.e(Lju;I)V")
    public final void method4678(class274 arg0) {
        int var2 = this.method4683(arg0);
        if (var2 != -1) {
            this.method4670(var2);
            this.method4684(arg0);
        }
    }

    @ObfuscatedName("jw.z(Ljx;B)Lju;")
    public class274 method4689(class283 arg0) {
        return this.method4737(arg0, (class283) null);
    }

    @ObfuscatedName("jw.w(Ljx;Ljx;I)Lju;")
    public class274 method4737(class283 arg0, class283 arg1) {
        if (this.method4713(arg0) != null) {
            throw new IllegalStateException();
        }
        class274 var3 = this.method4665();
        var3.method4636(arg0, arg1);
        this.method4669(var3);
        this.method4732(var3);
        return var3;
    }

    @ObfuscatedName("jw.l(II)Lju;")
    public final class274 method4736(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3580) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3581[arg0];
    }

    @ObfuscatedName("jw.h(I)V")
    public final void method4672() {
        if (this.field3579 == null) {
            Arrays.sort(this.field3581, 0, this.field3580);
        } else {
            Arrays.sort(this.field3581, 0, this.field3580, this.field3579);
        }
    }

    @ObfuscatedName("jw.v(Lju;Ljx;Ljx;I)V")
    public final void method4724(class274 arg0, class283 arg1, class283 arg2) {
        this.method4684(arg0);
        arg0.method4636(arg1, arg2);
        this.method4732(arg0);
    }

    @ObfuscatedName("jw.m(Lju;I)I")
    public final int method4683(class274 arg0) {
        for (int var2 = 0; var2 < this.field3580; var2++) {
            if (this.field3581[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("jw.o(Lju;B)V")
    public final void method4684(class274 arg0) {
        if (this.field3584.remove(arg0.field3572) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3573 != null) {
            this.field3585.remove(arg0.field3573);
        }
    }

    @ObfuscatedName("jw.av(Lju;I)V")
    public final void method4669(class274 arg0) {
        this.field3581[++this.field3580 - 1] = arg0;
    }

    @ObfuscatedName("jw.am(Lju;I)V")
    public final void method4732(class274 arg0) {
        this.field3584.put(arg0.field3572, arg0);
        if (arg0.field3573 != null) {
            class274 var2 = (class274) this.field3585.put(arg0.field3573, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3573 = null;
            }
        }
    }

    @ObfuscatedName("jw.ai(II)V")
    public final void method4670(int arg0) {
        this.field3580--;
        if (arg0 < this.field3580) {
            System.arraycopy(this.field3581, arg0 + 1, this.field3581, arg0, this.field3580 - arg0);
        }
    }

    @ObfuscatedName("jw.af(B)V")
    public final void method4688() {
        this.field3579 = null;
    }

    @ObfuscatedName("jw.az(Ljava/util/Comparator;I)V")
    public final void method4729(Comparator arg0) {
        if (this.field3579 == null) {
            this.field3579 = arg0;
        } else if (this.field3579 instanceof class275) {
            ((class275) this.field3579).method4656(arg0);
        }
    }

    @ObfuscatedName("jw.s(I)Lju;")
    public abstract class274 method4665();

    @ObfuscatedName("jw.j(II)[Lju;")
    public abstract class274[] method4663(int arg0);
}
