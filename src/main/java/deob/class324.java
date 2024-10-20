package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("lj")
public abstract class class324 {

    @ObfuscatedName("lj.d")
    public final int field3843;

    @ObfuscatedName("lj.s")
    public int field3842 = 0;

    @ObfuscatedName("lj.u")
    public class322[] field3847;

    @ObfuscatedName("lj.l")
    public HashMap field3845;

    @ObfuscatedName("lj.o")
    public HashMap field3846;

    @ObfuscatedName("lj.c")
    public Comparator field3844 = null;

    public class324(int arg0) {
        this.field3843 = arg0;
        this.field3847 = this.method5149(arg0);
        this.field3845 = new HashMap(arg0 / 8);
        this.field3846 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("lj.ae(I)V")
    public void method5284() {
        this.field3842 = 0;
        Arrays.fill(this.field3847, (Object) null);
        this.field3845.clear();
        this.field3846.clear();
    }

    @ObfuscatedName("lj.ap(I)I")
    public int method5246() {
        return this.field3842;
    }

    @ObfuscatedName("lj.ab(B)Z")
    public boolean method5312() {
        return this.field3843 == this.field3842;
    }

    @ObfuscatedName("lj.al(Lly;I)Z")
    public boolean method5248(class328 arg0) {
        if (arg0.method5339()) {
            return this.field3845.containsKey(arg0) ? true : this.field3846.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("lj.ad(Lly;I)Llx;")
    public class322 method5249(class328 arg0) {
        class322 var2 = this.method5250(arg0);
        return var2 == null ? this.method5251(arg0) : var2;
    }

    @ObfuscatedName("lj.ai(Lly;B)Llx;")
    public class322 method5250(class328 arg0) {
        return arg0.method5339() ? (class322) this.field3845.get(arg0) : null;
    }

    @ObfuscatedName("lj.ar(Lly;B)Llx;")
    public class322 method5251(class328 arg0) {
        return arg0.method5339() ? (class322) this.field3846.get(arg0) : null;
    }

    @ObfuscatedName("lj.ag(Lly;I)Z")
    public final boolean method5266(class328 arg0) {
        class322 var2 = this.method5250(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5253(var2);
            return true;
        }
    }

    @ObfuscatedName("lj.ax(Llx;I)V")
    public final void method5253(class322 arg0) {
        int var2 = this.method5259(arg0);
        if (var2 != -1) {
            this.method5263(var2);
            this.method5285(arg0);
        }
    }

    @ObfuscatedName("lj.as(Lly;I)Llx;")
    public class322 method5254(class328 arg0) {
        return this.method5255(arg0, (class328) null);
    }

    @ObfuscatedName("lj.aj(Lly;Lly;I)Llx;")
    public class322 method5255(class328 arg0, class328 arg1) {
        if (this.method5250(arg0) != null) {
            throw new IllegalStateException();
        }
        class322 var3 = this.method5146();
        var3.method5231(arg0, arg1);
        this.method5307(var3);
        this.method5245(var3);
        return var3;
    }

    @ObfuscatedName("lj.am(IB)Llx;")
    public final class322 method5256(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3842) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3847[arg0];
    }

    @ObfuscatedName("lj.az(I)V")
    public final void method5298() {
        if (this.field3844 == null) {
            Arrays.sort(this.field3847, 0, this.field3842);
        } else {
            Arrays.sort(this.field3847, 0, this.field3842, this.field3844);
        }
    }

    @ObfuscatedName("lj.av(Llx;Lly;Lly;B)V")
    public final void method5258(class322 arg0, class328 arg1, class328 arg2) {
        this.method5285(arg0);
        arg0.method5231(arg1, arg2);
        this.method5245(arg0);
    }

    @ObfuscatedName("lj.ac(Llx;S)I")
    public final int method5259(class322 arg0) {
        for (int var2 = 0; var2 < this.field3842; var2++) {
            if (this.field3847[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("lj.at(Llx;I)V")
    public final void method5285(class322 arg0) {
        if (this.field3845.remove(arg0.field3837) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3836 != null) {
            this.field3846.remove(arg0.field3836);
        }
    }

    @ObfuscatedName("lj.ah(Llx;I)V")
    public final void method5307(class322 arg0) {
        this.field3847[++this.field3842 - 1] = arg0;
    }

    @ObfuscatedName("lj.ao(Llx;I)V")
    public final void method5245(class322 arg0) {
        this.field3845.put(arg0.field3837, arg0);
        if (arg0.field3836 != null) {
            class322 var2 = (class322) this.field3846.put(arg0.field3836, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3836 = null;
            }
        }
    }

    @ObfuscatedName("lj.aq(IB)V")
    public final void method5263(int arg0) {
        this.field3842--;
        if (arg0 < this.field3842) {
            System.arraycopy(this.field3847, arg0 + 1, this.field3847, arg0, this.field3842 - arg0);
        }
    }

    @ObfuscatedName("lj.aw(I)V")
    public final void method5264() {
        this.field3844 = null;
    }

    @ObfuscatedName("lj.af(Ljava/util/Comparator;I)V")
    public final void method5304(Comparator arg0) {
        if (this.field3844 == null) {
            this.field3844 = arg0;
        } else if (this.field3844 instanceof class323) {
            ((class323) this.field3844).method5237(arg0);
        }
    }

    @ObfuscatedName("lj.v(B)Llx;")
    public abstract class322 method5146();

    @ObfuscatedName("lj.n(II)[Llx;")
    public abstract class322[] method5149(int arg0);
}
