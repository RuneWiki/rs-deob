package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("jc")
public abstract class class277 {

    @ObfuscatedName("jc.q")
    public final int field3594;

    @ObfuscatedName("jc.v")
    public int field3591 = 0;

    @ObfuscatedName("jc.l")
    public class274[] field3589;

    @ObfuscatedName("jc.c")
    public HashMap field3592;

    @ObfuscatedName("jc.o")
    public HashMap field3593;

    @ObfuscatedName("jc.i")
    public Comparator field3590 = null;

    public class277(int arg0) {
        this.field3594 = arg0;
        this.field3589 = this.method4750(arg0);
        this.field3592 = new HashMap(arg0 / 8);
        this.field3593 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("jc.c(B)V")
    public void method4776() {
        this.field3591 = 0;
        Arrays.fill(this.field3589, (Object) null);
        this.field3592.clear();
        this.field3593.clear();
    }

    @ObfuscatedName("jc.o(I)I")
    public int method4756() {
        return this.field3591;
    }

    @ObfuscatedName("jc.i(I)Z")
    public boolean method4757() {
        return this.field3594 == this.field3591;
    }

    @ObfuscatedName("jc.d(Lju;I)Z")
    public boolean method4796(class283 arg0) {
        if (arg0.method4854()) {
            return this.field3592.containsKey(arg0) ? true : this.field3593.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jc.m(Lju;I)Ljg;")
    public class274 method4759(class283 arg0) {
        class274 var2 = this.method4760(arg0);
        return var2 == null ? this.method4761(arg0) : var2;
    }

    @ObfuscatedName("jc.p(Lju;B)Ljg;")
    public class274 method4760(class283 arg0) {
        return arg0.method4854() ? (class274) this.field3592.get(arg0) : null;
    }

    @ObfuscatedName("jc.h(Lju;I)Ljg;")
    public class274 method4761(class283 arg0) {
        return arg0.method4854() ? (class274) this.field3593.get(arg0) : null;
    }

    @ObfuscatedName("jc.k(Lju;I)Z")
    public final boolean method4762(class283 arg0) {
        class274 var2 = this.method4760(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4763(var2);
            return true;
        }
    }

    @ObfuscatedName("jc.x(Ljg;I)V")
    public final void method4763(class274 arg0) {
        int var2 = this.method4769(arg0);
        if (var2 != -1) {
            this.method4793(var2);
            this.method4789(arg0);
        }
    }

    @ObfuscatedName("jc.j(Lju;B)Ljg;")
    public class274 method4777(class283 arg0) {
        return this.method4765(arg0, (class283) null);
    }

    @ObfuscatedName("jc.r(Lju;Lju;I)Ljg;")
    public class274 method4765(class283 arg0, class283 arg1) {
        if (this.method4760(arg0) != null) {
            throw new IllegalStateException();
        }
        class274 var3 = this.method4749();
        var3.method4738(arg0, arg1);
        this.method4764(var3);
        this.method4772(var3);
        return var3;
    }

    @ObfuscatedName("jc.e(II)Ljg;")
    public final class274 method4766(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3591) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3589[arg0];
    }

    @ObfuscatedName("jc.s(B)V")
    public final void method4767() {
        if (this.field3590 == null) {
            Arrays.sort(this.field3589, 0, this.field3591);
        } else {
            Arrays.sort(this.field3589, 0, this.field3591, this.field3590);
        }
    }

    @ObfuscatedName("jc.b(Ljg;Lju;Lju;I)V")
    public final void method4768(class274 arg0, class283 arg1, class283 arg2) {
        this.method4789(arg0);
        arg0.method4738(arg1, arg2);
        this.method4772(arg0);
    }

    @ObfuscatedName("jc.w(Ljg;I)I")
    public final int method4769(class274 arg0) {
        for (int var2 = 0; var2 < this.field3591; var2++) {
            if (this.field3589[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("jc.u(Ljg;I)V")
    public final void method4789(class274 arg0) {
        if (this.field3592.remove(arg0.field3582) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3581 != null) {
            this.field3593.remove(arg0.field3581);
        }
    }

    @ObfuscatedName("jc.ad(Ljg;B)V")
    public final void method4764(class274 arg0) {
        this.field3589[++this.field3591 - 1] = arg0;
    }

    @ObfuscatedName("jc.ag(Ljg;I)V")
    public final void method4772(class274 arg0) {
        this.field3592.put(arg0.field3582, arg0);
        if (arg0.field3581 != null) {
            class274 var2 = (class274) this.field3593.put(arg0.field3581, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3581 = null;
            }
        }
    }

    @ObfuscatedName("jc.ak(II)V")
    public final void method4793(int arg0) {
        this.field3591--;
        if (arg0 < this.field3591) {
            System.arraycopy(this.field3589, arg0 + 1, this.field3589, arg0, this.field3591 - arg0);
        }
    }

    @ObfuscatedName("jc.av(I)V")
    public final void method4775() {
        this.field3590 = null;
    }

    @ObfuscatedName("jc.am(Ljava/util/Comparator;B)V")
    public final void method4771(Comparator arg0) {
        if (this.field3590 == null) {
            this.field3590 = arg0;
        } else if (this.field3590 instanceof class275) {
            ((class275) this.field3590).method4742(arg0);
        }
    }

    @ObfuscatedName("jc.a(I)Ljg;")
    public abstract class274 method4749();

    @ObfuscatedName("jc.t(II)[Ljg;")
    public abstract class274[] method4750(int arg0);
}
