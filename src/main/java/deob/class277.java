package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("je")
public abstract class class277 {

    @ObfuscatedName("je.g")
    public final int field3605;

    @ObfuscatedName("je.z")
    public int field3603 = 0;

    @ObfuscatedName("je.p")
    public class274[] field3604;

    @ObfuscatedName("je.h")
    public HashMap field3607;

    @ObfuscatedName("je.y")
    public HashMap field3606;

    @ObfuscatedName("je.w")
    public Comparator field3602 = null;

    public class277(int arg0) {
        this.field3605 = arg0;
        this.field3604 = this.method4742(arg0);
        this.field3607 = new HashMap(arg0 / 8);
        this.field3606 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("je.n(I)V")
    public void method4746() {
        this.field3603 = 0;
        Arrays.fill(this.field3604, (Object) null);
        this.field3607.clear();
        this.field3606.clear();
    }

    @ObfuscatedName("je.c(I)I")
    public int method4747() {
        return this.field3603;
    }

    @ObfuscatedName("je.s(I)Z")
    public boolean method4779() {
        return this.field3605 == this.field3603;
    }

    @ObfuscatedName("je.t(Ljb;I)Z")
    public boolean method4749(class283 arg0) {
        if (arg0.method4835()) {
            return this.field3607.containsKey(arg0) ? true : this.field3606.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("je.m(Ljb;I)Ljr;")
    public class274 method4750(class283 arg0) {
        class274 var2 = this.method4751(arg0);
        return var2 == null ? this.method4752(arg0) : var2;
    }

    @ObfuscatedName("je.v(Ljb;I)Ljr;")
    public class274 method4751(class283 arg0) {
        return arg0.method4835() ? (class274) this.field3607.get(arg0) : null;
    }

    @ObfuscatedName("je.q(Ljb;I)Ljr;")
    public class274 method4752(class283 arg0) {
        return arg0.method4835() ? (class274) this.field3606.get(arg0) : null;
    }

    @ObfuscatedName("je.l(Ljb;I)Z")
    public final boolean method4753(class283 arg0) {
        class274 var2 = this.method4751(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4768(var2);
            return true;
        }
    }

    @ObfuscatedName("je.j(Ljr;I)V")
    public final void method4768(class274 arg0) {
        int var2 = this.method4760(arg0);
        if (var2 != -1) {
            this.method4763(var2);
            this.method4745(arg0);
        }
    }

    @ObfuscatedName("je.ad(Ljb;I)Ljr;")
    public class274 method4755(class283 arg0) {
        return this.method4756(arg0, (class283) null);
    }

    @ObfuscatedName("je.am(Ljb;Ljb;I)Ljr;")
    public class274 method4756(class283 arg0, class283 arg1) {
        if (this.method4751(arg0) != null) {
            throw new IllegalStateException();
        }
        class274 var3 = this.method4732();
        var3.method4718(arg0, arg1);
        this.method4762(var3);
        this.method4772(var3);
        return var3;
    }

    @ObfuscatedName("je.ai(II)Ljr;")
    public final class274 method4757(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3603) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3604[arg0];
    }

    @ObfuscatedName("je.ag(B)V")
    public final void method4758() {
        if (this.field3602 == null) {
            Arrays.sort(this.field3604, 0, this.field3603);
        } else {
            Arrays.sort(this.field3604, 0, this.field3603, this.field3602);
        }
    }

    @ObfuscatedName("je.ao(Ljr;Ljb;Ljb;B)V")
    public final void method4791(class274 arg0, class283 arg1, class283 arg2) {
        this.method4745(arg0);
        arg0.method4718(arg1, arg2);
        this.method4772(arg0);
    }

    @ObfuscatedName("je.aw(Ljr;I)I")
    public final int method4760(class274 arg0) {
        for (int var2 = 0; var2 < this.field3603; var2++) {
            if (this.field3604[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("je.ak(Ljr;I)V")
    public final void method4745(class274 arg0) {
        if (this.field3607.remove(arg0.field3594) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3595 != null) {
            this.field3606.remove(arg0.field3595);
        }
    }

    @ObfuscatedName("je.aa(Ljr;B)V")
    public final void method4762(class274 arg0) {
        this.field3604[++this.field3603 - 1] = arg0;
    }

    @ObfuscatedName("je.ab(Ljr;I)V")
    public final void method4772(class274 arg0) {
        this.field3607.put(arg0.field3594, arg0);
        if (arg0.field3595 != null) {
            class274 var2 = (class274) this.field3606.put(arg0.field3595, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3595 = null;
            }
        }
    }

    @ObfuscatedName("je.ar(II)V")
    public final void method4763(int arg0) {
        this.field3603--;
        if (arg0 < this.field3603) {
            System.arraycopy(this.field3604, arg0 + 1, this.field3604, arg0, this.field3603 - arg0);
        }
    }

    @ObfuscatedName("je.av(B)V")
    public final void method4764() {
        this.field3602 = null;
    }

    @ObfuscatedName("je.aq(Ljava/util/Comparator;B)V")
    public final void method4771(Comparator arg0) {
        if (this.field3602 == null) {
            this.field3602 = arg0;
        } else if (this.field3602 instanceof class275) {
            ((class275) this.field3602).method4722(arg0);
        }
    }

    @ObfuscatedName("je.u(I)Ljr;")
    public abstract class274 method4732();

    @ObfuscatedName("je.f(IB)[Ljr;")
    public abstract class274[] method4742(int arg0);
}
