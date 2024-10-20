package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("jm")
public abstract class class278 {

    @ObfuscatedName("jm.e")
    public final int field3597;

    @ObfuscatedName("jm.i")
    public int field3595 = 0;

    @ObfuscatedName("jm.g")
    public class275[] field3592;

    @ObfuscatedName("jm.d")
    public HashMap field3594;

    @ObfuscatedName("jm.l")
    public HashMap field3596;

    @ObfuscatedName("jm.j")
    public Comparator field3593 = null;

    public class278(int arg0) {
        this.field3597 = arg0;
        this.field3592 = this.method4722(arg0);
        this.field3594 = new HashMap(arg0 / 8);
        this.field3596 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("jm.v(I)V")
    public void method4732() {
        this.field3595 = 0;
        Arrays.fill(this.field3592, (Object) null);
        this.field3594.clear();
        this.field3596.clear();
    }

    @ObfuscatedName("jm.n(I)I")
    public int method4787() {
        return this.field3595;
    }

    @ObfuscatedName("jm.x(I)Z")
    public boolean method4734() {
        return this.field3597 == this.field3595;
    }

    @ObfuscatedName("jm.w(Ljz;I)Z")
    public boolean method4735(class284 arg0) {
        if (arg0.method4830()) {
            return this.field3594.containsKey(arg0) ? true : this.field3596.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("jm.q(Ljz;I)Ljk;")
    public class275 method4771(class284 arg0) {
        class275 var2 = this.method4737(arg0);
        return var2 == null ? this.method4801(arg0) : var2;
    }

    @ObfuscatedName("jm.z(Ljz;I)Ljk;")
    public class275 method4737(class284 arg0) {
        return arg0.method4830() ? (class275) this.field3594.get(arg0) : null;
    }

    @ObfuscatedName("jm.y(Ljz;B)Ljk;")
    public class275 method4801(class284 arg0) {
        return arg0.method4830() ? (class275) this.field3596.get(arg0) : null;
    }

    @ObfuscatedName("jm.f(Ljz;I)Z")
    public final boolean method4739(class284 arg0) {
        class275 var2 = this.method4737(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4740(var2);
            return true;
        }
    }

    @ObfuscatedName("jm.a(Ljk;I)V")
    public final void method4740(class275 arg0) {
        int var2 = this.method4751(arg0);
        if (var2 != -1) {
            this.method4750(var2);
            this.method4799(arg0);
        }
    }

    @ObfuscatedName("jm.u(Ljz;I)Ljk;")
    public class275 method4741(class284 arg0) {
        return this.method4742(arg0, (class284) null);
    }

    @ObfuscatedName("jm.ae(Ljz;Ljz;B)Ljk;")
    public class275 method4742(class284 arg0, class284 arg1) {
        if (this.method4737(arg0) != null) {
            throw new IllegalStateException();
        }
        class275 var3 = this.method4721();
        var3.method4692(arg0, arg1);
        this.method4748(var3);
        this.method4749(var3);
        return var3;
    }

    @ObfuscatedName("jm.af(II)Ljk;")
    public final class275 method4743(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3595) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3592[arg0];
    }

    @ObfuscatedName("jm.az(I)V")
    public final void method4744() {
        if (this.field3593 == null) {
            Arrays.sort(this.field3592, 0, this.field3595);
        } else {
            Arrays.sort(this.field3592, 0, this.field3595, this.field3593);
        }
    }

    @ObfuscatedName("jm.ax(Ljk;Ljz;Ljz;I)V")
    public final void method4738(class275 arg0, class284 arg1, class284 arg2) {
        this.method4799(arg0);
        arg0.method4692(arg1, arg2);
        this.method4749(arg0);
    }

    @ObfuscatedName("jm.aj(Ljk;I)I")
    public final int method4751(class275 arg0) {
        for (int var2 = 0; var2 < this.field3595; var2++) {
            if (this.field3592[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("jm.au(Ljk;I)V")
    public final void method4799(class275 arg0) {
        if (this.field3594.remove(arg0.field3582) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3583 != null) {
            this.field3596.remove(arg0.field3583);
        }
    }

    @ObfuscatedName("jm.ay(Ljk;B)V")
    public final void method4748(class275 arg0) {
        this.field3592[++this.field3595 - 1] = arg0;
    }

    @ObfuscatedName("jm.aa(Ljk;I)V")
    public final void method4749(class275 arg0) {
        this.field3594.put(arg0.field3582, arg0);
        if (arg0.field3583 != null) {
            class275 var2 = (class275) this.field3596.put(arg0.field3583, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3583 = null;
            }
        }
    }

    @ObfuscatedName("jm.aq(II)V")
    public final void method4750(int arg0) {
        this.field3595--;
        if (arg0 < this.field3595) {
            System.arraycopy(this.field3592, arg0 + 1, this.field3592, arg0, this.field3595 - arg0);
        }
    }

    @ObfuscatedName("jm.as(I)V")
    public final void method4754() {
        this.field3593 = null;
    }

    @ObfuscatedName("jm.ak(Ljava/util/Comparator;I)V")
    public final void method4752(Comparator arg0) {
        if (this.field3593 == null) {
            this.field3593 = arg0;
        } else if (this.field3593 instanceof class276) {
            ((class276) this.field3593).method4713(arg0);
        }
    }

    @ObfuscatedName("jm.c(S)Ljk;")
    public abstract class275 method4721();

    @ObfuscatedName("jm.t(IB)[Ljk;")
    public abstract class275[] method4722(int arg0);
}
