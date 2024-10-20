package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kn")
public abstract class class300 {

    @ObfuscatedName("kn.z")
    public final int field3850;

    @ObfuscatedName("kn.n")
    public int field3843 = 0;

    @ObfuscatedName("kn.l")
    public class297[] field3844;

    @ObfuscatedName("kn.s")
    public HashMap field3845;

    @ObfuscatedName("kn.y")
    public HashMap field3846;

    @ObfuscatedName("kn.c")
    public Comparator field3848 = null;

    public class300(int arg0) {
        this.field3850 = arg0;
        this.field3844 = this.method4956(arg0);
        this.field3845 = new HashMap(arg0 / 8);
        this.field3846 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kn.q(I)V")
    public void method4969() {
        this.field3843 = 0;
        Arrays.fill(this.field3844, (Object) null);
        this.field3845.clear();
        this.field3846.clear();
    }

    @ObfuscatedName("kn.f(I)I")
    public int method4979() {
        return this.field3843;
    }

    @ObfuscatedName("kn.j(I)Z")
    public boolean method4971() {
        return this.field3850 == this.field3843;
    }

    @ObfuscatedName("kn.v(Lkb;B)Z")
    public boolean method4972(class306 arg0) {
        if (arg0.method5061()) {
            return this.field3845.containsKey(arg0) ? true : this.field3846.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kn.u(Lkb;B)Lkg;")
    public class297 method4973(class306 arg0) {
        class297 var2 = this.method4974(arg0);
        return var2 == null ? this.method4970(arg0) : var2;
    }

    @ObfuscatedName("kn.k(Lkb;I)Lkg;")
    public class297 method4974(class306 arg0) {
        return arg0.method5061() ? (class297) this.field3845.get(arg0) : null;
    }

    @ObfuscatedName("kn.w(Lkb;I)Lkg;")
    public class297 method4970(class306 arg0) {
        return arg0.method5061() ? (class297) this.field3846.get(arg0) : null;
    }

    @ObfuscatedName("kn.x(Lkb;I)Z")
    public final boolean method4975(class306 arg0) {
        class297 var2 = this.method4974(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5013(var2);
            return true;
        }
    }

    @ObfuscatedName("kn.t(Lkg;B)V")
    public final void method5013(class297 arg0) {
        int var2 = this.method4997(arg0);
        if (var2 != -1) {
            this.method5001(var2);
            this.method4981(arg0);
        }
    }

    @ObfuscatedName("kn.ax(Lkb;I)Lkg;")
    public class297 method4977(class306 arg0) {
        return this.method4978(arg0, (class306) null);
    }

    @ObfuscatedName("kn.ai(Lkb;Lkb;I)Lkg;")
    public class297 method4978(class306 arg0, class306 arg1) {
        if (this.method4974(arg0) != null) {
            throw new IllegalStateException();
        }
        class297 var3 = this.method4959();
        var3.method4931(arg0, arg1);
        this.method4982(var3);
        this.method4983(var3);
        return var3;
    }

    @ObfuscatedName("kn.aj(IB)Lkg;")
    public final class297 method5003(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3843) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3844[arg0];
    }

    @ObfuscatedName("kn.ac(I)V")
    public final void method4968() {
        if (this.field3848 == null) {
            Arrays.sort(this.field3844, 0, this.field3843);
        } else {
            Arrays.sort(this.field3844, 0, this.field3843, this.field3848);
        }
    }

    @ObfuscatedName("kn.ag(Lkg;Lkb;Lkb;I)V")
    public final void method4980(class297 arg0, class306 arg1, class306 arg2) {
        this.method4981(arg0);
        arg0.method4931(arg1, arg2);
        this.method4983(arg0);
    }

    @ObfuscatedName("kn.ay(Lkg;I)I")
    public final int method4997(class297 arg0) {
        for (int var2 = 0; var2 < this.field3843; var2++) {
            if (this.field3844[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kn.as(Lkg;I)V")
    public final void method4981(class297 arg0) {
        if (this.field3845.remove(arg0.field3832) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3833 != null) {
            this.field3846.remove(arg0.field3833);
        }
    }

    @ObfuscatedName("kn.av(Lkg;I)V")
    public final void method4982(class297 arg0) {
        this.field3844[++this.field3843 - 1] = arg0;
    }

    @ObfuscatedName("kn.ao(Lkg;I)V")
    public final void method4983(class297 arg0) {
        this.field3845.put(arg0.field3832, arg0);
        if (arg0.field3833 != null) {
            class297 var2 = (class297) this.field3846.put(arg0.field3833, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3833 = null;
            }
        }
    }

    @ObfuscatedName("kn.ak(IB)V")
    public final void method5001(int arg0) {
        this.field3843--;
        if (arg0 < this.field3843) {
            System.arraycopy(this.field3844, arg0 + 1, this.field3844, arg0, this.field3843 - arg0);
        }
    }

    @ObfuscatedName("kn.ad(B)V")
    public final void method4999() {
        this.field3848 = null;
    }

    @ObfuscatedName("kn.az(Ljava/util/Comparator;I)V")
    public final void method4987(Comparator arg0) {
        if (this.field3848 == null) {
            this.field3848 = arg0;
        } else if (this.field3848 instanceof class298) {
            ((class298) this.field3848).method4946(arg0);
        }
    }

    @ObfuscatedName("kn.e(IB)[Lkg;")
    public abstract class297[] method4956(int arg0);

    @ObfuscatedName("kn.g(I)Lkg;")
    public abstract class297 method4959();
}
