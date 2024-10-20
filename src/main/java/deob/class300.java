package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kl")
public abstract class class300 {

    @ObfuscatedName("kl.r")
    public final int field3835;

    @ObfuscatedName("kl.e")
    public int field3832 = 0;

    @ObfuscatedName("kl.y")
    public class297[] field3834;

    @ObfuscatedName("kl.k")
    public HashMap field3833;

    @ObfuscatedName("kl.s")
    public HashMap field3836;

    @ObfuscatedName("kl.p")
    public Comparator field3837 = null;

    public class300(int arg0) {
        this.field3835 = arg0;
        this.field3834 = this.method4987(arg0);
        this.field3833 = new HashMap(arg0 / 8);
        this.field3836 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kl.u(B)V")
    public void method4999() {
        this.field3832 = 0;
        Arrays.fill(this.field3834, (Object) null);
        this.field3833.clear();
        this.field3836.clear();
    }

    @ObfuscatedName("kl.q(B)I")
    public int method5000() {
        return this.field3832;
    }

    @ObfuscatedName("kl.v(B)Z")
    public boolean method5001() {
        return this.field3835 == this.field3832;
    }

    @ObfuscatedName("kl.f(Lko;S)Z")
    public boolean method5002(class306 arg0) {
        if (arg0.method5096()) {
            return this.field3833.containsKey(arg0) ? true : this.field3836.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kl.b(Lko;I)Lkm;")
    public class297 method5035(class306 arg0) {
        class297 var2 = this.method5004(arg0);
        return var2 == null ? this.method5072(arg0) : var2;
    }

    @ObfuscatedName("kl.c(Lko;I)Lkm;")
    public class297 method5004(class306 arg0) {
        return arg0.method5096() ? (class297) this.field3833.get(arg0) : null;
    }

    @ObfuscatedName("kl.w(Lko;B)Lkm;")
    public class297 method5072(class306 arg0) {
        return arg0.method5096() ? (class297) this.field3836.get(arg0) : null;
    }

    @ObfuscatedName("kl.o(Lko;I)Z")
    public final boolean method5005(class306 arg0) {
        class297 var2 = this.method5004(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5006(var2);
            return true;
        }
    }

    @ObfuscatedName("kl.a(Lkm;I)V")
    public final void method5006(class297 arg0) {
        int var2 = this.method5066(arg0);
        if (var2 != -1) {
            this.method5015(var2);
            this.method5013(arg0);
        }
    }

    @ObfuscatedName("kl.ak(Lko;I)Lkm;")
    public class297 method5034(class306 arg0) {
        return this.method5049(arg0, (class306) null);
    }

    @ObfuscatedName("kl.ap(Lko;Lko;I)Lkm;")
    public class297 method5049(class306 arg0, class306 arg1) {
        if (this.method5035(arg0) != null) {
            throw new IllegalStateException();
        }
        class297 var3 = this.method4997();
        var3.method4957(arg0, arg1);
        this.method5030(var3);
        this.method5033(var3);
        return var3;
    }

    @ObfuscatedName("kl.ac(IB)Lkm;")
    public final class297 method5009(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3832) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.field3834[arg0];
    }

    @ObfuscatedName("kl.aw(I)V")
    public final void method5010() {
        if (this.field3837 == null) {
            Arrays.sort(this.field3834, 0, this.field3832);
        } else {
            Arrays.sort(this.field3834, 0, this.field3832, this.field3837);
        }
    }

    @ObfuscatedName("kl.as(Lkm;Lko;Lko;B)V")
    public final void method5020(class297 arg0, class306 arg1, class306 arg2) {
        this.method5013(arg0);
        arg0.method4957(arg1, arg2);
        this.method5033(arg0);
    }

    @ObfuscatedName("kl.au(Lkm;I)I")
    public final int method5066(class297 arg0) {
        for (int var2 = 0; var2 < this.field3832; var2++) {
            if (this.field3834[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kl.al(Lkm;I)V")
    public final void method5013(class297 arg0) {
        if (this.field3833.remove(arg0.field3824) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3825 != null) {
            this.field3836.remove(arg0.field3825);
        }
    }

    @ObfuscatedName("kl.af(Lkm;I)V")
    public final void method5030(class297 arg0) {
        this.field3834[++this.field3832 - 1] = arg0;
    }

    @ObfuscatedName("kl.ai(Lkm;B)V")
    public final void method5033(class297 arg0) {
        this.field3833.put(arg0.field3824, arg0);
        if (arg0.field3825 != null) {
            this.field3836.put(arg0.field3825, arg0);
        }
    }

    @ObfuscatedName("kl.az(II)V")
    public final void method5015(int arg0) {
        this.field3832--;
        if (arg0 < this.field3832) {
            System.arraycopy(this.field3834, arg0 + 1, this.field3834, arg0, this.field3832 - arg0);
        }
    }

    @ObfuscatedName("kl.aq(I)V")
    public final void method5023() {
        this.field3837 = null;
    }

    @ObfuscatedName("kl.ae(Ljava/util/Comparator;B)V")
    public final void method5018(Comparator arg0) {
        if (this.field3837 == null) {
            this.field3837 = arg0;
        } else if (this.field3837 instanceof class298) {
            ((class298) this.field3837).method4978(arg0);
        }
    }

    @ObfuscatedName("kl.d(I)Lkm;")
    public abstract class297 method4997();

    @ObfuscatedName("kl.z(II)[Lkm;")
    public abstract class297[] method4987(int arg0);
}
