package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("jb")
public abstract class class277 {

    @ObfuscatedName("jb.w")
    public final int field3585;

    @ObfuscatedName("jb.p")
    public int field3582 = 0;

    @ObfuscatedName("jb.b")
    public class274[] field3583;

    @ObfuscatedName("jb.e")
    public HashMap field3584;

    @ObfuscatedName("jb.x")
    public HashMap field3581;

    @ObfuscatedName("jb.a")
    public Comparator field3586 = null;

    public class277(int arg0) {
        this.field3585 = arg0;
        this.field3583 = this.method4710(arg0);
        this.field3584 = new HashMap(arg0 / 8);
        this.field3581 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("jb.a(I)V")
    public void method4717() {
        this.field3582 = 0;
        Arrays.fill(this.field3583, (Object) null);
        this.field3584.clear();
        this.field3581.clear();
    }

    @ObfuscatedName("jb.d(B)I")
    public int method4765() {
        return this.field3582;
    }

    @ObfuscatedName("jb.c(B)Z")
    public boolean method4719() {
        return this.field3585 == this.field3582;
    }

    @ObfuscatedName("jb.o(Ljc;B)Z")
    public boolean method4720(class283 arg0) {
        if (arg0.method4823()) {
            return this.field3584.containsKey(arg0) ? true : this.field3581.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jb.l(Ljc;I)Ljy;")
    public class274 method4721(class283 arg0) {
        class274 var2 = this.method4722(arg0);
        return var2 == null ? this.method4723(arg0) : var2;
    }

    @ObfuscatedName("jb.t(Ljc;I)Ljy;")
    public class274 method4722(class283 arg0) {
        return arg0.method4823() ? (class274) this.field3584.get(arg0) : null;
    }

    @ObfuscatedName("jb.j(Ljc;I)Ljy;")
    public class274 method4723(class283 arg0) {
        return arg0.method4823() ? (class274) this.field3581.get(arg0) : null;
    }

    @ObfuscatedName("jb.n(Ljc;I)Z")
    public final boolean method4724(class283 arg0) {
        class274 var2 = this.method4722(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4725(var2);
            return true;
        }
    }

    @ObfuscatedName("jb.u(Ljy;I)V")
    public final void method4725(class274 arg0) {
        int var2 = this.method4731(arg0);
        if (var2 != -1) {
            this.method4728(var2);
            this.method4732(arg0);
        }
    }

    @ObfuscatedName("jb.z(Ljc;I)Ljy;")
    public class274 method4726(class283 arg0) {
        return this.method4767(arg0, (class283) null);
    }

    @ObfuscatedName("jb.h(Ljc;Ljc;I)Ljy;")
    public class274 method4767(class283 arg0, class283 arg1) {
        if (this.method4722(arg0) != null) {
            throw new IllegalStateException();
        }
        class274 var3 = this.method4709();
        var3.method4679(arg0, arg1);
        this.method4733(var3);
        this.method4734(var3);
        return var3;
    }

    @ObfuscatedName("jb.m(IS)Ljy;")
    public final class274 method4742(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3582) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3583[arg0];
    }

    @ObfuscatedName("jb.aa(I)V")
    public final void method4729() {
        if (this.field3586 == null) {
            Arrays.sort(this.field3583, 0, this.field3582);
        } else {
            Arrays.sort(this.field3583, 0, this.field3582, this.field3586);
        }
    }

    @ObfuscatedName("jb.av(Ljy;Ljc;Ljc;B)V")
    public final void method4730(class274 arg0, class283 arg1, class283 arg2) {
        this.method4732(arg0);
        arg0.method4679(arg1, arg2);
        this.method4734(arg0);
    }

    @ObfuscatedName("jb.aw(Ljy;I)I")
    public final int method4731(class274 arg0) {
        for (int var2 = 0; var2 < this.field3582; var2++) {
            if (this.field3583[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("jb.as(Ljy;I)V")
    public final void method4732(class274 arg0) {
        if (this.field3584.remove(arg0.field3571) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3570 != null) {
            this.field3581.remove(arg0.field3570);
        }
    }

    @ObfuscatedName("jb.ak(Ljy;I)V")
    public final void method4733(class274 arg0) {
        this.field3583[++this.field3582 - 1] = arg0;
    }

    @ObfuscatedName("jb.au(Ljy;B)V")
    public final void method4734(class274 arg0) {
        this.field3584.put(arg0.field3571, arg0);
        if (arg0.field3570 != null) {
            class274 var2 = (class274) this.field3581.put(arg0.field3570, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3570 = null;
            }
        }
    }

    @ObfuscatedName("jb.ah(II)V")
    public final void method4728(int arg0) {
        this.field3582--;
        if (arg0 < this.field3582) {
            System.arraycopy(this.field3583, arg0 + 1, this.field3583, arg0, this.field3582 - arg0);
        }
    }

    @ObfuscatedName("jb.aq(B)V")
    public final void method4736() {
        this.field3586 = null;
    }

    @ObfuscatedName("jb.ao(Ljava/util/Comparator;B)V")
    public final void method4737(Comparator arg0) {
        if (this.field3586 == null) {
            this.field3586 = arg0;
        } else if (this.field3586 instanceof class275) {
            ((class275) this.field3586).method4704(arg0);
        }
    }

    @ObfuscatedName("jb.f(B)Ljy;")
    public abstract class274 method4709();

    @ObfuscatedName("jb.i(IB)[Ljy;")
    public abstract class274[] method4710(int arg0);
}
