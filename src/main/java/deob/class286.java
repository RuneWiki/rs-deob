package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("ja")
public abstract class class286 {

    @ObfuscatedName("ja.p")
    public final int field3710;

    @ObfuscatedName("ja.a")
    public int field3711 = 0;

    @ObfuscatedName("ja.h")
    public class283[] field3709;

    @ObfuscatedName("ja.l")
    public HashMap field3712;

    @ObfuscatedName("ja.y")
    public HashMap field3713;

    @ObfuscatedName("ja.g")
    public Comparator field3715 = null;

    public class286(int arg0) {
        this.field3710 = arg0;
        this.field3709 = this.method4816(arg0);
        this.field3712 = new HashMap(arg0 / 8);
        this.field3713 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("ja.m(I)V")
    public void method4826() {
        this.field3711 = 0;
        Arrays.fill(this.field3709, (Object) null);
        this.field3712.clear();
        this.field3713.clear();
    }

    @ObfuscatedName("ja.x(I)I")
    public int method4827() {
        return this.field3711;
    }

    @ObfuscatedName("ja.w(B)Z")
    public boolean method4828() {
        return this.field3711 == this.field3710;
    }

    @ObfuscatedName("ja.j(Lkp;I)Z")
    public boolean method4829(class292 arg0) {
        if (arg0.method4927()) {
            return this.field3712.containsKey(arg0) ? true : this.field3713.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("ja.z(Lkp;I)Ljw;")
    public class283 method4895(class292 arg0) {
        class283 var2 = this.method4831(arg0);
        return var2 == null ? this.method4876(arg0) : var2;
    }

    @ObfuscatedName("ja.e(Lkp;I)Ljw;")
    public class283 method4831(class292 arg0) {
        return arg0.method4927() ? (class283) this.field3712.get(arg0) : null;
    }

    @ObfuscatedName("ja.k(Lkp;I)Ljw;")
    public class283 method4876(class292 arg0) {
        return arg0.method4927() ? (class283) this.field3713.get(arg0) : null;
    }

    @ObfuscatedName("ja.ao(Lkp;I)Z")
    public final boolean method4855(class292 arg0) {
        class283 var2 = this.method4831(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method4834(var2);
            return true;
        }
    }

    @ObfuscatedName("ja.am(Ljw;B)V")
    public final void method4834(class283 arg0) {
        int var2 = this.method4840(arg0);
        if (var2 != -1) {
            this.method4873(var2);
            this.method4841(arg0);
        }
    }

    @ObfuscatedName("ja.aj(Lkp;B)Ljw;")
    public class283 method4860(class292 arg0) {
        return this.method4836(arg0, (class292) null);
    }

    @ObfuscatedName("ja.ah(Lkp;Lkp;I)Ljw;")
    public class283 method4836(class292 arg0, class292 arg1) {
        if (this.method4895(arg0) != null) {
            throw new IllegalStateException();
        }
        class283 var3 = this.method4814();
        var3.method4796(arg0, arg1);
        this.method4899(var3);
        this.method4843(var3);
        return var3;
    }

    @ObfuscatedName("ja.af(IB)Ljw;")
    public final class283 method4907(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3711) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.field3709[arg0];
    }

    @ObfuscatedName("ja.ai(I)V")
    public final void method4838() {
        if (this.field3715 == null) {
            Arrays.sort(this.field3709, 0, this.field3711);
        } else {
            Arrays.sort(this.field3709, 0, this.field3711, this.field3715);
        }
    }

    @ObfuscatedName("ja.aq(Ljw;Lkp;Lkp;I)V")
    public final void method4839(class283 arg0, class292 arg1, class292 arg2) {
        this.method4841(arg0);
        arg0.method4796(arg1, arg2);
        this.method4843(arg0);
    }

    @ObfuscatedName("ja.ak(Ljw;B)I")
    public final int method4840(class283 arg0) {
        for (int var2 = 0; var2 < this.field3711; var2++) {
            if (this.field3709[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ja.al(Ljw;B)V")
    public final void method4841(class283 arg0) {
        if (this.field3712.remove(arg0.field3702) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3701 != null) {
            this.field3713.remove(arg0.field3701);
        }
    }

    @ObfuscatedName("ja.as(Ljw;B)V")
    public final void method4899(class283 arg0) {
        this.field3709[++this.field3711 - 1] = arg0;
    }

    @ObfuscatedName("ja.az(Ljw;I)V")
    public final void method4843(class283 arg0) {
        this.field3712.put(arg0.field3702, arg0);
        if (arg0.field3701 != null) {
            this.field3713.put(arg0.field3701, arg0);
        }
    }

    @ObfuscatedName("ja.ax(IB)V")
    public final void method4873(int arg0) {
        this.field3711--;
        if (arg0 < this.field3711) {
            System.arraycopy(this.field3709, arg0 + 1, this.field3709, arg0, this.field3711 - arg0);
        }
    }

    @ObfuscatedName("ja.ad(I)V")
    public final void method4893() {
        this.field3715 = null;
    }

    @ObfuscatedName("ja.ar(Ljava/util/Comparator;I)V")
    public final void method4847(Comparator arg0) {
        if (this.field3715 == null) {
            this.field3715 = arg0;
        } else if (this.field3715 instanceof class284) {
            ((class284) this.field3715).method4812(arg0);
        }
    }

    @ObfuscatedName("ja.q(IB)[Ljw;")
    public abstract class283[] method4816(int arg0);

    @ObfuscatedName("ja.b(I)Ljw;")
    public abstract class283 method4814();
}
