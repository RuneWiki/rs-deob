package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("kd")
public abstract class class288 {

    @ObfuscatedName("kd.q")
    public final int field3705;

    @ObfuscatedName("kd.c")
    public int field3700 = 0;

    @ObfuscatedName("kd.l")
    public class285[] field3701;

    @ObfuscatedName("kd.b")
    public HashMap field3702;

    @ObfuscatedName("kd.w")
    public HashMap field3703;

    @ObfuscatedName("kd.n")
    public Comparator field3699 = null;

    public class288(int arg0) {
        this.field3705 = arg0;
        this.field3701 = this.method5159(arg0);
        this.field3702 = new HashMap(arg0 / 8);
        this.field3703 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("kd.h(I)V")
    public void method5171() {
        this.field3700 = 0;
        Arrays.fill(this.field3701, (Object) null);
        this.field3702.clear();
        this.field3703.clear();
    }

    @ObfuscatedName("kd.f(B)I")
    public int method5172() {
        return this.field3700;
    }

    @ObfuscatedName("kd.a(B)Z")
    public boolean method5173() {
        return this.field3705 == this.field3700;
    }

    @ObfuscatedName("kd.t(Lkg;B)Z")
    public boolean method5192(class294 arg0) {
        if (arg0.method5270()) {
            return this.field3702.containsKey(arg0) ? true : this.field3703.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("kd.k(Lkg;I)Ljr;")
    public class285 method5175(class294 arg0) {
        class285 var2 = this.method5176(arg0);
        return var2 == null ? this.method5210(arg0) : var2;
    }

    @ObfuscatedName("kd.s(Lkg;I)Ljr;")
    public class285 method5176(class294 arg0) {
        return arg0.method5270() ? (class285) this.field3702.get(arg0) : null;
    }

    @ObfuscatedName("kd.y(Lkg;B)Ljr;")
    public class285 method5210(class294 arg0) {
        return arg0.method5270() ? (class285) this.field3703.get(arg0) : null;
    }

    @ObfuscatedName("kd.u(Lkg;S)Z")
    public final boolean method5178(class294 arg0) {
        class285 var2 = this.method5176(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5220(var2);
            return true;
        }
    }

    @ObfuscatedName("kd.o(Ljr;I)V")
    public final void method5220(class285 arg0) {
        int var2 = this.method5184(arg0);
        if (var2 != -1) {
            this.method5188(var2);
            this.method5185(arg0);
        }
    }

    @ObfuscatedName("kd.af(Lkg;I)Ljr;")
    public class285 method5242(class294 arg0) {
        return this.method5180(arg0, (class294) null);
    }

    @ObfuscatedName("kd.an(Lkg;Lkg;B)Ljr;")
    public class285 method5180(class294 arg0, class294 arg1) {
        if (this.method5176(arg0) != null) {
            throw new IllegalStateException();
        }
        class285 var3 = this.method5158();
        var3.method5131(arg0, arg1);
        this.method5239(var3);
        this.method5174(var3);
        return var3;
    }

    @ObfuscatedName("kd.ax(II)Ljr;")
    public final class285 method5181(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3700) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3701[arg0];
    }

    @ObfuscatedName("kd.aw(S)V")
    public final void method5187() {
        if (this.field3699 == null) {
            Arrays.sort(this.field3701, 0, this.field3700);
        } else {
            Arrays.sort(this.field3701, 0, this.field3700, this.field3699);
        }
    }

    @ObfuscatedName("kd.ae(Ljr;Lkg;Lkg;I)V")
    public final void method5177(class285 arg0, class294 arg1, class294 arg2) {
        this.method5185(arg0);
        arg0.method5131(arg1, arg2);
        this.method5174(arg0);
    }

    @ObfuscatedName("kd.ac(Ljr;B)I")
    public final int method5184(class285 arg0) {
        for (int var2 = 0; var2 < this.field3700; var2++) {
            if (this.field3701[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("kd.az(Ljr;I)V")
    public final void method5185(class285 arg0) {
        if (this.field3702.remove(arg0.field3693) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3694 != null) {
            this.field3703.remove(arg0.field3694);
        }
    }

    @ObfuscatedName("kd.aj(Ljr;I)V")
    public final void method5239(class285 arg0) {
        this.field3701[++this.field3700 - 1] = arg0;
    }

    @ObfuscatedName("kd.ag(Ljr;B)V")
    public final void method5174(class285 arg0) {
        this.field3702.put(arg0.field3693, arg0);
        if (arg0.field3694 != null) {
            class285 var2 = (class285) this.field3703.put(arg0.field3694, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3694 = null;
            }
        }
    }

    @ObfuscatedName("kd.ab(II)V")
    public final void method5188(int arg0) {
        this.field3700--;
        if (arg0 < this.field3700) {
            System.arraycopy(this.field3701, arg0 + 1, this.field3701, arg0, this.field3700 - arg0);
        }
    }

    @ObfuscatedName("kd.ar(B)V")
    public final void method5190() {
        this.field3699 = null;
    }

    @ObfuscatedName("kd.at(Ljava/util/Comparator;I)V")
    public final void method5191(Comparator arg0) {
        if (this.field3699 == null) {
            this.field3699 = arg0;
        } else if (this.field3699 instanceof class286) {
            ((class286) this.field3699).method5148(arg0);
        }
    }

    @ObfuscatedName("kd.g(I)Ljr;")
    public abstract class285 method5158();

    @ObfuscatedName("kd.r(II)[Ljr;")
    public abstract class285[] method5159(int arg0);
}
